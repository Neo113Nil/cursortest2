package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ZE {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f29637a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f29638b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f29639c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f29640d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f29637a = new C3527lG(YE.class, VE.f28924y);
        f29638b = new C3419jG(a9, VE.f28921v);
        f29639c = new TF(XE.class, VE.f28922w);
        f29640d = new RF(a9, VE.f28923x);
    }

    public static C3956tE a(C3902sE c3902sE) {
        if (c3902sE.equals(C3902sE.f34684k)) {
            return C3956tE.f35016d;
        }
        if (c3902sE.equals(C3902sE.f34685l)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3902sE.f34696b));
    }
}
