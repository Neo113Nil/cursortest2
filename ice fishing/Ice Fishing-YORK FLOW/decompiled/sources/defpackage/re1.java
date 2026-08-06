package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class re1 implements java.lang.Iterable, defpackage.nb0 {
    public static final defpackage.re1 e6mdH7fiFuta = new defpackage.re1(0, 0, 0, null);
    public final long[] P05cfTpS5W5L;
    public final long QiMR8OkAhezm;
    public final long WDYagTQQm9ns;
    public final long oh71FJcDz6S2;

    public re1(long j, long j2, long j3, long[] jArr) {
        this.WDYagTQQm9ns = j;
        this.oh71FJcDz6S2 = j2;
        this.QiMR8OkAhezm = j3;
        this.P05cfTpS5W5L = jArr;
    }

    public final defpackage.re1 JhCgjQRTAOCT(defpackage.re1 re1Var) {
        defpackage.re1 re1Var2;
        long[] jArr;
        defpackage.re1 re1Var3 = this;
        defpackage.re1 re1Var4 = e6mdH7fiFuta;
        if (re1Var == re1Var4) {
            return re1Var3;
        }
        if (re1Var3 == re1Var4) {
            return re1Var;
        }
        long j = re1Var.QiMR8OkAhezm;
        long j2 = re1Var.QiMR8OkAhezm;
        long[] jArr2 = re1Var.P05cfTpS5W5L;
        long j3 = re1Var.oh71FJcDz6S2;
        long j4 = re1Var.WDYagTQQm9ns;
        long j5 = re1Var3.QiMR8OkAhezm;
        long j6 = re1Var3.oh71FJcDz6S2;
        long j7 = re1Var3.WDYagTQQm9ns;
        if (j == j5 && jArr2 == (jArr = re1Var3.P05cfTpS5W5L)) {
            return new defpackage.re1(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = re1Var3.P05cfTpS5W5L;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    re1Var3 = re1Var3.WDYagTQQm9ns(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        re1Var3 = re1Var3.WDYagTQQm9ns(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        re1Var3 = re1Var3.WDYagTQQm9ns(i + j2 + 64);
                    }
                    i++;
                }
            }
            return re1Var3;
        }
        if (jArr3 != null) {
            re1Var2 = re1Var;
            for (long j9 : jArr3) {
                re1Var2 = re1Var2.WDYagTQQm9ns(j9);
            }
        } else {
            re1Var2 = re1Var;
        }
        long j10 = re1Var3.QiMR8OkAhezm;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    re1Var2 = re1Var2.WDYagTQQm9ns(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    re1Var2 = re1Var2.WDYagTQQm9ns(i + j10 + 64);
                }
                i++;
            }
        }
        return re1Var2;
    }

    public final defpackage.re1 WDYagTQQm9ns(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.QiMR8OkAhezm;
        long j6 = j - j5;
        long j7 = 0;
        int h3m55N1URyyK = defpackage.ma0.h3m55N1URyyK(j6, 0L);
        long j8 = this.oh71FJcDz6S2;
        if (h3m55N1URyyK < 0 || defpackage.ma0.h3m55N1URyyK(j6, 64L) >= 0) {
            int h3m55N1URyyK2 = defpackage.ma0.h3m55N1URyyK(j6, 64L);
            long j9 = this.WDYagTQQm9ns;
            int i2 = 64;
            if (h3m55N1URyyK2 < 0 || defpackage.ma0.h3m55N1URyyK(j6, 128L) >= 0) {
                int h3m55N1URyyK3 = defpackage.ma0.h3m55N1URyyK(j6, 128L);
                long[] jArr3 = this.P05cfTpS5W5L;
                if (h3m55N1URyyK3 < 0) {
                    if (jArr3 == null) {
                        return new defpackage.re1(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, new long[]{j});
                    }
                    int h3m55N1URyyK4 = defpackage.wc1.h3m55N1URyyK(jArr3, j);
                    if (h3m55N1URyyK4 < 0) {
                        int i3 = -(h3m55N1URyyK4 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        defpackage.y7.omM9cAlgeGXx(jArr3, jArr4, 0, 0, i3);
                        defpackage.y7.omM9cAlgeGXx(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new defpackage.re1(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, jArr4);
                    }
                } else if (!fWTAfUmVKrZq(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (defpackage.ma0.h3m55N1URyyK(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    defpackage.k0 k0Var = null;
                    while (true) {
                        if (defpackage.ma0.h3m55N1URyyK(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (k0Var == null) {
                                k0Var = new defpackage.k0(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((defpackage.jn0) k0Var.oh71FJcDz6S2).ZpBGe2uQfcn8(i4 + j5);
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
                    if (k0Var != null) {
                        defpackage.jn0 jn0Var = (defpackage.jn0) k0Var.oh71FJcDz6S2;
                        int i5 = jn0Var.giKS3J6vZuNy;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = jn0Var.ZpBGe2uQfcn8;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new defpackage.re1(j11, j3, j2, jArr).WDYagTQQm9ns(j);
                        }
                    }
                    jArr = jArr3;
                    return new defpackage.re1(j11, j3, j2, jArr).WDYagTQQm9ns(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new defpackage.re1(j9 | j13, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new defpackage.re1(this.WDYagTQQm9ns, j8 | j14, this.QiMR8OkAhezm, this.P05cfTpS5W5L);
            }
        }
        return this;
    }

    public final defpackage.re1 ZpBGe2uQfcn8(defpackage.re1 re1Var) {
        long[] jArr;
        defpackage.re1 re1Var2 = this;
        defpackage.re1 re1Var3 = e6mdH7fiFuta;
        if (re1Var == re1Var3) {
            return re1Var2;
        }
        if (re1Var2 == re1Var3) {
            return re1Var3;
        }
        long j = re1Var.QiMR8OkAhezm;
        long j2 = re1Var.QiMR8OkAhezm;
        long[] jArr2 = re1Var.P05cfTpS5W5L;
        long j3 = re1Var.oh71FJcDz6S2;
        long j4 = re1Var.WDYagTQQm9ns;
        long j5 = re1Var2.QiMR8OkAhezm;
        if (j == j5 && jArr2 == (jArr = re1Var2.P05cfTpS5W5L)) {
            return new defpackage.re1(re1Var2.WDYagTQQm9ns & (~j4), re1Var2.oh71FJcDz6S2 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                re1Var2 = re1Var2.giKS3J6vZuNy(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    re1Var2 = re1Var2.giKS3J6vZuNy(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    re1Var2 = re1Var2.giKS3J6vZuNy(i2 + j2 + 64);
                }
            }
        }
        return re1Var2;
    }

    public final boolean fWTAfUmVKrZq(long j) {
        long[] jArr;
        long j2 = j - this.QiMR8OkAhezm;
        return (defpackage.ma0.h3m55N1URyyK(j2, 0L) < 0 || defpackage.ma0.h3m55N1URyyK(j2, 64L) >= 0) ? (defpackage.ma0.h3m55N1URyyK(j2, 64L) < 0 || defpackage.ma0.h3m55N1URyyK(j2, 128L) >= 0) ? defpackage.ma0.h3m55N1URyyK(j2, 0L) <= 0 && (jArr = this.P05cfTpS5W5L) != null && defpackage.wc1.h3m55N1URyyK(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.WDYagTQQm9ns) != 0 : ((1 << ((int) j2)) & this.oh71FJcDz6S2) != 0;
    }

    public final defpackage.re1 giKS3J6vZuNy(long j) {
        long[] jArr;
        int h3m55N1URyyK;
        long[] jArr2;
        long j2 = j - this.QiMR8OkAhezm;
        if (defpackage.ma0.h3m55N1URyyK(j2, 0L) >= 0 && defpackage.ma0.h3m55N1URyyK(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.oh71FJcDz6S2;
            if ((j4 & j3) != 0) {
                return new defpackage.re1(this.WDYagTQQm9ns, j4 & (~j3), this.QiMR8OkAhezm, this.P05cfTpS5W5L);
            }
        } else if (defpackage.ma0.h3m55N1URyyK(j2, 64L) >= 0 && defpackage.ma0.h3m55N1URyyK(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.WDYagTQQm9ns;
            if ((j6 & j5) != 0) {
                return new defpackage.re1(j6 & (~j5), this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L);
            }
        } else if (defpackage.ma0.h3m55N1URyyK(j2, 0L) < 0 && (jArr = this.P05cfTpS5W5L) != null && (h3m55N1URyyK = defpackage.wc1.h3m55N1URyyK(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (h3m55N1URyyK > 0) {
                    defpackage.y7.omM9cAlgeGXx(jArr, jArr3, 0, 0, h3m55N1URyyK);
                }
                if (h3m55N1URyyK < i) {
                    defpackage.y7.omM9cAlgeGXx(jArr, jArr3, h3m55N1URyyK, h3m55N1URyyK + 1, length);
                }
                jArr2 = jArr3;
            }
            return new defpackage.re1(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.v70.blKFvluuDQOf(new defpackage.qe1(this, null));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((java.lang.CharSequence) ", ");
            }
            if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb2.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb2.append(((java.lang.Character) obj).charValue());
            } else {
                sb2.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb2.append((java.lang.CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
