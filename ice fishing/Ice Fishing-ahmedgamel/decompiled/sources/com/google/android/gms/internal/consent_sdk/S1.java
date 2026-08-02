package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class S1 extends AbstractC4378o2 {
    private static final S1 zzb;
    private int zzd;
    private Q1 zze;
    private R1 zzf;
    private P1 zzg;
    private int zzh;

    static {
        S1 s12 = new S1();
        zzb = s12;
        AbstractC4378o2.l(S1.class, s12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0005᠌\u0003", new Object[]{"zzd", "zzf", "zzg", "zze", "zzh", J1.f36314N});
        }
        if (i4 == 3) {
            return new S1();
        }
        if (i4 == 4) {
            return new C4392s1(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
