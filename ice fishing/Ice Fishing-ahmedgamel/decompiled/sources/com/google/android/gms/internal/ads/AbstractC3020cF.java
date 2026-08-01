package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3020cF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f29435a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f29436b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f29437c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f29438d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f29435a = new C3504lG(C2967bF.class, VE.f28102C);
        f29436b = new C3396jG(a9, VE.f28128z);
        f29437c = new TF(C2913aF.class, VE.f28100A);
        f29438d = new RF(a9, VE.f28101B);
    }

    public static C3933tE a(FE fe) {
        if (FE.f24761D.equals(fe)) {
            return C3933tE.f34230d;
        }
        if (FE.f24762E.equals(fe)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fe)));
    }

    public static C4153xI b(C2967bF c2967bF) {
        byte[] b9 = ((C4151xG) C3290hG.f30754b.h(c2967bF.f29251d)).f34969b.b();
        try {
            PK pk = PK.f26757a;
            int i = BK.f23877a;
            C3238gI C8 = C3238gI.C(b9, PK.f26758b);
            C4099wI D8 = C4153xI.D();
            String str = c2967bF.f29249b;
            D8.h();
            ((C4153xI) D8.f27721u).F(str);
            D8.h();
            ((C4153xI) D8.f27721u).G(C8);
            return (C4153xI) D8.j();
        } catch (C3295hL e9) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e9);
        }
    }

    public static C2967bF c(C4153xI c4153xI, C3933tE c3933tE) {
        C3933tE c3933tE2;
        C3184fI D8 = C3238gI.D();
        String A9 = c4153xI.B().A();
        D8.h();
        ((C3238gI) D8.f27721u).F(A9);
        JK B9 = c4153xI.B().B();
        D8.h();
        ((C3238gI) D8.f27721u).G(B9);
        D8.h();
        ((C3238gI) D8.f27721u).I(5);
        AbstractC3825rE f3 = AbstractC4094wD.f(((C3238gI) D8.j()).b());
        boolean z3 = f3 instanceof NE;
        Object obj = C3933tE.f34242q;
        C3933tE c3933tE3 = C3933tE.f34241p;
        C3933tE c3933tE4 = C3933tE.f34240o;
        C3933tE c3933tE5 = C3933tE.f34238m;
        C3933tE c3933tE6 = C3933tE.f34239n;
        C3933tE c3933tE7 = C3933tE.f34237l;
        if (z3) {
            c3933tE2 = c3933tE7;
        } else if (f3 instanceof TE) {
            c3933tE2 = c3933tE6;
        } else if (f3 instanceof C3395jF) {
            c3933tE2 = c3933tE5;
        } else if (f3 instanceof GE) {
            c3933tE2 = c3933tE4;
        } else if (f3 instanceof JE) {
            c3933tE2 = c3933tE3;
        } else {
            if (!(f3 instanceof QE)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(f3.toString()));
            }
            c3933tE2 = obj;
        }
        boolean equals = c3933tE.equals(C3933tE.f34230d);
        FE fe = FE.f24762E;
        if (equals) {
            fe = FE.f24761D;
        } else if (!c3933tE.equals(C3933tE.f34232f)) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
        }
        String A10 = c4153xI.A();
        AbstractC4257zE abstractC4257zE = (AbstractC4257zE) f3;
        if (A10 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (abstractC4257zE == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC4257zE.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c3933tE2.equals(c3933tE7) && (abstractC4257zE instanceof NE)) || ((c3933tE2.equals(c3933tE6) && (abstractC4257zE instanceof TE)) || ((c3933tE2.equals(c3933tE5) && (abstractC4257zE instanceof C3395jF)) || ((c3933tE2.equals(c3933tE4) && (abstractC4257zE instanceof GE)) || ((c3933tE2.equals(c3933tE3) && (abstractC4257zE instanceof JE)) || (c3933tE2.equals(obj) && (abstractC4257zE instanceof QE))))))) {
            return new C2967bF(fe, A10, c3933tE2, abstractC4257zE);
        }
        String valueOf = String.valueOf(abstractC4257zE);
        String str = c3933tE2.f34252b;
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 67 + 1);
        u1.h.i(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", valueOf);
        sb.append(com.anythink.core.common.d.j.f12378z);
        throw new GeneralSecurityException(sb.toString());
    }
}
