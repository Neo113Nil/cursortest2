package o0;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8273b;

    public k(l lVar, int i2) {
        this.f8273b = lVar;
        this.f8272a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8273b.i(this.f8272a);
    }
}
