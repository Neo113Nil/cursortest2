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
import h.C4543G;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import l.C4659e;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3888s0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34559n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34560u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34561v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f34562w;

    public /* synthetic */ RunnableC3888s0(int i, Object obj, Object obj2, Object obj3) {
        this.f34559n = i;
        this.f34560u = obj;
        this.f34561v = obj2;
        this.f34562w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3248g5 interfaceC3248g5;
        final int i = 1;
        final int i4 = 0;
        switch (this.f34559n) {
            case 0:
                S0.e eVar = (S0.e) this.f34560u;
                eVar.getClass();
                String str = AbstractC3182eu.f30782a;
                BO bo = ((HN) eVar.f2909v).f26036n.f27558K;
                C4182xO x9 = bo.x();
                bo.s(x9, 1017, new C3128du(x9, (DP) this.f34561v, (C4235yN) this.f34562w));
                return;
            case 1:
                AbstractC3194f5 abstractC3194f5 = (AbstractC3194f5) this.f34560u;
                synchronized (abstractC3194f5.f30833x) {
                }
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) this.f34561v;
                C3302h5 c3302h5 = (C3302h5) nVar.f24251w;
                if (c3302h5 == null) {
                    abstractC3194f5.i(nVar.f24249u);
                } else {
                    synchronized (abstractC3194f5.f30833x) {
                        interfaceC3248g5 = abstractC3194f5.f30834y;
                    }
                    interfaceC3248g5.n(c3302h5);
                }
                if (nVar.f24248n) {
                    abstractC3194f5.a("intermediate-response");
                } else {
                    abstractC3194f5.b("done");
                }
                RunnableC3996u0 runnableC3996u0 = (RunnableC3996u0) this.f34562w;
                if (runnableC3996u0 != null) {
                    runnableC3996u0.run();
                    return;
                }
                return;
            case 2:
                C8 c82 = (C8) this.f34560u;
                WebView webView = (WebView) this.f34561v;
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
                C4137wg c4137wg = ((TextureViewSurfaceTextureListenerC3921sg) this.f34562w).J;
                if (c4137wg != null) {
                    c4137wg.c("error", "what", (String) this.f34560u, "extra", (String) this.f34561v);
                    return;
                }
                return;
            case 4:
                ((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) this.f34560u).x((String) this.f34561v, (ValueCallback) this.f34562w);
                return;
            case 5:
                C2813Th c2813Th = (C2813Th) this.f34560u;
                c2813Th.getClass();
                C4906k c4906k = C4906k.f40186C;
                c4906k.f40198k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c4906k.f40191c.E((Context) this.f34561v, ((C5189a) this.f34562w).f41845n);
                C3324ha c3324ha = AbstractC3592ma.yf;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    c4906k.f40198k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    S0.e a9 = c2813Th.f28552b.a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
                    sb.append(elapsedRealtime2);
                    a9.M("webview_startup_l", sb.toString());
                    a9.N();
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ef)).booleanValue()) {
                    AbstractC3436jg.f32060f.execute(new RunnableC3134e(25, c2813Th));
                    return;
                }
                return;
            case 6:
                ((C4260yv) this.f34560u).b((String) this.f34561v, (C4543G) this.f34562w, null, null);
                return;
            case 7:
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                String[] strArr = {(String) this.f34561v};
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f34560u;
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", strArr);
                C2821Tp.j(sQLiteDatabase, (x2.l) this.f34562w);
                return;
            case 8:
                C3019br.c((Yt) this.f34560u, (St) this.f34561v, (C3500kq) this.f34562w);
                return;
            case 9:
                if (((Hv) this.f34560u).f26152b.compareAndSet(false, true)) {
                    ((Cv) this.f34561v).b((Fv) this.f34562w, true);
                    return;
                }
                return;
            case 10:
                Pz pz = (Pz) this.f34560u;
                HashMap a10 = pz.f27687e.a();
                HashMap hashMap = (HashMap) this.f34561v;
                hashMap.putAll(a10);
                pz.g(hashMap);
                hashMap.put("f", com.anythink.expressad.foundation.d.d.bu);
                hashMap.put("ctx", (Context) this.f34562w);
                return;
            case 11:
                C4276zA c4276zA = (C4276zA) this.f34561v;
                C4659e c4659e = (C4659e) this.f34562w;
                FA fa = (FA) this.f34560u;
                String str2 = fa.f25509b;
                try {
                    C2618Hq c2618Hq = fa.f25508a;
                    if (c2618Hq == null) {
                        throw null;
                    }
                    InterfaceC4222yA interfaceC4222yA = (InterfaceC4222yA) c2618Hq.f26131C;
                    if (interfaceC4222yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str2);
                    String str3 = c4276zA.f36088a;
                    if (!FA.b(str3)) {
                        str3.getClass();
                        bundle.putString("sessionToken", str3.trim());
                    }
                    String str4 = c4276zA.f36089b;
                    if (!FA.b(str4)) {
                        str4.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f23194u, str4.trim());
                    }
                    EA ea = new EA(fa, c4659e);
                    C4114wA c4114wA = (C4114wA) interfaceC4222yA;
                    Parcel F02 = c4114wA.F0();
                    AbstractC3411j8.c(F02, bundle);
                    AbstractC3411j8.e(F02, ea);
                    c4114wA.h1(F02, 2);
                    return;
                } catch (RemoteException e9) {
                    FA.f25506c.d(e9, "dismiss overlay display from: %s", str2);
                    return;
                }
            case 12:
                BA ba = (BA) this.f34561v;
                C4659e c4659e2 = (C4659e) this.f34562w;
                FA fa2 = (FA) this.f34560u;
                String str5 = fa2.f25509b;
                try {
                    C2618Hq c2618Hq2 = fa2.f25508a;
                    if (c2618Hq2 == null) {
                        throw null;
                    }
                    InterfaceC4222yA interfaceC4222yA2 = (InterfaceC4222yA) c2618Hq2.f26131C;
                    if (interfaceC4222yA2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str5);
                    bundle2.putBinder("windowToken", ba.f24625a);
                    String str6 = ba.f24630f;
                    if (!FA.b(str6)) {
                        str6.getClass();
                        bundle2.putString("adFieldEnifd", str6.trim());
                    }
                    bundle2.putInt("layoutGravity", ba.f24627c);
                    bundle2.putFloat("layoutVerticalMargin", ba.f24628d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("theme", 0);
                    bundle2.putInt("windowWidthPx", ba.f24629e);
                    if (!FA.b(null)) {
                        throw null;
                    }
                    if (!FA.b(null)) {
                        throw null;
                    }
                    String str7 = ba.f24626b;
                    if (!FA.b(str7)) {
                        str7.getClass();
                        bundle2.putString(com.anythink.expressad.videocommon.e.b.f23194u, str7.trim());
                    }
                    if (!FA.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    EA ea2 = new EA(fa2, c4659e2);
                    C4114wA c4114wA2 = (C4114wA) interfaceC4222yA2;
                    Parcel F03 = c4114wA2.F0();
                    F03.writeString(str5);
                    AbstractC3411j8.c(F03, bundle2);
                    AbstractC3411j8.e(F03, ea2);
                    c4114wA2.h1(F03, 1);
                    return;
                } catch (RemoteException e10) {
                    FA.f25506c.d(e10, "show overlay display from: %s", str5);
                    return;
                }
            case 13:
                C3159eO c3159eO = (C3159eO) this.f34560u;
                c3159eO.getClass();
                C3523lC f2 = ((OB) this.f34561v).f();
                BO bo2 = c3159eO.f30708c;
                C4074vO c4074vO = bo2.f24672g;
                c4074vO.getClass();
                T8 t82 = bo2.f24669d;
                t82.getClass();
                t82.f28479u = RB.n(f2);
                if (!f2.isEmpty()) {
                    t82.f28482x = (C3860rQ) f2.get(0);
                    C3860rQ c3860rQ = (C3860rQ) this.f34562w;
                    c3860rQ.getClass();
                    t82.f28483y = c3860rQ;
                }
                if (((C3860rQ) t82.f28481w) == null) {
                    t82.f28481w = T8.v(c4074vO, (RB) t82.f28479u, (C3860rQ) t82.f28482x, (K7) t82.f28478n);
                }
                t82.t(c4074vO.F1());
                return;
            case 14:
                Pair pair = (Pair) this.f34561v;
                ((BO) ((C3375iO) this.f34560u).f31814b.f1141C).a(((Integer) pair.first).intValue(), (C3860rQ) pair.second, (C3699oQ) this.f34562w);
                return;
            case 15:
                S0.l lVar = (S0.l) this.f34560u;
                lVar.getClass();
                String str8 = AbstractC3182eu.f30782a;
                BO bo3 = ((HN) lVar.f2927v).f26036n.f27558K;
                C4182xO x10 = bo3.x();
                bo3.s(x10, 1009, new C4042ut(x10, (DP) this.f34561v, (C4235yN) this.f34562w));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f34560u;
                Handler handler = (Handler) this.f34561v;
                final C3553lp c3553lp = (C3553lp) this.f34562w;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eP
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        C3553lp c3553lp2 = c3553lp;
                                        c3553lp2.getClass();
                                        if (Thread.currentThread() == c3553lp2.f32631a) {
                                            c3553lp2.c(-1, C4290zO.f36113u);
                                            c3553lp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3553lp c3553lp3 = c3553lp;
                                        c3553lp3.getClass();
                                        if (Thread.currentThread() == c3553lp3.f32631a) {
                                            c3553lp3.c(-1, C4290zO.f36113u);
                                            c3553lp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C3428jP.f32032o) {
                        try {
                            int i6 = C3428jP.f32034q - 1;
                            C3428jP.f32034q = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C3428jP.f32033p;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                C3428jP.f32033p = null;
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
                                        C3553lp c3553lp2 = c3553lp;
                                        c3553lp2.getClass();
                                        if (Thread.currentThread() == c3553lp2.f32631a) {
                                            c3553lp2.c(-1, C4290zO.f36113u);
                                            c3553lp2.d();
                                            break;
                                        }
                                        break;
                                    default:
                                        C3553lp c3553lp3 = c3553lp;
                                        c3553lp3.getClass();
                                        if (Thread.currentThread() == c3553lp3.f32631a) {
                                            c3553lp3.c(-1, C4290zO.f36113u);
                                            c3553lp3.d();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C3428jP.f32032o) {
                        try {
                            int i9 = C3428jP.f32034q - 1;
                            C3428jP.f32034q = i9;
                            if (i9 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C3428jP.f32033p;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                C3428jP.f32033p = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public RunnableC3888s0(D8 d82, C4220y8 c4220y8, WebView webView, boolean z6) {
        this.f34559n = 2;
        this.f34561v = webView;
        Objects.requireNonNull(d82);
        this.f34562w = d82;
        this.f34560u = new C8(this, c4220y8, webView, z6);
    }

    public RunnableC3888s0(TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg, String str, String str2) {
        this.f34559n = 3;
        this.f34560u = str;
        this.f34561v = str2;
        this.f34562w = textureViewSurfaceTextureListenerC3921sg;
    }
}
