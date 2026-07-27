package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final o f1528m = new o();

    /* renamed from: e, reason: collision with root package name */
    public int f1529e;

    /* renamed from: f, reason: collision with root package name */
    public int f1530f;

    /* renamed from: i, reason: collision with root package name */
    public Handler f1533i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1531g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1532h = true;

    /* renamed from: j, reason: collision with root package name */
    public final j f1534j = new j(this);

    /* renamed from: k, reason: collision with root package name */
    public final k f1535k = new k(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final A.j f1536l = new A.j(13, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f1534j;
    }

    public final void b() {
        int i2 = this.f1530f + 1;
        this.f1530f = i2;
        if (i2 == 1) {
            if (this.f1531g) {
                this.f1534j.a(d.ON_RESUME);
                this.f1531g = false;
            } else {
                Handler handler = this.f1533i;
                E0.i.b(handler);
                handler.removeCallbacks(this.f1535k);
            }
        }
    }
}
