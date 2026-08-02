package defpackage;

/* loaded from: classes.dex */
public final class f3k implements e3k {
    @Override // defpackage.e3k
    public final int d(int i, float f, int i2) {
        long j = i;
        long j2 = 1;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        int i3 = (int) j3;
        long j4 = j + j2;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        return yhn.d(i2, i3, (int) j4);
    }

    public final boolean equals(Object obj) {
        return obj instanceof f3k;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }
}
