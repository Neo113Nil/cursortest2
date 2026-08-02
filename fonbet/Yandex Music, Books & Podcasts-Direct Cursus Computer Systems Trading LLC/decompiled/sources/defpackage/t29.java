package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class t29 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ i39 s;
    public final /* synthetic */ i29 t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t29(v29 v29Var, i39 i39Var, i29 i29Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = i39Var;
        this.t = i29Var;
        this.u = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                i29 i29Var = this.t;
                szb szbVar = i29Var.o;
                xzb xzbVar = this.u;
                this.s.setGravity(vq1.N((om8) szbVar.a(xzbVar), (pm8) i29Var.p.a(xzbVar)));
                break;
            default:
                i29 i29Var2 = this.t;
                szb szbVar2 = i29Var2.P;
                xzb xzbVar2 = this.u;
                v29.M(this.s, szbVar2 != null ? (Integer) szbVar2.a(xzbVar2) : null, (ip8) i29Var2.Q.a(xzbVar2));
                break;
        }
        return Unit.a;
    }
}
