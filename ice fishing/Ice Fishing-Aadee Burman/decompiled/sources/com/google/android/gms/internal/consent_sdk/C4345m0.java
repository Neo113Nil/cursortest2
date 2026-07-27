package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4345m0 extends AbstractC4355o2 {
    private static final C4345m0 zzb;
    private int zzd;
    private C4357p0 zze;
    private boolean zzf;

    static {
        C4345m0 c4345m0 = new C4345m0();
        zzb = c4345m0;
        AbstractC4355o2.l(C4345m0.class, c4345m0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new C4345m0();
        }
        if (i6 == 4) {
            return new T(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
