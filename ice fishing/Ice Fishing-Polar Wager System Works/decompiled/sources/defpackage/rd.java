package defpackage;

/* loaded from: classes.dex */
public final class rd {
    public int F7NU4MC0GW;
    public defpackage.c1NqjJifC7 IHQe1A4L2xu;
    public final defpackage.jk1 adDC3e2L;
    public final byte[] oh6vYeIP;
    public final int r1MBDhnF;
    public static final java.util.logging.Logger xiZrDbcSW0 = java.util.logging.Logger.getLogger(defpackage.rd.class.getName());
    public static final boolean AARZUJiTa = defpackage.al1.adDC3e2L;

    public rd(defpackage.jk1 jk1Var, int i) {
        if (i < 0) {
            defpackage.db.fnWB2E7cs("bufferSize must be >= 0");
            throw null;
        }
        int max = java.lang.Math.max(i, 20);
        this.oh6vYeIP = new byte[max];
        this.r1MBDhnF = max;
        this.adDC3e2L = jk1Var;
    }

    public static int AARZUJiTa(java.lang.String str) {
        int length;
        try {
            length = defpackage.jl1.IHQe1A4L2xu(str);
        } catch (defpackage.il1 unused) {
            length = str.getBytes(defpackage.q70.IHQe1A4L2xu).length;
        }
        return riuEU0zW4(length) + length;
    }

    public static int EXtogiMhuM(int i) {
        return riuEU0zW4(i << 3);
    }

