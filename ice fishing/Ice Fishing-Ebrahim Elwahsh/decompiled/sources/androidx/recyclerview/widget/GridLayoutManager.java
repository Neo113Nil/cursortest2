package androidx.recyclerview.widget;

import O.X;
import P.j;
import P.k;
import S0.l;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import com.google.android.gms.internal.ads.C3203fP;
import com.google.android.gms.internal.ads.C3990u4;
import com.google.android.gms.internal.ads.CL;
import java.util.Arrays;
import java.util.WeakHashMap;
import t0.AbstractC5019C;
import t0.AbstractC5051n;
import t0.C5020D;
import t0.C5029M;
import t0.C5052o;
import t0.C5054q;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f5298E;

    /* renamed from: F, reason: collision with root package name */
    public int f5299F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f5300G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f5301H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f5302I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public final l f5303K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f5304L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f5298E = false;
        this.f5299F = -1;
        this.f5302I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5303K = new l(16);
        this.f5304L = new Rect();
        l1(AbstractC5019C.I(context, attributeSet, i, i4).f40559b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(C5029M c5029m, C5054q c5054q, C2830Vl c2830Vl) {
        int i;
        int i4 = this.f5299F;
        for (int i9 = 0; i9 < this.f5299F && (i = c5054q.f40768d) >= 0 && i < c5029m.b() && i4 > 0; i9++) {
            c2830Vl.a(c5054q.f40768d, Math.max(0, c5054q.f40771g));
            this.f5303K.getClass();
            i4--;
            c5054q.f40768d += c5054q.f40769e;
        }
    }

    @Override // t0.AbstractC5019C
    public final int J(BP bp, C5029M c5029m) {
        if (this.f5309p == 0) {
            return this.f5299F;
        }
        if (c5029m.b() < 1) {
            return 0;
        }
        return h1(c5029m.b() - 1, bp, c5029m) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(BP bp, C5029M c5029m, int i, int i4, int i9) {
        G0();
        int k6 = this.f5311r.k();
        int g9 = this.f5311r.g();
        int i10 = i4 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i4) {
            View u7 = u(i);
            int H6 = AbstractC5019C.H(u7);
            if (H6 >= 0 && H6 < i9 && i1(H6, bp, c5029m) == 0) {
                if (((C5020D) u7.getLayoutParams()).f40576a.h()) {
                    if (view2 == null) {
                        view2 = u7;
                    }
                } else {
                    if (this.f5311r.e(u7) < g9 && this.f5311r.b(u7) >= k6) {
                        return u7;
                    }
                    if (view == null) {
                        view = u7;
                    }
                }
            }
            i += i10;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f40562a.f39327d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, BP bp, C5029M c5029m) {
        View A8;
        int v6;
        int i4;
        int i9;
        View view2;
        View view3;
        int i10;
        int i11;
        BP bp2 = bp;
        C5029M c5029m2 = c5029m;
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            A8 = recyclerView.A(view);
            if (A8 != null) {
            }
        }
        A8 = null;
        if (A8 != null) {
            C5052o c5052o = (C5052o) A8.getLayoutParams();
            int i12 = c5052o.f40755e;
            int i13 = c5052o.f40756f + i12;
            if (super.S(view, i, bp, c5029m) != null) {
                if ((F0(i) == 1) != this.f5314u) {
                    i9 = v() - 1;
                    v6 = -1;
                    i4 = -1;
                } else {
                    v6 = v();
                    i4 = 1;
                    i9 = 0;
                }
                boolean z8 = this.f5309p == 1 && S0();
                int h12 = h1(i9, bp2, c5029m2);
                View view4 = null;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = i9;
                int i18 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i17 == v6) {
                        break;
                    }
                    int h13 = h1(i17, bp2, c5029m2);
                    View u7 = u(i17);
                    if (u7 == A8) {
                        break;
                    }
                    if (!u7.hasFocusable() || h13 == h12) {
                        C5052o c5052o2 = (C5052o) u7.getLayoutParams();
                        int i19 = c5052o2.f40755e;
                        view3 = A8;
                        int i20 = c5052o2.f40756f + i19;
                        if (u7.hasFocusable() && i19 == i12 && i20 == i13) {
                            return u7;
                        }
                        if (!(u7.hasFocusable() && view4 == null) && (u7.hasFocusable() || view2 != null)) {
                            i10 = v6;
                            int min = Math.min(i20, i13) - Math.max(i19, i12);
                            if (u7.hasFocusable()) {
                                if (min <= i16) {
                                    if (min == i16) {
                                    }
                                    i11 = i16;
                                }
                                i11 = i16;
                            } else {
                                if (view4 == null) {
                                    i11 = i16;
                                    if (!this.f40564c.y(u7) || !this.f40565d.y(u7)) {
                                        if (min <= i18) {
                                            if (min == i18) {
                                            }
                                        }
                                    }
                                }
                                i11 = i16;
                            }
                        } else {
                            i11 = i16;
                            i10 = v6;
                        }
                        if (u7.hasFocusable()) {
                            int i21 = c5052o2.f40755e;
                            i16 = Math.min(i20, i13) - Math.max(i19, i12);
                            view4 = u7;
                            i15 = i21;
                            view5 = view2;
                        } else {
                            int i22 = c5052o2.f40755e;
                            view5 = u7;
                            i14 = i22;
                            i16 = i11;
                            i18 = Math.min(i20, i13) - Math.max(i19, i12);
                        }
                        i17 += i4;
                        bp2 = bp;
                        c5029m2 = c5029m;
                        A8 = view3;
                        v6 = i10;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A8;
                        i11 = i16;
                        i10 = v6;
                    }
                    view5 = view2;
                    i16 = i11;
                    i17 += i4;
                    bp2 = bp;
                    c5029m2 = c5029m;
                    A8 = view3;
                    v6 = i10;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f30699b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(BP bp, C5029M c5029m, C5054q c5054q, C3203fP c3203fP) {
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int w9;
        int i14;
        ?? r82;
        int i15;
        View b9;
        int j9 = this.f5311r.j();
        boolean z8 = j9 != 1073741824;
        int i16 = v() > 0 ? this.f5300G[this.f5299F] : 0;
        if (z8) {
            m1();
        }
        boolean z9 = c5054q.f40769e == 1;
        int i17 = this.f5299F;
        if (!z9) {
            i17 = i1(c5054q.f40768d, bp, c5029m) + j1(c5054q.f40768d, bp, c5029m);
        }
        int i18 = 0;
        while (i18 < this.f5299F && (i15 = c5054q.f40768d) >= 0 && i15 < c5029m.b() && i17 > 0) {
            int i19 = c5054q.f40768d;
            int j12 = j1(i19, bp, c5029m);
            if (j12 > this.f5299F) {
                throw new IllegalArgumentException(AbstractC5051n.e(this.f5299F, " spans.", AbstractC5051n.h(i19, j12, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            i17 -= j12;
            if (i17 < 0 || (b9 = c5054q.b(bp)) == null) {
                break;
            }
            this.f5301H[i18] = b9;
            i18++;
        }
        if (z9) {
            i9 = 1;
            i4 = i18;
            i = 0;
        } else {
            i = i18 - 1;
            i4 = -1;
            i9 = -1;
        }
        int i20 = 0;
        while (i != i4) {
            View view = this.f5301H[i];
            C5052o c5052o = (C5052o) view.getLayoutParams();
            int j13 = j1(AbstractC5019C.H(view), bp, c5029m);
            c5052o.f40756f = j13;
            c5052o.f40755e = i20;
            i20 += j13;
            i += i9;
        }
        float f6 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            View view2 = this.f5301H[i22];
            if (c5054q.f40774k != null) {
                r82 = 0;
                r82 = 0;
                if (z9) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z9) {
                r82 = 0;
                b(view2, -1, false);
            } else {
                r82 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f40563b;
            Rect rect = this.f5304L;
            if (recyclerView == null) {
                rect.set(r82, r82, r82, r82);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j9, r82);
            int c4 = this.f5311r.c(view2);
            if (c4 > i21) {
                i21 = c4;
            }
            float d2 = (this.f5311r.d(view2) * 1.0f) / ((C5052o) view2.getLayoutParams()).f40756f;
            if (d2 > f6) {
                f6 = d2;
            }
        }
        if (z8) {
            e1(Math.max(Math.round(f6 * this.f5299F), i16));
            i21 = 0;
            for (int i23 = 0; i23 < i18; i23++) {
                View view3 = this.f5301H[i23];
                k1(view3, 1073741824, true);
                int c9 = this.f5311r.c(view3);
                if (c9 > i21) {
                    i21 = c9;
                }
            }
        }
        for (int i24 = 0; i24 < i18; i24++) {
            View view4 = this.f5301H[i24];
            if (this.f5311r.c(view4) != i21) {
                C5052o c5052o2 = (C5052o) view4.getLayoutParams();
                Rect rect2 = c5052o2.f40577b;
                int i25 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c5052o2).topMargin + ((ViewGroup.MarginLayoutParams) c5052o2).bottomMargin;
                int i26 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c5052o2).leftMargin + ((ViewGroup.MarginLayoutParams) c5052o2).rightMargin;
                int g12 = g1(c5052o2.f40755e, c5052o2.f40756f);
                if (this.f5309p == 1) {
                    i14 = AbstractC5019C.w(g12, 1073741824, i26, ((ViewGroup.MarginLayoutParams) c5052o2).width, false);
                    w9 = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    w9 = AbstractC5019C.w(g12, 1073741824, i25, ((ViewGroup.MarginLayoutParams) c5052o2).height, false);
                    i14 = makeMeasureSpec;
                }
                if (w0(view4, i14, w9, (C5020D) view4.getLayoutParams())) {
                    view4.measure(i14, w9);
                }
            }
        }
        c3203fP.f30698a = i21;
        if (this.f5309p == 1) {
            if (c5054q.f40770f == -1) {
                int i27 = c5054q.f40766b;
                i13 = i27 - i21;
                i12 = i27;
            } else {
                i13 = c5054q.f40766b;
                i12 = i13 + i21;
            }
            i11 = 0;
            i10 = 0;
        } else {
            if (c5054q.f40770f == -1) {
                int i28 = c5054q.f40766b;
                i11 = i28 - i21;
                i10 = i28;
            } else {
                int i29 = c5054q.f40766b;
                i10 = i29 + i21;
                i11 = i29;
            }
            i12 = 0;
            i13 = 0;
        }
        for (int i30 = 0; i30 < i18; i30++) {
            View view5 = this.f5301H[i30];
            C5052o c5052o3 = (C5052o) view5.getLayoutParams();
            if (this.f5309p != 1) {
                int G7 = G() + this.f5300G[c5052o3.f40755e];
                i13 = G7;
                i12 = this.f5311r.d(view5) + G7;
            } else if (S0()) {
                int E8 = E() + this.f5300G[this.f5299F - c5052o3.f40755e];
                i10 = E8;
                i11 = E8 - this.f5311r.d(view5);
            } else {
                i11 = E() + this.f5300G[c5052o3.f40755e];
                i10 = this.f5311r.d(view5) + i11;
            }
            AbstractC5019C.N(view5, i11, i13, i10, i12);
            if (c5052o3.f40576a.h() || c5052o3.f40576a.k()) {
                c3203fP.f30700c = true;
            }
            c3203fP.f30701d = view5.hasFocusable() | c3203fP.f30701d;
        }
        Arrays.fill(this.f5301H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(BP bp, C5029M c5029m, C3990u4 c3990u4, int i) {
        m1();
        if (c5029m.b() > 0 && !c5029m.f40600g) {
            boolean z8 = i == 1;
            int i12 = i1(c3990u4.f34530c, bp, c5029m);
            if (z8) {
                while (i12 > 0) {
                    int i4 = c3990u4.f34530c;
                    if (i4 <= 0) {
                        break;
                    }
                    int i9 = i4 - 1;
                    c3990u4.f34530c = i9;
                    i12 = i1(i9, bp, c5029m);
                }
            } else {
                int b9 = c5029m.b() - 1;
                int i10 = c3990u4.f34530c;
                while (i10 < b9) {
                    int i11 = i10 + 1;
                    int i13 = i1(i11, bp, c5029m);
                    if (i13 <= i12) {
                        break;
                    }
                    i10 = i11;
                    i12 = i13;
                }
                c3990u4.f34530c = i10;
            }
        }
        f1();
    }

    @Override // t0.AbstractC5019C
    public final void V(BP bp, C5029M c5029m, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C5052o)) {
            U(view, kVar);
            return;
        }
        C5052o c5052o = (C5052o) layoutParams;
        int h12 = h1(c5052o.f40576a.b(), bp, c5029m);
        if (this.f5309p == 0) {
            kVar.j(j.a(c5052o.f40755e, c5052o.f40756f, h12, 1, false));
        } else {
            kVar.j(j.a(h12, 1, c5052o.f40755e, c5052o.f40756f, false));
        }
    }

    @Override // t0.AbstractC5019C
    public final void W(int i, int i4) {
        l lVar = this.f5303K;
        lVar.p();
        ((SparseIntArray) lVar.f2911v).clear();
    }

    @Override // t0.AbstractC5019C
    public final void X() {
        l lVar = this.f5303K;
        lVar.p();
        ((SparseIntArray) lVar.f2911v).clear();
    }

    @Override // t0.AbstractC5019C
    public final void Y(int i, int i4) {
        l lVar = this.f5303K;
        lVar.p();
        ((SparseIntArray) lVar.f2911v).clear();
    }

    @Override // t0.AbstractC5019C
    public final void Z(int i, int i4) {
        l lVar = this.f5303K;
        lVar.p();
        ((SparseIntArray) lVar.f2911v).clear();
    }

    @Override // t0.AbstractC5019C
    public final void a0(int i, int i4) {
        l lVar = this.f5303K;
        lVar.p();
        ((SparseIntArray) lVar.f2911v).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z8) {
        if (z8) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final void b0(BP bp, C5029M c5029m) {
        boolean z8 = c5029m.f40600g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.f5302I;
        if (z8) {
            int v6 = v();
            for (int i = 0; i < v6; i++) {
                C5052o c5052o = (C5052o) u(i).getLayoutParams();
                int b9 = c5052o.f40576a.b();
                sparseIntArray2.put(b9, c5052o.f40756f);
                sparseIntArray.put(b9, c5052o.f40755e);
            }
        }
        super.b0(bp, c5029m);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final void c0(C5029M c5029m) {
        super.c0(c5029m);
        this.f5298E = false;
    }

    public final void e1(int i) {
        int i4;
        int[] iArr = this.f5300G;
        int i9 = this.f5299F;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i / i9;
        int i12 = i % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 <= 0 || i9 - i10 >= i12) {
                i4 = i11;
            } else {
                i4 = i11 + 1;
                i10 -= i9;
            }
            i13 += i4;
            iArr[i14] = i13;
        }
        this.f5300G = iArr;
    }

    @Override // t0.AbstractC5019C
    public final boolean f(C5020D c5020d) {
        return c5020d instanceof C5052o;
    }

    public final void f1() {
        View[] viewArr = this.f5301H;
        if (viewArr == null || viewArr.length != this.f5299F) {
            this.f5301H = new View[this.f5299F];
        }
    }

    public final int g1(int i, int i4) {
        if (this.f5309p != 1 || !S0()) {
            int[] iArr = this.f5300G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.f5300G;
        int i9 = this.f5299F;
        return iArr2[i9 - i] - iArr2[(i9 - i) - i4];
    }

    public final int h1(int i, BP bp, C5029M c5029m) {
        boolean z8 = c5029m.f40600g;
        l lVar = this.f5303K;
        if (!z8) {
            int i4 = this.f5299F;
            lVar.getClass();
            return l.o(i, i4);
        }
        int b9 = bp.b(i);
        if (b9 != -1) {
            int i9 = this.f5299F;
            lVar.getClass();
            return l.o(b9, i9);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, BP bp, C5029M c5029m) {
        boolean z8 = c5029m.f40600g;
        l lVar = this.f5303K;
        if (!z8) {
            int i4 = this.f5299F;
            lVar.getClass();
            return i % i4;
        }
        int i9 = this.J.get(i, -1);
        if (i9 != -1) {
            return i9;
        }
        int b9 = bp.b(i);
        if (b9 != -1) {
            int i10 = this.f5299F;
            lVar.getClass();
            return b9 % i10;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, BP bp, C5029M c5029m) {
        boolean z8 = c5029m.f40600g;
        l lVar = this.f5303K;
        if (!z8) {
            lVar.getClass();
            return 1;
        }
        int i4 = this.f5302I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (bp.b(i) != -1) {
            lVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int k(C5029M c5029m) {
        return D0(c5029m);
    }

    public final void k1(View view, int i, boolean z8) {
        int i4;
        int i9;
        C5052o c5052o = (C5052o) view.getLayoutParams();
        Rect rect = c5052o.f40577b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c5052o).topMargin + ((ViewGroup.MarginLayoutParams) c5052o).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c5052o).leftMargin + ((ViewGroup.MarginLayoutParams) c5052o).rightMargin;
        int g12 = g1(c5052o.f40755e, c5052o.f40756f);
        if (this.f5309p == 1) {
            i9 = AbstractC5019C.w(g12, i, i11, ((ViewGroup.MarginLayoutParams) c5052o).width, false);
            i4 = AbstractC5019C.w(this.f5311r.l(), this.f40573m, i10, ((ViewGroup.MarginLayoutParams) c5052o).height, true);
        } else {
            int w9 = AbstractC5019C.w(g12, i, i10, ((ViewGroup.MarginLayoutParams) c5052o).height, false);
            int w10 = AbstractC5019C.w(this.f5311r.l(), this.f40572l, i11, ((ViewGroup.MarginLayoutParams) c5052o).width, true);
            i4 = w9;
            i9 = w10;
        }
        C5020D c5020d = (C5020D) view.getLayoutParams();
        if (z8 ? w0(view, i9, i4, c5020d) : u0(view, i9, i4, c5020d)) {
            view.measure(i9, i4);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int l(C5029M c5029m) {
        return E0(c5029m);
    }

    public final void l1(int i) {
        if (i == this.f5299F) {
            return;
        }
        this.f5298E = true;
        if (i < 1) {
            throw new IllegalArgumentException(CL.i(i, "Span count should be at least 1. Provided "));
        }
        this.f5299F = i;
        this.f5303K.p();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int m0(int i, BP bp, C5029M c5029m) {
        m1();
        f1();
        return super.m0(i, bp, c5029m);
    }

    public final void m1() {
        int D8;
        int G7;
        if (this.f5309p == 1) {
            D8 = this.f40574n - F();
            G7 = E();
        } else {
            D8 = this.f40575o - D();
            G7 = G();
        }
        e1(D8 - G7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int n(C5029M c5029m) {
        return D0(c5029m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int o(C5029M c5029m) {
        return E0(c5029m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final int o0(int i, BP bp, C5029M c5029m) {
        m1();
        f1();
        return super.o0(i, bp, c5029m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final C5020D r() {
        return this.f5309p == 0 ? new C5052o(-2, -1) : new C5052o(-1, -2);
    }

    @Override // t0.AbstractC5019C
    public final void r0(Rect rect, int i, int i4) {
        int g9;
        int g10;
        if (this.f5300G == null) {
            super.r0(rect, i, i4);
        }
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5309p == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40563b;
            WeakHashMap weakHashMap = X.f2240a;
            g10 = AbstractC5019C.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f5300G;
            g9 = AbstractC5019C.g(i, iArr[iArr.length - 1] + F8, this.f40563b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40563b;
            WeakHashMap weakHashMap2 = X.f2240a;
            g9 = AbstractC5019C.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f5300G;
            g10 = AbstractC5019C.g(i4, iArr2[iArr2.length - 1] + D8, this.f40563b.getMinimumHeight());
        }
        this.f40563b.setMeasuredDimension(g9, g10);
    }

    @Override // t0.AbstractC5019C
    public final C5020D s(Context context, AttributeSet attributeSet) {
        C5052o c5052o = new C5052o(context, attributeSet);
        c5052o.f40755e = -1;
        c5052o.f40756f = 0;
        return c5052o;
    }

    @Override // t0.AbstractC5019C
    public final C5020D t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C5052o c5052o = new C5052o((ViewGroup.MarginLayoutParams) layoutParams);
            c5052o.f40755e = -1;
            c5052o.f40756f = 0;
            return c5052o;
        }
        C5052o c5052o2 = new C5052o(layoutParams);
        c5052o2.f40755e = -1;
        c5052o2.f40756f = 0;
        return c5052o2;
    }

    @Override // t0.AbstractC5019C
    public final int x(BP bp, C5029M c5029m) {
        if (this.f5309p == 1) {
            return this.f5299F;
        }
        if (c5029m.b() < 1) {
            return 0;
        }
        return h1(c5029m.b() - 1, bp, c5029m) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final boolean z0() {
        return this.f5319z == null && !this.f5298E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f5298E = false;
        this.f5299F = -1;
        this.f5302I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5303K = new l(16);
        this.f5304L = new Rect();
        l1(i);
    }
}
