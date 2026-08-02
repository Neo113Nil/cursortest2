package ru.CryptoPro.ssl;

import defpackage.ev61;
import defpackage.ny61;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.Util.GetProperty;

/* loaded from: classes4.dex */
final class cl_85 extends cl_47 {
    public static final boolean e = GetProperty.getBooleanProperty("com.sun.net.ssl.rsaPreMasterSecretFix", false);
    public cl_84 b;
    public SecretKey c;
    public byte[] d;

    public static SecretKey e(cl_84 cl_84Var, byte[] bArr, SecureRandom secureRandom) {
        SSLLogger.fine("Generating a random fake premaster secret");
        try {
            String str = cl_84Var.n >= cl_84.z.n ? "JavaTls12RsaPremasterSecret" : "JavaTlsRsaPremasterSecret";
            KeyGenerator keyGenerator = KeyGenerator.getInstance(str, cl_73.g(str));
            keyGenerator.init(new ev61(cl_84Var.o, cl_84Var.p, bArr), secureRandom);
            return keyGenerator.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e2) {
            SSLLogger.warning("RSA premaster secret generation error:");
            SSLLogger.thrown(e2);
            ny61.n("Could not generate dummy secret", e2);
            return null;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        int i = this.b.n;
        int i2 = cl_84.x.n;
        byte[] bArr = this.d;
        if (i >= i2) {
            cl_62Var.b(bArr);
        } else {
            cl_62Var.write(bArr);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        int i = this.b.n;
        int i2 = cl_84.x.n;
        int length = this.d.length;
        return i >= i2 ? length + 2 : length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        return "*** ClientKeyExchange, RSA PreMasterSecret, " + this.b;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 16;
    }
}
