package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioDeviceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import l1.C4656b;
import l2.C4658b;
import l2.C4659c;
import m1.C4729d;
import org.json.JSONException;
import org.json.JSONObject;
import p.BinderC4815e;
import p2.C4835j;
import t2.BinderC5036d;
import u2.C5069B;
import x1.ThreadFactoryC5185b;

/* renamed from: com.google.android.gms.internal.ads.fP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3191fP implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30247n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f30248u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f30249v;

    public /* synthetic */ RunnableC3191fP(int i, Object obj, Object obj2) {
        this.f30247n = i;
        this.f30248u = obj;
        this.f30249v = obj2;
    }

    private final void a() {
        C5069B c5069b = (C5069B) this.f30248u;
        Context context = (Context) this.f30249v;
        c5069b.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (c5069b.f41209a) {
                try {
                    c5069b.f41214f = sharedPreferences;
                    c5069b.f41215g = edit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    c5069b.f41216h = c5069b.f41214f.getBoolean("use_https", c5069b.f41216h);
                    c5069b.f41228u = c5069b.f41214f.getBoolean("content_url_opted_out", c5069b.f41228u);
                    c5069b.i = c5069b.f41214f.getString("content_url_hashes", c5069b.i);
                    c5069b.f41218k = c5069b.f41214f.getBoolean("gad_idless", c5069b.f41218k);
                    c5069b.f41229v = c5069b.f41214f.getBoolean("content_vertical_opted_out", c5069b.f41229v);
                    c5069b.f41217j = c5069b.f41214f.getString("content_vertical_hashes", c5069b.f41217j);
                    c5069b.f41225r = c5069b.f41214f.getInt("version_code", c5069b.f41225r);
                    if (((Boolean) AbstractC2599Ia.f25521g.r()).booleanValue() && q2.r.f40207e.f40210c.f31466j) {
                        c5069b.f41221n = new C2886Zf("", 0L);
                    } else {
                        c5069b.f41221n = new C2886Zf(c5069b.f41214f.getString("app_settings_json", c5069b.f41221n.f28917e), c5069b.f41214f.getLong("app_settings_last_update_ms", c5069b.f41221n.f28918f));
                    }
                    c5069b.f41222o = c5069b.f41214f.getLong("app_last_background_time_ms", c5069b.f41222o);
                    c5069b.f41224q = c5069b.f41214f.getInt("request_in_session_count", c5069b.f41224q);
                    c5069b.f41223p = c5069b.f41214f.getLong("first_ad_req_time_ms", c5069b.f41223p);
                    c5069b.f41226s = c5069b.f41214f.getStringSet("never_pool_slots", c5069b.f41226s);
                    c5069b.f41230w = c5069b.f41214f.getString("display_cutout", c5069b.f41230w);
                    c5069b.f41203B = c5069b.f41214f.getInt("app_measurement_npa", c5069b.f41203B);
                    c5069b.f41204C = c5069b.f41214f.getInt("sd_app_measure_npa", c5069b.f41204C);
                    c5069b.f41205D = c5069b.f41214f.getLong("sd_app_measure_npa_ts", c5069b.f41205D);
                    c5069b.f41231x = c5069b.f41214f.getString("inspector_info", c5069b.f41231x);
                    c5069b.f41232y = c5069b.f41214f.getBoolean("linked_device", c5069b.f41232y);
                    c5069b.f41233z = c5069b.f41214f.getString("linked_ad_unit", c5069b.f41233z);
                    c5069b.f41202A = c5069b.f41214f.getString("inspector_ui_storage", c5069b.f41202A);
                    c5069b.f41219l = c5069b.f41214f.getString("IABTCF_TCString", c5069b.f41219l);
                    c5069b.f41220m = c5069b.f41214f.getInt("gad_has_consent_for_cookies", c5069b.f41220m);
                    c5069b.f41206E = c5069b.f41214f.getBoolean("is_install_referrer_reported", c5069b.f41206E);
                    c5069b.f41207F = c5069b.f41214f.getInt("total_inflight_ad_limit", c5069b.f41207F);
                    c5069b.f41208G = c5069b.f41214f.getInt("default_queue_capacity", c5069b.f41208G);
                    try {
                        c5069b.f41227t = new JSONObject(c5069b.f41214f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e9) {
                        int i = u2.z.f41322b;
                        v2.i.g("Could not convert native advanced settings to json object", e9);
                    }
                    c5069b.j();
                } finally {
                }
            }
        } catch (Throwable th) {
            C4835j.f39733C.f39743h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th);
            u2.z.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2501Ce c2501Ce;
        boolean z3 = false;
        switch (this.f30247n) {
            case 0:
                ME me = (ME) this.f30248u;
                if (((C3245gP) me.f26273e) == null || (c2501Ce = (C2501Ce) ((C4300b) ((C4019ut) me.f26271c).f34603u).f35653f) == null) {
                    return;
                }
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f30249v;
                if (audioDeviceInfo.equals((AudioDeviceInfo) c2501Ce.f24171C)) {
                    return;
                }
                c2501Ce.f24171C = audioDeviceInfo;
                C2744Qj c2744Qj = (C2744Qj) c2501Ce.f24172D;
                List j6 = c2501Ce.j();
                C3500lC c3500lC = KO.f25915e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context = c2501Ce.f24173n;
                c2501Ce.k(KO.a(context, context.registerReceiver(null, intentFilter), c2744Qj, audioDeviceInfo, j6));
                return;
            case 1:
                EP ep = (EP) this.f30248u;
                ep.f24615v.h();
                IP ip = ep.f24614u;
                RunnableC3191fP runnableC3191fP = (RunnableC3191fP) this.f30249v;
                synchronized (ip.f25501a) {
                    ip.b();
                    runnableC3191fP.run();
                }
                return;
            case 2:
                RP rp = (RP) this.f30248u;
                rp.f27248W.set(rp.o((S0.l) this.f30249v, rp.f27236Q, 0));
                return;
            case 3:
                ((InterfaceC2992bn) this.f30248u).mo10a(this.f30249v);
                return;
            case 4:
                CQ cq = (CQ) this.f30248u;
                T1 t12 = cq.J;
                InterfaceC3113e1 interfaceC3113e1 = (InterfaceC3113e1) this.f30249v;
                cq.f24135S = t12 == null ? interfaceC3113e1 : new V0(com.anythink.basead.exoplayer.b.f6382b, 0L);
                cq.f24136T = interfaceC3113e1.c();
                if (!cq.f24143n0 && interfaceC3113e1.c() == com.anythink.basead.exoplayer.b.f6382b) {
                    z3 = true;
                }
                cq.f24137U = z3;
                cq.f24138V = true == z3 ? 7 : 1;
                if (cq.f24131O) {
                    cq.f24154y.s(cq.f24136T, interfaceC3113e1, z3);
                    return;
                } else {
                    cq.r();
                    return;
                }
            case 5:
                if (((j3.m) this.f30248u).f38372d) {
                    ((j3.j) this.f30249v).f38364w.m();
                    return;
                }
                try {
                    ((j3.j) this.f30249v).f38364w.l(((j3.j) this.f30249v).f38363v.h((j3.m) this.f30248u));
                    return;
                } catch (j3.f e9) {
                    if (e9.getCause() instanceof Exception) {
                        ((j3.j) this.f30249v).f38364w.k((Exception) e9.getCause());
                        return;
                    } else {
                        ((j3.j) this.f30249v).f38364w.k(e9);
                        return;
                    }
                } catch (Exception e10) {
                    ((j3.j) this.f30249v).f38364w.k(e10);
                    return;
                }
            case 6:
                j3.j jVar = (j3.j) this.f30249v;
                try {
                    j3.m mVar = (j3.m) jVar.f38363v.h((j3.m) this.f30248u);
                    if (mVar == null) {
                        jVar.k(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    N1.f fVar = j3.i.f38360b;
                    mVar.c(fVar, jVar);
                    mVar.b(fVar, jVar);
                    mVar.f38370b.f(new j3.k(fVar, (j3.b) jVar));
                    mVar.o();
                    return;
                } catch (j3.f e11) {
                    if (e11.getCause() instanceof Exception) {
                        jVar.f38364w.k((Exception) e11.getCause());
                        return;
                    } else {
                        jVar.f38364w.k(e11);
                        return;
                    }
                } catch (Exception e12) {
                    jVar.f38364w.k(e12);
                    return;
                }
            case 7:
                synchronized (((j3.k) this.f30249v).f38366u) {
                    ((j3.c) ((j3.k) this.f30249v).f38368w).f((j3.m) this.f30248u);
                }
                return;
            case 8:
                synchronized (((j3.k) this.f30249v).f38366u) {
                    try {
                        j3.d dVar = (j3.d) ((j3.k) this.f30249v).f38368w;
                        if (dVar != null) {
                            Exception f3 = ((j3.m) this.f30248u).f();
                            P2.w.h(f3);
                            dVar.k(f3);
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                synchronized (((j3.k) this.f30249v).f38366u) {
                    try {
                        j3.e eVar = (j3.e) ((j3.k) this.f30249v).f38368w;
                        if (eVar != null) {
                            eVar.h(((j3.m) this.f30248u).g());
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                j3.k kVar = (j3.k) this.f30249v;
                try {
                    j3.m a9 = ((j3.g) kVar.f38366u).a(((j3.m) this.f30248u).g());
                    N1.f fVar2 = j3.i.f38360b;
                    a9.c(fVar2, kVar);
                    a9.b(fVar2, kVar);
                    a9.f38370b.f(new j3.k(fVar2, (j3.b) kVar));
                    a9.o();
                    return;
                } catch (j3.f e13) {
                    if (e13.getCause() instanceof Exception) {
                        kVar.k((Exception) e13.getCause());
                        return;
                    } else {
                        kVar.k(e13);
                        return;
                    }
                } catch (CancellationException unused) {
                    kVar.i();
                    return;
                } catch (Exception e14) {
                    kVar.k(e14);
                    return;
                }
            case 11:
                j3.m mVar2 = (j3.m) this.f30248u;
                try {
                    mVar2.l(((Callable) this.f30249v).call());
                    return;
                } catch (Exception e15) {
                    mVar2.k(e15);
                    return;
                } catch (Throwable th) {
                    mVar2.k(new RuntimeException(th));
                    return;
                }
            case 12:
                q2.F0 f02 = (q2.F0) this.f30249v;
                k2.e eVar2 = (k2.e) this.f30248u;
                eVar2.getClass();
                try {
                    eVar2.f38583b.y2(q2.e1.a(eVar2.f38582a, f02));
                    return;
                } catch (RemoteException e16) {
                    v2.i.d("Failed to load ad.", e16);
                    return;
                }
            case 13:
                k2.g gVar = (k2.g) this.f30249v;
                k2.l lVar = (k2.l) this.f30248u;
                try {
                    lVar.f38604n.b(gVar.f38584a);
                    return;
                } catch (IllegalStateException e17) {
                    C2501Ce.a(lVar.getContext()).e("BaseAdView.loadAd", e17);
                    return;
                }
            case 14:
                try {
                    ((C4656b) this.f30249v).f38883u.put((C4729d) this.f30248u);
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 15:
                C4658b c4658b = (C4658b) this.f30249v;
                C4659c c4659c = (C4659c) this.f30248u;
                c4659c.getClass();
                try {
                    c4659c.f38604n.b(c4658b.f38584a);
                    return;
                } catch (IllegalStateException e18) {
                    C2501Ce.a(c4659c.getContext()).e("AdManagerAdView.loadAd", e18);
                    return;
                }
            case 16:
                W.e eVar3 = ((SwipeDismissBehavior) this.f30249v).f35823a;
                if (eVar3 == null || !eVar3.g()) {
                    return;
                }
                WeakHashMap weakHashMap = O.X.f2054a;
                ((View) this.f30248u).postOnAnimation(this);
                return;
            case 17:
                ((BinderC4815e) this.f30249v).f39688u.d((Bundle) this.f30248u);
                return;
            case 18:
                C4835j.f39733C.f39745k.getClass();
                C3381j1.E((C3153eo) this.f30248u, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f30249v).longValue());
                return;
            case 19:
                q2.G0 g02 = (q2.G0) this.f30248u;
                g02.getClass();
                g02.f40047l.addView((View) W2.b.F0((W2.a) this.f30249v));
                return;
            case 20:
                ((BinderC5036d) ((C2931ag) this.f30248u).f29069w).f40826u.getWindow().setBackgroundDrawable((BitmapDrawable) this.f30249v);
                return;
            case 21:
                a();
                return;
            default:
                ThreadFactoryC5185b threadFactoryC5185b = (ThreadFactoryC5185b) this.f30249v;
                if (threadFactoryC5185b.f41762d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f30248u).run();
                    return;
                } catch (Throwable th2) {
                    threadFactoryC5185b.f41761c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC3191fP(Object obj, Object obj2, int i, boolean z3) {
        this.f30247n = i;
        this.f30249v = obj;
        this.f30248u = obj2;
    }

    public RunnableC3191fP(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f30247n = 16;
        this.f30249v = swipeDismissBehavior;
        this.f30248u = view;
    }
}
