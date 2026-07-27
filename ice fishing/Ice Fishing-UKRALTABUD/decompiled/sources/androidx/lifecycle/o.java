package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: n, reason: collision with root package name */
    public static final o f1520n = new o();

    /* renamed from: f, reason: collision with root package name */
    public int f1521f;

    /* renamed from: g, reason: collision with root package name */
    public int f1522g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f1525j;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1523h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1524i = true;

    /* renamed from: k, reason: collision with root package name */
    public final j f1526k = new j(this);

    /* renamed from: l, reason: collision with root package name */
    public final k f1527l = new k(0, this);

    /* renamed from: m, reason: collision with root package name */
    public final A.j f1528m = new A.j(13, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f1526k;
    }

    public final void b() {
        int i2 = this.f1522g + 1;
        this.f1522g = i2;
        if (i2 == 1) {
            if (this.f1523h) {
                this.f1526k.a(d.ON_RESUME);
                this.f1523h = false;
            } else {
                Handler handler = this.f1525j;
                E0.i.b(handler);
                handler.removeCallbacks(this.f1527l);
            }
        }
    }
}
