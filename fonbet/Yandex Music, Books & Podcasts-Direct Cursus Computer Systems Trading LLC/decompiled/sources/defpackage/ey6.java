package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class ey6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy6 b;

    public /* synthetic */ ey6(gy6 gy6Var, int i) {
        this.a = i;
        this.b = gy6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gy6.c(this.b);
                break;
            case 1:
                gy6.b(this.b);
                break;
            default:
                gy6.a(this.b);
                break;
        }
    }
}
