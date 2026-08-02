package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4321a1 extends AbstractC4378o2 {
    private static final C4321a1 zzb;
    private int zzd;
    private Z0 zze;

    static {
        C4321a1 c4321a1 = new C4321a1();
        zzb = c4321a1;
        AbstractC4378o2.l(C4321a1.class, c4321a1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new C4321a1();
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
