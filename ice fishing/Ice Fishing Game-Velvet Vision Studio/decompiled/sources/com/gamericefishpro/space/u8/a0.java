package com.gamericefishpro.space.u8;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.gamericefishpro.space.i9.d5;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements com.gamericefishpro.space.t8.f, com.gamericefishpro.space.t8.g {
    public final com.gamericefishpro.space.t8.a e;
    public final a f;
    public final com.gamericefishpro.space.u6.c g;
    public final int j;
    public final l0 k;
    public boolean l;
    public final /* synthetic */ d o;
    public final LinkedList d = new LinkedList();
    public final HashSet h = new HashSet();
    public final HashMap i = new HashMap();
    public final ArrayList m = new ArrayList();
    public com.gamericefishpro.space.s8.b n = null;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(d dVar, com.gamericefishpro.space.x8.b bVar) {
        this.o = dVar;
        Looper looper = dVar.F.getLooper();
        com.gamericefishpro.space.r5.b bVarA = bVar.a();
        com.gamericefishpro.space.t.f fVar = (com.gamericefishpro.space.t.f) bVarA.e;
        String str = (String) bVarA.i;
        String str2 = (String) bVarA.v;
        com.gamericefishpro.space.o9.a aVar = com.gamericefishpro.space.o9.a.a;
        com.gamericefishpro.space.b8.k kVar = new com.gamericefishpro.space.b8.k(fVar, null, str, str2, aVar);
        d5 d5Var = bVar.c.a;
        com.gamericefishpro.space.v8.c0.g(d5Var);
        com.gamericefishpro.space.t8.a aVarM = d5Var.m(bVar.a, looper, kVar, bVar.d, this, this);
        String str3 = bVar.b;
        if (str3 != null && (aVarM instanceof com.gamericefishpro.space.v8.f)) {
            ((com.gamericefishpro.space.v8.f) aVarM).Q = str3;
        }
        if (str3 != null && (aVarM instanceof h)) {
            com.gamericefishpro.space.m5.a.s(aVarM);
            throw null;
        }
        this.e = aVarM;
        this.f = bVar.e;
        this.g = new com.gamericefishpro.space.u6.c(15);
        this.j = bVar.f;
        if (!aVarM.m()) {
            this.k = null;
            return;
        }
        Context context = dVar.w;
        com.gamericefishpro.space.f9.e eVar = dVar.F;
        com.gamericefishpro.space.r5.b bVarA2 = bVar.a();
        this.k = new l0(context, eVar, new com.gamericefishpro.space.b8.k((com.gamericefishpro.space.t.f) bVarA2.e, null, (String) bVarA2.i, (String) bVarA2.v, aVar));
    }

    public final void a(com.gamericefishpro.space.s8.b bVar) {
        HashSet hashSet = this.h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.gamericefishpro.space.v8.c0.j(bVar, com.gamericefishpro.space.s8.b.y)) {
                this.e.j();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (!z || h0Var.a == 2) {
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
        LinkedList linkedList = this.d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h0 h0Var = (h0) arrayList.get(i);
            if (!this.e.a()) {
                return;
            }
            if (h(h0Var)) {
                linkedList.remove(h0Var);
            }
        }
    }

    public final void e() {
        d dVar = this.o;
        com.gamericefishpro.space.v8.c0.c(dVar.F);
        this.n = null;
        a(com.gamericefishpro.space.s8.b.y);
        com.gamericefishpro.space.f9.e eVar = dVar.F;
        if (this.l) {
            a aVar = this.f;
            eVar.removeMessages(11, aVar);
            eVar.removeMessages(9, aVar);
            this.l = false;
        }
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        d dVar = this.o;
        com.gamericefishpro.space.f9.e eVar = dVar.F;
        com.gamericefishpro.space.v8.c0.c(dVar.F);
        this.n = null;
        this.l = true;
        String strK = this.e.k();
        com.gamericefishpro.space.u6.c cVar = this.g;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        cVar.t(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000L);
        eVar.sendMessageDelayed(Message.obtain(eVar, 11, aVar), 120000L);
        ((SparseIntArray) dVar.z.b).clear();
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
    }

    public final void g() {
        d dVar = this.o;
        com.gamericefishpro.space.f9.e eVar = dVar.F;
        a aVar = this.f;
        eVar.removeMessages(12, aVar);
        eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), dVar.d);
    }

    public final boolean h(h0 h0Var) {
        com.gamericefishpro.space.s8.d dVar;
        if (!(h0Var instanceof h0)) {
            com.gamericefishpro.space.u6.c cVar = this.g;
            com.gamericefishpro.space.t8.a aVar = this.e;
            h0Var.f(cVar, aVar.m());
            try {
                h0Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                aVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        com.gamericefishpro.space.s8.d[] dVarArrB = h0Var.b(this);
        if (dVarArrB == null || dVarArrB.length == 0) {
            dVar = null;
            break;
        }
        com.gamericefishpro.space.s8.d[] dVarArrI = this.e.i();
        if (dVarArrI == null) {
            dVarArrI = new com.gamericefishpro.space.s8.d[0];
        }
        com.gamericefishpro.space.t.e eVar = new com.gamericefishpro.space.t.e(dVarArrI.length);
        for (com.gamericefishpro.space.s8.d dVar2 : dVarArrI) {
            eVar.put(dVar2.d, Long.valueOf(dVar2.b()));
        }
        int length = dVarArrB.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrB[i];
            Long l = (Long) eVar.get(dVar.d);
            if (l == null || l.longValue() < dVar.b()) {
                break;
            }
            i++;
        }
        if (dVar == null) {
            com.gamericefishpro.space.u6.c cVar2 = this.g;
            com.gamericefishpro.space.t8.a aVar2 = this.e;
            h0Var.f(cVar2, aVar2.m());
            try {
                h0Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                aVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.e.getClass().getName() + " could not execute call because it requires feature (" + dVar.d + ", " + dVar.b() + ").");
        if (!this.o.G || !h0Var.a(this)) {
            h0Var.d(new com.gamericefishpro.space.t8.i(dVar));
            return true;
        }
        b0 b0Var = new b0(this.f, dVar);
        int iIndexOf = this.m.indexOf(b0Var);
        if (iIndexOf >= 0) {
            b0 b0Var2 = (b0) this.m.get(iIndexOf);
            this.o.F.removeMessages(15, b0Var2);
            com.gamericefishpro.space.f9.e eVar2 = this.o.F;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, b0Var2), 5000L);
        } else {
            this.m.add(b0Var);
            com.gamericefishpro.space.f9.e eVar3 = this.o.F;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 15, b0Var), 5000L);
            com.gamericefishpro.space.f9.e eVar4 = this.o.F;
            eVar4.sendMessageDelayed(Message.obtain(eVar4, 16, b0Var), 120000L);
            com.gamericefishpro.space.s8.b bVar = new com.gamericefishpro.space.s8.b(2, null, null);
            if (!i(bVar)) {
                this.o.a(bVar, this.j);
            }
        }
        return false;
    }

    public final boolean i(com.gamericefishpro.space.s8.b bVar) {
        synchronized (d.J) {
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        d dVar = this.o;
        com.gamericefishpro.space.v8.c0.c(dVar.F);
        com.gamericefishpro.space.t8.a aVar = this.e;
        if (aVar.a() || aVar.g()) {
            return;
        }
        try {
            int iN = dVar.z.n(dVar.w, aVar);
            if (iN != 0) {
                com.gamericefishpro.space.s8.b bVar = new com.gamericefishpro.space.s8.b(iN, null, null);
                Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
                l(bVar, null);
                return;
            }
            c0 c0Var = new c0(dVar, aVar, this.f);
            if (aVar.m()) {
                l0 l0Var = this.k;
                com.gamericefishpro.space.v8.c0.g(l0Var);
                Handler handler = l0Var.e;
                com.gamericefishpro.space.b8.k kVar = l0Var.h;
                com.gamericefishpro.space.p9.a aVar2 = l0Var.i;
                if (aVar2 != null) {
                    aVar2.l();
                }
                kVar.v = Integer.valueOf(System.identityHashCode(l0Var));
                l0Var.i = (com.gamericefishpro.space.p9.a) l0Var.f.m(l0Var.d, handler.getLooper(), kVar, (com.gamericefishpro.space.o9.a) kVar.z, l0Var, l0Var);
                l0Var.j = c0Var;
                Set set = l0Var.g;
                if (set == null || set.isEmpty()) {
                    handler.post(new com.gamericefishpro.space.h4.b(24, l0Var));
                } else {
                    l0Var.i.A();
                }
            }
            try {
                aVar.d(c0Var);
            } catch (SecurityException e) {
                l(new com.gamericefishpro.space.s8.b(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            l(new com.gamericefishpro.space.s8.b(10, null, null), e2);
        }
    }

    public final void k(h0 h0Var) {
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        boolean zA = this.e.a();
        LinkedList linkedList = this.d;
        if (zA) {
            if (h(h0Var)) {
                g();
                return;
            } else {
                linkedList.add(h0Var);
                return;
            }
        }
        linkedList.add(h0Var);
        com.gamericefishpro.space.s8.b bVar = this.n;
        if (bVar == null || !bVar.b()) {
            j();
        } else {
            l(this.n, null);
        }
    }

    public final void l(com.gamericefishpro.space.s8.b bVar, RuntimeException runtimeException) {
        com.gamericefishpro.space.p9.a aVar;
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        l0 l0Var = this.k;
        if (l0Var != null && (aVar = l0Var.i) != null) {
            aVar.l();
        }
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        this.n = null;
        ((SparseIntArray) this.o.z.b).clear();
        a(bVar);
        if ((this.e instanceof com.gamericefishpro.space.x8.c) && bVar.e != 24) {
            d dVar = this.o;
            dVar.e = true;
            com.gamericefishpro.space.f9.e eVar = dVar.F;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.e == 4) {
            b(d.I);
            return;
        }
        if (this.d.isEmpty()) {
            this.n = bVar;
            return;
        }
        if (runtimeException != null) {
            com.gamericefishpro.space.v8.c0.c(this.o.F);
            c(null, runtimeException, false);
            return;
        }
        if (!this.o.G) {
            b(d.b(this.f, bVar));
            return;
        }
        c(d.b(this.f, bVar), null, true);
        if (this.d.isEmpty() || i(bVar) || this.o.a(bVar, this.j)) {
            return;
        }
        if (bVar.e == 18) {
            this.l = true;
        }
        if (!this.l) {
            b(d.b(this.f, bVar));
            return;
        }
        d dVar2 = this.o;
        a aVar2 = this.f;
        com.gamericefishpro.space.f9.e eVar2 = dVar2.F;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, aVar2), 5000L);
    }

    public final void m(com.gamericefishpro.space.s8.b bVar) {
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        com.gamericefishpro.space.t8.a aVar = this.e;
        aVar.c("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        com.gamericefishpro.space.v8.c0.c(this.o.F);
        Status status = d.H;
        b(status);
        this.g.t(false, status);
        for (f fVar : (f[]) this.i.keySet().toArray(new f[0])) {
            k(new n0(new com.gamericefishpro.space.r9.h()));
        }
        a(new com.gamericefishpro.space.s8.b(4, null, null));
        com.gamericefishpro.space.t8.a aVar = this.e;
        if (aVar.a()) {
            aVar.n(new com.gamericefishpro.space.tb.u(10, this));
        }
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnected(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        com.gamericefishpro.space.f9.e eVar = this.o.F;
        if (looperMyLooper == eVar.getLooper()) {
            e();
        } else {
            eVar.post(new com.gamericefishpro.space.h4.b(22, this));
        }
    }

    @Override // com.gamericefishpro.space.t8.g
    public final void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        l(bVar, null);
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        com.gamericefishpro.space.f9.e eVar = this.o.F;
        if (looperMyLooper == eVar.getLooper()) {
            f(i);
        } else {
            eVar.post(new com.gamericefishpro.space.s4.i(i, 2, this));
        }
    }
}
