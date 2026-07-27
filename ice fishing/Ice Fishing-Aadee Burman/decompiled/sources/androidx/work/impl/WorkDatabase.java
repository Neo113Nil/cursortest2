package androidx.work.impl;

import S0.c;
import S0.e;
import S0.i;
import S0.l;
import S0.n;
import S0.s;
import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.h;
import u0.C5052b;
import u0.C5056f;
import u0.InterfaceC5053c;
import v7.C5135p;
import v7.q;
import v7.r;
import y0.b;
import y0.d;
import z0.C5247c;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C5247c f5366a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f5367b;

    /* renamed from: c, reason: collision with root package name */
    public b f5368c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5370e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5371f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f5374j;

    /* renamed from: d, reason: collision with root package name */
    public final C5056f f5369d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f5372g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f5373h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public WorkDatabase() {
        h.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f5374j = new LinkedHashMap();
    }

    public static Object q(Class cls, b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof InterfaceC5053c) {
            return q(cls, ((InterfaceC5053c) bVar).b());
        }
        return null;
    }

    public final void a() {
        if (!this.f5370e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().R().C() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C5247c R8 = h().R();
        this.f5369d.c(R8);
        if (R8.D()) {
            R8.j();
        } else {
            R8.b();
        }
    }

    public abstract C5056f d();

    public abstract b e(C5052b c5052b);

    public abstract c f();

    public List g(LinkedHashMap autoMigrationSpecs) {
        h.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C5135p.f41439n;
    }

    public final b h() {
        b bVar = this.f5368c;
        if (bVar != null) {
            return bVar;
        }
        h.k("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return r.f41441n;
    }

    public Map j() {
        return q.f41440n;
    }

    public final void k() {
        h().R().z();
        if (h().R().C()) {
            return;
        }
        C5056f c5056f = this.f5369d;
        if (c5056f.f41003e.compareAndSet(false, true)) {
            Executor executor = c5056f.f40999a.f5367b;
            if (executor != null) {
                executor.execute(c5056f.f41009l);
            } else {
                h.k("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(d dVar) {
        a();
        b();
        return h().R().F(dVar);
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
        h().R().G();
    }

    public abstract i p();

    public abstract l r();

    public abstract n s();

    public abstract S0.q t();

    public abstract s u();
}
