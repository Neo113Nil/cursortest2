package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import l.C4648e;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3865s0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33791n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33792u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33793v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f33794w;

    public /* synthetic */ RunnableC3865s0(int i, Object obj, Object obj2, Object obj3) {
        this.f33791n = i;
        this.f33792u = obj;
        this.f33793v = obj2;
        this.f33794w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3225g5 interfaceC3225g5;
        final int i = 1;
        final int i6 = 0;
        switch (this.f33791n) {
            case 0:
                S0.e eVar = (S0.e) this.f33792u;
                eVar.getClass();
                String str = AbstractC3159eu.f29993a;
                BO bo = ((HN) eVar.f2782v).f25264n.f26780K;
                C4159xO x9 = bo.x();
                bo.s(x9, 1017, new C3105du(x9, (DP) this.f33793v, (C4212yN) this.f33794w));
                return;
            case 1:
                AbstractC3171f5 abstractC3171f5 = (AbstractC3171f5) this.f33792u;
                synchronized (abstractC3171f5.f30046x) {
                }
                com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) this.f33793v;
                C3279h5 c3279h5 = (C3279h5) oVar.f23466w;
                if (c3279h5 == null) {
                    abstractC3171f5.i(oVar.f23464u);
                } else {
                    synchronized (abstractC3171f5.f30046x) {
                        interfaceC3225g5 = abstractC3171f5.f30047y;
                    }
                    interfaceC3225g5.c(c3279h5);
                }
                if (oVar.f23463n) {
                    abstractC3171f5.a("intermediate-response");
                } else {
                    abstractC3171f5.b("done");
                }
                RunnableC3973u0 runnableC3973u0 = (RunnableC3973u0) this.f33794w;
                if (runnableC3973u0 != null) {
                    runnableC3973u0.run();
                    return;
                }
                return;
            case 2:
                C8 c82 = (C8) this.f33792u;
                WebView webView = (WebView) this.f33793v;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", c82);
                        return;
                    } catch (Throwable unused) {
                        c82.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                C4114wg c4114wg = ((TextureViewSurfaceTextureListenerC3898sg) this.f33794w).J;
                if (c4114wg != null) {
                    c4114wg.c("error", "what", (String) this.f33792u, "extra", (String) this.f33793v);
                    return;
                }
                return;
            case 4:
                ((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) this.f33792u).x((String) this.f33793v, (ValueCallback) this.f33794w);
                return;
            case 5:
                C2792Th c2792Th = (C2792Th) this.f33792u;
                c2792Th.getClass();
                C4835j c4835j = C4835j.f39730C;
                c4835j.f39742k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c4835j.f39735c.E((Context) this.f33793v, ((C5110a) this.f33794w).f41388n);
                C3301ha c3301ha = AbstractC3569ma.yf;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    c4835j.f39742k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    S0.e a9 = c2792Th.f27765b.a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
                    sb.append(elapsedRealtime2);
                    a9.v("webview_startup_l", sb.toString());
                    a9.y();
                }
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Ef)).booleanValue()) {
                    AbstractC3413jg.f31273f.execute(new RunnableC3111e(25, c2792Th));
                    return;
                }
                return;
            case 6:
                ((C4237yv) this.f33792u).b((String) this.f33793v, (C4648e) this.f33794w, null, null);
                return;
            case 7:
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                String[] strArr = {(String) this.f33793v};
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f33792u;
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", strArr);
                C2800Tp.j(sQLiteDatabase, (v2.l) this.f33794w);
                return;
            case 8:
                C2996br.c((Yt) this.f33792u, (St) this.f33793v, (C3477kq) this.f33794w);
                return;
            case 9:
                if (((Hv) this.f33792u).f25409b.compareAndSet(false, true)) {
                    ((Cv) this.f33793v).b((Fv) this.f33794w, true);
                    return;
                }
                return;
            case 10:
                Pz pz = (Pz) this.f33792u;
                HashMap a10 = pz.f26900e.a();
                HashMap hashMap = (HashMap) this.f33793v;
                hashMap.putAll(a10);
                pz.g(hashMap);
                hashMap.put("f", com.anythink.expressad.foundation.d.d.bu);
                hashMap.put("ctx", (Context) this.f33794w);
                return;
            case 11:
                C4253zA c4253zA = (C4253zA) this.f33793v;
                t2.n nVar = (t2.n) this.f33794w;
                FA fa = (FA) this.f33792u;
                String str2 = fa.f24753b;
                try {
                    C2598Hq c2598Hq = fa.f24752a;
                    if (c2598Hq == null) {
                        throw null;
                    }
                    InterfaceC4199yA interfaceC4199yA = (InterfaceC4199yA) c2598Hq.f25388C;
                    if (interfaceC4199yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str2);
                    String str3 = c4253zA.f35304a;
                    if (!FA.b(str3)) {
                        str3.getClass();
                        bundle.putString("sessionToken", str3.trim());
                    }
                    String str4 = c4253zA.f35305b;
                    if (!FA.b(str4)) {
                        str4.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f22407u, str4.trim());
                    }
                    EA ea = new EA(fa, nVar);
                    C4091wA c4091wA = (C4091wA) interfaceC4199yA;
                    Parcel H02 = c4091wA.H0();
                    AbstractC3388j8.c(H02, bundle);
                    AbstractC3388j8.e(H02, ea);
                    c4091wA.h1(H02, 2);
                    return;
                } catch (RemoteException e9) {
                    FA.f24750c.d(e9, "dismiss overlay display from: %s", str2);
                    return;
                }
            case 12:
                BA ba = (BA) this.f33793v;
                t2.n nVar2 = (t2.n) this.f33794w;
                FA fa2 = (FA) this.f33792u;
                String str5 = fa2.f24753b;
                try {
                    C2598Hq c2598Hq2 = fa2.f24752a;
                    if (c2598Hq2 == null) {
                        throw null;
                    }
                    InterfaceC4199yA interfaceC4199yA2 = (InterfaceC4199yA) c2598Hq2.f25388C;
                    if (interfaceC4199yA2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str5);
                    bundle2.putBinder("windowToken", ba.f23854a);
                    String str6 = ba.f23859f;
                    if (!FA.b(str6)) {
                        str6.getClass();
                        bundle2.putString("adFieldEnifd", str6.trim());
                    }
                    bundle2.putInt("layoutGravity", ba.f23856c);
                    bundle2.putFloat("layoutVerticalMargin", ba.f23857d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("theme", 0);
                    bundle2.putInt("windowWidthPx", ba.f23858e);
                    if (!FA.b(null)) {
                        throw null;
                    }
                    if (!FA.b(null)) {
                        throw null;
                    }
                    String str7 = ba.f23855b;
                    if (!FA.b(str7)) {
                        str7.getClass();
                        bundle2.putString(com.anythink.expressad.videocommon.e.b.f22407u, str7.trim());
                    }
                    if (!FA.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    EA ea2 = new EA(fa2, nVar2);
                    C4091wA c4091wA2 = (C4091wA) interfaceC4199yA2;
                    Parcel H03 = c4091wA2.H0();
                    H03.writeString(str5);
                    AbstractC3388j8.c(H03, bundle2);
                    AbstractC3388j8.e(H03, ea2);
                    c4091wA2.h1(H03, 1);
                    return;
                } catch (RemoteException e10) {
                    FA.f24750c.d(e10, "show overlay display from: %s", str5);
                    return;
                }
            case 13:
                C3136eO c3136eO = (C3136eO) this.f33792u;
                c3136eO.getClass();
                C3500lC f3 = ((OB) this.f33793v).f();
                BO bo2 = c3136eO.f29916c;
                C4051vO c4051vO = bo2.f23901g;
                c4051vO.getClass();
                T8 t82 = bo2.f23898d;
                t82.getClass();
                t82.f27696u = RB.n(f3);
                if (!f3.isEmpty()) {
                    t82.f27699x = (C3676oQ) f3.get(0);
                    C3676oQ c3676oQ = (C3676oQ) this.f33794w;
                    c3676oQ.getClass();
                    t82.f27700y = c3676oQ;
                }
                if (((C3676oQ) t82.f27698w) == null) {
                    t82.f27698w = T8.v(c4051vO, (RB) t82.f27696u, (C3676oQ) t82.f27699x, (K7) t82.f27695n);
                }
                t82.t(c4051vO.F1());
                return;
            case 14:
                Pair pair = (Pair) this.f33793v;
                ((BO) ((C3352iO) this.f33792u).f31041b.f799C).a(((Integer) pair.first).intValue(), (C3676oQ) pair.second, (C3514lQ) this.f33794w);
                return;
            case 15:
                S0.l lVar = (S0.l) this.f33792u;
                lVar.getClass();
                String str8 = AbstractC3159eu.f29993a;
                BO bo3 = ((HN) lVar.f2798v).f25264n.f26780K;
                C4159xO x10 = bo3.x();
                bo3.s(x10, 1009, new C4019ut(x10, (DP) this.f33793v, (C4212yN) this.f33794w));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f33792u;
                Handler handler = (Handler) this.f33793v;
                final C3530lp c3530lp = (C3530lp) this.f33794w;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eP
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        C3530lp c3530lp2 = c3530lp;
                                        c3530lp2.getClass();
                                        if (Thread.currentThread() == c3530lp2.f31851a) {
                                            c3530lp2.c(-1, C4267zO.f35329u);
                                            c3530lp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3530lp c3530lp3 = c3530lp;
                                        c3530lp3.getClass();
                                        if (Thread.currentThread() == c3530lp3.f31851a) {
                                            c3530lp3.c(-1, C4267zO.f35329u);
                                            c3530lp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C3405jP.f31245o) {
                        try {
                            int i9 = C3405jP.f31247q - 1;
                            C3405jP.f31247q = i9;
                            if (i9 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C3405jP.f31246p;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                C3405jP.f31246p = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eP
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        C3530lp c3530lp2 = c3530lp;
                                        c3530lp2.getClass();
                                        if (Thread.currentThread() == c3530lp2.f31851a) {
                                            c3530lp2.c(-1, C4267zO.f35329u);
                                            c3530lp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3530lp c3530lp3 = c3530lp;
                                        c3530lp3.getClass();
                                        if (Thread.currentThread() == c3530lp3.f31851a) {
                                            c3530lp3.c(-1, C4267zO.f35329u);
                                            c3530lp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C3405jP.f31245o) {
                        try {
                            int i10 = C3405jP.f31247q - 1;
                            C3405jP.f31247q = i10;
                            if (i10 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C3405jP.f31246p;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                C3405jP.f31246p = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public RunnableC3865s0(D8 d82, C4197y8 c4197y8, WebView webView, boolean z3) {
        this.f33791n = 2;
        this.f33793v = webView;
        Objects.requireNonNull(d82);
        this.f33794w = d82;
        this.f33792u = new C8(this, c4197y8, webView, z3);
    }

    public RunnableC3865s0(TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg, String str, String str2) {
        this.f33791n = 3;
        this.f33792u = str;
        this.f33793v = str2;
        this.f33794w = textureViewSurfaceTextureListenerC3898sg;
    }
}
