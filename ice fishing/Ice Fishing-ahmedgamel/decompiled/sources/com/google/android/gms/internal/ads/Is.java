package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* loaded from: classes2.dex */
public final /* synthetic */ class Is implements AD, InterfaceC2999bO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f26360n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26361u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26362v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f26363w;

    /* renamed from: x, reason: collision with root package name */
    public Object f26364x;

    /* renamed from: y, reason: collision with root package name */
    public Object f26365y;

    public /* synthetic */ Is(Ks ks, String str, List list, Bundle bundle, boolean z6, boolean z9) {
        this.f26362v = ks;
        this.f26363w = str;
        this.f26364x = list;
        this.f26365y = bundle;
        this.f26360n = z6;
        this.f26361u = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public void a(C3947t5 c3947t5) {
        InterfaceC2999bO interfaceC2999bO = (InterfaceC2999bO) this.f26365y;
        if (interfaceC2999bO != null) {
            interfaceC2999bO.a(c3947t5);
            c3947t5 = ((InterfaceC2999bO) this.f26365y).j();
        }
        ((C4128wO) this.f26362v).a(c3947t5);
    }

    public void b(SP sp) {
        InterfaceC2999bO interfaceC2999bO;
        InterfaceC2999bO s02 = sp.s0();
        if (s02 == null || s02 == (interfaceC2999bO = (InterfaceC2999bO) this.f26365y)) {
            return;
        }
        if (interfaceC2999bO != null) {
            throw new DN(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f26365y = s02;
        this.f26364x = sp;
        ((C3967tP) s02).a(((C4128wO) this.f26362v).f35604w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(8:5|6|7|8|(1:10)(1:67)|11|12|(2:14|(4:16|85|26|27)(1:35))(4:36|(1:38)|39|(2:41|(2:43|44)(2:45|46))(2:47|13d))))|71|72|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0066, code lost:
    
        w2.z.l("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // com.google.android.gms.internal.ads.AD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P3.a c() {
        InterfaceC2741Pd interfaceC2741Pd;
        InterfaceC2741Pd b9;
        final Ks ks = (Ks) this.f26362v;
        String str = (String) this.f26363w;
        final List list = (List) this.f26364x;
        final Bundle bundle = (Bundle) this.f26365y;
        boolean z6 = this.f26360n;
        boolean z9 = this.f26361u;
        ks.getClass();
        final C3490kg c3490kg = new C3490kg();
        if (z9) {
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33078l2)).booleanValue()) {
                C3878rr c3878rr = ks.f26787f;
                c3878rr.getClass();
                try {
                    c3878rr.f34529a.put(str, c3878rr.f34530b.b(str));
                } catch (RemoteException e9) {
                    w2.z.l("Couldn't create RTB adapter : ", e9);
                }
                ConcurrentHashMap concurrentHashMap = c3878rr.f34529a;
                b9 = concurrentHashMap.containsKey(str) ? (InterfaceC2741Pd) concurrentHashMap.get(str) : null;
                interfaceC2741Pd = b9;
                if (interfaceC2741Pd != null) {
                    C3324ha c3324ha = AbstractC3592ma.f32984b2;
                    s2.r rVar = s2.r.f40506e;
                    if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        throw null;
                    }
                    int i = BinderC4094vr.f35515x;
                    synchronized (BinderC4094vr.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33043h2)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                c3490kg.b(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return c3490kg;
                }
                C4906k.f40186C.f40198k.getClass();
                final BinderC4094vr binderC4094vr = new BinderC4094vr(str, interfaceC2741Pd, c3490kg, SystemClock.elapsedRealtime());
                C3324ha c3324ha2 = AbstractC3592ma.f33033g2;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                    ks.f26783b.schedule(new RunnableC3493kj(19, binderC4094vr), ((Long) rVar2.f40509c.a(AbstractC3592ma.f32964Z1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z6) {
                    if (!((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33097n2)).booleanValue()) {
                        interfaceC2741Pd.k1(new Y2.b(ks.f26785d), ks.i, bundle, (Bundle) list.get(0), ks.f26786e.f30395f, binderC4094vr);
                        return c3490kg;
                    }
                    final InterfaceC2741Pd interfaceC2741Pd2 = interfaceC2741Pd;
                    ks.f26782a.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Js
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC2741Pd interfaceC2741Pd3 = interfaceC2741Pd2;
                            Bundle bundle2 = bundle;
                            List list2 = list;
                            BinderC4094vr binderC4094vr2 = binderC4094vr;
                            Ks ks2 = Ks.this;
                            ks2.getClass();
                            try {
                                interfaceC2741Pd3.k1(new Y2.b(ks2.f26785d), ks2.i, bundle2, (Bundle) list2.get(0), ks2.f26786e.f30395f, binderC4094vr2);
                            } catch (RemoteException e10) {
                                c3490kg.c(e10);
                            }
                        }
                    });
                    return c3490kg;
                }
                synchronized (binderC4094vr) {
                    if (binderC4094vr.f35519w) {
                        return c3490kg;
                    }
                    try {
                        if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33043h2)).booleanValue()) {
                            binderC4094vr.f35517u.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    binderC4094vr.f35516n.b(binderC4094vr.f35517u);
                    binderC4094vr.f35519w = true;
                    return c3490kg;
                }
            }
        }
        b9 = ks.f26788g.b(str);
        interfaceC2741Pd = b9;
        if (interfaceC2741Pd != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public boolean g() {
        if (this.f26360n) {
            return false;
        }
        InterfaceC2999bO interfaceC2999bO = (InterfaceC2999bO) this.f26365y;
        interfaceC2999bO.getClass();
        return interfaceC2999bO.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public long h() {
        if (this.f26360n) {
            return ((C4128wO) this.f26362v).h();
        }
        InterfaceC2999bO interfaceC2999bO = (InterfaceC2999bO) this.f26365y;
        interfaceC2999bO.getClass();
        return interfaceC2999bO.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public C3947t5 j() {
        InterfaceC2999bO interfaceC2999bO = (InterfaceC2999bO) this.f26365y;
        return interfaceC2999bO != null ? interfaceC2999bO.j() : ((C4128wO) this.f26362v).f35604w;
    }

    public Is(VN vn) {
        this.f26363w = vn;
        C4128wO c4128wO = new C4128wO();
        c4128wO.f35604w = C3947t5.f35001d;
        this.f26362v = c4128wO;
        this.f26360n = true;
    }
}
