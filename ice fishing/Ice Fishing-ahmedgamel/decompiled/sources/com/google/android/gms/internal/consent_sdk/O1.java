package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class O1 extends AbstractC4355o2 {
    private static final O1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        O1 o12 = new O1();
        zzb = o12;
        AbstractC4355o2.l(O1.class, o12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", J1.f35542K, "zzf", J1.f35551y});
        }
        if (i6 == 3) {
            return new O1();
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
