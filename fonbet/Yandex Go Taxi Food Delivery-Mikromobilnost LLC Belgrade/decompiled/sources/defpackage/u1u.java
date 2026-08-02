package defpackage;

/* loaded from: classes5.dex */
public final class u1u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zcu0 b;

    public /* synthetic */ u1u(zcu0 zcu0Var, int i) {
        this.a = i;
        this.b = zcu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
