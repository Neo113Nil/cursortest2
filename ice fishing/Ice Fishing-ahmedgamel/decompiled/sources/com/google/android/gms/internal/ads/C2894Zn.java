package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2894Zn implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28961a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f28962b;

    public C2894Zn(C3472kl c3472kl, C3243gN c3243gN) {
        this.f28961a = 6;
        this.f28962b = c3243gN;
    }

    public C3157es a() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3157es(0, c3360ig, (C3038cg) this.f28962b.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        Object obj;
        int i = 0;
        int i6 = 4;
        C3243gN c3243gN = this.f28962b;
        switch (this.f28961a) {
            case 0:
                C3261go c3261go = (C3261go) c3243gN.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2491Bl(c3261go, c3360ig);
            case 1:
                C3315ho c3315ho = (C3315ho) c3243gN.f();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C3153eo(c3315ho, c3360ig2);
            case 2:
                return new C3475ko((T2.a) c3243gN.f());
            case 3:
                C3583mo c3583mo = (C3583mo) c3243gN.f();
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                Set j6 = C3472kl.j(c3583mo, c3360ig3);
                AbstractC3341iD.j(j6);
                return j6;
            case 4:
                C3583mo c3583mo2 = (C3583mo) c3243gN.f();
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                Set j9 = C3472kl.j(c3583mo2, c3360ig4);
                AbstractC3341iD.j(j9);
                return j9;
            case 5:
                C3583mo c3583mo3 = (C3583mo) c3243gN.f();
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                Set j10 = C3472kl.j(c3583mo3, c3360ig5);
                AbstractC3341iD.j(j10);
                return j10;
            case 6:
                C3583mo c3583mo4 = (C3583mo) c3243gN.f();
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                Set j11 = C3472kl.j(c3583mo4, c3360ig6);
                AbstractC3341iD.j(j11);
                return j11;
            case 7:
                C3583mo c3583mo5 = (C3583mo) c3243gN.f();
                C3360ig c3360ig7 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig7);
                Set j12 = C3472kl.j(c3583mo5, c3360ig7);
                AbstractC3341iD.j(j12);
                return j12;
            case 8:
                C3583mo c3583mo6 = (C3583mo) c3243gN.f();
                C3360ig c3360ig8 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig8);
                Set j13 = C3472kl.j(c3583mo6, c3360ig8);
                AbstractC3341iD.j(j13);
                return j13;
            case 9:
                C3583mo c3583mo7 = (C3583mo) c3243gN.f();
                C3360ig c3360ig9 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig9);
                Set j14 = C3472kl.j(c3583mo7, c3360ig9);
                AbstractC3341iD.j(j14);
                return j14;
            case 10:
                C3583mo c3583mo8 = (C3583mo) c3243gN.f();
                C3360ig c3360ig10 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig10);
                Set j15 = C3472kl.j(c3583mo8, c3360ig10);
                AbstractC3341iD.j(j15);
                return j15;
            case 11:
                C3583mo c3583mo9 = (C3583mo) c3243gN.f();
                C3360ig c3360ig11 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig11);
                Set j16 = C3472kl.j(c3583mo9, c3360ig11);
                AbstractC3341iD.j(j16);
                return j16;
            case 12:
                C2613Io c2613Io = (C2613Io) c3243gN.f();
                C3360ig c3360ig12 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig12);
                return new C2491Bl(c2613Io, c3360ig12);
            case 13:
                C2613Io c2613Io2 = (C2613Io) c3243gN.f();
                C3360ig c3360ig13 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig13);
                return new C2491Bl(c2613Io2, c3360ig13);
            case 14:
                C2613Io c2613Io3 = (C2613Io) c3243gN.f();
                C3360ig c3360ig14 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig14);
                return new C2491Bl(c2613Io3, c3360ig14);
            case 15:
                return new C2491Bl((C3262gp) c3243gN.f(), AbstractC3413jg.f31275h);
            case 16:
                return new C2491Bl((C3262gp) c3243gN.f(), AbstractC3413jg.f31275h);
            case 17:
                return new C2491Bl((C3262gp) c3243gN.f(), AbstractC3413jg.f31275h);
            case 18:
                Context context = (Context) c3243gN.f();
                C3360ig c3360ig15 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig15);
                return new C3692op(context, c3360ig15, 0);
            case 19:
                C2682Mp c2682Mp = (C2682Mp) c3243gN.f();
                C3360ig c3360ig16 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig16);
                return new C2491Bl(c2682Mp, c3360ig16);
            case 20:
                C2682Mp c2682Mp2 = (C2682Mp) c3243gN.f();
                C3360ig c3360ig17 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig17);
                return new C2491Bl(c2682Mp2, c3360ig17);
            case 21:
                return new C3855rr((C2748Qn) c3243gN.f());
            case 22:
                return new Dr((C3153eo) c3243gN.f());
            case 23:
                return a();
            case 24:
                C3360ig c3360ig18 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig18);
                C3749ps c3749ps = new C3749ps(c3360ig18, i);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c3243gN.f();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32172X4)).booleanValue()) {
                    Qr qr = new Qr(c3749ps, ((Integer) r2.f40210c.a(AbstractC3569ma.f32180Y4)).intValue(), scheduledExecutorService);
                    int i9 = XB.f28503v;
                    obj = new YB(qr);
                } else {
                    int i10 = XB.f28503v;
                    obj = C3823rC.f33537C;
                }
                AbstractC3341iD.j(obj);
                return obj;
            case 25:
                C3360ig c3360ig19 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig19);
                return new Qr(new C3749ps(c3360ig19, 1), ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Id)).intValue(), (ScheduledExecutorService) c3243gN.f());
            case 26:
                C3360ig c3360ig20 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig20);
                return new C3157es(3, c3360ig20, (C2749Qo) c3243gN.f());
            case 27:
                return new Lr(4, (Rt) c3243gN.f());
            case 28:
                C3360ig c3360ig21 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig21);
                return new C3157es(i6, c3360ig21, (C3691oo) c3243gN.f());
            default:
                return new Lr(6, (String) c3243gN.f());
        }
    }

    public /* synthetic */ C2894Zn(C3243gN c3243gN, int i) {
        this.f28961a = i;
        this.f28962b = c3243gN;
    }
}
