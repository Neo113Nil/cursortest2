package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4350n1 extends AbstractC4355o2 {
    private static final C4350n1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C4350n1 c4350n1 = new C4350n1();
        zzb = c4350n1;
        AbstractC4355o2.l(C4350n1.class, c4350n1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new C4350n1();
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
