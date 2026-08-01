package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC4355o2 {
    private static final F0 zzb;
    private int zzd;
    private E0 zze;
    private long zzf;

    static {
        F0 f02 = new F0();
        zzb = f02;
        AbstractC4355o2.l(F0.class, f02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new F0();
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
