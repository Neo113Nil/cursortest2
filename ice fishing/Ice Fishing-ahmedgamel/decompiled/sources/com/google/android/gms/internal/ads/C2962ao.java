package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2962ao implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29907a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f29908b;

    public C2962ao(C3495kl c3495kl, C3266gN c3266gN) {
        this.f29907a = 6;
        this.f29908b = c3266gN;
    }

    public C3180es a() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3180es(0, c3383ig, (C3061cg) this.f29908b.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        Object obj;
        int i = 0;
        int i4 = 4;
        C3266gN c3266gN = this.f29908b;
        switch (this.f29907a) {
            case 0:
                C3338ho c3338ho = (C3338ho) c3266gN.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2528Cl(c3338ho, c3383ig);
            case 1:
                C3391io c3391io = (C3391io) c3266gN.f();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C3230fo(c3391io, c3383ig2);
            case 2:
                return new C3552lo((V2.a) c3266gN.f());
            case 3:
                C3660no c3660no = (C3660no) c3266gN.f();
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                Set j6 = C3495kl.j(c3660no, c3383ig3);
                AbstractC3364iD.j(j6);
                return j6;
            case 4:
                C3660no c3660no2 = (C3660no) c3266gN.f();
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                Set j9 = C3495kl.j(c3660no2, c3383ig4);
                AbstractC3364iD.j(j9);
                return j9;
            case 5:
                C3660no c3660no3 = (C3660no) c3266gN.f();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                Set j10 = C3495kl.j(c3660no3, c3383ig5);
                AbstractC3364iD.j(j10);
                return j10;
            case 6:
                C3660no c3660no4 = (C3660no) c3266gN.f();
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                Set j11 = C3495kl.j(c3660no4, c3383ig6);
                AbstractC3364iD.j(j11);
                return j11;
            case 7:
                C3660no c3660no5 = (C3660no) c3266gN.f();
                C3383ig c3383ig7 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig7);
                Set j12 = C3495kl.j(c3660no5, c3383ig7);
                AbstractC3364iD.j(j12);
                return j12;
            case 8:
                C3660no c3660no6 = (C3660no) c3266gN.f();
                C3383ig c3383ig8 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig8);
                Set j13 = C3495kl.j(c3660no6, c3383ig8);
                AbstractC3364iD.j(j13);
                return j13;
            case 9:
                C3660no c3660no7 = (C3660no) c3266gN.f();
                C3383ig c3383ig9 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig9);
                Set j14 = C3495kl.j(c3660no7, c3383ig9);
                AbstractC3364iD.j(j14);
                return j14;
            case 10:
                C3660no c3660no8 = (C3660no) c3266gN.f();
                C3383ig c3383ig10 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig10);
                Set j15 = C3495kl.j(c3660no8, c3383ig10);
                AbstractC3364iD.j(j15);
                return j15;
            case 11:
                C3660no c3660no9 = (C3660no) c3266gN.f();
                C3383ig c3383ig11 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig11);
                Set j16 = C3495kl.j(c3660no9, c3383ig11);
                AbstractC3364iD.j(j16);
                return j16;
            case 12:
                C2650Jo c2650Jo = (C2650Jo) c3266gN.f();
                C3383ig c3383ig12 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig12);
                return new C2528Cl(c2650Jo, c3383ig12);
            case 13:
                C2650Jo c2650Jo2 = (C2650Jo) c3266gN.f();
                C3383ig c3383ig13 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig13);
                return new C2528Cl(c2650Jo2, c3383ig13);
            case 14:
                C2650Jo c2650Jo3 = (C2650Jo) c3266gN.f();
                C3383ig c3383ig14 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig14);
                return new C2528Cl(c2650Jo3, c3383ig14);
            case 15:
                return new C2528Cl((C3285gp) c3266gN.f(), AbstractC3436jg.f32062h);
            case 16:
                return new C2528Cl((C3285gp) c3266gN.f(), AbstractC3436jg.f32062h);
            case 17:
                return new C2528Cl((C3285gp) c3266gN.f(), AbstractC3436jg.f32062h);
            case 18:
                Context context = (Context) c3266gN.f();
                C3383ig c3383ig15 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig15);
                return new C3715op(context, c3383ig15, 0);
            case 19:
                C2702Mp c2702Mp = (C2702Mp) c3266gN.f();
                C3383ig c3383ig16 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig16);
                return new C2528Cl(c2702Mp, c3383ig16);
            case 20:
                C2702Mp c2702Mp2 = (C2702Mp) c3266gN.f();
                C3383ig c3383ig17 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig17);
                return new C2528Cl(c2702Mp2, c3383ig17);
            case 21:
                return new C3878rr((C2785Rn) c3266gN.f());
            case 22:
                return new Dr((C3230fo) c3266gN.f());
            case 23:
                return a();
            case 24:
                C3383ig c3383ig18 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig18);
                C3772ps c3772ps = new C3772ps(c3383ig18, i);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c3266gN.f();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32951X4)).booleanValue()) {
                    Qr qr = new Qr(c3772ps, ((Integer) r2.f40509c.a(AbstractC3592ma.f32959Y4)).intValue(), scheduledExecutorService);
                    int i6 = XB.f29283v;
                    obj = new YB(qr);
                } else {
                    int i9 = XB.f29283v;
                    obj = C3846rC.f34305C;
                }
                AbstractC3364iD.j(obj);
                return obj;
            case 25:
                C3383ig c3383ig19 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig19);
                return new Qr(new C3772ps(c3383ig19, 1), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Id)).intValue(), (ScheduledExecutorService) c3266gN.f());
            case 26:
                C3383ig c3383ig20 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig20);
                return new C3180es(3, c3383ig20, (C2786Ro) c3266gN.f());
            case 27:
                return new Lr(4, (Rt) c3266gN.f());
            case 28:
                C3383ig c3383ig21 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig21);
                return new C3180es(i4, c3383ig21, (C3768po) c3266gN.f());
            default:
                return new Lr(6, (String) c3266gN.f());
        }
    }

    public /* synthetic */ C2962ao(C3266gN c3266gN, int i) {
        this.f29907a = i;
        this.f29908b = c3266gN;
    }
}
