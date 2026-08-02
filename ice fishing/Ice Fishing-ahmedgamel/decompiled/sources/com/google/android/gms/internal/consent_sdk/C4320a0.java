package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4320a0 extends AbstractC4378o2 {
    private static final C4320a0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C4320a0 c4320a0 = new C4320a0();
        zzb = c4320a0;
        AbstractC4378o2.l(C4320a0.class, c4320a0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", S.f36360c, "zzf"});
        }
        if (i4 == 3) {
            return new C4320a0();
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
