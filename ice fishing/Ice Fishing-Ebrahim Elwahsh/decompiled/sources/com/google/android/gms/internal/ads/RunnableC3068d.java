package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProfileStore;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4313b;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC4846f;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3068d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29770n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29771u;

    public /* synthetic */ RunnableC3068d(int i, Object obj) {
        this.f29770n = i;
        this.f29771u = obj;
    }

    private final void a() {
        C4102w8 c4102w8 = (C4102w8) this.f29771u;
        synchronized (c4102w8.f34948v) {
            if (c4102w8.f34949w.get() && c4102w8.f34950x) {
                c4102w8.f34949w.set(false);
                int i = t2.C.f40822b;
                u2.i.a("App went background");
                Iterator it = c4102w8.f34951y.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC4156x8) it.next()).i0(false);
                    } catch (Exception e6) {
                        u2.i.d("", e6);
                    }
                }
            } else {
                int i4 = t2.C.f40822b;
                u2.i.a("App is still foreground");
            }
        }
    }

    private final void b() {
        C3398j5 c3398j5 = (C3398j5) this.f29771u;
        synchronized (c3398j5) {
            try {
                com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) c3398j5.f32085v;
                if (oVar.f23623u) {
                    InterfaceC3563m8 interfaceC3563m8 = (InterfaceC3563m8) oVar.f23624v;
                    byte[] bArr = (byte[]) c3398j5.f32084u;
                    C3455k8 c3455k8 = (C3455k8) interfaceC3563m8;
                    Parcel A02 = c3455k8.A0();
                    A02.writeByteArray(bArr);
                    c3455k8.G0(A02, 5);
                    C3455k8 c3455k82 = (C3455k8) ((InterfaceC3563m8) oVar.f23624v);
                    Parcel A03 = c3455k82.A0();
                    A03.writeInt(0);
                    c3455k82.G0(A03, 6);
                    InterfaceC3563m8 interfaceC3563m82 = (InterfaceC3563m8) oVar.f23624v;
                    int i = c3398j5.f32083n;
                    C3455k8 c3455k83 = (C3455k8) interfaceC3563m82;
                    Parcel A04 = c3455k83.A0();
                    A04.writeInt(i);
                    c3455k83.G0(A04, 7);
                    C3455k8 c3455k84 = (C3455k8) ((InterfaceC3563m8) oVar.f23624v);
                    Parcel A05 = c3455k84.A0();
                    A05.writeIntArray(null);
                    c3455k84.G0(A05, 4);
                    C3455k8 c3455k85 = (C3455k8) ((InterfaceC3563m8) oVar.f23624v);
                    c3455k85.G0(c3455k85.A0(), 3);
                }
            } catch (RemoteException e6) {
                u2.i.b("Clearcut log failed", e6);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        C4313b c4313b = (C4313b) this.f29771u;
        c4313b.getClass();
        while (true) {
            try {
                C3636na c3636na = (C3636na) ((ArrayBlockingQueue) c4313b.f35811a).take();
                C3582ma b9 = c3636na.b();
                if (!TextUtils.isEmpty(b9.f32700u)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c4313b.f35812b;
                    synchronized (c3636na.f32867c) {
                        p2.j.f39798C.f39808h.a();
                        linkedHashMap = c3636na.f32866b;
                    }
                    c4313b.g(c4313b.d(linkedHashMap2, linkedHashMap), b9);
                }
            } catch (InterruptedException e6) {
                int i = t2.C.f40822b;
                u2.i.g("CsiReporter:reporter interrupted", e6);
                return;
            }
        }
    }

    private final void d() {
        q2.r rVar;
        long longValue;
        long intValue;
        boolean booleanValue;
        q2.r rVar2;
        long j9;
        long j10;
        long j11;
        long j12;
        C2859Xg c2859Xg = (C2859Xg) this.f29771u;
        String o9 = C2859Xg.o(c2859Xg.f28665x);
        try {
            C3151ea c3151ea = AbstractC3368ia.f31679h0;
            rVar = q2.r.f40116e;
            longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue() * 1000;
            intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31391A)).intValue();
            booleanValue = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue();
        } catch (Exception e6) {
            String str = c2859Xg.f28665x;
            String message = e6.getMessage();
            String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = t2.C.f40822b;
            u2.i.f(q6);
            p2.j.f39798C.f39808h.e("VideoStreamExoPlayerCache.preload", e6);
            c2859Xg.a();
            c2859Xg.m(c2859Xg.f28665x, o9, "error", C2859Xg.p("error", e6));
        }
        synchronized (c2859Xg) {
            try {
                p2.j.f39798C.f39810k.getClass();
                if (System.currentTimeMillis() - c2859Xg.f28662B > longValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(longValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (c2859Xg.f28666y) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!c2859Xg.f28667z) {
                    IO io = c2859Xg.f28664w.f31054z;
                    if (!(io != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long w12 = io.w1();
                    if (w12 > 0) {
                        long z12 = c2859Xg.f28664w.f31054z.z1();
                        if (z12 != c2859Xg.f28663C) {
                            boolean z8 = z12 > 0;
                            String str2 = c2859Xg.f28665x;
                            if (booleanValue) {
                                C3267gh c3267gh = c2859Xg.f28664w;
                                j12 = (c3267gh.f31046L == null || !c3267gh.f31046L.f29542I) ? c3267gh.f31039D : 0L;
                            } else {
                                j12 = -1;
                            }
                            long p6 = booleanValue ? c2859Xg.f28664w.p() : -1L;
                            j9 = intValue;
                            rVar2 = rVar;
                            j11 = z12;
                            j10 = w12;
                            u2.d.f41224b.post(new RunnableC2706Og(c2859Xg, str2, o9, z12, w12, j12, p6, booleanValue ? c2859Xg.f28664w.r() : -1L, z8, C3267gh.f31034N.get(), C3267gh.f31035O.get()));
                            c2859Xg.f28663C = j11;
                        } else {
                            rVar2 = rVar;
                            j9 = intValue;
                            j10 = w12;
                            j11 = z12;
                        }
                        if (j11 >= j10) {
                            u2.d.f41224b.post(new RunnableC2757Rg(c2859Xg, c2859Xg.f28665x, o9, j10));
                        } else if (c2859Xg.f28664w.f31039D >= j9 && j11 > 0) {
                        }
                    } else {
                        rVar2 = rVar;
                    }
                    t2.G.f40858l.postDelayed(new RunnableC3068d(21, c2859Xg), ((Long) rVar2.f40119c.a(AbstractC3368ia.f31688i0)).longValue());
                    return;
                }
                p2.j.f39798C.f39799A.f26358n.remove(c2859Xg.f28661A);
            } finally {
            }
        }
    }

    private final void e() {
        boolean z8;
        C3166ep c3166ep = (C3166ep) this.f29771u;
        c3166ep.getClass();
        try {
            t2.E e6 = c3166ep.f30512d;
            e6.i();
            synchronized (e6.f40830a) {
                z8 = e6.f40827E;
            }
            if (z8) {
                return;
            }
            C3111dp c3111dp = c3166ep.f30510b;
            c3111dp.f30231b = new C3877s(c3111dp.f30230a);
            c3111dp.a(new C3562m7(c3166ep));
        } catch (Exception e9) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31531Q5)).booleanValue()) {
                if (c3166ep.f30514f == null) {
                    c3166ep.f30514f = C4287ze.c(c3166ep.f30509a);
                }
                c3166ep.f30514f.e("InstallReferrerUnsampled.initializeAndReport", e9);
            } else {
                if (c3166ep.f30513e == null) {
                    c3166ep.f30513e = C4287ze.a(c3166ep.f30509a);
                }
                c3166ep.f30513e.e("InstallReferrer.initializeAndReport", e9);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        String b9;
        C3165eo c3165eo;
        ActivityManager.MemoryInfo i;
        ProfileStore profileStore = null;
        boolean z9 = false;
        int i4 = 1;
        switch (this.f29770n) {
            case 0:
                ((C3554m) this.f29771u).i();
                return;
            case 1:
                ((P) this.f29771u).f26797h.a();
                return;
            case 2:
                C3178f0 c3178f0 = (C3178f0) this.f29771u;
                c3178f0.f30574m--;
                return;
            case 3:
                ChoreographerVsyncCallbackC3555m0 choreographerVsyncCallbackC3555m0 = (ChoreographerVsyncCallbackC3555m0) this.f29771u;
                choreographerVsyncCallbackC3555m0.f32230n.postVsyncCallback(choreographerVsyncCallbackC3555m0);
                return;
            case 4:
                C3130e7 c3130e7 = (C3130e7) this.f29771u;
                synchronized (c3130e7.f30313H) {
                    if (c3130e7.f30314I) {
                        return;
                    }
                    c3130e7.f30314I = true;
                    try {
                        c3130e7.l();
                    } catch (Exception e6) {
                        ((C3130e7) this.f29771u).f30320y.c(2023, -1L, e6);
                    }
                    C3130e7 c3130e72 = (C3130e7) this.f29771u;
                    synchronized (c3130e72.f30313H) {
                        c3130e72.f30314I = false;
                    }
                    return;
                }
            case 5:
                C3185f7 c3185f7 = (C3185f7) this.f29771u;
                if (c3185f7.f30628b != null) {
                    return;
                }
                synchronized (C3185f7.f30624c) {
                    if (c3185f7.f30628b != null) {
                        return;
                    }
                    try {
                        z8 = ((Boolean) AbstractC3368ia.f31764q3.r()).booleanValue();
                    } catch (IllegalStateException unused) {
                        z8 = false;
                    }
                    if (z8) {
                        try {
                            C3185f7.f30625d = C3119dx.a(((C3185f7) this.f29771u).f30627a.f34929a, "ADSHIELD");
                        } catch (Throwable unused2) {
                        }
                    }
                    z9 = z8;
                    ((C3185f7) this.f29771u).f30628b = Boolean.valueOf(z9);
                    C3185f7.f30624c.open();
                    return;
                }
            case 6:
                ((B7) this.f29771u).c();
                return;
            case 7:
                O7 o72 = (O7) this.f29771u;
                o72.getClass();
                try {
                    C4101w7 c4101w7 = o72.f26652a;
                    DexClassLoader dexClassLoader = c4101w7.f34931c;
                    byte[] bArr = c4101w7.f34933e;
                    String str = o72.f26653b;
                    c4101w7.f34932d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(T2.y(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        byte[] bArr2 = c4101w7.f34933e;
                        String str2 = o72.f26654c;
                        o72.f26652a.f34932d.getClass();
                        o72.f26655d = loadClass.getMethod(new String(T2.y(str2, bArr2), "UTF-8"), o72.f26656e);
                    }
                } catch (C3616n7 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th) {
                    o72.f26657f.countDown();
                    throw th;
                }
                o72.f26657f.countDown();
                return;
            case 8:
                ((ViewOnAttachStateChangeListenerC3779q8) this.f29771u).d(3);
                return;
            case 9:
                a();
                return;
            case 10:
                ((Q8) this.f29771u).p();
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                C3851ra c3851ra = (C3851ra) this.f29771u;
                Context context = c3851ra.f34042u;
                if (c3851ra.f34045x != null || context == null || (b9 = AbstractC4846f.b(context)) == null || b9.equals(context.getPackageName())) {
                    return;
                }
                AbstractC4846f.a(context, b9, c3851ra);
                return;
            case 14:
                ((C4067va) this.f29771u).d();
                return;
            case 15:
                N1.h hVar = (N1.h) this.f29771u;
                if (((T8) hVar.f1962n) == null) {
                    return;
                }
                ((T8) hVar.f1962n).h();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((A3) this.f29771u).f23812y).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f29771u).getAndSet(true);
                return;
            case 18:
                break;
            case 19:
                ((AbstractC3804qg) this.f29771u).g();
                return;
            case 20:
                p2.j.f39798C.f39799A.f26358n.remove((C2638Kg) this.f29771u);
                return;
            case 21:
                d();
                return;
            case 22:
                C2486Bh c2486Bh = ((C2588Hh) this.f29771u).f25405n;
                b8.j jVar = c2486Bh.f24059n.f24507y0;
                jVar.f5602d = true;
                if (jVar.f5601c) {
                    jVar.d();
                }
                BinderC4996d w02 = c2486Bh.f24059n.w0();
                if (w02 != null) {
                    w02.f40442E.removeView(w02.f40459y);
                    w02.K3(true);
                    return;
                }
                return;
            case 23:
                int i9 = C2588Hh.f25380o0;
                C4313b a9 = p2.j.f39798C.f39808h.a();
                HashSet hashSet = (HashSet) a9.f35817g;
                String str3 = (String) this.f29771u;
                if (hashSet.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) a9.f35816f);
                linkedHashMap.put("ue", str3);
                a9.g(a9.d((LinkedHashMap) a9.f35812b, linkedHashMap), null);
                return;
            case 24:
                C3431jl c3431jl = p2.j.f39798C.f39823x;
                Wv wv = ((C3330hq) this.f29771u).f31272a;
                c3431jl.getClass();
                C3431jl.r(new RunnableC3058cq(wv, i4));
                return;
            case 25:
                C2741Qh c2741Qh = (C2741Qh) this.f29771u;
                c2741Qh.getClass();
                p2.j.f39798C.f39810k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C2690Nh c2690Nh = c2741Qh.f27198a;
                c2690Nh.getClass();
                if (!com.bumptech.glide.h.s("MULTI_PROFILE")) {
                    int i10 = t2.C.f40822b;
                    u2.i.a("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e9) {
                    String valueOf = String.valueOf(e9.getMessage());
                    int i11 = t2.C.f40822b;
                    u2.i.a("Unable to get ProfileStore instance: ".concat(valueOf));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                        u2.i.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e10.getMessage())));
                    }
                }
                C3165eo c3165eo2 = c2741Qh.f27199b;
                if (profileStore == null) {
                    int i12 = t2.C.f40822b;
                    u2.i.f("WebViewCompat failure: No instance");
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.wf)).booleanValue()) {
                        C2593Hm a10 = c3165eo2.a();
                        a10.r(NativeAdvancedJsUtils.f18064p, "webview_p_f");
                        a10.r("webview_p_f", "No instance");
                        a10.s();
                        return;
                    }
                    return;
                }
                c2690Nh.f26591a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.wf)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    C2593Hm a11 = c3165eo2.a();
                    a11.r(NativeAdvancedJsUtils.f18064p, "webview_p_l");
                    a11.r("webview_p_l", Long.toString(elapsedRealtime2));
                    a11.s();
                    return;
                }
                return;
            case 26:
                ((C2775Sh) this.f29771u).a();
                return;
            case 27:
                e();
                return;
            case 28:
                ((C2810Ui) this.f29771u).f28064u.f28286d.k();
                return;
            default:
                C2895Zi c2895Zi = ((C2810Ui) this.f29771u).f28064u.f28286d;
                synchronized (c2895Zi) {
                    c2895Zi.a();
                    c2895Zi.f29045B = true;
                }
                return;
        }
        while (true) {
            C3048cg c3048cg = (C3048cg) this.f29771u;
            if (!c3048cg.f29724e.get()) {
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            t2.G.f40858l.post(new RunnableC3068d(17, atomicBoolean));
            try {
                Thread.sleep(c3048cg.f29725f);
                if (!atomicBoolean.get()) {
                    C3151ea c3151ea = AbstractC3368ia.nf;
                    q2.r rVar = q2.r.f40116e;
                    boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
                    SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                    if (booleanValue && (c3165eo = c3048cg.f29721b) != null) {
                        C2593Hm a12 = c3165eo.a();
                        a12.r(NativeAdvancedJsUtils.f18064p, "panr");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Pf)).booleanValue() && (i = u2.d.i(c3048cg.f29722c)) != null) {
                            a12.r("mem_avl", String.valueOf(i.availMem));
                            a12.r("mem_tt", String.valueOf(i.totalMem));
                            a12.r("low_m", true != i.lowMemory ? "0" : "1");
                        }
                        a12.v();
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.of)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        K2.m mVar = new K2.m("Potential ANR detected");
                        mVar.setStackTrace(stackTrace);
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.pf)).booleanValue()) {
                            C4287ze.c(c3048cg.f29722c).f(mVar, "AnrWatchdog", ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.qf)).intValue() / 100.0f);
                        } else {
                            p2.j.f39798C.f39808h.d("AnrWatchdog", mVar);
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(c3048cg.f29726g);
                    } catch (InterruptedException unused4) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused5) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public RunnableC3068d(N1.h hVar) {
        this.f29770n = 15;
        Objects.requireNonNull(hVar);
        this.f29771u = hVar;
    }

    public RunnableC3068d(C3130e7 c3130e7) {
        this.f29770n = 4;
        Objects.requireNonNull(c3130e7);
        this.f29771u = c3130e7;
    }

    public RunnableC3068d(C3185f7 c3185f7) {
        this.f29770n = 5;
        Objects.requireNonNull(c3185f7);
        this.f29771u = c3185f7;
    }

    public RunnableC3068d(B7 b72) {
        this.f29770n = 6;
        Objects.requireNonNull(b72);
        this.f29771u = b72;
    }

    public RunnableC3068d(O7 o72) {
        this.f29770n = 7;
        Objects.requireNonNull(o72);
        this.f29771u = o72;
    }

    public RunnableC3068d(Q8 q82) {
        this.f29770n = 10;
        Objects.requireNonNull(q82);
        this.f29771u = q82;
    }

    public RunnableC3068d(C2638Kg c2638Kg) {
        this.f29770n = 20;
        Objects.requireNonNull(c2638Kg);
        this.f29771u = c2638Kg;
    }
}
