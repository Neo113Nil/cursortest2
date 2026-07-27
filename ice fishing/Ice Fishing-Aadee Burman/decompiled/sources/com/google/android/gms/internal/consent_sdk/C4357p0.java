package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4357p0 extends AbstractC4355o2 {
    private static final C4357p0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C4357p0 c4357p0 = new C4357p0();
        zzb = c4357p0;
        AbstractC4355o2.l(C4357p0.class, c4357p0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", S.f35589a, "zzf", S.f35590b});
        }
        if (i6 == 3) {
            return new C4357p0();
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
