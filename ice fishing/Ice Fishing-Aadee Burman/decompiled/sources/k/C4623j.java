package k;

import a.AbstractC0422a;
import m.X0;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4623j extends AbstractC0422a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38540c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38541d;

    /* renamed from: e, reason: collision with root package name */
    public int f38542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38543f;

    public C4623j(C4624k c4624k) {
        this.f38540c = 0;
        this.f38543f = c4624k;
        this.f38541d = false;
        this.f38542e = 0;
    }

    @Override // a.AbstractC0422a, O.f0
    public void a() {
        switch (this.f38540c) {
            case 1:
                this.f38541d = true;
                break;
        }
    }

    @Override // a.AbstractC0422a, O.f0
    public final void b() {
        switch (this.f38540c) {
            case 0:
                if (!this.f38541d) {
                    this.f38541d = true;
                    AbstractC0422a abstractC0422a = ((C4624k) this.f38543f).f38547d;
                    if (abstractC0422a != null) {
                        abstractC0422a.b();
                        break;
                    }
                }
                break;
            default:
                ((X0) this.f38543f).f39081a.setVisibility(0);
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        switch (this.f38540c) {
            case 0:
                int i = this.f38542e + 1;
                this.f38542e = i;
                C4624k c4624k = (C4624k) this.f38543f;
                if (i == c4624k.f38544a.size()) {
                    AbstractC0422a abstractC0422a = c4624k.f38547d;
                    if (abstractC0422a != null) {
                        abstractC0422a.c();
                    }
                    this.f38542e = 0;
                    this.f38541d = false;
                    c4624k.f38548e = false;
                    break;
                }
                break;
            default:
                if (!this.f38541d) {
                    ((X0) this.f38543f).f39081a.setVisibility(this.f38542e);
                    break;
                }
                break;
        }
    }

    public C4623j(X0 x02, int i) {
        this.f38540c = 1;
        this.f38543f = x02;
        this.f38542e = i;
        this.f38541d = false;
    }
}
