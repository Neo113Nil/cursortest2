package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class OL extends OK {
    @Override // com.google.android.gms.internal.ads.OK
    public final boolean W(long j6, Object obj) {
        return PL.f26763e ? PL.j(j6, obj) : PL.k(j6, obj);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Z(Object obj, long j6, boolean z3) {
        if (PL.f26763e) {
            PL.l(obj, j6, z3);
        } else {
            PL.m(obj, j6, z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final float a0(long j6, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f26598n).getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void n1(Object obj, long j6, float f3) {
        ((Unsafe) this.f26598n).putInt(obj, j6, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final double o1(long j6, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f26598n).getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void r1(Object obj, long j6, double d2) {
        ((Unsafe) this.f26598n).putLong(obj, j6, Double.doubleToLongBits(d2));
    }
}
