package w0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements Iterable, qc.a {

    /* renamed from: k, reason: collision with root package name */
    public static final k f7570k = new k(0, 0, 0, null);

    /* renamed from: g, reason: collision with root package name */
    public final long f7571g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7572h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7573i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f7574j;

    public k(long j3, long j6, long j10, long[] jArr) {
        this.f7571g = j3;
        this.f7572h = j6;
        this.f7573i = j10;
        this.f7574j = jArr;
    }

    public final k a(k kVar) {
        k kVar2;
        long j3;
        long[] jArr;
        k kVar3 = f7570k;
        if (kVar == kVar3) {
            return this;
        }
        if (this == kVar3) {
            return kVar3;
        }
        long j6 = kVar.f7573i;
        long j10 = kVar.f7573i;
        long[] jArr2 = kVar.f7574j;
        long j11 = kVar.f7572h;
        long j12 = kVar.f7571g;
        long j13 = this.f7573i;
        if (j6 == j13 && jArr2 == (jArr = this.f7574j)) {
            return new k(this.f7571g & (~j12), this.f7572h & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            kVar2 = this;
            for (long j14 : jArr2) {
                kVar2 = kVar2.b(j14);
            }
        } else {
            kVar2 = this;
        }
        long j15 = 0;
        if (j11 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j11) != j15) {
                    j3 = j15;
                    kVar2 = kVar2.b(i10 + j10);
                } else {
                    j3 = j15;
                }
                i10++;
                j15 = j3;
            }
        }
        long j16 = j15;
        if (j12 != j16) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != j16) {
                    kVar2 = kVar2.b(i11 + j10 + 64);
                }
            }
        }
        return kVar2;
    }

    public final k b(long j3) {
        long[] jArr;
        int c3;
        long[] jArr2;
        long j6 = j3 - this.f7573i;
        long j10 = 0;
        if (pc.j.g(j6, j10) >= 0 && pc.j.g(j6, 64) < 0) {
            long j11 = 1 << ((int) j6);
            long j12 = this.f7572h;
            if ((j12 & j11) != 0) {
                return new k(this.f7571g, j12 & (~j11), this.f7573i, this.f7574j);
            }
        } else if (pc.j.g(j6, 64) >= 0 && pc.j.g(j6, 128) < 0) {
            long j13 = 1 << (((int) j6) - 64);
            long j14 = this.f7571g;
            if ((j14 & j13) != 0) {
                return new k(j14 & (~j13), this.f7572h, this.f7573i, this.f7574j);
            }
        } else if (pc.j.g(j6, j10) < 0 && (jArr = this.f7574j) != null && (c3 = r.c(jArr, j3)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (c3 > 0) {
                    bc.l.Q(jArr, jArr3, 0, 0, c3);
                }
                if (c3 < i10) {
                    bc.l.Q(jArr, jArr3, c3, c3 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f7571g, this.f7572h, this.f7573i, jArr2);
        }
        return this;
    }

    public final boolean c(long j3) {
        long[] jArr;
        long j6 = j3 - this.f7573i;
        long j10 = 0;
        return (pc.j.g(j6, j10) < 0 || pc.j.g(j6, (long) 64) >= 0) ? (pc.j.g(j6, (long) 64) < 0 || pc.j.g(j6, (long) 128) >= 0) ? pc.j.g(j6, j10) <= 0 && (jArr = this.f7574j) != null && r.c(jArr, j3) >= 0 : ((1 << (((int) j6) - 64)) & this.f7571g) != 0 : ((1 << ((int) j6)) & this.f7572h) != 0;
    }

    public final k d(k kVar) {
        k kVar2;
        k kVar3;
        long[] jArr;
        k kVar4 = f7570k;
        if (kVar == kVar4) {
            return this;
        }
        if (this == kVar4) {
            return kVar;
        }
        long j3 = kVar.f7573i;
        long j6 = kVar.f7573i;
        long[] jArr2 = kVar.f7574j;
        long j10 = kVar.f7572h;
        long j11 = kVar.f7571g;
        long j12 = this.f7573i;
        long j13 = this.f7572h;
        long j14 = this.f7571g;
        if (j3 == j12 && jArr2 == (jArr = this.f7574j)) {
            return new k(j14 | j11, j13 | j10, j12, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f7574j;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVar2 = this;
                for (long j15 : jArr2) {
                    kVar2 = kVar2.e(j15);
                }
            } else {
                kVar2 = this;
            }
            if (j10 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j10) != 0) {
                        kVar2 = kVar2.e(i11 + j6);
                    }
                }
            }
            if (j11 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j11) != 0) {
                        kVar2 = kVar2.e(i10 + j6 + 64);
                    }
                    i10++;
                }
            }
            return kVar2;
        }
        if (jArr3 != null) {
            kVar3 = kVar;
            for (long j16 : jArr3) {
                kVar3 = kVar3.e(j16);
            }
        } else {
            kVar3 = kVar;
        }
        long j17 = this.f7573i;
        if (j13 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j13) != 0) {
                    kVar3 = kVar3.e(i12 + j17);
                }
            }
        }
        if (j14 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j14) != 0) {
                    kVar3 = kVar3.e(i10 + j17 + 64);
                }
                i10++;
            }
        }
        return kVar3;
    }

    public final k e(long j3) {
        long[] jArr;
        long j6;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j10 = this.f7573i;
        long j11 = j3 - j10;
        long j12 = 0;
        int g8 = pc.j.g(j11, j12);
        long j13 = this.f7572h;
        int i10 = 64;
        long j14 = 0;
        if (g8 < 0 || pc.j.g(j11, 64) >= 0) {
            long j15 = 64;
            int g10 = pc.j.g(j11, j15);
            long j16 = this.f7571g;
            if (g10 < 0 || pc.j.g(j11, 128) >= 0) {
                long j17 = 128;
                int g11 = pc.j.g(j11, j17);
                long[] jArr5 = this.f7574j;
                if (g11 < 0) {
                    if (jArr5 == null) {
                        return new k(this.f7571g, this.f7572h, this.f7573i, new long[]{j3});
                    }
                    int c3 = r.c(jArr5, j3);
                    if (c3 < 0) {
                        int i11 = -(c3 + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        bc.l.Q(jArr5, jArr6, 0, 0, i11);
                        bc.l.Q(jArr5, jArr6, i11 + 1, i11, length);
                        jArr6[i11] = j3;
                        return new k(this.f7571g, this.f7572h, this.f7573i, jArr6);
                    }
                } else if (!c(j3)) {
                    long j18 = 1;
                    long j19 = ((j3 + j18) / j15) * j15;
                    if (pc.j.g(j19, j12) < 0) {
                        j19 = (Long.MAX_VALUE - j17) + j18;
                    }
                    long j20 = j10;
                    long j21 = j16;
                    m7.g gVar = null;
                    while (true) {
                        if (pc.j.g(j20, j19) >= 0) {
                            jArr = jArr5;
                            j6 = j20;
                            j14 = j13;
                            break;
                        }
                        if (j13 != 0) {
                            if (gVar == null) {
                                gVar = new m7.g(jArr5);
                            }
                            int i12 = 0;
                            while (i12 < i10) {
                                if ((j13 & (1 << i12)) != 0) {
                                    jArr4 = jArr5;
                                    ((s.w) gVar.f4957h).a(i12 + j20);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i12++;
                                jArr5 = jArr4;
                                i10 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j21 == 0) {
                            j6 = j19;
                            jArr = jArr7;
                            break;
                        }
                        j20 += j15;
                        jArr5 = jArr7;
                        j13 = j21;
                        i10 = 64;
                        j21 = 0;
                    }
                    if (gVar != null) {
                        s.w wVar = (s.w) gVar.f4957h;
                        int i13 = wVar.f6350b;
                        if (i13 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i13];
                            long[] jArr9 = wVar.f6349a;
                            for (int i14 = 0; i14 < i13; i14++) {
                                jArr8[i14] = jArr9[i14];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new k(j21, j14, j6, jArr2).e(j3);
                        }
                    }
                    jArr2 = jArr;
                    return new k(j21, j14, j6, jArr2).e(j3);
                }
            } else {
                long j22 = 1 << (((int) j11) - 64);
                if ((j16 & j22) == 0) {
                    return new k(j16 | j22, this.f7572h, this.f7573i, this.f7574j);
                }
            }
        } else {
            long j23 = 1 << ((int) j11);
            if ((j13 & j23) == 0) {
                return new k(this.f7571g, j13 | j23, this.f7573i, this.f7574j);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return uc.e.m(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(bc.o.O(this));
        Iterator it = iterator();
        while (true) {
            wc.f fVar = (wc.f) it;
            if (!fVar.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) fVar.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
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
