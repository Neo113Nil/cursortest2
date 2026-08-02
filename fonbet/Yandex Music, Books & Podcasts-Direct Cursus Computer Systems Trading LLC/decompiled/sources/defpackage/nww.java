package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class nww implements vww {
    public final xww a;
    public final Lock b;
    public final Context c;
    public final qmd d;
    public h66 e;
    public int f;
    public int h;
    public rfq k;
    public boolean l;
    public boolean m;
    public boolean n;
    public g8e o;
    public boolean p;
    public boolean q;
    public final rn5 r;
    public final Map s;
    public final i4w t;
    public int g = 0;
    public final Bundle i = new Bundle();
    public final HashSet j = new HashSet();
    public final ArrayList u = new ArrayList();

    public nww(xww xwwVar, rn5 rn5Var, Map map, qmd qmdVar, i4w i4wVar, Lock lock, Context context) {
        this.a = xwwVar;
        this.r = rn5Var;
        this.s = map;
        this.d = qmdVar;
        this.t = i4wVar;
        this.b = lock;
        this.c = context;
    }

    public final void a() {
        this.m = false;
        xww xwwVar = this.a;
        uww uwwVar = xwwVar.s;
        HashMap hashMap = xwwVar.m;
        uwwVar.p = Collections.EMPTY_SET;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            go0 go0Var = (go0) it.next();
            if (!hashMap.containsKey(go0Var)) {
                hashMap.put(go0Var, new h66(17, null));
            }
        }
    }

    @Override // defpackage.vww
    public final void b(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (k()) {
                d();
            }
        }
    }

    public final void c(boolean z) {
        rfq rfqVar = this.k;
        if (rfqVar != null) {
            if (rfqVar.isConnected() && z) {
                try {
                    byw bywVar = (byw) rfqVar.s();
                    Integer num = rfqVar.H;
                    y1g.G(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(bywVar.i);
                    obtain.writeInt(intValue);
                    bywVar.R(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            rfqVar.disconnect();
            y1g.G(this.r);
            this.o = null;
        }
    }

    public final void d() {
        xww xwwVar = this.a;
        xwwVar.a.lock();
        try {
            xwwVar.s.k();
            xwwVar.q = new hww(xwwVar);
            xwwVar.q.h();
            xwwVar.h.signalAll();
            xwwVar.a.unlock();
            yww.a.execute(new yyo(13, this));
            rfq rfqVar = this.k;
            if (rfqVar != null) {
                if (this.p) {
                    g8e g8eVar = this.o;
                    y1g.G(g8eVar);
                    boolean z = this.q;
                    try {
                        byw bywVar = (byw) rfqVar.s();
                        Integer num = rfqVar.H;
                        y1g.G(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(bywVar.i);
                        int i = kxw.a;
                        obtain.writeStrongBinder(g8eVar.asBinder());
                        obtain.writeInt(intValue);
                        obtain.writeInt(z ? 1 : 0);
                        bywVar.R(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                c(false);
            }
            Iterator it = this.a.m.keySet().iterator();
            while (it.hasNext()) {
                fo0 fo0Var = (fo0) this.a.l.get((go0) it.next());
                y1g.G(fo0Var);
                fo0Var.disconnect();
            }
            this.a.t.f(this.i.isEmpty() ? null : this.i);
        } catch (Throwable th) {
            xwwVar.a.unlock();
            throw th;
        }
    }

    public final void e(h66 h66Var) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        c(!h66Var.d());
        xww xwwVar = this.a;
        xwwVar.h();
        xwwVar.t.p(h66Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.a(null, null, r3.b) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(h66 h66Var, po0 po0Var, boolean z) {
        po0Var.a.getClass();
        if (z && !h66Var.d()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = h66Var;
            this.f = Integer.MAX_VALUE;
        }
        this.a.m.put(po0Var.b, h66Var);
    }

    public final void g() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            xww xwwVar = this.a;
            Map map = xwwVar.l;
            Map map2 = xwwVar.l;
            this.h = map.size();
            for (go0 go0Var : map2.keySet()) {
                if (!xwwVar.m.containsKey(go0Var)) {
                    arrayList.add((fo0) map2.get(go0Var));
                } else if (k()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(yww.a.submit(new kww(this, arrayList, 1)));
        }
    }

    @Override // defpackage.vww
    public final void h() {
        xww xwwVar = this.a;
        HashMap hashMap = xwwVar.m;
        uww uwwVar = xwwVar.s;
        Map map = xwwVar.l;
        hashMap.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.s;
        for (po0 po0Var : map2.keySet()) {
            fo0 fo0Var = (fo0) map.get(po0Var.b);
            y1g.G(fo0Var);
            fo0 fo0Var2 = fo0Var;
            po0Var.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(po0Var)).booleanValue();
            if (fo0Var2.e()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(po0Var.b);
                } else {
                    this.l = false;
                }
            }
            hashMap2.put(fo0Var2, new iww(this, po0Var, booleanValue));
        }
        if (this.m) {
            rn5 rn5Var = this.r;
            y1g.G(rn5Var);
            y1g.G(this.t);
            rn5Var.h = Integer.valueOf(System.identityHashCode(uwwVar));
            mww mwwVar = new mww(this);
            this.k = (rfq) this.t.p(this.c, uwwVar.g, rn5Var, (tfq) rn5Var.g, mwwVar, mwwVar);
        }
        this.h = map.size();
        this.u.add(yww.a.submit(new kww(this, hashMap2, 0)));
    }

    public final boolean i(int i) {
        if (this.g == i) {
            return true;
        }
        uww uwwVar = this.a.s;
        uwwVar.getClass();
        StringWriter stringWriter = new StringWriter();
        uwwVar.h("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.h);
        StringBuilder u = ouj.u("GoogleApiClient connecting is in step ", this.g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        u.append(i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", u.toString(), new Exception());
        e(new h66(8, null));
        return false;
    }

    public final boolean k() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        xww xwwVar = this.a;
        if (i >= 0) {
            h66 h66Var = this.e;
            if (h66Var == null) {
                return true;
            }
            xwwVar.r = this.f;
            e(h66Var);
            return false;
        }
        uww uwwVar = xwwVar.s;
        uwwVar.getClass();
        StringWriter stringWriter = new StringWriter();
        uwwVar.h("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new h66(8, null));
        return false;
    }

    @Override // defpackage.vww
    public final gr2 l(gr2 gr2Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.vww
    public final void n(int i) {
        e(new h66(8, null));
    }

    @Override // defpackage.vww
    public final boolean o() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        c(true);
        this.a.h();
        return true;
    }

    @Override // defpackage.vww
    public final void p(h66 h66Var, po0 po0Var, boolean z) {
        if (i(1)) {
            f(h66Var, po0Var, z);
            if (k()) {
                d();
            }
        }
    }

    @Override // defpackage.vww
    public final void j() {
    }
}
