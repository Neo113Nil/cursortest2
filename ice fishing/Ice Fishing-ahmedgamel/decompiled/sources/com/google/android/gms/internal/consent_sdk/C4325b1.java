package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4325b1 extends AbstractC4378o2 {
    private static final C4325b1 zzb;

    static {
        C4325b1 c4325b1 = new C4325b1();
        zzb = c4325b1;
        AbstractC4378o2.l(C4325b1.class, c4325b1);
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
            return new C4325b1();
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
