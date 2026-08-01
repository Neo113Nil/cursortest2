package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4377u1 extends AbstractC4355o2 {
    private static final C4377u1 zzb;
    private int zzd;
    private C4394y2 zzh = C4394y2.f35796u;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C4377u1 c4377u1 = new C4377u1();
        zzb = c4377u1;
        AbstractC4355o2.l(C4377u1.class, c4377u1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", AbstractC4373t1.f35752a});
        }
        if (i6 == 3) {
            return new C4377u1();
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
