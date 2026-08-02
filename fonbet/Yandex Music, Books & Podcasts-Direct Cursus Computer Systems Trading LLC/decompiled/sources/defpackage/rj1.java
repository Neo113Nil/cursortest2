package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rj1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj1 b;

    public /* synthetic */ rj1(sj1 sj1Var, int i) {
        this.a = i;
        this.b = sj1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                mf1 mf1Var = (mf1) obj;
                rf1 rf1Var = (rf1) obj2;
                mf1Var.getClass();
                rf1Var.getClass();
                return rzf.Q(new g73(mf1Var.a, new wn5(new a3(27, this.b, rf1Var), -699126052, true)), mf1Var.d, null, null, null, null, 62);
            case 1:
                f61 f61Var = (f61) obj;
                k61 k61Var = (k61) obj2;
                f61Var.getClass();
                k61Var.getClass();
                return rzf.Q(new g73(f61Var.a, new wn5(new a3(24, k61Var, this.b), 1241278393, true)), f61Var.d, null, null, null, null, 62);
            case 2:
                ke1 ke1Var = (ke1) obj;
                ne1 ne1Var = (ne1) obj2;
                ke1Var.getClass();
                ne1Var.getClass();
                return rzf.Q(new g73(ke1Var.a, new wn5(new a3(23, this.b, ne1Var), -1510309670, true)), ke1Var.d, null, new oi1(0, ne1Var, ne1.class, "onViewAllClick", "onViewAllClick()V", 0, 4), null, null, 58);
            default:
                f81 f81Var = (f81) obj;
                l81 l81Var = (l81) obj2;
                f81Var.getClass();
                l81Var.getClass();
                g73 g73Var = new g73(f81Var.a, new wn5(new a3(26, this.b, l81Var), 2026390341, true));
                xdr xdrVar = l81Var.a.d.c;
                xdrVar.getClass();
                return new cyd(g73Var, xdrVar);
        }
    }
}
