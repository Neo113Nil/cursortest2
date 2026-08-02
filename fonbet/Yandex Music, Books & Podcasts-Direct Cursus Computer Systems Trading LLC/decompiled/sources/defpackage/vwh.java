package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public abstract class vwh {
    public static final g8c a = new g8c((Object) null);

    public static boolean a(tmp tmpVar, tmp tmpVar2) {
        g8l g8lVar = tmpVar.a;
        int i = g8lVar.b;
        g8l g8lVar2 = tmpVar2.a;
        return i == g8lVar2.b && g8lVar.e == g8lVar2.e && g8lVar.h == g8lVar2.h && g8lVar.i == g8lVar2.i;
    }

    public static int b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return dvt.i((int) ((j * 100) / j2), 0, 100);
    }

    public static long c(rdl rdlVar, long j, long j2, long j3) {
        tmp tmpVar = rdlVar.c;
        tmp tmpVar2 = rdlVar.c;
        boolean z = tmpVar.equals(tmp.l) || j2 < tmpVar2.c;
        if (rdlVar.v) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - tmpVar2.c;
                }
                long j4 = tmpVar2.a.f + ((long) (j3 * rdlVar.g.a));
                long j5 = tmpVar2.d;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return tmpVar2.a.f;
        }
        return j;
    }

    public static d8l d(d8l d8lVar, d8l d8lVar2) {
        if (d8lVar != null) {
            xgc xgcVar = d8lVar.a;
            if (d8lVar2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < xgcVar.a.size(); i++) {
                    if (d8lVar2.a(xgcVar.b(i))) {
                        int b = xgcVar.b(i);
                        vq1.A(!false);
                        sparseBooleanArray.append(b, true);
                    }
                }
                vq1.A(!false);
                return new d8l(new xgc(sparseBooleanArray));
            }
        }
        return d8l.b;
    }

    public static Pair e(rdl rdlVar, pdl pdlVar, rdl rdlVar2, pdl pdlVar2, d8l d8lVar) {
        boolean z = pdlVar2.a;
        boolean z2 = pdlVar2.b;
        if (z && d8lVar.a(17) && !pdlVar.a) {
            rdlVar2 = rdlVar2.l(rdlVar.j);
            pdlVar2 = new pdl(false, z2);
        }
        if (z2 && d8lVar.a(30) && !pdlVar.b) {
            rdlVar2 = rdlVar2.b(rdlVar.D);
            pdlVar2 = new pdl(pdlVar2.a, false);
        }
        return new Pair(rdlVar2, pdlVar2);
    }

    public static void f(i8l i8lVar, xrh xrhVar) {
        int i = xrhVar.b;
        long j = xrhVar.c;
        yde ydeVar = xrhVar.a;
        if (i == -1) {
            if (i8lVar.V0(20)) {
                i8lVar.I0(ydeVar);
                return;
            } else {
                if (ydeVar.isEmpty()) {
                    return;
                }
                i8lVar.T((onh) ydeVar.get(0));
                return;
            }
        }
        if (i8lVar.V0(20)) {
            i8lVar.a0(xrhVar.b, j, ydeVar);
        } else {
            if (ydeVar.isEmpty()) {
                return;
            }
            i8lVar.x((onh) ydeVar.get(0), j);
        }
    }
}
