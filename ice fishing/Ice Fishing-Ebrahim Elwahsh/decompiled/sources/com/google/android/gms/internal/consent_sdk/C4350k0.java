package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4350k0 extends AbstractC4368o2 {
    private static final C4350k0 zzb;

    static {
        C4350k0 c4350k0 = new C4350k0();
        zzb = c4350k0;
        AbstractC4368o2.l(C4350k0.class, c4350k0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0000", null);
        }
        if (i4 == 3) {
            return new C4350k0();
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
