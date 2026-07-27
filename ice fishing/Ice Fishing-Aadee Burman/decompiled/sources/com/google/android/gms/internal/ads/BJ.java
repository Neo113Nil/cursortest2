package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
public abstract class BJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f23871a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f23872b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f23873c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f23874d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f23875e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f23876f;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        C3240gK a10 = DG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f23871a = new C3504lG(ZI.class, C3453kJ.f31392E);
        f23872b = new C3396jG(a9, C3453kJ.f31415z);
        f23873c = new TF(C3024cJ.class, C3453kJ.f31388A);
        f23874d = new RF(a10, C3453kJ.f31389B);
        f23875e = new TF(C2917aJ.class, C3453kJ.f31390C);
        f23876f = new RF(a9, C3453kJ.f31391D);
    }

    public static C3933tE a(C3933tE c3933tE) {
        if (c3933tE.equals(C3933tE.f34247v)) {
            return C3933tE.f34230d;
        }
        if (c3933tE.equals(C3933tE.f34248w)) {
            return C3933tE.f34233g;
        }
        if (c3933tE.equals(C3933tE.f34250y)) {
            return C3933tE.f34232f;
        }
        if (c3933tE.equals(C3933tE.f34249x)) {
            return C3933tE.f34231e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3933tE.f34252b));
    }

    public static C3556mE b(WH wh) {
        int ordinal = wh.ordinal();
        if (ordinal == 2) {
            return C3556mE.f31920H;
        }
        if (ordinal == 3) {
            return C3556mE.f31919G;
        }
        if (ordinal == 4) {
            return C3556mE.f31921I;
        }
        int c9 = wh.c();
        throw new GeneralSecurityException(D.y.m(c9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(c9).length() + 26)));
    }

    public static C3933tE c(C3933tE c3933tE) {
        if (c3933tE.equals(C3933tE.f34230d)) {
            return C3933tE.f34247v;
        }
        if (c3933tE.equals(C3933tE.f34233g)) {
            return C3933tE.f34248w;
        }
        if (c3933tE.equals(C3933tE.f34231e)) {
            return C3933tE.f34249x;
        }
        if (c3933tE.equals(C3933tE.f34232f)) {
            return C3933tE.f34250y;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static int d(YI yi) {
        if (yi.equals(YI.f28664c)) {
            return 33;
        }
        if (yi.equals(YI.f28665d)) {
            return 49;
        }
        if (yi.equals(YI.f28666e)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(yi.f28667a));
    }

    public static LH e(ZI zi) {
        WH wh;
        int i;
        KH B9 = LH.B();
        C3556mE c3556mE = zi.f28868c;
        if (c3556mE.equals(C3556mE.f31919G)) {
            wh = WH.SHA256;
        } else if (c3556mE.equals(C3556mE.f31920H)) {
            wh = WH.SHA384;
        } else {
            if (!c3556mE.equals(C3556mE.f31921I)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(c3556mE.f31931u));
            }
            wh = WH.SHA512;
        }
        B9.h();
        ((LH) B9.f27721u).D(wh);
        YI yi = YI.f28664c;
        YI yi2 = zi.f28867b;
        int i6 = 4;
        if (yi2.equals(yi)) {
            i = 4;
        } else if (yi2.equals(YI.f28665d)) {
            i = 5;
        } else {
            if (!yi2.equals(YI.f28666e)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(yi2.f28667a));
            }
            i = 6;
        }
        B9.h();
        ((LH) B9.f27721u).G(i);
        C3879sE c3879sE = C3879sE.f33921p;
        C3879sE c3879sE2 = zi.f28866a;
        if (c3879sE2.equals(c3879sE)) {
            i6 = 3;
        } else if (!c3879sE2.equals(C3879sE.f33922q)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(c3879sE2.f33928b));
        }
        B9.h();
        ((LH) B9.f27721u).H(i6);
        return (LH) B9.j();
    }

    public static QH f(C3024cJ c3024cJ) {
        int d2 = d(c3024cJ.f29441b.f28867b);
        PH F8 = QH.F();
        LH e9 = e(c3024cJ.f29441b);
        F8.h();
        ((QH) F8.f27721u).I(e9);
        ECPoint eCPoint = c3024cJ.f29442c;
        byte[] h9 = AbstractC4094wD.h(eCPoint.getAffineX(), d2);
        HK hk = JK.f25675u;
        HK s9 = JK.s(h9, 0, h9.length);
        F8.h();
        ((QH) F8.f27721u).J(s9);
        byte[] h10 = AbstractC4094wD.h(eCPoint.getAffineY(), d2);
        HK s10 = JK.s(h10, 0, h10.length);
        F8.h();
        ((QH) F8.f27721u).K(s10);
        return (QH) F8.j();
    }

    public static YI g(int i) {
        int i6 = i - 2;
        if (i6 == 2) {
            return YI.f28664c;
        }
        if (i6 == 3) {
            return YI.f28665d;
        }
        if (i6 == 4) {
            return YI.f28666e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.y.m(i6, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i6).length() + 35)));
        }
        AbstractC3080dL.a();
        throw null;
    }

    public static C3879sE h(int i) {
        int i6 = i - 2;
        if (i6 == 1) {
            return C3879sE.f33921p;
        }
        if (i6 == 2) {
            return C3879sE.f33922q;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.y.m(i6, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i6).length() + 40)));
        }
        AbstractC3080dL.a();
        throw null;
    }
}
