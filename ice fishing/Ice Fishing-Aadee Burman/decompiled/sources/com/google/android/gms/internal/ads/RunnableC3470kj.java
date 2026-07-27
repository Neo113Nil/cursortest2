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
import p2.C4835j;
import q2.C4900p;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3470kj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31591n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f31592u;

    public /* synthetic */ RunnableC3470kj(int i, Object obj) {
        this.f31591n = i;
        this.f31592u = obj;
    }

    private final /* synthetic */ void a() {
        C3100dp c3100dp = (C3100dp) this.f31592u;
        AtomicReference atomicReference = c3100dp.f29852d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c3100dp.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        C3746pp c3746pp = (C3746pp) this.f31592u;
        synchronized (c3746pp.f34147u) {
            try {
                if (c3746pp.f34148v) {
                    return;
                }
                c3746pp.f34148v = true;
                W8 w82 = new W8(c3746pp.f33137z, C4835j.f39730C.f39751t.b(), c3746pp, c3746pp, 2);
                c3746pp.f34151y = w82;
                w82.o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        String s9;
        TelephonyManager telephonyManager;
        C2496Bq c2496Bq = (C2496Bq) this.f31592u;
        A a9 = (A) c2496Bq.f23969a.get();
        if (a9 != null) {
            int b9 = c2496Bq.f23971c.b();
            B b10 = a9.f23619a;
            synchronized (b10) {
                try {
                    if (b10.f23787E != b9 || b10.f23788F == null) {
                        b10.f23787E = b9;
                        if (b9 != 1 && b9 != 0 && b9 != 8) {
                            if (b10.f23788F == null) {
                                Context context = b10.f23789n;
                                String str = AbstractC3159eu.f29993a;
                                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (!TextUtils.isEmpty(networkCountryIso)) {
                                        s9 = AbstractC3043cl.s(networkCountryIso);
                                        b10.f23788F = s9;
                                    }
                                }
                                s9 = AbstractC3043cl.s(Locale.getDefault().getCountry());
                                b10.f23788F = s9;
                            }
                            b10.f23785C = b10.b(b9);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            b10.a(b10.f23793x > 0 ? (int) (elapsedRealtime - b10.f23794y) : 0, b10.f23795z, b10.f23785C);
                            b10.f23794y = elapsedRealtime;
                            b10.f23795z = 0L;
                            b10.f23784B = 0L;
                            b10.f23783A = 0L;
                            I i = b10.f23792w;
                            i.f25421a.clear();
                            i.f25422b = -1;
                            i.f25423c = 0;
                            i.f25424d = 0;
                        }
                    }
                } finally {
                }
            }
        }
    }

    private final void d() {
        Xq xq = (Xq) this.f31592u;
        synchronized (xq) {
            xq.f28581a.getClass();
            xq.f28588h = SystemClock.elapsedRealtime() - xq.i;
        }
    }

    private final void e() {
        BinderC4071vr binderC4071vr = (BinderC4071vr) this.f31592u;
        synchronized (binderC4071vr) {
            binderC4071vr.U3(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void f() {
        Fu fu;
        Fu fu2 = (Fu) this.f31592u;
        Gu gu = fu2.f24865d;
        synchronized (gu) {
            try {
                ScheduledFuture scheduledFuture = fu2.f24864c;
                fu = scheduledFuture != null ? (Fu) gu.f25160v.remove(scheduledFuture) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fu != null) {
            fu2.f24865d.f25159u.execute(fu2.f24862a);
        }
    }

    private final void g() {
        Gu gu = (Gu) this.f31592u;
        synchronized (gu) {
            HashMap hashMap = gu.f25160v;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                Fu fu = (Fu) hashMap.get(scheduledFuture);
                if (fu != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    hashMap.remove(scheduledFuture);
                    C4835j.f39730C.f39742k.getClass();
                    long currentTimeMillis = fu.f24863b - System.currentTimeMillis();
                    Runnable runnable = fu.f24862a;
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
        switch (this.f31591n) {
            case 0:
                C3524lj c3524lj = (C3524lj) this.f31592u;
                C2651Lb c2651Lb = c3524lj.f31831q.f35447d;
                if (c2651Lb == null) {
                    return;
                }
                try {
                    q2.K k9 = (q2.K) c3524lj.f31833s.f();
                    W2.b bVar = new W2.b(c3524lj.f31826l);
                    Parcel H02 = c2651Lb.H0();
                    AbstractC3388j8.e(H02, k9);
                    AbstractC3388j8.e(H02, bVar);
                    c2651Lb.f1(H02, 1);
                    return;
                } catch (RemoteException e9) {
                    int i = u2.z.f41319b;
                    v2.i.d("RemoteException when notifyAdLoad is called", e9);
                    return;
                }
            case 1:
                ((C2659Lj) this.f31592u).f26165c = false;
                return;
            case 2:
                C2874Yj c2874Yj = (C2874Yj) this.f31592u;
                AbstractC2639Kg.A(c2874Yj.f28716v);
                c2874Yj.f28713A = true;
                return;
            case 3:
                C3257gk c3257gk = (C3257gk) this.f31592u;
                synchronized (c3257gk) {
                    try {
                        XD xd = c3257gk.f30624y;
                        if (xd.isDone()) {
                            return;
                        }
                        xd.d(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 4:
                C3525lk c3525lk = (C3525lk) this.f31592u;
                synchronized (c3525lk.f31838n) {
                    try {
                        if (c3525lk.f31837B) {
                            return;
                        }
                        c3525lk.f31837B = true;
                        c3525lk.a();
                        return;
                    } finally {
                    }
                }
            case 5:
                C2473Ak c2473Ak = (C2473Ak) this.f31592u;
                synchronized (c2473Ak) {
                    int i6 = u2.z.f41319b;
                    v2.i.c("Timeout waiting for show call succeed to be called.");
                    c2473Ak.L(new C2828Vl("Timeout for show call succeed."));
                    c2473Ak.f23726x = true;
                }
                return;
            case 6:
                ((InterfaceC4174xm) this.f31592u).j();
                return;
            case 7:
                ViewTreeObserverOnGlobalLayoutListenerC2492Bm viewTreeObserverOnGlobalLayoutListenerC2492Bm = (ViewTreeObserverOnGlobalLayoutListenerC2492Bm) this.f31592u;
                if (viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23951z == null) {
                    View view = new View(viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23948w.getContext());
                    viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23951z = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23948w != viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23951z.getParent()) {
                    viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23948w.addView(viewTreeObserverOnGlobalLayoutListenerC2492Bm.f23951z);
                    return;
                }
                return;
            case 8:
                ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn = (ViewTreeObserverOnGlobalLayoutListenerC3420jn) this.f31592u;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.getClass();
                    P2.w.d("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.V3();
                    C3797qm c3797qm = viewTreeObserverOnGlobalLayoutListenerC3420jn.f31316v;
                    if (c3797qm != null) {
                        c3797qm.n();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.f31316v = null;
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.f31314n = null;
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.f31315u = null;
                    viewTreeObserverOnGlobalLayoutListenerC3420jn.f31317w = true;
                    return;
                } catch (RemoteException e10) {
                    int i9 = u2.z.f41319b;
                    v2.i.i("#007 Could not call remote method.", e10);
                    return;
                }
            case 9:
                String str = C4835j.f39730C.f39740h.g().n().f28917e;
                boolean isEmpty = TextUtils.isEmpty(str);
                C3467kg c3467kg = (C3467kg) this.f31592u;
                if (isEmpty) {
                    c3467kg.c(new Exception());
                    return;
                } else {
                    c3467kg.b(str);
                    return;
                }
            case 10:
                C2783So c2783So = (C2783So) this.f31592u;
                InterfaceC4061vh interfaceC4061vh = c2783So.f27560w;
                C2749Qo c2749Qo = c2783So.f27559v;
                synchronized (c2749Qo) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("platform", "ANDROID");
                        String str2 = c2749Qo.f27089k;
                        if (!TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                            sb.append("afma-sdk-a-v");
                            sb.append(str2);
                            jSONObject.put("sdkVersion", sb.toString());
                        }
                        jSONObject.put("internalSdkVersion", c2749Qo.i);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", c2749Qo.f27083d.a());
                        C3301ha c3301ha = AbstractC3569ma.La;
                        q2.r rVar = q2.r.f40204e;
                        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                            String str3 = C4835j.f39730C.f39740h.f29523g;
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("plugin", str3);
                            }
                        }
                        long j6 = c2749Qo.f27095q;
                        C4835j c4835j = C4835j.f39730C;
                        c4835j.f39742k.getClass();
                        if (j6 < System.currentTimeMillis() / 1000) {
                            c2749Qo.f27093o = "{}";
                        }
                        jSONObject.put("networkExtras", c2749Qo.f27093o);
                        jSONObject.put("adSlots", c2749Qo.i());
                        jSONObject.put("appInfo", c2749Qo.f27084e.h());
                        String str4 = c4835j.f39740h.g().n().f28917e;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("cld", new JSONObject(str4));
                        }
                        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Aa)).booleanValue() && (jSONObject2 = c2749Qo.f27094p) != null) {
                            String obj = jSONObject2.toString();
                            StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                            sb2.append("Server data: ");
                            sb2.append(obj);
                            String sb3 = sb2.toString();
                            int i10 = u2.z.f41319b;
                            v2.i.a(sb3);
                            jSONObject.put("serverData", c2749Qo.f27094p);
                        }
                        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
                            jSONObject.put("openAction", c2749Qo.f27100v);
                            jSONObject.put("gesture", c2749Qo.f27096r);
                        }
                        jSONObject.put("isGamRegisteredTestDevice", c4835j.f39746o.g());
                        v2.d dVar = C4900p.f40196g.f40197a;
                        jSONObject.put("isSimulator", v2.d.s());
                        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Na)).booleanValue()) {
                            jSONObject.put("uiStorage", new JSONObject(c2749Qo.f27102x));
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40207c.a(AbstractC3569ma.Pa))) {
                            jSONObject.put("gmaDisk", (JSONObject) c2749Qo.f27087h.f25936b);
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40207c.a(AbstractC3569ma.Oa))) {
                            jSONObject.put("userDisk", (JSONObject) c2749Qo.f27086g.f25936b);
                        }
                    } catch (JSONException e11) {
                        C4835j.f39730C.f39740h.e("Inspector.toJson", e11);
                        int i11 = u2.z.f41319b;
                        v2.i.g("Ad inspector encountered an error", e11);
                    } finally {
                    }
                }
                interfaceC4061vh.c("window.inspectorInfo", jSONObject.toString());
                return;
            case 11:
                a();
                return;
            case 12:
                ((C3692op) this.f31592u).a();
                return;
            case 13:
                ((C3692op) this.f31592u).a();
                return;
            case 14:
                S0.s sVar = (S0.s) this.f31592u;
                C3309hi c3309hi = (C3309hi) sVar.f2840u;
                AbstractC3341iD.l(Context.class, (Context) sVar.f2841v);
                C3309hi c3309hi2 = c3309hi.f30874b;
                C3694or c3694or = new C3694or(c3309hi2);
                C2709Oi c2709Oi = (C2709Oi) c3694or.f32954u;
                C2872Yh c2872Yh = c3309hi2.f30872a;
                Context context = c2872Yh.f28707b;
                AbstractC3341iD.j(context);
                C3360ig c3360ig = AbstractC3413jg.f31269b;
                AbstractC3341iD.j(c3360ig);
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                InterfaceC3135eN b9 = C3243gN.b(c2709Oi);
                C5110a c5110a = c2872Yh.f28706a;
                AbstractC3341iD.j(c5110a);
                C3481ku c3481ku = new C3481ku(context, c3360ig, c3360ig2, b9, c5110a, c3694or, (C3153eo) c3309hi2.f30898o.f());
                u2.D d2 = C4835j.f39730C.f39735c;
                if (u2.D.e(context.getPackageName())) {
                    c3360ig2.execute(new RunnableC3470kj(15, c3481ku));
                    return;
                }
                C3694or c3694or2 = new C3694or(25, c3481ku);
                AbstractC3341iD.j(context);
                AbstractC3341iD.j(c5110a);
                c3360ig.execute(new RunnableC3470kj(16, new C3746pp(context, c5110a, c3694or2)));
                return;
            case 15:
                ((C3481ku) this.f31592u).B();
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
                boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Pb)).booleanValue();
                Throwable th = (Throwable) this.f31592u;
                if (booleanValue) {
                    C4835j.f39730C.f39740h.f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    C4835j.f39730C.f39740h.e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 21:
                C3426jt c3426jt = (C3426jt) this.f31592u;
                c3426jt.getClass();
                c3426jt.f31338d.v(SK.F(6, null, null));
                return;
            case 22:
                C3696ot c3696ot = (C3696ot) this.f31592u;
                c3696ot.getClass();
                c3696ot.f32965d.v(SK.F(6, null, null));
                return;
            case 23:
                ((Dr) this.f31592u).h();
                return;
            case 24:
                Gt gt = (Gt) this.f31592u;
                gt.getClass();
                gt.f25153d.v(SK.F(6, null, null));
                return;
            case 25:
                ((Jt) this.f31592u).h();
                return;
            case 26:
                Mt mt = (Mt) this.f31592u;
                mt.getClass();
                mt.f26365d.v(SK.F(6, null, null));
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                C3001bw c3001bw = (C3001bw) this.f31592u;
                AtomicBoolean atomicBoolean = c3001bw.f29370e;
                AudioManager audioManager = c3001bw.f29368c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f3 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f3 = streamVolume / streamMaxVolume;
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) c3001bw.f29369d.getAndSet(Float.valueOf(f3))).floatValue() != f3) {
                    c3001bw.f29366a.post(new RunnableC2947aw(this, f3));
                    return;
                }
                return;
        }
    }

    public RunnableC3470kj(C3001bw c3001bw) {
        this.f31591n = 29;
        Objects.requireNonNull(c3001bw);
        this.f31592u = c3001bw;
    }
}
