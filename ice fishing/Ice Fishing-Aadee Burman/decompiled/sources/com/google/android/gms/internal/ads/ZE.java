package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ZE {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f28857a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f28858b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f28859c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f28860d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f28857a = new C3504lG(YE.class, VE.f28127y);
        f28858b = new C3396jG(a9, VE.f28124v);
        f28859c = new TF(XE.class, VE.f28125w);
        f28860d = new RF(a9, VE.f28126x);
    }

    public static C3933tE a(C3879sE c3879sE) {
        if (c3879sE.equals(C3879sE.f33916k)) {
            return C3933tE.f34230d;
        }
        if (c3879sE.equals(C3879sE.f33917l)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3879sE.f33928b));
    }
}
