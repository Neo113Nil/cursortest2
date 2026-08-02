package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uom extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uom(wom womVar, int i) {
        super(0);
        this.r = i;
        this.s = womVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                wom womVar = this.s;
                g0c g0cVar = (g0c) womVar.m.getValue();
                qne g0 = gut.g0();
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(g0);
                lpm lpmVar = womVar.i;
                if (lpmVar == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                int ordinal = lpmVar.x.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        lpmVar.r.l(epm.a);
                        lpmVar.s.l(zom.a);
                        if (lpmVar.n) {
                            ffk ffkVar = lpmVar.u;
                            if (ffkVar != null) {
                                lpmVar.p.invoke(new rdp(ffkVar, null));
                            } else {
                                xq0.q("Valid state without correct payment option");
                            }
                        } else {
                            ((tdk) lpmVar.k).h.a(new qec(27, lpmVar));
                        }
                    } else {
                        xq0.q("Illegal card input state");
                    }
                    return null;
                }
                xw3 xw3Var = (xw3) lpmVar.m.a;
                if (xw3Var != null) {
                    xw3Var.e();
                }
                return Unit.a;
            case 2:
                return this.s.requireActivity().getViewModelStore();
            case 3:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
