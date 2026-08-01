package androidx.recyclerview.widget;

import B0.j;
import F.i;
import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import k0.C0201o;
import k0.C0204s;
import k0.C0209x;
import k0.J;
import k0.K;
import k0.L;
import k0.Q;
import k0.W;
import k0.X;
import k0.f0;
import k0.g0;
import k0.h0;
import k0.i0;
import k0.j0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends K implements W {

    /* renamed from: B, reason: collision with root package name */
    public final i f2187B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2188C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2189D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2190E;

    /* renamed from: F, reason: collision with root package name */
    public i0 f2191F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f2192G;

    /* renamed from: H, reason: collision with root package name */
    public final f0 f2193H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f2194I;
    public int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final j f2195K;

    /* renamed from: p, reason: collision with root package name */
    public final int f2196p;

    /* renamed from: q, reason: collision with root package name */
    public final j0[] f2197q;

    /* renamed from: r, reason: collision with root package name */
    public final g f2198r;

    /* renamed from: s, reason: collision with root package name */
    public final g f2199s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2200t;

    /* renamed from: u, reason: collision with root package name */
    public int f2201u;

    /* renamed from: v, reason: collision with root package name */
    public final C0204s f2202v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2203w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2205y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2204x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2206z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f2186A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2196p = -1;
        this.f2203w = false;
        i iVar = new i(11, false);
        this.f2187B = iVar;
        this.f2188C = 2;
        this.f2192G = new Rect();
        this.f2193H = new f0(this);
        this.f2194I = true;
        this.f2195K = new j(11, this);
        J I2 = K.I(context, attributeSet, i, i2);
        int i3 = I2.f3380a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f2200t) {
            this.f2200t = i3;
            g gVar = this.f2198r;
            this.f2198r = this.f2199s;
            this.f2199s = gVar;
            p0();
        }
        int i4 = I2.f3381b;
        c(null);
        if (i4 != this.f2196p) {
            iVar.d();
            p0();
            this.f2196p = i4;
            this.f2205y = new BitSet(this.f2196p);
            this.f2197q = new j0[this.f2196p];
            for (int i5 = 0; i5 < this.f2196p; i5++) {
                this.f2197q[i5] = new j0(this, i5);
            }
            p0();
        }
        boolean z2 = I2.f3382c;
        c(null);
        i0 i0Var = this.f2191F;
        if (i0Var != null && i0Var.f3513h != z2) {
            i0Var.f3513h = z2;
        }
        this.f2203w = z2;
        p0();
        C0204s c0204s = new C0204s();
        c0204s.f3587a = true;
        c0204s.f3591f = 0;
        c0204s.f3592g = 0;
        this.f2202v = c0204s;
        this.f2198r = g.a(this, this.f2200t);
        this.f2199s = g.a(this, 1 - this.f2200t);
    }

    public static int h1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // k0.K
    public final void B0(RecyclerView recyclerView, int i) {
        C0209x c0209x = new C0209x(recyclerView.getContext());
        c0209x.f3614a = i;
        C0(c0209x);
    }

    @Override // k0.K
    public final boolean D0() {
        return this.f2191F == null;
    }

    public final int E0(int i) {
        if (v() == 0) {
            return this.f2204x ? 1 : -1;
        }
        return (i < O0()) != this.f2204x ? -1 : 1;
    }

    public final boolean F0() {
        int O02;
        if (v() != 0 && this.f2188C != 0 && this.f3389g) {
            if (this.f2204x) {
                O02 = P0();
                O0();
            } else {
                O02 = O0();
                P0();
            }
            i iVar = this.f2187B;
            if (O02 == 0 && T0() != null) {
                iVar.d();
                this.f3388f = true;
                p0();
                return true;
            }
        }
        return false;
    }

    public final int G0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2198r;
        boolean z2 = !this.f2194I;
        return f.g(x2, gVar, L0(z2), K0(z2), this, this.f2194I);
    }

    public final int H0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2198r;
        boolean z2 = !this.f2194I;
        return f.h(x2, gVar, L0(z2), K0(z2), this, this.f2194I, this.f2204x);
    }

    public final int I0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2198r;
        boolean z2 = !this.f2194I;
        return f.i(x2, gVar, L0(z2), K0(z2), this, this.f2194I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int J0(Q q2, C0204s c0204s, X x2) {
        j0 j0Var;
        ?? r6;
        int i;
        int i2;
        int c2;
        int k2;
        int c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f2205y.set(0, this.f2196p, true);
        C0204s c0204s2 = this.f2202v;
        int i9 = c0204s2.i ? c0204s.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0204s.e == 1 ? c0204s.f3592g + c0204s.f3588b : c0204s.f3591f - c0204s.f3588b;
        int i10 = c0204s.e;
        for (int i11 = 0; i11 < this.f2196p; i11++) {
            if (!((ArrayList) this.f2197q[i11].f3522f).isEmpty()) {
                g1(this.f2197q[i11], i10, i9);
            }
        }
        int g2 = this.f2204x ? this.f2198r.g() : this.f2198r.k();
        boolean z2 = false;
        while (true) {
            int i12 = c0204s.f3589c;
            if (((i12 < 0 || i12 >= x2.b()) ? i7 : i8) == 0 || (!c0204s2.i && this.f2205y.isEmpty())) {
                break;
            }
            View view = q2.k(c0204s.f3589c, Long.MAX_VALUE).f3449a;
            c0204s.f3589c += c0204s.f3590d;
            g0 g0Var = (g0) view.getLayoutParams();
            int c4 = g0Var.f3396a.c();
            i iVar = this.f2187B;
            int[] iArr = (int[]) iVar.f208b;
            int i13 = (iArr == null || c4 >= iArr.length) ? -1 : iArr[c4];
            if (i13 == -1) {
                if (X0(c0204s.e)) {
                    i6 = this.f2196p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.f2196p;
                    i6 = i7;
                }
                j0 j0Var2 = null;
                if (c0204s.e == i8) {
                    int k3 = this.f2198r.k();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        j0 j0Var3 = this.f2197q[i6];
                        int g3 = j0Var3.g(k3);
                        if (g3 < i14) {
                            i14 = g3;
                            j0Var2 = j0Var3;
                        }
                        i6 += i4;
                    }
                } else {
                    int g4 = this.f2198r.g();
                    int i15 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        j0 j0Var4 = this.f2197q[i6];
                        int i16 = j0Var4.i(g4);
                        if (i16 > i15) {
                            j0Var2 = j0Var4;
                            i15 = i16;
                        }
                        i6 += i4;
                    }
                }
                j0Var = j0Var2;
                iVar.t(c4);
                ((int[]) iVar.f208b)[c4] = j0Var.e;
            } else {
                j0Var = this.f2197q[i13];
            }
            g0Var.e = j0Var;
            if (c0204s.e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f2200t == 1) {
                i = 1;
                V0(view, K.w(r6, this.f2201u, this.f3392l, r6, ((ViewGroup.MarginLayoutParams) g0Var).width), K.w(true, this.f3395o, this.f3393m, D() + G(), ((ViewGroup.MarginLayoutParams) g0Var).height));
            } else {
                i = 1;
                V0(view, K.w(true, this.f3394n, this.f3392l, F() + E(), ((ViewGroup.MarginLayoutParams) g0Var).width), K.w(false, this.f2201u, this.f3393m, 0, ((ViewGroup.MarginLayoutParams) g0Var).height));
            }
            if (c0204s.e == i) {
                c2 = j0Var.g(g2);
                i2 = this.f2198r.c(view) + c2;
            } else {
                i2 = j0Var.i(g2);
                c2 = i2 - this.f2198r.c(view);
            }
            if (c0204s.e == 1) {
                j0 j0Var5 = g0Var.e;
                j0Var5.getClass();
                g0 g0Var2 = (g0) view.getLayoutParams();
                g0Var2.e = j0Var5;
                ArrayList arrayList = (ArrayList) j0Var5.f3522f;
                arrayList.add(view);
                j0Var5.f3520c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    j0Var5.f3519b = Integer.MIN_VALUE;
                }
                if (g0Var2.f3396a.j() || g0Var2.f3396a.m()) {
                    j0Var5.f3521d = ((StaggeredGridLayoutManager) j0Var5.f3523g).f2198r.c(view) + j0Var5.f3521d;
                }
            } else {
                j0 j0Var6 = g0Var.e;
                j0Var6.getClass();
                g0 g0Var3 = (g0) view.getLayoutParams();
                g0Var3.e = j0Var6;
                ArrayList arrayList2 = (ArrayList) j0Var6.f3522f;
                arrayList2.add(0, view);
                j0Var6.f3519b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    j0Var6.f3520c = Integer.MIN_VALUE;
                }
                if (g0Var3.f3396a.j() || g0Var3.f3396a.m()) {
                    j0Var6.f3521d = ((StaggeredGridLayoutManager) j0Var6.f3523g).f2198r.c(view) + j0Var6.f3521d;
                }
            }
            if (U0() && this.f2200t == 1) {
                c3 = this.f2199s.g() - (((this.f2196p - 1) - j0Var.e) * this.f2201u);
                k2 = c3 - this.f2199s.c(view);
            } else {
                k2 = this.f2199s.k() + (j0Var.e * this.f2201u);
                c3 = this.f2199s.c(view) + k2;
            }
            if (this.f2200t == 1) {
                K.N(view, k2, c2, c3, i2);
            } else {
                K.N(view, c2, k2, i2, c3);
            }
            g1(j0Var, c0204s2.e, i9);
            Z0(q2, c0204s2);
            if (c0204s2.f3593h && view.hasFocusable()) {
                i3 = 0;
                this.f2205y.set(j0Var.e, false);
            } else {
                i3 = 0;
            }
            i7 = i3;
            i8 = 1;
            z2 = true;
        }
        int i17 = i7;
        if (!z2) {
            Z0(q2, c0204s2);
        }
        int k4 = c0204s2.e == -1 ? this.f2198r.k() - R0(this.f2198r.k()) : Q0(this.f2198r.g()) - this.f2198r.g();
        return k4 > 0 ? Math.min(c0204s.f3588b, k4) : i17;
    }

    public final View K0(boolean z2) {
        int k2 = this.f2198r.k();
        int g2 = this.f2198r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e = this.f2198r.e(u2);
            int b2 = this.f2198r.b(u2);
            if (b2 > k2 && e < g2) {
                if (b2 <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    @Override // k0.K
    public final boolean L() {
        return this.f2188C != 0;
    }

    public final View L0(boolean z2) {
        int k2 = this.f2198r.k();
        int g2 = this.f2198r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e = this.f2198r.e(u2);
            if (this.f2198r.b(u2) > k2 && e < g2) {
                if (e >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void M0(Q q2, X x2, boolean z2) {
        int g2;
        int Q02 = Q0(Integer.MIN_VALUE);
        if (Q02 != Integer.MIN_VALUE && (g2 = this.f2198r.g() - Q02) > 0) {
            int i = g2 - (-d1(-g2, q2, x2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f2198r.p(i);
        }
    }

    public final void N0(Q q2, X x2, boolean z2) {
        int k2;
        int R02 = R0(Integer.MAX_VALUE);
        if (R02 != Integer.MAX_VALUE && (k2 = R02 - this.f2198r.k()) > 0) {
            int d1 = k2 - d1(k2, q2, x2);
            if (!z2 || d1 <= 0) {
                return;
            }
            this.f2198r.p(-d1);
        }
    }

    public final int O0() {
        if (v() == 0) {
            return 0;
        }
        return K.H(u(0));
    }

    @Override // k0.K
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f2196p; i2++) {
            j0 j0Var = this.f2197q[i2];
            int i3 = j0Var.f3519b;
            if (i3 != Integer.MIN_VALUE) {
                j0Var.f3519b = i3 + i;
            }
            int i4 = j0Var.f3520c;
            if (i4 != Integer.MIN_VALUE) {
                j0Var.f3520c = i4 + i;
            }
        }
    }

    public final int P0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return K.H(u(v2 - 1));
    }

    @Override // k0.K
    public final void Q(int i) {
        super.Q(i);
        for (int i2 = 0; i2 < this.f2196p; i2++) {
            j0 j0Var = this.f2197q[i2];
            int i3 = j0Var.f3519b;
            if (i3 != Integer.MIN_VALUE) {
                j0Var.f3519b = i3 + i;
            }
            int i4 = j0Var.f3520c;
            if (i4 != Integer.MIN_VALUE) {
                j0Var.f3520c = i4 + i;
            }
        }
    }

    public final int Q0(int i) {
        int g2 = this.f2197q[0].g(i);
        for (int i2 = 1; i2 < this.f2196p; i2++) {
            int g3 = this.f2197q[i2].g(i);
            if (g3 > g2) {
                g2 = g3;
            }
        }
        return g2;
    }

    @Override // k0.K
    public final void R() {
        this.f2187B.d();
        for (int i = 0; i < this.f2196p; i++) {
            this.f2197q[i].b();
        }
    }

    public final int R0(int i) {
        int i2 = this.f2197q[0].i(i);
        for (int i3 = 1; i3 < this.f2196p; i3++) {
            int i4 = this.f2197q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(int i, int i2, int i3) {
        int i4;
        int i5;
        i iVar;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int P02 = this.f2204x ? P0() : O0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                iVar = this.f2187B;
                iArr = (int[]) iVar.f208b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) iVar.f209c;
                    if (arrayList != null) {
                        h0 h0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                h0 h0Var2 = (h0) ((ArrayList) iVar.f209c).get(size);
                                if (h0Var2.f3498a == i5) {
                                    h0Var = h0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (h0Var != null) {
                            ((ArrayList) iVar.f209c).remove(h0Var);
                        }
                        int size2 = ((ArrayList) iVar.f209c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((h0) ((ArrayList) iVar.f209c).get(i7)).f3498a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            h0 h0Var3 = (h0) ((ArrayList) iVar.f209c).get(i7);
                            ((ArrayList) iVar.f209c).remove(i7);
                            i6 = h0Var3.f3498a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) iVar.f208b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) iVar.f208b).length;
                            } else {
                                Arrays.fill((int[]) iVar.f208b, i5, Math.min(i6 + 1, ((int[]) iVar.f208b).length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    iVar.z(i, i2);
                } else if (i3 == 2) {
                    iVar.A(i, i2);
                } else if (i3 == 8) {
                    iVar.A(i, 1);
                    iVar.z(i2, 1);
                }
                if (i4 > P02) {
                    return;
                }
                if (i5 <= (this.f2204x ? O0() : P0())) {
                    p0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        iVar = this.f2187B;
        iArr = (int[]) iVar.f208b;
        if (iArr != null) {
            arrayList = (ArrayList) iVar.f209c;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > P02) {
        }
    }

    @Override // k0.K
    public final void T(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3385b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2195K);
        }
        for (int i = 0; i < this.f2196p; i++) {
            this.f2197q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T0() {
        int v2 = v();
        int i = v2 - 1;
        BitSet bitSet = new BitSet(this.f2196p);
        bitSet.set(0, this.f2196p, true);
        char c2 = (this.f2200t == 1 && U0()) ? (char) 1 : (char) 65535;
        if (this.f2204x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            g0 g0Var = (g0) u2.getLayoutParams();
            if (bitSet.get(g0Var.e.e)) {
                j0 j0Var = g0Var.e;
                if (this.f2204x) {
                    int i3 = j0Var.f3520c;
                    if (i3 == Integer.MIN_VALUE) {
                        j0Var.a();
                        i3 = j0Var.f3520c;
                    }
                    if (i3 < this.f2198r.g()) {
                        ArrayList arrayList = (ArrayList) j0Var.f3522f;
                        ((g0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(g0Var.e.e);
                } else {
                    int i4 = j0Var.f3519b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) j0Var.f3522f).get(0);
                        g0 g0Var2 = (g0) view.getLayoutParams();
                        j0Var.f3519b = ((StaggeredGridLayoutManager) j0Var.f3523g).f2198r.e(view);
                        g0Var2.getClass();
                        i4 = j0Var.f3519b;
                    }
                    if (i4 > this.f2198r.k()) {
                        ((g0) ((View) ((ArrayList) j0Var.f3522f).get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(g0Var.e.e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f2204x) {
                    int b2 = this.f2198r.b(u2);
                    int b3 = this.f2198r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((g0Var.e.e - ((g0) u3.getLayoutParams()).e.e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = this.f2198r.e(u2);
                    int e2 = this.f2198r.e(u3);
                    if (e > e2) {
                        return u2;
                    }
                    if (e == e2) {
                        if ((g0Var.e.e - ((g0) u3.getLayoutParams()).e.e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f2200t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f2200t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (U0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (U0() == false) goto L46;
     */
    @Override // k0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U(View view, int i, Q q2, X x2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f3384a.f3471c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        c1();
        if (i == 1) {
            if (this.f2200t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f2200t != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        g0 g0Var = (g0) D2.getLayoutParams();
        g0Var.getClass();
        j0 j0Var = g0Var.e;
        int P02 = i2 == 1 ? P0() : O0();
        f1(P02, x2);
        e1(i2);
        C0204s c0204s = this.f2202v;
        c0204s.f3589c = c0204s.f3590d + P02;
        c0204s.f3588b = (int) (this.f2198r.l() * 0.33333334f);
        c0204s.f3593h = true;
        c0204s.f3587a = false;
        J0(q2, c0204s, x2);
        this.f2189D = this.f2204x;
        View h2 = j0Var.h(P02, i2);
        if (h2 != null && h2 != D2) {
            return h2;
        }
        if (X0(i2)) {
            for (int i3 = this.f2196p - 1; i3 >= 0; i3--) {
                View h3 = this.f2197q[i3].h(P02, i2);
                if (h3 != null && h3 != D2) {
                    return h3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2196p; i4++) {
                View h4 = this.f2197q[i4].h(P02, i2);
                if (h4 != null && h4 != D2) {
                    return h4;
                }
            }
        }
        boolean z2 = (this.f2203w ^ true) == (i2 == -1);
        View q3 = q(z2 ? j0Var.c() : j0Var.d());
        if (q3 != null && q3 != D2) {
            return q3;
        }
        if (X0(i2)) {
            for (int i5 = this.f2196p - 1; i5 >= 0; i5--) {
                if (i5 != j0Var.e) {
                    View q4 = q(z2 ? this.f2197q[i5].c() : this.f2197q[i5].d());
                    if (q4 != null && q4 != D2) {
                        return q4;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2196p; i6++) {
                View q5 = q(z2 ? this.f2197q[i6].c() : this.f2197q[i6].d());
                if (q5 != null && q5 != D2) {
                    return q5;
                }
            }
        }
        return null;
    }

    public final boolean U0() {
        return C() == 1;
    }

    @Override // k0.K
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            View L02 = L0(false);
            View K02 = K0(false);
            if (L02 == null || K02 == null) {
                return;
            }
            int H2 = K.H(L02);
            int H3 = K.H(K02);
            if (H2 < H3) {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H3);
            } else {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final void V0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3385b;
        Rect rect = this.f2192G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        g0 g0Var = (g0) view.getLayoutParams();
        int h12 = h1(i, ((ViewGroup.MarginLayoutParams) g0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) g0Var).rightMargin + rect.right);
        int h13 = h1(i2, ((ViewGroup.MarginLayoutParams) g0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin + rect.bottom);
        if (y0(view, h12, h13, g0Var)) {
            view.measure(h12, h13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0404, code lost:
    
        if (F0() != false) goto L247;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(Q q2, X x2, boolean z2) {
        i0 i0Var;
        int i;
        int i2;
        i0 i0Var2 = this.f2191F;
        f0 f0Var = this.f2193H;
        if (!(i0Var2 == null && this.f2206z == -1) && x2.b() == 0) {
            k0(q2);
            f0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (f0Var.e && this.f2206z == -1 && this.f2191F == null) ? false : true;
        i iVar = this.f2187B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = f0Var.f3488g;
        if (z4) {
            f0Var.a();
            i0 i0Var3 = this.f2191F;
            if (i0Var3 != null) {
                int i3 = i0Var3.f3509c;
                if (i3 > 0) {
                    if (i3 == this.f2196p) {
                        for (int i4 = 0; i4 < this.f2196p; i4++) {
                            this.f2197q[i4].b();
                            i0 i0Var4 = this.f2191F;
                            int i5 = i0Var4.f3510d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += i0Var4.i ? this.f2198r.g() : this.f2198r.k();
                            }
                            j0 j0Var = this.f2197q[i4];
                            j0Var.f3519b = i5;
                            j0Var.f3520c = i5;
                        }
                    } else {
                        i0Var3.f3510d = null;
                        i0Var3.f3509c = 0;
                        i0Var3.e = 0;
                        i0Var3.f3511f = null;
                        i0Var3.f3512g = null;
                        i0Var3.f3507a = i0Var3.f3508b;
                    }
                }
                i0 i0Var5 = this.f2191F;
                this.f2190E = i0Var5.j;
                boolean z5 = i0Var5.f3513h;
                c(null);
                i0 i0Var6 = this.f2191F;
                if (i0Var6 != null && i0Var6.f3513h != z5) {
                    i0Var6.f3513h = z5;
                }
                this.f2203w = z5;
                p0();
                c1();
                i0 i0Var7 = this.f2191F;
                int i6 = i0Var7.f3507a;
                if (i6 != -1) {
                    this.f2206z = i6;
                    f0Var.f3485c = i0Var7.i;
                } else {
                    f0Var.f3485c = this.f2204x;
                }
                if (i0Var7.e > 1) {
                    iVar.f208b = i0Var7.f3511f;
                    iVar.f209c = i0Var7.f3512g;
                }
            } else {
                c1();
                f0Var.f3485c = this.f2204x;
            }
            if (!x2.f3427g && (i2 = this.f2206z) != -1) {
                if (i2 < 0 || i2 >= x2.b()) {
                    this.f2206z = -1;
                    this.f2186A = Integer.MIN_VALUE;
                } else {
                    i0 i0Var8 = this.f2191F;
                    if (i0Var8 == null || i0Var8.f3507a == -1 || i0Var8.f3509c < 1) {
                        View q3 = q(this.f2206z);
                        if (q3 != null) {
                            f0Var.f3483a = this.f2204x ? P0() : O0();
                            if (this.f2186A != Integer.MIN_VALUE) {
                                if (f0Var.f3485c) {
                                    f0Var.f3484b = (this.f2198r.g() - this.f2186A) - this.f2198r.b(q3);
                                } else {
                                    f0Var.f3484b = (this.f2198r.k() + this.f2186A) - this.f2198r.e(q3);
                                }
                            } else if (this.f2198r.c(q3) > this.f2198r.l()) {
                                f0Var.f3484b = f0Var.f3485c ? this.f2198r.g() : this.f2198r.k();
                            } else {
                                int e = this.f2198r.e(q3) - this.f2198r.k();
                                if (e < 0) {
                                    f0Var.f3484b = -e;
                                } else {
                                    int g2 = this.f2198r.g() - this.f2198r.b(q3);
                                    if (g2 < 0) {
                                        f0Var.f3484b = g2;
                                    } else {
                                        f0Var.f3484b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f2206z;
                            f0Var.f3483a = i7;
                            int i8 = this.f2186A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = E0(i7) == 1;
                                f0Var.f3485c = z6;
                                f0Var.f3484b = z6 ? staggeredGridLayoutManager.f2198r.g() : staggeredGridLayoutManager.f2198r.k();
                            } else if (f0Var.f3485c) {
                                f0Var.f3484b = staggeredGridLayoutManager.f2198r.g() - i8;
                            } else {
                                f0Var.f3484b = staggeredGridLayoutManager.f2198r.k() + i8;
                            }
                            f0Var.f3486d = true;
                        }
                    } else {
                        f0Var.f3484b = Integer.MIN_VALUE;
                        f0Var.f3483a = this.f2206z;
                    }
                    f0Var.e = true;
                }
            }
            if (this.f2189D) {
                int b2 = x2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = K.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                f0Var.f3483a = i;
                f0Var.f3484b = Integer.MIN_VALUE;
                f0Var.e = true;
            } else {
                int b3 = x2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = K.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                f0Var.f3483a = i;
                f0Var.f3484b = Integer.MIN_VALUE;
                f0Var.e = true;
            }
        }
        if (this.f2191F == null && this.f2206z == -1 && (f0Var.f3485c != this.f2189D || U0() != this.f2190E)) {
            iVar.d();
            f0Var.f3486d = true;
        }
        if (v() > 0 && ((i0Var = this.f2191F) == null || i0Var.f3509c < 1)) {
            if (f0Var.f3486d) {
                for (int i10 = 0; i10 < this.f2196p; i10++) {
                    this.f2197q[i10].b();
                    int i11 = f0Var.f3484b;
                    if (i11 != Integer.MIN_VALUE) {
                        j0 j0Var2 = this.f2197q[i10];
                        j0Var2.f3519b = i11;
                        j0Var2.f3520c = i11;
                    }
                }
            } else if (z4 || f0Var.f3487f == null) {
                for (int i12 = 0; i12 < this.f2196p; i12++) {
                    j0 j0Var3 = this.f2197q[i12];
                    boolean z7 = this.f2204x;
                    int i13 = f0Var.f3484b;
                    int g3 = z7 ? j0Var3.g(Integer.MIN_VALUE) : j0Var3.i(Integer.MIN_VALUE);
                    j0Var3.b();
                    if (g3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) j0Var3.f3523g;
                        if ((!z7 || g3 >= staggeredGridLayoutManager2.f2198r.g()) && (z7 || g3 <= staggeredGridLayoutManager2.f2198r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                g3 += i13;
                            }
                            j0Var3.f3520c = g3;
                            j0Var3.f3519b = g3;
                        }
                    }
                }
                j0[] j0VarArr = this.f2197q;
                int length = j0VarArr.length;
                int[] iArr = f0Var.f3487f;
                if (iArr == null || iArr.length < length) {
                    f0Var.f3487f = new int[staggeredGridLayoutManager.f2197q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    f0Var.f3487f[i14] = j0VarArr[i14].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f2196p; i15++) {
                    j0 j0Var4 = this.f2197q[i15];
                    j0Var4.b();
                    int i16 = f0Var.f3487f[i15];
                    j0Var4.f3519b = i16;
                    j0Var4.f3520c = i16;
                }
            }
        }
        p(q2);
        C0204s c0204s = this.f2202v;
        c0204s.f3587a = false;
        int l2 = this.f2199s.l();
        this.f2201u = l2 / this.f2196p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f2199s.i());
        f1(f0Var.f3483a, x2);
        if (f0Var.f3485c) {
            e1(-1);
            J0(q2, c0204s, x2);
            e1(1);
            c0204s.f3589c = f0Var.f3483a + c0204s.f3590d;
            J0(q2, c0204s, x2);
        } else {
            e1(1);
            J0(q2, c0204s, x2);
            e1(-1);
            c0204s.f3589c = f0Var.f3483a + c0204s.f3590d;
            J0(q2, c0204s, x2);
        }
        if (this.f2199s.i() != 1073741824) {
            int v4 = v();
            float f2 = RecyclerView.f2111C0;
            for (int i17 = 0; i17 < v4; i17++) {
                View u2 = u(i17);
                float c2 = this.f2199s.c(u2);
                if (c2 >= f2) {
                    ((g0) u2.getLayoutParams()).getClass();
                    f2 = Math.max(f2, c2);
                }
            }
            int i18 = this.f2201u;
            int round = Math.round(f2 * this.f2196p);
            if (this.f2199s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2199s.l());
            }
            this.f2201u = round / this.f2196p;
            View.MeasureSpec.makeMeasureSpec(round, this.f2199s.i());
            if (this.f2201u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u3 = u(i19);
                    g0 g0Var = (g0) u3.getLayoutParams();
                    g0Var.getClass();
                    if (U0() && this.f2200t == 1) {
                        int i20 = -((this.f2196p - 1) - g0Var.e.e);
                        u3.offsetLeftAndRight((this.f2201u * i20) - (i20 * i18));
                    } else {
                        int i21 = g0Var.e.e;
                        int i22 = this.f2201u * i21;
                        int i23 = i21 * i18;
                        if (this.f2200t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f2204x) {
                M0(q2, x2, true);
                N0(q2, x2, false);
            } else {
                N0(q2, x2, true);
                M0(q2, x2, false);
            }
        }
        if (z2 && !x2.f3427g && this.f2188C != 0 && v() > 0 && T0() != null) {
            RecyclerView recyclerView = this.f3385b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2195K);
            }
        }
        z3 = false;
        if (x2.f3427g) {
            f0Var.a();
        }
        this.f2189D = f0Var.f3485c;
        this.f2190E = U0();
        if (z3) {
            f0Var.a();
            W0(q2, x2, false);
        }
    }

    public final boolean X0(int i) {
        if (this.f2200t == 0) {
            return (i == -1) != this.f2204x;
        }
        return ((i == -1) == this.f2204x) == U0();
    }

    public final void Y0(int i, X x2) {
        int O02;
        int i2;
        if (i > 0) {
            O02 = P0();
            i2 = 1;
        } else {
            O02 = O0();
            i2 = -1;
        }
        C0204s c0204s = this.f2202v;
        c0204s.f3587a = true;
        f1(O02, x2);
        e1(i2);
        c0204s.f3589c = O02 + c0204s.f3590d;
        c0204s.f3588b = Math.abs(i);
    }

    @Override // k0.K
    public final void Z(int i, int i2) {
        S0(i, i2, 1);
    }

    public final void Z0(Q q2, C0204s c0204s) {
        if (!c0204s.f3587a || c0204s.i) {
            return;
        }
        if (c0204s.f3588b == 0) {
            if (c0204s.e == -1) {
                a1(q2, c0204s.f3592g);
                return;
            } else {
                b1(q2, c0204s.f3591f);
                return;
            }
        }
        int i = 1;
        if (c0204s.e == -1) {
            int i2 = c0204s.f3591f;
            int i3 = this.f2197q[0].i(i2);
            while (i < this.f2196p) {
                int i4 = this.f2197q[i].i(i2);
                if (i4 > i3) {
                    i3 = i4;
                }
                i++;
            }
            int i5 = i2 - i3;
            a1(q2, i5 < 0 ? c0204s.f3592g : c0204s.f3592g - Math.min(i5, c0204s.f3588b));
            return;
        }
        int i6 = c0204s.f3592g;
        int g2 = this.f2197q[0].g(i6);
        while (i < this.f2196p) {
            int g3 = this.f2197q[i].g(i6);
            if (g3 < g2) {
                g2 = g3;
            }
            i++;
        }
        int i7 = g2 - c0204s.f3592g;
        b1(q2, i7 < 0 ? c0204s.f3591f : Math.min(i7, c0204s.f3588b) + c0204s.f3591f);
    }

    @Override // k0.W
    public final PointF a(int i) {
        int E02 = E0(i);
        PointF pointF = new PointF();
        if (E02 == 0) {
            return null;
        }
        if (this.f2200t == 0) {
            pointF.x = E02;
            pointF.y = RecyclerView.f2111C0;
        } else {
            pointF.x = RecyclerView.f2111C0;
            pointF.y = E02;
        }
        return pointF;
    }

    @Override // k0.K
    public final void a0() {
        this.f2187B.d();
        p0();
    }

    public final void a1(Q q2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f2198r.e(u2) < i || this.f2198r.o(u2) < i) {
                return;
            }
            g0 g0Var = (g0) u2.getLayoutParams();
            g0Var.getClass();
            if (((ArrayList) g0Var.e.f3522f).size() == 1) {
                return;
            }
            j0 j0Var = g0Var.e;
            ArrayList arrayList = (ArrayList) j0Var.f3522f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            g0 g0Var2 = (g0) view.getLayoutParams();
            g0Var2.e = null;
            if (g0Var2.f3396a.j() || g0Var2.f3396a.m()) {
                j0Var.f3521d -= ((StaggeredGridLayoutManager) j0Var.f3523g).f2198r.c(view);
            }
            if (size == 1) {
                j0Var.f3519b = Integer.MIN_VALUE;
            }
            j0Var.f3520c = Integer.MIN_VALUE;
            m0(u2, q2);
        }
    }

    @Override // k0.K
    public final void b0(int i, int i2) {
        S0(i, i2, 8);
    }

    public final void b1(Q q2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f2198r.b(u2) > i || this.f2198r.n(u2) > i) {
                return;
            }
            g0 g0Var = (g0) u2.getLayoutParams();
            g0Var.getClass();
            if (((ArrayList) g0Var.e.f3522f).size() == 1) {
                return;
            }
            j0 j0Var = g0Var.e;
            ArrayList arrayList = (ArrayList) j0Var.f3522f;
            View view = (View) arrayList.remove(0);
            g0 g0Var2 = (g0) view.getLayoutParams();
            g0Var2.e = null;
            if (arrayList.size() == 0) {
                j0Var.f3520c = Integer.MIN_VALUE;
            }
            if (g0Var2.f3396a.j() || g0Var2.f3396a.m()) {
                j0Var.f3521d -= ((StaggeredGridLayoutManager) j0Var.f3523g).f2198r.c(view);
            }
            j0Var.f3519b = Integer.MIN_VALUE;
            m0(u2, q2);
        }
    }

    @Override // k0.K
    public final void c(String str) {
        if (this.f2191F == null) {
            super.c(str);
        }
    }

    @Override // k0.K
    public final void c0(int i, int i2) {
        S0(i, i2, 2);
    }

    public final void c1() {
        if (this.f2200t == 1 || !U0()) {
            this.f2204x = this.f2203w;
        } else {
            this.f2204x = !this.f2203w;
        }
    }

    @Override // k0.K
    public final boolean d() {
        return this.f2200t == 0;
    }

    @Override // k0.K
    public final void d0(int i, int i2) {
        S0(i, i2, 4);
    }

    public final int d1(int i, Q q2, X x2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        Y0(i, x2);
        C0204s c0204s = this.f2202v;
        int J02 = J0(q2, c0204s, x2);
        if (c0204s.f3588b >= J02) {
            i = i < 0 ? -J02 : J02;
        }
        this.f2198r.p(-i);
        this.f2189D = this.f2204x;
        c0204s.f3588b = 0;
        Z0(q2, c0204s);
        return i;
    }

    @Override // k0.K
    public final boolean e() {
        return this.f2200t == 1;
    }

    @Override // k0.K
    public final void e0(Q q2, X x2) {
        W0(q2, x2, true);
    }

    public final void e1(int i) {
        C0204s c0204s = this.f2202v;
        c0204s.e = i;
        c0204s.f3590d = this.f2204x != (i == -1) ? -1 : 1;
    }

    @Override // k0.K
    public final boolean f(L l2) {
        return l2 instanceof g0;
    }

    @Override // k0.K
    public final void f0(X x2) {
        this.f2206z = -1;
        this.f2186A = Integer.MIN_VALUE;
        this.f2191F = null;
        this.f2193H.a();
    }

    public final void f1(int i, X x2) {
        int i2;
        int i3;
        int i4;
        C0204s c0204s = this.f2202v;
        boolean z2 = false;
        c0204s.f3588b = 0;
        c0204s.f3589c = i;
        C0209x c0209x = this.e;
        if (!(c0209x != null && c0209x.e) || (i4 = x2.f3422a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f2204x == (i4 < i)) {
                i2 = this.f2198r.l();
                i3 = 0;
            } else {
                i3 = this.f2198r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView == null || !recyclerView.f2152h) {
            c0204s.f3592g = this.f2198r.f() + i2;
            c0204s.f3591f = -i3;
        } else {
            c0204s.f3591f = this.f2198r.k() - i3;
            c0204s.f3592g = this.f2198r.g() + i2;
        }
        c0204s.f3593h = false;
        c0204s.f3587a = true;
        if (this.f2198r.i() == 0 && this.f2198r.f() == 0) {
            z2 = true;
        }
        c0204s.i = z2;
    }

    public final void g1(j0 j0Var, int i, int i2) {
        int i3 = j0Var.f3521d;
        int i4 = j0Var.e;
        if (i != -1) {
            int i5 = j0Var.f3520c;
            if (i5 == Integer.MIN_VALUE) {
                j0Var.a();
                i5 = j0Var.f3520c;
            }
            if (i5 - i3 >= i2) {
                this.f2205y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = j0Var.f3519b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) j0Var.f3522f).get(0);
            g0 g0Var = (g0) view.getLayoutParams();
            j0Var.f3519b = ((StaggeredGridLayoutManager) j0Var.f3523g).f2198r.e(view);
            g0Var.getClass();
            i6 = j0Var.f3519b;
        }
        if (i6 + i3 <= i2) {
            this.f2205y.set(i4, false);
        }
    }

    @Override // k0.K
    public final void h(int i, int i2, X x2, C0201o c0201o) {
        C0204s c0204s;
        int g2;
        int i3;
        if (this.f2200t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        Y0(i, x2);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f2196p) {
            this.J = new int[this.f2196p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2196p;
            c0204s = this.f2202v;
            if (i4 >= i6) {
                break;
            }
            if (c0204s.f3590d == -1) {
                g2 = c0204s.f3591f;
                i3 = this.f2197q[i4].i(g2);
            } else {
                g2 = this.f2197q[i4].g(c0204s.f3592g);
                i3 = c0204s.f3592g;
            }
            int i7 = g2 - i3;
            if (i7 >= 0) {
                this.J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0204s.f3589c;
            if (i9 < 0 || i9 >= x2.b()) {
                return;
            }
            c0201o.a(c0204s.f3589c, this.J[i8]);
            c0204s.f3589c += c0204s.f3590d;
        }
    }

    @Override // k0.K
    public final void h0(Parcelable parcelable) {
        if (parcelable instanceof i0) {
            i0 i0Var = (i0) parcelable;
            this.f2191F = i0Var;
            if (this.f2206z != -1) {
                i0Var.f3510d = null;
                i0Var.f3509c = 0;
                i0Var.f3507a = -1;
                i0Var.f3508b = -1;
                i0Var.f3510d = null;
                i0Var.f3509c = 0;
                i0Var.e = 0;
                i0Var.f3511f = null;
                i0Var.f3512g = null;
            }
            p0();
        }
    }

    @Override // k0.K
    public final Parcelable i0() {
        int i;
        int k2;
        int[] iArr;
        i0 i0Var = this.f2191F;
        if (i0Var != null) {
            i0 i0Var2 = new i0();
            i0Var2.f3509c = i0Var.f3509c;
            i0Var2.f3507a = i0Var.f3507a;
            i0Var2.f3508b = i0Var.f3508b;
            i0Var2.f3510d = i0Var.f3510d;
            i0Var2.e = i0Var.e;
            i0Var2.f3511f = i0Var.f3511f;
            i0Var2.f3513h = i0Var.f3513h;
            i0Var2.i = i0Var.i;
            i0Var2.j = i0Var.j;
            i0Var2.f3512g = i0Var.f3512g;
            return i0Var2;
        }
        i0 i0Var3 = new i0();
        i0Var3.f3513h = this.f2203w;
        i0Var3.i = this.f2189D;
        i0Var3.j = this.f2190E;
        i iVar = this.f2187B;
        if (iVar == null || (iArr = (int[]) iVar.f208b) == null) {
            i0Var3.e = 0;
        } else {
            i0Var3.f3511f = iArr;
            i0Var3.e = iArr.length;
            i0Var3.f3512g = (ArrayList) iVar.f209c;
        }
        if (v() > 0) {
            i0Var3.f3507a = this.f2189D ? P0() : O0();
            View K02 = this.f2204x ? K0(true) : L0(true);
            i0Var3.f3508b = K02 != null ? K.H(K02) : -1;
            int i2 = this.f2196p;
            i0Var3.f3509c = i2;
            i0Var3.f3510d = new int[i2];
            for (int i3 = 0; i3 < this.f2196p; i3++) {
                if (this.f2189D) {
                    i = this.f2197q[i3].g(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k2 = this.f2198r.g();
                        i -= k2;
                        i0Var3.f3510d[i3] = i;
                    } else {
                        i0Var3.f3510d[i3] = i;
                    }
                } else {
                    i = this.f2197q[i3].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k2 = this.f2198r.k();
                        i -= k2;
                        i0Var3.f3510d[i3] = i;
                    } else {
                        i0Var3.f3510d[i3] = i;
                    }
                }
            }
        } else {
            i0Var3.f3507a = -1;
            i0Var3.f3508b = -1;
            i0Var3.f3509c = 0;
        }
        return i0Var3;
    }

    @Override // k0.K
    public final int j(X x2) {
        return G0(x2);
    }

    @Override // k0.K
    public final void j0(int i) {
        if (i == 0) {
            F0();
        }
    }

    @Override // k0.K
    public final int k(X x2) {
        return H0(x2);
    }

    @Override // k0.K
    public final int l(X x2) {
        return I0(x2);
    }

    @Override // k0.K
    public final int m(X x2) {
        return G0(x2);
    }

    @Override // k0.K
    public final int n(X x2) {
        return H0(x2);
    }

    @Override // k0.K
    public final int o(X x2) {
        return I0(x2);
    }

    @Override // k0.K
    public final int q0(int i, Q q2, X x2) {
        return d1(i, q2, x2);
    }

    @Override // k0.K
    public final L r() {
        return this.f2200t == 0 ? new g0(-2, -1) : new g0(-1, -2);
    }

    @Override // k0.K
    public final void r0(int i) {
        i0 i0Var = this.f2191F;
        if (i0Var != null && i0Var.f3507a != i) {
            i0Var.f3510d = null;
            i0Var.f3509c = 0;
            i0Var.f3507a = -1;
            i0Var.f3508b = -1;
        }
        this.f2206z = i;
        this.f2186A = Integer.MIN_VALUE;
        p0();
    }

    @Override // k0.K
    public final L s(Context context, AttributeSet attributeSet) {
        return new g0(context, attributeSet);
    }

    @Override // k0.K
    public final int s0(int i, Q q2, X x2) {
        return d1(i, q2, x2);
    }

    @Override // k0.K
    public final L t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g0((ViewGroup.MarginLayoutParams) layoutParams) : new g0(layoutParams);
    }

    @Override // k0.K
    public final void v0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f2196p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f2200t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3385b;
            WeakHashMap weakHashMap = O.K.f747a;
            g3 = K.g(i2, height, recyclerView.getMinimumHeight());
            g2 = K.g(i, (this.f2201u * i3) + F2, this.f3385b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3385b;
            WeakHashMap weakHashMap2 = O.K.f747a;
            g2 = K.g(i, width, recyclerView2.getMinimumWidth());
            g3 = K.g(i2, (this.f2201u * i3) + D2, this.f3385b.getMinimumHeight());
        }
        this.f3385b.setMeasuredDimension(g2, g3);
    }
}
