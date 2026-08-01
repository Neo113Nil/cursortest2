package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC4355o2 {
    private static final M0 zzb;
    private int zzd;
    private int zze;

    static {
        M0 m0 = new M0();
        zzb = m0;
        AbstractC4355o2.l(M0.class, m0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"zzd", "zze", S.f35598k});
        }
        if (i6 == 3) {
            return new M0();
        }
        if (i6 == 4) {
            return new H0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
