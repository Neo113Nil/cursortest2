package q0;

import bc.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m0.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends bc.g implements Collection, qc.b {

    /* renamed from: g, reason: collision with root package name */
    public c f5706g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5707h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f5708i;

    /* renamed from: j, reason: collision with root package name */
    public int f5709j;

    /* renamed from: k, reason: collision with root package name */
    public t0.b f5710k = new t0.b();

    /* renamed from: l, reason: collision with root package name */
    public Object[] f5711l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f5712m;

    /* renamed from: n, reason: collision with root package name */
    public int f5713n;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f5706g = cVar;
        this.f5707h = objArr;
        this.f5708i = objArr2;
        this.f5709j = i10;
        this.f5711l = objArr;
        this.f5712m = objArr2;
        this.f5713n = cVar.a();
    }

    public static void e(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] A(Object[] objArr, int i10, int i11, h.a aVar) {
        int I = v6.a.I(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[I];
            Object[] l10 = l(objArr);
            l.R(objArr, l10, I, I + 1, 32);
            l10[31] = aVar.f2590a;
            aVar.f2590a = obj;
            return l10;
        }
        int I2 = objArr[31] == null ? v6.a.I(C() - 1, i10) : 31;
        Object[] l11 = l(objArr);
        int i12 = i10 - 5;
        int i13 = I + 1;
        if (i13 <= I2) {
            while (true) {
                Object obj2 = l11[I2];
                pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                l11[I2] = A((Object[]) obj2, i12, 0, aVar);
                if (I2 == i13) {
                    break;
                }
                I2--;
            }
        }
        Object obj3 = l11[I];
        pc.j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        l11[I] = A((Object[]) obj3, i12, i11, aVar);
        return l11;
    }

    public final Object B(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f5713n - i10;
        if (i13 == 1) {
            Object obj = this.f5712m[0];
            r(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f5712m;
        Object obj2 = objArr2[i12];
        Object[] l10 = l(objArr2);
        l.R(objArr2, l10, i12, i12 + 1, i13);
        l10[i13 - 1] = null;
        this.f5711l = objArr;
        this.f5712m = l10;
        this.f5713n = (i10 + i13) - 1;
        this.f5709j = i11;
        return obj2;
    }

    public final int C() {
        int i10 = this.f5713n;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i10, int i11, Object obj, h.a aVar) {
        int I = v6.a.I(i11, i10);
        Object[] l10 = l(objArr);
        if (i10 != 0) {
            Object obj2 = l10[I];
            pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            l10[I] = D((Object[]) obj2, i10 - 5, i11, obj, aVar);
            return l10;
        }
        if (l10 != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f2590a = l10[I];
        l10[I] = obj;
        return l10;
    }

    public final void E(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] n7;
        if (i12 < 1) {
            s1.a("requires at least one nullBuffer");
        }
        Object[] l10 = l(objArr);
        objArr2[0] = l10;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            l.R(l10, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                n7 = l10;
            } else {
                n7 = n();
                i12--;
                objArr2[i12] = n7;
            }
            int i16 = i11 - i15;
            l.R(l10, objArr3, 0, i16, i11);
            l.R(l10, n7, size + 1, i13, i16);
            objArr3 = n7;
        }
        Iterator it = collection.iterator();
        e(l10, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] n10 = n();
            e(n10, 0, it);
            objArr2[i17] = n10;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i10 = this.f5713n;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // bc.g
    public final int a() {
        return this.f5713n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a.a.n(i10, a());
        if (i10 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int C = C();
        if (i10 >= C) {
            i(this.f5711l, i10 - C, obj);
            return;
        }
        h.a aVar = new h.a(null);
        Object[] objArr = this.f5711l;
        pc.j.b(objArr);
        i(h(objArr, this.f5709j, i10, obj, aVar), 0, aVar.f2590a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] n7;
        a.a.n(i10, this.f5713n);
        if (i10 == this.f5713n) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f5713n - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f5712m;
            Object[] l10 = l(objArr);
            l.R(objArr, l10, size2 + 1, i12, F());
            e(l10, i12, collection.iterator());
            this.f5712m = l10;
            this.f5713n = collection.size() + this.f5713n;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int F = F();
        int size3 = collection.size() + this.f5713n;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= C()) {
            n7 = n();
            collection2 = collection;
            E(collection2, i10, this.f5712m, F, objArr2, size, n7);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > F) {
                int i13 = size3 - F;
                Object[] m10 = m(i13, fVar.f5712m);
                fVar.g(collection2, i10, i13, objArr2, size, m10);
                objArr2 = objArr2;
                n7 = m10;
            } else {
                Object[] objArr3 = fVar.f5712m;
                n7 = n();
                int i14 = F - size3;
                l.R(objArr3, n7, 0, i14, F);
                int i15 = 32 - i14;
                Object[] m11 = m(i15, fVar.f5712m);
                int i16 = size - 1;
                objArr2[i16] = m11;
                fVar.g(collection2, i10, i15, objArr2, i16, m11);
                collection2 = collection2;
            }
        }
        fVar.f5711l = t(fVar.f5711l, i11, objArr2);
        fVar.f5712m = n7;
        fVar.f5713n = collection2.size() + fVar.f5713n;
        return true;
    }

    @Override // bc.g
    public final Object b(int i10) {
        a.a.l(i10, a());
        ((AbstractList) this).modCount++;
        int C = C();
        if (i10 >= C) {
            return B(this.f5711l, C, this.f5709j, i10 - C);
        }
        h.a aVar = new h.a(this.f5712m[0]);
        Object[] objArr = this.f5711l;
        pc.j.b(objArr);
        B(A(objArr, this.f5709j, i10, aVar), C, this.f5709j, 0);
        return aVar.f2590a;
    }

    public final c d() {
        c eVar;
        Object[] objArr = this.f5711l;
        if (objArr == this.f5707h && this.f5712m == this.f5708i) {
            eVar = this.f5706g;
        } else {
            this.f5710k = new t0.b();
            this.f5707h = objArr;
            Object[] objArr2 = this.f5712m;
            this.f5708i = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f5713n, this.f5709j);
            } else if (objArr2.length == 0) {
                eVar = i.f5720h;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.f5713n);
                pc.j.d(copyOf, "copyOf(...)");
                eVar = new i(copyOf);
            }
        }
        this.f5706g = eVar;
        return eVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f5711l == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a k3 = k(C() >> 5);
        int i14 = i12;
        Object[] objArr3 = objArr2;
        while (k3.f5696g - 1 != i13) {
            Object[] objArr4 = (Object[]) k3.previous();
            l.R(objArr4, objArr3, 0, 32 - i11, 32);
            objArr3 = m(i11, objArr4);
            i14--;
            objArr[i14] = objArr3;
        }
        Object[] objArr5 = (Object[]) k3.previous();
        int C = i12 - (((C() >> 5) - 1) - i13);
        if (C < i12) {
            objArr2 = objArr[C];
            pc.j.b(objArr2);
        }
        E(collection, i10, objArr5, 32, objArr, C, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        a.a.l(i10, a());
        if (C() <= i10) {
            objArr = this.f5712m;
        } else {
            objArr = this.f5711l;
            pc.j.b(objArr);
            for (int i11 = this.f5709j; i11 > 0; i11 -= 5) {
                Object obj = objArr[v6.a.I(i10, i11)];
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final Object[] h(Object[] objArr, int i10, int i11, Object obj, h.a aVar) {
        Object obj2;
        int I = v6.a.I(i11, i10);
        if (i10 == 0) {
            aVar.f2590a = objArr[31];
            Object[] l10 = l(objArr);
            l.R(objArr, l10, I + 1, I, 31);
            l10[I] = obj;
            return l10;
        }
        Object[] l11 = l(objArr);
        int i12 = i10 - 5;
        Object obj3 = l11[I];
        pc.j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        l11[I] = h((Object[]) obj3, i12, i11, obj, aVar);
        while (true) {
            I++;
            if (I >= 32 || (obj2 = l11[I]) == null) {
                break;
            }
            l11[I] = h((Object[]) obj2, i12, 0, aVar.f2590a, aVar);
        }
        return l11;
    }

    public final void i(Object[] objArr, int i10, Object obj) {
        int F = F();
        Object[] l10 = l(this.f5712m);
        if (F < 32) {
            l.R(this.f5712m, l10, i10 + 1, i10, F);
            l10[i10] = obj;
            this.f5711l = objArr;
            this.f5712m = l10;
            this.f5713n++;
            return;
        }
        Object[] objArr2 = this.f5712m;
        Object obj2 = objArr2[31];
        l.R(objArr2, l10, i10 + 1, i10, 31);
        l10[i10] = obj;
        u(objArr, l10, o(obj2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5710k;
    }

    public final a k(int i10) {
        Object[] objArr = this.f5711l;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int C = C() >> 5;
        a.a.n(i10, C);
        int i11 = this.f5709j;
        return i11 == 0 ? new d(i10, objArr) : new j(objArr, i10, C, i11 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] n7 = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        l.T(objArr, n7, 0, length, 6);
        return n7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        a.a.n(i10, this.f5713n);
        return new h(this, i10);
    }

    public final Object[] m(int i10, Object[] objArr) {
        if (j(objArr)) {
            l.R(objArr, objArr, i10, 0, 32 - i10);
            return objArr;
        }
        Object[] n7 = n();
        l.R(objArr, n7, i10, 0, 32 - i10);
        return n7;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5710k;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5710k;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            s1.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int I = v6.a.I(i10, i11);
        Object obj = objArr[I];
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object p8 = p((Object[]) obj, i10, i11 - 5);
        if (I < 31) {
            int i12 = I + 1;
            if (objArr[i12] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] n7 = n();
                l.R(objArr, n7, 0, 0, i12);
                objArr = n7;
            }
        }
        if (p8 == objArr[I]) {
            return objArr;
        }
        Object[] l10 = l(objArr);
        l10[I] = p8;
        return l10;
    }

    public final Object[] q(Object[] objArr, int i10, int i11, h.a aVar) {
        Object[] q10;
        int I = v6.a.I(i11 - 1, i10);
        if (i10 == 5) {
            aVar.f2590a = objArr[I];
            q10 = null;
        } else {
            Object obj = objArr[I];
            pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            q10 = q((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (q10 == null && I == 0) {
            return null;
        }
        Object[] l10 = l(objArr);
        l10[I] = q10;
        return l10;
    }

    public final void r(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f5711l = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5712m = objArr;
            this.f5713n = i10;
            this.f5709j = i11;
            return;
        }
        h.a aVar = new h.a(null);
        pc.j.b(objArr);
        Object[] q10 = q(objArr, i11, i10, aVar);
        pc.j.b(q10);
        Object obj = aVar.f2590a;
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f5712m = (Object[]) obj;
        this.f5713n = i10;
        if (q10[1] == null) {
            this.f5711l = (Object[]) q10[0];
            this.f5709j = i11 - 5;
        } else {
            this.f5711l = q10;
            this.f5709j = i11;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            s1.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            s1.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] l10 = l(objArr);
        int I = v6.a.I(i10, i11);
        int i12 = i11 - 5;
        l10[I] = s((Object[]) l10[I], i10, i12, it);
        while (true) {
            I++;
            if (I >= 32 || !it.hasNext()) {
                break;
            }
            l10[I] = s((Object[]) l10[I], 0, i12, it);
        }
        return l10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a.a.l(i10, a());
        if (C() > i10) {
            h.a aVar = new h.a(null);
            Object[] objArr = this.f5711l;
            pc.j.b(objArr);
            this.f5711l = D(objArr, this.f5709j, i10, obj, aVar);
            return aVar.f2590a;
        }
        Object[] l10 = l(this.f5712m);
        if (l10 != this.f5712m) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = l10[i11];
        l10[i11] = obj;
        this.f5712m = l10;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i10, Object[][] objArr2) {
        bc.b h10 = pc.j.h(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f5709j;
        Object[] s10 = i11 < (1 << i12) ? s(objArr, i10, i12, h10) : l(objArr);
        while (h10.hasNext()) {
            this.f5709j += 5;
            s10 = o(s10);
            int i13 = this.f5709j;
            s(s10, 1 << i13, i13, h10);
        }
        return s10;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f5713n;
        int i11 = i10 >> 5;
        int i12 = this.f5709j;
        if (i11 > (1 << i12)) {
            this.f5711l = v(this.f5709j + 5, o(objArr), objArr2);
            this.f5712m = objArr3;
            this.f5709j += 5;
            this.f5713n++;
            return;
        }
        if (objArr == null) {
            this.f5711l = objArr2;
            this.f5712m = objArr3;
            this.f5713n = i10 + 1;
        } else {
            this.f5711l = v(i12, objArr, objArr2);
            this.f5712m = objArr3;
            this.f5713n++;
        }
    }

    public final Object[] v(int i10, Object[] objArr, Object[] objArr2) {
        int I = v6.a.I(a() - 1, i10);
        Object[] l10 = l(objArr);
        if (i10 == 5) {
            l10[I] = objArr2;
            return l10;
        }
        l10[I] = v(i10 - 5, (Object[]) l10[I], objArr2);
        return l10;
    }

    public final int w(oc.c cVar, Object[] objArr, int i10, int i11, h.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f2590a;
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i11 = 0;
                }
                objArr3[i11] = obj2;
                i11++;
            }
        }
        aVar.f2590a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int x(oc.c cVar, Object[] objArr, int i10, h.a aVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = l(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        aVar.f2590a = objArr2;
        return i11;
    }

    public final int y(oc.c cVar, int i10, h.a aVar) {
        int x10 = x(cVar, this.f5712m, i10, aVar);
        if (x10 == i10) {
            return i10;
        }
        Object obj = aVar.f2590a;
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, x10, i10, (Object) null);
        this.f5712m = objArr;
        this.f5713n -= i10 - x10;
        return x10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (y(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(oc.c cVar) {
        Object[] s10;
        int i10;
        oc.c cVar2 = cVar;
        int F = F();
        Object[] objArr = null;
        h.a aVar = new h.a(null);
        boolean z10 = false;
        if (this.f5711l != null) {
            a k3 = k(0);
            int i11 = 32;
            while (i11 == 32 && k3.hasNext()) {
                i11 = x(cVar2, (Object[]) k3.next(), 32, aVar);
            }
            if (i11 == 32) {
                int y10 = y(cVar2, F, aVar);
                if (y10 == 0) {
                    r(this.f5711l, this.f5713n, this.f5709j);
                }
            } else {
                int i12 = (k3.f5696g - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i13 = i11;
                while (k3.hasNext()) {
                    i13 = w(cVar2, (Object[]) k3.next(), 32, i13, aVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int w3 = w(cVar, this.f5712m, F, i13, aVar, arrayList2, arrayList);
                Object obj = aVar.f2590a;
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, w3, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    s10 = this.f5711l;
                    pc.j.b(s10);
                } else {
                    s10 = s(this.f5711l, i12, this.f5709j, arrayList.iterator());
                }
                int size = i12 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    s1.a("invalid size");
                }
                if (size == 0) {
                    this.f5709j = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i10 = this.f5709j;
                        if ((i14 >> i10) != 0) {
                            break;
                        }
                        this.f5709j = i10 - 5;
                        Object[] objArr3 = s10[0];
                        pc.j.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        s10 = objArr3;
                    }
                    objArr = p(s10, i14, i10);
                }
                this.f5711l = objArr;
                this.f5712m = objArr2;
                this.f5713n = size + w3;
            }
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int F = F();
        if (F < 32) {
            Object[] l10 = l(this.f5712m);
            l10[F] = obj;
            this.f5712m = l10;
            this.f5713n = a() + 1;
        } else {
            u(this.f5711l, this.f5712m, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int F = F();
        Iterator it = collection.iterator();
        if (32 - F >= collection.size()) {
            Object[] l10 = l(this.f5712m);
            e(l10, F, it);
            this.f5712m = l10;
            this.f5713n = collection.size() + this.f5713n;
            return true;
        }
        int size = ((collection.size() + F) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] l11 = l(this.f5712m);
        e(l11, F, it);
        objArr[0] = l11;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] n7 = n();
            e(n7, 0, it);
            objArr[i10] = n7;
        }
        this.f5711l = t(this.f5711l, C(), objArr);
        Object[] n10 = n();
        e(n10, 0, it);
        this.f5712m = n10;
        this.f5713n = collection.size() + this.f5713n;
        return true;
    }
}
