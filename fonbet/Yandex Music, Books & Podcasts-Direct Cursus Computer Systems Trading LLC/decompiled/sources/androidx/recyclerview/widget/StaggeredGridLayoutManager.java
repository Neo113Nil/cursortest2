package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.amh;
import defpackage.atn;
import defpackage.gc9;
import defpackage.har;
import defpackage.i7g;
import defpackage.iar;
import defpackage.jar;
import defpackage.jpn;
import defpackage.kar;
import defpackage.kpn;
import defpackage.ll4;
import defpackage.qgg;
import defpackage.sqf;
import defpackage.ub;
import defpackage.vb;
import defpackage.vz1;
import defpackage.wdu;
import defpackage.xon;
import defpackage.xq0;
import defpackage.yon;
import defpackage.ywq;
import defpackage.yyo;
import defpackage.zon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends yon implements jpn {
    public int A;
    public final atn B;
    public final int C;
    public boolean D;
    public boolean E;
    public kar F;
    public final Rect G;
    public final har H;
    public final boolean I;
    public int[] J;
    public final yyo K;
    public int p;
    public ywq[] q;
    public final gc9 r;
    public final gc9 s;
    public final int t;
    public int u;
    public final sqf v;
    public boolean w;
    public boolean x;
    public BitSet y;
    public int z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new atn(9, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new har(this);
        this.I = true;
        this.K = new yyo(4, this);
        xon g0 = yon.g0(context, attributeSet, i, i2);
        int i3 = g0.a;
        if (i3 != 0 && i3 != 1) {
            xq0.x("invalid orientation.");
            throw null;
        }
        v(null);
        if (i3 != this.t) {
            this.t = i3;
            gc9 gc9Var = this.r;
            this.r = this.s;
            this.s = gc9Var;
            R0();
        }
        E1(g0.b);
        boolean z = g0.c;
        v(null);
        kar karVar = this.F;
        if (karVar != null && karVar.h != z) {
            karVar.h = z;
        }
        this.w = z;
        R0();
        this.v = new sqf();
        this.r = gc9.a(this, this.t);
        this.s = gc9.a(this, 1 - this.t);
    }

    public static int H1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.yon
    public final void A0() {
        this.B.B();
        R0();
    }

    public final void A1(amh amhVar, int i) {
        while (Q() > 0) {
            View P = P(0);
            if (this.r.b(P) > i || this.r.p(P) > i) {
                return;
            }
            iar iarVar = (iar) P.getLayoutParams();
            iarVar.getClass();
            if (iarVar.e.a.size() == 1) {
                return;
            }
            ywq ywqVar = iarVar.e;
            ArrayList arrayList = ywqVar.a;
            View view = (View) arrayList.remove(0);
            iar iarVar2 = (iar) view.getLayoutParams();
            iarVar2.e = null;
            if (arrayList.size() == 0) {
                ywqVar.c = Integer.MIN_VALUE;
            }
            if (iarVar2.a.k() || iarVar2.a.n()) {
                ywqVar.d -= ((StaggeredGridLayoutManager) ywqVar.f).r.c(view);
            }
            ywqVar.b = Integer.MIN_VALUE;
            O0(P);
            amhVar.i(P);
        }
    }

    @Override // defpackage.yon
    public final void B(int i, int i2, kpn kpnVar, ll4 ll4Var) {
        sqf sqfVar;
        int g;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (Q() == 0 || i == 0) {
            return;
        }
        x1(i, kpnVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.p;
            sqfVar = this.v;
            if (i4 >= i6) {
                break;
            }
            if (sqfVar.d == -1) {
                g = sqfVar.f;
                i3 = this.q[i4].j(g);
            } else {
                g = this.q[i4].g(sqfVar.g);
                i3 = sqfVar.g;
            }
            int i7 = g - i3;
            if (i7 >= 0) {
                this.J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = sqfVar.c;
            if (i9 < 0 || i9 >= kpnVar.b()) {
                return;
            }
            ll4Var.b(sqfVar.c, this.J[i8]);
            sqfVar.c += sqfVar.d;
        }
    }

    @Override // defpackage.yon
    public final void B0(int i, int i2) {
        r1(i, i2, 8);
    }

    public final void B1() {
        if (this.t == 1 || !t1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.yon
    public final void C0(int i, int i2) {
        r1(i, i2, 2);
    }

    public final int C1(int i, amh amhVar, kpn kpnVar) {
        if (Q() == 0 || i == 0) {
            return 0;
        }
        x1(i, kpnVar);
        sqf sqfVar = this.v;
        int i1 = i1(amhVar, sqfVar, kpnVar);
        if (sqfVar.b >= i1) {
            i = i < 0 ? -i1 : i1;
        }
        this.r.r(-i);
        this.D = this.x;
        sqfVar.b = 0;
        y1(amhVar, sqfVar);
        return i;
    }

    @Override // defpackage.yon
    public final int D(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return qgg.F(kpnVar, this.r, k1(z), j1(z), this, this.I);
    }

    @Override // defpackage.yon
    public final void D0(int i, int i2) {
        r1(i, i2, 4);
    }

    public final void D1(int i) {
        sqf sqfVar = this.v;
        sqfVar.e = i;
        sqfVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.yon
    public final int E(kpn kpnVar) {
        return h1(kpnVar);
    }

    @Override // defpackage.yon
    public final void E0(amh amhVar, kpn kpnVar) {
        v1(amhVar, kpnVar, true);
    }

    public final void E1(int i) {
        v(null);
        if (i != this.p) {
            this.B.B();
            R0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new ywq[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new ywq(this, i2);
            }
            R0();
        }
    }

    @Override // defpackage.yon
    public final int F(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return qgg.H(kpnVar, this.r, k1(z), j1(z), this, this.I);
    }

    @Override // defpackage.yon
    public void F0(kpn kpnVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void F1(int i, kpn kpnVar) {
        int i2;
        int i3;
        int i4;
        sqf sqfVar = this.v;
        boolean z = false;
        sqfVar.b = 0;
        sqfVar.c = i;
        i7g i7gVar = this.e;
        if (i7gVar == null || !i7gVar.e || (i4 = kpnVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            boolean z2 = this.x;
            boolean z3 = i4 < i;
            gc9 gc9Var = this.r;
            if (z2 == z3) {
                i2 = gc9Var.o();
                i3 = 0;
            } else {
                i3 = gc9Var.o();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.h) {
            sqfVar.g = this.r.f() + i2;
            sqfVar.f = -i3;
        } else {
            sqfVar.f = this.r.n() - i3;
            sqfVar.g = this.r.g() + i2;
        }
        sqfVar.h = false;
        sqfVar.a = true;
        if (this.r.j() == 0 && this.r.f() == 0) {
            z = true;
        }
        sqfVar.i = z;
    }

    @Override // defpackage.yon
    public final int G(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return qgg.F(kpnVar, this.r, k1(z), j1(z), this, this.I);
    }

    public final void G1(ywq ywqVar, int i, int i2) {
        int i3 = ywqVar.d;
        int i4 = ywqVar.e;
        if (i != -1) {
            int i5 = ywqVar.c;
            if (i5 == Integer.MIN_VALUE) {
                ywqVar.b();
                i5 = ywqVar.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ywqVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ywqVar.a.get(0);
            iar iarVar = (iar) view.getLayoutParams();
            ywqVar.b = ((StaggeredGridLayoutManager) ywqVar.f).r.e(view);
            iarVar.getClass();
            i6 = ywqVar.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // defpackage.yon
    public final int H(kpn kpnVar) {
        return h1(kpnVar);
    }

    @Override // defpackage.yon
    public final void H0(Parcelable parcelable) {
        if (parcelable instanceof kar) {
            kar karVar = (kar) parcelable;
            this.F = karVar;
            if (this.z != -1) {
                karVar.a = -1;
                karVar.b = -1;
                karVar.d = null;
                karVar.c = 0;
                karVar.e = 0;
                karVar.f = null;
                karVar.g = null;
            }
            R0();
        }
    }

    @Override // defpackage.yon
    public final int I(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return qgg.H(kpnVar, this.r, k1(z), j1(z), this, this.I);
    }

    @Override // defpackage.yon
    public final Parcelable I0() {
        int j;
        int n;
        int[] iArr;
        kar karVar = this.F;
        if (karVar != null) {
            kar karVar2 = new kar();
            karVar2.c = karVar.c;
            karVar2.a = karVar.a;
            karVar2.b = karVar.b;
            karVar2.d = karVar.d;
            karVar2.e = karVar.e;
            karVar2.f = karVar.f;
            karVar2.h = karVar.h;
            karVar2.i = karVar.i;
            karVar2.j = karVar.j;
            karVar2.g = karVar.g;
            return karVar2;
        }
        kar karVar3 = new kar();
        karVar3.h = this.w;
        karVar3.i = this.D;
        karVar3.j = this.E;
        atn atnVar = this.B;
        if (atnVar == null || (iArr = (int[]) atnVar.b) == null) {
            karVar3.e = 0;
        } else {
            karVar3.f = iArr;
            karVar3.e = iArr.length;
            karVar3.g = (ArrayList) atnVar.c;
        }
        if (Q() <= 0) {
            karVar3.a = -1;
            karVar3.b = -1;
            karVar3.c = 0;
            return karVar3;
        }
        karVar3.a = this.D ? o1() : n1();
        View j1 = this.x ? j1(true) : k1(true);
        karVar3.b = j1 != null ? yon.f0(j1) : -1;
        int i = this.p;
        karVar3.c = i;
        karVar3.d = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            boolean z = this.D;
            ywq[] ywqVarArr = this.q;
            if (z) {
                j = ywqVarArr[i2].g(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    n = this.r.g();
                    j -= n;
                    karVar3.d[i2] = j;
                } else {
                    karVar3.d[i2] = j;
                }
            } else {
                j = ywqVarArr[i2].j(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    n = this.r.n();
                    j -= n;
                    karVar3.d[i2] = j;
                } else {
                    karVar3.d[i2] = j;
                }
            }
        }
        return karVar3;
    }

    @Override // defpackage.yon
    public final void J0(int i) {
        if (i == 0) {
            g1();
        }
    }

    @Override // defpackage.yon
    public final zon M() {
        return this.t == 0 ? new iar(-2, -1) : new iar(-1, -2);
    }

    @Override // defpackage.yon
    public final zon N(Context context, AttributeSet attributeSet) {
        return new iar(context, attributeSet);
    }

    @Override // defpackage.yon
    public final zon O(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new iar((ViewGroup.MarginLayoutParams) layoutParams) : new iar(layoutParams);
    }

    @Override // defpackage.yon
    public final int S(amh amhVar, kpn kpnVar) {
        if (this.t == 1) {
            return Math.min(this.p, kpnVar.b());
        }
        return -1;
    }

    @Override // defpackage.yon
    public final int S0(int i, amh amhVar, kpn kpnVar) {
        return C1(i, amhVar, kpnVar);
    }

    @Override // defpackage.yon
    public final void T0(int i) {
        kar karVar = this.F;
        if (karVar != null && karVar.a != i) {
            karVar.d = null;
            karVar.c = 0;
            karVar.a = -1;
            karVar.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        R0();
    }

    @Override // defpackage.yon
    public final int U0(int i, amh amhVar, kpn kpnVar) {
        return C1(i, amhVar, kpnVar);
    }

    @Override // defpackage.yon
    public final void X0(Rect rect, int i, int i2) {
        int A;
        int A2;
        int d0 = d0() + c0();
        int b0 = b0() + e0();
        if (this.t == 1) {
            int height = rect.height() + b0;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = wdu.a;
            A2 = yon.A(i2, height, recyclerView.getMinimumHeight());
            A = yon.A(i, (this.u * this.p) + d0, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + d0;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = wdu.a;
            A = yon.A(i, width, recyclerView2.getMinimumWidth());
            A2 = yon.A(i2, (this.u * this.p) + b0, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(A, A2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < n1()) != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.jpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF c(int i) {
        int i2 = -1;
        if (Q() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.yon
    public final void d1(RecyclerView recyclerView, int i) {
        i7g i7gVar = new i7g(recyclerView.getContext());
        i7gVar.a = i;
        e1(i7gVar);
    }

    @Override // defpackage.yon
    public final boolean f1() {
        return this.F == null;
    }

    public final boolean g1() {
        int n1;
        if (Q() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                n1 = o1();
                n1();
            } else {
                n1 = n1();
                o1();
            }
            if (n1 == 0 && s1() != null) {
                this.B.B();
                this.f = true;
                R0();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yon
    public final int h0(amh amhVar, kpn kpnVar) {
        if (this.t == 0) {
            return Math.min(this.p, kpnVar.b());
        }
        return -1;
    }

    public final int h1(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return qgg.G(kpnVar, this.r, k1(z), j1(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0272, code lost:
    
        r0.y1(r21, r10);
     */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i1(amh amhVar, sqf sqfVar, kpn kpnVar) {
        ywq ywqVar;
        ?? r5;
        int j;
        int c;
        int n;
        int c2;
        int i;
        int i2;
        int i3;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i4 = 0;
        int i5 = 1;
        staggeredGridLayoutManager.y.set(0, staggeredGridLayoutManager.p, true);
        sqf sqfVar2 = staggeredGridLayoutManager.v;
        int i6 = sqfVar2.i ? sqfVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : sqfVar.e == 1 ? sqfVar.g + sqfVar.b : sqfVar.f - sqfVar.b;
        int i7 = sqfVar.e;
        for (int i8 = 0; i8 < staggeredGridLayoutManager.p; i8++) {
            if (!staggeredGridLayoutManager.q[i8].a.isEmpty()) {
                staggeredGridLayoutManager.G1(staggeredGridLayoutManager.q[i8], i7, i6);
            }
        }
        boolean z = staggeredGridLayoutManager.x;
        gc9 gc9Var = staggeredGridLayoutManager.r;
        int g = z ? gc9Var.g() : gc9Var.n();
        boolean z2 = false;
        while (true) {
            int i9 = sqfVar.c;
            if (i9 < 0 || i9 >= kpnVar.b() || (!sqfVar2.i && staggeredGridLayoutManager.y.isEmpty())) {
                break;
            }
            View d = amhVar.d(sqfVar.c);
            sqfVar.c += sqfVar.d;
            iar iarVar = (iar) d.getLayoutParams();
            int d2 = iarVar.a.d();
            atn atnVar = staggeredGridLayoutManager.B;
            int[] iArr = (int[]) atnVar.b;
            int i10 = (iArr == null || d2 >= iArr.length) ? -1 : iArr[d2];
            if (i10 == -1) {
                boolean w1 = staggeredGridLayoutManager.w1(sqfVar.e);
                int i11 = staggeredGridLayoutManager.p;
                if (w1) {
                    i3 = i11 - 1;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = i11;
                    i3 = i4;
                }
                int i12 = sqfVar.e;
                ywq ywqVar2 = null;
                gc9 gc9Var2 = staggeredGridLayoutManager.r;
                if (i12 == i5) {
                    int n2 = gc9Var2.n();
                    int i13 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        ywq ywqVar3 = staggeredGridLayoutManager.q[i3];
                        int g2 = ywqVar3.g(n2);
                        if (g2 < i13) {
                            ywqVar2 = ywqVar3;
                            i13 = g2;
                        }
                        i3 += i;
                    }
                } else {
                    int g3 = gc9Var2.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        ywq ywqVar4 = staggeredGridLayoutManager.q[i3];
                        int j2 = ywqVar4.j(g3);
                        if (j2 > i14) {
                            ywqVar2 = ywqVar4;
                            i14 = j2;
                        }
                        i3 += i;
                    }
                }
                ywqVar = ywqVar2;
                atnVar.D(d2);
                ((int[]) atnVar.b)[d2] = ywqVar.e;
            } else {
                ywqVar = staggeredGridLayoutManager.q[i10];
            }
            ywq ywqVar5 = ywqVar;
            iarVar.e = ywqVar5;
            if (sqfVar.e == 1) {
                r5 = 0;
                staggeredGridLayoutManager.u(d, -1, false);
            } else {
                r5 = 0;
                staggeredGridLayoutManager.u(d, 0, false);
            }
            if (staggeredGridLayoutManager.t == 1) {
                staggeredGridLayoutManager.u1(d, yon.R(r5, staggeredGridLayoutManager.u, staggeredGridLayoutManager.l, r5, ((ViewGroup.MarginLayoutParams) iarVar).width), yon.R(true, staggeredGridLayoutManager.o, staggeredGridLayoutManager.m, staggeredGridLayoutManager.b0() + staggeredGridLayoutManager.e0(), ((ViewGroup.MarginLayoutParams) iarVar).height));
            } else {
                staggeredGridLayoutManager.u1(d, yon.R(true, staggeredGridLayoutManager.n, staggeredGridLayoutManager.l, staggeredGridLayoutManager.d0() + staggeredGridLayoutManager.c0(), ((ViewGroup.MarginLayoutParams) iarVar).width), yon.R(false, staggeredGridLayoutManager.u, staggeredGridLayoutManager.m, 0, ((ViewGroup.MarginLayoutParams) iarVar).height));
            }
            if (sqfVar.e == 1) {
                c = ywqVar5.g(g);
                j = staggeredGridLayoutManager.r.c(d) + c;
            } else {
                j = ywqVar5.j(g);
                c = j - staggeredGridLayoutManager.r.c(d);
            }
            int i15 = sqfVar.e;
            ywq ywqVar6 = iarVar.e;
            if (i15 == 1) {
                ywqVar6.getClass();
                iar iarVar2 = (iar) d.getLayoutParams();
                iarVar2.e = ywqVar6;
                ArrayList arrayList = ywqVar6.a;
                arrayList.add(d);
                ywqVar6.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ywqVar6.b = Integer.MIN_VALUE;
                }
                if (iarVar2.a.k() || iarVar2.a.n()) {
                    ywqVar6.d = ((StaggeredGridLayoutManager) ywqVar6.f).r.c(d) + ywqVar6.d;
                }
            } else {
                ywqVar6.getClass();
                iar iarVar3 = (iar) d.getLayoutParams();
                iarVar3.e = ywqVar6;
                ArrayList arrayList2 = ywqVar6.a;
                arrayList2.add(0, d);
                ywqVar6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ywqVar6.c = Integer.MIN_VALUE;
                }
                if (iarVar3.a.k() || iarVar3.a.n()) {
                    ywqVar6.d = ((StaggeredGridLayoutManager) ywqVar6.f).r.c(d) + ywqVar6.d;
                }
            }
            if (staggeredGridLayoutManager.t1() && staggeredGridLayoutManager.t == 1) {
                c2 = staggeredGridLayoutManager.s.g() - (((staggeredGridLayoutManager.p - 1) - ywqVar5.e) * staggeredGridLayoutManager.u);
                n = c2 - staggeredGridLayoutManager.s.c(d);
            } else {
                n = staggeredGridLayoutManager.s.n() + (ywqVar5.e * staggeredGridLayoutManager.u);
                c2 = staggeredGridLayoutManager.s.c(d) + n;
            }
            int i16 = n;
            int i17 = c2;
            if (staggeredGridLayoutManager.t == 1) {
                staggeredGridLayoutManager.n0(d, i16, c, i17, j);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.n0(d, c, i16, j, i17);
            }
            staggeredGridLayoutManager.G1(ywqVar5, sqfVar2.e, i6);
            staggeredGridLayoutManager.y1(amhVar, sqfVar2);
            if (sqfVar2.h && d.hasFocusable()) {
                staggeredGridLayoutManager.y.set(ywqVar5.e, false);
            }
            z2 = true;
            i5 = 1;
            i4 = 0;
        }
        int i18 = sqfVar2.e;
        gc9 gc9Var3 = staggeredGridLayoutManager.r;
        int n3 = i18 == -1 ? staggeredGridLayoutManager.r.n() - staggeredGridLayoutManager.q1(gc9Var3.n()) : staggeredGridLayoutManager.p1(gc9Var3.g()) - staggeredGridLayoutManager.r.g();
        if (n3 > 0) {
            return Math.min(sqfVar.b, n3);
        }
        return 0;
    }

    public final View j1(boolean z) {
        int n = this.r.n();
        int g = this.r.g();
        View view = null;
        for (int Q = Q() - 1; Q >= 0; Q--) {
            View P = P(Q);
            int e = this.r.e(P);
            int b = this.r.b(P);
            if (b > n && e < g) {
                if (b <= g || !z) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    @Override // defpackage.yon
    public final boolean k0() {
        return this.C != 0;
    }

    public final View k1(boolean z) {
        int n = this.r.n();
        int g = this.r.g();
        int Q = Q();
        View view = null;
        for (int i = 0; i < Q; i++) {
            View P = P(i);
            int e = this.r.e(P);
            if (this.r.b(P) > n && e < g) {
                if (e >= n || !z) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    @Override // defpackage.yon
    public final boolean l0() {
        return this.w;
    }

    public final void l1(amh amhVar, kpn kpnVar, boolean z) {
        int g;
        int p1 = p1(Integer.MIN_VALUE);
        if (p1 != Integer.MIN_VALUE && (g = this.r.g() - p1) > 0) {
            int i = g - (-C1(-g, amhVar, kpnVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.r(i);
        }
    }

    public final void m1(amh amhVar, kpn kpnVar, boolean z) {
        int n;
        int q1 = q1(Integer.MAX_VALUE);
        if (q1 != Integer.MAX_VALUE && (n = q1 - this.r.n()) > 0) {
            int C1 = n - C1(n, amhVar, kpnVar);
            if (!z || C1 <= 0) {
                return;
            }
            this.r.r(-C1);
        }
    }

    public final int n1() {
        if (Q() == 0) {
            return 0;
        }
        return yon.f0(P(0));
    }

    public final int o1() {
        int Q = Q();
        if (Q == 0) {
            return 0;
        }
        return yon.f0(P(Q - 1));
    }

    @Override // defpackage.yon
    public final void p0(int i) {
        super.p0(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            int i3 = ywqVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ywqVar.b = i3 + i;
            }
            int i4 = ywqVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ywqVar.c = i4 + i;
            }
        }
    }

    public final int p1(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    @Override // defpackage.yon
    public final void q0(int i) {
        super.q0(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            int i3 = ywqVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ywqVar.b = i3 + i;
            }
            int i4 = ywqVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ywqVar.c = i4 + i;
            }
        }
    }

    public final int q1(int i) {
        int j = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int j2 = this.q[i2].j(i);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    @Override // defpackage.yon
    public final void r0() {
        this.B.B();
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(int i, int i2, int i3) {
        int i4;
        int i5;
        atn atnVar;
        int[] iArr;
        ArrayList arrayList;
        jar jarVar;
        int i6;
        int o1 = this.x ? o1() : n1();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                atnVar = this.B;
                iArr = (int[]) atnVar.b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) atnVar.c;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                jarVar = null;
                                break;
                            }
                            jarVar = (jar) ((ArrayList) atnVar.c).get(size);
                            if (jarVar.a == i5) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (jarVar != null) {
                            ((ArrayList) atnVar.c).remove(jarVar);
                        }
                        int size2 = ((ArrayList) atnVar.c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((jar) ((ArrayList) atnVar.c).get(i7)).a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            jar jarVar2 = (jar) ((ArrayList) atnVar.c).get(i7);
                            ((ArrayList) atnVar.c).remove(i7);
                            i6 = jarVar2.a;
                            int[] iArr2 = (int[]) atnVar.b;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) atnVar.b).length;
                            } else {
                                Arrays.fill((int[]) atnVar.b, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) atnVar.b;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    atnVar.K(i, i2);
                } else if (i3 == 2) {
                    atnVar.L(i, i2);
                } else if (i3 == 8) {
                    atnVar.L(i, 1);
                    atnVar.K(i2, 1);
                }
                if (i4 > o1) {
                    return;
                }
                if (i5 <= (this.x ? n1() : o1())) {
                    R0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        atnVar = this.B;
        iArr = (int[]) atnVar.b;
        if (iArr != null) {
            arrayList = (ArrayList) atnVar.c;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) atnVar.b;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > o1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View s1() {
        int Q = Q();
        int i = Q - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        char c = (this.t == 1 && t1()) ? (char) 1 : (char) 65535;
        if (this.x) {
            Q = -1;
        } else {
            i = 0;
        }
        int i2 = i < Q ? 1 : -1;
        while (i != Q) {
            View P = P(i);
            iar iarVar = (iar) P.getLayoutParams();
            if (bitSet.get(iarVar.e.e)) {
                ywq ywqVar = iarVar.e;
                if (this.x) {
                    int i3 = ywqVar.c;
                    if (i3 == Integer.MIN_VALUE) {
                        ywqVar.b();
                        i3 = ywqVar.c;
                    }
                    if (i3 < this.r.g()) {
                        ((iar) ((View) vz1.m(ywqVar.a, 1)).getLayoutParams()).getClass();
                        return P;
                    }
                } else {
                    int i4 = ywqVar.b;
                    ArrayList arrayList = ywqVar.a;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        iar iarVar2 = (iar) view.getLayoutParams();
                        ywqVar.b = ((StaggeredGridLayoutManager) ywqVar.f).r.e(view);
                        iarVar2.getClass();
                        i4 = ywqVar.b;
                    }
                    if (i4 > this.r.n()) {
                        ((iar) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return P;
                    }
                }
                bitSet.clear(iarVar.e.e);
            }
            i += i2;
            if (i != Q) {
                View P2 = P(i);
                boolean z = this.x;
                gc9 gc9Var = this.r;
                if (z) {
                    int b = gc9Var.b(P);
                    int b2 = this.r.b(P2);
                    if (b < b2) {
                        return P;
                    }
                    if (b == b2) {
                        if ((iarVar.e.e - ((iar) P2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                            return P;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = gc9Var.e(P);
                    int e2 = this.r.e(P2);
                    if (e > e2) {
                        return P;
                    }
                    if (e == e2) {
                        if ((iarVar.e.e - ((iar) P2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.yon
    public void t0(RecyclerView recyclerView, amh amhVar) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
        recyclerView.requestLayout();
    }

    public final boolean t1() {
        return this.b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0051, code lost:
    
        if (r8.t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0057, code lost:
    
        if (r8.t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0063, code lost:
    
        if (t1() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x006f, code lost:
    
        if (t1() == false) goto L37;
     */
    @Override // defpackage.yon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View u0(View view, int i, amh amhVar, kpn kpnVar) {
        View view2;
        int i2;
        if (Q() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.O(view)) == null || ((ArrayList) this.a.e).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                B1();
                if (i == 1) {
                    if (this.t != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (this.t != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    iar iarVar = (iar) view2.getLayoutParams();
                    iarVar.getClass();
                    ywq ywqVar = iarVar.e;
                    int o1 = i2 == 1 ? o1() : n1();
                    F1(o1, kpnVar);
                    D1(i2);
                    sqf sqfVar = this.v;
                    sqfVar.c = sqfVar.d + o1;
                    sqfVar.b = (int) (this.r.o() * 0.33333334f);
                    sqfVar.h = true;
                    sqfVar.a = false;
                    i1(amhVar, sqfVar, kpnVar);
                    this.D = this.x;
                    View h = ywqVar.h(o1, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    if (w1(i2)) {
                        for (int i3 = this.p - 1; i3 >= 0; i3--) {
                            View h2 = this.q[i3].h(o1, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            View h3 = this.q[i4].h(o1, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View L = L(z ? ywqVar.d() : ywqVar.e());
                    if (L != null && L != view2) {
                        return L;
                    }
                    if (w1(i2)) {
                        for (int i5 = this.p - 1; i5 >= 0; i5--) {
                            if (i5 != ywqVar.e) {
                                ywq[] ywqVarArr = this.q;
                                View L2 = L(z ? ywqVarArr[i5].d() : ywqVarArr[i5].e());
                                if (L2 != null && L2 != view2) {
                                    return L2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.p; i6++) {
                            ywq[] ywqVarArr2 = this.q;
                            View L3 = L(z ? ywqVarArr2[i6].d() : ywqVarArr2[i6].e());
                            if (L3 != null && L3 != view2) {
                                return L3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void u1(View view, int i, int i2) {
        Rect rect = this.G;
        w(rect, view);
        iar iarVar = (iar) view.getLayoutParams();
        int H1 = H1(i, ((ViewGroup.MarginLayoutParams) iarVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) iarVar).rightMargin + rect.right);
        int H12 = H1(i2, ((ViewGroup.MarginLayoutParams) iarVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) iarVar).bottomMargin + rect.bottom);
        if (a1(view, H1, H12, iarVar)) {
            view.measure(H1, H12);
        }
    }

    @Override // defpackage.yon
    public final void v(String str) {
        if (this.F == null) {
            super.v(str);
        }
    }

    @Override // defpackage.yon
    public final void v0(AccessibilityEvent accessibilityEvent) {
        super.v0(accessibilityEvent);
        if (Q() > 0) {
            View k1 = k1(false);
            View j1 = j1(false);
            if (k1 == null || j1 == null) {
                return;
            }
            int f0 = yon.f0(k1);
            int f02 = yon.f0(j1);
            if (f0 < f02) {
                accessibilityEvent.setFromIndex(f0);
                accessibilityEvent.setToIndex(f02);
            } else {
                accessibilityEvent.setFromIndex(f02);
                accessibilityEvent.setToIndex(f0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a4, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
    
        if ((r11 < n1()) != r16.x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x040a, code lost:
    
        if (g1() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0192, code lost:
    
        if (r16.x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(amh amhVar, kpn kpnVar, boolean z) {
        kar karVar;
        ywq[] ywqVarArr;
        int i;
        int i2;
        boolean z2;
        kar karVar2 = this.F;
        har harVar = this.H;
        if (!(karVar2 == null && this.z == -1) && kpnVar.b() == 0) {
            M0(amhVar);
            harVar.a();
            return;
        }
        boolean z3 = harVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = harVar.g;
        boolean z4 = true;
        boolean z5 = (z3 && this.z == -1 && this.F == null) ? false : true;
        atn atnVar = this.B;
        if (z5) {
            harVar.a();
            kar karVar3 = this.F;
            if (karVar3 != null) {
                int i3 = karVar3.c;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].c();
                            kar karVar4 = this.F;
                            int i5 = karVar4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                boolean z6 = karVar4.i;
                                gc9 gc9Var = this.r;
                                i5 += z6 ? gc9Var.g() : gc9Var.n();
                            }
                            ywq ywqVar = this.q[i4];
                            ywqVar.b = i5;
                            ywqVar.c = i5;
                        }
                    } else {
                        karVar3.d = null;
                        karVar3.c = 0;
                        karVar3.e = 0;
                        karVar3.f = null;
                        karVar3.g = null;
                        karVar3.a = karVar3.b;
                    }
                }
                kar karVar5 = this.F;
                this.E = karVar5.j;
                boolean z7 = karVar5.h;
                v(null);
                kar karVar6 = this.F;
                if (karVar6 != null && karVar6.h != z7) {
                    karVar6.h = z7;
                }
                this.w = z7;
                R0();
                B1();
                kar karVar7 = this.F;
                int i6 = karVar7.a;
                if (i6 != -1) {
                    this.z = i6;
                    harVar.c = karVar7.i;
                } else {
                    harVar.c = this.x;
                }
                if (karVar7.e > 1) {
                    atnVar.b = karVar7.f;
                    atnVar.c = karVar7.g;
                }
            } else {
                B1();
                harVar.c = this.x;
            }
            if (!kpnVar.g && (i2 = this.z) != -1) {
                if (i2 < 0 || i2 >= kpnVar.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    kar karVar8 = this.F;
                    if (karVar8 == null || karVar8.a == -1 || karVar8.c < 1) {
                        View L = L(this.z);
                        if (L != null) {
                            harVar.a = this.x ? o1() : n1();
                            if (this.A != Integer.MIN_VALUE) {
                                boolean z8 = harVar.c;
                                gc9 gc9Var2 = this.r;
                                if (z8) {
                                    harVar.b = (gc9Var2.g() - this.A) - this.r.b(L);
                                } else {
                                    harVar.b = (gc9Var2.n() + this.A) - this.r.e(L);
                                }
                            } else if (this.r.c(L) > this.r.o()) {
                                boolean z9 = harVar.c;
                                gc9 gc9Var3 = this.r;
                                harVar.b = z9 ? gc9Var3.g() : gc9Var3.n();
                            } else {
                                int e = this.r.e(L) - this.r.n();
                                if (e < 0) {
                                    harVar.b = -e;
                                } else {
                                    int g = this.r.g() - this.r.b(L);
                                    if (g < 0) {
                                        harVar.b = g;
                                    } else {
                                        harVar.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.z;
                            harVar.a = i7;
                            int i8 = this.A;
                            if (i8 == Integer.MIN_VALUE) {
                                if (Q() == 0) {
                                }
                                harVar.c = z2;
                                gc9 gc9Var4 = staggeredGridLayoutManager.r;
                                harVar.b = z2 ? gc9Var4.g() : gc9Var4.n();
                            } else {
                                boolean z10 = harVar.c;
                                gc9 gc9Var5 = staggeredGridLayoutManager.r;
                                if (z10) {
                                    harVar.b = gc9Var5.g() - i8;
                                } else {
                                    harVar.b = gc9Var5.n() + i8;
                                }
                            }
                            harVar.d = true;
                        }
                    } else {
                        harVar.b = Integer.MIN_VALUE;
                        harVar.a = this.z;
                    }
                    harVar.e = true;
                }
            }
            if (this.D) {
                int b = kpnVar.b();
                for (int Q = Q() - 1; Q >= 0; Q--) {
                    i = yon.f0(P(Q));
                    if (i >= 0 && i < b) {
                        break;
                    }
                }
                i = 0;
                harVar.a = i;
                harVar.b = Integer.MIN_VALUE;
                harVar.e = true;
            } else {
                int b2 = kpnVar.b();
                int Q2 = Q();
                for (int i9 = 0; i9 < Q2; i9++) {
                    int f0 = yon.f0(P(i9));
                    if (f0 >= 0 && f0 < b2) {
                        i = f0;
                        break;
                    }
                }
                i = 0;
                harVar.a = i;
                harVar.b = Integer.MIN_VALUE;
                harVar.e = true;
            }
        }
        if (this.F == null && this.z == -1 && (harVar.c != this.D || t1() != this.E)) {
            atnVar.B();
            harVar.d = true;
        }
        if (Q() > 0 && ((karVar = this.F) == null || karVar.c < 1)) {
            if (harVar.d) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    this.q[i10].c();
                    int i11 = harVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        ywq ywqVar2 = this.q[i10];
                        ywqVar2.b = i11;
                        ywqVar2.c = i11;
                    }
                }
            } else if (z5 || harVar.f == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.p;
                    ywqVarArr = this.q;
                    if (i12 >= i13) {
                        break;
                    }
                    ywq ywqVar3 = ywqVarArr[i12];
                    boolean z11 = this.x;
                    int i14 = harVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) ywqVar3.f;
                    int g2 = z11 ? ywqVar3.g(Integer.MIN_VALUE) : ywqVar3.j(Integer.MIN_VALUE);
                    ywqVar3.c();
                    if (g2 != Integer.MIN_VALUE && ((!z11 || g2 >= staggeredGridLayoutManager2.r.g()) && (z11 || g2 <= staggeredGridLayoutManager2.r.n()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            g2 += i14;
                        }
                        ywqVar3.c = g2;
                        ywqVar3.b = g2;
                    }
                    i12++;
                }
                int length = ywqVarArr.length;
                int[] iArr = harVar.f;
                if (iArr == null || iArr.length < length) {
                    harVar.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i15 = 0; i15 < length; i15++) {
                    harVar.f[i15] = ywqVarArr[i15].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i16 = 0; i16 < this.p; i16++) {
                    ywq ywqVar4 = this.q[i16];
                    ywqVar4.c();
                    int i17 = harVar.f[i16];
                    ywqVar4.b = i17;
                    ywqVar4.c = i17;
                }
            }
        }
        J(amhVar);
        sqf sqfVar = this.v;
        sqfVar.a = false;
        int o = this.s.o();
        this.u = o / this.p;
        View.MeasureSpec.makeMeasureSpec(o, this.s.j());
        F1(harVar.a, kpnVar);
        if (harVar.c) {
            D1(-1);
            i1(amhVar, sqfVar, kpnVar);
            D1(1);
            sqfVar.c = harVar.a + sqfVar.d;
            i1(amhVar, sqfVar, kpnVar);
        } else {
            D1(1);
            i1(amhVar, sqfVar, kpnVar);
            D1(-1);
            sqfVar.c = harVar.a + sqfVar.d;
            i1(amhVar, sqfVar, kpnVar);
        }
        if (this.s.j() != 1073741824) {
            int Q3 = Q();
            float f = 0.0f;
            for (int i18 = 0; i18 < Q3; i18++) {
                View P = P(i18);
                float c = this.s.c(P);
                if (c >= f) {
                    ((iar) P.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i19 = this.u;
            int round = Math.round(f * this.p);
            if (this.s.j() == Integer.MIN_VALUE) {
                round = Math.min(round, this.s.o());
            }
            this.u = round / this.p;
            View.MeasureSpec.makeMeasureSpec(round, this.s.j());
            if (this.u != i19) {
                for (int i20 = 0; i20 < Q3; i20++) {
                    View P2 = P(i20);
                    iar iarVar = (iar) P2.getLayoutParams();
                    iarVar.getClass();
                    if (t1() && this.t == 1) {
                        int i21 = -((this.p - 1) - iarVar.e.e);
                        P2.offsetLeftAndRight((this.u * i21) - (i21 * i19));
                    } else {
                        int i22 = iarVar.e.e;
                        int i23 = this.u * i22;
                        int i24 = i22 * i19;
                        if (this.t == 1) {
                            P2.offsetLeftAndRight(i23 - i24);
                        } else {
                            P2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (Q() > 0) {
            if (this.x) {
                l1(amhVar, kpnVar, true);
                m1(amhVar, kpnVar, false);
            } else {
                m1(amhVar, kpnVar, true);
                l1(amhVar, kpnVar, false);
            }
        }
        if (z && !kpnVar.g && this.C != 0 && Q() > 0 && s1() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z4 = false;
        if (kpnVar.g) {
            harVar.a();
        }
        this.D = harVar.c;
        this.E = t1();
        if (z4) {
            harVar.a();
            v1(amhVar, kpnVar, false);
        }
    }

    @Override // defpackage.yon
    public final void w0(amh amhVar, kpn kpnVar, vb vbVar) {
        super.w0(amhVar, kpnVar, vbVar);
        vbVar.n("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean w1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == t1();
    }

    @Override // defpackage.yon
    public final boolean x() {
        return this.t == 0;
    }

    @Override // defpackage.yon
    public final void x0(amh amhVar, kpn kpnVar, View view, vb vbVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof iar)) {
            y0(view, vbVar);
            return;
        }
        ywq ywqVar = ((iar) layoutParams).e;
        if (this.t == 0) {
            vbVar.q(ub.d(false, ywqVar == null ? -1 : ywqVar.e, 1, -1, -1));
        } else {
            vbVar.q(ub.d(false, -1, -1, ywqVar == null ? -1 : ywqVar.e, 1));
        }
    }

    public final void x1(int i, kpn kpnVar) {
        int n1;
        int i2;
        if (i > 0) {
            n1 = o1();
            i2 = 1;
        } else {
            n1 = n1();
            i2 = -1;
        }
        sqf sqfVar = this.v;
        sqfVar.a = true;
        F1(n1, kpnVar);
        D1(i2);
        sqfVar.c = n1 + sqfVar.d;
        sqfVar.b = Math.abs(i);
    }

    @Override // defpackage.yon
    public final boolean y() {
        return this.t == 1;
    }

    public final void y1(amh amhVar, sqf sqfVar) {
        if (!sqfVar.a || sqfVar.i) {
            return;
        }
        int i = sqfVar.b;
        int i2 = sqfVar.e;
        if (i == 0) {
            if (i2 == -1) {
                z1(amhVar, sqfVar.g);
                return;
            } else {
                A1(amhVar, sqfVar.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = sqfVar.f;
            int j = this.q[0].j(i4);
            while (i3 < this.p) {
                int j2 = this.q[i3].j(i4);
                if (j2 > j) {
                    j = j2;
                }
                i3++;
            }
            int i5 = i4 - j;
            int i6 = sqfVar.g;
            if (i5 >= 0) {
                i6 -= Math.min(i5, sqfVar.b);
            }
            z1(amhVar, i6);
            return;
        }
        int i7 = sqfVar.g;
        int g = this.q[0].g(i7);
        while (i3 < this.p) {
            int g2 = this.q[i3].g(i7);
            if (g2 < g) {
                g = g2;
            }
            i3++;
        }
        int i8 = g - sqfVar.g;
        int i9 = sqfVar.f;
        if (i8 >= 0) {
            i9 += Math.min(i8, sqfVar.b);
        }
        A1(amhVar, i9);
    }

    @Override // defpackage.yon
    public final boolean z(zon zonVar) {
        return zonVar instanceof iar;
    }

    @Override // defpackage.yon
    public final void z0(int i, int i2) {
        r1(i, i2, 1);
    }

    public final void z1(amh amhVar, int i) {
        for (int Q = Q() - 1; Q >= 0; Q--) {
            View P = P(Q);
            if (this.r.e(P) < i || this.r.q(P) < i) {
                return;
            }
            iar iarVar = (iar) P.getLayoutParams();
            iarVar.getClass();
            if (iarVar.e.a.size() == 1) {
                return;
            }
            ywq ywqVar = iarVar.e;
            ArrayList arrayList = ywqVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            iar iarVar2 = (iar) view.getLayoutParams();
            iarVar2.e = null;
            if (iarVar2.a.k() || iarVar2.a.n()) {
                ywqVar.d -= ((StaggeredGridLayoutManager) ywqVar.f).r.c(view);
            }
            if (size == 1) {
                ywqVar.b = Integer.MIN_VALUE;
            }
            ywqVar.c = Integer.MIN_VALUE;
            O0(P);
            amhVar.i(P);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new atn(9, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new har(this);
        this.I = true;
        this.K = new yyo(4, this);
        this.t = i2;
        E1(i);
        this.v = new sqf();
        this.r = gc9.a(this, this.t);
        this.s = gc9.a(this, 1 - this.t);
    }
}
