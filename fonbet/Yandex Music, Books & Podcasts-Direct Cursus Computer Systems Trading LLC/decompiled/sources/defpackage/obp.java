package defpackage;

import com.yandex.plus.paymentsdk.internal.method.card.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class obp extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rbp s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obp(rbp rbpVar, int i) {
        super(0);
        this.r = i;
        this.s = rbpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        rbp rbpVar = this.s;
        switch (i) {
            case 0:
                return ((p77) ((rsd) qld.y(rbpVar)).a().b(p77.class)).c();
            case 1:
                gdp gdpVar = rbpVar.h;
                if (gdpVar == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                String email = rbpVar.l.d() ? ((vhk) rbpVar.x()).e.getEmailView().getEmail() : null;
                mcp mcpVar = rbpVar.i;
                if (mcpVar != null) {
                    gdpVar.K(new jst(email, mcpVar.l));
                    return Unit.a;
                }
                Intrinsics.j("adapter");
                throw null;
            case 2:
                gdp gdpVar2 = rbpVar.h;
                if (gdpVar2 == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                gdpVar2.x = true;
                gdpVar2.t.l(ucp.a);
                sbp sbpVar = rbpVar.p;
                if (sbpVar == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                Object obj = kib.a;
                a a = kib.a(sbpVar.b.b());
                if (a != null) {
                    a.a(b3i.h);
                }
                return Unit.a;
            case 3:
                g0c z = rbpVar.z();
                qne g0 = gut.g0();
                x60 x60Var = (x60) z;
                x60Var.getClass();
                x60Var.a(g0);
                gdp gdpVar3 = rbpVar.h;
                if (gdpVar3 == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                String email2 = rbpVar.l.d() ? ((vhk) rbpVar.x()).e.getEmailView().getEmail() : null;
                mcp mcpVar2 = rbpVar.i;
                if (mcpVar2 != null) {
                    gdpVar3.G(new jst(email2, mcpVar2.l));
                    return Unit.a;
                }
                Intrinsics.j("adapter");
                throw null;
            case 4:
                return rbpVar.requireActivity().getViewModelStore();
            case 5:
                return rbpVar.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return rbpVar.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
