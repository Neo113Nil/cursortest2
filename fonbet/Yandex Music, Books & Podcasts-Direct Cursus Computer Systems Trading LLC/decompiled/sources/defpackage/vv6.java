package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class vv6 implements ipr {
    public static final yl3 c = new yl3(new qq6(10), dxi.a);
    public final yde a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vv6(qsn qsnVar) {
        long j;
        int i = qsnVar.d;
        long j2 = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            ude listIterator = qsnVar.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            uv6 uv6Var = (uv6) next;
            long j3 = uv6Var.b;
            long j4 = uv6Var.c;
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            yde ydeVar = uv6Var.a;
            if (j4 == -9223372036854775807L) {
                this.a = yde.y(ydeVar);
                this.b = new long[]{j5};
                return;
            } else {
                ude udeVar = yde.b;
                this.a = yde.z(ydeVar, qsn.e);
                this.b = new long[]{j5, j4 + j5};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        qsn B = yde.B(c, qsnVar);
        int i3 = 0;
        while (i2 < B.d) {
            uv6 uv6Var2 = (uv6) B.get(i2);
            long j6 = uv6Var2.b;
            long j7 = uv6Var2.c;
            yde ydeVar2 = uv6Var2.a;
            j6 = j6 == j2 ? 0L : j6;
            long j8 = j6 + j7;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j9 = this.b[i4];
                if (j9 >= j6) {
                    if (j9 == j6 && ((yde) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, ydeVar2);
                        j = j2;
                    } else {
                        j = j2;
                        vq1.n0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i4] = j6;
                        arrayList.set(i4, ydeVar2);
                    }
                    if (j7 == j) {
                        this.b[i3] = j8;
                        arrayList.add(qsn.e);
                        i3++;
                    }
                    i2++;
                    j2 = j;
                }
            }
            j = j2;
            this.b[i3] = j6;
            arrayList.add(ydeVar2);
            i3++;
            if (j7 == j) {
            }
            i2++;
            j2 = j;
        }
        this.a = yde.v(arrayList);
    }

    @Override // defpackage.ipr
    public final int e(long j) {
        int a = dvt.a(this.b, j, false);
        if (a < this.a.size()) {
            return a;
        }
        return -1;
    }

    @Override // defpackage.ipr
    public final List g(long j) {
        int e = dvt.e(this.b, j, false);
        if (e != -1) {
            return (yde) this.a.get(e);
        }
        ude udeVar = yde.b;
        return qsn.e;
    }

    @Override // defpackage.ipr
    public final long o(int i) {
        vq1.v(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.ipr
    public final int q() {
        return this.a.size();
    }
}
