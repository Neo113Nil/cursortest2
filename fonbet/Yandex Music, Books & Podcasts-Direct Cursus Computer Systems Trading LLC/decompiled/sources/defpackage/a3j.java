package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class a3j extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d3j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3j(d3j d3jVar, int i) {
        super(0);
        this.r = i;
        this.s = d3jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                return new z03(this.s.y());
            case 2:
                d3j d3jVar = this.s;
                g0c y = d3jVar.y();
                qne g0 = gut.g0();
                x60 x60Var = (x60) y;
                x60Var.getClass();
                x60Var.a(g0);
                k5 k5Var = ((f3j) d3jVar.l.getValue()).l.n;
                if (k5Var != null) {
                    k5Var.invoke();
                }
                return Unit.a;
            case 3:
                return this.s.requireActivity().getViewModelStore();
            case 4:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return this.s;
            default:
                d3j d3jVar2 = this.s;
                return new x2j(((p77) ((rsd) qld.y(d3jVar2)).a().b(p77.class)).f(), ((p77) ((rsd) qld.y(d3jVar2)).a().b(p77.class)).g(), (z03) d3jVar2.i.getValue(), d3jVar2.h, d3jVar2, d3jVar2.getArguments());
        }
    }
}
