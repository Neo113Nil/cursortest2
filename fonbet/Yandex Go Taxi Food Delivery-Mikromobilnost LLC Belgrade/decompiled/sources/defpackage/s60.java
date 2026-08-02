package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class s60 {
    public static final s60 c = new s60(new r60[0]);
    public static final r60 d;
    public final int a;
    public final r60[] b;

    static {
        r60 r60Var = new r60(-1, -1, new int[0], new fe10[0], new long[0], new String[0]);
        int[] iArr = r60Var.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = r60Var.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        d = new r60(0, r60Var.b, copyOf, (fe10[]) Arrays.copyOf(r60Var.d, 0), copyOf2, (String[]) Arrays.copyOf(r60Var.g, 0));
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
    }

    public s60(r60[] r60VarArr) {
        this.a = r60VarArr.length;
        this.b = r60VarArr;
    }

    public final r60 a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s60.class != obj.getClass()) {
            return false;
        }
        s60 s60Var = (s60) obj;
        return this.a == s60Var.a && Arrays.equals(this.b, s60Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            r60[] r60VarArr = this.b;
            if (i >= r60VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            r60VarArr[i].getClass();
            for (int i2 = 0; i2 < r60VarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = r60VarArr[i].e[i2];
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
                sb.append(r60VarArr[i].f[i2]);
                sb.append(')');
                if (i2 < r60VarArr[i].e.length - 1) {
                    sb.append(Extension.FIX_SPACE);
                }
            }
            sb.append("])");
            if (i < r60VarArr.length - 1) {
                sb.append(Extension.FIX_SPACE);
            }
            i++;
        }
    }
}
