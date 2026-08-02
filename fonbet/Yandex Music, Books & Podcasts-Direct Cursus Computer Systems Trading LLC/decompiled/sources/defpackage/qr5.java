package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qr5 implements ahp {
    public final qsn a;
    public long b;

    public qr5(List list, List list2) {
        tde u = yde.u();
        vq1.v(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            u.a(new pr5((ahp) list.get(i), (List) list2.get(i)));
        }
        this.a = u.f();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.ahp
    public final long e() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            qsn qsnVar = this.a;
            if (i >= qsnVar.d) {
                break;
            }
            long e = ((pr5) qsnVar.get(i)).a.e();
            if (e != Long.MIN_VALUE) {
                j = Math.min(j, e);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        int i = 0;
        while (true) {
            qsn qsnVar = this.a;
            if (i >= qsnVar.d) {
                return false;
            }
            if (((pr5) qsnVar.get(i)).a.f()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        boolean z;
        boolean z2 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                qsn qsnVar = this.a;
                if (i >= qsnVar.d) {
                    break;
                }
                long e2 = ((pr5) qsnVar.get(i)).a.e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= dhgVar.a;
                if (e2 == e || z3) {
                    z |= ((pr5) qsnVar.get(i)).a.n(dhgVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.ahp
    public final long r() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            qsn qsnVar = this.a;
            if (i >= qsnVar.d) {
                break;
            }
            pr5 pr5Var = (pr5) qsnVar.get(i);
            long r = pr5Var.a.r();
            yde ydeVar = pr5Var.b;
            if ((ydeVar.contains(1) || ydeVar.contains(2) || ydeVar.contains(4)) && r != Long.MIN_VALUE) {
                j = Math.min(j, r);
            }
            if (r != Long.MIN_VALUE) {
                j2 = Math.min(j2, r);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        int i = 0;
        while (true) {
            qsn qsnVar = this.a;
            if (i >= qsnVar.d) {
                return;
            }
            ((pr5) qsnVar.get(i)).t(j);
            i++;
        }
    }
}
