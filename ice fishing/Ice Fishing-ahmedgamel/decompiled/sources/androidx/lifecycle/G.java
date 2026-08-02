package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class G implements InterfaceC0507v {

    /* renamed from: B, reason: collision with root package name */
    public static final G f5070B = new G();

    /* renamed from: n, reason: collision with root package name */
    public int f5072n;

    /* renamed from: u, reason: collision with root package name */
    public int f5073u;

    /* renamed from: x, reason: collision with root package name */
    public Handler f5076x;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5074v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5075w = true;

    /* renamed from: y, reason: collision with root package name */
    public final C0509x f5077y = new C0509x(this);

    /* renamed from: z, reason: collision with root package name */
    public final A3.p f5078z = new A3.p(14, this);

    /* renamed from: A, reason: collision with root package name */
    public final n4.c f5071A = new n4.c(19, this);

    public final void a() {
        int i = this.f5073u + 1;
        this.f5073u = i;
        if (i == 1) {
            if (this.f5074v) {
                this.f5077y.e(EnumC0500n.ON_RESUME);
                this.f5074v = false;
            } else {
                Handler handler = this.f5076x;
                kotlin.jvm.internal.h.b(handler);
                handler.removeCallbacks(this.f5078z);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        return this.f5077y;
    }
}
