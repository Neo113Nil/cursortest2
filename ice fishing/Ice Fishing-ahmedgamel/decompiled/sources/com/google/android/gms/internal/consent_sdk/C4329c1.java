package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4329c1 extends AbstractC4378o2 {
    private static final C4329c1 zzb;

    static {
        C4329c1 c4329c1 = new C4329c1();
        zzb = c4329c1;
        AbstractC4378o2.l(C4329c1.class, c4329c1);
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
            return new C4329c1();
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
