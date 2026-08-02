package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class rud extends pgd {
    public final io9 F;
    public final p1b G;
    public final Context H;
    public final w030 I;
    public final sue0 J;
    public final mu5 K;

    public rud(io9 io9Var, p1b p1bVar, Context context, w030 w030Var, sue0 sue0Var) {
        super(0);
        this.F = io9Var;
        this.G = p1bVar;
        this.H = context;
        this.I = w030Var;
        this.J = sue0Var;
        this.K = new mu5(new vqb(15, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        wud wudVar = (wud) obj;
        if (((gvd) this.F.a).b(wudVar.b, wudVar.c, wudVar.d) != null) {
            return;
        }
        xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Validation", null, null, "Compound option select validation failed: mapper returned null", 6);
        r(new qu(9));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.H;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.I;
    }
}
