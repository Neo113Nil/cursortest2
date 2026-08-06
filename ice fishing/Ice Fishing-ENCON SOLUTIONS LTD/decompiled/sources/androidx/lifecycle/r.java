package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final r f2488i = new r();

    /* renamed from: a, reason: collision with root package name */
    public int f2489a;

    /* renamed from: b, reason: collision with root package name */
    public int f2490b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2493e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2491c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2492d = true;

    /* renamed from: f, reason: collision with root package name */
    public final l f2494f = new l(this);

    /* renamed from: g, reason: collision with root package name */
    public final F0.a f2495g = new F0.a(4, this);

    /* renamed from: h, reason: collision with root package name */
    public final Z0.i f2496h = new Z0.i(12, this);

    @Override // androidx.lifecycle.j
    public final l b() {
        return this.f2494f;
    }

    public final void c() {
        int i2 = this.f2490b + 1;
        this.f2490b = i2;
        if (i2 == 1) {
            if (this.f2491c) {
                this.f2494f.d(d.ON_RESUME);
                this.f2491c = false;
            } else {
                Handler handler = this.f2493e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f2495g);
            }
        }
    }
}
