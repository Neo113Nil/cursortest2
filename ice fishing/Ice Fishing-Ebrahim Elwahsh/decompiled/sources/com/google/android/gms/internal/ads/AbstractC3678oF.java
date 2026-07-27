package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3678oF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f33120a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f33121b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f33122c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f33123d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f33120a = new C3733pG(IE.class, C2975bF.f29444H);
        f33121b = new C3625nG(a9, C2975bF.f29441E);
        f33122c = new XF(CE.class, C2975bF.f29442F);
        f33123d = new VF(a9, C2975bF.f29443G);
    }

    public static EI a(HE he) {
        if (HE.f25328c.equals(he)) {
            return EI.TINK;
        }
        if (HE.f25329d.equals(he)) {
            return EI.CRUNCHY;
        }
        if (HE.f25330e.equals(he)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(he)));
    }

    public static HE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return HE.f25328c;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return HE.f25330e;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return HE.f25329d;
    }

    public static GE c(EnumC3032cI enumC3032cI) {
        int ordinal = enumC3032cI.ordinal();
        if (ordinal == 1) {
            return GE.f25115c;
        }
        if (ordinal == 2) {
            return GE.f25118f;
        }
        if (ordinal == 3) {
            return GE.f25117e;
        }
        if (ordinal == 4) {
            return GE.f25119g;
        }
        if (ordinal == 5) {
            return GE.f25116d;
        }
        int a9 = enumC3032cI.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(a9).length() + 26)));
    }

    public static C3359iI d(IE ie) {
        EnumC3032cI enumC3032cI;
        C3305hI C7 = C3359iI.C();
        int i = ie.f25542d;
        C7.h();
        ((C3359iI) C7.f30000u).F(i);
        GE ge = GE.f25115c;
        GE ge2 = ie.f25544f;
        if (ge.equals(ge2)) {
            enumC3032cI = EnumC3032cI.SHA1;
        } else if (GE.f25116d.equals(ge2)) {
            enumC3032cI = EnumC3032cI.SHA224;
        } else if (GE.f25117e.equals(ge2)) {
            enumC3032cI = EnumC3032cI.SHA256;
        } else if (GE.f25118f.equals(ge2)) {
            enumC3032cI = EnumC3032cI.SHA384;
        } else {
            if (!GE.f25119g.equals(ge2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(ge2)));
            }
            enumC3032cI = EnumC3032cI.SHA512;
        }
        C7.h();
        ((C3359iI) C7.f30000u).E(enumC3032cI);
        return (C3359iI) C7.j();
    }
}
