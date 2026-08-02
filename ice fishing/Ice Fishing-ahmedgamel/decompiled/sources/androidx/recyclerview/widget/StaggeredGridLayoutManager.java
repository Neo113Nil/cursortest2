package androidx.recyclerview.widget;

import O.X;
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
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import k8.b;
import t0.AbstractC4987C;
import t0.C4986B;
import t0.C4988D;
import t0.C4997M;
import t0.C5003T;
import t0.C5004U;
import t0.C5019o;
import t0.C5022r;
import t0.InterfaceC4996L;
import t0.V;
import t0.W;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC4987C implements InterfaceC4996L {

    /* renamed from: B, reason: collision with root package name */
    public final b f5243B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5244C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5245D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5246E;

    /* renamed from: F, reason: collision with root package name */
    public W f5247F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f5248G;

    /* renamed from: H, reason: collision with root package name */
    public final C5003T f5249H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f5250I;
    public int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final r3.b f5251K;

    /* renamed from: p, reason: collision with root package name */
    public final int f5252p;

    /* renamed from: q, reason: collision with root package name */
    public final I[] f5253q;

    /* renamed from: r, reason: collision with root package name */
    public final g f5254r;

    /* renamed from: s, reason: collision with root package name */
    public final g f5255s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5256t;

    /* renamed from: u, reason: collision with root package name */
    public int f5257u;

    /* renamed from: v, reason: collision with root package name */
    public final C5019o f5258v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5259w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f5261y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5260x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f5262z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f5242A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f5252p = -1;
        this.f5259w = false;
        b bVar = new b();
        this.f5243B = bVar;
        this.f5244C = 2;
        this.f5248G = new Rect();
        this.f5249H = new C5003T(this);
        this.f5250I = true;
        this.f5251K = new r3.b(7, this);
        C4986B I8 = AbstractC4987C.I(context, attributeSet, i, i4);
        int i6 = I8.f40586a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i6 != this.f5256t) {
            this.f5256t = i6;
            g gVar = this.f5254r;
            this.f5254r = this.f5255s;
            this.f5255s = gVar;
            l0();
        }
        int i9 = I8.f40587b;
        c(null);
        if (i9 != this.f5252p) {
            int[] iArr = (int[]) bVar.f38633n;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            bVar.f38634u = null;
            l0();
            this.f5252p = i9;
            this.f5261y = new BitSet(this.f5252p);
            this.f5253q = new I[this.f5252p];
            for (int i10 = 0; i10 < this.f5252p; i10++) {
                this.f5253q[i10] = new I(this, i10);
            }
            l0();
        }
        boolean z6 = I8.f40588c;
        c(null);
        W w3 = this.f5247F;
        if (w3 != null && w3.f40676A != z6) {
            w3.f40676A = z6;
        }
        this.f5259w = z6;
        l0();
        C5019o c5019o = new C5019o();
        c5019o.f40785a = true;
        c5019o.f40790f = 0;
        c5019o.f40791g = 0;
        this.f5258v = c5019o;
        this.f5254r = g.a(this, this.f5256t);
        this.f5255s = g.a(this, 1 - this.f5256t);
    }

    public static int c1(int i, int i4, int i6) {
        int mode;
        return (!(i4 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i6), mode) : i;
    }

    public final boolean A0() {
        int J02;
        if (v() != 0 && this.f5244C != 0 && this.f40596g) {
            if (this.f5260x) {
                J02 = K0();
                J0();
            } else {
                J02 = J0();
                K0();
            }
            b bVar = this.f5243B;
            if (J02 == 0 && O0() != null) {
                int[] iArr = (int[]) bVar.f38633n;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f38634u = null;
                this.f40595f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int B0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5254r;
        boolean z6 = !this.f5250I;
        return h.a(c4997m, gVar, G0(z6), F0(z6), this, this.f5250I);
    }

    public final int C0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5254r;
        boolean z6 = !this.f5250I;
        return h.b(c4997m, gVar, G0(z6), F0(z6), this, this.f5250I, this.f5260x);
    }

    public final int D0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5254r;
        boolean z6 = !this.f5250I;
        return h.c(c4997m, gVar, G0(z6), F0(z6), this, this.f5250I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int E0(C3698oP c3698oP, C5019o c5019o, C4997M c4997m) {
        I i;
        ?? r62;
        int i4;
        int h3;
        int c9;
        int k9;
        int c10;
        int i6;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 1;
        this.f5261y.set(0, this.f5252p, true);
        C5019o c5019o2 = this.f5258v;
        int i13 = c5019o2.i ? c5019o.f40789e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c5019o.f40789e == 1 ? c5019o.f40791g + c5019o.f40786b : c5019o.f40790f - c5019o.f40786b;
        int i14 = c5019o.f40789e;
        for (int i15 = 0; i15 < this.f5252p; i15++) {
            if (!this.f5253q[i15].f26164a.isEmpty()) {
                b1(this.f5253q[i15], i14, i13);
            }
        }
        int g9 = this.f5260x ? this.f5254r.g() : this.f5254r.k();
        boolean z6 = false;
        while (true) {
            int i16 = c5019o.f40787c;
            if (((i16 < 0 || i16 >= c4997m.b()) ? i11 : i12) == 0 || (!c5019o2.i && this.f5261y.isEmpty())) {
                break;
            }
            View view = c3698oP.i(c5019o.f40787c, Long.MAX_VALUE).f40643a;
            c5019o.f40787c += c5019o.f40788d;
            C5004U c5004u = (C5004U) view.getLayoutParams();
            int b9 = c5004u.f40604a.b();
            b bVar = this.f5243B;
            int[] iArr = (int[]) bVar.f38633n;
            int i17 = (iArr == null || b9 >= iArr.length) ? -1 : iArr[b9];
            if (i17 == -1) {
                if (S0(c5019o.f40789e)) {
                    i10 = this.f5252p - i12;
                    i9 = -1;
                    i6 = -1;
                } else {
                    i6 = i12;
                    i9 = this.f5252p;
                    i10 = i11;
                }
                I i18 = null;
                if (c5019o.f40789e == i12) {
                    int k10 = this.f5254r.k();
                    int i19 = Integer.MAX_VALUE;
                    while (i10 != i9) {
                        I i20 = this.f5253q[i10];
                        int f2 = i20.f(k10);
                        if (f2 < i19) {
                            i19 = f2;
                            i18 = i20;
                        }
                        i10 += i6;
                    }
                } else {
                    int g10 = this.f5254r.g();
                    int i21 = Integer.MIN_VALUE;
                    while (i10 != i9) {
                        I i22 = this.f5253q[i10];
                        int h9 = i22.h(g10);
                        if (h9 > i21) {
                            i18 = i22;
                            i21 = h9;
                        }
                        i10 += i6;
                    }
                }
                i = i18;
                bVar.a(b9);
                ((int[]) bVar.f38633n)[b9] = i.f26168e;
            } else {
                i = this.f5253q[i17];
            }
            c5004u.f40671e = i;
            if (c5019o.f40789e == 1) {
                r62 = 0;
                b(view, -1, false);
            } else {
                r62 = 0;
                b(view, 0, false);
            }
            if (this.f5256t == 1) {
                i4 = 1;
                Q0(AbstractC4987C.w(this.f5257u, this.f40600l, r62, ((ViewGroup.MarginLayoutParams) c5004u).width, r62), AbstractC4987C.w(this.f40603o, this.f40601m, D() + G(), ((ViewGroup.MarginLayoutParams) c5004u).height, true), view);
            } else {
                i4 = 1;
                Q0(AbstractC4987C.w(this.f40602n, this.f40600l, F() + E(), ((ViewGroup.MarginLayoutParams) c5004u).width, true), AbstractC4987C.w(this.f5257u, this.f40601m, 0, ((ViewGroup.MarginLayoutParams) c5004u).height, false), view);
            }
            if (c5019o.f40789e == i4) {
                c9 = i.f(g9);
                h3 = this.f5254r.c(view) + c9;
            } else {
                h3 = i.h(g9);
                c9 = h3 - this.f5254r.c(view);
            }
            if (c5019o.f40789e == 1) {
                I i23 = c5004u.f40671e;
                i23.getClass();
                C5004U c5004u2 = (C5004U) view.getLayoutParams();
                c5004u2.f40671e = i23;
                ArrayList arrayList = i23.f26164a;
                arrayList.add(view);
                i23.f26166c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    i23.f26165b = Integer.MIN_VALUE;
                }
                if (c5004u2.f40604a.h() || c5004u2.f40604a.k()) {
                    i23.f26167d = ((StaggeredGridLayoutManager) i23.f26169f).f5254r.c(view) + i23.f26167d;
                }
            } else {
                I i24 = c5004u.f40671e;
                i24.getClass();
                C5004U c5004u3 = (C5004U) view.getLayoutParams();
                c5004u3.f40671e = i24;
                ArrayList arrayList2 = i24.f26164a;
                arrayList2.add(0, view);
                i24.f26165b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    i24.f26166c = Integer.MIN_VALUE;
                }
                if (c5004u3.f40604a.h() || c5004u3.f40604a.k()) {
                    i24.f26167d = ((StaggeredGridLayoutManager) i24.f26169f).f5254r.c(view) + i24.f26167d;
                }
            }
            if (P0() && this.f5256t == 1) {
                c10 = this.f5255s.g() - (((this.f5252p - 1) - i.f26168e) * this.f5257u);
                k9 = c10 - this.f5255s.c(view);
            } else {
                k9 = this.f5255s.k() + (i.f26168e * this.f5257u);
                c10 = this.f5255s.c(view) + k9;
            }
            if (this.f5256t == 1) {
                AbstractC4987C.N(view, k9, c9, c10, h3);
            } else {
                AbstractC4987C.N(view, c9, k9, h3, c10);
            }
            b1(i, c5019o2.f40789e, i13);
            U0(c3698oP, c5019o2);
            if (c5019o2.f40792h && view.hasFocusable()) {
                this.f5261y.set(i.f26168e, false);
            }
            i12 = 1;
            z6 = true;
            i11 = 0;
        }
        if (!z6) {
            U0(c3698oP, c5019o2);
        }
        int k11 = c5019o2.f40789e == -1 ? this.f5254r.k() - M0(this.f5254r.k()) : L0(this.f5254r.g()) - this.f5254r.g();
        if (k11 > 0) {
            return Math.min(c5019o.f40786b, k11);
        }
        return 0;
    }

    public final View F0(boolean z6) {
        int k9 = this.f5254r.k();
        int g9 = this.f5254r.g();
        View view = null;
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u6 = u(v9);
            int e9 = this.f5254r.e(u6);
            int b9 = this.f5254r.b(u6);
            if (b9 > k9 && e9 < g9) {
                if (b9 <= g9 || !z6) {
                    return u6;
                }
                if (view == null) {
                    view = u6;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z6) {
        int k9 = this.f5254r.k();
        int g9 = this.f5254r.g();
        int v9 = v();
        View view = null;
        for (int i = 0; i < v9; i++) {
            View u6 = u(i);
            int e9 = this.f5254r.e(u6);
            if (this.f5254r.b(u6) > k9 && e9 < g9) {
                if (e9 >= k9 || !z6) {
                    return u6;
                }
                if (view == null) {
                    view = u6;
                }
            }
        }
        return view;
    }

    public final void H0(C3698oP c3698oP, C4997M c4997m, boolean z6) {
        int g9;
        int L02 = L0(Integer.MIN_VALUE);
        if (L02 != Integer.MIN_VALUE && (g9 = this.f5254r.g() - L02) > 0) {
            int i = g9 - (-Y0(-g9, c3698oP, c4997m));
            if (!z6 || i <= 0) {
                return;
            }
            this.f5254r.o(i);
        }
    }

    public final void I0(C3698oP c3698oP, C4997M c4997m, boolean z6) {
        int k9;
        int M02 = M0(Integer.MAX_VALUE);
        if (M02 != Integer.MAX_VALUE && (k9 = M02 - this.f5254r.k()) > 0) {
            int Y02 = k9 - Y0(k9, c3698oP, c4997m);
            if (!z6 || Y02 <= 0) {
                return;
            }
            this.f5254r.o(-Y02);
        }
    }

    @Override // t0.AbstractC4987C
    public final int J(C3698oP c3698oP, C4997M c4997m) {
        return this.f5256t == 0 ? this.f5252p : super.J(c3698oP, c4997m);
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC4987C.H(u(0));
    }

    public final int K0() {
        int v9 = v();
        if (v9 == 0) {
            return 0;
        }
        return AbstractC4987C.H(u(v9 - 1));
    }

    @Override // t0.AbstractC4987C
    public final boolean L() {
        return this.f5244C != 0;
    }

    public final int L0(int i) {
        int f2 = this.f5253q[0].f(i);
        for (int i4 = 1; i4 < this.f5252p; i4++) {
            int f9 = this.f5253q[i4].f(i);
            if (f9 > f2) {
                f2 = f9;
            }
        }
        return f2;
    }

    public final int M0(int i) {
        int h3 = this.f5253q[0].h(i);
        for (int i4 = 1; i4 < this.f5252p; i4++) {
            int h9 = this.f5253q[i4].h(i);
            if (h9 < h3) {
                h3 = h9;
            }
        }
        return h3;
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
    public final void N0(int i, int i4, int i6) {
        int i9;
        int i10;
        b bVar;
        int[] iArr;
        ArrayList arrayList;
        V v9;
        int i11;
        int K02 = this.f5260x ? K0() : J0();
        if (i6 != 8) {
            i9 = i + i4;
        } else {
            if (i >= i4) {
                i9 = i + 1;
                i10 = i4;
                bVar = this.f5243B;
                iArr = (int[]) bVar.f38633n;
                if (iArr != null && i10 < iArr.length) {
                    arrayList = (ArrayList) bVar.f38634u;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                v9 = (V) ((ArrayList) bVar.f38634u).get(size);
                                if (v9.f40672n == i10) {
                                    break;
                                }
                            }
                        }
                        v9 = null;
                        if (v9 != null) {
                            ((ArrayList) bVar.f38634u).remove(v9);
                        }
                        int size2 = ((ArrayList) bVar.f38634u).size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                i12 = -1;
                                break;
                            } else if (((V) ((ArrayList) bVar.f38634u).get(i12)).f40672n >= i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 != -1) {
                            V v10 = (V) ((ArrayList) bVar.f38634u).get(i12);
                            ((ArrayList) bVar.f38634u).remove(i12);
                            i11 = v10.f40672n;
                            if (i11 == -1) {
                                int[] iArr2 = (int[]) bVar.f38633n;
                                Arrays.fill(iArr2, i10, iArr2.length, -1);
                                int length = ((int[]) bVar.f38633n).length;
                            } else {
                                Arrays.fill((int[]) bVar.f38633n, i10, i11 + 1, -1);
                            }
                        }
                    }
                    i11 = -1;
                    if (i11 == -1) {
                    }
                }
                if (i6 != 1) {
                    bVar.e(i, i4);
                } else if (i6 == 2) {
                    bVar.g(i, i4);
                } else if (i6 == 8) {
                    bVar.g(i, 1);
                    bVar.e(i4, 1);
                }
                if (i9 > K02) {
                    return;
                }
                if (i10 <= (this.f5260x ? J0() : K0())) {
                    l0();
                    return;
                }
                return;
            }
            i9 = i4 + 1;
        }
        i10 = i;
        bVar = this.f5243B;
        iArr = (int[]) bVar.f38633n;
        if (iArr != null) {
            arrayList = (ArrayList) bVar.f38634u;
            if (arrayList != null) {
            }
            i11 = -1;
            if (i11 == -1) {
            }
        }
        if (i6 != 1) {
        }
        if (i9 > K02) {
        }
    }

    @Override // t0.AbstractC4987C
    public final void O(int i) {
        super.O(i);
        for (int i4 = 0; i4 < this.f5252p; i4++) {
            I i6 = this.f5253q[i4];
            int i9 = i6.f26165b;
            if (i9 != Integer.MIN_VALUE) {
                i6.f26165b = i9 + i;
            }
            int i10 = i6.f26166c;
            if (i10 != Integer.MIN_VALUE) {
                i6.f26166c = i10 + i;
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
        BitSet bitSet = new BitSet(this.f5252p);
        bitSet.set(0, this.f5252p, true);
        char c9 = (this.f5256t == 1 && P0()) ? (char) 1 : (char) 65535;
        if (this.f5260x) {
            v9 = -1;
        } else {
            i = 0;
        }
        int i4 = i < v9 ? 1 : -1;
        while (i != v9) {
            View u6 = u(i);
            C5004U c5004u = (C5004U) u6.getLayoutParams();
            if (bitSet.get(c5004u.f40671e.f26168e)) {
                I i6 = c5004u.f40671e;
                if (this.f5260x) {
                    int i9 = i6.f26166c;
                    if (i9 == Integer.MIN_VALUE) {
                        i6.a();
                        i9 = i6.f26166c;
                    }
                    if (i9 < this.f5254r.g()) {
                        ArrayList arrayList = i6.f26164a;
                        ((C5004U) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u6;
                    }
                } else {
                    int i10 = i6.f26165b;
                    if (i10 == Integer.MIN_VALUE) {
                        View view = (View) i6.f26164a.get(0);
                        C5004U c5004u2 = (C5004U) view.getLayoutParams();
                        i6.f26165b = ((StaggeredGridLayoutManager) i6.f26169f).f5254r.e(view);
                        c5004u2.getClass();
                        i10 = i6.f26165b;
                    }
                    if (i10 > this.f5254r.k()) {
                        ((C5004U) ((View) i6.f26164a.get(0)).getLayoutParams()).getClass();
                        return u6;
                    }
                }
                bitSet.clear(c5004u.f40671e.f26168e);
            }
            i += i4;
            if (i != v9) {
                View u9 = u(i);
                if (this.f5260x) {
                    int b9 = this.f5254r.b(u6);
                    int b10 = this.f5254r.b(u9);
                    if (b9 < b10) {
                        return u6;
                    }
                    if (b9 == b10) {
                        if ((c5004u.f40671e.f26168e - ((C5004U) u9.getLayoutParams()).f40671e.f26168e >= 0) == (c9 >= 0)) {
                            return u6;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e9 = this.f5254r.e(u6);
                    int e10 = this.f5254r.e(u9);
                    if (e9 > e10) {
                        return u6;
                    }
                    if (e9 == e10) {
                        if ((c5004u.f40671e.f26168e - ((C5004U) u9.getLayoutParams()).f40671e.f26168e >= 0) == (c9 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // t0.AbstractC4987C
    public final void P(int i) {
        super.P(i);
        for (int i4 = 0; i4 < this.f5252p; i4++) {
            I i6 = this.f5253q[i4];
            int i9 = i6.f26165b;
            if (i9 != Integer.MIN_VALUE) {
                i6.f26165b = i9 + i;
            }
            int i10 = i6.f26166c;
            if (i10 != Integer.MIN_VALUE) {
                i6.f26166c = i10 + i;
            }
        }
    }

    public final boolean P0() {
        return C() == 1;
    }

    public final void Q0(int i, int i4, View view) {
        RecyclerView recyclerView = this.f40591b;
        Rect rect = this.f5248G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        C5004U c5004u = (C5004U) view.getLayoutParams();
        int c12 = c1(i, ((ViewGroup.MarginLayoutParams) c5004u).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c5004u).rightMargin + rect.right);
        int c13 = c1(i4, ((ViewGroup.MarginLayoutParams) c5004u).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c5004u).bottomMargin + rect.bottom);
        if (u0(view, c12, c13, c5004u)) {
            view.measure(c12, c13);
        }
    }

    @Override // t0.AbstractC4987C
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f40591b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5251K);
        }
        for (int i = 0; i < this.f5252p; i++) {
            this.f5253q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < J0()) != r16.f5260x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041e, code lost:
    
        if (A0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f5260x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(C3698oP c3698oP, C4997M c4997m, boolean z6) {
        W w3;
        int i;
        int i4;
        boolean z9;
        W w6 = this.f5247F;
        C5003T c5003t = this.f5249H;
        if (!(w6 == null && this.f5262z == -1) && c4997m.b() == 0) {
            g0(c3698oP);
            c5003t.a();
            return;
        }
        boolean z10 = true;
        boolean z11 = (c5003t.f40668e && this.f5262z == -1 && this.f5247F == null) ? false : true;
        b bVar = this.f5243B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c5003t.f40670g;
        if (z11) {
            c5003t.a();
            W w9 = this.f5247F;
            if (w9 != null) {
                int i6 = w9.f40681v;
                if (i6 > 0) {
                    if (i6 == this.f5252p) {
                        for (int i9 = 0; i9 < this.f5252p; i9++) {
                            this.f5253q[i9].b();
                            W w10 = this.f5247F;
                            int i10 = w10.f40682w[i9];
                            if (i10 != Integer.MIN_VALUE) {
                                i10 += w10.f40677B ? this.f5254r.g() : this.f5254r.k();
                            }
                            I i11 = this.f5253q[i9];
                            i11.f26165b = i10;
                            i11.f26166c = i10;
                        }
                    } else {
                        w9.f40682w = null;
                        w9.f40681v = 0;
                        w9.f40683x = 0;
                        w9.f40684y = null;
                        w9.f40685z = null;
                        w9.f40679n = w9.f40680u;
                    }
                }
                W w11 = this.f5247F;
                this.f5246E = w11.f40678C;
                boolean z12 = w11.f40676A;
                c(null);
                W w12 = this.f5247F;
                if (w12 != null && w12.f40676A != z12) {
                    w12.f40676A = z12;
                }
                this.f5259w = z12;
                l0();
                X0();
                W w13 = this.f5247F;
                int i12 = w13.f40679n;
                if (i12 != -1) {
                    this.f5262z = i12;
                    c5003t.f40666c = w13.f40677B;
                } else {
                    c5003t.f40666c = this.f5260x;
                }
                if (w13.f40683x > 1) {
                    bVar.f38633n = w13.f40684y;
                    bVar.f38634u = w13.f40685z;
                }
            } else {
                X0();
                c5003t.f40666c = this.f5260x;
            }
            if (!c4997m.f40628g && (i4 = this.f5262z) != -1) {
                if (i4 < 0 || i4 >= c4997m.b()) {
                    this.f5262z = -1;
                    this.f5242A = Integer.MIN_VALUE;
                } else {
                    W w14 = this.f5247F;
                    if (w14 == null || w14.f40679n == -1 || w14.f40681v < 1) {
                        View q8 = q(this.f5262z);
                        if (q8 != null) {
                            c5003t.f40664a = this.f5260x ? K0() : J0();
                            if (this.f5242A != Integer.MIN_VALUE) {
                                if (c5003t.f40666c) {
                                    c5003t.f40665b = (this.f5254r.g() - this.f5242A) - this.f5254r.b(q8);
                                } else {
                                    c5003t.f40665b = (this.f5254r.k() + this.f5242A) - this.f5254r.e(q8);
                                }
                            } else if (this.f5254r.c(q8) > this.f5254r.l()) {
                                c5003t.f40665b = c5003t.f40666c ? this.f5254r.g() : this.f5254r.k();
                            } else {
                                int e9 = this.f5254r.e(q8) - this.f5254r.k();
                                if (e9 < 0) {
                                    c5003t.f40665b = -e9;
                                } else {
                                    int g9 = this.f5254r.g() - this.f5254r.b(q8);
                                    if (g9 < 0) {
                                        c5003t.f40665b = g9;
                                    } else {
                                        c5003t.f40665b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i13 = this.f5262z;
                            c5003t.f40664a = i13;
                            int i14 = this.f5242A;
                            if (i14 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                c5003t.f40666c = z9;
                                c5003t.f40665b = z9 ? staggeredGridLayoutManager.f5254r.g() : staggeredGridLayoutManager.f5254r.k();
                            } else if (c5003t.f40666c) {
                                c5003t.f40665b = staggeredGridLayoutManager.f5254r.g() - i14;
                            } else {
                                c5003t.f40665b = staggeredGridLayoutManager.f5254r.k() + i14;
                            }
                            c5003t.f40667d = true;
                        }
                    } else {
                        c5003t.f40665b = Integer.MIN_VALUE;
                        c5003t.f40664a = this.f5262z;
                    }
                    c5003t.f40668e = true;
                }
            }
            if (this.f5245D) {
                int b9 = c4997m.b();
                for (int v9 = v() - 1; v9 >= 0; v9--) {
                    i = AbstractC4987C.H(u(v9));
                    if (i >= 0 && i < b9) {
                        break;
                    }
                }
                i = 0;
                c5003t.f40664a = i;
                c5003t.f40665b = Integer.MIN_VALUE;
                c5003t.f40668e = true;
            } else {
                int b10 = c4997m.b();
                int v10 = v();
                for (int i15 = 0; i15 < v10; i15++) {
                    int H8 = AbstractC4987C.H(u(i15));
                    if (H8 >= 0 && H8 < b10) {
                        i = H8;
                        break;
                    }
                }
                i = 0;
                c5003t.f40664a = i;
                c5003t.f40665b = Integer.MIN_VALUE;
                c5003t.f40668e = true;
            }
        }
        if (this.f5247F == null && this.f5262z == -1 && (c5003t.f40666c != this.f5245D || P0() != this.f5246E)) {
            int[] iArr = (int[]) bVar.f38633n;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            bVar.f38634u = null;
            c5003t.f40667d = true;
        }
        if (v() > 0 && ((w3 = this.f5247F) == null || w3.f40681v < 1)) {
            if (c5003t.f40667d) {
                for (int i16 = 0; i16 < this.f5252p; i16++) {
                    this.f5253q[i16].b();
                    int i17 = c5003t.f40665b;
                    if (i17 != Integer.MIN_VALUE) {
                        I i18 = this.f5253q[i16];
                        i18.f26165b = i17;
                        i18.f26166c = i17;
                    }
                }
            } else if (z11 || c5003t.f40669f == null) {
                for (int i19 = 0; i19 < this.f5252p; i19++) {
                    I i20 = this.f5253q[i19];
                    boolean z13 = this.f5260x;
                    int i21 = c5003t.f40665b;
                    int f2 = z13 ? i20.f(Integer.MIN_VALUE) : i20.h(Integer.MIN_VALUE);
                    i20.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) i20.f26169f;
                        if ((!z13 || f2 >= staggeredGridLayoutManager2.f5254r.g()) && (z13 || f2 <= staggeredGridLayoutManager2.f5254r.k())) {
                            if (i21 != Integer.MIN_VALUE) {
                                f2 += i21;
                            }
                            i20.f26166c = f2;
                            i20.f26165b = f2;
                        }
                    }
                }
                I[] iArr2 = this.f5253q;
                int length = iArr2.length;
                int[] iArr3 = c5003t.f40669f;
                if (iArr3 == null || iArr3.length < length) {
                    c5003t.f40669f = new int[staggeredGridLayoutManager.f5253q.length];
                }
                for (int i22 = 0; i22 < length; i22++) {
                    c5003t.f40669f[i22] = iArr2[i22].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i23 = 0; i23 < this.f5252p; i23++) {
                    I i24 = this.f5253q[i23];
                    i24.b();
                    int i25 = c5003t.f40669f[i23];
                    i24.f26165b = i25;
                    i24.f26166c = i25;
                }
            }
        }
        p(c3698oP);
        C5019o c5019o = this.f5258v;
        c5019o.f40785a = false;
        int l9 = this.f5255s.l();
        this.f5257u = l9 / this.f5252p;
        View.MeasureSpec.makeMeasureSpec(l9, this.f5255s.i());
        a1(c5003t.f40664a, c4997m);
        if (c5003t.f40666c) {
            Z0(-1);
            E0(c3698oP, c5019o, c4997m);
            Z0(1);
            c5019o.f40787c = c5003t.f40664a + c5019o.f40788d;
            E0(c3698oP, c5019o, c4997m);
        } else {
            Z0(1);
            E0(c3698oP, c5019o, c4997m);
            Z0(-1);
            c5019o.f40787c = c5003t.f40664a + c5019o.f40788d;
            E0(c3698oP, c5019o, c4997m);
        }
        if (this.f5255s.i() != 1073741824) {
            int v11 = v();
            float f9 = 0.0f;
            for (int i26 = 0; i26 < v11; i26++) {
                View u6 = u(i26);
                float c9 = this.f5255s.c(u6);
                if (c9 >= f9) {
                    ((C5004U) u6.getLayoutParams()).getClass();
                    f9 = Math.max(f9, c9);
                }
            }
            int i27 = this.f5257u;
            int round = Math.round(f9 * this.f5252p);
            if (this.f5255s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5255s.l());
            }
            this.f5257u = round / this.f5252p;
            View.MeasureSpec.makeMeasureSpec(round, this.f5255s.i());
            if (this.f5257u != i27) {
                for (int i28 = 0; i28 < v11; i28++) {
                    View u9 = u(i28);
                    C5004U c5004u = (C5004U) u9.getLayoutParams();
                    c5004u.getClass();
                    if (P0() && this.f5256t == 1) {
                        int i29 = -((this.f5252p - 1) - c5004u.f40671e.f26168e);
                        u9.offsetLeftAndRight((this.f5257u * i29) - (i29 * i27));
                    } else {
                        int i30 = c5004u.f40671e.f26168e;
                        int i31 = this.f5257u * i30;
                        int i32 = i30 * i27;
                        if (this.f5256t == 1) {
                            u9.offsetLeftAndRight(i31 - i32);
                        } else {
                            u9.offsetTopAndBottom(i31 - i32);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f5260x) {
                H0(c3698oP, c4997m, true);
                I0(c3698oP, c4997m, false);
            } else {
                I0(c3698oP, c4997m, true);
                H0(c3698oP, c4997m, false);
            }
        }
        if (z6 && !c4997m.f40628g && this.f5244C != 0 && v() > 0 && O0() != null) {
            RecyclerView recyclerView = this.f40591b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f5251K);
            }
        }
        z10 = false;
        if (c4997m.f40628g) {
            c5003t.a();
        }
        this.f5245D = c5003t.f40666c;
        this.f5246E = P0();
        if (z10) {
            c5003t.a();
            R0(c3698oP, c4997m, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f5256t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f5256t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (P0() == false) goto L37;
     */
    @Override // t0.AbstractC4987C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C3698oP c3698oP, C4997M c4997m) {
        View view2;
        int i4;
        if (v() != 0) {
            RecyclerView recyclerView = this.f40591b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.f40590a.f38918w).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                X0();
                if (i == 1) {
                    if (this.f5256t != 1) {
                    }
                    i4 = -1;
                } else if (i == 2) {
                    if (this.f5256t != 1) {
                    }
                    i4 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i4 = Integer.MIN_VALUE;
                }
                if (i4 != Integer.MIN_VALUE) {
                    C5004U c5004u = (C5004U) view2.getLayoutParams();
                    c5004u.getClass();
                    I i6 = c5004u.f40671e;
                    int K02 = i4 == 1 ? K0() : J0();
                    a1(K02, c4997m);
                    Z0(i4);
                    C5019o c5019o = this.f5258v;
                    c5019o.f40787c = c5019o.f40788d + K02;
                    c5019o.f40786b = (int) (this.f5254r.l() * 0.33333334f);
                    c5019o.f40792h = true;
                    c5019o.f40785a = false;
                    E0(c3698oP, c5019o, c4997m);
                    this.f5245D = this.f5260x;
                    View g9 = i6.g(K02, i4);
                    if (g9 != null && g9 != view2) {
                        return g9;
                    }
                    if (S0(i4)) {
                        for (int i9 = this.f5252p - 1; i9 >= 0; i9--) {
                            View g10 = this.f5253q[i9].g(K02, i4);
                            if (g10 != null && g10 != view2) {
                                return g10;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < this.f5252p; i10++) {
                            View g11 = this.f5253q[i10].g(K02, i4);
                            if (g11 != null && g11 != view2) {
                                return g11;
                            }
                        }
                    }
                    boolean z6 = (this.f5259w ^ true) == (i4 == -1);
                    View q8 = q(z6 ? i6.c() : i6.d());
                    if (q8 != null && q8 != view2) {
                        return q8;
                    }
                    if (S0(i4)) {
                        for (int i11 = this.f5252p - 1; i11 >= 0; i11--) {
                            if (i11 != i6.f26168e) {
                                View q9 = q(z6 ? this.f5253q[i11].c() : this.f5253q[i11].d());
                                if (q9 != null && q9 != view2) {
                                    return q9;
                                }
                            }
                        }
                    } else {
                        for (int i12 = 0; i12 < this.f5252p; i12++) {
                            View q10 = q(z6 ? this.f5253q[i12].c() : this.f5253q[i12].d());
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
        if (this.f5256t == 0) {
            return (i == -1) != this.f5260x;
        }
        return ((i == -1) == this.f5260x) == P0();
    }

    @Override // t0.AbstractC4987C
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(false);
            View F02 = F0(false);
            if (G02 == null || F02 == null) {
                return;
            }
            int H8 = AbstractC4987C.H(G02);
            int H9 = AbstractC4987C.H(F02);
            if (H8 < H9) {
                accessibilityEvent.setFromIndex(H8);
                accessibilityEvent.setToIndex(H9);
            } else {
                accessibilityEvent.setFromIndex(H9);
                accessibilityEvent.setToIndex(H8);
            }
        }
    }

    public final void T0(int i, C4997M c4997m) {
        int J02;
        int i4;
        if (i > 0) {
            J02 = K0();
            i4 = 1;
        } else {
            J02 = J0();
            i4 = -1;
        }
        C5019o c5019o = this.f5258v;
        c5019o.f40785a = true;
        a1(J02, c4997m);
        Z0(i4);
        c5019o.f40787c = J02 + c5019o.f40788d;
        c5019o.f40786b = Math.abs(i);
    }

    public final void U0(C3698oP c3698oP, C5019o c5019o) {
        if (!c5019o.f40785a || c5019o.i) {
            return;
        }
        if (c5019o.f40786b == 0) {
            if (c5019o.f40789e == -1) {
                V0(c3698oP, c5019o.f40791g);
                return;
            } else {
                W0(c3698oP, c5019o.f40790f);
                return;
            }
        }
        int i = 1;
        if (c5019o.f40789e == -1) {
            int i4 = c5019o.f40790f;
            int h3 = this.f5253q[0].h(i4);
            while (i < this.f5252p) {
                int h9 = this.f5253q[i].h(i4);
                if (h9 > h3) {
                    h3 = h9;
                }
                i++;
            }
            int i6 = i4 - h3;
            V0(c3698oP, i6 < 0 ? c5019o.f40791g : c5019o.f40791g - Math.min(i6, c5019o.f40786b));
            return;
        }
        int i9 = c5019o.f40791g;
        int f2 = this.f5253q[0].f(i9);
        while (i < this.f5252p) {
            int f9 = this.f5253q[i].f(i9);
            if (f9 < f2) {
                f2 = f9;
            }
            i++;
        }
        int i10 = f2 - c5019o.f40791g;
        W0(c3698oP, i10 < 0 ? c5019o.f40790f : Math.min(i10, c5019o.f40786b) + c5019o.f40790f);
    }

    @Override // t0.AbstractC4987C
    public final void V(C3698oP c3698oP, C4997M c4997m, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C5004U)) {
            U(view, kVar);
            return;
        }
        C5004U c5004u = (C5004U) layoutParams;
        if (this.f5256t == 0) {
            I i = c5004u.f40671e;
            kVar.j(j.a(i == null ? -1 : i.f26168e, 1, -1, -1, false));
        } else {
            I i4 = c5004u.f40671e;
            kVar.j(j.a(-1, -1, i4 == null ? -1 : i4.f26168e, 1, false));
        }
    }

    public final void V0(C3698oP c3698oP, int i) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u6 = u(v9);
            if (this.f5254r.e(u6) < i || this.f5254r.n(u6) < i) {
                return;
            }
            C5004U c5004u = (C5004U) u6.getLayoutParams();
            c5004u.getClass();
            if (c5004u.f40671e.f26164a.size() == 1) {
                return;
            }
            I i4 = c5004u.f40671e;
            ArrayList arrayList = i4.f26164a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C5004U c5004u2 = (C5004U) view.getLayoutParams();
            c5004u2.f40671e = null;
            if (c5004u2.f40604a.h() || c5004u2.f40604a.k()) {
                i4.f26167d -= ((StaggeredGridLayoutManager) i4.f26169f).f5254r.c(view);
            }
            if (size == 1) {
                i4.f26165b = Integer.MIN_VALUE;
            }
            i4.f26166c = Integer.MIN_VALUE;
            i0(u6, c3698oP);
        }
    }

    @Override // t0.AbstractC4987C
    public final void W(int i, int i4) {
        N0(i, i4, 1);
    }

    public final void W0(C3698oP c3698oP, int i) {
        while (v() > 0) {
            View u6 = u(0);
            if (this.f5254r.b(u6) > i || this.f5254r.m(u6) > i) {
                return;
            }
            C5004U c5004u = (C5004U) u6.getLayoutParams();
            c5004u.getClass();
            if (c5004u.f40671e.f26164a.size() == 1) {
                return;
            }
            I i4 = c5004u.f40671e;
            ArrayList arrayList = i4.f26164a;
            View view = (View) arrayList.remove(0);
            C5004U c5004u2 = (C5004U) view.getLayoutParams();
            c5004u2.f40671e = null;
            if (arrayList.size() == 0) {
                i4.f26166c = Integer.MIN_VALUE;
            }
            if (c5004u2.f40604a.h() || c5004u2.f40604a.k()) {
                i4.f26167d -= ((StaggeredGridLayoutManager) i4.f26169f).f5254r.c(view);
            }
            i4.f26165b = Integer.MIN_VALUE;
            i0(u6, c3698oP);
        }
    }

    @Override // t0.AbstractC4987C
    public final void X() {
        b bVar = this.f5243B;
        int[] iArr = (int[]) bVar.f38633n;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        bVar.f38634u = null;
        l0();
    }

    public final void X0() {
        if (this.f5256t == 1 || !P0()) {
            this.f5260x = this.f5259w;
        } else {
            this.f5260x = !this.f5259w;
        }
    }

    @Override // t0.AbstractC4987C
    public final void Y(int i, int i4) {
        N0(i, i4, 8);
    }

    public final int Y0(int i, C3698oP c3698oP, C4997M c4997m) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        T0(i, c4997m);
        C5019o c5019o = this.f5258v;
        int E02 = E0(c3698oP, c5019o, c4997m);
        if (c5019o.f40786b >= E02) {
            i = i < 0 ? -E02 : E02;
        }
        this.f5254r.o(-i);
        this.f5245D = this.f5260x;
        c5019o.f40786b = 0;
        U0(c3698oP, c5019o);
        return i;
    }

    @Override // t0.AbstractC4987C
    public final void Z(int i, int i4) {
        N0(i, i4, 2);
    }

    public final void Z0(int i) {
        C5019o c5019o = this.f5258v;
        c5019o.f40789e = i;
        c5019o.f40788d = this.f5260x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < J0()) != r3.f5260x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f5260x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // t0.InterfaceC4996L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i4 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i4 == 0) {
            return null;
        }
        if (this.f5256t == 0) {
            pointF.x = i4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i4;
        return pointF;
    }

    @Override // t0.AbstractC4987C
    public final void a0(int i, int i4) {
        N0(i, i4, 4);
    }

    public final void a1(int i, C4997M c4997m) {
        int i4;
        int i6;
        int i9;
        C5019o c5019o = this.f5258v;
        boolean z6 = false;
        c5019o.f40786b = 0;
        c5019o.f40787c = i;
        C5022r c5022r = this.f40594e;
        if (!(c5022r != null && c5022r.f40811e) || (i9 = c4997m.f40622a) == -1) {
            i4 = 0;
            i6 = 0;
        } else {
            if (this.f5260x == (i9 < i)) {
                i4 = this.f5254r.l();
                i6 = 0;
            } else {
                i6 = this.f5254r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView == null || !recyclerView.f5240z) {
            c5019o.f40791g = this.f5254r.f() + i4;
            c5019o.f40790f = -i6;
        } else {
            c5019o.f40790f = this.f5254r.k() - i6;
            c5019o.f40791g = this.f5254r.g() + i4;
        }
        c5019o.f40792h = false;
        c5019o.f40785a = true;
        if (this.f5254r.i() == 0 && this.f5254r.f() == 0) {
            z6 = true;
        }
        c5019o.i = z6;
    }

    @Override // t0.AbstractC4987C
    public final void b0(C3698oP c3698oP, C4997M c4997m) {
        R0(c3698oP, c4997m, true);
    }

    public final void b1(I i, int i4, int i6) {
        int i9 = i.f26167d;
        int i10 = i.f26168e;
        if (i4 != -1) {
            int i11 = i.f26166c;
            if (i11 == Integer.MIN_VALUE) {
                i.a();
                i11 = i.f26166c;
            }
            if (i11 - i9 >= i6) {
                this.f5261y.set(i10, false);
                return;
            }
            return;
        }
        int i12 = i.f26165b;
        if (i12 == Integer.MIN_VALUE) {
            View view = (View) i.f26164a.get(0);
            C5004U c5004u = (C5004U) view.getLayoutParams();
            i.f26165b = ((StaggeredGridLayoutManager) i.f26169f).f5254r.e(view);
            c5004u.getClass();
            i12 = i.f26165b;
        }
        if (i12 + i9 <= i6) {
            this.f5261y.set(i10, false);
        }
    }

    @Override // t0.AbstractC4987C
    public final void c(String str) {
        if (this.f5247F == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC4987C
    public final void c0(C4997M c4997m) {
        this.f5262z = -1;
        this.f5242A = Integer.MIN_VALUE;
        this.f5247F = null;
        this.f5249H.a();
    }

    @Override // t0.AbstractC4987C
    public final boolean d() {
        return this.f5256t == 0;
    }

    @Override // t0.AbstractC4987C
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof W) {
            this.f5247F = (W) parcelable;
            l0();
        }
    }

    @Override // t0.AbstractC4987C
    public final boolean e() {
        return this.f5256t == 1;
    }

    @Override // t0.AbstractC4987C
    public final Parcelable e0() {
        int h3;
        int k9;
        int[] iArr;
        W w3 = this.f5247F;
        if (w3 != null) {
            W w6 = new W();
            w6.f40681v = w3.f40681v;
            w6.f40679n = w3.f40679n;
            w6.f40680u = w3.f40680u;
            w6.f40682w = w3.f40682w;
            w6.f40683x = w3.f40683x;
            w6.f40684y = w3.f40684y;
            w6.f40676A = w3.f40676A;
            w6.f40677B = w3.f40677B;
            w6.f40678C = w3.f40678C;
            w6.f40685z = w3.f40685z;
            return w6;
        }
        W w9 = new W();
        w9.f40676A = this.f5259w;
        w9.f40677B = this.f5245D;
        w9.f40678C = this.f5246E;
        b bVar = this.f5243B;
        if (bVar == null || (iArr = (int[]) bVar.f38633n) == null) {
            w9.f40683x = 0;
        } else {
            w9.f40684y = iArr;
            w9.f40683x = iArr.length;
            w9.f40685z = (ArrayList) bVar.f38634u;
        }
        if (v() <= 0) {
            w9.f40679n = -1;
            w9.f40680u = -1;
            w9.f40681v = 0;
            return w9;
        }
        w9.f40679n = this.f5245D ? K0() : J0();
        View F02 = this.f5260x ? F0(true) : G0(true);
        w9.f40680u = F02 != null ? AbstractC4987C.H(F02) : -1;
        int i = this.f5252p;
        w9.f40681v = i;
        w9.f40682w = new int[i];
        for (int i4 = 0; i4 < this.f5252p; i4++) {
            if (this.f5245D) {
                h3 = this.f5253q[i4].f(Integer.MIN_VALUE);
                if (h3 != Integer.MIN_VALUE) {
                    k9 = this.f5254r.g();
                    h3 -= k9;
                    w9.f40682w[i4] = h3;
                } else {
                    w9.f40682w[i4] = h3;
                }
            } else {
                h3 = this.f5253q[i4].h(Integer.MIN_VALUE);
                if (h3 != Integer.MIN_VALUE) {
                    k9 = this.f5254r.k();
                    h3 -= k9;
                    w9.f40682w[i4] = h3;
                } else {
                    w9.f40682w[i4] = h3;
                }
            }
        }
        return w9;
    }

    @Override // t0.AbstractC4987C
    public final boolean f(C4988D c4988d) {
        return c4988d instanceof C5004U;
    }

    @Override // t0.AbstractC4987C
    public final void f0(int i) {
        if (i == 0) {
            A0();
        }
    }

    @Override // t0.AbstractC4987C
    public final void h(int i, int i4, C4997M c4997m, C2817Tl c2817Tl) {
        C5019o c5019o;
        int f2;
        int i6;
        if (this.f5256t != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        T0(i, c4997m);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f5252p) {
            this.J = new int[this.f5252p];
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f5252p;
            c5019o = this.f5258v;
            if (i9 >= i11) {
                break;
            }
            if (c5019o.f40788d == -1) {
                f2 = c5019o.f40790f;
                i6 = this.f5253q[i9].h(f2);
            } else {
                f2 = this.f5253q[i9].f(c5019o.f40791g);
                i6 = c5019o.f40791g;
            }
            int i12 = f2 - i6;
            if (i12 >= 0) {
                this.J[i10] = i12;
                i10++;
            }
            i9++;
        }
        Arrays.sort(this.J, 0, i10);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = c5019o.f40787c;
            if (i14 < 0 || i14 >= c4997m.b()) {
                return;
            }
            c2817Tl.a(c5019o.f40787c, this.J[i13]);
            c5019o.f40787c += c5019o.f40788d;
        }
    }

    @Override // t0.AbstractC4987C
    public final int j(C4997M c4997m) {
        return B0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int k(C4997M c4997m) {
        return C0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int l(C4997M c4997m) {
        return D0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int m(C4997M c4997m) {
        return B0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int m0(int i, C3698oP c3698oP, C4997M c4997m) {
        return Y0(i, c3698oP, c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int n(C4997M c4997m) {
        return C0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final void n0(int i) {
        W w3 = this.f5247F;
        if (w3 != null && w3.f40679n != i) {
            w3.f40682w = null;
            w3.f40681v = 0;
            w3.f40679n = -1;
            w3.f40680u = -1;
        }
        this.f5262z = i;
        this.f5242A = Integer.MIN_VALUE;
        l0();
    }

    @Override // t0.AbstractC4987C
    public final int o(C4997M c4997m) {
        return D0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int o0(int i, C3698oP c3698oP, C4997M c4997m) {
        return Y0(i, c3698oP, c4997m);
    }

    @Override // t0.AbstractC4987C
    public final C4988D r() {
        return this.f5256t == 0 ? new C5004U(-2, -1) : new C5004U(-1, -2);
    }

    @Override // t0.AbstractC4987C
    public final void r0(Rect rect, int i, int i4) {
        int g9;
        int g10;
        int i6 = this.f5252p;
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5256t == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40591b;
            WeakHashMap weakHashMap = X.f2142a;
            g10 = AbstractC4987C.g(i4, height, recyclerView.getMinimumHeight());
            g9 = AbstractC4987C.g(i, (this.f5257u * i6) + F8, this.f40591b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40591b;
            WeakHashMap weakHashMap2 = X.f2142a;
            g9 = AbstractC4987C.g(i, width, recyclerView2.getMinimumWidth());
            g10 = AbstractC4987C.g(i4, (this.f5257u * i6) + D8, this.f40591b.getMinimumHeight());
        }
        this.f40591b.setMeasuredDimension(g9, g10);
    }

    @Override // t0.AbstractC4987C
    public final C4988D s(Context context, AttributeSet attributeSet) {
        return new C5004U(context, attributeSet);
    }

    @Override // t0.AbstractC4987C
    public final C4988D t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5004U((ViewGroup.MarginLayoutParams) layoutParams) : new C5004U(layoutParams);
    }

    @Override // t0.AbstractC4987C
    public final int x(C3698oP c3698oP, C4997M c4997m) {
        return this.f5256t == 1 ? this.f5252p : super.x(c3698oP, c4997m);
    }

    @Override // t0.AbstractC4987C
    public final void x0(RecyclerView recyclerView, int i) {
        C5022r c5022r = new C5022r(recyclerView.getContext());
        c5022r.f40807a = i;
        y0(c5022r);
    }

    @Override // t0.AbstractC4987C
    public final boolean z0() {
        return this.f5247F == null;
    }
}
