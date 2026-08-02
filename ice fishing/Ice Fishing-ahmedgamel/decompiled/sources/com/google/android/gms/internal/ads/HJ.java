package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class HJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f26023a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f26024b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f26025c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f26026d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f26027e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f26028f;

    /* renamed from: g, reason: collision with root package name */
    public static final S0.e f26029g;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        C3263gK a10 = DG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f26023a = new C3527lG(C3692oJ.class, C3476kJ.f32182Q);
        f26024b = new C3419jG(a9, C3476kJ.f32177L);
        f26025c = new TF(C3800qJ.class, C3476kJ.f32178M);
        f26026d = new RF(a10, C3476kJ.f32179N);
        f26027e = new TF(C3746pJ.class, C3476kJ.f32180O);
        f26028f = new RF(a9, C3476kJ.f32181P);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA256;
        C3638nJ c3638nJ = C3638nJ.f33494b;
        hashMap.put(wh, c3638nJ);
        hashMap2.put(c3638nJ, wh);
        WH wh2 = WH.SHA384;
        C3638nJ c3638nJ2 = C3638nJ.f33495c;
        hashMap.put(wh2, c3638nJ2);
        hashMap2.put(c3638nJ2, wh2);
        WH wh3 = WH.SHA512;
        C3638nJ c3638nJ3 = C3638nJ.f33496d;
        hashMap.put(wh3, c3638nJ3);
        hashMap2.put(c3638nJ3, wh3);
        f26029g = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static C3956tE a(C3579mE c3579mE) {
        if (c3579mE.equals(C3579mE.f32704M)) {
            return C3956tE.f35018f;
        }
        if (c3579mE.equals(C3579mE.J)) {
            return C3956tE.f35016d;
        }
        if (c3579mE.equals(C3579mE.f32702K)) {
            return C3956tE.f35019g;
        }
        if (c3579mE.equals(C3579mE.f32703L)) {
            return C3956tE.f35017e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3579mE)));
    }

    public static C3579mE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35018f) {
            return C3579mE.f32704M;
        }
        if (c3956tE == C3956tE.f35016d) {
            return C3579mE.J;
        }
        if (c3956tE == C3956tE.f35019g) {
            return C3579mE.f32702K;
        }
        if (c3956tE == C3956tE.f35017e) {
            return C3579mE.f32703L;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static GI c(C3800qJ c3800qJ) {
        FI F8 = GI.F();
        C3692oJ c3692oJ = c3800qJ.f34014b;
        BI B3 = CI.B();
        WH wh = (WH) f26029g.H(c3692oJ.f33681d);
        B3.h();
        ((CI) B3.f28504u).D(wh);
        CI ci = (CI) B3.j();
        F8.h();
        ((GI) F8.f28504u).I(ci);
        byte[] c9 = AbstractC4117wD.c(c3800qJ.f34015c);
        HK hk = JK.f26428u;
        HK s9 = JK.s(c9, 0, c9.length);
        F8.h();
        ((GI) F8.f28504u).J(s9);
        byte[] c10 = AbstractC4117wD.c(c3800qJ.f34014b.f33679b);
        HK s10 = JK.s(c10, 0, c10.length);
        F8.h();
        ((GI) F8.f28504u).K(s10);
        return (GI) F8.j();
    }

    public static C3557lt d(JK jk) {
        return new C3557lt(9, new BigInteger(1, jk.a()));
    }
}
