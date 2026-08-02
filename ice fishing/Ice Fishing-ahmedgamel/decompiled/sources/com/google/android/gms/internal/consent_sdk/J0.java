package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC4378o2 {
    private static final J0 zzb;
    private int zzd;
    private I0 zze;

    static {
        J0 j02 = new J0();
        zzb = j02;
        AbstractC4378o2.l(J0.class, j02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new J0();
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
