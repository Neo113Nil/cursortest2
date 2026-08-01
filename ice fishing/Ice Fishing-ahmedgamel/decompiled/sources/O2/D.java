package O2;

import P2.AbstractC0376f;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import g3.C4528a;
import h3.C4564a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m.b1;

/* loaded from: classes.dex */
public final class D implements N2.i, N2.j {

    /* renamed from: A, reason: collision with root package name */
    public final O f2165A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2166B;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C0354d f2170F;

    /* renamed from: u, reason: collision with root package name */
    public final N2.c f2172u;

    /* renamed from: v, reason: collision with root package name */
    public final C0351a f2173v;

    /* renamed from: w, reason: collision with root package name */
    public final C0361k f2174w;

    /* renamed from: z, reason: collision with root package name */
    public final int f2177z;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedList f2171n = new LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f2175x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f2176y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f2167C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public M2.b f2168D = null;

    /* renamed from: E, reason: collision with root package name */
    public int f2169E = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public D(C0354d c0354d, N2.h hVar) {
        this.f2170F = c0354d;
        Looper looper = c0354d.f2235F.getLooper();
        Z2.e a9 = hVar.a();
        s.c cVar = (s.c) a9.f4170u;
        String str = (String) a9.f4171v;
        String str2 = (String) a9.f4172w;
        C4528a c4528a = C4528a.f37653b;
        b1 b1Var = new b1(cVar, null, str, str2, c4528a);
        O3.b bVar = hVar.f1945v.f1936a;
        P2.w.h(bVar);
        N2.c d2 = bVar.d(hVar.f1943n, looper, b1Var, hVar.f1946w, this, this);
        String str3 = hVar.f1944u;
        if (str3 != null && (d2 instanceof AbstractC0376f)) {
            ((AbstractC0376f) d2).f2469Q = str3;
        }
        if (str3 != null && (d2 instanceof AbstractServiceConnectionC0358h)) {
            D.y.v(d2);
            throw null;
        }
        this.f2172u = d2;
        this.f2173v = hVar.f1947x;
        this.f2174w = new C0361k();
        this.f2177z = hVar.f1948y;
        if (!d2.m()) {
            this.f2165A = null;
            return;
        }
        Context context = c0354d.f2241x;
        a3.e eVar = c0354d.f2235F;
        Z2.e a10 = hVar.a();
        this.f2165A = new O(context, eVar, new b1((s.c) a10.f4170u, null, (String) a10.f4171v, (String) a10.f4172w, c4528a));
    }

