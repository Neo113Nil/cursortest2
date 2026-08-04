package com.gamericefishpro.space.u8;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.gamericefishpro.space.i9.d5;
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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements v {
    public int A;
    public com.gamericefishpro.space.p9.a D;
    public boolean E;
    public boolean F;
    public boolean G;
    public com.gamericefishpro.space.v8.j H;
    public boolean I;
    public boolean J;
    public final com.gamericefishpro.space.b8.k K;
    public final Map L;
    public final d5 M;
    public final x d;
    public final Lock e;
    public final Context i;
    public final com.gamericefishpro.space.s8.f v;
    public com.gamericefishpro.space.s8.b w;
    public int y;
    public int z = 0;
    public final Bundle B = new Bundle();
    public final HashSet C = new HashSet();
    public final ArrayList N = new ArrayList();

    public r(x xVar, com.gamericefishpro.space.b8.k kVar, Map map, com.gamericefishpro.space.s8.f fVar, d5 d5Var, Lock lock, Context context) {
        this.d = xVar;
        this.K = kVar;
        this.L = map;
        this.v = fVar;
        this.M = d5Var;
        this.e = lock;
        this.i = context;
    }

    public final void a() {
        this.F = false;
        x xVar = this.d;
        u uVar = xVar.p;
        HashMap map = xVar.j;
        uVar.p = Collections.EMPTY_SET;
        for (com.gamericefishpro.space.t8.b bVar : this.C) {
            if (!map.containsKey(bVar)) {
                map.put(bVar, new com.gamericefishpro.space.s8.b(17, null, null));
            }
        }
    }

    public final void b(boolean z) {
        com.gamericefishpro.space.p9.a aVar = this.D;
        if (aVar != null) {
            if (aVar.a() && z) {
                aVar.getClass();
                try {
                    com.gamericefishpro.space.p9.e eVar = (com.gamericefishpro.space.p9.e) aVar.u();
                    Integer num = aVar.a0;
                    com.gamericefishpro.space.v8.c0.g(num);
                    int iIntValue = num.intValue();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(eVar.f);
                    parcelObtain.writeInt(iIntValue);
                    eVar.E(parcelObtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.l();
            com.gamericefishpro.space.v8.c0.g(this.K);
            this.H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        x xVar = this.d;
        xVar.d.lock();
        try {
            xVar.p.g();
            xVar.n = new j(xVar);
            xVar.n.i();
            xVar.e.signalAll();
            xVar.d.unlock();
            y.a.execute(new com.gamericefishpro.space.h4.b(21, this));
            com.gamericefishpro.space.p9.a aVar = this.D;
            if (aVar != null) {
                if (this.I) {
                    com.gamericefishpro.space.v8.j jVar = this.H;
                    com.gamericefishpro.space.v8.c0.g(jVar);
                    boolean z = this.J;
                    aVar.getClass();
                    try {
                        com.gamericefishpro.space.p9.e eVar = (com.gamericefishpro.space.p9.e) aVar.u();
                        Integer num = aVar.a0;
                        com.gamericefishpro.space.v8.c0.g(num);
                        int iIntValue = num.intValue();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken(eVar.f);
                        int i = com.gamericefishpro.space.f9.b.a;
                        if (jVar == null) {
                            parcelObtain.writeStrongBinder(null);
                        } else {
                            parcelObtain.writeStrongBinder(((com.gamericefishpro.space.f9.a) jVar).asBinder());
                        }
                        parcelObtain.writeInt(iIntValue);
                        parcelObtain.writeInt(z ? 1 : 0);
                        eVar.E(parcelObtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.d.j.keySet().iterator();
            while (it.hasNext()) {
                com.gamericefishpro.space.t8.a aVar2 = (com.gamericefishpro.space.t8.a) this.d.i.get((com.gamericefishpro.space.t8.b) it.next());
                com.gamericefishpro.space.v8.c0.g(aVar2);
                aVar2.l();
            }
            this.d.q.a(this.B.isEmpty() ? null : this.B);
        } catch (Throwable th) {
            xVar.d.unlock();
            throw th;
        }
    }

    @Override // com.gamericefishpro.space.u8.v
    public final void d(Bundle bundle) {
        if (j(1)) {
            if (bundle != null) {
                this.B.putAll(bundle);
            }
            if (k()) {
                c();
            }
        }
    }

    public final void e(com.gamericefishpro.space.s8.b bVar) {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(!bVar.b());
        x xVar = this.d;
        xVar.e();
        xVar.q.b(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void f(com.gamericefishpro.space.s8.b bVar, com.gamericefishpro.space.t8.c cVar, boolean z) {
        cVar.a.getClass();
        if (z && !bVar.b()) {
            if (this.v.a(bVar.e, null, null) != null) {
                if (this.w != null) {
                    this.w = bVar;
                    this.y = Integer.MAX_VALUE;
                } else {
                    this.w = bVar;
                    this.y = Integer.MAX_VALUE;
                }
            }
        } else if (this.w != null || Integer.MAX_VALUE < this.y) {
            this.w = bVar;
            this.y = Integer.MAX_VALUE;
        }
        this.d.j.put(cVar.b, bVar);
    }

    @Override // com.gamericefishpro.space.u8.v
    public final void g(int i) {
        e(new com.gamericefishpro.space.s8.b(8, null, null));
    }

    public final void h() {
        if (this.A != 0) {
            return;
        }
        if (!this.F || this.G) {
            ArrayList arrayList = new ArrayList();
            this.z = 1;
            x xVar = this.d;
            Map map = xVar.i;
            Map map2 = xVar.i;
            this.A = map.size();
            for (com.gamericefishpro.space.t8.b bVar : map2.keySet()) {
                if (!xVar.j.containsKey(bVar)) {
                    arrayList.add((com.gamericefishpro.space.t8.a) map2.get(bVar));
                } else if (k()) {
                    c();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.N.add(y.a.submit(new n(this, arrayList, 1)));
        }
    }

    @Override // com.gamericefishpro.space.u8.v
    public final void i() {
        x xVar = this.d;
        HashMap map = xVar.j;
        u uVar = xVar.p;
        Map map2 = xVar.i;
        map.clear();
        this.F = false;
        this.w = null;
        this.z = 0;
        this.E = true;
        this.G = false;
        this.I = false;
        HashMap map3 = new HashMap();
        Map map4 = this.L;
        for (com.gamericefishpro.space.t8.c cVar : map4.keySet()) {
            com.gamericefishpro.space.t8.a aVar = (com.gamericefishpro.space.t8.a) map2.get(cVar.b);
            com.gamericefishpro.space.v8.c0.g(aVar);
            com.gamericefishpro.space.t8.a aVar2 = aVar;
            cVar.a.getClass();
            boolean zBooleanValue = ((Boolean) map4.get(cVar)).booleanValue();
            if (aVar2.m()) {
                this.F = true;
                if (zBooleanValue) {
                    this.C.add(cVar.b);
                } else {
                    this.E = false;
                }
            }
            map3.put(aVar2, new k(this, cVar, zBooleanValue));
        }
        if (this.F) {
            com.gamericefishpro.space.b8.k kVar = this.K;
            com.gamericefishpro.space.v8.c0.g(kVar);
            com.gamericefishpro.space.v8.c0.g(this.M);
            kVar.v = Integer.valueOf(System.identityHashCode(uVar));
            p pVar = new p(this);
            this.D = (com.gamericefishpro.space.p9.a) this.M.m(this.i, uVar.g, kVar, (com.gamericefishpro.space.o9.a) kVar.z, pVar, pVar);
        }
        this.A = map2.size();
        this.N.add(y.a.submit(new n(this, map3, 0)));
    }

    public final boolean j(int i) {
        if (this.z == i) {
            return true;
        }
        u uVar = this.d.p;
        uVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(uVar.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(uVar.i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(uVar.h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(uVar.w.a.size());
        i0 i0Var = uVar.d;
        if (i0Var != null) {
            i0Var.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.A);
        StringBuilder sbL = com.gamericefishpro.space.m5.a.l("GoogleApiClient connecting is in step ", this.z != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        sbL.append(i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sbL.toString(), new Exception());
        e(new com.gamericefishpro.space.s8.b(8, null, null));
        return false;
    }

    public final boolean k() {
        x xVar = this.d;
        int i = this.A - 1;
        this.A = i;
        if (i > 0) {
            return false;
        }
        if (i >= 0) {
            com.gamericefishpro.space.s8.b bVar = this.w;
            if (bVar == null) {
                return true;
            }
            xVar.o = this.y;
            e(bVar);
            return false;
        }
        u uVar = xVar.p;
        uVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(uVar.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(uVar.i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(uVar.h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(uVar.w.a.size());
        i0 i0Var = uVar.d;
        if (i0Var != null) {
            i0Var.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new com.gamericefishpro.space.s8.b(8, null, null));
        return false;
    }

    @Override // com.gamericefishpro.space.u8.v
    public final void p(com.gamericefishpro.space.s8.b bVar, com.gamericefishpro.space.t8.c cVar, boolean z) {
        if (j(1)) {
            f(bVar, cVar, z);
            if (k()) {
                c();
            }
        }
    }

    @Override // com.gamericefishpro.space.u8.v
    public final boolean q() {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.d.e();
        return true;
    }

    @Override // com.gamericefishpro.space.u8.v
    public final void n() {
    }
}
