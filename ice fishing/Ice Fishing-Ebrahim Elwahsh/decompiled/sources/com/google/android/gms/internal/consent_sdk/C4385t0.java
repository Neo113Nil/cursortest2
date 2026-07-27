package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4385t0 extends AbstractC4368o2 {
    private static final C4385t0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4385t0 c4385t0 = new C4385t0();
        zzb = c4385t0;
        AbstractC4368o2.l(C4385t0.class, c4385t0);
    }

    public static C4381s0 m() {
        return (C4381s0) zzb.g();
    }

    public static /* synthetic */ void n(C4385t0 c4385t0, String str) {
        str.getClass();
        c4385t0.zzd |= 1;
        c4385t0.zze = str;
    }

    public static /* synthetic */ void o(C4385t0 c4385t0, String str) {
        str.getClass();
        c4385t0.zzd |= 2;
        c4385t0.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C4385t0();
        }
        if (i4 == 4) {
            return new C4381s0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
