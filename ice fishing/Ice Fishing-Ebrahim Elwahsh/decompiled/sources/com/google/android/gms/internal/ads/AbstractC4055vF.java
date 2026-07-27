package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4055vF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f34744a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f34745b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f34746c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f34747d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f34744a = new C3733pG(WE.class, C2975bF.f29459X);
        f34745b = new C3625nG(a9, C2975bF.f29456U);
        f34746c = new XF(UE.class, C2975bF.f29457V);
        f34747d = new VF(a9, C2975bF.f29458W);
    }

    public static EI a(HE he) {
        if (HE.f25331f.equals(he)) {
            return EI.TINK;
        }
        if (HE.f25332g.equals(he)) {
            return EI.CRUNCHY;
        }
        if (HE.f25333h.equals(he)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(he.f25338b));
    }

    public static HE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return HE.f25331f;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return HE.f25333h;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return HE.f25332g;
    }
}
