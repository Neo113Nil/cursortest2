package w1;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.I2;
import i1.C4585b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import u.AbstractC5050e;
import u1.InterfaceC5066e;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class h implements InterfaceC5137e, Runnable, Comparable, Q1.b {

    /* renamed from: i0, reason: collision with root package name */
    public static final u1.g f41459i0 = new u1.g("glide_thread_priority_override", null, u1.g.f41006e);

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.i f41460A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC5066e f41461B;

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.j f41462C;

    /* renamed from: D, reason: collision with root package name */
    public p f41463D;

    /* renamed from: E, reason: collision with root package name */
    public int f41464E;

    /* renamed from: F, reason: collision with root package name */
    public int f41465F;

    /* renamed from: G, reason: collision with root package name */
    public j f41466G;

    /* renamed from: H, reason: collision with root package name */
    public u1.h f41467H;

    /* renamed from: I, reason: collision with root package name */
    public o f41468I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public long f41469K;

    /* renamed from: L, reason: collision with root package name */
    public Object f41470L;

    /* renamed from: M, reason: collision with root package name */
    public C4585b f41471M;

    /* renamed from: N, reason: collision with root package name */
    public Supplier f41472N;

    /* renamed from: O, reason: collision with root package name */
    public Thread f41473O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC5066e f41474P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC5066e f41475Q;

    /* renamed from: R, reason: collision with root package name */
    public Object f41476R;

    /* renamed from: S, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f41477S;

    /* renamed from: T, reason: collision with root package name */
    public volatile InterfaceC5138f f41478T;

    /* renamed from: U, reason: collision with root package name */
    public volatile boolean f41479U;

    /* renamed from: V, reason: collision with root package name */
    public volatile boolean f41480V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f41481W;

    /* renamed from: X, reason: collision with root package name */
    public int f41482X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f41483Z;

    /* renamed from: w, reason: collision with root package name */
    public final P1.h f41487w;

    /* renamed from: x, reason: collision with root package name */
    public final b3.e f41488x;

    /* renamed from: n, reason: collision with root package name */
    public final g f41484n = new g();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f41485u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final Q1.e f41486v = new Q1.e();

    /* renamed from: y, reason: collision with root package name */
    public final l4.g f41489y = new l4.g(6);

    /* renamed from: z, reason: collision with root package name */
    public final I2 f41490z = new I2();

    public h(P1.h hVar, b3.e eVar) {
        this.f41487w = hVar;
        this.f41488x = eVar;
    }

    public final w a(com.bumptech.glide.load.data.d dVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i4 = P1.j.f2365b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w e9 = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + e9, null, elapsedRealtimeNanos);
            }
            return e9;
        } finally {
            dVar.b();
        }
    }

    @Override // w1.InterfaceC5137e
    public final void b(InterfaceC5066e interfaceC5066e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        s sVar = new s("Fetching data failed", Collections.singletonList(exc));
        Class a9 = dVar.a();
        sVar.f41555u = interfaceC5066e;
        sVar.f41556v = i;
        sVar.f41557w = a9;
        this.f41485u.add(sVar);
        if (Thread.currentThread() != this.f41473O) {
            l(2);
        } else {
            n();
        }
    }

    @Override // w1.InterfaceC5137e
    public final void c(InterfaceC5066e interfaceC5066e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC5066e interfaceC5066e2) {
        this.f41474P = interfaceC5066e;
        this.f41476R = obj;
        this.f41477S = dVar;
        this.f41483Z = i;
        this.f41475Q = interfaceC5066e2;
        this.f41481W = interfaceC5066e != this.f41484n.a().get(0);
        if (Thread.currentThread() != this.f41473O) {
            l(3);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int ordinal = this.f41462C.ordinal() - hVar.f41462C.ordinal();
        return ordinal == 0 ? this.J - hVar.J : ordinal;
    }

    @Override // Q1.b
    public final Q1.e d() {
        return this.f41486v;
    }

    public final w e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f41484n;
        u c9 = gVar.c(cls);
        u1.h hVar = this.f41467H;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z6 = i == 4 || gVar.f41458r;
            u1.g gVar2 = D1.p.i;
            Boolean bool = (Boolean) hVar.c(gVar2);
            if (bool == null || (bool.booleanValue() && !z6)) {
                hVar = new u1.h();
                u1.h hVar2 = this.f41467H;
                P1.c cVar = hVar.f41011b;
                cVar.i(hVar2.f41011b);
                cVar.put(gVar2, Boolean.valueOf(z6));
            }
        }
        u1.h hVar3 = hVar;
        com.bumptech.glide.load.data.f g9 = this.f41460A.a().g(obj);
        try {
            return c9.a(this.f41464E, this.f41465F, new I1.a(this, i, 18), g9, hVar3);
        } finally {
            g9.b();
        }
    }

    public final void f() {
        w wVar;
        boolean a9;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.f41476R + ", cache key: " + this.f41474P + ", fetcher: " + this.f41477S, this.f41469K);
        }
        v vVar = null;
        if (((Map) this.f41471M.f38152u).containsKey(com.bumptech.glide.g.class) && (supplier = this.f41472N) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f41472N.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e9) {
                this.f41472N = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
                }
            }
        }
        try {
            wVar = a(this.f41477S, this.f41476R, this.f41483Z);
        } catch (s e10) {
            InterfaceC5066e interfaceC5066e = this.f41475Q;
            int i = this.f41483Z;
            e10.f41555u = interfaceC5066e;
            e10.f41556v = i;
            e10.f41557w = null;
            this.f41485u.add(e10);
            wVar = null;
        }
        if (wVar == null) {
            n();
            return;
        }
        int i4 = this.f41483Z;
        boolean z6 = this.f41481W;
        if (wVar instanceof t) {
            ((t) wVar).initialize();
        }
        if (((v) this.f41489y.f38918w) != null) {
            vVar = (v) v.f41562x.k();
            vVar.f41566w = false;
            vVar.f41565v = true;
            vVar.f41564u = wVar;
            wVar = vVar;
        }
        if (((Map) this.f41471M.f38152u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        o oVar = this.f41468I;
        synchronized (oVar) {
            oVar.f41521G = wVar;
            oVar.f41522H = i4;
            oVar.f41528O = z6;
        }
        synchronized (oVar) {
            try {
                oVar.f41530u.a();
                if (oVar.f41527N) {
                    oVar.f41521G.a();
                    oVar.g();
                } else {
                    if (oVar.f41529n.f41513n.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (oVar.f41523I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    O2.i iVar = oVar.f41533x;
                    w wVar2 = oVar.f41521G;
                    boolean z9 = oVar.f41519E;
                    p pVar = oVar.f41518D;
                    k kVar = oVar.f41531v;
                    iVar.getClass();
                    oVar.f41525L = new q(wVar2, z9, true, pVar, kVar);
                    oVar.f41523I = true;
                    n nVar = oVar.f41529n;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList(nVar.f41513n);
                    oVar.e(arrayList.size() + 1);
                    oVar.f41534y.d(oVar, oVar.f41518D, oVar.f41525L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        mVar.f41512b.execute(new l(oVar, mVar.f41511a, 1));
                    }
                    oVar.c();
                }
            } finally {
            }
        }
        this.f41482X = 5;
        try {
            l4.g gVar = this.f41489y;
            if (((v) gVar.f38918w) != null) {
                P1.h hVar = this.f41487w;
                u1.h hVar2 = this.f41467H;
                gVar.getClass();
                try {
                    hVar.a().b((InterfaceC5066e) gVar.f38916u, new l4.g((u1.k) gVar.f38917v, (v) gVar.f38918w, hVar2));
                    ((v) gVar.f38918w).e();
                } catch (Throwable th) {
                    ((v) gVar.f38918w).e();
                    throw th;
                }
            }
            I2 i22 = this.f41490z;
            synchronized (i22) {
                i22.f26177b = true;
                a9 = i22.a();
            }
            if (a9) {
                k();
            }
        } finally {
            if (vVar != null) {
                vVar.e();
            }
        }
    }

    public final InterfaceC5138f g() {
        int d9 = AbstractC5050e.d(this.f41482X);
        g gVar = this.f41484n;
        if (d9 == 1) {
            return new x(gVar, this);
        }
        if (d9 == 2) {
            return new C5135c(gVar.a(), gVar, this);
        }
        if (d9 == 3) {
            return new z(gVar, this);
        }
        if (d9 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC5128c.l(this.f41482X)));
    }

    public final int h(int i) {
        boolean z6;
        boolean z9;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            switch (this.f41466G.f41499a) {
                case 0:
                case 1:
                    z6 = false;
                    break;
                default:
                    z6 = true;
                    break;
            }
            if (z6) {
                return 2;
            }
            return h(2);
        }
        if (d9 != 1) {
            if (d9 == 2) {
                return 4;
            }
            if (d9 == 3 || d9 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC5128c.l(i)));
        }
        switch (this.f41466G.f41499a) {
            case 0:
                z9 = false;
                break;
            case 1:
            default:
                z9 = true;
                break;
        }
        if (z9) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, String str2, long j6) {
        StringBuilder c9 = AbstractC5050e.c(str, " in ");
        c9.append(P1.j.a(j6));
        c9.append(", load key: ");
        c9.append(this.f41463D);
        c9.append(str2 != null ? ", ".concat(str2) : "");
        c9.append(", thread: ");
        c9.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c9.toString());
    }

    public final void j() {
        boolean a9;
        if (((Map) this.f41471M.f38152u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        s sVar = new s("Failed to load resource", new ArrayList(this.f41485u));
        o oVar = this.f41468I;
        synchronized (oVar) {
            oVar.J = sVar;
        }
        synchronized (oVar) {
            try {
                oVar.f41530u.a();
                if (oVar.f41527N) {
                    oVar.g();
                } else {
                    if (oVar.f41529n.f41513n.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (oVar.f41524K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    oVar.f41524K = true;
                    p pVar = oVar.f41518D;
                    n nVar = oVar.f41529n;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList(nVar.f41513n);
                    oVar.e(arrayList.size() + 1);
                    oVar.f41534y.d(oVar, pVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        mVar.f41512b.execute(new l(oVar, mVar.f41511a, 0));
                    }
                    oVar.c();
                }
            } finally {
            }
        }
        I2 i22 = this.f41490z;
        synchronized (i22) {
            i22.f26178c = true;
            a9 = i22.a();
        }
        if (a9) {
            k();
        }
    }

    public final void k() {
        I2 i22 = this.f41490z;
        synchronized (i22) {
            i22.f26177b = false;
            i22.f26176a = false;
            i22.f26178c = false;
        }
        l4.g gVar = this.f41489y;
        gVar.f38916u = null;
        gVar.f38917v = null;
        gVar.f38918w = null;
        g gVar2 = this.f41484n;
        gVar2.f41444c = null;
        gVar2.f41445d = null;
        gVar2.f41454n = null;
        gVar2.f41448g = null;
        gVar2.f41451k = null;
        gVar2.i = null;
        gVar2.f41455o = null;
        gVar2.f41450j = null;
        gVar2.f41456p = null;
        gVar2.f41442a.clear();
        gVar2.f41452l = false;
        gVar2.f41443b.clear();
        gVar2.f41453m = false;
        this.f41479U = false;
        this.f41460A = null;
        this.f41461B = null;
        this.f41467H = null;
        this.f41462C = null;
        this.f41463D = null;
        this.f41468I = null;
        this.f41482X = 0;
        this.f41478T = null;
        this.f41473O = null;
        this.f41474P = null;
        this.f41476R = null;
        this.f41483Z = 0;
        this.f41477S = null;
        this.f41469K = 0L;
        this.f41480V = false;
        this.f41470L = null;
        this.f41485u.clear();
        this.f41488x.D(this);
    }

    public final void l(int i) {
        this.Y = i;
        o oVar = this.f41468I;
        (oVar.f41520F ? oVar.f41516B : oVar.f41515A).execute(this);
    }

    public final void m() {
        if (!((Map) this.f41471M.f38152u).containsKey(com.bumptech.glide.g.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f41472N;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e9) {
            this.f41472N = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
            }
        }
    }

    public final void n() {
        this.f41473O = Thread.currentThread();
        int i = P1.j.f2365b;
        this.f41469K = SystemClock.elapsedRealtimeNanos();
        boolean z6 = false;
        while (!this.f41480V && this.f41478T != null && !(z6 = this.f41478T.a())) {
            this.f41482X = h(this.f41482X);
            this.f41478T = g();
            if (this.f41482X == 4) {
                l(2);
                return;
            }
        }
        if ((this.f41482X == 6 || this.f41480V) && !z6) {
            j();
        }
    }

    public final void o() {
        int d9 = AbstractC5050e.d(this.Y);
        if (d9 == 0) {
            this.f41482X = h(1);
            this.f41478T = g();
            n();
        } else if (d9 == 1) {
            n();
        } else if (d9 == 2) {
            f();
        } else {
            int i = this.Y;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void p() {
        Throwable th;
        this.f41486v.a();
        if (!this.f41479U) {
            this.f41479U = true;
            return;
        }
        if (this.f41485u.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f41485u;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f41477S;
        try {
            try {
                if (this.f41480V) {
                    j();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                o();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (C5134b e9) {
            throw e9;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f41480V + ", stage: " + AbstractC5128c.l(this.f41482X), th2);
            }
            if (this.f41482X != 5) {
                this.f41485u.add(th2);
                j();
            }
            if (!this.f41480V) {
                throw th2;
            }
            throw th2;
        }
    }
}
