package O2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g3.AbstractC4529b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m.b1;

/* loaded from: classes.dex */
public final class w extends GoogleApiClient implements I {

    /* renamed from: A, reason: collision with root package name */
    public final LinkedList f2295A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f2296B;

    /* renamed from: C, reason: collision with root package name */
    public final long f2297C;

    /* renamed from: D, reason: collision with root package name */
    public final long f2298D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0370u f2299E;

    /* renamed from: F, reason: collision with root package name */
    public final M2.e f2300F;

    /* renamed from: G, reason: collision with root package name */
    public H f2301G;

    /* renamed from: H, reason: collision with root package name */
    public final s.b f2302H;

    /* renamed from: I, reason: collision with root package name */
    public Set f2303I;
    public final b1 J;

    /* renamed from: K, reason: collision with root package name */
    public final s.b f2304K;

    /* renamed from: L, reason: collision with root package name */
    public final R2.b f2305L;

    /* renamed from: M, reason: collision with root package name */
    public final C0357g f2306M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2307N;

    /* renamed from: O, reason: collision with root package name */
    public Integer f2308O;

    /* renamed from: P, reason: collision with root package name */
    public final C0357g f2309P;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2310u;

    /* renamed from: v, reason: collision with root package name */
    public final P2.r f2311v;

    /* renamed from: w, reason: collision with root package name */
    public K f2312w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2313x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f2314y;

    /* renamed from: z, reason: collision with root package name */
    public final Looper f2315z;

