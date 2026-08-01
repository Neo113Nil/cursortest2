package androidx.lifecycle;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C0505x f5139n;

    /* renamed from: u, reason: collision with root package name */
    public final EnumC0496n f5140u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5141v;

    public Q(C0505x registry, EnumC0496n event) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(event, "event");
        this.f5139n = registry;
        this.f5140u = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5141v) {
            return;
        }
        this.f5139n.e(this.f5140u);
        this.f5141v = true;
    }
}
