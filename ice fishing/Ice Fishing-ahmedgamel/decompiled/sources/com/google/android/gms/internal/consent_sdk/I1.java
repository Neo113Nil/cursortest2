package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class I1 extends AbstractC4378o2 {
    private static final I1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        I1 i12 = new I1();
        zzb = i12;
        AbstractC4378o2.l(I1.class, i12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", O2.f36353a, "zzf"});
        }
        if (i4 == 3) {
            return new I1();
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
