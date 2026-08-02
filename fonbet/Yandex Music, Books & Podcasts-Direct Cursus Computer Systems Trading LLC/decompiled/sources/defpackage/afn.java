package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class afn extends ltp {
    public final List c;
    public final List d;
    public final long e;
    public final float f;

    public afn(List list, ArrayList arrayList, long j, float f) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = f;
    }

    @Override // defpackage.ltp
    public final Shader b(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long y = a4g.y(j);
            intBitsToFloat = Float.intBitsToFloat((int) (y >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (y & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.f;
        if (f == Float.POSITIVE_INFINITY) {
            f = nmq.c(j) / 2;
        }
        float f2 = f;
        List list = this.c;
        List list2 = this.d;
        xee.P(list, list2);
        int y2 = xee.y(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, xee.H(list, y2), xee.I(y2, list2, list), saf.l0(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afn)) {
            return false;
        }
        afn afnVar = (afn) obj;
        return Intrinsics.d(this.c, afnVar.c) && Intrinsics.d(this.d, afnVar.d) && enj.c(this.e, afnVar.e) && this.f == afnVar.f;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + eta.a(tlm.c(this.e, (hashCode + (list != null ? list.hashCode() : 0)) * 31, 31), this.f, 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) enj.j(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.f;
        return "RadialGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? ouj.m("radius=", f, ", ") : "") + "tileMode=" + ((Object) ivf.N(0)) + ')';
    }
}
