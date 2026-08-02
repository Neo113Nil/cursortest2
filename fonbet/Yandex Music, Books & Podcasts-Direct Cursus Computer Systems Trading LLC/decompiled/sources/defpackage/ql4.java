package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ql4 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ql4(yk5 yk5Var, long j, long j2, Function1 function1) {
        this.d = yk5Var;
        this.b = j;
        this.c = j2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) this.d;
                amr amrVar = (amr) this.e;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float floatValue = ((Number) function0.invoke()).floatValue() * 360.0f;
                xv.G(jpaVar, 360.0f, this.b, amrVar);
                xv.G(jpaVar, floatValue, this.c, amrVar);
                return Unit.a;
            default:
                yk5 yk5Var = (yk5) this.d;
                Function1 function1 = (Function1) this.e;
                float floatValue2 = ((Float) obj).floatValue();
                Comparable comparable = yk5Var.a;
                long j = ((nsa) comparable).a;
                Comparable comparable2 = yk5Var.b;
                long o = nsa.o(j, yd5.M(eeh.b(nsa.f(nsa.n(((nsa) comparable2).a, ((nsa) comparable).a)) * floatValue2), ssa.MILLISECONDS));
                long j2 = this.b;
                long j3 = ((nsa) yhn.i(new nsa(hyf.H(nsa.p(eeh.a(nsa.d(o, j2)), j2))), comparable, comparable2)).a;
                if (nsa.e(j3, this.c)) {
                    z = false;
                } else {
                    function1.invoke(new nsa(j3));
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ql4(Function0 function0, long j, amr amrVar, long j2) {
        this.d = function0;
        this.b = j;
        this.e = amrVar;
        this.c = j2;
    }
}
