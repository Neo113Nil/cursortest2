package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class ZL extends AbstractC2982bM {
    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void N(Object obj, long j9, byte b9) {
        if (AbstractC3036cM.f29702g) {
            AbstractC3036cM.c(obj, j9, b9);
        } else {
            AbstractC3036cM.d(obj, j9, b9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final boolean R(long j9, Object obj) {
        return AbstractC3036cM.f29702g ? AbstractC3036cM.p(j9, obj) : AbstractC3036cM.q(j9, obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void W(Object obj, long j9, boolean z8) {
        if (AbstractC3036cM.f29702g) {
            AbstractC3036cM.c(obj, j9, z8 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC3036cM.d(obj, j9, z8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final float X(long j9, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f29483n).getInt(obj, j9));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void Y(Object obj, long j9, float f6) {
        ((Unsafe) this.f29483n).putInt(obj, j9, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final double a0(long j9, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f29483n).getLong(obj, j9));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void k1(Object obj, long j9, double d2) {
        ((Unsafe) this.f29483n).putLong(obj, j9, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final byte l1(long j9) {
        return Memory.peekByte((int) j9);
    }
}
