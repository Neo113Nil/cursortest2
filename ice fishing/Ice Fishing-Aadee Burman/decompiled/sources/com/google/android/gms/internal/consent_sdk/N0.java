package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class N0 extends AbstractC4355o2 {
    private static final N0 zzb;
    private int zzd;
    private L0 zze;
    private M0 zzf;

    static {
        N0 n02 = new N0();
        zzb = n02;
        AbstractC4355o2.l(N0.class, n02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new N0();
        }
        if (i6 == 4) {
            return new T(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
