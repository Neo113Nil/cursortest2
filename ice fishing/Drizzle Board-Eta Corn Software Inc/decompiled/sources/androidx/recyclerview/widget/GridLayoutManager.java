package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.cp;
import defpackage.d20;
import defpackage.dp;
import defpackage.ep;
import defpackage.hg0;
import defpackage.m1;
import defpackage.mcXgUFR8;
import defpackage.nSmgoSB5;
import defpackage.pl;
import defpackage.q70;
import defpackage.t10;
import defpackage.u10;
import defpackage.yl;
import defpackage.z10;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean Mq3SeTnW;
    public int[] SgZGMMPL;
    public final mcXgUFR8 VhgXwMj9;
    public final Rect aZz0PFXp;
    public final SparseIntArray eIA6dogk;
    public int euDDoUNr;
    public final SparseIntArray pRiPUEwG;
    public View[] ytu5o6f4;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Mq3SeTnW = false;
        this.euDDoUNr = -1;
        this.eIA6dogk = new SparseIntArray();
        this.pRiPUEwG = new SparseIntArray();
        this.VhgXwMj9 = new mcXgUFR8(25);
        this.aZz0PFXp = new Rect();
        h1iH8bHm(t10.eIA6dogk(context, attributeSet, i, i2).NCTxEWno);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final boolean AxnhUDtd() {
        return this.WYNAV5pd == null && !this.Mq3SeTnW;
    }

    public final void ELBHWJgD(int i) {
        int i2;
        int[] iArr = this.SgZGMMPL;
        int i3 = this.euDDoUNr;
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
        this.SgZGMMPL = iArr;
    }

    @Override // defpackage.t10
    public final void ESscZ9M1(int i, int i2) {
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        mcxgufr8.DK9slbsy();
        ((SparseIntArray) mcxgufr8.wxUZMvaN).clear();
    }

    @Override // defpackage.t10
    public final int FySoLYna(z10 z10Var, d20 d20Var) {
        if (this.lDXGDhIF == 1) {
            return this.euDDoUNr;
        }
        if (d20Var.NCTxEWno() < 1) {
            return 0;
        }
        return ORgMjIos(d20Var.NCTxEWno() - 1, z10Var, d20Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.NCTxEWno = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FzsqRtM7(z10 z10Var, d20 d20Var, ep epVar, dp dpVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int RXQxj5Oe;
        int i7;
        ?? r12;
        int i8;
        View NCTxEWno;
        int ow5vqvCr = this.OxcuoDLp.ow5vqvCr();
        boolean z = ow5vqvCr != 1073741824;
        int i9 = I5GHvsYW() > 0 ? this.SgZGMMPL[this.euDDoUNr] : 0;
        if (z) {
            brU71aZT();
        }
        boolean z2 = epVar.VgvYg0wo == 1;
        int i10 = this.euDDoUNr;
        if (!z2) {
            i10 = arJtZsWp(epVar.wxUZMvaN, z10Var, d20Var) + j8OPu0Ny(epVar.wxUZMvaN, z10Var, d20Var);
        }
        int i11 = 0;
        while (i11 < this.euDDoUNr && (i8 = epVar.wxUZMvaN) >= 0 && i8 < d20Var.NCTxEWno() && i10 > 0) {
            int i12 = epVar.wxUZMvaN;
            int j8OPu0Ny = j8OPu0Ny(i12, z10Var, d20Var);
            if (j8OPu0Ny > this.euDDoUNr) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + j8OPu0Ny + " spans but GridLayoutManager has only " + this.euDDoUNr + " spans.");
            }
            i10 -= j8OPu0Ny;
            if (i10 < 0 || (NCTxEWno = epVar.NCTxEWno(z10Var)) == null) {
                break;
            }
            this.ytu5o6f4[i11] = NCTxEWno;
            i11++;
        }
        if (z2) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.ytu5o6f4[i];
            yl ylVar = (yl) view.getLayoutParams();
            int j8OPu0Ny2 = j8OPu0Ny(t10.ytu5o6f4(view), z10Var, d20Var);
            ylVar.P7K7Inc8 = j8OPu0Ny2;
            ylVar.VgvYg0wo = i13;
            i13 += j8OPu0Ny2;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.ytu5o6f4[i15];
            if (epVar.k3x7lurq != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    qoPGr6Ce(view2, -1, true);
                } else {
                    qoPGr6Ce(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                qoPGr6Ce(view2, -1, false);
            } else {
                r12 = 0;
                qoPGr6Ce(view2, 0, false);
            }
            RecyclerView recyclerView = this.NCTxEWno;
            Rect rect = this.aZz0PFXp;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.SgZGMMPL(view2));
            }
            zgcfmssZ(view2, ow5vqvCr, r12);
            int VgvYg0wo = this.OxcuoDLp.VgvYg0wo(view2);
            if (VgvYg0wo > i14) {
                i14 = VgvYg0wo;
            }
            float P7K7Inc8 = (this.OxcuoDLp.P7K7Inc8(view2) * 1.0f) / ((yl) view2.getLayoutParams()).P7K7Inc8;
            if (P7K7Inc8 > f) {
                f = P7K7Inc8;
            }
        }
        if (z) {
            ELBHWJgD(Math.max(Math.round(f * this.euDDoUNr), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.ytu5o6f4[i16];
                zgcfmssZ(view3, 1073741824, true);
                int VgvYg0wo2 = this.OxcuoDLp.VgvYg0wo(view3);
                if (VgvYg0wo2 > i14) {
                    i14 = VgvYg0wo2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.ytu5o6f4[i17];
            if (this.OxcuoDLp.VgvYg0wo(view4) != i14) {
                yl ylVar2 = (yl) view4.getLayoutParams();
                Rect rect2 = ylVar2.NCTxEWno;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) ylVar2).topMargin + ((ViewGroup.MarginLayoutParams) ylVar2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) ylVar2).leftMargin + ((ViewGroup.MarginLayoutParams) ylVar2).rightMargin;
                int W64EBLa6 = W64EBLa6(ylVar2.VgvYg0wo, ylVar2.P7K7Inc8);
                if (this.lDXGDhIF == 1) {
                    i7 = t10.RXQxj5Oe(false, W64EBLa6, 1073741824, i19, ((ViewGroup.MarginLayoutParams) ylVar2).width);
                    RXQxj5Oe = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    RXQxj5Oe = t10.RXQxj5Oe(false, W64EBLa6, 1073741824, i18, ((ViewGroup.MarginLayoutParams) ylVar2).height);
                    i7 = makeMeasureSpec;
                }
                if (yzvmSy3z(view4, i7, RXQxj5Oe, (u10) view4.getLayoutParams())) {
                    view4.measure(i7, RXQxj5Oe);
                }
            }
        }
        dpVar.qoPGr6Ce = i14;
        int i20 = this.lDXGDhIF;
        int i21 = epVar.P7K7Inc8;
        int i22 = epVar.NCTxEWno;
        if (i20 != 1) {
            if (i21 == -1) {
                i6 = i22 - i14;
                i5 = 0;
                i4 = i22;
            } else {
                i4 = i22 + i14;
                i5 = 0;
                i6 = i22;
            }
            i22 = i5;
        } else if (i21 == -1) {
            i5 = i22 - i14;
            i6 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            i5 = i22;
            i22 += i14;
            i6 = 0;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.ytu5o6f4;
            if (i23 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i23];
            yl ylVar3 = (yl) view5.getLayoutParams();
            if (this.lDXGDhIF != 1) {
                i5 = SgZGMMPL() + this.SgZGMMPL[ylVar3.VgvYg0wo];
                i22 = this.OxcuoDLp.P7K7Inc8(view5) + i5;
            } else if (T8ZRPPeH()) {
                int Mq3SeTnW = Mq3SeTnW() + this.SgZGMMPL[this.euDDoUNr - ylVar3.VgvYg0wo];
                i4 = Mq3SeTnW;
                i6 = Mq3SeTnW - this.OxcuoDLp.P7K7Inc8(view5);
            } else {
                i6 = Mq3SeTnW() + this.SgZGMMPL[ylVar3.VgvYg0wo];
                i4 = this.OxcuoDLp.P7K7Inc8(view5) + i6;
            }
            t10.fVMzMhyS(view5, i6, i5, i4, i22);
            if (ylVar3.qoPGr6Ce.b2ZJblxo() || ylVar3.qoPGr6Ce.eVhOlqcC()) {
                dpVar.MdtA4re8 = true;
            }
            dpVar.wxUZMvaN = view5.hasFocusable() | dpVar.wxUZMvaN;
            i23++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.qoPGr6Ce.VgvYg0wo).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View HdOGZAzC(View view, int i, z10 z10Var, d20 d20Var) {
        View gjV1z5T1;
        int I5GHvsYW;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        z10 z10Var2 = z10Var;
        d20 d20Var2 = d20Var;
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            gjV1z5T1 = recyclerView.gjV1z5T1(view);
            if (gjV1z5T1 != null) {
            }
        }
        gjV1z5T1 = null;
        if (gjV1z5T1 != null) {
            yl ylVar = (yl) gjV1z5T1.getLayoutParams();
            int i6 = ylVar.VgvYg0wo;
            int i7 = ylVar.P7K7Inc8 + i6;
            if (super.HdOGZAzC(view, i, z10Var, d20Var) != null) {
                if ((tKaxLBvG(i) == 1) != this.Ey6iv0m0) {
                    i3 = I5GHvsYW() - 1;
                    I5GHvsYW = -1;
                    i2 = -1;
                } else {
                    I5GHvsYW = I5GHvsYW();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.lDXGDhIF == 1 && T8ZRPPeH();
                int ORgMjIos = ORgMjIos(i3, z10Var2, d20Var2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == I5GHvsYW) {
                        break;
                    }
                    int ORgMjIos2 = ORgMjIos(i11, z10Var2, d20Var2);
                    View Ey6iv0m0 = Ey6iv0m0(i11);
                    if (Ey6iv0m0 == gjV1z5T1) {
                        break;
                    }
                    if (!Ey6iv0m0.hasFocusable() || ORgMjIos2 == ORgMjIos) {
                        yl ylVar2 = (yl) Ey6iv0m0.getLayoutParams();
                        int i13 = ylVar2.VgvYg0wo;
                        view3 = gjV1z5T1;
                        int i14 = ylVar2.P7K7Inc8 + i13;
                        if (Ey6iv0m0.hasFocusable() && i13 == i6 && i14 == i7) {
                            return Ey6iv0m0;
                        }
                        if (!(Ey6iv0m0.hasFocusable() && view4 == null) && (Ey6iv0m0.hasFocusable() || view2 != null)) {
                            i4 = I5GHvsYW;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (Ey6iv0m0.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.MdtA4re8.VgvYg0wo(Ey6iv0m0) || !this.wxUZMvaN.VgvYg0wo(Ey6iv0m0)) {
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
                            i4 = I5GHvsYW;
                        }
                        boolean hasFocusable = Ey6iv0m0.hasFocusable();
                        int i15 = ylVar2.VgvYg0wo;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = Ey6iv0m0;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = Ey6iv0m0;
                        }
                        i11 += i2;
                        z10Var2 = z10Var;
                        d20Var2 = d20Var;
                        gjV1z5T1 = view3;
                        I5GHvsYW = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = gjV1z5T1;
                        i5 = i10;
                        i4 = I5GHvsYW;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    z10Var2 = z10Var;
                    d20Var2 = d20Var;
                    gjV1z5T1 = view3;
                    I5GHvsYW = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    public final void Hfv28Fap() {
        View[] viewArr = this.ytu5o6f4;
        if (viewArr == null || viewArr.length != this.euDDoUNr) {
            this.ytu5o6f4 = new View[this.euDDoUNr];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View JulN5IwK(z10 z10Var, d20 d20Var, boolean z, boolean z2) {
        int i;
        int i2;
        int I5GHvsYW = I5GHvsYW();
        int i3 = 1;
        if (z2) {
            i2 = I5GHvsYW() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = I5GHvsYW;
            i2 = 0;
        }
        int NCTxEWno = d20Var.NCTxEWno();
        QhQjwNAr();
        int OnDfzHZD = this.OxcuoDLp.OnDfzHZD();
        int jb9XjC4I = this.OxcuoDLp.jb9XjC4I();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View Ey6iv0m0 = Ey6iv0m0(i2);
            int ytu5o6f4 = t10.ytu5o6f4(Ey6iv0m0);
            if (ytu5o6f4 >= 0 && ytu5o6f4 < NCTxEWno && arJtZsWp(ytu5o6f4, z10Var, d20Var) == 0) {
                if (((u10) Ey6iv0m0.getLayoutParams()).qoPGr6Ce.b2ZJblxo()) {
                    if (view2 == null) {
                        view2 = Ey6iv0m0;
                    }
                } else {
                    if (this.OxcuoDLp.b2ZJblxo(Ey6iv0m0) < jb9XjC4I && this.OxcuoDLp.wxUZMvaN(Ey6iv0m0) >= OnDfzHZD) {
                        return Ey6iv0m0;
                    }
                    if (view == null) {
                        view = Ey6iv0m0;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // defpackage.t10
    public final u10 KlHjfFWx(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            yl ylVar = new yl((ViewGroup.MarginLayoutParams) layoutParams);
            ylVar.VgvYg0wo = -1;
            ylVar.P7K7Inc8 = 0;
            return ylVar;
        }
        yl ylVar2 = new yl(layoutParams);
        ylVar2.VgvYg0wo = -1;
        ylVar2.P7K7Inc8 = 0;
        return ylVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final void LfKQckgD(z10 z10Var, d20 d20Var) {
        boolean z = d20Var.P7K7Inc8;
        SparseIntArray sparseIntArray = this.pRiPUEwG;
        SparseIntArray sparseIntArray2 = this.eIA6dogk;
        if (z) {
            int I5GHvsYW = I5GHvsYW();
            for (int i = 0; i < I5GHvsYW; i++) {
                yl ylVar = (yl) Ey6iv0m0(i).getLayoutParams();
                int NCTxEWno = ylVar.qoPGr6Ce.NCTxEWno();
                sparseIntArray2.put(NCTxEWno, ylVar.P7K7Inc8);
                sparseIntArray.put(NCTxEWno, ylVar.VgvYg0wo);
            }
        }
        super.LfKQckgD(z10Var, d20Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int ORgMjIos(int i, z10 z10Var, d20 d20Var) {
        boolean z = d20Var.P7K7Inc8;
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        if (!z) {
            int i2 = this.euDDoUNr;
            mcxgufr8.getClass();
            return mcXgUFR8.WYNAV5pd(i, i2);
        }
        int NCTxEWno = z10Var.NCTxEWno(i);
        if (NCTxEWno != -1) {
            int i3 = this.euDDoUNr;
            mcxgufr8.getClass();
            return mcXgUFR8.WYNAV5pd(NCTxEWno, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int OnDfzHZD(d20 d20Var) {
        return CIYkyd1d(d20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final u10 OxcuoDLp() {
        return this.lDXGDhIF == 0 ? new yl(-2, -1) : new yl(-1, -2);
    }

    @Override // defpackage.t10
    public final void S7WAX0X5(Rect rect, int i, int i2) {
        int P7K7Inc8;
        int P7K7Inc82;
        if (this.SgZGMMPL == null) {
            super.S7WAX0X5(rect, i, i2);
        }
        int euDDoUNr = euDDoUNr() + Mq3SeTnW();
        int i7xS8jrb = i7xS8jrb() + SgZGMMPL();
        if (this.lDXGDhIF == 1) {
            int height = rect.height() + i7xS8jrb;
            RecyclerView recyclerView = this.NCTxEWno;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            P7K7Inc82 = t10.P7K7Inc8(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.SgZGMMPL;
            P7K7Inc8 = t10.P7K7Inc8(i, iArr[iArr.length - 1] + euDDoUNr, this.NCTxEWno.getMinimumWidth());
        } else {
            int width = rect.width() + euDDoUNr;
            RecyclerView recyclerView2 = this.NCTxEWno;
            WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
            P7K7Inc8 = t10.P7K7Inc8(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.SgZGMMPL;
            P7K7Inc82 = t10.P7K7Inc8(i2, iArr2[iArr2.length - 1] + i7xS8jrb, this.NCTxEWno.getMinimumHeight());
        }
        this.NCTxEWno.setMeasuredDimension(P7K7Inc8, P7K7Inc82);
    }

    @Override // defpackage.t10
    public final void TrssYQ34() {
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        mcxgufr8.DK9slbsy();
        ((SparseIntArray) mcxgufr8.wxUZMvaN).clear();
    }

    @Override // defpackage.t10
    public final void VGmz0ccI(int i, int i2) {
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        mcxgufr8.DK9slbsy();
        ((SparseIntArray) mcxgufr8.wxUZMvaN).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void VM67d7Sv(z10 z10Var, d20 d20Var, cp cpVar, int i) {
        brU71aZT();
        if (d20Var.NCTxEWno() > 0 && !d20Var.P7K7Inc8) {
            boolean z = i == 1;
            int arJtZsWp = arJtZsWp(cpVar.NCTxEWno, z10Var, d20Var);
            if (z) {
                while (arJtZsWp > 0) {
                    int i2 = cpVar.NCTxEWno;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    cpVar.NCTxEWno = i3;
                    arJtZsWp = arJtZsWp(i3, z10Var, d20Var);
                }
            } else {
                int NCTxEWno = d20Var.NCTxEWno() - 1;
                int i4 = cpVar.NCTxEWno;
                while (i4 < NCTxEWno) {
                    int i5 = i4 + 1;
                    int arJtZsWp2 = arJtZsWp(i5, z10Var, d20Var);
                    if (arJtZsWp2 <= arJtZsWp) {
                        break;
                    }
                    i4 = i5;
                    arJtZsWp = arJtZsWp2;
                }
                cpVar.NCTxEWno = i4;
            }
        }
        Hfv28Fap();
    }

    @Override // defpackage.t10
    public final boolean VgvYg0wo(u10 u10Var) {
        return u10Var instanceof yl;
    }

    public final int W64EBLa6(int i, int i2) {
        if (this.lDXGDhIF != 1 || !T8ZRPPeH()) {
            int[] iArr = this.SgZGMMPL;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.SgZGMMPL;
        int i3 = this.euDDoUNr;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int XrPeKzBk(int i, z10 z10Var, d20 d20Var) {
        brU71aZT();
        Hfv28Fap();
        return super.XrPeKzBk(i, z10Var, d20Var);
    }

    @Override // defpackage.t10
    public final u10 amk52bBQ(Context context, AttributeSet attributeSet) {
        yl ylVar = new yl(context, attributeSet);
        ylVar.VgvYg0wo = -1;
        ylVar.P7K7Inc8 = 0;
        return ylVar;
    }

    public final int arJtZsWp(int i, z10 z10Var, d20 d20Var) {
        boolean z = d20Var.P7K7Inc8;
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        if (!z) {
            int i2 = this.euDDoUNr;
            mcxgufr8.getClass();
            return i % i2;
        }
        int i3 = this.pRiPUEwG.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int NCTxEWno = z10Var.NCTxEWno(i);
        if (NCTxEWno != -1) {
            int i4 = this.euDDoUNr;
            mcxgufr8.getClass();
            return NCTxEWno % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final void brU71aZT() {
        int i7xS8jrb;
        int SgZGMMPL;
        if (this.lDXGDhIF == 1) {
            i7xS8jrb = this.OnDfzHZD - euDDoUNr();
            SgZGMMPL = Mq3SeTnW();
        } else {
            i7xS8jrb = this.ygLcUYwZ - i7xS8jrb();
            SgZGMMPL = SgZGMMPL();
        }
        ELBHWJgD(i7xS8jrb - SgZGMMPL);
    }

    @Override // defpackage.t10
    public final void bvfAo0eO(z10 z10Var, d20 d20Var, View view, nSmgoSB5 nsmgosb5) {
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof yl)) {
            KRabZ4CU(view, nsmgosb5);
            return;
        }
        yl ylVar = (yl) layoutParams;
        int ORgMjIos = ORgMjIos(ylVar.qoPGr6Ce.NCTxEWno(), z10Var, d20Var);
        int i = this.lDXGDhIF;
        int i2 = ylVar.VgvYg0wo;
        int i3 = ylVar.P7K7Inc8;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, ORgMjIos, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(ORgMjIos, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d3vfVszL(d20 d20Var, ep epVar, pl plVar) {
        int i;
        int i2 = this.euDDoUNr;
        for (int i3 = 0; i3 < this.euDDoUNr && (i = epVar.wxUZMvaN) >= 0 && i < d20Var.NCTxEWno() && i2 > 0; i3++) {
            plVar.qoPGr6Ce(epVar.wxUZMvaN, Math.max(0, epVar.b2ZJblxo));
            this.VhgXwMj9.getClass();
            i2--;
            epVar.wxUZMvaN += epVar.VgvYg0wo;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void dHPzAh2D(boolean z) {
        if (z) {
            m1.b2ZJblxo("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.dHPzAh2D(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int eVhOlqcC(d20 d20Var) {
        return CIYkyd1d(d20Var);
    }

    @Override // defpackage.t10
    public final void g2aRJUAd(int i, int i2) {
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        mcxgufr8.DK9slbsy();
        ((SparseIntArray) mcxgufr8.wxUZMvaN).clear();
    }

    @Override // defpackage.t10
    public final void gmkaJpmS(int i, int i2) {
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        mcxgufr8.DK9slbsy();
        ((SparseIntArray) mcxgufr8.wxUZMvaN).clear();
    }

    public final void h1iH8bHm(int i) {
        if (i == this.euDDoUNr) {
            return;
        }
        this.Mq3SeTnW = true;
        if (i < 1) {
            m1.sjUBp5pO(q70.VgvYg0wo("Span count should be at least 1. Provided ", i));
            return;
        }
        this.euDDoUNr = i;
        this.VhgXwMj9.DK9slbsy();
        f7oeun2L();
    }

    public final int j8OPu0Ny(int i, z10 z10Var, d20 d20Var) {
        boolean z = d20Var.P7K7Inc8;
        mcXgUFR8 mcxgufr8 = this.VhgXwMj9;
        if (!z) {
            mcxgufr8.getClass();
            return 1;
        }
        int i2 = this.eIA6dogk.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (z10Var.NCTxEWno(i) != -1) {
            mcxgufr8.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int k3x7lurq(d20 d20Var) {
        return VZZbw3BB(d20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final void pP9Y2m6O(d20 d20Var) {
        super.pP9Y2m6O(d20Var);
        this.Mq3SeTnW = false;
    }

    @Override // defpackage.t10
    public final int pRiPUEwG(z10 z10Var, d20 d20Var) {
        if (this.lDXGDhIF == 0) {
            return this.euDDoUNr;
        }
        if (d20Var.NCTxEWno() < 1) {
            return 0;
        }
        return ORgMjIos(d20Var.NCTxEWno() - 1, z10Var, d20Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int uQ3KJUK5(int i, z10 z10Var, d20 d20Var) {
        brU71aZT();
        Hfv28Fap();
        return super.uQ3KJUK5(i, z10Var, d20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.t10
    public final int ygLcUYwZ(d20 d20Var) {
        return VZZbw3BB(d20Var);
    }

    public final void zgcfmssZ(View view, int i, boolean z) {
        int i2;
        int i3;
        yl ylVar = (yl) view.getLayoutParams();
        Rect rect = ylVar.NCTxEWno;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) ylVar).topMargin + ((ViewGroup.MarginLayoutParams) ylVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) ylVar).leftMargin + ((ViewGroup.MarginLayoutParams) ylVar).rightMargin;
        int W64EBLa6 = W64EBLa6(ylVar.VgvYg0wo, ylVar.P7K7Inc8);
        if (this.lDXGDhIF == 1) {
            i3 = t10.RXQxj5Oe(false, W64EBLa6, i, i5, ((ViewGroup.MarginLayoutParams) ylVar).width);
            i2 = t10.RXQxj5Oe(true, this.OxcuoDLp.ygLcUYwZ(), this.ow5vqvCr, i4, ((ViewGroup.MarginLayoutParams) ylVar).height);
        } else {
            int RXQxj5Oe = t10.RXQxj5Oe(false, W64EBLa6, i, i4, ((ViewGroup.MarginLayoutParams) ylVar).height);
            int RXQxj5Oe2 = t10.RXQxj5Oe(true, this.OxcuoDLp.ygLcUYwZ(), this.k3x7lurq, i5, ((ViewGroup.MarginLayoutParams) ylVar).width);
            i2 = RXQxj5Oe;
            i3 = RXQxj5Oe2;
        }
        u10 u10Var = (u10) view.getLayoutParams();
        if (z ? yzvmSy3z(view, i3, i2, u10Var) : X1t0wlBd(view, i3, i2, u10Var)) {
            view.measure(i3, i2);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.Mq3SeTnW = false;
        this.euDDoUNr = -1;
        this.eIA6dogk = new SparseIntArray();
        this.pRiPUEwG = new SparseIntArray();
        this.VhgXwMj9 = new mcXgUFR8(25);
        this.aZz0PFXp = new Rect();
        h1iH8bHm(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.Mq3SeTnW = false;
        this.euDDoUNr = -1;
        this.eIA6dogk = new SparseIntArray();
        this.pRiPUEwG = new SparseIntArray();
        this.VhgXwMj9 = new mcXgUFR8(25);
        this.aZz0PFXp = new Rect();
        h1iH8bHm(i);
    }
}
