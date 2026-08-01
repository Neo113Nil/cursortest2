package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
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
import k2.C4631a;
import x2.InterfaceC5189c;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3657o7 implements S, OC, InterfaceC3655o5, Nw, InterfaceC0372b, InterfaceC3575mg, InterfaceC5189c, KD, InterfaceC3742pl, InterfaceC2708Oh, InterfaceC2478Ap, InterfaceC2844Wl, Ir {

    /* renamed from: v, reason: collision with root package name */
    public static final XJ f32860v = new XJ((byte) 0, 8);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32861n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32862u;

    public /* synthetic */ C3657o7(int i) {
        this.f32861n = i;
    }

    public static C3657o7 b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C3657o7 c3657o7 = new C3657o7(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new Q0.h(2, c3657o7));
                return c3657o7;
            } catch (RuntimeException unused) {
                synchronized (C3657o7.class) {
                    c3657o7.f32862u = null;
                }
            }
        }
        return c3657o7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        switch (this.f32861n) {
            case 9:
                u2.z.k("Releasing engine reference.");
                ((C2835Wc) this.f32862u).f28358x.t();
                break;
            case 15:
                ((InterfaceC2677Mk) obj).A((AbstractC2557Fj) this.f32862u);
                break;
            case 16:
                ((InterfaceC2990bl) obj).i((C2739Qe) this.f32862u);
                break;
            case 17:
                ((InterfaceC3580ml) obj).y((H9) this.f32862u);
                break;
            default:
                ((InterfaceC3840rc) obj).D((C3091df) this.f32862u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3655o5
    public File c() {
        return (File) this.f32862u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2478Ap
    public /* synthetic */ N3.a d(C2739Qe c2739Qe) {
        return ((BinderC2580Gp) ((InterfaceC3135eN) ((C4274ze) this.f32862u).f35362w).f()).W3(c2739Qe.f27035A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f32862u;
    }

    @Override // com.google.android.gms.internal.ads.OC
    public /* synthetic */ void g(long j6, Cr cr) {
        AbstractC3043cl.t(j6, cr, (InterfaceC3543m1[]) ((C3481ku) this.f32862u).f31664v);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(int i) {
        C3694or c3694or;
        C3918t c3918t;
        C3047cp c3047cp = (C3047cp) this.f32862u;
        try {
            C3160ev A9 = C3214fv.A();
            int i6 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            A9.h();
            ((C3214fv) A9.f27721u).I(i6);
            if (i == 0) {
                C2994bp c2994bp = c3047cp.f29603b;
                c2994bp.getClass();
                try {
                    c3918t = c2994bp.f29331b;
                } catch (RemoteException unused) {
                }
                if (c3918t != null && c3918t.a()) {
                    c3694or = c3918t.e();
                    if (c3694or != null) {
                        Bundle bundle = (Bundle) c3694or.f32954u;
                        long j6 = bundle.getLong("referrer_click_timestamp_seconds");
                        A9.h();
                        ((C3214fv) A9.f27721u).C(j6);
                        long j9 = bundle.getLong("install_begin_timestamp_seconds");
                        A9.h();
                        ((C3214fv) A9.f27721u).D(j9);
                        boolean z3 = bundle.getBoolean("google_play_instant");
                        A9.h();
                        ((C3214fv) A9.f27721u).E(z3);
                        long j10 = bundle.getLong("referrer_click_timestamp_server_seconds");
                        A9.h();
                        ((C3214fv) A9.f27721u).F(j10);
                        long j11 = bundle.getLong("install_begin_timestamp_server_seconds");
                        A9.h();
                        ((C3214fv) A9.f27721u).G(j11);
                        if (!TextUtils.isEmpty(bundle.getString("install_referrer"))) {
                            String string = bundle.getString("install_referrer");
                            A9.h();
                            ((C3214fv) A9.f27721u).B(string);
                        }
                        if (!TextUtils.isEmpty(bundle.getString("install_version"))) {
                            String string2 = bundle.getString("install_version");
                            A9.h();
                            ((C3214fv) A9.f27721u).H(string2);
                        }
                    }
                }
                c3694or = null;
                if (c3694or != null) {
                }
            }
            C3918t c3918t2 = c3047cp.f29603b.f29331b;
            c3918t2.f34177n = 3;
            if (((O4) c3918t2.f34181x) != null) {
                AbstractC3043cl.n("Unbinding from service.");
                ((Context) c3918t2.f34178u).unbindService((O4) c3918t2.f34181x);
                c3918t2.f34181x = null;
            }
            c3918t2.f34180w = null;
            C3153eo c3153eo = c3047cp.f29604c;
            String encodeToString = Base64.encodeToString(((C3214fv) A9.j()).b(), 1);
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32102P5)).booleanValue()) {
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "irda");
                a9.v("irdd", encodeToString);
                a9.B();
            }
            c3047cp.f29605d.h();
        } catch (Exception e9) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32111Q5)).booleanValue()) {
                if (c3047cp.f29607f == null) {
                    c3047cp.f29607f = C2501Ce.c(c3047cp.f29602a);
                }
                c3047cp.f29607f.e("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e9);
            } else {
                if (c3047cp.f29606e == null) {
                    c3047cp.f29606e = C2501Ce.a(c3047cp.f29602a);
                }
                c3047cp.f29606e.e("InstallReferrer.onInstallReferrerSetupFinished", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void i(int i, long j6, String str) {
        ((Cw) this.f32862u).e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.S
    public void j(float f3) {
        Z z3 = (Z) this.f32862u;
        C3704p0 c3704p0 = z3.f28804o1.f31360b;
        if (c3704p0.f32991e != f3) {
            c3704p0.f32991e = f3;
            c3704p0.b(false);
        }
        z3.j0(z3.f27271t0);
    }

    public void m(long j6) {
        T8 t82 = new T8("creation");
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "nativeObjectNotCreated";
        p(t82);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo11n(Object obj) {
        switch (this.f32861n) {
            case 12:
                C4221yf.f35180l.remove((N3.a) this.f32862u);
                break;
            case 14:
                ((C2710Oj) this.f32862u).f26644f.s(true);
                break;
            case 21:
                ((InterfaceC4061vh) obj).d("sendMessageToNativeJs", (Map) this.f32862u);
                break;
            case 24:
                ((C4123wp) this.f32862u).f34883c.O((Yt) obj);
                break;
            default:
                try {
                    ((Eu) this.f32862u).a((SQLiteDatabase) obj);
                    break;
                } catch (Exception e9) {
                    String valueOf = String.valueOf(e9.getMessage());
                    int i = u2.z.f41322b;
                    v2.i.c("Error executing function on offline buffered ping database: ".concat(valueOf));
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void o(int i, long j6) {
        ((Cw) this.f32862u).b(i, System.currentTimeMillis() - j6);
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
        T8 t82 = (T8) this.f32862u;
        synchronized (t82.f27697v) {
            t82.f27700y = null;
            t82.f27697v.notifyAll();
        }
    }

    public void p(T8 t82) {
        String a9 = t82.a();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(a9);
        int i = u2.z.f41322b;
        v2.i.e(concat);
        C3894sc c3894sc = (C3894sc) this.f32862u;
        Parcel H02 = c3894sc.H0();
        H02.writeString(a9);
        c3894sc.f1(H02, 1);
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        T8 t82 = (T8) this.f32862u;
        synchronized (t82.f27697v) {
            try {
                W8 w82 = (W8) t82.f27698w;
                if (w82 != null) {
                    t82.f27700y = (Y8) w82.u();
                }
            } catch (DeadObjectException e9) {
                int i = u2.z.f41322b;
                v2.i.d("Unable to obtain a cache service instance.", e9);
                ((T8) this.f32862u).q();
            }
            ((T8) this.f32862u).f27697v.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public /* synthetic */ void s(AbstractC2557Fj abstractC2557Fj) {
        Gr gr = (Gr) this.f32862u;
        C2695Nl c2695Nl = (C2695Nl) abstractC2557Fj;
        synchronized (gr) {
            gr.f25135C = c2695Nl;
            c2695Nl.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f32861n) {
            case 12:
                C4221yf.f35180l.remove((N3.a) this.f32862u);
                break;
            case 14:
                ((C2710Oj) this.f32862u).f26644f.s(false);
                break;
            case 21:
            case 24:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i = u2.z.f41322b;
                v2.i.c("Failed to get offline buffered ping database: ".concat(valueOf));
                break;
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        try {
            ((InterfaceC2653Ld) this.f32862u).a(c4631a.a());
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public /* synthetic */ void z(String str, int i, String str2, boolean z3) {
        ((Z8) this.f32862u).d();
    }

    public /* synthetic */ C3657o7(int i, Object obj) {
        this.f32861n = i;
        this.f32862u = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.MP
    /* renamed from: c */
    public void mo12c() {
        Gr gr = (Gr) this.f32862u;
        synchronized (gr) {
            gr.f25135C = null;
        }
    }

    public C3657o7() {
        this.f32861n = 1;
        int i = BK.f23877a;
        this.f32862u = new C4019ut(8, new InterfaceC3725pL[]{V2.f28065B, f32860v});
    }

    public /* synthetic */ C3657o7(C3867s2 c3867s2) {
        this.f32861n = 3;
        Objects.requireNonNull(c3867s2);
        this.f32862u = c3867s2;
    }

    public C3657o7(C3709p5 c3709p5, File file) {
        this.f32861n = 6;
        this.f32862u = file;
        Objects.requireNonNull(c3709p5);
    }

    public C3657o7(T8 t82) {
        this.f32861n = 8;
        Objects.requireNonNull(t82);
        this.f32862u = t82;
    }

    public C3657o7(InterfaceC3624nb interfaceC3624nb) {
        this.f32861n = 11;
        this.f32862u = new ArrayList();
        try {
            interfaceC3624nb.c();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
        try {
            for (Object obj : interfaceC3624nb.f()) {
                InterfaceC3839rb U3 = obj instanceof IBinder ? BinderC3356ib.U3((IBinder) obj) : null;
                if (U3 != null) {
                    ((ArrayList) this.f32862u).add(new C3090de(U3));
                }
            }
        } catch (RemoteException e10) {
            v2.i.d("", e10);
        }
    }

    public C3657o7(C2835Wc c2835Wc) {
        this.f32861n = 9;
        Objects.requireNonNull(c2835Wc);
        this.f32862u = c2835Wc;
    }

    public C3657o7(BinderC2788Td binderC2788Td, InterfaceC2653Ld interfaceC2653Ld) {
        this.f32861n = 10;
        this.f32862u = interfaceC2653Ld;
        Objects.requireNonNull(binderC2788Td);
    }

    public C3657o7(C4221yf c4221yf, N3.a aVar) {
        this.f32861n = 12;
        this.f32862u = aVar;
        Objects.requireNonNull(c4221yf);
    }

    public C3657o7(C3309hi c3309hi, Context context, String str, q2.f1 f1Var) {
        this.f32861n = 13;
        C3351iN a9 = C3351iN.a(context);
        C3351iN a10 = C3351iN.a(f1Var);
        C3351iN a11 = C3351iN.a(str);
        C3243gN c3243gN = c3309hi.f30898o;
        C3243gN a12 = C3243gN.a(new C2894Zn(c3243gN, 22));
        C3243gN a13 = C3243gN.a(new C3320ht(c3309hi.f30856O0, 1));
        this.f32862u = C3243gN.a(new C2511Co(a9, a10, a11, C3243gN.a(new Ht(a9, c3309hi.f30876c, c3309hi.f30851M, a12, a13, 0)), a12, a13, c3309hi.i, c3309hi.f30853N, c3243gN));
    }

    public C3657o7(C3959tn c3959tn, Map map) {
        this.f32861n = 21;
        this.f32862u = map;
        Objects.requireNonNull(c3959tn);
    }

    public C3657o7(C3047cp c3047cp) {
        this.f32861n = 23;
        Objects.requireNonNull(c3047cp);
        this.f32862u = c3047cp;
    }

    public C3657o7(C4123wp c4123wp) {
        this.f32861n = 24;
        Objects.requireNonNull(c4123wp);
        this.f32862u = c4123wp;
    }

    public C3657o7(C2800Tp c2800Tp, Eu eu) {
        this.f32861n = 26;
        this.f32862u = eu;
        Objects.requireNonNull(c2800Tp);
    }

    public C3657o7(C4178xq c4178xq, St st) {
        this.f32861n = 28;
        this.f32862u = st;
    }

    public C3657o7(Gr gr) {
        this.f32861n = 29;
        Objects.requireNonNull(gr);
        this.f32862u = gr;
    }

    private final void k(Throwable th) {
    }

    private final void l(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
    }
}
