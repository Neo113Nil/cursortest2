package com.gamericefishpro.space.o1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i0 {
    public final List h;
    public final List i;
    public final long j;
    public final long k;

    public a0(List list, ArrayList arrayList, long j, long j2) {
        this.h = list;
        this.i = arrayList;
        this.j = j;
        this.k = j2;
    }

    @Override // com.gamericefishpro.space.o1.i0
    public final Shader H(long j) {
        float[] fArr;
        long j2 = this.j;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.k;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.h;
        List list2 = this.i;
        o.F(list, list2);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = o.y(((s) list.get(i5)).a);
        }
        if (list2 != null) {
            Intrinsics.checkNotNullParameter(list2, "<this>");
            fArr = new float[list2.size()];
            Iterator it = list2.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                fArr[i6] = ((Number) it.next()).floatValue();
                i6++;
            }
        } else {
            fArr = null;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, fArr, o.x(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.h, a0Var.h) && Intrinsics.a(this.i, a0Var.i) && com.gamericefishpro.space.n1.b.b(this.j, a0Var.j) && com.gamericefishpro.space.n1.b.b(this.k, a0Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        List list = this.i;
        return Integer.hashCode(0) + y0.b(y0.b((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        String str;
        long j = this.j;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) com.gamericefishpro.space.n1.b.g(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.k;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) com.gamericefishpro.space.n1.b.g(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.h + ", stops=" + this.i + ", " + str + str2 + "tileMode=" + ((Object) o.D(0)) + ')';
    }
}
