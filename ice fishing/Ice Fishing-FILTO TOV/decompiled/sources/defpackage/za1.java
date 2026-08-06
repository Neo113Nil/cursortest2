package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class za1 {
    public static final za1 OOA6hdeuvCS = new za1(0, 0, new Object[0], null);
    public int GWasM1elztuh;
    public final vt X1lG3V04pd;
    public int Yi7zF1RB1;
    public Object[] xqGvceK5x;

    public za1(int i, int i2, Object[] objArr, vt vtVar) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = vtVar;
        this.xqGvceK5x = objArr;
    }

    public static za1 JFJ3QoxA(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, vt vtVar) {
        if (i3 > 30) {
            return new za1(0, 0, new Object[]{obj, obj2, obj3, obj4}, vtVar);
        }
        int WRKkgoJXwDn = b70.WRKkgoJXwDn(i, i3);
        int WRKkgoJXwDn2 = b70.WRKkgoJXwDn(i2, i3);
        if (WRKkgoJXwDn != WRKkgoJXwDn2) {
            return new za1((1 << WRKkgoJXwDn) | (1 << WRKkgoJXwDn2), 0, WRKkgoJXwDn < WRKkgoJXwDn2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, vtVar);
        }
        return new za1(0, 1 << WRKkgoJXwDn, new Object[]{JFJ3QoxA(i, obj, obj2, i2, obj3, obj4, i3 + 5, vtVar)}, vtVar);
    }

    public final Object AvO7iQsrTN(int i, int i2, Object obj) {
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            if (o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz])) {
                return WdrkLMV3xh(EljAMC1QTz);
            }
            return null;
        }
        if (!mOu10nynGul(WRKkgoJXwDn)) {
            return null;
        }
        za1 mE4lRynR = mE4lRynR(jivtDDk9H(WRKkgoJXwDn));
        if (i2 != 30) {
            return mE4lRynR.AvO7iQsrTN(i, i2 + 5, obj);
        }
        v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
        int i3 = AEn1Rrio.OOA6hdeuvCS;
        int i4 = AEn1Rrio.EljAMC1QTz;
        int i5 = AEn1Rrio.AvO7iQsrTN;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return mE4lRynR.WdrkLMV3xh(i3);
    }

    public final za1 E7jCp8Ls(int i, Object obj, Object obj2, int i2, bp0 bp0Var) {
        bp0 bp0Var2;
        za1 E7jCp8Ls;
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        boolean encWxUiV2 = encWxUiV2(WRKkgoJXwDn);
        vt vtVar = this.X1lG3V04pd;
        if (encWxUiV2) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            if (!o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz])) {
                bp0Var.OOA6hdeuvCS(bp0Var.mOu10nynGul + 1);
                vt vtVar2 = bp0Var.OOA6hdeuvCS;
                if (vtVar != vtVar2) {
                    return new za1(this.GWasM1elztuh ^ WRKkgoJXwDn, this.Yi7zF1RB1 | WRKkgoJXwDn, GWasM1elztuh(EljAMC1QTz, WRKkgoJXwDn, i, obj, obj2, i2, vtVar2), vtVar2);
                }
                this.xqGvceK5x = GWasM1elztuh(EljAMC1QTz, WRKkgoJXwDn, i, obj, obj2, i2, vtVar2);
                this.GWasM1elztuh ^= WRKkgoJXwDn;
                this.Yi7zF1RB1 |= WRKkgoJXwDn;
                return this;
            }
            bp0Var.AvO7iQsrTN = WdrkLMV3xh(EljAMC1QTz);
            if (WdrkLMV3xh(EljAMC1QTz) == obj2) {
                return this;
            }
            if (vtVar == bp0Var.OOA6hdeuvCS) {
                this.xqGvceK5x[EljAMC1QTz + 1] = obj2;
                return this;
            }
            bp0Var.encWxUiV2++;
            Object[] objArr = this.xqGvceK5x;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[EljAMC1QTz + 1] = obj2;
            return new za1(this.GWasM1elztuh, this.Yi7zF1RB1, copyOf, bp0Var.OOA6hdeuvCS);
        }
        if (!mOu10nynGul(WRKkgoJXwDn)) {
            bp0Var.OOA6hdeuvCS(bp0Var.mOu10nynGul + 1);
            vt vtVar3 = bp0Var.OOA6hdeuvCS;
            int EljAMC1QTz2 = EljAMC1QTz(WRKkgoJXwDn);
            Object[] objArr2 = this.xqGvceK5x;
            if (vtVar != vtVar3) {
                return new za1(this.GWasM1elztuh | WRKkgoJXwDn, this.Yi7zF1RB1, b70.encWxUiV2(objArr2, EljAMC1QTz2, obj, obj2), vtVar3);
            }
            this.xqGvceK5x = b70.encWxUiV2(objArr2, EljAMC1QTz2, obj, obj2);
            this.GWasM1elztuh |= WRKkgoJXwDn;
            return this;
        }
        int jivtDDk9H = jivtDDk9H(WRKkgoJXwDn);
        za1 mE4lRynR = mE4lRynR(jivtDDk9H);
        if (i2 == 30) {
            v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
            int i3 = AEn1Rrio.OOA6hdeuvCS;
            int i4 = AEn1Rrio.EljAMC1QTz;
            int i5 = AEn1Rrio.AvO7iQsrTN;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                bp0Var.AvO7iQsrTN = mE4lRynR.WdrkLMV3xh(i3);
                if (mE4lRynR.X1lG3V04pd == bp0Var.OOA6hdeuvCS) {
                    mE4lRynR.xqGvceK5x[i3 + 1] = obj2;
                    E7jCp8Ls = mE4lRynR;
                } else {
                    bp0Var.encWxUiV2++;
                    Object[] objArr3 = mE4lRynR.xqGvceK5x;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    E7jCp8Ls = new za1(0, 0, copyOf2, bp0Var.OOA6hdeuvCS);
                }
                bp0Var2 = bp0Var;
            }
            bp0Var.OOA6hdeuvCS(bp0Var.mOu10nynGul + 1);
            E7jCp8Ls = new za1(0, 0, b70.encWxUiV2(mE4lRynR.xqGvceK5x, 0, obj, obj2), bp0Var.OOA6hdeuvCS);
            bp0Var2 = bp0Var;
        } else {
            bp0Var2 = bp0Var;
            E7jCp8Ls = mE4lRynR.E7jCp8Ls(i, obj, obj2, i2 + 5, bp0Var2);
        }
        return mE4lRynR == E7jCp8Ls ? this : Mjvvu5DE(jivtDDk9H, E7jCp8Ls, bp0Var2.OOA6hdeuvCS);
    }

    public final int EljAMC1QTz(int i) {
        return Integer.bitCount(this.GWasM1elztuh & (i - 1)) * 2;
    }

    public final Object[] GWasM1elztuh(int i, int i2, int i3, Object obj, Object obj2, int i4, vt vtVar) {
        Object obj3 = this.xqGvceK5x[i];
        za1 JFJ3QoxA = JFJ3QoxA(obj3 != null ? obj3.hashCode() : 0, obj3, WdrkLMV3xh(i), i3, obj, obj2, i4 + 5, vtVar);
        int jivtDDk9H = jivtDDk9H(i2);
        int i5 = jivtDDk9H + 1;
        Object[] objArr = this.xqGvceK5x;
        Object[] objArr2 = new Object[objArr.length - 1];
        d5.mqNvfisv7(objArr, objArr2, 0, i, 6);
        d5.Fm8W7vP7q(objArr, objArr2, i, i + 2, i5);
        objArr2[jivtDDk9H - 1] = JFJ3QoxA;
        d5.Fm8W7vP7q(objArr, objArr2, jivtDDk9H, i5, objArr.length);
        return objArr2;
    }

    public final za1 Mjvvu5DE(int i, za1 za1Var, vt vtVar) {
        Object[] objArr = this.xqGvceK5x;
        if (objArr.length == 1 && za1Var.xqGvceK5x.length == 2 && za1Var.Yi7zF1RB1 == 0) {
            za1Var.GWasM1elztuh = this.Yi7zF1RB1;
            return za1Var;
        }
        if (this.X1lG3V04pd == vtVar) {
            objArr[i] = za1Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = za1Var;
        return new za1(this.GWasM1elztuh, this.Yi7zF1RB1, copyOf, vtVar);
    }

    public final boolean OOA6hdeuvCS(za1 za1Var) {
        if (this == za1Var) {
            return true;
        }
        if (this.Yi7zF1RB1 == za1Var.Yi7zF1RB1 && this.GWasM1elztuh == za1Var.GWasM1elztuh) {
            int length = this.xqGvceK5x.length;
            for (int i = 0; i < length; i++) {
                if (this.xqGvceK5x[i] == za1Var.xqGvceK5x[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final za1 WIEu4Ya2g8(int i, int i2, bp0 bp0Var) {
        bp0Var.OOA6hdeuvCS(bp0Var.mOu10nynGul - 1);
        bp0Var.AvO7iQsrTN = WdrkLMV3xh(i);
        Object[] objArr = this.xqGvceK5x;
        if (objArr.length == 2) {
            return null;
        }
        if (this.X1lG3V04pd != bp0Var.OOA6hdeuvCS) {
            return new za1(i2 ^ this.GWasM1elztuh, this.Yi7zF1RB1, b70.mOu10nynGul(i, objArr), bp0Var.OOA6hdeuvCS);
        }
        this.xqGvceK5x = b70.mOu10nynGul(i, objArr);
        this.GWasM1elztuh ^= i2;
        return this;
    }

    public final Object WdrkLMV3xh(int i) {
        return this.xqGvceK5x[i + 1];
    }

    public final boolean X1lG3V04pd(Object obj) {
        v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, this.xqGvceK5x.length));
        int i = AEn1Rrio.OOA6hdeuvCS;
        int i2 = AEn1Rrio.EljAMC1QTz;
        int i3 = AEn1Rrio.AvO7iQsrTN;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!o30.rQPn8YBR(obj, this.xqGvceK5x[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final za1 XnEVoBF0td1l(za1 za1Var, int i, dl dlVar, bp0 bp0Var) {
        Object[] objArr;
        za1 JFJ3QoxA;
        if (this == za1Var) {
            dlVar.GWasM1elztuh += Yi7zF1RB1();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            vt vtVar = bp0Var.OOA6hdeuvCS;
            int i3 = za1Var.Yi7zF1RB1;
            Object[] objArr2 = this.xqGvceK5x;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + za1Var.xqGvceK5x.length);
            int length = this.xqGvceK5x.length;
            v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, za1Var.xqGvceK5x.length));
            int i4 = AEn1Rrio.OOA6hdeuvCS;
            int i5 = AEn1Rrio.EljAMC1QTz;
            int i6 = AEn1Rrio.AvO7iQsrTN;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (X1lG3V04pd(za1Var.xqGvceK5x[i4])) {
                        dlVar.GWasM1elztuh++;
                    } else {
                        Object[] objArr3 = za1Var.xqGvceK5x;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.xqGvceK5x.length) {
                return length == za1Var.xqGvceK5x.length ? za1Var : length == copyOf.length ? new za1(0, 0, copyOf, vtVar) : new za1(0, 0, Arrays.copyOf(copyOf, length), vtVar);
            }
        } else {
            int i7 = this.Yi7zF1RB1 | za1Var.Yi7zF1RB1;
            int i8 = this.GWasM1elztuh;
            int i9 = za1Var.GWasM1elztuh;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (o30.rQPn8YBR(this.xqGvceK5x[EljAMC1QTz(lowestOneBit)], za1Var.xqGvceK5x[za1Var.EljAMC1QTz(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                tq0.Yi7zF1RB1("Check failed.");
            }
            za1 za1Var2 = (o30.rQPn8YBR(this.X1lG3V04pd, bp0Var.OOA6hdeuvCS) && this.GWasM1elztuh == i12 && this.Yi7zF1RB1 == i7) ? this : new za1(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = za1Var2.xqGvceK5x;
                int length2 = (objArr4.length - 1) - i14;
                if (mOu10nynGul(lowestOneBit2)) {
                    JFJ3QoxA = mE4lRynR(jivtDDk9H(lowestOneBit2));
                    if (za1Var.mOu10nynGul(lowestOneBit2)) {
                        JFJ3QoxA = JFJ3QoxA.XnEVoBF0td1l(za1Var.mE4lRynR(za1Var.jivtDDk9H(lowestOneBit2)), i + 5, dlVar, bp0Var);
                        objArr = objArr4;
                    } else if (za1Var.encWxUiV2(lowestOneBit2)) {
                        int EljAMC1QTz = za1Var.EljAMC1QTz(lowestOneBit2);
                        Object obj = za1Var.xqGvceK5x[EljAMC1QTz];
                        Object WdrkLMV3xh = za1Var.WdrkLMV3xh(EljAMC1QTz);
                        int i15 = bp0Var.mOu10nynGul;
                        objArr = objArr4;
                        JFJ3QoxA = JFJ3QoxA.E7jCp8Ls(obj != null ? obj.hashCode() : i2, obj, WdrkLMV3xh, i + 5, bp0Var);
                        if (bp0Var.mOu10nynGul == i15) {
                            dlVar.GWasM1elztuh++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (za1Var.mOu10nynGul(lowestOneBit2)) {
                        za1 mE4lRynR = za1Var.mE4lRynR(za1Var.jivtDDk9H(lowestOneBit2));
                        if (encWxUiV2(lowestOneBit2)) {
                            int EljAMC1QTz2 = EljAMC1QTz(lowestOneBit2);
                            Object obj2 = this.xqGvceK5x[EljAMC1QTz2];
                            int i16 = i + 5;
                            if (mE4lRynR.xqGvceK5x(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                dlVar.GWasM1elztuh++;
                            } else {
                                JFJ3QoxA = mE4lRynR.E7jCp8Ls(obj2 != null ? obj2.hashCode() : 0, obj2, WdrkLMV3xh(EljAMC1QTz2), i16, bp0Var);
                            }
                        }
                        JFJ3QoxA = mE4lRynR;
                    } else {
                        int EljAMC1QTz3 = EljAMC1QTz(lowestOneBit2);
                        Object obj3 = this.xqGvceK5x[EljAMC1QTz3];
                        Object WdrkLMV3xh2 = WdrkLMV3xh(EljAMC1QTz3);
                        int EljAMC1QTz4 = za1Var.EljAMC1QTz(lowestOneBit2);
                        Object obj4 = za1Var.xqGvceK5x[EljAMC1QTz4];
                        JFJ3QoxA = JFJ3QoxA(obj3 != null ? obj3.hashCode() : 0, obj3, WdrkLMV3xh2, obj4 != null ? obj4.hashCode() : 0, obj4, za1Var.WdrkLMV3xh(EljAMC1QTz4), i + 5, bp0Var.OOA6hdeuvCS);
                    }
                }
                objArr[length2] = JFJ3QoxA;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (za1Var.encWxUiV2(lowestOneBit3)) {
                    int EljAMC1QTz5 = za1Var.EljAMC1QTz(lowestOneBit3);
                    Object[] objArr5 = za1Var2.xqGvceK5x;
                    objArr5[i18] = za1Var.xqGvceK5x[EljAMC1QTz5];
                    objArr5[i18 + 1] = za1Var.WdrkLMV3xh(EljAMC1QTz5);
                    if (encWxUiV2(lowestOneBit3)) {
                        dlVar.GWasM1elztuh++;
                    }
                } else {
                    int EljAMC1QTz6 = EljAMC1QTz(lowestOneBit3);
                    Object[] objArr6 = za1Var2.xqGvceK5x;
                    objArr6[i18] = this.xqGvceK5x[EljAMC1QTz6];
                    objArr6[i18 + 1] = WdrkLMV3xh(EljAMC1QTz6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!OOA6hdeuvCS(za1Var2)) {
                return za1Var.OOA6hdeuvCS(za1Var2) ? za1Var : za1Var2;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.Yi7zF1RB1 = lv06NcmrQ(r11, r4, (defpackage.za1) r13.Yi7zF1RB1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu Y6hRI1cF8(int i, int i2, Object obj, Object obj2) {
        qu Y6hRI1cF8;
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            if (!o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz])) {
                return new qu(new za1(this.GWasM1elztuh ^ WRKkgoJXwDn, this.Yi7zF1RB1 | WRKkgoJXwDn, GWasM1elztuh(EljAMC1QTz, WRKkgoJXwDn, i, obj, obj2, i2, null), null), 1);
            }
            if (WdrkLMV3xh(EljAMC1QTz) != obj2) {
                Object[] objArr = this.xqGvceK5x;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[EljAMC1QTz + 1] = obj2;
                return new qu(new za1(this.GWasM1elztuh, this.Yi7zF1RB1, copyOf, null), 0);
            }
        } else {
            if (!mOu10nynGul(WRKkgoJXwDn)) {
                return new qu(new za1(this.GWasM1elztuh | WRKkgoJXwDn, this.Yi7zF1RB1, b70.encWxUiV2(this.xqGvceK5x, EljAMC1QTz(WRKkgoJXwDn), obj, obj2), null), 1);
            }
            int jivtDDk9H = jivtDDk9H(WRKkgoJXwDn);
            za1 mE4lRynR = mE4lRynR(jivtDDk9H);
            if (i2 == 30) {
                v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
                int i3 = AEn1Rrio.OOA6hdeuvCS;
                int i4 = AEn1Rrio.EljAMC1QTz;
                int i5 = AEn1Rrio.AvO7iQsrTN;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == mE4lRynR.WdrkLMV3xh(i3)) {
                        Y6hRI1cF8 = null;
                    } else {
                        Object[] objArr2 = mE4lRynR.xqGvceK5x;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        Y6hRI1cF8 = new qu(new za1(0, 0, copyOf2, null), 0);
                    }
                }
                Y6hRI1cF8 = new qu(new za1(0, 0, b70.encWxUiV2(mE4lRynR.xqGvceK5x, 0, obj, obj2), null), 1);
                break;
            }
            Y6hRI1cF8 = mE4lRynR.Y6hRI1cF8(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final int Yi7zF1RB1() {
        if (this.Yi7zF1RB1 == 0) {
            return this.xqGvceK5x.length / 2;
        }
        int bitCount = Integer.bitCount(this.GWasM1elztuh);
        int length = this.xqGvceK5x.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += mE4lRynR(i).Yi7zF1RB1();
        }
        return bitCount;
    }

    public final za1 YmKjaVtbfp5Z(za1 za1Var, za1 za1Var2, int i, int i2, vt vtVar) {
        vt vtVar2 = this.X1lG3V04pd;
        if (za1Var2 != null) {
            return (vtVar2 == vtVar || za1Var != za1Var2) ? Mjvvu5DE(i, za1Var2, vtVar) : this;
        }
        Object[] objArr = this.xqGvceK5x;
        if (objArr.length == 1) {
            return null;
        }
        if (vtVar2 != vtVar) {
            return new za1(this.GWasM1elztuh, this.Yi7zF1RB1 ^ i2, b70.JFJ3QoxA(i, objArr), vtVar);
        }
        this.xqGvceK5x = b70.JFJ3QoxA(i, objArr);
        this.Yi7zF1RB1 ^= i2;
        return this;
    }

    public final za1 cilMamHF(int i, int i2, Object obj) {
        za1 cilMamHF;
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            if (!o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz])) {
                return this;
            }
            Object[] objArr = this.xqGvceK5x;
            if (objArr.length != 2) {
                return new za1(this.GWasM1elztuh ^ WRKkgoJXwDn, this.Yi7zF1RB1, b70.mOu10nynGul(EljAMC1QTz, objArr), null);
            }
        } else {
            if (!mOu10nynGul(WRKkgoJXwDn)) {
                return this;
            }
            int jivtDDk9H = jivtDDk9H(WRKkgoJXwDn);
            za1 mE4lRynR = mE4lRynR(jivtDDk9H);
            if (i2 == 30) {
                v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
                int i3 = AEn1Rrio.OOA6hdeuvCS;
                int i4 = AEn1Rrio.EljAMC1QTz;
                int i5 = AEn1Rrio.AvO7iQsrTN;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = mE4lRynR.xqGvceK5x;
                    cilMamHF = objArr2.length == 2 ? null : new za1(0, 0, b70.mOu10nynGul(i3, objArr2), null);
                }
                cilMamHF = mE4lRynR;
                break;
            }
            cilMamHF = mE4lRynR.cilMamHF(i, i2 + 5, obj);
            if (cilMamHF != null) {
                return mE4lRynR != cilMamHF ? lv06NcmrQ(jivtDDk9H, WRKkgoJXwDn, cilMamHF) : this;
            }
            Object[] objArr3 = this.xqGvceK5x;
            if (objArr3.length != 1) {
                return new za1(this.GWasM1elztuh, this.Yi7zF1RB1 ^ WRKkgoJXwDn, b70.JFJ3QoxA(jivtDDk9H, objArr3), null);
            }
        }
        return null;
    }

    public final boolean encWxUiV2(int i) {
        return (this.GWasM1elztuh & i) != 0;
    }

    public final za1 iwATDS1i01k(int i, Object obj, Object obj2, int i2, bp0 bp0Var) {
        bp0 bp0Var2;
        za1 iwATDS1i01k;
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            return (o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz]) && o30.rQPn8YBR(obj2, WdrkLMV3xh(EljAMC1QTz))) ? WIEu4Ya2g8(EljAMC1QTz, WRKkgoJXwDn, bp0Var) : this;
        }
        if (!mOu10nynGul(WRKkgoJXwDn)) {
            return this;
        }
        int jivtDDk9H = jivtDDk9H(WRKkgoJXwDn);
        za1 mE4lRynR = mE4lRynR(jivtDDk9H);
        if (i2 == 30) {
            v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
            int i3 = AEn1Rrio.OOA6hdeuvCS;
            int i4 = AEn1Rrio.EljAMC1QTz;
            int i5 = AEn1Rrio.AvO7iQsrTN;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3]) || !o30.rQPn8YBR(obj2, mE4lRynR.WdrkLMV3xh(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        iwATDS1i01k = mE4lRynR.rQPn8YBR(i3, bp0Var);
                        break;
                    }
                }
            }
            iwATDS1i01k = mE4lRynR;
            bp0Var2 = bp0Var;
        } else {
            bp0Var2 = bp0Var;
            iwATDS1i01k = mE4lRynR.iwATDS1i01k(i, obj, obj2, i2 + 5, bp0Var2);
        }
        return YmKjaVtbfp5Z(mE4lRynR, iwATDS1i01k, jivtDDk9H, WRKkgoJXwDn, bp0Var2.OOA6hdeuvCS);
    }

    public final int jivtDDk9H(int i) {
        return (this.xqGvceK5x.length - 1) - Integer.bitCount(this.Yi7zF1RB1 & (i - 1));
    }

    public final za1 lv06NcmrQ(int i, int i2, za1 za1Var) {
        Object[] objArr = za1Var.xqGvceK5x;
        if (objArr.length != 2 || za1Var.Yi7zF1RB1 != 0) {
            Object[] objArr2 = this.xqGvceK5x;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = za1Var;
            return new za1(this.GWasM1elztuh, this.Yi7zF1RB1, copyOf, null);
        }
        if (this.xqGvceK5x.length == 1) {
            za1Var.GWasM1elztuh = this.Yi7zF1RB1;
            return za1Var;
        }
        int EljAMC1QTz = EljAMC1QTz(i2);
        Object[] objArr3 = this.xqGvceK5x;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        d5.Fm8W7vP7q(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        d5.Fm8W7vP7q(copyOf2, copyOf2, EljAMC1QTz + 2, EljAMC1QTz, i);
        copyOf2[EljAMC1QTz] = obj;
        copyOf2[EljAMC1QTz + 1] = obj2;
        return new za1(this.GWasM1elztuh ^ i2, this.Yi7zF1RB1 ^ i2, copyOf2, null);
    }

    public final za1 mE4lRynR(int i) {
        Object obj = this.xqGvceK5x[i];
        obj.getClass();
        return (za1) obj;
    }

    public final boolean mOu10nynGul(int i) {
        return (this.Yi7zF1RB1 & i) != 0;
    }

    public final za1 rQPn8YBR(int i, bp0 bp0Var) {
        bp0Var.OOA6hdeuvCS(bp0Var.mOu10nynGul - 1);
        bp0Var.AvO7iQsrTN = WdrkLMV3xh(i);
        Object[] objArr = this.xqGvceK5x;
        if (objArr.length == 2) {
            return null;
        }
        if (this.X1lG3V04pd != bp0Var.OOA6hdeuvCS) {
            return new za1(0, 0, b70.mOu10nynGul(i, objArr), bp0Var.OOA6hdeuvCS);
        }
        this.xqGvceK5x = b70.mOu10nynGul(i, objArr);
        return this;
    }

    public final za1 uFEq9NpZ(int i, Object obj, int i2, bp0 bp0Var) {
        za1 uFEq9NpZ;
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            int EljAMC1QTz = EljAMC1QTz(WRKkgoJXwDn);
            if (o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz])) {
                return WIEu4Ya2g8(EljAMC1QTz, WRKkgoJXwDn, bp0Var);
            }
        } else if (mOu10nynGul(WRKkgoJXwDn)) {
            int jivtDDk9H = jivtDDk9H(WRKkgoJXwDn);
            za1 mE4lRynR = mE4lRynR(jivtDDk9H);
            if (i2 == 30) {
                v20 AEn1Rrio = o50.AEn1Rrio(o50.MZhzXH72(0, mE4lRynR.xqGvceK5x.length));
                int i3 = AEn1Rrio.OOA6hdeuvCS;
                int i4 = AEn1Rrio.EljAMC1QTz;
                int i5 = AEn1Rrio.AvO7iQsrTN;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!o30.rQPn8YBR(obj, mE4lRynR.xqGvceK5x[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    uFEq9NpZ = mE4lRynR.rQPn8YBR(i3, bp0Var);
                }
                uFEq9NpZ = mE4lRynR;
                break;
            }
            uFEq9NpZ = mE4lRynR.uFEq9NpZ(i, obj, i2 + 5, bp0Var);
            return YmKjaVtbfp5Z(mE4lRynR, uFEq9NpZ, jivtDDk9H, WRKkgoJXwDn, bp0Var.OOA6hdeuvCS);
        }
        return this;
    }

    public final boolean xqGvceK5x(int i, int i2, Object obj) {
        int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i2);
        if (encWxUiV2(WRKkgoJXwDn)) {
            return o30.rQPn8YBR(obj, this.xqGvceK5x[EljAMC1QTz(WRKkgoJXwDn)]);
        }
        if (!mOu10nynGul(WRKkgoJXwDn)) {
            return false;
        }
        za1 mE4lRynR = mE4lRynR(jivtDDk9H(WRKkgoJXwDn));
        return i2 == 30 ? mE4lRynR.X1lG3V04pd(obj) : mE4lRynR.xqGvceK5x(i, i2 + 5, obj);
    }
}
