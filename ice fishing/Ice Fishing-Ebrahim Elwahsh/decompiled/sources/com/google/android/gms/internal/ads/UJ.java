package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class UJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f27956a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f27957b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f27958c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f27959d;

    /* renamed from: e, reason: collision with root package name */
    public static final XF f27960e;

    /* renamed from: f, reason: collision with root package name */
    public static final VF f27961f;

    /* renamed from: g, reason: collision with root package name */
    public static final C4237yi f27962g;

    /* renamed from: h, reason: collision with root package name */
    public static final C4237yi f27963h;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        C3791qK a10 = IG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f27956a = new C3733pG(EJ.class, C4275zJ.f35520V);
        f27957b = new C3625nG(a9, C4275zJ.f35515Q);
        f27958c = new XF(GJ.class, C4275zJ.f35516R);
        f27959d = new VF(a10, C4275zJ.f35517S);
        f27960e = new XF(FJ.class, C4275zJ.f35518T);
        f27961f = new VF(a9, C4275zJ.f35519U);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EI ei = EI.RAW;
        DJ dj = DJ.f24415e;
        hashMap.put(ei, dj);
        hashMap2.put(dj, ei);
        EI ei2 = EI.TINK;
        DJ dj2 = DJ.f24412b;
        hashMap.put(ei2, dj2);
        hashMap2.put(dj2, ei2);
        EI ei3 = EI.CRUNCHY;
        DJ dj3 = DJ.f24413c;
        hashMap.put(ei3, dj3);
        hashMap2.put(dj3, ei3);
        EI ei4 = EI.LEGACY;
        DJ dj4 = DJ.f24414d;
        hashMap.put(ei4, dj4);
        hashMap2.put(dj4, ei4);
        f27962g = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        EnumC3032cI enumC3032cI = EnumC3032cI.SHA256;
        CJ cj = CJ.f24160b;
        hashMap3.put(enumC3032cI, cj);
        hashMap4.put(cj, enumC3032cI);
        EnumC3032cI enumC3032cI2 = EnumC3032cI.SHA384;
        CJ cj2 = CJ.f24161c;
        hashMap3.put(enumC3032cI2, cj2);
        hashMap4.put(cj2, enumC3032cI2);
        EnumC3032cI enumC3032cI3 = EnumC3032cI.SHA512;
        CJ cj3 = CJ.f24162d;
        hashMap3.put(enumC3032cI3, cj3);
        hashMap4.put(cj3, enumC3032cI3);
        f27963h = new C4237yi(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
    }

    public static RI a(EJ ej) {
        QI D8 = RI.D();
        CJ cj = ej.f24697d;
        C4237yi c4237yi = f27963h;
        EnumC3032cI enumC3032cI = (EnumC3032cI) c4237yi.a(cj);
        D8.h();
        ((RI) D8.f30000u).F(enumC3032cI);
        EnumC3032cI enumC3032cI2 = (EnumC3032cI) c4237yi.a(ej.f24698e);
        D8.h();
        ((RI) D8.f30000u).G(enumC3032cI2);
        D8.h();
        ((RI) D8.f30000u).H(ej.f24699f);
        return (RI) D8.j();
    }

    public static VI b(GJ gj) {
        UI F8 = VI.F();
        RI a9 = a(gj.f25135b);
        F8.h();
        ((VI) F8.f30000u).J(a9);
        byte[] f6 = AbstractC4161xD.f(gj.f25136c);
        QK qk = SK.f27529u;
        QK s3 = SK.s(f6, 0, f6.length);
        F8.h();
        ((VI) F8.f30000u).K(s3);
        byte[] f9 = AbstractC4161xD.f(gj.f25135b.f24695b);
        QK s6 = SK.s(f9, 0, f9.length);
        F8.h();
        ((VI) F8.f30000u).L(s6);
        F8.h();
        ((VI) F8.f30000u).I(0);
        return (VI) F8.j();
    }

    public static Mt c(SK sk) {
        return new Mt(8, new BigInteger(1, sk.a()));
    }
}
