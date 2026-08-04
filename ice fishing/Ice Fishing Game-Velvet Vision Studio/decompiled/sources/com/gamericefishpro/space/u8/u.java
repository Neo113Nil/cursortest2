package com.gamericefishpro.space.u8;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.gamericefishpro.space.i9.n6;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends GoogleApiClient implements g0 {
    public final ReentrantLock b;
    public final com.gamericefishpro.space.v8.t c;
    public i0 d;
    public final int e;
    public final Context f;
    public final Looper g;
    public final LinkedList h;
    public volatile boolean i;
    public final long j;
    public final long k;
    public final s l;
    public final com.gamericefishpro.space.s8.e m;
    public f0 n;
    public final com.gamericefishpro.space.t.e o;
    public Set p;
    public final com.gamericefishpro.space.b8.k q;
    public final com.gamericefishpro.space.t.e r;
    public final com.gamericefishpro.space.o9.b s;
    public final g t;
    public final ArrayList u;
    public Integer v;
    public final g w;

    public u(Context context, ReentrantLock reentrantLock, Looper looper, com.gamericefishpro.space.b8.k kVar, com.gamericefishpro.space.t.e eVar, ArrayList arrayList, ArrayList arrayList2, com.gamericefishpro.space.t.e eVar2, int i, ArrayList arrayList3) {
        com.gamericefishpro.space.s8.e eVar3 = com.gamericefishpro.space.s8.e.d;
        com.gamericefishpro.space.o9.b bVar = com.gamericefishpro.space.o9.c.a;
        this.d = null;
        this.h = new LinkedList();
        this.j = 120000L;
        this.k = 5000L;
        this.p = new HashSet();
        this.t = new g(0);
        this.v = null;
        com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(9, this);
        this.f = context;
        this.b = reentrantLock;
        this.c = new com.gamericefishpro.space.v8.t(looper, uVar);
        this.g = looper;
        this.l = new s(this, looper, 0);
        this.m = eVar3;
        this.e = -1;
        this.r = eVar;
        this.o = eVar2;
        this.u = arrayList3;
        this.w = new g(1);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            com.gamericefishpro.space.t8.f fVar = (com.gamericefishpro.space.t8.f) obj;
            com.gamericefishpro.space.v8.t tVar = this.c;
            tVar.getClass();
            com.gamericefishpro.space.v8.c0.g(fVar);
            synchronized (tVar.B) {
                try {
                    if (tVar.e.contains(fVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(fVar) + " is already registered");
                    } else {
                        tVar.e.add(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((u) tVar.d.e).d()) {
                com.gamericefishpro.space.f9.e eVar4 = tVar.A;
                eVar4.sendMessage(eVar4.obtainMessage(1, fVar));
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            com.gamericefishpro.space.t8.g gVar = (com.gamericefishpro.space.t8.g) obj2;
            com.gamericefishpro.space.v8.t tVar2 = this.c;
            tVar2.getClass();
            com.gamericefishpro.space.v8.c0.g(gVar);
            synchronized (tVar2.B) {
                try {
                    if (tVar2.v.contains(gVar)) {
                        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(gVar) + " is already registered");
                    } else {
                        tVar2.v.add(gVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.q = kVar;
        this.s = bVar;
    }

    public static int e(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean zM = false;
        while (it.hasNext()) {
            zM |= ((com.gamericefishpro.space.t8.a) it.next()).m();
        }
        return zM ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void f(u uVar) {
        uVar.b.lock();
        try {
            if (uVar.i) {
                uVar.i();
            }
        } finally {
            uVar.b.unlock();
        }
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void a(Bundle bundle) {
        if (!this.h.isEmpty()) {
            this.h.remove().getClass();
            throw new ClassCastException();
        }
        com.gamericefishpro.space.v8.t tVar = this.c;
        if (Looper.myLooper() != tVar.A.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (tVar.B) {
            try {
                if (tVar.z) {
                    throw new IllegalStateException();
                }
                tVar.A.removeMessages(1);
                tVar.z = true;
                if (!tVar.i.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(tVar.e);
                int i = tVar.y.get();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    com.gamericefishpro.space.t8.f fVar = (com.gamericefishpro.space.t8.f) obj;
                    if (!tVar.w || !((u) tVar.d.e).d() || tVar.y.get() != i) {
                        break;
                        break;
                        break;
                    } else if (!tVar.i.contains(fVar)) {
                        fVar.onConnected(bundle);
                    }
                }
                tVar.i.clear();
                tVar.z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void b(com.gamericefishpro.space.s8.b bVar) {
        boolean zB;
        com.gamericefishpro.space.s8.e eVar = this.m;
        Context context = this.f;
        int i = bVar.e;
        eVar.getClass();
        AtomicBoolean atomicBoolean = com.gamericefishpro.space.s8.h.a;
        if (i == 18) {
            zB = true;
        } else {
            zB = i == 1 ? com.gamericefishpro.space.s8.h.b(context) : false;
        }
        if (!zB) {
            g();
        }
        if (this.i) {
            return;
        }
        com.gamericefishpro.space.v8.t tVar = this.c;
        if (Looper.myLooper() != tVar.A.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        tVar.A.removeMessages(1);
        synchronized (tVar.B) {
            try {
                ArrayList arrayList = new ArrayList(tVar.v);
                int i2 = tVar.y.get();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    com.gamericefishpro.space.t8.g gVar = (com.gamericefishpro.space.t8.g) obj;
                    if (tVar.w && tVar.y.get() == i2) {
                        if (tVar.v.contains(gVar)) {
                            gVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.v8.t tVar2 = this.c;
        tVar2.w = false;
        tVar2.y.incrementAndGet();
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void c(int i) {
        if (i == 1) {
            if (!this.i) {
                this.i = true;
                if (this.n == null) {
                    try {
                        com.gamericefishpro.space.s8.e eVar = this.m;
                        Context applicationContext = this.f.getApplicationContext();
                        t tVar = new t(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        f0 f0Var = new f0(tVar);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 33) {
                            applicationContext.registerReceiver(f0Var, intentFilter, i2 >= 33 ? 2 : 0);
                        } else {
                            applicationContext.registerReceiver(f0Var, intentFilter);
                        }
                        f0Var.a(applicationContext);
                        f0 f0Var2 = f0Var;
                        if (!com.gamericefishpro.space.s8.h.b(applicationContext)) {
                            tVar.a();
                            f0Var.b();
                            f0Var2 = null;
                        }
                        this.n = f0Var2;
                    } catch (SecurityException unused) {
                    }
                }
                s sVar = this.l;
                sVar.sendMessageDelayed(sVar.obtainMessage(1), this.j);
                s sVar2 = this.l;
                sVar2.sendMessageDelayed(sVar2.obtainMessage(2), this.k);
            }
            i = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.w.a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        com.gamericefishpro.space.v8.t tVar2 = this.c;
        if (Looper.myLooper() != tVar2.A.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        tVar2.A.removeMessages(1);
        synchronized (tVar2.B) {
            try {
                tVar2.z = true;
                ArrayList arrayList = new ArrayList(tVar2.e);
                int i3 = tVar2.y.get();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    com.gamericefishpro.space.t8.f fVar = (com.gamericefishpro.space.t8.f) obj;
                    if (!tVar2.w || tVar2.y.get() != i3) {
                        break;
                        break;
                    } else if (tVar2.e.contains(fVar)) {
                        fVar.onConnectionSuspended(i);
                    }
                }
                tVar2.i.clear();
                tVar2.z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.v8.t tVar3 = this.c;
        tVar3.w = false;
        tVar3.y.incrementAndGet();
        if (i == 2) {
            i();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.e >= 0) {
                com.gamericefishpro.space.v8.c0.i("Sign-in mode should have been set explicitly by auto-manage.", this.v != null);
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(e(this.o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.v;
            com.gamericefishpro.space.v8.c0.g(num2);
            int iIntValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    com.gamericefishpro.space.v8.c0.a("Illegal sign-in mode: " + i, z);
                    h(i);
                    i();
                    reentrantLock.unlock();
                    return;
                }
                i = iIntValue;
                com.gamericefishpro.space.v8.c0.a("Illegal sign-in mode: " + i, z);
                h(i);
                i();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean d() {
        i0 i0Var = this.d;
        return i0Var != null && i0Var.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        LinkedList linkedList = this.h;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.w.a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.b();
            }
            Set set = this.t.a;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.d != null) {
                g();
                com.gamericefishpro.space.v8.t tVar = this.c;
                tVar.w = false;
                tVar.y.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean g() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        f0 f0Var = this.n;
        if (f0Var != null) {
            f0Var.b();
            this.n = null;
        }
        return true;
    }

    public final void h(int i) {
        String str;
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int iIntValue = this.v.intValue();
            String str2 = "SIGN_IN_MODE_REQUIRED";
            if (iIntValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue != 2) {
                str = iIntValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
            } else {
                str = "SIGN_IN_MODE_OPTIONAL";
            }
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            if (i != 1) {
                str2 = i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL";
            }
            throw new IllegalStateException(com.gamericefishpro.space.m5.a.j(sb, str2, ". Mode was already set to ", str));
        }
        if (this.d != null) {
            return;
        }
        com.gamericefishpro.space.t.e eVar = this.o;
        Iterator it = ((com.gamericefishpro.space.t.d) eVar.values()).iterator();
        boolean zM = false;
        while (it.hasNext()) {
            zM |= ((com.gamericefishpro.space.t8.a) it.next()).m();
        }
        int iIntValue2 = this.v.intValue();
        ArrayList arrayList = this.u;
        ReentrantLock reentrantLock = this.b;
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zM) {
                com.gamericefishpro.space.t.e eVar2 = new com.gamericefishpro.space.t.e(0);
                com.gamericefishpro.space.t.e eVar3 = new com.gamericefishpro.space.t.e(0);
                for (Map.Entry entry : (n6) eVar.entrySet()) {
                    com.gamericefishpro.space.t8.a aVar = (com.gamericefishpro.space.t8.a) entry.getValue();
                    aVar.getClass();
                    if (aVar.m()) {
                        eVar2.put((com.gamericefishpro.space.t8.b) entry.getKey(), aVar);
                    } else {
                        eVar3.put((com.gamericefishpro.space.t8.b) entry.getKey(), aVar);
                    }
                }
                com.gamericefishpro.space.v8.c0.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !eVar2.isEmpty());
                com.gamericefishpro.space.t.e eVar4 = new com.gamericefishpro.space.t.e(0);
                com.gamericefishpro.space.t.e eVar5 = new com.gamericefishpro.space.t.e(0);
                com.gamericefishpro.space.t.e eVar6 = this.r;
                for (com.gamericefishpro.space.t8.c cVar : (com.gamericefishpro.space.t.b) eVar6.keySet()) {
                    com.gamericefishpro.space.t8.b bVar = cVar.b;
                    if (eVar2.containsKey(bVar)) {
                        eVar4.put(cVar, (Boolean) eVar6.get(cVar));
                    } else {
                        if (!eVar3.containsKey(bVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        eVar5.put(cVar, (Boolean) eVar6.get(cVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    r0 r0Var = (r0) arrayList.get(i2);
                    if (eVar4.containsKey(r0Var.d)) {
                        arrayList2.add(r0Var);
                    } else {
                        if (!eVar5.containsKey(r0Var.d)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(r0Var);
                    }
                }
                this.d = new i(this.f, this, reentrantLock, this.g, this.m, eVar2, eVar3, this.q, this.s, null, arrayList2, arrayList3, eVar4, eVar5);
                return;
            }
        } else if (!zM) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.d = new x(this.f, this, reentrantLock, this.g, this.m, this.o, this.q, this.r, this.s, arrayList, this);
    }

    public final void i() {
        this.c.w = true;
        i0 i0Var = this.d;
        com.gamericefishpro.space.v8.c0.g(i0Var);
        i0Var.a();
    }
}
