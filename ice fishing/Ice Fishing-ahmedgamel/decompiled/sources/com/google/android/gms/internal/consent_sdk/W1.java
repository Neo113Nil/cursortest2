package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC4355o2 {
    private static final W1 zzb;
    private int zzd;
    private InterfaceC4366r2 zze = G2.f35519x;
    private M2 zzf;

    static {
        W1 w12 = new W1();
        zzb = w12;
        AbstractC4355o2.l(W1.class, w12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", V1.class, "zzf"});
        }
        if (i6 == 3) {
            return new W1();
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
