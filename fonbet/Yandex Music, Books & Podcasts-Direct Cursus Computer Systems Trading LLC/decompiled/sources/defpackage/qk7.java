package defpackage;

import android.content.res.Resources;
import android.util.Base64;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class qk7 {
    public final Resources a;
    public final int b;

    public qk7(pxf pxfVar, Resources resources) {
        resources.getClass();
        this.a = resources;
        this.b = pxfVar.c;
    }

    public static final cw3 a(qk7 qk7Var, byte[] bArr) {
        InputStream openRawResource = qk7Var.a.openRawResource(qk7Var.b);
        openRawResource.getClass();
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(vnj.N(openRawResource)));
        generatePublic.getClass();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generatePublic;
        int length = bArr.length;
        pk7 pk7Var = pk7.RSA_SHA512;
        pk7 pk7Var2 = pk7.RSA_SHA256;
        if (length > (rSAPublicKey.getModulus().bitLength() / 8) - 130) {
            pk7Var = pk7Var2;
        }
        Cipher cipher = Cipher.getInstance(pk7Var.a);
        cipher.init(1, rSAPublicKey);
        byte[] doFinal = cipher.doFinal(bArr);
        String str = pk7Var.b;
        String encodeToString = Base64.encodeToString(doFinal, 2);
        encodeToString.getClass();
        return new cw3(encodeToString, str);
    }
}
