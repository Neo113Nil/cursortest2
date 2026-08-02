package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lj {
    public static final lj f = new lj(new jj[0], 0, -9223372036854775807L, 0);
    public static final jj g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final jj[] e;

    static {
        jj jjVar = new jj(0L, -1, -1, new int[0], new onh[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = jjVar.f;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = jjVar.g;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        g = new jj(jjVar.a, 0, jjVar.c, copyOf, (onh[]) Arrays.copyOf(jjVar.e, 0), copyOf2, jjVar.i, jjVar.j, (String[]) Arrays.copyOf(jjVar.h, 0), jjVar.k);
        int i2 = dvt.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public lj(jj[] jjVarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = jjVarArr.length + i2;
        this.e = jjVarArr;
        this.d = i2;
    }

    public final jj a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lj.class != obj.getClass()) {
            return false;
        }
        lj ljVar = (lj) obj;
        return this.a == ljVar.a && this.b == ljVar.b && this.c == ljVar.c && this.d == ljVar.d && Arrays.equals(this.e, ljVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            jj[] jjVarArr = this.e;
            if (i2 >= jjVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(jjVarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < jjVarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = jjVarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(jjVarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < jjVarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < jjVarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
