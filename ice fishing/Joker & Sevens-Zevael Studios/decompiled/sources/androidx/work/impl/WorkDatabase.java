package androidx.work.impl;

import android.database.Cursor;
import android.os.Looper;
import b4.b;
import b4.h;
import bc.v;
import bc.w;
import bc.x;
import h4.d;
import h4.f;
import i4.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import pc.j;
import x4.e;
import x4.i;
import x4.l;
import x4.n;
import x4.q;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile c f754a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f755b;

    /* renamed from: c, reason: collision with root package name */
    public d f756c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f758e;

    /* renamed from: f, reason: collision with root package name */
    public List f759f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f763j;

    /* renamed from: d, reason: collision with root package name */
    public final h f757d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f760g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f761h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f762i = new ThreadLocal();

    public WorkDatabase() {
        j.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f763j = new LinkedHashMap();
    }

    public static Object q(Class cls, d dVar) {
        if (cls.isInstance(dVar)) {
            return dVar;
        }
        if (dVar instanceof b4.c) {
            return q(cls, ((b4.c) dVar).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f758e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().t().j() && this.f762i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        c t3 = h().t();
        this.f757d.c(t3);
        if (t3.k()) {
            t3.b();
        } else {
            t3.a();
        }
    }

    public abstract h d();

    public abstract d e(b bVar);

    public abstract x4.c f();

    public List g(Map map) {
        j.e(map, "autoMigrationSpecs");
        return v.f1067g;
    }

    public final d h() {
        d dVar = this.f756c;
        if (dVar != null) {
            return dVar;
        }
        j.k("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return x.f1069g;
    }

    public Map j() {
        return w.f1068g;
    }

    public final void k() {
        h().t().f();
        if (h().t().j()) {
            return;
        }
        h hVar = this.f757d;
        if (hVar.f971e.compareAndSet(false, true)) {
            Executor executor = hVar.f967a.f755b;
            if (executor != null) {
                executor.execute(hVar.f978l);
            } else {
                j.k("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(f fVar) {
        a();
        b();
        return h().t().l(fVar);
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object call = callable.call();
            o();
            return call;
        } finally {
            k();
        }
    }

    public final void o() {
        h().t().o();
    }

    public abstract i p();

    public abstract l r();

    public abstract n s();

    public abstract q t();

    public abstract s u();
}
