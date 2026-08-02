package z;

import android.view.ViewGroup;
import w.C5130e;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f41992A;

    /* renamed from: B, reason: collision with root package name */
    public int f41993B;

    /* renamed from: C, reason: collision with root package name */
    public int f41994C;

    /* renamed from: D, reason: collision with root package name */
    public int f41995D;

    /* renamed from: E, reason: collision with root package name */
    public float f41996E;

    /* renamed from: F, reason: collision with root package name */
    public float f41997F;

    /* renamed from: G, reason: collision with root package name */
    public String f41998G;

    /* renamed from: H, reason: collision with root package name */
    public float f41999H;

    /* renamed from: I, reason: collision with root package name */
    public float f42000I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f42001K;

    /* renamed from: L, reason: collision with root package name */
    public int f42002L;

    /* renamed from: M, reason: collision with root package name */
    public int f42003M;

    /* renamed from: N, reason: collision with root package name */
    public int f42004N;

    /* renamed from: O, reason: collision with root package name */
    public int f42005O;

    /* renamed from: P, reason: collision with root package name */
    public int f42006P;

    /* renamed from: Q, reason: collision with root package name */
    public int f42007Q;

    /* renamed from: R, reason: collision with root package name */
    public float f42008R;

    /* renamed from: S, reason: collision with root package name */
    public float f42009S;

    /* renamed from: T, reason: collision with root package name */
    public int f42010T;

    /* renamed from: U, reason: collision with root package name */
    public int f42011U;

    /* renamed from: V, reason: collision with root package name */
    public int f42012V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f42013W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f42014X;
    public String Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f42015Z;

    /* renamed from: a, reason: collision with root package name */
    public int f42016a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f42017a0;

    /* renamed from: b, reason: collision with root package name */
    public int f42018b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f42019b0;

    /* renamed from: c, reason: collision with root package name */
    public float f42020c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f42021c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42022d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f42023d0;

    /* renamed from: e, reason: collision with root package name */
    public int f42024e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f42025e0;

    /* renamed from: f, reason: collision with root package name */
    public int f42026f;

    /* renamed from: f0, reason: collision with root package name */
    public int f42027f0;

    /* renamed from: g, reason: collision with root package name */
    public int f42028g;

    /* renamed from: g0, reason: collision with root package name */
    public int f42029g0;

    /* renamed from: h, reason: collision with root package name */
    public int f42030h;

    /* renamed from: h0, reason: collision with root package name */
    public int f42031h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f42032i0;

    /* renamed from: j, reason: collision with root package name */
    public int f42033j;

    /* renamed from: j0, reason: collision with root package name */
    public int f42034j0;

    /* renamed from: k, reason: collision with root package name */
    public int f42035k;

    /* renamed from: k0, reason: collision with root package name */
    public int f42036k0;

    /* renamed from: l, reason: collision with root package name */
    public int f42037l;

    /* renamed from: l0, reason: collision with root package name */
    public float f42038l0;

    /* renamed from: m, reason: collision with root package name */
    public int f42039m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f42040n;

    /* renamed from: n0, reason: collision with root package name */
    public int f42041n0;

    /* renamed from: o, reason: collision with root package name */
    public int f42042o;

    /* renamed from: o0, reason: collision with root package name */
    public float f42043o0;

    /* renamed from: p, reason: collision with root package name */
    public int f42044p;

    /* renamed from: p0, reason: collision with root package name */
    public C5130e f42045p0;

    /* renamed from: q, reason: collision with root package name */
    public int f42046q;

    /* renamed from: r, reason: collision with root package name */
    public float f42047r;

    /* renamed from: s, reason: collision with root package name */
    public int f42048s;

    /* renamed from: t, reason: collision with root package name */
    public int f42049t;

    /* renamed from: u, reason: collision with root package name */
    public int f42050u;

    /* renamed from: v, reason: collision with root package name */
    public int f42051v;

    /* renamed from: w, reason: collision with root package name */
    public int f42052w;

    /* renamed from: x, reason: collision with root package name */
    public int f42053x;

    /* renamed from: y, reason: collision with root package name */
    public int f42054y;

    /* renamed from: z, reason: collision with root package name */
    public int f42055z;

    public final void a() {
        this.f42023d0 = false;
        this.f42017a0 = true;
        this.f42019b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f42013W) {
            this.f42017a0 = false;
            if (this.f42002L == 0) {
                this.f42002L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f42014X) {
            this.f42019b0 = false;
            if (this.f42003M == 0) {
                this.f42003M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f42017a0 = false;
            if (i == 0 && this.f42002L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f42013W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f42019b0 = false;
            if (i4 == 0 && this.f42003M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f42014X = true;
            }
        }
        if (this.f42020c == -1.0f && this.f42016a == -1 && this.f42018b == -1) {
            return;
        }
        this.f42023d0 = true;
        this.f42017a0 = true;
        this.f42019b0 = true;
        if (!(this.f42045p0 instanceof w.i)) {
            this.f42045p0 = new w.i();
        }
        ((w.i) this.f42045p0).S(this.f42012V);
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
        int i4;
        int i6;
        int i9;
        int i10;
        int i11 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i12 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z6 = false;
        boolean z9 = 1 == getLayoutDirection();
        this.f42031h0 = -1;
        this.f42032i0 = -1;
        this.f42027f0 = -1;
        this.f42029g0 = -1;
        this.f42034j0 = this.f42052w;
        this.f42036k0 = this.f42054y;
        float f2 = this.f41996E;
        this.f42038l0 = f2;
        int i13 = this.f42016a;
        this.m0 = i13;
        int i14 = this.f42018b;
        this.f42041n0 = i14;
        float f9 = this.f42020c;
        this.f42043o0 = f9;
        if (z9) {
            int i15 = this.f42048s;
            if (i15 != -1) {
                this.f42031h0 = i15;
            } else {
                int i16 = this.f42049t;
                if (i16 != -1) {
                    this.f42032i0 = i16;
                }
                i4 = this.f42050u;
                if (i4 != -1) {
                    this.f42029g0 = i4;
                    z6 = true;
                }
                i6 = this.f42051v;
                if (i6 != -1) {
                    this.f42027f0 = i6;
                    z6 = true;
                }
                i9 = this.f41992A;
                if (i9 != Integer.MIN_VALUE) {
                    this.f42036k0 = i9;
                }
                i10 = this.f41993B;
                if (i10 != Integer.MIN_VALUE) {
                    this.f42034j0 = i10;
                }
                if (z6) {
                    this.f42038l0 = 1.0f - f2;
                }
                if (this.f42023d0 && this.f42012V == 1 && this.f42022d) {
                    if (f9 == -1.0f) {
                        this.f42043o0 = 1.0f - f9;
                        this.m0 = -1;
                        this.f42041n0 = -1;
                    } else if (i13 != -1) {
                        this.f42041n0 = i13;
                        this.m0 = -1;
                        this.f42043o0 = -1.0f;
                    } else if (i14 != -1) {
                        this.m0 = i14;
                        this.f42041n0 = -1;
                        this.f42043o0 = -1.0f;
                    }
                }
            }
            z6 = true;
            i4 = this.f42050u;
            if (i4 != -1) {
            }
            i6 = this.f42051v;
            if (i6 != -1) {
            }
            i9 = this.f41992A;
            if (i9 != Integer.MIN_VALUE) {
            }
            i10 = this.f41993B;
            if (i10 != Integer.MIN_VALUE) {
            }
            if (z6) {
            }
            if (this.f42023d0) {
                if (f9 == -1.0f) {
                }
            }
        } else {
            int i17 = this.f42048s;
            if (i17 != -1) {
                this.f42029g0 = i17;
            }
            int i18 = this.f42049t;
            if (i18 != -1) {
                this.f42027f0 = i18;
            }
            int i19 = this.f42050u;
            if (i19 != -1) {
                this.f42031h0 = i19;
            }
            int i20 = this.f42051v;
            if (i20 != -1) {
                this.f42032i0 = i20;
            }
            int i21 = this.f41992A;
            if (i21 != Integer.MIN_VALUE) {
                this.f42034j0 = i21;
            }
            int i22 = this.f41993B;
            if (i22 != Integer.MIN_VALUE) {
                this.f42036k0 = i22;
            }
        }
        if (this.f42050u == -1 && this.f42051v == -1 && this.f42049t == -1 && this.f42048s == -1) {
            int i23 = this.f42028g;
            if (i23 != -1) {
                this.f42031h0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                }
            } else {
                int i24 = this.f42030h;
                if (i24 != -1) {
                    this.f42032i0 = i24;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                    }
                }
            }
            int i25 = this.f42024e;
            if (i25 != -1) {
                this.f42027f0 = i25;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
                return;
            }
            int i26 = this.f42026f;
            if (i26 != -1) {
                this.f42029g0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
            }
        }
    }
}
