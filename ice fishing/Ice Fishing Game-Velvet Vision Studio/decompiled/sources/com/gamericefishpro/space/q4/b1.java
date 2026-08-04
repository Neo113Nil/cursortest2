package com.gamericefishpro.space.q4;

import com.android.installreferrer.api.InstallReferrerClient;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends d1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return e1.g ? e1.b(j, obj) : e1.c(j, obj);
            default:
                return e1.g ? e1.b(j, obj) : e1.c(j, obj);
        }
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final double d(long j, Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final float e(long j, Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!e1.g) {
                    e1.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    e1.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!e1.g) {
                    e1.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    e1.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!e1.g) {
                    e1.l(obj, j, b);
                } else {
                    e1.k(obj, j, b);
                }
                break;
            default:
                if (!e1.g) {
                    e1.l(obj, j, b);
                } else {
                    e1.k(obj, j, b);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.gamericefishpro.space.q4.d1
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
