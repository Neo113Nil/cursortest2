package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class nt8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ht8 s;
    public final /* synthetic */ c2a t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt8(ht8 ht8Var, xzb xzbVar, c2a c2aVar, rt8 rt8Var, xzb xzbVar2, int i) {
        super(1);
        this.r = i;
        this.s = ht8Var;
        this.t = c2aVar;
        this.u = xzbVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.t.setShowLineSeparators(rt8.R(this.s, this.u));
                break;
            case 1:
                ht8 ht8Var = this.s;
                dx8 dx8Var = ht8Var != null ? ht8Var.e : null;
                c2a c2aVar = this.t;
                c2aVar.setLineSeparatorDrawable(dx8Var != null ? vq1.g0(dx8Var, c2aVar.getResources().getDisplayMetrics(), this.u) : null);
                break;
            case 2:
                this.t.setShowSeparators(rt8.R(this.s, this.u));
                break;
            default:
                ht8 ht8Var2 = this.s;
                dx8 dx8Var2 = ht8Var2 != null ? ht8Var2.e : null;
                c2a c2aVar2 = this.t;
                c2aVar2.setSeparatorDrawable(dx8Var2 != null ? vq1.g0(dx8Var2, c2aVar2.getResources().getDisplayMetrics(), this.u) : null);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt8(ht8 ht8Var, xzb xzbVar, c2a c2aVar, xzb xzbVar2, int i) {
        super(1);
        this.r = i;
        this.s = ht8Var;
        this.t = c2aVar;
        this.u = xzbVar2;
    }
}
