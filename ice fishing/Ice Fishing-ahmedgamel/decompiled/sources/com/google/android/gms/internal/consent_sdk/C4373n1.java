package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4373n1 extends AbstractC4378o2 {
    private static final C4373n1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C4373n1 c4373n1 = new C4373n1();
        zzb = c4373n1;
        AbstractC4378o2.l(C4373n1.class, c4373n1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C4373n1();
        }
        if (i4 == 4) {
            return new H0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
