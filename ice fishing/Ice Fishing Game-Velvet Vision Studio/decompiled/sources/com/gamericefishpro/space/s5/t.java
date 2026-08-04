package com.gamericefishpro.space.s5;

import android.os.Looper;
import com.gamericefishpro.space.h0.z0;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public com.gamericefishpro.space.ui.c a;
    public CoroutineContext b;
    public Executor c;
    public y d;
    public p e;
    public g f;
    public boolean h;
    public final com.gamericefishpro.space.u6.e g = new com.gamericefishpro.space.u6.e(new com.gamericefishpro.space.i2.o(0, this, t.class, "onClosed", "onClosed()V", 0, 2));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (o() && !p() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        com.gamericefishpro.space.d6.b bVarL = j().L();
        if (!bVarL.r()) {
            y3.L(new com.gamericefishpro.space.b2.e0(i(), null, 9));
        }
        if (bVarL.v()) {
            bVarL.D();
        } else {
            bVarL.e();
        }
    }

    public List d(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.a(autoMigrationSpecs.size()));
        for (Map.Entry entry : autoMigrationSpecs.entrySet()) {
            linkedHashMap.put(d5.C((com.gamericefishpro.space.ki.b) entry.getKey()), entry.getValue());
        }
        return h(linkedHashMap);
    }

    public abstract g e();

    public com.gamericefishpro.space.s4.f f() {
        throw new com.gamericefishpro.space.oh.l(null, 1, null);
    }

    public com.gamericefishpro.space.d6.f g(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        throw new com.gamericefishpro.space.oh.l(null, 1, null);
    }

    public List h(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return com.gamericefishpro.space.ph.g0.d;
    }

    public final g i() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.h("internalTracker");
        throw null;
    }

    public final com.gamericefishpro.space.d6.f j() {
        p pVar = this.e;
        if (pVar == null) {
            Intrinsics.h("connectionManager");
            throw null;
        }
        com.gamericefishpro.space.d6.f fVarC = pVar.c();
        if (fVarC != null) {
            return fVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set k() {
        Set setL = l();
        ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(setL, 10));
        Iterator it = setL.iterator();
        while (it.hasNext()) {
            arrayList.add(d5.E((Class) it.next()));
        }
        return CollectionsKt.O(arrayList);
    }

    public Set l() {
        return com.gamericefishpro.space.ph.i0.d;
    }

    public LinkedHashMap m() {
        Set<Map.Entry> setEntrySet = n().entrySet();
        int iA = l0.a(com.gamericefishpro.space.ph.y.j(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            com.gamericefishpro.space.ei.g gVarE = d5.E(cls);
            ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d5.E((Class) it.next()));
            }
            linkedHashMap.put(gVarE, arrayList);
        }
        return linkedHashMap;
    }

    public Map n() {
        return m0.c();
    }

    public final boolean o() {
        p pVar = this.e;
        if (pVar != null) {
            return pVar.c() != null;
        }
        Intrinsics.h("connectionManager");
        throw null;
    }

    public final boolean p() {
        return s() && j().L().r();
    }

    public final void q() {
        j().L().d();
        if (p()) {
            return;
        }
        g gVarI = i();
        gVarI.b.e(gVarI.e, gVarI.f);
    }

    public final void r(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        g gVarI = i();
        Intrinsics.checkNotNullParameter(connection, "connection");
        k0 k0Var = gVarI.b;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.c6.c cVarO = connection.O("PRAGMA query_only");
        try {
            cVarO.H();
            boolean z = cVarO.getLong(0) != 0;
            y3.r(cVarO, null);
            if (!z) {
                com.gamericefishpro.space.i.a.r(connection, "PRAGMA temp_store = MEMORY");
                com.gamericefishpro.space.i.a.r(connection, "PRAGMA recursive_triggers = 1");
                com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (k0Var.d) {
                    com.gamericefishpro.space.i.a.r(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    com.gamericefishpro.space.i.a.r(connection, kotlin.text.d.i("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                z0 z0Var = k0Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) z0Var.b;
                reentrantLock.lock();
                try {
                    z0Var.a = true;
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (gVarI.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                y3.r(cVarO, th2);
                throw th3;
            }
        }
    }

    public final boolean s() {
        p pVar = this.e;
        if (pVar == null) {
            Intrinsics.h("connectionManager");
            throw null;
        }
        com.gamericefishpro.space.d6.b bVar = pVar.g;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final Object t(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        com.gamericefishpro.space.a3.b bVar = new com.gamericefishpro.space.a3.b(15, body);
        if (o()) {
            c();
            try {
                Object objCall = body.call();
                u();
                return objCall;
            } finally {
                q();
            }
        }
        com.gamericefishpro.space.a7.c block = new com.gamericefishpro.space.a7.c(23, bVar);
        Intrinsics.checkNotNullParameter(this, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        a();
        b();
        return y3.L(new com.gamericefishpro.space.b0.o(this, block, null, 28));
    }

    public final void u() {
        j().L().B();
    }

    public final Object v(boolean z, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        p pVar = this.e;
        if (pVar != null) {
            return pVar.f.s(z, function2, cVar);
        }
        Intrinsics.h("connectionManager");
        throw null;
    }
}
