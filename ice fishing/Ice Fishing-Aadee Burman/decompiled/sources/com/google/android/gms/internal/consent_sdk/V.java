package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class V extends AbstractC4355o2 {
    private static final V zzb;

    static {
        V v9 = new V();
        zzb = v9;
        AbstractC4355o2.l(V.class, v9);
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
            return new V();
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
