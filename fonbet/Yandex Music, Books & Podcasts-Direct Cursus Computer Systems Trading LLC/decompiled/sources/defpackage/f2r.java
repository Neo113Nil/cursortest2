package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f2r implements Iterable, j9f {
    public static final f2r e = new f2r(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public f2r(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final f2r a(f2r f2rVar) {
        f2r f2rVar2;
        long j;
        long[] jArr;
        f2r f2rVar3 = e;
        if (f2rVar == f2rVar3) {
            return this;
        }
        if (this == f2rVar3) {
            return f2rVar3;
        }
        long j2 = f2rVar.c;
        long j3 = f2rVar.c;
        long[] jArr2 = f2rVar.d;
        long j4 = f2rVar.b;
        long j5 = f2rVar.a;
        long j6 = this.c;
        if (j2 == j6 && jArr2 == (jArr = this.d)) {
            return new f2r(this.a & (~j5), this.b & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            f2rVar2 = this;
            for (long j7 : jArr2) {
                f2rVar2 = f2rVar2.g(j7);
            }
        } else {
            f2rVar2 = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    f2rVar2 = f2rVar2.g(i + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    f2rVar2 = f2rVar2.g(i2 + j3 + 64);
                }
            }
        }
        return f2rVar2;
    }

    public final f2r g(long j) {
        long[] jArr;
        int s;
        long[] jArr2;
        long j2 = this.c;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.b;
            if ((j5 & j4) != 0) {
                return new f2r(this.a, j5 & (~j4), j2, this.d);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.a;
            if ((j7 & j6) != 0) {
                return new f2r(j7 & (~j6), this.b, j2, this.d);
            }
        } else if (j3 < 0 && (jArr = this.d) != null && (s = ezf.s(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (s > 0) {
                    uz0.g(jArr, jArr3, 0, 0, s);
                }
                if (s < i) {
                    uz0.g(jArr, jArr3, s, s + 1, length);
                }
                jArr2 = jArr3;
            }
            return new f2r(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dhp.a(new e2r(this, null));
    }

    public final boolean m(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (j2 < 0 || j2 >= 64) ? (j2 < 64 || j2 >= 128) ? j2 <= 0 && (jArr = this.d) != null && ezf.s(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final f2r o(f2r f2rVar) {
        f2r f2rVar2;
        f2r f2rVar3;
        long[] jArr;
        f2r f2rVar4 = e;
        if (f2rVar == f2rVar4) {
            return this;
        }
        if (this == f2rVar4) {
            return f2rVar;
        }
        long j = f2rVar.c;
        long j2 = f2rVar.c;
        long[] jArr2 = f2rVar.d;
        long j3 = f2rVar.b;
        long j4 = f2rVar.a;
        long j5 = this.c;
        long j6 = this.b;
        long j7 = this.a;
        if (j == j5 && jArr2 == (jArr = this.d)) {
            return new f2r(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                f2rVar2 = this;
                for (long j8 : jArr2) {
                    f2rVar2 = f2rVar2.q(j8);
                }
            } else {
                f2rVar2 = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        f2rVar2 = f2rVar2.q(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        f2rVar2 = f2rVar2.q(i + j2 + 64);
                    }
                    i++;
                }
            }
            return f2rVar2;
        }
        if (jArr3 != null) {
            f2rVar3 = f2rVar;
            for (long j9 : jArr3) {
                f2rVar3 = f2rVar3.q(j9);
            }
        } else {
            f2rVar3 = f2rVar;
        }
        long j10 = this.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    f2rVar3 = f2rVar3.q(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    f2rVar3 = f2rVar3.q(i + j10 + 64);
                }
                i++;
            }
        }
        return f2rVar3;
    }

    public final f2r q(long j) {
        long j2;
        long[] jArr;
        long j3;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j4 = this.c;
        long j5 = j - j4;
        long j6 = this.a;
        long j7 = this.b;
        long[] jArr5 = this.d;
        if (j5 < 0 || j5 >= 64) {
            int i = 64;
            if (j5 >= 64 && j5 < 128) {
                long j8 = 1 << (((int) j5) - 64);
                if ((j6 & j8) == 0) {
                    return new f2r(j8 | j6, j7, j4, jArr5);
                }
            } else if (j5 < 128) {
                if (jArr5 == null) {
                    return new f2r(j6, j7, j4, new long[]{j});
                }
                int s = ezf.s(jArr5, j);
                if (s < 0) {
                    int i2 = -(s + 1);
                    int length = jArr5.length;
                    long[] jArr6 = new long[length + 1];
                    uz0.g(jArr5, jArr6, 0, 0, i2);
                    uz0.g(jArr5, jArr6, i2 + 1, i2, length);
                    jArr6[i2] = j;
                    return new f2r(this.a, this.b, this.c, jArr6);
                }
            } else if (!m(j)) {
                long j9 = 64;
                long j10 = ((j + 1) / j9) * j9;
                if (j10 < 0) {
                    j10 = 9223372036854775680L;
                }
                long j11 = this.c;
                long j12 = j6;
                kpm kpmVar = null;
                while (true) {
                    if (j11 >= j10) {
                        j2 = j11;
                        jArr = jArr5;
                        j3 = j7;
                        break;
                    }
                    if (j7 != 0) {
                        if (kpmVar == null) {
                            kpmVar = new kpm(jArr5);
                        }
                        int i3 = 0;
                        while (i3 < i) {
                            if ((j7 & (1 << i3)) != 0) {
                                jArr4 = jArr5;
                                ((xoi) kpmVar.b).a(i3 + j11);
                            } else {
                                jArr4 = jArr5;
                            }
                            i3++;
                            jArr5 = jArr4;
                            i = 64;
                        }
                    }
                    long[] jArr7 = jArr5;
                    if (j12 == 0) {
                        j2 = j10;
                        j3 = 0;
                        jArr = jArr7;
                        break;
                    }
                    j11 += j9;
                    jArr5 = jArr7;
                    j7 = j12;
                    i = 64;
                    j12 = 0;
                }
                if (kpmVar != null) {
                    xoi xoiVar = (xoi) kpmVar.b;
                    int i4 = xoiVar.b;
                    if (i4 == 0) {
                        jArr3 = null;
                    } else {
                        jArr3 = new long[i4];
                        long[] jArr8 = xoiVar.a;
                        for (int i5 = 0; i5 < i4; i5++) {
                            jArr3[i5] = jArr8[i5];
                        }
                    }
                    if (jArr3 != null) {
                        jArr2 = jArr3;
                        return new f2r(j12, j3, j2, jArr2).q(j);
                    }
                }
                jArr2 = jArr;
                return new f2r(j12, j3, j2, jArr2).q(j);
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new f2r(j6, j7 | j13, j4, jArr5);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(v75.o(this, 10));
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
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
