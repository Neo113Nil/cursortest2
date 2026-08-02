package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class X extends AbstractC4378o2 {
    private static final X zzb;
    private int zzd;
    private int zze;
    private W zzf;

    static {
        X x9 = new X();
        zzb = x9;
        AbstractC4378o2.l(X.class, x9);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", S.f36361d, "zzf"});
        }
        if (i4 == 3) {
            return new X();
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