    public static int SH1y5HwkJhh(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int riuEU0zW4(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int xiZrDbcSW0(int i, defpackage.ra raVar) {
        int EXtogiMhuM = EXtogiMhuM(i);
        int size = raVar.size();
        return riuEU0zW4(size) + size + EXtogiMhuM;
    }

    public final void C0U8sNJm(java.lang.String str) {
        try {
            int length = str.length() * 3;
            int riuEU0zW4 = riuEU0zW4(length);
            int i = riuEU0zW4 + length;
            int i2 = this.r1MBDhnF;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int G3OKOH3wZRC = defpackage.jl1.IHQe1A4L2xu.G3OKOH3wZRC(str, bArr, 0, length);
                v5iciZok(G3OKOH3wZRC);
                SyNS6RMn(bArr, 0, G3OKOH3wZRC);
                return;
            }
            if (i > i2 - this.F7NU4MC0GW) {
                ez2rX8ReCYw();
            }
            int riuEU0zW42 = riuEU0zW4(str.length());
            int i3 = this.F7NU4MC0GW;
            byte[] bArr2 = this.oh6vYeIP;
            try {
                if (riuEU0zW42 == riuEU0zW4) {
                    int i4 = i3 + riuEU0zW42;
                    this.F7NU4MC0GW = i4;
                    int G3OKOH3wZRC2 = defpackage.jl1.IHQe1A4L2xu.G3OKOH3wZRC(str, bArr2, i4, i2 - i4);
                    this.F7NU4MC0GW = i3;
                    F7NU4MC0GW((G3OKOH3wZRC2 - i3) - riuEU0zW42);
                    this.F7NU4MC0GW = G3OKOH3wZRC2;
                } else {
                    int IHQe1A4L2xu = defpackage.jl1.IHQe1A4L2xu(str);
                    F7NU4MC0GW(IHQe1A4L2xu);
                    this.F7NU4MC0GW = defpackage.jl1.IHQe1A4L2xu.G3OKOH3wZRC(str, bArr2, this.F7NU4MC0GW, IHQe1A4L2xu);
                }
            } catch (defpackage.il1 e) {
                this.F7NU4MC0GW = i3;
                throw e;
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new defpackage.qd(e2);
            }
        } catch (defpackage.il1 e3) {
            xiZrDbcSW0.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) e3);
            byte[] bytes = str.getBytes(defpackage.q70.IHQe1A4L2xu);
            try {
                v5iciZok(bytes.length);
                abhbClRa(bytes, 0, bytes.length);
            } catch (java.lang.IndexOutOfBoundsException e4) {
                throw new defpackage.qd(e4);
            }
        }
    }

    public final void D2vUnMij(int i, long j) {
        JlrlGoKF(20);
        r1MBDhnF(i, 0);
        adDC3e2L(j);
    }

    public final void DFo87pBq1E5(byte b) {
        if (this.F7NU4MC0GW == this.r1MBDhnF) {
            ez2rX8ReCYw();
        }
        int i = this.F7NU4MC0GW;
        this.F7NU4MC0GW = i + 1;
        this.oh6vYeIP[i] = b;
    }

    public final void EgCjBq0SZwJ(int i) {
        JlrlGoKF(4);
        IHQe1A4L2xu(i);
    }

    public final void F7NU4MC0GW(int i) {
        boolean z = AARZUJiTa;
        byte[] bArr = this.oh6vYeIP;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.F7NU4MC0GW;
                if (i2 == 0) {
                    this.F7NU4MC0GW = i3 + 1;
                    defpackage.al1.SH1y5HwkJhh(bArr, i3, (byte) i);
                    return;
                } else {
                    this.F7NU4MC0GW = i3 + 1;
                    defpackage.al1.SH1y5HwkJhh(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.F7NU4MC0GW;
                if (i4 == 0) {
                    this.F7NU4MC0GW = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.F7NU4MC0GW = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void G3OKOH3wZRC(defpackage.ra raVar) {
        v5iciZok(raVar.size());
        abhbClRa(raVar.xiZrDbcSW0, raVar.xiZrDbcSW0(), raVar.size());
    }

    public final void IHQe1A4L2xu(int i) {
        int i2 = this.F7NU4MC0GW;
        int i3 = i2 + 1;
        this.F7NU4MC0GW = i3;
        byte[] bArr = this.oh6vYeIP;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.F7NU4MC0GW = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.F7NU4MC0GW = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.F7NU4MC0GW = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void JlrlGoKF(int i) {
        if (this.r1MBDhnF - this.F7NU4MC0GW < i) {
            ez2rX8ReCYw();
        }
    }

    public final void NHJTzaLwkd(int i, defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5, defpackage.c51 c51Var) {
        UsuH8pd5P(i, 2);
        v5iciZok(qQUzIjv3iOC5.IHQe1A4L2xu(c51Var));
        c51Var.xiZrDbcSW0(qQUzIjv3iOC5, this.IHQe1A4L2xu);
    }

    public final void PAEGRtP0bX(int i) {
        if (i >= 0) {
            v5iciZok(i);
        } else {
            frpfPPIgqM9O(i);
        }
    }

    public final void QQUzIjv3iOC5(java.lang.String str, int i) {
        UsuH8pd5P(i, 2);
        C0U8sNJm(str);
    }

    public final void QoRHpC4k(int i, defpackage.ra raVar) {
        UsuH8pd5P(i, 2);
        G3OKOH3wZRC(raVar);
    }

    public final void SyNS6RMn(byte[] bArr, int i, int i2) {
        int i3 = this.F7NU4MC0GW;
        int i4 = this.r1MBDhnF;
        int i5 = i4 - i3;
        byte[] bArr2 = this.oh6vYeIP;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.F7NU4MC0GW += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.F7NU4MC0GW = i4;
        ez2rX8ReCYw();
        if (i7 > i4) {
            this.adDC3e2L.write(bArr, i6, i7);
        } else {
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.F7NU4MC0GW = i7;
        }
    }

    public final void UsuH8pd5P(int i, int i2) {
        v5iciZok((i << 3) | i2);
    }

    public final void V7bD7b8KA(int i, int i2) {
        JlrlGoKF(20);
        r1MBDhnF(i, 0);
        if (i2 >= 0) {
            F7NU4MC0GW(i2);
        } else {
            adDC3e2L(i2);
        }
    }

    public final void abhbClRa(byte[] bArr, int i, int i2) {
        SyNS6RMn(bArr, i, i2);
    }

    public final void adDC3e2L(long j) {
        boolean z = AARZUJiTa;
        byte[] bArr = this.oh6vYeIP;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.F7NU4MC0GW;
                if (j2 == 0) {
                    this.F7NU4MC0GW = i + 1;
                    defpackage.al1.SH1y5HwkJhh(bArr, i, (byte) j);
                    return;
                } else {
                    this.F7NU4MC0GW = i + 1;
                    defpackage.al1.SH1y5HwkJhh(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.F7NU4MC0GW;
                if (j3 == 0) {
                    this.F7NU4MC0GW = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.F7NU4MC0GW = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void cnag84Bm(int i, boolean z) {
        JlrlGoKF(11);
        r1MBDhnF(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.F7NU4MC0GW;
        this.F7NU4MC0GW = i2 + 1;
        this.oh6vYeIP[i2] = b;
    }

    public final void ez2rX8ReCYw() {
        this.adDC3e2L.write(this.oh6vYeIP, 0, this.F7NU4MC0GW);
        this.F7NU4MC0GW = 0;
    }

    public final void fnWB2E7cs(int i, long j) {
        JlrlGoKF(18);
        r1MBDhnF(i, 1);
        oh6vYeIP(j);
    }

    public final void frpfPPIgqM9O(long j) {
        JlrlGoKF(10);
        adDC3e2L(j);
    }

    public final void kNAkVymC(long j) {
        JlrlGoKF(8);
        oh6vYeIP(j);
    }

    public final void kd6TUFXn(int i, int i2) {
        JlrlGoKF(14);
        r1MBDhnF(i, 5);
        IHQe1A4L2xu(i2);
    }

    public final void nBH8hAHy(int i, int i2) {
        JlrlGoKF(20);
        r1MBDhnF(i, 0);
        F7NU4MC0GW(i2);
    }

    public final void oh6vYeIP(long j) {
        int i = this.F7NU4MC0GW;
        int i2 = i + 1;
        this.F7NU4MC0GW = i2;
        byte[] bArr = this.oh6vYeIP;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.F7NU4MC0GW = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.F7NU4MC0GW = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.F7NU4MC0GW = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.F7NU4MC0GW = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.F7NU4MC0GW = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.F7NU4MC0GW = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.F7NU4MC0GW = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void r1MBDhnF(int i, int i2) {
        F7NU4MC0GW((i << 3) | i2);
    }

    public final void v5iciZok(int i) {
        JlrlGoKF(5);
        F7NU4MC0GW(i);
    }
}
