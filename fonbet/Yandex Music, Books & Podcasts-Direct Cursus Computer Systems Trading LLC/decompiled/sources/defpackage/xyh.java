package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xyh implements tv6 {
    public static final ks5 b = new ks5(new yl3(new tuh(8), dxi.a), new yl3(new tuh(9), gdo.a));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.tv6
    public final boolean a(uv6 uv6Var, long j) {
        long j2 = uv6Var.b;
        vq1.v(j2 != -9223372036854775807L);
        vq1.v(uv6Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < uv6Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((uv6) arrayList.get(size)).b) {
                arrayList.add(size + 1, uv6Var);
                return z;
            }
        }
        arrayList.add(0, uv6Var);
        return z;
    }

    @Override // defpackage.tv6
    public final yde b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((uv6) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    uv6 uv6Var = (uv6) arrayList.get(i);
                    if (j >= uv6Var.b && j < uv6Var.d) {
                        arrayList2.add(uv6Var);
                    }
                    if (j < uv6Var.b) {
                        break;
                    }
                }
                qsn B = yde.B(b, arrayList2);
                tde u = yde.u();
                for (int i2 = 0; i2 < B.d; i2++) {
                    u.c(((uv6) B.get(i2)).a);
                }
                return u.f();
            }
        }
        ude udeVar = yde.b;
        return qsn.e;
    }

    @Override // defpackage.tv6
    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((uv6) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((uv6) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((uv6) arrayList.get(i)).b;
            long j4 = ((uv6) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // defpackage.tv6
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.tv6
    public final long d(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((uv6) arrayList.get(i)).b;
            long j4 = ((uv6) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.tv6
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((uv6) arrayList.get(i)).b;
            if (j > j2 && j > ((uv6) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
