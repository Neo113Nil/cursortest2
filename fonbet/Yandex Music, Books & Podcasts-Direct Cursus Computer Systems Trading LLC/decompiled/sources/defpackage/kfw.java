package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kfw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfw b;

    public /* synthetic */ kfw(qfw qfwVar, int i) {
        this.a = i;
        this.b = qfwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        how a;
        pqw t;
        switch (this.a) {
            case 0:
                sqw sqwVar = (sqw) obj;
                ldw ldwVar = (ldw) this.b.x.getValue();
                gfw gfwVar = ((ykw) this.b.B.getValue()).c(sqwVar).a;
                ldwVar.getClass();
                boolean z = gfwVar == gfw.b;
                ldwVar.d = z;
                if (z) {
                    jcw jcwVar = (jcw) ldwVar.e.getValue();
                    if (jcwVar != null) {
                        jcwVar.d = true;
                    }
                    jcw jcwVar2 = (jcw) ldwVar.f.getValue();
                    if (jcwVar2 != null) {
                        jcwVar2.d = true;
                    }
                    jcw jcwVar3 = (jcw) ldwVar.g.getValue();
                    if (jcwVar3 != null) {
                        jcwVar3.d = true;
                    }
                    jcw jcwVar4 = (jcw) ldwVar.h.getValue();
                    if (jcwVar4 != null) {
                        jcwVar4.d = true;
                    }
                    jcw jcwVar5 = (jcw) ldwVar.i.getValue();
                    if (jcwVar5 != null) {
                        jcwVar5.d = true;
                    }
                    jcw jcwVar6 = (jcw) ldwVar.j.getValue();
                    if (jcwVar6 != null) {
                        jcwVar6.d = true;
                    }
                }
                qfw qfwVar = this.b;
                if (sqwVar == null || (t = s7g.t(sqwVar)) == null || !((Boolean) t.b.l().e.getValue()).booleanValue()) {
                    ldw ldwVar2 = (ldw) qfwVar.x.getValue();
                    jcw jcwVar7 = (jcw) ldwVar2.e.getValue();
                    if (jcwVar7 != null) {
                        jcwVar7.a();
                    }
                    jcw jcwVar8 = (jcw) ldwVar2.f.getValue();
                    if (jcwVar8 != null) {
                        jcwVar8.a();
                    }
                    jcw jcwVar9 = (jcw) ldwVar2.g.getValue();
                    if (jcwVar9 != null) {
                        jcwVar9.a();
                    }
                    jcw jcwVar10 = (jcw) ldwVar2.h.getValue();
                    if (jcwVar10 != null) {
                        jcwVar10.a();
                    }
                    jcw jcwVar11 = (jcw) ldwVar2.i.getValue();
                    if (jcwVar11 != null) {
                        jcwVar11.a();
                    }
                    jcw jcwVar12 = (jcw) ldwVar2.j.getValue();
                    if (jcwVar12 != null) {
                        jcwVar12.a();
                    }
                }
                this.b.F.l(sqwVar);
                ((anw) this.b.u.getValue()).k.l(sqwVar);
                ((hnw) this.b.v.getValue()).g.l(sqwVar);
                etw etwVar = (etw) this.b.C.getValue();
                if (etwVar != null && etwVar.d.d.a()) {
                    gow gowVar = (sqwVar == null || (a = sqwVar.a()) == null) ? null : a.c;
                    if (gowVar == null || gowVar.j || gowVar.f.b.c) {
                        etwVar.f.l(null);
                    } else {
                        ltw ltwVar = (ltw) etwVar.f.getValue();
                        if (!Intrinsics.d(ltwVar != null ? ltwVar.a : null, gowVar.a)) {
                            etwVar.f.l(new ltw(gowVar.a, etwVar.e, etwVar.a, etwVar.c));
                        }
                    }
                }
                break;
            default:
                g4q g4qVar = (g4q) obj;
                ssg.a(4, qfw.H, "reconnect cause of new queue launched ".concat(g4qVar.getClass().getSimpleName() + "(" + System.identityHashCode(g4qVar) + ")"), null);
                qfw qfwVar2 = this.b;
                qfwVar2.h(false);
                qfwVar2.f();
                break;
        }
        return Unit.a;
    }
}
