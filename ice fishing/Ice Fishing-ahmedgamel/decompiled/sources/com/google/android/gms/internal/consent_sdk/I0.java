package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC4378o2 {
    private static final I0 zzb;

    static {
        I0 i02 = new I0();
        zzb = i02;
        AbstractC4378o2.l(I0.class, i02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0000", null);
        }
        if (i4 == 3) {
            return new I0();
        }
        if (i4 == 4) {
            return new H0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
