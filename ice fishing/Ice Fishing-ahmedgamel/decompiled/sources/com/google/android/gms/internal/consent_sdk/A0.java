package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class A0 extends AbstractC4378o2 {
    private static final A0 zzb;
    private int zzd;
    private String zze = "";

    static {
        A0 a02 = new A0();
        zzb = a02;
        AbstractC4378o2.l(A0.class, a02);
    }

    public static C4419z0 m() {
        return (C4419z0) zzb.g();
    }

    public static /* synthetic */ void n(A0 a02) {
        a02.zzd |= 1;
        a02.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new A0();
        }
        if (i4 == 4) {
            return new C4419z0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
