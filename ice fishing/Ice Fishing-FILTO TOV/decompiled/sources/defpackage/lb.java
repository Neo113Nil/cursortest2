package defpackage;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lb extends mb {
    public final FileInputStream AvO7iQsrTN;
    public int E7jCp8Ls;
    public int JFJ3QoxA;
    public int XnEVoBF0td1l;
    public final byte[] encWxUiV2;
    public int mOu10nynGul;
    public int rQPn8YBR;
    public int uFEq9NpZ = Integer.MAX_VALUE;

    public lb(FileInputStream fileInputStream) {
        Charset charset = i30.GWasM1elztuh;
        this.AvO7iQsrTN = fileInputStream;
        this.encWxUiV2 = new byte[4096];
        this.mOu10nynGul = 0;
        this.rQPn8YBR = 0;
        this.XnEVoBF0td1l = 0;
    }

    public final long A1EKNP6CxJ() {
        int i = this.rQPn8YBR;
        if (this.mOu10nynGul - i < 8) {
            TpUsjqg3bxO(8);
            i = this.rQPn8YBR;
        }
        this.rQPn8YBR = i + 8;
        byte[] bArr = this.encWxUiV2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final byte[] AEn1Rrio(int i) {
        if (i == 0) {
            return i30.Yi7zF1RB1;
        }
        if (i < 0) {
            throw w30.xqGvceK5x();
        }
        int i2 = this.XnEVoBF0td1l;
        int i3 = this.rQPn8YBR;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new w30("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.uFEq9NpZ;
        if (i4 > i5) {
            dqB83aoLBB((i5 - i2) - i3);
            throw w30.OOA6hdeuvCS();
        }
        int i6 = this.mOu10nynGul - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.AvO7iQsrTN;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (w30 e) {
                e.OOA6hdeuvCS = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.encWxUiV2, this.rQPn8YBR, bArr, 0, i6);
        this.XnEVoBF0td1l += this.mOu10nynGul;
        this.rQPn8YBR = 0;
        this.mOu10nynGul = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw w30.OOA6hdeuvCS();
                }
                this.XnEVoBF0td1l += read;
                i6 += read;
            } catch (w30 e2) {
                e2.OOA6hdeuvCS = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final long DmJncFq5() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.rQPn8YBR;
        int i2 = this.mOu10nynGul;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.encWxUiV2;
            byte b = bArr[i];
            if (b >= 0) {
                this.rQPn8YBR = i3;
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
                this.rQPn8YBR = i4;
                return j;
            }
        }
        return HFYAaqMd6();
    }

    @Override // defpackage.mb
    public final c9 E7jCp8Ls() {
        int MZhzXH72 = MZhzXH72();
        int i = this.mOu10nynGul;
        int i2 = this.rQPn8YBR;
        int i3 = i - i2;
        byte[] bArr = this.encWxUiV2;
        if (MZhzXH72 <= i3 && MZhzXH72 > 0) {
            c9 X1lG3V04pd = c9.X1lG3V04pd(bArr, i2, MZhzXH72);
            this.rQPn8YBR += MZhzXH72;
            return X1lG3V04pd;
        }
        if (MZhzXH72 == 0) {
            return c9.AvO7iQsrTN;
        }
        if (MZhzXH72 < 0) {
            throw w30.xqGvceK5x();
        }
        byte[] AEn1Rrio = AEn1Rrio(MZhzXH72);
        if (AEn1Rrio != null) {
            return c9.X1lG3V04pd(AEn1Rrio, 0, AEn1Rrio.length);
        }
        int i4 = this.rQPn8YBR;
        int i5 = this.mOu10nynGul;
        int i6 = i5 - i4;
        this.XnEVoBF0td1l += i5;
        this.rQPn8YBR = 0;
        this.mOu10nynGul = 0;
        ArrayList YZjbz8VdP5 = YZjbz8VdP5(MZhzXH72 - i6);
        byte[] bArr2 = new byte[MZhzXH72];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = YZjbz8VdP5.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = YZjbz8VdP5.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        c9 c9Var = c9.AvO7iQsrTN;
        return new c9(bArr2);
    }

    public final long HFYAaqMd6() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.rQPn8YBR == this.mOu10nynGul) {
                TpUsjqg3bxO(1);
            }
            int i2 = this.rQPn8YBR;
            this.rQPn8YBR = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.encWxUiV2[i2] & 128) == 0) {
                return j;
            }
        }
        throw w30.X1lG3V04pd();
    }

    @Override // defpackage.mb
    public final int JFJ3QoxA(int i) {
        if (i < 0) {
            throw w30.xqGvceK5x();
        }
        int i2 = this.XnEVoBF0td1l + this.rQPn8YBR + i;
        if (i2 < 0) {
            throw new w30("Failed to parse the message.");
        }
        int i3 = this.uFEq9NpZ;
        if (i2 > i3) {
            throw w30.OOA6hdeuvCS();
        }
        this.uFEq9NpZ = i2;
        rezfBrjOrqK();
        return i3;
    }

    @Override // defpackage.mb
    public final long M3K9sHhK() {
        return DmJncFq5();
    }

    public final int MZhzXH72() {
        int i;
        int i2 = this.rQPn8YBR;
        int i3 = this.mOu10nynGul;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.encWxUiV2;
            byte b = bArr[i2];
            if (b >= 0) {
                this.rQPn8YBR = i4;
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
                this.rQPn8YBR = i5;
                return i;
            }
        }
        return (int) HFYAaqMd6();
    }

    @Override // defpackage.mb
    public final int Mjvvu5DE() {
        return MZhzXH72();
    }

    public final void TpUsjqg3bxO(int i) {
        if (VeqTn1PQw7(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.XnEVoBF0td1l) - this.rQPn8YBR) {
            throw w30.OOA6hdeuvCS();
        }
        throw new w30("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean VeqTn1PQw7(int i) {
        FileInputStream fileInputStream = this.AvO7iQsrTN;
        int i2 = this.rQPn8YBR;
        int i3 = i2 + i;
        int i4 = this.mOu10nynGul;
        if (i3 <= i4) {
            o4.jivtDDk9H(mr0.encWxUiV2("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.XnEVoBF0td1l;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.uFEq9NpZ) {
            byte[] bArr = this.encWxUiV2;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.XnEVoBF0td1l += i2;
                this.mOu10nynGul -= i2;
                this.rQPn8YBR = 0;
            }
            int i6 = this.mOu10nynGul;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.XnEVoBF0td1l) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.mOu10nynGul += read;
                    rezfBrjOrqK();
                    if (this.mOu10nynGul >= i) {
                        return true;
                    }
                    return VeqTn1PQw7(i);
                }
            } catch (w30 e) {
                e.OOA6hdeuvCS = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.mb
    public final long WIEu4Ya2g8() {
        return A1EKNP6CxJ();
    }

    @Override // defpackage.mb
    public final String WRKkgoJXwDn() {
        int MZhzXH72 = MZhzXH72();
        int i = this.rQPn8YBR;
        int i2 = this.mOu10nynGul;
        int i3 = i2 - i;
        byte[] bArr = this.encWxUiV2;
        if (MZhzXH72 <= i3 && MZhzXH72 > 0) {
            this.rQPn8YBR = i + MZhzXH72;
        } else {
            if (MZhzXH72 == 0) {
                return "";
            }
            if (MZhzXH72 < 0) {
                throw w30.xqGvceK5x();
            }
            i = 0;
            if (MZhzXH72 <= i2) {
                TpUsjqg3bxO(MZhzXH72);
                this.rQPn8YBR = MZhzXH72;
            } else {
                bArr = ozMwhSAI(MZhzXH72);
            }
        }
        return gd1.GWasM1elztuh.YmKjaVtbfp5Z(bArr, i, MZhzXH72);
    }

    @Override // defpackage.mb
    public final String WdrkLMV3xh() {
        int MZhzXH72 = MZhzXH72();
        byte[] bArr = this.encWxUiV2;
        if (MZhzXH72 > 0) {
            int i = this.mOu10nynGul;
            int i2 = this.rQPn8YBR;
            if (MZhzXH72 <= i - i2) {
                String str = new String(bArr, i2, MZhzXH72, i30.GWasM1elztuh);
                this.rQPn8YBR += MZhzXH72;
                return str;
            }
        }
        if (MZhzXH72 == 0) {
            return "";
        }
        if (MZhzXH72 < 0) {
            throw w30.xqGvceK5x();
        }
        if (MZhzXH72 > this.mOu10nynGul) {
            return new String(ozMwhSAI(MZhzXH72), i30.GWasM1elztuh);
        }
        TpUsjqg3bxO(MZhzXH72);
        String str2 = new String(bArr, this.rQPn8YBR, MZhzXH72, i30.GWasM1elztuh);
        this.rQPn8YBR += MZhzXH72;
        return str2;
    }

    @Override // defpackage.mb
    public final int X1lG3V04pd() {
        return this.XnEVoBF0td1l + this.rQPn8YBR;
    }

    @Override // defpackage.mb
    public final double XnEVoBF0td1l() {
        return Double.longBitsToDouble(A1EKNP6CxJ());
    }

    @Override // defpackage.mb
    public final long Y6hRI1cF8() {
        return A1EKNP6CxJ();
    }

    public final ArrayList YZjbz8VdP5(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.AvO7iQsrTN.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw w30.OOA6hdeuvCS();
                }
                this.XnEVoBF0td1l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.mb
    public final void Yi7zF1RB1(int i) {
        if (this.E7jCp8Ls != i) {
            throw new w30("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.mb
    public final float YmKjaVtbfp5Z() {
        return Float.intBitsToFloat(eUH21U3apd());
    }

    @Override // defpackage.mb
    public final int arNh8D4Z5gB() {
        if (xqGvceK5x()) {
            this.E7jCp8Ls = 0;
            return 0;
        }
        int MZhzXH72 = MZhzXH72();
        this.E7jCp8Ls = MZhzXH72;
        if ((MZhzXH72 >>> 3) != 0) {
            return MZhzXH72;
        }
        throw new w30("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.mb
    public final int cilMamHF() {
        int MZhzXH72 = MZhzXH72();
        return (-(MZhzXH72 & 1)) ^ (MZhzXH72 >>> 1);
    }

    public final void dqB83aoLBB(int i) {
        int i2 = this.mOu10nynGul;
        int i3 = this.rQPn8YBR;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.rQPn8YBR = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.AvO7iQsrTN;
        if (i < 0) {
            throw w30.xqGvceK5x();
        }
        int i5 = this.XnEVoBF0td1l;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.uFEq9NpZ;
        if (i7 > i8) {
            dqB83aoLBB((i8 - i5) - i3);
            throw w30.OOA6hdeuvCS();
        }
        this.XnEVoBF0td1l = i6;
        this.mOu10nynGul = 0;
        this.rQPn8YBR = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (w30 e) {
                    e.OOA6hdeuvCS = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.XnEVoBF0td1l += i4;
                rezfBrjOrqK();
                throw th;
            }
        }
        this.XnEVoBF0td1l += i4;
        rezfBrjOrqK();
        if (i4 >= i) {
            return;
        }
        int i9 = this.mOu10nynGul;
        int i10 = i9 - this.rQPn8YBR;
        this.rQPn8YBR = i9;
        TpUsjqg3bxO(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.mOu10nynGul;
            if (i11 <= i12) {
                this.rQPn8YBR = i11;
                return;
            } else {
                i10 += i12;
                this.rQPn8YBR = i12;
                TpUsjqg3bxO(1);
            }
        }
    }

    public final int eUH21U3apd() {
        int i = this.rQPn8YBR;
        if (this.mOu10nynGul - i < 4) {
            TpUsjqg3bxO(4);
            i = this.rQPn8YBR;
        }
        this.rQPn8YBR = i + 4;
        byte[] bArr = this.encWxUiV2;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.mb
    public final int iwATDS1i01k() {
        return eUH21U3apd();
    }

    @Override // defpackage.mb
    public final int jivtDDk9H() {
        return eUH21U3apd();
    }

    @Override // defpackage.mb
    public final boolean k8h8IjolWQ(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                dqB83aoLBB(8);
                return true;
            }
            if (i2 == 2) {
                dqB83aoLBB(MZhzXH72());
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
            dqB83aoLBB(4);
            return true;
        }
        int i4 = this.mOu10nynGul - this.rQPn8YBR;
        byte[] bArr = this.encWxUiV2;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.rQPn8YBR;
                this.rQPn8YBR = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw w30.X1lG3V04pd();
        }
        while (i3 < 10) {
            if (this.rQPn8YBR == this.mOu10nynGul) {
                TpUsjqg3bxO(1);
            }
            int i6 = this.rQPn8YBR;
            this.rQPn8YBR = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw w30.X1lG3V04pd();
        return true;
    }

    @Override // defpackage.mb
    public final long lv06NcmrQ() {
        long DmJncFq5 = DmJncFq5();
        return (-(DmJncFq5 & 1)) ^ (DmJncFq5 >>> 1);
    }

    @Override // defpackage.mb
    public final long mE4lRynR() {
        return DmJncFq5();
    }

    @Override // defpackage.mb
    public final void mOu10nynGul(int i) {
        this.uFEq9NpZ = i;
        rezfBrjOrqK();
    }

    public final byte[] ozMwhSAI(int i) {
        byte[] AEn1Rrio = AEn1Rrio(i);
        if (AEn1Rrio != null) {
            return AEn1Rrio;
        }
        int i2 = this.rQPn8YBR;
        int i3 = this.mOu10nynGul;
        int i4 = i3 - i2;
        this.XnEVoBF0td1l += i3;
        this.rQPn8YBR = 0;
        this.mOu10nynGul = 0;
        ArrayList YZjbz8VdP5 = YZjbz8VdP5(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.encWxUiV2, i2, bArr, 0, i4);
        int size = YZjbz8VdP5.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = YZjbz8VdP5.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.mb
    public final int pog2g9KITJA() {
        return MZhzXH72();
    }

    @Override // defpackage.mb
    public final boolean rQPn8YBR() {
        return DmJncFq5() != 0;
    }

    public final void rezfBrjOrqK() {
        int i = this.mOu10nynGul + this.JFJ3QoxA;
        this.mOu10nynGul = i;
        int i2 = this.XnEVoBF0td1l + i;
        int i3 = this.uFEq9NpZ;
        if (i2 <= i3) {
            this.JFJ3QoxA = 0;
            return;
        }
        int i4 = i2 - i3;
        this.JFJ3QoxA = i4;
        this.mOu10nynGul = i - i4;
    }

    @Override // defpackage.mb
    public final int uFEq9NpZ() {
        return MZhzXH72();
    }

    @Override // defpackage.mb
    public final boolean xqGvceK5x() {
        return this.rQPn8YBR == this.mOu10nynGul && !VeqTn1PQw7(1);
    }
}
