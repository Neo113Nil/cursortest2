package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public final class axw implements rmd, smd {
    public final fo0 h;
    public final wo0 i;
    public final apo j;
    public final int m;
    public final sxw n;
    public boolean o;
    public final /* synthetic */ umd s;
    public final LinkedList a = new LinkedList();
    public final HashSet k = new HashSet();
    public final HashMap l = new HashMap();
    public final ArrayList p = new ArrayList();
    public h66 q = null;
    public int r = 0;

    public axw(umd umdVar, omd omdVar) {
        this.s = umdVar;
        Looper looper = umdVar.n.getLooper();
        nsh a = omdVar.a();
        cz0 cz0Var = (cz0) a.b;
        String str = (String) a.c;
        String str2 = (String) a.d;
        tfq tfqVar = tfq.a;
        rn5 rn5Var = new rn5(cz0Var, (xy0) null, str, str2, tfqVar);
        i4w i4wVar = omdVar.c.a;
        y1g.G(i4wVar);
        fo0 p = i4wVar.p(omdVar.a, looper, rn5Var, omdVar.d, this, this);
        String str3 = omdVar.b;
        if (str3 != null && (p instanceof a)) {
            ((a) p).x = str3;
        }
        if (str3 != null && (p instanceof o8j)) {
            eta.q(p);
            throw null;
        }
        this.h = p;
        this.i = omdVar.e;
        this.j = new apo(19);
        this.m = omdVar.g;
        if (!p.e()) {
            this.n = null;
            return;
        }
        Context context = umdVar.e;
        fsn fsnVar = umdVar.n;
        nsh a2 = omdVar.a();
        this.n = new sxw(context, fsnVar, new rn5((cz0) a2.b, (xy0) null, (String) a2.c, (String) a2.d, tfqVar));
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        fsn fsnVar = this.s.n;
        if (myLooper == fsnVar.getLooper()) {
            f();
        } else {
            fsnVar.post(new yyo(14, this));
        }
    }

    @Override // defpackage.smd
    public final void X(h66 h66Var) {
        m(h66Var, null);
    }

    public final i6c a(i6c[] i6cVarArr) {
        if (i6cVarArr == null || i6cVarArr.length == 0) {
            return null;
        }
        i6c[] l = this.h.l();
        if (l == null) {
            l = new i6c[0];
        }
        xy0 xy0Var = new xy0(l.length);
        for (i6c i6cVar : l) {
            xy0Var.put(i6cVar.a, Long.valueOf(i6cVar.d()));
        }
        for (i6c i6cVar2 : i6cVarArr) {
            Long l2 = (Long) xy0Var.get(i6cVar2.a);
            if (l2 == null || l2.longValue() < i6cVar2.d()) {
                return i6cVar2;
            }
        }
        return null;
    }

    public final void b(h66 h66Var) {
        HashSet hashSet = this.k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            l1j.f();
        } else {
            if (ldg.s(h66Var, h66.e)) {
                this.h.d();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        y1g.A(this.s.n);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z) {
        y1g.A(this.s.n);
        if ((status == null) == (exc == null)) {
            xq0.x("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jyw jywVar = (jyw) it.next();
            if (!z || jywVar.a == 2) {
                if (status != null) {
                    jywVar.a(status);
                } else {
                    jywVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jyw jywVar = (jyw) arrayList.get(i);
            if (!this.h.isConnected()) {
                return;
            }
            if (i(jywVar)) {
                linkedList.remove(jywVar);
            }
        }
    }

    public final void f() {
        fo0 fo0Var = this.h;
        umd umdVar = this.s;
        y1g.A(umdVar.n);
        this.q = null;
        b(h66.e);
        fsn fsnVar = umdVar.n;
        if (this.o) {
            wo0 wo0Var = this.i;
            fsnVar.removeMessages(11, wo0Var);
            fsnVar.removeMessages(9, wo0Var);
            this.o = false;
        }
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            qxw qxwVar = (qxw) it.next();
            if (a((i6c[]) qxwVar.a.c) != null) {
                it.remove();
            } else {
                try {
                    yks yksVar = qxwVar.a;
                    onx onxVar = new onx();
                    uiq uiqVar = (uiq) ((c1t) yksVar.d).c;
                    uiqVar.getClass();
                    jox joxVar = (jox) fo0Var;
                    y0x y0xVar = (y0x) joxVar.s();
                    f4x f4xVar = ((h4x) uiqVar.b).k;
                    Parcel M0 = y0xVar.M0();
                    y4x.d(M0, f4xVar);
                    y0xVar.P0(M0, 18);
                    y0x y0xVar2 = (y0x) joxVar.s();
                    y0xVar2.P0(y0xVar2.M0(), 17);
                    onxVar.q(null);
                } catch (DeadObjectException unused) {
                    p0(3);
                    fo0Var.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i) {
        umd umdVar = this.s;
        fsn fsnVar = umdVar.n;
        y1g.A(umdVar.n);
        this.q = null;
        this.o = true;
        String m = this.h.m();
        apo apoVar = this.j;
        apoVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (m != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(m);
        }
        apoVar.t(new Status(20, sb.toString(), null, null), true);
        wo0 wo0Var = this.i;
        fsnVar.sendMessageDelayed(Message.obtain(fsnVar, 9, wo0Var), 5000L);
        fsnVar.sendMessageDelayed(Message.obtain(fsnVar, 11, wo0Var), 120000L);
        ((SparseIntArray) umdVar.g.b).clear();
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            ((qxw) it.next()).getClass();
        }
    }

    public final void h() {
        umd umdVar = this.s;
        fsn fsnVar = umdVar.n;
        wo0 wo0Var = this.i;
        fsnVar.removeMessages(12, wo0Var);
        fsnVar.sendMessageDelayed(fsnVar.obtainMessage(12, wo0Var), umdVar.a);
    }

    public final boolean i(jyw jywVar) {
        if (!(jywVar instanceof hxw)) {
            apo apoVar = this.j;
            fo0 fo0Var = this.h;
            jywVar.d(apoVar, fo0Var.e());
            try {
                jywVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                p0(1);
                fo0Var.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        hxw hxwVar = (hxw) jywVar;
        i6c a = a(hxwVar.g(this));
        if (a == null) {
            apo apoVar2 = this.j;
            fo0 fo0Var2 = this.h;
            jywVar.d(apoVar2, fo0Var2.e());
            try {
                jywVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                p0(1);
                fo0Var2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.h.getClass().getName() + " could not execute call because it requires feature (" + a.a + ", " + a.d() + ").");
        if (!this.s.o || !hxwVar.f(this)) {
            hxwVar.b(new jmt(a));
            return true;
        }
        bxw bxwVar = new bxw(this.i, a);
        int indexOf = this.p.indexOf(bxwVar);
        ArrayList arrayList = this.p;
        if (indexOf >= 0) {
            bxw bxwVar2 = (bxw) arrayList.get(indexOf);
            this.s.n.removeMessages(15, bxwVar2);
            fsn fsnVar = this.s.n;
            fsnVar.sendMessageDelayed(Message.obtain(fsnVar, 15, bxwVar2), 5000L);
            return false;
        }
        arrayList.add(bxwVar);
        fsn fsnVar2 = this.s.n;
        fsnVar2.sendMessageDelayed(Message.obtain(fsnVar2, 15, bxwVar), 5000L);
        fsn fsnVar3 = this.s.n;
        fsnVar3.sendMessageDelayed(Message.obtain(fsnVar3, 16, bxwVar), 120000L);
        h66 h66Var = new h66(2, null);
        if (j(h66Var)) {
            return false;
        }
        this.s.c(h66Var, this.m);
        return false;
    }

    public final boolean j(h66 h66Var) {
        synchronized (umd.r) {
            try {
                umd umdVar = this.s;
                if (umdVar.k == null || !umdVar.l.contains(this.i)) {
                    return false;
                }
                this.s.k.m(h66Var, this.m);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        umd umdVar = this.s;
        y1g.A(umdVar.n);
        fo0 fo0Var = this.h;
        if (fo0Var.isConnected() || fo0Var.c()) {
            return;
        }
        try {
            int q = umdVar.g.q(umdVar.e, fo0Var);
            if (q != 0) {
                h66 h66Var = new h66(q, null);
                Log.w("GoogleApiManager", "The service for " + fo0Var.getClass().getName() + " is not available: " + h66Var.toString());
                m(h66Var, null);
                return;
            }
            cxw cxwVar = new cxw(umdVar, fo0Var, this.i);
            if (fo0Var.e()) {
                sxw sxwVar = this.n;
                y1g.G(sxwVar);
                Handler handler = sxwVar.i;
                rn5 rn5Var = sxwVar.l;
                rfq rfqVar = sxwVar.m;
                if (rfqVar != null) {
                    rfqVar.disconnect();
                }
                rn5Var.h = Integer.valueOf(System.identityHashCode(sxwVar));
                sxwVar.m = (rfq) sxwVar.j.p(sxwVar.h, handler.getLooper(), rn5Var, (tfq) rn5Var.g, sxwVar, sxwVar);
                sxwVar.n = cxwVar;
                Set set = sxwVar.k;
                if (set == null || set.isEmpty()) {
                    handler.post(new yyo(16, sxwVar));
                } else {
                    rfq rfqVar2 = sxwVar.m;
                    rfqVar2.getClass();
                    rfqVar2.j(new dr2(rfqVar2));
                }
            }
            try {
                fo0Var.j(cxwVar);
            } catch (SecurityException e) {
                m(new h66(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new h66(10), e2);
        }
    }

    public final void l(jyw jywVar) {
        y1g.A(this.s.n);
        boolean isConnected = this.h.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (i(jywVar)) {
                h();
                return;
            } else {
                linkedList.add(jywVar);
                return;
            }
        }
        linkedList.add(jywVar);
        h66 h66Var = this.q;
        if (h66Var == null || !h66Var.d()) {
            k();
        } else {
            m(this.q, null);
        }
    }

    public final void m(h66 h66Var, RuntimeException runtimeException) {
        rfq rfqVar;
        y1g.A(this.s.n);
        sxw sxwVar = this.n;
        if (sxwVar != null && (rfqVar = sxwVar.m) != null) {
            rfqVar.disconnect();
        }
        y1g.A(this.s.n);
        this.q = null;
        ((SparseIntArray) this.s.g.b).clear();
        b(h66Var);
        if ((this.h instanceof syw) && h66Var.b != 24) {
            umd umdVar = this.s;
            umdVar.b = true;
            fsn fsnVar = umdVar.n;
            fsnVar.sendMessageDelayed(fsnVar.obtainMessage(19), 300000L);
        }
        if (h66Var.b == 4) {
            c(umd.q);
            return;
        }
        if (this.a.isEmpty()) {
            this.q = h66Var;
            return;
        }
        umd umdVar2 = this.s;
        if (runtimeException != null) {
            y1g.A(umdVar2.n);
            d(null, runtimeException, false);
            return;
        }
        boolean z = umdVar2.o;
        wo0 wo0Var = this.i;
        if (!z) {
            c(umd.d(wo0Var, h66Var));
            return;
        }
        d(umd.d(wo0Var, h66Var), null, true);
        if (this.a.isEmpty() || j(h66Var) || this.s.c(h66Var, this.m)) {
            return;
        }
        if (h66Var.b == 18) {
            this.o = true;
        }
        if (!this.o) {
            c(umd.d(this.i, h66Var));
            return;
        }
        umd umdVar3 = this.s;
        wo0 wo0Var2 = this.i;
        fsn fsnVar2 = umdVar3.n;
        fsnVar2.sendMessageDelayed(Message.obtain(fsnVar2, 9, wo0Var2), 5000L);
    }

    public final void n(h66 h66Var) {
        y1g.A(this.s.n);
        fo0 fo0Var = this.h;
        fo0Var.b("onSignInFailed for " + fo0Var.getClass().getName() + " with " + String.valueOf(h66Var));
        m(h66Var, null);
    }

    public final void o() {
        y1g.A(this.s.n);
        Status status = umd.p;
        c(status);
        this.j.t(status, false);
        for (vcg vcgVar : (vcg[]) this.l.keySet().toArray(new vcg[0])) {
            l(new cyw(vcgVar, new i8s()));
        }
        b(new h66(4));
        fo0 fo0Var = this.h;
        if (fo0Var.isConnected()) {
            fo0Var.h(new z6n(19, this));
        }
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
        Looper myLooper = Looper.myLooper();
        fsn fsnVar = this.s.n;
        if (myLooper == fsnVar.getLooper()) {
            g(i);
        } else {
            fsnVar.post(new zs3(this, i, 5));
        }
    }
}
