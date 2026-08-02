package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class qt8 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ ht8 s;
    public final /* synthetic */ p89 t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt8(ht8 ht8Var, xzb xzbVar, p89 p89Var, rt8 rt8Var, xzb xzbVar2) {
        super(1);
        this.s = ht8Var;
        this.t = p89Var;
        this.u = xzbVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.t.setShowDividers(rt8.R(this.s, this.u));
                break;
            default:
                ht8 ht8Var = this.s;
                dx8 dx8Var = ht8Var != null ? ht8Var.e : null;
                p89 p89Var = this.t;
                p89Var.setDividerDrawable(dx8Var != null ? vq1.g0(dx8Var, p89Var.getResources().getDisplayMetrics(), this.u) : null);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt8(ht8 ht8Var, xzb xzbVar, p89 p89Var, xzb xzbVar2) {
        super(1);
        this.s = ht8Var;
        this.t = p89Var;
        this.u = xzbVar2;
    }
}
