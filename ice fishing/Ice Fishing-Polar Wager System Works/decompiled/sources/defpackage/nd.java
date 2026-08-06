package defpackage;

/* loaded from: classes.dex */
public final class nd extends defpackage.od {
    public final java.io.FileInputStream AARZUJiTa;
    public int DFo87pBq1E5;
    public final byte[] EXtogiMhuM;
    public int JlrlGoKF;
    public int SH1y5HwkJhh;
    public int SyNS6RMn = Integer.MAX_VALUE;
    public int ez2rX8ReCYw;
    public int riuEU0zW4;

    public nd(java.io.FileInputStream fileInputStream) {
        java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
        this.AARZUJiTa = fileInputStream;
        this.EXtogiMhuM = new byte[4096];
        this.riuEU0zW4 = 0;
        this.ez2rX8ReCYw = 0;
        this.DFo87pBq1E5 = 0;
    }

    @Override // defpackage.od
    public final int C0U8sNJm() {
        return wll2JLbTBC2();
    }

    public final byte[] D2vUnMij(int i) {
        byte[] frpfPPIgqM9O = frpfPPIgqM9O(i);
        if (frpfPPIgqM9O != null) {
            return frpfPPIgqM9O;
        }
        int i2 = this.ez2rX8ReCYw;
        int i3 = this.riuEU0zW4;
        int i4 = i3 - i2;
        this.DFo87pBq1E5 += i3;
        this.ez2rX8ReCYw = 0;
        this.riuEU0zW4 = 0;
        java.util.ArrayList SiPhmbmu = SiPhmbmu(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.EXtogiMhuM, i2, bArr, 0, i4);
        int size = SiPhmbmu.size();
        int i5 = 0;
        while (i5 < size) {
            java.lang.Object obj = SiPhmbmu.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.od
    public final double DFo87pBq1E5() {
        return java.lang.Double.longBitsToDouble(yIx6ChFVk());
    }

    @Override // defpackage.od
    public final long EgCjBq0SZwJ() {
        return XZx205DYe();
    }

    @Override // defpackage.od
    public final boolean F7NU4MC0GW() {
        return this.ez2rX8ReCYw == this.riuEU0zW4 && !hkbnNdmy(1);
    }

    @Override // defpackage.od
    public final float G3OKOH3wZRC() {
        return java.lang.Float.intBitsToFloat(p4kuH6PDtgom());
    }

    @Override // defpackage.od
    public final defpackage.ra JlrlGoKF() {
        int wll2JLbTBC2 = wll2JLbTBC2();
        int i = this.riuEU0zW4;
        int i2 = this.ez2rX8ReCYw;
        int i3 = i - i2;
        byte[] bArr = this.EXtogiMhuM;
        if (wll2JLbTBC2 <= i3 && wll2JLbTBC2 > 0) {
            defpackage.ra r1MBDhnF = defpackage.ra.r1MBDhnF(bArr, i2, wll2JLbTBC2);
            this.ez2rX8ReCYw += wll2JLbTBC2;
            return r1MBDhnF;
        }
        if (wll2JLbTBC2 == 0) {
            return defpackage.ra.AARZUJiTa;
        }
        if (wll2JLbTBC2 < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        byte[] frpfPPIgqM9O = frpfPPIgqM9O(wll2JLbTBC2);
        if (frpfPPIgqM9O != null) {
            return defpackage.ra.r1MBDhnF(frpfPPIgqM9O, 0, frpfPPIgqM9O.length);
        }
        int i4 = this.ez2rX8ReCYw;
        int i5 = this.riuEU0zW4;
        int i6 = i5 - i4;
        this.DFo87pBq1E5 += i5;
        this.ez2rX8ReCYw = 0;
        this.riuEU0zW4 = 0;
        java.util.ArrayList SiPhmbmu = SiPhmbmu(wll2JLbTBC2 - i6);
        byte[] bArr2 = new byte[wll2JLbTBC2];
        java.lang.System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = SiPhmbmu.size();
        int i7 = 0;
        while (i7 < size) {
            java.lang.Object obj = SiPhmbmu.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            java.lang.System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        defpackage.ra raVar = defpackage.ra.AARZUJiTa;
        return new defpackage.ra(bArr2);
    }

    @Override // defpackage.od
    public final java.lang.String NHJTzaLwkd() {
        int wll2JLbTBC2 = wll2JLbTBC2();
        int i = this.ez2rX8ReCYw;
        int i2 = this.riuEU0zW4;
        int i3 = i2 - i;
        byte[] bArr = this.EXtogiMhuM;
        if (wll2JLbTBC2 <= i3 && wll2JLbTBC2 > 0) {
            this.ez2rX8ReCYw = i + wll2JLbTBC2;
        } else {
            if (wll2JLbTBC2 == 0) {
                return "";
            }
            if (wll2JLbTBC2 < 0) {
                throw defpackage.g80.F7NU4MC0GW();
            }
            i = 0;
            if (wll2JLbTBC2 <= i2) {
                Uv8CGu3G(wll2JLbTBC2);
                this.ez2rX8ReCYw = wll2JLbTBC2;
            } else {
                bArr = D2vUnMij(wll2JLbTBC2);
            }
        }
        return defpackage.jl1.IHQe1A4L2xu.QoRHpC4k(bArr, i, wll2JLbTBC2);
    }

    @Override // defpackage.od
    public final long PAEGRtP0bX() {
        long XZx205DYe = XZx205DYe();
        return (-(XZx205DYe & 1)) ^ (XZx205DYe >>> 1);
    }

    @Override // defpackage.od
    public final int QQUzIjv3iOC5() {
        if (F7NU4MC0GW()) {
            this.JlrlGoKF = 0;
            return 0;
        }
        int wll2JLbTBC2 = wll2JLbTBC2();
        this.JlrlGoKF = wll2JLbTBC2;
        if ((wll2JLbTBC2 >>> 3) != 0) {
            return wll2JLbTBC2;
        }
        throw new defpackage.g80("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.od
    public final long QoRHpC4k() {
        return yIx6ChFVk();
    }

    @Override // defpackage.od
    public final int SH1y5HwkJhh(int i) {
        if (i < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        int i2 = this.DFo87pBq1E5 + this.ez2rX8ReCYw + i;
        if (i2 < 0) {
            throw new defpackage.g80("Failed to parse the message.");
        }
        int i3 = this.SyNS6RMn;
        if (i2 > i3) {
            throw defpackage.g80.adDC3e2L();
        }
        this.SyNS6RMn = i2;
        hyxIchWRW();
        return i3;
    }

    public final java.util.ArrayList SiPhmbmu(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int min = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.AARZUJiTa.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw defpackage.g80.adDC3e2L();
                }
                this.DFo87pBq1E5 += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.od
    public final int SyNS6RMn() {
        return wll2JLbTBC2();
    }

    @Override // defpackage.od
    public final long UsuH8pd5P() {
        return XZx205DYe();
    }

    public final void Uv8CGu3G(int i) {
        if (hkbnNdmy(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.DFo87pBq1E5) - this.ez2rX8ReCYw) {
            throw defpackage.g80.adDC3e2L();
        }
        throw new defpackage.g80("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // defpackage.od
    public final int V7bD7b8KA() {
        int wll2JLbTBC2 = wll2JLbTBC2();
        return (-(wll2JLbTBC2 & 1)) ^ (wll2JLbTBC2 >>> 1);
    }

    public final long XZx205DYe() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.ez2rX8ReCYw;
        int i2 = this.riuEU0zW4;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.EXtogiMhuM;
            byte b = bArr[i];
            if (b >= 0) {
                this.ez2rX8ReCYw = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.ez2rX8ReCYw = i4;
                return j;
            }
        }
        return mAr5m2L7gYDP();
    }

    @Override // defpackage.od
    public final java.lang.String abhbClRa() {
        int wll2JLbTBC2 = wll2JLbTBC2();
        byte[] bArr = this.EXtogiMhuM;
        if (wll2JLbTBC2 > 0) {
            int i = this.riuEU0zW4;
            int i2 = this.ez2rX8ReCYw;
            if (wll2JLbTBC2 <= i - i2) {
                java.lang.String str = new java.lang.String(bArr, i2, wll2JLbTBC2, defpackage.q70.IHQe1A4L2xu);
                this.ez2rX8ReCYw += wll2JLbTBC2;
                return str;
            }
        }
        if (wll2JLbTBC2 == 0) {
            return "";
        }
        if (wll2JLbTBC2 < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        if (wll2JLbTBC2 > this.riuEU0zW4) {
            return new java.lang.String(D2vUnMij(wll2JLbTBC2), defpackage.q70.IHQe1A4L2xu);
        }
        Uv8CGu3G(wll2JLbTBC2);
        java.lang.String str2 = new java.lang.String(bArr, this.ez2rX8ReCYw, wll2JLbTBC2, defpackage.q70.IHQe1A4L2xu);
        this.ez2rX8ReCYw += wll2JLbTBC2;
        return str2;
    }

    @Override // defpackage.od
    public final int cnag84Bm() {
        return p4kuH6PDtgom();
    }

    @Override // defpackage.od
    public final boolean ez2rX8ReCYw() {
        return XZx205DYe() != 0;
    }

    @Override // defpackage.od
    public final int fnWB2E7cs() {
        return p4kuH6PDtgom();
    }

    public final byte[] frpfPPIgqM9O(int i) {
        if (i == 0) {
            return defpackage.q70.oh6vYeIP;
        }
        if (i < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        int i2 = this.DFo87pBq1E5;
        int i3 = this.ez2rX8ReCYw;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new defpackage.g80("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.SyNS6RMn;
        if (i4 > i5) {
            lpprD5VAS((i5 - i2) - i3);
            throw defpackage.g80.adDC3e2L();
        }
        int i6 = this.riuEU0zW4 - i3;
        int i7 = i - i6;
        java.io.FileInputStream fileInputStream = this.AARZUJiTa;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (defpackage.g80 e) {
                e.adDC3e2L = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.EXtogiMhuM, this.ez2rX8ReCYw, bArr, 0, i6);
        this.DFo87pBq1E5 += this.riuEU0zW4;
        this.ez2rX8ReCYw = 0;
        this.riuEU0zW4 = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw defpackage.g80.adDC3e2L();
                }
                this.DFo87pBq1E5 += read;
                i6 += read;
            } catch (defpackage.g80 e2) {
                e2.adDC3e2L = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final boolean hkbnNdmy(int i) {
        java.io.FileInputStream fileInputStream = this.AARZUJiTa;
        int i2 = this.ez2rX8ReCYw;
        int i3 = i2 + i;
        int i4 = this.riuEU0zW4;
        if (i3 <= i4) {
            defpackage.db.AARZUJiTa(defpackage.fx0.riuEU0zW4(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.DFo87pBq1E5;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.SyNS6RMn) {
            byte[] bArr = this.EXtogiMhuM;
            if (i2 > 0) {
                if (i4 > i2) {
                    java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.DFo87pBq1E5 += i2;
                this.riuEU0zW4 -= i2;
                this.ez2rX8ReCYw = 0;
            }
            int i6 = this.riuEU0zW4;
            try {
                int read = fileInputStream.read(bArr, i6, java.lang.Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.DFo87pBq1E5) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new java.lang.IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.riuEU0zW4 += read;
                    hyxIchWRW();
                    if (this.riuEU0zW4 >= i) {
                        return true;
                    }
                    return hkbnNdmy(i);
                }
            } catch (defpackage.g80 e) {
                e.adDC3e2L = true;
                throw e;
            }
        }
        return false;
    }

    public final void hyxIchWRW() {
        int i = this.riuEU0zW4 + this.SH1y5HwkJhh;
        this.riuEU0zW4 = i;
        int i2 = this.DFo87pBq1E5 + i;
        int i3 = this.SyNS6RMn;
        if (i2 <= i3) {
            this.SH1y5HwkJhh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.SH1y5HwkJhh = i4;
        this.riuEU0zW4 = i - i4;
    }

    @Override // defpackage.od
    public final long kNAkVymC() {
        return yIx6ChFVk();
    }

    @Override // defpackage.od
    public final int kd6TUFXn() {
        return wll2JLbTBC2();
    }

    public final void lpprD5VAS(int i) {
        int i2 = this.riuEU0zW4;
        int i3 = this.ez2rX8ReCYw;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.ez2rX8ReCYw = i3 + i;
            return;
        }
        java.io.FileInputStream fileInputStream = this.AARZUJiTa;
        if (i < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        int i5 = this.DFo87pBq1E5;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.SyNS6RMn;
        if (i7 > i8) {
            lpprD5VAS((i8 - i5) - i3);
            throw defpackage.g80.adDC3e2L();
        }
        this.DFo87pBq1E5 = i6;
        this.riuEU0zW4 = 0;
        this.ez2rX8ReCYw = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new java.lang.IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (defpackage.g80 e) {
                    e.adDC3e2L = true;
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                this.DFo87pBq1E5 += i4;
                hyxIchWRW();
                throw th;
            }
        }
        this.DFo87pBq1E5 += i4;
        hyxIchWRW();
        if (i4 >= i) {
            return;
        }
        int i9 = this.riuEU0zW4;
        int i10 = i9 - this.ez2rX8ReCYw;
        this.ez2rX8ReCYw = i9;
        Uv8CGu3G(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.riuEU0zW4;
            if (i11 <= i12) {
                this.ez2rX8ReCYw = i11;
                return;
            } else {
                i10 += i12;
                this.ez2rX8ReCYw = i12;
                Uv8CGu3G(1);
            }
        }
    }

    public final long mAr5m2L7gYDP() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.ez2rX8ReCYw == this.riuEU0zW4) {
                Uv8CGu3G(1);
            }
            int i2 = this.ez2rX8ReCYw;
            this.ez2rX8ReCYw = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.EXtogiMhuM[i2] & 128) == 0) {
                return j;
            }
        }
        throw defpackage.g80.r1MBDhnF();
    }

    @Override // defpackage.od
    public final boolean nBH8hAHy(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                lpprD5VAS(8);
                return true;
            }
            if (i2 == 2) {
                lpprD5VAS(wll2JLbTBC2());
                return true;
            }
            if (i2 == 3) {
                v5iciZok();
                oh6vYeIP(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw defpackage.g80.oh6vYeIP();
            }
            lpprD5VAS(4);
            return true;
        }
        int i4 = this.riuEU0zW4 - this.ez2rX8ReCYw;
        byte[] bArr = this.EXtogiMhuM;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.ez2rX8ReCYw;
                this.ez2rX8ReCYw = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw defpackage.g80.r1MBDhnF();
        }
        while (i3 < 10) {
            if (this.ez2rX8ReCYw == this.riuEU0zW4) {
                Uv8CGu3G(1);
            }
            int i6 = this.ez2rX8ReCYw;
            this.ez2rX8ReCYw = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw defpackage.g80.r1MBDhnF();
        return true;
    }

    @Override // defpackage.od
    public final void oh6vYeIP(int i) {
        if (this.JlrlGoKF != i) {
            throw new defpackage.g80("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int p4kuH6PDtgom() {
        int i = this.ez2rX8ReCYw;
        if (this.riuEU0zW4 - i < 4) {
            Uv8CGu3G(4);
            i = this.ez2rX8ReCYw;
        }
        this.ez2rX8ReCYw = i + 4;
        byte[] bArr = this.EXtogiMhuM;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.od
    public final int r1MBDhnF() {
        return this.DFo87pBq1E5 + this.ez2rX8ReCYw;
    }

    @Override // defpackage.od
    public final void riuEU0zW4(int i) {
        this.SyNS6RMn = i;
        hyxIchWRW();
    }

    public final int wll2JLbTBC2() {
        int i;
        int i2 = this.ez2rX8ReCYw;
        int i3 = this.riuEU0zW4;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.EXtogiMhuM;
            byte b = bArr[i2];
            if (b >= 0) {
                this.ez2rX8ReCYw = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.ez2rX8ReCYw = i5;
                return i;
            }
        }
        return (int) mAr5m2L7gYDP();
    }

    public final long yIx6ChFVk() {
        int i = this.ez2rX8ReCYw;
        if (this.riuEU0zW4 - i < 8) {
            Uv8CGu3G(8);
            i = this.ez2rX8ReCYw;
        }
        this.ez2rX8ReCYw = i + 8;
        byte[] bArr = this.EXtogiMhuM;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
