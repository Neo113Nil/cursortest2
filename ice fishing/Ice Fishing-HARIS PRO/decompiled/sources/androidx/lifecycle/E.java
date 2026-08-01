package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class E implements InterfaceC0101s {
    public static final E i = new E();

    /* renamed from: a, reason: collision with root package name */
    public int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public int f1992b;
    public Handler e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1993c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1994d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0103u f1995f = new C0103u(this);

    /* renamed from: g, reason: collision with root package name */
    public final D.a f1996g = new D.a(9, this);

    /* renamed from: h, reason: collision with root package name */
    public final B.b f1997h = new B.b(19, this);

    public final void a() {
        int i2 = this.f1992b + 1;
        this.f1992b = i2;
        if (i2 == 1) {
            if (this.f1993c) {
                this.f1995f.d(EnumC0096m.ON_RESUME);
                this.f1993c = false;
            } else {
                Handler handler = this.e;
                D1.i.b(handler);
                handler.removeCallbacks(this.f1996g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return this.f1995f;
    }
}
