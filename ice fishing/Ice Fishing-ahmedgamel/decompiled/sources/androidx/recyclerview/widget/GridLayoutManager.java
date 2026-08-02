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
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.C4108w4;
import com.google.android.gms.internal.ads.SO;
import com.google.android.gms.internal.ads.Wv;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.C4639a;
import t0.AbstractC4987C;
import t0.C4988D;
import t0.C4997M;
import t0.C5018n;
import t0.C5020p;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f5153E;

    /* renamed from: F, reason: collision with root package name */
    public int f5154F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f5155G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f5156H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f5157I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public final C4639a f5158K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f5159L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f5153E = false;
        this.f5154F = -1;
        this.f5157I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5158K = new C4639a(2);
        this.f5159L = new Rect();
        l1(AbstractC4987C.I(context, attributeSet, i, i4).f40587b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(C4997M c4997m, C5020p c5020p, C2817Tl c2817Tl) {
        int i;
        int i4 = this.f5154F;
        for (int i6 = 0; i6 < this.f5154F && (i = c5020p.f40796d) >= 0 && i < c4997m.b() && i4 > 0; i6++) {
            c2817Tl.a(c5020p.f40796d, Math.max(0, c5020p.f40799g));
            this.f5158K.getClass();
            i4--;
            c5020p.f40796d += c5020p.f40797e;
        }
    }

    @Override // t0.AbstractC4987C
    public final int J(C3698oP c3698oP, C4997M c4997m) {
        if (this.f5164p == 0) {
            return this.f5154F;
        }
        if (c4997m.b() < 1) {
            return 0;
        }
        return h1(c4997m.b() - 1, c3698oP, c4997m) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(C3698oP c3698oP, C4997M c4997m, int i, int i4, int i6) {
        G0();
        int k9 = this.f5166r.k();
        int g9 = this.f5166r.g();
        int i9 = i4 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i4) {
            View u6 = u(i);
            int H8 = AbstractC4987C.H(u6);
            if (H8 >= 0 && H8 < i6 && i1(H8, c3698oP, c4997m) == 0) {
                if (((C4988D) u6.getLayoutParams()).f40604a.h()) {
                    if (view2 == null) {
                        view2 = u6;
                    }
                } else {
                    if (this.f5166r.e(u6) < g9 && this.f5166r.b(u6) >= k9) {
                        return u6;
                    }
                    if (view == null) {
                        view = u6;
                    }
                }
            }
            i += i9;
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
    
        if (((java.util.ArrayList) r22.f40590a.f38918w).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C3698oP c3698oP, C4997M c4997m) {
        View A9;
        int v9;
        int i4;
        int i6;
        View view2;
        View view3;
        int i9;
        int i10;
        C3698oP c3698oP2 = c3698oP;
        C4997M c4997m2 = c4997m;
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            A9 = recyclerView.A(view);
            if (A9 != null) {
            }
        }
        A9 = null;
        if (A9 != null) {
            C5018n c5018n = (C5018n) A9.getLayoutParams();
            int i11 = c5018n.f40783e;
            int i12 = c5018n.f40784f + i11;
            if (super.S(view, i, c3698oP, c4997m) != null) {
                if ((F0(i) == 1) != this.f5169u) {
                    i6 = v() - 1;
                    v9 = -1;
                    i4 = -1;
                } else {
                    v9 = v();
                    i4 = 1;
                    i6 = 0;
                }
                boolean z6 = this.f5164p == 1 && S0();
                int h12 = h1(i6, c3698oP2, c4997m2);
                View view4 = null;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = i6;
                int i17 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i16 == v9) {
                        break;
                    }
                    int h13 = h1(i16, c3698oP2, c4997m2);
                    View u6 = u(i16);
                    if (u6 == A9) {
                        break;
                    }
                    if (!u6.hasFocusable() || h13 == h12) {
                        C5018n c5018n2 = (C5018n) u6.getLayoutParams();
                        int i18 = c5018n2.f40783e;
                        view3 = A9;
                        int i19 = c5018n2.f40784f + i18;
                        if (u6.hasFocusable() && i18 == i11 && i19 == i12) {
                            return u6;
                        }
                        if (!(u6.hasFocusable() && view4 == null) && (u6.hasFocusable() || view2 != null)) {
                            i9 = v9;
                            int min = Math.min(i19, i12) - Math.max(i18, i11);
                            if (u6.hasFocusable()) {
                                if (min <= i15) {
                                    if (min == i15) {
                                    }
                                    i10 = i15;
                                }
                                i10 = i15;
                            } else {
                                if (view4 == null) {
                                    i10 = i15;
                                    if (!this.f40592c.g(u6) || !this.f40593d.g(u6)) {
                                        if (min <= i17) {
                                            if (min == i17) {
                                            }
                                        }
                                    }
                                }
                                i10 = i15;
                            }
                        } else {
                            i10 = i15;
                            i9 = v9;
                        }
                        if (u6.hasFocusable()) {
                            int i20 = c5018n2.f40783e;
                            i15 = Math.min(i19, i12) - Math.max(i18, i11);
                            view4 = u6;
                            i14 = i20;
                            view5 = view2;
                        } else {
                            int i21 = c5018n2.f40783e;
                            view5 = u6;
                            i13 = i21;
                            i15 = i10;
                            i17 = Math.min(i19, i12) - Math.max(i18, i11);
                        }
                        i16 += i4;
                        c3698oP2 = c3698oP;
                        c4997m2 = c4997m;
                        A9 = view3;
                        v9 = i9;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A9;
                        i10 = i15;
                        i9 = v9;
                    }
                    view5 = view2;
                    i15 = i10;
                    i16 += i4;
                    c3698oP2 = c3698oP;
                    c4997m2 = c4997m;
                    A9 = view3;
                    v9 = i9;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f28192b = true;
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
    public final void T0(C3698oP c3698oP, C4997M c4997m, C5020p c5020p, SO so) {
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int w3;
        int i13;
        ?? r82;
        int i14;
        View b9;
        int j6 = this.f5166r.j();
        boolean z6 = j6 != 1073741824;
        int i15 = v() > 0 ? this.f5155G[this.f5154F] : 0;
        if (z6) {
            m1();
        }
        boolean z9 = c5020p.f40797e == 1;
        int i16 = this.f5154F;
        if (!z9) {
            i16 = i1(c5020p.f40796d, c3698oP, c4997m) + j1(c5020p.f40796d, c3698oP, c4997m);
        }
        int i17 = 0;
        while (i17 < this.f5154F && (i14 = c5020p.f40796d) >= 0 && i14 < c4997m.b() && i16 > 0) {
            int i18 = c5020p.f40796d;
            int j12 = j1(i18, c3698oP, c4997m);
            if (j12 > this.f5154F) {
                throw new IllegalArgumentException(AbstractC5128c.e(this.f5154F, " spans.", Wv.j(i18, j12, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            i16 -= j12;
            if (i16 < 0 || (b9 = c5020p.b(c3698oP)) == null) {
                break;
            }
            this.f5156H[i17] = b9;
            i17++;
        }
        if (z9) {
            i6 = 1;
            i4 = i17;
            i = 0;
        } else {
            i = i17 - 1;
            i4 = -1;
            i6 = -1;
        }
        int i19 = 0;
        while (i != i4) {
            View view = this.f5156H[i];
            C5018n c5018n = (C5018n) view.getLayoutParams();
            int j13 = j1(AbstractC4987C.H(view), c3698oP, c4997m);
            c5018n.f40784f = j13;
            c5018n.f40783e = i19;
            i19 += j13;
            i += i6;
        }
        float f2 = 0.0f;
        int i20 = 0;
        for (int i21 = 0; i21 < i17; i21++) {
            View view2 = this.f5156H[i21];
            if (c5020p.f40802k != null) {
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
            RecyclerView recyclerView = this.f40591b;
            Rect rect = this.f5159L;
            if (recyclerView == null) {
                rect.set(r82, r82, r82, r82);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j6, r82);
            int c9 = this.f5166r.c(view2);
            if (c9 > i20) {
                i20 = c9;
            }
            float d9 = (this.f5166r.d(view2) * 1.0f) / ((C5018n) view2.getLayoutParams()).f40784f;
            if (d9 > f2) {
                f2 = d9;
            }
        }
        if (z6) {
            e1(Math.max(Math.round(f2 * this.f5154F), i15));
            i20 = 0;
            for (int i22 = 0; i22 < i17; i22++) {
                View view3 = this.f5156H[i22];
                k1(view3, 1073741824, true);
                int c10 = this.f5166r.c(view3);
                if (c10 > i20) {
                    i20 = c10;
                }
            }
        }
        for (int i23 = 0; i23 < i17; i23++) {
            View view4 = this.f5156H[i23];
            if (this.f5166r.c(view4) != i20) {
                C5018n c5018n2 = (C5018n) view4.getLayoutParams();
                Rect rect2 = c5018n2.f40605b;
                int i24 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c5018n2).topMargin + ((ViewGroup.MarginLayoutParams) c5018n2).bottomMargin;
                int i25 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c5018n2).leftMargin + ((ViewGroup.MarginLayoutParams) c5018n2).rightMargin;
                int g12 = g1(c5018n2.f40783e, c5018n2.f40784f);
                if (this.f5164p == 1) {
                    i13 = AbstractC4987C.w(g12, 1073741824, i25, ((ViewGroup.MarginLayoutParams) c5018n2).width, false);
                    w3 = View.MeasureSpec.makeMeasureSpec(i20 - i24, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20 - i25, 1073741824);
                    w3 = AbstractC4987C.w(g12, 1073741824, i24, ((ViewGroup.MarginLayoutParams) c5018n2).height, false);
                    i13 = makeMeasureSpec;
                }
                if (w0(view4, i13, w3, (C4988D) view4.getLayoutParams())) {
                    view4.measure(i13, w3);
                }
            }
        }
        so.f28191a = i20;
        if (this.f5164p == 1) {
            if (c5020p.f40798f == -1) {
                int i26 = c5020p.f40794b;
                i12 = i26 - i20;
                i11 = i26;
            } else {
                i12 = c5020p.f40794b;
                i11 = i12 + i20;
            }
            i10 = 0;
            i9 = 0;
        } else {
            if (c5020p.f40798f == -1) {
                int i27 = c5020p.f40794b;
                i10 = i27 - i20;
                i9 = i27;
            } else {
                int i28 = c5020p.f40794b;
                i9 = i28 + i20;
                i10 = i28;
            }
            i11 = 0;
            i12 = 0;
        }
        for (int i29 = 0; i29 < i17; i29++) {
            View view5 = this.f5156H[i29];
            C5018n c5018n3 = (C5018n) view5.getLayoutParams();
            if (this.f5164p != 1) {
                int G2 = G() + this.f5155G[c5018n3.f40783e];
                i12 = G2;
                i11 = this.f5166r.d(view5) + G2;
            } else if (S0()) {
                int E8 = E() + this.f5155G[this.f5154F - c5018n3.f40783e];
                i9 = E8;
                i10 = E8 - this.f5166r.d(view5);
            } else {
                i10 = E() + this.f5155G[c5018n3.f40783e];
                i9 = this.f5166r.d(view5) + i10;
            }
            AbstractC4987C.N(view5, i10, i12, i9, i11);
            if (c5018n3.f40604a.h() || c5018n3.f40604a.k()) {
                so.f28193c = true;
            }
            so.f28194d = view5.hasFocusable() | so.f28194d;
        }
        Arrays.fill(this.f5156H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(C3698oP c3698oP, C4997M c4997m, C4108w4 c4108w4, int i) {
        m1();
        if (c4997m.b() > 0 && !c4997m.f40628g) {
            boolean z6 = i == 1;
            int i12 = i1(c4108w4.f35565c, c3698oP, c4997m);
            if (z6) {
                while (i12 > 0) {
                    int i4 = c4108w4.f35565c;
                    if (i4 <= 0) {
                        break;
                    }
                    int i6 = i4 - 1;
                    c4108w4.f35565c = i6;
                    i12 = i1(i6, c3698oP, c4997m);
                }
            } else {
                int b9 = c4997m.b() - 1;
                int i9 = c4108w4.f35565c;
                while (i9 < b9) {
                    int i10 = i9 + 1;
                    int i13 = i1(i10, c3698oP, c4997m);
                    if (i13 <= i12) {
                        break;
                    }
                    i9 = i10;
                    i12 = i13;
                }
                c4108w4.f35565c = i9;
            }
        }
        f1();
    }

    @Override // t0.AbstractC4987C
    public final void V(C3698oP c3698oP, C4997M c4997m, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C5018n)) {
            U(view, kVar);
            return;
        }
        C5018n c5018n = (C5018n) layoutParams;
        int h12 = h1(c5018n.f40604a.b(), c3698oP, c4997m);
        if (this.f5164p == 0) {
            kVar.j(j.a(c5018n.f40783e, c5018n.f40784f, h12, 1, false));
        } else {
            kVar.j(j.a(h12, 1, c5018n.f40783e, c5018n.f40784f, false));
        }
    }

    @Override // t0.AbstractC4987C
    public final void W(int i, int i4) {
        C4639a c4639a = this.f5158K;
        c4639a.c();
        ((SparseIntArray) c4639a.f38565c).clear();
    }

    @Override // t0.AbstractC4987C
    public final void X() {
        C4639a c4639a = this.f5158K;
        c4639a.c();
        ((SparseIntArray) c4639a.f38565c).clear();
    }

    @Override // t0.AbstractC4987C
    public final void Y(int i, int i4) {
        C4639a c4639a = this.f5158K;
        c4639a.c();
        ((SparseIntArray) c4639a.f38565c).clear();
    }

    @Override // t0.AbstractC4987C
    public final void Z(int i, int i4) {
        C4639a c4639a = this.f5158K;
        c4639a.c();
        ((SparseIntArray) c4639a.f38565c).clear();
    }

    @Override // t0.AbstractC4987C
    public final void a0(int i, int i4) {
        C4639a c4639a = this.f5158K;
        c4639a.c();
        ((SparseIntArray) c4639a.f38565c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final void b0(C3698oP c3698oP, C4997M c4997m) {
        boolean z6 = c4997m.f40628g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.f5157I;
        if (z6) {
            int v9 = v();
            for (int i = 0; i < v9; i++) {
                C5018n c5018n = (C5018n) u(i).getLayoutParams();
                int b9 = c5018n.f40604a.b();
                sparseIntArray2.put(b9, c5018n.f40784f);
                sparseIntArray.put(b9, c5018n.f40783e);
            }
        }
        super.b0(c3698oP, c4997m);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final void c0(C4997M c4997m) {
        super.c0(c4997m);
        this.f5153E = false;
    }

    public final void e1(int i) {
        int i4;
        int[] iArr = this.f5155G;
        int i6 = this.f5154F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i6 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i / i6;
        int i11 = i % i6;
        int i12 = 0;
        for (int i13 = 1; i13 <= i6; i13++) {
            i9 += i11;
            if (i9 <= 0 || i6 - i9 >= i11) {
                i4 = i10;
            } else {
                i4 = i10 + 1;
                i9 -= i6;
            }
            i12 += i4;
            iArr[i13] = i12;
        }
        this.f5155G = iArr;
    }

    @Override // t0.AbstractC4987C
    public final boolean f(C4988D c4988d) {
        return c4988d instanceof C5018n;
    }

    public final void f1() {
        View[] viewArr = this.f5156H;
        if (viewArr == null || viewArr.length != this.f5154F) {
            this.f5156H = new View[this.f5154F];
        }
    }

    public final int g1(int i, int i4) {
        if (this.f5164p != 1 || !S0()) {
            int[] iArr = this.f5155G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.f5155G;
        int i6 = this.f5154F;
        return iArr2[i6 - i] - iArr2[(i6 - i) - i4];
    }

    public final int h1(int i, C3698oP c3698oP, C4997M c4997m) {
        boolean z6 = c4997m.f40628g;
        C4639a c4639a = this.f5158K;
        if (!z6) {
            int i4 = this.f5154F;
            c4639a.getClass();
            return C4639a.b(i, i4);
        }
        int b9 = c3698oP.b(i);
        if (b9 != -1) {
            int i6 = this.f5154F;
            c4639a.getClass();
            return C4639a.b(b9, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, C3698oP c3698oP, C4997M c4997m) {
        boolean z6 = c4997m.f40628g;
        C4639a c4639a = this.f5158K;
        if (!z6) {
            int i4 = this.f5154F;
            c4639a.getClass();
            return i % i4;
        }
        int i6 = this.J.get(i, -1);
        if (i6 != -1) {
            return i6;
        }
        int b9 = c3698oP.b(i);
        if (b9 != -1) {
            int i9 = this.f5154F;
            c4639a.getClass();
            return b9 % i9;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, C3698oP c3698oP, C4997M c4997m) {
        boolean z6 = c4997m.f40628g;
        C4639a c4639a = this.f5158K;
        if (!z6) {
            c4639a.getClass();
            return 1;
        }
        int i4 = this.f5157I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (c3698oP.b(i) != -1) {
            c4639a.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int k(C4997M c4997m) {
        return D0(c4997m);
    }

    public final void k1(View view, int i, boolean z6) {
        int i4;
        int i6;
        C5018n c5018n = (C5018n) view.getLayoutParams();
        Rect rect = c5018n.f40605b;
        int i9 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c5018n).topMargin + ((ViewGroup.MarginLayoutParams) c5018n).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c5018n).leftMargin + ((ViewGroup.MarginLayoutParams) c5018n).rightMargin;
        int g12 = g1(c5018n.f40783e, c5018n.f40784f);
        if (this.f5164p == 1) {
            i6 = AbstractC4987C.w(g12, i, i10, ((ViewGroup.MarginLayoutParams) c5018n).width, false);
            i4 = AbstractC4987C.w(this.f5166r.l(), this.f40601m, i9, ((ViewGroup.MarginLayoutParams) c5018n).height, true);
        } else {
            int w3 = AbstractC4987C.w(g12, i, i9, ((ViewGroup.MarginLayoutParams) c5018n).height, false);
            int w6 = AbstractC4987C.w(this.f5166r.l(), this.f40600l, i10, ((ViewGroup.MarginLayoutParams) c5018n).width, true);
            i4 = w3;
            i6 = w6;
        }
        C4988D c4988d = (C4988D) view.getLayoutParams();
        if (z6 ? w0(view, i6, i4, c4988d) : u0(view, i6, i4, c4988d)) {
            view.measure(i6, i4);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int l(C4997M c4997m) {
        return E0(c4997m);
    }

    public final void l1(int i) {
        if (i == this.f5154F) {
            return;
        }
        this.f5153E = true;
        if (i < 1) {
            throw new IllegalArgumentException(Wv.f(i, "Span count should be at least 1. Provided "));
        }
        this.f5154F = i;
        this.f5158K.c();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int m0(int i, C3698oP c3698oP, C4997M c4997m) {
        m1();
        f1();
        return super.m0(i, c3698oP, c4997m);
    }

    public final void m1() {
        int D8;
        int G2;
        if (this.f5164p == 1) {
            D8 = this.f40602n - F();
            G2 = E();
        } else {
            D8 = this.f40603o - D();
            G2 = G();
        }
        e1(D8 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int n(C4997M c4997m) {
        return D0(c4997m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int o(C4997M c4997m) {
        return E0(c4997m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final int o0(int i, C3698oP c3698oP, C4997M c4997m) {
        m1();
        f1();
        return super.o0(i, c3698oP, c4997m);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final C4988D r() {
        return this.f5164p == 0 ? new C5018n(-2, -1) : new C5018n(-1, -2);
    }

    @Override // t0.AbstractC4987C
    public final void r0(Rect rect, int i, int i4) {
        int g9;
        int g10;
        if (this.f5155G == null) {
            super.r0(rect, i, i4);
        }
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5164p == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40591b;
            WeakHashMap weakHashMap = X.f2142a;
            g10 = AbstractC4987C.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f5155G;
            g9 = AbstractC4987C.g(i, iArr[iArr.length - 1] + F8, this.f40591b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40591b;
            WeakHashMap weakHashMap2 = X.f2142a;
            g9 = AbstractC4987C.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f5155G;
            g10 = AbstractC4987C.g(i4, iArr2[iArr2.length - 1] + D8, this.f40591b.getMinimumHeight());
        }
        this.f40591b.setMeasuredDimension(g9, g10);
    }

    @Override // t0.AbstractC4987C
    public final C4988D s(Context context, AttributeSet attributeSet) {
        C5018n c5018n = new C5018n(context, attributeSet);
        c5018n.f40783e = -1;
        c5018n.f40784f = 0;
        return c5018n;
    }

    @Override // t0.AbstractC4987C
    public final C4988D t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C5018n c5018n = new C5018n((ViewGroup.MarginLayoutParams) layoutParams);
            c5018n.f40783e = -1;
            c5018n.f40784f = 0;
            return c5018n;
        }
        C5018n c5018n2 = new C5018n(layoutParams);
        c5018n2.f40783e = -1;
        c5018n2.f40784f = 0;
        return c5018n2;
    }

    @Override // t0.AbstractC4987C
    public final int x(C3698oP c3698oP, C4997M c4997m) {
        if (this.f5164p == 1) {
            return this.f5154F;
        }
        if (c4997m.b() < 1) {
            return 0;
        }
        return h1(c4997m.b() - 1, c3698oP, c4997m) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final boolean z0() {
        return this.f5174z == null && !this.f5153E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f5153E = false;
        this.f5154F = -1;
        this.f5157I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f5158K = new C4639a(2);
        this.f5159L = new Rect();
        l1(i);
    }
}
