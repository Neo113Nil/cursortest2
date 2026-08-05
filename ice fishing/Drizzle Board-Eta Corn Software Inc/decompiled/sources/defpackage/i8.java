package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i8 extends ViewGroup.MarginLayoutParams {
    public int DK9slbsy;
    public int ESscZ9M1;
    public int Ey6iv0m0;
    public int FXJmAAN1;
    public int FySoLYna;
    public float HdOGZAzC;
    public int I5GHvsYW;
    public int KRabZ4CU;
    public int KlHjfFWx;
    public boolean LfKQckgD;
    public int LvHlPNBd;
    public float MdtA4re8;
    public int Mq3SeTnW;
    public float N2kLh4D5;
    public float N8VPGzVC;
    public int NCTxEWno;
    public int OnDfzHZD;
    public int OxcuoDLp;
    public int P7K7Inc8;
    public int QT4Tf9Dt;
    public int Qr9iLBAD;
    public int RXQxj5Oe;
    public t8 SMax8wMR;
    public float SgZGMMPL;
    public boolean Sjrx9cEN;
    public boolean TrssYQ34;
    public int U0LaHZX7;
    public boolean VGmz0ccI;
    public int VgvYg0wo;
    public int VhgXwMj9;
    public int WYNAV5pd;
    public int Wi7iiXC4;
    public int Xkz7p5xa;
    public int XrPeKzBk;
    public int ZyZthT5G;
    public int aZz0PFXp;
    public float amk52bBQ;
    public int b2ZJblxo;
    public int bvfAo0eO;
    public int dHozS53r;
    public float eIA6dogk;
    public int eVhOlqcC;
    public float euDDoUNr;
    public float f7oeun2L;
    public int fVMzMhyS;
    public String g2aRJUAd;
    public int gjV1z5T1;
    public boolean gmkaJpmS;
    public int hGvurcGl;
    public int hzgxAD8d;
    public int i7xS8jrb;
    public int jb9XjC4I;
    public int k3x7lurq;
    public int lDXGDhIF;
    public int lwWCatUu;
    public int nSmgoSB5;
    public int orhfF2Ya;
    public int ow5vqvCr;
    public boolean pP9Y2m6O;
    public float pRiPUEwG;
    public int qoPGr6Ce;
    public int sjUBp5pO;
    public boolean tef3qNMP;
    public int uQ3KJUK5;
    public boolean wxUZMvaN;
    public int ygLcUYwZ;
    public String ytu5o6f4;
    public int zCflySGU;

    public final void qoPGr6Ce() {
        this.tef3qNMP = false;
        this.VGmz0ccI = true;
        this.LfKQckgD = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.gmkaJpmS) {
            this.VGmz0ccI = false;
            if (this.Xkz7p5xa == 0) {
                this.Xkz7p5xa = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.TrssYQ34) {
            this.LfKQckgD = false;
            if (this.fVMzMhyS == 0) {
                this.fVMzMhyS = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.VGmz0ccI = false;
            if (i == 0 && this.Xkz7p5xa == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.gmkaJpmS = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.LfKQckgD = false;
            if (i2 == 0 && this.fVMzMhyS == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.TrssYQ34 = true;
            }
        }
        if (this.MdtA4re8 == -1.0f && this.qoPGr6Ce == -1 && this.NCTxEWno == -1) {
            return;
        }
        this.tef3qNMP = true;
        this.VGmz0ccI = true;
        this.LfKQckgD = true;
        t8 t8Var = this.SMax8wMR;
        if (!(t8Var instanceof am)) {
            t8Var = new am();
            this.SMax8wMR = t8Var;
        }
        ((am) t8Var).zCflySGU(this.KRabZ4CU);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.Wi7iiXC4 = -1;
        this.QT4Tf9Dt = -1;
        this.LvHlPNBd = -1;
        this.hGvurcGl = -1;
        this.orhfF2Ya = this.FySoLYna;
        this.dHozS53r = this.WYNAV5pd;
        float f = this.euDDoUNr;
        this.f7oeun2L = f;
        int i8 = this.qoPGr6Ce;
        this.uQ3KJUK5 = i8;
        int i9 = this.NCTxEWno;
        this.XrPeKzBk = i9;
        float f2 = this.MdtA4re8;
        this.N2kLh4D5 = f2;
        int i10 = this.KlHjfFWx;
        if (z2) {
            if (i10 != -1) {
                this.Wi7iiXC4 = i10;
            } else {
                int i11 = this.Ey6iv0m0;
                if (i11 != -1) {
                    this.QT4Tf9Dt = i11;
                }
                i2 = this.I5GHvsYW;
                if (i2 != -1) {
                    this.hGvurcGl = i2;
                    z = true;
                }
                i3 = this.RXQxj5Oe;
                if (i3 != -1) {
                    this.LvHlPNBd = i3;
                    z = true;
                }
                i4 = this.lwWCatUu;
                if (i4 != Integer.MIN_VALUE) {
                    this.dHozS53r = i4;
                }
                i5 = this.U0LaHZX7;
                if (i5 != Integer.MIN_VALUE) {
                    this.orhfF2Ya = i5;
                }
                if (z) {
                    this.f7oeun2L = 1.0f - f;
                }
                if (this.tef3qNMP && this.KRabZ4CU == 1 && this.wxUZMvaN) {
                    if (f2 == -1.0f) {
                        this.N2kLh4D5 = 1.0f - f2;
                        this.uQ3KJUK5 = -1;
                        this.XrPeKzBk = -1;
                    } else if (i8 != -1) {
                        this.XrPeKzBk = i8;
                        this.uQ3KJUK5 = -1;
                        this.N2kLh4D5 = -1.0f;
                    } else if (i9 != -1) {
                        this.uQ3KJUK5 = i9;
                        this.XrPeKzBk = -1;
                        this.N2kLh4D5 = -1.0f;
                    }
                }
            }
            z = true;
            i2 = this.I5GHvsYW;
            if (i2 != -1) {
            }
            i3 = this.RXQxj5Oe;
            if (i3 != -1) {
            }
            i4 = this.lwWCatUu;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.U0LaHZX7;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z) {
            }
            if (this.tef3qNMP) {
                if (f2 == -1.0f) {
                }
            }
        } else {
            if (i10 != -1) {
                this.hGvurcGl = i10;
            }
            int i12 = this.Ey6iv0m0;
            if (i12 != -1) {
                this.LvHlPNBd = i12;
            }
            i2 = this.I5GHvsYW;
            if (i2 != -1) {
                this.Wi7iiXC4 = i2;
            }
            i3 = this.RXQxj5Oe;
            if (i3 != -1) {
                this.QT4Tf9Dt = i3;
            }
            int i13 = this.lwWCatUu;
            if (i13 != Integer.MIN_VALUE) {
                this.orhfF2Ya = i13;
            }
            int i14 = this.U0LaHZX7;
            if (i14 != Integer.MIN_VALUE) {
                this.dHozS53r = i14;
            }
        }
        if (i2 == -1 && i3 == -1 && this.Ey6iv0m0 == -1 && i10 == -1) {
            int i15 = this.b2ZJblxo;
            if (i15 != -1) {
                this.Wi7iiXC4 = i15;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i16 = this.Qr9iLBAD;
                if (i16 != -1) {
                    this.QT4Tf9Dt = i16;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i17 = this.VgvYg0wo;
            if (i17 != -1) {
                this.LvHlPNBd = i17;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i18 = this.P7K7Inc8;
            if (i18 != -1) {
                this.hGvurcGl = i18;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
