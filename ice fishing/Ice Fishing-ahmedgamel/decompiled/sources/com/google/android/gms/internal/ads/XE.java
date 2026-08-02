package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class XE extends AbstractC4226yE {

    /* renamed from: b, reason: collision with root package name */
    public final YE f29285b;

    /* renamed from: c, reason: collision with root package name */
    public final C3263gK f29286c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29287d;

    public XE(YE ye, C3263gK c3263gK, Integer num) {
        this.f29285b = ye;
        this.f29286c = c3263gK;
        this.f29287d = num;
    }

    public static XE j(YE ye, Integer num) {
        C3263gK a9;
        C3902sE c3902sE = ye.f29438b;
        if (c3902sE == C3902sE.f34684k) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a9 = C3263gK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c3902sE != C3902sE.f34685l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(c3902sE.f34696b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a9 = C3263gK.a(new byte[0]);
        }
        return new XE(ye, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f29285b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29287d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4226yE
    public final C3263gK i() {
        return this.f29286c;
    }
}
