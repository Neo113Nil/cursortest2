package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC4355o2 {
    private static final Z1 zzb;
    private int zzd;
    private int zze;

    static {
        Z1 z12 = new Z1();
        zzb = z12;
        AbstractC4355o2.l(Z1.class, z12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new Z1();
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
