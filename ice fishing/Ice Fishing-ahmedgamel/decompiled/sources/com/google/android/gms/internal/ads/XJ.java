package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class XJ implements YJ, InterfaceC3748pL, InterfaceC3254gB, InterfaceC3606mo {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ XJ f29292u = new XJ((byte) 0, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ XJ f29293v = new XJ((byte) 0, 13);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ XJ f29294w = new XJ((byte) 0, 17);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29295n;

    public /* synthetic */ XJ(byte b9, int i) {
        this.f29295n = i;
    }

    public static final InterfaceC3049cL b(long j6, Object obj) {
        InterfaceC3049cL interfaceC3049cL = (InterfaceC3049cL) PL.f(j6, obj);
        if (((AK) interfaceC3049cL).f24443n) {
            return interfaceC3049cL;
        }
        int size = interfaceC3049cL.size();
        InterfaceC3049cL D8 = interfaceC3049cL.D(size == 0 ? 10 : size + size);
        PL.g(j6, obj, D8);
        return D8;
    }

    public static final C3640nL g(Object obj, Object obj2) {
        C3640nL c3640nL = (C3640nL) obj;
        C3640nL c3640nL2 = (C3640nL) obj2;
        if (!c3640nL2.isEmpty()) {
            if (!c3640nL.f33500n) {
                c3640nL = c3640nL.h();
            }
            c3640nL.j();
            if (!c3640nL2.isEmpty()) {
                c3640nL.putAll(c3640nL2);
            }
        }
        return c3640nL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f29295n) {
            case 12:
                ((G6) obj).C();
                break;
            case 13:
                break;
            case 14:
                int i = PN.C0;
                ((G6) obj).d();
                break;
            case 15:
                int i4 = PN.C0;
                ((G6) obj).y();
                break;
            case 16:
                int i6 = PN.C0;
                ((G6) obj).m();
                break;
            case 17:
                int i9 = PN.C0;
                ((G6) obj).e0(new DN(2, new B0.c("Player release timed out."), 1003));
                break;
            case 18:
                int i10 = PN.C0;
                ((G6) obj).w();
                break;
            case 19:
                int i11 = PN.C0;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public /* synthetic */ Object mo14c() {
        return new BN();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3748pL
    public boolean d(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3748pL
    public C4287zL e(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.YJ
    public /* bridge */ /* synthetic */ Object f(String str, Provider provider) {
        switch (this.f29295n) {
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

    public /* synthetic */ XJ(float f2) {
        this.f29295n = 18;
    }

    public /* synthetic */ XJ(int i) {
        this.f29295n = 16;
    }

    public /* synthetic */ XJ(int i, int i4) {
        this.f29295n = 15;
    }

    public /* synthetic */ XJ(C2977b2 c2977b2, int i) {
        this.f29295n = 19;
    }

    public /* synthetic */ XJ(C3085d3 c3085d3) {
        this.f29295n = 14;
    }

    public /* synthetic */ XJ(boolean z6) {
        this.f29295n = 12;
    }
}
