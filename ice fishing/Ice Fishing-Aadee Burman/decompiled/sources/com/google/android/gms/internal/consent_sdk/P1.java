package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class P1 extends AbstractC4355o2 {
    private static final P1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private Y2 zzi;
    private Y2 zzj;
    private int zzk;

    static {
        P1 p1 = new P1();
        zzb = p1;
        AbstractC4355o2.l(P1.class, p1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u00067\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", J1.f35552z, "zzh", J1.f35533A, "zzi", "zzj", "zzk", J1.f35534B, C4335j2.class});
        }
        if (i6 == 3) {
            return new P1();
        }
        if (i6 == 4) {
            return new C4369s1(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
