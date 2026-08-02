package k;

import m.Y0;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4633j extends Z2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38552e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38553f;

    /* renamed from: g, reason: collision with root package name */
    public int f38554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f38555h;

    public C4633j(C4634k c4634k) {
        this.f38552e = 0;
        this.f38555h = c4634k;
        this.f38553f = false;
        this.f38554g = 0;
    }

    @Override // Z2.d, O.f0
    public void a() {
        switch (this.f38552e) {
            case 1:
                this.f38553f = true;
                break;
        }
    }

    @Override // Z2.d, O.f0
    public final void b() {
        switch (this.f38552e) {
            case 0:
                if (!this.f38553f) {
                    this.f38553f = true;
                    Z2.d dVar = ((C4634k) this.f38555h).f38559d;
                    if (dVar != null) {
                        dVar.b();
                        break;
                    }
                }
                break;
            default:
                ((Y0) this.f38555h).f39151a.setVisibility(0);
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        switch (this.f38552e) {
            case 0:
                int i = this.f38554g + 1;
                this.f38554g = i;
                C4634k c4634k = (C4634k) this.f38555h;
                if (i == c4634k.f38556a.size()) {
                    Z2.d dVar = c4634k.f38559d;
                    if (dVar != null) {
                        dVar.c();
                    }
                    this.f38554g = 0;
                    this.f38553f = false;
                    c4634k.f38560e = false;
                    break;
                }
                break;
            default:
                if (!this.f38553f) {
                    ((Y0) this.f38555h).f39151a.setVisibility(this.f38554g);
                    break;
                }
                break;
        }
    }

    public C4633j(Y0 y02, int i) {
        this.f38552e = 1;
        this.f38555h = y02;
        this.f38554g = i;
        this.f38553f = false;
    }
}
