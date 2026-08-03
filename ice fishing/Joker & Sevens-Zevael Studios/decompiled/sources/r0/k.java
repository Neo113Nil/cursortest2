package r0;

import java.util.Arrays;
import m0.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f5916e = new k(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f5917a;

    /* renamed from: b, reason: collision with root package name */
    public int f5918b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.b f5919c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5920d;

    public k(int i10, int i11, Object[] objArr, t0.b bVar) {
        this.f5917a = i10;
        this.f5918b = i11;
        this.f5919c = bVar;
        this.f5920d = objArr;
    }

    public static k j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, t0.b bVar) {
        if (i12 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int B = a.a.B(i10, i12);
        int B2 = a.a.B(i11, i12);
        if (B != B2) {
            return new k((1 << B) | (1 << B2), 0, B < B2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << B, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, t0.b bVar) {
        Object obj3 = this.f5920d[i10];
        k j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int t3 = t(i11);
        int i14 = t3 + 1;
        Object[] objArr = this.f5920d;
        Object[] objArr2 = new Object[objArr.length - 1];
        bc.l.T(objArr, objArr2, 0, i10, 6);
        bc.l.R(objArr, objArr2, i10, i10 + 2, i14);
        objArr2[t3 - 1] = j3;
        bc.l.R(objArr, objArr2, t3, i14, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f5918b == 0) {
            return this.f5920d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f5917a);
        int length = this.f5920d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += s(i10).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        uc.b p8 = uc.e.p(uc.e.q(0, this.f5920d.length));
        int i10 = p8.f6735g;
        int i11 = p8.f6736h;
        int i12 = p8.f6737i;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!pc.j.a(obj, this.f5920d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int B = 1 << a.a.B(i10, i11);
        if (h(B)) {
            return pc.j.a(obj, this.f5920d[f(B)]);
        }
        if (!i(B)) {
            return false;
        }
        k s10 = s(t(B));
        return i11 == 30 ? s10.c(obj) : s10.d(i10, i11 + 5, obj);
    }

    public final boolean e(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.f5918b == kVar.f5918b && this.f5917a == kVar.f5917a) {
            int length = this.f5920d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f5920d[i10] == kVar.f5920d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f5917a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int B = 1 << a.a.B(i10, i11);
        if (h(B)) {
            int f10 = f(B);
            if (pc.j.a(obj, this.f5920d[f10])) {
                return x(f10);
            }
            return null;
        }
        if (!i(B)) {
            return null;
        }
        k s10 = s(t(B));
        if (i11 != 30) {
            return s10.g(i10, i11 + 5, obj);
        }
        uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
        int i12 = p8.f6735g;
        int i13 = p8.f6736h;
        int i14 = p8.f6737i;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!pc.j.a(obj, s10.f5920d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return s10.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f5917a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f5918b) != 0;
    }

    public final k k(int i10, u0.h hVar) {
        hVar.e(hVar.f6676k - 1);
        hVar.f6674i = x(i10);
        Object[] objArr = this.f5920d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5919c != hVar.f6672g) {
            return new k(0, 0, a.a.g(i10, objArr), hVar.f6672g);
        }
        this.f5920d = a.a.g(i10, objArr);
        return this;
    }

    public final k l(int i10, Object obj, Object obj2, int i11, u0.h hVar) {
        u0.h hVar2;
        k l10;
        int B = 1 << a.a.B(i10, i11);
        boolean h10 = h(B);
        t0.b bVar = this.f5919c;
        if (h10) {
            int f10 = f(B);
            if (!pc.j.a(obj, this.f5920d[f10])) {
                hVar.e(hVar.f6676k + 1);
                t0.b bVar2 = hVar.f6672g;
                if (bVar != bVar2) {
                    return new k(this.f5917a ^ B, this.f5918b | B, a(f10, B, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f5920d = a(f10, B, i10, obj, obj2, i11, bVar2);
                this.f5917a ^= B;
                this.f5918b |= B;
                return this;
            }
            hVar.f6674i = x(f10);
            if (x(f10) == obj2) {
                return this;
            }
            if (bVar == hVar.f6672g) {
                this.f5920d[f10 + 1] = obj2;
                return this;
            }
            hVar.f6675j++;
            Object[] objArr = this.f5920d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            pc.j.d(copyOf, "copyOf(...)");
            copyOf[f10 + 1] = obj2;
            return new k(this.f5917a, this.f5918b, copyOf, hVar.f6672g);
        }
        if (!i(B)) {
            hVar.e(hVar.f6676k + 1);
            t0.b bVar3 = hVar.f6672g;
            int f11 = f(B);
            if (bVar != bVar3) {
                return new k(this.f5917a | B, this.f5918b, a.a.f(this.f5920d, f11, obj, obj2), bVar3);
            }
            this.f5920d = a.a.f(this.f5920d, f11, obj, obj2);
            this.f5917a |= B;
            return this;
        }
        int t3 = t(B);
        k s10 = s(t3);
        if (i11 == 30) {
            uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
            int i12 = p8.f6735g;
            int i13 = p8.f6736h;
            int i14 = p8.f6737i;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (!pc.j.a(obj, s10.f5920d[i12])) {
                    if (i12 != i13) {
                        i12 += i14;
                    }
                }
                hVar.f6674i = s10.x(i12);
                if (s10.f5919c == hVar.f6672g) {
                    s10.f5920d[i12 + 1] = obj2;
                    l10 = s10;
                } else {
                    hVar.f6675j++;
                    Object[] objArr2 = s10.f5920d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    pc.j.d(copyOf2, "copyOf(...)");
                    copyOf2[i12 + 1] = obj2;
                    l10 = new k(0, 0, copyOf2, hVar.f6672g);
                }
                hVar2 = hVar;
            }
            hVar.e(hVar.f6676k + 1);
            l10 = new k(0, 0, a.a.f(s10.f5920d, 0, obj, obj2), hVar.f6672g);
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            l10 = s10.l(i10, obj, obj2, i11 + 5, hVar2);
        }
        return s10 == l10 ? this : r(t3, l10, hVar2.f6672g);
    }

    public final k m(k kVar, int i10, t0.a aVar, u0.h hVar) {
        Object[] objArr;
        k j3;
        if (this == kVar) {
            aVar.f6510a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            t0.b bVar = hVar.f6672g;
            int i12 = kVar.f5918b;
            Object[] objArr2 = this.f5920d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f5920d.length);
            pc.j.d(copyOf, "copyOf(...)");
            int length = this.f5920d.length;
            uc.b p8 = uc.e.p(uc.e.q(0, kVar.f5920d.length));
            int i13 = p8.f6735g;
            int i14 = p8.f6736h;
            int i15 = p8.f6737i;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(kVar.f5920d[i13])) {
                        aVar.f6510a++;
                    } else {
                        Object[] objArr3 = kVar.f5920d;
                        copyOf[length] = objArr3[i13];
                        copyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f5920d.length) {
                if (length == kVar.f5920d.length) {
                    return kVar;
                }
                if (length == copyOf.length) {
                    return new k(0, 0, copyOf, bVar);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                pc.j.d(copyOf2, "copyOf(...)");
                return new k(0, 0, copyOf2, bVar);
            }
        } else {
            int i16 = this.f5918b | kVar.f5918b;
            int i17 = this.f5917a;
            int i18 = kVar.f5917a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i20);
                if (pc.j.a(this.f5920d[f(lowestOneBit)], kVar.f5920d[kVar.f(lowestOneBit)])) {
                    i21 |= lowestOneBit;
                } else {
                    i16 |= lowestOneBit;
                }
                i20 ^= lowestOneBit;
            }
            if ((i16 & i21) != 0) {
                s1.b("Check failed.");
            }
            k kVar2 = (pc.j.a(this.f5919c, hVar.f6672g) && this.f5917a == i21 && this.f5918b == i16) ? this : new k(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = kVar2.f5920d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(lowestOneBit2)) {
                    j3 = s(t(lowestOneBit2));
                    if (kVar.i(lowestOneBit2)) {
                        j3 = j3.m(kVar.s(kVar.t(lowestOneBit2)), i10 + 5, aVar, hVar);
                        objArr = objArr4;
                    } else if (kVar.h(lowestOneBit2)) {
                        int f10 = kVar.f(lowestOneBit2);
                        Object obj = kVar.f5920d[f10];
                        Object x10 = kVar.x(f10);
                        int i24 = hVar.f6676k;
                        objArr = objArr4;
                        j3 = j3.l(obj != null ? obj.hashCode() : i11, obj, x10, i10 + 5, hVar);
                        if (hVar.f6676k == i24) {
                            aVar.f6510a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(lowestOneBit2)) {
                        k s10 = kVar.s(kVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f11 = f(lowestOneBit2);
                            Object obj2 = this.f5920d[f11];
                            int i25 = i10 + 5;
                            if (s10.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.f6510a++;
                            } else {
                                j3 = s10.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f11), i25, hVar);
                            }
                        }
                        j3 = s10;
                    } else {
                        int f12 = f(lowestOneBit2);
                        Object obj3 = this.f5920d[f12];
                        Object x11 = x(f12);
                        int f13 = kVar.f(lowestOneBit2);
                        Object obj4 = kVar.f5920d[f13];
                        j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x11, obj4 != null ? obj4.hashCode() : 0, obj4, kVar.x(f13), i10 + 5, hVar.f6672g);
                    }
                }
                objArr[length2] = j3;
                i23++;
                i22 ^= lowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (kVar.h(lowestOneBit3)) {
                    int f14 = kVar.f(lowestOneBit3);
                    Object[] objArr5 = kVar2.f5920d;
                    objArr5[i27] = kVar.f5920d[f14];
                    objArr5[i27 + 1] = kVar.x(f14);
                    if (h(lowestOneBit3)) {
                        aVar.f6510a++;
                    }
                } else {
                    int f15 = f(lowestOneBit3);
                    Object[] objArr6 = kVar2.f5920d;
                    objArr6[i27] = this.f5920d[f15];
                    objArr6[i27 + 1] = x(f15);
                }
                i26++;
                i21 ^= lowestOneBit3;
            }
            if (!e(kVar2)) {
                return kVar.e(kVar2) ? kVar : kVar2;
            }
        }
        return this;
    }

    public final k n(int i10, Object obj, int i11, u0.h hVar) {
        k n7;
        int B = 1 << a.a.B(i10, i11);
        if (h(B)) {
            int f10 = f(B);
            if (pc.j.a(obj, this.f5920d[f10])) {
                return p(f10, B, hVar);
            }
        } else if (i(B)) {
            int t3 = t(B);
            k s10 = s(t3);
            if (i11 == 30) {
                uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
                int i12 = p8.f6735g;
                int i13 = p8.f6736h;
                int i14 = p8.f6737i;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!pc.j.a(obj, s10.f5920d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    n7 = s10.k(i12, hVar);
                }
                n7 = s10;
                break;
            }
            n7 = s10.n(i10, obj, i11 + 5, hVar);
            return q(s10, n7, t3, B, hVar.f6672g);
        }
        return this;
    }

    public final k o(int i10, Object obj, Object obj2, int i11, u0.h hVar) {
        k kVar;
        k o7;
        int B = 1 << a.a.B(i10, i11);
        if (h(B)) {
            int f10 = f(B);
            if (pc.j.a(obj, this.f5920d[f10]) && pc.j.a(obj2, x(f10))) {
                return p(f10, B, hVar);
            }
        } else if (i(B)) {
            int t3 = t(B);
            k s10 = s(t3);
            if (i11 == 30) {
                uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
                int i12 = p8.f6735g;
                int i13 = p8.f6736h;
                int i14 = p8.f6737i;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!pc.j.a(obj, s10.f5920d[i12]) || !pc.j.a(obj2, s10.x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            o7 = s10.k(i12, hVar);
                            break;
                        }
                    }
                }
                o7 = s10;
                kVar = s10;
            } else {
                kVar = s10;
                o7 = kVar.o(i10, obj, obj2, i11 + 5, hVar);
            }
            return q(kVar, o7, t3, B, hVar.f6672g);
        }
        return this;
    }

    public final k p(int i10, int i11, u0.h hVar) {
        hVar.e(hVar.f6676k - 1);
        hVar.f6674i = x(i10);
        Object[] objArr = this.f5920d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5919c != hVar.f6672g) {
            return new k(i11 ^ this.f5917a, this.f5918b, a.a.g(i10, objArr), hVar.f6672g);
        }
        this.f5920d = a.a.g(i10, objArr);
        this.f5917a ^= i11;
        return this;
    }

    public final k q(k kVar, k kVar2, int i10, int i11, t0.b bVar) {
        t0.b bVar2 = this.f5919c;
        if (kVar2 != null) {
            return (bVar2 == bVar || kVar != kVar2) ? r(i10, kVar2, bVar) : this;
        }
        Object[] objArr = this.f5920d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new k(this.f5917a, i11 ^ this.f5918b, a.a.h(i10, objArr), bVar);
        }
        this.f5920d = a.a.h(i10, objArr);
        this.f5918b ^= i11;
        return this;
    }

    public final k r(int i10, k kVar, t0.b bVar) {
        Object[] objArr = this.f5920d;
        if (objArr.length == 1 && kVar.f5920d.length == 2 && kVar.f5918b == 0) {
            kVar.f5917a = this.f5918b;
            return kVar;
        }
        if (this.f5919c == bVar) {
            objArr[i10] = kVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[i10] = kVar;
        return new k(this.f5917a, this.f5918b, copyOf, bVar);
    }

    public final k s(int i10) {
        Object obj = this.f5920d[i10];
        pc.j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (k) obj;
    }

    public final int t(int i10) {
        return (this.f5920d.length - 1) - Integer.bitCount((i10 - 1) & this.f5918b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        r14.f2092c = w(r12, r4, (r0.k) r14.f2092c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e3.j u(int i10, int i11, Object obj, Object obj2) {
        e3.j u10;
        int i12 = 1;
        int B = 1 << a.a.B(i10, i11);
        int i13 = 0;
        if (h(B)) {
            int f10 = f(B);
            if (!pc.j.a(obj, this.f5920d[f10])) {
                return new e3.j(i12, 2, new k(this.f5917a ^ B, this.f5918b | B, a(f10, B, i10, obj, obj2, i11, null), null));
            }
            if (x(f10) != obj2) {
                Object[] objArr = this.f5920d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                pc.j.d(copyOf, "copyOf(...)");
                copyOf[f10 + 1] = obj2;
                return new e3.j(i13, 2, new k(this.f5917a, this.f5918b, copyOf, null));
            }
        } else {
            if (!i(B)) {
                return new e3.j(i12, 2, new k(this.f5917a | B, this.f5918b, a.a.f(this.f5920d, f(B), obj, obj2), null));
            }
            int t3 = t(B);
            k s10 = s(t3);
            if (i11 == 30) {
                uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
                int i14 = p8.f6735g;
                int i15 = p8.f6736h;
                int i16 = p8.f6737i;
                if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                    while (!pc.j.a(obj, s10.f5920d[i14])) {
                        if (i14 != i15) {
                            i14 += i16;
                        }
                    }
                    if (obj2 == s10.x(i14)) {
                        u10 = null;
                    } else {
                        Object[] objArr2 = s10.f5920d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        pc.j.d(copyOf2, "copyOf(...)");
                        copyOf2[i14 + 1] = obj2;
                        u10 = new e3.j(i13, 2, new k(0, 0, copyOf2, null));
                    }
                }
                u10 = new e3.j(i12, 2, new k(0, 0, a.a.f(s10.f5920d, 0, obj, obj2), null));
                break;
            }
            u10 = s10.u(i10, i11 + 5, obj, obj2);
        }
        return null;
    }

    public final k v(int i10, int i11, Object obj) {
        k v10;
        int B = 1 << a.a.B(i10, i11);
        if (h(B)) {
            int f10 = f(B);
            if (pc.j.a(obj, this.f5920d[f10])) {
                Object[] objArr = this.f5920d;
                if (objArr.length != 2) {
                    return new k(this.f5917a ^ B, this.f5918b, a.a.g(f10, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(B)) {
            int t3 = t(B);
            k s10 = s(t3);
            if (i11 == 30) {
                uc.b p8 = uc.e.p(uc.e.q(0, s10.f5920d.length));
                int i12 = p8.f6735g;
                int i13 = p8.f6736h;
                int i14 = p8.f6737i;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!pc.j.a(obj, s10.f5920d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = s10.f5920d;
                    v10 = objArr2.length == 2 ? null : new k(0, 0, a.a.g(i12, objArr2), null);
                }
                v10 = s10;
                break;
            }
            v10 = s10.v(i10, i11 + 5, obj);
            if (v10 == null) {
                Object[] objArr3 = this.f5920d;
                if (objArr3.length != 1) {
                    return new k(this.f5917a, B ^ this.f5918b, a.a.h(t3, objArr3), null);
                }
                return null;
            }
            if (s10 != v10) {
                return w(t3, B, v10);
            }
        }
        return this;
    }

    public final k w(int i10, int i11, k kVar) {
        Object[] objArr = kVar.f5920d;
        if (objArr.length != 2 || kVar.f5918b != 0) {
            Object[] objArr2 = this.f5920d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            pc.j.d(copyOf, "copyOf(...)");
            copyOf[i10] = kVar;
            return new k(this.f5917a, this.f5918b, copyOf, null);
        }
        if (this.f5920d.length == 1) {
            kVar.f5917a = this.f5918b;
            return kVar;
        }
        int f10 = f(i11);
        Object[] objArr3 = this.f5920d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        pc.j.d(copyOf2, "copyOf(...)");
        bc.l.R(copyOf2, copyOf2, i10 + 2, i10 + 1, objArr3.length);
        bc.l.R(copyOf2, copyOf2, f10 + 2, f10, i10);
        copyOf2[f10] = obj;
        copyOf2[f10 + 1] = obj2;
        return new k(this.f5917a ^ i11, i11 ^ this.f5918b, copyOf2, null);
    }

    public final Object x(int i10) {
        return this.f5920d[i10 + 1];
    }
}
