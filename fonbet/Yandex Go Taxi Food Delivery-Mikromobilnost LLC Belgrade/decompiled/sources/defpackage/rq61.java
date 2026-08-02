package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public final class rq61 implements AlgorithmParameterSpec {
    public final SecretKey a;

    public rq61(SecretKey secretKey, int i, int i2, byte[] bArr, byte[] bArr2, String str, int i3, int i4, int i5, int i6) {
        if (!secretKey.getAlgorithm().equals("TlsMasterSecret")) {
            ny61.g("Not a TLS master secret");
            throw null;
        }
        str.getClass();
        this.a = secretKey;
        a(i);
        a(i2);
        bArr.clone();
        bArr2.clone();
        if (i3 < 0) {
            ny61.g("Value must not be negative");
            throw null;
        }
        if (i4 < 0) {
            ny61.g("Value must not be negative");
            throw null;
        }
        if (i5 < 0) {
            ny61.g("Value must not be negative");
            throw null;
        }
        if (i6 >= 0) {
            return;
        }
        ny61.g("Value must not be negative");
        throw null;
    }

    public static void a(int i) {
        if (i < 0 || i > 255) {
            ny61.g("Version must be between 0 and 255");
        }
    }

    public rq61(SecretKey secretKey, int i, int i2, byte[] bArr, byte[] bArr2) {
        if (secretKey == null) {
            ny61.t("premasterSecret must not be null");
            throw null;
        }
        this.a = secretKey;
        a(i);
        a(i2);
        bArr.clone();
        bArr2.clone();
    }
}
