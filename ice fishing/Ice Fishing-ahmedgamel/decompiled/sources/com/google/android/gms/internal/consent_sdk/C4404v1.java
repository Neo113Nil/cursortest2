package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4404v1 extends AbstractC4378o2 {
    private static final C4404v1 zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";
    private String zzh = "";

    static {
        C4404v1 c4404v1 = new C4404v1();
        zzb = c4404v1;
        AbstractC4378o2.l(C4404v1.class, c4404v1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new C4404v1();
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
