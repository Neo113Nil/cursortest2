package o6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends GoogleApiClient implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5350b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.o f5351c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f5352d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5353e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f5354f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f5355g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f5356h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f5357i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5358j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5359k;

    /* renamed from: l, reason: collision with root package name */
    public final t f5360l;

    /* renamed from: m, reason: collision with root package name */
    public final m6.e f5361m;

    /* renamed from: n, reason: collision with root package name */
    public f0 f5362n;

    /* renamed from: o, reason: collision with root package name */
    public final s.f f5363o;

    /* renamed from: p, reason: collision with root package name */
    public Set f5364p;

    /* renamed from: q, reason: collision with root package name */
    public final p6.d f5365q;

    /* renamed from: r, reason: collision with root package name */
    public final s.f f5366r;

    /* renamed from: s, reason: collision with root package name */
    public final d7.b f5367s;

    /* renamed from: t, reason: collision with root package name */
    public final h f5368t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5369u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f5370v;

    /* renamed from: w, reason: collision with root package name */
    public final h f5371w;

    public v(Context context, ReentrantLock reentrantLock, Looper looper, p6.d dVar, s.f fVar, ArrayList arrayList, ArrayList arrayList2, s.f fVar2, int i10, ArrayList arrayList3) {
        m6.e eVar = m6.e.f4913d;
        d7.b bVar = d7.c.f1718a;
        this.f5352d = null;
        this.f5356h = new LinkedList();
        this.f5358j = 120000L;
        this.f5359k = 5000L;
        this.f5364p = new HashSet();
        this.f5368t = new h(0);
        this.f5370v = null;
        m7.g gVar = new m7.g(5, this);
        this.f5354f = context;
        this.f5350b = reentrantLock;
        this.f5351c = new p6.o(looper, gVar);
        this.f5355g = looper;
        this.f5360l = new t(this, looper, 0);
        this.f5361m = eVar;
        this.f5353e = -1;
        this.f5366r = fVar;
        this.f5363o = fVar2;
        this.f5369u = arrayList3;
        this.f5371w = new h(1);
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            n6.f fVar3 = (n6.f) obj;
            p6.o oVar = this.f5351c;
            oVar.getClass();
            p6.u.g(fVar3);
            synchronized (oVar.f5626i) {
                try {
                    if (oVar.f5619b.contains(fVar3)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(fVar3) + " is already registered");
                    } else {
                        oVar.f5619b.add(fVar3);
                    }
                } finally {
                }
            }
            if (((v) oVar.f5618a.f4957h).d()) {
                a7.c cVar = oVar.f5625h;
                cVar.sendMessage(cVar.obtainMessage(1, fVar3));
            }
        }
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            n6.g gVar2 = (n6.g) obj2;
            p6.o oVar2 = this.f5351c;
            oVar2.getClass();
            p6.u.g(gVar2);
            synchronized (oVar2.f5626i) {
                try {
                    if (oVar2.f5621d.contains(gVar2)) {
                        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(gVar2) + " is already registered");
                    } else {
                        oVar2.f5621d.add(gVar2);
                    }
                } finally {
                }
            }
        }
        this.f5365q = dVar;
        this.f5367s = bVar;
    }

    public static int e(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= ((n6.a) it.next()).n();
        }
        return z11 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void f(v vVar) {
        vVar.f5350b.lock();
        try {
            if (vVar.f5357i) {
                vVar.i();
            }
        } finally {
            vVar.f5350b.unlock();
        }
    }

    @Override // o6.g0
    public final void a(Bundle bundle) {
        if (!this.f5356h.isEmpty()) {
            this.f5356h.remove().getClass();
            throw new ClassCastException();
        }
        p6.o oVar = this.f5351c;
        if (Looper.myLooper() != oVar.f5625h.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (oVar.f5626i) {
            try {
                if (oVar.f5624g) {
                    throw new IllegalStateException();
                }
                oVar.f5625h.removeMessages(1);
                oVar.f5624g = true;
                if (!oVar.f5620c.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(oVar.f5619b);
                int i10 = oVar.f5623f.get();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    n6.f fVar = (n6.f) obj;
                    if (!oVar.f5622e || !((v) oVar.f5618a.f4957h).d() || oVar.f5623f.get() != i10) {
                        break;
                    } else if (!oVar.f5620c.contains(fVar)) {
                        fVar.onConnected(bundle);
                    }
                }
                oVar.f5620c.clear();
                oVar.f5624g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o6.g0
    public final void b(m6.b bVar) {
        m6.e eVar = this.f5361m;
        Context context = this.f5354f;
        int i10 = bVar.f4903h;
        eVar.getClass();
        int i11 = m6.h.f4918c;
        if (!(i10 == 18 ? true : i10 == 1 ? m6.h.a(context) : false)) {
            g();
        }
        if (this.f5357i) {
            return;
        }
        p6.o oVar = this.f5351c;
        if (Looper.myLooper() != oVar.f5625h.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        oVar.f5625h.removeMessages(1);
        synchronized (oVar.f5626i) {
            try {
                ArrayList arrayList = new ArrayList(oVar.f5621d);
                int i12 = oVar.f5623f.get();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    n6.g gVar = (n6.g) obj;
                    if (oVar.f5622e && oVar.f5623f.get() == i12) {
                        if (oVar.f5621d.contains(gVar)) {
                            gVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        p6.o oVar2 = this.f5351c;
        oVar2.f5622e = false;
        oVar2.f5623f.incrementAndGet();
    }

    @Override // o6.g0
    public final void c(int i10) {
        if (i10 == 1) {
            if (!this.f5357i) {
                this.f5357i = true;
                if (this.f5362n == null) {
                    try {
                        m6.e eVar = this.f5361m;
                        Context applicationContext = this.f5354f.getApplicationContext();
                        u uVar = new u(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        f0 f0Var = new f0(uVar);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            applicationContext.registerReceiver(f0Var, intentFilter, i11 >= 33 ? 2 : 0);
                        } else {
                            applicationContext.registerReceiver(f0Var, intentFilter);
                        }
                        f0Var.f5275a = applicationContext;
                        if (!m6.h.a(applicationContext)) {
                            uVar.H();
                            f0Var.a();
                            f0Var = null;
                        }
                        this.f5362n = f0Var;
                    } catch (SecurityException unused) {
                    }
                }
                t tVar = this.f5360l;
                tVar.sendMessageDelayed(tVar.obtainMessage(1), this.f5358j);
                t tVar2 = this.f5360l;
                tVar2.sendMessageDelayed(tVar2.obtainMessage(2), this.f5359k);
            }
            i10 = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f5371w.f5277a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        p6.o oVar = this.f5351c;
        if (Looper.myLooper() != oVar.f5625h.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        oVar.f5625h.removeMessages(1);
        synchronized (oVar.f5626i) {
            try {
                oVar.f5624g = true;
                ArrayList arrayList = new ArrayList(oVar.f5619b);
                int i12 = oVar.f5623f.get();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    n6.f fVar = (n6.f) obj;
                    if (!oVar.f5622e || oVar.f5623f.get() != i12) {
                        break;
                    } else if (oVar.f5619b.contains(fVar)) {
                        fVar.onConnectionSuspended(i10);
                    }
                }
                oVar.f5620c.clear();
                oVar.f5624g = false;
            } finally {
            }
        }
        p6.o oVar2 = this.f5351c;
        oVar2.f5622e = false;
        oVar2.f5623f.incrementAndGet();
        if (i10 == 2) {
            i();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f5350b;
        reentrantLock.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f5353e >= 0) {
                p6.u.i("Sign-in mode should have been set explicitly by auto-manage.", this.f5370v != null);
            } else {
                Integer num = this.f5370v;
                if (num == null) {
                    this.f5370v = Integer.valueOf(e(this.f5363o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f5370v;
            p6.u.g(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    p6.u.a("Illegal sign-in mode: " + i10, z10);
                    h(i10);
                    i();
                    reentrantLock.unlock();
                    return;
                }
                p6.u.a("Illegal sign-in mode: " + i10, z10);
                h(i10);
                i();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z10 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean d() {
        i0 i0Var = this.f5352d;
        return i0Var != null && i0Var.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        LinkedList linkedList = this.f5356h;
        ReentrantLock reentrantLock = this.f5350b;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f5371w.f5277a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            i0 i0Var = this.f5352d;
            if (i0Var != null) {
                i0Var.b();
            }
            Set set = this.f5368t.f5277a;
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
            if (this.f5352d != null) {
                g();
                p6.o oVar = this.f5351c;
                oVar.f5622e = false;
                oVar.f5623f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean g() {
        if (!this.f5357i) {
            return false;
        }
        this.f5357i = false;
        this.f5360l.removeMessages(2);
        this.f5360l.removeMessages(1);
        f0 f0Var = this.f5362n;
        if (f0Var != null) {
            f0Var.a();
            this.f5362n = null;
        }
        return true;
    }

    public final void h(int i10) {
        ReentrantLock reentrantLock;
        Integer num = this.f5370v;
        if (num == null) {
            this.f5370v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int intValue = this.f5370v.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED");
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f5352d != null) {
            return;
        }
        s.f fVar = this.f5363o;
        Iterator it = ((s.e) fVar.values()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= ((n6.a) it.next()).n();
        }
        int intValue2 = this.f5370v.intValue();
        ArrayList arrayList = this.f5369u;
        ReentrantLock reentrantLock2 = this.f5350b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
        } else {
            if (intValue2 == 2 && z10) {
                s.f fVar2 = new s.f(0);
                s.f fVar3 = new s.f(0);
                Iterator it2 = ((s.a) fVar.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    n6.a aVar = (n6.a) entry.getValue();
                    aVar.getClass();
                    if (aVar.n()) {
                        fVar2.put((n6.b) entry.getKey(), aVar);
                    } else {
                        fVar3.put((n6.b) entry.getKey(), aVar);
                    }
                }
                p6.u.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !fVar2.isEmpty());
                s.f fVar4 = new s.f(0);
                s.f fVar5 = new s.f(0);
                s.f fVar6 = this.f5366r;
                Iterator it3 = ((s.c) fVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    n6.c cVar = (n6.c) it3.next();
                    n6.b bVar = cVar.f5072b;
                    if (fVar2.containsKey(bVar)) {
                        fVar4.put(cVar, (Boolean) fVar6.get(cVar));
                    } else {
                        if (!fVar3.containsKey(bVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        fVar5.put(cVar, (Boolean) fVar6.get(cVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q0 q0Var = (q0) arrayList.get(i11);
                    if (fVar4.containsKey(q0Var.f5319d)) {
                        arrayList2.add(q0Var);
                    } else {
                        if (!fVar5.containsKey(q0Var.f5319d)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(q0Var);
                    }
                }
                this.f5352d = new j(this.f5354f, this, reentrantLock2, this.f5355g, this.f5361m, fVar2, fVar3, this.f5365q, this.f5367s, null, arrayList2, arrayList3, fVar4, fVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f5352d = new y(this.f5354f, this, reentrantLock, this.f5355g, this.f5361m, this.f5363o, this.f5365q, this.f5366r, this.f5367s, arrayList, this);
    }

    public final void i() {
        this.f5351c.f5622e = true;
        i0 i0Var = this.f5352d;
        p6.u.g(i0Var);
        i0Var.a();
    }
}
