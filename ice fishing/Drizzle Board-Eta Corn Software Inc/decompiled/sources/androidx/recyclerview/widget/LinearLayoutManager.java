package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.cp;
import defpackage.d20;
import defpackage.dp;
import defpackage.ep;
import defpackage.fp;
import defpackage.g20;
import defpackage.m1;
import defpackage.m50;
import defpackage.pl;
import defpackage.q70;
import defpackage.s10;
import defpackage.t10;
import defpackage.u10;
import defpackage.we;
import defpackage.z10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends t10 {
    public final cp DK9slbsy;
    public boolean Ey6iv0m0;
    public int FySoLYna;
    public boolean I5GHvsYW;
    public final boolean KlHjfFWx;
    public we OxcuoDLp;
    public final boolean RXQxj5Oe;
    public final int U0LaHZX7;
    public fp WYNAV5pd;
    public boolean amk52bBQ;
    public int gjV1z5T1;
    public final int[] i7xS8jrb;
    public int lDXGDhIF;
    public final dp lwWCatUu;
    public ep sjUBp5pO;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.lDXGDhIF = 1;
        this.KlHjfFWx = false;
        this.Ey6iv0m0 = false;
        this.I5GHvsYW = false;
        this.RXQxj5Oe = true;
        this.FySoLYna = -1;
        this.gjV1z5T1 = Integer.MIN_VALUE;
        this.WYNAV5pd = null;
        this.DK9slbsy = new cp();
        this.lwWCatUu = new dp();
        this.U0LaHZX7 = 2;
        this.i7xS8jrb = new int[2];
        s10 eIA6dogk = t10.eIA6dogk(context, attributeSet, i, i2);
        rwijVcAB(eIA6dogk.qoPGr6Ce);
        boolean z = eIA6dogk.MdtA4re8;
        NCTxEWno(null);
        if (z != this.KlHjfFWx) {
            this.KlHjfFWx = z;
            f7oeun2L();
        }
        dHPzAh2D(eIA6dogk.wxUZMvaN);
    }

    public final void AhLfQVuM() {
        if (this.lDXGDhIF == 1 || !T8ZRPPeH()) {
            this.Ey6iv0m0 = this.KlHjfFWx;
        } else {
            this.Ey6iv0m0 = !this.KlHjfFWx;
        }
    }

    @Override // defpackage.t10
    public boolean AxnhUDtd() {
        return this.WYNAV5pd == null && this.amk52bBQ == this.I5GHvsYW;
    }

    public final View Bo5Vs0Am(int i, int i2) {
        int i3;
        int i4;
        QhQjwNAr();
        if (i2 <= i && i2 >= i) {
            return Ey6iv0m0(i);
        }
        if (this.OxcuoDLp.b2ZJblxo(Ey6iv0m0(i)) < this.OxcuoDLp.OnDfzHZD()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.lDXGDhIF == 0 ? this.MdtA4re8.wxUZMvaN(i, i2, i3, i4) : this.wxUZMvaN.wxUZMvaN(i, i2, i3, i4);
    }

    public final int CIYkyd1d(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        QhQjwNAr();
        we weVar = this.OxcuoDLp;
        boolean z = !this.RXQxj5Oe;
        return m50.NCTxEWno(d20Var, weVar, nJuO6ggC(z), YksF3V7p(z), this, this.RXQxj5Oe, this.Ey6iv0m0);
    }

    public final void CQoUvMBt(int i, int i2) {
        this.sjUBp5pO.MdtA4re8 = i2 - this.OxcuoDLp.OnDfzHZD();
        ep epVar = this.sjUBp5pO;
        epVar.wxUZMvaN = i;
        epVar.VgvYg0wo = this.Ey6iv0m0 ? 1 : -1;
        epVar.P7K7Inc8 = -1;
        epVar.NCTxEWno = i2;
        epVar.b2ZJblxo = Integer.MIN_VALUE;
    }

    @Override // defpackage.t10
    public final boolean D4B4MtvK() {
        if (this.ow5vqvCr != 1073741824 && this.k3x7lurq != 1073741824) {
            int I5GHvsYW = I5GHvsYW();
            for (int i = 0; i < I5GHvsYW; i++) {
                ViewGroup.LayoutParams layoutParams = Ey6iv0m0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void DPHdAVYO(int i, int i2, boolean z, d20 d20Var) {
        int OnDfzHZD;
        this.sjUBp5pO.ow5vqvCr = this.OxcuoDLp.k3x7lurq() == 0 && this.OxcuoDLp.Qr9iLBAD() == 0;
        this.sjUBp5pO.P7K7Inc8 = i;
        int[] iArr = this.i7xS8jrb;
        iArr[0] = 0;
        iArr[1] = 0;
        d20Var.getClass();
        int i3 = this.sjUBp5pO.P7K7Inc8;
        iArr[0] = 0;
        iArr[1] = 0;
        int max = Math.max(0, 0);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        ep epVar = this.sjUBp5pO;
        int i4 = z2 ? max2 : max;
        epVar.Qr9iLBAD = i4;
        if (!z2) {
            max = max2;
        }
        epVar.jb9XjC4I = max;
        if (z2) {
            epVar.Qr9iLBAD = this.OxcuoDLp.eVhOlqcC() + i4;
            View rAaHqhFJ = rAaHqhFJ();
            ep epVar2 = this.sjUBp5pO;
            epVar2.VgvYg0wo = this.Ey6iv0m0 ? -1 : 1;
            int ytu5o6f4 = t10.ytu5o6f4(rAaHqhFJ);
            ep epVar3 = this.sjUBp5pO;
            epVar2.wxUZMvaN = ytu5o6f4 + epVar3.VgvYg0wo;
            epVar3.NCTxEWno = this.OxcuoDLp.wxUZMvaN(rAaHqhFJ);
            OnDfzHZD = this.OxcuoDLp.wxUZMvaN(rAaHqhFJ) - this.OxcuoDLp.jb9XjC4I();
        } else {
            View QKkyGhhI = QKkyGhhI();
            ep epVar4 = this.sjUBp5pO;
            epVar4.Qr9iLBAD = this.OxcuoDLp.OnDfzHZD() + epVar4.Qr9iLBAD;
            ep epVar5 = this.sjUBp5pO;
            epVar5.VgvYg0wo = this.Ey6iv0m0 ? 1 : -1;
            int ytu5o6f42 = t10.ytu5o6f4(QKkyGhhI);
            ep epVar6 = this.sjUBp5pO;
            epVar5.wxUZMvaN = ytu5o6f42 + epVar6.VgvYg0wo;
            epVar6.NCTxEWno = this.OxcuoDLp.b2ZJblxo(QKkyGhhI);
            OnDfzHZD = (-this.OxcuoDLp.b2ZJblxo(QKkyGhhI)) + this.OxcuoDLp.OnDfzHZD();
        }
        ep epVar7 = this.sjUBp5pO;
        epVar7.MdtA4re8 = i2;
        if (z) {
            epVar7.MdtA4re8 = i2 - OnDfzHZD;
        }
        epVar7.b2ZJblxo = OnDfzHZD;
    }

    public final int DmBEA2wf(int i, z10 z10Var, d20 d20Var) {
        if (I5GHvsYW() != 0 && i != 0) {
            QhQjwNAr();
            this.sjUBp5pO.qoPGr6Ce = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            DPHdAVYO(i2, abs, true, d20Var);
            ep epVar = this.sjUBp5pO;
            int NRrvEVSS = NRrvEVSS(z10Var, epVar, d20Var, false) + epVar.b2ZJblxo;
            if (NRrvEVSS >= 0) {
                if (abs > NRrvEVSS) {
                    i = i2 * NRrvEVSS;
                }
                this.OxcuoDLp.OxcuoDLp(-i);
                this.sjUBp5pO.eVhOlqcC = i;
                return i;
            }
        }
        return 0;
    }

    public void FzsqRtM7(z10 z10Var, d20 d20Var, ep epVar, dp dpVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View NCTxEWno = epVar.NCTxEWno(z10Var);
        if (NCTxEWno == null) {
            dpVar.NCTxEWno = true;
            return;
        }
        u10 u10Var = (u10) NCTxEWno.getLayoutParams();
        List list = epVar.k3x7lurq;
        boolean z = this.Ey6iv0m0;
        int i5 = epVar.P7K7Inc8;
        if (list == null) {
            if (z == (i5 == -1)) {
                qoPGr6Ce(NCTxEWno, -1, false);
            } else {
                qoPGr6Ce(NCTxEWno, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                qoPGr6Ce(NCTxEWno, -1, true);
            } else {
                qoPGr6Ce(NCTxEWno, 0, true);
            }
        }
        u10 u10Var2 = (u10) NCTxEWno.getLayoutParams();
        Rect SgZGMMPL = this.NCTxEWno.SgZGMMPL(NCTxEWno);
        int i6 = SgZGMMPL.left + SgZGMMPL.right;
        int i7 = SgZGMMPL.top + SgZGMMPL.bottom;
        int RXQxj5Oe = t10.RXQxj5Oe(MdtA4re8(), this.OnDfzHZD, this.k3x7lurq, euDDoUNr() + Mq3SeTnW() + ((ViewGroup.MarginLayoutParams) u10Var2).leftMargin + ((ViewGroup.MarginLayoutParams) u10Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) u10Var2).width);
        int RXQxj5Oe2 = t10.RXQxj5Oe(wxUZMvaN(), this.ygLcUYwZ, this.ow5vqvCr, i7xS8jrb() + SgZGMMPL() + ((ViewGroup.MarginLayoutParams) u10Var2).topMargin + ((ViewGroup.MarginLayoutParams) u10Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) u10Var2).height);
        if (X1t0wlBd(NCTxEWno, RXQxj5Oe, RXQxj5Oe2, u10Var2)) {
            NCTxEWno.measure(RXQxj5Oe, RXQxj5Oe2);
        }
        dpVar.qoPGr6Ce = this.OxcuoDLp.VgvYg0wo(NCTxEWno);
        if (this.lDXGDhIF == 1) {
            if (T8ZRPPeH()) {
                i4 = this.OnDfzHZD - euDDoUNr();
                i2 = i4 - this.OxcuoDLp.P7K7Inc8(NCTxEWno);
            } else {
                int Mq3SeTnW = Mq3SeTnW();
                i4 = this.OxcuoDLp.P7K7Inc8(NCTxEWno) + Mq3SeTnW;
                i2 = Mq3SeTnW;
            }
            int i8 = epVar.P7K7Inc8;
            i3 = epVar.NCTxEWno;
            int i9 = dpVar.qoPGr6Ce;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int SgZGMMPL2 = SgZGMMPL();
            int P7K7Inc8 = this.OxcuoDLp.P7K7Inc8(NCTxEWno) + SgZGMMPL2;
            int i11 = epVar.P7K7Inc8;
            int i12 = epVar.NCTxEWno;
            int i13 = dpVar.qoPGr6Ce;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = SgZGMMPL2;
                i = P7K7Inc8;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = P7K7Inc8;
                i2 = i12;
                i3 = SgZGMMPL2;
                i4 = i15;
            }
        }
        t10.fVMzMhyS(NCTxEWno, i2, i3, i4, i);
        if (u10Var.qoPGr6Ce.b2ZJblxo() || u10Var.qoPGr6Ce.eVhOlqcC()) {
            dpVar.MdtA4re8 = true;
        }
        dpVar.wxUZMvaN = NCTxEWno.hasFocusable();
    }

    @Override // defpackage.t10
    public View HdOGZAzC(View view, int i, z10 z10Var, d20 d20Var) {
        int tKaxLBvG;
        AhLfQVuM();
        if (I5GHvsYW() != 0 && (tKaxLBvG = tKaxLBvG(i)) != Integer.MIN_VALUE) {
            QhQjwNAr();
            DPHdAVYO(tKaxLBvG, (int) (this.OxcuoDLp.ygLcUYwZ() * 0.33333334f), false, d20Var);
            ep epVar = this.sjUBp5pO;
            epVar.b2ZJblxo = Integer.MIN_VALUE;
            epVar.qoPGr6Ce = false;
            NRrvEVSS(z10Var, epVar, d20Var, true);
            boolean z = this.Ey6iv0m0;
            View Bo5Vs0Am = tKaxLBvG == -1 ? z ? Bo5Vs0Am(I5GHvsYW() - 1, -1) : Bo5Vs0Am(0, I5GHvsYW()) : z ? Bo5Vs0Am(0, I5GHvsYW()) : Bo5Vs0Am(I5GHvsYW() - 1, -1);
            View QKkyGhhI = tKaxLBvG == -1 ? QKkyGhhI() : rAaHqhFJ();
            if (!QKkyGhhI.hasFocusable()) {
                return Bo5Vs0Am;
            }
            if (Bo5Vs0Am != null) {
                return QKkyGhhI;
            }
        }
        return null;
    }

    public View JulN5IwK(z10 z10Var, d20 d20Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        QhQjwNAr();
        int I5GHvsYW = I5GHvsYW();
        if (z2) {
            i2 = I5GHvsYW() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = I5GHvsYW;
            i2 = 0;
            i3 = 1;
        }
        int NCTxEWno = d20Var.NCTxEWno();
        int OnDfzHZD = this.OxcuoDLp.OnDfzHZD();
        int jb9XjC4I = this.OxcuoDLp.jb9XjC4I();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View Ey6iv0m0 = Ey6iv0m0(i2);
            int ytu5o6f4 = t10.ytu5o6f4(Ey6iv0m0);
            int b2ZJblxo = this.OxcuoDLp.b2ZJblxo(Ey6iv0m0);
            int wxUZMvaN = this.OxcuoDLp.wxUZMvaN(Ey6iv0m0);
            if (ytu5o6f4 >= 0 && ytu5o6f4 < NCTxEWno) {
                if (!((u10) Ey6iv0m0.getLayoutParams()).qoPGr6Ce.b2ZJblxo()) {
                    boolean z3 = wxUZMvaN <= OnDfzHZD && b2ZJblxo < OnDfzHZD;
                    boolean z4 = b2ZJblxo >= jb9XjC4I && wxUZMvaN > jb9XjC4I;
                    if (!z3 && !z4) {
                        return Ey6iv0m0;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = Ey6iv0m0;
                        }
                        view2 = Ey6iv0m0;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = Ey6iv0m0;
                        }
                        view2 = Ey6iv0m0;
                    }
                } else if (view3 == null) {
                    view3 = Ey6iv0m0;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.t10
    public void LfKQckgD(z10 z10Var, d20 d20Var) {
        View view;
        View view2;
        View JulN5IwK;
        int i;
        int b2ZJblxo;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int wkPeYiwH;
        int i6;
        View sjUBp5pO;
        int b2ZJblxo2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.WYNAV5pd == null && this.FySoLYna == -1) && d20Var.NCTxEWno() == 0) {
            hGvurcGl(z10Var);
            return;
        }
        fp fpVar = this.WYNAV5pd;
        if (fpVar != null && (i8 = fpVar.NCTxEWno) >= 0) {
            this.FySoLYna = i8;
        }
        QhQjwNAr();
        boolean z = false;
        this.sjUBp5pO.qoPGr6Ce = false;
        AhLfQVuM();
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.qoPGr6Ce.VgvYg0wo).contains(view)) {
            view = null;
        }
        cp cpVar = this.DK9slbsy;
        if (!cpVar.VgvYg0wo || this.FySoLYna != -1 || this.WYNAV5pd != null) {
            cpVar.MdtA4re8();
            cpVar.wxUZMvaN = this.Ey6iv0m0 ^ this.I5GHvsYW;
            if (!d20Var.P7K7Inc8 && (i = this.FySoLYna) != -1) {
                if (i < 0 || i >= d20Var.NCTxEWno()) {
                    this.FySoLYna = -1;
                    this.gjV1z5T1 = Integer.MIN_VALUE;
                } else {
                    int i10 = this.FySoLYna;
                    cpVar.NCTxEWno = i10;
                    fp fpVar2 = this.WYNAV5pd;
                    if (fpVar2 != null && fpVar2.NCTxEWno >= 0) {
                        boolean z2 = fpVar2.wxUZMvaN;
                        cpVar.wxUZMvaN = z2;
                        we weVar = this.OxcuoDLp;
                        if (z2) {
                            cpVar.MdtA4re8 = weVar.jb9XjC4I() - this.WYNAV5pd.MdtA4re8;
                        } else {
                            cpVar.MdtA4re8 = weVar.OnDfzHZD() + this.WYNAV5pd.MdtA4re8;
                        }
                    } else if (this.gjV1z5T1 == Integer.MIN_VALUE) {
                        View sjUBp5pO2 = sjUBp5pO(i10);
                        if (sjUBp5pO2 == null) {
                            if (I5GHvsYW() > 0) {
                                cpVar.wxUZMvaN = (this.FySoLYna < t10.ytu5o6f4(Ey6iv0m0(0))) == this.Ey6iv0m0;
                            }
                            cpVar.qoPGr6Ce();
                        } else if (this.OxcuoDLp.VgvYg0wo(sjUBp5pO2) > this.OxcuoDLp.ygLcUYwZ()) {
                            cpVar.qoPGr6Ce();
                        } else {
                            int b2ZJblxo3 = this.OxcuoDLp.b2ZJblxo(sjUBp5pO2) - this.OxcuoDLp.OnDfzHZD();
                            we weVar2 = this.OxcuoDLp;
                            if (b2ZJblxo3 < 0) {
                                cpVar.MdtA4re8 = weVar2.OnDfzHZD();
                                cpVar.wxUZMvaN = false;
                            } else if (weVar2.jb9XjC4I() - this.OxcuoDLp.wxUZMvaN(sjUBp5pO2) < 0) {
                                cpVar.MdtA4re8 = this.OxcuoDLp.jb9XjC4I();
                                cpVar.wxUZMvaN = true;
                            } else {
                                boolean z3 = cpVar.wxUZMvaN;
                                we weVar3 = this.OxcuoDLp;
                                if (z3) {
                                    int wxUZMvaN = weVar3.wxUZMvaN(sjUBp5pO2);
                                    we weVar4 = this.OxcuoDLp;
                                    b2ZJblxo = (Integer.MIN_VALUE == weVar4.qoPGr6Ce ? 0 : weVar4.ygLcUYwZ() - weVar4.qoPGr6Ce) + wxUZMvaN;
                                } else {
                                    b2ZJblxo = weVar3.b2ZJblxo(sjUBp5pO2);
                                }
                                cpVar.MdtA4re8 = b2ZJblxo;
                            }
                        }
                    } else {
                        boolean z4 = this.Ey6iv0m0;
                        cpVar.wxUZMvaN = z4;
                        we weVar5 = this.OxcuoDLp;
                        if (z4) {
                            cpVar.MdtA4re8 = weVar5.jb9XjC4I() - this.gjV1z5T1;
                        } else {
                            cpVar.MdtA4re8 = weVar5.OnDfzHZD() + this.gjV1z5T1;
                        }
                    }
                    cpVar.VgvYg0wo = true;
                }
            }
            if (I5GHvsYW() != 0) {
                RecyclerView recyclerView2 = this.NCTxEWno;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.qoPGr6Ce.VgvYg0wo).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    u10 u10Var = (u10) view2.getLayoutParams();
                    if (!u10Var.qoPGr6Ce.b2ZJblxo() && u10Var.qoPGr6Ce.NCTxEWno() >= 0 && u10Var.qoPGr6Ce.NCTxEWno() < d20Var.NCTxEWno()) {
                        cpVar.NCTxEWno(view2, t10.ytu5o6f4(view2));
                        cpVar.VgvYg0wo = true;
                    }
                }
                boolean z5 = this.amk52bBQ;
                boolean z6 = this.I5GHvsYW;
                if (z5 == z6 && (JulN5IwK = JulN5IwK(z10Var, d20Var, cpVar.wxUZMvaN, z6)) != null) {
                    int ytu5o6f4 = t10.ytu5o6f4(JulN5IwK);
                    boolean z7 = cpVar.wxUZMvaN;
                    we weVar6 = cpVar.qoPGr6Ce;
                    if (z7) {
                        int wxUZMvaN2 = weVar6.wxUZMvaN(JulN5IwK);
                        we weVar7 = cpVar.qoPGr6Ce;
                        cpVar.MdtA4re8 = (Integer.MIN_VALUE == weVar7.qoPGr6Ce ? 0 : weVar7.ygLcUYwZ() - weVar7.qoPGr6Ce) + wxUZMvaN2;
                    } else {
                        cpVar.MdtA4re8 = weVar6.b2ZJblxo(JulN5IwK);
                    }
                    cpVar.NCTxEWno = ytu5o6f4;
                    if (!d20Var.P7K7Inc8 && AxnhUDtd()) {
                        int b2ZJblxo4 = this.OxcuoDLp.b2ZJblxo(JulN5IwK);
                        int wxUZMvaN3 = this.OxcuoDLp.wxUZMvaN(JulN5IwK);
                        int OnDfzHZD = this.OxcuoDLp.OnDfzHZD();
                        int jb9XjC4I = this.OxcuoDLp.jb9XjC4I();
                        boolean z8 = wxUZMvaN3 <= OnDfzHZD && b2ZJblxo4 < OnDfzHZD;
                        boolean z9 = b2ZJblxo4 >= jb9XjC4I && wxUZMvaN3 > jb9XjC4I;
                        if (z8 || z9) {
                            if (cpVar.wxUZMvaN) {
                                OnDfzHZD = jb9XjC4I;
                            }
                            cpVar.MdtA4re8 = OnDfzHZD;
                        }
                    }
                    cpVar.VgvYg0wo = true;
                }
            }
            cpVar.qoPGr6Ce();
            cpVar.NCTxEWno = this.I5GHvsYW ? d20Var.NCTxEWno() - 1 : 0;
            cpVar.VgvYg0wo = true;
        } else if (view != null && (this.OxcuoDLp.b2ZJblxo(view) >= this.OxcuoDLp.jb9XjC4I() || this.OxcuoDLp.wxUZMvaN(view) <= this.OxcuoDLp.OnDfzHZD())) {
            cpVar.NCTxEWno(view, t10.ytu5o6f4(view));
        }
        ep epVar = this.sjUBp5pO;
        epVar.P7K7Inc8 = epVar.eVhOlqcC >= 0 ? 1 : -1;
        int[] iArr = this.i7xS8jrb;
        iArr[0] = 0;
        iArr[1] = 0;
        d20Var.getClass();
        int i11 = this.sjUBp5pO.P7K7Inc8;
        iArr[0] = 0;
        iArr[1] = 0;
        int OnDfzHZD2 = this.OxcuoDLp.OnDfzHZD() + Math.max(0, 0);
        int eVhOlqcC = this.OxcuoDLp.eVhOlqcC() + Math.max(0, iArr[1]);
        if (d20Var.P7K7Inc8 && (i6 = this.FySoLYna) != -1 && this.gjV1z5T1 != Integer.MIN_VALUE && (sjUBp5pO = sjUBp5pO(i6)) != null) {
            boolean z10 = this.Ey6iv0m0;
            we weVar8 = this.OxcuoDLp;
            if (z10) {
                i7 = weVar8.jb9XjC4I() - this.OxcuoDLp.wxUZMvaN(sjUBp5pO);
                b2ZJblxo2 = this.gjV1z5T1;
            } else {
                b2ZJblxo2 = weVar8.b2ZJblxo(sjUBp5pO) - this.OxcuoDLp.OnDfzHZD();
                i7 = this.gjV1z5T1;
            }
            int i12 = i7 - b2ZJblxo2;
            if (i12 > 0) {
                OnDfzHZD2 += i12;
            } else {
                eVhOlqcC -= i12;
            }
        }
        boolean z11 = cpVar.wxUZMvaN;
        boolean z12 = this.Ey6iv0m0;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        VM67d7Sv(z10Var, d20Var, cpVar, i9);
        lDXGDhIF(z10Var);
        this.sjUBp5pO.ow5vqvCr = this.OxcuoDLp.k3x7lurq() == 0 && this.OxcuoDLp.Qr9iLBAD() == 0;
        this.sjUBp5pO.getClass();
        this.sjUBp5pO.jb9XjC4I = 0;
        boolean z13 = cpVar.wxUZMvaN;
        int i13 = cpVar.NCTxEWno;
        if (z13) {
            CQoUvMBt(i13, cpVar.MdtA4re8);
            ep epVar2 = this.sjUBp5pO;
            epVar2.Qr9iLBAD = OnDfzHZD2;
            NRrvEVSS(z10Var, epVar2, d20Var, false);
            ep epVar3 = this.sjUBp5pO;
            i3 = epVar3.NCTxEWno;
            int i14 = epVar3.wxUZMvaN;
            int i15 = epVar3.MdtA4re8;
            if (i15 > 0) {
                eVhOlqcC += i15;
            }
            PVxc5pbY(cpVar.NCTxEWno, cpVar.MdtA4re8);
            ep epVar4 = this.sjUBp5pO;
            epVar4.Qr9iLBAD = eVhOlqcC;
            epVar4.wxUZMvaN += epVar4.VgvYg0wo;
            NRrvEVSS(z10Var, epVar4, d20Var, false);
            ep epVar5 = this.sjUBp5pO;
            i2 = epVar5.NCTxEWno;
            int i16 = epVar5.MdtA4re8;
            if (i16 > 0) {
                CQoUvMBt(i14, i3);
                ep epVar6 = this.sjUBp5pO;
                epVar6.Qr9iLBAD = i16;
                NRrvEVSS(z10Var, epVar6, d20Var, false);
                i3 = this.sjUBp5pO.NCTxEWno;
            }
        } else {
            PVxc5pbY(i13, cpVar.MdtA4re8);
            ep epVar7 = this.sjUBp5pO;
            epVar7.Qr9iLBAD = eVhOlqcC;
            NRrvEVSS(z10Var, epVar7, d20Var, false);
            ep epVar8 = this.sjUBp5pO;
            i2 = epVar8.NCTxEWno;
            int i17 = epVar8.wxUZMvaN;
            int i18 = epVar8.MdtA4re8;
            if (i18 > 0) {
                OnDfzHZD2 += i18;
            }
            CQoUvMBt(cpVar.NCTxEWno, cpVar.MdtA4re8);
            ep epVar9 = this.sjUBp5pO;
            epVar9.Qr9iLBAD = OnDfzHZD2;
            epVar9.wxUZMvaN += epVar9.VgvYg0wo;
            NRrvEVSS(z10Var, epVar9, d20Var, false);
            ep epVar10 = this.sjUBp5pO;
            int i19 = epVar10.NCTxEWno;
            int i20 = epVar10.MdtA4re8;
            if (i20 > 0) {
                PVxc5pbY(i17, i2);
                ep epVar11 = this.sjUBp5pO;
                epVar11.Qr9iLBAD = i20;
                NRrvEVSS(z10Var, epVar11, d20Var, false);
                i2 = this.sjUBp5pO.NCTxEWno;
            }
            i3 = i19;
        }
        if (I5GHvsYW() > 0) {
            if (this.Ey6iv0m0 ^ this.I5GHvsYW) {
                int wkPeYiwH2 = wkPeYiwH(i2, z10Var, d20Var, true);
                i4 = i3 + wkPeYiwH2;
                i5 = i2 + wkPeYiwH2;
                wkPeYiwH = a3AMA6yV(i4, z10Var, d20Var, false);
            } else {
                int a3AMA6yV = a3AMA6yV(i3, z10Var, d20Var, true);
                i4 = i3 + a3AMA6yV;
                i5 = i2 + a3AMA6yV;
                wkPeYiwH = wkPeYiwH(i5, z10Var, d20Var, false);
            }
            i3 = i4 + wkPeYiwH;
            i2 = i5 + wkPeYiwH;
        }
        if (d20Var.eVhOlqcC && I5GHvsYW() != 0 && !d20Var.P7K7Inc8 && AxnhUDtd()) {
            List list2 = z10Var.wxUZMvaN;
            int size = list2.size();
            int ytu5o6f42 = t10.ytu5o6f4(Ey6iv0m0(0));
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < size) {
                g20 g20Var = (g20) list2.get(i21);
                boolean b2ZJblxo5 = g20Var.b2ZJblxo();
                View view3 = g20Var.qoPGr6Ce;
                if (!b2ZJblxo5) {
                    boolean z14 = g20Var.NCTxEWno() < ytu5o6f42 ? true : z;
                    boolean z15 = this.Ey6iv0m0;
                    we weVar9 = this.OxcuoDLp;
                    if (z14 != z15) {
                        i22 += weVar9.VgvYg0wo(view3);
                    } else {
                        i23 += weVar9.VgvYg0wo(view3);
                    }
                }
                i21++;
                z = false;
            }
            this.sjUBp5pO.k3x7lurq = list2;
            if (i22 > 0) {
                CQoUvMBt(t10.ytu5o6f4(QKkyGhhI()), i3);
                ep epVar12 = this.sjUBp5pO;
                epVar12.Qr9iLBAD = i22;
                r4 = 0;
                epVar12.MdtA4re8 = 0;
                epVar12.qoPGr6Ce(null);
                NRrvEVSS(z10Var, this.sjUBp5pO, d20Var, false);
            } else {
                r4 = 0;
            }
            if (i23 > 0) {
                PVxc5pbY(t10.ytu5o6f4(rAaHqhFJ()), i2);
                ep epVar13 = this.sjUBp5pO;
                epVar13.Qr9iLBAD = i23;
                epVar13.MdtA4re8 = r4;
                list = null;
                epVar13.qoPGr6Ce(null);
                NRrvEVSS(z10Var, this.sjUBp5pO, d20Var, r4);
            } else {
                list = null;
            }
            this.sjUBp5pO.k3x7lurq = list;
        }
        if (d20Var.P7K7Inc8) {
            cpVar.MdtA4re8();
        } else {
            we weVar10 = this.OxcuoDLp;
            weVar10.qoPGr6Ce = weVar10.ygLcUYwZ();
        }
        this.amk52bBQ = this.I5GHvsYW;
    }

    public final void LgPefDp5(z10 z10Var, ep epVar) {
        if (!epVar.qoPGr6Ce || epVar.ow5vqvCr) {
            return;
        }
        int i = epVar.b2ZJblxo;
        int i2 = epVar.jb9XjC4I;
        if (epVar.P7K7Inc8 == -1) {
            int I5GHvsYW = I5GHvsYW();
            if (i < 0) {
                return;
            }
            int Qr9iLBAD = (this.OxcuoDLp.Qr9iLBAD() - i) + i2;
            if (this.Ey6iv0m0) {
                for (int i3 = 0; i3 < I5GHvsYW; i3++) {
                    View Ey6iv0m0 = Ey6iv0m0(i3);
                    if (this.OxcuoDLp.b2ZJblxo(Ey6iv0m0) < Qr9iLBAD || this.OxcuoDLp.sjUBp5pO(Ey6iv0m0) < Qr9iLBAD) {
                        YH0kflLW(z10Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = I5GHvsYW - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View Ey6iv0m02 = Ey6iv0m0(i5);
                if (this.OxcuoDLp.b2ZJblxo(Ey6iv0m02) < Qr9iLBAD || this.OxcuoDLp.sjUBp5pO(Ey6iv0m02) < Qr9iLBAD) {
                    YH0kflLW(z10Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int I5GHvsYW2 = I5GHvsYW();
        if (!this.Ey6iv0m0) {
            for (int i7 = 0; i7 < I5GHvsYW2; i7++) {
                View Ey6iv0m03 = Ey6iv0m0(i7);
                if (this.OxcuoDLp.wxUZMvaN(Ey6iv0m03) > i6 || this.OxcuoDLp.lDXGDhIF(Ey6iv0m03) > i6) {
                    YH0kflLW(z10Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = I5GHvsYW2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View Ey6iv0m04 = Ey6iv0m0(i9);
            if (this.OxcuoDLp.wxUZMvaN(Ey6iv0m04) > i6 || this.OxcuoDLp.lDXGDhIF(Ey6iv0m04) > i6) {
                YH0kflLW(z10Var, i8, i9);
                return;
            }
        }
    }

    @Override // defpackage.t10
    public final boolean MdtA4re8() {
        return this.lDXGDhIF == 0;
    }

    @Override // defpackage.t10
    public final void NCTxEWno(String str) {
        if (this.WYNAV5pd == null) {
            super.NCTxEWno(str);
        }
    }

    public final int NRrvEVSS(z10 z10Var, ep epVar, d20 d20Var, boolean z) {
        int i;
        int i2 = epVar.MdtA4re8;
        int i3 = epVar.b2ZJblxo;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                epVar.b2ZJblxo = i3 + i2;
            }
            LgPefDp5(z10Var, epVar);
        }
        int i4 = epVar.MdtA4re8 + epVar.Qr9iLBAD;
        while (true) {
            if ((!epVar.ow5vqvCr && i4 <= 0) || (i = epVar.wxUZMvaN) < 0 || i >= d20Var.NCTxEWno()) {
                break;
            }
            dp dpVar = this.lwWCatUu;
            dpVar.qoPGr6Ce = 0;
            dpVar.NCTxEWno = false;
            dpVar.MdtA4re8 = false;
            dpVar.wxUZMvaN = false;
            FzsqRtM7(z10Var, d20Var, epVar, dpVar);
            if (!dpVar.NCTxEWno) {
                int i5 = epVar.NCTxEWno;
                int i6 = dpVar.qoPGr6Ce;
                epVar.NCTxEWno = (epVar.P7K7Inc8 * i6) + i5;
                if (!dpVar.MdtA4re8 || epVar.k3x7lurq != null || !d20Var.P7K7Inc8) {
                    epVar.MdtA4re8 -= i6;
                    i4 -= i6;
                }
                int i7 = epVar.b2ZJblxo;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    epVar.b2ZJblxo = i8;
                    int i9 = epVar.MdtA4re8;
                    if (i9 < 0) {
                        epVar.b2ZJblxo = i8 + i9;
                    }
                    LgPefDp5(z10Var, epVar);
                }
                if (z && dpVar.wxUZMvaN) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - epVar.MdtA4re8;
    }

    @Override // defpackage.t10
    public int OnDfzHZD(d20 d20Var) {
        return CIYkyd1d(d20Var);
    }

    @Override // defpackage.t10
    public u10 OxcuoDLp() {
        return new u10(-2, -2);
    }

    public final void PVxc5pbY(int i, int i2) {
        this.sjUBp5pO.MdtA4re8 = this.OxcuoDLp.jb9XjC4I() - i2;
        ep epVar = this.sjUBp5pO;
        epVar.VgvYg0wo = this.Ey6iv0m0 ? -1 : 1;
        epVar.wxUZMvaN = i;
        epVar.P7K7Inc8 = 1;
        epVar.NCTxEWno = i2;
        epVar.b2ZJblxo = Integer.MIN_VALUE;
    }

    public final View QKkyGhhI() {
        return Ey6iv0m0(this.Ey6iv0m0 ? I5GHvsYW() - 1 : 0);
    }

    public final void QhQjwNAr() {
        if (this.sjUBp5pO == null) {
            ep epVar = new ep();
            epVar.qoPGr6Ce = true;
            epVar.Qr9iLBAD = 0;
            epVar.jb9XjC4I = 0;
            epVar.k3x7lurq = null;
            this.sjUBp5pO = epVar;
        }
    }

    @Override // defpackage.t10
    public final void Qr9iLBAD(int i, pl plVar) {
        boolean z;
        int i2;
        fp fpVar = this.WYNAV5pd;
        if (fpVar == null || (i2 = fpVar.NCTxEWno) < 0) {
            AhLfQVuM();
            z = this.Ey6iv0m0;
            i2 = this.FySoLYna;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = fpVar.wxUZMvaN;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.U0LaHZX7 && i2 >= 0 && i2 < i; i4++) {
            plVar.qoPGr6Ce(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.t10
    public final Parcelable Sjrx9cEN() {
        fp fpVar = this.WYNAV5pd;
        if (fpVar != null) {
            fp fpVar2 = new fp();
            fpVar2.NCTxEWno = fpVar.NCTxEWno;
            fpVar2.MdtA4re8 = fpVar.MdtA4re8;
            fpVar2.wxUZMvaN = fpVar.wxUZMvaN;
            return fpVar2;
        }
        fp fpVar3 = new fp();
        if (I5GHvsYW() <= 0) {
            fpVar3.NCTxEWno = -1;
            return fpVar3;
        }
        QhQjwNAr();
        boolean z = this.amk52bBQ ^ this.Ey6iv0m0;
        fpVar3.wxUZMvaN = z;
        if (z) {
            View rAaHqhFJ = rAaHqhFJ();
            fpVar3.MdtA4re8 = this.OxcuoDLp.jb9XjC4I() - this.OxcuoDLp.wxUZMvaN(rAaHqhFJ);
            fpVar3.NCTxEWno = t10.ytu5o6f4(rAaHqhFJ);
            return fpVar3;
        }
        View QKkyGhhI = QKkyGhhI();
        fpVar3.NCTxEWno = t10.ytu5o6f4(QKkyGhhI);
        fpVar3.MdtA4re8 = this.OxcuoDLp.b2ZJblxo(QKkyGhhI) - this.OxcuoDLp.OnDfzHZD();
        return fpVar3;
    }

    public final boolean T8ZRPPeH() {
        return U0LaHZX7() == 1;
    }

    public final int VZZbw3BB(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        QhQjwNAr();
        we weVar = this.OxcuoDLp;
        boolean z = !this.RXQxj5Oe;
        return m50.MdtA4re8(d20Var, weVar, nJuO6ggC(z), YksF3V7p(z), this, this.RXQxj5Oe);
    }

    @Override // defpackage.t10
    public int XrPeKzBk(int i, z10 z10Var, d20 d20Var) {
        if (this.lDXGDhIF == 0) {
            return 0;
        }
        return DmBEA2wf(i, z10Var, d20Var);
    }

    public final void YH0kflLW(z10 z10Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View Ey6iv0m0 = Ey6iv0m0(i);
                orhfF2Ya(i);
                z10Var.b2ZJblxo(Ey6iv0m0);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View Ey6iv0m02 = Ey6iv0m0(i3);
            orhfF2Ya(i3);
            z10Var.b2ZJblxo(Ey6iv0m02);
        }
    }

    public final View YksF3V7p(boolean z) {
        return this.Ey6iv0m0 ? bA6YQxeu(0, I5GHvsYW(), z) : bA6YQxeu(I5GHvsYW() - 1, -1, z);
    }

    public final int ZLB5OTob(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        QhQjwNAr();
        we weVar = this.OxcuoDLp;
        boolean z = !this.RXQxj5Oe;
        return m50.qoPGr6Ce(d20Var, weVar, nJuO6ggC(z), YksF3V7p(z), this, this.RXQxj5Oe);
    }

    @Override // defpackage.t10
    public final void ZyZthT5G(AccessibilityEvent accessibilityEvent) {
        super.ZyZthT5G(accessibilityEvent);
        if (I5GHvsYW() > 0) {
            View bA6YQxeu = bA6YQxeu(0, I5GHvsYW(), false);
            accessibilityEvent.setFromIndex(bA6YQxeu == null ? -1 : t10.ytu5o6f4(bA6YQxeu));
            View bA6YQxeu2 = bA6YQxeu(I5GHvsYW() - 1, -1, false);
            accessibilityEvent.setToIndex(bA6YQxeu2 != null ? t10.ytu5o6f4(bA6YQxeu2) : -1);
        }
    }

    public final int a3AMA6yV(int i, z10 z10Var, d20 d20Var, boolean z) {
        int OnDfzHZD;
        int OnDfzHZD2 = i - this.OxcuoDLp.OnDfzHZD();
        if (OnDfzHZD2 <= 0) {
            return 0;
        }
        int i2 = -DmBEA2wf(OnDfzHZD2, z10Var, d20Var);
        int i3 = i + i2;
        if (!z || (OnDfzHZD = i3 - this.OxcuoDLp.OnDfzHZD()) <= 0) {
            return i2;
        }
        this.OxcuoDLp.OxcuoDLp(-OnDfzHZD);
        return i2 - OnDfzHZD;
    }

    @Override // defpackage.t10
    public final boolean aZz0PFXp() {
        return true;
    }

    @Override // defpackage.t10
    public final void b2ZJblxo(int i, int i2, d20 d20Var, pl plVar) {
        if (this.lDXGDhIF != 0) {
            i = i2;
        }
        if (I5GHvsYW() == 0 || i == 0) {
            return;
        }
        QhQjwNAr();
        DPHdAVYO(i > 0 ? 1 : -1, Math.abs(i), true, d20Var);
        d3vfVszL(d20Var, this.sjUBp5pO, plVar);
    }

    public final View bA6YQxeu(int i, int i2, boolean z) {
        QhQjwNAr();
        int i3 = z ? 24579 : 320;
        return this.lDXGDhIF == 0 ? this.MdtA4re8.wxUZMvaN(i, i2, i3, 320) : this.wxUZMvaN.wxUZMvaN(i, i2, i3, 320);
    }

    public void d3vfVszL(d20 d20Var, ep epVar, pl plVar) {
        int i = epVar.wxUZMvaN;
        if (i < 0 || i >= d20Var.NCTxEWno()) {
            return;
        }
        plVar.qoPGr6Ce(i, Math.max(0, epVar.b2ZJblxo));
    }

    public void dHPzAh2D(boolean z) {
        NCTxEWno(null);
        if (this.I5GHvsYW == z) {
            return;
        }
        this.I5GHvsYW = z;
        f7oeun2L();
    }

    @Override // defpackage.t10
    public int eVhOlqcC(d20 d20Var) {
        return CIYkyd1d(d20Var);
    }

    @Override // defpackage.t10
    public final int jb9XjC4I(d20 d20Var) {
        return ZLB5OTob(d20Var);
    }

    @Override // defpackage.t10
    public int k3x7lurq(d20 d20Var) {
        return VZZbw3BB(d20Var);
    }

    public final View nJuO6ggC(boolean z) {
        return this.Ey6iv0m0 ? bA6YQxeu(I5GHvsYW() - 1, -1, z) : bA6YQxeu(0, I5GHvsYW(), z);
    }

    @Override // defpackage.t10
    public final int ow5vqvCr(d20 d20Var) {
        return ZLB5OTob(d20Var);
    }

    @Override // defpackage.t10
    public void pP9Y2m6O(d20 d20Var) {
        this.WYNAV5pd = null;
        this.FySoLYna = -1;
        this.gjV1z5T1 = Integer.MIN_VALUE;
        this.DK9slbsy.MdtA4re8();
    }

    public final View rAaHqhFJ() {
        return Ey6iv0m0(this.Ey6iv0m0 ? 0 : I5GHvsYW() - 1);
    }

    public final void rwijVcAB(int i) {
        if (i != 0 && i != 1) {
            m1.sjUBp5pO(q70.VgvYg0wo("invalid orientation:", i));
            return;
        }
        NCTxEWno(null);
        if (i != this.lDXGDhIF || this.OxcuoDLp == null) {
            we NCTxEWno = we.NCTxEWno(this, i);
            this.OxcuoDLp = NCTxEWno;
            this.DK9slbsy.qoPGr6Ce = NCTxEWno;
            this.lDXGDhIF = i;
            f7oeun2L();
        }
    }

    @Override // defpackage.t10
    public final View sjUBp5pO(int i) {
        int I5GHvsYW = I5GHvsYW();
        if (I5GHvsYW == 0) {
            return null;
        }
        int ytu5o6f4 = i - t10.ytu5o6f4(Ey6iv0m0(0));
        if (ytu5o6f4 >= 0 && ytu5o6f4 < I5GHvsYW) {
            View Ey6iv0m0 = Ey6iv0m0(ytu5o6f4);
            if (t10.ytu5o6f4(Ey6iv0m0) == i) {
                return Ey6iv0m0;
            }
        }
        return super.sjUBp5pO(i);
    }

    public final int tKaxLBvG(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.lDXGDhIF == 1) ? 1 : Integer.MIN_VALUE : this.lDXGDhIF == 0 ? 1 : Integer.MIN_VALUE : this.lDXGDhIF == 1 ? -1 : Integer.MIN_VALUE : this.lDXGDhIF == 0 ? -1 : Integer.MIN_VALUE : (this.lDXGDhIF != 1 && T8ZRPPeH()) ? -1 : 1 : (this.lDXGDhIF != 1 && T8ZRPPeH()) ? 1 : -1;
    }

    @Override // defpackage.t10
    public final void tef3qNMP(Parcelable parcelable) {
        if (parcelable instanceof fp) {
            fp fpVar = (fp) parcelable;
            this.WYNAV5pd = fpVar;
            if (this.FySoLYna != -1) {
                fpVar.NCTxEWno = -1;
            }
            f7oeun2L();
        }
    }

    @Override // defpackage.t10
    public int uQ3KJUK5(int i, z10 z10Var, d20 d20Var) {
        if (this.lDXGDhIF == 1) {
            return 0;
        }
        return DmBEA2wf(i, z10Var, d20Var);
    }

    public final int wkPeYiwH(int i, z10 z10Var, d20 d20Var, boolean z) {
        int jb9XjC4I;
        int jb9XjC4I2 = this.OxcuoDLp.jb9XjC4I() - i;
        if (jb9XjC4I2 <= 0) {
            return 0;
        }
        int i2 = -DmBEA2wf(-jb9XjC4I2, z10Var, d20Var);
        int i3 = i + i2;
        if (!z || (jb9XjC4I = this.OxcuoDLp.jb9XjC4I() - i3) <= 0) {
            return i2;
        }
        this.OxcuoDLp.OxcuoDLp(jb9XjC4I);
        return jb9XjC4I + i2;
    }

    @Override // defpackage.t10
    public final boolean wxUZMvaN() {
        return this.lDXGDhIF == 1;
    }

    @Override // defpackage.t10
    public int ygLcUYwZ(d20 d20Var) {
        return VZZbw3BB(d20Var);
    }

    @Override // defpackage.t10
    public final void N8VPGzVC(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.lDXGDhIF = 1;
        this.KlHjfFWx = false;
        this.Ey6iv0m0 = false;
        this.I5GHvsYW = false;
        this.RXQxj5Oe = true;
        this.FySoLYna = -1;
        this.gjV1z5T1 = Integer.MIN_VALUE;
        this.WYNAV5pd = null;
        this.DK9slbsy = new cp();
        this.lwWCatUu = new dp();
        this.U0LaHZX7 = 2;
        this.i7xS8jrb = new int[2];
        rwijVcAB(i);
        NCTxEWno(null);
        if (z == this.KlHjfFWx) {
            return;
        }
        this.KlHjfFWx = z;
        f7oeun2L();
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void VM67d7Sv(z10 z10Var, d20 d20Var, cp cpVar, int i) {
    }
}
