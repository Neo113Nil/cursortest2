package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class B1 extends AbstractC4368o2 {
    private static final B1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        B1 b12 = new B1();
        zzb = b12;
        AbstractC4368o2.l(B1.class, b12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new B1();
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
