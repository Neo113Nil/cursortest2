package defpackage;

import android.net.Uri;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class uu71 implements kq71 {
    public static final dp71 A;
    public static final uu71 y = new uu71(new pr71[0], 0, -9223372036854775807L, 0);
    public static final pr71 z;
    public final int a;
    public final long b;
    public final long c;
    public final int w;
    public final pr71[] x;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        z = new pr71(0L, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
        A = new dp71(29);
    }

    public uu71(pr71[] pr71VarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = pr71VarArr.length + i;
        this.x = pr71VarArr;
        this.w = i;
    }

    public final pr71 a(int i) {
        int i2 = this.w;
        return i < i2 ? z : this.x[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uu71.class != obj.getClass()) {
            return false;
        }
        uu71 uu71Var = (uu71) obj;
        int i = rf71.a;
        return this.a == uu71Var.a && this.b == uu71Var.b && this.c == uu71Var.c && this.w == uu71Var.w && Arrays.equals(this.x, uu71Var.x);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.w) * 31) + Arrays.hashCode(this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            pr71[] pr71VarArr = this.x;
            if (i >= pr71VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(pr71VarArr[i].a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < pr71VarArr[i].w.length; i2++) {
                sb.append("ad(state=");
                int i3 = pr71VarArr[i].w[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(pr71VarArr[i].x[i2]);
                sb.append(')');
                if (i2 < pr71VarArr[i].w.length - 1) {
                    sb.append(Extension.FIX_SPACE);
                }
            }
            sb.append("])");
            if (i < pr71VarArr.length - 1) {
                sb.append(Extension.FIX_SPACE);
            }
            i++;
        }
    }
}
