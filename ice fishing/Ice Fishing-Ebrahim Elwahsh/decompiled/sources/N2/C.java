package N2;

import O2.AbstractC0369f;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import e3.C4470a;
import f3.C4502a;
import g1.C4523c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m.c1;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class C implements M2.i, M2.j {

    /* renamed from: A, reason: collision with root package name */
    public final N f1982A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1983B;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C0318d f1987F;

    /* renamed from: u, reason: collision with root package name */
    public final M2.c f1989u;

    /* renamed from: v, reason: collision with root package name */
    public final C0315a f1990v;

    /* renamed from: w, reason: collision with root package name */
    public final S0.c f1991w;

    /* renamed from: z, reason: collision with root package name */
    public final int f1994z;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedList f1988n = new LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f1992x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f1993y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f1984C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public L2.b f1985D = null;

    /* renamed from: E, reason: collision with root package name */
    public int f1986E = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C(C0318d c0318d, M2.h hVar) {
        this.f1987F = c0318d;
        Looper looper = c0318d.f2052F.getLooper();
        Y2.e b9 = hVar.b();
        s.c cVar = (s.c) b9.f3963u;
        String str = (String) b9.f3964v;
        String str2 = (String) b9.f3965w;
        C4470a c4470a = C4470a.f37325b;
        c1 c1Var = new c1(cVar, null, str, str2, c4470a);
        com.bumptech.glide.g gVar = hVar.f1890v.f1881a;
        O2.w.h(gVar);
        M2.c A8 = gVar.A(hVar.f1888n, looper, c1Var, hVar.f1891w, this, this);
        String str3 = hVar.f1889u;
        if (str3 != null && (A8 instanceof AbstractC0369f)) {
            ((AbstractC0369f) A8).f2397Q = str3;
        }
        if (str3 != null && (A8 instanceof AbstractServiceConnectionC0322h)) {
            D.y.r(A8);
            throw null;
        }
        this.f1989u = A8;
        this.f1990v = hVar.f1892x;
        this.f1991w = new S0.c(5);
        this.f1994z = hVar.f1893y;
        if (!A8.n()) {
            this.f1982A = null;
            return;
        }
        Context context = c0318d.f2058x;
        Z2.e eVar = c0318d.f2052F;
        Y2.e b10 = hVar.b();
        this.f1982A = new N(context, eVar, new c1((s.c) b10.f3963u, null, (String) b10.f3964v, (String) b10.f3965w, c4470a));
    }

    public final void a(L2.b bVar) {
        HashSet hashSet = this.f1992x;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (O2.w.l(bVar, L2.b.f1710y)) {
                this.f1989u.f();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        O2.w.c(this.f1987F.f2052F);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z8) {
        O2.w.c(this.f1987F.f2052F);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f1988n.iterator();
        while (it.hasNext()) {
            I i = (I) it.next();
            if (!z8 || i.f2005a == 2) {
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
        LinkedList linkedList = this.f1988n;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            I i4 = (I) arrayList.get(i);
            if (!this.f1989u.j()) {
                return;
            }
            if (h(i4)) {
                linkedList.remove(i4);
            }
        }
    }

    public final void e() {
        C0318d c0318d = this.f1987F;
        O2.w.c(c0318d.f2052F);
        this.f1985D = null;
        a(L2.b.f1710y);
        if (this.f1983B) {
            Z2.e eVar = c0318d.f2052F;
            C0315a c0315a = this.f1990v;
            eVar.removeMessages(11, c0315a);
            c0318d.f2052F.removeMessages(9, c0315a);
            this.f1983B = false;
        }
        Iterator it = this.f1993y.values().iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        C0318d c0318d = this.f1987F;
        O2.w.c(c0318d.f2052F);
        this.f1985D = null;
        this.f1983B = true;
        String m8 = this.f1989u.m();
        S0.c cVar = this.f1991w;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (m8 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(m8);
        }
        cVar.D(true, new Status(20, sb.toString(), null, null));
        Z2.e eVar = c0318d.f2052F;
        C0315a c0315a = this.f1990v;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, c0315a), com.anythink.basead.exoplayer.f.f7344a);
        Z2.e eVar2 = c0318d.f2052F;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, c0315a), 120000L);
        ((SparseIntArray) c0318d.f2060z.f2886u).clear();
        Iterator it = this.f1993y.values().iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
    }

    public final void g() {
        C0318d c0318d = this.f1987F;
        Z2.e eVar = c0318d.f2052F;
        C0315a c0315a = this.f1990v;
        eVar.removeMessages(12, c0315a);
        Z2.e eVar2 = c0318d.f2052F;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c0315a), c0318d.f2054n);
    }

    public final boolean h(I i) {
        L2.d dVar;
        if (i instanceof I) {
            L2.d[] b9 = i.b(this);
            if (b9 != null && b9.length != 0) {
                L2.d[] l9 = this.f1989u.l();
                if (l9 == null) {
                    l9 = new L2.d[0];
                }
                s.b bVar = new s.b(l9.length);
                for (L2.d dVar2 : l9) {
                    bVar.put(dVar2.f1719n, Long.valueOf(dVar2.a()));
                }
                int length = b9.length;
                for (int i4 = 0; i4 < length; i4++) {
                    dVar = b9[i4];
                    Long l10 = (Long) bVar.getOrDefault(dVar.f1719n, null);
                    if (l10 == null || l10.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                String name = this.f1989u.getClass().getName();
                String str = dVar.f1719n;
                long a9 = dVar.a();
                StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
                AbstractC5051n.j(sb, name, " could not execute call because it requires feature (", str, ", ");
                sb.append(a9);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                if (!this.f1987F.f2053G || !i.a(this)) {
                    i.d(new M2.l(dVar));
                    return true;
                }
                D d2 = new D(this.f1990v, dVar);
                int indexOf = this.f1984C.indexOf(d2);
                if (indexOf >= 0) {
                    D d3 = (D) this.f1984C.get(indexOf);
                    this.f1987F.f2052F.removeMessages(15, d3);
                    Z2.e eVar = this.f1987F.f2052F;
                    Message obtain = Message.obtain(eVar, 15, d3);
                    this.f1987F.getClass();
                    eVar.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7344a);
                } else {
                    this.f1984C.add(d2);
                    Z2.e eVar2 = this.f1987F.f2052F;
                    Message obtain2 = Message.obtain(eVar2, 15, d2);
                    this.f1987F.getClass();
                    eVar2.sendMessageDelayed(obtain2, com.anythink.basead.exoplayer.f.f7344a);
                    Z2.e eVar3 = this.f1987F.f2052F;
                    Message obtain3 = Message.obtain(eVar3, 16, d2);
                    this.f1987F.getClass();
                    eVar3.sendMessageDelayed(obtain3, 120000L);
                    L2.b bVar2 = new L2.b(2, null, null);
                    if (!i(bVar2)) {
                        this.f1987F.b(bVar2, this.f1994z);
                    }
                }
                return false;
            }
            M2.c cVar = this.f1989u;
            i.f(this.f1991w, cVar.n());
            try {
                i.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            M2.c cVar2 = this.f1989u;
            i.f(this.f1991w, cVar2.n());
            try {
                i.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean i(L2.b bVar) {
        synchronized (C0318d.J) {
            this.f1987F.getClass();
        }
        return false;
    }

    public final void j() {
        C0318d c0318d = this.f1987F;
        O2.w.c(c0318d.f2052F);
        M2.c cVar = this.f1989u;
        if (cVar.j() || cVar.d()) {
            return;
        }
        try {
            int C7 = c0318d.f2060z.C(c0318d.f2058x, cVar);
            if (C7 != 0) {
                L2.b bVar = new L2.b(C7, null, null);
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
            E e6 = new E(c0318d, cVar, this.f1990v);
            if (cVar.n()) {
                N n9 = this.f1982A;
                O2.w.h(n9);
                C4502a c4502a = n9.f2024y;
                if (c4502a != null) {
                    c4502a.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(n9));
                c1 c1Var = n9.f2023x;
                c1Var.f39400z = valueOf;
                Z2.e eVar = n9.f2020u;
                Looper looper = eVar.getLooper();
                n9.f2024y = (C4502a) n9.f2021v.A(n9.f2019n, looper, c1Var, (C4470a) c1Var.f39399y, n9, n9);
                n9.f2025z = e6;
                Set set = n9.f2022w;
                if (set == null || set.isEmpty()) {
                    eVar.post(new F3.C(7, n9));
                } else {
                    n9.f2024y.A();
                }
            }
            try {
                cVar.i(e6);
            } catch (SecurityException e9) {
                l(new L2.b(10, null, null), e9);
            }
        } catch (IllegalStateException e10) {
            l(new L2.b(10, null, null), e10);
        }
    }

    public final void k(I i) {
        O2.w.c(this.f1987F.f2052F);
        boolean j9 = this.f1989u.j();
        LinkedList linkedList = this.f1988n;
        if (j9) {
            if (h(i)) {
                g();
                return;
            } else {
                linkedList.add(i);
                return;
            }
        }
        linkedList.add(i);
        L2.b bVar = this.f1985D;
        if (bVar == null || !bVar.a()) {
            j();
        } else {
            l(this.f1985D, null);
        }
    }

    public final void l(L2.b bVar, RuntimeException runtimeException) {
        C4502a c4502a;
        O2.w.c(this.f1987F.f2052F);
        N n9 = this.f1982A;
        if (n9 != null && (c4502a = n9.f2024y) != null) {
            c4502a.h();
        }
        O2.w.c(this.f1987F.f2052F);
        this.f1985D = null;
        ((SparseIntArray) this.f1987F.f2060z.f2886u).clear();
        a(bVar);
        if ((this.f1989u instanceof Q2.d) && bVar.f1712u != 24) {
            C0318d c0318d = this.f1987F;
            c0318d.f2055u = true;
            Z2.e eVar = c0318d.f2052F;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f1712u == 4) {
            b(C0318d.f2045I);
            return;
        }
        if (this.f1988n.isEmpty()) {
            this.f1985D = bVar;
            return;
        }
        if (runtimeException != null) {
            O2.w.c(this.f1987F.f2052F);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f1987F.f2053G) {
            b(C0318d.c(this.f1990v, bVar));
            return;
        }
        c(C0318d.c(this.f1990v, bVar), null, true);
        if (this.f1988n.isEmpty() || i(bVar) || this.f1987F.b(bVar, this.f1994z)) {
            return;
        }
        if (bVar.f1712u == 18) {
            this.f1983B = true;
        }
        if (!this.f1983B) {
            b(C0318d.c(this.f1990v, bVar));
            return;
        }
        Z2.e eVar2 = this.f1987F.f2052F;
        Message obtain = Message.obtain(eVar2, 9, this.f1990v);
        this.f1987F.getClass();
        eVar2.sendMessageDelayed(obtain, com.anythink.basead.exoplayer.f.f7344a);
    }

    public final void m() {
        O2.w.c(this.f1987F.f2052F);
        Status status = C0318d.f2044H;
        b(status);
        this.f1991w.D(false, status);
        for (AbstractC0320f abstractC0320f : (AbstractC0320f[]) this.f1993y.keySet().toArray(new AbstractC0320f[0])) {
            k(new P(new h3.h()));
        }
        a(new L2.b(4, null, null));
        M2.c cVar = this.f1989u;
        if (cVar.j()) {
            cVar.a(new C4523c(7, this));
        }
    }

    @Override // M2.i
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        C0318d c0318d = this.f1987F;
        if (myLooper == c0318d.f2052F.getLooper()) {
            e();
        } else {
            c0318d.f2052F.post(new F3.C(5, this));
        }
    }

    @Override // M2.j
    public final void onConnectionFailed(L2.b bVar) {
        l(bVar, null);
    }

    @Override // M2.i
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        C0318d c0318d = this.f1987F;
        if (myLooper == c0318d.f2052F.getLooper()) {
            f(i);
        } else {
            c0318d.f2052F.post(new L.a(this, i, 1));
        }
    }
}
