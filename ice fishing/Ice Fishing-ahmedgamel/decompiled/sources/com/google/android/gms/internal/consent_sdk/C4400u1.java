package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4400u1 extends AbstractC4378o2 {
    private static final C4400u1 zzb;
    private int zzd;
    private C4417y2 zzh = C4417y2.f36565u;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C4400u1 c4400u1 = new C4400u1();
        zzb = c4400u1;
        AbstractC4378o2.l(C4400u1.class, c4400u1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", AbstractC4396t1.f36521a});
        }
        if (i4 == 3) {
            return new C4400u1();
        }
        if (i4 == 4) {
            return new C4392s1(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
