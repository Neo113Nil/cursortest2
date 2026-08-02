package ru.CryptoPro.JCP.params;

import java.security.Key;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class KdfTreeDiversKeySpec extends DiversKeyBase {
    public static final int KDF_TREE_GOSTR3411_2012_256 = 3;
    private final byte[] f;
    private final int g;
    private final byte[] h;
    private final int i;
    private final int j;

    public KdfTreeDiversKeySpec(Key key, byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        super(key);
        this.e = 3;
        this.g = i;
        this.i = i2;
        this.j = i3;
        if (bArr == null || bArr.length <= 0) {
            this.f = new byte[0];
        } else {
            byte[] bArr3 = new byte[bArr.length];
            this.f = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        if (bArr2 == null || bArr2.length <= 0) {
            this.h = new byte[0];
            return;
        }
        byte[] bArr4 = new byte[bArr2.length];
        this.h = bArr4;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003e, code lost:
    
        if (r5.h == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0028, code lost:
    
        if (r5.f == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof KdfTreeDiversKeySpec) {
            KdfTreeDiversKeySpec kdfTreeDiversKeySpec = (KdfTreeDiversKeySpec) obj;
            if (this.d != kdfTreeDiversKeySpec.d) {
                return false;
            }
            byte[] bArr3 = this.f;
            if (bArr3 == null || (bArr2 = kdfTreeDiversKeySpec.f) == null) {
                if (bArr3 == null) {
                }
            } else if (!Arrays.equals(bArr3, bArr2)) {
                return false;
            }
            byte[] bArr4 = this.h;
            if (bArr4 == null || (bArr = kdfTreeDiversKeySpec.h) == null) {
                if (bArr4 == null) {
                }
            } else if (!Arrays.equals(bArr4, bArr)) {
                return false;
            }
            return this.g == kdfTreeDiversKeySpec.g && this.e == kdfTreeDiversKeySpec.e && this.i == kdfTreeDiversKeySpec.i && this.j == kdfTreeDiversKeySpec.j;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "KDF_TREE_GOSTR3411_2012_256";
    }

    public int getIterationNumber() {
        return this.g;
    }

    public int getL() {
        return this.i;
    }

    public byte[] getLabel() {
        return (byte[]) this.f.clone();
    }

    public int getR() {
        return this.j;
    }

    public byte[] getSeed() {
        return (byte[]) this.h.clone();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            byte[] bArr = this.f;
            if (bArr == null || i3 >= bArr.length) {
                break;
            }
            i += bArr[i3] * i3;
            i3++;
        }
        while (true) {
            byte[] bArr2 = this.h;
            if (bArr2 == null || i2 >= bArr2.length) {
                break;
            }
            i += bArr2[i2] * i2;
            i2++;
        }
        return (Arrays.hashCode(new int[]{this.g, this.i, this.j, this.d.hashCode()}) + getAlgorithm().toLowerCase().hashCode()) ^ i;
    }
}
