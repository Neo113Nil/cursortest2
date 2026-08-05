package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gp {
    public static boolean OxcuoDLp = false;
    public final f0 OnDfzHZD;
    public y0 sjUBp5pO;
    public final e00 wxUZMvaN;
    public int qoPGr6Ce = 1000;
    public boolean NCTxEWno = false;
    public int MdtA4re8 = 0;
    public int VgvYg0wo = 32;
    public int P7K7Inc8 = 32;
    public boolean Qr9iLBAD = false;
    public boolean[] jb9XjC4I = new boolean[32];
    public int eVhOlqcC = 1;
    public int k3x7lurq = 0;
    public int ow5vqvCr = 32;
    public r70[] ygLcUYwZ = new r70[1000];
    public int lDXGDhIF = 0;
    public y0[] b2ZJblxo = new y0[32];

    public gp() {
        KlHjfFWx();
        f0 f0Var = new f0();
        f0Var.MdtA4re8 = new zz();
        f0Var.wxUZMvaN = new zz();
        f0Var.VgvYg0wo = new r70[32];
        this.OnDfzHZD = f0Var;
        e00 e00Var = new e00(f0Var);
        e00Var.P7K7Inc8 = new r70[128];
        e00Var.b2ZJblxo = new r70[128];
        e00Var.Qr9iLBAD = 0;
        e00Var.jb9XjC4I = new mcXgUFR8((Object) e00Var, 28, false);
        this.wxUZMvaN = e00Var;
        this.sjUBp5pO = new y0(f0Var);
    }

    public static int ygLcUYwZ(Object obj) {
        r70 r70Var = ((e8) obj).jb9XjC4I;
        if (r70Var != null) {
            return (int) (r70Var.P7K7Inc8 + 0.5f);
        }
        return 0;
    }

    public final void Ey6iv0m0() {
        f0 f0Var;
        int i = 0;
        while (true) {
            f0Var = this.OnDfzHZD;
            r70[] r70VarArr = (r70[]) f0Var.VgvYg0wo;
            if (i >= r70VarArr.length) {
                break;
            }
            r70 r70Var = r70VarArr[i];
            if (r70Var != null) {
                r70Var.MdtA4re8();
            }
            i++;
        }
        zz zzVar = (zz) f0Var.wxUZMvaN;
        r70[] r70VarArr2 = this.ygLcUYwZ;
        int i2 = this.lDXGDhIF;
        zzVar.getClass();
        if (i2 > r70VarArr2.length) {
            i2 = r70VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            r70 r70Var2 = r70VarArr2[i3];
            int i4 = zzVar.NCTxEWno;
            Object[] objArr = zzVar.qoPGr6Ce;
            if (i4 < objArr.length) {
                objArr[i4] = r70Var2;
                zzVar.NCTxEWno = i4 + 1;
            }
        }
        this.lDXGDhIF = 0;
        Arrays.fill((r70[]) f0Var.VgvYg0wo, (Object) null);
        this.MdtA4re8 = 0;
        e00 e00Var = this.wxUZMvaN;
        e00Var.Qr9iLBAD = 0;
        e00Var.NCTxEWno = 0.0f;
        this.eVhOlqcC = 1;
        for (int i5 = 0; i5 < this.k3x7lurq; i5++) {
            y0 y0Var = this.b2ZJblxo[i5];
        }
        KlHjfFWx();
        this.k3x7lurq = 0;
        this.sjUBp5pO = new y0(f0Var);
    }

    public final void KlHjfFWx() {
        for (int i = 0; i < this.k3x7lurq; i++) {
            y0 y0Var = this.b2ZJblxo[i];
            if (y0Var != null) {
                ((zz) this.OnDfzHZD.MdtA4re8).NCTxEWno(y0Var);
            }
            this.b2ZJblxo[i] = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.ow5vqvCr <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.ow5vqvCr <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.ow5vqvCr <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.ow5vqvCr <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void MdtA4re8(y0 y0Var) {
        boolean z;
        boolean z2;
        r70 r70Var;
        r70 P7K7Inc8;
        if (this.k3x7lurq + 1 >= this.ow5vqvCr || this.eVhOlqcC + 1 >= this.P7K7Inc8) {
            lDXGDhIF();
        }
        if (y0Var.VgvYg0wo) {
            z = false;
        } else {
            ArrayList arrayList = y0Var.MdtA4re8;
            if (this.b2ZJblxo.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int wxUZMvaN = y0Var.wxUZMvaN.wxUZMvaN();
                    for (int i = 0; i < wxUZMvaN; i++) {
                        r70 VgvYg0wo = y0Var.wxUZMvaN.VgvYg0wo(i);
                        if (VgvYg0wo.wxUZMvaN != -1 || VgvYg0wo.b2ZJblxo) {
                            arrayList.add(VgvYg0wo);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            r70 r70Var2 = (r70) arrayList.get(i2);
                            if (r70Var2.b2ZJblxo) {
                                y0Var.Qr9iLBAD(this, r70Var2, true);
                            } else {
                                y0Var.jb9XjC4I(this, this.b2ZJblxo[r70Var2.wxUZMvaN], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (y0Var.qoPGr6Ce != null && y0Var.wxUZMvaN.wxUZMvaN() == 0) {
                    y0Var.VgvYg0wo = true;
                    this.NCTxEWno = true;
                }
            }
            if (y0Var.VgvYg0wo()) {
                return;
            }
            float f = y0Var.NCTxEWno;
            float f2 = 0.0f;
            if (f < 0.0f) {
                y0Var.NCTxEWno = f * (-1.0f);
                r0 r0Var = y0Var.wxUZMvaN;
                int i3 = r0Var.Qr9iLBAD;
                for (int i4 = 0; i3 != -1 && i4 < r0Var.qoPGr6Ce; i4++) {
                    float[] fArr = r0Var.b2ZJblxo;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = r0Var.P7K7Inc8[i3];
                }
            }
            int wxUZMvaN2 = y0Var.wxUZMvaN.wxUZMvaN();
            float f3 = 0.0f;
            float f4 = 0.0f;
            r70 r70Var3 = null;
            r70 r70Var4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < wxUZMvaN2) {
                float P7K7Inc82 = y0Var.wxUZMvaN.P7K7Inc8(i5);
                r70 VgvYg0wo2 = y0Var.wxUZMvaN.VgvYg0wo(i5);
                float f5 = f2;
                if (VgvYg0wo2.OnDfzHZD == 1) {
                    if (r70Var3 != null) {
                        if (f3 <= P7K7Inc82) {
                            if (!z4) {
                                if (VgvYg0wo2.ow5vqvCr > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    r70Var3 = VgvYg0wo2;
                    f3 = P7K7Inc82;
                } else if (r70Var3 == null && P7K7Inc82 < f5) {
                    if (r70Var4 != null) {
                        if (f4 <= P7K7Inc82) {
                            if (!z5) {
                                if (VgvYg0wo2.ow5vqvCr > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    r70Var4 = VgvYg0wo2;
                    f4 = P7K7Inc82;
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (r70Var3 == null) {
                r70Var3 = r70Var4;
            }
            if (r70Var3 == null) {
                z2 = true;
            } else {
                y0Var.b2ZJblxo(r70Var3);
                z2 = false;
            }
            if (y0Var.wxUZMvaN.wxUZMvaN() == 0) {
                y0Var.VgvYg0wo = true;
            }
            if (z2) {
                if (this.eVhOlqcC + 1 >= this.P7K7Inc8) {
                    lDXGDhIF();
                }
                r70 qoPGr6Ce = qoPGr6Ce(3);
                int i6 = this.MdtA4re8 + 1;
                this.MdtA4re8 = i6;
                this.eVhOlqcC++;
                qoPGr6Ce.MdtA4re8 = i6;
                f0 f0Var = this.OnDfzHZD;
                ((r70[]) f0Var.VgvYg0wo)[i6] = qoPGr6Ce;
                y0Var.qoPGr6Ce = qoPGr6Ce;
                int i7 = this.k3x7lurq;
                Qr9iLBAD(y0Var);
                if (this.k3x7lurq == i7 + 1) {
                    y0 y0Var2 = this.sjUBp5pO;
                    y0Var2.qoPGr6Ce = null;
                    y0Var2.wxUZMvaN.NCTxEWno();
                    for (int i8 = 0; i8 < y0Var.wxUZMvaN.wxUZMvaN(); i8++) {
                        y0Var2.wxUZMvaN.qoPGr6Ce(y0Var.wxUZMvaN.VgvYg0wo(i8), y0Var.wxUZMvaN.P7K7Inc8(i8), true);
                    }
                    amk52bBQ(this.sjUBp5pO);
                    if (qoPGr6Ce.wxUZMvaN == -1) {
                        if (y0Var.qoPGr6Ce == qoPGr6Ce && (P7K7Inc8 = y0Var.P7K7Inc8(null, qoPGr6Ce)) != null) {
                            y0Var.b2ZJblxo(P7K7Inc8);
                        }
                        if (!y0Var.VgvYg0wo) {
                            y0Var.qoPGr6Ce.VgvYg0wo(this, y0Var);
                        }
                        ((zz) f0Var.MdtA4re8).NCTxEWno(y0Var);
                        this.k3x7lurq--;
                    }
                    z = true;
                    r70Var = y0Var.qoPGr6Ce;
                    if (r70Var != null) {
                        return;
                    }
                    if (r70Var.OnDfzHZD != 1 && y0Var.NCTxEWno < f6) {
                        return;
                    }
                }
            }
            z = false;
            r70Var = y0Var.qoPGr6Ce;
            if (r70Var != null) {
            }
        }
        if (z) {
            return;
        }
        Qr9iLBAD(y0Var);
    }

    public final void NCTxEWno(r70 r70Var, r70 r70Var2, int i, float f, r70 r70Var3, r70 r70Var4, int i2, int i3) {
        y0 ow5vqvCr = ow5vqvCr();
        if (r70Var2 == r70Var3) {
            ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var, 1.0f);
            ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var4, 1.0f);
            ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, -2.0f);
        } else {
            r0 r0Var = ow5vqvCr.wxUZMvaN;
            if (f == 0.5f) {
                r0Var.b2ZJblxo(r70Var, 1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, -1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var3, -1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    ow5vqvCr.NCTxEWno = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                r0Var.b2ZJblxo(r70Var, -1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, 1.0f);
                ow5vqvCr.NCTxEWno = i;
            } else if (f >= 1.0f) {
                r0Var.b2ZJblxo(r70Var4, -1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var3, 1.0f);
                ow5vqvCr.NCTxEWno = -i2;
            } else {
                float f2 = 1.0f - f;
                r0Var.b2ZJblxo(r70Var, f2 * 1.0f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, f2 * (-1.0f));
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var3, (-1.0f) * f);
                ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    ow5vqvCr.NCTxEWno = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            ow5vqvCr.qoPGr6Ce(this, i3);
        }
        MdtA4re8(ow5vqvCr);
    }

    public final r70 OnDfzHZD() {
        if (this.eVhOlqcC + 1 >= this.P7K7Inc8) {
            lDXGDhIF();
        }
        r70 qoPGr6Ce = qoPGr6Ce(3);
        int i = this.MdtA4re8 + 1;
        this.MdtA4re8 = i;
        this.eVhOlqcC++;
        qoPGr6Ce.MdtA4re8 = i;
        ((r70[]) this.OnDfzHZD.VgvYg0wo)[i] = qoPGr6Ce;
        return qoPGr6Ce;
    }

    public final void OxcuoDLp(e00 e00Var) {
        int i = 0;
        while (true) {
            if (i >= this.k3x7lurq) {
                break;
            }
            y0 y0Var = this.b2ZJblxo[i];
            int i2 = 1;
            if (y0Var.qoPGr6Ce.OnDfzHZD != 1) {
                float f = 0.0f;
                if (y0Var.NCTxEWno < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k3x7lurq) {
                            y0 y0Var2 = this.b2ZJblxo[i6];
                            if (y0Var2.qoPGr6Ce.OnDfzHZD != i2 && !y0Var2.VgvYg0wo && y0Var2.NCTxEWno < f) {
                                int wxUZMvaN = y0Var2.wxUZMvaN.wxUZMvaN();
                                int i8 = 0;
                                while (i8 < wxUZMvaN) {
                                    r70 VgvYg0wo = y0Var2.wxUZMvaN.VgvYg0wo(i8);
                                    float MdtA4re8 = y0Var2.wxUZMvaN.MdtA4re8(VgvYg0wo);
                                    if (MdtA4re8 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = VgvYg0wo.Qr9iLBAD[i9] / MdtA4re8;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = VgvYg0wo.MdtA4re8;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            y0 y0Var3 = this.b2ZJblxo[i4];
                            y0Var3.qoPGr6Ce.wxUZMvaN = -1;
                            y0Var3.b2ZJblxo(((r70[]) this.OnDfzHZD.VgvYg0wo)[i5]);
                            r70 r70Var = y0Var3.qoPGr6Ce;
                            r70Var.wxUZMvaN = i4;
                            r70Var.VgvYg0wo(this, y0Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.eVhOlqcC / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        amk52bBQ(e00Var);
        jb9XjC4I();
    }

    public final void P7K7Inc8(r70 r70Var, r70 r70Var2, int i, int i2) {
        y0 ow5vqvCr = ow5vqvCr();
        r70 OnDfzHZD = OnDfzHZD();
        OnDfzHZD.VgvYg0wo = 0;
        ow5vqvCr.NCTxEWno(r70Var, r70Var2, OnDfzHZD, i);
        if (i2 != 8) {
            ow5vqvCr.wxUZMvaN.b2ZJblxo(eVhOlqcC(i2), (int) (ow5vqvCr.wxUZMvaN.MdtA4re8(OnDfzHZD) * (-1.0f)));
        }
        MdtA4re8(ow5vqvCr);
    }

    public final void Qr9iLBAD(y0 y0Var) {
        int i;
        if (y0Var.VgvYg0wo) {
            y0Var.qoPGr6Ce.wxUZMvaN(this, y0Var.NCTxEWno);
        } else {
            y0[] y0VarArr = this.b2ZJblxo;
            int i2 = this.k3x7lurq;
            y0VarArr[i2] = y0Var;
            r70 r70Var = y0Var.qoPGr6Ce;
            r70Var.wxUZMvaN = i2;
            this.k3x7lurq = i2 + 1;
            r70Var.VgvYg0wo(this, y0Var);
        }
        if (this.NCTxEWno) {
            int i3 = 0;
            while (i3 < this.k3x7lurq) {
                if (this.b2ZJblxo[i3] == null) {
                    System.out.println("WTF");
                }
                y0 y0Var2 = this.b2ZJblxo[i3];
                if (y0Var2 != null && y0Var2.VgvYg0wo) {
                    y0Var2.qoPGr6Ce.wxUZMvaN(this, y0Var2.NCTxEWno);
                    ((zz) this.OnDfzHZD.MdtA4re8).NCTxEWno(y0Var2);
                    this.b2ZJblxo[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k3x7lurq;
                        if (i4 >= i) {
                            break;
                        }
                        y0[] y0VarArr2 = this.b2ZJblxo;
                        int i6 = i4 - 1;
                        y0 y0Var3 = y0VarArr2[i4];
                        y0VarArr2[i6] = y0Var3;
                        r70 r70Var2 = y0Var3.qoPGr6Ce;
                        if (r70Var2.wxUZMvaN == i4) {
                            r70Var2.wxUZMvaN = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.b2ZJblxo[i5] = null;
                    }
                    this.k3x7lurq = i - 1;
                    i3--;
                }
                i3++;
            }
            this.NCTxEWno = false;
        }
    }

    public final void VgvYg0wo(r70 r70Var, r70 r70Var2, int i, int i2) {
        if (i2 == 8 && r70Var2.b2ZJblxo && r70Var.wxUZMvaN == -1) {
            r70Var.wxUZMvaN(this, r70Var2.P7K7Inc8 + i);
            return;
        }
        y0 ow5vqvCr = ow5vqvCr();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            ow5vqvCr.NCTxEWno = i;
        }
        r0 r0Var = ow5vqvCr.wxUZMvaN;
        if (z) {
            r0Var.b2ZJblxo(r70Var, 1.0f);
            ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, -1.0f);
        } else {
            r0Var.b2ZJblxo(r70Var, -1.0f);
            ow5vqvCr.wxUZMvaN.b2ZJblxo(r70Var2, 1.0f);
        }
        if (i2 != 8) {
            ow5vqvCr.qoPGr6Ce(this, i2);
        }
        MdtA4re8(ow5vqvCr);
    }

    public final void amk52bBQ(y0 y0Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.eVhOlqcC; i2++) {
            this.jb9XjC4I[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.eVhOlqcC * 2) {
                return;
            }
            r70 r70Var = y0Var.qoPGr6Ce;
            if (r70Var != null) {
                this.jb9XjC4I[r70Var.MdtA4re8] = true;
            }
            r70 wxUZMvaN = y0Var.wxUZMvaN(this.jb9XjC4I);
            if (wxUZMvaN != null) {
                boolean[] zArr = this.jb9XjC4I;
                int i4 = wxUZMvaN.MdtA4re8;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (wxUZMvaN != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k3x7lurq) {
                    y0 y0Var2 = this.b2ZJblxo[i5];
                    if (y0Var2.qoPGr6Ce.OnDfzHZD != 1 && !y0Var2.VgvYg0wo) {
                        r0 r0Var = y0Var2.wxUZMvaN;
                        int i7 = r0Var.Qr9iLBAD;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < r0Var.qoPGr6Ce; i8++) {
                                if (r0Var.VgvYg0wo[i7] == wxUZMvaN.MdtA4re8) {
                                    z = true;
                                    break;
                                }
                                i7 = r0Var.P7K7Inc8[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float MdtA4re8 = y0Var2.wxUZMvaN.MdtA4re8(wxUZMvaN);
                            if (MdtA4re8 < 0.0f) {
                                float f2 = (-y0Var2.NCTxEWno) / MdtA4re8;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    y0 y0Var3 = this.b2ZJblxo[i6];
                    y0Var3.qoPGr6Ce.wxUZMvaN = -1;
                    y0Var3.b2ZJblxo(wxUZMvaN);
                    r70 r70Var2 = y0Var3.qoPGr6Ce;
                    r70Var2.wxUZMvaN = i6;
                    r70Var2.VgvYg0wo(this, y0Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void b2ZJblxo(r70 r70Var, r70 r70Var2, int i, int i2) {
        y0 ow5vqvCr = ow5vqvCr();
        r70 OnDfzHZD = OnDfzHZD();
        OnDfzHZD.VgvYg0wo = 0;
        ow5vqvCr.MdtA4re8(r70Var, r70Var2, OnDfzHZD, i);
        if (i2 != 8) {
            ow5vqvCr.wxUZMvaN.b2ZJblxo(eVhOlqcC(i2), (int) (ow5vqvCr.wxUZMvaN.MdtA4re8(OnDfzHZD) * (-1.0f)));
        }
        MdtA4re8(ow5vqvCr);
    }

    public final r70 eVhOlqcC(int i) {
        if (this.eVhOlqcC + 1 >= this.P7K7Inc8) {
            lDXGDhIF();
        }
        r70 qoPGr6Ce = qoPGr6Ce(4);
        float[] fArr = qoPGr6Ce.jb9XjC4I;
        int i2 = this.MdtA4re8 + 1;
        this.MdtA4re8 = i2;
        this.eVhOlqcC++;
        qoPGr6Ce.MdtA4re8 = i2;
        qoPGr6Ce.VgvYg0wo = i;
        ((r70[]) this.OnDfzHZD.VgvYg0wo)[i2] = qoPGr6Ce;
        e00 e00Var = this.wxUZMvaN;
        e00Var.jb9XjC4I.MdtA4re8 = qoPGr6Ce;
        Arrays.fill(fArr, 0.0f);
        fArr[qoPGr6Ce.VgvYg0wo] = 1.0f;
        e00Var.eVhOlqcC(qoPGr6Ce);
        return qoPGr6Ce;
    }

    public final void jb9XjC4I() {
        for (int i = 0; i < this.k3x7lurq; i++) {
            y0 y0Var = this.b2ZJblxo[i];
            y0Var.qoPGr6Ce.P7K7Inc8 = y0Var.NCTxEWno;
        }
    }

    public final r70 k3x7lurq(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.eVhOlqcC + 1 >= this.P7K7Inc8) {
            lDXGDhIF();
        }
        if (!(obj instanceof e8)) {
            return null;
        }
        e8 e8Var = (e8) obj;
        r70 r70Var = e8Var.jb9XjC4I;
        if (r70Var == null) {
            e8Var.Qr9iLBAD();
            r70Var = e8Var.jb9XjC4I;
        }
        int i = r70Var.MdtA4re8;
        f0 f0Var = this.OnDfzHZD;
        if (i != -1 && i <= this.MdtA4re8 && ((r70[]) f0Var.VgvYg0wo)[i] != null) {
            return r70Var;
        }
        if (i != -1) {
            r70Var.MdtA4re8();
        }
        int i2 = this.MdtA4re8 + 1;
        this.MdtA4re8 = i2;
        this.eVhOlqcC++;
        r70Var.MdtA4re8 = i2;
        r70Var.OnDfzHZD = 1;
        ((r70[]) f0Var.VgvYg0wo)[i2] = r70Var;
        return r70Var;
    }

    public final void lDXGDhIF() {
        int i = this.VgvYg0wo * 2;
        this.VgvYg0wo = i;
        this.b2ZJblxo = (y0[]) Arrays.copyOf(this.b2ZJblxo, i);
        f0 f0Var = this.OnDfzHZD;
        f0Var.VgvYg0wo = (r70[]) Arrays.copyOf((r70[]) f0Var.VgvYg0wo, this.VgvYg0wo);
        int i2 = this.VgvYg0wo;
        this.jb9XjC4I = new boolean[i2];
        this.P7K7Inc8 = i2;
        this.ow5vqvCr = i2;
    }

    public final y0 ow5vqvCr() {
        Object obj;
        f0 f0Var = this.OnDfzHZD;
        zz zzVar = (zz) f0Var.MdtA4re8;
        int i = zzVar.NCTxEWno;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = zzVar.qoPGr6Ce;
            obj = objArr[i2];
            objArr[i2] = null;
            zzVar.NCTxEWno = i2;
        } else {
            obj = null;
        }
        y0 y0Var = (y0) obj;
        if (y0Var == null) {
            return new y0(f0Var);
        }
        y0Var.qoPGr6Ce = null;
        y0Var.wxUZMvaN.NCTxEWno();
        y0Var.NCTxEWno = 0.0f;
        y0Var.VgvYg0wo = false;
        return y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final r70 qoPGr6Ce(int i) {
        zz zzVar = (zz) this.OnDfzHZD.wxUZMvaN;
        int i2 = zzVar.NCTxEWno;
        r70 r70Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = zzVar.qoPGr6Ce;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            zzVar.NCTxEWno = i3;
            r70Var = r4;
        }
        r70 r70Var2 = r70Var;
        if (r70Var2 == null) {
            r70Var2 = new r70(i);
            r70Var2.OnDfzHZD = i;
        } else {
            r70Var2.MdtA4re8();
            r70Var2.OnDfzHZD = i;
        }
        int i4 = this.lDXGDhIF;
        int i5 = this.qoPGr6Ce;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.qoPGr6Ce = i6;
            this.ygLcUYwZ = (r70[]) Arrays.copyOf(this.ygLcUYwZ, i6);
        }
        r70[] r70VarArr = this.ygLcUYwZ;
        int i7 = this.lDXGDhIF;
        this.lDXGDhIF = i7 + 1;
        r70VarArr[i7] = r70Var2;
        return r70Var2;
    }

    public final void sjUBp5pO() {
        e00 e00Var = this.wxUZMvaN;
        if (e00Var.VgvYg0wo()) {
            jb9XjC4I();
            return;
        }
        if (!this.Qr9iLBAD) {
            OxcuoDLp(e00Var);
            return;
        }
        for (int i = 0; i < this.k3x7lurq; i++) {
            if (!this.b2ZJblxo[i].VgvYg0wo) {
                OxcuoDLp(e00Var);
                return;
            }
        }
        jb9XjC4I();
    }

    public final void wxUZMvaN(r70 r70Var, int i) {
        int i2 = r70Var.wxUZMvaN;
        if (i2 == -1) {
            r70Var.wxUZMvaN(this, i);
            for (int i3 = 0; i3 < this.MdtA4re8 + 1; i3++) {
                r70 r70Var2 = ((r70[]) this.OnDfzHZD.VgvYg0wo)[i3];
            }
            return;
        }
        if (i2 == -1) {
            y0 ow5vqvCr = ow5vqvCr();
            ow5vqvCr.qoPGr6Ce = r70Var;
            float f = i;
            r70Var.P7K7Inc8 = f;
            ow5vqvCr.NCTxEWno = f;
            ow5vqvCr.VgvYg0wo = true;
            MdtA4re8(ow5vqvCr);
            return;
        }
        y0 y0Var = this.b2ZJblxo[i2];
        if (y0Var.VgvYg0wo) {
            y0Var.NCTxEWno = i;
            return;
        }
        if (y0Var.wxUZMvaN.wxUZMvaN() == 0) {
            y0Var.VgvYg0wo = true;
            y0Var.NCTxEWno = i;
            return;
        }
        y0 ow5vqvCr2 = ow5vqvCr();
        if (i < 0) {
            ow5vqvCr2.NCTxEWno = i * (-1);
            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var, 1.0f);
        } else {
            ow5vqvCr2.NCTxEWno = i;
            ow5vqvCr2.wxUZMvaN.b2ZJblxo(r70Var, -1.0f);
        }
        MdtA4re8(ow5vqvCr2);
    }
}
