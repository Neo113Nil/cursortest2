package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class LJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f26891a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f26892b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f26893c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f26894d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f26895e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f26896f;

    /* renamed from: g, reason: collision with root package name */
    public static final S0.e f26897g;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        C3263gK a10 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f26891a = new C3527lG(C4015uJ.class, C3476kJ.f32188W);
        f26892b = new C3419jG(a9, C3476kJ.f32183R);
        f26893c = new TF(C4123wJ.class, C3476kJ.f32184S);
        f26894d = new RF(a10, C3476kJ.f32185T);
        f26895e = new TF(C4069vJ.class, C3476kJ.f32186U);
        f26896f = new RF(a9, C3476kJ.f32187V);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA256;
        C3961tJ c3961tJ = C3961tJ.f35045b;
        hashMap.put(wh, c3961tJ);
        hashMap2.put(c3961tJ, wh);
        WH wh2 = WH.SHA384;
        C3961tJ c3961tJ2 = C3961tJ.f35046c;
        hashMap.put(wh2, c3961tJ2);
        hashMap2.put(c3961tJ2, wh2);
        WH wh3 = WH.SHA512;
        C3961tJ c3961tJ3 = C3961tJ.f35047d;
        hashMap.put(wh3, c3961tJ3);
        hashMap2.put(c3961tJ3, wh3);
        f26897g = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static C3956tE a(C3902sE c3902sE) {
        if (c3902sE.equals(C3902sE.f34694u)) {
            return C3956tE.f35018f;
        }
        if (c3902sE.equals(C3902sE.f34691r)) {
            return C3956tE.f35016d;
        }
        if (c3902sE.equals(C3902sE.f34692s)) {
            return C3956tE.f35019g;
        }
        if (c3902sE.equals(C3902sE.f34693t)) {
            return C3956tE.f35017e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3902sE)));
    }

    public static C3902sE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35018f) {
            return C3902sE.f34694u;
        }
        if (c3956tE == C3956tE.f35016d) {
            return C3902sE.f34691r;
        }
        if (c3956tE == C3956tE.f35019g) {
            return C3902sE.f34692s;
        }
        if (c3956tE == C3956tE.f35017e) {
            return C3902sE.f34693t;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static KI c(C4015uJ c4015uJ) {
        JI D8 = KI.D();
        C3961tJ c3961tJ = c4015uJ.f35288d;
        S0.e eVar = f26897g;
        WH wh = (WH) eVar.H(c3961tJ);
        D8.h();
        ((KI) D8.f28504u).F(wh);
        WH wh2 = (WH) eVar.H(c4015uJ.f35289e);
        D8.h();
        ((KI) D8.f28504u).G(wh2);
        D8.h();
        ((KI) D8.f28504u).H(c4015uJ.f35290f);
        return (KI) D8.j();
    }

    public static OI d(C4123wJ c4123wJ) {
        NI F8 = OI.F();
        KI c9 = c(c4123wJ.f35593b);
        F8.h();
        ((OI) F8.f28504u).J(c9);
        byte[] c10 = AbstractC4117wD.c(c4123wJ.f35594c);
        HK hk = JK.f26428u;
        HK s9 = JK.s(c10, 0, c10.length);
        F8.h();
        ((OI) F8.f28504u).K(s9);
        byte[] c11 = AbstractC4117wD.c(c4123wJ.f35593b.f35286b);
        HK s10 = JK.s(c11, 0, c11.length);
        F8.h();
        ((OI) F8.f28504u).L(s10);
        F8.h();
        ((OI) F8.f28504u).I(0);
        return (OI) F8.j();
    }

    public static C3557lt e(JK jk) {
        return new C3557lt(9, new BigInteger(1, jk.a()));
    }
}