    public final void a(M2.b bVar) {
        HashSet hashSet = this.f2175x;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (P2.w.l(bVar, M2.b.f1828y)) {
                this.f2172u.g();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        P2.w.c(this.f2170F.f2235F);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z3) {
        P2.w.c(this.f2170F.f2235F);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2171n.iterator();
        while (it.hasNext()) {
            J j6 = (J) it.next();
            if (!z3 || j6.f2188a == 2) {
                if (status != null) {
                    j6.c(status);
                } else {
                    j6.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f2171n;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            J j6 = (J) arrayList.get(i);
            if (!this.f2172u.i()) {
                return;
            }
            if (h(j6)) {
                linkedList.remove(j6);
            }
        }
    }

    public final void e() {
        C0354d c0354d = this.f2170F;
        P2.w.c(c0354d.f2235F);
        this.f2168D = null;
        a(M2.b.f1828y);
        if (this.f2166B) {
            a3.e eVar = c0354d.f2235F;
            C0351a c0351a = this.f2173v;
            eVar.removeMessages(11, c0351a);
            c0354d.f2235F.removeMessages(9, c0351a);
            this.f2166B = false;
        }
        Iterator it = this.f2176y.values().iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        C0354d c0354d = this.f2170F;
        P2.w.c(c0354d.f2235F);
        this.f2168D = null;
        this.f2166B = true;
        String l9 = this.f2172u.l();
        C0361k c0361k = this.f2174w;
        c0361k.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (l9 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(l9);
        }
        c0361k.a(true, new Status(20, sb.toString(), null, null));
        a3.e eVar = c0354d.f2235F;
        C0351a c0351a = this.f2173v;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, c0351a), com.anythink.basead.exoplayer.f.f7187a);
        a3.e eVar2 = c0354d.f2235F;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, c0351a), 120000L);
        ((SparseIntArray) c0354d.f2243z.f2775u).clear();
        Iterator it = this.f2176y.values().iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
    }

    public final void g() {
        C0354d c0354d = this.f2170F;
        a3.e eVar = c0354d.f2235F;
        C0351a c0351a = this.f2173v;
        eVar.removeMessages(12, c0351a);
        a3.e eVar2 = c0354d.f2235F;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c0351a), c0354d.f2237n);
    }

    public final boolean h(J j6) {
        M2.d dVar;
        if (j6 instanceof J) {
            M2.d[] b9 = j6.b(this);
            if (b9 != null && b9.length != 0) {
                M2.d[] k9 = this.f2172u.k();
                if (k9 == null) {
                    k9 = new M2.d[0];
                }
                s.b bVar = new s.b(k9.length);
                for (M2.d dVar2 : k9) {
                    bVar.put(dVar2.f1837n, Long.valueOf(dVar2.a()));
                }
                int length = b9.length;
                for (int i = 0; i < length; i++) {
                    dVar = b9[i];
                    Long l9 = (Long) bVar.getOrDefault(dVar.f1837n, null);
                    if (l9 == null || l9.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                String name = this.f2172u.getClass().getName();
                String str = dVar.f1837n;
                long a9 = dVar.a();
                StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
                u1.h.i(sb, name, " could not execute call because it requires feature (", str, ", ");
                sb.append(a9);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                if (!this.f2170F.f2236G || !j6.a(this)) {
                    j6.d(new N2.l(dVar));
                    return true;
                }
                E e9 = new E(this.f2173v, dVar);
                int indexOf = this.f2167C.indexOf(e9);
                if (indexOf >= 0) {
                    E e10 = (E) this.f2167C.get(indexOf);
                    this.f2170F.f2235F.removeMessages(15, e10);
                    a3.e eVar = this.f2170F.f2235F;
                    Message obtain = Message.obtain(eVar, 15, e10);
                    this.f2170F.getClass();
                    eVar.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7187a);
                } else {
                    this.f2167C.add(e9);
                    a3.e eVar2 = this.f2170F.f2235F;
                    Message obtain2 = Message.obtain(eVar2, 15, e9);
                    this.f2170F.getClass();
                    eVar2.sendMessageDelayed(obtain2, com.anythink.basead.exoplayer.f.f7187a);
                    a3.e eVar3 = this.f2170F.f2235F;
                    Message obtain3 = Message.obtain(eVar3, 16, e9);
                    this.f2170F.getClass();
                    eVar3.sendMessageDelayed(obtain3, 120000L);
                    M2.b bVar2 = new M2.b(2, null, null);
                    if (!i(bVar2)) {
                        this.f2170F.b(bVar2, this.f2177z);
                    }
                }
                return false;
            }
            N2.c cVar = this.f2172u;
            j6.f(this.f2174w, cVar.m());
            try {
                j6.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.d("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            N2.c cVar2 = this.f2172u;
            j6.f(this.f2174w, cVar2.m());
            try {
                j6.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.d("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean i(M2.b bVar) {
        synchronized (C0354d.J) {
            this.f2170F.getClass();
        }
        return false;
    }

    public final void j() {
        C0354d c0354d = this.f2170F;
        P2.w.c(c0354d.f2235F);
        N2.c cVar = this.f2172u;
        if (cVar.i() || cVar.e()) {
            return;
        }
        try {
            int r9 = c0354d.f2243z.r(c0354d.f2241x, cVar);
            if (r9 != 0) {
                M2.b bVar = new M2.b(r9, null, null);
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
            F f3 = new F(c0354d, cVar, this.f2173v);
            if (cVar.m()) {
                O o6 = this.f2165A;
                P2.w.h(o6);
                C4564a c4564a = o6.f2207y;
                if (c4564a != null) {
                    c4564a.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(o6));
                b1 b1Var = o6.f2206x;
                b1Var.f39127z = valueOf;
                a3.e eVar = o6.f2203u;
                Looper looper = eVar.getLooper();
                o6.f2207y = (C4564a) o6.f2204v.d(o6.f2202n, looper, b1Var, (C4528a) b1Var.f39126y, o6, o6);
                o6.f2208z = f3;
                Set set = o6.f2205w;
                if (set == null || set.isEmpty()) {
                    eVar.post(new G0.c(10, o6));
                } else {
                    o6.f2207y.A();
                }
            }
            try {
                cVar.c(f3);
            } catch (SecurityException e9) {
                l(new M2.b(10, null, null), e9);
            }
        } catch (IllegalStateException e10) {
            l(new M2.b(10, null, null), e10);
        }
    }

    public final void k(J j6) {
        P2.w.c(this.f2170F.f2235F);
        boolean i = this.f2172u.i();
        LinkedList linkedList = this.f2171n;
        if (i) {
            if (h(j6)) {
                g();
                return;
            } else {
                linkedList.add(j6);
                return;
            }
        }
        linkedList.add(j6);
        M2.b bVar = this.f2168D;
        if (bVar == null || !bVar.a()) {
            j();
        } else {
            l(this.f2168D, null);
        }
    }

    public final void l(M2.b bVar, RuntimeException runtimeException) {
        C4564a c4564a;
        P2.w.c(this.f2170F.f2235F);
        O o6 = this.f2165A;
        if (o6 != null && (c4564a = o6.f2207y) != null) {
            c4564a.h();
        }
        P2.w.c(this.f2170F.f2235F);
        this.f2168D = null;
        ((SparseIntArray) this.f2170F.f2243z.f2775u).clear();
        a(bVar);
        if ((this.f2172u instanceof R2.d) && bVar.f1830u != 24) {
            C0354d c0354d = this.f2170F;
            c0354d.f2238u = true;
            a3.e eVar = c0354d.f2235F;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f1830u == 4) {
            b(C0354d.f2228I);
            return;
        }
        if (this.f2171n.isEmpty()) {
            this.f2168D = bVar;
            return;
        }
        if (runtimeException != null) {
            P2.w.c(this.f2170F.f2235F);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f2170F.f2236G) {
            b(C0354d.c(this.f2173v, bVar));
            return;
        }
        c(C0354d.c(this.f2173v, bVar), null, true);
        if (this.f2171n.isEmpty() || i(bVar) || this.f2170F.b(bVar, this.f2177z)) {
            return;
        }
        if (bVar.f1830u == 18) {
            this.f2166B = true;
        }
        if (!this.f2166B) {
            b(C0354d.c(this.f2173v, bVar));
            return;
        }
        a3.e eVar2 = this.f2170F.f2235F;
        Message obtain = Message.obtain(eVar2, 9, this.f2173v);
        this.f2170F.getClass();
        eVar2.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7187a);
    }

    public final void m() {
        P2.w.c(this.f2170F.f2235F);
        Status status = C0354d.f2227H;
        b(status);
        this.f2174w.a(false, status);
        for (AbstractC0356f abstractC0356f : (AbstractC0356f[]) this.f2176y.keySet().toArray(new AbstractC0356f[0])) {
            k(new Q(new j3.h()));
        }
        a(new M2.b(4, null, null));
        N2.c cVar = this.f2172u;
        if (cVar.i()) {
            cVar.n(new I0.j(10, this));
        }
    }

    @Override // N2.i
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        C0354d c0354d = this.f2170F;
        if (myLooper == c0354d.f2235F.getLooper()) {
            e();
        } else {
            c0354d.f2235F.post(new G0.c(8, this));
        }
    }

    @Override // N2.j
    public final void onConnectionFailed(M2.b bVar) {
        l(bVar, null);
    }

    @Override // N2.i
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        C0354d c0354d = this.f2170F;
        if (myLooper == c0354d.f2235F.getLooper()) {
            f(i);
        } else {
            c0354d.f2235F.post(new L.a(this, i, 1));
        }
    }
}
