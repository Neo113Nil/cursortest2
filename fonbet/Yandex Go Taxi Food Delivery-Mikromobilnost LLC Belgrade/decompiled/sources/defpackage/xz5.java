package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class xz5 {
    public long a;
    public long b;
    public long[] c = uus0.a;

    public final int a(int i) {
        int numberOfTrailingZeros;
        if (i < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.a) >>> i) << i)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.b) >>> i2) << i2);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i, 128);
        int i3 = (max / 64) - 2;
        long[] jArr = this.c;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long j = ~jArr[i4];
            if (i4 == i3) {
                int i5 = max % 64;
                j = (j >>> i5) << i5;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return b64.b(i4, 64, 128, numberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder("BitVector [");
        int length = (this.c.length + 2) * 64;
        boolean z = true;
        for (0; i < length; i + 1) {
            if (i < 64) {
                i = ((1 << i) & this.a) == 0 ? i + 1 : 0;
                if (!z) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(i);
                z = false;
            } else if (i < 128) {
                if (((1 << (i - 64)) & this.b) == 0) {
                }
                if (!z) {
                }
                sb.append(i);
                z = false;
            } else {
                long[] jArr = this.c;
                int length2 = jArr.length;
                if (length2 != 0 && (i / 64) - 2 < length2) {
                    if (((1 << (i % 64)) & jArr[i2]) == 0) {
                    }
                    if (!z) {
                    }
                    sb.append(i);
                    z = false;
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
