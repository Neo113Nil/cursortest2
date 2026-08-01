package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k2.C4631a;
import org.json.JSONObject;
import p2.C4835j;
import x2.InterfaceC5189c;

/* loaded from: classes2.dex */
public final class Ux implements S, G0, OC, KD, InterfaceC3575mg, InterfaceC3521lg, InterfaceC5189c, G2.b, InterfaceC3742pl, InterfaceC3408jb, InterfaceC2478Ap, InterfaceC2540Ej, Ir, InterfaceC4289zt {

    /* renamed from: v, reason: collision with root package name */
    public static Ux f28048v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28049n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28050u;

    public /* synthetic */ Ux(int i, Object obj) {
        this.f28049n = i;
        this.f28050u = obj;
    }

    public static final Ux e(Context context) {
        Ux ux;
        synchronized (Ux.class) {
            try {
                if (f28048v == null) {
                    f28048v = new Ux(context);
                }
                ux = f28048v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ux;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f28049n) {
            case 8:
                g7.m mVar = (g7.m) this.f28050u;
                mVar.getClass();
                InterfaceC4061vh interfaceC4061vh = ((C2720Pc) obj).f26837n;
                if (interfaceC4061vh == null || interfaceC4061vh.n0()) {
                    mVar.f37665c = 1;
                    break;
                }
                break;
            case 18:
                ((InterfaceC4226yk) obj).L((C2828Vl) this.f28050u);
                break;
            case 19:
                ((InterfaceC3580ml) obj).a((H9) this.f28050u);
                break;
            default:
                ((InterfaceC3927t8) obj).f((C3873s8) this.f28050u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.G0
    public long b(long j6) {
        ((W0) this.f28050u).getClass();
        String str = AbstractC3159eu.f29993a;
        return Math.max(0L, Math.min((j6 * r0.f28295e) / 1000000, r0.f28299j - 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Ej
    /* renamed from: c */
    public q2.A0 mo13c() {
        try {
            return ((InterfaceC2721Pd) ((C3477kq) this.f28050u).f31639b).g();
        } catch (RemoteException e9) {
            throw new C3267gu(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2478Ap
    public N3.a d(C2739Qe c2739Qe) {
        C4015up c4015up = (C4015up) ((C4274ze) this.f28050u).f35361v;
        String str = c2739Qe.f27035A;
        synchronized (c4015up.f34147u) {
            try {
                int i = c4015up.f34591A;
                if (i != 1 && i != 3) {
                    return QC.k(new C4231yp(2));
                }
                if (c4015up.f34148v) {
                    return c4015up.f34146n;
                }
                c4015up.f34591A = 3;
                c4015up.f34148v = true;
                c4015up.f34592z = str;
                c4015up.f34151y.o();
                C3467kg c3467kg = c4015up.f34146n;
                c3467kg.f31479n.a(new RunnableC3961tp(c4015up, 0), AbstractC3413jg.f31275h);
                return c3467kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AtomicReference f(String str) {
        synchronized (this) {
            try {
                HashMap hashMap = (HashMap) this.f28050u;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f28050u).get(str);
    }

    @Override // com.google.android.gms.internal.ads.OC
    public /* synthetic */ void g(long j6, Cr cr) {
        switch (this.f28049n) {
            case 3:
                AbstractC3043cl.l(j6, cr, ((Q2) this.f28050u).f26929I);
                break;
            default:
                AbstractC3043cl.l(j6, cr, (InterfaceC3543m1[]) ((C4274ze) this.f28050u).f35361v);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb
    public JSONObject i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.S
    public void j(float f3) {
        C3704p0 c3704p0 = ((C3434k0) this.f28050u).f31360b;
        if (c3704p0.f32991e == f3) {
            return;
        }
        c3704p0.f32991e = f3;
        c3704p0.b(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289zt
    public /* synthetic */ C3415ji k(InterfaceC4235yt interfaceC4235yt) {
        return ((C3426jt) this.f28050u).b(interfaceC4235yt);
    }

    public void l(AbstractC3171f5 abstractC3171f5, com.bumptech.glide.manager.o oVar, RunnableC3973u0 runnableC3973u0) {
        synchronized (abstractC3171f5.f30046x) {
            abstractC3171f5.f30038B = true;
        }
        abstractC3171f5.a("post-response");
        ((L) this.f28050u).f26005u.post(new RunnableC3865s0(1, abstractC3171f5, oVar, runnableC3973u0));
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        C3467kg c3467kg;
        switch (this.f28049n) {
            case 7:
                String str = (String) obj;
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28050u;
                new u2.u(interfaceC4061vh.getContext(), interfaceC4061vh.C().f41391n, str, interfaceC4061vh.K() != null ? interfaceC4061vh.K().f27651x0 : null).l();
                return;
            case 13:
                ((AtomicInteger) ((E2.a) this.f28050u).f732v).set(1);
                return;
            case 17:
                ((C3257gk) this.f28050u).f30619n.t();
                return;
            case 21:
                C3797qm c3797qm = (C3797qm) this.f28050u;
                C4012um c4012um = c3797qm.f33402m;
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) obj;
                synchronized (c4012um) {
                    c4012um.f34573k = interfaceC4061vh2;
                }
                C4012um c4012um2 = c3797qm.f33402m;
                synchronized (c4012um2) {
                    c3467kg = c4012um2.f34576n;
                }
                C3209fq e9 = c3797qm.e("Google", true);
                if (e9 != null && c3467kg != null) {
                    c3467kg.b(e9);
                    return;
                } else {
                    if (c3467kg != null) {
                        c3467kg.cancel(false);
                        return;
                    }
                    return;
                }
            case 22:
                InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) obj;
                C3467kg c3467kg2 = (C3467kg) this.f28050u;
                if (interfaceC4061vh3 == null) {
                    c3467kg2.c(new Zq(1, "Missing webview from video view future."));
                    return;
                } else {
                    interfaceC4061vh3.a1("/video", new C2818Vb(7, new Qx(22, c3467kg2)));
                    interfaceC4061vh3.k0();
                    return;
                }
            case 24:
                ((C2613Io) obj).f25583G = true;
                ((BinderC2895Zo) this.f28050u).f28966w.b();
                return;
            default:
                try {
                    ((Eu) this.f28050u).a((SQLiteDatabase) obj);
                    return;
                } catch (Exception e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    int i = u2.z.f41322b;
                    v2.i.c("Error executing function on offline signal database: ".concat(valueOf));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb, com.google.android.gms.internal.ads.At
    public JSONObject o() {
        return null;
    }

    public void q() {
        synchronized (Ux.class) {
            S0.e eVar = (S0.e) this.f28050u;
            eVar.D("vendor_scoped_gpid_v2_id");
            eVar.D("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2557Fj abstractC2557Fj) {
        C3364ik c3364ik;
        Br br = (Br) this.f28050u;
        C3524lj c3524lj = (C3524lj) abstractC2557Fj;
        synchronized (br) {
            try {
                C3524lj c3524lj2 = br.f23973B;
                if (c3524lj2 != null) {
                    C3364ik c3364ik2 = c3524lj.f24841j;
                    if (c3364ik2 != null && (c3364ik = c3524lj2.f24841j) != null) {
                        c3364ik2.a(c3364ik.f31114a.get());
                    }
                    C2558Fk c2558Fk = br.f23973B.f24835c;
                    c2558Fk.getClass();
                    c2558Fk.M1(new C3193fa(null, false));
                }
                br.f23973B = c3524lj;
                c3524lj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Object obj = this.f28050u;
        switch (this.f28049n) {
            case 7:
                C4835j.f39733C.f39743h.d("DefaultGmsgHandlers.attributionReportingManager", th);
                break;
            case 13:
                ((AtomicInteger) ((E2.a) obj).f732v).set(-1);
                break;
            case 17:
                break;
            case 21:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32338p6)).booleanValue()) {
                    C4835j.f39733C.f39743h.e("omid native display exp", th);
                    break;
                }
                break;
            case 22:
                int i = u2.z.f41322b;
                v2.i.c("Failed to load media data due to video view load failure.");
                ((C3467kg) obj).c(th);
                break;
            case 24:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i6 = u2.z.f41322b;
                v2.i.c("Failed to get offline signal database: ".concat(valueOf));
                break;
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        switch (this.f28049n) {
            case 10:
                try {
                    ((InterfaceC2619Jd) this.f28050u).a(c4631a.a());
                    break;
                } catch (RemoteException e9) {
                    v2.i.d("", e9);
                    return;
                }
            default:
                try {
                    ((InterfaceC2687Nd) this.f28050u).a(c4631a.a());
                    break;
                } catch (RemoteException e10) {
                    v2.i.d("", e10);
                }
        }
    }

    public Ux() {
        this.f28049n = 6;
        this.f28050u = new HashMap();
    }

    public Ux(E2.a aVar) {
        this.f28049n = 13;
        Objects.requireNonNull(aVar);
        this.f28050u = aVar;
    }

    public Ux(S0.e eVar, Eu eu) {
        this.f28049n = 26;
        this.f28050u = eu;
        Objects.requireNonNull(eVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3521lg, com.google.android.gms.internal.ads.InterfaceC3408jb
    /* renamed from: c */
    public void mo0c() {
        switch (this.f28049n) {
            case 9:
                u2.z.k("Rejecting reference for JS Engine.");
                boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.C8)).booleanValue();
                C2835Wc c2835Wc = (C2835Wc) this.f28050u;
                if (booleanValue) {
                    c2835Wc.r("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    c2835Wc.q();
                    return;
                }
            case 23:
                C3797qm c3797qm = ((BinderC3636nn) this.f28050u).f32767w;
                if (c3797qm != null) {
                    synchronized (c3797qm) {
                        c3797qm.f33403n.H("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                Br br = (Br) this.f28050u;
                synchronized (br) {
                    br.f23973B = null;
                }
                return;
        }
    }

    public Ux(Context context) {
        this.f28049n = 0;
        if (S0.e.f2779w == null) {
            S0.e.f2779w = new S0.e(context);
        }
        this.f28050u = S0.e.f2779w;
        Qx.f(context);
    }

    public Ux(Handler handler) {
        this.f28049n = 5;
        this.f28050u = new L(this, handler);
    }

    public Ux(C2851Xc c2851Xc, C2835Wc c2835Wc) {
        this.f28049n = 9;
        this.f28050u = c2835Wc;
        Objects.requireNonNull(c2851Xc);
    }

    public Ux(BinderC2788Td binderC2788Td, InterfaceC2619Jd interfaceC2619Jd) {
        this.f28049n = 10;
        this.f28050u = interfaceC2619Jd;
        Objects.requireNonNull(binderC2788Td);
    }

    public Ux(BinderC2788Td binderC2788Td, InterfaceC2687Nd interfaceC2687Nd) {
        this.f28049n = 11;
        this.f28050u = interfaceC2687Nd;
        Objects.requireNonNull(binderC2788Td);
    }

    public Ux(C3257gk c3257gk) {
        this.f28049n = 17;
        Objects.requireNonNull(c3257gk);
        this.f28050u = c3257gk;
    }

    public Ux(C3797qm c3797qm) {
        this.f28049n = 21;
        Objects.requireNonNull(c3797qm);
        this.f28050u = c3797qm;
    }

    public Ux(C3045cn c3045cn, C3467kg c3467kg) {
        this.f28049n = 22;
        this.f28050u = c3467kg;
        Objects.requireNonNull(c3045cn);
    }

    public Ux(BinderC3636nn binderC3636nn) {
        this.f28049n = 23;
        Objects.requireNonNull(binderC3636nn);
        this.f28050u = binderC3636nn;
    }

    public Ux(BinderC2895Zo binderC2895Zo) {
        this.f28049n = 24;
        Objects.requireNonNull(binderC2895Zo);
        this.f28050u = binderC2895Zo;
    }

    public Ux(Br br) {
        this.f28049n = 28;
        Objects.requireNonNull(br);
        this.f28050u = br;
    }

    private final void m(Throwable th) {
    }

    private final void p(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb
    public void h(MotionEvent motionEvent) {
    }
}
