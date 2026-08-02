package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class gmk extends m8 {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public gmk(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (!(f() > 32)) {
            llm.a("Trie-based persistent vector should have at least 33 elements, got " + f());
        }
        int length = objArr2.length;
    }

    public static Object[] D(int i, int i2, Object obj, Object[] objArr) {
        int N = zwf.N(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[N] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[N];
        obj2.getClass();
        copyOf[N] = D(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    public static Object[] u(Object[] objArr, int i, int i2, Object obj, tb tbVar) {
        int N = zwf.N(i2, i);
        if (i == 0) {
            Object[] copyOf = N == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            uz0.f(N + 1, N, 31, objArr, copyOf);
            tbVar.a = objArr[31];
            copyOf[N] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[N];
        obj2.getClass();
        copyOf2[N] = u((Object[]) obj2, i3, i2, obj, tbVar);
        while (true) {
            N++;
            if (N >= 32 || copyOf2[N] == null) {
                break;
            }
            Object obj3 = objArr[N];
            obj3.getClass();
            copyOf2[N] = u((Object[]) obj3, i3, 0, tbVar.a, tbVar);
        }
        return copyOf2;
    }

    public static Object[] w(Object[] objArr, int i, int i2, tb tbVar) {
        Object[] w;
        int N = zwf.N(i2, i);
        if (i == 5) {
            tbVar.a = objArr[N];
            w = null;
        } else {
            Object obj = objArr[N];
            obj.getClass();
            w = w((Object[]) obj, i - 5, i2, tbVar);
        }
        if (w == null && N == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[N] = w;
        return copyOf;
    }

    public final m8 A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.c;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                uz0.f(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new gmk(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new sxq(objArr);
        }
        tb tbVar = new tb(obj);
        Object[] w = w(objArr, i2, i - 1, tbVar);
        w.getClass();
        Object obj2 = tbVar.a;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (w[1] != null) {
            return new gmk(w, objArr3, i, i2);
        }
        Object obj3 = w[0];
        obj3.getClass();
        return new gmk((Object[]) obj3, objArr3, i, i2 - 5);
    }

    public final int B() {
        return (this.d - 1) & (-32);
    }

    @Override // defpackage.m8
    public final m8 a(int i, Object obj) {
        int i2 = this.d;
        asq.w(i, i2);
        if (i == i2) {
            return g(obj);
        }
        int B = B();
        Object[] objArr = this.b;
        if (i >= B) {
            return v(i - B, obj, objArr);
        }
        tb tbVar = new tb(null);
        return v(0, tbVar.a, u(objArr, this.e, i, obj, tbVar));
    }

    @Override // defpackage.w5
    public final int f() {
        return this.d;
    }

    @Override // defpackage.m8
    public final m8 g(Object obj) {
        int B = B();
        int i = this.d;
        int i2 = i - B;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new gmk(objArr, copyOf, i + 1, this.e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return x(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        asq.v(i, f());
        if (B() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[zwf.N(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.a, java.util.List
    public final ListIterator listIterator(int i) {
        asq.w(i, this.d);
        return new imk(i, this.d, (this.e / 5) + 1, this.b, this.c);
    }

    @Override // defpackage.m8
    public final hmk q() {
        return new hmk(this, this.b, this.c, this.e);
    }

    @Override // defpackage.m8
    public final m8 r(l8 l8Var) {
        hmk hmkVar = new hmk(this, this.b, this.c, this.e);
        hmkVar.N(l8Var);
        return hmkVar.g();
    }

    @Override // defpackage.m8
    public final m8 s(int i) {
        asq.v(i, this.d);
        int B = B();
        int i2 = this.e;
        Object[] objArr = this.b;
        return i >= B ? A(objArr, B, i2, i - B) : A(z(objArr, i2, i, new tb(this.c[0])), B, i2, 0);
    }

    @Override // defpackage.m8
    public final m8 t(int i, Object obj) {
        int i2 = this.d;
        asq.v(i, i2);
        int B = B();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.e;
        if (B > i) {
            return new gmk(D(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new gmk(objArr, copyOf, i2, i3);
    }

    public final gmk v(int i, Object obj, Object[] objArr) {
        int B = B();
        int i2 = this.d;
        int i3 = i2 - B;
        Object[] objArr2 = this.c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            uz0.f(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new gmk(objArr, copyOf, i2 + 1, this.e);
        }
        Object obj2 = objArr2[31];
        uz0.f(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return x(objArr, copyOf, objArr3);
    }

    public final gmk x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 <= (1 << i3)) {
            return new gmk(y(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new gmk(y(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] y(int i, Object[] objArr, Object[] objArr2) {
        int N = zwf.N(f() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[N] = objArr2;
            return copyOf;
        }
        copyOf[N] = y(i - 5, (Object[]) copyOf[N], objArr2);
        return copyOf;
    }

    public final Object[] z(Object[] objArr, int i, int i2, tb tbVar) {
        int N = zwf.N(i2, i);
        if (i == 0) {
            Object[] copyOf = N == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            uz0.f(N, N + 1, 32, objArr, copyOf);
            copyOf[31] = tbVar.a;
            tbVar.a = objArr[N];
            return copyOf;
        }
        int N2 = objArr[31] == null ? zwf.N(B() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = N + 1;
        if (i4 <= N2) {
            while (true) {
                Object obj = copyOf2[N2];
                obj.getClass();
                copyOf2[N2] = z((Object[]) obj, i3, 0, tbVar);
                if (N2 == i4) {
                    break;
                }
                N2--;
            }
        }
        Object obj2 = copyOf2[N];
        obj2.getClass();
        copyOf2[N] = z((Object[]) obj2, i3, i2, tbVar);
        return copyOf2;
    }
}
