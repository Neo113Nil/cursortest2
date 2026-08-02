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
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import n1.C4765b;
import n2.C4767b;
import n2.C4768c;
import o1.C4800d;
import org.json.JSONException;
import org.json.JSONObject;
import p.BinderC4819e;
import r2.C4906k;
import v2.BinderC5100d;
import w2.C5140B;
import z1.ThreadFactoryC5222b;

/* renamed from: com.google.android.gms.internal.ads.fP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3214fP implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31034n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f31035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f31036v;

    public /* synthetic */ RunnableC3214fP(int i, Object obj, Object obj2) {
        this.f31034n = i;
        this.f31035u = obj;
        this.f31036v = obj2;
    }

    private final void a() {
        C5140B c5140b = (C5140B) this.f31035u;
        Context context = (Context) this.f31036v;
        c5140b.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (c5140b.f41599a) {
                try {
                    c5140b.f41604f = sharedPreferences;
                    c5140b.f41605g = edit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    c5140b.f41606h = c5140b.f41604f.getBoolean("use_https", c5140b.f41606h);
                    c5140b.f41618u = c5140b.f41604f.getBoolean("content_url_opted_out", c5140b.f41618u);
                    c5140b.i = c5140b.f41604f.getString("content_url_hashes", c5140b.i);
                    c5140b.f41608k = c5140b.f41604f.getBoolean("gad_idless", c5140b.f41608k);
                    c5140b.f41619v = c5140b.f41604f.getBoolean("content_vertical_opted_out", c5140b.f41619v);
                    c5140b.f41607j = c5140b.f41604f.getString("content_vertical_hashes", c5140b.f41607j);
                    c5140b.f41615r = c5140b.f41604f.getInt("version_code", c5140b.f41615r);
                    if (((Boolean) AbstractC2619Ia.f26270g.r()).booleanValue() && s2.r.f40506e.f40509c.f32243j) {
                        c5140b.f41611n = new C2909Zf("", 0L);
                    } else {
                        c5140b.f41611n = new C2909Zf(c5140b.f41604f.getString("app_settings_json", c5140b.f41611n.f29694e), c5140b.f41604f.getLong("app_settings_last_update_ms", c5140b.f41611n.f29695f));
                    }
                    c5140b.f41612o = c5140b.f41604f.getLong("app_last_background_time_ms", c5140b.f41612o);
                    c5140b.f41614q = c5140b.f41604f.getInt("request_in_session_count", c5140b.f41614q);
                    c5140b.f41613p = c5140b.f41604f.getLong("first_ad_req_time_ms", c5140b.f41613p);
                    c5140b.f41616s = c5140b.f41604f.getStringSet("never_pool_slots", c5140b.f41616s);
                    c5140b.f41620w = c5140b.f41604f.getString("display_cutout", c5140b.f41620w);
                    c5140b.f41593B = c5140b.f41604f.getInt("app_measurement_npa", c5140b.f41593B);
                    c5140b.f41594C = c5140b.f41604f.getInt("sd_app_measure_npa", c5140b.f41594C);
                    c5140b.f41595D = c5140b.f41604f.getLong("sd_app_measure_npa_ts", c5140b.f41595D);
                    c5140b.f41621x = c5140b.f41604f.getString("inspector_info", c5140b.f41621x);
                    c5140b.f41622y = c5140b.f41604f.getBoolean("linked_device", c5140b.f41622y);
                    c5140b.f41623z = c5140b.f41604f.getString("linked_ad_unit", c5140b.f41623z);
                    c5140b.f41592A = c5140b.f41604f.getString("inspector_ui_storage", c5140b.f41592A);
                    c5140b.f41609l = c5140b.f41604f.getString("IABTCF_TCString", c5140b.f41609l);
                    c5140b.f41610m = c5140b.f41604f.getInt("gad_has_consent_for_cookies", c5140b.f41610m);
                    c5140b.f41596E = c5140b.f41604f.getBoolean("is_install_referrer_reported", c5140b.f41596E);
                    c5140b.f41597F = c5140b.f41604f.getInt("total_inflight_ad_limit", c5140b.f41597F);
                    c5140b.f41598G = c5140b.f41604f.getInt("default_queue_capacity", c5140b.f41598G);
                    try {
                        c5140b.f41617t = new JSONObject(c5140b.f41604f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e9) {
                        int i = w2.z.f41712b;
                        x2.i.g("Could not convert native advanced settings to json object", e9);
                    }
                    c5140b.j();
                } finally {
                }
            }
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th);
            w2.z.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2521Ce c2521Ce;
        boolean z6 = false;
        switch (this.f31034n) {
            case 0:
                ME me = (ME) this.f31035u;
                if (((C3268gP) me.f27064e) == null || (c2521Ce = (C2521Ce) ((C4323b) ((C4042ut) me.f27062c).f35366u).f36422f) == null) {
                    return;
                }
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f31036v;
                if (audioDeviceInfo.equals((AudioDeviceInfo) c2521Ce.f24906C)) {
                    return;
                }
                c2521Ce.f24906C = audioDeviceInfo;
                C2764Qj c2764Qj = (C2764Qj) c2521Ce.f24907D;
                List j6 = c2521Ce.j();
                C3523lC c3523lC = KO.f26667e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context = c2521Ce.f24908n;
                c2521Ce.k(KO.a(context, context.registerReceiver(null, intentFilter), c2764Qj, audioDeviceInfo, j6));
                return;
            case 1:
                EP ep = (EP) this.f31035u;
                ep.f25376v.h();
                IP ip = ep.f25375u;
                RunnableC3214fP runnableC3214fP = (RunnableC3214fP) this.f31036v;
                synchronized (ip.f26244a) {
                    ip.b();
                    runnableC3214fP.run();
                }
                return;
            case 2:
                SP sp = (SP) this.f31035u;
                sp.f28238W.set(sp.o((S0.l) this.f31036v, sp.f28226Q, 0));
                return;
            case 3:
                ((InterfaceC3068cn) this.f31035u).mo9a(this.f31036v);
                return;
            case 4:
                FQ fq = (FQ) this.f31035u;
                T1 t12 = fq.J;
                InterfaceC3136e1 interfaceC3136e1 = (InterfaceC3136e1) this.f31036v;
                fq.f25574S = t12 == null ? interfaceC3136e1 : new V0(com.anythink.basead.exoplayer.b.f7168b, 0L);
                fq.f25575T = interfaceC3136e1.c();
                if (!fq.f25581i0 && interfaceC3136e1.c() == com.anythink.basead.exoplayer.b.f7168b) {
                    z6 = true;
                }
                fq.f25576U = z6;
                fq.f25577V = true == z6 ? 7 : 1;
                if (fq.f25570O) {
                    fq.f25592y.s(fq.f25575T, interfaceC3136e1, z6);
                    return;
                } else {
                    fq.r();
                    return;
                }
            case 5:
                if (((l3.m) this.f31035u).f38884d) {
                    ((l3.j) this.f31036v).f38876w.m();
                    return;
                }
                try {
                    ((l3.j) this.f31036v).f38876w.l(((l3.j) this.f31036v).f38875v.g((l3.m) this.f31035u));
                    return;
                } catch (l3.f e9) {
                    if (e9.getCause() instanceof Exception) {
                        ((l3.j) this.f31036v).f38876w.k((Exception) e9.getCause());
                        return;
                    } else {
                        ((l3.j) this.f31036v).f38876w.k(e9);
                        return;
                    }
                } catch (Exception e10) {
                    ((l3.j) this.f31036v).f38876w.k(e10);
                    return;
                }
            case 6:
                l3.j jVar = (l3.j) this.f31036v;
                try {
                    l3.m mVar = (l3.m) jVar.f38875v.g((l3.m) this.f31035u);
                    if (mVar == null) {
                        jVar.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    P1.f fVar = l3.i.f38872b;
                    mVar.c(fVar, jVar);
                    mVar.b(fVar, jVar);
                    mVar.f38882b.f(new l3.k(fVar, (l3.b) jVar));
                    mVar.o();
                    return;
                } catch (l3.f e11) {
                    if (e11.getCause() instanceof Exception) {
                        jVar.f38876w.k((Exception) e11.getCause());
                        return;
                    } else {
                        jVar.f38876w.k(e11);
                        return;
                    }
                } catch (Exception e12) {
                    jVar.f38876w.k(e12);
                    return;
                }
            case 7:
                synchronized (((l3.k) this.f31036v).f38878u) {
                    ((l3.c) ((l3.k) this.f31036v).f38880w).r((l3.m) this.f31035u);
                }
                return;
            case 8:
                synchronized (((l3.k) this.f31036v).f38878u) {
                    try {
                        l3.d dVar = (l3.d) ((l3.k) this.f31036v).f38880w;
                        if (dVar != null) {
                            Exception f2 = ((l3.m) this.f31035u).f();
                            R2.w.h(f2);
                            dVar.d(f2);
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                synchronized (((l3.k) this.f31036v).f38878u) {
                    try {
                        l3.e eVar = (l3.e) ((l3.k) this.f31036v).f38880w;
                        if (eVar != null) {
                            eVar.b(((l3.m) this.f31035u).g());
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                l3.k kVar = (l3.k) this.f31036v;
                try {
                    l3.m a9 = ((l3.g) kVar.f38878u).a(((l3.m) this.f31035u).g());
                    P1.f fVar2 = l3.i.f38872b;
                    a9.c(fVar2, kVar);
                    a9.b(fVar2, kVar);
                    a9.f38882b.f(new l3.k(fVar2, (l3.b) kVar));
                    a9.o();
                    return;
                } catch (CancellationException unused) {
                    kVar.c();
                    return;
                } catch (l3.f e13) {
                    if (e13.getCause() instanceof Exception) {
                        kVar.d((Exception) e13.getCause());
                        return;
                    } else {
                        kVar.d(e13);
                        return;
                    }
                } catch (Exception e14) {
                    kVar.d(e14);
                    return;
                }
            case 11:
                l3.m mVar2 = (l3.m) this.f31035u;
                try {
                    mVar2.l(((Callable) this.f31036v).call());
                    return;
                } catch (Exception e15) {
                    mVar2.k(e15);
                    return;
                } catch (Throwable th) {
                    mVar2.k(new RuntimeException(th));
                    return;
                }
            case 12:
                s2.F0 f02 = (s2.F0) this.f31036v;
                m2.e eVar2 = (m2.e) this.f31035u;
                eVar2.getClass();
                try {
                    eVar2.f39372b.j3(s2.e1.a(eVar2.f39371a, f02));
                    return;
                } catch (RemoteException e16) {
                    x2.i.d("Failed to load ad.", e16);
                    return;
                }
            case 13:
                m2.g gVar = (m2.g) this.f31036v;
                m2.l lVar = (m2.l) this.f31035u;
                try {
                    lVar.f39393n.b(gVar.f39373a);
                    return;
                } catch (IllegalStateException e17) {
                    C2521Ce.a(lVar.getContext()).e("BaseAdView.loadAd", e17);
                    return;
                }
            case 14:
                try {
                    ((C4765b) this.f31036v).f39621u.put((C4800d) this.f31035u);
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 15:
                C4767b c4767b = (C4767b) this.f31036v;
                C4768c c4768c = (C4768c) this.f31035u;
                c4768c.getClass();
                try {
                    c4768c.f39393n.b(c4767b.f39373a);
                    return;
                } catch (IllegalStateException e18) {
                    C2521Ce.a(c4768c.getContext()).e("AdManagerAdView.loadAd", e18);
                    return;
                }
            case 16:
                ((BinderC4819e) this.f31036v).f39796u.d((Bundle) this.f31035u);
                return;
            case 17:
                W.e eVar3 = ((SwipeDismissBehavior) this.f31036v).f36591a;
                if (eVar3 == null || !eVar3.g()) {
                    return;
                }
                WeakHashMap weakHashMap = O.X.f2142a;
                ((View) this.f31035u).postOnAnimation(this);
                return;
            case 18:
                C4906k.f40186C.f40198k.getClass();
                C3404j1.z((C3230fo) this.f31035u, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f31036v).longValue());
                return;
            case 19:
                s2.G0 g02 = (s2.G0) this.f31035u;
                g02.getClass();
                g02.f40346l.addView((View) Y2.b.D0((Y2.a) this.f31036v));
                return;
            case 20:
                ((BinderC5100d) ((C2954ag) this.f31035u).f29844w).f41114u.getWindow().setBackgroundDrawable((BitmapDrawable) this.f31036v);
                return;
            case 21:
                a();
                return;
            default:
                ThreadFactoryC5222b threadFactoryC5222b = (ThreadFactoryC5222b) this.f31036v;
                if (threadFactoryC5222b.f42224d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f31035u).run();
                    return;
                } catch (Throwable th2) {
                    threadFactoryC5222b.f42223c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC3214fP(Object obj, Object obj2, int i, boolean z6) {
        this.f31034n = i;
        this.f31036v = obj;
        this.f31035u = obj2;
    }

    public RunnableC3214fP(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z6) {
        this.f31034n = 17;
        this.f31036v = swipeDismissBehavior;
        this.f31035u = view;
    }
}
