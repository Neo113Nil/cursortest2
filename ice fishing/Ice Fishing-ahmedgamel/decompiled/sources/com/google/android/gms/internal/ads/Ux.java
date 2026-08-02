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
import m2.C4741a;
import org.json.JSONObject;
import r2.C4906k;
import z2.InterfaceC5226c;

/* loaded from: classes2.dex */
public final class Ux implements S, G0, OC, KD, InterfaceC3598mg, InterfaceC3544lg, InterfaceC5226c, I2.b, InterfaceC3765pl, InterfaceC3431jb, InterfaceC2498Ap, InterfaceC2560Ej, Ir, InterfaceC4312zt {

    /* renamed from: v, reason: collision with root package name */
    public static Ux f28845v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28846n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28847u;

    public /* synthetic */ Ux(int i, Object obj) {
        this.f28846n = i;
        this.f28847u = obj;
    }

    public static final Ux f(Context context) {
        Ux ux;
        synchronized (Ux.class) {
            try {
                if (f28845v == null) {
                    f28845v = new Ux(context);
                }
                ux = f28845v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ux;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public void mo6a(Object obj) {
        switch (this.f28846n) {
            case 8:
                g7.m mVar = (g7.m) this.f28847u;
                mVar.getClass();
                InterfaceC4084vh interfaceC4084vh = ((C2740Pc) obj).f27625n;
                if (interfaceC4084vh == null || interfaceC4084vh.n0()) {
                    mVar.f37690c = 1;
                    break;
                }
                break;
            case 18:
                ((InterfaceC4249yk) obj).K((C2867Wl) this.f28847u);
                break;
            case 19:
                ((InterfaceC3603ml) obj).a((H9) this.f28847u);
                break;
            default:
                ((InterfaceC3950t8) obj).f((C3896s8) this.f28847u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.G0
    public long b(long j6) {
        ((W0) this.f28847u).getClass();
        String str = AbstractC3182eu.f30782a;
        return Math.max(0L, Math.min((j6 * r0.f29093e) / 1000000, r0.f29097j - 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2560Ej
    /* renamed from: c */
    public s2.A0 mo12c() {
        try {
            return ((InterfaceC2741Pd) ((C3500kq) this.f28847u).f32421b).g();
        } catch (RemoteException e9) {
            throw new C3290gu(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2498Ap
    public P3.a d(C2759Qe c2759Qe) {
        C4038up c4038up = (C4038up) ((C4297ze) this.f28847u).f36134v;
        String str = c2759Qe.f27820A;
        synchronized (c4038up.f34933u) {
            try {
                int i = c4038up.f35354A;
                if (i != 1 && i != 3) {
                    return QC.k(new C4254yp(2));
                }
                if (c4038up.f34934v) {
                    return c4038up.f34932n;
                }
                c4038up.f35354A = 3;
                c4038up.f34934v = true;
                c4038up.f35355z = str;
                c4038up.f34937y.o();
                C3490kg c3490kg = c4038up.f34932n;
                c3490kg.f32256n.a(new RunnableC3984tp(c4038up, 0), AbstractC3436jg.f32062h);
                return c3490kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.OC
    public /* synthetic */ void g(long j6, Cr cr) {
        switch (this.f28846n) {
            case 3:
                AbstractC3066cl.l(j6, cr, ((Q2) this.f28847u).f27716I);
                break;
            default:
                AbstractC3066cl.l(j6, cr, (InterfaceC3566m1[]) ((C4297ze) this.f28847u).f36134v);
                break;
        }
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        switch (this.f28846n) {
            case 10:
                try {
                    ((InterfaceC2639Jd) this.f28847u).a(c4741a.a());
                    break;
                } catch (RemoteException e9) {
                    x2.i.d("", e9);
                    return;
                }
            default:
                try {
                    ((InterfaceC2707Nd) this.f28847u).a(c4741a.a());
                    break;
                } catch (RemoteException e10) {
                    x2.i.d("", e10);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb
    public JSONObject i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.S
    public void j(float f2) {
        C3727p0 c3727p0 = ((C3457k0) this.f28847u).f32139b;
        if (c3727p0.f33781e == f2) {
            return;
        }
        c3727p0.f33781e = f2;
        c3727p0.b(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4312zt
    public /* synthetic */ C3438ji k(InterfaceC4258yt interfaceC4258yt) {
        return ((C3449jt) this.f28847u).b(interfaceC4258yt);
    }

    public AtomicReference l(String str) {
        synchronized (this) {
            try {
                HashMap hashMap = (HashMap) this.f28847u;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f28847u).get(str);
    }

    public void m(AbstractC3194f5 abstractC3194f5, com.bumptech.glide.manager.n nVar, RunnableC3996u0 runnableC3996u0) {
        synchronized (abstractC3194f5.f30833x) {
            abstractC3194f5.f30825B = true;
        }
        abstractC3194f5.a("post-response");
        ((L) this.f28847u).f26805u.post(new RunnableC3888s0(1, abstractC3194f5, nVar, runnableC3996u0));
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        C3490kg c3490kg;
        switch (this.f28846n) {
            case 7:
                String str = (String) obj;
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f28847u;
                new w2.u(interfaceC4084vh.getContext(), interfaceC4084vh.C().f41845n, str, interfaceC4084vh.J() != null ? interfaceC4084vh.J().f28434x0 : null).l();
                return;
            case 13:
                ((AtomicInteger) ((B1.b) this.f28847u).f257v).set(1);
                return;
            case 17:
                ((C3280gk) this.f28847u).f31386n.t();
                return;
            case 21:
                C3873rm c3873rm = (C3873rm) this.f28847u;
                C4089vm c4089vm = c3873rm.f34502m;
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) obj;
                synchronized (c4089vm) {
                    c4089vm.f35494k = interfaceC4084vh2;
                }
                C4089vm c4089vm2 = c3873rm.f34502m;
                synchronized (c4089vm2) {
                    c3490kg = c4089vm2.f35497n;
                }
                C3232fq e9 = c3873rm.e("Google", true);
                if (e9 != null && c3490kg != null) {
                    c3490kg.b(e9);
                    return;
                } else {
                    if (c3490kg != null) {
                        c3490kg.cancel(false);
                        return;
                    }
                    return;
                }
            case 22:
                InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) obj;
                C3490kg c3490kg2 = (C3490kg) this.f28847u;
                if (interfaceC4084vh3 == null) {
                    c3490kg2.c(new Zq(1, "Missing webview from video view future."));
                    return;
                } else {
                    interfaceC4084vh3.Z0("/video", new C2841Vb(7, new Qx(22, c3490kg2)));
                    interfaceC4084vh3.k0();
                    return;
                }
            case 24:
                ((C2650Jo) obj).f26507G = true;
                ((BinderC2918Zo) this.f28847u).f29736w.b();
                return;
            default:
                try {
                    ((Eu) this.f28847u).a((SQLiteDatabase) obj);
                    return;
                } catch (Exception e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    int i = w2.z.f41712b;
                    x2.i.c("Error executing function on offline signal database: ".concat(valueOf));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb, com.google.android.gms.internal.ads.At
    public JSONObject o() {
        return null;
    }

    public void r() {
        synchronized (Ux.class) {
            S0.e eVar = (S0.e) this.f28847u;
            eVar.R("vendor_scoped_gpid_v2_id");
            eVar.R("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2577Fj abstractC2577Fj) {
        C3387ik c3387ik;
        Br br = (Br) this.f28847u;
        C3547lj c3547lj = (C3547lj) abstractC2577Fj;
        synchronized (br) {
            try {
                C3547lj c3547lj2 = br.f24736B;
                if (c3547lj2 != null) {
                    C3387ik c3387ik2 = c3547lj.f25630j;
                    if (c3387ik2 != null && (c3387ik = c3547lj2.f25630j) != null) {
                        c3387ik2.a(c3387ik.f31884a.get());
                    }
                    C2578Fk c2578Fk = br.f24736B.f25624c;
                    c2578Fk.getClass();
                    c2578Fk.M1(new C3216fa(null, false));
                }
                br.f24736B = c3547lj;
                c3547lj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Object obj = this.f28847u;
        switch (this.f28846n) {
            case 7:
                C4906k.f40186C.f40196h.d("DefaultGmsgHandlers.attributionReportingManager", th);
                break;
            case 13:
                ((AtomicInteger) ((B1.b) obj).f257v).set(-1);
                break;
            case 17:
                break;
            case 21:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33118p6)).booleanValue()) {
                    C4906k.f40186C.f40196h.e("omid native display exp", th);
                    break;
                }
                break;
            case 22:
                int i = w2.z.f41712b;
                x2.i.c("Failed to load media data due to video view load failure.");
                ((C3490kg) obj).c(th);
                break;
            case 24:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i4 = w2.z.f41712b;
                x2.i.c("Failed to get offline signal database: ".concat(valueOf));
                break;
        }
    }

    public Ux() {
        this.f28846n = 6;
        this.f28847u = new HashMap();
    }

    public Ux(B1.b bVar) {
        this.f28846n = 13;
        Objects.requireNonNull(bVar);
        this.f28847u = bVar;
    }

    public Ux(S0.e eVar, Eu eu) {
        this.f28846n = 26;
        this.f28847u = eu;
        Objects.requireNonNull(eVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lg, com.google.android.gms.internal.ads.InterfaceC3431jb
    /* renamed from: c */
    public void mo0c() {
        switch (this.f28846n) {
            case 9:
                w2.z.k("Rejecting reference for JS Engine.");
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.C8)).booleanValue();
                C2858Wc c2858Wc = (C2858Wc) this.f28847u;
                if (booleanValue) {
                    c2858Wc.r("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    c2858Wc.q();
                    return;
                }
            case 23:
                C3873rm c3873rm = ((BinderC3713on) this.f28847u).f33729w;
                if (c3873rm != null) {
                    synchronized (c3873rm) {
                        c3873rm.f34503n.G("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                Br br = (Br) this.f28847u;
                synchronized (br) {
                    br.f24736B = null;
                }
                return;
        }
    }

    public Ux(Context context) {
        this.f28846n = 0;
        if (S0.e.f2906w == null) {
            S0.e.f2906w = new S0.e(context);
        }
        this.f28847u = S0.e.f2906w;
        Qx.f(context);
    }

    public Ux(Handler handler) {
        this.f28846n = 5;
        this.f28847u = new L(this, handler);
    }

    public Ux(C2874Xc c2874Xc, C2858Wc c2858Wc) {
        this.f28846n = 9;
        this.f28847u = c2858Wc;
        Objects.requireNonNull(c2874Xc);
    }

    public Ux(BinderC2809Td binderC2809Td, InterfaceC2639Jd interfaceC2639Jd) {
        this.f28846n = 10;
        this.f28847u = interfaceC2639Jd;
        Objects.requireNonNull(binderC2809Td);
    }

    public Ux(BinderC2809Td binderC2809Td, InterfaceC2707Nd interfaceC2707Nd) {
        this.f28846n = 11;
        this.f28847u = interfaceC2707Nd;
        Objects.requireNonNull(binderC2809Td);
    }

    public Ux(C3280gk c3280gk) {
        this.f28846n = 17;
        Objects.requireNonNull(c3280gk);
        this.f28847u = c3280gk;
    }

    public Ux(C3873rm c3873rm) {
        this.f28846n = 21;
        Objects.requireNonNull(c3873rm);
        this.f28847u = c3873rm;
    }

    public Ux(C3122dn c3122dn, C3490kg c3490kg) {
        this.f28846n = 22;
        this.f28847u = c3490kg;
        Objects.requireNonNull(c3122dn);
    }

    public Ux(BinderC3713on binderC3713on) {
        this.f28846n = 23;
        Objects.requireNonNull(binderC3713on);
        this.f28847u = binderC3713on;
    }

    public Ux(BinderC2918Zo binderC2918Zo) {
        this.f28846n = 24;
        Objects.requireNonNull(binderC2918Zo);
        this.f28847u = binderC2918Zo;
    }

    public Ux(Br br) {
        this.f28846n = 28;
        Objects.requireNonNull(br);
        this.f28847u = br;
    }

    private final void p(Throwable th) {
    }

    private final void q(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb
    public void e(MotionEvent motionEvent) {
    }
}
