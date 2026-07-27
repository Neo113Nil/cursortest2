package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class K1 extends AbstractC4368o2 {
    private static final K1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private Y2 zzg;
    private Y2 zzh;
    private int zzi;

    static {
        K1 k12 = new K1();
        zzb = k12;
        AbstractC4368o2.l(K1.class, k12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u00047\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", J1.f35710u, C4348j2.class});
        }
        if (i4 == 3) {
            return new K1();
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
