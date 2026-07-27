package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class EF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f24680a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f24681b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f24682c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f24683d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f24680a = new C3733pG(C3408jF.class, DF.f24407x);
        f24681b = new C3625nG(a9, DF.f24404u);
        f24682c = new XF(C3302hF.class, DF.f24405v);
        f24683d = new VF(a9, DF.f24406w);
    }

    public static EI a(HE he) {
        if (he.equals(HE.i)) {
            return EI.TINK;
        }
        if (he.equals(HE.f25334j)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(he.f25338b));
    }

    public static HE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return HE.i;
        }
        if (ordinal == 3) {
            return HE.f25334j;
        }
        int a9 = ei.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
    }
}
