package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
public abstract class BJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f24642a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f24643b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f24644c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f24645d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f24646e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f24647f;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        C3263gK a10 = DG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f24642a = new C3527lG(ZI.class, C3476kJ.f32171E);
        f24643b = new C3419jG(a9, C3476kJ.f32194z);
        f24644c = new TF(C3047cJ.class, C3476kJ.f32167A);
        f24645d = new RF(a10, C3476kJ.f32168B);
        f24646e = new TF(C2940aJ.class, C3476kJ.f32169C);
        f24647f = new RF(a9, C3476kJ.f32170D);
    }

    public static C3956tE a(C3956tE c3956tE) {
        if (c3956tE.equals(C3956tE.f35033v)) {
            return C3956tE.f35016d;
        }
        if (c3956tE.equals(C3956tE.f35034w)) {
            return C3956tE.f35019g;
        }
        if (c3956tE.equals(C3956tE.f35036y)) {
            return C3956tE.f35018f;
        }
        if (c3956tE.equals(C3956tE.f35035x)) {
            return C3956tE.f35017e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3956tE.f35038b));
    }

    public static C3579mE b(WH wh) {
        int ordinal = wh.ordinal();
        if (ordinal == 2) {
            return C3579mE.f32700H;
        }
        if (ordinal == 3) {
            return C3579mE.f32699G;
        }
        if (ordinal == 4) {
            return C3579mE.f32701I;
        }
        int c9 = wh.c();
        throw new GeneralSecurityException(D.x.k(c9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(c9).length() + 26)));
    }

    public static C3956tE c(C3956tE c3956tE) {
        if (c3956tE.equals(C3956tE.f35016d)) {
            return C3956tE.f35033v;
        }
        if (c3956tE.equals(C3956tE.f35019g)) {
            return C3956tE.f35034w;
        }
        if (c3956tE.equals(C3956tE.f35017e)) {
            return C3956tE.f35035x;
        }
        if (c3956tE.equals(C3956tE.f35018f)) {
            return C3956tE.f35036y;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static int d(YI yi) {
        if (yi.equals(YI.f29441c)) {
            return 33;
        }
        if (yi.equals(YI.f29442d)) {
            return 49;
        }
        if (yi.equals(YI.f29443e)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(yi.f29444a));
    }

    public static LH e(ZI zi) {
        WH wh;
        int i;
        KH B3 = LH.B();
        C3579mE c3579mE = zi.f29648c;
        if (c3579mE.equals(C3579mE.f32699G)) {
            wh = WH.SHA256;
        } else if (c3579mE.equals(C3579mE.f32700H)) {
            wh = WH.SHA384;
        } else {
            if (!c3579mE.equals(C3579mE.f32701I)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(c3579mE.f32711u));
            }
            wh = WH.SHA512;
        }
        B3.h();
        ((LH) B3.f28504u).D(wh);
        YI yi = YI.f29441c;
        YI yi2 = zi.f29647b;
        int i4 = 4;
        if (yi2.equals(yi)) {
            i = 4;
        } else if (yi2.equals(YI.f29442d)) {
            i = 5;
        } else {
            if (!yi2.equals(YI.f29443e)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(yi2.f29444a));
            }
            i = 6;
        }
        B3.h();
        ((LH) B3.f28504u).G(i);
        C3902sE c3902sE = C3902sE.f34689p;
        C3902sE c3902sE2 = zi.f29646a;
        if (c3902sE2.equals(c3902sE)) {
            i4 = 3;
        } else if (!c3902sE2.equals(C3902sE.f34690q)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(c3902sE2.f34696b));
        }
        B3.h();
        ((LH) B3.f28504u).H(i4);
        return (LH) B3.j();
    }

    public static QH f(C3047cJ c3047cJ) {
        int d9 = d(c3047cJ.f30224b.f29647b);
        PH F8 = QH.F();
        LH e9 = e(c3047cJ.f30224b);
        F8.h();
        ((QH) F8.f28504u).I(e9);
        ECPoint eCPoint = c3047cJ.f30225c;
        byte[] h3 = AbstractC4117wD.h(eCPoint.getAffineX(), d9);
        HK hk = JK.f26428u;
        HK s9 = JK.s(h3, 0, h3.length);
        F8.h();
        ((QH) F8.f28504u).J(s9);
        byte[] h9 = AbstractC4117wD.h(eCPoint.getAffineY(), d9);
        HK s10 = JK.s(h9, 0, h9.length);
        F8.h();
        ((QH) F8.f28504u).K(s10);
        return (QH) F8.j();
    }

    public static YI g(int i) {
        int i4 = i - 2;
        if (i4 == 2) {
            return YI.f29441c;
        }
        if (i4 == 3) {
            return YI.f29442d;
        }
        if (i4 == 4) {
            return YI.f29443e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.x.k(i4, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i4).length() + 35)));
        }
        AbstractC3103dL.a();
        throw null;
    }

    public static C3902sE h(int i) {
        int i4 = i - 2;
        if (i4 == 1) {
            return C3902sE.f34689p;
        }
        if (i4 == 2) {
            return C3902sE.f34690q;
        }
        if (i != 1) {
            throw new GeneralSecurityException(D.x.k(i4, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i4).length() + 40)));
        }
        AbstractC3103dL.a();
        throw null;
    }
}
