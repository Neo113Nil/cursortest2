package com.google.android.gms.internal.ads;

import O2.C0361k;
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
public abstract class AbstractC3025cK implements InterfaceC4041vE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f29445a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f29446b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final C0361k f29447c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f28870n;
        C3615nJ c3615nJ = C3615nJ.f32716b;
        hashMap.put(zj, c3615nJ);
        hashMap2.put(c3615nJ, zj);
        ZJ zj2 = ZJ.f28871u;
        C3615nJ c3615nJ2 = C3615nJ.f32717c;
        hashMap.put(zj2, c3615nJ2);
        hashMap2.put(c3615nJ2, zj2);
        ZJ zj3 = ZJ.f28872v;
        C3615nJ c3615nJ3 = C3615nJ.f32718d;
        hashMap.put(zj3, c3615nJ3);
        hashMap2.put(c3615nJ3, zj3);
        f29447c = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static InterfaceC4041vE b(C3777qJ c3777qJ) {
        try {
            int i = DG.f24377a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider h9 = AbstractC3043cl.h();
            if (h9 != null) {
                return JJ.c(c3777qJ, h9);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) WJ.f28345g.f28346a.b("RSA");
            BigInteger bigInteger = c3777qJ.f33231c;
            C3669oJ c3669oJ = c3777qJ.f33230b;
            return new FJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c3669oJ.f32892b)), (ZJ) f29447c.b(c3669oJ.f32894d), c3777qJ.f33232d.b(), c3669oJ.f32893c.equals(C3556mE.f31923L) ? f29446b : f29445a);
        }
    }
}
