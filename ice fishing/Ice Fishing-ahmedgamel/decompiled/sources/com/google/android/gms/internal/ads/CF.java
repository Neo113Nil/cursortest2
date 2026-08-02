package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class CF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f24843a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f24844b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f24845c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f24846d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f24843a = new C3527lG(C3258gF.class, C3903sF.f34723y);
        f24844b = new C3419jG(a9, C3903sF.f34720v);
        f24845c = new TF(C3150eF.class, C3903sF.f34721w);
        f24846d = new RF(a9, C3903sF.f34722x);
    }

    public static C3956tE a(C3579mE c3579mE) {
        if (c3579mE.equals(C3579mE.f32697E)) {
            return C3956tE.f35016d;
        }
        if (c3579mE.equals(C3579mE.f32698F)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3579mE.f32711u));
    }
}
