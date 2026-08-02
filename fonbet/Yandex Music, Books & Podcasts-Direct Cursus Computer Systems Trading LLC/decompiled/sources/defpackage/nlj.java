package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class nlj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hjp b;

    public /* synthetic */ nlj(hjp hjpVar, int i) {
        this.a = i;
        this.b = hjpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(rlj.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                hjp hjpVar = this.b;
                rp7Var.E(new nlj(hjpVar, 1));
                o18Var.c = hag.I(hks.class);
                rp7Var.getClass();
                rp7Var.E(new nlj(hjpVar, 2));
                o18Var.c = hag.I(frt.class);
                rp7Var.getClass();
                rp7Var.E(new nlj(hjpVar, 3));
                o18Var.c = hag.I(mvu.class);
                rp7Var.getClass();
                rp7Var.E(new nlj(hjpVar, 4));
                o18Var.c = hag.I(t70.class);
                rp7Var.getClass();
                rp7Var.E(new nlj(hjpVar, 5));
                o18Var.c = hag.I(llj.class);
                rp7Var.getClass();
                rp7Var.E(new m2j(hjpVar));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l13 l13Var = (l13) this.b.b;
                return new rlj((e0j) l13Var.a.D(hag.I(e0j.class), l13Var, l13Var.b));
            case 2:
                ((l13) obj).getClass();
                l13 l13Var2 = (l13) this.b.b;
                return new hks((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 3:
                ((l13) obj).getClass();
                l13 l13Var3 = (l13) this.b.b;
                return (frt) l13Var3.a.D(hag.I(frt.class), l13Var3, l13Var3.b);
            case 4:
                ((l13) obj).getClass();
                l13 l13Var4 = (l13) this.b.b;
                return (mvu) l13Var4.a.D(hag.I(mvu.class), l13Var4, l13Var4.b);
            default:
                ((l13) obj).getClass();
                l13 l13Var5 = (l13) this.b.b;
                return (t70) l13Var5.a.D(hag.I(t70.class), l13Var5, l13Var5.b);
        }
    }
}
