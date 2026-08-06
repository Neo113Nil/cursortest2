package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c41 implements Iterable, q40 {
    public static final c41 mOu10nynGul = new c41(0, 0, 0, null);
    public final long AvO7iQsrTN;
    public final long EljAMC1QTz;
    public final long OOA6hdeuvCS;
    public final long[] encWxUiV2;

    public c41(long j, long j2, long j3, long[] jArr) {
        this.OOA6hdeuvCS = j;
        this.EljAMC1QTz = j2;
        this.AvO7iQsrTN = j3;
        this.encWxUiV2 = jArr;
    }

    public final c41 EljAMC1QTz(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.AvO7iQsrTN;
        long j6 = j - j5;
        long j7 = 0;
        int iwATDS1i01k = o30.iwATDS1i01k(j6, 0L);
        long j8 = this.EljAMC1QTz;
        if (iwATDS1i01k < 0 || o30.iwATDS1i01k(j6, 64L) >= 0) {
            int iwATDS1i01k2 = o30.iwATDS1i01k(j6, 64L);
            long j9 = this.OOA6hdeuvCS;
            int i2 = 64;
            if (iwATDS1i01k2 < 0 || o30.iwATDS1i01k(j6, 128L) >= 0) {
                int iwATDS1i01k3 = o30.iwATDS1i01k(j6, 128L);
                long[] jArr3 = this.encWxUiV2;
                if (iwATDS1i01k3 < 0) {
                    if (jArr3 == null) {
                        return new c41(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, new long[]{j});
                    }
                    int X1lG3V04pd = o50.X1lG3V04pd(jArr3, j);
                    if (X1lG3V04pd < 0) {
                        int i3 = -(X1lG3V04pd + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        d5.Uxq83abb04(jArr3, jArr4, 0, 0, i3);
                        d5.Uxq83abb04(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new c41(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, jArr4);
                    }
                } else if (!X1lG3V04pd(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (o30.iwATDS1i01k(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    j6IIN2O8eOU j6iin2o8eou = null;
                    while (true) {
                        if (o30.iwATDS1i01k(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (j6iin2o8eou == null) {
                                j6iin2o8eou = new j6IIN2O8eOU(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((uf0) j6iin2o8eou.EljAMC1QTz).GWasM1elztuh(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (j6iin2o8eou != null) {
                        uf0 uf0Var = (uf0) j6iin2o8eou.EljAMC1QTz;
                        int i5 = uf0Var.Yi7zF1RB1;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = uf0Var.GWasM1elztuh;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new c41(j11, j3, j2, jArr).EljAMC1QTz(j);
                        }
                    }
                    jArr = jArr3;
                    return new c41(j11, j3, j2, jArr).EljAMC1QTz(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new c41(j9 | j13, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new c41(this.OOA6hdeuvCS, j8 | j14, this.AvO7iQsrTN, this.encWxUiV2);
            }
        }
        return this;
    }

    public final c41 GWasM1elztuh(c41 c41Var) {
        long[] jArr;
        c41 c41Var2 = this;
        c41 c41Var3 = mOu10nynGul;
        if (c41Var == c41Var3) {
            return c41Var2;
        }
        if (c41Var2 == c41Var3) {
            return c41Var3;
        }
        long j = c41Var.AvO7iQsrTN;
        long j2 = c41Var.AvO7iQsrTN;
        long[] jArr2 = c41Var.encWxUiV2;
        long j3 = c41Var.EljAMC1QTz;
        long j4 = c41Var.OOA6hdeuvCS;
        long j5 = c41Var2.AvO7iQsrTN;
        if (j == j5 && jArr2 == (jArr = c41Var2.encWxUiV2)) {
            return new c41(c41Var2.OOA6hdeuvCS & (~j4), c41Var2.EljAMC1QTz & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c41Var2 = c41Var2.Yi7zF1RB1(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c41Var2 = c41Var2.Yi7zF1RB1(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c41Var2 = c41Var2.Yi7zF1RB1(i2 + j2 + 64);
                }
            }
        }
        return c41Var2;
    }

    public final c41 OOA6hdeuvCS(c41 c41Var) {
        c41 c41Var2;
        long[] jArr;
        c41 c41Var3 = this;
        c41 c41Var4 = mOu10nynGul;
        if (c41Var == c41Var4) {
            return c41Var3;
        }
        if (c41Var3 == c41Var4) {
            return c41Var;
        }
        long j = c41Var.AvO7iQsrTN;
        long j2 = c41Var.AvO7iQsrTN;
        long[] jArr2 = c41Var.encWxUiV2;
        long j3 = c41Var.EljAMC1QTz;
        long j4 = c41Var.OOA6hdeuvCS;
        long j5 = c41Var3.AvO7iQsrTN;
        long j6 = c41Var3.EljAMC1QTz;
        long j7 = c41Var3.OOA6hdeuvCS;
        if (j == j5 && jArr2 == (jArr = c41Var3.encWxUiV2)) {
            return new c41(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = c41Var3.encWxUiV2;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c41Var3 = c41Var3.EljAMC1QTz(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c41Var3 = c41Var3.EljAMC1QTz(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c41Var3 = c41Var3.EljAMC1QTz(i + j2 + 64);
                    }
                    i++;
                }
            }
            return c41Var3;
        }
        if (jArr3 != null) {
            c41Var2 = c41Var;
            for (long j9 : jArr3) {
                c41Var2 = c41Var2.EljAMC1QTz(j9);
            }
        } else {
            c41Var2 = c41Var;
        }
        long j10 = c41Var3.AvO7iQsrTN;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c41Var2 = c41Var2.EljAMC1QTz(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c41Var2 = c41Var2.EljAMC1QTz(i + j10 + 64);
                }
                i++;
            }
        }
        return c41Var2;
    }

    public final boolean X1lG3V04pd(long j) {
        long[] jArr;
        long j2 = j - this.AvO7iQsrTN;
        return (o30.iwATDS1i01k(j2, 0L) < 0 || o30.iwATDS1i01k(j2, 64L) >= 0) ? (o30.iwATDS1i01k(j2, 64L) < 0 || o30.iwATDS1i01k(j2, 128L) >= 0) ? o30.iwATDS1i01k(j2, 0L) <= 0 && (jArr = this.encWxUiV2) != null && o50.X1lG3V04pd(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.OOA6hdeuvCS) != 0 : ((1 << ((int) j2)) & this.EljAMC1QTz) != 0;
    }

    public final c41 Yi7zF1RB1(long j) {
        long[] jArr;
        int X1lG3V04pd;
        long[] jArr2;
        long j2 = j - this.AvO7iQsrTN;
        if (o30.iwATDS1i01k(j2, 0L) >= 0 && o30.iwATDS1i01k(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.EljAMC1QTz;
            if ((j4 & j3) != 0) {
                return new c41(this.OOA6hdeuvCS, j4 & (~j3), this.AvO7iQsrTN, this.encWxUiV2);
            }
        } else if (o30.iwATDS1i01k(j2, 64L) >= 0 && o30.iwATDS1i01k(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.OOA6hdeuvCS;
            if ((j6 & j5) != 0) {
                return new c41(j6 & (~j5), this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2);
            }
        } else if (o30.iwATDS1i01k(j2, 0L) < 0 && (jArr = this.encWxUiV2) != null && (X1lG3V04pd = o50.X1lG3V04pd(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (X1lG3V04pd > 0) {
                    d5.Uxq83abb04(jArr, jArr3, 0, 0, X1lG3V04pd);
                }
                if (X1lG3V04pd < i) {
                    d5.Uxq83abb04(jArr, jArr3, X1lG3V04pd, X1lG3V04pd + 1, length);
                }
                jArr2 = jArr3;
            }
            return new c41(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return q70.Y6hRI1cF8(new b41(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
