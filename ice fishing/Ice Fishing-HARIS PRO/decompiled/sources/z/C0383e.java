package z;

import android.view.ViewGroup;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f4784A;

    /* renamed from: B, reason: collision with root package name */
    public int f4785B;

    /* renamed from: C, reason: collision with root package name */
    public int f4786C;

    /* renamed from: D, reason: collision with root package name */
    public int f4787D;

    /* renamed from: E, reason: collision with root package name */
    public float f4788E;

    /* renamed from: F, reason: collision with root package name */
    public float f4789F;

    /* renamed from: G, reason: collision with root package name */
    public String f4790G;

    /* renamed from: H, reason: collision with root package name */
    public float f4791H;

    /* renamed from: I, reason: collision with root package name */
    public float f4792I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4793K;

    /* renamed from: L, reason: collision with root package name */
    public int f4794L;

    /* renamed from: M, reason: collision with root package name */
    public int f4795M;

    /* renamed from: N, reason: collision with root package name */
    public int f4796N;

    /* renamed from: O, reason: collision with root package name */
    public int f4797O;

    /* renamed from: P, reason: collision with root package name */
    public int f4798P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4799Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4800R;

    /* renamed from: S, reason: collision with root package name */
    public float f4801S;

    /* renamed from: T, reason: collision with root package name */
    public int f4802T;

    /* renamed from: U, reason: collision with root package name */
    public int f4803U;

    /* renamed from: V, reason: collision with root package name */
    public int f4804V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4805W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4806X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4807Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4808Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4809a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4810a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4811b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4812b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4813c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4814c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4815d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4816d0;
    public int e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4817e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4818f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4819f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4820g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4821g0;

    /* renamed from: h, reason: collision with root package name */
    public int f4822h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4823h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4824i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4825j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4826k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4827k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4828l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4829l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4830m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4831m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4832n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4833n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4834o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4835o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4836p;

    /* renamed from: p0, reason: collision with root package name */
    public w.d f4837p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4838q;

    /* renamed from: r, reason: collision with root package name */
    public float f4839r;

    /* renamed from: s, reason: collision with root package name */
    public int f4840s;

    /* renamed from: t, reason: collision with root package name */
    public int f4841t;

    /* renamed from: u, reason: collision with root package name */
    public int f4842u;

    /* renamed from: v, reason: collision with root package name */
    public int f4843v;

    /* renamed from: w, reason: collision with root package name */
    public int f4844w;

    /* renamed from: x, reason: collision with root package name */
    public int f4845x;

    /* renamed from: y, reason: collision with root package name */
    public int f4846y;

    /* renamed from: z, reason: collision with root package name */
    public int f4847z;

    public final void a() {
        this.f4816d0 = false;
        this.f4810a0 = true;
        this.f4812b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4805W) {
            this.f4810a0 = false;
            if (this.f4794L == 0) {
                this.f4794L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4806X) {
            this.f4812b0 = false;
            if (this.f4795M == 0) {
                this.f4795M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4810a0 = false;
            if (i == 0 && this.f4794L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4805W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4812b0 = false;
            if (i2 == 0 && this.f4795M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4806X = true;
            }
        }
        if (this.f4813c == -1.0f && this.f4809a == -1 && this.f4811b == -1) {
            return;
        }
        this.f4816d0 = true;
        this.f4810a0 = true;
        this.f4812b0 = true;
        if (!(this.f4837p0 instanceof w.h)) {
            this.f4837p0 = new w.h();
        }
        ((w.h) this.f4837p0).S(this.f4804V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f4823h0 = -1;
        this.f4824i0 = -1;
        this.f4819f0 = -1;
        this.f4821g0 = -1;
        this.f4825j0 = this.f4844w;
        this.f4827k0 = this.f4846y;
        float f2 = this.f4788E;
        this.f4829l0 = f2;
        int i8 = this.f4809a;
        this.f4831m0 = i8;
        int i9 = this.f4811b;
        this.f4833n0 = i9;
        float f3 = this.f4813c;
        this.f4835o0 = f3;
        if (z3) {
            int i10 = this.f4840s;
            if (i10 != -1) {
                this.f4823h0 = i10;
            } else {
                int i11 = this.f4841t;
                if (i11 != -1) {
                    this.f4824i0 = i11;
                }
                i2 = this.f4842u;
                if (i2 != -1) {
                    this.f4821g0 = i2;
                    z2 = true;
                }
                i3 = this.f4843v;
                if (i3 != -1) {
                    this.f4819f0 = i3;
                    z2 = true;
                }
                i4 = this.f4784A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4827k0 = i4;
                }
                i5 = this.f4785B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4825j0 = i5;
                }
                if (z2) {
                    this.f4829l0 = 1.0f - f2;
                }
                if (this.f4816d0 && this.f4804V == 1 && this.f4815d) {
                    if (f3 == -1.0f) {
                        this.f4835o0 = 1.0f - f3;
                        this.f4831m0 = -1;
                        this.f4833n0 = -1;
                    } else if (i8 != -1) {
                        this.f4833n0 = i8;
                        this.f4831m0 = -1;
                        this.f4835o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4831m0 = i9;
                        this.f4833n0 = -1;
                        this.f4835o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4842u;
            if (i2 != -1) {
            }
            i3 = this.f4843v;
            if (i3 != -1) {
            }
            i4 = this.f4784A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f4785B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4816d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4840s;
            if (i12 != -1) {
                this.f4821g0 = i12;
            }
            int i13 = this.f4841t;
            if (i13 != -1) {
                this.f4819f0 = i13;
            }
            int i14 = this.f4842u;
            if (i14 != -1) {
                this.f4823h0 = i14;
            }
            int i15 = this.f4843v;
            if (i15 != -1) {
                this.f4824i0 = i15;
            }
            int i16 = this.f4784A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4825j0 = i16;
            }
            int i17 = this.f4785B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4827k0 = i17;
            }
        }
        if (this.f4842u == -1 && this.f4843v == -1 && this.f4841t == -1 && this.f4840s == -1) {
            int i18 = this.f4820g;
            if (i18 != -1) {
                this.f4823h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f4822h;
                if (i19 != -1) {
                    this.f4824i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.e;
            if (i20 != -1) {
                this.f4819f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4818f;
            if (i21 != -1) {
                this.f4821g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
