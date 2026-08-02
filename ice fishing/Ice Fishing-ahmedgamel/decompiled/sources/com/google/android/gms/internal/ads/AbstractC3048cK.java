package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3048cK implements InterfaceC4064vE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f30228a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30229b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final S0.e f30230c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f29650n;
        C3638nJ c3638nJ = C3638nJ.f33494b;
        hashMap.put(zj, c3638nJ);
        hashMap2.put(c3638nJ, zj);
        ZJ zj2 = ZJ.f29651u;
        C3638nJ c3638nJ2 = C3638nJ.f33495c;
        hashMap.put(zj2, c3638nJ2);
        hashMap2.put(c3638nJ2, zj2);
        ZJ zj3 = ZJ.f29652v;
        C3638nJ c3638nJ3 = C3638nJ.f33496d;
        hashMap.put(zj3, c3638nJ3);
        hashMap2.put(c3638nJ3, zj3);
        f30230c = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static InterfaceC4064vE b(C3800qJ c3800qJ) {
        try {
            int i = DG.f25122a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider h3 = AbstractC3066cl.h();
            if (h3 != null) {
                return JJ.c(c3800qJ, h3);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) WJ.f29143g.f29144a.b("RSA");
            BigInteger bigInteger = c3800qJ.f34015c;
            C3692oJ c3692oJ = c3800qJ.f34014b;
            return new FJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c3692oJ.f33679b)), (ZJ) f30230c.H(c3692oJ.f33681d), c3800qJ.f34016d.b(), c3692oJ.f33680c.equals(C3579mE.f32703L) ? f30229b : f30228a);
        }
    }
}
