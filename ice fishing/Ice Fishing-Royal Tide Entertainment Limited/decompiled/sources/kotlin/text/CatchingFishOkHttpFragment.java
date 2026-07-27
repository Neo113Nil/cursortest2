package kotlin.text;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpFragment {
    public static final String[] CatchingFishCoroutine = {"*", "FCM", "GCM", ""};
    public final SharedPreferences CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishOkHttpFragment(com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary) {
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        this.CatchingFishParcelableFAB = catchingFishPagingLibrary.CatchingFishParcelableFAB.getSharedPreferences("com.google.android.gms.appid", 0);
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar = catchingFishPagingLibrary.CatchingFishCoroutine;
        String str = catchingFishOkHttpSnackbar.CatchingFishDaggerWebsocket;
        if (str == null) {
            catchingFishPagingLibrary.CatchingFishParcelableFAB();
            str = catchingFishOkHttpSnackbar.CatchingFishSnackbar;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.CatchingFishSnackbar = str;
    }

    public final String CatchingFishParcelableFAB() {
        PublicKey publicKey;
        synchronized (this.CatchingFishParcelableFAB) {
            String str = null;
            String string = this.CatchingFishParcelableFAB.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
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
            }
            return str;
        }
    }
}
