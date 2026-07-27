package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class XG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f28626a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f28627b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f28628c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f28629d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f28626a = new C3733pG(LG.class, DF.f24393M);
        f28627b = new C3625nG(a9, DF.J);
        f28628c = new XF(JG.class, DF.f24391K);
        f28629d = new VF(a9, DF.f24392L);
    }

    public static EI a(C3731pE c3731pE) {
        if (C3731pE.f33360H.equals(c3731pE)) {
            return EI.TINK;
        }
        if (C3731pE.f33361I.equals(c3731pE)) {
            return EI.CRUNCHY;
        }
        if (C3731pE.f33362K.equals(c3731pE)) {
            return EI.RAW;
        }
        if (C3731pE.J.equals(c3731pE)) {
            return EI.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3731pE)));
    }

    public static C3731pE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return C3731pE.f33360H;
        }
        if (ordinal == 2) {
            return C3731pE.J;
        }
        if (ordinal == 3) {
            return C3731pE.f33362K;
        }
        if (ordinal == 4) {
            return C3731pE.f33361I;
        }
        int a9 = ei.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
    }
}
