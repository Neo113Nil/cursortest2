package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ift implements p7q {
    public final Function0 a;

    public void a(yci yciVar, long j, hq5 hq5Var, int i) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(287320089);
        int i2 = i | (oq5Var.f(yciVar) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.f(this) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lg3.B(this.a, xz0.Y(new ogo[]{ogo.c, ogo.d}), yciVar, new d85(d85.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14)), new d85(d85.b(j, 0.08f, 0.0f, 0.0f, 0.0f, 14)), oq5Var, ((i2 << 6) & 896) | 48, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dj(this, yciVar, j, i, 5);
        }
    }

    public boolean b(r3q r3qVar) {
        if (r3qVar instanceof m3q) {
            return Intrinsics.d(((m3q) r3qVar).b, ryt.a);
        }
        if ((r3qVar instanceof p3q) || (r3qVar instanceof j3q) || (r3qVar instanceof l3q)) {
            return false;
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:14:0x001e->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(szu szuVar) {
        boolean b;
        boolean z;
        szuVar.getClass();
        List j = szuVar.j();
        if (!(j instanceof Collection) || !j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                izs izsVar = ((jzs) it.next()).g;
                if (!Intrinsics.d(izsVar, hzs.a)) {
                    if (!(izsVar instanceof e6v)) {
                        b6e.s();
                        return null;
                    }
                    e6v e6vVar = (e6v) izsVar;
                    if (e6vVar instanceof b6v) {
                        b = b(((b6v) e6vVar).a);
                        if (b) {
                            z = false;
                            break;
                        }
                    } else if (!(e6vVar instanceof d6v)) {
                        b6e.s();
                        return null;
                    }
                }
                b = false;
                if (b) {
                }
            }
        }
        z = true;
        return Boolean.valueOf(z && rzf.G((List) this.a.invoke(), szuVar.j()));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        boolean z;
        naq naqVar;
        uow uowVar;
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            jbq jbqVar = (jbq) maqVar;
            Set o = jbqVar.o();
            if (o.size() != 1) {
                o = null;
            }
            if (o != null && (naqVar = (naq) CollectionsKt.firstOrNull(jbqVar.n())) != null && (uowVar = naqVar.d) != null) {
                izs I = q7g.I(uowVar);
                if (I instanceof e6v) {
                    e6v e6vVar = (e6v) I;
                    if (e6vVar instanceof b6v) {
                        z = b(((b6v) e6vVar).a);
                        return Boolean.valueOf(!z && rzf.G((List) this.a.invoke(), maqVar.j()));
                    }
                    if (!(e6vVar instanceof d6v)) {
                        b6e.s();
                        return null;
                    }
                } else if (!I.equals(hzs.a)) {
                    b6e.s();
                    return null;
                }
            }
        } else if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
            b6e.s();
            return null;
        }
        z = false;
        return Boolean.valueOf(!z && rzf.G((List) this.a.invoke(), maqVar.j()));
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }
}
