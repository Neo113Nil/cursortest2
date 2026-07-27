package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class HJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f25251a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f25252b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f25253c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f25254d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f25255e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f25256f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0361k f25257g;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        C3240gK a10 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f25251a = new C3504lG(C3669oJ.class, C3453kJ.f31403Q);
        f25252b = new C3396jG(a9, C3453kJ.f31398L);
        f25253c = new TF(C3777qJ.class, C3453kJ.f31399M);
        f25254d = new RF(a10, C3453kJ.f31400N);
        f25255e = new TF(C3723pJ.class, C3453kJ.f31401O);
        f25256f = new RF(a9, C3453kJ.f31402P);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA256;
        C3615nJ c3615nJ = C3615nJ.f32716b;
        hashMap.put(wh, c3615nJ);
        hashMap2.put(c3615nJ, wh);
        WH wh2 = WH.SHA384;
        C3615nJ c3615nJ2 = C3615nJ.f32717c;
        hashMap.put(wh2, c3615nJ2);
        hashMap2.put(c3615nJ2, wh2);
        WH wh3 = WH.SHA512;
        C3615nJ c3615nJ3 = C3615nJ.f32718d;
        hashMap.put(wh3, c3615nJ3);
        hashMap2.put(c3615nJ3, wh3);
        f25257g = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static C3933tE a(C3556mE c3556mE) {
        if (c3556mE.equals(C3556mE.f31924M)) {
            return C3933tE.f34232f;
        }
        if (c3556mE.equals(C3556mE.J)) {
            return C3933tE.f34230d;
        }
        if (c3556mE.equals(C3556mE.f31922K)) {
            return C3933tE.f34233g;
        }
        if (c3556mE.equals(C3556mE.f31923L)) {
            return C3933tE.f34231e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3556mE)));
    }

    public static C3556mE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34232f) {
            return C3556mE.f31924M;
        }
        if (c3933tE == C3933tE.f34230d) {
            return C3556mE.J;
        }
        if (c3933tE == C3933tE.f34233g) {
            return C3556mE.f31922K;
        }
        if (c3933tE == C3933tE.f34231e) {
            return C3556mE.f31923L;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static GI c(C3777qJ c3777qJ) {
        FI F8 = GI.F();
        C3669oJ c3669oJ = c3777qJ.f33230b;
        BI B9 = CI.B();
        WH wh = (WH) f25257g.b(c3669oJ.f32894d);
        B9.h();
        ((CI) B9.f27721u).D(wh);
        CI ci = (CI) B9.j();
        F8.h();
        ((GI) F8.f27721u).I(ci);
        byte[] c9 = AbstractC4094wD.c(c3777qJ.f33231c);
        HK hk = JK.f25675u;
        HK s9 = JK.s(c9, 0, c9.length);
        F8.h();
        ((GI) F8.f27721u).J(s9);
        byte[] c10 = AbstractC4094wD.c(c3777qJ.f33230b.f32892b);
        HK s10 = JK.s(c10, 0, c10.length);
        F8.h();
        ((GI) F8.f27721u).K(s10);
        return (GI) F8.j();
    }

    public static C3534lt d(JK jk) {
        return new C3534lt(9, new BigInteger(1, jk.a()));
    }
}
