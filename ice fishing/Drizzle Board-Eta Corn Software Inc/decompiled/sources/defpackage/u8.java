package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u8 extends t8 {
    public int AxnhUDtd;
    public int B1cjorwa;
    public WeakReference Bo5Vs0Am;
    public int CIYkyd1d;
    public final zb CTE3lpUp;
    public boolean D4B4MtvK;
    public WeakReference JulN5IwK;
    public boolean NRrvEVSS;
    public int QhQjwNAr;
    public b4[] VZZbw3BB;
    public j8 X1t0wlBd;
    public boolean YksF3V7p;
    public int ZLB5OTob;
    public final e2 a3AMA6yV;
    public WeakReference bA6YQxeu;
    public int d3vfVszL;
    public WeakReference nJuO6ggC;
    public b4[] tKaxLBvG;
    public final HashSet wkPeYiwH;
    public final gp yzvmSy3z;
    public ArrayList SMax8wMR = new ArrayList();
    public final f0 S7WAX0X5 = new f0(this);

    public u8() {
        zb zbVar = new zb();
        zbVar.qoPGr6Ce = true;
        zbVar.NCTxEWno = true;
        zbVar.VgvYg0wo = new ArrayList();
        new ArrayList();
        zbVar.b2ZJblxo = null;
        zbVar.Qr9iLBAD = new e2();
        zbVar.P7K7Inc8 = new ArrayList();
        zbVar.MdtA4re8 = this;
        zbVar.wxUZMvaN = this;
        this.CTE3lpUp = zbVar;
        this.X1t0wlBd = null;
        this.D4B4MtvK = false;
        this.yzvmSy3z = new gp();
        this.ZLB5OTob = 0;
        this.CIYkyd1d = 0;
        this.VZZbw3BB = new b4[4];
        this.tKaxLBvG = new b4[4];
        this.QhQjwNAr = 257;
        this.NRrvEVSS = false;
        this.YksF3V7p = false;
        this.nJuO6ggC = null;
        this.Bo5Vs0Am = null;
        this.bA6YQxeu = null;
        this.JulN5IwK = null;
        this.wkPeYiwH = new HashSet();
        this.a3AMA6yV = new e2();
    }

    public static void N8VPGzVC(t8 t8Var, j8 j8Var, e2 e2Var) {
        int i;
        int i2;
        if (j8Var == null) {
            return;
        }
        int i3 = t8Var.LvHlPNBd;
        int[] iArr = t8Var.Ey6iv0m0;
        if (i3 == 8 || (t8Var instanceof am) || (t8Var instanceof y1)) {
            e2Var.VgvYg0wo = 0;
            e2Var.P7K7Inc8 = 0;
            return;
        }
        int[] iArr2 = t8Var.N2kLh4D5;
        e2Var.qoPGr6Ce = iArr2[0];
        e2Var.NCTxEWno = iArr2[1];
        e2Var.MdtA4re8 = t8Var.lDXGDhIF();
        e2Var.wxUZMvaN = t8Var.jb9XjC4I();
        e2Var.jb9XjC4I = false;
        e2Var.eVhOlqcC = 0;
        boolean z = e2Var.qoPGr6Ce == 3;
        boolean z2 = e2Var.NCTxEWno == 3;
        boolean z3 = z && t8Var.KRabZ4CU > 0.0f;
        boolean z4 = z2 && t8Var.KRabZ4CU > 0.0f;
        if (z && t8Var.amk52bBQ(0) && t8Var.amk52bBQ == 0 && !z3) {
            e2Var.qoPGr6Ce = 2;
            if (z2 && t8Var.KlHjfFWx == 0) {
                e2Var.qoPGr6Ce = 1;
            }
            z = false;
        }
        if (z2 && t8Var.amk52bBQ(1) && t8Var.KlHjfFWx == 0 && !z4) {
            e2Var.NCTxEWno = 2;
            if (z && t8Var.amk52bBQ == 0) {
                e2Var.NCTxEWno = 1;
            }
            z2 = false;
        }
        if (t8Var.WYNAV5pd()) {
            e2Var.qoPGr6Ce = 1;
            z = false;
        }
        if (t8Var.DK9slbsy()) {
            e2Var.NCTxEWno = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                e2Var.qoPGr6Ce = 1;
            } else if (!z2) {
                if (e2Var.NCTxEWno == 1) {
                    i2 = e2Var.wxUZMvaN;
                } else {
                    e2Var.qoPGr6Ce = 2;
                    j8Var.NCTxEWno(t8Var, e2Var);
                    i2 = e2Var.P7K7Inc8;
                }
                e2Var.qoPGr6Ce = 1;
                e2Var.MdtA4re8 = (int) (t8Var.KRabZ4CU * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                e2Var.NCTxEWno = 1;
            } else if (!z) {
                if (e2Var.qoPGr6Ce == 1) {
                    i = e2Var.MdtA4re8;
                } else {
                    e2Var.NCTxEWno = 2;
                    j8Var.NCTxEWno(t8Var, e2Var);
                    i = e2Var.VgvYg0wo;
                }
                e2Var.NCTxEWno = 1;
                int i4 = t8Var.gmkaJpmS;
                float f = t8Var.KRabZ4CU;
                if (i4 == -1) {
                    e2Var.wxUZMvaN = (int) (i / f);
                } else {
                    e2Var.wxUZMvaN = (int) (f * i);
                }
            }
        }
        j8Var.NCTxEWno(t8Var, e2Var);
        t8Var.aZz0PFXp(e2Var.VgvYg0wo);
        t8Var.eIA6dogk(e2Var.P7K7Inc8);
        t8Var.euDDoUNr = e2Var.Qr9iLBAD;
        int i5 = e2Var.b2ZJblxo;
        t8Var.ESscZ9M1 = i5;
        t8Var.euDDoUNr = i5 > 0;
        e2Var.eVhOlqcC = 0;
    }

    public final boolean FXJmAAN1(int i, boolean z) {
        boolean z2;
        zb zbVar = this.CTE3lpUp;
        ArrayList arrayList = (ArrayList) zbVar.VgvYg0wo;
        u8 u8Var = (u8) zbVar.MdtA4re8;
        boolean z3 = false;
        int Qr9iLBAD = u8Var.Qr9iLBAD(0);
        int Qr9iLBAD2 = u8Var.Qr9iLBAD(1);
        int sjUBp5pO = u8Var.sjUBp5pO();
        int OxcuoDLp = u8Var.OxcuoDLp();
        if (z && (Qr9iLBAD == 2 || Qr9iLBAD2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                th0 th0Var = (th0) obj;
                if (th0Var.P7K7Inc8 == i && !th0Var.k3x7lurq()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && Qr9iLBAD == 2) {
                    u8Var.pRiPUEwG(1);
                    u8Var.aZz0PFXp(zbVar.wxUZMvaN(u8Var, 0));
                    u8Var.wxUZMvaN.VgvYg0wo.wxUZMvaN(u8Var.lDXGDhIF());
                }
            } else if (z && Qr9iLBAD2 == 2) {
                u8Var.VhgXwMj9(1);
                u8Var.eIA6dogk(zbVar.wxUZMvaN(u8Var, 1));
                u8Var.VgvYg0wo.VgvYg0wo.wxUZMvaN(u8Var.jb9XjC4I());
            }
        }
        int[] iArr = u8Var.N2kLh4D5;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int lDXGDhIF = u8Var.lDXGDhIF() + sjUBp5pO;
                u8Var.wxUZMvaN.jb9XjC4I.wxUZMvaN(lDXGDhIF);
                u8Var.wxUZMvaN.VgvYg0wo.wxUZMvaN(lDXGDhIF - sjUBp5pO);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int jb9XjC4I = u8Var.jb9XjC4I() + OxcuoDLp;
                u8Var.VgvYg0wo.jb9XjC4I.wxUZMvaN(jb9XjC4I);
                u8Var.VgvYg0wo.VgvYg0wo.wxUZMvaN(jb9XjC4I - OxcuoDLp);
                z2 = true;
            }
            z2 = false;
        }
        zbVar.jb9XjC4I();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            th0 th0Var2 = (th0) obj2;
            if (th0Var2.P7K7Inc8 == i && (th0Var2.NCTxEWno != u8Var || th0Var2.b2ZJblxo)) {
                th0Var2.VgvYg0wo();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            th0 th0Var3 = (th0) obj3;
            if (th0Var3.P7K7Inc8 == i && (z2 || th0Var3.NCTxEWno != u8Var)) {
                if (!th0Var3.Qr9iLBAD.eVhOlqcC) {
                    break;
                }
                if (!th0Var3.jb9XjC4I.eVhOlqcC) {
                    break;
                }
                if (!(th0Var3 instanceof c4) && !th0Var3.VgvYg0wo.eVhOlqcC) {
                    break;
                }
            }
        }
        u8Var.pRiPUEwG(Qr9iLBAD);
        u8Var.VhgXwMj9(Qr9iLBAD2);
        return z3;
    }

    public final boolean HdOGZAzC(int i) {
        return (this.QhQjwNAr & i) == i;
    }

    @Override // defpackage.t8
    public final void Xkz7p5xa(boolean z, boolean z2) {
        super.Xkz7p5xa(z, z2);
        int size = this.SMax8wMR.size();
        for (int i = 0; i < size; i++) {
            ((t8) this.SMax8wMR.get(i)).Xkz7p5xa(z, z2);
        }
    }

    public final void hzgxAD8d(t8 t8Var, int i) {
        if (i == 0) {
            int i2 = this.ZLB5OTob + 1;
            b4[] b4VarArr = this.tKaxLBvG;
            if (i2 >= b4VarArr.length) {
                b4VarArr = (b4[]) Arrays.copyOf(b4VarArr, b4VarArr.length * 2);
                this.tKaxLBvG = b4VarArr;
            }
            int i3 = this.ZLB5OTob;
            b4VarArr[i3] = new b4(t8Var, 0, this.D4B4MtvK);
            this.ZLB5OTob = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.CIYkyd1d + 1;
            b4[] b4VarArr2 = this.VZZbw3BB;
            if (i4 >= b4VarArr2.length) {
                b4VarArr2 = (b4[]) Arrays.copyOf(b4VarArr2, b4VarArr2.length * 2);
                this.VZZbw3BB = b4VarArr2;
            }
            int i5 = this.CIYkyd1d;
            b4VarArr2[i5] = new b4(t8Var, 1, this.D4B4MtvK);
            this.CIYkyd1d = i5 + 1;
        }
    }

    @Override // defpackage.t8
    public final void i7xS8jrb(f0 f0Var) {
        super.i7xS8jrb(f0Var);
        int size = this.SMax8wMR.size();
        for (int i = 0; i < size; i++) {
            ((t8) this.SMax8wMR.get(i)).i7xS8jrb(f0Var);
        }
    }

    @Override // defpackage.t8
    public final void lwWCatUu() {
        this.yzvmSy3z.Ey6iv0m0();
        this.AxnhUDtd = 0;
        this.d3vfVszL = 0;
        this.SMax8wMR.clear();
        super.lwWCatUu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0818 A[LOOP:14: B:270:0x0816->B:271:0x0818, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0628  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nSmgoSB5() {
        boolean[] zArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        e8 e8Var;
        e8 e8Var2;
        boolean z;
        char c;
        e8 e8Var3;
        boolean z2;
        boolean z3;
        int max;
        ?? r9;
        boolean z4;
        int max2;
        boolean z5;
        int i5;
        int i6;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        e8 e8Var4;
        int i7;
        int i8;
        int i9;
        int i10;
        char c2;
        sh0 sh0Var;
        sh0 sh0Var2;
        int i11;
        int i12;
        int NCTxEWno;
        int NCTxEWno2;
        sh0 sh0Var3;
        sh0 sh0Var4;
        int i13;
        boolean z6;
        boolean[] zArr2 = w30.P7K7Inc8;
        this.TrssYQ34 = 0;
        this.g2aRJUAd = 0;
        this.NRrvEVSS = false;
        this.YksF3V7p = false;
        int size = this.SMax8wMR.size();
        int max5 = Math.max(0, lDXGDhIF());
        int max6 = Math.max(0, jb9XjC4I());
        int[] iArr = this.N2kLh4D5;
        int i14 = iArr[1];
        int i15 = iArr[0];
        int i16 = this.B1cjorwa;
        e8 e8Var5 = this.pRiPUEwG;
        e8 e8Var6 = this.eIA6dogk;
        if (i16 == 0 && w30.amk52bBQ(this.QhQjwNAr, 1)) {
            j8 j8Var = this.X1t0wlBd;
            int i17 = iArr[0];
            int i18 = iArr[1];
            U0LaHZX7();
            ArrayList arrayList = this.SMax8wMR;
            int size2 = arrayList.size();
            for (int i19 = 0; i19 < size2; i19++) {
                ((t8) arrayList.get(i19)).U0LaHZX7();
            }
            boolean z7 = this.D4B4MtvK;
            zArr = zArr2;
            if (i17 == 1) {
                SgZGMMPL(0, lDXGDhIF());
            } else {
                e8Var6.jb9XjC4I(0);
                this.TrssYQ34 = 0;
            }
            int i20 = 0;
            boolean z8 = false;
            boolean z9 = false;
            while (i20 < size2) {
                int i21 = i20;
                t8 t8Var = (t8) arrayList.get(i20);
                int[] iArr2 = iArr;
                if (t8Var instanceof am) {
                    am amVar = (am) t8Var;
                    z6 = z8;
                    if (amVar.X1t0wlBd == 1) {
                        int i22 = amVar.S7WAX0X5;
                        if (i22 != -1) {
                            amVar.hzgxAD8d(i22);
                        } else if (amVar.CTE3lpUp != -1 && WYNAV5pd()) {
                            amVar.hzgxAD8d(lDXGDhIF() - amVar.CTE3lpUp);
                        } else if (WYNAV5pd()) {
                            amVar.hzgxAD8d((int) ((amVar.SMax8wMR * lDXGDhIF()) + 0.5f));
                        }
                        z6 = true;
                    }
                } else {
                    z6 = z8;
                    if ((t8Var instanceof y1) && ((y1) t8Var).FXJmAAN1() == 0) {
                        z8 = z6;
                        z9 = true;
                        i20 = i21 + 1;
                        iArr = iArr2;
                    }
                }
                z8 = z6;
                i20 = i21 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z8) {
                for (int i23 = 0; i23 < size2; i23 = i13 + 1) {
                    t8 t8Var2 = (t8) arrayList.get(i23);
                    if (t8Var2 instanceof am) {
                        am amVar2 = (am) t8Var2;
                        i13 = i23;
                        if (amVar2.X1t0wlBd == 1) {
                            ra.RXQxj5Oe(0, j8Var, amVar2, z7);
                        }
                    } else {
                        i13 = i23;
                    }
                }
            }
            ra.RXQxj5Oe(0, j8Var, this, z7);
            if (z9) {
                for (int i24 = 0; i24 < size2; i24++) {
                    t8 t8Var3 = (t8) arrayList.get(i24);
                    if (t8Var3 instanceof y1) {
                        y1 y1Var = (y1) t8Var3;
                        if (y1Var.FXJmAAN1() == 0 && y1Var.zCflySGU()) {
                            ra.RXQxj5Oe(1, j8Var, y1Var, z7);
                        }
                    }
                }
            }
            if (i18 == 1) {
                ytu5o6f4(0, jb9XjC4I());
            } else {
                e8Var5.jb9XjC4I(0);
                this.g2aRJUAd = 0;
            }
            int i25 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i25 < size2) {
                t8 t8Var4 = (t8) arrayList.get(i25);
                int i26 = i25;
                if (t8Var4 instanceof am) {
                    am amVar3 = (am) t8Var4;
                    if (amVar3.X1t0wlBd == 0) {
                        int i27 = amVar3.S7WAX0X5;
                        if (i27 != -1) {
                            amVar3.hzgxAD8d(i27);
                        } else if (amVar3.CTE3lpUp != -1 && DK9slbsy()) {
                            amVar3.hzgxAD8d(jb9XjC4I() - amVar3.CTE3lpUp);
                        } else if (DK9slbsy()) {
                            amVar3.hzgxAD8d((int) ((amVar3.SMax8wMR * jb9XjC4I()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else if ((t8Var4 instanceof y1) && ((y1) t8Var4).FXJmAAN1() == 1) {
                    z11 = true;
                }
                i25 = i26 + 1;
            }
            if (z10) {
                for (int i28 = 0; i28 < size2; i28++) {
                    t8 t8Var5 = (t8) arrayList.get(i28);
                    if (t8Var5 instanceof am) {
                        am amVar4 = (am) t8Var5;
                        if (amVar4.X1t0wlBd == 0) {
                            ra.nSmgoSB5(1, j8Var, amVar4);
                        }
                    }
                }
            }
            ra.nSmgoSB5(0, j8Var, this);
            if (z11) {
                for (int i29 = 0; i29 < size2; i29++) {
                    t8 t8Var6 = (t8) arrayList.get(i29);
                    if (t8Var6 instanceof y1) {
                        y1 y1Var2 = (y1) t8Var6;
                        if (y1Var2.FXJmAAN1() == 1 && y1Var2.zCflySGU()) {
                            ra.nSmgoSB5(1, j8Var, y1Var2);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size2; i30++) {
                t8 t8Var7 = (t8) arrayList.get(i30);
                if (t8Var7.gjV1z5T1() && ra.b2ZJblxo(t8Var7)) {
                    N8VPGzVC(t8Var7, j8Var, ra.MdtA4re8);
                    if (!(t8Var7 instanceof am)) {
                        ra.RXQxj5Oe(0, j8Var, t8Var7, z7);
                        ra.nSmgoSB5(0, j8Var, t8Var7);
                    } else if (((am) t8Var7).X1t0wlBd == 0) {
                        ra.nSmgoSB5(0, j8Var, t8Var7);
                    } else {
                        ra.RXQxj5Oe(0, j8Var, t8Var7, z7);
                    }
                }
            }
            for (int i31 = 0; i31 < size; i31++) {
                t8 t8Var8 = (t8) this.SMax8wMR.get(i31);
                if (t8Var8.gjV1z5T1() && !(t8Var8 instanceof am) && !(t8Var8 instanceof y1)) {
                    int Qr9iLBAD = t8Var8.Qr9iLBAD(0);
                    int Qr9iLBAD2 = t8Var8.Qr9iLBAD(1);
                    if (Qr9iLBAD != 3 || t8Var8.amk52bBQ == 1 || Qr9iLBAD2 != 3 || t8Var8.KlHjfFWx == 1) {
                        N8VPGzVC(t8Var8, this.X1t0wlBd, new e2());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
        }
        gp gpVar = this.yzvmSy3z;
        if (size <= 2 || !((i15 == 2 || i14 == 2) && w30.amk52bBQ(this.QhQjwNAr, 1024))) {
            i = max5;
            i2 = size;
            i3 = i14;
            i4 = i15;
            e8Var = e8Var5;
            e8Var2 = e8Var6;
        } else {
            j8 j8Var2 = this.X1t0wlBd;
            ArrayList arrayList2 = this.SMax8wMR;
            int size3 = arrayList2.size();
            int i32 = 0;
            while (true) {
                if (i32 < size3) {
                    t8 t8Var9 = (t8) arrayList2.get(i32);
                    char c3 = objArr[0];
                    char c4 = objArr[1];
                    int[] iArr3 = t8Var9.N2kLh4D5;
                    int i33 = i32;
                    if (!ra.FXJmAAN1(c3, c4, iArr3[0], iArr3[1])) {
                        i7 = max5;
                        i2 = size;
                        i8 = max6;
                        i9 = i14;
                        i10 = i15;
                        e8Var = e8Var5;
                        e8Var2 = e8Var6;
                        break;
                    }
                    i32 = i33 + 1;
                } else {
                    i2 = size;
                    e8Var = e8Var5;
                    e8Var2 = e8Var6;
                    int i34 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i34 < size3) {
                        int i35 = i34;
                        t8 t8Var10 = (t8) arrayList2.get(i34);
                        int i36 = max6;
                        char c5 = objArr[0];
                        int i37 = i14;
                        char c6 = objArr[1];
                        int i38 = max5;
                        int[] iArr4 = t8Var10.N2kLh4D5;
                        int i39 = i15;
                        if (!ra.FXJmAAN1(c5, c6, iArr4[0], iArr4[1])) {
                            N8VPGzVC(t8Var10, j8Var2, this.a3AMA6yV);
                        }
                        boolean z12 = t8Var10 instanceof am;
                        if (z12) {
                            am amVar5 = (am) t8Var10;
                            if (amVar5.X1t0wlBd == 0) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(amVar5);
                            }
                            if (amVar5.X1t0wlBd == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(amVar5);
                            }
                        }
                        if (t8Var10 instanceof y1) {
                            if (t8Var10 instanceof y1) {
                                y1 y1Var3 = (y1) t8Var10;
                                if (y1Var3.FXJmAAN1() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(y1Var3);
                                }
                                if (y1Var3.FXJmAAN1() == 1) {
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(y1Var3);
                                }
                            } else {
                                y1 y1Var4 = (y1) t8Var10;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(y1Var4);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(y1Var4);
                            }
                        }
                        if (t8Var10.eIA6dogk.P7K7Inc8 == null && t8Var10.VhgXwMj9.P7K7Inc8 == null && !z12 && !(t8Var10 instanceof y1)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(t8Var10);
                        }
                        if (t8Var10.pRiPUEwG.P7K7Inc8 == null && t8Var10.aZz0PFXp.P7K7Inc8 == null && t8Var10.Xkz7p5xa.P7K7Inc8 == null && !z12 && !(t8Var10 instanceof y1)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(t8Var10);
                        }
                        i34 = i35 + 1;
                        max6 = i36;
                        i14 = i37;
                        max5 = i38;
                        i15 = i39;
                    }
                    i7 = max5;
                    i8 = max6;
                    i9 = i14;
                    i10 = i15;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size4 = arrayList3.size();
                        int i40 = 0;
                        while (i40 < size4) {
                            Object obj = arrayList3.get(i40);
                            i40++;
                            ra.sjUBp5pO((am) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i41 = 0;
                        while (i41 < size5) {
                            Object obj2 = arrayList5.get(i41);
                            i41++;
                            y1 y1Var5 = (y1) obj2;
                            sh0 sjUBp5pO = ra.sjUBp5pO(y1Var5, 0, arrayList9, null);
                            y1Var5.hzgxAD8d(0, sjUBp5pO, arrayList9);
                            sjUBp5pO.qoPGr6Ce(arrayList9);
                        }
                    }
                    HashSet hashSet = b2ZJblxo(2).qoPGr6Ce;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ra.sjUBp5pO(((e8) it.next()).wxUZMvaN, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = b2ZJblxo(4).qoPGr6Ce;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            ra.sjUBp5pO(((e8) it2.next()).wxUZMvaN, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = b2ZJblxo(7).qoPGr6Ce;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            ra.sjUBp5pO(((e8) it3.next()).wxUZMvaN, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size6 = arrayList6.size();
                        int i42 = 0;
                        while (i42 < size6) {
                            Object obj3 = arrayList6.get(i42);
                            i42++;
                            ra.sjUBp5pO((t8) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size7 = arrayList8.size();
                        int i43 = 0;
                        while (i43 < size7) {
                            Object obj4 = arrayList8.get(i43);
                            i43++;
                            ra.sjUBp5pO((am) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size8 = arrayList7.size();
                        int i44 = 0;
                        while (i44 < size8) {
                            Object obj5 = arrayList7.get(i44);
                            i44++;
                            y1 y1Var6 = (y1) obj5;
                            sh0 sjUBp5pO2 = ra.sjUBp5pO(y1Var6, 1, arrayList9, null);
                            y1Var6.hzgxAD8d(1, sjUBp5pO2, arrayList9);
                            sjUBp5pO2.qoPGr6Ce(arrayList9);
                        }
                    }
                    HashSet hashSet4 = b2ZJblxo(3).qoPGr6Ce;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            ra.sjUBp5pO(((e8) it4.next()).wxUZMvaN, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = b2ZJblxo(6).qoPGr6Ce;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            ra.sjUBp5pO(((e8) it5.next()).wxUZMvaN, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = b2ZJblxo(5).qoPGr6Ce;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            ra.sjUBp5pO(((e8) it6.next()).wxUZMvaN, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = b2ZJblxo(7).qoPGr6Ce;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            ra.sjUBp5pO(((e8) it7.next()).wxUZMvaN, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size9 = arrayList4.size();
                        int i45 = 0;
                        while (i45 < size9) {
                            Object obj6 = arrayList4.get(i45);
                            i45++;
                            ra.sjUBp5pO((t8) obj6, 1, arrayList9, null);
                        }
                    }
                    char c7 = 1;
                    int i46 = 0;
                    while (i46 < size3) {
                        t8 t8Var11 = (t8) arrayList2.get(i46);
                        int[] iArr5 = t8Var11.N2kLh4D5;
                        if (iArr5[0] == 3 && iArr5[c7] == 3) {
                            int i47 = t8Var11.uQ3KJUK5;
                            int size10 = arrayList9.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size10) {
                                    sh0Var3 = null;
                                    break;
                                }
                                sh0Var3 = (sh0) arrayList9.get(i48);
                                if (i47 == sh0Var3.NCTxEWno) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            int i49 = t8Var11.XrPeKzBk;
                            int size11 = arrayList9.size();
                            int i50 = 0;
                            while (true) {
                                if (i50 >= size11) {
                                    sh0Var4 = null;
                                    break;
                                }
                                sh0Var4 = (sh0) arrayList9.get(i50);
                                if (i49 == sh0Var4.NCTxEWno) {
                                    break;
                                } else {
                                    i50++;
                                }
                            }
                            if (sh0Var3 != null && sh0Var4 != null) {
                                sh0Var3.MdtA4re8(0, sh0Var4);
                                sh0Var4.MdtA4re8 = 2;
                                arrayList9.remove(sh0Var3);
                            }
                        }
                        i46++;
                        c7 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (objArr[0] == 2) {
                            int size12 = arrayList9.size();
                            int i51 = 0;
                            int i52 = 0;
                            sh0Var = null;
                            while (i52 < size12) {
                                Object obj7 = arrayList9.get(i52);
                                i52++;
                                sh0 sh0Var5 = (sh0) obj7;
                                if (sh0Var5.MdtA4re8 != 1 && (NCTxEWno2 = sh0Var5.NCTxEWno(gpVar, 0)) > i51) {
                                    sh0Var = sh0Var5;
                                    i51 = NCTxEWno2;
                                }
                            }
                            c2 = 1;
                            if (sh0Var != null) {
                                pRiPUEwG(1);
                                aZz0PFXp(i51);
                                if (objArr[c2] == 2) {
                                    int size13 = arrayList9.size();
                                    int i53 = 0;
                                    int i54 = 0;
                                    sh0Var2 = null;
                                    while (i54 < size13) {
                                        Object obj8 = arrayList9.get(i54);
                                        i54++;
                                        sh0 sh0Var6 = (sh0) obj8;
                                        if (sh0Var6.MdtA4re8 != 0 && (NCTxEWno = sh0Var6.NCTxEWno(gpVar, 1)) > i53) {
                                            sh0Var2 = sh0Var6;
                                            i53 = NCTxEWno;
                                        }
                                    }
                                    if (sh0Var2 != null) {
                                        VhgXwMj9(1);
                                        eIA6dogk(i53);
                                        if (sh0Var == null || sh0Var2 != null) {
                                            i4 = i10;
                                            if (i4 == 2) {
                                                i11 = i7;
                                                if (i11 >= lDXGDhIF() || i11 <= 0) {
                                                    i12 = lDXGDhIF();
                                                    i3 = i9;
                                                    if (i3 != 2) {
                                                        max6 = i8;
                                                        if (max6 >= jb9XjC4I() || max6 <= 0) {
                                                            max6 = jb9XjC4I();
                                                        } else {
                                                            eIA6dogk(max6);
                                                            this.YksF3V7p = true;
                                                        }
                                                    } else {
                                                        max6 = i8;
                                                    }
                                                    i = i12;
                                                    z = true;
                                                } else {
                                                    aZz0PFXp(i11);
                                                    this.NRrvEVSS = true;
                                                }
                                            } else {
                                                i11 = i7;
                                            }
                                            i12 = i11;
                                            i3 = i9;
                                            if (i3 != 2) {
                                            }
                                            i = i12;
                                            z = true;
                                        }
                                    }
                                }
                                sh0Var2 = null;
                                if (sh0Var == null) {
                                }
                                i4 = i10;
                                if (i4 == 2) {
                                }
                                i12 = i11;
                                i3 = i9;
                                if (i3 != 2) {
                                }
                                i = i12;
                                z = true;
                            }
                        } else {
                            c2 = 1;
                        }
                        sh0Var = null;
                        if (objArr[c2] == 2) {
                        }
                        sh0Var2 = null;
                        if (sh0Var == null) {
                        }
                        i4 = i10;
                        if (i4 == 2) {
                        }
                        i12 = i11;
                        i3 = i9;
                        if (i3 != 2) {
                        }
                        i = i12;
                        z = true;
                    }
                }
            }
            max6 = i8;
            i3 = i9;
            i = i7;
            i4 = i10;
        }
        z = false;
        boolean z13 = HdOGZAzC(64) || HdOGZAzC(128);
        gpVar.getClass();
        gpVar.Qr9iLBAD = false;
        if (this.QhQjwNAr == 0 || !z13) {
            c = 1;
        } else {
            c = 1;
            gpVar.Qr9iLBAD = true;
        }
        ArrayList arrayList10 = this.SMax8wMR;
        boolean z14 = objArr[0] == 2 || objArr[c] == 2;
        this.ZLB5OTob = 0;
        this.CIYkyd1d = 0;
        int i55 = i2;
        for (int i56 = 0; i56 < i55; i56++) {
            t8 t8Var12 = (t8) this.SMax8wMR.get(i56);
            if (t8Var12 instanceof u8) {
                ((u8) t8Var12).nSmgoSB5();
            }
        }
        boolean HdOGZAzC = HdOGZAzC(64);
        boolean z15 = z;
        int i57 = 0;
        boolean z16 = true;
        while (z16) {
            int i58 = i57 + 1;
            try {
                gpVar.Ey6iv0m0();
                this.ZLB5OTob = 0;
                this.CIYkyd1d = 0;
                VgvYg0wo(gpVar);
                for (int i59 = 0; i59 < i55; i59++) {
                    ((t8) this.SMax8wMR.get(i59)).VgvYg0wo(gpVar);
                }
                zCflySGU(gpVar);
                try {
                    weakReference = this.nJuO6ggC;
                } catch (Exception e) {
                    e = e;
                    e8Var3 = e8Var;
                    z2 = z14;
                }
            } catch (Exception e2) {
                e = e2;
                e8Var3 = e8Var;
                z2 = z14;
            }
            if (weakReference != null) {
                try {
                } catch (Exception e3) {
                    e = e3;
                    e8Var3 = e8Var;
                }
                if (weakReference.get() != null) {
                    e8Var3 = e8Var;
                    try {
                    } catch (Exception e4) {
                        e = e4;
                    }
                    try {
                        z2 = z14;
                    } catch (Exception e5) {
                        e = e5;
                        z2 = z14;
                        z16 = true;
                        e.printStackTrace();
                        z3 = z15;
                        System.out.println("EXCEPTION : " + e);
                        if (z16) {
                        }
                        if (z2) {
                        }
                        max = Math.max(this.VGmz0ccI, lDXGDhIF());
                        if (max > lDXGDhIF()) {
                        }
                        max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                        if (max2 > jb9XjC4I()) {
                        }
                        if (!z5) {
                        }
                        i5 = 8;
                        if (i58 <= i5) {
                        }
                        z15 = z5;
                        i57 = i58;
                        z14 = z2;
                        e8Var = e8Var3;
                    }
                    try {
                        gpVar.P7K7Inc8(gpVar.k3x7lurq((e8) this.nJuO6ggC.get()), gpVar.k3x7lurq(e8Var3), 0, 5);
                        this.nJuO6ggC = null;
                        weakReference2 = this.bA6YQxeu;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            gpVar.P7K7Inc8(gpVar.k3x7lurq(this.aZz0PFXp), gpVar.k3x7lurq((e8) this.bA6YQxeu.get()), 0, 5);
                            this.bA6YQxeu = null;
                        }
                        weakReference3 = this.Bo5Vs0Am;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            e8Var4 = e8Var2;
                            try {
                                e8Var2 = e8Var4;
                                gpVar.P7K7Inc8(gpVar.k3x7lurq((e8) this.Bo5Vs0Am.get()), gpVar.k3x7lurq(e8Var4), 0, 5);
                                this.Bo5Vs0Am = null;
                            } catch (Exception e6) {
                                e = e6;
                                e8Var2 = e8Var4;
                                z16 = true;
                                e.printStackTrace();
                                z3 = z15;
                                System.out.println("EXCEPTION : " + e);
                                if (z16) {
                                }
                                if (z2) {
                                }
                                max = Math.max(this.VGmz0ccI, lDXGDhIF());
                                if (max > lDXGDhIF()) {
                                }
                                max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                                if (max2 > jb9XjC4I()) {
                                }
                                if (!z5) {
                                }
                                i5 = 8;
                                if (i58 <= i5) {
                                }
                                z15 = z5;
                                i57 = i58;
                                z14 = z2;
                                e8Var = e8Var3;
                            }
                        }
                        weakReference4 = this.JulN5IwK;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                            } catch (Exception e7) {
                                e = e7;
                            }
                            try {
                                gpVar.P7K7Inc8(gpVar.k3x7lurq(this.VhgXwMj9), gpVar.k3x7lurq((e8) this.JulN5IwK.get()), 0, 5);
                                try {
                                    this.JulN5IwK = null;
                                } catch (Exception e8) {
                                    e = e8;
                                    z16 = true;
                                    e.printStackTrace();
                                    z3 = z15;
                                    System.out.println("EXCEPTION : " + e);
                                    if (z16) {
                                    }
                                    if (z2) {
                                    }
                                    max = Math.max(this.VGmz0ccI, lDXGDhIF());
                                    if (max > lDXGDhIF()) {
                                    }
                                    max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                                    if (max2 > jb9XjC4I()) {
                                    }
                                    if (!z5) {
                                    }
                                    i5 = 8;
                                    if (i58 <= i5) {
                                    }
                                    z15 = z5;
                                    i57 = i58;
                                    z14 = z2;
                                    e8Var = e8Var3;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                z16 = true;
                                e.printStackTrace();
                                z3 = z15;
                                System.out.println("EXCEPTION : " + e);
                                if (z16) {
                                }
                                if (z2) {
                                }
                                max = Math.max(this.VGmz0ccI, lDXGDhIF());
                                if (max > lDXGDhIF()) {
                                }
                                max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                                if (max2 > jb9XjC4I()) {
                                }
                                if (!z5) {
                                }
                                i5 = 8;
                                if (i58 <= i5) {
                                }
                                z15 = z5;
                                i57 = i58;
                                z14 = z2;
                                e8Var = e8Var3;
                            }
                        }
                        gpVar.sjUBp5pO();
                        z3 = z15;
                        z16 = true;
                    } catch (Exception e10) {
                        e = e10;
                        z16 = true;
                        e.printStackTrace();
                        z3 = z15;
                        System.out.println("EXCEPTION : " + e);
                        if (z16) {
                        }
                        if (z2) {
                        }
                        max = Math.max(this.VGmz0ccI, lDXGDhIF());
                        if (max > lDXGDhIF()) {
                        }
                        max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                        if (max2 > jb9XjC4I()) {
                        }
                        if (!z5) {
                        }
                        i5 = 8;
                        if (i58 <= i5) {
                        }
                        z15 = z5;
                        i57 = i58;
                        z14 = z2;
                        e8Var = e8Var3;
                    }
                    if (z16) {
                        zArr[2] = false;
                        boolean HdOGZAzC2 = HdOGZAzC(64);
                        fVMzMhyS(gpVar, HdOGZAzC2);
                        int size14 = this.SMax8wMR.size();
                        int i60 = 0;
                        z16 = false;
                        while (i60 < size14) {
                            t8 t8Var13 = (t8) this.SMax8wMR.get(i60);
                            t8Var13.fVMzMhyS(gpVar, HdOGZAzC2);
                            boolean z17 = HdOGZAzC2;
                            int i61 = size14;
                            if (t8Var13.Qr9iLBAD != -1 || t8Var13.jb9XjC4I != -1) {
                                z16 = true;
                            }
                            i60++;
                            HdOGZAzC2 = z17;
                            size14 = i61;
                        }
                    } else {
                        fVMzMhyS(gpVar, HdOGZAzC);
                        for (int i62 = 0; i62 < i55; i62++) {
                            ((t8) this.SMax8wMR.get(i62)).fVMzMhyS(gpVar, HdOGZAzC);
                        }
                        z16 = false;
                    }
                    if (z2 && i58 < 8 && zArr[2]) {
                        int i63 = 0;
                        int i64 = 0;
                        for (i6 = 0; i6 < i55; i6++) {
                            t8 t8Var14 = (t8) this.SMax8wMR.get(i6);
                            i64 = Math.max(i64, t8Var14.lDXGDhIF() + t8Var14.TrssYQ34);
                            i63 = Math.max(i63, t8Var14.jb9XjC4I() + t8Var14.g2aRJUAd);
                        }
                        max3 = Math.max(this.VGmz0ccI, i64);
                        max4 = Math.max(this.LfKQckgD, i63);
                        if (i4 == 2 && lDXGDhIF() < max3) {
                            aZz0PFXp(max3);
                            objArr[0] = 2;
                            z16 = true;
                            z3 = true;
                        }
                        if (i3 == 2 && jb9XjC4I() < max4) {
                            eIA6dogk(max4);
                            objArr[1] = 2;
                            z16 = true;
                            z3 = true;
                        }
                    }
                    max = Math.max(this.VGmz0ccI, lDXGDhIF());
                    if (max > lDXGDhIF()) {
                        aZz0PFXp(max);
                        r9 = 1;
                        objArr[0] = 1;
                        z16 = true;
                        z4 = true;
                    } else {
                        r9 = 1;
                        z4 = z3;
                    }
                    max2 = Math.max(this.LfKQckgD, jb9XjC4I());
                    if (max2 > jb9XjC4I()) {
                        eIA6dogk(max2);
                        objArr[r9] = r9;
                        z5 = r9;
                        z16 = z5;
                    } else {
                        z5 = z4;
                    }
                    if (!z5) {
                        if (objArr[0] == 2 && i > 0 && lDXGDhIF() > i) {
                            this.NRrvEVSS = r9;
                            objArr[0] = r9;
                            aZz0PFXp(i);
                            z5 = r9;
                            z16 = z5;
                        }
                        if (objArr[r9] == 2 && max6 > 0 && jb9XjC4I() > max6) {
                            this.YksF3V7p = r9;
                            objArr[r9] = r9;
                            eIA6dogk(max6);
                            z5 = true;
                            i5 = 8;
                            z16 = true;
                            if (i58 <= i5) {
                                z16 = false;
                            }
                            z15 = z5;
                            i57 = i58;
                            z14 = z2;
                            e8Var = e8Var3;
                        }
                    }
                    i5 = 8;
                    if (i58 <= i5) {
                    }
                    z15 = z5;
                    i57 = i58;
                    z14 = z2;
                    e8Var = e8Var3;
                }
            }
            e8Var3 = e8Var;
            z2 = z14;
            weakReference2 = this.bA6YQxeu;
            if (weakReference2 != null) {
                gpVar.P7K7Inc8(gpVar.k3x7lurq(this.aZz0PFXp), gpVar.k3x7lurq((e8) this.bA6YQxeu.get()), 0, 5);
                this.bA6YQxeu = null;
            }
            weakReference3 = this.Bo5Vs0Am;
            if (weakReference3 != null) {
                e8Var4 = e8Var2;
                e8Var2 = e8Var4;
                gpVar.P7K7Inc8(gpVar.k3x7lurq((e8) this.Bo5Vs0Am.get()), gpVar.k3x7lurq(e8Var4), 0, 5);
                this.Bo5Vs0Am = null;
            }
            weakReference4 = this.JulN5IwK;
            if (weakReference4 == null) {
            }
            gpVar.sjUBp5pO();
            z3 = z15;
            z16 = true;
            if (z16) {
            }
            if (z2) {
                int i632 = 0;
                int i642 = 0;
                while (i6 < i55) {
                }
                max3 = Math.max(this.VGmz0ccI, i642);
                max4 = Math.max(this.LfKQckgD, i632);
                if (i4 == 2) {
                    aZz0PFXp(max3);
                    objArr[0] = 2;
                    z16 = true;
                    z3 = true;
                }
                if (i3 == 2) {
                    eIA6dogk(max4);
                    objArr[1] = 2;
                    z16 = true;
                    z3 = true;
                }
            }
            max = Math.max(this.VGmz0ccI, lDXGDhIF());
            if (max > lDXGDhIF()) {
            }
            max2 = Math.max(this.LfKQckgD, jb9XjC4I());
            if (max2 > jb9XjC4I()) {
            }
            if (!z5) {
            }
            i5 = 8;
            if (i58 <= i5) {
            }
            z15 = z5;
            i57 = i58;
            z14 = z2;
            e8Var = e8Var3;
        }
        boolean z18 = z15;
        this.SMax8wMR = arrayList10;
        if (z18) {
            objArr[0] = i4;
            objArr[1] = i3;
        }
        i7xS8jrb(gpVar.OnDfzHZD);
    }

    @Override // defpackage.t8
    public final void ow5vqvCr(StringBuilder sb) {
        sb.append(this.eVhOlqcC + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.ZyZthT5G);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.bvfAo0eO);
        sb.append("\n");
        ArrayList arrayList = this.SMax8wMR;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t8) obj).ow5vqvCr(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public final void zCflySGU(gp gpVar) {
        u8 u8Var;
        gp gpVar2;
        boolean HdOGZAzC = HdOGZAzC(64);
        NCTxEWno(gpVar, HdOGZAzC);
        int size = this.SMax8wMR.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            t8 t8Var = (t8) this.SMax8wMR.get(i);
            boolean[] zArr = t8Var.N8VPGzVC;
            zArr[0] = false;
            zArr[1] = false;
            if (t8Var instanceof y1) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                t8 t8Var2 = (t8) this.SMax8wMR.get(i2);
                if (t8Var2 instanceof y1) {
                    y1 y1Var = (y1) t8Var2;
                    for (int i3 = 0; i3 < y1Var.S7WAX0X5; i3++) {
                        t8 t8Var3 = y1Var.SMax8wMR[i3];
                        if (y1Var.B1cjorwa || t8Var3.MdtA4re8()) {
                            int i4 = y1Var.CTE3lpUp;
                            if (i4 == 0 || i4 == 1) {
                                t8Var3.N8VPGzVC[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                t8Var3.N8VPGzVC[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.wkPeYiwH;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            t8 t8Var4 = (t8) this.SMax8wMR.get(i5);
            t8Var4.getClass();
            if (t8Var4 instanceof am) {
                t8Var4.NCTxEWno(gpVar, HdOGZAzC);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((t8) it.next()).getClass();
                m1.qoPGr6Ce();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((t8) it2.next()).NCTxEWno(gpVar, HdOGZAzC);
                }
                hashSet.clear();
            }
        }
        if (gp.OxcuoDLp) {
            HashSet hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                t8 t8Var5 = (t8) this.SMax8wMR.get(i6);
                t8Var5.getClass();
                if (!(t8Var5 instanceof am)) {
                    hashSet2.add(t8Var5);
                }
            }
            u8Var = this;
            gpVar2 = gpVar;
            u8Var.qoPGr6Ce(this, gpVar2, hashSet2, this.N2kLh4D5[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                t8 t8Var6 = (t8) it3.next();
                w30.Qr9iLBAD(u8Var, gpVar2, t8Var6);
                t8Var6.NCTxEWno(gpVar2, HdOGZAzC);
            }
        } else {
            u8Var = this;
            gpVar2 = gpVar;
            for (int i7 = 0; i7 < size; i7++) {
                t8 t8Var7 = (t8) u8Var.SMax8wMR.get(i7);
                if (t8Var7 instanceof u8) {
                    int[] iArr = t8Var7.N2kLh4D5;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        t8Var7.pRiPUEwG(1);
                    }
                    if (i9 == 2) {
                        t8Var7.VhgXwMj9(1);
                    }
                    t8Var7.NCTxEWno(gpVar2, HdOGZAzC);
                    if (i8 == 2) {
                        t8Var7.pRiPUEwG(i8);
                    }
                    if (i9 == 2) {
                        t8Var7.VhgXwMj9(i9);
                    }
                } else {
                    w30.Qr9iLBAD(u8Var, gpVar2, t8Var7);
                    if (!(t8Var7 instanceof am)) {
                        t8Var7.NCTxEWno(gpVar2, HdOGZAzC);
                    }
                }
            }
        }
        if (u8Var.ZLB5OTob > 0) {
            ra.NCTxEWno(u8Var, gpVar2, null, 0);
        }
        if (u8Var.CIYkyd1d > 0) {
            ra.NCTxEWno(u8Var, gpVar2, null, 1);
        }
    }
}
