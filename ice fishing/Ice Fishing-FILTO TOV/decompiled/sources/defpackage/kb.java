package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kb extends mb {
    public final byte[] AvO7iQsrTN;
    public int E7jCp8Ls;
    public int JFJ3QoxA;
    public int XnEVoBF0td1l = Integer.MAX_VALUE;
    public int encWxUiV2;
    public int mOu10nynGul;
    public final int rQPn8YBR;

    public kb(byte[] bArr, int i, int i2, boolean z) {
        this.AvO7iQsrTN = bArr;
        this.encWxUiV2 = i2 + i;
        this.JFJ3QoxA = i;
        this.rQPn8YBR = i;
    }

    public final long A1EKNP6CxJ() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.JFJ3QoxA;
            if (i2 == this.encWxUiV2) {
                throw w30.OOA6hdeuvCS();
            }
            this.JFJ3QoxA = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.AvO7iQsrTN[i2] & 128) == 0) {
                return j;
            }
        }
        throw w30.X1lG3V04pd();
    }

    public final long AEn1Rrio() {
        int i = this.JFJ3QoxA;
        if (this.encWxUiV2 - i < 8) {
            throw w30.OOA6hdeuvCS();
        }
        this.JFJ3QoxA = i + 8;
        byte[] bArr = this.AvO7iQsrTN;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final void DmJncFq5(int i) {
        if (i >= 0) {
            int i2 = this.encWxUiV2;
            int i3 = this.JFJ3QoxA;
            if (i <= i2 - i3) {
                this.JFJ3QoxA = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw w30.OOA6hdeuvCS();
        }
        throw w30.xqGvceK5x();
    }

    @Override // defpackage.mb
    public final c9 E7jCp8Ls() {
        byte[] bArr;
        int YZjbz8VdP5 = YZjbz8VdP5();
        byte[] bArr2 = this.AvO7iQsrTN;
        if (YZjbz8VdP5 > 0) {
            int i = this.encWxUiV2;
            int i2 = this.JFJ3QoxA;
            if (YZjbz8VdP5 <= i - i2) {
                c9 X1lG3V04pd = c9.X1lG3V04pd(bArr2, i2, YZjbz8VdP5);
                this.JFJ3QoxA += YZjbz8VdP5;
                return X1lG3V04pd;
            }
        }
        if (YZjbz8VdP5 == 0) {
            return c9.AvO7iQsrTN;
        }
        if (YZjbz8VdP5 > 0) {
            int i3 = this.encWxUiV2;
            int i4 = this.JFJ3QoxA;
            if (YZjbz8VdP5 <= i3 - i4) {
                int i5 = YZjbz8VdP5 + i4;
                this.JFJ3QoxA = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                c9 c9Var = c9.AvO7iQsrTN;
                return new c9(bArr);
            }
        }
        if (YZjbz8VdP5 > 0) {
            throw w30.OOA6hdeuvCS();
        }
        if (YZjbz8VdP5 != 0) {
            throw w30.xqGvceK5x();
        }
        bArr = i30.Yi7zF1RB1;
        c9 c9Var2 = c9.AvO7iQsrTN;
        return new c9(bArr);
    }

    @Override // defpackage.mb
    public final int JFJ3QoxA(int i) {
        if (i < 0) {
            throw w30.xqGvceK5x();
        }
        int X1lG3V04pd = X1lG3V04pd() + i;
        if (X1lG3V04pd < 0) {
            throw new w30("Failed to parse the message.");
        }
        int i2 = this.XnEVoBF0td1l;
        if (X1lG3V04pd > i2) {
            throw w30.OOA6hdeuvCS();
        }
        this.XnEVoBF0td1l = X1lG3V04pd;
        MZhzXH72();
        return i2;
    }

    @Override // defpackage.mb
    public final long M3K9sHhK() {
        return eUH21U3apd();
    }

    public final void MZhzXH72() {
        int i = this.encWxUiV2 + this.mOu10nynGul;
        this.encWxUiV2 = i;
        int i2 = i - this.rQPn8YBR;
        int i3 = this.XnEVoBF0td1l;
        if (i2 <= i3) {
            this.mOu10nynGul = 0;
            return;
        }
        int i4 = i2 - i3;
        this.mOu10nynGul = i4;
        this.encWxUiV2 = i - i4;
    }

    @Override // defpackage.mb
    public final int Mjvvu5DE() {
        return YZjbz8VdP5();
    }

    @Override // defpackage.mb
    public final long WIEu4Ya2g8() {
        return AEn1Rrio();
    }

    @Override // defpackage.mb
    public final String WRKkgoJXwDn() {
        int YZjbz8VdP5 = YZjbz8VdP5();
        if (YZjbz8VdP5 > 0) {
            int i = this.encWxUiV2;
            int i2 = this.JFJ3QoxA;
            if (YZjbz8VdP5 <= i - i2) {
                String YmKjaVtbfp5Z = gd1.GWasM1elztuh.YmKjaVtbfp5Z(this.AvO7iQsrTN, i2, YZjbz8VdP5);
                this.JFJ3QoxA += YZjbz8VdP5;
                return YmKjaVtbfp5Z;
            }
        }
        if (YZjbz8VdP5 == 0) {
            return "";
        }
        if (YZjbz8VdP5 <= 0) {
            throw w30.xqGvceK5x();
        }
        throw w30.OOA6hdeuvCS();
    }

    @Override // defpackage.mb
    public final String WdrkLMV3xh() {
        int YZjbz8VdP5 = YZjbz8VdP5();
        if (YZjbz8VdP5 > 0) {
            int i = this.encWxUiV2;
            int i2 = this.JFJ3QoxA;
            if (YZjbz8VdP5 <= i - i2) {
                String str = new String(this.AvO7iQsrTN, i2, YZjbz8VdP5, i30.GWasM1elztuh);
                this.JFJ3QoxA += YZjbz8VdP5;
                return str;
            }
        }
        if (YZjbz8VdP5 == 0) {
            return "";
        }
        if (YZjbz8VdP5 < 0) {
            throw w30.xqGvceK5x();
        }
        throw w30.OOA6hdeuvCS();
    }

    @Override // defpackage.mb
    public final int X1lG3V04pd() {
        return this.JFJ3QoxA - this.rQPn8YBR;
    }

    @Override // defpackage.mb
    public final double XnEVoBF0td1l() {
        return Double.longBitsToDouble(AEn1Rrio());
    }

    @Override // defpackage.mb
    public final long Y6hRI1cF8() {
        return AEn1Rrio();
    }

    public final int YZjbz8VdP5() {
        int i;
        int i2 = this.JFJ3QoxA;
        int i3 = this.encWxUiV2;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.AvO7iQsrTN;
            byte b = bArr[i2];
            if (b >= 0) {
                this.JFJ3QoxA = i4;
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
                this.JFJ3QoxA = i5;
                return i;
            }
        }
        return (int) A1EKNP6CxJ();
    }

    @Override // defpackage.mb
    public final void Yi7zF1RB1(int i) {
        if (this.E7jCp8Ls != i) {
            throw new w30("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.mb
    public final float YmKjaVtbfp5Z() {
        return Float.intBitsToFloat(ozMwhSAI());
    }

    @Override // defpackage.mb
    public final int arNh8D4Z5gB() {
        if (xqGvceK5x()) {
            this.E7jCp8Ls = 0;
            return 0;
        }
        int YZjbz8VdP5 = YZjbz8VdP5();
        this.E7jCp8Ls = YZjbz8VdP5;
        if ((YZjbz8VdP5 >>> 3) != 0) {
            return YZjbz8VdP5;
        }
        throw new w30("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.mb
    public final int cilMamHF() {
        int YZjbz8VdP5 = YZjbz8VdP5();
        return (-(YZjbz8VdP5 & 1)) ^ (YZjbz8VdP5 >>> 1);
    }

    public final long eUH21U3apd() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.JFJ3QoxA;
        int i2 = this.encWxUiV2;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.AvO7iQsrTN;
            byte b = bArr[i];
            if (b >= 0) {
                this.JFJ3QoxA = i3;
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
                this.JFJ3QoxA = i4;
                return j;
            }
        }
        return A1EKNP6CxJ();
    }

    @Override // defpackage.mb
    public final int iwATDS1i01k() {
        return ozMwhSAI();
    }

    @Override // defpackage.mb
    public final int jivtDDk9H() {
        return ozMwhSAI();
    }

    @Override // defpackage.mb
    public final boolean k8h8IjolWQ(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                DmJncFq5(8);
                return true;
            }
            if (i2 == 2) {
                DmJncFq5(YZjbz8VdP5());
                return true;
            }
            if (i2 == 3) {
                EXrPz3p7hFb();
                Yi7zF1RB1(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw w30.Yi7zF1RB1();
            }
            DmJncFq5(4);
            return true;
        }
        int i4 = this.encWxUiV2 - this.JFJ3QoxA;
        byte[] bArr = this.AvO7iQsrTN;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.JFJ3QoxA;
                this.JFJ3QoxA = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw w30.X1lG3V04pd();
        }
        while (i3 < 10) {
            int i6 = this.JFJ3QoxA;
            if (i6 == this.encWxUiV2) {
                throw w30.OOA6hdeuvCS();
            }
            this.JFJ3QoxA = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw w30.X1lG3V04pd();
        return true;
    }

    @Override // defpackage.mb
    public final long lv06NcmrQ() {
        long eUH21U3apd = eUH21U3apd();
        return (-(eUH21U3apd & 1)) ^ (eUH21U3apd >>> 1);
    }

    @Override // defpackage.mb
    public final long mE4lRynR() {
        return eUH21U3apd();
    }

    @Override // defpackage.mb
    public final void mOu10nynGul(int i) {
        this.XnEVoBF0td1l = i;
        MZhzXH72();
    }

    public final int ozMwhSAI() {
        int i = this.JFJ3QoxA;
        if (this.encWxUiV2 - i < 4) {
            throw w30.OOA6hdeuvCS();
        }
        this.JFJ3QoxA = i + 4;
        byte[] bArr = this.AvO7iQsrTN;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.mb
    public final int pog2g9KITJA() {
        return YZjbz8VdP5();
    }

    @Override // defpackage.mb
    public final boolean rQPn8YBR() {
        return eUH21U3apd() != 0;
    }

    @Override // defpackage.mb
    public final int uFEq9NpZ() {
        return YZjbz8VdP5();
    }

    @Override // defpackage.mb
    public final boolean xqGvceK5x() {
        return this.JFJ3QoxA == this.encWxUiV2;
    }
}
