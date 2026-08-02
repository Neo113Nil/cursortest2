package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3043cF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f30218a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f30219b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f30220c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f30221d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f30218a = new C3527lG(C2990bF.class, VE.f28899C);
        f30219b = new C3419jG(a9, VE.f28925z);
        f30220c = new TF(C2936aF.class, VE.f28897A);
        f30221d = new RF(a9, VE.f28898B);
    }

    public static C3956tE a(FE fe) {
        if (FE.f25517D.equals(fe)) {
            return C3956tE.f35016d;
        }
        if (FE.f25518E.equals(fe)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fe)));
    }

    public static C4176xI b(C2990bF c2990bF) {
        byte[] b9 = ((C4174xG) C3313hG.f31520b.h(c2990bF.f30039d)).f35750b.b();
        try {
            PK pk = PK.f27540a;
            int i = BK.f24648a;
            C3261gI C8 = C3261gI.C(b9, PK.f27541b);
            C4122wI D8 = C4176xI.D();
            String str = c2990bF.f30037b;
            D8.h();
            ((C4176xI) D8.f28504u).F(str);
            D8.h();
            ((C4176xI) D8.f28504u).G(C8);
            return (C4176xI) D8.j();
        } catch (C3318hL e9) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e9);
        }
    }

    public static C2990bF c(C4176xI c4176xI, C3956tE c3956tE) {
        C3956tE c3956tE2;
        C3207fI D8 = C3261gI.D();
        String A9 = c4176xI.B().A();
        D8.h();
        ((C3261gI) D8.f28504u).F(A9);
        JK B3 = c4176xI.B().B();
        D8.h();
        ((C3261gI) D8.f28504u).G(B3);
        D8.h();
        ((C3261gI) D8.f28504u).I(5);
        AbstractC3848rE f2 = AbstractC4117wD.f(((C3261gI) D8.j()).b());
        boolean z6 = f2 instanceof NE;
        Object obj = C3956tE.f35028q;
        C3956tE c3956tE3 = C3956tE.f35027p;
        C3956tE c3956tE4 = C3956tE.f35026o;
        C3956tE c3956tE5 = C3956tE.f35024m;
        C3956tE c3956tE6 = C3956tE.f35025n;
        C3956tE c3956tE7 = C3956tE.f35023l;
        if (z6) {
            c3956tE2 = c3956tE7;
        } else if (f2 instanceof TE) {
            c3956tE2 = c3956tE6;
        } else if (f2 instanceof C3418jF) {
            c3956tE2 = c3956tE5;
        } else if (f2 instanceof GE) {
            c3956tE2 = c3956tE4;
        } else if (f2 instanceof JE) {
            c3956tE2 = c3956tE3;
        } else {
            if (!(f2 instanceof QE)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(f2.toString()));
            }
            c3956tE2 = obj;
        }
        boolean equals = c3956tE.equals(C3956tE.f35016d);
        FE fe = FE.f25518E;
        if (equals) {
            fe = FE.f25517D;
        } else if (!c3956tE.equals(C3956tE.f35018f)) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
        }
        String A10 = c4176xI.A();
        AbstractC4280zE abstractC4280zE = (AbstractC4280zE) f2;
        if (A10 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (abstractC4280zE == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC4280zE.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c3956tE2.equals(c3956tE7) && (abstractC4280zE instanceof NE)) || ((c3956tE2.equals(c3956tE6) && (abstractC4280zE instanceof TE)) || ((c3956tE2.equals(c3956tE5) && (abstractC4280zE instanceof C3418jF)) || ((c3956tE2.equals(c3956tE4) && (abstractC4280zE instanceof GE)) || ((c3956tE2.equals(c3956tE3) && (abstractC4280zE instanceof JE)) || (c3956tE2.equals(obj) && (abstractC4280zE instanceof QE))))))) {
            return new C2990bF(fe, A10, c3956tE2, abstractC4280zE);
        }
        String valueOf = String.valueOf(abstractC4280zE);
        String str = c3956tE2.f35038b;
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 67 + 1);
        AbstractC5128c.h(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", valueOf);
        sb.append(com.anythink.core.common.d.j.f13164z);
        throw new GeneralSecurityException(sb.toString());
    }
}
