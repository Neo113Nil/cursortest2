package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class smg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tmg b;

    public /* synthetic */ smg(tmg tmgVar, int i) {
        this.a = i;
        this.b = tmgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(q8n.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                tmg tmgVar = this.b;
                rp7Var.C((q8n) tmgVar.a.getValue());
                o18Var.c = hag.I(oq7.class);
                rp7Var.getClass();
                rp7Var.C((oq7) tmgVar.h.getValue());
                o18Var.c = hag.I(qiw.class);
                rp7Var.getClass();
                rp7Var.E(new smg(tmgVar, 1));
                o18Var.c = hag.I(g3t.class);
                rp7Var.getClass();
                rp7Var.C((g3t) tmgVar.c.getValue());
                o18Var.c = hag.I(vnk.class);
                rp7Var.getClass();
                rp7Var.C((vnk) tmgVar.d.getValue());
                o18Var.c = hag.I(frt.class);
                rp7Var.getClass();
                rp7Var.C((frt) tmgVar.f.getValue());
                o18Var.c = hag.I(cc7.class);
                rp7Var.getClass();
                rp7Var.C((cc7) tmgVar.g.getValue());
                o18Var.c = hag.I(umg.class);
                rp7Var.getClass();
                rp7Var.C((umg) tmgVar.i.getValue());
                o18Var.c = hag.I(jmg.class);
                rp7Var.getClass();
                rp7Var.E(new smg(tmgVar, 2));
                o18Var.c = hag.I(fkg.class);
                rp7Var.getClass();
                rp7Var.E(new xjf(24));
                o18Var.c = hag.I(b9n.class);
                rp7Var.getClass();
                rp7Var.E(new smg(tmgVar, 3));
                o18Var.c = hag.I(ocn.class);
                rp7Var.getClass();
                rp7Var.E(new xjf(25));
                o18Var.c = hag.I(aa2.class);
                rp7Var.getClass();
                rp7Var.E(new xjf(26));
                o18Var.c = hag.I(wmg.class);
                rp7Var.getClass();
                rp7Var.E(new xjf(27));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (qiw) this.b.b.getValue();
            case 2:
                ((l13) obj).getClass();
                tmg tmgVar2 = this.b;
                return new qmg((q8n) tmgVar2.a.getValue(), (oq7) tmgVar2.h.getValue(), (umg) tmgVar2.i.getValue());
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(vnk.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new b9n((vnk) qdcVar.D(I, l13Var, set), btf.b(new dmg(1, this.b)), (frt) qdcVar.D(hag.I(frt.class), l13Var, set), (fkg) qdcVar.D(hag.I(fkg.class), l13Var, set), (umg) qdcVar.D(hag.I(umg.class), l13Var, set));
        }
    }
}
