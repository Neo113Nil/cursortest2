package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ZE extends AbstractC4270zE {

    /* renamed from: b, reason: collision with root package name */
    public final C2920aF f28973b;

    /* renamed from: c, reason: collision with root package name */
    public final C3791qK f28974c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f28975d;

    public ZE(C2920aF c2920aF, C3791qK c3791qK, Integer num) {
        this.f28973b = c2920aF;
        this.f28974c = c3791qK;
        this.f28975d = num;
    }

    public static ZE k(C2920aF c2920aF, Integer num) {
        C3791qK a9;
        LE le = c2920aF.f29188b;
        if (le == LE.f26127y) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a9 = C3791qK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (le != LE.f26128z) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(le.f26130u));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a9 = C3791qK.a(new byte[0]);
        }
        return new ZE(c2920aF, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f28973b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f28975d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4270zE
    public final C3791qK j() {
        return this.f28974c;
    }
}
