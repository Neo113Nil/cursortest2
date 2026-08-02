package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nx0 implements mx0, ox0 {
    public final float a;
    public final boolean b;
    public final Function2 c;
    public final float d;

    public nx0(float f, boolean z, Function2 function2) {
        this.a = f;
        this.b = z;
        this.c = function2;
        this.d = f;
    }

    @Override // defpackage.ox0
    public final void a(jx7 jx7Var, int i, int[] iArr, int[] iArr2) {
        w(jx7Var, i, iArr, xof.a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0)) {
            return false;
        }
        nx0 nx0Var = (nx0) obj;
        return cma.a(this.a, nx0Var.a) && this.b == nx0Var.b && Intrinsics.d(this.c, nx0Var.c);
    }

    public final int hashCode() {
        int e = k5r.e(Float.hashCode(this.a) * 31, 31, this.b);
        Function2 function2 = this.c;
        return e + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // defpackage.mx0, defpackage.ox0
    public final float o() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        vz1.z(this.a, ", ", sb);
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.mx0
    public final void w(jx7 jx7Var, int i, int[] iArr, xof xofVar, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int L = jx7Var.L(this.a);
        boolean z = this.b && xofVar == xof.b;
        x2i x2iVar = qx0.a;
        if (z) {
            i2 = 0;
            i3 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                i3 = Math.min(L, (i - min) - i4);
                i2 = iArr2[length] + i4 + i3;
            }
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            while (i5 < length2) {
                int i7 = iArr[i5];
                int min2 = Math.min(i2, i - i7);
                iArr2[i6] = min2;
                int min3 = Math.min(L, (i - min2) - i7);
                int i8 = iArr2[i6] + i7 + min3;
                i5++;
                i3 = min3;
                i2 = i8;
                i6++;
            }
        }
        int i9 = i2 - i3;
        Function2 function2 = this.c;
        if (function2 == null || i9 >= i) {
            return;
        }
        int intValue = ((Number) function2.invoke(Integer.valueOf(i - i9), xofVar)).intValue();
        int length3 = iArr2.length;
        for (int i10 = 0; i10 < length3; i10++) {
            iArr2[i10] = iArr2[i10] + intValue;
        }
    }
}
