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
import com.google.android.gms.internal.consent_sdk.C4323b;
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
import p.AbstractC4820f;
import r2.C4906k;
import v2.BinderC5100d;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3134e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30656n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f30657u;

    public /* synthetic */ RunnableC3134e(int i, Object obj) {
        this.f30656n = i;
        this.f30657u = obj;
    }

    private final void a() {
        C4274z8 c4274z8 = (C4274z8) this.f30657u;
        synchronized (c4274z8.f36083v) {
            if (c4274z8.f36084w.get() && c4274z8.f36085x) {
                c4274z8.f36084w.set(false);
                int i = w2.z.f41712b;
                x2.i.a("App went background");
                Iterator it = c4274z8.f36086y.iterator();
                while (it.hasNext()) {
                    try {
                        ((B8) it.next()).e0(false);
                    } catch (Exception e9) {
                        x2.i.d("", e9);
                    }
                }
            } else {
                int i4 = w2.z.f41712b;
                x2.i.a("App is still foreground");
            }
        }
    }

    private final void b() {
        C3516l5 c3516l5 = (C3516l5) this.f30657u;
        synchronized (c3516l5) {
            try {
                com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) c3516l5.f32489v;
                if (oVar.f24254u) {
                    InterfaceC3789q8 interfaceC3789q8 = (InterfaceC3789q8) oVar.f24255v;
                    byte[] bArr = (byte[]) c3516l5.f32488u;
                    C3681o8 c3681o8 = (C3681o8) interfaceC3789q8;
                    Parcel F02 = c3681o8.F0();
                    F02.writeByteArray(bArr);
                    c3681o8.d1(F02, 5);
                    C3681o8 c3681o82 = (C3681o8) ((InterfaceC3789q8) oVar.f24255v);
                    Parcel F03 = c3681o82.F0();
                    F03.writeInt(0);
                    c3681o82.d1(F03, 6);
                    InterfaceC3789q8 interfaceC3789q82 = (InterfaceC3789q8) oVar.f24255v;
                    int i = c3516l5.f32487n;
                    C3681o8 c3681o83 = (C3681o8) interfaceC3789q82;
                    Parcel F04 = c3681o83.F0();
                    F04.writeInt(i);
                    c3681o83.d1(F04, 7);
                    C3681o8 c3681o84 = (C3681o8) ((InterfaceC3789q8) oVar.f24255v);
                    Parcel F05 = c3681o84.F0();
                    F05.writeIntArray(null);
                    c3681o84.d1(F05, 4);
                    C3681o8 c3681o85 = (C3681o8) ((InterfaceC3789q8) oVar.f24255v);
                    c3681o85.d1(c3681o85.F0(), 3);
                }
            } catch (RemoteException e9) {
                x2.i.b("Clearcut log failed", e9);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        C4323b c4323b = (C4323b) this.f30657u;
        c4323b.getClass();
        while (true) {
            try {
                C3808qa c3808qa = (C3808qa) ((ArrayBlockingQueue) c4323b.f36417a).take();
                C3754pa b9 = c3808qa.b();
                if (!TextUtils.isEmpty(b9.f33861a)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c4323b.f36418b;
                    synchronized (c3808qa.f34027c) {
                        C4906k.f40186C.f40196h.a();
                        linkedHashMap = c3808qa.f34026b;
                    }
                    c4323b.g(c4323b.d(linkedHashMap2, linkedHashMap), b9);
                }
            } catch (InterruptedException e9) {
                int i = w2.z.f41712b;
                x2.i.g("CsiReporter:reporter interrupted", e9);
                return;
            }
        }
    }

    private final void d() {
        s2.r rVar;
        long longValue;
        long intValue;
        boolean booleanValue;
        s2.r rVar2;
        long j6;
        long j9;
        long j10;
        long j11;
        C3009bh c3009bh = (C3009bh) this.f30657u;
        String o4 = C3009bh.o(c3009bh.f30095x);
        try {
            C3324ha c3324ha = AbstractC3592ma.f33041h0;
            rVar = s2.r.f40506e;
            longValue = ((Long) rVar.f40509c.a(c3324ha)).longValue() * 1000;
            intValue = ((Integer) rVar.f40509c.a(AbstractC3592ma.f32749A)).intValue();
            booleanValue = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue();
        } catch (Exception e9) {
            String str = c3009bh.f30095x;
            String message = e9.getMessage();
            String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = w2.z.f41712b;
            x2.i.f(r9);
            C4906k.f40186C.f40196h.e("VideoStreamExoPlayerCache.preload", e9);
            c3009bh.a();
            c3009bh.m(c3009bh.f30095x, o4, "error", C3009bh.p("error", e9));
        }
        synchronized (c3009bh) {
            try {
                C4906k.f40186C.f40198k.getClass();
                if (System.currentTimeMillis() - c3009bh.f30092B > longValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(longValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (c3009bh.f30096y) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!c3009bh.f30097z) {
                    C4074vO c4074vO = c3009bh.f30094w.f32083z;
                    if (!(c4074vO != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long T12 = c4074vO.T1();
                    if (T12 > 0) {
                        long V12 = c3009bh.f30094w.f32083z.V1();
                        if (V12 != c3009bh.f30093C) {
                            boolean z6 = V12 > 0;
                            String str2 = c3009bh.f30095x;
                            if (booleanValue) {
                                C3437jh c3437jh = c3009bh.f30094w;
                                j11 = (c3437jh.f32075L == null || !c3437jh.f32075L.f31083I) ? c3437jh.f32068D : 0L;
                            } else {
                                j11 = -1;
                            }
                            long p9 = booleanValue ? c3009bh.f30094w.p() : -1L;
                            j6 = intValue;
                            rVar2 = rVar;
                            j10 = V12;
                            j9 = T12;
                            x2.d.f41852b.post(new RunnableC2778Rg(c3009bh, str2, o4, V12, T12, j11, p9, booleanValue ? c3009bh.f30094w.q() : -1L, z6, C3437jh.f32063N.get(), C3437jh.f32064O.get()));
                            c3009bh.f30093C = j10;
                        } else {
                            rVar2 = rVar;
                            j6 = intValue;
                            j9 = T12;
                            j10 = V12;
                        }
                        if (j10 >= j9) {
                            x2.d.f41852b.post(new RunnableC2829Ug(c3009bh, c3009bh.f30095x, o4, j9));
                        } else if (c3009bh.f30094w.f32068D >= j6 && j10 > 0) {
                        }
                    } else {
                        rVar2 = rVar;
                    }
                    w2.D.f41627l.postDelayed(new RunnableC3134e(21, c3009bh), ((Long) rVar2.f40509c.a(AbstractC3592ma.f33049i0)).longValue());
                    return;
                }
                C4906k.f40186C.f40187A.f27628n.remove(c3009bh.f30091A);
            } finally {
            }
        }
    }

    private final void e() {
        boolean z6;
        C3070cp c3070cp = (C3070cp) this.f30657u;
        c3070cp.getClass();
        try {
            C5140B c5140b = c3070cp.f30375d;
            c5140b.i();
            synchronized (c5140b.f41599a) {
                z6 = c5140b.f41596E;
            }
            if (z6) {
                return;
            }
            C3017bp c3017bp = c3070cp.f30373b;
            c3017bp.f30119b = new C3941t(c3017bp.f30118a);
            c3017bp.a(new C3680o7(c3070cp));
        } catch (Exception e9) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32891Q5)).booleanValue()) {
                if (c3070cp.f30377f == null) {
                    c3070cp.f30377f = C2521Ce.c(c3070cp.f30372a);
                }
                c3070cp.f30377f.e("InstallReferrerUnsampled.initializeAndReport", e9);
            } else {
                if (c3070cp.f30376e == null) {
                    c3070cp.f30376e = C2521Ce.a(c3070cp.f30372a);
                }
                c3070cp.f30376e.e("InstallReferrer.initializeAndReport", e9);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        String b9;
        C3230fo c3230fo;
        ActivityManager.MemoryInfo i;
        ProfileStore profileStore = null;
        boolean z9 = false;
        int i4 = 1;
        switch (this.f30656n) {
            case 0:
                ((C3672o) this.f30657u).i();
                return;
            case 1:
                ((Q) this.f30657u).i.c();
                return;
            case 2:
                C3297h0 c3297h0 = (C3297h0) this.f30657u;
                c3297h0.f31476m--;
                return;
            case 3:
                ChoreographerVsyncCallbackC3673o0 choreographerVsyncCallbackC3673o0 = (ChoreographerVsyncCallbackC3673o0) this.f30657u;
                choreographerVsyncCallbackC3673o0.f32654n.postVsyncCallback(choreographerVsyncCallbackC3673o0);
                return;
            case 4:
                C3250g7 c3250g7 = (C3250g7) this.f30657u;
                synchronized (c3250g7.f31299H) {
                    if (c3250g7.f31300I) {
                        return;
                    }
                    c3250g7.f31300I = true;
                    try {
                        c3250g7.l();
                    } catch (Exception e9) {
                        ((C3250g7) this.f30657u).f31306y.c(2023, -1L, e9);
                    }
                    C3250g7 c3250g72 = (C3250g7) this.f30657u;
                    synchronized (c3250g72.f31299H) {
                        c3250g72.f31300I = false;
                    }
                    return;
                }
            case 5:
                C3304h7 c3304h7 = (C3304h7) this.f30657u;
                if (c3304h7.f31511b != null) {
                    return;
                }
                synchronized (C3304h7.f31507c) {
                    if (c3304h7.f31511b != null) {
                        return;
                    }
                    try {
                        z6 = ((Boolean) AbstractC3592ma.f33125q3.r()).booleanValue();
                    } catch (IllegalStateException unused) {
                        z6 = false;
                    }
                    if (z6) {
                        try {
                            C3304h7.f31508d = C3131dx.a(((C3304h7) this.f30657u).f31510a.f35881a, "ADSHIELD");
                        } catch (Throwable unused2) {
                        }
                    }
                    z9 = z6;
                    ((C3304h7) this.f30657u).f31511b = Boolean.valueOf(z9);
                    C3304h7.f31507c.open();
                    return;
                }
            case 6:
                ((C7) this.f30657u).c();
                return;
            case 7:
                P7 p72 = (P7) this.f30657u;
                p72.getClass();
                try {
                    C4219y7 c4219y7 = p72.f27521a;
                    DexClassLoader dexClassLoader = c4219y7.f35883c;
                    byte[] bArr = c4219y7.f35885e;
                    String str = p72.f27522b;
                    c4219y7.f35884d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(V2.v(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        byte[] bArr2 = c4219y7.f35885e;
                        String str2 = p72.f27523c;
                        p72.f27521a.f35884d.getClass();
                        p72.f27524d = loadClass.getMethod(new String(V2.v(str2, bArr2), "UTF-8"), p72.f27525e);
                    }
                } catch (C3734p7 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th) {
                    p72.f27526f.countDown();
                    throw th;
                }
                p72.f27526f.countDown();
                return;
            case 8:
                ((ViewOnAttachStateChangeListenerC4004u8) this.f30657u).d(3);
                return;
            case 9:
                a();
                return;
            case 10:
                ((T8) this.f30657u).q();
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                C4077va c4077va = (C4077va) this.f30657u;
                Context context = c4077va.f35463u;
                if (c4077va.f35466x != null || context == null || (b9 = AbstractC4820f.b(context)) == null || b9.equals(context.getPackageName())) {
                    return;
                }
                AbstractC4820f.a(context, b9, c4077va);
                return;
            case 14:
                ((C4239ya) this.f30657u).d();
                return;
            case 15:
                P1.h hVar = (P1.h) this.f30657u;
                if (((W8) hVar.f2362n) == null) {
                    return;
                }
                ((W8) hVar.f2362n).g();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((C3) this.f30657u).f24788y).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f30657u).getAndSet(true);
                return;
            case 18:
                break;
            case 19:
                ((AbstractC3975tg) this.f30657u).g();
                return;
            case 20:
                C4906k.f40186C.f40187A.f27628n.remove((C2727Og) this.f30657u);
                return;
            case 21:
                d();
                return;
            case 22:
                C2575Fh c2575Fh = ((C2677Lh) this.f30657u).f26950n;
                f8.j jVar = c2575Fh.f25606n.f25873t0;
                jVar.f37520d = true;
                if (jVar.f37519c) {
                    jVar.d();
                }
                BinderC5100d y02 = c2575Fh.f25606n.y0();
                if (y02 != null) {
                    y02.f41101E.removeView(y02.f41118y);
                    y02.X3(true);
                    return;
                }
                return;
            case 23:
                int i6 = C2677Lh.f26924j0;
                C4323b a9 = C4906k.f40186C.f40196h.a();
                HashSet hashSet = (HashSet) a9.f36423g;
                String str3 = (String) this.f30657u;
                if (hashSet.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) a9.f36422f);
                linkedHashMap.put("ue", str3);
                a9.g(a9.d((LinkedHashMap) a9.f36418b, linkedHashMap), null);
                return;
            case 24:
                C3495kl c3495kl = C4906k.f40186C.f40211x;
                Uv uv = ((C3232fq) this.f30657u).f31219a;
                c3495kl.getClass();
                C3495kl.p(new RunnableC2919Zp(uv, i4));
                return;
            case 25:
                C2813Th c2813Th = (C2813Th) this.f30657u;
                c2813Th.getClass();
                C4906k.f40186C.f40198k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C2762Qh c2762Qh = c2813Th.f28551a;
                c2762Qh.getClass();
                if (!com.bumptech.glide.f.m("MULTI_PROFILE")) {
                    int i9 = w2.z.f41712b;
                    x2.i.a("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    int i10 = w2.z.f41712b;
                    x2.i.a("Unable to get ProfileStore instance: ".concat(valueOf));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                        x2.i.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                    }
                }
                C3230fo c3230fo2 = c2813Th.f28552b;
                if (profileStore == null) {
                    int i11 = w2.z.f41712b;
                    x2.i.f("WebViewCompat failure: No instance");
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cf)).booleanValue()) {
                        S0.e a10 = c3230fo2.a();
                        a10.M(NativeAdvancedJsUtils.f18693p, "webview_p_f");
                        a10.M("webview_p_f", "No instance");
                        a10.N();
                        return;
                    }
                    return;
                }
                c2762Qh.f27838a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cf)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    S0.e a11 = c3230fo2.a();
                    a11.M(NativeAdvancedJsUtils.f18693p, "webview_p_l");
                    a11.M("webview_p_l", Long.toString(elapsedRealtime2));
                    a11.N();
                    return;
                }
                return;
            case 26:
                ((C2847Vh) this.f30657u).b();
                return;
            case 27:
                e();
                return;
            case 28:
                ((C2848Vi) this.f30657u).f29025u.f29172d.l();
                return;
            default:
                C2957aj c2957aj = ((C2848Vi) this.f30657u).f29025u.f29172d;
                synchronized (c2957aj) {
                    c2957aj.b();
                    c2957aj.f29855B = true;
                }
                return;
        }
        while (true) {
            C3276gg c3276gg = (C3276gg) this.f30657u;
            if (!c3276gg.f31356e.get()) {
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            w2.D.f41627l.post(new RunnableC3134e(17, atomicBoolean));
            try {
                Thread.sleep(c3276gg.f31357f);
                if (!atomicBoolean.get()) {
                    C3324ha c3324ha = AbstractC3592ma.tf;
                    s2.r rVar = s2.r.f40506e;
                    boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
                    SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                    if (booleanValue && (c3230fo = c3276gg.f31353b) != null) {
                        S0.e a12 = c3230fo.a();
                        a12.M(NativeAdvancedJsUtils.f18693p, "panr");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Vf)).booleanValue() && (i = x2.d.i(c3276gg.f31354c)) != null) {
                            a12.M("mem_avl", String.valueOf(i.availMem));
                            a12.M("mem_tt", String.valueOf(i.totalMem));
                            a12.M("low_m", true != i.lowMemory ? "0" : "1");
                        }
                        a12.P();
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.uf)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        N2.n nVar = new N2.n("Potential ANR detected");
                        nVar.setStackTrace(stackTrace);
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.vf)).booleanValue()) {
                            C2521Ce.c(c3276gg.f31354c).f(nVar, "AnrWatchdog", ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.wf)).intValue() / 100.0f);
                        } else {
                            C4906k.f40186C.f40196h.d("AnrWatchdog", nVar);
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(c3276gg.f31358g);
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

    public RunnableC3134e(P1.h hVar) {
        this.f30656n = 15;
        Objects.requireNonNull(hVar);
        this.f30657u = hVar;
    }

    public RunnableC3134e(C3250g7 c3250g7) {
        this.f30656n = 4;
        Objects.requireNonNull(c3250g7);
        this.f30657u = c3250g7;
    }

    public RunnableC3134e(C3304h7 c3304h7) {
        this.f30656n = 5;
        Objects.requireNonNull(c3304h7);
        this.f30657u = c3304h7;
    }

    public RunnableC3134e(C7 c72) {
        this.f30656n = 6;
        Objects.requireNonNull(c72);
        this.f30657u = c72;
    }

    public RunnableC3134e(P7 p72) {
        this.f30656n = 7;
        Objects.requireNonNull(p72);
        this.f30657u = p72;
    }

    public RunnableC3134e(T8 t82) {
        this.f30656n = 10;
        Objects.requireNonNull(t82);
        this.f30657u = t82;
    }

    public RunnableC3134e(C2727Og c2727Og) {
        this.f30656n = 20;
        Objects.requireNonNull(c2727Og);
        this.f30657u = c2727Og;
    }
}
