package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4328c0 extends AbstractC4378o2 {
    private static final C4328c0 zzb;

    static {
        C4328c0 c4328c0 = new C4328c0();
        zzb = c4328c0;
        AbstractC4378o2.l(C4328c0.class, c4328c0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0000", null);
        }
        if (i4 == 3) {
            return new C4328c0();
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
