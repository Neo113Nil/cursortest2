package defpackage;

/* loaded from: classes5.dex */
public final class nv7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lv7 b;

    public /* synthetic */ nv7(lv7 lv7Var, int i) {
        this.a = i;
        this.b = lv7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                break;
            case 1:
                this.b.c.X();
                break;
            case 2:
                this.b.c();
                break;
            case 3:
                this.b.c.flush();
                break;
            default:
                this.b.c.l0();
                break;
        }
    }
}
