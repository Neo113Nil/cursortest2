package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class m3c {
    public static final HashSet a = vop.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        String str3 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        str3.getClass();
        if (c.v(str3, "generic", false) && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                signatureArr.getClass();
                for (Signature signature : signatureArr) {
                    HashSet hashSet = a;
                    byte[] byteArray = signature.toByteArray();
                    byteArray.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                        messageDigest.getClass();
                        messageDigest.update(byteArray);
                        byte[] digest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                        }
                        str2 = sb.toString();
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = null;
                    }
                    if (CollectionsKt.I(hashSet, str2)) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}
