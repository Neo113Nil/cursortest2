package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Y0 extends AbstractC4368o2 {
    private static final Y0 zzb;
    private int zzd;
    private X0 zze;

    static {
        Y0 y02 = new Y0();
        zzb = y02;
        AbstractC4368o2.l(Y0.class, y02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new Y0();
        }
        if (i4 == 4) {
            return new H0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
