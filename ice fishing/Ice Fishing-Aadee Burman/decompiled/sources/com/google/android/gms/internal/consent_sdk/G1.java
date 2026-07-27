package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class G1 extends AbstractC4355o2 {
    private static final G1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private InterfaceC4363q2 zzi = C4359p2.f35733x;
    private String zzj = "";
    private F1 zzk;

    static {
        G1 g12 = new G1();
        zzb = g12;
        AbstractC4355o2.l(G1.class, g12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ࠬ\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"zzd", "zze", "zzf", J1.f35542K, "zzg", J1.f35544M, "zzh", J1.f35543L, "zzi", J1.J, "zzk", "zzj"});
        }
        if (i6 == 3) {
            return new G1();
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
