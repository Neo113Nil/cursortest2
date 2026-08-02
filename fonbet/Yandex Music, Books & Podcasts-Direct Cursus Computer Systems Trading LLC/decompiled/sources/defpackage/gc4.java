package defpackage;

/* loaded from: classes3.dex */
public final class gc4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un4 b;
    public final /* synthetic */ gw0 c;

    public /* synthetic */ gc4(gw0 gw0Var, un4 un4Var, int i) {
        this.a = i;
        this.c = gw0Var;
        this.b = un4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.c.f != null) {
                    this.c.f.g(this.b);
                    break;
                }
                break;
            default:
                if (this.c.g != null) {
                    this.c.g.onClientConnect(this.b);
                    break;
                }
                break;
        }
    }
}
