package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class q0a extends nt0 {
    public final hf9 u;
    public final ff9 v;
    public final efo w = new efo(25);
    public final /* synthetic */ r0a x;

    public q0a(r0a r0aVar, hf9 hf9Var, ff9 ff9Var) {
        this.x = r0aVar;
        this.u = hf9Var;
        this.v = ff9Var;
    }

    @Override // defpackage.nt0
    public final Object T(db8 db8Var, e23 e23Var, pm9 pm9Var) {
        super.T(db8Var, e23Var, pm9Var);
        ((ArrayList) this.w.b).add(this.x.b.a(db8Var.c, this.v));
        return Unit.a;
    }

    @Override // defpackage.nt0
    public final Object V(sb8 sb8Var, e23 e23Var, pm9 pm9Var) {
        Y(e23Var, sb8Var);
        e3s e3sVar = e3s.c;
        xzb xzbVar = e23Var.b;
        if (e3sVar.W(sb8Var, xzbVar)) {
            ArrayList arrayList = new ArrayList();
            List list = sb8Var.c.R;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c0a) it.next()).d.a(xzbVar));
                }
            }
            ((ArrayList) this.w.b).add(this.x.d.b(arrayList, new t89(this.u.k0("video"), 2)));
        }
        return Unit.a;
    }

    public final void Y(e23 e23Var, jc8 jc8Var) {
        r0a r0aVar = this.x;
        f39 f39Var = r0aVar.a;
        hf9 hf9Var = this.u;
        if (f39Var != null) {
            xzb xzbVar = e23Var.b;
            e39 e39Var = new e39(f39Var, hf9Var, xzbVar);
            e39Var.U(jc8Var, xzbVar);
            ArrayList arrayList = e39Var.o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) this.w.b).add(new lf9((ffg) it.next()));
                }
            }
        }
        r0aVar.c.d(jc8Var.d(), e23Var.b, hf9Var);
    }

    @Override // defpackage.nt0
    public final /* bridge */ /* synthetic */ Unit x(jc8 jc8Var, e23 e23Var, pm9 pm9Var) {
        Y(e23Var, jc8Var);
        return Unit.a;
    }
}
