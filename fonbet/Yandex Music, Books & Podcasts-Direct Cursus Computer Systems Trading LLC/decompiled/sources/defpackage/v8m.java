package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class v8m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ v8m(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pzl pzlVar = this.b;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(fjk.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.D(new v8m(pzlVar, 1));
                o18Var.c = hag.I(kik.class);
                rp7Var.getClass();
                rp7Var.D(new v8m(pzlVar, 2));
                o18Var.c = hag.I(s8m.class);
                rp7Var.getClass();
                rp7Var.D(new v8m(pzlVar, 3));
                o18Var.c = hag.I(dqi.class);
                rp7Var.getClass();
                rp7Var.D(new v8m(pzlVar, 4));
                return Unit.a;
            case 1:
                pzl pzlVar2 = this.b;
                ((l13) obj).getClass();
                pzl pzlVar3 = ((q8m) ((m8m) pzlVar2.b).a.a(hag.I(q8m.class))).a;
                bdt I = hag.I(fjk.class);
                qdc qdcVar = pzlVar3.a;
                qdcVar.getClass();
                return (fjk) qdcVar.C(I);
            case 2:
                pzl pzlVar4 = this.b;
                ((l13) obj).getClass();
                pzl pzlVar5 = ((q8m) ((m8m) pzlVar4.b).a.a(hag.I(q8m.class))).a;
                bdt I2 = hag.I(kik.class);
                qdc qdcVar2 = pzlVar5.a;
                qdcVar2.getClass();
                return (kik) qdcVar2.C(I2);
            case 3:
                pzl pzlVar6 = this.b;
                ((l13) obj).getClass();
                l13 l13Var = ((m8m) pzlVar6.b).a;
                return (s8m) l13Var.a.D(hag.I(s8m.class), l13Var, l13Var.b);
            default:
                pzl pzlVar7 = this.b;
                ((l13) obj).getClass();
                l13 l13Var2 = ((m8m) pzlVar7.b).a;
                return (dqi) l13Var2.a.D(hag.I(dqi.class), l13Var2, l13Var2.b);
        }
    }
}
