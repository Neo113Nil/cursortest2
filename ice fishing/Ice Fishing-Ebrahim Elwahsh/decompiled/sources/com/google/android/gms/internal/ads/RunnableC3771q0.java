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
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3771q0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33558n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33559u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33560v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f33561w;

    public /* synthetic */ RunnableC3771q0(Object obj, Object obj2, Object obj3, int i) {
        this.f33558n = i;
        this.f33559u = obj;
        this.f33560v = obj2;
        this.f33561w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3128e5 interfaceC3128e5;
        final int i = 1;
        final int i4 = 0;
        switch (this.f33558n) {
            case 0:
                C3932t0 c3932t0 = (C3932t0) this.f33559u;
                c3932t0.getClass();
                String str = AbstractC3548lu.f32613a;
                OO oo = c3932t0.f34333b.f28243n.f30021L;
                KO z8 = oo.z();
                oo.s(z8, 1017, new Mu(z8, (TP) this.f33560v, (MN) this.f33561w));
                return;
            case 1:
                AbstractC3074d5 abstractC3074d5 = (AbstractC3074d5) this.f33559u;
                synchronized (abstractC3074d5.f29797x) {
                }
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) this.f33560v;
                C3183f5 c3183f5 = (C3183f5) nVar.f23620w;
                if (c3183f5 == null) {
                    abstractC3074d5.i(nVar.f23618u);
                } else {
                    synchronized (abstractC3074d5.f29797x) {
                        interfaceC3128e5 = abstractC3074d5.f29798y;
                    }
                    interfaceC3128e5.c(c3183f5);
                }
                if (nVar.f23617n) {
                    abstractC3074d5.a("intermediate-response");
                } else {
                    abstractC3074d5.b("done");
                }
                MD md = (MD) this.f33561w;
                if (md != null) {
                    md.run();
                    return;
                }
                return;
            case 2:
                C4210y8 c4210y8 = (C4210y8) this.f33559u;
                WebView webView = (WebView) this.f33560v;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", c4210y8);
                        return;
                    } catch (Throwable unused) {
                        c4210y8.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                C3965tg c3965tg = ((TextureViewSurfaceTextureListenerC3696og) this.f33561w).J;
                if (c3965tg != null) {
                    c3965tg.c("error", "what", (String) this.f33559u, "extra", (String) this.f33560v);
                    return;
                }
                return;
            case 4:
                ((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) this.f33559u).x((String) this.f33560v, (ValueCallback) this.f33561w);
                return;
            case 5:
                C2741Qh c2741Qh = (C2741Qh) this.f33559u;
                c2741Qh.getClass();
                p2.j jVar = p2.j.f39798C;
                jVar.f39810k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                jVar.f39803c.E((Context) this.f33560v, ((C5107a) this.f33561w).f41217n);
                C3151ea c3151ea = AbstractC3368ia.sf;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    jVar.f39810k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    C2593Hm a9 = c2741Qh.f27199b.a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
                    sb.append(elapsedRealtime2);
                    a9.r("webview_startup_l", sb.toString());
                    a9.s();
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.yf)).booleanValue()) {
                    AbstractC3212fg.f30743f.execute(new RunnableC3068d(25, c2741Qh));
                    return;
                }
                return;
            case 6:
                ((Av) this.f33559u).b((String) this.f33560v, (t2.w) this.f33561w, null, null);
                return;
            case 7:
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                String[] strArr = {(String) this.f33560v};
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f33559u;
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", strArr);
                C2834Vp.i(sQLiteDatabase, (u2.l) this.f33561w);
                return;
            case 8:
                C3168er.c((C2953au) this.f33559u, (Ut) this.f33560v, (C3598mq) this.f33561w);
                return;
            case 9:
                if (((Jv) this.f33559u).f25848b.compareAndSet(false, true)) {
                    ((Ev) this.f33560v).b((Hv) this.f33561w, true);
                    return;
                }
                return;
            case 10:
                Sz sz = (Sz) this.f33559u;
                HashMap a10 = sz.f27667e.a();
                HashMap hashMap = (HashMap) this.f33560v;
                hashMap.putAll(a10);
                sz.h(hashMap);
                hashMap.put("f", com.anythink.expressad.foundation.d.d.bu);
                hashMap.put("ctx", (Context) this.f33561w);
                return;
            case 11:
                CA ca = (CA) this.f33560v;
                h8.d dVar = (h8.d) this.f33561w;
                IA ia = (IA) this.f33559u;
                String str2 = ia.f25535b;
                try {
                    C2631Jq c2631Jq = ia.f25534a;
                    if (c2631Jq == null) {
                        throw null;
                    }
                    BA ba = (BA) c2631Jq.f25821C;
                    if (ba == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str2);
                    String str3 = ca.f24145a;
                    if (!IA.b(str3)) {
                        str3.getClass();
                        bundle.putString("sessionToken", str3.trim());
                    }
                    String str4 = ca.f24146b;
                    if (!IA.b(str4)) {
                        str4.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f22565u, str4.trim());
                    }
                    HA ha = new HA(ia, dVar);
                    C4266zA c4266zA = (C4266zA) ba;
                    Parcel A02 = c4266zA.A0();
                    AbstractC3241g8.c(A02, bundle);
                    AbstractC3241g8.e(A02, ha);
                    c4266zA.N0(A02, 2);
                    return;
                } catch (RemoteException e6) {
                    IA.f25532c.d(e6, "dismiss overlay display from: %s", str2);
                    return;
                }
            case 12:
                EA ea = (EA) this.f33560v;
                h8.d dVar2 = (h8.d) this.f33561w;
                IA ia2 = (IA) this.f33559u;
                String str5 = ia2.f25535b;
                try {
                    C2631Jq c2631Jq2 = ia2.f25534a;
                    if (c2631Jq2 == null) {
                        throw null;
                    }
                    BA ba2 = (BA) c2631Jq2.f25821C;
                    if (ba2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str5);
                    bundle2.putBinder("windowToken", ea.f24666a);
                    String str6 = ea.f24671f;
                    if (!IA.b(str6)) {
                        str6.getClass();
                        bundle2.putString("adFieldEnifd", str6.trim());
                    }
                    bundle2.putInt("layoutGravity", ea.f24668c);
                    bundle2.putFloat("layoutVerticalMargin", ea.f24669d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", ea.f24670e);
                    if (!IA.b(null)) {
                        throw null;
                    }
                    if (!IA.b(null)) {
                        throw null;
                    }
                    String str7 = ea.f24667b;
                    if (!IA.b(str7)) {
                        str7.getClass();
                        bundle2.putString(com.anythink.expressad.videocommon.e.b.f22565u, str7.trim());
                    }
                    if (!IA.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    HA ha2 = new HA(ia2, dVar2);
                    C4266zA c4266zA2 = (C4266zA) ba2;
                    Parcel A03 = c4266zA2.A0();
                    A03.writeString(str5);
                    AbstractC3241g8.c(A03, bundle2);
                    AbstractC3241g8.e(A03, ha2);
                    c4266zA2.N0(A03, 1);
                    return;
                } catch (RemoteException e9) {
                    IA.f25532c.d(e9, "show overlay display from: %s", str5);
                    return;
                }
            case 13:
                C3848rO c3848rO = (C3848rO) this.f33559u;
                c3848rO.getClass();
                C3675oC f6 = ((RB) this.f33560v).f();
                OO oo2 = c3848rO.f34024c;
                IO io = oo2.f26697g;
                io.getClass();
                Q8 q82 = oo2.f26694d;
                q82.getClass();
                q82.f27120u = UB.n(f6);
                if (!f6.isEmpty()) {
                    q82.f27123x = (BQ) f6.get(0);
                    BQ bq = (BQ) this.f33561w;
                    bq.getClass();
                    q82.f27124y = bq;
                }
                if (((BQ) q82.f27122w) == null) {
                    q82.f27122w = Q8.u(io, (UB) q82.f27120u, (BQ) q82.f27123x, (L7) q82.f27119n);
                }
                q82.s(io.r1());
                return;
            case 14:
                Pair pair = (Pair) this.f33560v;
                ((OO) ((C4064vO) this.f33559u).f34759b.f446C).b(((Integer) pair.first).intValue(), (BQ) pair.second, (C4228yQ) this.f33561w);
                return;
            case 15:
                C3932t0 c3932t02 = (C3932t0) this.f33559u;
                c3932t02.getClass();
                String str8 = AbstractC3548lu.f32613a;
                OO oo3 = c3932t02.f34333b.f28243n.f30021L;
                KO z9 = oo3.z();
                oo3.s(z9, 1009, new C4086vt(z9, (TP) this.f33560v, (MN) this.f33561w));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f33559u;
                Handler handler = (Handler) this.f33560v;
                final C3759pp c3759pp = (C3759pp) this.f33561w;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rP
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        C3759pp c3759pp2 = c3759pp;
                                        c3759pp2.getClass();
                                        if (Thread.currentThread() == c3759pp2.f33512a) {
                                            c3759pp2.c(-1, MO.f26336u);
                                            c3759pp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3759pp c3759pp3 = c3759pp;
                                        c3759pp3.getClass();
                                        if (Thread.currentThread() == c3759pp3.f33512a) {
                                            c3759pp3.c(-1, MO.f26336u);
                                            c3759pp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C4119wP.f34981o) {
                        try {
                            int i9 = C4119wP.f34983q - 1;
                            C4119wP.f34983q = i9;
                            if (i9 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C4119wP.f34982p;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                C4119wP.f34982p = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rP
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        C3759pp c3759pp2 = c3759pp;
                                        c3759pp2.getClass();
                                        if (Thread.currentThread() == c3759pp2.f33512a) {
                                            c3759pp2.c(-1, MO.f26336u);
                                            c3759pp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3759pp c3759pp3 = c3759pp;
                                        c3759pp3.getClass();
                                        if (Thread.currentThread() == c3759pp3.f33512a) {
                                            c3759pp3.c(-1, MO.f26336u);
                                            c3759pp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C4119wP.f34981o) {
                        try {
                            int i10 = C4119wP.f34983q - 1;
                            C4119wP.f34983q = i10;
                            if (i10 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C4119wP.f34982p;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                C4119wP.f34982p = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public RunnableC3771q0(C4264z8 c4264z8, C4048v8 c4048v8, WebView webView, boolean z8) {
        this.f33558n = 2;
        this.f33560v = webView;
        Objects.requireNonNull(c4264z8);
        this.f33561w = c4264z8;
        this.f33559u = new C4210y8(this, c4048v8, webView, z8);
    }

    public RunnableC3771q0(TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og, String str, String str2) {
        this.f33558n = 3;
        this.f33559u = str;
        this.f33560v = str2;
        this.f33561w = textureViewSurfaceTextureListenerC3696og;
    }
}
