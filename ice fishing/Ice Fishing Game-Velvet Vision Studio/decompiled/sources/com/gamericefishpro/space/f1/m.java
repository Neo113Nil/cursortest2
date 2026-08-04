package com.gamericefishpro.space.f1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, com.gamericefishpro.space.fi.a {
    public static final m w = new m(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long i;
    public final long[] v;

    public m(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.i = j3;
        this.v = jArr;
    }

    public final m b(m mVar) {
        m mVarC;
        long[] jArr;
        m mVar2 = w;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar2;
        }
        long j = mVar.i;
        long j2 = mVar.i;
        long[] jArr2 = mVar.v;
        long j3 = mVar.e;
        long j4 = mVar.d;
        long j5 = this.i;
        if (j == j5 && jArr2 == (jArr = this.v)) {
            return new m(this.d & (~j4), this.e & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            mVarC = this;
            for (long j6 : jArr2) {
                mVarC = mVarC.c(j6);
            }
        } else {
            mVarC = this;
        }
        long j7 = 0;
        if (j3 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j3) != j7) {
                    mVarC = mVarC.c(((long) i) + j2);
                }
                i++;
                j7 = j7;
            }
        }
        long j8 = j7;
        if (j4 != j8) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != j8) {
                    mVarC = mVarC.c(((long) i2) + j2 + ((long) 64));
                }
            }
        }
        return mVarC;
    }

    public final m c(long j) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j2 = j - this.i;
        long j3 = 0;
        if (Intrinsics.e(j2, j3) >= 0 && Intrinsics.e(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.e;
            if ((j5 & j4) != 0) {
                return new m(this.d, j5 & (~j4), this.i, this.v);
            }
        } else if (Intrinsics.e(j2, 64) >= 0 && Intrinsics.e(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.d;
            if ((j7 & j6) != 0) {
                return new m(j7 & (~j6), this.e, this.i, this.v);
            }
        } else if (Intrinsics.e(j2, j3) < 0 && (jArr = this.v) != null && (iC = v.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iC > 0) {
                    com.gamericefishpro.space.ph.u.e(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i) {
                    com.gamericefishpro.space.ph.u.e(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new m(this.d, this.e, this.i, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.i;
        long j3 = 0;
        if (Intrinsics.e(j2, j3) >= 0 && Intrinsics.e(j2, 64) < 0) {
            return ((1 << ((int) j2)) & this.e) != 0;
        }
        if (Intrinsics.e(j2, 64) < 0 || Intrinsics.e(j2, 128) >= 0) {
            return Intrinsics.e(j2, j3) <= 0 && (jArr = this.v) != null && v.c(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) - 64)) & this.d) != 0;
    }

    public final m f(m mVar) {
        m mVarH;
        m mVarH2;
        long[] jArr;
        m mVar2 = w;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar;
        }
        long j = mVar.i;
        long j2 = mVar.i;
        long[] jArr2 = mVar.v;
        long j3 = mVar.e;
        long j4 = mVar.d;
        long j5 = this.i;
        long j6 = this.e;
        long j7 = this.d;
        if (j == j5 && jArr2 == (jArr = this.v)) {
            return new m(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.v;
        if (jArr3 != null) {
            if (jArr2 != null) {
                mVarH = this;
                for (long j8 : jArr2) {
                    mVarH = mVarH.h(j8);
                }
            } else {
                mVarH = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        mVarH = mVarH.h(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        mVarH = mVarH.h(((long) i) + j2 + ((long) 64));
                    }
                    i++;
                }
            }
            return mVarH;
        }
        if (jArr3 != null) {
            mVarH2 = mVar;
            for (long j9 : jArr3) {
                mVarH2 = mVarH2.h(j9);
            }
        } else {
            mVarH2 = mVar;
        }
        long j10 = this.i;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    mVarH2 = mVarH2.h(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    mVarH2 = mVarH2.h(((long) i) + j10 + ((long) 64));
                }
                i++;
            }
        }
        return mVarH2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    public final m h(long j) {
        long[] jArr;
        long j2;
        long[] jArr2;
        long[] jArr3;
        long j3 = this.i;
        long j4 = j - j3;
        long j5 = 0;
        int iE = Intrinsics.e(j4, j5);
        long j6 = this.e;
        int i = 64;
        long j7 = 0;
        if (iE < 0 || Intrinsics.e(j4, 64) >= 0) {
            long j8 = 64;
            int iE2 = Intrinsics.e(j4, j8);
            long j9 = this.d;
            if (iE2 < 0 || Intrinsics.e(j4, 128) >= 0) {
                long j10 = 128;
                int iE3 = Intrinsics.e(j4, j10);
                long[] jArr4 = this.v;
                if (iE3 < 0) {
                    if (jArr4 == null) {
                        return new m(this.d, this.e, this.i, new long[]{j});
                    }
                    int iC = v.c(jArr4, j);
                    if (iC < 0) {
                        int i2 = -(iC + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        com.gamericefishpro.space.ph.u.e(jArr4, jArr5, 0, 0, i2);
                        com.gamericefishpro.space.ph.u.e(jArr4, jArr5, i2 + 1, i2, length);
                        jArr5[i2] = j;
                        return new m(this.d, this.e, this.i, jArr5);
                    }
                } else if (!d(j)) {
                    long j11 = 1;
                    long j12 = ((j + j11) / j8) * j8;
                    if (Intrinsics.e(j12, j5) < 0) {
                        j12 = (Long.MAX_VALUE - j10) + j11;
                    }
                    long j13 = j3;
                    long j14 = j9;
                    com.gamericefishpro.space.vb.c cVar = null;
                    while (true) {
                        if (Intrinsics.e(j13, j12) >= 0) {
                            jArr = jArr4;
                            j2 = j13;
                            j7 = j6;
                            break;
                        }
                        if (j6 != 0) {
                            if (cVar == null) {
                                cVar = new com.gamericefishpro.space.vb.c(jArr4);
                            }
                            int i3 = 0;
                            while (i3 < i) {
                                if ((j6 & (1 << i3)) != 0) {
                                    ((com.gamericefishpro.space.t.y) cVar.e).a(((long) i3) + j13);
                                }
                                i3++;
                                jArr4 = jArr4;
                                i = 64;
                            }
                        }
                        long[] jArr6 = jArr4;
                        if (j14 == 0) {
                            j2 = j12;
                            jArr = jArr6;
                            break;
                        }
                        j13 += j8;
                        jArr4 = jArr6;
                        j6 = j14;
                        i = 64;
                        j14 = 0;
                    }
                    if (cVar == null) {
                        jArr2 = jArr;
                    } else {
                        com.gamericefishpro.space.t.y yVar = (com.gamericefishpro.space.t.y) cVar.e;
                        int i4 = yVar.b;
                        if (i4 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr7 = new long[i4];
                            long[] jArr8 = yVar.a;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jArr7[i5] = jArr8[i5];
                            }
                            jArr3 = jArr7;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new m(j14, j7, j2, jArr2).h(j);
                }
            } else {
                long j15 = 1 << (((int) j4) - 64);
                if ((j9 & j15) == 0) {
                    return new m(j9 | j15, this.e, this.i, this.v);
                }
            }
        } else {
            long j16 = 1 << ((int) j4);
            if ((j6 & j16) == 0) {
                return new m(this.d, j6 | j16, this.i, this.v);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l block = new l(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return com.gamericefishpro.space.li.h.a(block);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(this, 10));
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
