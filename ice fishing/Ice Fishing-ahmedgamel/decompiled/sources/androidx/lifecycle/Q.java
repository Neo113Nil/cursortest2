package androidx.lifecycle;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C0509x f5106n;

    /* renamed from: u, reason: collision with root package name */
    public final EnumC0500n f5107u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5108v;

    public Q(C0509x registry, EnumC0500n event) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(event, "event");
        this.f5106n = registry;
        this.f5107u = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5108v) {
            return;
        }
        this.f5106n.e(this.f5107u);
        this.f5108v = true;
    }
}
