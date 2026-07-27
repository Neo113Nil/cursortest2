package h;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0 f2258g;

    public /* synthetic */ r0(s0 s0Var, int i2) {
        this.f2257f = i2;
        this.f2258g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2257f) {
            case 0:
                this.f2258g.c(false);
                break;
            default:
                this.f2258g.a();
                break;
        }
    }
}
