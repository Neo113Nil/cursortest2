package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class tfc0 implements v7p {
    public final /* synthetic */ int a;
    public final x4g b;
    public final g680 c;

    public /* synthetic */ tfc0(x4g x4gVar, g680 g680Var, int i) {
        this.a = i;
        this.b = x4gVar;
        this.c = g680Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g680 g680Var = this.c;
        x4g x4gVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) x4gVar.get();
                tcc0 tcc0Var = (tcc0) g680Var.get();
                bu0 bu0Var = new bu0();
                bu0Var.a = context;
                bu0Var.b = tcc0Var;
                bu0Var.c = bu0Var.h(new fvb0(24));
                bu0Var.d = bu0Var.h(new fvb0(25));
                bu0Var.e = bu0Var.h(new fvb0(26));
                bu0Var.f = bu0Var.h(new fvb0(27));
                bu0Var.g = bu0Var.h(new fvb0(28));
                bu0Var.h = bu0Var.h(new fvb0(29));
                bu0Var.i = bu0Var.h(new sfc0(0));
                return bu0Var;
            case 1:
                return new xv10((Context) x4gVar.get(), (tcc0) g680Var.get());
            default:
                return new w040((Context) x4gVar.get(), (tcc0) g680Var.get());
        }
    }
}
