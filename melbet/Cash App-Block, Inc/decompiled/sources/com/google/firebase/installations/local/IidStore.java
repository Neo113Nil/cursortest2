package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class IidStore {
    public static final String[] ALLOWABLE_SCOPES = {Marker.ANY_MARKER, FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};
    public final String defaultSenderId;
    public final SharedPreferences iidPrefs;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IidStore(FirebaseApp firebaseApp) {
        firebaseApp.checkNotDeleted();
        this.iidPrefs = firebaseApp.applicationContext.getSharedPreferences("com.google.android.gms.appid", 0);
        firebaseApp.checkNotDeleted();
        FirebaseOptions firebaseOptions = firebaseApp.options;
        String str = firebaseOptions.gcmSenderId;
        if (str == null) {
            firebaseApp.checkNotDeleted();
            str = firebaseOptions.applicationId;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.defaultSenderId = str;
    }

    public final String readIid() {
        String string2;
        synchronized (this.iidPrefs) {
            try {
                synchronized (this.iidPrefs) {
                    string2 = this.iidPrefs.getString("|S|id", null);
                }
                if (string2 != null) {
                    return string2;
                }
                return readPublicKeyFromLocalStorageAndCalculateInstanceId();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        PublicKey publicKey;
        synchronized (this.iidPrefs) {
            String str = null;
            String string2 = this.iidPrefs.getString("|S||P|", null);
            if (string2 == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string2, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }

    public final String readToken() {
        synchronized (this.iidPrefs) {
            try {
                String[] strArr = ALLOWABLE_SCOPES;
                int i = 0;
                while (true) {
                    String str = null;
                    if (i >= 4) {
                        return null;
                    }
                    String str2 = strArr[i];
                    String string2 = this.iidPrefs.getString("|T|" + this.defaultSenderId + "|" + str2, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                str = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                            string2 = str;
                        }
                        return string2;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
