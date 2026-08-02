package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class txf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vxf0 b;

    public /* synthetic */ txf0(vxf0 vxf0Var, int i) {
        this.a = i;
        this.b = vxf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vxf0 vxf0Var = this.b;
        switch (i) {
            case 0:
                vxf0Var.attach();
                break;
            default:
                vxf0Var.detach();
                break;
        }
    }
}
