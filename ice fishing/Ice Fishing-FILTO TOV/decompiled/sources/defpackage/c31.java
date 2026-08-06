package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c31 {
    public int AvO7iQsrTN;
    public int E7jCp8Ls;
    public rf0 EljAMC1QTz;
    public final z21 GWasM1elztuh;
    public int JFJ3QoxA;
    public final c30 Mjvvu5DE;
    public HashMap OOA6hdeuvCS;
    public final c30 WIEu4Ya2g8;
    public qf0 WdrkLMV3xh;
    public Object[] X1lG3V04pd;
    public int XnEVoBF0td1l;
    public int Y6hRI1cF8;
    public int[] Yi7zF1RB1;
    public final c30 YmKjaVtbfp5Z;
    public int cilMamHF;
    public int encWxUiV2;
    public int iwATDS1i01k;
    public int jivtDDk9H;
    public boolean lv06NcmrQ;
    public rf0 mE4lRynR;
    public int mOu10nynGul;
    public int rQPn8YBR;
    public int uFEq9NpZ;
    public ArrayList xqGvceK5x;

    public c31(z21 z21Var) {
        this.GWasM1elztuh = z21Var;
        int[] iArr = z21Var.OOA6hdeuvCS;
        this.Yi7zF1RB1 = iArr;
        Object[] objArr = z21Var.AvO7iQsrTN;
        this.X1lG3V04pd = objArr;
        this.xqGvceK5x = z21Var.XnEVoBF0td1l;
        this.OOA6hdeuvCS = z21Var.uFEq9NpZ;
        this.EljAMC1QTz = z21Var.iwATDS1i01k;
        int i = z21Var.EljAMC1QTz;
        this.AvO7iQsrTN = i;
        this.encWxUiV2 = (iArr.length / 5) - i;
        int i2 = z21Var.encWxUiV2;
        this.rQPn8YBR = i2;
        this.E7jCp8Ls = objArr.length - i2;
        this.XnEVoBF0td1l = i;
        this.WIEu4Ya2g8 = new c30();
        this.YmKjaVtbfp5Z = new c30();
        this.Mjvvu5DE = new c30();
        this.Y6hRI1cF8 = i;
        this.cilMamHF = -1;
    }

    public static void arNh8D4Z5gB(c31 c31Var) {
        int i = c31Var.cilMamHF;
        int Mjvvu5DE = c31Var.Mjvvu5DE(i);
        int[] iArr = c31Var.Yi7zF1RB1;
        int i2 = (Mjvvu5DE * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c31Var.qugwajBSa59j(c31Var.ozMwhSAI(iArr, i));
    }

    public static int mOu10nynGul(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final boolean A1EKNP6CxJ(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.xqGvceK5x;
            M3K9sHhK(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.OOA6hdeuvCS;
                int i3 = i + i2;
                int GWasM1elztuh = b31.GWasM1elztuh(this.xqGvceK5x, i3, iwATDS1i01k() - this.encWxUiV2);
                if (GWasM1elztuh >= this.xqGvceK5x.size()) {
                    GWasM1elztuh--;
                }
                int i4 = GWasM1elztuh + 1;
                int i5 = 0;
                while (GWasM1elztuh >= 0) {
                    lx lxVar = (lx) this.xqGvceK5x.get(GWasM1elztuh);
                    int X1lG3V04pd = X1lG3V04pd(lxVar);
                    if (X1lG3V04pd < i) {
                        break;
                    }
                    if (X1lG3V04pd < i3) {
                        lxVar.GWasM1elztuh = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = GWasM1elztuh + 1;
                        }
                        i4 = GWasM1elztuh;
                    }
                    GWasM1elztuh--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.xqGvceK5x.subList(i4, i5).clear();
                }
            }
            this.AvO7iQsrTN = i;
            this.encWxUiV2 += i2;
            int i6 = this.XnEVoBF0td1l;
            if (i6 > i) {
                this.XnEVoBF0td1l = Math.max(i, i6 - i2);
            }
            int i7 = this.Y6hRI1cF8;
            if (i7 >= this.AvO7iQsrTN) {
                this.Y6hRI1cF8 = i7 - i2;
            }
            int i8 = this.cilMamHF;
            if (i8 >= 0 && (this.Yi7zF1RB1[(Mjvvu5DE(i8) * 5) + 1] & 67108864) != 0) {
                qugwajBSa59j(i8);
            }
        }
        return r0;
    }

    public final Object AEn1Rrio(Object obj) {
        if (this.uFEq9NpZ > 0) {
            WdrkLMV3xh(1, this.cilMamHF);
        }
        Object[] objArr = this.X1lG3V04pd;
        int i = this.mOu10nynGul;
        this.mOu10nynGul = i + 1;
        Object obj2 = objArr[encWxUiV2(i)];
        if (this.mOu10nynGul > this.JFJ3QoxA) {
            we.GWasM1elztuh("Writing to an invalid slot");
        }
        this.X1lG3V04pd[encWxUiV2(this.mOu10nynGul - 1)] = obj;
        return obj2;
    }

    public final int AvO7iQsrTN(int[] iArr, int i) {
        if (i >= iwATDS1i01k()) {
            return this.X1lG3V04pd.length - this.E7jCp8Ls;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.X1lG3V04pd.length - this.E7jCp8Ls) + i2 + 1 : i2;
    }

    public final void CMh55RymNfS(Object obj) {
        int Mjvvu5DE = Mjvvu5DE(this.jivtDDk9H);
        int i = (Mjvvu5DE * 5) + 1;
        if ((this.Yi7zF1RB1[i] & 268435456) == 0) {
            we.GWasM1elztuh("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.X1lG3V04pd;
        int[] iArr = this.Yi7zF1RB1;
        objArr[encWxUiV2(Integer.bitCount(iArr[i] >> 29) + AvO7iQsrTN(iArr, Mjvvu5DE))] = obj;
    }

    public final Object DmJncFq5(int i, int i2, Object obj) {
        int TpUsjqg3bxO = TpUsjqg3bxO(this.Yi7zF1RB1, Mjvvu5DE(i));
        int AvO7iQsrTN = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i + 1));
        int i3 = TpUsjqg3bxO + i2;
        if (i3 < TpUsjqg3bxO || i3 >= AvO7iQsrTN) {
            we.GWasM1elztuh("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int encWxUiV2 = encWxUiV2(i3);
        Object[] objArr = this.X1lG3V04pd;
        Object obj2 = objArr[encWxUiV2];
        objArr[encWxUiV2] = obj;
        return obj2;
    }

    public final void E7jCp8Ls(int i) {
        boolean z = false;
        if (!(this.uFEq9NpZ <= 0)) {
            we.GWasM1elztuh("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.cilMamHF;
        if (i2 != i) {
            if (i >= i2 && i < this.Y6hRI1cF8) {
                z = true;
            }
            if (!z) {
                we.GWasM1elztuh("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.jivtDDk9H;
            int i4 = this.mOu10nynGul;
            int i5 = this.JFJ3QoxA;
            this.jivtDDk9H = i;
            VeqTn1PQw7();
            this.jivtDDk9H = i3;
            this.mOu10nynGul = i4;
            this.JFJ3QoxA = i5;
        }
    }

    public final Object EXrPz3p7hFb(int i) {
        int Mjvvu5DE = Mjvvu5DE(i);
        int[] iArr = this.Yi7zF1RB1;
        if ((iArr[(Mjvvu5DE * 5) + 1] & 1073741824) != 0) {
            return this.X1lG3V04pd[encWxUiV2(AvO7iQsrTN(iArr, Mjvvu5DE))];
        }
        return null;
    }

    public final int EljAMC1QTz(int i) {
        return AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i));
    }

    public final void GWasM1elztuh(int i) {
        if (i < 0) {
            we.GWasM1elztuh("Cannot seek backwards");
        }
        if (this.uFEq9NpZ > 0) {
            tq0.Yi7zF1RB1("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.jivtDDk9H + i;
        if (i2 < this.cilMamHF || i2 > this.Y6hRI1cF8) {
            we.GWasM1elztuh("Cannot seek outside the current group (" + this.cilMamHF + '-' + this.Y6hRI1cF8 + ')');
        }
        this.jivtDDk9H = i2;
        int AvO7iQsrTN = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i2));
        this.mOu10nynGul = AvO7iQsrTN;
        this.JFJ3QoxA = AvO7iQsrTN;
    }

    public final int HFYAaqMd6() {
        int Mjvvu5DE = Mjvvu5DE(this.jivtDDk9H);
        int i = this.jivtDDk9H;
        int[] iArr = this.Yi7zF1RB1;
        int i2 = Mjvvu5DE * 5;
        int i3 = iArr[i2 + 3] + i;
        this.jivtDDk9H = i3;
        this.mOu10nynGul = AvO7iQsrTN(iArr, Mjvvu5DE(i3));
        int i4 = this.Yi7zF1RB1[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void J3Xc8BaqpN8(int i, Object obj) {
        int Mjvvu5DE = Mjvvu5DE(i);
        int[] iArr = this.Yi7zF1RB1;
        if (Mjvvu5DE >= iArr.length || (iArr[(Mjvvu5DE * 5) + 1] & 1073741824) == 0) {
            we.GWasM1elztuh("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.X1lG3V04pd[encWxUiV2(AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE))] = obj;
    }

    public final void JFJ3QoxA() {
        ag0 ag0Var;
        boolean z = this.uFEq9NpZ > 0;
        int i = this.jivtDDk9H;
        int i2 = this.Y6hRI1cF8;
        int i3 = this.cilMamHF;
        int Mjvvu5DE = Mjvvu5DE(i3);
        int i4 = this.iwATDS1i01k;
        int i5 = i - i3;
        int i6 = Mjvvu5DE * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.Yi7zF1RB1[i7] & 1073741824) != 0;
        c30 c30Var = this.Mjvvu5DE;
        if (z) {
            rf0 rf0Var = this.mE4lRynR;
            if (rf0Var != null && (ag0Var = (ag0) rf0Var.Yi7zF1RB1(i3)) != null) {
                Object[] objArr = ag0Var.GWasM1elztuh;
                int i8 = ag0Var.Yi7zF1RB1;
                for (int i9 = 0; i9 < i8; i9++) {
                    AEn1Rrio(objArr[i9]);
                }
            }
            int[] iArr = this.Yi7zF1RB1;
            iArr[i6 + 3] = i5;
            b31.X1lG3V04pd(iArr, Mjvvu5DE, i4);
            int Yi7zF1RB1 = c30Var.Yi7zF1RB1();
            if (z2) {
                i4 = 1;
            }
            this.iwATDS1i01k = Yi7zF1RB1 + i4;
            int ozMwhSAI = ozMwhSAI(this.Yi7zF1RB1, i3);
            this.cilMamHF = ozMwhSAI;
            int WIEu4Ya2g8 = ozMwhSAI < 0 ? WIEu4Ya2g8() : Mjvvu5DE(ozMwhSAI + 1);
            int AvO7iQsrTN = WIEu4Ya2g8 >= 0 ? AvO7iQsrTN(this.Yi7zF1RB1, WIEu4Ya2g8) : 0;
            this.mOu10nynGul = AvO7iQsrTN;
            this.JFJ3QoxA = AvO7iQsrTN;
            return;
        }
        if (i != i2) {
            we.GWasM1elztuh("Expected to be at the end of a group");
        }
        int[] iArr2 = this.Yi7zF1RB1;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        b31.X1lG3V04pd(iArr2, Mjvvu5DE, i4);
        int Yi7zF1RB12 = this.WIEu4Ya2g8.Yi7zF1RB1();
        this.Y6hRI1cF8 = (iwATDS1i01k() - this.encWxUiV2) - this.YmKjaVtbfp5Z.Yi7zF1RB1();
        this.cilMamHF = Yi7zF1RB12;
        int ozMwhSAI2 = ozMwhSAI(this.Yi7zF1RB1, i3);
        int Yi7zF1RB13 = c30Var.Yi7zF1RB1();
        this.iwATDS1i01k = Yi7zF1RB13;
        if (ozMwhSAI2 == Yi7zF1RB12) {
            this.iwATDS1i01k = Yi7zF1RB13 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (ozMwhSAI2 != 0 && ozMwhSAI2 != Yi7zF1RB12 && (i14 != 0 || i13 != 0)) {
                int Mjvvu5DE2 = Mjvvu5DE(ozMwhSAI2);
                if (i13 != 0) {
                    int[] iArr3 = this.Yi7zF1RB1;
                    int i15 = (Mjvvu5DE2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.Yi7zF1RB1;
                    b31.X1lG3V04pd(iArr4, Mjvvu5DE2, (iArr4[(Mjvvu5DE2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.Yi7zF1RB1;
                if ((iArr5[(Mjvvu5DE2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                ozMwhSAI2 = ozMwhSAI(iArr5, ozMwhSAI2);
            }
        }
        this.iwATDS1i01k += i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.Yi7zF1RB1;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.d5.MjxSquD6Av(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.d5.MjxSquD6Av(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M3K9sHhK(int i) {
        lx lxVar;
        int i2;
        lx lxVar2;
        int i3;
        int i4;
        int i5 = this.encWxUiV2;
        int i6 = this.AvO7iQsrTN;
        if (i6 != i) {
            if (!this.xqGvceK5x.isEmpty()) {
                int iwATDS1i01k = iwATDS1i01k() - this.encWxUiV2;
                ArrayList arrayList = this.xqGvceK5x;
                if (i6 < i) {
                    for (int GWasM1elztuh = b31.GWasM1elztuh(arrayList, i6, iwATDS1i01k); GWasM1elztuh < this.xqGvceK5x.size() && (i3 = (lxVar2 = (lx) this.xqGvceK5x.get(GWasM1elztuh)).GWasM1elztuh) < 0 && (i4 = i3 + iwATDS1i01k) < i; GWasM1elztuh++) {
                        lxVar2.GWasM1elztuh = i4;
                    }
                } else {
                    for (int GWasM1elztuh2 = b31.GWasM1elztuh(arrayList, i, iwATDS1i01k); GWasM1elztuh2 < this.xqGvceK5x.size() && (i2 = (lxVar = (lx) this.xqGvceK5x.get(GWasM1elztuh2)).GWasM1elztuh) >= 0; GWasM1elztuh2++) {
                        lxVar.GWasM1elztuh = -(iwATDS1i01k - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iwATDS1i01k2 = iwATDS1i01k();
            if (i6 >= iwATDS1i01k2) {
                we.GWasM1elztuh("Check failed");
            }
            while (i6 < iwATDS1i01k2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.Yi7zF1RB1[i7];
                int WIEu4Ya2g8 = i8 > -2 ? i8 : (WIEu4Ya2g8() + i8) - (-2);
                if (WIEu4Ya2g8 >= i) {
                    WIEu4Ya2g8 = -((WIEu4Ya2g8() - WIEu4Ya2g8) - (-2));
                }
                if (WIEu4Ya2g8 != i8) {
                    this.Yi7zF1RB1[i7] = WIEu4Ya2g8;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.AvO7iQsrTN = i;
    }

    public final void MZhzXH72(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.E7jCp8Ls;
            int i5 = i + i2;
            k8h8IjolWQ(i5, i3);
            this.rQPn8YBR = i;
            this.E7jCp8Ls = i4 + i2;
            Arrays.fill(this.X1lG3V04pd, i, i5, (Object) null);
            int i6 = this.JFJ3QoxA;
            if (i6 >= i) {
                this.JFJ3QoxA = i6 - i2;
            }
        }
    }

    public final int Mjvvu5DE(int i) {
        return (this.encWxUiV2 * (i < this.AvO7iQsrTN ? 0 : 1)) + i;
    }

    public final void OOA6hdeuvCS(boolean z) {
        this.lv06NcmrQ = true;
        if (z && this.WIEu4Ya2g8.Yi7zF1RB1 == 0) {
            M3K9sHhK(WIEu4Ya2g8());
            k8h8IjolWQ(this.X1lG3V04pd.length - this.E7jCp8Ls, this.AvO7iQsrTN);
            int i = this.rQPn8YBR;
            Arrays.fill(this.X1lG3V04pd, i, this.E7jCp8Ls + i, (Object) null);
            YZjbz8VdP5();
        }
        int[] iArr = this.Yi7zF1RB1;
        int i2 = this.AvO7iQsrTN;
        Object[] objArr = this.X1lG3V04pd;
        int i3 = this.rQPn8YBR;
        ArrayList arrayList = this.xqGvceK5x;
        HashMap hashMap = this.OOA6hdeuvCS;
        rf0 rf0Var = this.EljAMC1QTz;
        z21 z21Var = this.GWasM1elztuh;
        if (!z21Var.rQPn8YBR) {
            tq0.GWasM1elztuh("Unexpected writer close()");
        }
        z21Var.rQPn8YBR = false;
        z21Var.OOA6hdeuvCS = iArr;
        z21Var.EljAMC1QTz = i2;
        z21Var.AvO7iQsrTN = objArr;
        z21Var.encWxUiV2 = i3;
        z21Var.XnEVoBF0td1l = arrayList;
        z21Var.uFEq9NpZ = hashMap;
        z21Var.iwATDS1i01k = rf0Var;
    }

    public final int TpUsjqg3bxO(int[] iArr, int i) {
        if (i >= iwATDS1i01k()) {
            return this.X1lG3V04pd.length - this.E7jCp8Ls;
        }
        int Yi7zF1RB1 = b31.Yi7zF1RB1(iArr, i);
        return Yi7zF1RB1 < 0 ? (this.X1lG3V04pd.length - this.E7jCp8Ls) + Yi7zF1RB1 + 1 : Yi7zF1RB1;
    }

    public final void VeqTn1PQw7() {
        if (this.uFEq9NpZ != 0) {
            we.GWasM1elztuh("Key must be supplied when inserting");
        }
        k61 k61Var = ue.GWasM1elztuh;
        z19UFEN2I(0, k61Var, false, k61Var);
    }

    public final int WIEu4Ya2g8() {
        return iwATDS1i01k() - this.encWxUiV2;
    }

    public final boolean WRKkgoJXwDn(int i) {
        return (this.Yi7zF1RB1[(Mjvvu5DE(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void WdrkLMV3xh(int i, int i2) {
        if (i > 0) {
            k8h8IjolWQ(this.mOu10nynGul, i2);
            int i3 = this.rQPn8YBR;
            int i4 = this.E7jCp8Ls;
            if (i4 < i) {
                Object[] objArr = this.X1lG3V04pd;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.X1lG3V04pd = objArr2;
                i4 = i7;
            }
            int i9 = this.JFJ3QoxA;
            if (i9 >= i3) {
                this.JFJ3QoxA = i9 + i;
            }
            this.rQPn8YBR = i3 + i;
            this.E7jCp8Ls = i4 - i;
        }
    }

    public final int X1lG3V04pd(lx lxVar) {
        int i = lxVar.GWasM1elztuh;
        return i < 0 ? WIEu4Ya2g8() + i : i;
    }

    public final void XnEVoBF0td1l(int i, int i2, int i3) {
        if (i >= this.AvO7iQsrTN) {
            i = -((WIEu4Ya2g8() - i) + 2);
        }
        while (i3 < i2) {
            this.Yi7zF1RB1[(Mjvvu5DE(i3) * 5) + 2] = i;
            int i4 = this.Yi7zF1RB1[(Mjvvu5DE(i3) * 5) + 3] + i3;
            XnEVoBF0td1l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int Y6hRI1cF8(int i) {
        return this.Yi7zF1RB1[(Mjvvu5DE(i) * 5) + 3];
    }

    public final lx YXi2hvwn7WL(int i) {
        ArrayList arrayList;
        int OOA6hdeuvCS;
        if (i < 0 || i >= WIEu4Ya2g8() || (OOA6hdeuvCS = b31.OOA6hdeuvCS((arrayList = this.xqGvceK5x), i, WIEu4Ya2g8())) < 0) {
            return null;
        }
        return (lx) arrayList.get(OOA6hdeuvCS);
    }

    public final void YZjbz8VdP5() {
        int i;
        qf0 qf0Var = this.WdrkLMV3xh;
        if (qf0Var != null) {
            while (qf0Var.Yi7zF1RB1 != 0) {
                int HFYAaqMd6 = b70.HFYAaqMd6(qf0Var);
                int Mjvvu5DE = Mjvvu5DE(HFYAaqMd6);
                int i2 = HFYAaqMd6 + 1;
                int Y6hRI1cF8 = Y6hRI1cF8(HFYAaqMd6) + HFYAaqMd6;
                while (true) {
                    if (i2 >= Y6hRI1cF8) {
                        i = 0;
                        break;
                    } else {
                        if ((this.Yi7zF1RB1[(Mjvvu5DE(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += Y6hRI1cF8(i2);
                    }
                }
                int[] iArr = this.Yi7zF1RB1;
                int i3 = (Mjvvu5DE * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int ozMwhSAI = ozMwhSAI(iArr, HFYAaqMd6);
                    if (ozMwhSAI >= 0) {
                        b70.rQPn8YBR(qf0Var, ozMwhSAI);
                    }
                }
            }
        }
    }

    public final lx Yi7zF1RB1(int i) {
        ArrayList arrayList = this.xqGvceK5x;
        int OOA6hdeuvCS = b31.OOA6hdeuvCS(arrayList, i, WIEu4Ya2g8());
        if (OOA6hdeuvCS >= 0) {
            return (lx) arrayList.get(OOA6hdeuvCS);
        }
        if (i > this.AvO7iQsrTN) {
            i = -(WIEu4Ya2g8() - i);
        }
        lx lxVar = new lx(i);
        arrayList.add(-(OOA6hdeuvCS + 1), lxVar);
        return lxVar;
    }

    public final Object YmKjaVtbfp5Z(int i) {
        int Mjvvu5DE = Mjvvu5DE(i);
        int[] iArr = this.Yi7zF1RB1;
        int i2 = (Mjvvu5DE * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return ue.GWasM1elztuh;
        }
        return this.X1lG3V04pd[Integer.bitCount(iArr[i2] >> 29) + AvO7iQsrTN(iArr, Mjvvu5DE)];
    }

    public final boolean cilMamHF(int i, int i2) {
        int iwATDS1i01k;
        int Y6hRI1cF8;
        if (i2 == this.cilMamHF) {
            iwATDS1i01k = this.Y6hRI1cF8;
        } else {
            c30 c30Var = this.WIEu4Ya2g8;
            if (i2 > c30Var.GWasM1elztuh(0)) {
                Y6hRI1cF8 = Y6hRI1cF8(i2);
            } else {
                int[] iArr = c30Var.GWasM1elztuh;
                int min = Math.min(iArr.length, c30Var.Yi7zF1RB1);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    Y6hRI1cF8 = Y6hRI1cF8(i2);
                } else {
                    iwATDS1i01k = (iwATDS1i01k() - this.encWxUiV2) - this.YmKjaVtbfp5Z.GWasM1elztuh[i3];
                }
            }
            iwATDS1i01k = Y6hRI1cF8 + i2;
        }
        return i > i2 && i < iwATDS1i01k;
    }

    public final sx dqB83aoLBB(int i) {
        lx YXi2hvwn7WL;
        HashMap hashMap = this.OOA6hdeuvCS;
        if (hashMap == null || (YXi2hvwn7WL = YXi2hvwn7WL(i)) == null) {
            return null;
        }
        return (sx) hashMap.get(YXi2hvwn7WL);
    }

    public final boolean eUH21U3apd() {
        if (this.uFEq9NpZ != 0) {
            we.GWasM1elztuh("Cannot remove group while inserting");
        }
        int i = this.jivtDDk9H;
        int i2 = this.mOu10nynGul;
        int AvO7iQsrTN = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i));
        int HFYAaqMd6 = HFYAaqMd6();
        dqB83aoLBB(this.cilMamHF);
        qf0 qf0Var = this.WdrkLMV3xh;
        if (qf0Var != null) {
            while (true) {
                int i3 = qf0Var.Yi7zF1RB1;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    o4.AvO7iQsrTN("IntList is empty.");
                    return false;
                }
                if (qf0Var.GWasM1elztuh[0] < i) {
                    break;
                }
                b70.HFYAaqMd6(qf0Var);
            }
        }
        boolean A1EKNP6CxJ = A1EKNP6CxJ(i, this.jivtDDk9H - i);
        MZhzXH72(AvO7iQsrTN, this.mOu10nynGul - AvO7iQsrTN, i - 1);
        this.jivtDDk9H = i;
        this.mOu10nynGul = i2;
        this.iwATDS1i01k -= HFYAaqMd6;
        return A1EKNP6CxJ;
    }

    public final int encWxUiV2(int i) {
        return (this.E7jCp8Ls * (i < this.rQPn8YBR ? 0 : 1)) + i;
    }

    public final int iwATDS1i01k() {
        return this.Yi7zF1RB1.length / 5;
    }

    public final Object jivtDDk9H(int i) {
        int Mjvvu5DE = Mjvvu5DE(i);
        int[] iArr = this.Yi7zF1RB1;
        int i2 = Mjvvu5DE * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.X1lG3V04pd[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void k8h8IjolWQ(int i, int i2) {
        int i3 = this.E7jCp8Ls;
        int i4 = this.rQPn8YBR;
        int i5 = this.XnEVoBF0td1l;
        if (i4 != i) {
            Object[] objArr = this.X1lG3V04pd;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, WIEu4Ya2g8());
        if (i5 != min) {
            int length = this.X1lG3V04pd.length - i3;
            if (min < i5) {
                int Mjvvu5DE = Mjvvu5DE(min);
                int Mjvvu5DE2 = Mjvvu5DE(i5);
                int i7 = this.AvO7iQsrTN;
                while (Mjvvu5DE < Mjvvu5DE2) {
                    int i8 = (Mjvvu5DE * 5) + 4;
                    int i9 = this.Yi7zF1RB1[i8];
                    if (i9 < 0) {
                        we.GWasM1elztuh("Unexpected anchor value, expected a positive anchor");
                    }
                    this.Yi7zF1RB1[i8] = -((length - i9) + 1);
                    Mjvvu5DE++;
                    if (Mjvvu5DE == i7) {
                        Mjvvu5DE += this.encWxUiV2;
                    }
                }
            } else {
                int Mjvvu5DE3 = Mjvvu5DE(i5);
                int Mjvvu5DE4 = Mjvvu5DE(min);
                while (Mjvvu5DE3 < Mjvvu5DE4) {
                    int i10 = (Mjvvu5DE3 * 5) + 4;
                    int i11 = this.Yi7zF1RB1[i10];
                    if (i11 >= 0) {
                        we.GWasM1elztuh("Unexpected anchor value, expected a negative anchor");
                    }
                    this.Yi7zF1RB1[i10] = i11 + length + 1;
                    Mjvvu5DE3++;
                    if (Mjvvu5DE3 == this.AvO7iQsrTN) {
                        Mjvvu5DE3 += this.encWxUiV2;
                    }
                }
            }
            this.XnEVoBF0td1l = min;
        }
        this.rQPn8YBR = i;
    }

    public final void lv06NcmrQ(int i) {
        if (i > 0) {
            int i2 = this.jivtDDk9H;
            M3K9sHhK(i2);
            int i3 = this.AvO7iQsrTN;
            int i4 = this.encWxUiV2;
            int[] iArr = this.Yi7zF1RB1;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                d5.MjxSquD6Av(iArr, iArr2, 0, 0, i3 * 5);
                d5.MjxSquD6Av(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.Yi7zF1RB1 = iArr2;
                i4 = i6;
            }
            int i7 = this.Y6hRI1cF8;
            if (i7 >= i3) {
                this.Y6hRI1cF8 = i7 + i;
            }
            int i8 = i3 + i;
            this.AvO7iQsrTN = i8;
            this.encWxUiV2 = i4 - i;
            int mOu10nynGul = mOu10nynGul(i5 > 0 ? EljAMC1QTz(i2 + i) : 0, this.XnEVoBF0td1l >= i3 ? this.rQPn8YBR : 0, this.E7jCp8Ls, this.X1lG3V04pd.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.Yi7zF1RB1[(i9 * 5) + 4] = mOu10nynGul;
            }
            int i10 = this.XnEVoBF0td1l;
            if (i10 >= i3) {
                this.XnEVoBF0td1l = i10 + i;
            }
        }
    }

    public final int mE4lRynR(int i) {
        return this.Yi7zF1RB1[Mjvvu5DE(i) * 5];
    }

    public final int ozMwhSAI(int[] iArr, int i) {
        int i2 = iArr[(Mjvvu5DE(i) * 5) + 2];
        return i2 > -2 ? i2 : (WIEu4Ya2g8() + i2) - (-2);
    }

    public final void pog2g9KITJA(z21 z21Var, int i) {
        if (this.uFEq9NpZ <= 0) {
            we.GWasM1elztuh("Check failed");
        }
        if (i == 0 && this.jivtDDk9H == 0 && this.GWasM1elztuh.EljAMC1QTz == 0) {
            int[] iArr = z21Var.OOA6hdeuvCS;
            int i2 = iArr[(i * 5) + 3];
            int i3 = z21Var.EljAMC1QTz;
            if (i2 == i3) {
                int[] iArr2 = this.Yi7zF1RB1;
                Object[] objArr = this.X1lG3V04pd;
                ArrayList arrayList = this.xqGvceK5x;
                HashMap hashMap = this.OOA6hdeuvCS;
                rf0 rf0Var = this.EljAMC1QTz;
                Object[] objArr2 = z21Var.AvO7iQsrTN;
                int i4 = z21Var.encWxUiV2;
                HashMap hashMap2 = z21Var.uFEq9NpZ;
                rf0 rf0Var2 = z21Var.iwATDS1i01k;
                this.Yi7zF1RB1 = iArr;
                this.X1lG3V04pd = objArr2;
                this.xqGvceK5x = z21Var.XnEVoBF0td1l;
                this.AvO7iQsrTN = i3;
                this.encWxUiV2 = (iArr.length / 5) - i3;
                this.rQPn8YBR = i4;
                this.E7jCp8Ls = objArr2.length - i4;
                this.XnEVoBF0td1l = i3;
                this.OOA6hdeuvCS = hashMap2;
                this.EljAMC1QTz = rf0Var2;
                z21Var.OOA6hdeuvCS = iArr2;
                z21Var.EljAMC1QTz = 0;
                z21Var.AvO7iQsrTN = objArr;
                z21Var.encWxUiV2 = 0;
                z21Var.XnEVoBF0td1l = arrayList;
                z21Var.uFEq9NpZ = hashMap;
                z21Var.iwATDS1i01k = rf0Var;
                return;
            }
        }
        c31 OOA6hdeuvCS = z21Var.OOA6hdeuvCS();
        try {
            l60.mE4lRynR(OOA6hdeuvCS, i, this, true, true, false);
            OOA6hdeuvCS.OOA6hdeuvCS(true);
        } catch (Throwable th) {
            OOA6hdeuvCS.OOA6hdeuvCS(false);
            throw th;
        }
    }

    public final void qugwajBSa59j(int i) {
        if (i >= 0) {
            qf0 qf0Var = this.WdrkLMV3xh;
            if (qf0Var == null) {
                qf0Var = new qf0();
                this.WdrkLMV3xh = qf0Var;
            }
            b70.rQPn8YBR(qf0Var, i);
        }
    }

    public final void rQPn8YBR() {
        if (this.uFEq9NpZ <= 0) {
            tq0.Yi7zF1RB1("Unbalanced begin/end insert");
        }
        int i = this.uFEq9NpZ - 1;
        this.uFEq9NpZ = i;
        if (i == 0) {
            if (this.Mjvvu5DE.Yi7zF1RB1 != this.WIEu4Ya2g8.Yi7zF1RB1) {
                we.GWasM1elztuh("startGroup/endGroup mismatch while inserting");
            }
            this.Y6hRI1cF8 = (iwATDS1i01k() - this.encWxUiV2) - this.YmKjaVtbfp5Z.Yi7zF1RB1();
        }
    }

    public final void rezfBrjOrqK() {
        int i = this.Y6hRI1cF8;
        this.jivtDDk9H = i;
        this.mOu10nynGul = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.jivtDDk9H + " end=" + this.Y6hRI1cF8 + " size = " + WIEu4Ya2g8() + " gap=" + this.AvO7iQsrTN + '-' + (this.AvO7iQsrTN + this.encWxUiV2) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uFEq9NpZ(int i, lv lvVar) {
        int i2;
        int i3;
        int i4;
        lv lvVar2 = lvVar;
        int ozMwhSAI = ozMwhSAI(this.Yi7zF1RB1, i);
        int WIEu4Ya2g8 = WIEu4Ya2g8();
        int Y6hRI1cF8 = Y6hRI1cF8(i) + i;
        int i5 = i;
        sf0 sf0Var = null;
        qf0 qf0Var = null;
        loop0: while (i5 < Y6hRI1cF8) {
            int EljAMC1QTz = EljAMC1QTz(i5);
            int i6 = i5 + 1;
            int EljAMC1QTz2 = EljAMC1QTz(i6);
            while (EljAMC1QTz < EljAMC1QTz2) {
                Object obj = this.X1lG3V04pd[encWxUiV2(EljAMC1QTz)];
                if (obj instanceof vx) {
                    vx vxVar = (vx) obj;
                    if (!(vxVar instanceof vx)) {
                        vxVar = null;
                    }
                    if (vxVar == null) {
                        we.Yi7zF1RB1("Inconsistent composition");
                        throw new vc();
                    }
                    int i7 = vxVar.Yi7zF1RB1;
                    if (i7 >= 0) {
                        int Y6hRI1cF82 = Y6hRI1cF8(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < Y6hRI1cF82 && i9 < i7) {
                            int Mjvvu5DE = Mjvvu5DE(i8);
                            int i10 = ozMwhSAI;
                            int[] iArr = this.Yi7zF1RB1;
                            int i11 = Mjvvu5DE * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < Y6hRI1cF82 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            ozMwhSAI = i10;
                        }
                        i4 = ozMwhSAI;
                        if (sf0Var == null) {
                            int[] iArr2 = a30.GWasM1elztuh;
                            sf0Var = new sf0();
                        }
                        if (qf0Var == null) {
                            qf0Var = new qf0();
                        }
                        sf0Var.GWasM1elztuh(i8);
                        qf0Var.GWasM1elztuh(i8);
                        qf0Var.GWasM1elztuh(EljAMC1QTz);
                        EljAMC1QTz++;
                        ozMwhSAI = i4;
                    }
                }
                i4 = ozMwhSAI;
                lvVar2.EljAMC1QTz(Integer.valueOf(EljAMC1QTz), obj);
                EljAMC1QTz++;
                ozMwhSAI = i4;
            }
            int i12 = ozMwhSAI;
            ozMwhSAI = i6 < WIEu4Ya2g8 ? ozMwhSAI(this.Yi7zF1RB1, i6) : -1;
            if (ozMwhSAI != i5) {
                int i13 = i12;
                while (true) {
                    if (qf0Var == null || sf0Var == null || !sf0Var.OOA6hdeuvCS(i5)) {
                        i2 = WIEu4Ya2g8;
                    } else {
                        int i14 = qf0Var.Yi7zF1RB1;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = WIEu4Ya2g8;
                            int Yi7zF1RB1 = qf0Var.Yi7zF1RB1(i18);
                            if (Yi7zF1RB1 == i5) {
                                int Yi7zF1RB12 = qf0Var.Yi7zF1RB1(i18 + 1);
                                lvVar2.EljAMC1QTz(Integer.valueOf(Yi7zF1RB12), this.X1lG3V04pd[encWxUiV2(Yi7zF1RB12)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                qf0Var.xqGvceK5x(i17, Yi7zF1RB1);
                                i17 += 2;
                                qf0Var.xqGvceK5x(i20, qf0Var.Yi7zF1RB1(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            lvVar2 = lvVar;
                            WIEu4Ya2g8 = i19;
                        }
                        i2 = WIEu4Ya2g8;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = qf0Var.Yi7zF1RB1) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                o4.mE4lRynR("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = qf0Var.GWasM1elztuh;
                                    d5.MjxSquD6Av(iArr3, iArr3, i17, i14, i3);
                                }
                                qf0Var.Yi7zF1RB1 -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != ozMwhSAI) {
                        i5 = i13;
                        WIEu4Ya2g8 = i2;
                        i13 = ozMwhSAI(this.Yi7zF1RB1, i13);
                        lvVar2 = lvVar;
                    }
                }
            } else {
                i2 = WIEu4Ya2g8;
            }
            lvVar2 = lvVar;
            i5 = i6;
            WIEu4Ya2g8 = i2;
        }
    }

    public final void xqGvceK5x() {
        int i = this.uFEq9NpZ;
        this.uFEq9NpZ = i + 1;
        if (i == 0) {
            this.YmKjaVtbfp5Z.X1lG3V04pd((iwATDS1i01k() - this.encWxUiV2) - this.Y6hRI1cF8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z19UFEN2I(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.cilMamHF;
        Object[] objArr = this.uFEq9NpZ > 0;
        this.Mjvvu5DE.X1lG3V04pd(this.iwATDS1i01k);
        k61 k61Var = ue.GWasM1elztuh;
        if (objArr == true) {
            int i4 = this.jivtDDk9H;
            int AvO7iQsrTN = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(i4));
            lv06NcmrQ(1);
            this.mOu10nynGul = AvO7iQsrTN;
            this.JFJ3QoxA = AvO7iQsrTN;
            int Mjvvu5DE = Mjvvu5DE(i4);
            int i5 = obj != k61Var ? 1 : 0;
            int i6 = (z || obj2 == k61Var) ? 0 : 1;
            int mOu10nynGul = mOu10nynGul(AvO7iQsrTN, this.rQPn8YBR, this.E7jCp8Ls, this.X1lG3V04pd.length);
            if (mOu10nynGul >= 0 && this.XnEVoBF0td1l < i4) {
                mOu10nynGul = -(((this.X1lG3V04pd.length - this.E7jCp8Ls) - mOu10nynGul) + 1);
            }
            int[] iArr = this.Yi7zF1RB1;
            int i7 = this.cilMamHF;
            int i8 = Mjvvu5DE * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = mOu10nynGul;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                WdrkLMV3xh(i9, i4);
                Object[] objArr2 = this.X1lG3V04pd;
                int i10 = this.mOu10nynGul;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.mOu10nynGul = i10;
            }
            this.iwATDS1i01k = 0;
            i2 = i4 + 1;
            this.cilMamHF = i4;
            this.jivtDDk9H = i2;
            if (i3 >= 0) {
                dqB83aoLBB(i3);
            }
        } else {
            this.WIEu4Ya2g8.X1lG3V04pd(i3);
            this.YmKjaVtbfp5Z.X1lG3V04pd((iwATDS1i01k() - this.encWxUiV2) - this.Y6hRI1cF8);
            int i11 = this.jivtDDk9H;
            int Mjvvu5DE2 = Mjvvu5DE(i11);
            if (!o30.rQPn8YBR(obj2, k61Var)) {
                if (z) {
                    J3Xc8BaqpN8(this.jivtDDk9H, obj2);
                } else {
                    CMh55RymNfS(obj2);
                }
            }
            this.mOu10nynGul = TpUsjqg3bxO(this.Yi7zF1RB1, Mjvvu5DE2);
            this.JFJ3QoxA = AvO7iQsrTN(this.Yi7zF1RB1, Mjvvu5DE(this.jivtDDk9H + 1));
            int[] iArr2 = this.Yi7zF1RB1;
            int i12 = Mjvvu5DE2 * 5;
            this.iwATDS1i01k = iArr2[i12 + 1] & 67108863;
            this.cilMamHF = i11;
            this.jivtDDk9H = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.Y6hRI1cF8 = i2;
    }
}