    public w(Context context, ReentrantLock reentrantLock, Looper looper, b1 b1Var, s.b bVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar2, int i, ArrayList arrayList3) {
        M2.e eVar = M2.e.f1842d;
        R2.b bVar3 = AbstractC4529b.f37654a;
        this.f2312w = null;
        this.f2295A = new LinkedList();
        this.f2297C = 120000L;
        this.f2298D = com.anythink.basead.exoplayer.f.f7187a;
        this.f2303I = new HashSet();
        this.f2306M = new C0357g(0);
        this.f2308O = null;
        F1.a aVar = new F1.a(5, this);
        this.f2314y = context;
        this.f2310u = reentrantLock;
        this.f2311v = new P2.r(looper, aVar);
        this.f2315z = looper;
        this.f2299E = new HandlerC0370u(this, looper, 0);
        this.f2300F = eVar;
        this.f2313x = -1;
        this.f2304K = bVar;
        this.f2302H = bVar2;
        this.f2307N = arrayList3;
        this.f2309P = new C0357g(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N2.i iVar = (N2.i) it.next();
            P2.r rVar = this.f2311v;
            rVar.getClass();
            P2.w.h(iVar);
            synchronized (rVar.f2530B) {
                try {
                    if (rVar.f2532u.contains(iVar)) {
                        String valueOf = String.valueOf(iVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        rVar.f2532u.add(iVar);
                    }
                } finally {
                }
            }
            if (((w) rVar.f2531n.f903u).a()) {
                a3.e eVar2 = rVar.f2529A;
                eVar2.sendMessage(eVar2.obtainMessage(1, iVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            N2.j jVar = (N2.j) it2.next();
            P2.r rVar2 = this.f2311v;
            rVar2.getClass();
            P2.w.h(jVar);
            synchronized (rVar2.f2530B) {
                try {
                    if (rVar2.f2534w.contains(jVar)) {
                        String valueOf2 = String.valueOf(jVar);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                        sb2.append("registerConnectionFailedListener(): listener ");
                        sb2.append(valueOf2);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        rVar2.f2534w.add(jVar);
                    }
                } finally {
                }
            }
        }
        this.J = b1Var;
        this.f2305L = bVar3;
    }

    public static int b(Collection collection, boolean z3) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= ((N2.c) it.next()).m();
        }
        return z6 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void c(w wVar) {
        wVar.f2310u.lock();
        try {
            if (wVar.f2296B) {
                wVar.g();
            }
        } finally {
            wVar.f2310u.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        K k9 = this.f2312w;
        return k9 != null && k9.b();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f2310u;
        reentrantLock.lock();
        try {
            int i = 2;
            boolean z3 = false;
            if (this.f2313x >= 0) {
                P2.w.j("Sign-in mode should have been set explicitly by auto-manage.", this.f2308O != null);
            } else {
                Integer num = this.f2308O;
                if (num == null) {
                    this.f2308O = Integer.valueOf(b(this.f2302H.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f2308O;
            P2.w.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i = intValue;
                } else if (intValue != 2) {
                    i = intValue;
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    P2.w.a(sb.toString(), z3);
                    e(i);
                    g();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                P2.w.a(sb2.toString(), z3);
                e(i);
                g();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z3 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        if (!this.f2296B) {
            return false;
        }
        this.f2296B = false;
        this.f2299E.removeMessages(2);
        this.f2299E.removeMessages(1);
        H h9 = this.f2301G;
        if (h9 != null) {
            h9.a();
            this.f2301G = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f2310u;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2309P.f2244a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            K k9 = this.f2312w;
            if (k9 != null) {
                k9.c();
            }
            Set set = this.f2306M.f2244a;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            LinkedList linkedList = this.f2295A;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f2312w == null) {
                reentrantLock.unlock();
                return;
            }
            d();
            P2.r rVar = this.f2311v;
            rVar.f2535x = false;
            rVar.f2536y.incrementAndGet();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.f2308O;
        if (num == null) {
            this.f2308O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            int intValue = this.f2308O.intValue();
            String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str2.length() + str.length() + 51), "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
        }
        if (this.f2312w != null) {
            return;
        }
        s.b bVar = this.f2302H;
        Iterator it = ((s.i) bVar.values()).iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= ((N2.c) it.next()).m();
        }
        int intValue2 = this.f2308O.intValue();
        ReentrantLock reentrantLock2 = this.f2310u;
        ArrayList arrayList = this.f2307N;
        s.b bVar2 = this.f2304K;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z3) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            bVar = bVar;
        } else {
            if (intValue2 == 2 && z3) {
                s.b bVar3 = new s.b();
                s.b bVar4 = new s.b();
                Iterator it2 = ((s.g) bVar.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    N2.c cVar = (N2.c) entry.getValue();
                    cVar.getClass();
                    if (cVar.m()) {
                        bVar3.put((N2.d) entry.getKey(), cVar);
                    } else {
                        bVar4.put((N2.d) entry.getKey(), cVar);
                    }
                }
                P2.w.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !bVar3.isEmpty());
                s.b bVar5 = new s.b();
                s.b bVar6 = new s.b();
                Iterator it3 = ((s.g) bVar2.keySet()).iterator();
                while (it3.hasNext()) {
                    N2.e eVar = (N2.e) it3.next();
                    N2.d dVar = eVar.f1937b;
                    if (bVar3.containsKey(dVar)) {
                        bVar5.put(eVar, (Boolean) bVar2.getOrDefault(eVar, null));
                    } else {
                        if (!bVar4.containsKey(dVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        bVar6.put(eVar, (Boolean) bVar2.getOrDefault(eVar, null));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    U u3 = (U) arrayList.get(i6);
                    if (bVar5.containsKey(u3.f2215n)) {
                        arrayList2.add(u3);
                    } else {
                        if (!bVar6.containsKey(u3.f2215n)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(u3);
                    }
                }
                this.f2312w = new C0360j(this.f2314y, this, reentrantLock2, this.f2315z, this.f2300F, bVar3, bVar4, this.J, this.f2305L, null, arrayList2, arrayList3, bVar5, bVar6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f2312w = new z(this.f2314y, this, reentrantLock, this.f2315z, this.f2300F, bVar, this.J, bVar2, this.f2305L, arrayList, this);
    }

    @Override // O2.I
    public final void f(M2.b bVar) {
        M2.e eVar = this.f2300F;
        Context context = this.f2314y;
        int i = bVar.f1830u;
        eVar.getClass();
        int i6 = M2.h.f1847c;
        if (!(i == 18 ? true : i == 1 ? M2.h.a(context) : false)) {
            d();
        }
        if (this.f2296B) {
            return;
        }
        P2.r rVar = this.f2311v;
        if (Looper.myLooper() != rVar.f2529A.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        rVar.f2529A.removeMessages(1);
        synchronized (rVar.f2530B) {
            try {
                ArrayList arrayList = new ArrayList(rVar.f2534w);
                int i9 = rVar.f2536y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    N2.j jVar = (N2.j) it.next();
                    if (rVar.f2535x && rVar.f2536y.get() == i9) {
                        if (rVar.f2534w.contains(jVar)) {
                            jVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        P2.r rVar2 = this.f2311v;
        rVar2.f2535x = false;
        rVar2.f2536y.incrementAndGet();
    }

    public final void g() {
        this.f2311v.f2535x = true;
        K k9 = this.f2312w;
        P2.w.h(k9);
        k9.a();
    }

    @Override // O2.I
    public final void l(int i) {
        if (i == 1) {
            if (!this.f2296B) {
                this.f2296B = true;
                if (this.f2301G == null) {
                    try {
                        M2.e eVar = this.f2300F;
                        Context applicationContext = this.f2314y.getApplicationContext();
                        v vVar = new v(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        H h9 = new H(vVar);
                        applicationContext.registerReceiver(h9, intentFilter);
                        h9.f2186a = applicationContext;
                        if (!M2.h.a(applicationContext)) {
                            vVar.j();
                            h9.a();
                            h9 = null;
                        }
                        this.f2301G = h9;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0370u handlerC0370u = this.f2299E;
                handlerC0370u.sendMessageDelayed(handlerC0370u.obtainMessage(1), this.f2297C);
                HandlerC0370u handlerC0370u2 = this.f2299E;
                handlerC0370u2.sendMessageDelayed(handlerC0370u2.obtainMessage(2), this.f2298D);
            }
            i = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2309P.f2244a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        P2.r rVar = this.f2311v;
        if (Looper.myLooper() != rVar.f2529A.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        rVar.f2529A.removeMessages(1);
        synchronized (rVar.f2530B) {
            try {
                rVar.f2537z = true;
                ArrayList arrayList = new ArrayList(rVar.f2532u);
                int i6 = rVar.f2536y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    N2.i iVar = (N2.i) it.next();
                    if (!rVar.f2535x || rVar.f2536y.get() != i6) {
                        break;
                    } else if (rVar.f2532u.contains(iVar)) {
                        iVar.onConnectionSuspended(i);
                    }
                }
                rVar.f2533v.clear();
                rVar.f2537z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        P2.r rVar2 = this.f2311v;
        rVar2.f2535x = false;
        rVar2.f2536y.incrementAndGet();
        if (i == 2) {
            g();
        }
    }

    @Override // O2.I
    public final void m(Bundle bundle) {
        if (!this.f2295A.isEmpty()) {
            this.f2295A.remove().getClass();
            throw new ClassCastException();
        }
        P2.r rVar = this.f2311v;
        if (Looper.myLooper() != rVar.f2529A.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (rVar.f2530B) {
            try {
                P2.w.k(!rVar.f2537z);
                rVar.f2529A.removeMessages(1);
                rVar.f2537z = true;
                P2.w.k(rVar.f2533v.isEmpty());
                ArrayList arrayList = new ArrayList(rVar.f2532u);
                int i = rVar.f2536y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    N2.i iVar = (N2.i) it.next();
                    if (!rVar.f2535x || !((w) rVar.f2531n.f903u).a() || rVar.f2536y.get() != i) {
                        break;
                    } else if (!rVar.f2533v.contains(iVar)) {
                        iVar.onConnected(bundle);
                    }
                }
                rVar.f2533v.clear();
                rVar.f2537z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
