package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4381p1 extends AbstractC4378o2 {
    private static final C4381p1 zzb;
    private int zzd;
    private boolean zze;

    static {
        C4381p1 c4381p1 = new C4381p1();
        zzb = c4381p1;
        AbstractC4378o2.l(C4381p1.class, c4381p1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new C4381p1();
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
