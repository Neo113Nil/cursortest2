package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4384q0 extends AbstractC4378o2 {
    private static final C4384q0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C4384q0 c4384q0 = new C4384q0();
        zzb = c4384q0;
        AbstractC4378o2.l(C4384q0.class, c4384q0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", S.i, "zzf", S.f36365h});
        }
        if (i4 == 3) {
            return new C4384q0();
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
