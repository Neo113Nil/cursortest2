package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* loaded from: classes2.dex */
public final /* synthetic */ class Is implements AD, InterfaceC2976bO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f25607n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25608u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25609v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25610w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25611x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25612y;

    public /* synthetic */ Is(Ks ks, String str, List list, Bundle bundle, boolean z3, boolean z6) {
        this.f25609v = ks;
        this.f25610w = str;
        this.f25611x = list;
        this.f25612y = bundle;
        this.f25607n = z3;
        this.f25608u = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public void a(C3924t5 c3924t5) {
        InterfaceC2976bO interfaceC2976bO = (InterfaceC2976bO) this.f25612y;
        if (interfaceC2976bO != null) {
            interfaceC2976bO.a(c3924t5);
            c3924t5 = ((InterfaceC2976bO) this.f25612y).j();
        }
        ((C4105wO) this.f25609v).a(c3924t5);
    }

    public void b(RP rp) {
        InterfaceC2976bO interfaceC2976bO;
        InterfaceC2976bO s02 = rp.s0();
        if (s02 == null || s02 == (interfaceC2976bO = (InterfaceC2976bO) this.f25612y)) {
            return;
        }
        if (interfaceC2976bO != null) {
            throw new DN(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f25612y = s02;
        this.f25611x = rp;
        ((C3944tP) s02).a(((C4105wO) this.f25609v).f34835w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(8:5|6|7|8|(1:10)(1:67)|11|12|(2:14|(4:16|85|26|27)(1:35))(4:36|(1:38)|39|(2:41|(2:43|44)(2:45|46))(2:47|13d))))|71|72|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0066, code lost:
    
        u2.z.l("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // com.google.android.gms.internal.ads.AD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N3.a c() {
        InterfaceC2721Pd interfaceC2721Pd;
        InterfaceC2721Pd b9;
        final Ks ks = (Ks) this.f25609v;
        String str = (String) this.f25610w;
        final List list = (List) this.f25611x;
        final Bundle bundle = (Bundle) this.f25612y;
        boolean z3 = this.f25607n;
        boolean z6 = this.f25608u;
        ks.getClass();
        final C3467kg c3467kg = new C3467kg();
        if (z6) {
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32299l2)).booleanValue()) {
                C3855rr c3855rr = ks.f25987f;
                c3855rr.getClass();
                try {
                    c3855rr.f33761a.put(str, c3855rr.f33762b.b(str));
                } catch (RemoteException e9) {
                    u2.z.l("Couldn't create RTB adapter : ", e9);
                }
                ConcurrentHashMap concurrentHashMap = c3855rr.f33761a;
                b9 = concurrentHashMap.containsKey(str) ? (InterfaceC2721Pd) concurrentHashMap.get(str) : null;
                interfaceC2721Pd = b9;
                if (interfaceC2721Pd != null) {
                    C3301ha c3301ha = AbstractC3569ma.f32205b2;
                    q2.r rVar = q2.r.f40204e;
                    if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                        throw null;
                    }
                    int i = BinderC4071vr.f34746x;
                    synchronized (BinderC4071vr.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32262h2)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                c3467kg.b(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return c3467kg;
                }
                C4835j.f39730C.f39742k.getClass();
                final BinderC4071vr binderC4071vr = new BinderC4071vr(str, interfaceC2721Pd, c3467kg, SystemClock.elapsedRealtime());
                C3301ha c3301ha2 = AbstractC3569ma.f32253g2;
                q2.r rVar2 = q2.r.f40204e;
                if (((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue()) {
                    ks.f25983b.schedule(new RunnableC3470kj(19, binderC4071vr), ((Long) rVar2.f40207c.a(AbstractC3569ma.f32185Z1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z3) {
                    if (!((Boolean) rVar2.f40207c.a(AbstractC3569ma.f32316n2)).booleanValue()) {
                        interfaceC2721Pd.J0(new W2.b(ks.f25985d), ks.i, bundle, (Bundle) list.get(0), ks.f25986e.f29625f, binderC4071vr);
                        return c3467kg;
                    }
                    final InterfaceC2721Pd interfaceC2721Pd2 = interfaceC2721Pd;
                    ks.f25982a.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Js
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC2721Pd interfaceC2721Pd3 = interfaceC2721Pd2;
                            Bundle bundle2 = bundle;
                            List list2 = list;
                            BinderC4071vr binderC4071vr2 = binderC4071vr;
                            Ks ks2 = Ks.this;
                            ks2.getClass();
                            try {
                                interfaceC2721Pd3.J0(new W2.b(ks2.f25985d), ks2.i, bundle2, (Bundle) list2.get(0), ks2.f25986e.f29625f, binderC4071vr2);
                            } catch (RemoteException e10) {
                                c3467kg.c(e10);
                            }
                        }
                    });
                    return c3467kg;
                }
                synchronized (binderC4071vr) {
                    if (binderC4071vr.f34750w) {
                        return c3467kg;
                    }
                    try {
                        if (((Boolean) rVar2.f40207c.a(AbstractC3569ma.f32262h2)).booleanValue()) {
                            binderC4071vr.f34748u.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    binderC4071vr.f34747n.b(binderC4071vr.f34748u);
                    binderC4071vr.f34750w = true;
                    return c3467kg;
                }
            }
        }
        b9 = ks.f25988g.b(str);
        interfaceC2721Pd = b9;
        if (interfaceC2721Pd != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public boolean g() {
        if (this.f25607n) {
            return false;
        }
        InterfaceC2976bO interfaceC2976bO = (InterfaceC2976bO) this.f25612y;
        interfaceC2976bO.getClass();
        return interfaceC2976bO.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public long h() {
        if (this.f25607n) {
            return ((C4105wO) this.f25609v).h();
        }
        InterfaceC2976bO interfaceC2976bO = (InterfaceC2976bO) this.f25612y;
        interfaceC2976bO.getClass();
        return interfaceC2976bO.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public C3924t5 j() {
        InterfaceC2976bO interfaceC2976bO = (InterfaceC2976bO) this.f25612y;
        return interfaceC2976bO != null ? interfaceC2976bO.j() : ((C4105wO) this.f25609v).f34835w;
    }

    public Is(VN vn) {
        this.f25610w = vn;
        C4105wO c4105wO = new C4105wO();
        c4105wO.f34835w = C3924t5.f34215d;
        this.f25609v = c4105wO;
        this.f25607n = true;
    }
}
