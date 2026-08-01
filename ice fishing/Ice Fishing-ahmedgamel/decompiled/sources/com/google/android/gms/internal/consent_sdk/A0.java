package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class A0 extends AbstractC4355o2 {
    private static final A0 zzb;
    private int zzd;
    private String zze = "";

    static {
        A0 a02 = new A0();
        zzb = a02;
        AbstractC4355o2.l(A0.class, a02);
    }

    public static C4396z0 m() {
        return (C4396z0) zzb.g();
    }

    public static /* synthetic */ void n(A0 a02) {
        a02.zzd |= 1;
        a02.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new A0();
        }
        if (i6 == 4) {
            return new C4396z0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
