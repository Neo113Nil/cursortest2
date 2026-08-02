package defpackage;

/* loaded from: classes14.dex */
public final class z10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final f380 c;

    public /* synthetic */ z10(xvf0 xvf0Var, f380 f380Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = f380Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        f380 f380Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new y10((a480) xvf0Var.get(), (q480) f380Var.get());
            default:
                return new s480((a480) xvf0Var.get(), (q480) f380Var.get());
        }
    }
}
