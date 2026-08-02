package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bnr extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ cnr s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnr(cnr cnrVar, int i) {
        super(2);
        this.r = i;
        this.s = cnrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                this.s.a().b = (tr5) obj2;
                break;
            case 1:
                zpf a = this.s.a();
                ((mpf) obj).b0(new wpf(a, (Function2) obj2, a.p));
                break;
            default:
                mpf mpfVar = (mpf) obj;
                cnr cnrVar = this.s;
                fnr fnrVar = cnrVar.a;
                zpf zpfVar = mpfVar.H;
                if (zpfVar == null) {
                    zpfVar = new zpf(mpfVar, fnrVar);
                    mpfVar.H = zpfVar;
                }
                cnrVar.b = zpfVar;
                cnrVar.a().d();
                zpf a2 = cnrVar.a();
                if (a2.c != fnrVar) {
                    a2.c = fnrVar;
                    a2.f(false);
                    mpf.W(a2.a, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
