package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4358j2 extends AbstractC4378o2 {
    private static final C4358j2 zzb;
    private long zzd;
    private int zze;

    static {
        C4358j2 c4358j2 = new C4358j2();
        zzb = c4358j2;
        AbstractC4378o2.l(C4358j2.class, c4358j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new C4358j2();
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
