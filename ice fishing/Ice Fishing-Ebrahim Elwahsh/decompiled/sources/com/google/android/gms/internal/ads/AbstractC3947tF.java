package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3947tF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f34384a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f34385b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f34386c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f34387d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f34384a = new C3733pG(TE.class, C2975bF.f29455T);
        f34385b = new C3625nG(a9, C2975bF.f29452Q);
        f34386c = new XF(RE.class, C2975bF.f29453R);
        f34387d = new VF(a9, C2975bF.f29454S);
    }

    public static EI a(GE ge) {
        if (GE.f25120h.equals(ge)) {
            return EI.TINK;
        }
        if (GE.i.equals(ge)) {
            return EI.CRUNCHY;
        }
        if (GE.f25121j.equals(ge)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ge)));
    }

    public static GE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return GE.f25120h;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return GE.f25121j;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return GE.i;
    }
}
