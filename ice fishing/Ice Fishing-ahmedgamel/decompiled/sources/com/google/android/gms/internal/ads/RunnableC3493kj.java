package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4949p;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3493kj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32368n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f32369u;

    public /* synthetic */ RunnableC3493kj(int i, Object obj) {
        this.f32368n = i;
        this.f32369u = obj;
    }

    private final /* synthetic */ void a() {
        C3123dp c3123dp = (C3123dp) this.f32369u;
        AtomicReference atomicReference = c3123dp.f30640d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c3123dp.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        C3769pp c3769pp = (C3769pp) this.f32369u;
        synchronized (c3769pp.f34933u) {
            try {
                if (c3769pp.f34934v) {
                    return;
                }
                c3769pp.f34934v = true;
                W8 w82 = new W8(c3769pp.f33923z, C4906k.f40186C.f40207t.b(), c3769pp, c3769pp, 2);
                c3769pp.f34937y = w82;
                w82.o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        String s9;
        TelephonyManager telephonyManager;
        C2516Bq c2516Bq = (C2516Bq) this.f32369u;
        A a9 = (A) c2516Bq.f24732a.get();
        if (a9 != null) {
            int b9 = c2516Bq.f24734c.b();
            B b10 = a9.f24399a;
            synchronized (b10) {
                try {
                    if (b10.f24559E != b9 || b10.f24560F == null) {
                        b10.f24559E = b9;
                        if (b9 != 1 && b9 != 0 && b9 != 8) {
                            if (b10.f24560F == null) {
                                Context context = b10.f24561n;
                                String str = AbstractC3182eu.f30782a;
                                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (!TextUtils.isEmpty(networkCountryIso)) {
                                        s9 = AbstractC3066cl.s(networkCountryIso);
                                        b10.f24560F = s9;
                                    }
                                }
                                s9 = AbstractC3066cl.s(Locale.getDefault().getCountry());
                                b10.f24560F = s9;
                            }
                            b10.f24557C = b10.b(b9);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            b10.a(b10.f24565x > 0 ? (int) (elapsedRealtime - b10.f24566y) : 0, b10.f24567z, b10.f24557C);
                            b10.f24566y = elapsedRealtime;
                            b10.f24567z = 0L;
                            b10.f24556B = 0L;
                            b10.f24555A = 0L;
                            I i = b10.f24564w;
                            i.f26164a.clear();
                            i.f26165b = -1;
                            i.f26166c = 0;
                            i.f26167d = 0;
                        }
                    }
                } finally {
                }
            }
        }
    }

    private final void d() {
        Xq xq = (Xq) this.f32369u;
        synchronized (xq) {
            xq.f29362a.getClass();
            xq.f29369h = SystemClock.elapsedRealtime() - xq.i;
        }
    }

    private final void e() {
        BinderC4094vr binderC4094vr = (BinderC4094vr) this.f32369u;
        synchronized (binderC4094vr) {
            binderC4094vr.U3(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void f() {
        Fu fu;
        Fu fu2 = (Fu) this.f32369u;
        Gu gu = fu2.f25655d;
        synchronized (gu) {
            try {
                ScheduledFuture scheduledFuture = fu2.f25654c;
                fu = scheduledFuture != null ? (Fu) gu.f25932v.remove(scheduledFuture) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fu != null) {
            fu2.f25655d.f25931u.execute(fu2.f25652a);
        }
    }

    private final void g() {
        Gu gu = (Gu) this.f32369u;
        synchronized (gu) {
            HashMap hashMap = gu.f25932v;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                Fu fu = (Fu) hashMap.get(scheduledFuture);
                if (fu != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    hashMap.remove(scheduledFuture);
                    C4906k.f40186C.f40198k.getClass();
                    long currentTimeMillis = fu.f25653b - System.currentTimeMillis();
                    Runnable runnable = fu.f25652a;
                    long max = Math.max(0L, currentTimeMillis);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    gu.a(runnable, max);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f32368n) {
            case 0:
                C3547lj c3547lj = (C3547lj) this.f32369u;
                C2671Lb c2671Lb = c3547lj.f32609q.f24513d;
                if (c2671Lb == null) {
                    return;
                }
                try {
                    s2.K k9 = (s2.K) c3547lj.f32611s.f();
                    Y2.b bVar = new Y2.b(c3547lj.f32604l);
                    Parcel F02 = c2671Lb.F0();
                    AbstractC3411j8.e(F02, k9);
                    AbstractC3411j8.e(F02, bVar);
                    c2671Lb.d1(F02, 1);
                    return;
                } catch (RemoteException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("RemoteException when notifyAdLoad is called", e9);
                    return;
                }
            case 1:
                ((C2679Lj) this.f32369u).f26962c = false;
                return;
            case 2:
                C2897Yj c2897Yj = (C2897Yj) this.f32369u;
                AbstractC2659Kg.A(c2897Yj.f29491v);
                c2897Yj.f29488A = true;
                return;
            case 3:
                C3280gk c3280gk = (C3280gk) this.f32369u;
                synchronized (c3280gk) {
                    try {
                        XD xd = c3280gk.f31391y;
                        if (xd.isDone()) {
                            return;
                        }
                        xd.d(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 4:
                C3548lk c3548lk = (C3548lk) this.f32369u;
                synchronized (c3548lk.f32616n) {
                    try {
                        if (c3548lk.f32615B) {
                            return;
                        }
                        c3548lk.f32615B = true;
                        c3548lk.a();
                        return;
                    } finally {
                    }
                }
            case 5:
                C2493Ak c2493Ak = (C2493Ak) this.f32369u;
                synchronized (c2493Ak) {
                    int i4 = w2.z.f41712b;
                    x2.i.c("Timeout waiting for show call succeed to be called.");
                    c2493Ak.K(new C2867Wl("Timeout for show call succeed."));
                    c2493Ak.f24508x = true;
                }
                return;
            case 6:
                ((InterfaceC4251ym) this.f32369u).j();
                return;
            case 7:
                ViewTreeObserverOnGlobalLayoutListenerC2529Cm viewTreeObserverOnGlobalLayoutListenerC2529Cm = (ViewTreeObserverOnGlobalLayoutListenerC2529Cm) this.f32369u;
                if (viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24964z == null) {
                    View view = new View(viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24961w.getContext());
                    viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24964z = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24961w != viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24964z.getParent()) {
                    viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24961w.addView(viewTreeObserverOnGlobalLayoutListenerC2529Cm.f24964z);
                    return;
                }
                return;
            case 8:
                ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn = (ViewTreeObserverOnGlobalLayoutListenerC3497kn) this.f32369u;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.getClass();
                    R2.w.d("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.V3();
                    C3873rm c3873rm = viewTreeObserverOnGlobalLayoutListenerC3497kn.f32406v;
                    if (c3873rm != null) {
                        c3873rm.n();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.f32406v = null;
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.f32404n = null;
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.f32405u = null;
                    viewTreeObserverOnGlobalLayoutListenerC3497kn.f32407w = true;
                    return;
                } catch (RemoteException e10) {
                    int i6 = w2.z.f41712b;
                    x2.i.i("#007 Could not call remote method.", e10);
                    return;
                }
            case 9:
                String str = C4906k.f40186C.f40196h.g().n().f29694e;
                boolean isEmpty = TextUtils.isEmpty(str);
                C3490kg c3490kg = (C3490kg) this.f32369u;
                if (isEmpty) {
                    c3490kg.c(new Exception());
                    return;
                } else {
                    c3490kg.b(str);
                    return;
                }
            case 10:
                C2820To c2820To = (C2820To) this.f32369u;
                InterfaceC4084vh interfaceC4084vh = c2820To.f28589w;
                C2786Ro c2786Ro = c2820To.f28588v;
                synchronized (c2786Ro) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("platform", "ANDROID");
                        String str2 = c2786Ro.f28033k;
                        if (!TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                            sb.append("afma-sdk-a-v");
                            sb.append(str2);
                            jSONObject.put("sdkVersion", sb.toString());
                        }
                        jSONObject.put("internalSdkVersion", c2786Ro.i);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", c2786Ro.f28027d.a());
                        C3324ha c3324ha = AbstractC3592ma.La;
                        s2.r rVar = s2.r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                            String str3 = C4906k.f40186C.f40196h.f30308g;
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("plugin", str3);
                            }
                        }
                        long j6 = c2786Ro.f28039q;
                        C4906k c4906k = C4906k.f40186C;
                        c4906k.f40198k.getClass();
                        if (j6 < System.currentTimeMillis() / 1000) {
                            c2786Ro.f28037o = "{}";
                        }
                        jSONObject.put("networkExtras", c2786Ro.f28037o);
                        jSONObject.put("adSlots", c2786Ro.i());
                        jSONObject.put("appInfo", c2786Ro.f28028e.h());
                        String str4 = c4906k.f40196h.g().n().f29694e;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("cld", new JSONObject(str4));
                        }
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Aa)).booleanValue() && (jSONObject2 = c2786Ro.f28038p) != null) {
                            String obj = jSONObject2.toString();
                            StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                            sb2.append("Server data: ");
                            sb2.append(obj);
                            String sb3 = sb2.toString();
                            int i9 = w2.z.f41712b;
                            x2.i.a(sb3);
                            jSONObject.put("serverData", c2786Ro.f28038p);
                        }
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                            jSONObject.put("openAction", c2786Ro.f28044v);
                            jSONObject.put("gesture", c2786Ro.f28040r);
                        }
                        jSONObject.put("isGamRegisteredTestDevice", c4906k.f40202o.g());
                        x2.d dVar = C4949p.f40498g.f40499a;
                        jSONObject.put("isSimulator", x2.d.s());
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Na)).booleanValue()) {
                            jSONObject.put("uiStorage", new JSONObject(c2786Ro.f28046x));
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40509c.a(AbstractC3592ma.Pa))) {
                            jSONObject.put("gmaDisk", (JSONObject) c2786Ro.f28031h.f26714b);
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40509c.a(AbstractC3592ma.Oa))) {
                            jSONObject.put("userDisk", (JSONObject) c2786Ro.f28030g.f26714b);
                        }
                    } catch (JSONException e11) {
                        C4906k.f40186C.f40196h.e("Inspector.toJson", e11);
                        int i10 = w2.z.f41712b;
                        x2.i.g("Ad inspector encountered an error", e11);
                    } finally {
                    }
                }
                interfaceC4084vh.c("window.inspectorInfo", jSONObject.toString());
                return;
            case 11:
                a();
                return;
            case 12:
                ((C3715op) this.f32369u).a();
                return;
            case 13:
                ((C3715op) this.f32369u).a();
                return;
            case 14:
                S0.s sVar = (S0.s) this.f32369u;
                C3332hi c3332hi = (C3332hi) sVar.f2969u;
                AbstractC3364iD.l(Context.class, (Context) sVar.f2970v);
                C3332hi c3332hi2 = c3332hi.f31635b;
                C3717or c3717or = new C3717or(c3332hi2);
                C2729Oi c2729Oi = (C2729Oi) c3717or.f33740u;
                C2895Yh c2895Yh = c3332hi2.f31633a;
                Context context = c2895Yh.f29482b;
                AbstractC3364iD.j(context);
                C3383ig c3383ig = AbstractC3436jg.f32056b;
                AbstractC3364iD.j(c3383ig);
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                InterfaceC3158eN b9 = C3266gN.b(c2729Oi);
                C5189a c5189a = c2895Yh.f29481a;
                AbstractC3364iD.j(c5189a);
                C3504ku c3504ku = new C3504ku(context, c3383ig, c3383ig2, b9, c5189a, c3717or, (C3230fo) c3332hi2.f31659o.f());
                w2.D d9 = C4906k.f40186C.f40191c;
                if (w2.D.e(context.getPackageName())) {
                    c3383ig2.execute(new RunnableC3493kj(15, c3504ku));
                    return;
                }
                C3717or c3717or2 = new C3717or(25, c3504ku);
                AbstractC3364iD.j(context);
                AbstractC3364iD.j(c5189a);
                c3383ig.execute(new RunnableC3493kj(16, new C3769pp(context, c5189a, c3717or2)));
                return;
            case 15:
                ((C3504ku) this.f32369u).A();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Pb)).booleanValue();
                Throwable th = (Throwable) this.f32369u;
                if (booleanValue) {
                    C4906k.f40186C.f40196h.f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    C4906k.f40186C.f40196h.e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 21:
                C3449jt c3449jt = (C3449jt) this.f32369u;
                c3449jt.getClass();
                c3449jt.f32117d.I(SK.F(6, null, null));
                return;
            case 22:
                C3719ot c3719ot = (C3719ot) this.f32369u;
                c3719ot.getClass();
                c3719ot.f33751d.I(SK.F(6, null, null));
                return;
            case 23:
                ((Dr) this.f32369u).h();
                return;
            case 24:
                Gt gt = (Gt) this.f32369u;
                gt.getClass();
                gt.f25925d.I(SK.F(6, null, null));
                return;
            case 25:
                ((Jt) this.f32369u).h();
                return;
            case 26:
                Mt mt = (Mt) this.f32369u;
                mt.getClass();
                mt.f27150d.I(SK.F(6, null, null));
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                C3077cw c3077cw = (C3077cw) this.f32369u;
                AtomicBoolean atomicBoolean = c3077cw.f30417e;
                AudioManager audioManager = c3077cw.f30415c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f2 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f2 = streamVolume / streamMaxVolume;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) c3077cw.f30416d.getAndSet(Float.valueOf(f2))).floatValue() != f2) {
                    c3077cw.f30413a.post(new RunnableC3024bw(this, f2));
                    return;
                }
                return;
        }
    }

    public RunnableC3493kj(C3077cw c3077cw) {
        this.f32368n = 29;
        Objects.requireNonNull(c3077cw);
        this.f32369u = c3077cw;
    }
}
