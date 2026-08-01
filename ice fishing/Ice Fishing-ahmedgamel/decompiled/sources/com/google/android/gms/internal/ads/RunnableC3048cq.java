package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
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
import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3048cq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29608n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29609u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29610v;

    public /* synthetic */ RunnableC3048cq(int i, Object obj, Object obj2) {
        this.f29608n = i;
        this.f29609u = obj;
        this.f29610v = obj2;
    }

    private final void a() {
        boolean z3;
        PN pn = (PN) this.f29609u;
        C4085w4 c4085w4 = (C4085w4) this.f29610v;
        int i = pn.Y - c4085w4.f34796c;
        pn.Y = i;
        boolean z6 = true;
        if (c4085w4.f34797d) {
            pn.f26794Z = c4085w4.f34798e;
            pn.f26795n0 = true;
        }
        if (i == 0) {
            AbstractC3604n8 abstractC3604n8 = ((C3566mO) c4085w4.f34799f).f31948a;
            int i6 = -1;
            if (!pn.f26771D0.f31948a.g() && abstractC3604n8.g()) {
                pn.f26773E0 = -1;
                pn.f26775F0 = 0L;
            }
            if (!abstractC3604n8.g()) {
                List asList = Arrays.asList(((C3835rO) abstractC3604n8).f33588h);
                int size = asList.size();
                ArrayList arrayList = pn.f26779I;
                AbstractC2772Sd.H(size == arrayList.size());
                for (int i9 = 0; i9 < asList.size(); i9++) {
                    ((NN) arrayList.get(i9)).f26485b = (AbstractC3604n8) asList.get(i9);
                }
            }
            boolean z9 = pn.f26795n0;
            long j6 = com.anythink.basead.exoplayer.b.f6382b;
            if (z9) {
                boolean z10 = ((C3566mO) c4085w4.f34799f).f31948a.g() && pn.f26771D0.f31948a.g();
                boolean c9 = ((C3566mO) c4085w4.f34799f).f31949b.c(pn.f26771D0.f31949b);
                long j9 = ((C3566mO) c4085w4.f34799f).f31951d;
                long j10 = pn.f26771D0.f31964r;
                if (z10 || (c9 && j9 == j10)) {
                    z6 = false;
                }
                if (z6) {
                    i6 = pn.J1();
                    if (abstractC3604n8.g() || ((C3566mO) c4085w4.f34799f).f31949b.b()) {
                        j6 = ((C3566mO) c4085w4.f34799f).f31951d;
                    } else {
                        C3566mO c3566mO = (C3566mO) c4085w4.f34799f;
                        C3676oQ c3676oQ = c3566mO.f31949b;
                        long j11 = c3566mO.f31951d;
                        abstractC3604n8.o(c3676oQ.f32905a, pn.f26778H);
                        j6 = j11;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
                z6 = false;
            }
            long j12 = j6;
            int i10 = i6;
            pn.f26795n0 = z3;
            pn.a2((C3566mO) c4085w4.f34799f, 1, z6, pn.f26794Z, j12, i10);
        }
    }

    private final void b() {
        S0.l lVar = (S0.l) this.f29609u;
        C4158xN c4158xN = (C4158xN) this.f29610v;
        lVar.getClass();
        synchronized (c4158xN) {
        }
        String str = AbstractC3159eu.f29993a;
        BO bo = ((HN) lVar.f2798v).f25264n.f26780K;
        bo.s(bo.v((C3676oQ) bo.f23898d.f27699x), 1013, new C4267zO(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03be A[Catch: all -> 0x028a, TryCatch #9 {all -> 0x028a, blocks: (B:106:0x026b, B:108:0x0287, B:111:0x028d, B:113:0x0350, B:116:0x0355, B:117:0x035c, B:119:0x03be, B:120:0x03ca, B:122:0x03da, B:124:0x03e2, B:126:0x03ee, B:127:0x03f8, B:128:0x041c), top: B:105:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03da A[Catch: all -> 0x028a, TryCatch #9 {all -> 0x028a, blocks: (B:106:0x026b, B:108:0x0287, B:111:0x028d, B:113:0x0350, B:116:0x0355, B:117:0x035c, B:119:0x03be, B:120:0x03ca, B:122:0x03da, B:124:0x03e2, B:126:0x03ee, B:127:0x03f8, B:128:0x041c), top: B:105:0x026b }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String str;
        C2804Ud c2804Ud;
        Object c4091wA;
        IInterface iInterface;
        int i = 3;
        int i6 = 1;
        int i9 = 0;
        switch (this.f29608n) {
            case 0:
                Yv yv = (Yv) this.f29609u;
                Iterator it = yv.f28758d.values().iterator();
                while (it.hasNext()) {
                    ((Uv) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new C2816Up(yv, (Qx) this.f29610v, timer), 1000L);
                return;
            case 1:
                Wv wv = Wv.f28443n;
                Yv yv2 = (Yv) this.f29609u;
                Iterator it2 = yv2.f28758d.values().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    View view = (View) this.f29610v;
                    if (!hasNext) {
                        yv2.f28759e.a(view, wv);
                        return;
                    } else {
                        Uv uv = (Uv) it2.next();
                        if (!uv.f28041f) {
                            uv.f28037b.a(view, wv);
                        }
                    }
                }
            case 2:
                C4124wq c4124wq = (C4124wq) this.f29609u;
                c4124wq.getClass();
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f29610v;
                interfaceC4061vh.e1();
                BinderC2606Ih g4 = interfaceC4061vh.g();
                q2.Z0 z02 = c4124wq.f34887d.f29620a;
                if (z02 != null && g4 != null) {
                    g4.V3(z02);
                }
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32107Q1)).booleanValue() || interfaceC4061vh.isAttachedToWindow()) {
                    return;
                }
                interfaceC4061vh.onPause();
                interfaceC4061vh.d1();
                return;
            case 3:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f29610v).registerReceiver(new Q0.d((C3640nr) this.f29609u), intentFilter);
                return;
            case 4:
                C3640nr c3640nr = (C3640nr) ((Q0.d) this.f29609u).f2629b;
                c3640nr.getClass();
                Context context = (Context) this.f29610v;
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
                        c3640nr.c(i);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            throw null;
                        }
                        C2784Sp c2784Sp = new C2784Sp(c3640nr);
                        telephonyManager.registerTelephonyCallback(c3640nr.f32786a, c2784Sp);
                        telephonyManager.unregisterTelephonyCallback(c2784Sp);
                        return;
                    } catch (RuntimeException unused2) {
                        c3640nr.c(5);
                        return;
                    }
                }
                i = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                c3640nr.c(i);
                return;
            case 5:
                ((Hr) ((C3481ku) ((T8) ((C3864s) this.f29609u).f33790y).f27697v).f31665w).v((C4920z0) this.f29610v);
                return;
            case 6:
                ((C3426jt) ((C3864s) this.f29609u).f33790y).f31338d.v((C4920z0) this.f29610v);
                return;
            case 7:
                ((C3696ot) this.f29609u).f32965d.v((C4920z0) this.f29610v);
                return;
            case 8:
                ((Mt) ((C3864s) this.f29609u).f33790y).f26365d.v((C4920z0) this.f29610v);
                return;
            case 9:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f29610v;
                InputStream inputStream = (InputStream) this.f29609u;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            T2.b.d(inputStream, autoCloseOutputStream, false);
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
                C3428jv c3428jv = (C3428jv) this.f29609u;
                c3428jv.getClass();
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f29610v;
                if (atomicBoolean.get()) {
                    new Thread(new RunnableC3048cq(12, (S0.c) c3428jv.f31347v, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 11:
                ((Lu) ((T8) this.f29609u).f27700y).f26191c.M1(new C4019ut(i6, (Iu) this.f29610v));
                return;
            case 12:
                S0.c cVar = (S0.c) this.f29609u;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f29610v;
                synchronized (cVar) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) cVar.f2776v) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 13:
                Wu wu = (Wu) this.f29609u;
                Uu uu = (Uu) this.f29610v;
                wu.getClass();
                synchronized (Wu.f28432E) {
                    try {
                        if (!wu.f28435B) {
                            wu.f28435B = true;
                            if (Wu.a()) {
                                try {
                                    u2.D d2 = C4835j.f39733C.f39738c;
                                    wu.f28439w = u2.D.M(wu.f28436n);
                                } catch (RemoteException | RuntimeException e9) {
                                    C4835j.f39733C.f39743h.d("CuiMonitor.gettingAppIdFromManifest", e9);
                                }
                                M2.f fVar = M2.f.f1844b;
                                Context context2 = wu.f28436n;
                                fVar.getClass();
                                wu.f28440x = M2.f.a(context2);
                                C3301ha c3301ha = AbstractC3569ma.U9;
                                q2.r rVar = q2.r.f40207e;
                                int intValue = ((Integer) rVar.f40210c.a(c3301ha)).intValue();
                                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.pd)).booleanValue()) {
                                    long j6 = intValue;
                                    AbstractC3413jg.f31271d.scheduleWithFixedDelay(wu, j6, j6, TimeUnit.MILLISECONDS);
                                } else {
                                    long j9 = intValue;
                                    AbstractC3413jg.f31271d.scheduleAtFixedRate(wu, j9, j9, TimeUnit.MILLISECONDS);
                                }
                                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.aa)).booleanValue()) {
                                    wu.f28434A.a();
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (Wu.a() && uu != null) {
                    synchronized (Wu.f28431D) {
                        try {
                            Zu zu = wu.f28438v;
                            int A9 = ((C3053cv) zu.f27721u).A();
                            C3301ha c3301ha2 = AbstractC3569ma.V9;
                            q2.r rVar2 = q2.r.f40207e;
                            if (A9 >= ((Integer) rVar2.f40210c.a(c3301ha2)).intValue()) {
                                return;
                            }
                            Xu C8 = Yu.C();
                            int i10 = uu.f28033m;
                            C8.h();
                            ((Yu) C8.f27721u).Y(i10);
                            boolean z3 = uu.f28023b;
                            C8.h();
                            ((Yu) C8.f27721u).D(z3);
                            long j10 = uu.f28022a;
                            C8.h();
                            ((Yu) C8.f27721u).E(j10);
                            C8.h();
                            ((Yu) C8.f27721u).Z();
                            String str2 = wu.f28437u.f41391n;
                            C8.h();
                            ((Yu) C8.f27721u).G(str2);
                            String str3 = wu.f28439w;
                            C8.h();
                            ((Yu) C8.f27721u).H(str3);
                            String str4 = Build.VERSION.RELEASE;
                            C8.h();
                            ((Yu) C8.f27721u).I(str4);
                            int i11 = Build.VERSION.SDK_INT;
                            C8.h();
                            ((Yu) C8.f27721u).J(i11);
                            int i12 = uu.f28035o;
                            C8.h();
                            ((Yu) C8.f27721u).A(i12);
                            int i13 = uu.f28024c;
                            C8.h();
                            ((Yu) C8.f27721u).L(i13);
                            long j11 = wu.f28440x;
                            C8.h();
                            ((Yu) C8.f27721u).M(j11);
                            int i14 = uu.f28034n;
                            C8.h();
                            ((Yu) C8.f27721u).B(i14);
                            String str5 = uu.f28025d;
                            C8.h();
                            ((Yu) C8.f27721u).N(str5);
                            String str6 = uu.f28026e;
                            C8.h();
                            ((Yu) C8.f27721u).O(str6);
                            String str7 = uu.f28027f;
                            C8.h();
                            ((Yu) C8.f27721u).P(str7);
                            C2714On b9 = wu.f28441y.b(uu.f28027f);
                            if (b9 != null && (c2804Ud = b9.f26657b) != null) {
                                str = c2804Ud.toString();
                                C8.h();
                                ((Yu) C8.f27721u).Q(str);
                                String str8 = uu.f28028g;
                                C8.h();
                                ((Yu) C8.f27721u).R(str8);
                                int i15 = uu.f28029h;
                                C8.h();
                                ((Yu) C8.f27721u).V(i15);
                                String str9 = uu.f28031k;
                                C8.h();
                                ((Yu) C8.f27721u).U(str9);
                                String str10 = uu.i;
                                C8.h();
                                ((Yu) C8.f27721u).S(str10);
                                String str11 = uu.f28030j;
                                C8.h();
                                ((Yu) C8.f27721u).T(str11);
                                long j12 = uu.f28032l;
                                C8.h();
                                ((Yu) C8.f27721u).F(j12);
                                if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.Z9)).booleanValue()) {
                                    AbstractCollection abstractCollection = wu.f28442z;
                                    C8.h();
                                    ((Yu) C8.f27721u).K(abstractCollection);
                                }
                                if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.aa)).booleanValue()) {
                                    C2824Vh c2824Vh = wu.f28434A;
                                    WL wl = c2824Vh.f28223b;
                                    String str12 = c2824Vh.f28222a;
                                    if (wl != null) {
                                        C8.h();
                                        ((Yu) C8.f27721u).W(wl);
                                    }
                                    if (str12 != null) {
                                        C8.h();
                                        ((Yu) C8.f27721u).X(str12);
                                    }
                                }
                                C2946av A10 = C3000bv.A();
                                A10.h();
                                ((C3000bv) A10.f27721u).B((Yu) C8.j());
                                zu.h();
                                ((C3053cv) zu.f27721u).C((C3000bv) A10.j());
                                return;
                            }
                            str = "";
                            C8.h();
                            ((Yu) C8.f27721u).Q(str);
                            String str82 = uu.f28028g;
                            C8.h();
                            ((Yu) C8.f27721u).R(str82);
                            int i152 = uu.f28029h;
                            C8.h();
                            ((Yu) C8.f27721u).V(i152);
                            String str92 = uu.f28031k;
                            C8.h();
                            ((Yu) C8.f27721u).U(str92);
                            String str102 = uu.i;
                            C8.h();
                            ((Yu) C8.f27721u).S(str102);
                            String str112 = uu.f28030j;
                            C8.h();
                            ((Yu) C8.f27721u).T(str112);
                            long j122 = uu.f28032l;
                            C8.h();
                            ((Yu) C8.f27721u).F(j122);
                            if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.Z9)).booleanValue()) {
                            }
                            if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.aa)).booleanValue()) {
                            }
                            C2946av A102 = C3000bv.A();
                            A102.h();
                            ((C3000bv) A102.f27721u).B((Yu) C8.j());
                            zu.h();
                            ((C3053cv) zu.f27721u).C((C3000bv) A102.j());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 14:
                InterfaceC4914w0 interfaceC4914w0 = (InterfaceC4914w0) this.f29609u;
                Fv fv = (Fv) this.f29610v;
                q2.N n9 = fv.f24873h;
                if (n9 != null) {
                    try {
                        q2.V0 v02 = (q2.V0) fv.f24870e.get();
                        Parcel H02 = n9.H0();
                        AbstractC3388j8.c(H02, v02);
                        n9.f1(H02, 1);
                    } catch (RemoteException unused4) {
                        int i16 = u2.z.f41322b;
                        v2.i.f("Failed to call onAdsAvailable");
                    }
                }
                q2.P p9 = fv.i;
                if (p9 != null) {
                    try {
                        String str13 = fv.f24876l;
                        Parcel H03 = p9.H0();
                        H03.writeString(str13);
                        AbstractC3388j8.e(H03, interfaceC4914w0);
                        p9.f1(H03, 1);
                        return;
                    } catch (RemoteException unused5) {
                        int i17 = u2.z.f41322b;
                        v2.i.f("Failed to call onAdPreloaded");
                        return;
                    }
                }
                return;
            case 15:
                C4920z0 c4920z0 = (C4920z0) this.f29609u;
                Fv fv2 = (Fv) this.f29610v;
                q2.P p10 = fv2.i;
                if (p10 != null) {
                    try {
                        String str14 = fv2.f24876l;
                        Parcel H04 = p10.H0();
                        H04.writeString(str14);
                        AbstractC3388j8.c(H04, c4920z0);
                        p10.f1(H04, 3);
                        return;
                    } catch (RemoteException unused6) {
                        int i18 = u2.z.f41322b;
                        v2.i.f("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 16:
                V2.E((WebView) this.f29609u, (String) this.f29610v);
                return;
            case 17:
                ((j3.h) this.f29610v).b(C3108dx.a((Context) this.f29609u, "GLAS"));
                return;
            case 18:
                Lz lz = (Lz) this.f29609u;
                C3002bx c3002bx = lz.f26197a;
                Uw uw = (Uw) this.f29610v;
                if (!c3002bx.a(uw)) {
                    throw new B0.c(2);
                }
                lz.f26202f.set("2.904631200.".concat(String.valueOf(uw.f28043a.A())));
                return;
            case 19:
                IBinder iBinder = (IBinder) this.f29610v;
                int i19 = AbstractBinderC4145xA.f34962n;
                if (iBinder == null) {
                    c4091wA = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    c4091wA = queryLocalInterface instanceof InterfaceC4199yA ? (InterfaceC4199yA) queryLocalInterface : new C4091wA(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 2);
                }
                GA ga = (GA) this.f29609u;
                C2598Hq c2598Hq = ga.f24940n;
                c2598Hq.f25388C = c4091wA;
                ((C3933tE) c2598Hq.f25392w).a("linkToDeath", new Object[0]);
                try {
                    iInterface = (InterfaceC4199yA) c2598Hq.f25388C;
                } catch (RemoteException e10) {
                    ((C3933tE) ga.f24940n.f25392w).d(e10, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                ((AbstractC0432a) iInterface).f4329u.linkToDeath((HA) c2598Hq.f25386A, 0);
                C2598Hq c2598Hq2 = ga.f24940n;
                c2598Hq2.f25389n = false;
                synchronized (((ArrayList) c2598Hq2.f25394y)) {
                    try {
                        Iterator it3 = ((ArrayList) c2598Hq2.f25394y).iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                        ((ArrayList) c2598Hq2.f25394y).clear();
                    } finally {
                    }
                }
                return;
            case 20:
                ((AbstractC4040vD) this.f29609u).v((NB) this.f29610v);
                return;
            case 21:
                a();
                return;
            case 22:
                ((HO) this.f29609u).f25286w.reportNetworkEvent((NetworkEvent) this.f29610v);
                return;
            case 23:
                ((HO) this.f29609u).f25286w.reportPlaybackStateEvent((PlaybackStateEvent) this.f29610v);
                return;
            case 24:
                ((HO) this.f29609u).f25286w.reportTrackChangeEvent((TrackChangeEvent) this.f29610v);
                return;
            case 25:
                ((HO) this.f29609u).f25286w.reportPlaybackMetrics((PlaybackMetrics) this.f29610v);
                return;
            case 26:
                ((HO) this.f29609u).f25286w.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f29610v);
                return;
            case 27:
                S0.l lVar = (S0.l) this.f29609u;
                lVar.getClass();
                String str15 = AbstractC3159eu.f29993a;
                ((HN) lVar.f2798v).f25264n.f26792W.q((C4104wN) this.f29610v);
                return;
            case 28:
                b();
                return;
            default:
                ME me = (ME) this.f29609u;
                me.getClass();
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f29610v).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) me.f26272d).post(new RunnableC3191fP(i9, me, routedDevice));
                    return;
                }
                return;
        }
    }

    public RunnableC3048cq(V2 v22, WebView webView, String str) {
        this.f29608n = 16;
        this.f29609u = webView;
        this.f29610v = str;
        Objects.requireNonNull(v22);
    }

    public RunnableC3048cq(Fv fv, InterfaceC4914w0 interfaceC4914w0) {
        this.f29608n = 14;
        this.f29609u = interfaceC4914w0;
        Objects.requireNonNull(fv);
        this.f29610v = fv;
    }

    public RunnableC3048cq(Fv fv, C4920z0 c4920z0) {
        this.f29608n = 15;
        this.f29609u = c4920z0;
        Objects.requireNonNull(fv);
        this.f29610v = fv;
    }
}
