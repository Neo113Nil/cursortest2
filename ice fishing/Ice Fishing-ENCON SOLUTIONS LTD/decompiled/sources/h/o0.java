package h;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f3314b;

    public /* synthetic */ o0(p0 p0Var, int i2) {
        this.f3313a = i2;
        this.f3314b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3313a) {
            case 0:
                this.f3314b.c(false);
                break;
            default:
                this.f3314b.a();
                break;
        }
    }
}
