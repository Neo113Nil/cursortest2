package defpackage;

/* loaded from: classes.dex */
public final class fa0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(float f) {
        switch (this.a) {
            case 0:
                ia0 ia0Var = (ia0) this.b;
                ba0 ba0Var = (ba0) ia0Var.n;
                float j = ia0Var.j(f);
                ia0 ia0Var2 = ba0Var.a;
                ((t6k) ia0Var2.l).h(j);
                ((t6k) ia0Var2.m).h(0.0f);
                break;
            case 1:
                ka0 ka0Var = (ka0) this.b;
                da0 da0Var = ka0Var.n;
                float f2 = ka0Var.f(f);
                ka0 ka0Var2 = da0Var.a;
                ka0Var2.j.h(f2);
                ka0Var2.k.h(0.0f);
                break;
            case 2:
                ((nl7) this.b).a.invoke(Float.valueOf(f));
                break;
            default:
                ((stq) this.b).a.invoke(Float.valueOf(f));
                break;
        }
    }
}
