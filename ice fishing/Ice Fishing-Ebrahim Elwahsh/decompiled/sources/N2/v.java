package N2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import e3.AbstractC4471b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* loaded from: classes.dex */
public final class v extends GoogleApiClient implements H {

    /* renamed from: A, reason: collision with root package name */
    public final LinkedList f2110A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f2111B;

    /* renamed from: C, reason: collision with root package name */
    public final long f2112C;

    /* renamed from: D, reason: collision with root package name */
    public final long f2113D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0333t f2114E;

    /* renamed from: F, reason: collision with root package name */
    public final L2.e f2115F;

    /* renamed from: G, reason: collision with root package name */
    public G f2116G;

    /* renamed from: H, reason: collision with root package name */
    public final s.b f2117H;

    /* renamed from: I, reason: collision with root package name */
    public Set f2118I;
    public final c1 J;

    /* renamed from: K, reason: collision with root package name */
    public final s.b f2119K;

    /* renamed from: L, reason: collision with root package name */
    public final Q2.b f2120L;

    /* renamed from: M, reason: collision with root package name */
    public final C0321g f2121M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2122N;

    /* renamed from: O, reason: collision with root package name */
    public Integer f2123O;

    /* renamed from: P, reason: collision with root package name */
    public final C0321g f2124P;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2125u;

    /* renamed from: v, reason: collision with root package name */
    public final O2.r f2126v;

    /* renamed from: w, reason: collision with root package name */
    public J f2127w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2128x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f2129y;

    /* renamed from: z, reason: collision with root package name */
    public final Looper f2130z;

