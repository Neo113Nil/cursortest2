package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4377o1 extends AbstractC4378o2 {
    private static final C4377o1 zzb;
    private InterfaceC4386q2 zzd = C4382p2.f36502x;

    static {
        C4377o1 c4377o1 = new C4377o1();
        zzb = c4377o1;
        AbstractC4378o2.l(C4377o1.class, c4377o1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4378o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", S.f36355A});
        }
        if (i4 == 3) {
            return new C4377o1();
        }
        if (i4 == 4) {
            return new H0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
