package defpackage;

/* loaded from: classes5.dex */
public final class z6g implements xvf0 {
    public final /* synthetic */ int a;
    public final s6k0 b;

    public /* synthetic */ z6g(s6k0 s6k0Var, int i) {
        this.a = i;
        this.b = s6k0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        s6k0 s6k0Var = this.b;
        switch (i) {
            case 0:
                return (w5l0) s6k0Var.a;
            case 1:
                return (u5l0) s6k0Var.b;
            default:
                f4l0 f4l0Var = (f4l0) s6k0Var.c;
                q5z.h(f4l0Var);
                return f4l0Var;
        }
    }
}
