package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
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
import m2.C4741a;
import z2.InterfaceC5226c;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3680o7 implements S, OC, InterfaceC3678o5, Nw, InterfaceC0376b, InterfaceC3598mg, InterfaceC5226c, KD, InterfaceC3765pl, InterfaceC2728Oh, InterfaceC2498Ap, InterfaceC2883Xl, Ir {

    /* renamed from: v, reason: collision with root package name */
    public static final XJ f33647v = new XJ((byte) 0, 8);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33648n;

    /* renamed from: u, reason: collision with root package name */
    public Object f33649u;

    public /* synthetic */ C3680o7(int i) {
        this.f33648n = i;
    }

    public static C3680o7 k(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C3680o7 c3680o7 = new C3680o7(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new Q0.h(2, c3680o7));
                return c3680o7;
            } catch (RuntimeException unused) {
                synchronized (C3680o7.class) {
                    c3680o7.f33649u = null;
                }
            }
        }
        return c3680o7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public /* synthetic */ void C(String str, int i, String str2, boolean z6) {
        ((Z8) this.f33649u).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public /* synthetic */ void mo6a(Object obj) {
        switch (this.f33648n) {
            case 9:
                w2.z.k("Releasing engine reference.");
                ((C2858Wc) this.f33649u).f29157x.t();
                break;
            case 15:
                ((InterfaceC2697Mk) obj).y((AbstractC2577Fj) this.f33649u);
                break;
            case 16:
                ((InterfaceC3013bl) obj).i((C2759Qe) this.f33649u);
                break;
            case 17:
                ((InterfaceC3603ml) obj).x((H9) this.f33649u);
                break;
            default:
                ((InterfaceC3863rc) obj).B((C3114df) this.f33649u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void b(int i, long j6, String str) {
        ((Cw) this.f33649u).e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3678o5
    public File c() {
        return (File) this.f33649u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2498Ap
    public /* synthetic */ P3.a d(C2759Qe c2759Qe) {
        return ((BinderC2600Gp) ((InterfaceC3158eN) ((C4297ze) this.f33649u).f36135w).f()).W3(c2759Qe.f27820A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f33649u;
    }

    @Override // com.google.android.gms.internal.ads.OC
    public /* synthetic */ void g(long j6, Cr cr) {
        AbstractC3066cl.t(j6, cr, (InterfaceC3566m1[]) ((C3504ku) this.f33649u).f32446v);
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        try {
            ((InterfaceC2673Ld) this.f33649u).a(c4741a.a());
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void i(int i, long j6) {
        ((Cw) this.f33649u).b(i, System.currentTimeMillis() - j6);
    }

    @Override // com.google.android.gms.internal.ads.S
    public void j(float f2) {
        Z z6 = (Z) this.f33649u;
        C3727p0 c3727p0 = z6.f29580j1.f32139b;
        if (c3727p0.f33781e != f2) {
            c3727p0.f33781e = f2;
            c3727p0.b(false);
        }
        z6.j0(z6.f28255o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(int i) {
        C3717or c3717or;
        C3941t c3941t;
        C3070cp c3070cp = (C3070cp) this.f33649u;
        try {
            C3183ev A9 = C3237fv.A();
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            A9.h();
            ((C3237fv) A9.f28504u).I(i4);
            if (i == 0) {
                C3017bp c3017bp = c3070cp.f30373b;
                c3017bp.getClass();
                try {
                    c3941t = c3017bp.f30119b;
                } catch (RemoteException unused) {
                }
                if (c3941t != null && c3941t.a()) {
                    c3717or = c3941t.e();
                    if (c3717or != null) {
                        Bundle bundle = (Bundle) c3717or.f33740u;
                        long j6 = bundle.getLong("referrer_click_timestamp_seconds");
                        A9.h();
                        ((C3237fv) A9.f28504u).C(j6);
                        long j9 = bundle.getLong("install_begin_timestamp_seconds");
                        A9.h();
                        ((C3237fv) A9.f28504u).D(j9);
                        boolean z6 = bundle.getBoolean("google_play_instant");
                        A9.h();
                        ((C3237fv) A9.f28504u).E(z6);
                        long j10 = bundle.getLong("referrer_click_timestamp_server_seconds");
                        A9.h();
                        ((C3237fv) A9.f28504u).F(j10);
                        long j11 = bundle.getLong("install_begin_timestamp_server_seconds");
                        A9.h();
                        ((C3237fv) A9.f28504u).G(j11);
                        if (!TextUtils.isEmpty(bundle.getString("install_referrer"))) {
                            String string = bundle.getString("install_referrer");
                            A9.h();
                            ((C3237fv) A9.f28504u).B(string);
                        }
                        if (!TextUtils.isEmpty(bundle.getString("install_version"))) {
                            String string2 = bundle.getString("install_version");
                            A9.h();
                            ((C3237fv) A9.f28504u).H(string2);
                        }
                    }
                }
                c3717or = null;
                if (c3717or != null) {
                }
            }
            C3941t c3941t2 = c3070cp.f30373b.f30119b;
            c3941t2.f34963n = 3;
            if (((O4) c3941t2.f34967x) != null) {
                AbstractC3066cl.n("Unbinding from service.");
                ((Context) c3941t2.f34964u).unbindService((O4) c3941t2.f34967x);
                c3941t2.f34967x = null;
            }
            c3941t2.f34966w = null;
            C3230fo c3230fo = c3070cp.f30374c;
            String encodeToString = Base64.encodeToString(((C3237fv) A9.j()).b(), 1);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32882P5)).booleanValue()) {
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "irda");
                a9.M("irdd", encodeToString);
                a9.P();
            }
            c3070cp.f30375d.h();
        } catch (Exception e9) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32891Q5)).booleanValue()) {
                if (c3070cp.f30377f == null) {
                    c3070cp.f30377f = C2521Ce.c(c3070cp.f30372a);
                }
                c3070cp.f30377f.e("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e9);
            } else {
                if (c3070cp.f30376e == null) {
                    c3070cp.f30376e = C2521Ce.a(c3070cp.f30372a);
                }
                c3070cp.f30376e.e("InstallReferrer.onInstallReferrerSetupFinished", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo10n(Object obj) {
        switch (this.f33648n) {
            case 12:
                C4244yf.f35970l.remove((P3.a) this.f33649u);
                break;
            case 14:
                ((C2730Oj) this.f33649u).f27420f.s(true);
                break;
            case 21:
                ((InterfaceC4084vh) obj).d("sendMessageToNativeJs", (Map) this.f33649u);
                break;
            case 24:
                ((C4146wp) this.f33649u).f35664c.O((Yt) obj);
                break;
            default:
                try {
                    ((Eu) this.f33649u).a((SQLiteDatabase) obj);
                    break;
                } catch (Exception e9) {
                    String valueOf = String.valueOf(e9.getMessage());
                    int i = w2.z.f41712b;
                    x2.i.c("Error executing function on offline buffered ping database: ".concat(valueOf));
                }
        }
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
        T8 t82 = (T8) this.f33649u;
        synchronized (t82.f28480v) {
            t82.f28483y = null;
            t82.f28480v.notifyAll();
        }
    }

    public void p(long j6) {
        T8 t82 = new T8("creation");
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "nativeObjectNotCreated";
        q(t82);
    }

    public void q(T8 t82) {
        String a9 = t82.a();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(a9);
        int i = w2.z.f41712b;
        x2.i.e(concat);
        C3917sc c3917sc = (C3917sc) this.f33649u;
        Parcel F02 = c3917sc.F0();
        F02.writeString(a9);
        c3917sc.d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public /* synthetic */ void s(AbstractC2577Fj abstractC2577Fj) {
        Gr gr = (Gr) this.f33649u;
        C2732Ol c2732Ol = (C2732Ol) abstractC2577Fj;
        synchronized (gr) {
            gr.f25907C = c2732Ol;
            c2732Ol.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f33648n) {
            case 12:
                C4244yf.f35970l.remove((P3.a) this.f33649u);
                break;
            case 14:
                ((C2730Oj) this.f33649u).f27420f.s(false);
                break;
            case 21:
            case 24:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i = w2.z.f41712b;
                x2.i.c("Failed to get offline buffered ping database: ".concat(valueOf));
                break;
        }
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        T8 t82 = (T8) this.f33649u;
        synchronized (t82.f28480v) {
            try {
                W8 w82 = (W8) t82.f28481w;
                if (w82 != null) {
                    t82.f28483y = (Y8) w82.u();
                }
            } catch (DeadObjectException e9) {
                int i = w2.z.f41712b;
                x2.i.d("Unable to obtain a cache service instance.", e9);
                ((T8) this.f33649u).q();
            }
            ((T8) this.f33649u).f28480v.notifyAll();
        }
    }

    public /* synthetic */ C3680o7(int i, Object obj) {
        this.f33648n = i;
        this.f33649u = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.NP
    /* renamed from: c */
    public void mo11c() {
        Gr gr = (Gr) this.f33649u;
        synchronized (gr) {
            gr.f25907C = null;
        }
    }

    public C3680o7() {
        this.f33648n = 1;
        int i = BK.f24648a;
        this.f33649u = new C4042ut(8, new InterfaceC3748pL[]{V2.f28862B, f33647v});
    }

    public /* synthetic */ C3680o7(C3890s2 c3890s2) {
        this.f33648n = 3;
        Objects.requireNonNull(c3890s2);
        this.f33649u = c3890s2;
    }

    public C3680o7(C3732p5 c3732p5, File file) {
        this.f33648n = 6;
        this.f33649u = file;
        Objects.requireNonNull(c3732p5);
    }

    public C3680o7(T8 t82) {
        this.f33648n = 8;
        Objects.requireNonNull(t82);
        this.f33649u = t82;
    }

    public C3680o7(InterfaceC3647nb interfaceC3647nb) {
        this.f33648n = 11;
        this.f33649u = new ArrayList();
        try {
            interfaceC3647nb.c();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
        try {
            for (Object obj : interfaceC3647nb.f()) {
                InterfaceC3862rb U32 = obj instanceof IBinder ? BinderC3379ib.U3((IBinder) obj) : null;
                if (U32 != null) {
                    ((ArrayList) this.f33649u).add(new C3113de(U32));
                }
            }
        } catch (RemoteException e10) {
            x2.i.d("", e10);
        }
    }

    public C3680o7(C2858Wc c2858Wc) {
        this.f33648n = 9;
        Objects.requireNonNull(c2858Wc);
        this.f33649u = c2858Wc;
    }

    public C3680o7(BinderC2809Td binderC2809Td, InterfaceC2673Ld interfaceC2673Ld) {
        this.f33648n = 10;
        this.f33649u = interfaceC2673Ld;
        Objects.requireNonNull(binderC2809Td);
    }

    public C3680o7(C4244yf c4244yf, P3.a aVar) {
        this.f33648n = 12;
        this.f33649u = aVar;
        Objects.requireNonNull(c4244yf);
    }

    public C3680o7(C3332hi c3332hi, Context context, String str, s2.f1 f1Var) {
        this.f33648n = 13;
        C3374iN a9 = C3374iN.a(context);
        C3374iN a10 = C3374iN.a(f1Var);
        C3374iN a11 = C3374iN.a(str);
        C3266gN c3266gN = c3332hi.f31659o;
        C3266gN a12 = C3266gN.a(new C2962ao(c3266gN, 22));
        C3266gN a13 = C3266gN.a(new C3343ht(c3332hi.f31617O0, 1));
        this.f33649u = C3266gN.a(new C2548Do(a9, a10, a11, C3266gN.a(new Ht(a9, c3332hi.f31637c, c3332hi.f31612M, a12, a13, 0)), a12, a13, c3332hi.i, c3332hi.f31614N, c3266gN));
    }

    public C3680o7(C4036un c4036un, Map map) {
        this.f33648n = 21;
        this.f33649u = map;
        Objects.requireNonNull(c4036un);
    }

    public C3680o7(C3070cp c3070cp) {
        this.f33648n = 23;
        Objects.requireNonNull(c3070cp);
        this.f33649u = c3070cp;
    }

    public C3680o7(C4146wp c4146wp) {
        this.f33648n = 24;
        Objects.requireNonNull(c4146wp);
        this.f33649u = c4146wp;
    }

    public C3680o7(C2821Tp c2821Tp, Eu eu) {
        this.f33648n = 26;
        this.f33649u = eu;
        Objects.requireNonNull(c2821Tp);
    }

    public C3680o7(C4201xq c4201xq, St st) {
        this.f33648n = 28;
        this.f33649u = st;
    }

    public C3680o7(Gr gr) {
        this.f33648n = 29;
        Objects.requireNonNull(gr);
        this.f33649u = gr;
    }

    private final void m(Throwable th) {
    }

    private final void o(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
    }
}
