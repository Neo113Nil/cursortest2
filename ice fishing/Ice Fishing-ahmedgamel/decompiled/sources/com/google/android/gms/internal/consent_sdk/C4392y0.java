package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4392y0 extends AbstractC4355o2 {
    private static final C4392y0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C4392y0 c4392y0 = new C4392y0();
        zzb = c4392y0;
        AbstractC4355o2.l(C4392y0.class, c4392y0);
    }

    public static C4388x0 m() {
        return (C4388x0) zzb.g();
    }

    public static /* synthetic */ void n(C4392y0 c4392y0, String str) {
        c4392y0.zzd |= 2;
        c4392y0.zzf = str;
    }

    public static /* synthetic */ void o(C4392y0 c4392y0, long j6) {
        c4392y0.zzd |= 4;
        c4392y0.zzg = j6;
    }

    public static /* synthetic */ void p(C4392y0 c4392y0, int i) {
        c4392y0.zze = i - 2;
        c4392y0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new C4392y0();
        }
        if (i6 == 4) {
            return new C4388x0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
