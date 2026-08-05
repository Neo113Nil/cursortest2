package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.d20;
import defpackage.eo;
import defpackage.hg0;
import defpackage.i1;
import defpackage.l90;
import defpackage.m1;
import defpackage.m50;
import defpackage.m90;
import defpackage.mq;
import defpackage.n90;
import defpackage.o90;
import defpackage.pl;
import defpackage.q50;
import defpackage.s10;
import defpackage.t10;
import defpackage.u10;
import defpackage.we;
import defpackage.z10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends t10 {
    public int Ey6iv0m0;
    public final eo I5GHvsYW;
    public final int KlHjfFWx;
    public boolean Mq3SeTnW;
    public final we OxcuoDLp;
    public boolean RXQxj5Oe;
    public final Rect SgZGMMPL;
    public final int U0LaHZX7;
    public final i1 VhgXwMj9;
    public final we amk52bBQ;
    public final boolean eIA6dogk;
    public o90 euDDoUNr;
    public final BitSet gjV1z5T1;
    public boolean i7xS8jrb;
    public final int lDXGDhIF;
    public final q50 lwWCatUu;
    public int[] pRiPUEwG;
    public final mq[] sjUBp5pO;
    public final l90 ytu5o6f4;
    public boolean FySoLYna = false;
    public int WYNAV5pd = -1;
    public int DK9slbsy = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.lDXGDhIF = -1;
        this.RXQxj5Oe = false;
        q50 q50Var = new q50();
        this.lwWCatUu = q50Var;
        this.U0LaHZX7 = 2;
        this.SgZGMMPL = new Rect();
        this.ytu5o6f4 = new l90(this);
        this.eIA6dogk = true;
        this.VhgXwMj9 = new i1(9, this);
        s10 eIA6dogk = t10.eIA6dogk(context, attributeSet, i, i2);
        int i3 = eIA6dogk.qoPGr6Ce;
        if (i3 != 0 && i3 != 1) {
            m1.sjUBp5pO("invalid orientation.");
            throw null;
        }
        NCTxEWno(null);
        if (i3 != this.KlHjfFWx) {
            this.KlHjfFWx = i3;
            we weVar = this.OxcuoDLp;
            this.OxcuoDLp = this.amk52bBQ;
            this.amk52bBQ = weVar;
            f7oeun2L();
        }
        int i4 = eIA6dogk.NCTxEWno;
        NCTxEWno(null);
        if (i4 != this.lDXGDhIF) {
            q50Var.NCTxEWno();
            f7oeun2L();
            this.lDXGDhIF = i4;
            this.gjV1z5T1 = new BitSet(this.lDXGDhIF);
            this.sjUBp5pO = new mq[this.lDXGDhIF];
            for (int i5 = 0; i5 < this.lDXGDhIF; i5++) {
                this.sjUBp5pO[i5] = new mq(this, i5);
            }
            f7oeun2L();
        }
        boolean z = eIA6dogk.MdtA4re8;
        NCTxEWno(null);
        o90 o90Var = this.euDDoUNr;
        if (o90Var != null && o90Var.jb9XjC4I != z) {
            o90Var.jb9XjC4I = z;
        }
        this.RXQxj5Oe = z;
        f7oeun2L();
        eo eoVar = new eo();
        eoVar.qoPGr6Ce = true;
        eoVar.P7K7Inc8 = 0;
        eoVar.b2ZJblxo = 0;
        this.I5GHvsYW = eoVar;
        this.OxcuoDLp = we.NCTxEWno(this, this.KlHjfFWx);
        this.amk52bBQ = we.NCTxEWno(this, 1 - this.KlHjfFWx);
    }

    public static int PVxc5pbY(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void AhLfQVuM() {
        if (this.KlHjfFWx == 1 || !a3AMA6yV()) {
            this.FySoLYna = this.RXQxj5Oe;
        } else {
            this.FySoLYna = !this.RXQxj5Oe;
        }
    }

    @Override // defpackage.t10
    public final boolean AxnhUDtd() {
        return this.euDDoUNr == null;
    }

    public final int Bo5Vs0Am(int i) {
        int jb9XjC4I = this.sjUBp5pO[0].jb9XjC4I(i);
        for (int i2 = 1; i2 < this.lDXGDhIF; i2++) {
            int jb9XjC4I2 = this.sjUBp5pO[i2].jb9XjC4I(i);
            if (jb9XjC4I2 > jb9XjC4I) {
                jb9XjC4I = jb9XjC4I2;
            }
        }
        return jb9XjC4I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x026e, code lost:
    
        VM67d7Sv(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CIYkyd1d(z10 z10Var, eo eoVar, d20 d20Var) {
        int i;
        int i2;
        mq[] mqVarArr;
        BitSet bitSet;
        int i3;
        mq[] mqVarArr2;
        mq mqVar;
        ?? r5;
        int k3x7lurq;
        int VgvYg0wo;
        int i4;
        int i5;
        BitSet bitSet2;
        int i6;
        int i7;
        z10 z10Var2 = z10Var;
        BitSet bitSet3 = this.gjV1z5T1;
        int i8 = this.lDXGDhIF;
        bitSet3.set(0, i8, true);
        eo eoVar2 = this.I5GHvsYW;
        if (eoVar2.jb9XjC4I) {
            i = eoVar.VgvYg0wo;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = eoVar.VgvYg0wo;
            i2 = i == 1 ? eoVar.b2ZJblxo + eoVar.NCTxEWno : eoVar.P7K7Inc8 - eoVar.NCTxEWno;
        }
        int i9 = 0;
        while (true) {
            mqVarArr = this.sjUBp5pO;
            if (i9 >= i8) {
                break;
            }
            if (!((ArrayList) mqVarArr[i9].P7K7Inc8).isEmpty()) {
                DPHdAVYO(mqVarArr[i9], i, i2);
            }
            i9++;
        }
        boolean z = this.FySoLYna;
        we weVar = this.OxcuoDLp;
        int jb9XjC4I = z ? weVar.jb9XjC4I() : weVar.OnDfzHZD();
        boolean z2 = false;
        while (true) {
            int i10 = eoVar.MdtA4re8;
            if (i10 < 0 || i10 >= d20Var.NCTxEWno() || (!eoVar2.jb9XjC4I && bitSet3.isEmpty())) {
                break;
            }
            View wxUZMvaN = z10Var2.wxUZMvaN(eoVar.MdtA4re8);
            eoVar.MdtA4re8 += eoVar.wxUZMvaN;
            m90 m90Var = (m90) wxUZMvaN.getLayoutParams();
            int NCTxEWno = m90Var.qoPGr6Ce.NCTxEWno();
            q50 q50Var = this.lwWCatUu;
            int[] iArr = (int[]) q50Var.qoPGr6Ce;
            int i11 = (iArr == null || NCTxEWno >= iArr.length) ? -1 : iArr[NCTxEWno];
            if (i11 == -1) {
                if (T8ZRPPeH(eoVar.VgvYg0wo)) {
                    i3 = i8;
                    i7 = i8 - 1;
                    i8 = -1;
                    i6 = -1;
                } else {
                    i3 = i8;
                    i6 = 1;
                    i7 = 0;
                }
                mq mqVar2 = null;
                int i12 = i6;
                if (eoVar.VgvYg0wo == 1) {
                    int OnDfzHZD = weVar.OnDfzHZD();
                    mqVarArr2 = mqVarArr;
                    int i13 = i7;
                    int i14 = Integer.MAX_VALUE;
                    while (i13 != i8) {
                        int i15 = i13;
                        mq mqVar3 = mqVarArr2[i15];
                        BitSet bitSet4 = bitSet3;
                        int jb9XjC4I2 = mqVar3.jb9XjC4I(OnDfzHZD);
                        if (jb9XjC4I2 < i14) {
                            i14 = jb9XjC4I2;
                            mqVar2 = mqVar3;
                        }
                        i13 = i15 + i12;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    mqVarArr2 = mqVarArr;
                    int jb9XjC4I3 = weVar.jb9XjC4I();
                    int i16 = i7;
                    int i17 = Integer.MIN_VALUE;
                    while (i16 != i8) {
                        mq mqVar4 = mqVarArr2[i16];
                        int i18 = i8;
                        int k3x7lurq2 = mqVar4.k3x7lurq(jb9XjC4I3);
                        if (k3x7lurq2 > i17) {
                            i17 = k3x7lurq2;
                            mqVar2 = mqVar4;
                        }
                        i16 += i12;
                        i8 = i18;
                    }
                }
                mqVar = mqVar2;
                q50Var.MdtA4re8(NCTxEWno);
                ((int[]) q50Var.qoPGr6Ce)[NCTxEWno] = mqVar.VgvYg0wo;
            } else {
                bitSet = bitSet3;
                i3 = i8;
                mqVarArr2 = mqVarArr;
                mqVar = mqVarArr2[i11];
            }
            m90Var.VgvYg0wo = mqVar;
            if (eoVar.VgvYg0wo == 1) {
                r5 = 0;
                qoPGr6Ce(wxUZMvaN, -1, false);
            } else {
                r5 = 0;
                qoPGr6Ce(wxUZMvaN, 0, false);
            }
            int i19 = this.KlHjfFWx;
            if (i19 == 1) {
                rAaHqhFJ(wxUZMvaN, t10.RXQxj5Oe(r5, this.Ey6iv0m0, this.k3x7lurq, r5, ((ViewGroup.MarginLayoutParams) m90Var).width), t10.RXQxj5Oe(true, this.ygLcUYwZ, this.ow5vqvCr, i7xS8jrb() + SgZGMMPL(), ((ViewGroup.MarginLayoutParams) m90Var).height));
            } else {
                rAaHqhFJ(wxUZMvaN, t10.RXQxj5Oe(true, this.OnDfzHZD, this.k3x7lurq, euDDoUNr() + Mq3SeTnW(), ((ViewGroup.MarginLayoutParams) m90Var).width), t10.RXQxj5Oe(false, this.Ey6iv0m0, this.ow5vqvCr, 0, ((ViewGroup.MarginLayoutParams) m90Var).height));
            }
            if (eoVar.VgvYg0wo == 1) {
                VgvYg0wo = mqVar.jb9XjC4I(jb9XjC4I);
                k3x7lurq = weVar.VgvYg0wo(wxUZMvaN) + VgvYg0wo;
            } else {
                k3x7lurq = mqVar.k3x7lurq(jb9XjC4I);
                VgvYg0wo = k3x7lurq - weVar.VgvYg0wo(wxUZMvaN);
            }
            int i20 = eoVar.VgvYg0wo;
            mq mqVar5 = m90Var.VgvYg0wo;
            if (i20 == 1) {
                mqVar5.getClass();
                m90 m90Var2 = (m90) wxUZMvaN.getLayoutParams();
                m90Var2.VgvYg0wo = mqVar5;
                ArrayList arrayList = (ArrayList) mqVar5.P7K7Inc8;
                arrayList.add(wxUZMvaN);
                mqVar5.MdtA4re8 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    mqVar5.NCTxEWno = Integer.MIN_VALUE;
                }
                if (m90Var2.qoPGr6Ce.b2ZJblxo() || m90Var2.qoPGr6Ce.eVhOlqcC()) {
                    mqVar5.wxUZMvaN = ((StaggeredGridLayoutManager) mqVar5.b2ZJblxo).OxcuoDLp.VgvYg0wo(wxUZMvaN) + mqVar5.wxUZMvaN;
                }
            } else {
                mqVar5.getClass();
                m90 m90Var3 = (m90) wxUZMvaN.getLayoutParams();
                m90Var3.VgvYg0wo = mqVar5;
                ArrayList arrayList2 = (ArrayList) mqVar5.P7K7Inc8;
                arrayList2.add(0, wxUZMvaN);
                mqVar5.NCTxEWno = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    mqVar5.MdtA4re8 = Integer.MIN_VALUE;
                }
                if (m90Var3.qoPGr6Ce.b2ZJblxo() || m90Var3.qoPGr6Ce.eVhOlqcC()) {
                    mqVar5.wxUZMvaN = ((StaggeredGridLayoutManager) mqVar5.b2ZJblxo).OxcuoDLp.VgvYg0wo(wxUZMvaN) + mqVar5.wxUZMvaN;
                }
            }
            boolean a3AMA6yV = a3AMA6yV();
            we weVar2 = this.amk52bBQ;
            if (a3AMA6yV && i19 == 1) {
                i5 = weVar2.jb9XjC4I() - (((i3 - 1) - mqVar.VgvYg0wo) * this.Ey6iv0m0);
                i4 = i5 - weVar2.VgvYg0wo(wxUZMvaN);
            } else {
                int OnDfzHZD2 = (mqVar.VgvYg0wo * this.Ey6iv0m0) + weVar2.OnDfzHZD();
                int VgvYg0wo2 = weVar2.VgvYg0wo(wxUZMvaN) + OnDfzHZD2;
                i4 = OnDfzHZD2;
                i5 = VgvYg0wo2;
            }
            z2 = true;
            if (i19 == 1) {
                t10.fVMzMhyS(wxUZMvaN, i4, VgvYg0wo, i5, k3x7lurq);
            } else {
                t10.fVMzMhyS(wxUZMvaN, VgvYg0wo, i4, k3x7lurq, i5);
            }
            DPHdAVYO(mqVar, eoVar2.VgvYg0wo, i2);
            z10Var2 = z10Var;
            VM67d7Sv(z10Var2, eoVar2);
            if (eoVar2.Qr9iLBAD && wxUZMvaN.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(mqVar.VgvYg0wo, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i8 = i3;
            mqVarArr = mqVarArr2;
        }
        int OnDfzHZD3 = eoVar2.VgvYg0wo == -1 ? weVar.OnDfzHZD() - bA6YQxeu(weVar.OnDfzHZD()) : Bo5Vs0Am(weVar.jb9XjC4I()) - weVar.jb9XjC4I();
        if (OnDfzHZD3 > 0) {
            return Math.min(eoVar.NCTxEWno, OnDfzHZD3);
        }
        return 0;
    }

    public final void DPHdAVYO(mq mqVar, int i, int i2) {
        int i3 = mqVar.wxUZMvaN;
        int i4 = mqVar.VgvYg0wo;
        BitSet bitSet = this.gjV1z5T1;
        if (i != -1) {
            int i5 = mqVar.MdtA4re8;
            if (i5 == Integer.MIN_VALUE) {
                mqVar.qoPGr6Ce();
                i5 = mqVar.MdtA4re8;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = mqVar.NCTxEWno;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) mqVar.P7K7Inc8).get(0);
            m90 m90Var = (m90) view.getLayoutParams();
            mqVar.NCTxEWno = ((StaggeredGridLayoutManager) mqVar.b2ZJblxo).OxcuoDLp.b2ZJblxo(view);
            m90Var.getClass();
            i6 = mqVar.NCTxEWno;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    public final int DmBEA2wf(int i, z10 z10Var, d20 d20Var) {
        if (I5GHvsYW() == 0 || i == 0) {
            return 0;
        }
        FzsqRtM7(i);
        eo eoVar = this.I5GHvsYW;
        int CIYkyd1d = CIYkyd1d(z10Var, eoVar, d20Var);
        if (eoVar.NCTxEWno >= CIYkyd1d) {
            i = i < 0 ? -CIYkyd1d : CIYkyd1d;
        }
        this.OxcuoDLp.OxcuoDLp(-i);
        this.i7xS8jrb = this.FySoLYna;
        eoVar.NCTxEWno = 0;
        VM67d7Sv(z10Var, eoVar);
        return i;
    }

    @Override // defpackage.t10
    public final void ESscZ9M1(int i, int i2) {
        JulN5IwK(i, i2, 2);
    }

    @Override // defpackage.t10
    public final void FXJmAAN1() {
        this.lwWCatUu.NCTxEWno();
        for (int i = 0; i < this.lDXGDhIF; i++) {
            this.sjUBp5pO[i].NCTxEWno();
        }
    }

    public final void FzsqRtM7(int i) {
        int YksF3V7p;
        int i2;
        if (i > 0) {
            YksF3V7p = nJuO6ggC();
            i2 = 1;
        } else {
            YksF3V7p = YksF3V7p();
            i2 = -1;
        }
        eo eoVar = this.I5GHvsYW;
        eoVar.qoPGr6Ce = true;
        dHPzAh2D(YksF3V7p);
        rwijVcAB(i2);
        eoVar.MdtA4re8 = YksF3V7p + eoVar.wxUZMvaN;
        eoVar.NCTxEWno = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (a3AMA6yV() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (a3AMA6yV() == false) goto L34;
     */
    @Override // defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View HdOGZAzC(View view, int i, z10 z10Var, d20 d20Var) {
        View view2;
        int i2;
        if (I5GHvsYW() != 0) {
            RecyclerView recyclerView = this.NCTxEWno;
            if (recyclerView == null || (view2 = recyclerView.gjV1z5T1(view)) == null || ((ArrayList) this.qoPGr6Ce.VgvYg0wo).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                AhLfQVuM();
                int i3 = this.KlHjfFWx;
                if (i == 1) {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (i3 != 1) {
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
                    m90 m90Var = (m90) view2.getLayoutParams();
                    m90Var.getClass();
                    mq mqVar = m90Var.VgvYg0wo;
                    int nJuO6ggC = i2 == 1 ? nJuO6ggC() : YksF3V7p();
                    dHPzAh2D(nJuO6ggC);
                    rwijVcAB(i2);
                    eo eoVar = this.I5GHvsYW;
                    eoVar.MdtA4re8 = eoVar.wxUZMvaN + nJuO6ggC;
                    eoVar.NCTxEWno = (int) (this.OxcuoDLp.ygLcUYwZ() * 0.33333334f);
                    eoVar.Qr9iLBAD = true;
                    eoVar.qoPGr6Ce = false;
                    CIYkyd1d(z10Var, eoVar, d20Var);
                    this.i7xS8jrb = this.FySoLYna;
                    View eVhOlqcC = mqVar.eVhOlqcC(nJuO6ggC, i2);
                    if (eVhOlqcC != null && eVhOlqcC != view2) {
                        return eVhOlqcC;
                    }
                    boolean T8ZRPPeH = T8ZRPPeH(i2);
                    mq[] mqVarArr = this.sjUBp5pO;
                    int i4 = this.lDXGDhIF;
                    if (T8ZRPPeH) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View eVhOlqcC2 = mqVarArr[i5].eVhOlqcC(nJuO6ggC, i2);
                            if (eVhOlqcC2 != null && eVhOlqcC2 != view2) {
                                return eVhOlqcC2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View eVhOlqcC3 = mqVarArr[i6].eVhOlqcC(nJuO6ggC, i2);
                            if (eVhOlqcC3 != null && eVhOlqcC3 != view2) {
                                return eVhOlqcC3;
                            }
                        }
                    }
                    boolean z = (this.RXQxj5Oe ^ true) == (i2 == -1);
                    View sjUBp5pO = sjUBp5pO(z ? mqVar.VgvYg0wo() : mqVar.P7K7Inc8());
                    if (sjUBp5pO != null && sjUBp5pO != view2) {
                        return sjUBp5pO;
                    }
                    if (T8ZRPPeH(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != mqVar.VgvYg0wo) {
                                View sjUBp5pO2 = sjUBp5pO(z ? mqVarArr[i7].VgvYg0wo() : mqVarArr[i7].P7K7Inc8());
                                if (sjUBp5pO2 != null && sjUBp5pO2 != view2) {
                                    return sjUBp5pO2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View sjUBp5pO3 = sjUBp5pO(z ? mqVarArr[i8].VgvYg0wo() : mqVarArr[i8].P7K7Inc8());
                            if (sjUBp5pO3 != null && sjUBp5pO3 != view2) {
                                return sjUBp5pO3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JulN5IwK(int i, int i2, int i3) {
        int i4;
        int i5;
        q50 q50Var;
        int[] iArr;
        ArrayList arrayList;
        n90 n90Var;
        int i6;
        int nJuO6ggC = this.FySoLYna ? nJuO6ggC() : YksF3V7p();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                q50Var = this.lwWCatUu;
                iArr = (int[]) q50Var.qoPGr6Ce;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) q50Var.NCTxEWno;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                n90Var = null;
                                break;
                            }
                            n90Var = (n90) ((ArrayList) q50Var.NCTxEWno).get(size);
                            if (n90Var.NCTxEWno == i5) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (n90Var != null) {
                            ((ArrayList) q50Var.NCTxEWno).remove(n90Var);
                        }
                        int size2 = ((ArrayList) q50Var.NCTxEWno).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((n90) ((ArrayList) q50Var.NCTxEWno).get(i7)).NCTxEWno >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            n90 n90Var2 = (n90) ((ArrayList) q50Var.NCTxEWno).get(i7);
                            ((ArrayList) q50Var.NCTxEWno).remove(i7);
                            i6 = n90Var2.NCTxEWno;
                            int[] iArr2 = (int[]) q50Var.qoPGr6Ce;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) q50Var.qoPGr6Ce).length;
                            } else {
                                Arrays.fill((int[]) q50Var.qoPGr6Ce, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) q50Var.qoPGr6Ce;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    q50Var.P7K7Inc8(i, i2);
                } else if (i3 == 2) {
                    q50Var.b2ZJblxo(i, i2);
                } else if (i3 == 8) {
                    q50Var.b2ZJblxo(i, 1);
                    q50Var.P7K7Inc8(i2, 1);
                }
                if (i4 > nJuO6ggC) {
                    return;
                }
                if (i5 <= (this.FySoLYna ? YksF3V7p() : nJuO6ggC())) {
                    f7oeun2L();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        q50Var = this.lwWCatUu;
        iArr = (int[]) q50Var.qoPGr6Ce;
        if (iArr != null) {
            arrayList = (ArrayList) q50Var.NCTxEWno;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) q50Var.qoPGr6Ce;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > nJuO6ggC) {
        }
    }

    @Override // defpackage.t10
    public final u10 KlHjfFWx(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new m90((ViewGroup.MarginLayoutParams) layoutParams) : new m90(layoutParams);
    }

    @Override // defpackage.t10
    public final void LfKQckgD(z10 z10Var, d20 d20Var) {
        QKkyGhhI(z10Var, d20Var, true);
    }

    public final void LgPefDp5(z10 z10Var, int i) {
        for (int I5GHvsYW = I5GHvsYW() - 1; I5GHvsYW >= 0; I5GHvsYW--) {
            View Ey6iv0m0 = Ey6iv0m0(I5GHvsYW);
            we weVar = this.OxcuoDLp;
            if (weVar.b2ZJblxo(Ey6iv0m0) < i || weVar.sjUBp5pO(Ey6iv0m0) < i) {
                return;
            }
            m90 m90Var = (m90) Ey6iv0m0.getLayoutParams();
            m90Var.getClass();
            if (((ArrayList) m90Var.VgvYg0wo.P7K7Inc8).size() == 1) {
                return;
            }
            mq mqVar = m90Var.VgvYg0wo;
            ArrayList arrayList = (ArrayList) mqVar.P7K7Inc8;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            m90 m90Var2 = (m90) view.getLayoutParams();
            m90Var2.VgvYg0wo = null;
            if (m90Var2.qoPGr6Ce.b2ZJblxo() || m90Var2.qoPGr6Ce.eVhOlqcC()) {
                mqVar.wxUZMvaN -= ((StaggeredGridLayoutManager) mqVar.b2ZJblxo).OxcuoDLp.VgvYg0wo(view);
            }
            if (size == 1) {
                mqVar.NCTxEWno = Integer.MIN_VALUE;
            }
            mqVar.MdtA4re8 = Integer.MIN_VALUE;
            QT4Tf9Dt(Ey6iv0m0, z10Var);
        }
    }

    @Override // defpackage.t10
    public final void LvHlPNBd(int i) {
        if (i == 0) {
            d3vfVszL();
        }
    }

    @Override // defpackage.t10
    public final boolean MdtA4re8() {
        return this.KlHjfFWx == 0;
    }

    @Override // defpackage.t10
    public final void N8VPGzVC(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.NCTxEWno;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.VhgXwMj9);
        }
        for (int i = 0; i < this.lDXGDhIF; i++) {
            this.sjUBp5pO[i].NCTxEWno();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.t10
    public final void NCTxEWno(String str) {
        if (this.euDDoUNr == null) {
            super.NCTxEWno(str);
        }
    }

    public final void NRrvEVSS(z10 z10Var, d20 d20Var, boolean z) {
        int OnDfzHZD;
        int bA6YQxeu = bA6YQxeu(Integer.MAX_VALUE);
        if (bA6YQxeu != Integer.MAX_VALUE && (OnDfzHZD = bA6YQxeu - this.OxcuoDLp.OnDfzHZD()) > 0) {
            int DmBEA2wf = OnDfzHZD - DmBEA2wf(OnDfzHZD, z10Var, d20Var);
            if (!z || DmBEA2wf <= 0) {
                return;
            }
            this.OxcuoDLp.OxcuoDLp(-DmBEA2wf);
        }
    }

    @Override // defpackage.t10
    public final int OnDfzHZD(d20 d20Var) {
        return ZLB5OTob(d20Var);
    }

    @Override // defpackage.t10
    public final u10 OxcuoDLp() {
        return this.KlHjfFWx == 0 ? new m90(-2, -1) : new m90(-1, -2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < YksF3V7p()) != r17.FySoLYna) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.FySoLYna != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QKkyGhhI(z10 z10Var, d20 d20Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        o90 o90Var;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        o90 o90Var2 = this.euDDoUNr;
        l90 l90Var = this.ytu5o6f4;
        if (!(o90Var2 == null && this.WYNAV5pd == -1) && d20Var.NCTxEWno() == 0) {
            hGvurcGl(z10Var);
            l90Var.qoPGr6Ce();
            return;
        }
        boolean z6 = l90Var.VgvYg0wo;
        StaggeredGridLayoutManager staggeredGridLayoutManager = l90Var.b2ZJblxo;
        boolean z7 = (z6 && this.WYNAV5pd == -1 && this.euDDoUNr == null) ? false : true;
        mq[] mqVarArr = this.sjUBp5pO;
        int i4 = this.lDXGDhIF;
        q50 q50Var = this.lwWCatUu;
        if (z7) {
            l90Var.qoPGr6Ce();
            o90 o90Var3 = this.euDDoUNr;
            we weVar = this.OxcuoDLp;
            if (o90Var3 != null) {
                int i5 = o90Var3.wxUZMvaN;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            mqVarArr[i6].NCTxEWno();
                            o90 o90Var4 = this.euDDoUNr;
                            int i7 = o90Var4.VgvYg0wo[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += o90Var4.eVhOlqcC ? weVar.jb9XjC4I() : weVar.OnDfzHZD();
                            }
                            mq mqVar = mqVarArr[i6];
                            mqVar.NCTxEWno = i7;
                            mqVar.MdtA4re8 = i7;
                        }
                    } else {
                        o90Var3.VgvYg0wo = null;
                        o90Var3.wxUZMvaN = 0;
                        o90Var3.P7K7Inc8 = 0;
                        o90Var3.b2ZJblxo = null;
                        o90Var3.Qr9iLBAD = null;
                        o90Var3.NCTxEWno = o90Var3.MdtA4re8;
                    }
                }
                o90 o90Var5 = this.euDDoUNr;
                this.Mq3SeTnW = o90Var5.k3x7lurq;
                boolean z8 = o90Var5.jb9XjC4I;
                NCTxEWno(null);
                o90 o90Var6 = this.euDDoUNr;
                if (o90Var6 != null && o90Var6.jb9XjC4I != z8) {
                    o90Var6.jb9XjC4I = z8;
                }
                this.RXQxj5Oe = z8;
                f7oeun2L();
                AhLfQVuM();
                o90 o90Var7 = this.euDDoUNr;
                int i8 = o90Var7.NCTxEWno;
                if (i8 != -1) {
                    this.WYNAV5pd = i8;
                    l90Var.MdtA4re8 = o90Var7.eVhOlqcC;
                } else {
                    l90Var.MdtA4re8 = this.FySoLYna;
                }
                if (o90Var7.P7K7Inc8 > 1) {
                    q50Var.qoPGr6Ce = o90Var7.b2ZJblxo;
                    q50Var.NCTxEWno = o90Var7.Qr9iLBAD;
                }
            } else {
                AhLfQVuM();
                l90Var.MdtA4re8 = this.FySoLYna;
            }
            if (!d20Var.P7K7Inc8 && (i3 = this.WYNAV5pd) != -1) {
                if (i3 < 0 || i3 >= d20Var.NCTxEWno()) {
                    this.WYNAV5pd = -1;
                    this.DK9slbsy = Integer.MIN_VALUE;
                } else {
                    o90 o90Var8 = this.euDDoUNr;
                    if (o90Var8 == null || o90Var8.NCTxEWno == -1 || o90Var8.wxUZMvaN < 1) {
                        View sjUBp5pO = sjUBp5pO(this.WYNAV5pd);
                        if (sjUBp5pO != null) {
                            l90Var.qoPGr6Ce = this.FySoLYna ? nJuO6ggC() : YksF3V7p();
                            if (this.DK9slbsy != Integer.MIN_VALUE) {
                                if (l90Var.MdtA4re8) {
                                    l90Var.NCTxEWno = (weVar.jb9XjC4I() - this.DK9slbsy) - weVar.wxUZMvaN(sjUBp5pO);
                                } else {
                                    l90Var.NCTxEWno = (weVar.OnDfzHZD() + this.DK9slbsy) - weVar.b2ZJblxo(sjUBp5pO);
                                }
                            } else if (weVar.VgvYg0wo(sjUBp5pO) > weVar.ygLcUYwZ()) {
                                l90Var.NCTxEWno = l90Var.MdtA4re8 ? weVar.jb9XjC4I() : weVar.OnDfzHZD();
                            } else {
                                int b2ZJblxo = weVar.b2ZJblxo(sjUBp5pO) - weVar.OnDfzHZD();
                                if (b2ZJblxo < 0) {
                                    l90Var.NCTxEWno = -b2ZJblxo;
                                } else {
                                    int jb9XjC4I = weVar.jb9XjC4I() - weVar.wxUZMvaN(sjUBp5pO);
                                    if (jb9XjC4I < 0) {
                                        l90Var.NCTxEWno = jb9XjC4I;
                                    } else {
                                        l90Var.NCTxEWno = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.WYNAV5pd;
                            l90Var.qoPGr6Ce = i9;
                            int i10 = this.DK9slbsy;
                            if (i10 == Integer.MIN_VALUE) {
                                if (I5GHvsYW() == 0) {
                                }
                                l90Var.MdtA4re8 = z5;
                                we weVar2 = staggeredGridLayoutManager.OxcuoDLp;
                                l90Var.NCTxEWno = z5 ? weVar2.jb9XjC4I() : weVar2.OnDfzHZD();
                            } else {
                                boolean z9 = l90Var.MdtA4re8;
                                we weVar3 = staggeredGridLayoutManager.OxcuoDLp;
                                if (z9) {
                                    l90Var.NCTxEWno = weVar3.jb9XjC4I() - i10;
                                } else {
                                    l90Var.NCTxEWno = weVar3.OnDfzHZD() + i10;
                                }
                            }
                            z4 = true;
                            l90Var.wxUZMvaN = true;
                            l90Var.VgvYg0wo = z4;
                        }
                    } else {
                        l90Var.NCTxEWno = Integer.MIN_VALUE;
                        l90Var.qoPGr6Ce = this.WYNAV5pd;
                    }
                    z4 = true;
                    l90Var.VgvYg0wo = z4;
                }
            }
            if (this.i7xS8jrb) {
                int NCTxEWno = d20Var.NCTxEWno();
                for (int I5GHvsYW = I5GHvsYW() - 1; I5GHvsYW >= 0; I5GHvsYW--) {
                    i2 = t10.ytu5o6f4(Ey6iv0m0(I5GHvsYW));
                    if (i2 >= 0 && i2 < NCTxEWno) {
                        break;
                    }
                }
                i2 = 0;
                l90Var.qoPGr6Ce = i2;
                l90Var.NCTxEWno = Integer.MIN_VALUE;
                z4 = true;
                l90Var.VgvYg0wo = z4;
            } else {
                int NCTxEWno2 = d20Var.NCTxEWno();
                int I5GHvsYW2 = I5GHvsYW();
                for (int i11 = 0; i11 < I5GHvsYW2; i11++) {
                    int ytu5o6f4 = t10.ytu5o6f4(Ey6iv0m0(i11));
                    if (ytu5o6f4 >= 0 && ytu5o6f4 < NCTxEWno2) {
                        i2 = ytu5o6f4;
                        break;
                    }
                }
                i2 = 0;
                l90Var.qoPGr6Ce = i2;
                l90Var.NCTxEWno = Integer.MIN_VALUE;
                z4 = true;
                l90Var.VgvYg0wo = z4;
            }
        }
        if (this.euDDoUNr == null && this.WYNAV5pd == -1 && !(l90Var.MdtA4re8 == this.i7xS8jrb && a3AMA6yV() == this.Mq3SeTnW)) {
            q50Var.NCTxEWno();
            i = 1;
            l90Var.wxUZMvaN = true;
        } else {
            i = 1;
        }
        if (I5GHvsYW() > 0 && ((o90Var = this.euDDoUNr) == null || o90Var.wxUZMvaN < i)) {
            if (l90Var.wxUZMvaN) {
                for (int i12 = 0; i12 < i4; i12++) {
                    mqVarArr[i12].NCTxEWno();
                    int i13 = l90Var.NCTxEWno;
                    if (i13 != Integer.MIN_VALUE) {
                        mq mqVar2 = mqVarArr[i12];
                        mqVar2.NCTxEWno = i13;
                        mqVar2.MdtA4re8 = i13;
                    }
                }
            } else if (z7 || l90Var.P7K7Inc8 == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    mq mqVar3 = mqVarArr[i14];
                    boolean z10 = this.FySoLYna;
                    int i15 = l90Var.NCTxEWno;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) mqVar3.b2ZJblxo;
                    int jb9XjC4I2 = z10 ? mqVar3.jb9XjC4I(Integer.MIN_VALUE) : mqVar3.k3x7lurq(Integer.MIN_VALUE);
                    mqVar3.NCTxEWno();
                    if (jb9XjC4I2 != Integer.MIN_VALUE && ((!z10 || jb9XjC4I2 >= staggeredGridLayoutManager2.OxcuoDLp.jb9XjC4I()) && (z10 || jb9XjC4I2 <= staggeredGridLayoutManager2.OxcuoDLp.OnDfzHZD()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            jb9XjC4I2 += i15;
                        }
                        mqVar3.MdtA4re8 = jb9XjC4I2;
                        mqVar3.NCTxEWno = jb9XjC4I2;
                    }
                }
                int length = mqVarArr.length;
                int[] iArr = l90Var.P7K7Inc8;
                if (iArr == null || iArr.length < length) {
                    l90Var.P7K7Inc8 = new int[staggeredGridLayoutManager.sjUBp5pO.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    l90Var.P7K7Inc8[i16] = mqVarArr[i16].k3x7lurq(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    mq mqVar4 = mqVarArr[i17];
                    mqVar4.NCTxEWno();
                    int i18 = l90Var.P7K7Inc8[i17];
                    mqVar4.NCTxEWno = i18;
                    mqVar4.MdtA4re8 = i18;
                }
            }
        }
        lDXGDhIF(z10Var);
        eo eoVar = this.I5GHvsYW;
        eoVar.qoPGr6Ce = false;
        we weVar4 = this.amk52bBQ;
        int ygLcUYwZ = weVar4.ygLcUYwZ();
        this.Ey6iv0m0 = ygLcUYwZ / i4;
        View.MeasureSpec.makeMeasureSpec(ygLcUYwZ, weVar4.k3x7lurq());
        dHPzAh2D(l90Var.qoPGr6Ce);
        if (l90Var.MdtA4re8) {
            rwijVcAB(-1);
            CIYkyd1d(z10Var, eoVar, d20Var);
            rwijVcAB(1);
            eoVar.MdtA4re8 = l90Var.qoPGr6Ce + eoVar.wxUZMvaN;
            CIYkyd1d(z10Var, eoVar, d20Var);
        } else {
            rwijVcAB(1);
            CIYkyd1d(z10Var, eoVar, d20Var);
            rwijVcAB(-1);
            eoVar.MdtA4re8 = l90Var.qoPGr6Ce + eoVar.wxUZMvaN;
            CIYkyd1d(z10Var, eoVar, d20Var);
        }
        if (weVar4.k3x7lurq() != 1073741824) {
            int I5GHvsYW3 = I5GHvsYW();
            float f = 0.0f;
            for (int i19 = 0; i19 < I5GHvsYW3; i19++) {
                View Ey6iv0m0 = Ey6iv0m0(i19);
                float VgvYg0wo = weVar4.VgvYg0wo(Ey6iv0m0);
                if (VgvYg0wo >= f) {
                    ((m90) Ey6iv0m0.getLayoutParams()).getClass();
                    f = Math.max(f, VgvYg0wo);
                }
            }
            int i20 = this.Ey6iv0m0;
            int round = Math.round(f * i4);
            if (weVar4.k3x7lurq() == Integer.MIN_VALUE) {
                round = Math.min(round, weVar4.ygLcUYwZ());
            }
            this.Ey6iv0m0 = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, weVar4.k3x7lurq());
            if (this.Ey6iv0m0 != i20) {
                for (int i21 = 0; i21 < I5GHvsYW3; i21++) {
                    View Ey6iv0m02 = Ey6iv0m0(i21);
                    m90 m90Var = (m90) Ey6iv0m02.getLayoutParams();
                    m90Var.getClass();
                    boolean a3AMA6yV = a3AMA6yV();
                    int i22 = this.KlHjfFWx;
                    if (a3AMA6yV && i22 == 1) {
                        int i23 = -((i4 - 1) - m90Var.VgvYg0wo.VgvYg0wo);
                        Ey6iv0m02.offsetLeftAndRight((this.Ey6iv0m0 * i23) - (i23 * i20));
                    } else {
                        int i24 = m90Var.VgvYg0wo.VgvYg0wo;
                        int i25 = this.Ey6iv0m0 * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            Ey6iv0m02.offsetLeftAndRight(i25 - i26);
                        } else {
                            Ey6iv0m02.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (I5GHvsYW() <= 0) {
            z2 = true;
        } else if (this.FySoLYna) {
            z2 = true;
            QhQjwNAr(z10Var, d20Var, true);
            NRrvEVSS(z10Var, d20Var, false);
        } else {
            z2 = true;
            NRrvEVSS(z10Var, d20Var, true);
            QhQjwNAr(z10Var, d20Var, false);
        }
        if (z && !d20Var.P7K7Inc8 && this.U0LaHZX7 != 0 && I5GHvsYW() > 0 && wkPeYiwH() != null) {
            RecyclerView recyclerView = this.NCTxEWno;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.VhgXwMj9);
            }
            if (d3vfVszL()) {
                z3 = z2;
                if (d20Var.P7K7Inc8) {
                    l90Var.qoPGr6Ce();
                }
                this.i7xS8jrb = l90Var.MdtA4re8;
                this.Mq3SeTnW = a3AMA6yV();
                if (z3) {
                    return;
                }
                l90Var.qoPGr6Ce();
                QKkyGhhI(z10Var, d20Var, false);
                return;
            }
        }
        z3 = false;
        if (d20Var.P7K7Inc8) {
        }
        this.i7xS8jrb = l90Var.MdtA4re8;
        this.Mq3SeTnW = a3AMA6yV();
        if (z3) {
        }
    }

    public final void QhQjwNAr(z10 z10Var, d20 d20Var, boolean z) {
        int jb9XjC4I;
        int Bo5Vs0Am = Bo5Vs0Am(Integer.MIN_VALUE);
        if (Bo5Vs0Am != Integer.MIN_VALUE && (jb9XjC4I = this.OxcuoDLp.jb9XjC4I() - Bo5Vs0Am) > 0) {
            int i = jb9XjC4I - (-DmBEA2wf(-jb9XjC4I, z10Var, d20Var));
            if (!z || i <= 0) {
                return;
            }
            this.OxcuoDLp.OxcuoDLp(i);
        }
    }

    @Override // defpackage.t10
    public final void S7WAX0X5(Rect rect, int i, int i2) {
        int P7K7Inc8;
        int P7K7Inc82;
        int euDDoUNr = euDDoUNr() + Mq3SeTnW();
        int i7xS8jrb = i7xS8jrb() + SgZGMMPL();
        int i3 = this.KlHjfFWx;
        int i4 = this.lDXGDhIF;
        if (i3 == 1) {
            int height = rect.height() + i7xS8jrb;
            RecyclerView recyclerView = this.NCTxEWno;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            P7K7Inc82 = t10.P7K7Inc8(i2, height, recyclerView.getMinimumHeight());
            P7K7Inc8 = t10.P7K7Inc8(i, (this.Ey6iv0m0 * i4) + euDDoUNr, this.NCTxEWno.getMinimumWidth());
        } else {
            int width = rect.width() + euDDoUNr;
            RecyclerView recyclerView2 = this.NCTxEWno;
            WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
            P7K7Inc8 = t10.P7K7Inc8(i, width, recyclerView2.getMinimumWidth());
            P7K7Inc82 = t10.P7K7Inc8(i2, (this.Ey6iv0m0 * i4) + i7xS8jrb, this.NCTxEWno.getMinimumHeight());
        }
        this.NCTxEWno.setMeasuredDimension(P7K7Inc8, P7K7Inc82);
    }

    @Override // defpackage.t10
    public final Parcelable Sjrx9cEN() {
        int k3x7lurq;
        int OnDfzHZD;
        int[] iArr;
        o90 o90Var = this.euDDoUNr;
        if (o90Var != null) {
            o90 o90Var2 = new o90();
            o90Var2.wxUZMvaN = o90Var.wxUZMvaN;
            o90Var2.NCTxEWno = o90Var.NCTxEWno;
            o90Var2.MdtA4re8 = o90Var.MdtA4re8;
            o90Var2.VgvYg0wo = o90Var.VgvYg0wo;
            o90Var2.P7K7Inc8 = o90Var.P7K7Inc8;
            o90Var2.b2ZJblxo = o90Var.b2ZJblxo;
            o90Var2.jb9XjC4I = o90Var.jb9XjC4I;
            o90Var2.eVhOlqcC = o90Var.eVhOlqcC;
            o90Var2.k3x7lurq = o90Var.k3x7lurq;
            o90Var2.Qr9iLBAD = o90Var.Qr9iLBAD;
            return o90Var2;
        }
        o90 o90Var3 = new o90();
        o90Var3.jb9XjC4I = this.RXQxj5Oe;
        o90Var3.eVhOlqcC = this.i7xS8jrb;
        o90Var3.k3x7lurq = this.Mq3SeTnW;
        q50 q50Var = this.lwWCatUu;
        if (q50Var == null || (iArr = (int[]) q50Var.qoPGr6Ce) == null) {
            o90Var3.P7K7Inc8 = 0;
        } else {
            o90Var3.b2ZJblxo = iArr;
            o90Var3.P7K7Inc8 = iArr.length;
            o90Var3.Qr9iLBAD = (ArrayList) q50Var.NCTxEWno;
        }
        if (I5GHvsYW() <= 0) {
            o90Var3.NCTxEWno = -1;
            o90Var3.MdtA4re8 = -1;
            o90Var3.wxUZMvaN = 0;
            return o90Var3;
        }
        o90Var3.NCTxEWno = this.i7xS8jrb ? nJuO6ggC() : YksF3V7p();
        View VZZbw3BB = this.FySoLYna ? VZZbw3BB(true) : tKaxLBvG(true);
        o90Var3.MdtA4re8 = VZZbw3BB != null ? t10.ytu5o6f4(VZZbw3BB) : -1;
        int i = this.lDXGDhIF;
        o90Var3.wxUZMvaN = i;
        o90Var3.VgvYg0wo = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.i7xS8jrb;
            we weVar = this.OxcuoDLp;
            mq[] mqVarArr = this.sjUBp5pO;
            if (z) {
                k3x7lurq = mqVarArr[i2].jb9XjC4I(Integer.MIN_VALUE);
                if (k3x7lurq != Integer.MIN_VALUE) {
                    OnDfzHZD = weVar.jb9XjC4I();
                    k3x7lurq -= OnDfzHZD;
                    o90Var3.VgvYg0wo[i2] = k3x7lurq;
                } else {
                    o90Var3.VgvYg0wo[i2] = k3x7lurq;
                }
            } else {
                k3x7lurq = mqVarArr[i2].k3x7lurq(Integer.MIN_VALUE);
                if (k3x7lurq != Integer.MIN_VALUE) {
                    OnDfzHZD = weVar.OnDfzHZD();
                    k3x7lurq -= OnDfzHZD;
                    o90Var3.VgvYg0wo[i2] = k3x7lurq;
                } else {
                    o90Var3.VgvYg0wo[i2] = k3x7lurq;
                }
            }
        }
        return o90Var3;
    }

    public final boolean T8ZRPPeH(int i) {
        if (this.KlHjfFWx == 0) {
            return (i == -1) != this.FySoLYna;
        }
        return ((i == -1) == this.FySoLYna) == a3AMA6yV();
    }

    @Override // defpackage.t10
    public final void TrssYQ34() {
        this.lwWCatUu.NCTxEWno();
        f7oeun2L();
    }

    @Override // defpackage.t10
    public final void VGmz0ccI(int i, int i2) {
        JulN5IwK(i, i2, 4);
    }

    public final void VM67d7Sv(z10 z10Var, eo eoVar) {
        if (!eoVar.qoPGr6Ce || eoVar.jb9XjC4I) {
            return;
        }
        int i = eoVar.NCTxEWno;
        int i2 = eoVar.VgvYg0wo;
        if (i == 0) {
            if (i2 == -1) {
                LgPefDp5(z10Var, eoVar.b2ZJblxo);
                return;
            } else {
                YH0kflLW(z10Var, eoVar.P7K7Inc8);
                return;
            }
        }
        int i3 = this.lDXGDhIF;
        mq[] mqVarArr = this.sjUBp5pO;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = eoVar.P7K7Inc8;
            int k3x7lurq = mqVarArr[0].k3x7lurq(i5);
            while (i4 < i3) {
                int k3x7lurq2 = mqVarArr[i4].k3x7lurq(i5);
                if (k3x7lurq2 > k3x7lurq) {
                    k3x7lurq = k3x7lurq2;
                }
                i4++;
            }
            int i6 = i5 - k3x7lurq;
            int i7 = eoVar.b2ZJblxo;
            if (i6 >= 0) {
                i7 -= Math.min(i6, eoVar.NCTxEWno);
            }
            LgPefDp5(z10Var, i7);
            return;
        }
        int i8 = eoVar.b2ZJblxo;
        int jb9XjC4I = mqVarArr[0].jb9XjC4I(i8);
        while (i4 < i3) {
            int jb9XjC4I2 = mqVarArr[i4].jb9XjC4I(i8);
            if (jb9XjC4I2 < jb9XjC4I) {
                jb9XjC4I = jb9XjC4I2;
            }
            i4++;
        }
        int i9 = jb9XjC4I - eoVar.b2ZJblxo;
        int i10 = eoVar.P7K7Inc8;
        if (i9 >= 0) {
            i10 += Math.min(i9, eoVar.NCTxEWno);
        }
        YH0kflLW(z10Var, i10);
    }

    public final View VZZbw3BB(boolean z) {
        we weVar = this.OxcuoDLp;
        int OnDfzHZD = weVar.OnDfzHZD();
        int jb9XjC4I = weVar.jb9XjC4I();
        View view = null;
        for (int I5GHvsYW = I5GHvsYW() - 1; I5GHvsYW >= 0; I5GHvsYW--) {
            View Ey6iv0m0 = Ey6iv0m0(I5GHvsYW);
            int b2ZJblxo = weVar.b2ZJblxo(Ey6iv0m0);
            int wxUZMvaN = weVar.wxUZMvaN(Ey6iv0m0);
            if (wxUZMvaN > OnDfzHZD && b2ZJblxo < jb9XjC4I) {
                if (wxUZMvaN <= jb9XjC4I || !z) {
                    return Ey6iv0m0;
                }
                if (view == null) {
                    view = Ey6iv0m0;
                }
            }
        }
        return view;
    }

    @Override // defpackage.t10
    public final boolean VgvYg0wo(u10 u10Var) {
        return u10Var instanceof m90;
    }

    @Override // defpackage.t10
    public final int XrPeKzBk(int i, z10 z10Var, d20 d20Var) {
        return DmBEA2wf(i, z10Var, d20Var);
    }

    public final void YH0kflLW(z10 z10Var, int i) {
        while (I5GHvsYW() > 0) {
            View Ey6iv0m0 = Ey6iv0m0(0);
            we weVar = this.OxcuoDLp;
            if (weVar.wxUZMvaN(Ey6iv0m0) > i || weVar.lDXGDhIF(Ey6iv0m0) > i) {
                return;
            }
            m90 m90Var = (m90) Ey6iv0m0.getLayoutParams();
            m90Var.getClass();
            if (((ArrayList) m90Var.VgvYg0wo.P7K7Inc8).size() == 1) {
                return;
            }
            mq mqVar = m90Var.VgvYg0wo;
            ArrayList arrayList = (ArrayList) mqVar.P7K7Inc8;
            View view = (View) arrayList.remove(0);
            m90 m90Var2 = (m90) view.getLayoutParams();
            m90Var2.VgvYg0wo = null;
            if (arrayList.size() == 0) {
                mqVar.MdtA4re8 = Integer.MIN_VALUE;
            }
            if (m90Var2.qoPGr6Ce.b2ZJblxo() || m90Var2.qoPGr6Ce.eVhOlqcC()) {
                mqVar.wxUZMvaN -= ((StaggeredGridLayoutManager) mqVar.b2ZJblxo).OxcuoDLp.VgvYg0wo(view);
            }
            mqVar.NCTxEWno = Integer.MIN_VALUE;
            QT4Tf9Dt(Ey6iv0m0, z10Var);
        }
    }

    public final int YksF3V7p() {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        return t10.ytu5o6f4(Ey6iv0m0(0));
    }

    public final int ZLB5OTob(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        boolean z = !this.eIA6dogk;
        return m50.NCTxEWno(d20Var, this.OxcuoDLp, tKaxLBvG(z), VZZbw3BB(z), this, this.eIA6dogk, this.FySoLYna);
    }

    @Override // defpackage.t10
    public final void ZyZthT5G(AccessibilityEvent accessibilityEvent) {
        super.ZyZthT5G(accessibilityEvent);
        if (I5GHvsYW() > 0) {
            View tKaxLBvG = tKaxLBvG(false);
            View VZZbw3BB = VZZbw3BB(false);
            if (tKaxLBvG == null || VZZbw3BB == null) {
                return;
            }
            int ytu5o6f4 = t10.ytu5o6f4(tKaxLBvG);
            int ytu5o6f42 = t10.ytu5o6f4(VZZbw3BB);
            if (ytu5o6f4 < ytu5o6f42) {
                accessibilityEvent.setFromIndex(ytu5o6f4);
                accessibilityEvent.setToIndex(ytu5o6f42);
            } else {
                accessibilityEvent.setFromIndex(ytu5o6f42);
                accessibilityEvent.setToIndex(ytu5o6f4);
            }
        }
    }

    public final boolean a3AMA6yV() {
        return U0LaHZX7() == 1;
    }

    @Override // defpackage.t10
    public final boolean aZz0PFXp() {
        return this.U0LaHZX7 != 0;
    }

    @Override // defpackage.t10
    public final u10 amk52bBQ(Context context, AttributeSet attributeSet) {
        return new m90(context, attributeSet);
    }

    @Override // defpackage.t10
    public final void b2ZJblxo(int i, int i2, d20 d20Var, pl plVar) {
        eo eoVar;
        int jb9XjC4I;
        if (this.KlHjfFWx != 0) {
            i = i2;
        }
        if (I5GHvsYW() == 0 || i == 0) {
            return;
        }
        FzsqRtM7(i);
        int[] iArr = this.pRiPUEwG;
        int i3 = this.lDXGDhIF;
        if (iArr == null || iArr.length < i3) {
            this.pRiPUEwG = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            eoVar = this.I5GHvsYW;
            if (i4 >= i3) {
                break;
            }
            int i6 = eoVar.wxUZMvaN;
            mq[] mqVarArr = this.sjUBp5pO;
            if (i6 == -1) {
                int i7 = eoVar.P7K7Inc8;
                jb9XjC4I = i7 - mqVarArr[i4].k3x7lurq(i7);
            } else {
                jb9XjC4I = mqVarArr[i4].jb9XjC4I(eoVar.b2ZJblxo) - eoVar.b2ZJblxo;
            }
            if (jb9XjC4I >= 0) {
                this.pRiPUEwG[i5] = jb9XjC4I;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.pRiPUEwG, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = eoVar.MdtA4re8;
            if (i9 < 0 || i9 >= d20Var.NCTxEWno()) {
                return;
            }
            plVar.qoPGr6Ce(eoVar.MdtA4re8, this.pRiPUEwG[i8]);
            eoVar.MdtA4re8 += eoVar.wxUZMvaN;
        }
    }

    public final int bA6YQxeu(int i) {
        int k3x7lurq = this.sjUBp5pO[0].k3x7lurq(i);
        for (int i2 = 1; i2 < this.lDXGDhIF; i2++) {
            int k3x7lurq2 = this.sjUBp5pO[i2].k3x7lurq(i);
            if (k3x7lurq2 < k3x7lurq) {
                k3x7lurq = k3x7lurq2;
            }
        }
        return k3x7lurq;
    }

    public final boolean d3vfVszL() {
        int YksF3V7p;
        if (I5GHvsYW() != 0 && this.U0LaHZX7 != 0 && this.P7K7Inc8) {
            if (this.FySoLYna) {
                YksF3V7p = nJuO6ggC();
                YksF3V7p();
            } else {
                YksF3V7p = YksF3V7p();
                nJuO6ggC();
            }
            if (YksF3V7p == 0 && wkPeYiwH() != null) {
                this.lwWCatUu.NCTxEWno();
                this.VgvYg0wo = true;
                f7oeun2L();
                return true;
            }
        }
        return false;
    }

    public final void dHPzAh2D(int i) {
        eo eoVar = this.I5GHvsYW;
        boolean z = false;
        eoVar.NCTxEWno = 0;
        eoVar.MdtA4re8 = i;
        RecyclerView recyclerView = this.NCTxEWno;
        we weVar = this.OxcuoDLp;
        if (recyclerView == null || !recyclerView.Qr9iLBAD) {
            eoVar.b2ZJblxo = weVar.Qr9iLBAD();
            eoVar.P7K7Inc8 = 0;
        } else {
            eoVar.P7K7Inc8 = weVar.OnDfzHZD();
            eoVar.b2ZJblxo = weVar.jb9XjC4I();
        }
        eoVar.Qr9iLBAD = false;
        eoVar.qoPGr6Ce = true;
        if (weVar.k3x7lurq() == 0 && weVar.Qr9iLBAD() == 0) {
            z = true;
        }
        eoVar.jb9XjC4I = z;
    }

    @Override // defpackage.t10
    public final int eVhOlqcC(d20 d20Var) {
        return ZLB5OTob(d20Var);
    }

    @Override // defpackage.t10
    public final void g2aRJUAd(int i, int i2) {
        JulN5IwK(i, i2, 8);
    }

    @Override // defpackage.t10
    public final void gmkaJpmS(int i, int i2) {
        JulN5IwK(i, i2, 1);
    }

    @Override // defpackage.t10
    public final void hzgxAD8d(int i) {
        super.hzgxAD8d(i);
        for (int i2 = 0; i2 < this.lDXGDhIF; i2++) {
            mq mqVar = this.sjUBp5pO[i2];
            int i3 = mqVar.NCTxEWno;
            if (i3 != Integer.MIN_VALUE) {
                mqVar.NCTxEWno = i3 + i;
            }
            int i4 = mqVar.MdtA4re8;
            if (i4 != Integer.MIN_VALUE) {
                mqVar.MdtA4re8 = i4 + i;
            }
        }
    }

    @Override // defpackage.t10
    public final int jb9XjC4I(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        boolean z = !this.eIA6dogk;
        return m50.qoPGr6Ce(d20Var, this.OxcuoDLp, tKaxLBvG(z), VZZbw3BB(z), this, this.eIA6dogk);
    }

    @Override // defpackage.t10
    public final int k3x7lurq(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        boolean z = !this.eIA6dogk;
        return m50.MdtA4re8(d20Var, this.OxcuoDLp, tKaxLBvG(z), VZZbw3BB(z), this, this.eIA6dogk);
    }

    public final int nJuO6ggC() {
        int I5GHvsYW = I5GHvsYW();
        if (I5GHvsYW == 0) {
            return 0;
        }
        return t10.ytu5o6f4(Ey6iv0m0(I5GHvsYW - 1));
    }

    @Override // defpackage.t10
    public final int ow5vqvCr(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        boolean z = !this.eIA6dogk;
        return m50.qoPGr6Ce(d20Var, this.OxcuoDLp, tKaxLBvG(z), VZZbw3BB(z), this, this.eIA6dogk);
    }

    @Override // defpackage.t10
    public final void pP9Y2m6O(d20 d20Var) {
        this.WYNAV5pd = -1;
        this.DK9slbsy = Integer.MIN_VALUE;
        this.euDDoUNr = null;
        this.ytu5o6f4.qoPGr6Ce();
    }

    public final void rAaHqhFJ(View view, int i, int i2) {
        RecyclerView recyclerView = this.NCTxEWno;
        Rect rect = this.SgZGMMPL;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.SgZGMMPL(view));
        }
        m90 m90Var = (m90) view.getLayoutParams();
        int PVxc5pbY = PVxc5pbY(i, ((ViewGroup.MarginLayoutParams) m90Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) m90Var).rightMargin + rect.right);
        int PVxc5pbY2 = PVxc5pbY(i2, ((ViewGroup.MarginLayoutParams) m90Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) m90Var).bottomMargin + rect.bottom);
        if (X1t0wlBd(view, PVxc5pbY, PVxc5pbY2, m90Var)) {
            view.measure(PVxc5pbY, PVxc5pbY2);
        }
    }

    public final void rwijVcAB(int i) {
        eo eoVar = this.I5GHvsYW;
        eoVar.VgvYg0wo = i;
        eoVar.wxUZMvaN = this.FySoLYna != (i == -1) ? -1 : 1;
    }

    public final View tKaxLBvG(boolean z) {
        we weVar = this.OxcuoDLp;
        int OnDfzHZD = weVar.OnDfzHZD();
        int jb9XjC4I = weVar.jb9XjC4I();
        int I5GHvsYW = I5GHvsYW();
        View view = null;
        for (int i = 0; i < I5GHvsYW; i++) {
            View Ey6iv0m0 = Ey6iv0m0(i);
            int b2ZJblxo = weVar.b2ZJblxo(Ey6iv0m0);
            if (weVar.wxUZMvaN(Ey6iv0m0) > OnDfzHZD && b2ZJblxo < jb9XjC4I) {
                if (b2ZJblxo >= OnDfzHZD || !z) {
                    return Ey6iv0m0;
                }
                if (view == null) {
                    view = Ey6iv0m0;
                }
            }
        }
        return view;
    }

    @Override // defpackage.t10
    public final void tef3qNMP(Parcelable parcelable) {
        if (parcelable instanceof o90) {
            o90 o90Var = (o90) parcelable;
            this.euDDoUNr = o90Var;
            if (this.WYNAV5pd != -1) {
                o90Var.NCTxEWno = -1;
                o90Var.MdtA4re8 = -1;
                o90Var.VgvYg0wo = null;
                o90Var.wxUZMvaN = 0;
                o90Var.P7K7Inc8 = 0;
                o90Var.b2ZJblxo = null;
                o90Var.Qr9iLBAD = null;
            }
            f7oeun2L();
        }
    }

    @Override // defpackage.t10
    public final int uQ3KJUK5(int i, z10 z10Var, d20 d20Var) {
        return DmBEA2wf(i, z10Var, d20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View wkPeYiwH() {
        int I5GHvsYW = I5GHvsYW();
        int i = I5GHvsYW - 1;
        int i2 = this.lDXGDhIF;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.KlHjfFWx == 1 && a3AMA6yV()) ? (char) 1 : (char) 65535;
        if (this.FySoLYna) {
            I5GHvsYW = -1;
        } else {
            i = 0;
        }
        int i3 = i < I5GHvsYW ? 1 : -1;
        while (i != I5GHvsYW) {
            View Ey6iv0m0 = Ey6iv0m0(i);
            m90 m90Var = (m90) Ey6iv0m0.getLayoutParams();
            boolean z = bitSet.get(m90Var.VgvYg0wo.VgvYg0wo);
            we weVar = this.OxcuoDLp;
            if (z) {
                mq mqVar = m90Var.VgvYg0wo;
                if (this.FySoLYna) {
                    int i4 = mqVar.MdtA4re8;
                    if (i4 == Integer.MIN_VALUE) {
                        mqVar.qoPGr6Ce();
                        i4 = mqVar.MdtA4re8;
                    }
                    if (i4 < weVar.jb9XjC4I()) {
                        ArrayList arrayList = (ArrayList) mqVar.P7K7Inc8;
                        ((m90) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return Ey6iv0m0;
                    }
                } else {
                    int i5 = mqVar.NCTxEWno;
                    ArrayList arrayList2 = (ArrayList) mqVar.P7K7Inc8;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        m90 m90Var2 = (m90) view.getLayoutParams();
                        mqVar.NCTxEWno = ((StaggeredGridLayoutManager) mqVar.b2ZJblxo).OxcuoDLp.b2ZJblxo(view);
                        m90Var2.getClass();
                        i5 = mqVar.NCTxEWno;
                    }
                    if (i5 > weVar.OnDfzHZD()) {
                        ((m90) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return Ey6iv0m0;
                    }
                }
                bitSet.clear(m90Var.VgvYg0wo.VgvYg0wo);
            }
            i += i3;
            if (i != I5GHvsYW) {
                View Ey6iv0m02 = Ey6iv0m0(i);
                if (this.FySoLYna) {
                    int wxUZMvaN = weVar.wxUZMvaN(Ey6iv0m0);
                    int wxUZMvaN2 = weVar.wxUZMvaN(Ey6iv0m02);
                    if (wxUZMvaN < wxUZMvaN2) {
                        return Ey6iv0m0;
                    }
                    if (wxUZMvaN == wxUZMvaN2) {
                        if ((m90Var.VgvYg0wo.VgvYg0wo - ((m90) Ey6iv0m02.getLayoutParams()).VgvYg0wo.VgvYg0wo >= 0) == (c >= 0)) {
                            return Ey6iv0m0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int b2ZJblxo = weVar.b2ZJblxo(Ey6iv0m0);
                    int b2ZJblxo2 = weVar.b2ZJblxo(Ey6iv0m02);
                    if (b2ZJblxo > b2ZJblxo2) {
                        return Ey6iv0m0;
                    }
                    if (b2ZJblxo == b2ZJblxo2) {
                        if ((m90Var.VgvYg0wo.VgvYg0wo - ((m90) Ey6iv0m02.getLayoutParams()).VgvYg0wo.VgvYg0wo >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.t10
    public final boolean wxUZMvaN() {
        return this.KlHjfFWx == 1;
    }

    @Override // defpackage.t10
    public final int ygLcUYwZ(d20 d20Var) {
        if (I5GHvsYW() == 0) {
            return 0;
        }
        boolean z = !this.eIA6dogk;
        return m50.MdtA4re8(d20Var, this.OxcuoDLp, tKaxLBvG(z), VZZbw3BB(z), this, this.eIA6dogk);
    }

    @Override // defpackage.t10
    public final void zCflySGU(int i) {
        super.zCflySGU(i);
        for (int i2 = 0; i2 < this.lDXGDhIF; i2++) {
            mq mqVar = this.sjUBp5pO[i2];
            int i3 = mqVar.NCTxEWno;
            if (i3 != Integer.MIN_VALUE) {
                mqVar.NCTxEWno = i3 + i;
            }
            int i4 = mqVar.MdtA4re8;
            if (i4 != Integer.MIN_VALUE) {
                mqVar.MdtA4re8 = i4 + i;
            }
        }
    }
}
