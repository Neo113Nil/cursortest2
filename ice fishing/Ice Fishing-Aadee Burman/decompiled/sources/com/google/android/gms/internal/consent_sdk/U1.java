package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC4355o2 {
    private static final U1 zzb;
    private int zzd;
    private String zze = "";

    static {
        U1 u12 = new U1();
        zzb = u12;
        AbstractC4355o2.l(U1.class, u12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new U1();
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
