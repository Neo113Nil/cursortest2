package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzae;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Storage {
    public static final ReentrantLock zaa = new ReentrantLock();
    public static Storage zab;
    public final ReentrantLock zac = new ReentrantLock();
    public final SharedPreferences zad;

    public Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Storage getInstance(Context context) {
        zzae.checkNotNull(context);
        ReentrantLock reentrantLock = zaa;
        reentrantLock.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            Storage storage = zab;
            reentrantLock.unlock();
            return storage;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String zae(String str, String str2) {
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public final GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String zab2;
        String zab3 = zab("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(zab3) && (zab2 = zab(zae("googleSignInAccount", zab3))) != null) {
            try {
                return GoogleSignInAccount.zaa(zab2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        zzae.checkNotNull(googleSignInAccount);
        zzae.checkNotNull(googleSignInOptions);
        String str = googleSignInAccount.zaj;
        zaa("defaultGoogleSignInAccount", str);
        String zae = zae("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.zac;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.zad;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.zae;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.zaf;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.zak;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.zal;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.zag;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.zah;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.zai);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.zab;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, ViewPager.AnonymousClass1.zaa);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.zzb);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            zaa(zae, jSONObject.toString());
            String zae2 = zae("googleSignInOptions", str);
            String str9 = googleSignInOptions.zam;
            String str10 = googleSignInOptions.zal;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.zag;
                Collections.sort(arrayList, GoogleSignInOptions.zaq);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).zzb);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.zah;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.zai);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.zak);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.zaj);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                zaa(zae2, jSONObject2.toString());
            } catch (JSONException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            }
        } catch (JSONException e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        }
    }

    public final void zaa(String str, String str2) {
        ReentrantLock reentrantLock = this.zac;
        reentrantLock.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String zab(String str) {
        ReentrantLock reentrantLock = this.zac;
        reentrantLock.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
