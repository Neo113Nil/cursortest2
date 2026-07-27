package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class A1 extends AbstractC4355o2 {
    private static final A1 zzb;
    private int zzd;
    private C4397z1 zze;
    private F0 zzf;

    static {
        A1 a12 = new A1();
        zzb = a12;
        AbstractC4355o2.l(A1.class, a12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new A1();
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
