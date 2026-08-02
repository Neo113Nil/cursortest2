package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class h9r implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g9r b;
    public final /* synthetic */ flv c;
    public final /* synthetic */ plv d;

    public /* synthetic */ h9r(g9r g9rVar, flv flvVar, plv plvVar) {
        this.b = g9rVar;
        this.c = flvVar;
        this.d = plvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    g9r g9rVar = this.b;
                    float b = g9rVar.b();
                    ukd z = o5g.z(skd.a);
                    flv flvVar = this.c;
                    plv plvVar = this.d;
                    p1g.j(b, z, plvVar, false, ild.C(-1221539136, new h9r(g9rVar, flvVar, plvVar), oq5Var), oq5Var, 24576);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    szf.y(this.c, o5g.z(skd.a), this.d, this.b.i, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h9r(g9r g9rVar, plv plvVar, flv flvVar) {
        this.b = g9rVar;
        this.d = plvVar;
        this.c = flvVar;
    }
}
