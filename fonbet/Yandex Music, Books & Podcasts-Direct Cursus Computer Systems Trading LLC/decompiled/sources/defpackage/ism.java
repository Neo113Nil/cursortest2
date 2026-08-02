package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ism implements Comparable {
    public final byte[] a;

    public ism(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ism ismVar = (ism) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ismVar.a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = ismVar.a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ism) {
            return Arrays.equals(this.a, ((ism) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return leu.M(this.a);
    }
}
