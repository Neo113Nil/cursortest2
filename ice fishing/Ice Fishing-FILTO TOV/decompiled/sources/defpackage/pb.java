package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pb {
    public j6IIN2O8eOU GWasM1elztuh;
    public final fc1 OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final byte[] Yi7zF1RB1;
    public int xqGvceK5x;
    public static final Logger EljAMC1QTz = Logger.getLogger(pb.class.getName());
    public static final boolean AvO7iQsrTN = wc1.OOA6hdeuvCS;

    public pb(fc1 fc1Var, int i) {
        if (i < 0) {
            o4.mE4lRynR("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.Yi7zF1RB1 = new byte[max];
        this.X1lG3V04pd = max;
        this.OOA6hdeuvCS = fc1Var;
    }

    public static int AvO7iQsrTN(String str) {
        int length;
        try {
            length = gd1.GWasM1elztuh(str);
        } catch (fd1 unused) {
            length = str.getBytes(i30.GWasM1elztuh).length;
        }
        return mOu10nynGul(length) + length;
    }

    public static int EljAMC1QTz(int i, c9 c9Var) {
        int encWxUiV2 = encWxUiV2(i);
        int size = c9Var.size();
        return mOu10nynGul(size) + size + encWxUiV2;
    }

    public static int JFJ3QoxA(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int encWxUiV2(int i) {
        return mOu10nynGul(i << 3);
    }

    public static int mOu10nynGul(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void AEn1Rrio(long j) {
        E7jCp8Ls(10);
        OOA6hdeuvCS(j);
    }

    public final void E7jCp8Ls(int i) {
        if (this.X1lG3V04pd - this.xqGvceK5x < i) {
            rQPn8YBR();
        }
    }

    public final void EXrPz3p7hFb(int i) {
        E7jCp8Ls(5);
        xqGvceK5x(i);
    }

    public final void GWasM1elztuh(int i) {
        int i2 = this.xqGvceK5x;
        int i3 = i2 + 1;
        this.xqGvceK5x = i3;
        byte[] bArr = this.Yi7zF1RB1;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.xqGvceK5x = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.xqGvceK5x = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.xqGvceK5x = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void M3K9sHhK(int i, int i2) {
        EXrPz3p7hFb((i << 3) | i2);
    }

    public final void Mjvvu5DE(int i, int i2) {
        E7jCp8Ls(14);
        X1lG3V04pd(i, 5);
        GWasM1elztuh(i2);
    }

    public final void OOA6hdeuvCS(long j) {
        boolean z = AvO7iQsrTN;
        byte[] bArr = this.Yi7zF1RB1;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.xqGvceK5x;
                if (j2 == 0) {
                    this.xqGvceK5x = i + 1;
                    wc1.JFJ3QoxA(bArr, i, (byte) j);
                    return;
                } else {
                    this.xqGvceK5x = i + 1;
                    wc1.JFJ3QoxA(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.xqGvceK5x;
                if (j3 == 0) {
                    this.xqGvceK5x = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.xqGvceK5x = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void WIEu4Ya2g8(int i, c9 c9Var) {
        M3K9sHhK(i, 2);
        YmKjaVtbfp5Z(c9Var);
    }

    public final void WRKkgoJXwDn(int i, WRKkgoJXwDn wRKkgoJXwDn, nx0 nx0Var) {
        M3K9sHhK(i, 2);
        EXrPz3p7hFb(wRKkgoJXwDn.GWasM1elztuh(nx0Var));
        nx0Var.EljAMC1QTz(wRKkgoJXwDn, this.GWasM1elztuh);
    }

    public final void WdrkLMV3xh(byte[] bArr, int i, int i2) {
        uFEq9NpZ(bArr, i, i2);
    }

    public final void X1lG3V04pd(int i, int i2) {
        xqGvceK5x((i << 3) | i2);
    }

    public final void XnEVoBF0td1l(byte b) {
        if (this.xqGvceK5x == this.X1lG3V04pd) {
            rQPn8YBR();
        }
        int i = this.xqGvceK5x;
        this.xqGvceK5x = i + 1;
        this.Yi7zF1RB1[i] = b;
    }

    public final void Y6hRI1cF8(long j) {
        E7jCp8Ls(8);
        Yi7zF1RB1(j);
    }

    public final void Yi7zF1RB1(long j) {
        int i = this.xqGvceK5x;
        int i2 = i + 1;
        this.xqGvceK5x = i2;
        byte[] bArr = this.Yi7zF1RB1;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.xqGvceK5x = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.xqGvceK5x = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.xqGvceK5x = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.xqGvceK5x = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.xqGvceK5x = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.xqGvceK5x = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.xqGvceK5x = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void YmKjaVtbfp5Z(c9 c9Var) {
        EXrPz3p7hFb(c9Var.size());
        WdrkLMV3xh(c9Var.EljAMC1QTz, c9Var.EljAMC1QTz(), c9Var.size());
    }

    public final void arNh8D4Z5gB(String str, int i) {
        M3K9sHhK(i, 2);
        pog2g9KITJA(str);
    }

    public final void cilMamHF(int i, int i2) {
        E7jCp8Ls(20);
        X1lG3V04pd(i, 0);
        if (i2 >= 0) {
            xqGvceK5x(i2);
        } else {
            OOA6hdeuvCS(i2);
        }
    }

    public final void iwATDS1i01k(int i, boolean z) {
        E7jCp8Ls(11);
        X1lG3V04pd(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.xqGvceK5x;
        this.xqGvceK5x = i2 + 1;
        this.Yi7zF1RB1[i2] = b;
    }

    public final void jivtDDk9H(int i, long j) {
        E7jCp8Ls(18);
        X1lG3V04pd(i, 1);
        Yi7zF1RB1(j);
    }

    public final void k8h8IjolWQ(int i, int i2) {
        E7jCp8Ls(20);
        X1lG3V04pd(i, 0);
        xqGvceK5x(i2);
    }

    public final void lv06NcmrQ(int i) {
        if (i >= 0) {
            EXrPz3p7hFb(i);
        } else {
            AEn1Rrio(i);
        }
    }

    public final void mE4lRynR(int i) {
        E7jCp8Ls(4);
        GWasM1elztuh(i);
    }

    public final void ozMwhSAI(int i, long j) {
        E7jCp8Ls(20);
        X1lG3V04pd(i, 0);
        OOA6hdeuvCS(j);
    }

    public final void pog2g9KITJA(String str) {
        try {
            int length = str.length() * 3;
            int mOu10nynGul = mOu10nynGul(length);
            int i = mOu10nynGul + length;
            int i2 = this.X1lG3V04pd;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int Mjvvu5DE = gd1.GWasM1elztuh.Mjvvu5DE(str, bArr, 0, length);
                EXrPz3p7hFb(Mjvvu5DE);
                uFEq9NpZ(bArr, 0, Mjvvu5DE);
                return;
            }
            if (i > i2 - this.xqGvceK5x) {
                rQPn8YBR();
            }
            int mOu10nynGul2 = mOu10nynGul(str.length());
            int i3 = this.xqGvceK5x;
            byte[] bArr2 = this.Yi7zF1RB1;
            try {
                try {
                    if (mOu10nynGul2 == mOu10nynGul) {
                        int i4 = i3 + mOu10nynGul2;
                        this.xqGvceK5x = i4;
                        int Mjvvu5DE2 = gd1.GWasM1elztuh.Mjvvu5DE(str, bArr2, i4, i2 - i4);
                        this.xqGvceK5x = i3;
                        xqGvceK5x((Mjvvu5DE2 - i3) - mOu10nynGul2);
                        this.xqGvceK5x = Mjvvu5DE2;
                    } else {
                        int GWasM1elztuh = gd1.GWasM1elztuh(str);
                        xqGvceK5x(GWasM1elztuh);
                        this.xqGvceK5x = gd1.GWasM1elztuh.Mjvvu5DE(str, bArr2, this.xqGvceK5x, GWasM1elztuh);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new ob(e);
                }
            } catch (fd1 e2) {
                this.xqGvceK5x = i3;
                throw e2;
            }
        } catch (fd1 e3) {
            EljAMC1QTz.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(i30.GWasM1elztuh);
            try {
                EXrPz3p7hFb(bytes.length);
                WdrkLMV3xh(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new ob(e4);
            }
        }
    }

    public final void rQPn8YBR() {
        this.OOA6hdeuvCS.write(this.Yi7zF1RB1, 0, this.xqGvceK5x);
        this.xqGvceK5x = 0;
    }

    public final void uFEq9NpZ(byte[] bArr, int i, int i2) {
        int i3 = this.xqGvceK5x;
        int i4 = this.X1lG3V04pd;
        int i5 = i4 - i3;
        byte[] bArr2 = this.Yi7zF1RB1;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.xqGvceK5x += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.xqGvceK5x = i4;
        rQPn8YBR();
        if (i7 > i4) {
            this.OOA6hdeuvCS.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.xqGvceK5x = i7;
        }
    }

    public final void xqGvceK5x(int i) {
        boolean z = AvO7iQsrTN;
        byte[] bArr = this.Yi7zF1RB1;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.xqGvceK5x;
                if (i2 == 0) {
                    this.xqGvceK5x = i3 + 1;
                    wc1.JFJ3QoxA(bArr, i3, (byte) i);
                    return;
                } else {
                    this.xqGvceK5x = i3 + 1;
                    wc1.JFJ3QoxA(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.xqGvceK5x;
                if (i4 == 0) {
                    this.xqGvceK5x = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.xqGvceK5x = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }
}
