package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import j3.InterfaceC4604a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4915x;

/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3586mr implements InterfaceC2540Ej, InterfaceC3965tt, KD, InterfaceC4604a, InterfaceC3231gB, InterfaceC3123eB, InterfaceC3448kE, InterfaceC3989uG, InterfaceC3827rG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32618n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32612u = new C3586mr(0, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32613v = new C3586mr(0, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32614w = new C3586mr(0, 2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32615x = new C3586mr(0, 3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32616y = new C3586mr(0, 4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32617z = new C3586mr(0, 5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32597A = new C3586mr(0, 6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32598B = new C3586mr(0, 7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32599C = new C3586mr(0, 8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32600D = new C3586mr(0, 9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32601E = new C3586mr(0, 11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32602F = new C3586mr(0, 12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32603G = new C3586mr(0, 13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32604H = new C3586mr(0, 14);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32605I = new C3586mr(0, 21);
    public static final /* synthetic */ C3586mr J = new C3586mr(0, 23);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32606K = new C3586mr(0, 24);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32607L = new C3586mr(0, 25);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32608M = new C3586mr(0, 26);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32609N = new C3586mr(0, 27);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32610O = new C3586mr(0, 28);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3586mr f32611P = new C3586mr(0, 29);

    public /* synthetic */ C3586mr(byte b9, int i) {
        this.f32618n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3965tt
    public /* synthetic */ void a(Object obj) {
        switch (this.f32618n) {
            case 1:
                ((InterfaceC4915x) obj).d();
                break;
            case 2:
                ((InterfaceC4915x) obj).n();
                break;
            case 3:
                ((InterfaceC4915x) obj).t();
                break;
            case 4:
                ((InterfaceC4868A) obj).t();
                break;
            case 5:
                ((InterfaceC4871a0) obj).F();
                break;
            case 6:
                ((Hv) obj).a();
                break;
            case 7:
                ((InterfaceC2728Pk) obj).l();
                break;
            case 8:
                ((t2.l) obj).R1();
                break;
            case 9:
                ((t2.l) obj).Q2();
                break;
            case 10:
            default:
                ((G2.a) obj).c();
                break;
            case 11:
                ((InterfaceC3574mf) obj).k();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        switch (this.f32618n) {
            case 23:
                ZF zf = (ZF) wc;
                C4097wG c4097wG = zf.f28861b;
                C3879sE c3879sE = c4097wG.f34821d;
                return new C4204yF((InterfaceC3394jE) QF.f27009d.b(InterfaceC3394jE.class, c4097wG.f34818a).a(c4097wG.f34820c), C2921aN.c(c4097wG.f34822e, zf.f28861b.f34823f).b());
            case 24:
                return UJ.b((BE) wc);
            case 25:
                return QJ.b((HE) wc);
            case 26:
                KE ke = (KE) wc;
                ke.getClass();
                return new C4204yF(((C3240gK) ke.f25879c.f29859u).b(), ke.f25880d);
            case 27:
                return FF.b((OE) wc);
            case 28:
                RE re = (RE) wc;
                C3774qG c3774qG = SE.f27425a;
                try {
                    C3826rF.b();
                    return new C3826rF(((C3240gK) re.f27182c.f29859u).b(), re.f27183d.b(), C3826rF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4204yF(2, ((C3240gK) re.f27182c.f29859u).b(), re.f27183d.b());
                }
            default:
                C3774qG c3774qG2 = UE.f27913a;
                AbstractC3718pE.a(((XE) wc).f28505b.f28660a);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Ej
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ q2.A0 mo13c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989uG
    public Object d(C3664oE c3664oE) {
        WC wc = c3664oE.f32878a;
        if (wc instanceof BE) {
            return UJ.b((BE) wc);
        }
        if (wc instanceof KE) {
            KE ke = (KE) wc;
            ke.getClass();
            return new C4204yF(((C3240gK) ke.f25879c.f29859u).b(), ke.f25880d);
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
                C3826rF.b();
                return new C3826rF(((C3240gK) re.f27182c.f29859u).b(), re.f27183d.b(), C3826rF.b().getProvider());
            } catch (GeneralSecurityException unused) {
                return new C4204yF(2, ((C3240gK) re.f27182c.f29859u).b(), re.f27183d.b());
            }
        }
        if (wc instanceof C3289hF) {
            C3289hF c3289hF = (C3289hF) wc;
            try {
                C3826rF.b();
                return new DF(((C3240gK) c3289hF.f30751c.f29859u).b(), c3289hF.f30752d.b(), C3826rF.b().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new C4204yF(3, ((C3240gK) c3289hF.f30751c.f29859u).b(), c3289hF.f30752d.b());
            }
        }
        if (!(wc instanceof C3127eF)) {
            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(wc.getClass())));
        }
        C3127eF c3127eF = (C3127eF) wc;
        c3127eF.getClass();
        return new BF(((C3240gK) c3127eF.f29902c.f29859u).b(), c3127eF.f29903d, c3127eF.f29901b.f30550b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448kE
    public Object e(S0.l lVar, Class cls) {
        switch (this.f32618n) {
            case 20:
                C3935tG c3935tG = (C3935tG) C3236gG.f30551b.f30552a.get();
                HashMap hashMap = c3935tG.f34258b;
                if (!hashMap.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                InterfaceC4043vG interfaceC4043vG = (InterfaceC4043vG) hashMap.get(cls);
                return interfaceC4043vG.a(lVar, new S0.s(22, c3935tG, interfaceC4043vG));
            default:
                if (cls == InterfaceC3394jE.class) {
                    return cls.cast(C2921aN.b(lVar, f32605I));
                }
                throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
        }
    }

    @Override // j3.InterfaceC4604a
    public /* synthetic */ Object h(j3.m mVar) {
        return new Boolean(mVar.i());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3123eB
    public Iterator j(com.bumptech.glide.manager.p pVar, CharSequence charSequence) {
        return new C3016cB(pVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo11n(Object obj) {
        u2.z.k("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        u2.z.k("Notification of cache hit failed.");
    }

    public C3586mr(int i) {
        this.f32618n = 17;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        switch (this.f32618n) {
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
