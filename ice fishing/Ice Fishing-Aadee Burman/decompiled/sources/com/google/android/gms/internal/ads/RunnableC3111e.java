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
import com.google.android.gms.internal.consent_sdk.C4300b;
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
import p.AbstractC4816f;
import p2.C4835j;
import t2.BinderC5036d;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3111e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29864n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29865u;

    public /* synthetic */ RunnableC3111e(int i, Object obj) {
        this.f29864n = i;
        this.f29865u = obj;
    }

    private final void a() {
        C4251z8 c4251z8 = (C4251z8) this.f29865u;
        synchronized (c4251z8.f35299v) {
            if (c4251z8.f35300w.get() && c4251z8.f35301x) {
                c4251z8.f35300w.set(false);
                int i = u2.z.f41319b;
                v2.i.a("App went background");
                Iterator it = c4251z8.f35302y.iterator();
                while (it.hasNext()) {
                    try {
                        ((B8) it.next()).e0(false);
                    } catch (Exception e9) {
                        v2.i.d("", e9);
                    }
                }
            } else {
                int i6 = u2.z.f41319b;
                v2.i.a("App is still foreground");
            }
        }
    }

    private final void b() {
        C3493l5 c3493l5 = (C3493l5) this.f29865u;
        synchronized (c3493l5) {
            try {
                com.bumptech.glide.manager.p pVar = (com.bumptech.glide.manager.p) c3493l5.f31709v;
                if (pVar.f23469u) {
                    InterfaceC3766q8 interfaceC3766q8 = (InterfaceC3766q8) pVar.f23470v;
                    byte[] bArr = (byte[]) c3493l5.f31708u;
                    C3658o8 c3658o8 = (C3658o8) interfaceC3766q8;
                    Parcel H02 = c3658o8.H0();
                    H02.writeByteArray(bArr);
                    c3658o8.f1(H02, 5);
                    C3658o8 c3658o82 = (C3658o8) ((InterfaceC3766q8) pVar.f23470v);
                    Parcel H03 = c3658o82.H0();
                    H03.writeInt(0);
                    c3658o82.f1(H03, 6);
                    InterfaceC3766q8 interfaceC3766q82 = (InterfaceC3766q8) pVar.f23470v;
                    int i = c3493l5.f31707n;
                    C3658o8 c3658o83 = (C3658o8) interfaceC3766q82;
                    Parcel H04 = c3658o83.H0();
                    H04.writeInt(i);
                    c3658o83.f1(H04, 7);
                    C3658o8 c3658o84 = (C3658o8) ((InterfaceC3766q8) pVar.f23470v);
                    Parcel H05 = c3658o84.H0();
                    H05.writeIntArray(null);
                    c3658o84.f1(H05, 4);
                    C3658o8 c3658o85 = (C3658o8) ((InterfaceC3766q8) pVar.f23470v);
                    c3658o85.f1(c3658o85.H0(), 3);
                }
            } catch (RemoteException e9) {
                v2.i.b("Clearcut log failed", e9);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        C4300b c4300b = (C4300b) this.f29865u;
        c4300b.getClass();
        while (true) {
            try {
                C3785qa c3785qa = (C3785qa) ((ArrayBlockingQueue) c4300b.f35648a).take();
                C3731pa b9 = c3785qa.b();
                if (!TextUtils.isEmpty(b9.f33071a)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c4300b.f35649b;
                    synchronized (c3785qa.f33245c) {
                        C4835j.f39730C.f39740h.a();
                        linkedHashMap = c3785qa.f33244b;
                    }
                    c4300b.g(c4300b.d(linkedHashMap2, linkedHashMap), b9);
                }
            } catch (InterruptedException e9) {
                int i = u2.z.f41319b;
                v2.i.g("CsiReporter:reporter interrupted", e9);
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
        long j6;
        long j9;
        long j10;
        long j11;
        C2986bh c2986bh = (C2986bh) this.f29865u;
        String o6 = C2986bh.o(c2986bh.f29306x);
        try {
            C3301ha c3301ha = AbstractC3569ma.f32260h0;
            rVar = q2.r.f40204e;
            longValue = ((Long) rVar.f40207c.a(c3301ha)).longValue() * 1000;
            intValue = ((Integer) rVar.f40207c.a(AbstractC3569ma.f31968A)).intValue();
            booleanValue = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue();
        } catch (Exception e9) {
            String str = c2986bh.f29306x;
            String message = e9.getMessage();
            String o9 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = u2.z.f41319b;
            v2.i.f(o9);
            C4835j.f39730C.f39740h.e("VideoStreamExoPlayerCache.preload", e9);
            c2986bh.a();
            c2986bh.m(c2986bh.f29306x, o6, "error", C2986bh.p("error", e9));
        }
        synchronized (c2986bh) {
            try {
                C4835j.f39730C.f39742k.getClass();
                if (System.currentTimeMillis() - c2986bh.f29303B > longValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(longValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (c2986bh.f29307y) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!c2986bh.f29308z) {
                    C4051vO c4051vO = c2986bh.f29305w.f31296z;
                    if (!(c4051vO != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long T12 = c4051vO.T1();
                    if (T12 > 0) {
                        long V12 = c2986bh.f29305w.f31296z.V1();
                        if (V12 != c2986bh.f29304C) {
                            boolean z3 = V12 > 0;
                            String str2 = c2986bh.f29306x;
                            if (booleanValue) {
                                C3414jh c3414jh = c2986bh.f29305w;
                                j11 = (c3414jh.f31288L == null || !c3414jh.f31288L.f30295I) ? c3414jh.f31281D : 0L;
                            } else {
                                j11 = -1;
                            }
                            long p9 = booleanValue ? c2986bh.f29305w.p() : -1L;
                            j6 = intValue;
                            rVar2 = rVar;
                            j10 = V12;
                            j9 = T12;
                            v2.d.f41395b.post(new RunnableC2758Rg(c2986bh, str2, o6, V12, T12, j11, p9, booleanValue ? c2986bh.f29305w.q() : -1L, z3, C3414jh.f31276N.get(), C3414jh.f31277O.get()));
                            c2986bh.f29304C = j10;
                        } else {
                            rVar2 = rVar;
                            j6 = intValue;
                            j9 = T12;
                            j10 = V12;
                        }
                        if (j10 >= j9) {
                            v2.d.f41395b.post(new RunnableC2807Ug(c2986bh, c2986bh.f29306x, o6, j9));
                        } else if (c2986bh.f29305w.f31281D >= j6 && j10 > 0) {
                        }
                    } else {
                        rVar2 = rVar;
                    }
                    u2.D.f41234l.postDelayed(new RunnableC3111e(21, c2986bh), ((Long) rVar2.f40207c.a(AbstractC3569ma.f32269i0)).longValue());
                    return;
                }
                C4835j.f39730C.f39731A.f26840n.remove(c2986bh.f29302A);
            } finally {
            }
        }
    }

    private final void e() {
        boolean z3;
        C3047cp c3047cp = (C3047cp) this.f29865u;
        c3047cp.getClass();
        try {
            C5069B c5069b = c3047cp.f29605d;
            c5069b.i();
            synchronized (c5069b.f41206a) {
                z3 = c5069b.f41203E;
            }
            if (z3) {
                return;
            }
            C2994bp c2994bp = c3047cp.f29603b;
            c2994bp.f29331b = new C3918t(c2994bp.f29330a);
            c2994bp.a(new C3657o7(c3047cp));
        } catch (Exception e9) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32111Q5)).booleanValue()) {
                if (c3047cp.f29607f == null) {
                    c3047cp.f29607f = C2501Ce.c(c3047cp.f29602a);
                }
                c3047cp.f29607f.e("InstallReferrerUnsampled.initializeAndReport", e9);
            } else {
                if (c3047cp.f29606e == null) {
                    c3047cp.f29606e = C2501Ce.a(c3047cp.f29602a);
                }
                c3047cp.f29606e.e("InstallReferrer.initializeAndReport", e9);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        String b9;
        C3153eo c3153eo;
        ActivityManager.MemoryInfo i;
        ProfileStore profileStore = null;
        boolean z6 = false;
        int i6 = 1;
        switch (this.f29864n) {
            case 0:
                ((C3649o) this.f29865u).i();
                return;
            case 1:
                ((Q) this.f29865u).i.c();
                return;
            case 2:
                C3274h0 c3274h0 = (C3274h0) this.f29865u;
                c3274h0.f30710m--;
                return;
            case 3:
                ChoreographerVsyncCallbackC3650o0 choreographerVsyncCallbackC3650o0 = (ChoreographerVsyncCallbackC3650o0) this.f29865u;
                choreographerVsyncCallbackC3650o0.f31874n.postVsyncCallback(choreographerVsyncCallbackC3650o0);
                return;
            case 4:
                C3227g7 c3227g7 = (C3227g7) this.f29865u;
                synchronized (c3227g7.f30533H) {
                    if (c3227g7.f30534I) {
                        return;
                    }
                    c3227g7.f30534I = true;
                    try {
                        c3227g7.l();
                    } catch (Exception e9) {
                        ((C3227g7) this.f29865u).f30540y.c(2023, -1L, e9);
                    }
                    C3227g7 c3227g72 = (C3227g7) this.f29865u;
                    synchronized (c3227g72.f30533H) {
                        c3227g72.f30534I = false;
                    }
                    return;
                }
            case 5:
                C3281h7 c3281h7 = (C3281h7) this.f29865u;
                if (c3281h7.f30745b != null) {
                    return;
                }
                synchronized (C3281h7.f30741c) {
                    if (c3281h7.f30745b != null) {
                        return;
                    }
                    try {
                        z3 = ((Boolean) AbstractC3569ma.f32345q3.r()).booleanValue();
                    } catch (IllegalStateException unused) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            C3281h7.f30742d = C3108dx.a(((C3281h7) this.f29865u).f30744a.f35095a, "ADSHIELD");
                        } catch (Throwable unused2) {
                        }
                    }
                    z6 = z3;
                    ((C3281h7) this.f29865u).f30745b = Boolean.valueOf(z6);
                    C3281h7.f30741c.open();
                    return;
                }
            case 6:
                ((C7) this.f29865u).c();
                return;
            case 7:
                P7 p72 = (P7) this.f29865u;
                p72.getClass();
                try {
                    C4196y7 c4196y7 = p72.f26738a;
                    DexClassLoader dexClassLoader = c4196y7.f35097c;
                    byte[] bArr = c4196y7.f35099e;
                    String str = p72.f26739b;
                    c4196y7.f35098d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(V2.v(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        byte[] bArr2 = c4196y7.f35099e;
                        String str2 = p72.f26740c;
                        p72.f26738a.f35098d.getClass();
                        p72.f26741d = loadClass.getMethod(new String(V2.v(str2, bArr2), "UTF-8"), p72.f26742e);
                    }
                } catch (C3711p7 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th) {
                    p72.f26743f.countDown();
                    throw th;
                }
                p72.f26743f.countDown();
                return;
            case 8:
                ((ViewOnAttachStateChangeListenerC3981u8) this.f29865u).d(3);
                return;
            case 9:
                a();
                return;
            case 10:
                ((T8) this.f29865u).q();
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                C4054va c4054va = (C4054va) this.f29865u;
                Context context = c4054va.f34706u;
                if (c4054va.f34709x != null || context == null || (b9 = AbstractC4816f.b(context)) == null || b9.equals(context.getPackageName())) {
                    return;
                }
                AbstractC4816f.a(context, b9, c4054va);
                return;
            case 14:
                ((C4216ya) this.f29865u).d();
                return;
            case 15:
                N1.h hVar = (N1.h) this.f29865u;
                if (((W8) hVar.f1918n) == null) {
                    return;
                }
                ((W8) hVar.f1918n).h();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((C3) this.f29865u).f24025y).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f29865u).getAndSet(true);
                return;
            case 18:
                break;
            case 19:
                ((AbstractC3952tg) this.f29865u).g();
                return;
            case 20:
                C4835j.f39730C.f39731A.f26840n.remove((C2707Og) this.f29865u);
                return;
            case 21:
                d();
                return;
            case 22:
                C2555Fh c2555Fh = ((C2657Lh) this.f29865u).f26152n;
                f8.j jVar = c2555Fh.f24817n.f25096y0;
                jVar.f37558d = true;
                if (jVar.f37557c) {
                    jVar.d();
                }
                BinderC5036d z02 = c2555Fh.f24817n.z0();
                if (z02 != null) {
                    z02.f40810E.removeView(z02.f40827y);
                    z02.X3(true);
                    return;
                }
                return;
            case 23:
                int i9 = C2657Lh.f26127o0;
                C4300b a9 = C4835j.f39730C.f39740h.a();
                HashSet hashSet = (HashSet) a9.f35654g;
                String str3 = (String) this.f29865u;
                if (hashSet.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) a9.f35653f);
                linkedHashMap.put("ue", str3);
                a9.g(a9.d((LinkedHashMap) a9.f35649b, linkedHashMap), null);
                return;
            case 24:
                C3472kl c3472kl = C4835j.f39730C.f39755x;
                Uv uv = ((C3209fq) this.f29865u).f30456a;
                c3472kl.getClass();
                C3472kl.p(new RunnableC2896Zp(uv, i6));
                return;
            case 25:
                C2792Th c2792Th = (C2792Th) this.f29865u;
                c2792Th.getClass();
                C4835j.f39730C.f39742k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C2742Qh c2742Qh = c2792Th.f27764a;
                c2742Qh.getClass();
                if (!com.bumptech.glide.f.o("MULTI_PROFILE")) {
                    int i10 = u2.z.f41319b;
                    v2.i.a("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    int i11 = u2.z.f41319b;
                    v2.i.a("Unable to get ProfileStore instance: ".concat(valueOf));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                        v2.i.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                    }
                }
                C3153eo c3153eo2 = c2792Th.f27765b;
                if (profileStore == null) {
                    int i12 = u2.z.f41319b;
                    v2.i.f("WebViewCompat failure: No instance");
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cf)).booleanValue()) {
                        S0.e a10 = c3153eo2.a();
                        a10.v(NativeAdvancedJsUtils.f17906p, "webview_p_f");
                        a10.v("webview_p_f", "No instance");
                        a10.y();
                        return;
                    }
                    return;
                }
                c2742Qh.f27053a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cf)).booleanValue()) {
                    C4835j.f39730C.f39742k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    S0.e a11 = c3153eo2.a();
                    a11.v(NativeAdvancedJsUtils.f17906p, "webview_p_l");
                    a11.v("webview_p_l", Long.toString(elapsedRealtime2));
                    a11.y();
                    return;
                }
                return;
            case 26:
                ((C2824Vh) this.f29865u).b();
                return;
            case 27:
                e();
                return;
            case 28:
                ((C2825Vi) this.f29865u).f28228u.f28373d.l();
                return;
            default:
                C2934aj c2934aj = ((C2825Vi) this.f29865u).f28228u.f28373d;
                synchronized (c2934aj) {
                    c2934aj.b();
                    c2934aj.f29080B = true;
                }
                return;
        }
        while (true) {
            C3253gg c3253gg = (C3253gg) this.f29865u;
            if (!c3253gg.f30589e.get()) {
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            u2.D.f41234l.post(new RunnableC3111e(17, atomicBoolean));
            try {
                Thread.sleep(c3253gg.f30590f);
                if (!atomicBoolean.get()) {
                    C3301ha c3301ha = AbstractC3569ma.tf;
                    q2.r rVar = q2.r.f40204e;
                    boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
                    SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                    if (booleanValue && (c3153eo = c3253gg.f30586b) != null) {
                        S0.e a12 = c3153eo.a();
                        a12.v(NativeAdvancedJsUtils.f17906p, "panr");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Vf)).booleanValue() && (i = v2.d.i(c3253gg.f30587c)) != null) {
                            a12.v("mem_avl", String.valueOf(i.availMem));
                            a12.v("mem_tt", String.valueOf(i.totalMem));
                            a12.v("low_m", true != i.lowMemory ? "0" : "1");
                        }
                        a12.B();
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.uf)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        L2.m mVar = new L2.m("Potential ANR detected");
                        mVar.setStackTrace(stackTrace);
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.vf)).booleanValue()) {
                            C2501Ce.c(c3253gg.f30587c).f(mVar, "AnrWatchdog", ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.wf)).intValue() / 100.0f);
                        } else {
                            C4835j.f39730C.f39740h.d("AnrWatchdog", mVar);
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(c3253gg.f30591g);
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

    public RunnableC3111e(N1.h hVar) {
        this.f29864n = 15;
        Objects.requireNonNull(hVar);
        this.f29865u = hVar;
    }

    public RunnableC3111e(C3227g7 c3227g7) {
        this.f29864n = 4;
        Objects.requireNonNull(c3227g7);
        this.f29865u = c3227g7;
    }

    public RunnableC3111e(C3281h7 c3281h7) {
        this.f29864n = 5;
        Objects.requireNonNull(c3281h7);
        this.f29865u = c3281h7;
    }

    public RunnableC3111e(C7 c72) {
        this.f29864n = 6;
        Objects.requireNonNull(c72);
        this.f29865u = c72;
    }

    public RunnableC3111e(P7 p72) {
        this.f29864n = 7;
        Objects.requireNonNull(p72);
        this.f29865u = p72;
    }

    public RunnableC3111e(T8 t82) {
        this.f29864n = 10;
        Objects.requireNonNull(t82);
        this.f29865u = t82;
    }

    public RunnableC3111e(C2707Og c2707Og) {
        this.f29864n = 20;
        Objects.requireNonNull(c2707Og);
        this.f29865u = c2707Og;
    }
}
