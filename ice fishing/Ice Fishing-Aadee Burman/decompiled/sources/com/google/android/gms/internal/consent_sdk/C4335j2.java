package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4335j2 extends AbstractC4355o2 {
    private static final C4335j2 zzb;
    private long zzd;
    private int zze;

    static {
        C4335j2 c4335j2 = new C4335j2();
        zzb = c4335j2;
        AbstractC4355o2.l(C4335j2.class, c4335j2);
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
            return new C4335j2();
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
