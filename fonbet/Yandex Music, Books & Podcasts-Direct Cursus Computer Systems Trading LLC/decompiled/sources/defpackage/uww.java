package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class uww extends tmd implements gxw {
    public final ReentrantLock b;
    public final lyw c;
    public final int e;
    public final Context f;
    public final Looper g;
    public volatile boolean i;
    public final sww l;
    public final pmd m;
    public fxw n;
    public final xy0 o;
    public final rn5 q;
    public final xy0 r;
    public final i4w s;
    public final ArrayList u;
    public Integer v;
    public final qne w;
    public mxw d = null;
    public final LinkedList h = new LinkedList();
    public final long j = 120000;
    public final long k = 5000;
    public Set p = new HashSet();
    public final awc t = new awc(10);

    public uww(Context context, ReentrantLock reentrantLock, Looper looper, rn5 rn5Var, pmd pmdVar, bww bwwVar, xy0 xy0Var, ArrayList arrayList, ArrayList arrayList2, xy0 xy0Var2, int i, int i2, ArrayList arrayList3) {
        this.v = null;
        gao gaoVar = new gao(this);
        this.f = context;
        this.b = reentrantLock;
        this.c = new lyw(looper, gaoVar);
        this.g = looper;
        this.l = new sww(this, looper, 0);
        this.m = pmdVar;
        this.e = i;
        if (i >= 0) {
            this.v = Integer.valueOf(i2);
        }
        this.r = xy0Var;
        this.o = xy0Var2;
        this.u = arrayList3;
        this.w = new qne(2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rmd rmdVar = (rmd) it.next();
            lyw lywVar = this.c;
            lywVar.getClass();
            y1g.G(rmdVar);
            synchronized (lywVar.i) {
                try {
                    if (lywVar.b.contains(rmdVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(rmdVar) + " is already registered");
                    } else {
                        lywVar.b.add(rmdVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (lywVar.a.L()) {
                fsn fsnVar = lywVar.h;
                fsnVar.sendMessage(fsnVar.obtainMessage(1, rmdVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.c.a((smd) it2.next());
        }
        this.q = rn5Var;
        this.s = bwwVar;
    }

    public static int i(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            fo0 fo0Var = (fo0) it.next();
            z2 |= fo0Var.e();
            z3 |= fo0Var.a();
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ void j(uww uwwVar) {
        uwwVar.b.lock();
        try {
            if (uwwVar.i) {
                uwwVar.m();
            }
        } finally {
            uwwVar.b.unlock();
        }
    }

    @Override // defpackage.tmd
    public final void a() {
        this.b.lock();
        try {
            this.w.E();
            mxw mxwVar = this.d;
            if (mxwVar != null) {
                mxwVar.d();
            }
            awc awcVar = this.t;
            Iterator it = ((Set) awcVar.a).iterator();
            while (it.hasNext()) {
                ((wcg) it.next()).a = null;
            }
            ((Set) awcVar.a).clear();
            for (gr2 gr2Var : this.h) {
                gr2Var.g.set(null);
                gr2Var.b();
            }
            this.h.clear();
            if (this.d != null) {
                k();
                lyw lywVar = this.c;
                lywVar.e = false;
                lywVar.f.incrementAndGet();
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.tmd
    public final gr2 b(gr2 gr2Var) {
        xy0 xy0Var = this.o;
        po0 po0Var = gr2Var.p;
        y1g.y("GoogleApiClient is not configured to use " + (po0Var != null ? po0Var.c : "the API") + " required for this call.", xy0Var.containsKey(gr2Var.o));
        this.b.lock();
        try {
            mxw mxwVar = this.d;
            if (mxwVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.i) {
                this.h.add(gr2Var);
                while (!this.h.isEmpty()) {
                    gr2 gr2Var2 = (gr2) this.h.remove();
                    qne qneVar = this.w;
                    ((Set) qneVar.a).add(gr2Var2);
                    gr2Var2.g.set((yxw) qneVar.b);
                    gr2Var2.m(Status.g);
                }
            } else {
                gr2Var = mxwVar.f(gr2Var);
            }
            this.b.unlock();
            return gr2Var;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.tmd
    public final Looper c() {
        return this.g;
    }

    @Override // defpackage.tmd
    public final boolean d(dzw dzwVar) {
        mxw mxwVar = this.d;
        return mxwVar != null && mxwVar.b(dzwVar);
    }

    @Override // defpackage.tmd
    public final void e() {
        mxw mxwVar = this.d;
        if (mxwVar != null) {
            mxwVar.c();
        }
    }

    @Override // defpackage.gxw
    public final void f(Bundle bundle) {
        while (!this.h.isEmpty()) {
            b((gr2) this.h.remove());
        }
        lyw lywVar = this.c;
        if (Looper.myLooper() != lywVar.h.getLooper()) {
            xq0.q("onConnectionSuccess must only be called on the Handler thread");
            return;
        }
        synchronized (lywVar.i) {
            try {
                if (lywVar.g) {
                    throw new IllegalStateException();
                }
                lywVar.h.removeMessages(1);
                lywVar.g = true;
                if (!lywVar.c.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(lywVar.b);
                int i = lywVar.f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rmd rmdVar = (rmd) it.next();
                    if (!lywVar.e || !lywVar.a.L() || lywVar.f.get() != i) {
                        break;
                    } else if (!lywVar.c.contains(rmdVar)) {
                        rmdVar.R(bundle);
                    }
                }
                lywVar.c.clear();
                lywVar.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = this.e;
            Integer num = this.v;
            int i2 = 2;
            boolean z = false;
            if (i >= 0) {
                y1g.I("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.v = Integer.valueOf(i(this.o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.v;
            y1g.G(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    y1g.y("Illegal sign-in mode: " + i2, z);
                    l(i2);
                    m();
                    reentrantLock.unlock();
                    return;
                }
                y1g.y("Illegal sign-in mode: " + i2, z);
                l(i2);
                m();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.i);
        printWriter.append(" mWorkQueue.size()=").print(this.h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(((Set) this.w.a).size());
        mxw mxwVar = this.d;
        if (mxwVar != null) {
            mxwVar.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean k() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        fxw fxwVar = this.n;
        if (fxwVar != null) {
            fxwVar.b();
            this.n = null;
        }
        return true;
    }

    public final void l(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.v.intValue();
            throw new IllegalStateException(vz1.s(new StringBuilder("Cannot use sign-in mode: "), i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED"));
        }
        if (this.d != null) {
            return;
        }
        xy0 xy0Var = this.o;
        Iterator it = ((wy0) xy0Var.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            fo0 fo0Var = (fo0) it.next();
            z |= fo0Var.e();
            z2 |= fo0Var.a();
        }
        int intValue2 = this.v.intValue();
        ArrayList arrayList = this.u;
        xy0 xy0Var2 = this.r;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                xq0.q("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    xq0.q("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                xy0Var = xy0Var;
            }
        } else {
            if (intValue2 == 2 && z) {
                xy0 xy0Var3 = new xy0(0);
                xy0 xy0Var4 = new xy0(0);
                Iterator it2 = ((sy0) xy0Var.entrySet()).iterator();
                fo0 fo0Var2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    fo0 fo0Var3 = (fo0) entry.getValue();
                    if (true == fo0Var3.a()) {
                        fo0Var2 = fo0Var3;
                    }
                    if (fo0Var3.e()) {
                        xy0Var3.put((go0) entry.getKey(), fo0Var3);
                    } else {
                        xy0Var4.put((go0) entry.getKey(), fo0Var3);
                    }
                }
                y1g.I("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !xy0Var3.isEmpty());
                xy0 xy0Var5 = new xy0(0);
                xy0 xy0Var6 = new xy0(0);
                Iterator it3 = ((uy0) xy0Var2.keySet()).iterator();
                while (it3.hasNext()) {
                    po0 po0Var = (po0) it3.next();
                    go0 go0Var = po0Var.b;
                    if (xy0Var3.containsKey(go0Var)) {
                        xy0Var5.put(po0Var, (Boolean) xy0Var2.get(po0Var));
                    } else {
                        if (!xy0Var4.containsKey(go0Var)) {
                            xq0.q("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        xy0Var6.put(po0Var, (Boolean) xy0Var2.get(po0Var));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    wyw wywVar = (wyw) arrayList.get(i2);
                    if (xy0Var5.containsKey(wywVar.a)) {
                        arrayList2.add(wywVar);
                    } else {
                        if (!xy0Var6.containsKey(wywVar.a)) {
                            xq0.q("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(wywVar);
                    }
                }
                this.d = new dww(this.f, this, reentrantLock2, this.g, this.m, xy0Var3, xy0Var4, this.q, this.s, fo0Var2, arrayList2, arrayList3, xy0Var5, xy0Var6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new xww(this.f, this, reentrantLock, this.g, this.m, xy0Var, this.q, xy0Var2, this.s, arrayList, this);
    }

    public final void m() {
        this.c.e = true;
        mxw mxwVar = this.d;
        y1g.G(mxwVar);
        mxwVar.a();
    }

    @Override // defpackage.gxw
    public final void p(h66 h66Var) {
        pmd pmdVar = this.m;
        Context context = this.f;
        int i = h66Var.b;
        pmdVar.getClass();
        AtomicBoolean atomicBoolean = rnd.a;
        if (!(i == 18 ? true : i == 1 ? rnd.a(context) : false)) {
            k();
        }
        if (this.i) {
            return;
        }
        lyw lywVar = this.c;
        if (Looper.myLooper() != lywVar.h.getLooper()) {
            xq0.q("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        lywVar.h.removeMessages(1);
        synchronized (lywVar.i) {
            try {
                ArrayList arrayList = new ArrayList(lywVar.d);
                int i2 = lywVar.f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    smd smdVar = (smd) it.next();
                    if (lywVar.e && lywVar.f.get() == i2) {
                        if (lywVar.d.contains(smdVar)) {
                            smdVar.X(h66Var);
                        }
                    }
                }
            } finally {
            }
        }
        lyw lywVar2 = this.c;
        lywVar2.e = false;
        lywVar2.f.incrementAndGet();
    }

    @Override // defpackage.gxw
    public final void z(int i) {
        if (i == 1) {
            if (!this.i) {
                this.i = true;
                if (this.n == null) {
                    try {
                        pmd pmdVar = this.m;
                        Context applicationContext = this.f.getApplicationContext();
                        tww twwVar = new tww(this);
                        pmdVar.getClass();
                        this.n = pmd.f(applicationContext, twwVar);
                    } catch (SecurityException unused) {
                    }
                }
                sww swwVar = this.l;
                swwVar.sendMessageDelayed(swwVar.obtainMessage(1), this.j);
                sww swwVar2 = this.l;
                swwVar2.sendMessageDelayed(swwVar2.obtainMessage(2), this.k);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.w.a).toArray(new BasePendingResult[0])) {
            basePendingResult.d(qne.c);
        }
        lyw lywVar = this.c;
        if (Looper.myLooper() != lywVar.h.getLooper()) {
            xq0.q("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        lywVar.h.removeMessages(1);
        synchronized (lywVar.i) {
            try {
                lywVar.g = true;
                ArrayList arrayList = new ArrayList(lywVar.b);
                int i2 = lywVar.f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rmd rmdVar = (rmd) it.next();
                    if (!lywVar.e || lywVar.f.get() != i2) {
                        break;
                    } else if (lywVar.b.contains(rmdVar)) {
                        rmdVar.p0(i);
                    }
                }
                lywVar.c.clear();
                lywVar.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        lyw lywVar2 = this.c;
        lywVar2.e = false;
        lywVar2.f.incrementAndGet();
        if (i == 2) {
            m();
        }
    }
}
