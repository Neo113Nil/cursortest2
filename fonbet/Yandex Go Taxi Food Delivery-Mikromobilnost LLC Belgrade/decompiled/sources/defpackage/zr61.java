package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zr61 {
    public final byte[] a;
    public volatile int b;

    public zr61(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zr61) {
            return Arrays.equals(this.a, ((zr61) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = this.a.length + 1;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.a;
                if (i2 >= bArr.length) {
                    break;
                }
                i += (bArr[i2] & 255) * 37;
                i2++;
            }
            this.b = i;
        }
        return i;
    }
}
