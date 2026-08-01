package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4306c1 extends AbstractC4355o2 {
    private static final C4306c1 zzb;

    static {
        C4306c1 c4306c1 = new C4306c1();
        zzb = c4306c1;
        AbstractC4355o2.l(C4306c1.class, c4306c1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0000", null);
        }
        if (i6 == 3) {
            return new C4306c1();
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
