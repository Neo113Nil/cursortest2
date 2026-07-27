package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4305c0 extends AbstractC4355o2 {
    private static final C4305c0 zzb;

    static {
        C4305c0 c4305c0 = new C4305c0();
        zzb = c4305c0;
        AbstractC4355o2.l(C4305c0.class, c4305c0);
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
            return new C4305c0();
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
