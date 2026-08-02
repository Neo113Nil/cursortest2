package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class ip6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ ip6(kp6 kp6Var, long j, String str, int i) {
        this.a = i;
        this.b = kp6Var;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kp6 kp6Var = this.b;
                ((vq6) kp6Var.o.b).d(new ip6(kp6Var, this.c, this.d, 1));
                break;
            default:
                gp6 gp6Var = this.b.g;
                uq6 uq6Var = gp6Var.n;
                if (uq6Var == null || !uq6Var.e.get()) {
                    ((eac) gp6Var.i.c).k(this.c, this.d);
                    break;
                }
                break;
        }
    }
}
