package z;

import android.view.ViewGroup;
import w.C5139d;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f42021A;

    /* renamed from: B, reason: collision with root package name */
    public int f42022B;

    /* renamed from: C, reason: collision with root package name */
    public int f42023C;

    /* renamed from: D, reason: collision with root package name */
    public int f42024D;

    /* renamed from: E, reason: collision with root package name */
    public float f42025E;

    /* renamed from: F, reason: collision with root package name */
    public float f42026F;

    /* renamed from: G, reason: collision with root package name */
    public String f42027G;

    /* renamed from: H, reason: collision with root package name */
    public float f42028H;

    /* renamed from: I, reason: collision with root package name */
    public float f42029I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f42030K;

    /* renamed from: L, reason: collision with root package name */
    public int f42031L;

    /* renamed from: M, reason: collision with root package name */
    public int f42032M;

    /* renamed from: N, reason: collision with root package name */
    public int f42033N;

    /* renamed from: O, reason: collision with root package name */
    public int f42034O;

    /* renamed from: P, reason: collision with root package name */
    public int f42035P;

    /* renamed from: Q, reason: collision with root package name */
    public int f42036Q;

    /* renamed from: R, reason: collision with root package name */
    public float f42037R;

    /* renamed from: S, reason: collision with root package name */
    public float f42038S;

    /* renamed from: T, reason: collision with root package name */
    public int f42039T;

    /* renamed from: U, reason: collision with root package name */
    public int f42040U;

    /* renamed from: V, reason: collision with root package name */
    public int f42041V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f42042W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f42043X;
    public String Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f42044Z;

    /* renamed from: a, reason: collision with root package name */
    public int f42045a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f42046a0;

    /* renamed from: b, reason: collision with root package name */
    public int f42047b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f42048b0;

    /* renamed from: c, reason: collision with root package name */
    public float f42049c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f42050c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42051d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f42052d0;

    /* renamed from: e, reason: collision with root package name */
    public int f42053e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f42054e0;

    /* renamed from: f, reason: collision with root package name */
    public int f42055f;

    /* renamed from: f0, reason: collision with root package name */
    public int f42056f0;

    /* renamed from: g, reason: collision with root package name */
    public int f42057g;

    /* renamed from: g0, reason: collision with root package name */
    public int f42058g0;

    /* renamed from: h, reason: collision with root package name */
    public int f42059h;

    /* renamed from: h0, reason: collision with root package name */
    public int f42060h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f42061i0;

    /* renamed from: j, reason: collision with root package name */
    public int f42062j;

    /* renamed from: j0, reason: collision with root package name */
    public int f42063j0;

    /* renamed from: k, reason: collision with root package name */
    public int f42064k;

    /* renamed from: k0, reason: collision with root package name */
    public int f42065k0;

    /* renamed from: l, reason: collision with root package name */
    public int f42066l;

    /* renamed from: l0, reason: collision with root package name */
    public float f42067l0;

    /* renamed from: m, reason: collision with root package name */
    public int f42068m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f42069n;

    /* renamed from: n0, reason: collision with root package name */
    public int f42070n0;

    /* renamed from: o, reason: collision with root package name */
    public int f42071o;

    /* renamed from: o0, reason: collision with root package name */
    public float f42072o0;

    /* renamed from: p, reason: collision with root package name */
    public int f42073p;

    /* renamed from: p0, reason: collision with root package name */
    public C5139d f42074p0;

    /* renamed from: q, reason: collision with root package name */
    public int f42075q;

    /* renamed from: r, reason: collision with root package name */
    public float f42076r;

    /* renamed from: s, reason: collision with root package name */
    public int f42077s;

    /* renamed from: t, reason: collision with root package name */
    public int f42078t;

    /* renamed from: u, reason: collision with root package name */
    public int f42079u;

    /* renamed from: v, reason: collision with root package name */
    public int f42080v;

    /* renamed from: w, reason: collision with root package name */
    public int f42081w;

    /* renamed from: x, reason: collision with root package name */
    public int f42082x;

    /* renamed from: y, reason: collision with root package name */
    public int f42083y;

    /* renamed from: z, reason: collision with root package name */
    public int f42084z;

    public final void a() {
        this.f42052d0 = false;
        this.f42046a0 = true;
        this.f42048b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f42042W) {
            this.f42046a0 = false;
            if (this.f42031L == 0) {
                this.f42031L = 1;
            }
        }
        int i6 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i6 == -2 && this.f42043X) {
            this.f42048b0 = false;
            if (this.f42032M == 0) {
                this.f42032M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f42046a0 = false;
            if (i == 0 && this.f42031L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f42042W = true;
            }
        }
        if (i6 == 0 || i6 == -1) {
            this.f42048b0 = false;
            if (i6 == 0 && this.f42032M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f42043X = true;
            }
        }
        if (this.f42049c == -1.0f && this.f42045a == -1 && this.f42047b == -1) {
            return;
        }
        this.f42052d0 = true;
        this.f42046a0 = true;
        this.f42048b0 = true;
        if (!(this.f42074p0 instanceof w.h)) {
            this.f42074p0 = new w.h();
        }
        ((w.h) this.f42074p0).S(this.f42041V);
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
        int i6;
        int i9;
        int i10;
        int i11;
        int i12 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i13 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z3 = false;
        boolean z6 = 1 == getLayoutDirection();
        this.f42060h0 = -1;
        this.f42061i0 = -1;
        this.f42056f0 = -1;
        this.f42058g0 = -1;
        this.f42063j0 = this.f42081w;
        this.f42065k0 = this.f42083y;
        float f3 = this.f42025E;
        this.f42067l0 = f3;
        int i14 = this.f42045a;
        this.m0 = i14;
        int i15 = this.f42047b;
        this.f42070n0 = i15;
        float f9 = this.f42049c;
        this.f42072o0 = f9;
        if (z6) {
            int i16 = this.f42077s;
            if (i16 != -1) {
                this.f42060h0 = i16;
            } else {
                int i17 = this.f42078t;
                if (i17 != -1) {
                    this.f42061i0 = i17;
                }
                i6 = this.f42079u;
                if (i6 != -1) {
                    this.f42058g0 = i6;
                    z3 = true;
                }
                i9 = this.f42080v;
                if (i9 != -1) {
                    this.f42056f0 = i9;
                    z3 = true;
                }
                i10 = this.f42021A;
                if (i10 != Integer.MIN_VALUE) {
                    this.f42065k0 = i10;
                }
                i11 = this.f42022B;
                if (i11 != Integer.MIN_VALUE) {
                    this.f42063j0 = i11;
                }
                if (z3) {
                    this.f42067l0 = 1.0f - f3;
                }
                if (this.f42052d0 && this.f42041V == 1 && this.f42051d) {
                    if (f9 == -1.0f) {
                        this.f42072o0 = 1.0f - f9;
                        this.m0 = -1;
                        this.f42070n0 = -1;
                    } else if (i14 != -1) {
                        this.f42070n0 = i14;
                        this.m0 = -1;
                        this.f42072o0 = -1.0f;
                    } else if (i15 != -1) {
                        this.m0 = i15;
                        this.f42070n0 = -1;
                        this.f42072o0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i6 = this.f42079u;
            if (i6 != -1) {
            }
            i9 = this.f42080v;
            if (i9 != -1) {
            }
            i10 = this.f42021A;
            if (i10 != Integer.MIN_VALUE) {
            }
            i11 = this.f42022B;
            if (i11 != Integer.MIN_VALUE) {
            }
            if (z3) {
            }
            if (this.f42052d0) {
                if (f9 == -1.0f) {
                }
            }
        } else {
            int i18 = this.f42077s;
            if (i18 != -1) {
                this.f42058g0 = i18;
            }
            int i19 = this.f42078t;
            if (i19 != -1) {
                this.f42056f0 = i19;
            }
            int i20 = this.f42079u;
            if (i20 != -1) {
                this.f42060h0 = i20;
            }
            int i21 = this.f42080v;
            if (i21 != -1) {
                this.f42061i0 = i21;
            }
            int i22 = this.f42021A;
            if (i22 != Integer.MIN_VALUE) {
                this.f42063j0 = i22;
            }
            int i23 = this.f42022B;
            if (i23 != Integer.MIN_VALUE) {
                this.f42065k0 = i23;
            }
        }
        if (this.f42079u == -1 && this.f42080v == -1 && this.f42078t == -1 && this.f42077s == -1) {
            int i24 = this.f42057g;
            if (i24 != -1) {
                this.f42060h0 = i24;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                }
            } else {
                int i25 = this.f42059h;
                if (i25 != -1) {
                    this.f42061i0 = i25;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                    }
                }
            }
            int i26 = this.f42053e;
            if (i26 != -1) {
                this.f42056f0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
                return;
            }
            int i27 = this.f42055f;
            if (i27 != -1) {
                this.f42058g0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
            }
        }
    }
}
