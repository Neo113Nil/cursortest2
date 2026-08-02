package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4336e0 extends AbstractC4378o2 {
    private static final C4336e0 zzb;
    private int zzd;
    private C4332d0 zze;
    private C4408w1 zzf;
    private int zzg;

    static {
        C4336e0 c4336e0 = new C4336e0();
        zzb = c4336e0;
        AbstractC4378o2.l(C4336e0.class, c4336e0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", S.f36368l, "zzf"});
        }
        if (i4 == 3) {
            return new C4336e0();
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
