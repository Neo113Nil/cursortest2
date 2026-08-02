package defpackage;

/* loaded from: classes3.dex */
public final class qf3 implements pyc {
    public static final qf3 b = new qf3(0);
    public static final qf3 c = new qf3(1);
    public static final qf3 d = new qf3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ qf3(int i) {
        this.a = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.a) {
            case 0:
                sf3 sf3Var = (sf3) obj;
                ((Number) obj3).intValue();
                sf3Var.getClass();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(-257656583);
                if (sf3Var.c) {
                    oq5Var.Z(1500130144);
                    j = ((dq0) oq5Var.j(eq0.a)).a.a;
                } else {
                    oq5Var.Z(1500131201);
                    j = ((dq0) oq5Var.j(eq0.a)).a.h;
                }
                oq5Var.p(false);
                return k5r.f(oq5Var, false, j);
            case 1:
                ((Number) obj3).intValue();
                ((sf3) obj).getClass();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(-318606996);
                return k5r.f(oq5Var2, false, ((dq0) oq5Var2.j(eq0.a)).a.a);
            default:
                return null;
        }
    }
}
