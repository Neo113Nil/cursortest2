package p6;

/* renamed from: p6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4846g extends Throwable {

    /* renamed from: n, reason: collision with root package name */
    public final String f39827n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39828u;

    /* renamed from: v, reason: collision with root package name */
    public final C4840a f39829v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f39830w;

    public C4846g(C4840a c4840a) {
        super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + c4840a + " here:");
        this.f39827n = Thread.currentThread().getName();
        this.f39828u = Thread.currentThread().getId();
        this.f39829v = c4840a;
    }
}
