package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class S1 extends AbstractC4355o2 {
    private static final S1 zzb;
    private int zzd;
    private Q1 zze;
    private R1 zzf;
    private P1 zzg;
    private int zzh;

    static {
        S1 s12 = new S1();
        zzb = s12;
        AbstractC4355o2.l(S1.class, s12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0005᠌\u0003", new Object[]{"zzd", "zzf", "zzg", "zze", "zzh", J1.f35545N});
        }
        if (i6 == 3) {
            return new S1();
        }
        if (i6 == 4) {
            return new C4369s1(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
