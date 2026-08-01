package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.consent_sdk.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4384w0 extends AbstractC4355o2 {
    private static final C4384w0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        C4384w0 c4384w0 = new C4384w0();
        zzb = c4384w0;
        AbstractC4355o2.l(C4384w0.class, c4384w0);
    }

    public static C4380v0 m() {
        return (C4380v0) zzb.g();
    }

    public static /* synthetic */ void n(C4384w0 c4384w0, int i) {
        c4384w0.zzd |= 8;
        c4384w0.zzh = i;
    }

    public static /* synthetic */ void o(C4384w0 c4384w0) {
        String str = Build.MODEL;
        str.getClass();
        c4384w0.zzd |= 4;
        c4384w0.zzg = str;
    }

    public static /* synthetic */ void p(C4384w0 c4384w0) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        c4384w0.zzd |= 2;
        c4384w0.zzf = str;
    }

    public static /* synthetic */ void q(C4384w0 c4384w0) {
        c4384w0.zze = 1;
        c4384w0.zzd = 1 | c4384w0.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new C4384w0();
        }
        if (i6 == 4) {
            return new C4380v0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
