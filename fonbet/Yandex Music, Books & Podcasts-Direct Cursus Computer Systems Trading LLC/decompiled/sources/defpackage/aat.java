package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class aat {
    public static final aat e = new aat(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final hs4 c;
    public Object[] d;

    public aat(int i, int i2, Object[] objArr, hs4 hs4Var) {
        this.a = i;
        this.b = i2;
        this.c = hs4Var;
        this.d = objArr;
    }

    public static aat j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, hs4 hs4Var) {
        if (i3 > 30) {
            return new aat(0, 0, new Object[]{obj, obj2, obj3, obj4}, hs4Var);
        }
        int P = u7g.P(i, i3);
        int P2 = u7g.P(i2, i3);
        if (P != P2) {
            return new aat((1 << P) | (1 << P2), 0, P < P2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, hs4Var);
        }
        return new aat(0, 1 << P, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, hs4Var)}, hs4Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, hs4 hs4Var) {
        Object obj3 = this.d[i];
        aat j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, hs4Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        uz0.i(objArr, objArr2, 0, 0, i, 6);
        uz0.f(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = j;
        uz0.f(t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        a l = yhn.l(2, yhn.m(0, this.d.length));
        int i = l.a;
        int i2 = l.b;
        int i3 = l.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.d(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int P = 1 << u7g.P(i, i2);
        if (h(P)) {
            return Intrinsics.d(obj, this.d[f(P)]);
        }
        if (!i(P)) {
            return false;
        }
        aat s = s(t(P));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(aat aatVar) {
        if (this == aatVar) {
            return true;
        }
        if (this.b == aatVar.b && this.a == aatVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == aatVar.d[i]) {
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
        int P = 1 << u7g.P(i, i2);
        if (h(P)) {
            int f = f(P);
            if (Intrinsics.d(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(P)) {
            return null;
        }
        aat s = s(t(P));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        a l = yhn.l(2, yhn.m(0, s.d.length));
        int i3 = l.a;
        int i4 = l.b;
        int i5 = l.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.d(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final aat k(int i, xlk xlkVar) {
        xlkVar.g(xlkVar.f - 1);
        xlkVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != xlkVar.b) {
            return new aat(0, 0, u7g.y(i, objArr), xlkVar.b);
        }
        this.d = u7g.y(i, objArr);
        return this;
    }

    public final aat l(int i, Object obj, Object obj2, int i2, xlk xlkVar) {
        xlk xlkVar2;
        aat l;
        int P = 1 << u7g.P(i, i2);
        boolean h = h(P);
        hs4 hs4Var = this.c;
        if (h) {
            int f = f(P);
            if (!Intrinsics.d(obj, this.d[f])) {
                xlkVar.g(xlkVar.f + 1);
                hs4 hs4Var2 = xlkVar.b;
                if (hs4Var != hs4Var2) {
                    return new aat(this.a ^ P, this.b | P, a(f, P, i, obj, obj2, i2, hs4Var2), hs4Var2);
                }
                this.d = a(f, P, i, obj, obj2, i2, hs4Var2);
                this.a ^= P;
                this.b |= P;
                return this;
            }
            xlkVar.d = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (hs4Var == xlkVar.b) {
                this.d[f + 1] = obj2;
                return this;
            }
            xlkVar.e++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new aat(this.a, this.b, copyOf, xlkVar.b);
        }
        if (!i(P)) {
            xlkVar.g(xlkVar.f + 1);
            hs4 hs4Var3 = xlkVar.b;
            int f2 = f(P);
            Object[] objArr2 = this.d;
            if (hs4Var != hs4Var3) {
                return new aat(this.a | P, this.b, u7g.x(objArr2, f2, obj, obj2), hs4Var3);
            }
            this.d = u7g.x(objArr2, f2, obj, obj2);
            this.a |= P;
            return this;
        }
        int t = t(P);
        aat s = s(t);
        if (i2 == 30) {
            a l2 = yhn.l(2, yhn.m(0, s.d.length));
            int i3 = l2.a;
            int i4 = l2.b;
            int i5 = l2.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!Intrinsics.d(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                xlkVar.d = s.x(i3);
                if (s.c == xlkVar.b) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    xlkVar.e++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new aat(0, 0, copyOf2, xlkVar.b);
                }
                xlkVar2 = xlkVar;
            }
            xlkVar.g(xlkVar.f + 1);
            l = new aat(0, 0, u7g.x(s.d, 0, obj, obj2), xlkVar.b);
            xlkVar2 = xlkVar;
        } else {
            xlkVar2 = xlkVar;
            l = s.l(i, obj, obj2, i2 + 5, xlkVar2);
        }
        return s == l ? this : r(t, l, xlkVar2.b);
    }

    public final aat m(aat aatVar, int i, ix7 ix7Var, xlk xlkVar) {
        Object[] objArr;
        aat j;
        if (this == aatVar) {
            ix7Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            hs4 hs4Var = xlkVar.b;
            int i3 = aatVar.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + aatVar.d.length);
            int length = this.d.length;
            a l = yhn.l(2, yhn.m(0, aatVar.d.length));
            int i4 = l.a;
            int i5 = l.b;
            int i6 = l.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(aatVar.d[i4])) {
                        ix7Var.a++;
                    } else {
                        Object[] objArr3 = aatVar.d;
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
            if (length != this.d.length) {
                return length == aatVar.d.length ? aatVar : length == copyOf.length ? new aat(0, 0, copyOf, hs4Var) : new aat(0, 0, Arrays.copyOf(copyOf, length), hs4Var);
            }
        } else {
            int i7 = this.b | aatVar.b;
            int i8 = this.a;
            int i9 = aatVar.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.d(this.d[f(lowestOneBit)], aatVar.d[aatVar.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                llm.b("Check failed.");
            }
            aat aatVar2 = (Intrinsics.d(this.c, xlkVar.b) && this.a == i12 && this.b == i7) ? this : new aat(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = aatVar2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (aatVar.i(lowestOneBit2)) {
                        j = j.m(aatVar.s(aatVar.t(lowestOneBit2)), i + 5, ix7Var, xlkVar);
                        objArr = objArr4;
                    } else if (aatVar.h(lowestOneBit2)) {
                        int f = aatVar.f(lowestOneBit2);
                        Object obj = aatVar.d[f];
                        Object x = aatVar.x(f);
                        int i15 = xlkVar.f;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, xlkVar);
                        if (xlkVar.f == i15) {
                            ix7Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (aatVar.i(lowestOneBit2)) {
                        aat s = aatVar.s(aatVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                ix7Var.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, xlkVar);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = aatVar.f(lowestOneBit2);
                        Object obj4 = aatVar.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, aatVar.x(f4), i + 5, xlkVar.b);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (aatVar.h(lowestOneBit3)) {
                    int f5 = aatVar.f(lowestOneBit3);
                    Object[] objArr5 = aatVar2.d;
                    objArr5[i18] = aatVar.d[f5];
                    objArr5[i18 + 1] = aatVar.x(f5);
                    if (h(lowestOneBit3)) {
                        ix7Var.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = aatVar2.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(aatVar2)) {
                return aatVar.e(aatVar2) ? aatVar : aatVar2;
            }
        }
        return this;
    }

    public final aat n(int i, Object obj, int i2, xlk xlkVar) {
        aat n;
        int P = 1 << u7g.P(i, i2);
        if (h(P)) {
            int f = f(P);
            if (Intrinsics.d(obj, this.d[f])) {
                return p(f, P, xlkVar);
            }
        } else if (i(P)) {
            int t = t(P);
            aat s = s(t);
            if (i2 == 30) {
                a l = yhn.l(2, yhn.m(0, s.d.length));
                int i3 = l.a;
                int i4 = l.b;
                int i5 = l.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.d(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, xlkVar);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, xlkVar);
            return q(s, n, t, P, xlkVar.b);
        }
        return this;
    }

    public final aat o(int i, Object obj, Object obj2, int i2, xlk xlkVar) {
        aat aatVar;
        aat o;
        int P = 1 << u7g.P(i, i2);
        if (h(P)) {
            int f = f(P);
            if (Intrinsics.d(obj, this.d[f]) && Intrinsics.d(obj2, x(f))) {
                return p(f, P, xlkVar);
            }
        } else if (i(P)) {
            int t = t(P);
            aat s = s(t);
            if (i2 == 30) {
                a l = yhn.l(2, yhn.m(0, s.d.length));
                int i3 = l.a;
                int i4 = l.b;
                int i5 = l.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.d(obj, s.d[i3]) || !Intrinsics.d(obj2, s.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            o = s.k(i3, xlkVar);
                            break;
                        }
                    }
                    aatVar = s;
                }
                o = s;
                aatVar = s;
            } else {
                aatVar = s;
                o = aatVar.o(i, obj, obj2, i2 + 5, xlkVar);
            }
            return q(aatVar, o, t, P, xlkVar.b);
        }
        return this;
    }

    public final aat p(int i, int i2, xlk xlkVar) {
        xlkVar.g(xlkVar.f - 1);
        xlkVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != xlkVar.b) {
            return new aat(i2 ^ this.a, this.b, u7g.y(i, objArr), xlkVar.b);
        }
        this.d = u7g.y(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final aat q(aat aatVar, aat aatVar2, int i, int i2, hs4 hs4Var) {
        hs4 hs4Var2 = this.c;
        if (aatVar2 != null) {
            return (hs4Var2 == hs4Var || aatVar != aatVar2) ? r(i, aatVar2, hs4Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (hs4Var2 != hs4Var) {
            return new aat(this.a, i2 ^ this.b, u7g.z(i, objArr), hs4Var);
        }
        this.d = u7g.z(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final aat r(int i, aat aatVar, hs4 hs4Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && aatVar.d.length == 2 && aatVar.b == 0) {
            aatVar.a = this.b;
            return aatVar;
        }
        if (this.c == hs4Var) {
            objArr[i] = aatVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = aatVar;
        return new aat(this.a, this.b, copyOf, hs4Var);
    }

    public final aat s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (aat) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r14.c = w(r12, r4, (defpackage.aat) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j4x u(int i, Object obj, Object obj2, int i2) {
        j4x u;
        int i3 = 1;
        int P = 1 << u7g.P(i, i2);
        int i4 = 0;
        if (h(P)) {
            int f = f(P);
            if (!Intrinsics.d(obj, this.d[f])) {
                return new j4x(new aat(this.a ^ P, this.b | P, a(f, P, i, obj, obj2, i2, null), null), i3, 23);
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new j4x(new aat(this.a, this.b, copyOf, null), i4, 23);
            }
        } else {
            if (!i(P)) {
                return new j4x(new aat(this.a | P, this.b, u7g.x(this.d, f(P), obj, obj2), null), i3, 23);
            }
            int t = t(P);
            aat s = s(t);
            if (i2 == 30) {
                a l = yhn.l(2, yhn.m(0, s.d.length));
                int i5 = l.a;
                int i6 = l.b;
                int i7 = l.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!Intrinsics.d(obj, s.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == s.x(i5)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        u = new j4x(new aat(0, 0, copyOf2, null), i4, 23);
                    }
                }
                u = new j4x(new aat(0, 0, u7g.x(s.d, 0, obj, obj2), null), i3, 23);
                break;
            }
            u = s.u(i, obj, obj2, i2 + 5);
        }
        return null;
    }

    public final aat v(int i, int i2, Object obj) {
        aat v;
        int P = 1 << u7g.P(i, i2);
        if (h(P)) {
            int f = f(P);
            if (Intrinsics.d(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new aat(this.a ^ P, this.b, u7g.y(f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(P)) {
            int t = t(P);
            aat s = s(t);
            if (i2 == 30) {
                a l = yhn.l(2, yhn.m(0, s.d.length));
                int i3 = l.a;
                int i4 = l.b;
                int i5 = l.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.d(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new aat(0, 0, u7g.y(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new aat(this.a, P ^ this.b, u7g.z(t, objArr3), null);
                }
                return null;
            }
            if (s != v) {
                return w(t, P, v);
            }
        }
        return this;
    }

    public final aat w(int i, int i2, aat aatVar) {
        Object[] objArr = aatVar.d;
        if (objArr.length != 2 || aatVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = aatVar;
            return new aat(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            aatVar.a = this.b;
            return aatVar;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        uz0.f(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        uz0.f(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new aat(this.a ^ i2, i2 ^ this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
