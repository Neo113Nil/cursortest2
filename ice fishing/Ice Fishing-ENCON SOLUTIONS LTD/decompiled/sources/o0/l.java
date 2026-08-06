package o0;

import android.content.Context;
import android.os.DeadObjectException;
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
import l.C0978b;
import l.C0979c;
import n0.InterfaceC0989c;
import p0.AbstractC1021r;
import p0.C1010g;
import r0.C1041c;

/* loaded from: classes.dex */
public final class l implements n0.g, n0.h {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0989c f8275b;

    /* renamed from: c, reason: collision with root package name */
    public final C0997a f8276c;

    /* renamed from: d, reason: collision with root package name */
    public final o.b f8277d;

    /* renamed from: g, reason: collision with root package name */
    public final int f8280g;

    /* renamed from: h, reason: collision with root package name */
    public final u f8281h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f8286m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f8274a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8278e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f8279f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f8283j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public m0.b f8284k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f8285l = 0;

    public l(c cVar, n0.f fVar) {
        this.f8286m = cVar;
        Looper looper = cVar.f8269m.getLooper();
        I0.b a2 = fVar.a();
        Q0.c cVar2 = new Q0.c((C0979c) a2.f721b, (String) a2.f722c, (String) a2.f723d);
        R1.l lVar = (R1.l) fVar.f8204c.f8530b;
        AbstractC1021r.c(lVar);
        InterfaceC0989c b2 = lVar.b(fVar.f8202a, looper, cVar2, fVar.f8205d, this, this);
        String str = fVar.f8203b;
        if (str != null && (b2 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) b2).f2702r = str;
        }
        if (str != null && (b2 instanceof g)) {
            C1.a.n(b2);
            throw null;
        }
        this.f8275b = b2;
        this.f8276c = fVar.f8206e;
        this.f8277d = new o.b(2);
        this.f8280g = fVar.f8207f;
        if (!b2.j()) {
            this.f8281h = null;
            return;
        }
        Context context = cVar.f8261e;
        A0.a aVar = cVar.f8269m;
        I0.b a3 = fVar.a();
        this.f8281h = new u(context, aVar, new Q0.c((C0979c) a3.f721b, (String) a3.f722c, (String) a3.f723d));
    }

    @Override // n0.g
    public final void a(int i2) {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f8286m;
        if (myLooper == cVar.f8269m.getLooper()) {
            i(i2);
        } else {
            cVar.f8269m.post(new k(this, i2));
        }
    }

    @Override // n0.h
    public final void b(m0.b bVar) {
        o(bVar, null);
    }

    @Override // n0.g
    public final void c() {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f8286m;
        if (myLooper == cVar.f8269m.getLooper()) {
            h();
        } else {
            cVar.f8269m.post(new C.b(9, this));
        }
    }

    public final void d(m0.b bVar) {
        HashSet hashSet = this.f8278e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC1021r.e(bVar, m0.b.f8161e)) {
                this.f8275b.e();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        AbstractC1021r.a(this.f8286m.f8269m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z2) {
        AbstractC1021r.a(this.f8286m.f8269m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f8274a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (!z2 || qVar.f8297a == 2) {
                if (status != null) {
                    qVar.c(status);
                } else {
                    qVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f8274a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) arrayList.get(i2);
            if (!this.f8275b.d()) {
                return;
            }
            if (k(qVar)) {
                linkedList.remove(qVar);
            }
        }
    }

    public final void h() {
        c cVar = this.f8286m;
        AbstractC1021r.a(cVar.f8269m);
        this.f8284k = null;
        d(m0.b.f8161e);
        if (this.f8282i) {
            A0.a aVar = cVar.f8269m;
            C0997a c0997a = this.f8276c;
            aVar.removeMessages(11, c0997a);
            cVar.f8269m.removeMessages(9, c0997a);
            this.f8282i = false;
        }
        Iterator it = this.f8279f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i2) {
        c cVar = this.f8286m;
        AbstractC1021r.a(cVar.f8269m);
        this.f8284k = null;
        this.f8282i = true;
        String f2 = this.f8275b.f();
        o.b bVar = this.f8277d;
        bVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (f2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(f2);
        }
        bVar.c(true, new Status(20, sb.toString(), null, null));
        A0.a aVar = cVar.f8269m;
        C0997a c0997a = this.f8276c;
        aVar.sendMessageDelayed(Message.obtain(aVar, 9, c0997a), 5000L);
        A0.a aVar2 = cVar.f8269m;
        aVar2.sendMessageDelayed(Message.obtain(aVar2, 11, c0997a), 120000L);
        ((SparseIntArray) cVar.f8263g.f8226b).clear();
        Iterator it = this.f8279f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        c cVar = this.f8286m;
        A0.a aVar = cVar.f8269m;
        C0997a c0997a = this.f8276c;
        aVar.removeMessages(12, c0997a);
        A0.a aVar2 = cVar.f8269m;
        aVar2.sendMessageDelayed(aVar2.obtainMessage(12, c0997a), cVar.f8257a);
    }

    public final boolean k(q qVar) {
        m0.d dVar;
        if (qVar == null) {
            InterfaceC0989c interfaceC0989c = this.f8275b;
            qVar.f(this.f8277d, interfaceC0989c.j());
            try {
                qVar.e(this);
            } catch (DeadObjectException unused) {
                a(1);
                interfaceC0989c.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        m0.d[] b2 = qVar.b(this);
        if (b2 != null && b2.length != 0) {
            m0.d[] c2 = this.f8275b.c();
            if (c2 == null) {
                c2 = new m0.d[0];
            }
            int length = c2.length;
            C0978b c0978b = new C0978b();
            if (length == 0) {
                c0978b.f8122a = l.d.f8094a;
                c0978b.f8123b = l.d.f8095b;
            } else {
                c0978b.a(length);
            }
            c0978b.f8124c = 0;
            for (m0.d dVar2 : c2) {
                c0978b.put(dVar2.f8169a, Long.valueOf(dVar2.a()));
            }
            int length2 = b2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                dVar = b2[i2];
                Long l2 = (Long) c0978b.getOrDefault(dVar.f8169a, null);
                if (l2 == null || l2.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            InterfaceC0989c interfaceC0989c2 = this.f8275b;
            qVar.f(this.f8277d, interfaceC0989c2.j());
            try {
                qVar.e(this);
            } catch (DeadObjectException unused2) {
                a(1);
                interfaceC0989c2.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f8275b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f8169a + ", " + dVar.a() + ").");
        if (!this.f8286m.f8270n || !qVar.a(this)) {
            qVar.d(new n0.k(dVar));
            return true;
        }
        m mVar = new m(this.f8276c, dVar);
        int indexOf = this.f8283j.indexOf(mVar);
        if (indexOf >= 0) {
            m mVar2 = (m) this.f8283j.get(indexOf);
            this.f8286m.f8269m.removeMessages(15, mVar2);
            A0.a aVar = this.f8286m.f8269m;
            aVar.sendMessageDelayed(Message.obtain(aVar, 15, mVar2), 5000L);
        } else {
            this.f8283j.add(mVar);
            A0.a aVar2 = this.f8286m.f8269m;
            aVar2.sendMessageDelayed(Message.obtain(aVar2, 15, mVar), 5000L);
            A0.a aVar3 = this.f8286m.f8269m;
            aVar3.sendMessageDelayed(Message.obtain(aVar3, 16, mVar), 120000L);
            m0.b bVar = new m0.b(2, null);
            if (!l(bVar)) {
                this.f8286m.b(bVar, this.f8280g);
            }
        }
        return false;
    }

    public final boolean l(m0.b bVar) {
        synchronized (c.f8255q) {
            this.f8286m.getClass();
        }
        return false;
    }

    public final void m() {
        c cVar = this.f8286m;
        AbstractC1021r.a(cVar.f8269m);
        InterfaceC0989c interfaceC0989c = this.f8275b;
        if (interfaceC0989c.d() || interfaceC0989c.b()) {
            return;
        }
        try {
            o.b bVar = cVar.f8263g;
            Context context = cVar.f8261e;
            bVar.getClass();
            AbstractC1021r.c(context);
            int m2 = interfaceC0989c.m();
            SparseIntArray sparseIntArray = (SparseIntArray) bVar.f8226b;
            int i2 = sparseIntArray.get(m2, -1);
            if (i2 == -1) {
                i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > m2 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 == -1) {
                    i2 = ((m0.f) bVar.f8227c).b(context, m2);
                }
                sparseIntArray.put(m2, i2);
            }
            if (i2 != 0) {
                m0.b bVar2 = new m0.b(i2, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC0989c.getClass().getName() + " is not available: " + bVar2.toString());
                o(bVar2, null);
                return;
            }
            n nVar = new n(cVar, interfaceC0989c, this.f8276c);
            if (interfaceC0989c.j()) {
                u uVar = this.f8281h;
                AbstractC1021r.c(uVar);
                C0.a aVar = uVar.f8316g;
                if (aVar != null) {
                    aVar.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(uVar));
                Q0.c cVar2 = uVar.f8315f;
                cVar2.f1523f = valueOf;
                A0.a aVar2 = uVar.f8312c;
                uVar.f8316g = (C0.a) uVar.f8313d.b(uVar.f8311b, aVar2.getLooper(), cVar2, (B0.a) cVar2.f1522e, uVar, uVar);
                uVar.f8317h = nVar;
                Set set = uVar.f8314e;
                if (set == null || set.isEmpty()) {
                    aVar2.post(new C.b(11, uVar));
                } else {
                    C0.a aVar3 = uVar.f8316g;
                    aVar3.getClass();
                    aVar3.k(new C1010g(aVar3));
                }
            }
            try {
                interfaceC0989c.k(nVar);
            } catch (SecurityException e2) {
                o(new m0.b(10), e2);
            }
        } catch (IllegalStateException e3) {
            o(new m0.b(10), e3);
        }
    }

    public final void n(q qVar) {
        AbstractC1021r.a(this.f8286m.f8269m);
        boolean d2 = this.f8275b.d();
        LinkedList linkedList = this.f8274a;
        if (d2) {
            if (k(qVar)) {
                j();
                return;
            } else {
                linkedList.add(qVar);
                return;
            }
        }
        linkedList.add(qVar);
        m0.b bVar = this.f8284k;
        if (bVar == null || bVar.f8163b == 0 || bVar.f8164c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(m0.b bVar, RuntimeException runtimeException) {
        C0.a aVar;
        AbstractC1021r.a(this.f8286m.f8269m);
        u uVar = this.f8281h;
        if (uVar != null && (aVar = uVar.f8316g) != null) {
            aVar.h();
        }
        AbstractC1021r.a(this.f8286m.f8269m);
        this.f8284k = null;
        ((SparseIntArray) this.f8286m.f8263g.f8226b).clear();
        d(bVar);
        if ((this.f8275b instanceof C1041c) && bVar.f8163b != 24) {
            c cVar = this.f8286m;
            cVar.f8258b = true;
            A0.a aVar2 = cVar.f8269m;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(19), 300000L);
        }
        if (bVar.f8163b == 4) {
            e(c.f8254p);
            return;
        }
        if (this.f8274a.isEmpty()) {
            this.f8284k = bVar;
            return;
        }
        if (runtimeException != null) {
            AbstractC1021r.a(this.f8286m.f8269m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f8286m.f8270n) {
            e(c.c(this.f8276c, bVar));
            return;
        }
        f(c.c(this.f8276c, bVar), null, true);
        if (this.f8274a.isEmpty() || l(bVar) || this.f8286m.b(bVar, this.f8280g)) {
            return;
        }
        if (bVar.f8163b == 18) {
            this.f8282i = true;
        }
        if (!this.f8282i) {
            e(c.c(this.f8276c, bVar));
            return;
        }
        c cVar2 = this.f8286m;
        C0997a c0997a = this.f8276c;
        A0.a aVar3 = cVar2.f8269m;
        aVar3.sendMessageDelayed(Message.obtain(aVar3, 9, c0997a), 5000L);
    }

    public final void p(m0.b bVar) {
        AbstractC1021r.a(this.f8286m.f8269m);
        InterfaceC0989c interfaceC0989c = this.f8275b;
        interfaceC0989c.i("onSignInFailed for " + interfaceC0989c.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        AbstractC1021r.a(this.f8286m.f8269m);
        Status status = c.f8253o;
        e(status);
        this.f8277d.c(false, status);
        for (f fVar : (f[]) this.f8279f.keySet().toArray(new f[0])) {
            n(new w(new D0.d()));
        }
        d(new m0.b(4));
        InterfaceC0989c interfaceC0989c = this.f8275b;
        if (interfaceC0989c.d()) {
            interfaceC0989c.a(new Z0.i(25, this));
        }
    }
}
