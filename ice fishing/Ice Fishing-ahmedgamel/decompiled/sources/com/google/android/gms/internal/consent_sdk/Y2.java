package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Y2 extends AbstractC4355o2 {
    private static final Y2 zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        Y2 y22 = new Y2();
        zzb = y22;
        AbstractC4355o2.l(Y2.class, y22);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new Y2();
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
