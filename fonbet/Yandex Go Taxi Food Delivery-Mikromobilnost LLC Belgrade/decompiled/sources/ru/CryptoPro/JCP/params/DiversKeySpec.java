package ru.CryptoPro.JCP.params;

import defpackage.ny61;
import java.security.Key;
import java.util.Arrays;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;

/* loaded from: classes4.dex */
public class DiversKeySpec extends DiversKeyBase {
    public static final int DIVERS_MAGIC = 827738436;
    public static final int PRO12_DIVERS = 2;
    public static final int PRO_DIVERS = 1;
    private final byte[] f;
    private final int g;

    public DiversKeySpec(Key key, byte[] bArr, int i, int i2) {
        super(key);
        if (i == 1) {
            this.g = DIVERS_MAGIC;
            this.e = i;
            if (bArr == null || bArr.length < 4 || bArr.length > 40) {
                ny61.g(DiversKeyBase.a.getString("BadDiversData"));
                throw null;
            }
            if (key instanceof InternalGostPrivateKey) {
                String algorithm = key.getAlgorithm();
                if (!algorithm.equals("GOST3410DHEL") && !algorithm.equals(JCP.GOST_EL_DEGREE_NAME)) {
                    ny61.g(DiversKeyBase.a.getString("BadDiversAlg"));
                    throw null;
                }
            }
        } else {
            if (i != 2) {
                ny61.g("Unknown diversification algorithm.");
                throw null;
            }
            this.g = i2;
            this.e = i;
        }
        if (bArr == null || bArr.length <= 0) {
            this.f = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        if (r5.f == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiversKeySpec) {
            DiversKeySpec diversKeySpec = (DiversKeySpec) obj;
            if (this.d != diversKeySpec.d) {
                return false;
            }
            byte[] bArr2 = this.f;
            if (bArr2 == null || (bArr = diversKeySpec.f) == null) {
                if (bArr2 == null) {
                }
            } else if (!Arrays.equals(bArr2, bArr)) {
                return false;
            }
            return this.g == diversKeySpec.g && this.e == diversKeySpec.e;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.e == 1 ? "PRO_DIVERS" : "PRO12_DIVERS";
    }

    public byte[] getBlob() {
        return (byte[]) this.f.clone();
    }

    public int getMagic() {
        return this.g;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        while (true) {
            byte[] bArr = this.f;
            if (i2 >= bArr.length) {
                return (Arrays.hashCode(new int[]{this.g, this.d.hashCode()}) + getAlgorithm().toLowerCase().hashCode()) ^ i;
            }
            i += bArr[i2] * i2;
            i2++;
        }
    }
}
