package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class XE extends AbstractC4203yE {

    /* renamed from: b, reason: collision with root package name */
    public final YE f28505b;

    /* renamed from: c, reason: collision with root package name */
    public final C3240gK f28506c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f28507d;

    public XE(YE ye, C3240gK c3240gK, Integer num) {
        this.f28505b = ye;
        this.f28506c = c3240gK;
        this.f28507d = num;
    }

    public static XE j(YE ye, Integer num) {
        C3240gK a9;
        C3879sE c3879sE = ye.f28661b;
        if (c3879sE == C3879sE.f33916k) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a9 = C3240gK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c3879sE != C3879sE.f33917l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(c3879sE.f33928b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a9 = C3240gK.a(new byte[0]);
        }
        return new XE(ye, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f28505b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f28507d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4203yE
    public final C3240gK i() {
        return this.f28506c;
    }
}
