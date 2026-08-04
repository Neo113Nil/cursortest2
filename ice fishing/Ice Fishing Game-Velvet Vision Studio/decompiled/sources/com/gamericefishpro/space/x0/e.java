package com.gamericefishpro.space.x0;

import com.gamericefishpro.space.f1.r;
import com.gamericefishpro.space.ph.k;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.t0.m1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements Collection, com.gamericefishpro.space.fi.b {
    public int A;
    public com.gamericefishpro.space.w0.b d;
    public Object[] e;
    public Object[] i;
    public int v;
    public com.gamericefishpro.space.a1.b w = new com.gamericefishpro.space.a1.b();
    public Object[] y;
    public Object[] z;

    public e(b bVar, Object[] objArr, Object[] objArr2, int i) {
        this.d = bVar;
        this.e = objArr;
        this.i = objArr2;
        this.v = i;
        this.y = objArr;
        this.z = objArr2;
        this.A = bVar.size();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(Function1 function1, Object[] objArr, int i, int i2, com.gamericefishpro.space.e4.g gVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = gVar.d;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        gVar.d = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(Function1 function1, Object[] objArr, int i, com.gamericefishpro.space.e4.g gVar) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        gVar.d = objArrP;
        return i2;
    }

    public final int C(Function1 function1, int i, com.gamericefishpro.space.e4.g gVar) {
        int iB = B(function1, this.z, i, gVar);
        if (iB == i) {
            return i;
        }
        Object obj = gVar.d;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, iB, i, (Object) null);
        this.z = objArr;
        this.A -= i - iB;
        return iB;
    }

    public final boolean D(Function1 function1) {
        Object[] objArrW;
        int i;
        Function1 function2 = function1;
        int iJ = J();
        Object[] objArrT = null;
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(objArrT);
        boolean z = false;
        if (this.y != null) {
            a aVarO = o(0);
            int iB = 32;
            while (iB == 32 && aVarO.hasNext()) {
                iB = B(function2, (Object[]) aVarO.next(), 32, gVar);
            }
            if (iB == 32) {
                int iC = C(function2, iJ, gVar);
                if (iC == 0) {
                    v(this.y, this.A, this.v);
                }
                if (iC != iJ) {
                }
            } else {
                int i2 = (aVarO.d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (aVarO.hasNext()) {
                    iA = A(function2, (Object[]) aVarO.next(), 32, iA, gVar, arrayList2, arrayList);
                    function2 = function1;
                }
                int iA2 = A(function1, this.z, iJ, iA, gVar, arrayList2, arrayList);
                Object obj = gVar.d;
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Arrays.fill(objArr, iA2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrW = this.y;
                    Intrinsics.b(objArrW);
                } else {
                    objArrW = w(this.y, i2, this.v, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    m1.a("invalid size");
                }
                if (size == 0) {
                    this.v = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.v;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.v = i - 5;
                        Object[] objArr2 = objArrW[0];
                        Intrinsics.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrW = objArr2;
                    }
                    objArrT = t(objArrW, i3, i);
                }
                this.y = objArrT;
                this.z = objArr;
                this.A = size + iA2;
            }
            z = true;
        } else if (C(function2, iJ, gVar) != iJ) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, com.gamericefishpro.space.e4.g gVar) {
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        if (i == 0) {
            Object obj = objArr[iY];
            Object[] objArrP = p(objArr);
            u.d(iY, iY + 1, 32, objArr, objArrP);
            objArrP[31] = gVar.d;
            gVar.d = obj;
            return objArrP;
        }
        int iY2 = objArr[31] == null ? com.gamericefishpro.space.i.a.y(G() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        int i4 = iY + 1;
        if (i4 <= iY2) {
            while (true) {
                Object obj2 = objArrP2[iY2];
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrP2[iY2] = E((Object[]) obj2, i3, 0, gVar);
                if (iY2 == i4) {
                    break;
                }
                iY2--;
            }
        }
        Object obj3 = objArrP2[iY];
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iY] = E((Object[]) obj3, i3, i2, gVar);
        return objArrP2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.A - i;
        if (i4 == 1) {
            Object obj = this.z[0];
            v(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.z;
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        u.d(i3, i3 + 1, i4, objArr2, objArrP);
        objArrP[i4 - 1] = null;
        this.y = objArr;
        this.z = objArrP;
        this.A = (i + i4) - 1;
        this.v = i2;
        return obj2;
    }

    public final int G() {
        int i = this.A;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, com.gamericefishpro.space.e4.g gVar) {
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[iY];
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP[iY] = H((Object[]) obj2, i - 5, i2, obj, gVar);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        gVar.d = objArrP[iY];
        objArrP[iY] = obj;
        return objArrP;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            m1.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            u.d(size + 1, i4, i2, objArrP, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            u.d(0, i7, i2, objArrP, objArr3);
            u.d(size + 1, i4, i7, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        f(objArrP, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            f(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        f(objArr3, 0, it);
    }

    public final int J() {
        int i = this.A;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        com.gamericefishpro.space.b9.a.i(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            m(i - iG, obj, this.y);
            return;
        }
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(null);
        Object[] objArr = this.y;
        Intrinsics.b(objArr);
        m(0, gVar.d, l(objArr, this.v, i, obj, gVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        e eVar;
        Object[] objArrR;
        com.gamericefishpro.space.b9.a.i(i, this.A);
        if (i == this.A) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.A - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.z;
            Object[] objArrP = p(objArr);
            u.d(size2 + 1, i3, J(), objArr, objArrP);
            f(objArrP, i3, collection.iterator());
            this.z = objArrP;
            this.A = collection.size() + this.A;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.A;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            objArrR = r();
            collection2 = collection;
            I(collection2, i, this.z, iJ, objArr2, size, objArrR);
            eVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            eVar = this;
            if (size3 > iJ) {
                int i4 = size3 - iJ;
                Object[] objArrQ = q(i4, eVar.z);
                eVar.i(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                Object[] objArr3 = eVar.z;
                objArrR = r();
                int i5 = iJ - size3;
                u.d(0, i5, iJ, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, eVar.z);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                eVar.i(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        eVar.y = x(eVar.y, i2, objArr2);
        eVar.z = objArrR;
        eVar.A = collection2.size() + eVar.A;
        return true;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final int b() {
        return this.A;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final Object c(int i) {
        com.gamericefishpro.space.b9.a.h(i, b());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            return F(this.y, iG, this.v, i - iG);
        }
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(this.z[0]);
        Object[] objArr = this.y;
        Intrinsics.b(objArr);
        F(E(objArr, this.v, i, gVar), iG, this.v, 0);
        return gVar.d;
    }

    public final com.gamericefishpro.space.w0.b d() {
        com.gamericefishpro.space.w0.b dVar;
        Object[] objArr = this.y;
        if (objArr == this.e && this.z == this.i) {
            dVar = this.d;
        } else {
            this.w = new com.gamericefishpro.space.a1.b();
            this.e = objArr;
            Object[] objArr2 = this.z;
            this.i = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.y;
                Intrinsics.b(objArr3);
                dVar = new d(objArr3, this.z, b(), this.v);
            } else if (objArr2.length == 0) {
                dVar = h.i;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.z, b());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                dVar = new h(objArrCopyOf);
            }
        }
        this.d = dVar;
        return dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        com.gamericefishpro.space.b9.a.h(i, b());
        if (G() <= i) {
            objArr = this.z;
        } else {
            objArr = this.y;
            Intrinsics.b(objArr);
            for (int i2 = this.v; i2 > 0; i2 -= 5) {
                Object obj = objArr[com.gamericefishpro.space.i.a.y(i, i2)];
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final void i(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.y == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        a aVarO = o(G() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (aVarO.d - 1 != i4) {
            Object[] objArr3 = (Object[]) aVarO.previous();
            u.d(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) aVarO.previous();
        int iG = i3 - (((G() >> 5) - 1) - i4);
        if (iG < i3) {
            objArr2 = objArr[iG];
            Intrinsics.b(objArr2);
        }
        I(collection, i, objArr4, 32, objArr, iG, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, com.gamericefishpro.space.e4.g gVar) {
        Object obj2;
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        if (i == 0) {
            gVar.d = objArr[31];
            Object[] objArrP = p(objArr);
            u.d(iY + 1, iY, 31, objArr, objArrP);
            objArrP[iY] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrP2[iY];
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iY] = l((Object[]) obj3, i3, i2, obj, gVar);
        while (true) {
            iY++;
            if (iY >= 32 || (obj2 = objArrP2[iY]) == null) {
                break;
            }
            objArrP2[iY] = l((Object[]) obj2, i3, 0, gVar.d, gVar);
        }
        return objArrP2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        com.gamericefishpro.space.b9.a.i(i, this.A);
        return new g(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrP = p(this.z);
        if (iJ >= 32) {
            Object[] objArr2 = this.z;
            Object obj2 = objArr2[31];
            u.d(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            y(objArr, objArrP, s(obj2));
            return;
        }
        u.d(i + 1, i, iJ, this.z, objArrP);
        objArrP[i] = obj;
        this.y = objArr;
        this.z = objArrP;
        this.A++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.w;
    }

    public final a o(int i) {
        Object[] objArr = this.y;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iG = G() >> 5;
        com.gamericefishpro.space.b9.a.i(i, iG);
        int i2 = this.v;
        return i2 == 0 ? new c(i, objArr) : new i(objArr, i, iG, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        u.g(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            u.d(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        u.d(i, 0, 32 - i, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.w;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new r(2, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.w;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        com.gamericefishpro.space.b9.a.h(i, b());
        if (G() > i) {
            com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(null);
            Object[] objArr = this.y;
            Intrinsics.b(objArr);
            this.y = H(objArr, this.v, i, obj, gVar);
            return gVar.d;
        }
        Object[] objArrP = p(this.z);
        if (objArrP != this.z) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.z = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            m1.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iY = com.gamericefishpro.space.i.a.y(i, i2);
        Object obj = objArr[iY];
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iY < 31) {
            int i3 = iY + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                u.d(0, 0, i3, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iY]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iY] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i, int i2, com.gamericefishpro.space.e4.g gVar) {
        Object[] objArrU;
        int iY = com.gamericefishpro.space.i.a.y(i2 - 1, i);
        if (i == 5) {
            gVar.d = objArr[iY];
            objArrU = null;
        } else {
            Object obj = objArr[iY];
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrU = u((Object[]) obj, i - 5, i2, gVar);
        }
        if (objArrU == null && iY == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iY] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.z = objArr;
            this.A = i;
            this.v = i2;
            return;
        }
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(obj);
        Intrinsics.b(objArr);
        Object[] objArrU = u(objArr, i2, i, gVar);
        Intrinsics.b(objArrU);
        Object obj2 = gVar.d;
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.z = (Object[]) obj2;
        this.A = i;
        if (objArrU[1] == null) {
            this.y = (Object[]) objArrU[0];
            this.v = i2 - 5;
        } else {
            this.y = objArrU;
            this.v = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            m1.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            m1.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iY = com.gamericefishpro.space.i.a.y(i, i2);
        int i3 = i2 - 5;
        objArrP[iY] = w((Object[]) objArrP[iY], i, i3, it);
        while (true) {
            iY++;
            if (iY >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iY] = w((Object[]) objArrP[iY], 0, i3, it);
        }
        return objArrP;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        com.gamericefishpro.space.ei.b bVarA = com.gamericefishpro.space.ei.k.a(objArr2);
        int i2 = i >> 5;
        int i3 = this.v;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, bVarA) : p(objArr);
        while (bVarA.hasNext()) {
            this.v += 5;
            objArrW = s(objArrW);
            int i4 = this.v;
            w(objArrW, 1 << i4, i4, bVarA);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.A;
        int i2 = i >> 5;
        int i3 = this.v;
        if (i2 > (1 << i3)) {
            this.y = z(this.v + 5, s(objArr), objArr2);
            this.z = objArr3;
            this.v += 5;
            this.A++;
            return;
        }
        if (objArr == null) {
            this.y = objArr2;
            this.z = objArr3;
            this.A = i + 1;
        } else {
            this.y = z(i3, objArr, objArr2);
            this.z = objArr3;
            this.A++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int iY = com.gamericefishpro.space.i.a.y(b() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[iY] = objArr2;
            return objArrP;
        }
        objArrP[iY] = z(i - 5, (Object[]) objArrP[iY], objArr2);
        return objArrP;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (iJ < 32) {
            Object[] objArrP = p(this.z);
            objArrP[iJ] = obj;
            this.z = objArrP;
            this.A = b() + 1;
        } else {
            y(this.y, this.z, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrP = p(this.z);
            f(objArrP, iJ, it);
            this.z = objArrP;
            this.A = collection.size() + this.A;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.z);
        f(objArrP2, iJ, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            f(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.y = x(this.y, G(), objArr);
        Object[] objArrR2 = r();
        f(objArrR2, 0, it);
        this.z = objArrR2;
        this.A = collection.size() + this.A;
        return true;
    }
}
