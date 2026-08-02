package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hmk extends h8 implements Collection, k9f {
    public m8 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public hs4 e = new hs4(28);
    public Object[] f;
    public Object[] g;
    public int h;

    public hmk(m8 m8Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = m8Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = m8Var.size();
    }

    public static void o(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            llm.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int N = zwf.N(i, i2);
        Object obj = objArr[N];
        obj.getClass();
        Object A = A(i, i2 - 5, (Object[]) obj);
        if (N < 31) {
            int i3 = N + 1;
            if (objArr[i3] != null) {
                if (u(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] y = y();
                uz0.f(0, 0, i3, objArr, y);
                objArr = y;
            }
        }
        if (A == objArr[N]) {
            return objArr;
        }
        Object[] w = w(objArr);
        w[N] = A;
        return w;
    }

    public final Object[] B(Object[] objArr, int i, int i2, tb tbVar) {
        Object[] B;
        int N = zwf.N(i2 - 1, i);
        if (i == 5) {
            tbVar.a = objArr[N];
            B = null;
        } else {
            Object obj = objArr[N];
            obj.getClass();
            B = B((Object[]) obj, i - 5, i2, tbVar);
        }
        if (B == null && N == 0) {
            return null;
        }
        Object[] w = w(objArr);
        w[N] = B;
        return w;
    }

    public final void D(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        tb tbVar = new tb(obj);
        objArr.getClass();
        Object[] B = B(objArr, i2, i, tbVar);
        B.getClass();
        Object obj2 = tbVar.a;
        obj2.getClass();
        this.g = (Object[]) obj2;
        this.h = i;
        if (B[1] == null) {
            this.f = (Object[]) B[0];
            this.d = i2 - 5;
        } else {
            this.f = B;
            this.d = i2;
        }
    }

    public final Object[] E(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            llm.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            llm.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] w = w(objArr);
        int N = zwf.N(i, i2);
        int i3 = i2 - 5;
        w[N] = E((Object[]) w[N], i, i3, it);
        while (true) {
            N++;
            if (N >= 32 || !it.hasNext()) {
                break;
            }
            w[N] = E((Object[]) w[N], 0, i3, it);
        }
        return w;
    }

    public final Object[] F(Object[] objArr, int i, Object[][] objArr2) {
        c7 c7Var = new c7(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] E = i2 < (1 << i3) ? E(objArr, i, i3, c7Var) : w(objArr);
        while (c7Var.hasNext()) {
            this.d += 5;
            E = z(E);
            int i4 = this.d;
            E(E, 1 << i4, i4, c7Var);
        }
        return E;
    }

    public final void G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = H(this.d + 5, z(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = H(i3, objArr, objArr2);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] H(int i, Object[] objArr, Object[] objArr2) {
        int N = zwf.N(f() - 1, i);
        Object[] w = w(objArr);
        if (i == 5) {
            w[N] = objArr2;
            return w;
        }
        w[N] = H(i - 5, (Object[]) w[N], objArr2);
        return w;
    }

    public final int K(Function1 function1, Object[] objArr, int i, int i2, tb tbVar, ArrayList arrayList, ArrayList arrayList2) {
        if (u(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = tbVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : y();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        tbVar.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int L(Function1 function1, Object[] objArr, int i, tb tbVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = w(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        tbVar.a = objArr2;
        return i2;
    }

    public final int M(Function1 function1, int i, tb tbVar) {
        int L = L(function1, this.g, i, tbVar);
        Object obj = tbVar.a;
        if (L == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, L, i, (Object) null);
        this.g = objArr;
        this.h -= i - L;
        return L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (M(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int X = X();
        Object[] objArr = null;
        tb tbVar = new tb(objArr);
        boolean z = false;
        if (this.f != null) {
            f7 v = v(0);
            int i2 = 32;
            while (i2 == 32 && v.hasNext()) {
                i2 = L(function12, (Object[]) v.next(), 32, tbVar);
            }
            if (i2 == 32) {
                int M = M(function12, X, tbVar);
                if (M == 0) {
                    D(this.h, this.d, this.f);
                }
            } else {
                int i3 = (v.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (v.hasNext()) {
                    i4 = K(function12, (Object[]) v.next(), 32, i4, tbVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int K = K(function1, this.g, X, i4, tbVar, arrayList2, arrayList);
                Object obj = tbVar.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, K, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.f;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = E(objArr3, i3, this.d, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    llm.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = A(i5, i, objArr3);
                }
                this.f = objArr;
                this.g = objArr2;
                this.h = size + K;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] P(Object[] objArr, int i, int i2, tb tbVar) {
        int N = zwf.N(i2, i);
        if (i == 0) {
            Object obj = objArr[N];
            Object[] w = w(objArr);
            uz0.f(N, N + 1, 32, objArr, w);
            w[31] = tbVar.a;
            tbVar.a = obj;
            return w;
        }
        int N2 = objArr[31] == null ? zwf.N(S() - 1, i) : 31;
        Object[] w2 = w(objArr);
        int i3 = i - 5;
        int i4 = N + 1;
        if (i4 <= N2) {
            while (true) {
                Object obj2 = w2[N2];
                obj2.getClass();
                w2[N2] = P((Object[]) obj2, i3, 0, tbVar);
                if (N2 == i4) {
                    break;
                }
                N2--;
            }
        }
        Object obj3 = w2[N];
        obj3.getClass();
        w2[N] = P((Object[]) obj3, i3, i2, tbVar);
        return w2;
    }

    public final Object R(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        Object[] objArr2 = this.g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            D(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] w = w(objArr2);
        uz0.f(i3, i3 + 1, i4, objArr2, w);
        w[i4 - 1] = null;
        this.f = objArr;
        this.g = w;
        this.h = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int S() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] U(Object[] objArr, int i, int i2, Object obj, tb tbVar) {
        int N = zwf.N(i2, i);
        Object[] w = w(objArr);
        if (i != 0) {
            Object obj2 = w[N];
            obj2.getClass();
            w[N] = U((Object[]) obj2, i - 5, i2, obj, tbVar);
            return w;
        }
        if (w != objArr) {
            ((AbstractList) this).modCount++;
        }
        tbVar.a = w[N];
        w[N] = obj;
        return w;
    }

    public final void V(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] y;
        if (i3 < 1) {
            llm.a("requires at least one nullBuffer");
        }
        Object[] w = w(objArr);
        objArr2[0] = w;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            uz0.f(size + 1, i4, i2, w, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                y = w;
            } else {
                y = y();
                i3--;
                objArr2[i3] = y;
            }
            int i7 = i2 - i6;
            uz0.f(0, i7, i2, w, objArr3);
            uz0.f(size + 1, i4, i7, w, y);
            objArr3 = y;
        }
        Iterator it = collection.iterator();
        o(w, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] y2 = y();
            o(y2, 0, it);
            objArr2[i8] = y2;
        }
        o(objArr3, 0, it);
    }

    public final int X() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.h8
    public final Object a(int i) {
        asq.v(i, f());
        ((AbstractList) this).modCount++;
        int S = S();
        if (i >= S) {
            return R(this.f, S, this.d, i - S);
        }
        tb tbVar = new tb(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        R(P(objArr, this.d, i, tbVar), S, this.d, 0);
        return tbVar.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        asq.w(i, f());
        if (i == f()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int S = S();
        if (i >= S) {
            t(i - S, obj, this.f);
            return;
        }
        tb tbVar = new tb(null);
        Object[] objArr = this.f;
        objArr.getClass();
        t(0, tbVar.a, s(objArr, this.d, i, obj, tbVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        hmk hmkVar;
        Object[] y;
        asq.w(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] w = w(objArr);
            uz0.f(size2 + 1, i3, X(), objArr, w);
            o(w, i3, collection.iterator());
            this.g = w;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int X = X();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= S()) {
            y = y();
            collection2 = collection;
            V(collection2, i, this.g, X, objArr2, size, y);
            hmkVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            hmkVar = this;
            Object[] objArr3 = hmkVar.g;
            if (size3 > X) {
                int i4 = size3 - X;
                Object[] x = x(i4, objArr3);
                hmkVar.r(collection2, i, i4, objArr2, size, x);
                objArr2 = objArr2;
                y = x;
            } else {
                y = y();
                int i5 = X - size3;
                uz0.f(0, i5, X, objArr3, y);
                int i6 = 32 - i5;
                Object[] x2 = x(i6, hmkVar.g);
                int i7 = size - 1;
                objArr2[i7] = x2;
                hmkVar.r(collection2, i, i6, objArr2, i7, x2);
                collection2 = collection2;
            }
        }
        hmkVar.f = F(hmkVar.f, i2, objArr2);
        hmkVar.g = y;
        hmkVar.h = collection2.size() + hmkVar.h;
        return true;
    }

    @Override // defpackage.h8
    public final int f() {
        return this.h;
    }

    public final m8 g() {
        m8 gmkVar;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            gmkVar = this.a;
        } else {
            this.e = new hs4(28);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                gmkVar = objArr2.length == 0 ? sxq.c : new sxq(Arrays.copyOf(this.g, f()));
            } else {
                Object[] objArr3 = this.f;
                objArr3.getClass();
                gmkVar = new gmk(objArr3, this.g, f(), this.d);
            }
        }
        this.a = gmkVar;
        return gmkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        asq.v(i, f());
        if (S() <= i) {
            objArr = this.g;
        } else {
            objArr = this.f;
            objArr.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[zwf.N(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        asq.w(i, this.h);
        return new jmk(this, i);
    }

    public final int q() {
        return ((AbstractList) this).modCount;
    }

    public final void r(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            xq0.q("root is null");
            return;
        }
        int i4 = i >> 5;
        f7 v = v(S() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (v.a - 1 != i4) {
            Object[] objArr4 = (Object[]) v.previous();
            uz0.f(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = x(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) v.previous();
        int S = i3 - (((S() >> 5) - 1) - i4);
        if (S < i3) {
            objArr2 = objArr[S];
            objArr2.getClass();
        }
        V(collection, i, objArr5, 32, objArr, S, objArr2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return N(new l8(2, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, Object obj, tb tbVar) {
        Object obj2;
        int N = zwf.N(i2, i);
        if (i == 0) {
            tbVar.a = objArr[31];
            Object[] w = w(objArr);
            uz0.f(N + 1, N, 31, objArr, w);
            w[N] = obj;
            return w;
        }
        Object[] w2 = w(objArr);
        int i3 = i - 5;
        Object obj3 = w2[N];
        obj3.getClass();
        w2[N] = s((Object[]) obj3, i3, i2, obj, tbVar);
        while (true) {
            N++;
            if (N >= 32 || (obj2 = w2[N]) == null) {
                break;
            }
            w2[N] = s((Object[]) obj2, i3, 0, tbVar.a, tbVar);
        }
        return w2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        asq.v(i, f());
        if (S() > i) {
            tb tbVar = new tb(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = U(objArr, this.d, i, obj, tbVar);
            return tbVar.a;
        }
        Object[] w = w(this.g);
        if (w != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = w[i2];
        w[i2] = obj;
        this.g = w;
        return obj2;
    }

    public final void t(int i, Object obj, Object[] objArr) {
        int X = X();
        Object[] w = w(this.g);
        Object[] objArr2 = this.g;
        if (X >= 32) {
            Object obj2 = objArr2[31];
            uz0.f(i + 1, i, 31, objArr2, w);
            w[i] = obj;
            G(objArr, w, z(obj2));
            return;
        }
        uz0.f(i + 1, i, X, objArr2, w);
        w[i] = obj;
        this.f = objArr;
        this.g = w;
        this.h++;
    }

    public final boolean u(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final f7 v(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            xq0.q("Invalid root");
            return null;
        }
        int S = S() >> 5;
        asq.w(i, S);
        int i2 = this.d;
        return i2 == 0 ? new ni3(i, objArr) : new z9t(objArr, i, S, i2 / 5);
    }

    public final Object[] w(Object[] objArr) {
        if (objArr == null) {
            return y();
        }
        if (u(objArr)) {
            return objArr;
        }
        Object[] y = y();
        int length = objArr.length;
        uz0.i(objArr, y, 0, 0, length > 32 ? 32 : length, 6);
        return y;
    }

    public final Object[] x(int i, Object[] objArr) {
        if (u(objArr)) {
            uz0.f(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] y = y();
        uz0.f(i, 0, 32 - i, objArr, y);
        return y;
    }

    public final Object[] y() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] z(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int X = X();
        if (X < 32) {
            Object[] w = w(this.g);
            w[X] = obj;
            this.g = w;
            this.h = f() + 1;
        } else {
            G(this.f, this.g, z(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int X = X();
        Iterator it = collection.iterator();
        if (32 - X >= collection.size()) {
            Object[] w = w(this.g);
            o(w, X, it);
            this.g = w;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + X) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] w2 = w(this.g);
        o(w2, X, it);
        objArr[0] = w2;
        for (int i = 1; i < size; i++) {
            Object[] y = y();
            o(y, 0, it);
            objArr[i] = y;
        }
        this.f = F(this.f, S(), objArr);
        Object[] y2 = y();
        o(y2, 0, it);
        this.g = y2;
        this.h = collection.size() + this.h;
        return true;
    }
}
