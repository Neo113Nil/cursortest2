package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4301b0 extends AbstractC4355o2 {
    private static final C4301b0 zzb;
    private int zzd;
    private Z zze;
    private C4297a0 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C4301b0 c4301b0 = new C4301b0();
        zzb = c4301b0;
        AbstractC4355o2.l(C4301b0.class, c4301b0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new C4301b0();
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
