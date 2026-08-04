package com.gamericefishpro.space.t;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] i;
    public /* synthetic */ int v;

    public s0(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.e = new int[i5];
        this.i = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.v;
        if (i2 != 0 && i <= this.e[i2 - 1]) {
            e(i, obj);
            return;
        }
        if (this.d && i2 >= this.e.length) {
            r.a(this);
        }
        int i3 = this.v;
        if (i3 >= this.e.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.e, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, i7);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.i = objArrCopyOf;
        }
        this.e[i3] = i;
        this.i[i3] = obj;
        this.v = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final s0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        s0 s0Var = (s0) objClone;
        s0Var.e = (int[]) this.e.clone();
        s0Var.i = (Object[]) this.i.clone();
        return s0Var;
    }

    public final Object c(int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = com.gamericefishpro.space.u.a.a(this.v, i, this.e);
        if (iA < 0 || (obj = this.i[iA]) == r.c) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.d) {
            r.a(this);
        }
        return this.e[i];
    }

    public final void e(int i, Object obj) {
        int iA = com.gamericefishpro.space.u.a.a(this.v, i, this.e);
        if (iA >= 0) {
            this.i[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.v;
        if (i2 < i3) {
            Object[] objArr = this.i;
            if (objArr[i2] == r.c) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.d && i3 >= this.e.length) {
            r.a(this);
            i2 = ~com.gamericefishpro.space.u.a.a(this.v, i, this.e);
        }
        int i4 = this.v;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.e, i8);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, i8);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.i = objArrCopyOf;
        }
        int i9 = this.v;
        if (i9 - i2 != 0) {
            int[] iArr = this.e;
            int i10 = i2 + 1;
            com.gamericefishpro.space.ph.u.c(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.i;
            com.gamericefishpro.space.ph.u.d(i10, i2, this.v, objArr2, objArr2);
        }
        this.e[i2] = i;
        this.i[i2] = obj;
        this.v++;
    }

    public final int f() {
        if (this.d) {
            r.a(this);
        }
        return this.v;
    }

    public final Object g(int i) {
        if (this.d) {
            r.a(this);
        }
        Object[] objArr = this.i;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
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
            Object objG = g(i2);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
