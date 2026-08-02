package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4326b2 extends AbstractC4378o2 {
    private static final C4326b2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC4386q2 zzg = C4382p2.f36502x;

    static {
        C4326b2 c4326b2 = new C4326b2();
        zzb = c4326b2;
        AbstractC4378o2.l(C4326b2.class, c4326b2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            J1 j12 = J1.f36310I;
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", j12, "zzf", j12});
        }
        if (i4 == 3) {
            return new C4326b2();
        }
        if (i4 == 4) {
            return new C4322a2(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
