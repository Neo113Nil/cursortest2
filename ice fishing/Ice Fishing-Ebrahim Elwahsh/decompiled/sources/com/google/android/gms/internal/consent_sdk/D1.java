package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class D1 extends AbstractC4368o2 {
    private static final D1 zzb;
    private int zzd;
    private C1 zze;
    private U zzf;
    private String zzg = "";

    static {
        D1 d12 = new D1();
        zzb = d12;
        AbstractC4368o2.l(D1.class, d12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new D1();
        }
        if (i4 == 4) {
            return new C4382s1(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
