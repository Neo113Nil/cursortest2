package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class ueo {
    public volatile rsr a;
    public tf6 b;
    public CoroutineContext c;
    public Executor d;
    public qhp e;
    public v97 f;
    public iye g;
    public boolean i;
    public a42 j;
    public final yfx h = new yfx(new r9n(0, this, ueo.class, "onClosed", "onClosed()V", 0, 9));
    public final ThreadLocal k = new ThreadLocal();
    public final LinkedHashMap l = new LinkedHashMap();
    public boolean m = true;

    public final void a() {
        if (this.i) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            xq0.q("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        rsr writableDatabase = j().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            o5g.P(new jmd(i(), null, 6));
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(leu.P((f9f) entry.getKey()), entry.getValue());
        }
        return h(linkedHashMap2);
    }

    public abstract iye d();

    public yeo e() {
        throw new uej(null, 1, null);
    }

    public vsr f(jc7 jc7Var) {
        jc7Var.getClass();
        throw new uej(null, 1, null);
    }

    public final void g() {
        j().getWritableDatabase().endTransaction();
        if (p()) {
            return;
        }
        iye i = i();
        i.b.e(i.f, i.g);
    }

    public List h(LinkedHashMap linkedHashMap) {
        return c5b.a;
    }

    public final iye i() {
        iye iyeVar = this.g;
        if (iyeVar != null) {
            return iyeVar;
        }
        Intrinsics.j("internalTracker");
        throw null;
    }

    public final vsr j() {
        v97 v97Var = this.f;
        if (v97Var == null) {
            Intrinsics.j("connectionManager");
            throw null;
        }
        vsr vsrVar = (vsr) v97Var.h;
        if (vsrVar != null) {
            return vsrVar;
        }
        xq0.q("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set k() {
        Set l = l();
        ArrayList arrayList = new ArrayList(v75.o(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(leu.R((Class) it.next()));
        }
        return CollectionsKt.A0(arrayList);
    }

    public Set l() {
        return q5b.a;
    }

    public LinkedHashMap m() {
        Set<Map.Entry> entrySet = n().entrySet();
        int a = tah.a(v75.o(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            lm4 R = leu.R(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(leu.R((Class) it.next()));
            }
            linkedHashMap.put(R, arrayList);
        }
        return linkedHashMap;
    }

    public Map n() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    public final boolean o() {
        v97 v97Var = this.f;
        if (v97Var != null) {
            return ((vsr) v97Var.h) != null;
        }
        Intrinsics.j("connectionManager");
        throw null;
    }

    public final boolean p() {
        return r() && j().getWritableDatabase().inTransaction();
    }

    public final void q(xjo xjoVar) {
        xjoVar.getClass();
        iye i = i();
        mat matVar = i.b;
        matVar.getClass();
        cko D0 = xjoVar.D0("PRAGMA query_only");
        try {
            D0.q();
            boolean p0 = D0.p0();
            i4w.w(D0, null);
            if (!p0) {
                p6g.s(xjoVar, "PRAGMA temp_store = MEMORY");
                p6g.s(xjoVar, "PRAGMA recursive_triggers = 1");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (matVar.d) {
                    p6g.s(xjoVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    p6g.s(xjoVar, c.r("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                tjj tjjVar = matVar.h;
                ReentrantLock reentrantLock = tjjVar.a;
                reentrantLock.lock();
                try {
                    tjjVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (i.h) {
            }
        } finally {
        }
    }

    public final boolean r() {
        a42 a42Var = this.j;
        if (a42Var != null) {
            rsr rsrVar = (rsr) a42Var.i;
            if (rsrVar != null) {
                return rsrVar.isOpen();
            }
            return false;
        }
        v97 v97Var = this.f;
        if (v97Var == null) {
            Intrinsics.j("connectionManager");
            throw null;
        }
        rsr rsrVar2 = (rsr) v97Var.i;
        if (rsrVar2 != null) {
            return rsrVar2.isOpen();
        }
        return false;
    }

    public final Object s(Function0 function0) {
        if (!o()) {
            return up6.F(this, false, true, new ex(18, function0));
        }
        b();
        try {
            Object invoke = function0.invoke();
            t();
            return invoke;
        } finally {
            g();
        }
    }

    public final void t() {
        j().getWritableDatabase().setTransactionSuccessful();
    }

    public final Object u(boolean z, Function2 function2, cg6 cg6Var) {
        v97 v97Var = this.f;
        if (v97Var != null) {
            return ((b66) v97Var.g).d0(z, function2, cg6Var);
        }
        Intrinsics.j("connectionManager");
        throw null;
    }
}
