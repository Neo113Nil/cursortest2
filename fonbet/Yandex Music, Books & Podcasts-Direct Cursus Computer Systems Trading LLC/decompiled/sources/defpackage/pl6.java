package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pl6 extends uif implements Function1 {
    public final /* synthetic */ axf r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ lcs t;
    public final /* synthetic */ ybs u;
    public final /* synthetic */ ide v;
    public final /* synthetic */ mnj w;
    public final /* synthetic */ qbs x;
    public final /* synthetic */ mm6 y;
    public final /* synthetic */ lh3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl6(axf axfVar, boolean z, lcs lcsVar, ybs ybsVar, ide ideVar, mnj mnjVar, qbs qbsVar, mm6 mm6Var, lh3 lh3Var) {
        super(1);
        this.r = axfVar;
        this.s = z;
        this.t = lcsVar;
        this.u = ybsVar;
        this.v = ideVar;
        this.w = mnjVar;
        this.x = qbsVar;
        this.y = mm6Var;
        this.z = lh3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dds d;
        bpc bpcVar = (bpc) obj;
        axf axfVar = this.r;
        if (axfVar.b() != bpcVar.b()) {
            axfVar.f.setValue(Boolean.valueOf(bpcVar.b()));
            if (axfVar.b() && this.s) {
                j66.H(this.t, axfVar, this.u, this.v, this.w);
            } else {
                j66.F(axfVar);
            }
            if (bpcVar.b() && (d = axfVar.d()) != null) {
                x97.y(this.y, null, null, new ov(this.z, this.u, axfVar, d, this.w, (Continuation) null, 16), 3);
            }
            if (!bpcVar.b()) {
                this.x.e(null);
            }
        }
        return Unit.a;
    }
}
