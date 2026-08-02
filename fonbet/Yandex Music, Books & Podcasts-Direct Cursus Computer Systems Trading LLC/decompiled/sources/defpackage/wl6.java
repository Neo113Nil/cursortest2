package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class wl6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xl6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl6(xl6 xl6Var, jfp jfpVar) {
        super(1);
        this.r = 3;
        this.s = xl6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        boolean z = false;
        xl6 xl6Var = this.s;
        switch (i) {
            case 0:
                x6k x6kVar = xl6Var.s.t;
                Boolean bool = Boolean.TRUE;
                x6kVar.setValue(bool);
                xl6Var.s.s.setValue(bool);
                xl6.V0(xl6Var, xl6Var.s, ((mn0) obj).b, xl6Var.t);
                break;
            case 1:
                List list = (List) obj;
                if (xl6Var.s.d() != null) {
                    dds d = xl6Var.s.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                break;
            case 2:
                xl6.V0(xl6Var, xl6Var.s, ((mn0) obj).b, xl6Var.t);
                break;
            default:
                mn0 mn0Var = (mn0) obj;
                if (!xl6Var.t) {
                    break;
                } else {
                    pcs pcsVar = xl6Var.s.e;
                    Unit unit = null;
                    if (pcsVar != null) {
                        List h = u75.h(new sdc(), new vb5(mn0Var, 1));
                        axf axfVar = xl6Var.s;
                        pt0 pt0Var = axfVar.d;
                        nl6 nl6Var = axfVar.v;
                        ybs l = pt0Var.l(h);
                        pcsVar.a(null, l);
                        nl6Var.invoke(l);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        ybs ybsVar = xl6Var.r;
                        String str = ybsVar.a.b;
                        long j = ybsVar.b;
                        int i2 = rds.c;
                        String obj2 = StringsKt.c0(str, (int) (j >> 32), (int) (j & 4294967295L), mn0Var).toString();
                        int length = mn0Var.b.length() + ((int) (xl6Var.r.b >> 32));
                        xl6Var.s.v.invoke(new ybs(obj2, y5g.P(length, length), 4));
                    }
                    break;
                }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl6(xl6 xl6Var, int i) {
        super(1);
        this.r = i;
        this.s = xl6Var;
    }
}
