package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4368m0 extends AbstractC4378o2 {
    private static final C4368m0 zzb;
    private int zzd;
    private C4380p0 zze;
    private boolean zzf;

    static {
        C4368m0 c4368m0 = new C4368m0();
        zzb = c4368m0;
        AbstractC4378o2.l(C4368m0.class, c4368m0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C4368m0();
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
