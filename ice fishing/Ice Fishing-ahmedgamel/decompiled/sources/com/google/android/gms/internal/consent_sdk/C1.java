package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class C1 extends AbstractC4378o2 {
    private static final C1 zzb;
    private int zzd;
    private A1 zze;
    private B1 zzf;

    static {
        C1 c12 = new C1();
        zzb = c12;
        AbstractC4378o2.l(C1.class, c12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C1();
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
