package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class CF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f24080a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f24081b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f24082c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f24083d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f24080a = new C3504lG(C3235gF.class, C3880sF.f33955y);
        f24081b = new C3396jG(a9, C3880sF.f33952v);
        f24082c = new TF(C3127eF.class, C3880sF.f33953w);
        f24083d = new RF(a9, C3880sF.f33954x);
    }

    public static C3933tE a(C3556mE c3556mE) {
        if (c3556mE.equals(C3556mE.f31917E)) {
            return C3933tE.f34230d;
        }
        if (c3556mE.equals(C3556mE.f31918F)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3556mE.f31931u));
    }
}
