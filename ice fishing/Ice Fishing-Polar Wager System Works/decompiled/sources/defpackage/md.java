package defpackage;

/* loaded from: classes.dex */
public final class md extends defpackage.od {
    public final byte[] AARZUJiTa;
    public int DFo87pBq1E5 = Integer.MAX_VALUE;
    public int EXtogiMhuM;
    public int JlrlGoKF;
    public int SH1y5HwkJhh;
    public final int ez2rX8ReCYw;
    public int riuEU0zW4;

    public md(byte[] bArr, int i, int i2, boolean z) {
        this.AARZUJiTa = bArr;
        this.EXtogiMhuM = i2 + i;
        this.SH1y5HwkJhh = i;
        this.ez2rX8ReCYw = i;
    }

    @Override // defpackage.od
    public final int C0U8sNJm() {
        return SiPhmbmu();
    }

    public final int D2vUnMij() {
        int i = this.SH1y5HwkJhh;
        if (this.EXtogiMhuM - i < 4) {
            throw defpackage.g80.adDC3e2L();
        }
        this.SH1y5HwkJhh = i + 4;
        byte[] bArr = this.AARZUJiTa;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.od
    public final double DFo87pBq1E5() {
        return java.lang.Double.longBitsToDouble(frpfPPIgqM9O());
    }

    @Override // defpackage.od
    public final long EgCjBq0SZwJ() {
        return p4kuH6PDtgom();
    }

    @Override // defpackage.od
    public final boolean F7NU4MC0GW() {
        return this.SH1y5HwkJhh == this.EXtogiMhuM;
    }

    @Override // defpackage.od
    public final float G3OKOH3wZRC() {
        return java.lang.Float.intBitsToFloat(D2vUnMij());
    }

    @Override // defpackage.od
    public final defpackage.ra JlrlGoKF() {
        byte[] bArr;
        int SiPhmbmu = SiPhmbmu();
        byte[] bArr2 = this.AARZUJiTa;
        if (SiPhmbmu > 0) {
            int i = this.EXtogiMhuM;
            int i2 = this.SH1y5HwkJhh;
            if (SiPhmbmu <= i - i2) {
                defpackage.ra r1MBDhnF = defpackage.ra.r1MBDhnF(bArr2, i2, SiPhmbmu);
                this.SH1y5HwkJhh += SiPhmbmu;
                return r1MBDhnF;
            }
        }
        if (SiPhmbmu == 0) {
            return defpackage.ra.AARZUJiTa;
        }
        if (SiPhmbmu > 0) {
            int i3 = this.EXtogiMhuM;
            int i4 = this.SH1y5HwkJhh;
            if (SiPhmbmu <= i3 - i4) {
                int i5 = SiPhmbmu + i4;
                this.SH1y5HwkJhh = i5;
                bArr = java.util.Arrays.copyOfRange(bArr2, i4, i5);
                defpackage.ra raVar = defpackage.ra.AARZUJiTa;
                return new defpackage.ra(bArr);
            }
        }
        if (SiPhmbmu > 0) {
            throw defpackage.g80.adDC3e2L();
        }
        if (SiPhmbmu != 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        bArr = defpackage.q70.oh6vYeIP;
        defpackage.ra raVar2 = defpackage.ra.AARZUJiTa;
        return new defpackage.ra(bArr);
    }

    @Override // defpackage.od
    public final java.lang.String NHJTzaLwkd() {
        int SiPhmbmu = SiPhmbmu();
        if (SiPhmbmu > 0) {
            int i = this.EXtogiMhuM;
            int i2 = this.SH1y5HwkJhh;
            if (SiPhmbmu <= i - i2) {
                java.lang.String QoRHpC4k = defpackage.jl1.IHQe1A4L2xu.QoRHpC4k(this.AARZUJiTa, i2, SiPhmbmu);
                this.SH1y5HwkJhh += SiPhmbmu;
                return QoRHpC4k;
            }
        }
        if (SiPhmbmu == 0) {
            return "";
        }
        if (SiPhmbmu <= 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        throw defpackage.g80.adDC3e2L();
    }

    @Override // defpackage.od
    public final long PAEGRtP0bX() {
        long p4kuH6PDtgom = p4kuH6PDtgom();
        return (-(p4kuH6PDtgom & 1)) ^ (p4kuH6PDtgom >>> 1);
    }

    @Override // defpackage.od
    public final int QQUzIjv3iOC5() {
        if (F7NU4MC0GW()) {
            this.JlrlGoKF = 0;
            return 0;
        }
        int SiPhmbmu = SiPhmbmu();
        this.JlrlGoKF = SiPhmbmu;
        if ((SiPhmbmu >>> 3) != 0) {
            return SiPhmbmu;
        }
        throw new defpackage.g80("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.od
    public final long QoRHpC4k() {
        return frpfPPIgqM9O();
    }

    @Override // defpackage.od
    public final int SH1y5HwkJhh(int i) {
        if (i < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        int r1MBDhnF = r1MBDhnF() + i;
        if (r1MBDhnF < 0) {
            throw new defpackage.g80("Failed to parse the message.");
        }
        int i2 = this.DFo87pBq1E5;
        if (r1MBDhnF > i2) {
            throw defpackage.g80.adDC3e2L();
        }
        this.DFo87pBq1E5 = r1MBDhnF;
        wll2JLbTBC2();
        return i2;
    }

    public final int SiPhmbmu() {
        int i;
        int i2 = this.SH1y5HwkJhh;
        int i3 = this.EXtogiMhuM;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.AARZUJiTa;
            byte b = bArr[i2];
            if (b >= 0) {
                this.SH1y5HwkJhh = i4;
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
                this.SH1y5HwkJhh = i5;
                return i;
            }
        }
        return (int) yIx6ChFVk();
    }

    @Override // defpackage.od
    public final int SyNS6RMn() {
        return SiPhmbmu();
    }

    @Override // defpackage.od
    public final long UsuH8pd5P() {
        return p4kuH6PDtgom();
    }

    @Override // defpackage.od
    public final int V7bD7b8KA() {
        int SiPhmbmu = SiPhmbmu();
        return (-(SiPhmbmu & 1)) ^ (SiPhmbmu >>> 1);
    }

    public final void XZx205DYe(int i) {
        if (i >= 0) {
            int i2 = this.EXtogiMhuM;
            int i3 = this.SH1y5HwkJhh;
            if (i <= i2 - i3) {
                this.SH1y5HwkJhh = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw defpackage.g80.adDC3e2L();
        }
        throw defpackage.g80.F7NU4MC0GW();
    }

    @Override // defpackage.od
    public final java.lang.String abhbClRa() {
        int SiPhmbmu = SiPhmbmu();
        if (SiPhmbmu > 0) {
            int i = this.EXtogiMhuM;
            int i2 = this.SH1y5HwkJhh;
            if (SiPhmbmu <= i - i2) {
                java.lang.String str = new java.lang.String(this.AARZUJiTa, i2, SiPhmbmu, defpackage.q70.IHQe1A4L2xu);
                this.SH1y5HwkJhh += SiPhmbmu;
                return str;
            }
        }
        if (SiPhmbmu == 0) {
            return "";
        }
        if (SiPhmbmu < 0) {
            throw defpackage.g80.F7NU4MC0GW();
        }
        throw defpackage.g80.adDC3e2L();
    }

    @Override // defpackage.od
    public final int cnag84Bm() {
        return D2vUnMij();
    }

    @Override // defpackage.od
    public final boolean ez2rX8ReCYw() {
        return p4kuH6PDtgom() != 0;
    }

    @Override // defpackage.od
    public final int fnWB2E7cs() {
        return D2vUnMij();
    }

    public final long frpfPPIgqM9O() {
        int i = this.SH1y5HwkJhh;
        if (this.EXtogiMhuM - i < 8) {
            throw defpackage.g80.adDC3e2L();
        }
        this.SH1y5HwkJhh = i + 8;
        byte[] bArr = this.AARZUJiTa;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.od
    public final long kNAkVymC() {
        return frpfPPIgqM9O();
    }

    @Override // defpackage.od
    public final int kd6TUFXn() {
        return SiPhmbmu();
    }

    @Override // defpackage.od
    public final boolean nBH8hAHy(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                XZx205DYe(8);
                return true;
            }
            if (i2 == 2) {
                XZx205DYe(SiPhmbmu());
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
            XZx205DYe(4);
            return true;
        }
        int i4 = this.EXtogiMhuM - this.SH1y5HwkJhh;
        byte[] bArr = this.AARZUJiTa;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.SH1y5HwkJhh;
                this.SH1y5HwkJhh = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw defpackage.g80.r1MBDhnF();
        }
        while (i3 < 10) {
            int i6 = this.SH1y5HwkJhh;
            if (i6 == this.EXtogiMhuM) {
                throw defpackage.g80.adDC3e2L();
            }
            this.SH1y5HwkJhh = i6 + 1;
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

    public final long p4kuH6PDtgom() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.SH1y5HwkJhh;
        int i2 = this.EXtogiMhuM;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.AARZUJiTa;
            byte b = bArr[i];
            if (b >= 0) {
                this.SH1y5HwkJhh = i3;
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
                this.SH1y5HwkJhh = i4;
                return j;
            }
        }
        return yIx6ChFVk();
    }

    @Override // defpackage.od
    public final int r1MBDhnF() {
        return this.SH1y5HwkJhh - this.ez2rX8ReCYw;
    }

    @Override // defpackage.od
    public final void riuEU0zW4(int i) {
        this.DFo87pBq1E5 = i;
        wll2JLbTBC2();
    }

    public final void wll2JLbTBC2() {
        int i = this.EXtogiMhuM + this.riuEU0zW4;
        this.EXtogiMhuM = i;
        int i2 = i - this.ez2rX8ReCYw;
        int i3 = this.DFo87pBq1E5;
        if (i2 <= i3) {
            this.riuEU0zW4 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.riuEU0zW4 = i4;
        this.EXtogiMhuM = i - i4;
    }

    public final long yIx6ChFVk() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.SH1y5HwkJhh;
            if (i2 == this.EXtogiMhuM) {
                throw defpackage.g80.adDC3e2L();
            }
            this.SH1y5HwkJhh = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.AARZUJiTa[i2] & 128) == 0) {
                return j;
            }
        }
        throw defpackage.g80.r1MBDhnF();
    }
}
