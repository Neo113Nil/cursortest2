package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class U0 extends AbstractC4378o2 {
    private static final U0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        U0 u02 = new U0();
        zzb = u02;
        AbstractC4378o2.l(U0.class, u02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", S.f36371o, "zzf", S.f36370n});
        }
        if (i4 == 3) {
            return new U0();
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
