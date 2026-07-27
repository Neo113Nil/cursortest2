package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class VE implements InterfaceC3827rG, InterfaceC3450kG, UF, SF, InterfaceC3558mG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28129n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ VE f28123u = new VE(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ VE f28124v = new VE(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ VE f28125w = new VE(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ VE f28126x = new VE(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ VE f28127y = new VE(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ VE f28128z = new VE(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ VE f28100A = new VE(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ VE f28101B = new VE(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ VE f28102C = new VE(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ VE f28103D = new VE(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ VE f28104E = new VE(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ VE f28105F = new VE(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ VE f28106G = new VE(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ VE f28107H = new VE(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ VE f28108I = new VE(14);
    public static final /* synthetic */ VE J = new VE(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ VE f28109K = new VE(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ VE f28110L = new VE(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ VE f28111M = new VE(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ VE f28112N = new VE(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ VE f28113O = new VE(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ VE f28114P = new VE(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ VE f28115Q = new VE(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ VE f28116R = new VE(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ VE f28117S = new VE(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ VE f28118T = new VE(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ VE f28119U = new VE(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ VE f28120V = new VE(27);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ VE f28121W = new VE(28);

    /* renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ VE f28122X = new VE(29);

    public /* synthetic */ VE(int i) {
        this.f28129n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3558mG
    public C4151xG a(AbstractC3825rE abstractC3825rE) {
        switch (this.f28129n) {
            case 4:
                YE ye = (YE) abstractC3825rE;
                C3504lG c3504lG = ZE.f28857a;
                C3933tE a9 = ZE.a(ye.f28661b);
                C3883sI C8 = C3937tI.C();
                C8.h();
                ((C3937tI) C8.f27721u).E(ye.f28660a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", a9, ((C3937tI) C8.j()).a());
            case 8:
                C2967bF c2967bF = (C2967bF) abstractC3825rE;
                C3504lG c3504lG2 = AbstractC3020cF.f29435a;
                return C4151xG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", AbstractC3020cF.a(c2967bF.f29248a), AbstractC3020cF.b(c2967bF).a());
            case 14:
                GE ge = (GE) abstractC3825rE;
                C3504lG c3504lG3 = AbstractC3449kF.f31384a;
                C3933tE a10 = AbstractC3449kF.a(ge.f24958e);
                C3345iH D8 = C3397jH.D();
                C3559mH C9 = C3667oH.C();
                C3721pH B9 = C3775qH.B();
                B9.h();
                ((C3775qH) B9.f27721u).D(ge.f24956c);
                C3775qH c3775qH = (C3775qH) B9.j();
                C9.h();
                ((C3667oH) C9.f27721u).E(c3775qH);
                C9.h();
                ((C3667oH) C9.f27721u).F(ge.f24954a);
                C3667oH c3667oH = (C3667oH) C9.j();
                D8.h();
                ((C3397jH) D8.f27721u).E(c3667oH);
                ZH E8 = C2916aI.E();
                C3023cI d2 = AbstractC3449kF.d(ge);
                E8.h();
                ((C2916aI) E8.f27721u).G(d2);
                E8.h();
                ((C2916aI) E8.f27721u).H(ge.f24955b);
                C2916aI c2916aI = (C2916aI) E8.j();
                D8.h();
                ((C3397jH) D8.f27721u).F(c2916aI);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", a10, ((C3397jH) D8.j()).a());
            case 18:
                JE je = (JE) abstractC3825rE;
                C3504lG c3504lG4 = AbstractC3503lF.f31750a;
                C3933tE a11 = AbstractC3503lF.a(je.f25660c);
                C3936tH D9 = C3990uH.D();
                C4044vH B10 = C4098wH.B();
                B10.h();
                ((C4098wH) B10.f27721u).D(je.f25659b);
                C4098wH c4098wH = (C4098wH) B10.j();
                D9.h();
                ((C3990uH) D9.f27721u).E(c4098wH);
                D9.h();
                ((C3990uH) D9.f27721u).F(je.f25658a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", a11, ((C3990uH) D9.j()).a());
            case 22:
                NE ne = (NE) abstractC3825rE;
                C3504lG c3504lG5 = AbstractC3665oF.f32884a;
                C3933tE a12 = AbstractC3665oF.a(ne.f26477b);
                C4260zH D10 = AH.D();
                D10.h();
                ((AH) D10.f27721u).E(ne.f26476a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", a12, ((AH) D10.j()).a());
            default:
                QE qe = (QE) abstractC3825rE;
                C3504lG c3504lG6 = AbstractC3773qF.f33223a;
                C3933tE a13 = AbstractC3773qF.a(qe.f27007b);
                DH D11 = EH.D();
                D11.h();
                ((EH) D11.f27721u).E(qe.f27006a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", a13, ((EH) D11.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public C4097wG b(WC wc) {
        switch (this.f28129n) {
            case 2:
                XE xe = (XE) wc;
                C3504lG c3504lG = ZE.f28857a;
                C3776qI D8 = C3829rI.D();
                C3883sI C8 = C3937tI.C();
                YE ye = xe.f28505b;
                C8.h();
                ((C3937tI) C8.f27721u).E(ye.f28660a);
                C3937tI c3937tI = (C3937tI) C8.j();
                D8.h();
                ((C3829rI) D8.f27721u).F(c3937tI);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C3829rI) D8.j()).a(), C3879sE.f33913g, ZE.a(xe.f28505b.f28661b), xe.f28507d);
            case 6:
                C2913aF c2913aF = (C2913aF) wc;
                C3504lG c3504lG2 = AbstractC3020cF.f29435a;
                C3991uI D9 = C4045vI.D();
                C4153xI b9 = AbstractC3020cF.b(c2913aF.f29043b);
                D9.h();
                ((C4045vI) D9.f27721u).F(b9);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C4045vI) D9.j()).a(), C3879sE.f33913g, AbstractC3020cF.a(c2913aF.f29043b.f29248a), c2913aF.f29045d);
            case 12:
                BE be = (BE) wc;
                C3504lG c3504lG3 = AbstractC3449kF.f31384a;
                C3237gH E8 = C3291hH.E();
                C3451kH D10 = C3505lH.D();
                C3721pH B9 = C3775qH.B();
                int i = be.f23861b.f24956c;
                B9.h();
                ((C3775qH) B9.f27721u).D(i);
                C3775qH c3775qH = (C3775qH) B9.j();
                D10.h();
                ((C3505lH) D10.f27721u).F(c3775qH);
                byte[] b10 = ((C3240gK) be.f23862c.f29859u).b();
                HK s9 = JK.s(b10, 0, b10.length);
                D10.h();
                ((C3505lH) D10.f27721u).G(s9);
                C3505lH c3505lH = (C3505lH) D10.j();
                E8.h();
                ((C3291hH) E8.f27721u).G(c3505lH);
                XH E9 = YH.E();
                GE ge = be.f23861b;
                C3023cI d2 = AbstractC3449kF.d(ge);
                E9.h();
                ((YH) E9.f27721u).H(d2);
                byte[] b11 = ((C3240gK) be.f23863d.f29859u).b();
                HK s10 = JK.s(b11, 0, b11.length);
                E9.h();
                ((YH) E9.f27721u).I(s10);
                YH yh = (YH) E9.j();
                E8.h();
                ((C3291hH) E8.f27721u).H(yh);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3291hH) E8.j()).a(), C3879sE.f33910d, AbstractC3449kF.a(ge.f24958e), be.f23865f);
            case 16:
                HE he = (HE) wc;
                C3504lG c3504lG4 = AbstractC3503lF.f31750a;
                C3828rH E10 = C3882sH.E();
                JE je = he.f25244b;
                C4044vH B10 = C4098wH.B();
                int i6 = je.f25659b;
                B10.h();
                ((C4098wH) B10.f27721u).D(i6);
                C4098wH c4098wH = (C4098wH) B10.j();
                E10.h();
                ((C3882sH) E10.f27721u).G(c4098wH);
                byte[] b12 = ((C3240gK) he.f25245c.f29859u).b();
                HK s11 = JK.s(b12, 0, b12.length);
                E10.h();
                ((C3882sH) E10.f27721u).H(s11);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3882sH) E10.j()).a(), C3879sE.f33910d, AbstractC3503lF.a(he.f25244b.f25660c), he.f25247e);
            case 20:
                KE ke = (KE) wc;
                C3504lG c3504lG5 = AbstractC3665oF.f32884a;
                C4152xH D11 = C4206yH.D();
                byte[] b13 = ((C3240gK) ke.f25879c.f29859u).b();
                HK s12 = JK.s(b13, 0, b13.length);
                D11.h();
                ((C4206yH) D11.f27721u).F(s12);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C4206yH) D11.j()).a(), C3879sE.f33910d, AbstractC3665oF.a(ke.f25878b.f26477b), ke.f25881e);
            case 24:
                OE oe = (OE) wc;
                C3504lG c3504lG6 = AbstractC3773qF.f33223a;
                BH D12 = CH.D();
                byte[] b14 = ((C3240gK) oe.f26592c.f29859u).b();
                HK s13 = JK.s(b14, 0, b14.length);
                D12.h();
                ((CH) D12.f27721u).F(s13);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((CH) D12.j()).a(), C3879sE.f33910d, AbstractC3773qF.a(oe.f26591b.f27007b), oe.f26594e);
            default:
                RE re = (RE) wc;
                C3504lG c3504lG7 = AbstractC3934tF.f34253a;
                FH D13 = GH.D();
                byte[] b15 = ((C3240gK) re.f27182c.f29859u).b();
                HK s14 = JK.s(b15, 0, b15.length);
                D13.h();
                ((GH) D13.f27721u).F(s14);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((GH) D13.j()).a(), C3879sE.f33910d, AbstractC3934tF.a(re.f27181b.f27709a), re.f27184e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3450kG
    public AbstractC3825rE c(C4151xG c4151xG) {
        C3879sE c3879sE;
        switch (this.f28129n) {
            case 1:
                C3504lG c3504lG = ZE.f28857a;
                C3238gI c3238gI = c4151xG.f34969b;
                if (!c3238gI.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI.A())));
                }
                try {
                    JK B9 = c3238gI.B();
                    PK pk = PK.f26757a;
                    int i = BK.f23877a;
                    String A9 = C3937tI.B(B9, PK.f26758b).A();
                    C3933tE c3933tE = c4151xG.f34970c;
                    if (c3933tE == C3933tE.f34230d) {
                        c3879sE = C3879sE.f33916k;
                    } else {
                        if (c3933tE != C3933tE.f34232f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
                        }
                        c3879sE = C3879sE.f33917l;
                    }
                    return new YE(A9, c3879sE);
                } catch (C3295hL e9) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e9);
                }
            case 5:
                C3504lG c3504lG2 = AbstractC3020cF.f29435a;
                C3238gI c3238gI2 = c4151xG.f34969b;
                if (!c3238gI2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI2.A())));
                }
                try {
                    JK B10 = c3238gI2.B();
                    PK pk2 = PK.f26757a;
                    int i6 = BK.f23877a;
                    return AbstractC3020cF.c(C4153xI.C(B10, PK.f26758b), c4151xG.f34970c);
                } catch (C3295hL e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
                }
            case 11:
                C3504lG c3504lG3 = AbstractC3449kF.f31384a;
                C3238gI c3238gI3 = c4151xG.f34969b;
                if (!c3238gI3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI3.A())));
                }
                try {
                    JK B11 = c3238gI3.B();
                    PK pk3 = PK.f26757a;
                    int i9 = BK.f23877a;
                    C3397jH C8 = C3397jH.C(B11, PK.f26758b);
                    if (C8.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    T8 t82 = new T8(6);
                    t82.b(C8.A().B());
                    t82.h(C8.B().B());
                    t82.l(C8.A().A().A());
                    t82.m(C8.B().A().B());
                    t82.f27699x = AbstractC3449kF.c(C8.B().A().A());
                    t82.f27700y = AbstractC3449kF.b(c4151xG.f34970c);
                    return t82.p();
                } catch (C3295hL e11) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e11);
                }
            case 15:
                C3504lG c3504lG4 = AbstractC3503lF.f31750a;
                C3238gI c3238gI4 = c4151xG.f34969b;
                if (!c3238gI4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI4.A())));
                }
                try {
                    JK B12 = c3238gI4.B();
                    PK pk4 = PK.f26757a;
                    int i10 = BK.f23877a;
                    C3990uH C9 = C3990uH.C(B12, PK.f26758b);
                    C2570Gf c2570Gf = new C2570Gf(29);
                    c2570Gf.i(C9.B());
                    c2570Gf.p(C9.A().A());
                    c2570Gf.s();
                    c2570Gf.f25045x = AbstractC3503lF.b(c4151xG.f34970c);
                    return c2570Gf.z();
                } catch (C3295hL e12) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e12);
                }
            case 19:
                C3504lG c3504lG5 = AbstractC3665oF.f32884a;
                C3238gI c3238gI5 = c4151xG.f34969b;
                if (!c3238gI5.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI5.A())));
                }
                try {
                    JK B13 = c3238gI5.B();
                    PK pk5 = PK.f26757a;
                    int i11 = BK.f23877a;
                    AH C10 = AH.C(B13, PK.f26758b);
                    if (C10.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    ME me = new ME(0);
                    me.a(C10.A());
                    me.c();
                    me.f();
                    me.f26273e = AbstractC3665oF.b(c4151xG.f34970c);
                    return me.i();
                } catch (C3295hL e13) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e13);
                }
            case 23:
                C3504lG c3504lG6 = AbstractC3773qF.f33223a;
                C3238gI c3238gI6 = c4151xG.f34969b;
                if (!c3238gI6.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI6.A())));
                }
                try {
                    JK B14 = c3238gI6.B();
                    PK pk6 = PK.f26757a;
                    int i12 = BK.f23877a;
                    EH C11 = EH.C(B14, PK.f26758b);
                    if (C11.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int A10 = C11.A();
                    if (A10 == 16 || A10 == 32) {
                        return new QE(A10, AbstractC3773qF.b(c4151xG.f34970c));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(A10)));
                } catch (C3295hL e14) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e14);
                }
            default:
                C3504lG c3504lG7 = AbstractC3934tF.f34253a;
                C3238gI c3238gI7 = c4151xG.f34969b;
                if (!c3238gI7.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI7.A())));
                }
                try {
                    JK B15 = c3238gI7.B();
                    PK pk7 = PK.f26757a;
                    int i13 = BK.f23877a;
                    HH.A(B15, PK.f26758b);
                    return new TE(AbstractC3934tF.b(c4151xG.f34970c));
                } catch (C3295hL e15) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e15);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4097wG c4097wG) {
        C3879sE c3879sE;
        int i = 19;
        boolean z3 = false;
        switch (this.f28129n) {
            case 3:
                C3504lG c3504lG = ZE.f28857a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk = c4097wG.f34820c;
                    PK pk = PK.f26757a;
                    int i6 = BK.f23877a;
                    C3829rI C8 = C3829rI.C(jk, PK.f26758b);
                    if (C8.A() != 0) {
                        String valueOf = String.valueOf(C8);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                        sb.append("KmsAeadKey are only accepted with version 0, got ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    String A9 = C8.B().A();
                    C3933tE c3933tE = c4097wG.f34822e;
                    if (c3933tE == C3933tE.f34230d) {
                        c3879sE = C3879sE.f33916k;
                    } else {
                        if (c3933tE != C3933tE.f34232f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
                        }
                        c3879sE = C3879sE.f33917l;
                    }
                    return XE.j(new YE(A9, c3879sE), c4097wG.f34823f);
                } catch (C3295hL e9) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e9);
                }
            case 7:
                C3504lG c3504lG2 = AbstractC3020cF.f29435a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk2 = c4097wG.f34820c;
                    PK pk2 = PK.f26757a;
                    int i9 = BK.f23877a;
                    C4045vI C9 = C4045vI.C(jk2, PK.f26758b);
                    if (C9.A() != 0) {
                        String valueOf2 = String.valueOf(C9);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 58);
                        sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                        sb2.append(valueOf2);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                    C4153xI B9 = C9.B();
                    C3933tE c3933tE2 = c4097wG.f34822e;
                    C3933tE c3933tE3 = C3933tE.f34230d;
                    if (c3933tE2 != c3933tE3 && c3933tE2 != (c3933tE3 = C3933tE.f34232f)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE2.f34252b));
                    }
                    return C2913aF.j(AbstractC3020cF.c(B9, c3933tE3), c4097wG.f34823f);
                } catch (C3295hL e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
                }
            case 13:
                C3504lG c3504lG3 = AbstractC3449kF.f31384a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk3 = c4097wG.f34820c;
                    PK pk3 = PK.f26757a;
                    int i10 = BK.f23877a;
                    C3291hH D8 = C3291hH.D(jk3, PK.f26758b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (D8.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    T8 t82 = new T8(6);
                    t82.b(D8.B().C().f());
                    t82.h(D8.C().C().f());
                    t82.l(D8.B().B().A());
                    t82.m(D8.C().B().B());
                    t82.f27699x = AbstractC3449kF.c(D8.C().B().A());
                    t82.f27700y = AbstractC3449kF.b(c4097wG.f34822e);
                    GE p9 = t82.p();
                    C2570Gf c2570Gf = new C2570Gf(28);
                    c2570Gf.f25042u = p9;
                    c2570Gf.f25043v = new C3105du(8, C3240gK.a(D8.B().C().a()));
                    c2570Gf.f25044w = new C3105du(8, C3240gK.a(D8.C().C().a()));
                    c2570Gf.f25045x = c4097wG.f34823f;
                    return c2570Gf.y();
                } catch (C3295hL unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 17:
                C3504lG c3504lG4 = AbstractC3503lF.f31750a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    JK jk4 = c4097wG.f34820c;
                    PK pk4 = PK.f26757a;
                    int i11 = BK.f23877a;
                    C3882sH D9 = C3882sH.D(jk4, PK.f26758b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2570Gf c2570Gf2 = new C2570Gf(29);
                    c2570Gf2.i(D9.C().f());
                    c2570Gf2.p(D9.B().A());
                    c2570Gf2.s();
                    c2570Gf2.f25045x = AbstractC3503lF.b(c4097wG.f34822e);
                    JE z6 = c2570Gf2.z();
                    C4274ze c4274ze = new C4274ze(19, false);
                    c4274ze.f35360u = z6;
                    c4274ze.f35361v = new C3105du(8, C3240gK.a(D9.C().a()));
                    c4274ze.f35362w = c4097wG.f34823f;
                    return c4274ze.s();
                } catch (C3295hL unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 21:
                C3504lG c3504lG5 = AbstractC3665oF.f32884a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    JK jk5 = c4097wG.f34820c;
                    PK pk5 = PK.f26757a;
                    int i12 = BK.f23877a;
                    C4206yH C10 = C4206yH.C(jk5, PK.f26758b);
                    if (C10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(0);
                    me.a(C10.B().f());
                    me.c();
                    me.f();
                    me.f26273e = AbstractC3665oF.b(c4097wG.f34822e);
                    NE i13 = me.i();
                    C3481ku c3481ku = new C3481ku(i, z3);
                    c3481ku.f31663u = i13;
                    c3481ku.f31664v = new C3105du(8, C3240gK.a(C10.B().a()));
                    c3481ku.f31665w = c4097wG.f34823f;
                    return c3481ku.v();
                } catch (C3295hL unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 25:
                C3504lG c3504lG6 = AbstractC3773qF.f33223a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    JK jk6 = c4097wG.f34820c;
                    PK pk6 = PK.f26757a;
                    int i14 = BK.f23877a;
                    CH C11 = CH.C(jk6, PK.f26758b);
                    if (C11.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int f3 = C11.B().f();
                    if (f3 != 16 && f3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(f3)));
                    }
                    QE qe = new QE(f3, AbstractC3773qF.b(c4097wG.f34822e));
                    C4274ze c4274ze2 = new C4274ze(20, false);
                    c4274ze2.f35360u = qe;
                    c4274ze2.f35361v = new C3105du(8, C3240gK.a(C11.B().a()));
                    c4274ze2.f35362w = c4097wG.f34823f;
                    return c4274ze2.t();
                } catch (C3295hL unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                C3504lG c3504lG7 = AbstractC3934tF.f34253a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    JK jk7 = c4097wG.f34820c;
                    PK pk7 = PK.f26757a;
                    int i15 = BK.f23877a;
                    GH C12 = GH.C(jk7, PK.f26758b);
                    if (C12.A() == 0) {
                        return RE.j(AbstractC3934tF.b(c4097wG.f34822e), new C3105du(8, C3240gK.a(C12.B().a())), c4097wG.f34823f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3295hL unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        switch (this.f28129n) {
            case 0:
                XF xf = WE.f28326a;
                AbstractC3718pE.a(((C2913aF) wc).f29043b.f29249b);
                throw null;
            case 9:
                C3127eF c3127eF = (C3127eF) wc;
                c3127eF.getClass();
                return new BF(((C3240gK) c3127eF.f29902c.f29859u).b(), c3127eF.f29903d, c3127eF.f29901b.f30550b);
            default:
                C3289hF c3289hF = (C3289hF) wc;
                C3774qG c3774qG = AbstractC3343iF.f31014a;
                try {
                    C3826rF.b();
                    return new DF(((C3240gK) c3289hF.f30751c.f29859u).b(), c3289hF.f30752d.b(), C3826rF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4204yF(3, ((C3240gK) c3289hF.f30751c.f29859u).b(), c3289hF.f30752d.b());
                }
        }
    }
}
