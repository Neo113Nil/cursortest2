package androidx.recyclerview.widget;

import O.X;
import P.j;
import P.k;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.ads.C4085w4;
import com.google.android.gms.internal.ads.SO;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.Arrays;
import java.util.WeakHashMap;
import t0.AbstractC4990E;
import t0.C4991F;
import t0.C5000O;
import t0.C5019n;
import t0.C5020o;
import t0.C5022q;
import u1.h;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f5186E;

    /* renamed from: F, reason: collision with root package name */
    public int f5187F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f5188G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f5189H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f5190I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public final C5019n f5191K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f5192L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
        this.f5186E = false;
        this.f5187F = -1;
        this.f5190I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5191K = new C5019n(0);
        this.f5192L = new Rect();
        l1(AbstractC4990E.I(context, attributeSet, i, i6).f40537b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(C5000O c5000o, C5022q c5022q, C2780Sl c2780Sl) {
        int i;
        int i6 = this.f5187F;
        for (int i9 = 0; i9 < this.f5187F && (i = c5022q.f40749d) >= 0 && i < c5000o.b() && i6 > 0; i9++) {
            c2780Sl.a(c5022q.f40749d, Math.max(0, c5022q.f40752g));
            this.f5191K.getClass();
            i6--;
            c5022q.f40749d += c5022q.f40750e;
        }
    }

    @Override // t0.AbstractC4990E
    public final int J(C3675oP c3675oP, C5000O c5000o) {
        if (this.f5197p == 0) {
            return this.f5187F;
        }
        if (c5000o.b() < 1) {
            return 0;
        }
        return h1(c5000o.b() - 1, c3675oP, c5000o) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(C3675oP c3675oP, C5000O c5000o, int i, int i6, int i9) {
        G0();
        int k9 = this.f5199r.k();
        int g4 = this.f5199r.g();
        int i10 = i6 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i6) {
            View u3 = u(i);
            int H8 = AbstractC4990E.H(u3);
            if (H8 >= 0 && H8 < i9 && i1(H8, c3675oP, c5000o) == 0) {
                if (((C4991F) u3.getLayoutParams()).f40554a.h()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f5199r.e(u3) < g4 && this.f5199r.b(u3) >= k9) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
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
    
        if (((java.util.ArrayList) r22.f40540a.f38406w).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C3675oP c3675oP, C5000O c5000o) {
        View A9;
        int v9;
        int i6;
        int i9;
        View view2;
        View view3;
        int i10;
        int i11;
        C3675oP c3675oP2 = c3675oP;
        C5000O c5000o2 = c5000o;
        RecyclerView recyclerView = this.f40541b;
        if (recyclerView != null) {
            A9 = recyclerView.A(view);
            if (A9 != null) {
            }
        }
        A9 = null;
        if (A9 != null) {
            C5020o c5020o = (C5020o) A9.getLayoutParams();
            int i12 = c5020o.f40736e;
            int i13 = c5020o.f40737f + i12;
            if (super.S(view, i, c3675oP, c5000o) != null) {
                if ((F0(i) == 1) != this.f5202u) {
                    i9 = v() - 1;
                    v9 = -1;
                    i6 = -1;
                } else {
                    v9 = v();
                    i6 = 1;
                    i9 = 0;
                }
                boolean z3 = this.f5197p == 1 && S0();
                int h12 = h1(i9, c3675oP2, c5000o2);
                View view4 = null;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = i9;
                int i18 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i17 == v9) {
                        break;
                    }
                    int h13 = h1(i17, c3675oP2, c5000o2);
                    View u3 = u(i17);
                    if (u3 == A9) {
                        break;
                    }
                    if (!u3.hasFocusable() || h13 == h12) {
                        C5020o c5020o2 = (C5020o) u3.getLayoutParams();
                        int i19 = c5020o2.f40736e;
                        view3 = A9;
                        int i20 = c5020o2.f40737f + i19;
                        if (u3.hasFocusable() && i19 == i12 && i20 == i13) {
                            return u3;
                        }
                        if (!(u3.hasFocusable() && view4 == null) && (u3.hasFocusable() || view2 != null)) {
                            i10 = v9;
                            int min = Math.min(i20, i13) - Math.max(i19, i12);
                            if (u3.hasFocusable()) {
                                if (min <= i16) {
                                    if (min == i16) {
                                    }
                                    i11 = i16;
                                }
                                i11 = i16;
                            } else {
                                if (view4 == null) {
                                    i11 = i16;
                                    if (!this.f40542c.c(u3) || !this.f40543d.c(u3)) {
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
                            i10 = v9;
                        }
                        if (u3.hasFocusable()) {
                            int i21 = c5020o2.f40736e;
                            i16 = Math.min(i20, i13) - Math.max(i19, i12);
                            view4 = u3;
                            i15 = i21;
                            view5 = view2;
                        } else {
                            int i22 = c5020o2.f40736e;
                            view5 = u3;
                            i14 = i22;
                            i16 = i11;
                            i18 = Math.min(i20, i13) - Math.max(i19, i12);
                        }
                        i17 += i6;
                        c3675oP2 = c3675oP;
                        c5000o2 = c5000o;
                        A9 = view3;
                        v9 = i10;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A9;
                        i11 = i16;
                        i10 = v9;
                    }
                    view5 = view2;
                    i16 = i11;
                    i17 += i6;
                    c3675oP2 = c3675oP;
                    c5000o2 = c5000o;
                    A9 = view3;
                    v9 = i10;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f27479b = true;
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
    public final void T0(C3675oP c3675oP, C5000O c5000o, C5022q c5022q, SO so) {
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int w6;
        int i14;
        ?? r82;
        int i15;
        View b9;
        int j6 = this.f5199r.j();
        boolean z3 = j6 != 1073741824;
        int i16 = v() > 0 ? this.f5188G[this.f5187F] : 0;
        if (z3) {
            m1();
        }
        boolean z6 = c5022q.f40750e == 1;
        int i17 = this.f5187F;
        if (!z6) {
            i17 = i1(c5022q.f40749d, c3675oP, c5000o) + j1(c5022q.f40749d, c3675oP, c5000o);
        }
        int i18 = 0;
        while (i18 < this.f5187F && (i15 = c5022q.f40749d) >= 0 && i15 < c5000o.b() && i17 > 0) {
            int i19 = c5022q.f40749d;
            int j12 = j1(i19, c3675oP, c5000o);
            if (j12 > this.f5187F) {
                throw new IllegalArgumentException(h.e(this.f5187F, " spans.", AbstractC4404f.h(i19, j12, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            i17 -= j12;
            if (i17 < 0 || (b9 = c5022q.b(c3675oP)) == null) {
                break;
            }
            this.f5189H[i18] = b9;
            i18++;
        }
        if (z6) {
            i9 = 1;
            i6 = i18;
            i = 0;
        } else {
            i = i18 - 1;
            i6 = -1;
            i9 = -1;
        }
        int i20 = 0;
        while (i != i6) {
            View view = this.f5189H[i];
            C5020o c5020o = (C5020o) view.getLayoutParams();
            int j13 = j1(AbstractC4990E.H(view), c3675oP, c5000o);
            c5020o.f40737f = j13;
            c5020o.f40736e = i20;
            i20 += j13;
            i += i9;
        }
        float f3 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            View view2 = this.f5189H[i22];
            if (c5022q.f40755k != null) {
                r82 = 0;
                r82 = 0;
                if (z6) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z6) {
                r82 = 0;
                b(view2, -1, false);
            } else {
                r82 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f40541b;
            Rect rect = this.f5192L;
            if (recyclerView == null) {
                rect.set(r82, r82, r82, r82);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j6, r82);
            int c9 = this.f5199r.c(view2);
            if (c9 > i21) {
                i21 = c9;
            }
            float d2 = (this.f5199r.d(view2) * 1.0f) / ((C5020o) view2.getLayoutParams()).f40737f;
            if (d2 > f3) {
                f3 = d2;
            }
        }
        if (z3) {
            e1(Math.max(Math.round(f3 * this.f5187F), i16));
            i21 = 0;
            for (int i23 = 0; i23 < i18; i23++) {
                View view3 = this.f5189H[i23];
                k1(view3, 1073741824, true);
                int c10 = this.f5199r.c(view3);
                if (c10 > i21) {
                    i21 = c10;
                }
            }
        }
        for (int i24 = 0; i24 < i18; i24++) {
            View view4 = this.f5189H[i24];
            if (this.f5199r.c(view4) != i21) {
                C5020o c5020o2 = (C5020o) view4.getLayoutParams();
                Rect rect2 = c5020o2.f40555b;
                int i25 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c5020o2).topMargin + ((ViewGroup.MarginLayoutParams) c5020o2).bottomMargin;
                int i26 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c5020o2).leftMargin + ((ViewGroup.MarginLayoutParams) c5020o2).rightMargin;
                int g12 = g1(c5020o2.f40736e, c5020o2.f40737f);
                if (this.f5197p == 1) {
                    i14 = AbstractC4990E.w(g12, 1073741824, i26, ((ViewGroup.MarginLayoutParams) c5020o2).width, false);
                    w6 = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    w6 = AbstractC4990E.w(g12, 1073741824, i25, ((ViewGroup.MarginLayoutParams) c5020o2).height, false);
                    i14 = makeMeasureSpec;
                }
                if (w0(view4, i14, w6, (C4991F) view4.getLayoutParams())) {
                    view4.measure(i14, w6);
                }
            }
        }
        so.f27478a = i21;
        if (this.f5197p == 1) {
            if (c5022q.f40751f == -1) {
                int i27 = c5022q.f40747b;
                i13 = i27 - i21;
                i12 = i27;
            } else {
                i13 = c5022q.f40747b;
                i12 = i13 + i21;
            }
            i11 = 0;
            i10 = 0;
        } else {
            if (c5022q.f40751f == -1) {
                int i28 = c5022q.f40747b;
                i11 = i28 - i21;
                i10 = i28;
            } else {
                int i29 = c5022q.f40747b;
                i10 = i29 + i21;
                i11 = i29;
            }
            i12 = 0;
            i13 = 0;
        }
        for (int i30 = 0; i30 < i18; i30++) {
            View view5 = this.f5189H[i30];
            C5020o c5020o3 = (C5020o) view5.getLayoutParams();
            if (this.f5197p != 1) {
                int G7 = G() + this.f5188G[c5020o3.f40736e];
                i13 = G7;
                i12 = this.f5199r.d(view5) + G7;
            } else if (S0()) {
                int E8 = E() + this.f5188G[this.f5187F - c5020o3.f40736e];
                i10 = E8;
                i11 = E8 - this.f5199r.d(view5);
            } else {
                i11 = E() + this.f5188G[c5020o3.f40736e];
                i10 = this.f5199r.d(view5) + i11;
            }
            AbstractC4990E.N(view5, i11, i13, i10, i12);
            if (c5020o3.f40554a.h() || c5020o3.f40554a.k()) {
                so.f27480c = true;
            }
            so.f27481d = view5.hasFocusable() | so.f27481d;
        }
        Arrays.fill(this.f5189H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(C3675oP c3675oP, C5000O c5000o, C4085w4 c4085w4, int i) {
        m1();
        if (c5000o.b() > 0 && !c5000o.f40578g) {
            boolean z3 = i == 1;
            int i12 = i1(c4085w4.f34796c, c3675oP, c5000o);
            if (z3) {
                while (i12 > 0) {
                    int i6 = c4085w4.f34796c;
                    if (i6 <= 0) {
                        break;
                    }
                    int i9 = i6 - 1;
                    c4085w4.f34796c = i9;
                    i12 = i1(i9, c3675oP, c5000o);
                }
            } else {
                int b9 = c5000o.b() - 1;
                int i10 = c4085w4.f34796c;
                while (i10 < b9) {
                    int i11 = i10 + 1;
                    int i13 = i1(i11, c3675oP, c5000o);
                    if (i13 <= i12) {
                        break;
                    }
                    i10 = i11;
                    i12 = i13;
                }
                c4085w4.f34796c = i10;
            }
        }
        f1();
    }

    @Override // t0.AbstractC4990E
    public final void V(C3675oP c3675oP, C5000O c5000o, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C5020o)) {
            U(view, kVar);
            return;
        }
        C5020o c5020o = (C5020o) layoutParams;
        int h12 = h1(c5020o.f40554a.b(), c3675oP, c5000o);
        if (this.f5197p == 0) {
            kVar.j(j.a(c5020o.f40736e, c5020o.f40737f, h12, 1, false));
        } else {
            kVar.j(j.a(h12, 1, c5020o.f40736e, c5020o.f40737f, false));
        }
    }

    @Override // t0.AbstractC4990E
    public final void W(int i, int i6) {
        C5019n c5019n = this.f5191K;
        c5019n.d();
        ((SparseIntArray) c5019n.f40735v).clear();
    }

    @Override // t0.AbstractC4990E
    public final void X() {
        C5019n c5019n = this.f5191K;
        c5019n.d();
        ((SparseIntArray) c5019n.f40735v).clear();
    }

    @Override // t0.AbstractC4990E
    public final void Y(int i, int i6) {
        C5019n c5019n = this.f5191K;
        c5019n.d();
        ((SparseIntArray) c5019n.f40735v).clear();
    }

    @Override // t0.AbstractC4990E
    public final void Z(int i, int i6) {
        C5019n c5019n = this.f5191K;
        c5019n.d();
        ((SparseIntArray) c5019n.f40735v).clear();
    }

    @Override // t0.AbstractC4990E
    public final void a0(int i, int i6) {
        C5019n c5019n = this.f5191K;
        c5019n.d();
        ((SparseIntArray) c5019n.f40735v).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final void b0(C3675oP c3675oP, C5000O c5000o) {
        boolean z3 = c5000o.f40578g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.f5190I;
        if (z3) {
            int v9 = v();
            for (int i = 0; i < v9; i++) {
                C5020o c5020o = (C5020o) u(i).getLayoutParams();
                int b9 = c5020o.f40554a.b();
                sparseIntArray2.put(b9, c5020o.f40737f);
                sparseIntArray.put(b9, c5020o.f40736e);
            }
        }
        super.b0(c3675oP, c5000o);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final void c0(C5000O c5000o) {
        super.c0(c5000o);
        this.f5186E = false;
    }

    public final void e1(int i) {
        int i6;
        int[] iArr = this.f5188G;
        int i9 = this.f5187F;
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
                i6 = i11;
            } else {
                i6 = i11 + 1;
                i10 -= i9;
            }
            i13 += i6;
            iArr[i14] = i13;
        }
        this.f5188G = iArr;
    }

    @Override // t0.AbstractC4990E
    public final boolean f(C4991F c4991f) {
        return c4991f instanceof C5020o;
    }

    public final void f1() {
        View[] viewArr = this.f5189H;
        if (viewArr == null || viewArr.length != this.f5187F) {
            this.f5189H = new View[this.f5187F];
        }
    }

    public final int g1(int i, int i6) {
        if (this.f5197p != 1 || !S0()) {
            int[] iArr = this.f5188G;
            return iArr[i6 + i] - iArr[i];
        }
        int[] iArr2 = this.f5188G;
        int i9 = this.f5187F;
        return iArr2[i9 - i] - iArr2[(i9 - i) - i6];
    }

    public final int h1(int i, C3675oP c3675oP, C5000O c5000o) {
        boolean z3 = c5000o.f40578g;
        C5019n c5019n = this.f5191K;
        if (!z3) {
            int i6 = this.f5187F;
            c5019n.getClass();
            return C5019n.b(i, i6);
        }
        int b9 = c3675oP.b(i);
        if (b9 != -1) {
            int i9 = this.f5187F;
            c5019n.getClass();
            return C5019n.b(b9, i9);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, C3675oP c3675oP, C5000O c5000o) {
        boolean z3 = c5000o.f40578g;
        C5019n c5019n = this.f5191K;
        if (!z3) {
            int i6 = this.f5187F;
            c5019n.getClass();
            return i % i6;
        }
        int i9 = this.J.get(i, -1);
        if (i9 != -1) {
            return i9;
        }
        int b9 = c3675oP.b(i);
        if (b9 != -1) {
            int i10 = this.f5187F;
            c5019n.getClass();
            return b9 % i10;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, C3675oP c3675oP, C5000O c5000o) {
        boolean z3 = c5000o.f40578g;
        C5019n c5019n = this.f5191K;
        if (!z3) {
            c5019n.getClass();
            return 1;
        }
        int i6 = this.f5190I.get(i, -1);
        if (i6 != -1) {
            return i6;
        }
        if (c3675oP.b(i) != -1) {
            c5019n.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int k(C5000O c5000o) {
        return D0(c5000o);
    }

    public final void k1(View view, int i, boolean z3) {
        int i6;
        int i9;
        C5020o c5020o = (C5020o) view.getLayoutParams();
        Rect rect = c5020o.f40555b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c5020o).topMargin + ((ViewGroup.MarginLayoutParams) c5020o).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c5020o).leftMargin + ((ViewGroup.MarginLayoutParams) c5020o).rightMargin;
        int g12 = g1(c5020o.f40736e, c5020o.f40737f);
        if (this.f5197p == 1) {
            i9 = AbstractC4990E.w(g12, i, i11, ((ViewGroup.MarginLayoutParams) c5020o).width, false);
            i6 = AbstractC4990E.w(this.f5199r.l(), this.f40551m, i10, ((ViewGroup.MarginLayoutParams) c5020o).height, true);
        } else {
            int w6 = AbstractC4990E.w(g12, i, i10, ((ViewGroup.MarginLayoutParams) c5020o).height, false);
            int w9 = AbstractC4990E.w(this.f5199r.l(), this.f40550l, i11, ((ViewGroup.MarginLayoutParams) c5020o).width, true);
            i6 = w6;
            i9 = w9;
        }
        C4991F c4991f = (C4991F) view.getLayoutParams();
        if (z3 ? w0(view, i9, i6, c4991f) : u0(view, i9, i6, c4991f)) {
            view.measure(i9, i6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int l(C5000O c5000o) {
        return E0(c5000o);
    }

    public final void l1(int i) {
        if (i == this.f5187F) {
            return;
        }
        this.f5186E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "Span count should be at least 1. Provided "));
        }
        this.f5187F = i;
        this.f5191K.d();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int m0(int i, C3675oP c3675oP, C5000O c5000o) {
        m1();
        f1();
        return super.m0(i, c3675oP, c5000o);
    }

    public final void m1() {
        int D8;
        int G7;
        if (this.f5197p == 1) {
            D8 = this.f40552n - F();
            G7 = E();
        } else {
            D8 = this.f40553o - D();
            G7 = G();
        }
        e1(D8 - G7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int n(C5000O c5000o) {
        return D0(c5000o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int o(C5000O c5000o) {
        return E0(c5000o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final int o0(int i, C3675oP c3675oP, C5000O c5000o) {
        m1();
        f1();
        return super.o0(i, c3675oP, c5000o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final C4991F r() {
        return this.f5197p == 0 ? new C5020o(-2, -1) : new C5020o(-1, -2);
    }

    @Override // t0.AbstractC4990E
    public final void r0(Rect rect, int i, int i6) {
        int g4;
        int g9;
        if (this.f5188G == null) {
            super.r0(rect, i, i6);
        }
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5197p == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40541b;
            WeakHashMap weakHashMap = X.f2054a;
            g9 = AbstractC4990E.g(i6, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f5188G;
            g4 = AbstractC4990E.g(i, iArr[iArr.length - 1] + F8, this.f40541b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40541b;
            WeakHashMap weakHashMap2 = X.f2054a;
            g4 = AbstractC4990E.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f5188G;
            g9 = AbstractC4990E.g(i6, iArr2[iArr2.length - 1] + D8, this.f40541b.getMinimumHeight());
        }
        this.f40541b.setMeasuredDimension(g4, g9);
    }

    @Override // t0.AbstractC4990E
    public final C4991F s(Context context, AttributeSet attributeSet) {
        C5020o c5020o = new C5020o(context, attributeSet);
        c5020o.f40736e = -1;
        c5020o.f40737f = 0;
        return c5020o;
    }

    @Override // t0.AbstractC4990E
    public final C4991F t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C5020o c5020o = new C5020o((ViewGroup.MarginLayoutParams) layoutParams);
            c5020o.f40736e = -1;
            c5020o.f40737f = 0;
            return c5020o;
        }
        C5020o c5020o2 = new C5020o(layoutParams);
        c5020o2.f40736e = -1;
        c5020o2.f40737f = 0;
        return c5020o2;
    }

    @Override // t0.AbstractC4990E
    public final int x(C3675oP c3675oP, C5000O c5000o) {
        if (this.f5197p == 1) {
            return this.f5187F;
        }
        if (c5000o.b() < 1) {
            return 0;
        }
        return h1(c5000o.b() - 1, c3675oP, c5000o) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final boolean z0() {
        return this.f5207z == null && !this.f5186E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f5186E = false;
        this.f5187F = -1;
        this.f5190I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5191K = new C5019n(0);
        this.f5192L = new Rect();
        l1(i);
    }
}
