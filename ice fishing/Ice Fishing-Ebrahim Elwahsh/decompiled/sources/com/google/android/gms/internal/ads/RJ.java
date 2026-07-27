package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class RJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f27331a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f27332b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f27333c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f27334d;

    /* renamed from: e, reason: collision with root package name */
    public static final XF f27335e;

    /* renamed from: f, reason: collision with root package name */
    public static final VF f27336f;

    /* renamed from: g, reason: collision with root package name */
    public static final C4237yi f27337g;

    /* renamed from: h, reason: collision with root package name */
    public static final C4237yi f27338h;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        C3791qK a10 = IG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f27331a = new C3733pG(C4113wJ.class, C4275zJ.f35514P);
        f27332b = new C3625nG(a9, C4275zJ.f35509K);
        f27333c = new XF(C4221yJ.class, C4275zJ.f35510L);
        f27334d = new VF(a10, C4275zJ.f35511M);
        f27335e = new XF(C4167xJ.class, C4275zJ.f35512N);
        f27336f = new VF(a9, C4275zJ.f35513O);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EI ei = EI.RAW;
        C4059vJ c4059vJ = C4059vJ.f34751e;
        hashMap.put(ei, c4059vJ);
        hashMap2.put(c4059vJ, ei);
        EI ei2 = EI.TINK;
        C4059vJ c4059vJ2 = C4059vJ.f34748b;
        hashMap.put(ei2, c4059vJ2);
        hashMap2.put(c4059vJ2, ei2);
        EI ei3 = EI.CRUNCHY;
        C4059vJ c4059vJ3 = C4059vJ.f34749c;
        hashMap.put(ei3, c4059vJ3);
        hashMap2.put(c4059vJ3, ei3);
        EI ei4 = EI.LEGACY;
        C4059vJ c4059vJ4 = C4059vJ.f34750d;
        hashMap.put(ei4, c4059vJ4);
        hashMap2.put(c4059vJ4, ei4);
        f27337g = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        EnumC3032cI enumC3032cI = EnumC3032cI.SHA256;
        C4005uJ c4005uJ = C4005uJ.f34578b;
        hashMap3.put(enumC3032cI, c4005uJ);
        hashMap4.put(c4005uJ, enumC3032cI);
        EnumC3032cI enumC3032cI2 = EnumC3032cI.SHA384;
        C4005uJ c4005uJ2 = C4005uJ.f34579c;
        hashMap3.put(enumC3032cI2, c4005uJ2);
        hashMap4.put(c4005uJ2, enumC3032cI2);
        EnumC3032cI enumC3032cI3 = EnumC3032cI.SHA512;
        C4005uJ c4005uJ3 = C4005uJ.f34580d;
        hashMap3.put(enumC3032cI3, c4005uJ3);
        hashMap4.put(c4005uJ3, enumC3032cI3);
        f27338h = new C4237yi(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
    }

    public static NI a(C4221yJ c4221yJ) {
        MI F8 = NI.F();
        C4113wJ c4113wJ = c4221yJ.f35337b;
        II B8 = JI.B();
        EnumC3032cI enumC3032cI = (EnumC3032cI) f27338h.a(c4113wJ.f34973d);
        B8.h();
        ((JI) B8.f30000u).D(enumC3032cI);
        JI ji = (JI) B8.j();
        F8.h();
        ((NI) F8.f30000u).I(ji);
        byte[] f6 = AbstractC4161xD.f(c4221yJ.f35338c);
        QK qk = SK.f27529u;
        QK s3 = SK.s(f6, 0, f6.length);
        F8.h();
        ((NI) F8.f30000u).J(s3);
        byte[] f9 = AbstractC4161xD.f(c4221yJ.f35337b.f34971b);
        QK s6 = SK.s(f9, 0, f9.length);
        F8.h();
        ((NI) F8.f30000u).K(s6);
        return (NI) F8.j();
    }

    public static Mt b(SK sk) {
        return new Mt(8, new BigInteger(1, sk.a()));
    }
}
