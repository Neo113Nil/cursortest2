package ru.CryptoPro.JCP.spec;

import java.security.spec.KeySpec;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class GostMasterSpec implements KeySpec {
    public final int A;
    public final int B;
    public final boolean C;
    public final SecretKey a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] w;
    public final String x;
    public final int y;
    public final int z;

    public GostMasterSpec(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, int i, int i2, int i3, int i4, boolean z) {
        this.a = secretKey;
        if (bArr == null || bArr.length <= 0) {
            this.b = null;
        } else {
            this.b = (byte[]) bArr.clone();
        }
        if (bArr2 == null || bArr2.length <= 0) {
            this.c = null;
        } else {
            this.c = (byte[]) bArr2.clone();
        }
        if (bArr3 == null || bArr3.length <= 0) {
            this.w = null;
        } else {
            this.w = (byte[]) bArr3.clone();
        }
        this.x = str;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        this.C = z;
    }

    public int getCipherAlg() {
        return this.z;
    }

    public byte[] getClnRnd() {
        return this.b;
    }

    public String getDigestAlgorithm() {
        return this.x;
    }

    public byte[] getEmsHash() {
        return this.w;
    }

    public int getKEIvLen() {
        return this.B;
    }

    public int getMacAlg() {
        return this.A;
    }

    public int getPrfAlg() {
        return this.y;
    }

    public SecretKey getSecretKey() {
        return this.a;
    }

    public byte[] getSrvRnd() {
        return this.c;
    }

    public boolean isOldSuite() {
        return this.C;
    }

    public GostMasterSpec(SecretKey secretKey, byte[] bArr, byte[] bArr2, String str, int i, int i2, int i3, int i4, boolean z) {
        this(secretKey, bArr, bArr2, new byte[0], str, i, i2, i3, i4, z);
    }

    public GostMasterSpec(SecretKey secretKey, byte[] bArr, String str, int i, int i2, int i3, int i4, boolean z) {
        this(secretKey, new byte[0], new byte[0], bArr, str, i, i2, i3, i4, z);
    }
}
