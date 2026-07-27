package l6;

/* renamed from: l6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4700g extends Throwable {

    /* renamed from: n, reason: collision with root package name */
    public final String f39060n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39061u;

    /* renamed from: v, reason: collision with root package name */
    public final C4694a f39062v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f39063w;

    public C4700g(C4694a c4694a) {
        super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + c4694a + " here:");
        this.f39060n = Thread.currentThread().getName();
        this.f39061u = Thread.currentThread().getId();
        this.f39062v = c4694a;
    }
}
