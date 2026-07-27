package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class XJ implements YJ, InterfaceC3725pL, InterfaceC3231gB, InterfaceC3529lo {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ XJ f28512u = new XJ((byte) 0, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ XJ f28513v = new XJ((byte) 0, 13);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ XJ f28514w = new XJ((byte) 0, 17);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28515n;

    public /* synthetic */ XJ(byte b9, int i) {
        this.f28515n = i;
    }

    public static final InterfaceC3026cL b(long j6, Object obj) {
        InterfaceC3026cL interfaceC3026cL = (InterfaceC3026cL) PL.f(j6, obj);
        if (((AK) interfaceC3026cL).f23663n) {
            return interfaceC3026cL;
        }
        int size = interfaceC3026cL.size();
        InterfaceC3026cL D8 = interfaceC3026cL.D(size == 0 ? 10 : size + size);
        PL.g(j6, obj, D8);
        return D8;
    }

    public static final C3617nL g(Object obj, Object obj2) {
        C3617nL c3617nL = (C3617nL) obj;
        C3617nL c3617nL2 = (C3617nL) obj2;
        if (!c3617nL2.isEmpty()) {
            if (!c3617nL.f32722n) {
                c3617nL = c3617nL.h();
            }
            c3617nL.j();
            if (!c3617nL2.isEmpty()) {
                c3617nL.putAll(c3617nL2);
            }
        }
        return c3617nL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f28515n) {
            case 12:
                ((G6) obj).C();
                break;
            case 13:
                break;
            case 14:
                int i = PN.f26764H0;
                ((G6) obj).d();
                break;
            case 15:
                int i6 = PN.f26764H0;
                ((G6) obj).y();
                break;
            case 16:
                int i9 = PN.f26764H0;
                ((G6) obj).m();
                break;
            case 17:
                int i10 = PN.f26764H0;
                ((G6) obj).e0(new DN(2, new B0.c("Player release timed out."), 1003));
                break;
            case 18:
                int i11 = PN.f26764H0;
                ((G6) obj).w();
                break;
            case 19:
                int i12 = PN.f26764H0;
                ((G6) obj).i();
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        return new BN();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public boolean d(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725pL
    public C4264zL e(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.YJ
    public /* bridge */ /* synthetic */ Object f(String str, Provider provider) {
        switch (this.f28515n) {
            case 0:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 1:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 2:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 3:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 4:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public /* synthetic */ XJ(float f3) {
        this.f28515n = 18;
    }

    public /* synthetic */ XJ(int i) {
        this.f28515n = 16;
    }

    public /* synthetic */ XJ(int i, int i6) {
        this.f28515n = 15;
    }

    public /* synthetic */ XJ(C2954b2 c2954b2, int i) {
        this.f28515n = 19;
    }

    public /* synthetic */ XJ(C3062d3 c3062d3) {
        this.f28515n = 14;
    }

    public /* synthetic */ XJ(boolean z3) {
        this.f28515n = 12;
    }
}
