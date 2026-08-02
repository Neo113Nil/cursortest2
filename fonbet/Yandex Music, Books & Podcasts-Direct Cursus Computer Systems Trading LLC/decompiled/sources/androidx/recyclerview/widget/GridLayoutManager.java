package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.amh;
import defpackage.aqd;
import defpackage.bqd;
import defpackage.csb;
import defpackage.dfi;
import defpackage.e7g;
import defpackage.f1d;
import defpackage.f7g;
import defpackage.k5r;
import defpackage.kpn;
import defpackage.ll4;
import defpackage.opn;
import defpackage.qb;
import defpackage.qon;
import defpackage.qq6;
import defpackage.ub;
import defpackage.vb;
import defpackage.wdu;
import defpackage.xq0;
import defpackage.yon;
import defpackage.zon;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public aqd K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new aqd(0);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        Z1(yon.g0(context, attributeSet, i, i2).b);
    }

    @Override // defpackage.yon
    public final void A0() {
        this.K.p();
        ((SparseIntArray) this.K.c).clear();
    }

    @Override // defpackage.yon
    public final void B0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.c).clear();
    }

    @Override // defpackage.yon
    public final void C0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.c).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(amh amhVar, kpn kpnVar, f7g f7gVar, e7g e7gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int R;
        int i9;
        boolean z;
        int i10;
        View b;
        GridLayoutManager gridLayoutManager = this;
        int k = gridLayoutManager.r.k();
        boolean z2 = k != 1073741824;
        int i11 = gridLayoutManager.Q() > 0 ? gridLayoutManager.G[gridLayoutManager.F] : 0;
        if (z2) {
            gridLayoutManager.a2();
        }
        boolean z3 = f7gVar.e == 1;
        int i12 = gridLayoutManager.F;
        if (!z3) {
            i12 = gridLayoutManager.W1(f7gVar.d, amhVar, kpnVar) + gridLayoutManager.X1(f7gVar.d, amhVar, kpnVar);
        }
        int i13 = 0;
        while (i13 < gridLayoutManager.F && (i10 = f7gVar.d) >= 0 && i10 < kpnVar.b() && i12 > 0) {
            int i14 = f7gVar.d;
            int X1 = gridLayoutManager.X1(i14, amhVar, kpnVar);
            if (X1 > gridLayoutManager.F) {
                xq0.x(f1d.i(dfi.l("Item at position ", i14, X1, " requires ", " spans but GridLayoutManager has only "), gridLayoutManager.F, " spans."));
                return;
            }
            i12 -= X1;
            if (i12 < 0 || (b = f7gVar.b(amhVar)) == null) {
                break;
            }
            gridLayoutManager.H[i13] = b;
            i13++;
        }
        if (z3) {
            i3 = 1;
            i2 = i13;
            i = 0;
        } else {
            i = i13 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i != i2) {
            View view = gridLayoutManager.H[i];
            bqd bqdVar = (bqd) view.getLayoutParams();
            int X12 = gridLayoutManager.X1(yon.f0(view), amhVar, kpnVar);
            bqdVar.f = X12;
            bqdVar.e = i15;
            i15 += X12;
            i += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = gridLayoutManager.H[i17];
            if (f7gVar.k != null) {
                z = false;
                if (z3) {
                    gridLayoutManager.u(view2, -1, true);
                } else {
                    gridLayoutManager.u(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                gridLayoutManager.u(view2, -1, false);
            } else {
                z = false;
                gridLayoutManager.u(view2, 0, false);
            }
            gridLayoutManager.w(gridLayoutManager.L, view2);
            gridLayoutManager.Y1(view2, k, z);
            int c = gridLayoutManager.r.c(view2);
            if (c > i16) {
                i16 = c;
            }
            float d = (gridLayoutManager.r.d(view2) * 1.0f) / ((bqd) view2.getLayoutParams()).f;
            if (d > f) {
                f = d;
            }
        }
        if (z2) {
            gridLayoutManager.O1(Math.max(Math.round(f * gridLayoutManager.F), i11));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = gridLayoutManager.H[i18];
                gridLayoutManager.Y1(view3, 1073741824, true);
                int c2 = gridLayoutManager.r.c(view3);
                if (c2 > i16) {
                    i16 = c2;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = gridLayoutManager.H[i19];
            if (gridLayoutManager.r.c(view4) != i16) {
                bqd bqdVar2 = (bqd) view4.getLayoutParams();
                Rect rect = bqdVar2.b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bqdVar2).topMargin + ((ViewGroup.MarginLayoutParams) bqdVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bqdVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bqdVar2).rightMargin;
                int U1 = gridLayoutManager.U1(bqdVar2.e, bqdVar2.f);
                if (gridLayoutManager.p == 1) {
                    i9 = yon.R(false, U1, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bqdVar2).width);
                    R = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    R = yon.R(false, U1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bqdVar2).height);
                    i9 = makeMeasureSpec;
                }
                if (gridLayoutManager.c1(view4, i9, R, (zon) view4.getLayoutParams())) {
                    view4.measure(i9, R);
                }
            }
        }
        int i22 = 0;
        e7gVar.a = i16;
        int i23 = gridLayoutManager.p;
        int i24 = f7gVar.f;
        int i25 = f7gVar.b;
        if (i23 != 1) {
            if (i24 == -1) {
                i6 = i25 - i16;
                i5 = 0;
                i4 = i25;
            } else {
                i4 = i25 + i16;
                i5 = 0;
                i6 = i25;
            }
            i25 = i5;
        } else if (i24 == -1) {
            i5 = i25 - i16;
            i6 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            i5 = i25;
            i25 += i16;
            i6 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.H;
            if (i22 >= i13) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int i26 = i6;
            View view5 = viewArr[i22];
            bqd bqdVar3 = (bqd) view5.getLayoutParams();
            if (gridLayoutManager.p != 1) {
                i5 = gridLayoutManager.e0() + gridLayoutManager.G[bqdVar3.e];
                i25 = gridLayoutManager.r.d(view5) + i5;
            } else if (gridLayoutManager.B1()) {
                i4 = gridLayoutManager.c0() + gridLayoutManager.G[gridLayoutManager.F - bqdVar3.e];
                i26 = i4 - gridLayoutManager.r.d(view5);
            } else {
                i8 = gridLayoutManager.c0() + gridLayoutManager.G[bqdVar3.e];
                i7 = gridLayoutManager.r.d(view5) + i8;
                int i27 = i25;
                gridLayoutManager.n0(view5, i8, i5, i7, i27);
                i6 = i8;
                i4 = i7;
                i25 = i27;
                if (!bqdVar3.a.k() || bqdVar3.a.n()) {
                    e7gVar.c = true;
                }
                e7gVar.d = view5.hasFocusable() | e7gVar.d;
                i22++;
                gridLayoutManager = this;
            }
            i7 = i4;
            i8 = i26;
            int i272 = i25;
            gridLayoutManager.n0(view5, i8, i5, i7, i272);
            i6 = i8;
            i4 = i7;
            i25 = i272;
            if (!bqdVar3.a.k()) {
            }
            e7gVar.c = true;
            e7gVar.d = view5.hasFocusable() | e7gVar.d;
            i22++;
            gridLayoutManager = this;
        }
    }

    @Override // defpackage.yon
    public final void D0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D1(amh amhVar, kpn kpnVar, csb csbVar, int i) {
        a2();
        if (kpnVar.b() > 0 && !kpnVar.g) {
            boolean z = i == 1;
            int W1 = W1(csbVar.b, amhVar, kpnVar);
            if (z) {
                while (W1 > 0) {
                    int i2 = csbVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    csbVar.b = i3;
                    W1 = W1(i3, amhVar, kpnVar);
                }
            } else {
                int b = kpnVar.b() - 1;
                int i4 = csbVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int W12 = W1(i5, amhVar, kpnVar);
                    if (W12 <= W1) {
                        break;
                    }
                    i4 = i5;
                    W1 = W12;
                }
                csbVar.b = i4;
            }
        }
        P1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int E(kpn kpnVar) {
        return j1(kpnVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void E0(amh amhVar, kpn kpnVar) {
        boolean z = kpnVar.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int Q = Q();
            for (int i = 0; i < Q; i++) {
                bqd bqdVar = (bqd) P(i).getLayoutParams();
                int d = bqdVar.a.d();
                sparseIntArray2.put(d, bqdVar.f);
                sparseIntArray.put(d, bqdVar.e);
            }
        }
        super.E0(amhVar, kpnVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int F(kpn kpnVar) {
        return k1(kpnVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void F0(kpn kpnVar) {
        View L;
        super.F0(kpnVar);
        this.E = false;
        int i = this.M;
        if (i == -1 || (L = L(i)) == null) {
            return;
        }
        L.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int H(kpn kpnVar) {
        return j1(kpnVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int I(kpn kpnVar) {
        return k1(kpnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K0(int i, Bundle bundle) {
        View view;
        opn a0;
        int i2;
        int i3;
        if (i == qb.s.a() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= Q()) {
                    view = null;
                    break;
                }
                View P2 = P(i4);
                Objects.requireNonNull(P2);
                if (P2.isAccessibilityFocused()) {
                    view = P(i4);
                    break;
                }
                i4++;
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i5)) && (a0 = this.b.a0(view)) != null) {
                    int b = a0.b();
                    int R1 = R1(b);
                    int Q1 = Q1(b);
                    if (R1 >= 0 && Q1 >= 0) {
                        if (!S1(b).contains(Integer.valueOf(this.N)) || !T1(Q1(b), b).contains(Integer.valueOf(this.O))) {
                            this.N = R1;
                            this.O = Q1;
                        }
                        int i6 = this.N;
                        if (i6 == -1) {
                            i6 = R1;
                        }
                        int i7 = this.O;
                        if (i7 != -1) {
                            Q1 = i7;
                        }
                        if (i5 == 17) {
                            i2 = b - 1;
                            while (i2 >= 0) {
                                int R12 = R1(i2);
                                int Q12 = Q1(i2);
                                if (R12 < 0 || Q12 < 0) {
                                    break;
                                }
                                if (this.p != 1) {
                                    if (S1(i2).contains(Integer.valueOf(i6)) && Q12 < Q1) {
                                        this.O = Q12;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if ((R12 == i6 && Q12 < Q1) || R12 < i6) {
                                        this.N = R12;
                                        this.O = Q12;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 33) {
                            i2 = b - 1;
                            while (i2 >= 0) {
                                int R13 = R1(i2);
                                int Q13 = Q1(i2);
                                if (R13 < 0 || Q13 < 0) {
                                    break;
                                }
                                if (this.p == 1) {
                                    if (R13 < i6 && T1(Q1(i2), i2).contains(Integer.valueOf(Q1))) {
                                        this.N = R13;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (R13 < i6 && Q13 == Q1) {
                                        this.N = ((Integer) Collections.max(S1(i2))).intValue();
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 66) {
                            i2 = b + 1;
                            while (i2 < a0()) {
                                int R14 = R1(i2);
                                int Q14 = Q1(i2);
                                if (R14 < 0 || Q14 < 0) {
                                    break;
                                }
                                if (this.p != 1) {
                                    if (Q14 > Q1 && S1(i2).contains(Integer.valueOf(i6))) {
                                        this.O = Q14;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if ((R14 == i6 && Q14 > Q1) || R14 > i6) {
                                        this.N = R14;
                                        this.O = Q14;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 130) {
                            i2 = b + 1;
                            while (i2 < a0()) {
                                int R15 = R1(i2);
                                int Q15 = Q1(i2);
                                if (R15 < 0 || Q15 < 0) {
                                    break;
                                }
                                if (this.p == 1) {
                                    if (R15 > i6 && (Q15 == Q1 || T1(Q1(i2), i2).contains(Integer.valueOf(Q1)))) {
                                        this.N = R15;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if (R15 > i6 && Q15 == Q1) {
                                        this.N = R1(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1 && (i3 = this.p) == 0) {
                                if (i5 != 17) {
                                    if (R1 >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= a0()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < R1) {
                                                        i2 = ((Integer) treeMap.get(num)).intValue();
                                                        this.N = intValue;
                                                        this.O = Q1(i2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = S1(i8).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                } else if (i5 == 66) {
                                    if (R1 >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= a0()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > R1) {
                                                        i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = intValue2;
                                                        this.O = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = S1(i9).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            }
                            if (i2 != -1) {
                                T0(i2);
                                this.M = i2;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.K0(i, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int c = this.b.m.c();
                int i12 = 0;
                while (true) {
                    if (i12 >= c) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int W1 = W1(i12, recyclerView.c, recyclerView.N0);
                    RecyclerView recyclerView2 = this.b;
                    int V1 = V1(i12, recyclerView2.c, recyclerView2.N0);
                    if (this.p == 1) {
                        if (W1 == i11 && V1 == i10) {
                            break;
                        }
                        i12++;
                    } else {
                        if (W1 == i10 && V1 == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    I1(i12, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K1(boolean z) {
        if (z) {
            qq6.d("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.K1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final zon M() {
        return this.p == 0 ? new bqd(-2, -1) : new bqd(-1, -2);
    }

    @Override // defpackage.yon
    public final zon N(Context context, AttributeSet attributeSet) {
        bqd bqdVar = new bqd(context, attributeSet);
        bqdVar.e = -1;
        bqdVar.f = 0;
        return bqdVar;
    }

    @Override // defpackage.yon
    public final zon O(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            bqd bqdVar = new bqd((ViewGroup.MarginLayoutParams) layoutParams);
            bqdVar.e = -1;
            bqdVar.f = 0;
            return bqdVar;
        }
        bqd bqdVar2 = new bqd(layoutParams);
        bqdVar2.e = -1;
        bqdVar2.f = 0;
        return bqdVar2;
    }

    public final void O1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void P1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int Q1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? V1(i, recyclerView.c, recyclerView.N0) : W1(i, recyclerView.c, recyclerView.N0);
    }

    public final int R1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? V1(i, recyclerView.c, recyclerView.N0) : W1(i, recyclerView.c, recyclerView.N0);
    }

    @Override // defpackage.yon
    public final int S(amh amhVar, kpn kpnVar) {
        if (this.p == 1) {
            return Math.min(this.F, a0());
        }
        if (kpnVar.b() < 1) {
            return 0;
        }
        return V1(kpnVar.b() - 1, amhVar, kpnVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int S0(int i, amh amhVar, kpn kpnVar) {
        a2();
        P1();
        return super.S0(i, amhVar, kpnVar);
    }

    public final HashSet S1(int i) {
        return T1(R1(i), i);
    }

    public final HashSet T1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int X1 = X1(i2, recyclerView.c, recyclerView.N0);
        for (int i3 = i; i3 < i + X1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final int U0(int i, amh amhVar, kpn kpnVar) {
        a2();
        P1();
        return super.U0(i, amhVar, kpnVar);
    }

    public final int U1(int i, int i2) {
        if (this.p != 1 || !B1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int V1(int i, amh amhVar, kpn kpnVar) {
        if (!kpnVar.g) {
            aqd aqdVar = this.K;
            int i2 = this.F;
            aqdVar.getClass();
            return aqd.l(i, i2);
        }
        int b = amhVar.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        aqd aqdVar2 = this.K;
        int i3 = this.F;
        aqdVar2.getClass();
        return aqd.l(b, i3);
    }

    public final int W1(int i, amh amhVar, kpn kpnVar) {
        if (!kpnVar.g) {
            aqd aqdVar = this.K;
            int i2 = this.F;
            aqdVar.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = amhVar.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        aqd aqdVar2 = this.K;
        int i4 = this.F;
        aqdVar2.getClass();
        return b % i4;
    }

    @Override // defpackage.yon
    public final void X0(Rect rect, int i, int i2) {
        int A;
        int A2;
        if (this.G == null) {
            super.X0(rect, i, i2);
        }
        int d0 = d0() + c0();
        int b0 = b0() + e0();
        if (this.p == 1) {
            int height = rect.height() + b0;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = wdu.a;
            A2 = yon.A(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            A = yon.A(i, iArr[iArr.length - 1] + d0, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + d0;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = wdu.a;
            A = yon.A(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            A2 = yon.A(i2, iArr2[iArr2.length - 1] + b0, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(A, A2);
    }

    public final int X1(int i, amh amhVar, kpn kpnVar) {
        if (!kpnVar.g) {
            this.K.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (amhVar.b(i) != -1) {
            this.K.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void Y1(View view, int i, boolean z) {
        int i2;
        int i3;
        bqd bqdVar = (bqd) view.getLayoutParams();
        Rect rect = bqdVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bqdVar).topMargin + ((ViewGroup.MarginLayoutParams) bqdVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bqdVar).leftMargin + ((ViewGroup.MarginLayoutParams) bqdVar).rightMargin;
        int U1 = U1(bqdVar.e, bqdVar.f);
        if (this.p == 1) {
            i3 = yon.R(false, U1, i, i5, ((ViewGroup.MarginLayoutParams) bqdVar).width);
            i2 = yon.R(true, this.r.o(), this.m, i4, ((ViewGroup.MarginLayoutParams) bqdVar).height);
        } else {
            int R = yon.R(false, U1, i, i4, ((ViewGroup.MarginLayoutParams) bqdVar).height);
            int R2 = yon.R(true, this.r.o(), this.l, i5, ((ViewGroup.MarginLayoutParams) bqdVar).width);
            i2 = R;
            i3 = R2;
        }
        zon zonVar = (zon) view.getLayoutParams();
        if (z ? c1(view, i3, i2, zonVar) : a1(view, i3, i2, zonVar)) {
            view.measure(i3, i2);
        }
    }

    public final void Z1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            xq0.x(k5r.i(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.p();
        R0();
    }

    public final void a2() {
        int b0;
        int e0;
        if (this.p == 1) {
            b0 = this.n - d0();
            e0 = c0();
        } else {
            b0 = this.o - b0();
            e0 = e0();
        }
        O1(b0 - e0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final boolean f1() {
        return this.z == null && !this.E;
    }

    @Override // defpackage.yon
    public final int h0(amh amhVar, kpn kpnVar) {
        if (this.p == 0) {
            return Math.min(this.F, a0());
        }
        if (kpnVar.b() < 1) {
            return 0;
        }
        return V1(kpnVar.b() - 1, amhVar, kpnVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void h1(kpn kpnVar, f7g f7gVar, ll4 ll4Var) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = f7gVar.d) >= 0 && i < kpnVar.b() && i2 > 0; i3++) {
            ll4Var.b(f7gVar.d, Math.max(0, f7gVar.g));
            this.K.getClass();
            i2--;
            f7gVar.d += f7gVar.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.a.e).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View u0(View view, int i, amh amhVar, kpn kpnVar) {
        View O;
        int Q;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        amh amhVar2 = amhVar;
        kpn kpnVar2 = kpnVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            O = recyclerView.O(view);
            if (O != null) {
            }
        }
        O = null;
        if (O != null) {
            bqd bqdVar = (bqd) O.getLayoutParams();
            int i6 = bqdVar.e;
            int i7 = bqdVar.f + i6;
            if (super.u0(view, i, amhVar, kpnVar) != null) {
                if ((l1(i) == 1) != this.u) {
                    i3 = Q() - 1;
                    Q = -1;
                    i2 = -1;
                } else {
                    Q = Q();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.p == 1 && B1();
                int V1 = V1(i3, amhVar2, kpnVar2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == Q) {
                        break;
                    }
                    int V12 = V1(i11, amhVar2, kpnVar2);
                    View P2 = P(i11);
                    if (P2 == O) {
                        break;
                    }
                    if (!P2.hasFocusable() || V12 == V1) {
                        bqd bqdVar2 = (bqd) P2.getLayoutParams();
                        int i13 = bqdVar2.e;
                        view3 = O;
                        int i14 = bqdVar2.f + i13;
                        if (P2.hasFocusable() && i13 == i6 && i14 == i7) {
                            return P2;
                        }
                        if (!(P2.hasFocusable() && view4 == null) && (P2.hasFocusable() || view2 != null)) {
                            i4 = Q;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (P2.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.c.I(P2) || !this.d.I(P2)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = Q;
                        }
                        boolean hasFocusable = P2.hasFocusable();
                        int i15 = bqdVar2.e;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = P2;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = P2;
                        }
                        i11 += i2;
                        amhVar2 = amhVar;
                        kpnVar2 = kpnVar;
                        O = view3;
                        Q = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = O;
                        i5 = i10;
                        i4 = Q;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    amhVar2 = amhVar;
                    kpnVar2 = kpnVar;
                    O = view3;
                    Q = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void w0(amh amhVar, kpn kpnVar, vb vbVar) {
        super.w0(amhVar, kpnVar, vbVar);
        vbVar.n(GridView.class.getName());
        qon qonVar = this.b.m;
        if (qonVar == null || qonVar.c() <= 1) {
            return;
        }
        vbVar.b(qb.s);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View w1(amh amhVar, kpn kpnVar, boolean z, boolean z2) {
        int i;
        int i2;
        int Q = Q();
        int i3 = 1;
        if (z2) {
            i2 = Q() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = Q;
            i2 = 0;
        }
        int b = kpnVar.b();
        m1();
        int n = this.r.n();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View P2 = P(i2);
            int f0 = yon.f0(P2);
            if (f0 >= 0 && f0 < b && W1(f0, amhVar, kpnVar) == 0) {
                if (((zon) P2.getLayoutParams()).a.k()) {
                    if (view2 == null) {
                        view2 = P2;
                    }
                } else {
                    if (this.r.e(P2) < g && this.r.b(P2) >= n) {
                        return P2;
                    }
                    if (view == null) {
                        view = P2;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // defpackage.yon
    public final void x0(amh amhVar, kpn kpnVar, View view, vb vbVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof bqd)) {
            y0(view, vbVar);
            return;
        }
        bqd bqdVar = (bqd) layoutParams;
        int V1 = V1(bqdVar.a.d(), amhVar, kpnVar);
        int i = this.p;
        int i2 = bqdVar.e;
        int i3 = bqdVar.f;
        if (i == 0) {
            vbVar.q(ub.d(false, i2, i3, V1, 1));
        } else {
            vbVar.q(ub.d(false, V1, 1, i2, i3));
        }
    }

    @Override // defpackage.yon
    public final boolean z(zon zonVar) {
        return zonVar instanceof bqd;
    }

    @Override // defpackage.yon
    public final void z0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.c).clear();
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new aqd(0);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        Z1(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new aqd(0);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        Z1(i);
    }
}
