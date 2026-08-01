package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.lF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3503lF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f31750a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f31751b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f31752c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f31753d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f31750a = new C3504lG(JE.class, VE.f28111M);
        f31751b = new C3396jG(a9, VE.J);
        f31752c = new TF(HE.class, VE.f28109K);
        f31753d = new RF(a9, VE.f28110L);
    }

    public static C3933tE a(C3879sE c3879sE) {
        if (c3879sE.equals(C3879sE.f33914h)) {
            return C3933tE.f34230d;
        }
        if (c3879sE.equals(C3879sE.i)) {
            return C3933tE.f34233g;
        }
        if (c3879sE.equals(C3879sE.f33915j)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3879sE)));
    }

    public static C3879sE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3879sE.f33914h;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return C3879sE.i;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3879sE.f33915j;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
