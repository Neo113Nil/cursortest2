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

/* renamed from: com.google.android.gms.internal.ads.nK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3629nK implements InterfaceC4108wE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f32849a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f32850b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final C4237yi f32851c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EnumC3413jK enumC3413jK = EnumC3413jK.f32102n;
        C4005uJ c4005uJ = C4005uJ.f34578b;
        hashMap.put(enumC3413jK, c4005uJ);
        hashMap2.put(c4005uJ, enumC3413jK);
        EnumC3413jK enumC3413jK2 = EnumC3413jK.f32103u;
        C4005uJ c4005uJ2 = C4005uJ.f34579c;
        hashMap.put(enumC3413jK2, c4005uJ2);
        hashMap2.put(c4005uJ2, enumC3413jK2);
        EnumC3413jK enumC3413jK3 = EnumC3413jK.f32104v;
        C4005uJ c4005uJ3 = C4005uJ.f34580d;
        hashMap.put(enumC3413jK3, c4005uJ3);
        hashMap2.put(c4005uJ3, enumC3413jK3);
        f32851c = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static InterfaceC4108wE b(C4221yJ c4221yJ) {
        try {
            int i = IG.f25546a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider e6 = AbstractC2720Pd.e();
            if (e6 != null) {
                return TJ.c(c4221yJ, e6);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) C3253gK.f30986g.f30987a.d("RSA");
            BigInteger bigInteger = c4221yJ.f35338c;
            C4113wJ c4113wJ = c4221yJ.f35337b;
            return new PJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c4113wJ.f34971b)), (EnumC3413jK) f32851c.a(c4113wJ.f34973d), c4221yJ.f35339d.b(), c4113wJ.f34972c.equals(C4059vJ.f34750d) ? f32850b : f32849a);
        }
    }
}
