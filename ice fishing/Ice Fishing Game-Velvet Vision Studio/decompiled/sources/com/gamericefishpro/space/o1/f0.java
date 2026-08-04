package com.gamericefishpro.space.o1;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.gamericefishpro.space.t0.y0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0 {
    public final List h;
    public final float i;

    public f0(List list, float f) {
        this.h = list;
        this.i = f;
    }

    @Override // com.gamericefishpro.space.o1.i0
    public final Shader H(long j) {
        long jV = com.gamericefishpro.space.wa.b.v(j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jV & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fB = this.i;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = com.gamericefishpro.space.n1.e.b(j) / 2;
        }
        float f = fB;
        List list = this.h;
        o.F(list, null);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = o.y(((s) list.get(i)).a);
        }
        return new RadialGradient(fIntBitsToFloat2, fIntBitsToFloat3, f, iArr, (float[]) null, o.x(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.a(this.h, f0Var.h) && com.gamericefishpro.space.n1.b.b(9205357640488583168L, 9205357640488583168L) && this.i == f0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + y0.a(this.i, y0.b(this.h.hashCode() * 961, 31, 9205357640488583168L), 31);
    }

    public final String toString() {
        String str;
        float f = this.i;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str = "radius=" + f + ", ";
        } else {
            str = "";
        }
        return "RadialGradient(colors=" + this.h + ", stops=null, " + str + "tileMode=" + ((Object) o.D(0)) + ')';
    }
}
