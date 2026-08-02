package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z2j extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ c3j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2j(c3j c3jVar, int i) {
        super(0);
        this.r = i;
        this.s = c3jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                return new j3j(this.s.z());
            case 2:
                sbp sbpVar = this.s.r;
                if (sbpVar == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                mgk mgkVar = sbpVar.i;
                if (mgkVar != null) {
                    return mgkVar;
                }
                xq0.q("Null payment for pay new card fragment");
                return null;
            case 3:
                this.s.A();
                return Unit.a;
            case 4:
                c3j c3jVar = this.s;
                g0c z = c3jVar.z();
                qne g0 = gut.g0();
                x60 x60Var = (x60) z;
                x60Var.getClass();
                x60Var.a(g0);
                e3j e3jVar = c3jVar.s;
                if (e3jVar == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                k5 k5Var = e3jVar.l.n;
                if (k5Var != null) {
                    k5Var.invoke();
                }
                return Unit.a;
            case 5:
                return this.s.requireActivity().getViewModelStore();
            case 6:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
