package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import l3.InterfaceC4673a;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4964x;

/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3609mr implements InterfaceC2560Ej, InterfaceC3988tt, KD, InterfaceC4673a, InterfaceC3254gB, InterfaceC3146eB, InterfaceC3471kE, InterfaceC4012uG, InterfaceC3850rG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33396n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33390u = new C3609mr(0, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33391v = new C3609mr(0, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33392w = new C3609mr(0, 2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33393x = new C3609mr(0, 3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33394y = new C3609mr(0, 4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33395z = new C3609mr(0, 5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33375A = new C3609mr(0, 6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33376B = new C3609mr(0, 7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33377C = new C3609mr(0, 8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33378D = new C3609mr(0, 9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33379E = new C3609mr(0, 11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33380F = new C3609mr(0, 12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33381G = new C3609mr(0, 13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33382H = new C3609mr(0, 14);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33383I = new C3609mr(0, 21);
    public static final /* synthetic */ C3609mr J = new C3609mr(0, 23);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33384K = new C3609mr(0, 24);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33385L = new C3609mr(0, 25);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33386M = new C3609mr(0, 26);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33387N = new C3609mr(0, 27);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33388O = new C3609mr(0, 28);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3609mr f33389P = new C3609mr(0, 29);

    public /* synthetic */ C3609mr(byte b9, int i) {
        this.f33396n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3988tt
    public /* synthetic */ void a(Object obj) {
        switch (this.f33396n) {
            case 1:
                ((InterfaceC4964x) obj).d();
                break;
            case 2:
                ((InterfaceC4964x) obj).n();
                break;
            case 3:
                ((InterfaceC4964x) obj).t();
                break;
            case 4:
                ((InterfaceC4917A) obj).t();
                break;
            case 5:
                ((InterfaceC4920a0) obj).F();
                break;
            case 6:
                ((Hv) obj).a();
                break;
            case 7:
                ((InterfaceC2748Pk) obj).l();
                break;
            case 8:
                ((v2.l) obj).Q1();
                break;
            case 9:
                ((v2.l) obj).N2();
                break;
            case 10:
            default:
                ((I2.a) obj).a();
                break;
            case 11:
                ((InterfaceC3597mf) obj).k();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        switch (this.f33396n) {
            case 23:
                ZF zf = (ZF) wc;
                C4120wG c4120wG = zf.f29641b;
                C3902sE c3902sE = c4120wG.f35590d;
                return new C4227yF((InterfaceC3417jE) QF.f27796d.b(InterfaceC3417jE.class, c4120wG.f35587a).a(c4120wG.f35589c), C2944aN.c(c4120wG.f35591e, zf.f29641b.f35592f).b());
            case 24:
                return UJ.b((BE) wc);
            case 25:
                return QJ.b((HE) wc);
            case 26:
                KE ke = (KE) wc;
                ke.getClass();
                return new C4227yF(((C3263gK) ke.f26631c.f30647u).b(), ke.f26632d);
            case 27:
                return FF.b((OE) wc);
            case 28:
                RE re = (RE) wc;
                C3797qG c3797qG = SE.f28139a;
                try {
                    C3849rF.b();
                    return new C3849rF(((C3263gK) re.f27938c.f30647u).b(), re.f27939d.b(), C3849rF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4227yF(2, ((C3263gK) re.f27938c.f30647u).b(), re.f27939d.b());
                }
            default:
                C3797qG c3797qG2 = UE.f28710a;
                AbstractC3741pE.a(((XE) wc).f29285b.f29437a);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2560Ej
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ s2.A0 mo12c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4012uG
    public Object d(C3687oE c3687oE) {
        WC wc = c3687oE.f33665a;
        if (wc instanceof BE) {
            return UJ.b((BE) wc);
        }
        if (wc instanceof KE) {
            KE ke = (KE) wc;
            ke.getClass();
            return new C4227yF(((C3263gK) ke.f26631c.f30647u).b(), ke.f26632d);
        }
        if (wc instanceof OE) {
            return FF.b((OE) wc);
        }
        if (wc instanceof HE) {
            return QJ.b((HE) wc);
        }
        if (wc instanceof RE) {
            RE re = (RE) wc;
            try {
                C3849rF.b();
                return new C3849rF(((C3263gK) re.f27938c.f30647u).b(), re.f27939d.b(), C3849rF.b().getProvider());
            } catch (GeneralSecurityException unused) {
                return new C4227yF(2, ((C3263gK) re.f27938c.f30647u).b(), re.f27939d.b());
            }
        }
        if (wc instanceof C3312hF) {
            C3312hF c3312hF = (C3312hF) wc;
            try {
                C3849rF.b();
                return new DF(((C3263gK) c3312hF.f31517c.f30647u).b(), c3312hF.f31518d.b(), C3849rF.b().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new C4227yF(3, ((C3263gK) c3312hF.f31517c.f30647u).b(), c3312hF.f31518d.b());
            }
        }
        if (!(wc instanceof C3150eF)) {
            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(wc.getClass())));
        }
        C3150eF c3150eF = (C3150eF) wc;
        c3150eF.getClass();
        return new BF(((C3263gK) c3150eF.f30694c.f30647u).b(), c3150eF.f30695d, c3150eF.f30693b.f31316b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3471kE
    public Object e(S0.l lVar, Class cls) {
        switch (this.f33396n) {
            case 20:
                C3958tG c3958tG = (C3958tG) C3259gG.f31317b.f31318a.get();
                HashMap hashMap = c3958tG.f35044b;
                if (!hashMap.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                InterfaceC4066vG interfaceC4066vG = (InterfaceC4066vG) hashMap.get(cls);
                return interfaceC4066vG.a(lVar, new S0.s(24, c3958tG, interfaceC4066vG));
            default:
                if (cls == InterfaceC3417jE.class) {
                    return cls.cast(C2944aN.b(lVar, f33383I));
                }
                throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
        }
    }

    @Override // l3.InterfaceC4673a
    public /* synthetic */ Object g(l3.m mVar) {
        return new Boolean(mVar.i());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146eB
    public Iterator j(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C3039cB(oVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo10n(Object obj) {
        w2.z.k("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        w2.z.k("Notification of cache hit failed.");
    }

    public C3609mr(int i) {
        this.f33396n = 17;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public /* synthetic */ Object mo14c() {
        switch (this.f33396n) {
            case 14:
                return -1;
            case 15:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }
}
