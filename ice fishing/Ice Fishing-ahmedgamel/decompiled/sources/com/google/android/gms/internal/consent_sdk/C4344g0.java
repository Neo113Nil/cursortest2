package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4344g0 extends AbstractC4378o2 {
    private static final C4344g0 zzb;
    private int zzd;
    private C4340f0 zze;
    private C4380p0 zzf;

    static {
        C4344g0 c4344g0 = new C4344g0();
        zzb = c4344g0;
        AbstractC4378o2.l(C4344g0.class, c4344g0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C4344g0();
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
