package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r0 {
    public final f0 MdtA4re8;
    public final y0 NCTxEWno;
    public int qoPGr6Ce = 0;
    public int wxUZMvaN = 8;
    public int[] VgvYg0wo = new int[8];
    public int[] P7K7Inc8 = new int[8];
    public float[] b2ZJblxo = new float[8];
    public int Qr9iLBAD = -1;
    public int jb9XjC4I = -1;
    public boolean eVhOlqcC = false;

    public r0(y0 y0Var, f0 f0Var) {
        this.NCTxEWno = y0Var;
        this.MdtA4re8 = f0Var;
    }

    public final float MdtA4re8(r70 r70Var) {
        int i = this.Qr9iLBAD;
        for (int i2 = 0; i != -1 && i2 < this.qoPGr6Ce; i2++) {
            if (this.VgvYg0wo[i] == r70Var.MdtA4re8) {
                return this.b2ZJblxo[i];
            }
            i = this.P7K7Inc8[i];
        }
        return 0.0f;
    }

    public final void NCTxEWno() {
        int i = this.Qr9iLBAD;
        for (int i2 = 0; i != -1 && i2 < this.qoPGr6Ce; i2++) {
            r70 r70Var = ((r70[]) this.MdtA4re8.VgvYg0wo)[this.VgvYg0wo[i]];
            if (r70Var != null) {
                r70Var.NCTxEWno(this.NCTxEWno);
            }
            i = this.P7K7Inc8[i];
        }
        this.Qr9iLBAD = -1;
        this.jb9XjC4I = -1;
        this.eVhOlqcC = false;
        this.qoPGr6Ce = 0;
    }

    public final float P7K7Inc8(int i) {
        int i2 = this.Qr9iLBAD;
        for (int i3 = 0; i2 != -1 && i3 < this.qoPGr6Ce; i3++) {
            if (i3 == i) {
                return this.b2ZJblxo[i2];
            }
            i2 = this.P7K7Inc8[i2];
        }
        return 0.0f;
    }

    public final float Qr9iLBAD(r70 r70Var, boolean z) {
        int i = this.Qr9iLBAD;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.qoPGr6Ce) {
            if (this.VgvYg0wo[i] == r70Var.MdtA4re8) {
                int i4 = this.Qr9iLBAD;
                int[] iArr = this.P7K7Inc8;
                if (i == i4) {
                    this.Qr9iLBAD = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    r70Var.NCTxEWno(this.NCTxEWno);
                }
                r70Var.ow5vqvCr--;
                this.qoPGr6Ce--;
                this.VgvYg0wo[i] = -1;
                if (this.eVhOlqcC) {
                    this.jb9XjC4I = i;
                }
                return this.b2ZJblxo[i];
            }
            i2++;
            i3 = i;
            i = this.P7K7Inc8[i];
        }
        return 0.0f;
    }

    public final r70 VgvYg0wo(int i) {
        int i2 = this.Qr9iLBAD;
        for (int i3 = 0; i2 != -1 && i3 < this.qoPGr6Ce; i3++) {
            if (i3 == i) {
                return ((r70[]) this.MdtA4re8.VgvYg0wo)[this.VgvYg0wo[i2]];
            }
            i2 = this.P7K7Inc8[i2];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2ZJblxo(r70 r70Var, float f) {
        int[] iArr;
        int i;
        int[] iArr2;
        if (f == 0.0f) {
            Qr9iLBAD(r70Var, true);
            return;
        }
        int i2 = this.Qr9iLBAD;
        y0 y0Var = this.NCTxEWno;
        if (i2 == -1) {
            this.Qr9iLBAD = 0;
            this.b2ZJblxo[0] = f;
            this.VgvYg0wo[0] = r70Var.MdtA4re8;
            this.P7K7Inc8[0] = -1;
            r70Var.ow5vqvCr++;
            r70Var.qoPGr6Ce(y0Var);
            this.qoPGr6Ce++;
            if (this.eVhOlqcC) {
                return;
            }
            int i3 = this.jb9XjC4I + 1;
            this.jb9XjC4I = i3;
            int[] iArr3 = this.VgvYg0wo;
            if (i3 >= iArr3.length) {
                this.eVhOlqcC = true;
                this.jb9XjC4I = iArr3.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.qoPGr6Ce; i5++) {
            int i6 = this.VgvYg0wo[i2];
            int i7 = r70Var.MdtA4re8;
            if (i6 == i7) {
                this.b2ZJblxo[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.P7K7Inc8[i2];
        }
        int i8 = this.jb9XjC4I;
        int i9 = i8 + 1;
        if (this.eVhOlqcC) {
            int[] iArr4 = this.VgvYg0wo;
            if (iArr4[i8] != -1) {
                i8 = iArr4.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr5 = this.VgvYg0wo;
        if (i8 >= iArr5.length && this.qoPGr6Ce < iArr5.length) {
            int i10 = 0;
            while (true) {
                iArr = this.VgvYg0wo;
                if (i10 >= iArr.length) {
                    iArr5 = iArr;
                    break;
                } else {
                    if (iArr[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            if (i8 >= iArr.length) {
                i8 = iArr.length;
                int i11 = this.wxUZMvaN * 2;
                this.wxUZMvaN = i11;
                this.eVhOlqcC = false;
                this.jb9XjC4I = i8 - 1;
                this.b2ZJblxo = Arrays.copyOf(this.b2ZJblxo, i11);
                this.VgvYg0wo = Arrays.copyOf(this.VgvYg0wo, this.wxUZMvaN);
                this.P7K7Inc8 = Arrays.copyOf(this.P7K7Inc8, this.wxUZMvaN);
            }
            this.VgvYg0wo[i8] = r70Var.MdtA4re8;
            this.b2ZJblxo[i8] = f;
            int[] iArr6 = this.P7K7Inc8;
            if (i4 == -1) {
                iArr6[i8] = iArr6[i4];
                iArr6[i4] = i8;
            } else {
                iArr6[i8] = this.Qr9iLBAD;
                this.Qr9iLBAD = i8;
            }
            r70Var.ow5vqvCr++;
            r70Var.qoPGr6Ce(y0Var);
            i = this.qoPGr6Ce + 1;
            this.qoPGr6Ce = i;
            if (!this.eVhOlqcC) {
                this.jb9XjC4I++;
            }
            iArr2 = this.VgvYg0wo;
            if (i >= iArr2.length) {
                this.eVhOlqcC = true;
            }
            if (this.jb9XjC4I < iArr2.length) {
                this.eVhOlqcC = true;
                this.jb9XjC4I = iArr2.length - 1;
                return;
            }
            return;
        }
        iArr = iArr5;
        if (i8 >= iArr.length) {
        }
        this.VgvYg0wo[i8] = r70Var.MdtA4re8;
        this.b2ZJblxo[i8] = f;
        int[] iArr62 = this.P7K7Inc8;
        if (i4 == -1) {
        }
        r70Var.ow5vqvCr++;
        r70Var.qoPGr6Ce(y0Var);
        i = this.qoPGr6Ce + 1;
        this.qoPGr6Ce = i;
        if (!this.eVhOlqcC) {
        }
        iArr2 = this.VgvYg0wo;
        if (i >= iArr2.length) {
        }
        if (this.jb9XjC4I < iArr2.length) {
        }
    }

    public final void qoPGr6Ce(r70 r70Var, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.Qr9iLBAD;
            y0 y0Var = this.NCTxEWno;
            if (i == -1) {
                this.Qr9iLBAD = 0;
                this.b2ZJblxo[0] = f;
                this.VgvYg0wo[0] = r70Var.MdtA4re8;
                this.P7K7Inc8[0] = -1;
                r70Var.ow5vqvCr++;
                r70Var.qoPGr6Ce(y0Var);
                this.qoPGr6Ce++;
                if (this.eVhOlqcC) {
                    return;
                }
                int i2 = this.jb9XjC4I + 1;
                this.jb9XjC4I = i2;
                int[] iArr2 = this.VgvYg0wo;
                if (i2 >= iArr2.length) {
                    this.eVhOlqcC = true;
                    this.jb9XjC4I = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.qoPGr6Ce; i4++) {
                int i5 = this.VgvYg0wo[i];
                int i6 = r70Var.MdtA4re8;
                if (i5 == i6) {
                    float[] fArr = this.b2ZJblxo;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.Qr9iLBAD;
                        int[] iArr3 = this.P7K7Inc8;
                        if (i == i7) {
                            this.Qr9iLBAD = iArr3[i];
                        } else {
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            r70Var.NCTxEWno(y0Var);
                        }
                        if (this.eVhOlqcC) {
                            this.jb9XjC4I = i;
                        }
                        r70Var.ow5vqvCr--;
                        this.qoPGr6Ce--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.P7K7Inc8[i];
            }
            int i8 = this.jb9XjC4I;
            int i9 = i8 + 1;
            if (this.eVhOlqcC) {
                int[] iArr4 = this.VgvYg0wo;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.VgvYg0wo;
            if (i8 >= iArr5.length && this.qoPGr6Ce < iArr5.length) {
                int i10 = 0;
                while (true) {
                    iArr = this.VgvYg0wo;
                    if (i10 >= iArr.length) {
                        iArr5 = iArr;
                        break;
                    } else {
                        if (iArr[i10] == -1) {
                            i8 = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            iArr = iArr5;
            if (i8 >= iArr.length) {
                i8 = iArr.length;
                int i11 = this.wxUZMvaN * 2;
                this.wxUZMvaN = i11;
                this.eVhOlqcC = false;
                this.jb9XjC4I = i8 - 1;
                this.b2ZJblxo = Arrays.copyOf(this.b2ZJblxo, i11);
                this.VgvYg0wo = Arrays.copyOf(this.VgvYg0wo, this.wxUZMvaN);
                this.P7K7Inc8 = Arrays.copyOf(this.P7K7Inc8, this.wxUZMvaN);
            }
            this.VgvYg0wo[i8] = r70Var.MdtA4re8;
            this.b2ZJblxo[i8] = f;
            int[] iArr6 = this.P7K7Inc8;
            if (i3 != -1) {
                iArr6[i8] = iArr6[i3];
                iArr6[i3] = i8;
            } else {
                iArr6[i8] = this.Qr9iLBAD;
                this.Qr9iLBAD = i8;
            }
            r70Var.ow5vqvCr++;
            r70Var.qoPGr6Ce(y0Var);
            this.qoPGr6Ce++;
            if (!this.eVhOlqcC) {
                this.jb9XjC4I++;
            }
            int i12 = this.jb9XjC4I;
            int[] iArr7 = this.VgvYg0wo;
            if (i12 >= iArr7.length) {
                this.eVhOlqcC = true;
                this.jb9XjC4I = iArr7.length - 1;
            }
        }
    }

    public final String toString() {
        int i = this.Qr9iLBAD;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.qoPGr6Ce; i2++) {
            StringBuilder sb = new StringBuilder(str.concat(" -> ") + this.b2ZJblxo[i] + " : ");
            sb.append(((r70[]) this.MdtA4re8.VgvYg0wo)[this.VgvYg0wo[i]]);
            str = sb.toString();
            i = this.P7K7Inc8[i];
        }
        return str;
    }

    public final int wxUZMvaN() {
        return this.qoPGr6Ce;
    }
}
