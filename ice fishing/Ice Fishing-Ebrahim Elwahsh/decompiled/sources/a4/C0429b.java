package a4;

import K3.g;
import K3.i;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0429b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f4383c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4385b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0429b(g gVar) {
        gVar.a();
        this.f4384a = gVar.f1623a.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.a();
        i iVar = gVar.f1625c;
        String str = iVar.f1640e;
        if (str == null) {
            gVar.a();
            str = iVar.f1637b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.f4385b = str;
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f4384a) {
            String str = null;
            String string = this.f4384a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e6) {
                Log.w("ContentValues", "Invalid key stored " + e6);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & p.f8630b);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
