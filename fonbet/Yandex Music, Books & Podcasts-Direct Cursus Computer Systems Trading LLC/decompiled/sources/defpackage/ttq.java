package defpackage;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class ttq implements dje {
    public final /* synthetic */ int a;
    public final pje b;
    public float c;
    public final RectF d;
    public float e;
    public float f;
    public final weo g;

    public ttq(pje pjeVar, int i) {
        weo W;
        weo W2;
        this.a = i;
        switch (i) {
            case 1:
                this.b = pjeVar;
                this.d = new RectF();
                wdp wdpVar = pjeVar.c;
                if (wdpVar instanceof nje) {
                    W = ((nje) wdpVar).l;
                } else {
                    if (!(wdpVar instanceof oje)) {
                        b6e.s();
                        throw null;
                    }
                    oje ojeVar = (oje) wdpVar;
                    mje mjeVar = ojeVar.l;
                    float f = mjeVar.i;
                    float f2 = ojeVar.m;
                    W = mje.W(mjeVar, f + f2, mjeVar.j + f2, 4);
                }
                this.g = W;
                return;
            default:
                this.b = pjeVar;
                this.d = new RectF();
                wdp wdpVar2 = pjeVar.c;
                if (wdpVar2 instanceof nje) {
                    W2 = ((nje) wdpVar2).l;
                } else {
                    if (!(wdpVar2 instanceof oje)) {
                        b6e.s();
                        throw null;
                    }
                    oje ojeVar2 = (oje) wdpVar2;
                    mje mjeVar2 = ojeVar2.l;
                    float f3 = mjeVar2.i;
                    float f4 = ojeVar2.m;
                    W2 = mje.W(mjeVar2, f3 + f4, mjeVar2.j + f4, 4);
                }
                this.g = W2;
                return;
        }
    }

    @Override // defpackage.dje
    public final weo c(int i) {
        switch (this.a) {
        }
        return this.g;
    }

    @Override // defpackage.dje
    public final int d(int i) {
        switch (this.a) {
            case 0:
                wdp wdpVar = this.b.c;
                if (wdpVar instanceof oje) {
                    return ((oje) wdpVar).n;
                }
                return 0;
            default:
                wdp wdpVar2 = this.b.c;
                if (wdpVar2 instanceof oje) {
                    return ((oje) wdpVar2).n;
                }
                return 0;
        }
    }

    @Override // defpackage.dje
    public final void f(int i, float f) {
        switch (this.a) {
            case 0:
                this.c = f;
                break;
            default:
                this.c = f;
                break;
        }
    }

    @Override // defpackage.dje
    public final void g(float f) {
        switch (this.a) {
            case 0:
                this.e = f;
                break;
            default:
                this.e = f;
                break;
        }
    }

    @Override // defpackage.dje
    public final RectF i(float f, float f2, float f3, boolean z) {
        switch (this.a) {
            case 0:
                wdp wdpVar = this.b.b;
                float f4 = this.f;
                if (f4 == 0.0f) {
                    f4 = wdpVar.j0().A();
                }
                float f5 = this.e;
                RectF rectF = this.d;
                if (z) {
                    float f6 = this.c * f5;
                    if (f6 <= f5) {
                        f5 = f6;
                    }
                    float f7 = f4 / 2.0f;
                    rectF.left = (f - f5) - f7;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    rectF.right = (f - f6) + f7;
                } else {
                    float f8 = this.c * f5;
                    float f9 = f4 / 2.0f;
                    rectF.left = ((f8 < 0.0f ? 0.0f : f8) + f) - f9;
                    if (f8 <= f5) {
                        f5 = f8;
                    }
                    rectF.right = f + f5 + f9;
                }
                rectF.top = f2 - (wdpVar.j0().w() / 2.0f);
                rectF.bottom = (wdpVar.j0().w() / 2.0f) + f2;
                float f10 = rectF.left;
                if (f10 < 0.0f) {
                    rectF.offset(-f10, 0.0f);
                }
                float f11 = rectF.right;
                if (f11 > f3) {
                    rectF.offset(-(f11 - f3), 0.0f);
                }
                return rectF;
            default:
                wdp wdpVar2 = this.b.b;
                float f12 = this.f;
                if (f12 == 0.0f) {
                    f12 = wdpVar2.j0().A();
                }
                float w = f2 - (wdpVar2.j0().w() / 2.0f);
                RectF rectF2 = this.d;
                rectF2.top = w;
                float f13 = this.e;
                if (z) {
                    float f14 = this.c;
                    float f15 = (f14 - 0.5f) * f13 * 2.0f;
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    float f16 = f12 / 2.0f;
                    rectF2.right = (f - f15) + f16;
                    float f17 = f14 * f13 * 2.0f;
                    if (f17 <= f13) {
                        f13 = f17;
                    }
                    rectF2.left = (f - f13) - f16;
                } else {
                    float f18 = this.c;
                    float f19 = f13 * f18 * 2.0f;
                    if (f19 > f13) {
                        f19 = f13;
                    }
                    float f20 = f12 / 2.0f;
                    rectF2.right = f19 + f + f20;
                    float f21 = (f18 - 0.5f) * f13 * 2.0f;
                    if (f21 < 0.0f) {
                        f21 = 0.0f;
                    }
                    rectF2.left = (f + f21) - f20;
                }
                rectF2.bottom = (wdpVar2.j0().w() / 2.0f) + f2;
                float f22 = rectF2.left;
                if (f22 < 0.0f) {
                    rectF2.offset(-f22, 0.0f);
                }
                float f23 = rectF2.right;
                if (f23 > f3) {
                    rectF2.offset(-(f23 - f3), 0.0f);
                }
                return rectF2;
        }
    }

    @Override // defpackage.dje
    public final void j(float f) {
        switch (this.a) {
            case 0:
                this.f = f;
                break;
            default:
                this.f = f;
                break;
        }
    }

    @Override // defpackage.dje
    public final int k(int i) {
        switch (this.a) {
        }
        return this.b.c.h0();
    }

    @Override // defpackage.dje
    public final float n(int i) {
        switch (this.a) {
            case 0:
                wdp wdpVar = this.b.c;
                if (wdpVar instanceof oje) {
                    return ((oje) wdpVar).m;
                }
                return 0.0f;
            default:
                wdp wdpVar2 = this.b.c;
                if (wdpVar2 instanceof oje) {
                    return ((oje) wdpVar2).m;
                }
                return 0.0f;
        }
    }
}
