package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class T1 extends AbstractC4355o2 {
    private static final T1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        T1 t12 = new T1();
        zzb = t12;
        AbstractC4355o2.l(T1.class, t12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", J1.f35537E, "zzf", J1.f35538F});
        }
        if (i6 == 3) {
            return new T1();
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
