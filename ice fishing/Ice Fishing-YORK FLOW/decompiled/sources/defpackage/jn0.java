package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jn0 {
    public long[] ZpBGe2uQfcn8;
    public int giKS3J6vZuNy;

    public jn0(int i) {
        this.ZpBGe2uQfcn8 = i == 0 ? defpackage.fj0.ZpBGe2uQfcn8 : new long[i];
    }

    public final void ZpBGe2uQfcn8(long j) {
        int i = this.giKS3J6vZuNy + 1;
        long[] jArr = this.ZpBGe2uQfcn8;
        if (jArr.length < i) {
            this.ZpBGe2uQfcn8 = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.ZpBGe2uQfcn8;
        int i2 = this.giKS3J6vZuNy;
        jArr2[i2] = j;
        this.giKS3J6vZuNy = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.jn0) {
            defpackage.jn0 jn0Var = (defpackage.jn0) obj;
            int i = jn0Var.giKS3J6vZuNy;
            int i2 = this.giKS3J6vZuNy;
            if (i == i2) {
                long[] jArr = this.ZpBGe2uQfcn8;
                long[] jArr2 = jn0Var.ZpBGe2uQfcn8;
                defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(0, i2);
                int i3 = OVwOqzUGHcCU.WDYagTQQm9ns;
                int i4 = OVwOqzUGHcCU.oh71FJcDz6S2;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += java.lang.Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        long[] jArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ jn0() {
        this(16);
    }
}
