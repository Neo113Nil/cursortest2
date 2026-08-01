package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class LJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f26091a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f26092b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f26093c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f26094d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f26095e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f26096f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0361k f26097g;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        C3240gK a10 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f26091a = new C3504lG(C3992uJ.class, C3453kJ.f31409W);
        f26092b = new C3396jG(a9, C3453kJ.f31404R);
        f26093c = new TF(C4100wJ.class, C3453kJ.f31405S);
        f26094d = new RF(a10, C3453kJ.f31406T);
        f26095e = new TF(C4046vJ.class, C3453kJ.f31407U);
        f26096f = new RF(a9, C3453kJ.f31408V);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA256;
        C3938tJ c3938tJ = C3938tJ.f34259b;
        hashMap.put(wh, c3938tJ);
        hashMap2.put(c3938tJ, wh);
        WH wh2 = WH.SHA384;
        C3938tJ c3938tJ2 = C3938tJ.f34260c;
        hashMap.put(wh2, c3938tJ2);
        hashMap2.put(c3938tJ2, wh2);
        WH wh3 = WH.SHA512;
        C3938tJ c3938tJ3 = C3938tJ.f34261d;
        hashMap.put(wh3, c3938tJ3);
        hashMap2.put(c3938tJ3, wh3);
        f26097g = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static C3933tE a(C3879sE c3879sE) {
        if (c3879sE.equals(C3879sE.f33926u)) {
            return C3933tE.f34232f;
        }
        if (c3879sE.equals(C3879sE.f33923r)) {
            return C3933tE.f34230d;
        }
        if (c3879sE.equals(C3879sE.f33924s)) {
            return C3933tE.f34233g;
        }
        if (c3879sE.equals(C3879sE.f33925t)) {
            return C3933tE.f34231e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3879sE)));
    }

    public static C3879sE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34232f) {
            return C3879sE.f33926u;
        }
        if (c3933tE == C3933tE.f34230d) {
            return C3879sE.f33923r;
        }
        if (c3933tE == C3933tE.f34233g) {
            return C3879sE.f33924s;
        }
        if (c3933tE == C3933tE.f34231e) {
            return C3879sE.f33925t;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static KI c(C3992uJ c3992uJ) {
        JI D8 = KI.D();
        C3938tJ c3938tJ = c3992uJ.f34514d;
        C0361k c0361k = f26097g;
        WH wh = (WH) c0361k.b(c3938tJ);
        D8.h();
        ((KI) D8.f27721u).F(wh);
        WH wh2 = (WH) c0361k.b(c3992uJ.f34515e);
        D8.h();
        ((KI) D8.f27721u).G(wh2);
        D8.h();
        ((KI) D8.f27721u).H(c3992uJ.f34516f);
        return (KI) D8.j();
    }

    public static OI d(C4100wJ c4100wJ) {
        NI F8 = OI.F();
        KI c9 = c(c4100wJ.f34824b);
        F8.h();
        ((OI) F8.f27721u).J(c9);
        byte[] c10 = AbstractC4094wD.c(c4100wJ.f34825c);
        HK hk = JK.f25675u;
        HK s9 = JK.s(c10, 0, c10.length);
        F8.h();
        ((OI) F8.f27721u).K(s9);
        byte[] c11 = AbstractC4094wD.c(c4100wJ.f34824b.f34512b);
        HK s10 = JK.s(c11, 0, c11.length);
        F8.h();
        ((OI) F8.f27721u).L(s10);
        F8.h();
        ((OI) F8.f27721u).I(0);
        return (OI) F8.j();
    }

    public static C3534lt e(JK jk) {
        return new C3534lt(9, new BigInteger(1, jk.a()));
    }
}
