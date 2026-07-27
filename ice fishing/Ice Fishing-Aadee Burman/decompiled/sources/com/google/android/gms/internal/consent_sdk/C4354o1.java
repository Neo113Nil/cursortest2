package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4354o1 extends AbstractC4355o2 {
    private static final C4354o1 zzb;
    private InterfaceC4363q2 zzd = C4359p2.f35733x;

    static {
        C4354o1 c4354o1 = new C4354o1();
        zzb = c4354o1;
        AbstractC4355o2.l(C4354o1.class, c4354o1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", S.f35586A});
        }
        if (i6 == 3) {
            return new C4354o1();
        }
        if (i6 == 4) {
            return new H0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
