package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4303b2 extends AbstractC4355o2 {
    private static final C4303b2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC4363q2 zzg = C4359p2.f35733x;

    static {
        C4303b2 c4303b2 = new C4303b2();
        zzb = c4303b2;
        AbstractC4355o2.l(C4303b2.class, c4303b2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            J1 j12 = J1.f35541I;
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", j12, "zzf", j12});
        }
        if (i6 == 3) {
            return new C4303b2();
        }
        if (i6 == 4) {
            return new C4299a2(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
