package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Q0 extends AbstractC4378o2 {
    private static final Q0 zzb;

    static {
        Q0 q02 = new Q0();
        zzb = q02;
        AbstractC4378o2.l(Q0.class, q02);
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
            return new Q0();
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
