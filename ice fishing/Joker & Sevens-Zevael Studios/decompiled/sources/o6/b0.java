package o6;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 implements n6.f, n6.g {

    /* renamed from: e, reason: collision with root package name */
    public final n6.a f5233e;

    /* renamed from: f, reason: collision with root package name */
    public final a f5234f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.c f5235g;

    /* renamed from: j, reason: collision with root package name */
    public final int f5238j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f5239k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5240l;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f5243o;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f5232d = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f5236h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5237i = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5241m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public m6.b f5242n = null;

    public b0(d dVar, r6.b bVar) {
        this.f5243o = dVar;
        Looper looper = dVar.f5267m.getLooper();
        a5.c a6 = bVar.a();
        s.g gVar = (s.g) a6.f262h;
        String str = (String) a6.f261g;
        String str2 = (String) a6.f263i;
        d7.a aVar = d7.a.f1716a;
        p6.d dVar2 = new p6.d(gVar, null, str, str2, aVar);
        a.a aVar2 = bVar.f6088c.f5071a;
        p6.u.g(aVar2);
        n6.a j3 = aVar2.j(bVar.f6086a, looper, dVar2, bVar.f6089d, this, this);
        String str3 = bVar.f6087b;
        if (str3 != null && (j3 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) j3).f1447w = str3;
        }
        if (str3 != null && (j3 instanceof i)) {
            a4.d.s(j3);
            throw null;
        }
        this.f5233e = j3;
        this.f5234f = bVar.f6090e;
        this.f5235g = new x4.c(7);
        this.f5238j = bVar.f6091f;
        if (!j3.n()) {
            this.f5239k = null;
            return;
        }
        Context context = dVar.f5259e;
        a7.c cVar = dVar.f5267m;
        a5.c a8 = bVar.a();
        this.f5239k = new l0(context, cVar, new p6.d((s.g) a8.f262h, null, (String) a8.f261g, (String) a8.f263i, aVar));
    }

    public final void a(m6.b bVar) {
        HashSet hashSet = this.f5236h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (p6.u.j(bVar, m6.b.f4901k)) {
                this.f5233e.i();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        p6.u.b(this.f5243o.f5267m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z10) {
        p6.u.b(this.f5243o.f5267m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5232d.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (!z10 || h0Var.f5278a == 2) {
                if (status != null) {
                    h0Var.c(status);
                } else {
                    h0Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f5232d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0 h0Var = (h0) arrayList.get(i10);
            if (!this.f5233e.a()) {
                return;
            }
            if (h(h0Var)) {
                linkedList.remove(h0Var);
            }
        }
    }

    public final void e() {
        d dVar = this.f5243o;
        p6.u.b(dVar.f5267m);
        this.f5242n = null;
        a(m6.b.f4901k);
        a7.c cVar = dVar.f5267m;
        if (this.f5240l) {
            a aVar = this.f5234f;
            cVar.removeMessages(11, aVar);
            cVar.removeMessages(9, aVar);
            this.f5240l = false;
        }
        Iterator it = this.f5237i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i10) {
        d dVar = this.f5243o;
        a7.c cVar = dVar.f5267m;
        p6.u.b(dVar.f5267m);
        this.f5242n = null;
        this.f5240l = true;
        String j3 = this.f5233e.j();
        x4.c cVar2 = this.f5235g;
        cVar2.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j3);
        }
        cVar2.g(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f5234f;
        cVar.sendMessageDelayed(Message.obtain(cVar, 9, aVar), 5000L);
        cVar.sendMessageDelayed(Message.obtain(cVar, 11, aVar), 120000L);
        ((SparseIntArray) dVar.f5261g.f8294g).clear();
        Iterator it = this.f5237i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void g() {
        d dVar = this.f5243o;
        a7.c cVar = dVar.f5267m;
        a aVar = this.f5234f;
        cVar.removeMessages(12, aVar);
        cVar.sendMessageDelayed(cVar.obtainMessage(12, aVar), dVar.f5255a);
    }

    public final boolean h(h0 h0Var) {
        m6.d dVar;
        if (!(h0Var instanceof h0)) {
            x4.c cVar = this.f5235g;
            n6.a aVar = this.f5233e;
            h0Var.f(cVar, aVar.n());
            try {
                h0Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                aVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        m6.d[] b2 = h0Var.b(this);
        if (b2 != null && b2.length != 0) {
            m6.d[] h10 = this.f5233e.h();
            if (h10 == null) {
                h10 = new m6.d[0];
            }
            s.f fVar = new s.f(h10.length);
            for (m6.d dVar2 : h10) {
                fVar.put(dVar2.f4909g, Long.valueOf(dVar2.a()));
            }
            int length = b2.length;
            for (int i10 = 0; i10 < length; i10++) {
                dVar = b2[i10];
                Long l10 = (Long) fVar.get(dVar.f4909g);
                if (l10 == null || l10.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            x4.c cVar2 = this.f5235g;
            n6.a aVar2 = this.f5233e;
            h0Var.f(cVar2, aVar2.n());
            try {
                h0Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                aVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f5233e.getClass().getName() + " could not execute call because it requires feature (" + dVar.f4909g + ", " + dVar.a() + ").");
        if (!this.f5243o.f5268n || !h0Var.a(this)) {
            h0Var.d(new n6.i(dVar));
            return true;
        }
        c0 c0Var = new c0(this.f5234f, dVar);
        int indexOf = this.f5241m.indexOf(c0Var);
        if (indexOf >= 0) {
            c0 c0Var2 = (c0) this.f5241m.get(indexOf);
            this.f5243o.f5267m.removeMessages(15, c0Var2);
            a7.c cVar3 = this.f5243o.f5267m;
            cVar3.sendMessageDelayed(Message.obtain(cVar3, 15, c0Var2), 5000L);
        } else {
            this.f5241m.add(c0Var);
            a7.c cVar4 = this.f5243o.f5267m;
            cVar4.sendMessageDelayed(Message.obtain(cVar4, 15, c0Var), 5000L);
            a7.c cVar5 = this.f5243o.f5267m;
            cVar5.sendMessageDelayed(Message.obtain(cVar5, 16, c0Var), 120000L);
            m6.b bVar = new m6.b(2, null);
            if (!i(bVar)) {
                this.f5243o.a(bVar, this.f5238j);
            }
        }
        return false;
    }

    public final boolean i(m6.b bVar) {
        synchronized (d.f5253q) {
        }
        return false;
    }

    public final void j() {
        d dVar = this.f5243o;
        p6.u.b(dVar.f5267m);
        n6.a aVar = this.f5233e;
        if (aVar.a() || aVar.f()) {
            return;
        }
        try {
            int j3 = dVar.f5261g.j(dVar.f5259e, aVar);
            if (j3 != 0) {
                m6.b bVar = new m6.b(j3, null);
                Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
                l(bVar, null);
                return;
            }
            d0 d0Var = new d0(dVar, aVar, this.f5234f);
            if (aVar.n()) {
                l0 l0Var = this.f5239k;
                p6.u.g(l0Var);
                Handler handler = l0Var.f5298e;
                p6.d dVar2 = l0Var.f5301h;
                e7.a aVar2 = l0Var.f5302i;
                if (aVar2 != null) {
                    aVar2.m();
                }
                dVar2.f5555a = Integer.valueOf(System.identityHashCode(l0Var));
                l0Var.f5302i = (e7.a) l0Var.f5299f.j(l0Var.f5297d, handler.getLooper(), dVar2, (d7.a) dVar2.f5561g, l0Var, l0Var);
                l0Var.f5303j = d0Var;
                Set set = l0Var.f5300g;
                if (set == null || set.isEmpty()) {
                    handler.post(new b4.g(11, l0Var));
                } else {
                    l0Var.f5302i.x();
                }
            }
            try {
                aVar.d(d0Var);
            } catch (SecurityException e10) {
                l(new m6.b(10), e10);
            }
        } catch (IllegalStateException e11) {
            l(new m6.b(10), e11);
        }
    }

    public final void k(h0 h0Var) {
        p6.u.b(this.f5243o.f5267m);
        boolean a6 = this.f5233e.a();
        LinkedList linkedList = this.f5232d;
        if (a6) {
            if (h(h0Var)) {
                g();
                return;
            } else {
                linkedList.add(h0Var);
                return;
            }
        }
        linkedList.add(h0Var);
        m6.b bVar = this.f5242n;
        if (bVar == null || !bVar.a()) {
            j();
        } else {
            l(this.f5242n, null);
        }
    }

    public final void l(m6.b bVar, RuntimeException runtimeException) {
        e7.a aVar;
        p6.u.b(this.f5243o.f5267m);
        l0 l0Var = this.f5239k;
        if (l0Var != null && (aVar = l0Var.f5302i) != null) {
            aVar.m();
        }
        p6.u.b(this.f5243o.f5267m);
        this.f5242n = null;
        ((SparseIntArray) this.f5243o.f5261g.f8294g).clear();
        a(bVar);
        if ((this.f5233e instanceof r6.c) && bVar.f4903h != 24) {
            d dVar = this.f5243o;
            dVar.f5256b = true;
            a7.c cVar = dVar.f5267m;
            cVar.sendMessageDelayed(cVar.obtainMessage(19), 300000L);
        }
        if (bVar.f4903h == 4) {
            b(d.f5252p);
            return;
        }
        if (this.f5232d.isEmpty()) {
            this.f5242n = bVar;
            return;
        }
        if (runtimeException != null) {
            p6.u.b(this.f5243o.f5267m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f5243o.f5268n) {
            b(d.b(this.f5234f, bVar));
            return;
        }
        c(d.b(this.f5234f, bVar), null, true);
        if (this.f5232d.isEmpty() || i(bVar) || this.f5243o.a(bVar, this.f5238j)) {
            return;
        }
        if (bVar.f4903h == 18) {
            this.f5240l = true;
        }
        if (!this.f5240l) {
            b(d.b(this.f5234f, bVar));
            return;
        }
        d dVar2 = this.f5243o;
        a aVar2 = this.f5234f;
        a7.c cVar2 = dVar2.f5267m;
        cVar2.sendMessageDelayed(Message.obtain(cVar2, 9, aVar2), 5000L);
    }

    public final void m(m6.b bVar) {
        p6.u.b(this.f5243o.f5267m);
        n6.a aVar = this.f5233e;
        aVar.c("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        p6.u.b(this.f5243o.f5267m);
        Status status = d.f5251o;
        b(status);
        this.f5235g.g(false, status);
        for (g gVar : (g[]) this.f5237i.keySet().toArray(new g[0])) {
            k(new n0(new g7.h()));
        }
        a(new m6.b(4));
        n6.a aVar = this.f5233e;
        if (aVar.a()) {
            aVar.l(new m7.g(6, this));
        }
    }

    @Override // n6.f
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        a7.c cVar = this.f5243o.f5267m;
        if (myLooper == cVar.getLooper()) {
            e();
        } else {
            cVar.post(new b4.g(9, this));
        }
    }

    @Override // n6.g
    public final void onConnectionFailed(m6.b bVar) {
        l(bVar, null);
    }

    @Override // n6.f
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        a7.c cVar = this.f5243o.f5267m;
        if (myLooper == cVar.getLooper()) {
            f(i10);
        } else {
            cVar.post(new e3.a(i10, 1, this));
        }
    }
}
