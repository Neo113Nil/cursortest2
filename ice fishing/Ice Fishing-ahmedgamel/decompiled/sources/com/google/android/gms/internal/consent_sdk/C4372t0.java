package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4372t0 extends AbstractC4355o2 {
    private static final C4372t0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4372t0 c4372t0 = new C4372t0();
        zzb = c4372t0;
        AbstractC4355o2.l(C4372t0.class, c4372t0);
    }

    public static C4368s0 m() {
        return (C4368s0) zzb.g();
    }

    public static /* synthetic */ void n(C4372t0 c4372t0, String str) {
        str.getClass();
        c4372t0.zzd |= 1;
        c4372t0.zze = str;
    }

    public static /* synthetic */ void o(C4372t0 c4372t0, String str) {
        str.getClass();
        c4372t0.zzd |= 2;
        c4372t0.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new C4372t0();
        }
        if (i6 == 4) {
            return new C4368s0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
