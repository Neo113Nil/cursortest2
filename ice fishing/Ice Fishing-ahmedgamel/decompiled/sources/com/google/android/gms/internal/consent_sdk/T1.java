package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class T1 extends AbstractC4378o2 {
    private static final T1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        T1 t12 = new T1();
        zzb = t12;
        AbstractC4378o2.l(T1.class, t12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", J1.f36306E, "zzf", J1.f36307F});
        }
        if (i4 == 3) {
            return new T1();
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
