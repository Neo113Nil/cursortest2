package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qom extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ som s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qom(som somVar, int i) {
        super(0);
        this.r = i;
        this.s = somVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                eqm eqmVar = this.s.i;
                if (eqmVar != null) {
                    eqmVar.L();
                    return Unit.a;
                }
                Intrinsics.j("viewModel");
                throw null;
            case 2:
                eqm eqmVar2 = this.s.i;
                if (eqmVar2 != null) {
                    eqmVar2.L();
                    return Unit.a;
                }
                Intrinsics.j("viewModel");
                throw null;
            case 3:
                som somVar = this.s;
                g0c g0cVar = (g0c) somVar.m.getValue();
                qne g0 = gut.g0();
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(g0);
                eqm eqmVar3 = somVar.i;
                if (eqmVar3 == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                mcp mcpVar = somVar.j;
                if (mcpVar == null) {
                    Intrinsics.j("adapter");
                    throw null;
                }
                rfk y = dag.y(mcpVar.k);
                if (eqmVar3.s.contains(y)) {
                    eqmVar3.q.l(new aqm(y));
                    return Unit.a;
                }
                wvs.p("Invalid state. Selected method is empty.");
                return null;
            case 4:
                eqm eqmVar4 = this.s.i;
                if (eqmVar4 != null) {
                    eqmVar4.H();
                    return Unit.a;
                }
                Intrinsics.j("viewModel");
                throw null;
            case 5:
                return this.s.requireActivity().getViewModelStore();
            case 6:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