    public v(Context context, ReentrantLock reentrantLock, Looper looper, c1 c1Var, s.b bVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar2, int i, ArrayList arrayList3) {
        L2.e eVar = L2.e.f1724d;
        Q2.b bVar3 = AbstractC4471b.f37326a;
        this.f2127w = null;
        this.f2110A = new LinkedList();
        this.f2112C = 120000L;
        this.f2113D = com.anythink.basead.exoplayer.f.f7344a;
        this.f2118I = new HashSet();
        this.f2121M = new C0321g(0);
        this.f2123O = null;
        I0.j jVar = new I0.j(9, this);
        this.f2129y = context;
        this.f2125u = reentrantLock;
        this.f2126v = new O2.r(looper, jVar);
        this.f2130z = looper;
        this.f2114E = new HandlerC0333t(this, looper, 0);
        this.f2115F = eVar;
        this.f2128x = -1;
        this.f2119K = bVar;
        this.f2117H = bVar2;
        this.f2122N = arrayList3;
        this.f2124P = new C0321g(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            M2.i iVar = (M2.i) it.next();
            O2.r rVar = this.f2126v;
            rVar.getClass();
            O2.w.h(iVar);
            synchronized (rVar.f2458B) {
                try {
                    if (rVar.f2460u.contains(iVar)) {
                        String valueOf = String.valueOf(iVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        rVar.f2460u.add(iVar);
                    }
                } finally {
                }
            }
            if (((v) rVar.f2459n.f1233u).a()) {
                Z2.e eVar2 = rVar.f2457A;
                eVar2.sendMessage(eVar2.obtainMessage(1, iVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            M2.j jVar2 = (M2.j) it2.next();
            O2.r rVar2 = this.f2126v;
            rVar2.getClass();
            O2.w.h(jVar2);
            synchronized (rVar2.f2458B) {
                try {
                    if (rVar2.f2462w.contains(jVar2)) {
                        String valueOf2 = String.valueOf(jVar2);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                        sb2.append("registerConnectionFailedListener(): listener ");
                        sb2.append(valueOf2);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        rVar2.f2462w.add(jVar2);
                    }
                } finally {
                }
            }
        }
        this.J = c1Var;
        this.f2120L = bVar3;
    }

    public static int b(Collection collection, boolean z8) {
        Iterator it = collection.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= ((M2.c) it.next()).n();
        }
        return z9 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void c(v vVar) {
        vVar.f2125u.lock();
        try {
            if (vVar.f2111B) {
                vVar.f();
            }
        } finally {
            vVar.f2125u.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        J j9 = this.f2127w;
        return j9 != null && j9.b();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f2125u;
        reentrantLock.lock();
        try {
            int i = 2;
            boolean z8 = false;
            if (this.f2128x >= 0) {
                O2.w.j("Sign-in mode should have been set explicitly by auto-manage.", this.f2123O != null);
            } else {
                Integer num = this.f2123O;
                if (num == null) {
                    this.f2123O = Integer.valueOf(b(this.f2117H.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f2123O;
            O2.w.h(num2);
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
                    O2.w.a(sb.toString(), z8);
                    e(i);
                    f();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                O2.w.a(sb2.toString(), z8);
                e(i);
                f();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z8 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        if (!this.f2111B) {
            return false;
        }
        this.f2111B = false;
        this.f2114E.removeMessages(2);
        this.f2114E.removeMessages(1);
        G g9 = this.f2116G;
        if (g9 != null) {
            g9.a();
            this.f2116G = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f2125u;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2124P.f2061a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            J j9 = this.f2127w;
            if (j9 != null) {
                j9.c();
            }
            Set set = this.f2121M.f2061a;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            LinkedList linkedList = this.f2110A;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f2127w == null) {
                reentrantLock.unlock();
                return;
            }
            d();
            O2.r rVar = this.f2126v;
            rVar.f2463x = false;
            rVar.f2464y.incrementAndGet();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.f2123O;
        if (num == null) {
            this.f2123O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            int intValue = this.f2123O.intValue();
            String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(com.anythink.basead.b.c.i.q(new StringBuilder(str2.length() + str.length() + 51), "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
        }
        if (this.f2127w != null) {
            return;
        }
        s.b bVar = this.f2117H;
        Iterator it = ((s.i) bVar.values()).iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= ((M2.c) it.next()).n();
        }
        int intValue2 = this.f2123O.intValue();
        ReentrantLock reentrantLock2 = this.f2125u;
        ArrayList arrayList = this.f2122N;
        s.b bVar2 = this.f2119K;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z8) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            bVar = bVar;
        } else {
            if (intValue2 == 2 && z8) {
                s.b bVar3 = new s.b();
                s.b bVar4 = new s.b();
                Iterator it2 = ((s.g) bVar.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    M2.c cVar = (M2.c) entry.getValue();
                    cVar.getClass();
                    if (cVar.n()) {
                        bVar3.put((M2.d) entry.getKey(), cVar);
                    } else {
                        bVar4.put((M2.d) entry.getKey(), cVar);
                    }
                }
                O2.w.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !bVar3.isEmpty());
                s.b bVar5 = new s.b();
                s.b bVar6 = new s.b();
                Iterator it3 = ((s.g) bVar2.keySet()).iterator();
                while (it3.hasNext()) {
                    M2.e eVar = (M2.e) it3.next();
                    M2.d dVar = eVar.f1882b;
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
                for (int i4 = 0; i4 < size; i4++) {
                    T t9 = (T) arrayList.get(i4);
                    if (bVar5.containsKey(t9.f2032n)) {
                        arrayList2.add(t9);
                    } else {
                        if (!bVar6.containsKey(t9.f2032n)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(t9);
                    }
                }
                this.f2127w = new C0324j(this.f2129y, this, reentrantLock2, this.f2130z, this.f2115F, bVar3, bVar4, this.J, this.f2120L, null, arrayList2, arrayList3, bVar5, bVar6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f2127w = new y(this.f2129y, this, reentrantLock, this.f2130z, this.f2115F, bVar, this.J, bVar2, this.f2120L, arrayList, this);
    }

    public final void f() {
        this.f2126v.f2463x = true;
        J j9 = this.f2127w;
        O2.w.h(j9);
        j9.a();
    }

    @Override // N2.H
    public final void i(L2.b bVar) {
        L2.e eVar = this.f2115F;
        Context context = this.f2129y;
        int i = bVar.f1712u;
        eVar.getClass();
        AtomicBoolean atomicBoolean = L2.h.f1727a;
        if (!(i == 18 ? true : i == 1 ? L2.h.a(context) : false)) {
            d();
        }
        if (this.f2111B) {
            return;
        }
        O2.r rVar = this.f2126v;
        if (Looper.myLooper() != rVar.f2457A.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        rVar.f2457A.removeMessages(1);
        synchronized (rVar.f2458B) {
            try {
                ArrayList arrayList = new ArrayList(rVar.f2462w);
                int i4 = rVar.f2464y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    M2.j jVar = (M2.j) it.next();
                    if (rVar.f2463x && rVar.f2464y.get() == i4) {
                        if (rVar.f2462w.contains(jVar)) {
                            jVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        O2.r rVar2 = this.f2126v;
        rVar2.f2463x = false;
        rVar2.f2464y.incrementAndGet();
    }

    @Override // N2.H
    public final void m(int i) {
        if (i == 1) {
            if (!this.f2111B) {
                this.f2111B = true;
                if (this.f2116G == null) {
                    try {
                        L2.e eVar = this.f2115F;
                        Context applicationContext = this.f2129y.getApplicationContext();
                        u uVar = new u(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        G g9 = new G(uVar);
                        applicationContext.registerReceiver(g9, intentFilter);
                        g9.f2003a = applicationContext;
                        if (!L2.h.a(applicationContext)) {
                            uVar.q();
                            g9.a();
                            g9 = null;
                        }
                        this.f2116G = g9;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0333t handlerC0333t = this.f2114E;
                handlerC0333t.sendMessageDelayed(handlerC0333t.obtainMessage(1), this.f2112C);
                HandlerC0333t handlerC0333t2 = this.f2114E;
                handlerC0333t2.sendMessageDelayed(handlerC0333t2.obtainMessage(2), this.f2113D);
            }
            i = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2124P.f2061a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        O2.r rVar = this.f2126v;
        if (Looper.myLooper() != rVar.f2457A.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        rVar.f2457A.removeMessages(1);
        synchronized (rVar.f2458B) {
            try {
                rVar.f2465z = true;
                ArrayList arrayList = new ArrayList(rVar.f2460u);
                int i4 = rVar.f2464y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    M2.i iVar = (M2.i) it.next();
                    if (!rVar.f2463x || rVar.f2464y.get() != i4) {
                        break;
                    } else if (rVar.f2460u.contains(iVar)) {
                        iVar.onConnectionSuspended(i);
                    }
                }
                rVar.f2461v.clear();
                rVar.f2465z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        O2.r rVar2 = this.f2126v;
        rVar2.f2463x = false;
        rVar2.f2464y.incrementAndGet();
        if (i == 2) {
            f();
        }
    }

    @Override // N2.H
    public final void n(Bundle bundle) {
        if (!this.f2110A.isEmpty()) {
            this.f2110A.remove().getClass();
            throw new ClassCastException();
        }
        O2.r rVar = this.f2126v;
        if (Looper.myLooper() != rVar.f2457A.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (rVar.f2458B) {
            try {
                O2.w.k(!rVar.f2465z);
                rVar.f2457A.removeMessages(1);
                rVar.f2465z = true;
                O2.w.k(rVar.f2461v.isEmpty());
                ArrayList arrayList = new ArrayList(rVar.f2460u);
                int i = rVar.f2464y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    M2.i iVar = (M2.i) it.next();
                    if (!rVar.f2463x || !((v) rVar.f2459n.f1233u).a() || rVar.f2464y.get() != i) {
                        break;
                    } else if (!rVar.f2461v.contains(iVar)) {
                        iVar.onConnected(bundle);
                    }
                }
                rVar.f2461v.clear();
                rVar.f2465z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
