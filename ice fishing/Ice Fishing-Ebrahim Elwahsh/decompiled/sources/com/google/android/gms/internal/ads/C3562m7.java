package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.C4630a;
import w2.InterfaceC5155c;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3562m7 implements NC, InterfaceC3560m5, Ow, InterfaceC0365b, InterfaceC3426jg, InterfaceC5155c, LD, InterfaceC3701ol, InterfaceC2639Kh, InterfaceC2528Dp, InterfaceC2779Sl, Kr {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32667n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32668u;

    public /* synthetic */ C3562m7(int i) {
        this.f32667n = i;
    }

    public static C3562m7 g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C3562m7 c3562m7 = new C3562m7(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new Q0.h(2, c3562m7));
                return c3562m7;
            } catch (RuntimeException unused) {
                synchronized (C3562m7.class) {
                    c3562m7.f32668u = null;
                }
            }
        }
        return c3562m7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3560m5
    /* renamed from: a */
    public File mo8a() {
        return (File) this.f32668u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public /* synthetic */ void mo5b(Object obj) {
        switch (this.f32667n) {
            case 8:
                t2.C.k("Releasing engine reference.");
                ((C2753Rc) this.f32668u).f27384x.t();
                break;
            case 14:
                ((InterfaceC2642Kk) obj).K((AbstractC2539Ej) this.f32668u);
                break;
            case 15:
                ((InterfaceC2944al) obj).H((C2687Ne) this.f32668u);
                break;
            case 16:
                ((InterfaceC3539ll) obj).t((E9) this.f32668u);
                break;
            default:
                ((InterfaceC3530lc) obj).F((C2938af) this.f32668u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2528Dp
    public /* synthetic */ J3.a c(C2687Ne c2687Ne) {
        return ((BinderC2630Jp) ((InterfaceC3901sN) ((C4017ue) this.f32668u).f34632w).d()).I3(c2687Ne.f26573A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f32668u;
    }

    @Override // com.google.android.gms.internal.ads.NC
    public /* synthetic */ void e(long j9, Lr lr) {
        AbstractC3035cL.t(j9, lr, (InterfaceC3448k1[]) ((C3602mu) this.f32668u).f32775v);
    }

    @Override // w2.InterfaceC5155c
    public void f(C4630a c4630a) {
        try {
            ((InterfaceC2601Id) this.f32668u).a(c4630a.a());
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public void i(int i, long j9, String str) {
        ((Dw) this.f32668u).e(i, System.currentTimeMillis() - j9, null, null, str);
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        Q8 q82 = (Q8) this.f32668u;
        synchronized (q82.f27121v) {
            try {
                T8 t82 = (T8) q82.f27122w;
                if (t82 != null) {
                    q82.f27124y = (V8) t82.u();
                }
            } catch (DeadObjectException e6) {
                int i = t2.C.f40822b;
                u2.i.d("Unable to obtain a cache service instance.", e6);
                ((Q8) this.f32668u).p();
            }
            ((Q8) this.f32668u).f27121v.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public /* synthetic */ void k(String str, int i, String str2, boolean z8) {
        ((W8) this.f32668u).d();
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public /* synthetic */ void mo7l(Object obj) {
        switch (this.f32667n) {
            case 11:
                C4072vf.f34819l.remove((J3.a) this.f32668u);
                break;
            case 13:
                ((C2709Oj) this.f32668u).f26742f.u(true);
                break;
            case 20:
                ((InterfaceC3858rh) obj).a("sendMessageToNativeJs", (Map) this.f32668u);
                break;
            case 23:
                ((C4298zp) this.f32668u).f35614c.D((C2953au) obj);
                break;
            default:
                try {
                    ((Gu) this.f32668u).b((SQLiteDatabase) obj);
                    break;
                } catch (Exception e6) {
                    String valueOf = String.valueOf(e6.getMessage());
                    int i = t2.C.f40822b;
                    u2.i.c("Error executing function on offline buffered ping database: ".concat(valueOf));
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i) {
        C3761pr c3761pr;
        C3877s c3877s;
        C3166ep c3166ep = (C3166ep) this.f32668u;
        try {
            C3335hv A8 = C3387iv.A();
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            A8.h();
            ((C3387iv) A8.f30000u).I(i4);
            if (i == 0) {
                C3111dp c3111dp = c3166ep.f30510b;
                c3111dp.getClass();
                try {
                    c3877s = c3111dp.f30231b;
                } catch (RemoteException unused) {
                }
                if (c3877s != null && c3877s.a()) {
                    c3761pr = c3877s.e();
                    if (c3761pr != null) {
                        Bundle bundle = (Bundle) c3761pr.f33523u;
                        long j9 = bundle.getLong("referrer_click_timestamp_seconds");
                        A8.h();
                        ((C3387iv) A8.f30000u).C(j9);
                        long j10 = bundle.getLong("install_begin_timestamp_seconds");
                        A8.h();
                        ((C3387iv) A8.f30000u).D(j10);
                        boolean z8 = bundle.getBoolean("google_play_instant");
                        A8.h();
                        ((C3387iv) A8.f30000u).E(z8);
                        long j11 = bundle.getLong("referrer_click_timestamp_server_seconds");
                        A8.h();
                        ((C3387iv) A8.f30000u).F(j11);
                        long j12 = bundle.getLong("install_begin_timestamp_server_seconds");
                        A8.h();
                        ((C3387iv) A8.f30000u).G(j12);
                        if (!TextUtils.isEmpty(bundle.getString("install_referrer"))) {
                            String string = bundle.getString("install_referrer");
                            A8.h();
                            ((C3387iv) A8.f30000u).B(string);
                        }
                        if (!TextUtils.isEmpty(bundle.getString("install_version"))) {
                            String string2 = bundle.getString("install_version");
                            A8.h();
                            ((C3387iv) A8.f30000u).H(string2);
                        }
                    }
                }
                c3761pr = null;
                if (c3761pr != null) {
                }
            }
            C3877s c3877s2 = c3166ep.f30510b.f30231b;
            c3877s2.f34149n = 3;
            if (((M4) c3877s2.f34153x) != null) {
                AbstractC3035cL.m("Unbinding from service.");
                ((Context) c3877s2.f34150u).unbindService((M4) c3877s2.f34153x);
                c3877s2.f34153x = null;
            }
            c3877s2.f34152w = null;
            C3165eo c3165eo = c3166ep.f30511c;
            String encodeToString = Base64.encodeToString(((C3387iv) A8.j()).b(), 1);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31523P5)).booleanValue()) {
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "irda");
                a9.r("irdd", encodeToString);
                a9.v();
            }
            c3166ep.f30512d.h();
        } catch (Exception e6) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31531Q5)).booleanValue()) {
                if (c3166ep.f30514f == null) {
                    c3166ep.f30514f = C4287ze.c(c3166ep.f30509a);
                }
                c3166ep.f30514f.e("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e6);
            } else {
                if (c3166ep.f30513e == null) {
                    c3166ep.f30513e = C4287ze.a(c3166ep.f30509a);
                }
                c3166ep.f30513e.e("InstallReferrer.onInstallReferrerSetupFinished", e6);
            }
        }
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
        Q8 q82 = (Q8) this.f32668u;
        synchronized (q82.f27121v) {
            q82.f27124y = null;
            q82.f27121v.notifyAll();
        }
    }

    public void p(long j9) {
        Q8 q82 = new Q8("creation");
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "nativeObjectNotCreated";
        s(q82);
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f32667n) {
            case 11:
                C4072vf.f34819l.remove((J3.a) this.f32668u);
                break;
            case 13:
                ((C2709Oj) this.f32668u).f26742f.u(false);
                break;
            case 20:
            case 23:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i = t2.C.f40822b;
                u2.i.c("Failed to get offline buffered ping database: ".concat(valueOf));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public void r(int i, long j9) {
        ((Dw) this.f32668u).b(i, System.currentTimeMillis() - j9);
    }

    public void s(Q8 q82) {
        String a9 = q82.a();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(a9);
        int i = t2.C.f40822b;
        u2.i.e(concat);
        C3584mc c3584mc = (C3584mc) this.f32668u;
        Parcel A02 = c3584mc.A0();
        A02.writeString(a9);
        c3584mc.G0(A02, 1);
    }

    @Override // com.google.android.gms.internal.ads.Kr
    public void u(AbstractC2539Ej abstractC2539Ej) {
        switch (this.f32667n) {
            case 28:
                Ir ir = (Ir) this.f32668u;
                C2660Ll c2660Ll = (C2660Ll) abstractC2539Ej;
                synchronized (ir) {
                    ir.f25634C = c2660Ll;
                    c2660Ll.a();
                }
                return;
            default:
                C3215fj c3215fj = (C3215fj) abstractC2539Ej;
                BinderC3655nt binderC3655nt = (BinderC3655nt) this.f32668u;
                synchronized (binderC3655nt) {
                    try {
                        C3215fj c3215fj2 = binderC3655nt.f33056D;
                        if (c3215fj2 != null) {
                            c3215fj2.d();
                        }
                        binderC3655nt.f33056D = c3215fj;
                        InterfaceC3858rh interfaceC3858rh = c3215fj.f30843l;
                        if (interfaceC3858rh != null) {
                            interfaceC3858rh.k0(binderC3655nt);
                        }
                        binderC3655nt.f33062y.c(new BinderC3269gj(c3215fj, binderC3655nt, binderC3655nt.f33062y, binderC3655nt.f33053A));
                        c3215fj.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ C3562m7(int i, Object obj) {
        this.f32667n = i;
        this.f32668u = obj;
    }

    @Override // com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        switch (this.f32667n) {
            case 28:
                Ir ir = (Ir) this.f32668u;
                synchronized (ir) {
                    ir.f25634C = null;
                }
                return;
            default:
                BinderC3655nt binderC3655nt = (BinderC3655nt) this.f32668u;
                synchronized (binderC3655nt) {
                    binderC3655nt.f33056D = null;
                }
                return;
        }
    }

    public C3562m7() {
        this.f32667n = 1;
        this.f32668u = new CopyOnWriteArrayList();
    }

    public /* synthetic */ C3562m7(C3773q2 c3773q2) {
        this.f32667n = 2;
        Objects.requireNonNull(c3773q2);
        this.f32668u = c3773q2;
    }

    public C3562m7(C3614n5 c3614n5, File file) {
        this.f32667n = 5;
        this.f32668u = file;
        Objects.requireNonNull(c3614n5);
    }

    public C3562m7(Q8 q82) {
        this.f32667n = 7;
        Objects.requireNonNull(q82);
        this.f32668u = q82;
    }

    public C3562m7(InterfaceC3421jb interfaceC3421jb) {
        this.f32667n = 10;
        this.f32668u = new ArrayList();
        try {
            interfaceC3421jb.d();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        try {
            for (Object obj : interfaceC3421jb.i()) {
                InterfaceC3637nb G32 = obj instanceof IBinder ? BinderC3098db.G3((IBinder) obj) : null;
                if (G32 != null) {
                    ((ArrayList) this.f32668u).add(new C2937ae(G32));
                }
            }
        } catch (RemoteException e9) {
            u2.i.d("", e9);
        }
    }

    public C3562m7(C2753Rc c2753Rc) {
        this.f32667n = 8;
        Objects.requireNonNull(c2753Rc);
        this.f32668u = c2753Rc;
    }

    public C3562m7(BinderC2737Qd binderC2737Qd, InterfaceC2601Id interfaceC2601Id) {
        this.f32667n = 9;
        this.f32668u = interfaceC2601Id;
        Objects.requireNonNull(binderC2737Qd);
    }

    public C3562m7(C4072vf c4072vf, J3.a aVar) {
        this.f32667n = 11;
        this.f32668u = aVar;
        Objects.requireNonNull(c4072vf);
    }

    public C3562m7(C3214fi c3214fi, Context context, String str, q2.g1 g1Var) {
        this.f32667n = 12;
        C4117wN a9 = C4117wN.a(context);
        C4117wN a10 = C4117wN.a(g1Var);
        C4117wN a11 = C4117wN.a(str);
        C4009uN c4009uN = c3214fi.f30819o;
        C4009uN a12 = C4009uN.a(new C3220fo(c4009uN, 21));
        C4009uN a13 = C4009uN.a(new Kt(c3214fi.f30776N0, 0));
        this.f32668u = C4009uN.a(new C4080vn(a9, a10, a11, C4009uN.a(new Ht(a9, c3214fi.f30797c, c3214fi.f30773M, a12, a13, 0)), a12, a13, c3214fi.i, c3214fi.f30775N, c4009uN));
    }

    public C3562m7(C4026un c4026un, Map map) {
        this.f32667n = 20;
        this.f32668u = map;
        Objects.requireNonNull(c4026un);
    }

    public C3562m7(C3166ep c3166ep) {
        this.f32667n = 22;
        Objects.requireNonNull(c3166ep);
        this.f32668u = c3166ep;
    }

    public C3562m7(C4298zp c4298zp) {
        this.f32667n = 23;
        Objects.requireNonNull(c4298zp);
        this.f32668u = c4298zp;
    }

    public C3562m7(C2834Vp c2834Vp, Gu gu) {
        this.f32667n = 25;
        this.f32668u = gu;
        Objects.requireNonNull(c2834Vp);
    }

    public C3562m7(C2478Aq c2478Aq, Ut ut) {
        this.f32667n = 27;
        this.f32668u = ut;
    }

    public C3562m7(Ir ir) {
        this.f32667n = 28;
        Objects.requireNonNull(ir);
        this.f32668u = ir;
    }

    public C3562m7(BinderC3655nt binderC3655nt) {
        this.f32667n = 29;
        Objects.requireNonNull(binderC3655nt);
        this.f32668u = binderC3655nt;
    }

    private final void n(Throwable th) {
    }

    private final void o(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public void h(boolean z8, Context context, C4293zk c4293zk) {
    }
}
