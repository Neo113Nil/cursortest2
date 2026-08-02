package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ql6 extends uif implements Function1 {
    public final /* synthetic */ axf r;
    public final /* synthetic */ yoc s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ qbs u;
    public final /* synthetic */ mnj v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(axf axfVar, yoc yocVar, boolean z, qbs qbsVar, mnj mnjVar) {
        super(1);
        this.r = axfVar;
        this.s = yocVar;
        this.t = z;
        this.u = qbsVar;
        this.v = mnjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((enj) obj).a;
        axf axfVar = this.r;
        if (axfVar.b()) {
            c3r c3rVar = axfVar.c;
            if (c3rVar != null) {
                ((nw7) c3rVar).b();
            }
        } else {
            yoc.b(this.s);
        }
        if (axfVar.b() && this.t) {
            if (axfVar.a() != zrd.b) {
                dds d = axfVar.d();
                if (d != null) {
                    pt0 pt0Var = axfVar.d;
                    nl6 nl6Var = axfVar.v;
                    int c = this.v.c(d.b(j, true));
                    nl6Var.invoke(ybs.a((ybs) pt0Var.a, null, y5g.P(c, c), 5));
                    if (axfVar.a.a.b.length() > 0) {
                        axfVar.k.setValue(zrd.c);
                    }
                }
            } else {
                this.u.e(new enj(j));
            }
        }
        return Unit.a;
    }
}
