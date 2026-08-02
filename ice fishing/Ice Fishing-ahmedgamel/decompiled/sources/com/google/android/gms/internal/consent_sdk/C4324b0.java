package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4324b0 extends AbstractC4378o2 {
    private static final C4324b0 zzb;
    private int zzd;
    private Z zze;
    private C4320a0 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C4324b0 c4324b0 = new C4324b0();
        zzb = c4324b0;
        AbstractC4378o2.l(C4324b0.class, c4324b0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new C4324b0();
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
