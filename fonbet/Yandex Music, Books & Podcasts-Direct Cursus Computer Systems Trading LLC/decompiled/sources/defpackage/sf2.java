package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class sf2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ sf2(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(mm6.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new uv1(28));
                o18Var.c = hag.I(wf2.class);
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new uv1(29, e00Var));
                o18Var.c = hag.I(nf2.class);
                rp7Var.getClass();
                rp7Var.E(new tf2(0));
                o18Var.c = hag.I(boi.class);
                rp7Var.getClass();
                int i = 1;
                rp7Var.E(new sf2(e00Var, i));
                o18Var.c = hag.I(kf2.class);
                rp7Var.getClass();
                rp7Var.E(new tf2(i));
                o18Var.c = hag.I(ve2.class);
                rp7Var.getClass();
                rp7Var.E(new sf2(e00Var, 2));
                o18Var.c = hag.I(of2.class);
                rp7Var.getClass();
                rp7Var.E(new sf2(e00Var, 3));
                o18Var.c = hag.I(zf2.class);
                rp7Var.getClass();
                rp7Var.E(new sf2(e00Var, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return new boi(((gf2) this.b.b).c);
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ve2(((gf2) this.b.b).a, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
            case 3:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I = hag.I(nf2.class);
                qdc qdcVar = l13Var2.a;
                Set set = l13Var2.b;
                nf2 nf2Var = (nf2) qdcVar.D(I, l13Var2, set);
                gf2 gf2Var = (gf2) this.b.b;
                return new rf2(nf2Var, gf2Var.j, gf2Var.k, gf2Var.l, (boi) qdcVar.D(hag.I(boi.class), l13Var2, set), gf2Var.m, gf2Var.n, gf2Var.b, (kf2) qdcVar.D(hag.I(kf2.class), l13Var2, set), gf2Var.c, (ve2) qdcVar.D(hag.I(ve2.class), l13Var2, set), gf2Var.h, gf2Var.i);
            default:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                vdr vdrVar = ((gf2) this.b.b).d;
                bdt I2 = hag.I(of2.class);
                qdc qdcVar2 = l13Var3.a;
                Set set2 = l13Var3.b;
                return new zf2(vdrVar, (of2) qdcVar2.D(I2, l13Var3, set2), (mm6) qdcVar2.D(hag.I(mm6.class), l13Var3, set2));
        }
    }
}
