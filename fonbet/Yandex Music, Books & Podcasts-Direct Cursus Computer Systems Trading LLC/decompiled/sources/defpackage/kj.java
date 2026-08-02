package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kj {
    public static final kj c = new kj(new ij[0]);
    public final int a;
    public final ij[] b;

    static {
        ij ijVar = new ij(-1, -1, new int[0], new Uri[0], new long[0]);
        int[] iArr = ijVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = ijVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        new ij(0, ijVar.b, copyOf, (Uri[]) Arrays.copyOf(ijVar.c, 0), copyOf2);
        yut.d(1);
        yut.d(2);
        yut.d(3);
        yut.d(4);
    }

    public kj(ij[] ijVarArr) {
        this.a = ijVarArr.length;
        this.b = ijVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj.class != obj.getClass()) {
            return false;
        }
        kj kjVar = (kj) obj;
        int i = yut.a;
        return this.a == kjVar.a && Arrays.equals(this.b, kjVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        return f1d.g("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
