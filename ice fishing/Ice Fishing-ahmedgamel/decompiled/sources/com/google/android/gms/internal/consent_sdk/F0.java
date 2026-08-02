package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC4378o2 {
    private static final F0 zzb;
    private int zzd;
    private E0 zze;
    private long zzf;

    static {
        F0 f02 = new F0();
        zzb = f02;
        AbstractC4378o2.l(F0.class, f02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new F0();
        }
        if (i4 == 4) {
            return new T(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
