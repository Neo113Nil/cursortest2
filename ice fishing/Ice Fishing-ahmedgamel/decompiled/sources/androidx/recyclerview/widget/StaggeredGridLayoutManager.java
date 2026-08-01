package androidx.recyclerview.widget;

import P.j;
import P.k;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import com.bumptech.glide.h;
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.ads.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import m1.e;
import p3.b;
import t0.AbstractC4990E;
import t0.C4989D;
import t0.C4991F;
import t0.C5000O;
import t0.C5021p;
import t0.C5024s;
import t0.InterfaceC4999N;
import t0.V;
import t0.W;
import t0.X;
import t0.Y;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC4990E implements InterfaceC4999N {

    /* renamed from: B, reason: collision with root package name */
    public final e f5277B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5278C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5279D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5280E;

    /* renamed from: F, reason: collision with root package name */
    public Y f5281F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f5282G;

    /* renamed from: H, reason: collision with root package name */
    public final V f5283H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f5284I;
    public int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final b f5285K;

    /* renamed from: p, reason: collision with root package name */
    public final int f5286p;

    /* renamed from: q, reason: collision with root package name */
    public final I[] f5287q;

    /* renamed from: r, reason: collision with root package name */
    public final g f5288r;

    /* renamed from: s, reason: collision with root package name */
    public final g f5289s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5290t;

    /* renamed from: u, reason: collision with root package name */
    public int f5291u;

    /* renamed from: v, reason: collision with root package name */
    public final C5021p f5292v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5293w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f5295y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5294x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f5296z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f5276A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i6) {
        this.f5286p = -1;
        this.f5293w = false;
        e eVar = new e();
        this.f5277B = eVar;
        this.f5278C = 2;
        this.f5282G = new Rect();
        this.f5283H = new V(this);
        this.f5284I = true;
        this.f5285K = new b(7, this);
        C4989D I8 = AbstractC4990E.I(context, attributeSet, i, i6);
        int i9 = I8.f40536a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i9 != this.f5290t) {
            this.f5290t = i9;
            g gVar = this.f5288r;
            this.f5288r = this.f5289s;
            this.f5289s = gVar;
            l0();
        }
        int i10 = I8.f40537b;
        c(null);
        if (i10 != this.f5286p) {
            int[] iArr = (int[]) eVar.f39302u;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            eVar.f39301n = null;
            l0();
            this.f5286p = i10;
            this.f5295y = new BitSet(this.f5286p);
            this.f5287q = new I[this.f5286p];
            for (int i11 = 0; i11 < this.f5286p; i11++) {
                this.f5287q[i11] = new I(this, i11);
            }
            l0();
        }
        boolean z3 = I8.f40538c;
        c(null);
        Y y7 = this.f5281F;
        if (y7 != null && y7.f40626A != z3) {
            y7.f40626A = z3;
        }
        this.f5293w = z3;
        l0();
        C5021p c5021p = new C5021p();
        c5021p.f40738a = true;
        c5021p.f40743f = 0;
        c5021p.f40744g = 0;
        this.f5292v = c5021p;
        this.f5288r = g.a(this, this.f5290t);
        this.f5289s = g.a(this, 1 - this.f5290t);
    }

    public static int c1(int i, int i6, int i9) {
        int mode;
        return (!(i6 == 0 && i9 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i6) - i9), mode) : i;
    }

    public final boolean A0() {
        int J02;
        if (v() != 0 && this.f5278C != 0 && this.f40546g) {
            if (this.f5294x) {
                J02 = K0();
                J0();
            } else {
                J02 = J0();
                K0();
            }
            e eVar = this.f5277B;
            if (J02 == 0 && O0() != null) {
                int[] iArr = (int[]) eVar.f39302u;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                eVar.f39301n = null;
                this.f40545f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int B0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5288r;
        boolean z3 = !this.f5284I;
        return h.a(c5000o, gVar, G0(z3), F0(z3), this, this.f5284I);
    }

    public final int C0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5288r;
        boolean z3 = !this.f5284I;
        return h.b(c5000o, gVar, G0(z3), F0(z3), this, this.f5284I, this.f5294x);
    }

    public final int D0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5288r;
        boolean z3 = !this.f5284I;
        return h.c(c5000o, gVar, G0(z3), F0(z3), this, this.f5284I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int E0(C3675oP c3675oP, C5021p c5021p, C5000O c5000o) {
        I i;
        ?? r62;
        int i6;
        int h9;
        int c9;
        int k9;
        int c10;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 1;
        this.f5295y.set(0, this.f5286p, true);
        C5021p c5021p2 = this.f5292v;
        int i14 = c5021p2.i ? c5021p.f40742e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c5021p.f40742e == 1 ? c5021p.f40744g + c5021p.f40739b : c5021p.f40743f - c5021p.f40739b;
        int i15 = c5021p.f40742e;
        for (int i16 = 0; i16 < this.f5286p; i16++) {
            if (!this.f5287q[i16].f25421a.isEmpty()) {
                b1(this.f5287q[i16], i15, i14);
            }
        }
        int g4 = this.f5294x ? this.f5288r.g() : this.f5288r.k();
        boolean z3 = false;
        while (true) {
            int i17 = c5021p.f40740c;
            if (((i17 < 0 || i17 >= c5000o.b()) ? i12 : i13) == 0 || (!c5021p2.i && this.f5295y.isEmpty())) {
                break;
            }
            View view = c3675oP.i(c5021p.f40740c, Long.MAX_VALUE).f40593a;
            c5021p.f40740c += c5021p.f40741d;
            W w6 = (W) view.getLayoutParams();
            int b9 = w6.f40554a.b();
            e eVar = this.f5277B;
            int[] iArr = (int[]) eVar.f39302u;
            int i18 = (iArr == null || b9 >= iArr.length) ? -1 : iArr[b9];
            if (i18 == -1) {
                if (S0(c5021p.f40742e)) {
                    i11 = this.f5286p - i13;
                    i10 = -1;
                    i9 = -1;
                } else {
                    i9 = i13;
                    i10 = this.f5286p;
                    i11 = i12;
                }
                I i19 = null;
                if (c5021p.f40742e == i13) {
                    int k10 = this.f5288r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i11 != i10) {
                        I i21 = this.f5287q[i11];
                        int f3 = i21.f(k10);
                        if (f3 < i20) {
                            i20 = f3;
                            i19 = i21;
                        }
                        i11 += i9;
                    }
                } else {
                    int g9 = this.f5288r.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i11 != i10) {
                        I i23 = this.f5287q[i11];
                        int h10 = i23.h(g9);
                        if (h10 > i22) {
                            i19 = i23;
                            i22 = h10;
                        }
                        i11 += i9;
                    }
                }
                i = i19;
                eVar.a(b9);
                ((int[]) eVar.f39302u)[b9] = i.f25425e;
            } else {
                i = this.f5287q[i18];
            }
            w6.f40621e = i;
            if (c5021p.f40742e == 1) {
                r62 = 0;
                b(view, -1, false);
            } else {
                r62 = 0;
                b(view, 0, false);
            }
            if (this.f5290t == 1) {
                i6 = 1;
                Q0(AbstractC4990E.w(this.f5291u, this.f40550l, r62, ((ViewGroup.MarginLayoutParams) w6).width, r62), AbstractC4990E.w(this.f40553o, this.f40551m, D() + G(), ((ViewGroup.MarginLayoutParams) w6).height, true), view);
            } else {
                i6 = 1;
                Q0(AbstractC4990E.w(this.f40552n, this.f40550l, F() + E(), ((ViewGroup.MarginLayoutParams) w6).width, true), AbstractC4990E.w(this.f5291u, this.f40551m, 0, ((ViewGroup.MarginLayoutParams) w6).height, false), view);
            }
            if (c5021p.f40742e == i6) {
                c9 = i.f(g4);
                h9 = this.f5288r.c(view) + c9;
            } else {
                h9 = i.h(g4);
                c9 = h9 - this.f5288r.c(view);
            }
            if (c5021p.f40742e == 1) {
                I i24 = w6.f40621e;
                i24.getClass();
                W w9 = (W) view.getLayoutParams();
                w9.f40621e = i24;
                ArrayList arrayList = i24.f25421a;
                arrayList.add(view);
                i24.f25423c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    i24.f25422b = Integer.MIN_VALUE;
                }
                if (w9.f40554a.h() || w9.f40554a.k()) {
                    i24.f25424d = ((StaggeredGridLayoutManager) i24.f25426f).f5288r.c(view) + i24.f25424d;
                }
            } else {
                I i25 = w6.f40621e;
                i25.getClass();
                W w10 = (W) view.getLayoutParams();
                w10.f40621e = i25;
                ArrayList arrayList2 = i25.f25421a;
                arrayList2.add(0, view);
                i25.f25422b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    i25.f25423c = Integer.MIN_VALUE;
                }
                if (w10.f40554a.h() || w10.f40554a.k()) {
                    i25.f25424d = ((StaggeredGridLayoutManager) i25.f25426f).f5288r.c(view) + i25.f25424d;
                }
            }
            if (P0() && this.f5290t == 1) {
                c10 = this.f5289s.g() - (((this.f5286p - 1) - i.f25425e) * this.f5291u);
                k9 = c10 - this.f5289s.c(view);
            } else {
                k9 = this.f5289s.k() + (i.f25425e * this.f5291u);
                c10 = this.f5289s.c(view) + k9;
            }
            if (this.f5290t == 1) {
                AbstractC4990E.N(view, k9, c9, c10, h9);
            } else {
                AbstractC4990E.N(view, c9, k9, h9, c10);
            }
            b1(i, c5021p2.f40742e, i14);
            U0(c3675oP, c5021p2);
            if (c5021p2.f40745h && view.hasFocusable()) {
                this.f5295y.set(i.f25425e, false);
            }
            i13 = 1;
            z3 = true;
            i12 = 0;
        }
        if (!z3) {
            U0(c3675oP, c5021p2);
        }
        int k11 = c5021p2.f40742e == -1 ? this.f5288r.k() - M0(this.f5288r.k()) : L0(this.f5288r.g()) - this.f5288r.g();
        if (k11 > 0) {
            return Math.min(c5021p.f40739b, k11);
        }
        return 0;
    }

    public final View F0(boolean z3) {
        int k9 = this.f5288r.k();
        int g4 = this.f5288r.g();
        View view = null;
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u3 = u(v9);
            int e9 = this.f5288r.e(u3);
            int b9 = this.f5288r.b(u3);
            if (b9 > k9 && e9 < g4) {
                if (b9 <= g4 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z3) {
        int k9 = this.f5288r.k();
        int g4 = this.f5288r.g();
        int v9 = v();
        View view = null;
        for (int i = 0; i < v9; i++) {
            View u3 = u(i);
            int e9 = this.f5288r.e(u3);
            if (this.f5288r.b(u3) > k9 && e9 < g4) {
                if (e9 >= k9 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final void H0(C3675oP c3675oP, C5000O c5000o, boolean z3) {
        int g4;
        int L02 = L0(Integer.MIN_VALUE);
        if (L02 != Integer.MIN_VALUE && (g4 = this.f5288r.g() - L02) > 0) {
            int i = g4 - (-Y0(-g4, c3675oP, c5000o));
            if (!z3 || i <= 0) {
                return;
            }
            this.f5288r.o(i);
        }
    }

    public final void I0(C3675oP c3675oP, C5000O c5000o, boolean z3) {
        int k9;
        int M02 = M0(Integer.MAX_VALUE);
        if (M02 != Integer.MAX_VALUE && (k9 = M02 - this.f5288r.k()) > 0) {
            int Y02 = k9 - Y0(k9, c3675oP, c5000o);
            if (!z3 || Y02 <= 0) {
                return;
            }
            this.f5288r.o(-Y02);
        }
    }

    @Override // t0.AbstractC4990E
    public final int J(C3675oP c3675oP, C5000O c5000o) {
        return this.f5290t == 0 ? this.f5286p : super.J(c3675oP, c5000o);
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC4990E.H(u(0));
    }

    public final int K0() {
        int v9 = v();
        if (v9 == 0) {
            return 0;
        }
        return AbstractC4990E.H(u(v9 - 1));
    }

    @Override // t0.AbstractC4990E
    public final boolean L() {
        return this.f5278C != 0;
    }

    public final int L0(int i) {
        int f3 = this.f5287q[0].f(i);
        for (int i6 = 1; i6 < this.f5286p; i6++) {
            int f9 = this.f5287q[i6].f(i);
            if (f9 > f3) {
                f3 = f9;
            }
        }
        return f3;
    }

    public final int M0(int i) {
        int h9 = this.f5287q[0].h(i);
        for (int i6 = 1; i6 < this.f5286p; i6++) {
            int h10 = this.f5287q[i6].h(i);
            if (h10 < h9) {
                h9 = h10;
            }
        }
        return h9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(int i, int i6, int i9) {
        int i10;
        int i11;
        e eVar;
        int[] iArr;
        ArrayList arrayList;
        X x9;
        int i12;
        int K02 = this.f5294x ? K0() : J0();
        if (i9 != 8) {
            i10 = i + i6;
        } else {
            if (i >= i6) {
                i10 = i + 1;
                i11 = i6;
                eVar = this.f5277B;
                iArr = (int[]) eVar.f39302u;
                if (iArr != null && i11 < iArr.length) {
                    arrayList = (ArrayList) eVar.f39301n;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                x9 = (X) ((ArrayList) eVar.f39301n).get(size);
                                if (x9.f40622n == i11) {
                                    break;
                                }
                            }
                        }
                        x9 = null;
                        if (x9 != null) {
                            ((ArrayList) eVar.f39301n).remove(x9);
                        }
                        int size2 = ((ArrayList) eVar.f39301n).size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                i13 = -1;
                                break;
                            } else if (((X) ((ArrayList) eVar.f39301n).get(i13)).f40622n >= i11) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 != -1) {
                            X x10 = (X) ((ArrayList) eVar.f39301n).get(i13);
                            ((ArrayList) eVar.f39301n).remove(i13);
                            i12 = x10.f40622n;
                            if (i12 == -1) {
                                int[] iArr2 = (int[]) eVar.f39302u;
                                Arrays.fill(iArr2, i11, iArr2.length, -1);
                                int length = ((int[]) eVar.f39302u).length;
                            } else {
                                Arrays.fill((int[]) eVar.f39302u, i11, i12 + 1, -1);
                            }
                        }
                    }
                    i12 = -1;
                    if (i12 == -1) {
                    }
                }
                if (i9 != 1) {
                    eVar.e(i, i6);
                } else if (i9 == 2) {
                    eVar.f(i, i6);
                } else if (i9 == 8) {
                    eVar.f(i, 1);
                    eVar.e(i6, 1);
                }
                if (i10 > K02) {
                    return;
                }
                if (i11 <= (this.f5294x ? J0() : K0())) {
                    l0();
                    return;
                }
                return;
            }
            i10 = i6 + 1;
        }
        i11 = i;
        eVar = this.f5277B;
        iArr = (int[]) eVar.f39302u;
        if (iArr != null) {
            arrayList = (ArrayList) eVar.f39301n;
            if (arrayList != null) {
            }
            i12 = -1;
            if (i12 == -1) {
            }
        }
        if (i9 != 1) {
        }
        if (i10 > K02) {
        }
    }

    @Override // t0.AbstractC4990E
    public final void O(int i) {
        super.O(i);
        for (int i6 = 0; i6 < this.f5286p; i6++) {
            I i9 = this.f5287q[i6];
            int i10 = i9.f25422b;
            if (i10 != Integer.MIN_VALUE) {
                i9.f25422b = i10 + i;
            }
            int i11 = i9.f25423c;
            if (i11 != Integer.MIN_VALUE) {
                i9.f25423c = i11 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View O0() {
        int v9 = v();
        int i = v9 - 1;
        BitSet bitSet = new BitSet(this.f5286p);
        bitSet.set(0, this.f5286p, true);
        char c9 = (this.f5290t == 1 && P0()) ? (char) 1 : (char) 65535;
        if (this.f5294x) {
            v9 = -1;
        } else {
            i = 0;
        }
        int i6 = i < v9 ? 1 : -1;
        while (i != v9) {
            View u3 = u(i);
            W w6 = (W) u3.getLayoutParams();
            if (bitSet.get(w6.f40621e.f25425e)) {
                I i9 = w6.f40621e;
                if (this.f5294x) {
                    int i10 = i9.f25423c;
                    if (i10 == Integer.MIN_VALUE) {
                        i9.a();
                        i10 = i9.f25423c;
                    }
                    if (i10 < this.f5288r.g()) {
                        ArrayList arrayList = i9.f25421a;
                        ((W) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u3;
                    }
                } else {
                    int i11 = i9.f25422b;
                    if (i11 == Integer.MIN_VALUE) {
                        View view = (View) i9.f25421a.get(0);
                        W w9 = (W) view.getLayoutParams();
                        i9.f25422b = ((StaggeredGridLayoutManager) i9.f25426f).f5288r.e(view);
                        w9.getClass();
                        i11 = i9.f25422b;
                    }
                    if (i11 > this.f5288r.k()) {
                        ((W) ((View) i9.f25421a.get(0)).getLayoutParams()).getClass();
                        return u3;
                    }
                }
                bitSet.clear(w6.f40621e.f25425e);
            }
            i += i6;
            if (i != v9) {
                View u6 = u(i);
                if (this.f5294x) {
                    int b9 = this.f5288r.b(u3);
                    int b10 = this.f5288r.b(u6);
                    if (b9 < b10) {
                        return u3;
                    }
                    if (b9 == b10) {
                        if ((w6.f40621e.f25425e - ((W) u6.getLayoutParams()).f40621e.f25425e >= 0) == (c9 >= 0)) {
                            return u3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e9 = this.f5288r.e(u3);
                    int e10 = this.f5288r.e(u6);
                    if (e9 > e10) {
                        return u3;
                    }
                    if (e9 == e10) {
                        if ((w6.f40621e.f25425e - ((W) u6.getLayoutParams()).f40621e.f25425e >= 0) == (c9 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // t0.AbstractC4990E
    public final void P(int i) {
        super.P(i);
        for (int i6 = 0; i6 < this.f5286p; i6++) {
            I i9 = this.f5287q[i6];
            int i10 = i9.f25422b;
            if (i10 != Integer.MIN_VALUE) {
                i9.f25422b = i10 + i;
            }
            int i11 = i9.f25423c;
            if (i11 != Integer.MIN_VALUE) {
                i9.f25423c = i11 + i;
            }
        }
    }

    public final boolean P0() {
        return C() == 1;
    }

    public final void Q0(int i, int i6, View view) {
        RecyclerView recyclerView = this.f40541b;
        Rect rect = this.f5282G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        W w6 = (W) view.getLayoutParams();
        int c12 = c1(i, ((ViewGroup.MarginLayoutParams) w6).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) w6).rightMargin + rect.right);
        int c13 = c1(i6, ((ViewGroup.MarginLayoutParams) w6).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) w6).bottomMargin + rect.bottom);
        if (u0(view, c12, c13, w6)) {
            view.measure(c12, c13);
        }
    }

    @Override // t0.AbstractC4990E
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f40541b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5285K);
        }
        for (int i = 0; i < this.f5286p; i++) {
            this.f5287q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < J0()) != r16.f5294x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041e, code lost:
    
        if (A0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f5294x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(C3675oP c3675oP, C5000O c5000o, boolean z3) {
        Y y7;
        int i;
        int i6;
        boolean z6;
        Y y9 = this.f5281F;
        V v9 = this.f5283H;
        if (!(y9 == null && this.f5296z == -1) && c5000o.b() == 0) {
            g0(c3675oP);
            v9.a();
            return;
        }
        boolean z9 = true;
        boolean z10 = (v9.f40618e && this.f5296z == -1 && this.f5281F == null) ? false : true;
        e eVar = this.f5277B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = v9.f40620g;
        if (z10) {
            v9.a();
            Y y10 = this.f5281F;
            if (y10 != null) {
                int i9 = y10.f40631v;
                if (i9 > 0) {
                    if (i9 == this.f5286p) {
                        for (int i10 = 0; i10 < this.f5286p; i10++) {
                            this.f5287q[i10].b();
                            Y y11 = this.f5281F;
                            int i11 = y11.f40632w[i10];
                            if (i11 != Integer.MIN_VALUE) {
                                i11 += y11.f40627B ? this.f5288r.g() : this.f5288r.k();
                            }
                            I i12 = this.f5287q[i10];
                            i12.f25422b = i11;
                            i12.f25423c = i11;
                        }
                    } else {
                        y10.f40632w = null;
                        y10.f40631v = 0;
                        y10.f40633x = 0;
                        y10.f40634y = null;
                        y10.f40635z = null;
                        y10.f40629n = y10.f40630u;
                    }
                }
                Y y12 = this.f5281F;
                this.f5280E = y12.f40628C;
                boolean z11 = y12.f40626A;
                c(null);
                Y y13 = this.f5281F;
                if (y13 != null && y13.f40626A != z11) {
                    y13.f40626A = z11;
                }
                this.f5293w = z11;
                l0();
                X0();
                Y y14 = this.f5281F;
                int i13 = y14.f40629n;
                if (i13 != -1) {
                    this.f5296z = i13;
                    v9.f40616c = y14.f40627B;
                } else {
                    v9.f40616c = this.f5294x;
                }
                if (y14.f40633x > 1) {
                    eVar.f39302u = y14.f40634y;
                    eVar.f39301n = y14.f40635z;
                }
            } else {
                X0();
                v9.f40616c = this.f5294x;
            }
            if (!c5000o.f40578g && (i6 = this.f5296z) != -1) {
                if (i6 < 0 || i6 >= c5000o.b()) {
                    this.f5296z = -1;
                    this.f5276A = Integer.MIN_VALUE;
                } else {
                    Y y15 = this.f5281F;
                    if (y15 == null || y15.f40629n == -1 || y15.f40631v < 1) {
                        View q8 = q(this.f5296z);
                        if (q8 != null) {
                            v9.f40614a = this.f5294x ? K0() : J0();
                            if (this.f5276A != Integer.MIN_VALUE) {
                                if (v9.f40616c) {
                                    v9.f40615b = (this.f5288r.g() - this.f5276A) - this.f5288r.b(q8);
                                } else {
                                    v9.f40615b = (this.f5288r.k() + this.f5276A) - this.f5288r.e(q8);
                                }
                            } else if (this.f5288r.c(q8) > this.f5288r.l()) {
                                v9.f40615b = v9.f40616c ? this.f5288r.g() : this.f5288r.k();
                            } else {
                                int e9 = this.f5288r.e(q8) - this.f5288r.k();
                                if (e9 < 0) {
                                    v9.f40615b = -e9;
                                } else {
                                    int g4 = this.f5288r.g() - this.f5288r.b(q8);
                                    if (g4 < 0) {
                                        v9.f40615b = g4;
                                    } else {
                                        v9.f40615b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i14 = this.f5296z;
                            v9.f40614a = i14;
                            int i15 = this.f5276A;
                            if (i15 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                v9.f40616c = z6;
                                v9.f40615b = z6 ? staggeredGridLayoutManager.f5288r.g() : staggeredGridLayoutManager.f5288r.k();
                            } else if (v9.f40616c) {
                                v9.f40615b = staggeredGridLayoutManager.f5288r.g() - i15;
                            } else {
                                v9.f40615b = staggeredGridLayoutManager.f5288r.k() + i15;
                            }
                            v9.f40617d = true;
                        }
                    } else {
                        v9.f40615b = Integer.MIN_VALUE;
                        v9.f40614a = this.f5296z;
                    }
                    v9.f40618e = true;
                }
            }
            if (this.f5279D) {
                int b9 = c5000o.b();
                for (int v10 = v() - 1; v10 >= 0; v10--) {
                    i = AbstractC4990E.H(u(v10));
                    if (i >= 0 && i < b9) {
                        break;
                    }
                }
                i = 0;
                v9.f40614a = i;
                v9.f40615b = Integer.MIN_VALUE;
                v9.f40618e = true;
            } else {
                int b10 = c5000o.b();
                int v11 = v();
                for (int i16 = 0; i16 < v11; i16++) {
                    int H8 = AbstractC4990E.H(u(i16));
                    if (H8 >= 0 && H8 < b10) {
                        i = H8;
                        break;
                    }
                }
                i = 0;
                v9.f40614a = i;
                v9.f40615b = Integer.MIN_VALUE;
                v9.f40618e = true;
            }
        }
        if (this.f5281F == null && this.f5296z == -1 && (v9.f40616c != this.f5279D || P0() != this.f5280E)) {
            int[] iArr = (int[]) eVar.f39302u;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            eVar.f39301n = null;
            v9.f40617d = true;
        }
        if (v() > 0 && ((y7 = this.f5281F) == null || y7.f40631v < 1)) {
            if (v9.f40617d) {
                for (int i17 = 0; i17 < this.f5286p; i17++) {
                    this.f5287q[i17].b();
                    int i18 = v9.f40615b;
                    if (i18 != Integer.MIN_VALUE) {
                        I i19 = this.f5287q[i17];
                        i19.f25422b = i18;
                        i19.f25423c = i18;
                    }
                }
            } else if (z10 || v9.f40619f == null) {
                for (int i20 = 0; i20 < this.f5286p; i20++) {
                    I i21 = this.f5287q[i20];
                    boolean z12 = this.f5294x;
                    int i22 = v9.f40615b;
                    int f3 = z12 ? i21.f(Integer.MIN_VALUE) : i21.h(Integer.MIN_VALUE);
                    i21.b();
                    if (f3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) i21.f25426f;
                        if ((!z12 || f3 >= staggeredGridLayoutManager2.f5288r.g()) && (z12 || f3 <= staggeredGridLayoutManager2.f5288r.k())) {
                            if (i22 != Integer.MIN_VALUE) {
                                f3 += i22;
                            }
                            i21.f25423c = f3;
                            i21.f25422b = f3;
                        }
                    }
                }
                I[] iArr2 = this.f5287q;
                int length = iArr2.length;
                int[] iArr3 = v9.f40619f;
                if (iArr3 == null || iArr3.length < length) {
                    v9.f40619f = new int[staggeredGridLayoutManager.f5287q.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    v9.f40619f[i23] = iArr2[i23].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i24 = 0; i24 < this.f5286p; i24++) {
                    I i25 = this.f5287q[i24];
                    i25.b();
                    int i26 = v9.f40619f[i24];
                    i25.f25422b = i26;
                    i25.f25423c = i26;
                }
            }
        }
        p(c3675oP);
        C5021p c5021p = this.f5292v;
        c5021p.f40738a = false;
        int l9 = this.f5289s.l();
        this.f5291u = l9 / this.f5286p;
        View.MeasureSpec.makeMeasureSpec(l9, this.f5289s.i());
        a1(v9.f40614a, c5000o);
        if (v9.f40616c) {
            Z0(-1);
            E0(c3675oP, c5021p, c5000o);
            Z0(1);
            c5021p.f40740c = v9.f40614a + c5021p.f40741d;
            E0(c3675oP, c5021p, c5000o);
        } else {
            Z0(1);
            E0(c3675oP, c5021p, c5000o);
            Z0(-1);
            c5021p.f40740c = v9.f40614a + c5021p.f40741d;
            E0(c3675oP, c5021p, c5000o);
        }
        if (this.f5289s.i() != 1073741824) {
            int v12 = v();
            float f9 = 0.0f;
            for (int i27 = 0; i27 < v12; i27++) {
                View u3 = u(i27);
                float c9 = this.f5289s.c(u3);
                if (c9 >= f9) {
                    ((W) u3.getLayoutParams()).getClass();
                    f9 = Math.max(f9, c9);
                }
            }
            int i28 = this.f5291u;
            int round = Math.round(f9 * this.f5286p);
            if (this.f5289s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5289s.l());
            }
            this.f5291u = round / this.f5286p;
            View.MeasureSpec.makeMeasureSpec(round, this.f5289s.i());
            if (this.f5291u != i28) {
                for (int i29 = 0; i29 < v12; i29++) {
                    View u6 = u(i29);
                    W w6 = (W) u6.getLayoutParams();
                    w6.getClass();
                    if (P0() && this.f5290t == 1) {
                        int i30 = -((this.f5286p - 1) - w6.f40621e.f25425e);
                        u6.offsetLeftAndRight((this.f5291u * i30) - (i30 * i28));
                    } else {
                        int i31 = w6.f40621e.f25425e;
                        int i32 = this.f5291u * i31;
                        int i33 = i31 * i28;
                        if (this.f5290t == 1) {
                            u6.offsetLeftAndRight(i32 - i33);
                        } else {
                            u6.offsetTopAndBottom(i32 - i33);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f5294x) {
                H0(c3675oP, c5000o, true);
                I0(c3675oP, c5000o, false);
            } else {
                I0(c3675oP, c5000o, true);
                H0(c3675oP, c5000o, false);
            }
        }
        if (z3 && !c5000o.f40578g && this.f5278C != 0 && v() > 0 && O0() != null) {
            RecyclerView recyclerView = this.f40541b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f5285K);
            }
        }
        z9 = false;
        if (c5000o.f40578g) {
            v9.a();
        }
        this.f5279D = v9.f40616c;
        this.f5280E = P0();
        if (z9) {
            v9.a();
            R0(c3675oP, c5000o, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f5290t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f5290t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (P0() == false) goto L37;
     */
    @Override // t0.AbstractC4990E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C3675oP c3675oP, C5000O c5000o) {
        View view2;
        int i6;
        if (v() != 0) {
            RecyclerView recyclerView = this.f40541b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.f40540a.f38406w).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                X0();
                if (i == 1) {
                    if (this.f5290t != 1) {
                    }
                    i6 = -1;
                } else if (i == 2) {
                    if (this.f5290t != 1) {
                    }
                    i6 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i6 = Integer.MIN_VALUE;
                }
                if (i6 != Integer.MIN_VALUE) {
                    W w6 = (W) view2.getLayoutParams();
                    w6.getClass();
                    I i9 = w6.f40621e;
                    int K02 = i6 == 1 ? K0() : J0();
                    a1(K02, c5000o);
                    Z0(i6);
                    C5021p c5021p = this.f5292v;
                    c5021p.f40740c = c5021p.f40741d + K02;
                    c5021p.f40739b = (int) (this.f5288r.l() * 0.33333334f);
                    c5021p.f40745h = true;
                    c5021p.f40738a = false;
                    E0(c3675oP, c5021p, c5000o);
                    this.f5279D = this.f5294x;
                    View g4 = i9.g(K02, i6);
                    if (g4 != null && g4 != view2) {
                        return g4;
                    }
                    if (S0(i6)) {
                        for (int i10 = this.f5286p - 1; i10 >= 0; i10--) {
                            View g9 = this.f5287q[i10].g(K02, i6);
                            if (g9 != null && g9 != view2) {
                                return g9;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < this.f5286p; i11++) {
                            View g10 = this.f5287q[i11].g(K02, i6);
                            if (g10 != null && g10 != view2) {
                                return g10;
                            }
                        }
                    }
                    boolean z3 = (this.f5293w ^ true) == (i6 == -1);
                    View q8 = q(z3 ? i9.c() : i9.d());
                    if (q8 != null && q8 != view2) {
                        return q8;
                    }
                    if (S0(i6)) {
                        for (int i12 = this.f5286p - 1; i12 >= 0; i12--) {
                            if (i12 != i9.f25425e) {
                                View q9 = q(z3 ? this.f5287q[i12].c() : this.f5287q[i12].d());
                                if (q9 != null && q9 != view2) {
                                    return q9;
                                }
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f5286p; i13++) {
                            View q10 = q(z3 ? this.f5287q[i13].c() : this.f5287q[i13].d());
                            if (q10 != null && q10 != view2) {
                                return q10;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean S0(int i) {
        if (this.f5290t == 0) {
            return (i == -1) != this.f5294x;
        }
        return ((i == -1) == this.f5294x) == P0();
    }

    @Override // t0.AbstractC4990E
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(false);
            View F02 = F0(false);
            if (G02 == null || F02 == null) {
                return;
            }
            int H8 = AbstractC4990E.H(G02);
            int H9 = AbstractC4990E.H(F02);
            if (H8 < H9) {
                accessibilityEvent.setFromIndex(H8);
                accessibilityEvent.setToIndex(H9);
            } else {
                accessibilityEvent.setFromIndex(H9);
                accessibilityEvent.setToIndex(H8);
            }
        }
    }

    public final void T0(int i, C5000O c5000o) {
        int J02;
        int i6;
        if (i > 0) {
            J02 = K0();
            i6 = 1;
        } else {
            J02 = J0();
            i6 = -1;
        }
        C5021p c5021p = this.f5292v;
        c5021p.f40738a = true;
        a1(J02, c5000o);
        Z0(i6);
        c5021p.f40740c = J02 + c5021p.f40741d;
        c5021p.f40739b = Math.abs(i);
    }

    public final void U0(C3675oP c3675oP, C5021p c5021p) {
        if (!c5021p.f40738a || c5021p.i) {
            return;
        }
        if (c5021p.f40739b == 0) {
            if (c5021p.f40742e == -1) {
                V0(c3675oP, c5021p.f40744g);
                return;
            } else {
                W0(c3675oP, c5021p.f40743f);
                return;
            }
        }
        int i = 1;
        if (c5021p.f40742e == -1) {
            int i6 = c5021p.f40743f;
            int h9 = this.f5287q[0].h(i6);
            while (i < this.f5286p) {
                int h10 = this.f5287q[i].h(i6);
                if (h10 > h9) {
                    h9 = h10;
                }
                i++;
            }
            int i9 = i6 - h9;
            V0(c3675oP, i9 < 0 ? c5021p.f40744g : c5021p.f40744g - Math.min(i9, c5021p.f40739b));
            return;
        }
        int i10 = c5021p.f40744g;
        int f3 = this.f5287q[0].f(i10);
        while (i < this.f5286p) {
            int f9 = this.f5287q[i].f(i10);
            if (f9 < f3) {
                f3 = f9;
            }
            i++;
        }
        int i11 = f3 - c5021p.f40744g;
        W0(c3675oP, i11 < 0 ? c5021p.f40743f : Math.min(i11, c5021p.f40739b) + c5021p.f40743f);
    }

    @Override // t0.AbstractC4990E
    public final void V(C3675oP c3675oP, C5000O c5000o, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof W)) {
            U(view, kVar);
            return;
        }
        W w6 = (W) layoutParams;
        if (this.f5290t == 0) {
            I i = w6.f40621e;
            kVar.j(j.a(i == null ? -1 : i.f25425e, 1, -1, -1, false));
        } else {
            I i6 = w6.f40621e;
            kVar.j(j.a(-1, -1, i6 == null ? -1 : i6.f25425e, 1, false));
        }
    }

    public final void V0(C3675oP c3675oP, int i) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u3 = u(v9);
            if (this.f5288r.e(u3) < i || this.f5288r.n(u3) < i) {
                return;
            }
            W w6 = (W) u3.getLayoutParams();
            w6.getClass();
            if (w6.f40621e.f25421a.size() == 1) {
                return;
            }
            I i6 = w6.f40621e;
            ArrayList arrayList = i6.f25421a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            W w9 = (W) view.getLayoutParams();
            w9.f40621e = null;
            if (w9.f40554a.h() || w9.f40554a.k()) {
                i6.f25424d -= ((StaggeredGridLayoutManager) i6.f25426f).f5288r.c(view);
            }
            if (size == 1) {
                i6.f25422b = Integer.MIN_VALUE;
            }
            i6.f25423c = Integer.MIN_VALUE;
            i0(u3, c3675oP);
        }
    }

    @Override // t0.AbstractC4990E
    public final void W(int i, int i6) {
        N0(i, i6, 1);
    }

    public final void W0(C3675oP c3675oP, int i) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f5288r.b(u3) > i || this.f5288r.m(u3) > i) {
                return;
            }
            W w6 = (W) u3.getLayoutParams();
            w6.getClass();
            if (w6.f40621e.f25421a.size() == 1) {
                return;
            }
            I i6 = w6.f40621e;
            ArrayList arrayList = i6.f25421a;
            View view = (View) arrayList.remove(0);
            W w9 = (W) view.getLayoutParams();
            w9.f40621e = null;
            if (arrayList.size() == 0) {
                i6.f25423c = Integer.MIN_VALUE;
            }
            if (w9.f40554a.h() || w9.f40554a.k()) {
                i6.f25424d -= ((StaggeredGridLayoutManager) i6.f25426f).f5288r.c(view);
            }
            i6.f25422b = Integer.MIN_VALUE;
            i0(u3, c3675oP);
        }
    }

    @Override // t0.AbstractC4990E
    public final void X() {
        e eVar = this.f5277B;
        int[] iArr = (int[]) eVar.f39302u;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        eVar.f39301n = null;
        l0();
    }

    public final void X0() {
        if (this.f5290t == 1 || !P0()) {
            this.f5294x = this.f5293w;
        } else {
            this.f5294x = !this.f5293w;
        }
    }

    @Override // t0.AbstractC4990E
    public final void Y(int i, int i6) {
        N0(i, i6, 8);
    }

    public final int Y0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        T0(i, c5000o);
        C5021p c5021p = this.f5292v;
        int E02 = E0(c3675oP, c5021p, c5000o);
        if (c5021p.f40739b >= E02) {
            i = i < 0 ? -E02 : E02;
        }
        this.f5288r.o(-i);
        this.f5279D = this.f5294x;
        c5021p.f40739b = 0;
        U0(c3675oP, c5021p);
        return i;
    }

    @Override // t0.AbstractC4990E
    public final void Z(int i, int i6) {
        N0(i, i6, 2);
    }

    public final void Z0(int i) {
        C5021p c5021p = this.f5292v;
        c5021p.f40742e = i;
        c5021p.f40741d = this.f5294x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < J0()) != r3.f5294x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f5294x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // t0.InterfaceC4999N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i6 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i6 == 0) {
            return null;
        }
        if (this.f5290t == 0) {
            pointF.x = i6;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i6;
        return pointF;
    }

    @Override // t0.AbstractC4990E
    public final void a0(int i, int i6) {
        N0(i, i6, 4);
    }

    public final void a1(int i, C5000O c5000o) {
        int i6;
        int i9;
        int i10;
        C5021p c5021p = this.f5292v;
        boolean z3 = false;
        c5021p.f40739b = 0;
        c5021p.f40740c = i;
        C5024s c5024s = this.f40544e;
        if (!(c5024s != null && c5024s.f40764e) || (i10 = c5000o.f40572a) == -1) {
            i6 = 0;
            i9 = 0;
        } else {
            if (this.f5294x == (i10 < i)) {
                i6 = this.f5288r.l();
                i9 = 0;
            } else {
                i9 = this.f5288r.l();
                i6 = 0;
            }
        }
        RecyclerView recyclerView = this.f40541b;
        if (recyclerView == null || !recyclerView.f5274z) {
            c5021p.f40744g = this.f5288r.f() + i6;
            c5021p.f40743f = -i9;
        } else {
            c5021p.f40743f = this.f5288r.k() - i9;
            c5021p.f40744g = this.f5288r.g() + i6;
        }
        c5021p.f40745h = false;
        c5021p.f40738a = true;
        if (this.f5288r.i() == 0 && this.f5288r.f() == 0) {
            z3 = true;
        }
        c5021p.i = z3;
    }

    @Override // t0.AbstractC4990E
    public final void b0(C3675oP c3675oP, C5000O c5000o) {
        R0(c3675oP, c5000o, true);
    }

    public final void b1(I i, int i6, int i9) {
        int i10 = i.f25424d;
        int i11 = i.f25425e;
        if (i6 != -1) {
            int i12 = i.f25423c;
            if (i12 == Integer.MIN_VALUE) {
                i.a();
                i12 = i.f25423c;
            }
            if (i12 - i10 >= i9) {
                this.f5295y.set(i11, false);
                return;
            }
            return;
        }
        int i13 = i.f25422b;
        if (i13 == Integer.MIN_VALUE) {
            View view = (View) i.f25421a.get(0);
            W w6 = (W) view.getLayoutParams();
            i.f25422b = ((StaggeredGridLayoutManager) i.f25426f).f5288r.e(view);
            w6.getClass();
            i13 = i.f25422b;
        }
        if (i13 + i10 <= i9) {
            this.f5295y.set(i11, false);
        }
    }

    @Override // t0.AbstractC4990E
    public final void c(String str) {
        if (this.f5281F == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC4990E
    public final void c0(C5000O c5000o) {
        this.f5296z = -1;
        this.f5276A = Integer.MIN_VALUE;
        this.f5281F = null;
        this.f5283H.a();
    }

    @Override // t0.AbstractC4990E
    public final boolean d() {
        return this.f5290t == 0;
    }

    @Override // t0.AbstractC4990E
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof Y) {
            this.f5281F = (Y) parcelable;
            l0();
        }
    }

    @Override // t0.AbstractC4990E
    public final boolean e() {
        return this.f5290t == 1;
    }

    @Override // t0.AbstractC4990E
    public final Parcelable e0() {
        int h9;
        int k9;
        int[] iArr;
        Y y7 = this.f5281F;
        if (y7 != null) {
            Y y9 = new Y();
            y9.f40631v = y7.f40631v;
            y9.f40629n = y7.f40629n;
            y9.f40630u = y7.f40630u;
            y9.f40632w = y7.f40632w;
            y9.f40633x = y7.f40633x;
            y9.f40634y = y7.f40634y;
            y9.f40626A = y7.f40626A;
            y9.f40627B = y7.f40627B;
            y9.f40628C = y7.f40628C;
            y9.f40635z = y7.f40635z;
            return y9;
        }
        Y y10 = new Y();
        y10.f40626A = this.f5293w;
        y10.f40627B = this.f5279D;
        y10.f40628C = this.f5280E;
        e eVar = this.f5277B;
        if (eVar == null || (iArr = (int[]) eVar.f39302u) == null) {
            y10.f40633x = 0;
        } else {
            y10.f40634y = iArr;
            y10.f40633x = iArr.length;
            y10.f40635z = (ArrayList) eVar.f39301n;
        }
        if (v() <= 0) {
            y10.f40629n = -1;
            y10.f40630u = -1;
            y10.f40631v = 0;
            return y10;
        }
        y10.f40629n = this.f5279D ? K0() : J0();
        View F02 = this.f5294x ? F0(true) : G0(true);
        y10.f40630u = F02 != null ? AbstractC4990E.H(F02) : -1;
        int i = this.f5286p;
        y10.f40631v = i;
        y10.f40632w = new int[i];
        for (int i6 = 0; i6 < this.f5286p; i6++) {
            if (this.f5279D) {
                h9 = this.f5287q[i6].f(Integer.MIN_VALUE);
                if (h9 != Integer.MIN_VALUE) {
                    k9 = this.f5288r.g();
                    h9 -= k9;
                    y10.f40632w[i6] = h9;
                } else {
                    y10.f40632w[i6] = h9;
                }
            } else {
                h9 = this.f5287q[i6].h(Integer.MIN_VALUE);
                if (h9 != Integer.MIN_VALUE) {
                    k9 = this.f5288r.k();
                    h9 -= k9;
                    y10.f40632w[i6] = h9;
                } else {
                    y10.f40632w[i6] = h9;
                }
            }
        }
        return y10;
    }

    @Override // t0.AbstractC4990E
    public final boolean f(C4991F c4991f) {
        return c4991f instanceof W;
    }

    @Override // t0.AbstractC4990E
    public final void f0(int i) {
        if (i == 0) {
            A0();
        }
    }

    @Override // t0.AbstractC4990E
    public final void h(int i, int i6, C5000O c5000o, C2780Sl c2780Sl) {
        C5021p c5021p;
        int f3;
        int i9;
        if (this.f5290t != 0) {
            i = i6;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        T0(i, c5000o);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f5286p) {
            this.J = new int[this.f5286p];
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f5286p;
            c5021p = this.f5292v;
            if (i10 >= i12) {
                break;
            }
            if (c5021p.f40741d == -1) {
                f3 = c5021p.f40743f;
                i9 = this.f5287q[i10].h(f3);
            } else {
                f3 = this.f5287q[i10].f(c5021p.f40744g);
                i9 = c5021p.f40744g;
            }
            int i13 = f3 - i9;
            if (i13 >= 0) {
                this.J[i11] = i13;
                i11++;
            }
            i10++;
        }
        Arrays.sort(this.J, 0, i11);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = c5021p.f40740c;
            if (i15 < 0 || i15 >= c5000o.b()) {
                return;
            }
            c2780Sl.a(c5021p.f40740c, this.J[i14]);
            c5021p.f40740c += c5021p.f40741d;
        }
    }

    @Override // t0.AbstractC4990E
    public final int j(C5000O c5000o) {
        return B0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int k(C5000O c5000o) {
        return C0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int l(C5000O c5000o) {
        return D0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int m(C5000O c5000o) {
        return B0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int m0(int i, C3675oP c3675oP, C5000O c5000o) {
        return Y0(i, c3675oP, c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int n(C5000O c5000o) {
        return C0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final void n0(int i) {
        Y y7 = this.f5281F;
        if (y7 != null && y7.f40629n != i) {
            y7.f40632w = null;
            y7.f40631v = 0;
            y7.f40629n = -1;
            y7.f40630u = -1;
        }
        this.f5296z = i;
        this.f5276A = Integer.MIN_VALUE;
        l0();
    }

    @Override // t0.AbstractC4990E
    public final int o(C5000O c5000o) {
        return D0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int o0(int i, C3675oP c3675oP, C5000O c5000o) {
        return Y0(i, c3675oP, c5000o);
    }

    @Override // t0.AbstractC4990E
    public final C4991F r() {
        return this.f5290t == 0 ? new W(-2, -1) : new W(-1, -2);
    }

    @Override // t0.AbstractC4990E
    public final void r0(Rect rect, int i, int i6) {
        int g4;
        int g9;
        int i9 = this.f5286p;
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5290t == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40541b;
            WeakHashMap weakHashMap = O.X.f2054a;
            g9 = AbstractC4990E.g(i6, height, recyclerView.getMinimumHeight());
            g4 = AbstractC4990E.g(i, (this.f5291u * i9) + F8, this.f40541b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40541b;
            WeakHashMap weakHashMap2 = O.X.f2054a;
            g4 = AbstractC4990E.g(i, width, recyclerView2.getMinimumWidth());
            g9 = AbstractC4990E.g(i6, (this.f5291u * i9) + D8, this.f40541b.getMinimumHeight());
        }
        this.f40541b.setMeasuredDimension(g4, g9);
    }

    @Override // t0.AbstractC4990E
    public final C4991F s(Context context, AttributeSet attributeSet) {
        return new W(context, attributeSet);
    }

    @Override // t0.AbstractC4990E
    public final C4991F t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new W((ViewGroup.MarginLayoutParams) layoutParams) : new W(layoutParams);
    }

    @Override // t0.AbstractC4990E
    public final int x(C3675oP c3675oP, C5000O c5000o) {
        return this.f5290t == 1 ? this.f5286p : super.x(c3675oP, c5000o);
    }

    @Override // t0.AbstractC4990E
    public final void x0(RecyclerView recyclerView, int i) {
        C5024s c5024s = new C5024s(recyclerView.getContext());
        c5024s.f40760a = i;
        y0(c5024s);
    }

    @Override // t0.AbstractC4990E
    public final boolean z0() {
        return this.f5281F == null;
    }
}
