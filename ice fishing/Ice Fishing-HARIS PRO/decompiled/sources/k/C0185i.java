package k;

import a.AbstractC0078a;
import m.c1;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185i extends AbstractC0078a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3359f;

    /* renamed from: g, reason: collision with root package name */
    public int f3360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3361h;

    public C0185i(j jVar) {
        this.e = 0;
        this.f3361h = jVar;
        this.f3359f = false;
        this.f3360g = 0;
    }

    @Override // O.O
    public final void a() {
        switch (this.e) {
            case 0:
                int i = this.f3360g + 1;
                this.f3360g = i;
                j jVar = (j) this.f3361h;
                if (i == jVar.f3362a.size()) {
                    AbstractC0078a abstractC0078a = jVar.f3365d;
                    if (abstractC0078a != null) {
                        abstractC0078a.a();
                    }
                    this.f3360g = 0;
                    this.f3359f = false;
                    jVar.e = false;
                    break;
                }
                break;
            default:
                if (!this.f3359f) {
                    ((c1) this.f3361h).f3923a.setVisibility(this.f3360g);
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0078a, O.O
    public void b() {
        switch (this.e) {
            case 1:
                this.f3359f = true;
                break;
        }
    }

    @Override // a.AbstractC0078a, O.O
    public final void c() {
        switch (this.e) {
            case 0:
                if (!this.f3359f) {
                    this.f3359f = true;
                    AbstractC0078a abstractC0078a = ((j) this.f3361h).f3365d;
                    if (abstractC0078a != null) {
                        abstractC0078a.c();
                        break;
                    }
                }
                break;
            default:
                ((c1) this.f3361h).f3923a.setVisibility(0);
                break;
        }
    }

    public C0185i(c1 c1Var, int i) {
        this.e = 1;
        this.f3361h = c1Var;
        this.f3360g = i;
        this.f3359f = false;
    }
}
