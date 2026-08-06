package defpackage;

/* loaded from: classes.dex */
public final class ua1 implements java.lang.Iterable, defpackage.g90 {
    public static final defpackage.ua1 riuEU0zW4 = new defpackage.ua1(0, 0, 0, null);
    public final long AARZUJiTa;
    public final long[] EXtogiMhuM;
    public final long adDC3e2L;
    public final long xiZrDbcSW0;

    public ua1(long j, long j2, long j3, long[] jArr) {
        this.adDC3e2L = j;
        this.xiZrDbcSW0 = j2;
        this.AARZUJiTa = j3;
        this.EXtogiMhuM = jArr;
    }

    public final defpackage.ua1 IHQe1A4L2xu(defpackage.ua1 ua1Var) {
        long[] jArr;
        defpackage.ua1 ua1Var2 = this;
        defpackage.ua1 ua1Var3 = riuEU0zW4;
        if (ua1Var == ua1Var3) {
            return ua1Var2;
        }
        if (ua1Var2 == ua1Var3) {
            return ua1Var3;
        }
        long j = ua1Var.AARZUJiTa;
        long j2 = ua1Var.AARZUJiTa;
        long[] jArr2 = ua1Var.EXtogiMhuM;
        long j3 = ua1Var.xiZrDbcSW0;
        long j4 = ua1Var.adDC3e2L;
        long j5 = ua1Var2.AARZUJiTa;
        if (j == j5 && jArr2 == (jArr = ua1Var2.EXtogiMhuM)) {
            return new defpackage.ua1(ua1Var2.adDC3e2L & (~j4), ua1Var2.xiZrDbcSW0 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                ua1Var2 = ua1Var2.oh6vYeIP(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    ua1Var2 = ua1Var2.oh6vYeIP(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    ua1Var2 = ua1Var2.oh6vYeIP(i2 + j2 + 64);
                }
            }
        }
        return ua1Var2;
    }

    public final defpackage.ua1 adDC3e2L(defpackage.ua1 ua1Var) {
        defpackage.ua1 ua1Var2;
        long[] jArr;
        defpackage.ua1 ua1Var3 = this;
        defpackage.ua1 ua1Var4 = riuEU0zW4;
        if (ua1Var == ua1Var4) {
            return ua1Var3;
        }
        if (ua1Var3 == ua1Var4) {
            return ua1Var;
        }
        long j = ua1Var.AARZUJiTa;
        long j2 = ua1Var.AARZUJiTa;
        long[] jArr2 = ua1Var.EXtogiMhuM;
        long j3 = ua1Var.xiZrDbcSW0;
        long j4 = ua1Var.adDC3e2L;
        long j5 = ua1Var3.AARZUJiTa;
        long j6 = ua1Var3.xiZrDbcSW0;
        long j7 = ua1Var3.adDC3e2L;
        if (j == j5 && jArr2 == (jArr = ua1Var3.EXtogiMhuM)) {
            return new defpackage.ua1(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = ua1Var3.EXtogiMhuM;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    ua1Var3 = ua1Var3.xiZrDbcSW0(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        ua1Var3 = ua1Var3.xiZrDbcSW0(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        ua1Var3 = ua1Var3.xiZrDbcSW0(i + j2 + 64);
                    }
                    i++;
                }
            }
            return ua1Var3;
        }
        if (jArr3 != null) {
            ua1Var2 = ua1Var;
            for (long j9 : jArr3) {
                ua1Var2 = ua1Var2.xiZrDbcSW0(j9);
            }
        } else {
            ua1Var2 = ua1Var;
        }
        long j10 = ua1Var3.AARZUJiTa;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    ua1Var2 = ua1Var2.xiZrDbcSW0(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    ua1Var2 = ua1Var2.xiZrDbcSW0(i + j10 + 64);
                }
                i++;
            }
        }
        return ua1Var2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.j70.PAEGRtP0bX(new defpackage.ta1(this, null));
    }

    public final defpackage.ua1 oh6vYeIP(long j) {
        long[] jArr;
        int SH1y5HwkJhh;
        long[] jArr2;
        long j2 = j - this.AARZUJiTa;
        if (defpackage.x70.V7bD7b8KA(j2, 0L) >= 0 && defpackage.x70.V7bD7b8KA(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.xiZrDbcSW0;
            if ((j4 & j3) != 0) {
                return new defpackage.ua1(this.adDC3e2L, j4 & (~j3), this.AARZUJiTa, this.EXtogiMhuM);
            }
        } else if (defpackage.x70.V7bD7b8KA(j2, 64L) >= 0 && defpackage.x70.V7bD7b8KA(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.adDC3e2L;
            if ((j6 & j5) != 0) {
                return new defpackage.ua1(j6 & (~j5), this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM);
            }
        } else if (defpackage.x70.V7bD7b8KA(j2, 0L) < 0 && (jArr = this.EXtogiMhuM) != null && (SH1y5HwkJhh = defpackage.s70.SH1y5HwkJhh(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (SH1y5HwkJhh > 0) {
                    defpackage.t6.EoOhNTTfIN7K(jArr, jArr3, 0, 0, SH1y5HwkJhh);
                }
                if (SH1y5HwkJhh < i) {
                    defpackage.t6.EoOhNTTfIN7K(jArr, jArr3, SH1y5HwkJhh, SH1y5HwkJhh + 1, length);
                }
                jArr2 = jArr3;
            }
            return new defpackage.ua1(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, jArr2);
        }
        return this;
    }

    public final boolean r1MBDhnF(long j) {
        long[] jArr;
        long j2 = j - this.AARZUJiTa;
        return (defpackage.x70.V7bD7b8KA(j2, 0L) < 0 || defpackage.x70.V7bD7b8KA(j2, 64L) >= 0) ? (defpackage.x70.V7bD7b8KA(j2, 64L) < 0 || defpackage.x70.V7bD7b8KA(j2, 128L) >= 0) ? defpackage.x70.V7bD7b8KA(j2, 0L) <= 0 && (jArr = this.EXtogiMhuM) != null && defpackage.s70.SH1y5HwkJhh(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.adDC3e2L) != 0 : ((1 << ((int) j2)) & this.xiZrDbcSW0) != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(this, 10));
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

    public final defpackage.ua1 xiZrDbcSW0(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.AARZUJiTa;
        long j6 = j - j5;
        long j7 = 0;
        int V7bD7b8KA = defpackage.x70.V7bD7b8KA(j6, 0L);
        long j8 = this.xiZrDbcSW0;
        if (V7bD7b8KA < 0 || defpackage.x70.V7bD7b8KA(j6, 64L) >= 0) {
            int V7bD7b8KA2 = defpackage.x70.V7bD7b8KA(j6, 64L);
            long j9 = this.adDC3e2L;
            int i2 = 64;
            if (V7bD7b8KA2 < 0 || defpackage.x70.V7bD7b8KA(j6, 128L) >= 0) {
                int V7bD7b8KA3 = defpackage.x70.V7bD7b8KA(j6, 128L);
                long[] jArr3 = this.EXtogiMhuM;
                if (V7bD7b8KA3 < 0) {
                    if (jArr3 == null) {
                        return new defpackage.ua1(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, new long[]{j});
                    }
                    int SH1y5HwkJhh = defpackage.s70.SH1y5HwkJhh(jArr3, j);
                    if (SH1y5HwkJhh < 0) {
                        int i3 = -(SH1y5HwkJhh + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        defpackage.t6.EoOhNTTfIN7K(jArr3, jArr4, 0, 0, i3);
                        defpackage.t6.EoOhNTTfIN7K(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new defpackage.ua1(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, jArr4);
                    }
                } else if (!r1MBDhnF(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (defpackage.x70.V7bD7b8KA(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    defpackage.sa1 sa1Var = null;
                    while (true) {
                        if (defpackage.x70.V7bD7b8KA(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (sa1Var == null) {
                                sa1Var = new defpackage.sa1(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((defpackage.al0) sa1Var.xiZrDbcSW0).IHQe1A4L2xu(i4 + j5);
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
                    if (sa1Var != null) {
                        defpackage.al0 al0Var = (defpackage.al0) sa1Var.xiZrDbcSW0;
                        int i5 = al0Var.oh6vYeIP;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = al0Var.IHQe1A4L2xu;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new defpackage.ua1(j11, j3, j2, jArr).xiZrDbcSW0(j);
                        }
                    }
                    jArr = jArr3;
                    return new defpackage.ua1(j11, j3, j2, jArr).xiZrDbcSW0(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new defpackage.ua1(j9 | j13, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new defpackage.ua1(this.adDC3e2L, j8 | j14, this.AARZUJiTa, this.EXtogiMhuM);
            }
        }
        return this;
    }
}
