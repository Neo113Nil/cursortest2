package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class OL extends OK {
    @Override // com.google.android.gms.internal.ads.OK
    public final boolean W(long j6, Object obj) {
        return PL.f27546e ? PL.j(j6, obj) : PL.k(j6, obj);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Z(Object obj, long j6, boolean z6) {
        if (PL.f27546e) {
            PL.l(obj, j6, z6);
        } else {
            PL.m(obj, j6, z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final float a0(long j6, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f27380n).getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void f0(Object obj, long j6, float f2) {
        ((Unsafe) this.f27380n).putInt(obj, j6, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final double o1(long j6, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f27380n).getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void s1(Object obj, long j6, double d9) {
        ((Unsafe) this.f27380n).putLong(obj, j6, Double.doubleToLongBits(d9));
    }
}
