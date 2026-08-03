package q0;

import bc.l;
import java.util.Arrays;
import java.util.ListIterator;
import m0.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f5702g;

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f5703h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5704i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5705j;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f5702g = objArr;
        this.f5703h = objArr2;
        this.f5704i = i10;
        this.f5705j = i11;
        if (!(a() > 32)) {
            s1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i10, int i11, Object obj, h.a aVar) {
        Object[] copyOf;
        int I = v6.a.I(i11, i10);
        if (i10 == 0) {
            if (I == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                pc.j.d(copyOf, "copyOf(...)");
            }
            l.R(objArr, copyOf, I + 1, I, 31);
            aVar.f2590a = objArr[31];
            copyOf[I] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        pc.j.d(copyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[I];
        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[I] = j((Object[]) obj2, i12, i11, obj, aVar);
        while (true) {
            I++;
            if (I >= 32 || copyOf2[I] == null) {
                break;
            }
            Object obj3 = objArr[I];
            pc.j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[I] = j((Object[]) obj3, i12, 0, aVar.f2590a, aVar);
        }
        return copyOf2;
    }

    public static Object[] l(Object[] objArr, int i10, int i11, h.a aVar) {
        Object[] l10;
        int I = v6.a.I(i11, i10);
        if (i10 == 5) {
            aVar.f2590a = objArr[I];
            l10 = null;
        } else {
            Object obj = objArr[I];
            pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            l10 = l((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (l10 == null && I == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[I] = l10;
        return copyOf;
    }

    public static Object[] r(int i10, int i11, Object obj, Object[] objArr) {
        int I = v6.a.I(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        pc.j.d(copyOf, "copyOf(...)");
        if (i10 == 0) {
            copyOf[I] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[I];
        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[I] = r(i10 - 5, i11, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // bc.a
    public final int a() {
        return this.f5704i;
    }

    @Override // q0.c
    public final c b(int i10, Object obj) {
        int i11 = this.f5704i;
        a.a.n(i10, i11);
        if (i10 == i11) {
            return d(obj);
        }
        int q10 = q();
        Object[] objArr = this.f5702g;
        if (i10 >= q10) {
            return k(objArr, i10 - q10, obj);
        }
        h.a aVar = new h.a(null);
        return k(j(objArr, this.f5705j, i10, obj, aVar), 0, aVar.f2590a);
    }

    @Override // q0.c
    public final c d(Object obj) {
        int q10 = q();
        int i10 = this.f5704i;
        int i11 = i10 - q10;
        Object[] objArr = this.f5702g;
        Object[] objArr2 = this.f5703h;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[i11] = obj;
        return new e(objArr, copyOf, i10 + 1, this.f5705j);
    }

    @Override // q0.c
    public final f f() {
        return new f(this, this.f5702g, this.f5703h, this.f5705j);
    }

    @Override // q0.c
    public final c g(b bVar) {
        f fVar = new f(this, this.f5702g, this.f5703h, this.f5705j);
        fVar.z(bVar);
        return fVar.d();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        a.a.l(i10, a());
        if (q() <= i10) {
            objArr = this.f5703h;
        } else {
            objArr = this.f5702g;
            for (int i11 = this.f5705j; i11 > 0; i11 -= 5) {
                Object obj = objArr[v6.a.I(i10, i11)];
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // q0.c
    public final c h(int i10) {
        a.a.l(i10, this.f5704i);
        int q10 = q();
        Object[] objArr = this.f5702g;
        int i11 = this.f5705j;
        return i10 >= q10 ? p(objArr, q10, i11, i10 - q10) : p(o(objArr, i11, i10, new h.a(this.f5703h[0])), q10, i11, 0);
    }

    @Override // q0.c
    public final c i(int i10, Object obj) {
        int i11 = this.f5704i;
        a.a.l(i10, i11);
        int q10 = q();
        Object[] objArr = this.f5702g;
        Object[] objArr2 = this.f5703h;
        int i12 = this.f5705j;
        if (q10 > i10) {
            return new e(r(i12, i10, obj, objArr), objArr2, i11, i12);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[i10 & 31] = obj;
        return new e(objArr, copyOf, i11, i12);
    }

    public final e k(Object[] objArr, int i10, Object obj) {
        int q10 = q();
        int i11 = this.f5704i;
        int i12 = i11 - q10;
        Object[] objArr2 = this.f5703h;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        pc.j.d(copyOf, "copyOf(...)");
        if (i12 < 32) {
            l.R(objArr2, copyOf, i10 + 1, i10, i12);
            copyOf[i10] = obj;
            return new e(objArr, copyOf, i11 + 1, this.f5705j);
        }
        Object obj2 = objArr2[31];
        l.R(objArr2, copyOf, i10 + 1, i10, i12 - 1);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, copyOf, objArr3);
    }

    @Override // bc.e, java.util.List
    public final ListIterator listIterator(int i10) {
        a.a.n(i10, this.f5704i);
        return new g(this.f5702g, this.f5703h, i10, this.f5704i, (this.f5705j / 5) + 1);
    }

    public final e m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f5704i;
        int i11 = i10 >> 5;
        int i12 = this.f5705j;
        if (i11 <= (1 << i12)) {
            return new e(n(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(n(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] n(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int I = v6.a.I(a() - 1, i10);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            pc.j.d(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i10 == 5) {
            objArr3[I] = objArr2;
            return objArr3;
        }
        objArr3[I] = n(i10 - 5, (Object[]) objArr3[I], objArr2);
        return objArr3;
    }

    public final Object[] o(Object[] objArr, int i10, int i11, h.a aVar) {
        Object[] copyOf;
        int I = v6.a.I(i11, i10);
        if (i10 == 0) {
            if (I == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                pc.j.d(copyOf, "copyOf(...)");
            }
            l.R(objArr, copyOf, I, I + 1, 32);
            copyOf[31] = aVar.f2590a;
            aVar.f2590a = objArr[I];
            return copyOf;
        }
        int I2 = objArr[31] == null ? v6.a.I(q() - 1, i10) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        pc.j.d(copyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = I + 1;
        if (i13 <= I2) {
            while (true) {
                Object obj = copyOf2[I2];
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[I2] = o((Object[]) obj, i12, 0, aVar);
                if (I2 == i13) {
                    break;
                }
                I2--;
            }
        }
        Object obj2 = copyOf2[I];
        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[I] = o((Object[]) obj2, i12, i11, aVar);
        return copyOf2;
    }

    public final c p(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f5704i - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f5703h;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            pc.j.d(copyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                l.R(objArr2, copyOf, i12, i12 + 1, i13);
            }
            copyOf[i14] = null;
            return new e(objArr, copyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                pc.j.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        h.a aVar = new h.a(null);
        Object[] l10 = l(objArr, i11, i10 - 1, aVar);
        pc.j.b(l10);
        Object obj = aVar.f2590a;
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (l10[1] != null) {
            return new e(l10, objArr3, i10, i11);
        }
        Object obj2 = l10[0];
        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int q() {
        return (this.f5704i - 1) & (-32);
    }
}
