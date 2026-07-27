package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class E0 extends AbstractC4355o2 {
    private static final E0 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        E0 e02 = new E0();
        zzb = e02;
        AbstractC4355o2.l(E0.class, e02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", D0.class, C0.class});
        }
        if (i6 == 3) {
            return new E0();
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
