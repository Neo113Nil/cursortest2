package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kna extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kna(int i, Function1 function1) {
        super(3);
        this.r = i;
        this.s = function1;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                long j = ((enj) obj3).a;
                this.s.invoke(new enj(((lfm) obj2).c));
                return Unit.a;
            default:
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(-1608161351);
                Function1 function1 = this.s;
                boolean f = oq5Var.f(function1);
                Object K = oq5Var.K();
                if (f || K == gq5.a) {
                    K = new ta6(function1);
                    oq5Var.k0(K);
                }
                ta6 ta6Var = (ta6) K;
                oq5Var.p(false);
                return ta6Var;
        }
    }
}
