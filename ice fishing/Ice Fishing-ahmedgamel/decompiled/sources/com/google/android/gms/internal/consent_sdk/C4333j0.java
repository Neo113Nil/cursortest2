package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4333j0 extends AbstractC4355o2 {
    private static final C4333j0 zzb;
    private int zzd;
    private int zze;

    static {
        C4333j0 c4333j0 = new C4333j0();
        zzb = c4333j0;
        AbstractC4355o2.l(C4333j0.class, c4333j0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", S.f35593e});
        }
        if (i6 == 3) {
            return new C4333j0();
        }
        if (i6 == 4) {
            return new T(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
