package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC4378o2 {
    private static final Z1 zzb;
    private int zzd;
    private int zze;

    static {
        Z1 z12 = new Z1();
        zzb = z12;
        AbstractC4378o2.l(Z1.class, z12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new Z1();
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
