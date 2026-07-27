package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
public abstract class LJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f26135a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f26136b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f26137c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f26138d;

    /* renamed from: e, reason: collision with root package name */
    public static final XF f26139e;

    /* renamed from: f, reason: collision with root package name */
    public static final VF f26140f;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        C3791qK a10 = IG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f26135a = new C3733pG(C3306hJ.class, C4275zJ.f35503D);
        f26136b = new C3625nG(a9, C4275zJ.f35525y);
        f26137c = new XF(C3412jJ.class, C4275zJ.f35526z);
        f26138d = new VF(a10, C4275zJ.f35500A);
        f26139e = new XF(C3360iJ.class, C4275zJ.f35501B);
        f26140f = new VF(a9, C4275zJ.f35502C);
    }

    public static EI a(LE le) {
        if (LE.f26120D.equals(le)) {
            return EI.TINK;
        }
        if (LE.f26121E.equals(le)) {
            return EI.CRUNCHY;
        }
        if (LE.f26123G.equals(le)) {
            return EI.RAW;
        }
        if (LE.f26122F.equals(le)) {
            return EI.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(le.f26130u));
    }

    public static GE b(EnumC3032cI enumC3032cI) {
        int ordinal = enumC3032cI.ordinal();
        if (ordinal == 2) {
            return GE.f25125n;
        }
        if (ordinal == 3) {
            return GE.f25124m;
        }
        if (ordinal == 4) {
            return GE.f25126o;
        }
        int a9 = enumC3032cI.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(a9).length() + 26)));
    }

    public static LE c(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return LE.f26120D;
        }
        if (ordinal == 2) {
            return LE.f26122F;
        }
        if (ordinal == 3) {
            return LE.f26123G;
        }
        if (ordinal == 4) {
            return LE.f26121E;
        }
        int a9 = ei.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
    }

    public static int d(C3252gJ c3252gJ) {
        if (C3252gJ.f30976c.equals(c3252gJ)) {
            return 33;
        }
        if (C3252gJ.f30977d.equals(c3252gJ)) {
            return 49;
        }
        if (C3252gJ.f30978e.equals(c3252gJ)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(c3252gJ.f30979a));
    }

    public static SH e(C3306hJ c3306hJ) {
        EnumC3032cI enumC3032cI;
        int i;
        RH B8 = SH.B();
        GE ge = c3306hJ.f31224c;
        if (GE.f25124m.equals(ge)) {
            enumC3032cI = EnumC3032cI.SHA256;
        } else if (GE.f25125n.equals(ge)) {
            enumC3032cI = EnumC3032cI.SHA384;
        } else {
            if (!GE.f25126o.equals(ge)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(ge.f25128b));
            }
            enumC3032cI = EnumC3032cI.SHA512;
        }
        B8.h();
        ((SH) B8.f30000u).D(enumC3032cI);
        C3252gJ c3252gJ = C3252gJ.f30976c;
        C3252gJ c3252gJ2 = c3306hJ.f31223b;
        int i4 = 4;
        if (c3252gJ.equals(c3252gJ2)) {
            i = 4;
        } else if (C3252gJ.f30977d.equals(c3252gJ2)) {
            i = 5;
        } else {
            if (!C3252gJ.f30978e.equals(c3252gJ2)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(c3252gJ2.f30979a));
            }
            i = 6;
        }
        B8.h();
        ((SH) B8.f30000u).G(i);
        HE he = HE.f25335k;
        HE he2 = c3306hJ.f31222a;
        if (he.equals(he2)) {
            i4 = 3;
        } else if (!HE.f25336l.equals(he2)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(he2.f25338b));
        }
        B8.h();
        ((SH) B8.f30000u).H(i4);
        return (SH) B8.j();
    }

    public static WH f(C3412jJ c3412jJ) {
        int d2 = d(c3412jJ.f32098b.f31223b);
        VH F8 = WH.F();
        SH e6 = e(c3412jJ.f32098b);
        F8.h();
        ((WH) F8.f30000u).I(e6);
        ECPoint eCPoint = c3412jJ.f32099c;
        byte[] i = AbstractC4161xD.i(eCPoint.getAffineX(), d2);
        QK qk = SK.f27529u;
        QK s3 = SK.s(i, 0, i.length);
        F8.h();
        ((WH) F8.f30000u).J(s3);
        byte[] i4 = AbstractC4161xD.i(eCPoint.getAffineY(), d2);
        QK s6 = SK.s(i4, 0, i4.length);
        F8.h();
        ((WH) F8.f30000u).K(s6);
        return (WH) F8.j();
    }

    public static C3252gJ g(int i) {
        int i4 = i - 2;
        if (i4 == 2) {
            return C3252gJ.f30976c;
        }
        if (i4 == 3) {
            return C3252gJ.f30977d;
        }
        if (i4 == 4) {
            return C3252gJ.f30978e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.y.j(i4, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i4).length() + 35)));
        }
        AbstractC3684oL.a();
        throw null;
    }

    public static HE h(int i) {
        int i4 = i - 2;
        if (i4 == 1) {
            return HE.f25335k;
        }
        if (i4 == 2) {
            return HE.f25336l;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.y.j(i4, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i4).length() + 40)));
        }
        AbstractC3684oL.a();
        throw null;
    }
}
