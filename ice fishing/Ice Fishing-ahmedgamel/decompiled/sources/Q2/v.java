package Q2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i3.AbstractC4592b;
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
    public final LinkedList f2611A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f2612B;

    /* renamed from: C, reason: collision with root package name */
    public final long f2613C;

    /* renamed from: D, reason: collision with root package name */
    public final long f2614D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0374t f2615E;

    /* renamed from: F, reason: collision with root package name */
    public final O2.e f2616F;

    /* renamed from: G, reason: collision with root package name */
    public G f2617G;

    /* renamed from: H, reason: collision with root package name */
    public final s.b f2618H;

    /* renamed from: I, reason: collision with root package name */
    public Set f2619I;
    public final c1 J;

    /* renamed from: K, reason: collision with root package name */
    public final s.b f2620K;

    /* renamed from: L, reason: collision with root package name */
    public final T2.b f2621L;

    /* renamed from: M, reason: collision with root package name */
    public final C0362g f2622M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2623N;

    /* renamed from: O, reason: collision with root package name */
    public Integer f2624O;

    /* renamed from: P, reason: collision with root package name */
    public final C0362g f2625P;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2626u;

    /* renamed from: v, reason: collision with root package name */
    public final R2.r f2627v;

    /* renamed from: w, reason: collision with root package name */
    public J f2628w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2629x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f2630y;

    /* renamed from: z, reason: collision with root package name */
    public final Looper f2631z;

    public v(Context context, ReentrantLock reentrantLock, Looper looper, c1 c1Var, s.b bVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar2, int i, ArrayList arrayList3) {
        O2.e eVar = O2.e.f2268d;
        T2.b bVar3 = AbstractC4592b.f38181a;
        this.f2628w = null;
        this.f2611A = new LinkedList();
        this.f2613C = 120000L;
        this.f2614D = com.anythink.basead.exoplayer.f.f7973a;
        this.f2619I = new HashSet();
        this.f2622M = new C0362g(0);
        this.f2624O = null;
        I0.j jVar = new I0.j(11, this);
        this.f2630y = context;
        this.f2626u = reentrantLock;
        this.f2627v = new R2.r(looper, jVar);
        this.f2631z = looper;
        this.f2615E = new HandlerC0374t(this, looper, 0);
        this.f2616F = eVar;
        this.f2629x = -1;
        this.f2620K = bVar;
        this.f2618H = bVar2;
        this.f2623N = arrayList3;
        this.f2625P = new C0362g(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P2.i iVar = (P2.i) it.next();
            R2.r rVar = this.f2627v;
            rVar.getClass();
            R2.w.h(iVar);
            synchronized (rVar.f2851B) {
                try {
                    if (rVar.f2853u.contains(iVar)) {
                        String valueOf = String.valueOf(iVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        rVar.f2853u.add(iVar);
                    }
                } finally {
                }
            }
            if (((v) rVar.f2852n.f1291u).a()) {
                c3.e eVar2 = rVar.f2850A;
                eVar2.sendMessage(eVar2.obtainMessage(1, iVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            P2.j jVar2 = (P2.j) it2.next();
            R2.r rVar2 = this.f2627v;
            rVar2.getClass();
            R2.w.h(jVar2);
            synchronized (rVar2.f2851B) {
                try {
                    if (rVar2.f2855w.contains(jVar2)) {
                        String valueOf2 = String.valueOf(jVar2);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                        sb2.append("registerConnectionFailedListener(): listener ");
                        sb2.append(valueOf2);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        rVar2.f2855w.add(jVar2);
                    }
                } finally {
                }
            }
        }
        this.J = c1Var;
        this.f2621L = bVar3;
    }

    public static int b(Collection collection, boolean z6) {
        Iterator it = collection.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= ((P2.c) it.next()).m();
        }
        return z9 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void c(v vVar) {
        vVar.f2626u.lock();
        try {
            if (vVar.f2612B) {
                vVar.f();
            }
        } finally {
            vVar.f2626u.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        J j6 = this.f2628w;
        return j6 != null && j6.b();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f2626u;
        reentrantLock.lock();
        try {
            int i = 2;
            boolean z6 = false;
            if (this.f2629x >= 0) {
                R2.w.j("Sign-in mode should have been set explicitly by auto-manage.", this.f2624O != null);
            } else {
                Integer num = this.f2624O;
                if (num == null) {
                    this.f2624O = Integer.valueOf(b(this.f2618H.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f2624O;
            R2.w.h(num2);
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
                    R2.w.a(sb.toString(), z6);
                    e(i);
                    f();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                R2.w.a(sb2.toString(), z6);
                e(i);
                f();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z6 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        if (!this.f2612B) {
            return false;
        }
        this.f2612B = false;
        this.f2615E.removeMessages(2);
        this.f2615E.removeMessages(1);
        G g9 = this.f2617G;
        if (g9 != null) {
            g9.a();
            this.f2617G = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f2626u;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2625P.f2562a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            J j6 = this.f2628w;
            if (j6 != null) {
                j6.c();
            }
            Set set = this.f2622M.f2562a;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            LinkedList linkedList = this.f2611A;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f2628w == null) {
                reentrantLock.unlock();
                return;
            }
            d();
            R2.r rVar = this.f2627v;
            rVar.f2856x = false;
            rVar.f2857y.incrementAndGet();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.f2624O;
        if (num == null) {
            this.f2624O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            int intValue = this.f2624O.intValue();
            String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str2.length() + str.length() + 51), "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
        }
        if (this.f2628w != null) {
            return;
        }
        s.b bVar = this.f2618H;
        Iterator it = ((s.i) bVar.values()).iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= ((P2.c) it.next()).m();
        }
        int intValue2 = this.f2624O.intValue();
        ReentrantLock reentrantLock2 = this.f2626u;
        ArrayList arrayList = this.f2623N;
        s.b bVar2 = this.f2620K;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z6) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            bVar = bVar;
        } else {
            if (intValue2 == 2 && z6) {
                s.b bVar3 = new s.b();
                s.b bVar4 = new s.b();
                Iterator it2 = ((s.g) bVar.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    P2.c cVar = (P2.c) entry.getValue();
                    cVar.getClass();
                    if (cVar.m()) {
                        bVar3.put((P2.d) entry.getKey(), cVar);
                    } else {
                        bVar4.put((P2.d) entry.getKey(), cVar);
                    }
                }
                R2.w.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !bVar3.isEmpty());
                s.b bVar5 = new s.b();
                s.b bVar6 = new s.b();
                Iterator it3 = ((s.g) bVar2.keySet()).iterator();
                while (it3.hasNext()) {
                    P2.e eVar = (P2.e) it3.next();
                    P2.d dVar = eVar.f2381b;
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
                    T t6 = (T) arrayList.get(i4);
                    if (bVar5.containsKey(t6.f2533n)) {
                        arrayList2.add(t6);
                    } else {
                        if (!bVar6.containsKey(t6.f2533n)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(t6);
                    }
                }
                this.f2628w = new C0365j(this.f2630y, this, reentrantLock2, this.f2631z, this.f2616F, bVar3, bVar4, this.J, this.f2621L, null, arrayList2, arrayList3, bVar5, bVar6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f2628w = new y(this.f2630y, this, reentrantLock, this.f2631z, this.f2616F, bVar, this.J, bVar2, this.f2621L, arrayList, this);
    }

    public final void f() {
        this.f2627v.f2856x = true;
        J j6 = this.f2628w;
        R2.w.h(j6);
        j6.a();
    }

    @Override // Q2.H
    public final void k(int i) {
        if (i == 1) {
            if (!this.f2612B) {
                this.f2612B = true;
                if (this.f2617G == null) {
                    try {
                        O2.e eVar = this.f2616F;
                        Context applicationContext = this.f2630y.getApplicationContext();
                        u uVar = new u(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        G g9 = new G(uVar);
                        applicationContext.registerReceiver(g9, intentFilter);
                        g9.f2504a = applicationContext;
                        if (!O2.h.a(applicationContext)) {
                            uVar.q();
                            g9.a();
                            g9 = null;
                        }
                        this.f2617G = g9;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0374t handlerC0374t = this.f2615E;
                handlerC0374t.sendMessageDelayed(handlerC0374t.obtainMessage(1), this.f2613C);
                HandlerC0374t handlerC0374t2 = this.f2615E;
                handlerC0374t2.sendMessageDelayed(handlerC0374t2.obtainMessage(2), this.f2614D);
            }
            i = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f2625P.f2562a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        R2.r rVar = this.f2627v;
        if (Looper.myLooper() != rVar.f2850A.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        rVar.f2850A.removeMessages(1);
        synchronized (rVar.f2851B) {
            try {
                rVar.f2858z = true;
                ArrayList arrayList = new ArrayList(rVar.f2853u);
                int i4 = rVar.f2857y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    P2.i iVar = (P2.i) it.next();
                    if (!rVar.f2856x || rVar.f2857y.get() != i4) {
                        break;
                    } else if (rVar.f2853u.contains(iVar)) {
                        iVar.onConnectionSuspended(i);
                    }
                }
                rVar.f2854v.clear();
                rVar.f2858z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        R2.r rVar2 = this.f2627v;
        rVar2.f2856x = false;
        rVar2.f2857y.incrementAndGet();
        if (i == 2) {
            f();
        }
    }

    @Override // Q2.H
    public final void o(Bundle bundle) {
        if (!this.f2611A.isEmpty()) {
            this.f2611A.remove().getClass();
            throw new ClassCastException();
        }
        R2.r rVar = this.f2627v;
        if (Looper.myLooper() != rVar.f2850A.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (rVar.f2851B) {
            try {
                R2.w.k(!rVar.f2858z);
                rVar.f2850A.removeMessages(1);
                rVar.f2858z = true;
                R2.w.k(rVar.f2854v.isEmpty());
                ArrayList arrayList = new ArrayList(rVar.f2853u);
                int i = rVar.f2857y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    P2.i iVar = (P2.i) it.next();
                    if (!rVar.f2856x || !((v) rVar.f2852n.f1291u).a() || rVar.f2857y.get() != i) {
                        break;
                    } else if (!rVar.f2854v.contains(iVar)) {
                        iVar.onConnected(bundle);
                    }
                }
                rVar.f2854v.clear();
                rVar.f2858z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q2.H
    public final void s(O2.b bVar) {
        O2.e eVar = this.f2616F;
        Context context = this.f2630y;
        int i = bVar.f2256u;
        eVar.getClass();
        AtomicBoolean atomicBoolean = O2.h.f2271a;
        if (!(i == 18 ? true : i == 1 ? O2.h.a(context) : false)) {
            d();
        }
        if (this.f2612B) {
            return;
        }
        R2.r rVar = this.f2627v;
        if (Looper.myLooper() != rVar.f2850A.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        rVar.f2850A.removeMessages(1);
        synchronized (rVar.f2851B) {
            try {
                ArrayList arrayList = new ArrayList(rVar.f2855w);
                int i4 = rVar.f2857y.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    P2.j jVar = (P2.j) it.next();
                    if (rVar.f2856x && rVar.f2857y.get() == i4) {
                        if (rVar.f2855w.contains(jVar)) {
                            jVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        R2.r rVar2 = this.f2627v;
        rVar2.f2856x = false;
        rVar2.f2857y.incrementAndGet();
    }
}
