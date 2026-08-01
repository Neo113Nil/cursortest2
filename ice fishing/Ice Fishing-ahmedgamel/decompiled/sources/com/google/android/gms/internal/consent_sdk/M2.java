package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class M2 extends AbstractC4355o2 {
    private static final M2 zzb;
    private long zzd;
    private int zze;

    static {
        M2 m22 = new M2();
        zzb = m22;
        AbstractC4355o2.l(M2.class, m22);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new M2();
        }
        if (i6 == 4) {
            return new C4299a2(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
