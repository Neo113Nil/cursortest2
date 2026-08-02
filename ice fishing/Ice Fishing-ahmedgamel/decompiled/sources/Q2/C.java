package Q2;

import R2.AbstractC0380f;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import i1.C4585b;
import i3.C4591a;
import j3.C4612a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m.c1;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class C implements P2.i, P2.j {

    /* renamed from: A, reason: collision with root package name */
    public final N f2483A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2484B;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C0359d f2488F;

    /* renamed from: u, reason: collision with root package name */
    public final P2.c f2490u;

    /* renamed from: v, reason: collision with root package name */
    public final C0356a f2491v;

    /* renamed from: w, reason: collision with root package name */
    public final S0.s f2492w;

    /* renamed from: z, reason: collision with root package name */
    public final int f2495z;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedList f2489n = new LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f2493x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f2494y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f2485C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public O2.b f2486D = null;

    /* renamed from: E, reason: collision with root package name */
    public int f2487E = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C(C0359d c0359d, P2.h hVar) {
        this.f2488F = c0359d;
        Looper looper = c0359d.f2553F.getLooper();
        b3.e a9 = hVar.a();
        s.c cVar = (s.c) a9.f5557u;
        String str = (String) a9.f5558v;
        String str2 = (String) a9.f5559w;
        C4591a c4591a = C4591a.f38180b;
        c1 c1Var = new c1(cVar, null, str, str2, c4591a);
        com.bumptech.glide.g gVar = hVar.f2389v.f2380a;
        R2.w.h(gVar);
        P2.c b9 = gVar.b(hVar.f2387n, looper, c1Var, hVar.f2390w, this, this);
        String str3 = hVar.f2388u;
        if (str3 != null && (b9 instanceof AbstractC0380f)) {
            ((AbstractC0380f) b9).f2790Q = str3;
        }
        if (str3 != null && (b9 instanceof AbstractServiceConnectionC0363h)) {
            D.x.x(b9);
            throw null;
        }
        this.f2490u = b9;
        this.f2491v = hVar.f2391x;
        this.f2492w = new S0.s(4);
        this.f2495z = hVar.f2392y;
        if (!b9.m()) {
            this.f2483A = null;
            return;
        }
        Context context = c0359d.f2559x;
        c3.e eVar = c0359d.f2553F;
        b3.e a10 = hVar.a();
        this.f2483A = new N(context, eVar, new c1((s.c) a10.f5557u, null, (String) a10.f5558v, (String) a10.f5559w, c4591a));
    }

    public final void a(O2.b bVar) {
        HashSet hashSet = this.f2493x;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (R2.w.l(bVar, O2.b.f2254y)) {
                this.f2490u.f();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        R2.w.c(this.f2488F.f2553F);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z6) {
        R2.w.c(this.f2488F.f2553F);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2489n.iterator();
        while (it.hasNext()) {
            I i = (I) it.next();
            if (!z6 || i.f2506a == 2) {
                if (status != null) {
                    i.c(status);
                } else {
                    i.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f2489n;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            I i4 = (I) arrayList.get(i);
            if (!this.f2490u.h()) {
                return;
            }
            if (h(i4)) {
                linkedList.remove(i4);
            }
        }
    }

    public final void e() {
        C0359d c0359d = this.f2488F;
        R2.w.c(c0359d.f2553F);
        this.f2486D = null;
        a(O2.b.f2254y);
        if (this.f2484B) {
            c3.e eVar = c0359d.f2553F;
            C0356a c0356a = this.f2491v;
            eVar.removeMessages(11, c0356a);
            c0359d.f2553F.removeMessages(9, c0356a);
            this.f2484B = false;
        }
        Iterator it = this.f2494y.values().iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        C0359d c0359d = this.f2488F;
        R2.w.c(c0359d.f2553F);
        this.f2486D = null;
        this.f2484B = true;
        String k9 = this.f2490u.k();
        S0.s sVar = this.f2492w;
        sVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k9 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k9);
        }
        sVar.o(true, new Status(20, sb.toString(), null, null));
        c3.e eVar = c0359d.f2553F;
        C0356a c0356a = this.f2491v;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, c0356a), com.anythink.basead.exoplayer.f.f7973a);
        c3.e eVar2 = c0359d.f2553F;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, c0356a), 120000L);
        ((SparseIntArray) c0359d.f2561z.f2908u).clear();
        Iterator it = this.f2494y.values().iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
    }

    public final void g() {
        C0359d c0359d = this.f2488F;
        c3.e eVar = c0359d.f2553F;
        C0356a c0356a = this.f2491v;
        eVar.removeMessages(12, c0356a);
        c3.e eVar2 = c0359d.f2553F;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c0356a), c0359d.f2555n);
    }

    public final boolean h(I i) {
        O2.d dVar;
        if (i instanceof I) {
            O2.d[] b9 = i.b(this);
            if (b9 != null && b9.length != 0) {
                O2.d[] j6 = this.f2490u.j();
                if (j6 == null) {
                    j6 = new O2.d[0];
                }
                s.b bVar = new s.b(j6.length);
                for (O2.d dVar2 : j6) {
                    bVar.put(dVar2.f2263n, Long.valueOf(dVar2.a()));
                }
                int length = b9.length;
                for (int i4 = 0; i4 < length; i4++) {
                    dVar = b9[i4];
                    Long l9 = (Long) bVar.getOrDefault(dVar.f2263n, null);
                    if (l9 == null || l9.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                String name = this.f2490u.getClass().getName();
                String str = dVar.f2263n;
                long a9 = dVar.a();
                StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
                AbstractC5128c.h(sb, name, " could not execute call because it requires feature (", str, ", ");
                sb.append(a9);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                if (!this.f2488F.f2554G || !i.a(this)) {
                    i.d(new P2.l(dVar));
                    return true;
                }
                D d9 = new D(this.f2491v, dVar);
                int indexOf = this.f2485C.indexOf(d9);
                if (indexOf >= 0) {
                    D d10 = (D) this.f2485C.get(indexOf);
                    this.f2488F.f2553F.removeMessages(15, d10);
                    c3.e eVar = this.f2488F.f2553F;
                    Message obtain = Message.obtain(eVar, 15, d10);
                    this.f2488F.getClass();
                    eVar.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7973a);
                } else {
                    this.f2485C.add(d9);
                    c3.e eVar2 = this.f2488F.f2553F;
                    Message obtain2 = Message.obtain(eVar2, 15, d9);
                    this.f2488F.getClass();
                    eVar2.sendMessageDelayed(obtain2, com.anythink.basead.exoplayer.f.f7973a);
                    c3.e eVar3 = this.f2488F.f2553F;
                    Message obtain3 = Message.obtain(eVar3, 16, d9);
                    this.f2488F.getClass();
                    eVar3.sendMessageDelayed(obtain3, 120000L);
                    O2.b bVar2 = new O2.b(2, null, null);
                    if (!i(bVar2)) {
                        this.f2488F.b(bVar2, this.f2495z);
                    }
                }
                return false;
            }
            P2.c cVar = this.f2490u;
            i.f(this.f2492w, cVar.m());
            try {
                i.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.b("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            P2.c cVar2 = this.f2490u;
            i.f(this.f2492w, cVar2.m());
            try {
                i.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.b("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean i(O2.b bVar) {
        synchronized (C0359d.J) {
            this.f2488F.getClass();
        }
        return false;
    }

    public final void j() {
        C0359d c0359d = this.f2488F;
        R2.w.c(c0359d.f2553F);
        P2.c cVar = this.f2490u;
        if (cVar.h() || cVar.d()) {
            return;
        }
        try {
            int D8 = c0359d.f2561z.D(c0359d.f2559x, cVar);
            if (D8 != 0) {
                O2.b bVar = new O2.b(D8, null, null);
                String name = cVar.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + bVar2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(bVar2);
                Log.w("GoogleApiManager", sb.toString());
                l(bVar, null);
                return;
            }
            E e9 = new E(c0359d, cVar, this.f2491v);
            if (cVar.m()) {
                N n9 = this.f2483A;
                R2.w.h(n9);
                C4612a c4612a = n9.f2525y;
                if (c4612a != null) {
                    c4612a.g();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(n9));
                c1 c1Var = n9.f2524x;
                c1Var.f39198z = valueOf;
                c3.e eVar = n9.f2521u;
                Looper looper = eVar.getLooper();
                n9.f2525y = (C4612a) n9.f2522v.b(n9.f2520n, looper, c1Var, (C4591a) c1Var.f39197y, n9, n9);
                n9.f2526z = e9;
                Set set = n9.f2523w;
                if (set == null || set.isEmpty()) {
                    eVar.post(new G0.c(10, n9));
                } else {
                    n9.f2525y.A();
                }
            }
            try {
                cVar.l(e9);
            } catch (SecurityException e10) {
                l(new O2.b(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            l(new O2.b(10, null, null), e11);
        }
    }

    public final void k(I i) {
        R2.w.c(this.f2488F.f2553F);
        boolean h3 = this.f2490u.h();
        LinkedList linkedList = this.f2489n;
        if (h3) {
            if (h(i)) {
                g();
                return;
            } else {
                linkedList.add(i);
                return;
            }
        }
        linkedList.add(i);
        O2.b bVar = this.f2486D;
        if (bVar == null || !bVar.a()) {
            j();
        } else {
            l(this.f2486D, null);
        }
    }

    public final void l(O2.b bVar, RuntimeException runtimeException) {
        C4612a c4612a;
        R2.w.c(this.f2488F.f2553F);
        N n9 = this.f2483A;
        if (n9 != null && (c4612a = n9.f2525y) != null) {
            c4612a.g();
        }
        R2.w.c(this.f2488F.f2553F);
        this.f2486D = null;
        ((SparseIntArray) this.f2488F.f2561z.f2908u).clear();
        a(bVar);
        if ((this.f2490u instanceof T2.d) && bVar.f2256u != 24) {
            C0359d c0359d = this.f2488F;
            c0359d.f2556u = true;
            c3.e eVar = c0359d.f2553F;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f2256u == 4) {
            b(C0359d.f2546I);
            return;
        }
        if (this.f2489n.isEmpty()) {
            this.f2486D = bVar;
            return;
        }
        if (runtimeException != null) {
            R2.w.c(this.f2488F.f2553F);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f2488F.f2554G) {
            b(C0359d.c(this.f2491v, bVar));
            return;
        }
        c(C0359d.c(this.f2491v, bVar), null, true);
        if (this.f2489n.isEmpty() || i(bVar) || this.f2488F.b(bVar, this.f2495z)) {
            return;
        }
        if (bVar.f2256u == 18) {
            this.f2484B = true;
        }
        if (!this.f2484B) {
            b(C0359d.c(this.f2491v, bVar));
            return;
        }
        c3.e eVar2 = this.f2488F.f2553F;
        Message obtain = Message.obtain(eVar2, 9, this.f2491v);
        this.f2488F.getClass();
        eVar2.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7973a);
    }

    public final void m() {
        R2.w.c(this.f2488F.f2553F);
        Status status = C0359d.f2545H;
        b(status);
        this.f2492w.o(false, status);
        for (AbstractC0361f abstractC0361f : (AbstractC0361f[]) this.f2494y.keySet().toArray(new AbstractC0361f[0])) {
            k(new P(new l3.h()));
        }
        a(new O2.b(4, null, null));
        P2.c cVar = this.f2490u;
        if (cVar.h()) {
            cVar.n(new C4585b(12, this));
        }
    }

    @Override // P2.i
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        C0359d c0359d = this.f2488F;
        if (myLooper == c0359d.f2553F.getLooper()) {
            e();
        } else {
            c0359d.f2553F.post(new G0.c(8, this));
        }
    }

    @Override // P2.j
    public final void onConnectionFailed(O2.b bVar) {
        l(bVar, null);
    }

    @Override // P2.i
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        C0359d c0359d = this.f2488F;
        if (myLooper == c0359d.f2553F.getLooper()) {
            f(i);
        } else {
            c0359d.f2553F.post(new L.a(this, i, 1));
        }
    }
}
