package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Z extends AbstractC4368o2 {
    private static final Z zzb;
    private int zzd;
    private X zze;
    private Y zzf;

    static {
        Z z8 = new Z();
        zzb = z8;
        AbstractC4368o2.l(Z.class, z8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new Z();
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
