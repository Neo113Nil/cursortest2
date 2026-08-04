package com.gamericefishpro.space.x0;

import com.gamericefishpro.space.f1.r;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.t0.m1;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final Object[] e;
    public final Object[] i;
    public final int v;
    public final int w;

    public d(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.i = objArr2;
        this.v = i;
        this.w = i2;
        if (!(b() > 32)) {
            m1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] c(Object[] objArr, int i, int i2, Object obj, com.gamericefishpro.space.e4.g gVar) {
        Object[] objArrCopyOf;
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        if (i == 0) {
            if (iY == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            u.d(iY + 1, iY, 31, objArr, objArrCopyOf);
            gVar.d = objArr[31];
            objArrCopyOf[iY] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i3 = i - 5;
        Object obj2 = objArr[iY];
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iY] = c((Object[]) obj2, i3, i2, obj, gVar);
        while (true) {
            iY++;
            if (iY >= 32 || objArrCopyOf2[iY] == null) {
                break;
            }
            Object obj3 = objArr[iY];
            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iY] = c((Object[]) obj3, i3, 0, gVar.d, gVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] f(Object[] objArr, int i, int i2, com.gamericefishpro.space.e4.g gVar) {
        Object[] objArrF;
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        if (i == 5) {
            gVar.d = objArr[iY];
            objArrF = null;
        } else {
            Object obj = objArr[iY];
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrF = f((Object[]) obj, i - 5, i2, gVar);
        }
        if (objArrF == null && iY == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iY] = objArrF;
        return objArrCopyOf;
    }

    public static Object[] o(int i, int i2, Object obj, Object[] objArr) {
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (i == 0) {
            objArrCopyOf[iY] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iY];
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iY] = o(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b add(Object obj) {
        int iN = n();
        int i = this.v;
        int i2 = i - iN;
        Object[] objArr = this.e;
        Object[] objArr2 = this.i;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return h(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = obj;
        return new d(objArr, objArrCopyOf, i + 1, this.w);
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.w0.b
    public final e builder() {
        return new e(this, this.e, this.i, this.w);
    }

    public final d d(int i, Object obj, Object[] objArr) {
        int iN = n();
        int i2 = this.v;
        int i3 = i2 - iN;
        Object[] objArr2 = this.i;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (i3 < 32) {
            u.d(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new d(objArr, objArrCopyOf, i2 + 1, this.w);
        }
        Object obj2 = objArr2[31];
        u.d(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return h(objArr, objArrCopyOf, objArr3);
    }

    @Override // com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b e(r rVar) {
        e eVar = new e(this, this.e, this.i, this.w);
        eVar.D(rVar);
        return eVar.d();
    }

    @Override // com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b g(int i) {
        com.gamericefishpro.space.b9.a.h(i, this.v);
        int iN = n();
        Object[] objArr = this.e;
        int i2 = this.w;
        return i >= iN ? m(objArr, iN, i2, i - iN) : m(l(objArr, i2, i, new com.gamericefishpro.space.e4.g(this.i[0])), iN, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        com.gamericefishpro.space.b9.a.h(i, b());
        if (n() <= i) {
            objArr = this.i;
        } else {
            objArr = this.e;
            for (int i2 = this.w; i2 > 0; i2 -= 5) {
                Object obj = objArr[com.gamericefishpro.space.i.a.y(i, i2)];
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final d h(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.v;
        int i2 = i >> 5;
        int i3 = this.w;
        if (i2 <= (1 << i3)) {
            return new d(i(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new d(i(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public final Object[] i(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iY = com.gamericefishpro.space.i.a.y(b() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iY] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iY] = i(i - 5, (Object[]) objArrCopyOf[iY], objArr2);
        return objArrCopyOf;
    }

    public final Object[] l(Object[] objArr, int i, int i2, com.gamericefishpro.space.e4.g gVar) {
        Object[] objArrCopyOf;
        int iY = com.gamericefishpro.space.i.a.y(i2, i);
        if (i == 0) {
            if (iY == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            u.d(iY, iY + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = gVar.d;
            gVar.d = objArr[iY];
            return objArrCopyOf;
        }
        int iY2 = objArr[31] == null ? com.gamericefishpro.space.i.a.y(n() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i3 = i - 5;
        int i4 = iY + 1;
        if (i4 <= iY2) {
            while (true) {
                Object obj = objArrCopyOf2[iY2];
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iY2] = l((Object[]) obj, i3, 0, gVar);
                if (iY2 == i4) {
                    break;
                }
                iY2--;
            }
        }
        Object obj2 = objArrCopyOf2[iY];
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iY] = l((Object[]) obj2, i3, i2, gVar);
        return objArrCopyOf2;
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final ListIterator listIterator(int i) {
        com.gamericefishpro.space.b9.a.i(i, this.v);
        return new f(i, this.v, (this.w / 5) + 1, this.e, this.i);
    }

    public final b m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.v - i;
        if (i4 != 1) {
            Object[] objArr2 = this.i;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                u.d(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new d(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            }
            return new h(objArr);
        }
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(null);
        Object[] objArrF = f(objArr, i2, i - 1, gVar);
        Intrinsics.b(objArrF);
        Object obj = gVar.d;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrF[1] != null) {
            return new d(objArrF, objArr3, i, i2);
        }
        Object obj2 = objArrF[0];
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new d((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int n() {
        return (this.v - 1) & (-32);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final com.gamericefishpro.space.w0.b set(int i, Object obj) {
        int i2 = this.v;
        com.gamericefishpro.space.b9.a.h(i, i2);
        int iN = n();
        Object[] objArr = this.e;
        Object[] objArr2 = this.i;
        int i3 = this.w;
        if (iN > i) {
            return new d(o(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new d(objArr, objArrCopyOf, i2, i3);
    }

    @Override // java.util.List, com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b add(int i, Object obj) {
        int i2 = this.v;
        com.gamericefishpro.space.b9.a.i(i, i2);
        if (i == i2) {
            return add(obj);
        }
        int iN = n();
        Object[] objArr = this.e;
        if (i >= iN) {
            return d(i - iN, obj, objArr);
        }
        com.gamericefishpro.space.e4.g gVar = new com.gamericefishpro.space.e4.g(null);
        return d(0, gVar.d, c(objArr, this.w, i, obj, gVar));
    }
}
