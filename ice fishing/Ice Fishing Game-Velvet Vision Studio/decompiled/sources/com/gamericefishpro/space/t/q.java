package com.gamericefishpro.space.t;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ long[] e;
    public /* synthetic */ Object[] i;
    public /* synthetic */ int v;

    public q(int i) {
        if (i == 0) {
            this.e = com.gamericefishpro.space.u.a.b;
            this.i = com.gamericefishpro.space.u.a.c;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.e = new long[i5];
        this.i = new Object[i5];
    }

    public final void a() {
        int i = this.v;
        Object[] objArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.v = 0;
        this.d = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = com.gamericefishpro.space.u.a.b(this.e, this.v, j);
        if (iB < 0 || (obj = this.i[iB]) == r.a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.d) {
            int i = this.v;
            long[] jArr = this.e;
            Object[] objArr = this.i;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != r.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.v = i2;
        }
        return com.gamericefishpro.space.u.a.b(this.e, this.v, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        q qVar = (q) objClone;
        qVar.e = (long[]) this.e.clone();
        qVar.i = (Object[]) this.i.clone();
        return qVar;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.v)) {
            com.gamericefishpro.space.u.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != r.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.v = i3;
        }
        return this.e[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = r.a;
        int iB = com.gamericefishpro.space.u.a.b(this.e, this.v, j);
        if (iB >= 0) {
            this.i[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.v;
        if (i < i2) {
            Object[] objArr = this.i;
            if (objArr[i] == obj2) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.d) {
            long[] jArr = this.e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.i;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.d = false;
                this.v = i3;
                i = ~com.gamericefishpro.space.u.a.b(this.e, i3, j);
            }
        }
        int i5 = this.v;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.e, i9);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, i9);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.i = objArrCopyOf;
        }
        int i10 = this.v;
        if (i10 - i != 0) {
            long[] jArr2 = this.e;
            int i11 = i + 1;
            com.gamericefishpro.space.ph.u.e(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.i;
            com.gamericefishpro.space.ph.u.d(i11, i, this.v, objArr3, objArr3);
        }
        this.e[i] = j;
        this.i[i] = obj;
        this.v++;
    }

    public final void f(long j) {
        int iB = com.gamericefishpro.space.u.a.b(this.e, this.v, j);
        if (iB >= 0) {
            Object[] objArr = this.i;
            Object obj = objArr[iB];
            Object obj2 = r.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.d = true;
            }
        }
    }

    public final int g() {
        if (this.d) {
            int i = this.v;
            long[] jArr = this.e;
            Object[] objArr = this.i;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != r.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.v = i2;
        }
        return this.v;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.v)) {
            com.gamericefishpro.space.u.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != r.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.v = i3;
        }
        return this.i[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.v * 28);
        sb.append('{');
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }
}
