package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4298a1 extends AbstractC4355o2 {
    private static final C4298a1 zzb;
    private int zzd;
    private Z0 zze;

    static {
        C4298a1 c4298a1 = new C4298a1();
        zzb = c4298a1;
        AbstractC4355o2.l(C4298a1.class, c4298a1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new C4298a1();
        }
        if (i6 == 4) {
            return new H0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
