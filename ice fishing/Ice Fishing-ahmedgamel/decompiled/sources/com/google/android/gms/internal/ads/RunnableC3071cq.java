package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.view.View;
import android.webkit.WebView;
import c3.AbstractC0549a;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3071cq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30378n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f30379u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f30380v;

    public /* synthetic */ RunnableC3071cq(int i, Object obj, Object obj2) {
        this.f30378n = i;
        this.f30379u = obj;
        this.f30380v = obj2;
    }

    private final void a() {
        boolean z6;
        PN pn = (PN) this.f30379u;
        C4108w4 c4108w4 = (C4108w4) this.f30380v;
        int i = pn.Y - c4108w4.f35565c;
        pn.Y = i;
        boolean z9 = true;
        if (c4108w4.f35566d) {
            pn.f27572Z = c4108w4.f35567e;
            pn.f27573i0 = true;
        }
        if (i == 0) {
            AbstractC3627n8 abstractC3627n8 = ((C3589mO) c4108w4.f35568f).f32728a;
            int i4 = -1;
            if (!pn.f27592y0.f32728a.g() && abstractC3627n8.g()) {
                pn.f27594z0 = -1;
                pn.f27548A0 = 0L;
            }
            if (!abstractC3627n8.g()) {
                List asList = Arrays.asList(((C3858rO) abstractC3627n8).f34356h);
                int size = asList.size();
                ArrayList arrayList = pn.f27557I;
                AbstractC2792Sd.H(size == arrayList.size());
                for (int i6 = 0; i6 < asList.size(); i6++) {
                    ((NN) arrayList.get(i6)).f27269b = (AbstractC3627n8) asList.get(i6);
                }
            }
            boolean z10 = pn.f27573i0;
            long j6 = com.anythink.basead.exoplayer.b.f7168b;
            if (z10) {
                boolean z11 = ((C3589mO) c4108w4.f35568f).f32728a.g() && pn.f27592y0.f32728a.g();
                boolean c9 = ((C3589mO) c4108w4.f35568f).f32729b.c(pn.f27592y0.f32729b);
                long j9 = ((C3589mO) c4108w4.f35568f).f32731d;
                long j10 = pn.f27592y0.f32744r;
                if (z11 || (c9 && j9 == j10)) {
                    z9 = false;
                }
                if (z9) {
                    i4 = pn.K1();
                    if (abstractC3627n8.g() || ((C3589mO) c4108w4.f35568f).f32729b.b()) {
                        j6 = ((C3589mO) c4108w4.f35568f).f32731d;
                    } else {
                        C3589mO c3589mO = (C3589mO) c4108w4.f35568f;
                        C3860rQ c3860rQ = c3589mO.f32729b;
                        long j11 = c3589mO.f32731d;
                        abstractC3627n8.o(c3860rQ.f34406a, pn.f27556H);
                        j6 = j11;
                    }
                }
                z6 = false;
            } else {
                z6 = false;
                z9 = false;
            }
            long j12 = j6;
            int i9 = i4;
            pn.f27573i0 = z6;
            pn.a2((C3589mO) c4108w4.f35568f, 1, z9, pn.f27572Z, j12, i9);
        }
    }

    private final void b() {
        S0.l lVar = (S0.l) this.f30379u;
        C4181xN c4181xN = (C4181xN) this.f30380v;
        lVar.getClass();
        synchronized (c4181xN) {
        }
        String str = AbstractC3182eu.f30782a;
        BO bo = ((HN) lVar.f2927v).f26036n.f27558K;
        bo.s(bo.v((C3860rQ) bo.f24669d.f28482x), 1013, new C4290zO(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03bf A[Catch: all -> 0x028b, TryCatch #8 {all -> 0x028b, blocks: (B:106:0x026c, B:108:0x0288, B:111:0x028e, B:113:0x0351, B:116:0x0356, B:117:0x035d, B:119:0x03bf, B:120:0x03cb, B:122:0x03db, B:124:0x03e3, B:126:0x03ef, B:127:0x03f9, B:128:0x041d), top: B:105:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03db A[Catch: all -> 0x028b, TryCatch #8 {all -> 0x028b, blocks: (B:106:0x026c, B:108:0x0288, B:111:0x028e, B:113:0x0351, B:116:0x0356, B:117:0x035d, B:119:0x03bf, B:120:0x03cb, B:122:0x03db, B:124:0x03e3, B:126:0x03ef, B:127:0x03f9, B:128:0x041d), top: B:105:0x026c }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String str;
        C2826Ud c2826Ud;
        Object c4114wA;
        IInterface iInterface;
        int i = 3;
        int i4 = 0;
        int i6 = 1;
        switch (this.f30378n) {
            case 0:
                Zv zv = (Zv) this.f30379u;
                Iterator it = zv.f29748d.values().iterator();
                while (it.hasNext()) {
                    ((Uv) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new C2838Up(zv, (Qx) this.f30380v, timer), 1000L);
                return;
            case 1:
                Xv xv = Xv.f29380n;
                Zv zv2 = (Zv) this.f30379u;
                Iterator it2 = zv2.f29748d.values().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    View view = (View) this.f30380v;
                    if (!hasNext) {
                        zv2.f29749e.a(view, xv);
                        return;
                    } else {
                        Uv uv = (Uv) it2.next();
                        if (!uv.f28838f) {
                            uv.f28834b.a(view, xv);
                        }
                    }
                }
            case 2:
                C4147wq c4147wq = (C4147wq) this.f30379u;
                c4147wq.getClass();
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f30380v;
                interfaceC4084vh.e1();
                BinderC2626Ih g9 = interfaceC4084vh.g();
                s2.Z0 z02 = c4147wq.f35668d.f30390a;
                if (z02 != null && g9 != null) {
                    g9.V3(z02);
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32887Q1)).booleanValue() || interfaceC4084vh.isAttachedToWindow()) {
                    return;
                }
                interfaceC4084vh.onPause();
                interfaceC4084vh.c1();
                return;
            case 3:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f30380v).registerReceiver(new Q0.d((C3663nr) this.f30379u), intentFilter);
                return;
            case 4:
                C3663nr c3663nr = (C3663nr) ((Q0.d) this.f30379u).f2464b;
                c3663nr.getClass();
                Context context = (Context) this.f30380v;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i = type != 9 ? 8 : 7;
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i != 5) {
                        c3663nr.c(i);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            throw null;
                        }
                        C2804Sp c2804Sp = new C2804Sp(c3663nr);
                        telephonyManager.registerTelephonyCallback(c3663nr.f33573a, c2804Sp);
                        telephonyManager.unregisterTelephonyCallback(c2804Sp);
                        return;
                    } catch (RuntimeException unused2) {
                        c3663nr.c(5);
                        return;
                    }
                }
                i = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                c3663nr.c(i);
                return;
            case 5:
                ((Hr) ((C3504ku) ((T8) ((C3887s) this.f30379u).f34558y).f28480v).f32447w).I((C4969z0) this.f30380v);
                return;
            case 6:
                ((C3449jt) ((C3887s) this.f30379u).f34558y).f32117d.I((C4969z0) this.f30380v);
                return;
            case 7:
                ((C3719ot) this.f30379u).f33751d.I((C4969z0) this.f30380v);
                return;
            case 8:
                ((Mt) ((C3887s) this.f30379u).f34558y).f27150d.I((C4969z0) this.f30380v);
                return;
            case 9:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f30380v;
                InputStream inputStream = (InputStream) this.f30379u;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            V2.b.d(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                } finally {
                }
            case 10:
                C3451jv c3451jv = (C3451jv) this.f30379u;
                c3451jv.getClass();
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f30380v;
                if (atomicBoolean.get()) {
                    new Thread(new RunnableC3071cq(12, (S0.c) c3451jv.f32126v, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 11:
                ((Lu) ((T8) this.f30379u).f28483y).f26982c.M1(new C4042ut(i6, (Iu) this.f30380v));
                return;
            case 12:
                S0.c cVar = (S0.c) this.f30379u;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f30380v;
                synchronized (cVar) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) cVar.f2903v) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 13:
                Wu wu = (Wu) this.f30379u;
                Uu uu = (Uu) this.f30380v;
                wu.getClass();
                synchronized (Wu.f29214E) {
                    try {
                        if (!wu.f29217B) {
                            wu.f29217B = true;
                            if (Wu.a()) {
                                try {
                                    w2.D d9 = C4906k.f40186C.f40191c;
                                    wu.f29221w = w2.D.M(wu.f29218n);
                                } catch (RemoteException | RuntimeException e9) {
                                    C4906k.f40186C.f40196h.d("CuiMonitor.gettingAppIdFromManifest", e9);
                                }
                                O2.f fVar = O2.f.f2270b;
                                Context context2 = wu.f29218n;
                                fVar.getClass();
                                wu.f29222x = O2.f.a(context2);
                                C3324ha c3324ha = AbstractC3592ma.U9;
                                s2.r rVar = s2.r.f40506e;
                                int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
                                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.pd)).booleanValue()) {
                                    long j6 = intValue;
                                    AbstractC3436jg.f32058d.scheduleWithFixedDelay(wu, j6, j6, TimeUnit.MILLISECONDS);
                                } else {
                                    long j9 = intValue;
                                    AbstractC3436jg.f32058d.scheduleAtFixedRate(wu, j9, j9, TimeUnit.MILLISECONDS);
                                }
                                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.aa)).booleanValue()) {
                                    wu.f29216A.a();
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (Wu.a() && uu != null) {
                    synchronized (Wu.f29213D) {
                        try {
                            Zu zu = wu.f29220v;
                            int A9 = ((C3076cv) zu.f28504u).A();
                            C3324ha c3324ha2 = AbstractC3592ma.V9;
                            s2.r rVar2 = s2.r.f40506e;
                            if (A9 >= ((Integer) rVar2.f40509c.a(c3324ha2)).intValue()) {
                                return;
                            }
                            Xu C8 = Yu.C();
                            int i9 = uu.f28830m;
                            C8.h();
                            ((Yu) C8.f28504u).Y(i9);
                            boolean z6 = uu.f28820b;
                            C8.h();
                            ((Yu) C8.f28504u).D(z6);
                            long j10 = uu.f28819a;
                            C8.h();
                            ((Yu) C8.f28504u).E(j10);
                            C8.h();
                            ((Yu) C8.f28504u).Z();
                            String str2 = wu.f29219u.f41845n;
                            C8.h();
                            ((Yu) C8.f28504u).G(str2);
                            String str3 = wu.f29221w;
                            C8.h();
                            ((Yu) C8.f28504u).H(str3);
                            String str4 = Build.VERSION.RELEASE;
                            C8.h();
                            ((Yu) C8.f28504u).I(str4);
                            int i10 = Build.VERSION.SDK_INT;
                            C8.h();
                            ((Yu) C8.f28504u).J(i10);
                            int i11 = uu.f28832o;
                            C8.h();
                            ((Yu) C8.f28504u).A(i11);
                            int i12 = uu.f28821c;
                            C8.h();
                            ((Yu) C8.f28504u).L(i12);
                            long j11 = wu.f29222x;
                            C8.h();
                            ((Yu) C8.f28504u).M(j11);
                            int i13 = uu.f28831n;
                            C8.h();
                            ((Yu) C8.f28504u).B(i13);
                            String str5 = uu.f28822d;
                            C8.h();
                            ((Yu) C8.f28504u).N(str5);
                            String str6 = uu.f28823e;
                            C8.h();
                            ((Yu) C8.f28504u).O(str6);
                            String str7 = uu.f28824f;
                            C8.h();
                            ((Yu) C8.f28504u).P(str7);
                            C2751Pn b9 = wu.f29223y.b(uu.f28824f);
                            if (b9 != null && (c2826Ud = b9.f27649b) != null) {
                                str = c2826Ud.toString();
                                C8.h();
                                ((Yu) C8.f28504u).Q(str);
                                String str8 = uu.f28825g;
                                C8.h();
                                ((Yu) C8.f28504u).R(str8);
                                int i14 = uu.f28826h;
                                C8.h();
                                ((Yu) C8.f28504u).V(i14);
                                String str9 = uu.f28828k;
                                C8.h();
                                ((Yu) C8.f28504u).U(str9);
                                String str10 = uu.i;
                                C8.h();
                                ((Yu) C8.f28504u).S(str10);
                                String str11 = uu.f28827j;
                                C8.h();
                                ((Yu) C8.f28504u).T(str11);
                                long j12 = uu.f28829l;
                                C8.h();
                                ((Yu) C8.f28504u).F(j12);
                                if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.Z9)).booleanValue()) {
                                    AbstractCollection abstractCollection = wu.f29224z;
                                    C8.h();
                                    ((Yu) C8.f28504u).K(abstractCollection);
                                }
                                if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.aa)).booleanValue()) {
                                    C2847Vh c2847Vh = wu.f29216A;
                                    WL wl = c2847Vh.f29020b;
                                    String str12 = c2847Vh.f29019a;
                                    if (wl != null) {
                                        C8.h();
                                        ((Yu) C8.f28504u).W(wl);
                                    }
                                    if (str12 != null) {
                                        C8.h();
                                        ((Yu) C8.f28504u).X(str12);
                                    }
                                }
                                C2969av A10 = C3023bv.A();
                                A10.h();
                                ((C3023bv) A10.f28504u).B((Yu) C8.j());
                                zu.h();
                                ((C3076cv) zu.f28504u).C((C3023bv) A10.j());
                                return;
                            }
                            str = "";
                            C8.h();
                            ((Yu) C8.f28504u).Q(str);
                            String str82 = uu.f28825g;
                            C8.h();
                            ((Yu) C8.f28504u).R(str82);
                            int i142 = uu.f28826h;
                            C8.h();
                            ((Yu) C8.f28504u).V(i142);
                            String str92 = uu.f28828k;
                            C8.h();
                            ((Yu) C8.f28504u).U(str92);
                            String str102 = uu.i;
                            C8.h();
                            ((Yu) C8.f28504u).S(str102);
                            String str112 = uu.f28827j;
                            C8.h();
                            ((Yu) C8.f28504u).T(str112);
                            long j122 = uu.f28829l;
                            C8.h();
                            ((Yu) C8.f28504u).F(j122);
                            if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.Z9)).booleanValue()) {
                            }
                            if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.aa)).booleanValue()) {
                            }
                            C2969av A102 = C3023bv.A();
                            A102.h();
                            ((C3023bv) A102.f28504u).B((Yu) C8.j());
                            zu.h();
                            ((C3076cv) zu.f28504u).C((C3023bv) A102.j());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 14:
                InterfaceC4963w0 interfaceC4963w0 = (InterfaceC4963w0) this.f30379u;
                Fv fv = (Fv) this.f30380v;
                s2.N n9 = fv.f25663h;
                if (n9 != null) {
                    try {
                        s2.V0 v02 = (s2.V0) fv.f25660e.get();
                        Parcel F02 = n9.F0();
                        AbstractC3411j8.c(F02, v02);
                        n9.d1(F02, 1);
                    } catch (RemoteException unused4) {
                        int i15 = w2.z.f41712b;
                        x2.i.f("Failed to call onAdsAvailable");
                    }
                }
                s2.P p9 = fv.i;
                if (p9 != null) {
                    try {
                        String str13 = fv.f25666l;
                        Parcel F03 = p9.F0();
                        F03.writeString(str13);
                        AbstractC3411j8.e(F03, interfaceC4963w0);
                        p9.d1(F03, 1);
                        return;
                    } catch (RemoteException unused5) {
                        int i16 = w2.z.f41712b;
                        x2.i.f("Failed to call onAdPreloaded");
                        return;
                    }
                }
                return;
            case 15:
                C4969z0 c4969z0 = (C4969z0) this.f30379u;
                Fv fv2 = (Fv) this.f30380v;
                s2.P p10 = fv2.i;
                if (p10 != null) {
                    try {
                        String str14 = fv2.f25666l;
                        Parcel F04 = p10.F0();
                        F04.writeString(str14);
                        AbstractC3411j8.c(F04, c4969z0);
                        p10.d1(F04, 3);
                        return;
                    } catch (RemoteException unused6) {
                        int i17 = w2.z.f41712b;
                        x2.i.f("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 16:
                V2.E((WebView) this.f30379u, (String) this.f30380v);
                return;
            case 17:
                ((l3.h) this.f30380v).b(C3131dx.a((Context) this.f30379u, "GLAS"));
                return;
            case 18:
                Lz lz = (Lz) this.f30379u;
                C3025bx c3025bx = lz.f26988a;
                Uw uw = (Uw) this.f30380v;
                if (!c3025bx.a(uw)) {
                    throw new B0.c(2);
                }
                lz.f26993f.set("2.904631200.".concat(String.valueOf(uw.f28840a.A())));
                return;
            case 19:
                IBinder iBinder = (IBinder) this.f30380v;
                int i18 = AbstractBinderC4168xA.f35743n;
                if (iBinder == null) {
                    c4114wA = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    c4114wA = queryLocalInterface instanceof InterfaceC4222yA ? (InterfaceC4222yA) queryLocalInterface : new C4114wA(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 1);
                }
                GA ga = (GA) this.f30379u;
                C2618Hq c2618Hq = ga.f25730n;
                c2618Hq.f26131C = c4114wA;
                ((C3956tE) c2618Hq.f26135w).a("linkToDeath", new Object[0]);
                try {
                    iInterface = (InterfaceC4222yA) c2618Hq.f26131C;
                } catch (RemoteException e10) {
                    ((C3956tE) ga.f25730n.f26135w).d(e10, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                ((AbstractC0549a) iInterface).f5722u.linkToDeath((HA) c2618Hq.f26129A, 0);
                C2618Hq c2618Hq2 = ga.f25730n;
                c2618Hq2.f26132n = false;
                synchronized (((ArrayList) c2618Hq2.f26137y)) {
                    try {
                        Iterator it3 = ((ArrayList) c2618Hq2.f26137y).iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                        ((ArrayList) c2618Hq2.f26137y).clear();
                    } finally {
                    }
                }
                return;
            case 20:
                ((AbstractC4063vD) this.f30379u).v((NB) this.f30380v);
                return;
            case 21:
                a();
                return;
            case 22:
                ((HO) this.f30379u).f26058w.reportNetworkEvent((NetworkEvent) this.f30380v);
                return;
            case 23:
                ((HO) this.f30379u).f26058w.reportPlaybackStateEvent((PlaybackStateEvent) this.f30380v);
                return;
            case 24:
                ((HO) this.f30379u).f26058w.reportTrackChangeEvent((TrackChangeEvent) this.f30380v);
                return;
            case 25:
                ((HO) this.f30379u).f26058w.reportPlaybackMetrics((PlaybackMetrics) this.f30380v);
                return;
            case 26:
                ((HO) this.f30379u).f26058w.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f30380v);
                return;
            case 27:
                S0.l lVar = (S0.l) this.f30379u;
                lVar.getClass();
                String str15 = AbstractC3182eu.f30782a;
                ((HN) lVar.f2927v).f26036n.f27570W.F((C4127wN) this.f30380v);
                return;
            case 28:
                b();
                return;
            default:
                ME me = (ME) this.f30379u;
                me.getClass();
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f30380v).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) me.f27063d).post(new RunnableC3214fP(i4, me, routedDevice));
                    return;
                }
                return;
        }
    }

    public RunnableC3071cq(V2 v22, WebView webView, String str) {
        this.f30378n = 16;
        this.f30379u = webView;
        this.f30380v = str;
        Objects.requireNonNull(v22);
    }

    public RunnableC3071cq(Fv fv, InterfaceC4963w0 interfaceC4963w0) {
        this.f30378n = 14;
        this.f30379u = interfaceC4963w0;
        Objects.requireNonNull(fv);
        this.f30380v = fv;
    }

    public RunnableC3071cq(Fv fv, C4969z0 c4969z0) {
        this.f30378n = 15;
        this.f30379u = c4969z0;
        Objects.requireNonNull(fv);
        this.f30380v = fv;
    }
}
