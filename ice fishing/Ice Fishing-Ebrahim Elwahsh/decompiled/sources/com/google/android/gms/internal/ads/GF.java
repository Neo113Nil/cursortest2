package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class GF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f25129a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f25130b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f25131c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f25132d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f25129a = new C3733pG(C3570mF.class, DF.f24383B);
        f25130b = new C3625nG(a9, DF.f24408y);
        f25131c = new XF(C3462kF.class, DF.f24409z);
        f25132d = new VF(a9, DF.f24382A);
    }

    public static EI a(LE le) {
        if (LE.f26117A.equals(le)) {
            return EI.TINK;
        }
        if (LE.f26118B.equals(le)) {
            return EI.CRUNCHY;
        }
        if (LE.f26119C.equals(le)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(le.f26130u));
    }

    public static LE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return LE.f26117A;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return LE.f26119C;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return LE.f26118B;
    }
}
