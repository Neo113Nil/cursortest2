package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class hp6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp6 b;
    public final /* synthetic */ hgp c;

    public /* synthetic */ hp6(kp6 kp6Var, hgp hgpVar, int i) {
        this.a = i;
        this.b = kp6Var;
        this.c = hgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
