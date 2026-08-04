package com.gamericefishpro.space.y0;

import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.t0.m1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i e = new i(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final com.gamericefishpro.space.a1.b c;
    public Object[] d;

    public i(int i, int i2, Object[] objArr, com.gamericefishpro.space.a1.b bVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar;
        this.d = objArr;
    }

    public static i j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, com.gamericefishpro.space.a1.b bVar) {
        if (i3 > 30) {
            return new i(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iE = com.gamericefishpro.space.u6.f.E(i, i3);
        int iE2 = com.gamericefishpro.space.u6.f.E(i2, i3);
        if (iE != iE2) {
            return new i((1 << iE) | (1 << iE2), 0, iE < iE2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new i(0, 1 << iE, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, com.gamericefishpro.space.a1.b bVar) {
        Object obj3 = this.d[i];
        i iVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, bVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        u.g(0, i, 6, objArr, objArr2);
        u.d(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = iVarJ;
        u.d(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, this.d.length));
        int i = aVarE.d;
        int i2 = aVarE.e;
        int i3 = aVarE.i;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.a(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        if (h(iE)) {
            return Intrinsics.a(obj, this.d[f(iE)]);
        }
        if (!i(iE)) {
            return false;
        }
        i iVarS = s(t(iE));
        return i2 == 30 ? iVarS.c(obj) : iVarS.d(i, i2 + 5, obj);
    }

    public final boolean e(i iVar) {
        if (this == iVar) {
            return true;
        }
        if (this.b == iVar.b && this.a == iVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == iVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (Intrinsics.a(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iE)) {
            return null;
        }
        i iVarS = s(t(iE));
        if (i2 != 30) {
            return iVarS.g(i, i2 + 5, obj);
        }
        kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
        int i3 = aVarE.d;
        int i4 = aVarE.e;
        int i5 = aVarE.i;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.a(obj, iVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return iVarS.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final i k(int i, com.gamericefishpro.space.b1.k kVar) {
        kVar.k(kVar.w - 1);
        kVar.i = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != kVar.d) {
            return new i(0, 0, com.gamericefishpro.space.u6.f.i(i, objArr), kVar.d);
        }
        this.d = com.gamericefishpro.space.u6.f.i(i, objArr);
        return this;
    }

    public final i l(int i, Object obj, Object obj2, int i2, com.gamericefishpro.space.b1.k kVar) {
        com.gamericefishpro.space.b1.k kVar2;
        i iVarL;
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        boolean zH = h(iE);
        com.gamericefishpro.space.a1.b bVar = this.c;
        if (zH) {
            int iF = f(iE);
            if (!Intrinsics.a(obj, this.d[iF])) {
                kVar.k(kVar.w + 1);
                com.gamericefishpro.space.a1.b bVar2 = kVar.d;
                if (bVar != bVar2) {
                    return new i(this.a ^ iE, this.b | iE, a(iF, iE, i, obj, obj2, i2, bVar2), bVar2);
                }
                this.d = a(iF, iE, i, obj, obj2, i2, bVar2);
                this.a ^= iE;
                this.b |= iE;
                return this;
            }
            kVar.i = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == kVar.d) {
                this.d[iF + 1] = obj2;
                return this;
            }
            kVar.v++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new i(this.a, this.b, objArrCopyOf, kVar.d);
        }
        if (!i(iE)) {
            kVar.k(kVar.w + 1);
            com.gamericefishpro.space.a1.b bVar3 = kVar.d;
            int iF2 = f(iE);
            if (bVar != bVar3) {
                return new i(this.a | iE, this.b, com.gamericefishpro.space.u6.f.h(this.d, iF2, obj, obj2), bVar3);
            }
            this.d = com.gamericefishpro.space.u6.f.h(this.d, iF2, obj, obj2);
            this.a |= iE;
            return this;
        }
        int iT = t(iE);
        i iVarS = s(iT);
        if (i2 == 30) {
            kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
            int i3 = aVarE.d;
            int i4 = aVarE.e;
            int i5 = aVarE.i;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.a(obj, iVarS.d[i3])) {
                        if (i3 == i4) {
                            kVar.k(kVar.w + 1);
                            iVarL = new i(0, 0, com.gamericefishpro.space.u6.f.h(iVarS.d, 0, obj, obj2), kVar.d);
                            break;
                        }
                        i3 += i5;
                    } else {
                        kVar.i = iVarS.x(i3);
                        if (iVarS.c != kVar.d) {
                            kVar.v++;
                            Object[] objArr2 = iVarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i3 + 1] = obj2;
                            iVarL = new i(0, 0, objArrCopyOf2, kVar.d);
                            break;
                        }
                        iVarS.d[i3 + 1] = obj2;
                        iVarL = iVarS;
                        break;
                    }
                }
            } else {
                kVar.k(kVar.w + 1);
                iVarL = new i(0, 0, com.gamericefishpro.space.u6.f.h(iVarS.d, 0, obj, obj2), kVar.d);
                break;
            }
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            iVarL = iVarS.l(i, obj, obj2, i2 + 5, kVar2);
        }
        return iVarS == iVarL ? this : r(iT, iVarL, kVar2.d);
    }

    public final i m(i iVar, int i, com.gamericefishpro.space.a1.a aVar, com.gamericefishpro.space.b1.k kVar) {
        i iVar2;
        Object[] objArr;
        i iVarJ;
        if (this == iVar) {
            aVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            com.gamericefishpro.space.a1.b bVar = kVar.d;
            int i3 = iVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + iVar.d.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVar.d.length));
            int i4 = aVarE.d;
            int i5 = aVarE.e;
            int i6 = aVarE.i;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(iVar.d[i4])) {
                        aVar.a++;
                    } else {
                        Object[] objArr3 = iVar.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == iVar.d.length) {
                    return iVar;
                }
                if (length == objArrCopyOf.length) {
                    return new i(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return new i(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i7 = this.b | iVar.b;
            int i8 = this.a;
            int i9 = iVar.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.a(this.d[f(iLowestOneBit)], iVar.d[iVar.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                m1.b("Check failed.");
            }
            if (Intrinsics.a(this.c, kVar.d) && this.a == i12 && this.b == i7) {
                iVar2 = this;
            } else {
                iVar2 = new i(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = iVar2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    iVarJ = s(t(iLowestOneBit2));
                    if (iVar.i(iLowestOneBit2)) {
                        iVarJ = iVarJ.m(iVar.s(iVar.t(iLowestOneBit2)), i + 5, aVar, kVar);
                        objArr = objArr4;
                    } else if (iVar.h(iLowestOneBit2)) {
                        int iF = iVar.f(iLowestOneBit2);
                        Object obj = iVar.d[iF];
                        Object objX = iVar.x(iF);
                        int i15 = kVar.w;
                        objArr = objArr4;
                        iVarJ = iVarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, kVar);
                        if (kVar.w == i15) {
                            aVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (iVar.i(iLowestOneBit2)) {
                        i iVarS = iVar.s(iVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (iVarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                aVar.a++;
                                iVarJ = iVarS;
                            } else {
                                iVarJ = iVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, kVar);
                            }
                        } else {
                            iVarJ = iVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = iVar.f(iLowestOneBit2);
                        Object obj4 = iVar.d[iF4];
                        iVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, iVar.x(iF4), i + 5, kVar.d);
                    }
                }
                objArr[length2] = iVarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (iVar.h(iLowestOneBit3)) {
                    int iF5 = iVar.f(iLowestOneBit3);
                    Object[] objArr5 = iVar2.d;
                    objArr5[i18] = iVar.d[iF5];
                    objArr5[i18 + 1] = iVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = iVar2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(iVar2)) {
                return iVar.e(iVar2) ? iVar : iVar2;
            }
        }
        return this;
    }

    public final i n(int i, Object obj, int i2, com.gamericefishpro.space.b1.k kVar) {
        i iVarN;
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (Intrinsics.a(obj, this.d[iF])) {
                return p(iF, iE, kVar);
            }
        } else if (i(iE)) {
            int iT = t(iE);
            i iVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
                int i3 = aVarE.d;
                int i4 = aVarE.e;
                int i5 = aVarE.i;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.a(obj, iVarS.d[i3])) {
                            if (i3 == i4) {
                                iVarN = iVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            iVarN = iVarS.k(i3, kVar);
                            break;
                        }
                    }
                } else {
                    iVarN = iVarS;
                    break;
                }
            } else {
                iVarN = iVarS.n(i, obj, i2 + 5, kVar);
            }
            return q(iVarS, iVarN, iT, iE, kVar.d);
        }
        return this;
    }

    public final i o(int i, Object obj, Object obj2, int i2, com.gamericefishpro.space.b1.k kVar) {
        i iVar;
        i iVarO;
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (Intrinsics.a(obj, this.d[iF]) && Intrinsics.a(obj2, x(iF))) {
                return p(iF, iE, kVar);
            }
        } else if (i(iE)) {
            int iT = t(iE);
            i iVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
                int i3 = aVarE.d;
                int i4 = aVarE.e;
                int i5 = aVarE.i;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.a(obj, iVarS.d[i3]) || !Intrinsics.a(obj2, iVarS.x(i3))) {
                            if (i3 == i4) {
                                iVarO = iVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            iVarO = iVarS.k(i3, kVar);
                            break;
                        }
                    }
                } else {
                    iVarO = iVarS;
                    break;
                }
                iVar = iVarS;
            } else {
                iVar = iVarS;
                iVarO = iVar.o(i, obj, obj2, i2 + 5, kVar);
            }
            return q(iVar, iVarO, iT, iE, kVar.d);
        }
        return this;
    }

    public final i p(int i, int i2, com.gamericefishpro.space.b1.k kVar) {
        kVar.k(kVar.w - 1);
        kVar.i = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != kVar.d) {
            return new i(i2 ^ this.a, this.b, com.gamericefishpro.space.u6.f.i(i, objArr), kVar.d);
        }
        this.d = com.gamericefishpro.space.u6.f.i(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final i q(i iVar, i iVar2, int i, int i2, com.gamericefishpro.space.a1.b bVar) {
        com.gamericefishpro.space.a1.b bVar2 = this.c;
        if (iVar2 != null) {
            return (bVar2 == bVar || iVar != iVar2) ? r(i, iVar2, bVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new i(this.a, i2 ^ this.b, com.gamericefishpro.space.u6.f.j(i, objArr), bVar);
        }
        this.d = com.gamericefishpro.space.u6.f.j(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final i r(int i, i iVar, com.gamericefishpro.space.a1.b bVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && iVar.d.length == 2 && iVar.b == 0) {
            iVar.a = this.b;
            return iVar;
        }
        if (this.c == bVar) {
            objArr[i] = iVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = iVar;
        return new i(this.a, this.b, objArrCopyOf, bVar);
    }

    public final i s(int i) {
        Object obj = this.d[i];
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (i) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r14.e = w(r12, r4, (com.gamericefishpro.space.y0.i) r14.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gamericefishpro.space.c2.c u(int i, int i2, Object obj, Object obj2) {
        com.gamericefishpro.space.c2.c cVarU;
        int i3 = 1;
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        int i4 = 0;
        if (h(iE)) {
            int iF = f(iE);
            if (!Intrinsics.a(obj, this.d[iF])) {
                return new com.gamericefishpro.space.c2.c(i3, new i(this.a ^ iE, this.b | iE, a(iF, iE, i, obj, obj2, i2, null), null));
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[iF + 1] = obj2;
                return new com.gamericefishpro.space.c2.c(i4, new i(this.a, this.b, objArrCopyOf, null));
            }
        } else {
            if (!i(iE)) {
                return new com.gamericefishpro.space.c2.c(i3, new i(this.a | iE, this.b, com.gamericefishpro.space.u6.f.h(this.d, f(iE), obj, obj2), null));
            }
            int iT = t(iE);
            i iVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
                int i5 = aVarE.d;
                int i6 = aVarE.e;
                int i7 = aVarE.i;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!Intrinsics.a(obj, iVarS.d[i5])) {
                            if (i5 == i6) {
                                cVarU = new com.gamericefishpro.space.c2.c(i3, new i(0, 0, com.gamericefishpro.space.u6.f.h(iVarS.d, 0, obj, obj2), null));
                                break;
                            }
                            i5 += i7;
                        } else {
                            if (obj2 != iVarS.x(i5)) {
                                Object[] objArr2 = iVarS.d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                                objArrCopyOf2[i5 + 1] = obj2;
                                cVarU = new com.gamericefishpro.space.c2.c(i4, new i(0, 0, objArrCopyOf2, null));
                                break;
                            }
                            cVarU = null;
                            break;
                        }
                    }
                } else {
                    cVarU = new com.gamericefishpro.space.c2.c(i3, new i(0, 0, com.gamericefishpro.space.u6.f.h(iVarS.d, 0, obj, obj2), null));
                    break;
                }
            } else {
                cVarU = iVarS.u(i, i2 + 5, obj, obj2);
            }
        }
        return null;
    }

    public final i v(int i, int i2, Object obj) {
        i iVarV;
        int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (Intrinsics.a(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new i(this.a ^ iE, this.b, com.gamericefishpro.space.u6.f.i(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iE)) {
            int iT = t(iE);
            i iVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarE = com.gamericefishpro.space.ji.f.e(com.gamericefishpro.space.ji.f.f(0, iVarS.d.length));
                int i3 = aVarE.d;
                int i4 = aVarE.e;
                int i5 = aVarE.i;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.a(obj, iVarS.d[i3])) {
                            if (i3 == i4) {
                                iVarV = iVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = iVarS.d;
                            if (objArr2.length != 2) {
                                iVarV = new i(0, 0, com.gamericefishpro.space.u6.f.i(i3, objArr2), null);
                                break;
                            }
                            iVarV = null;
                            break;
                        }
                    }
                } else {
                    iVarV = iVarS;
                    break;
                }
            } else {
                iVarV = iVarS.v(i, i2 + 5, obj);
            }
            if (iVarV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new i(this.a, iE ^ this.b, com.gamericefishpro.space.u6.f.j(iT, objArr3), null);
                }
                return null;
            }
            if (iVarS != iVarV) {
                return w(iT, iE, iVarV);
            }
        }
        return this;
    }

    public final i w(int i, int i2, i iVar) {
        Object[] objArr = iVar.d;
        if (objArr.length != 2 || iVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = iVar;
            return new i(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            iVar.a = this.b;
            return iVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        u.d(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        u.d(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new i(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
