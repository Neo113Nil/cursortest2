package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class C0 extends AbstractC4368o2 {
    private static final C0 zzb;

    static {
        C0 c02 = new C0();
        zzb = c02;
        AbstractC4368o2.l(C0.class, c02);
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
            return new C0();
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
