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
import u0.C5053b;
import u0.C5057f;
import u0.InterfaceC5054c;
import v7.C5125p;
import v7.q;
import v7.r;
import y0.InterfaceC5197b;
import y0.InterfaceC5199d;
import z0.C5214c;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C5214c f5331a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f5332b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC5197b f5333c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5335e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5336f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f5339j;

    /* renamed from: d, reason: collision with root package name */
    public final C5057f f5334d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f5337g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f5338h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public WorkDatabase() {
        h.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f5339j = new LinkedHashMap();
    }

    public static Object q(Class cls, InterfaceC5197b interfaceC5197b) {
        if (cls.isInstance(interfaceC5197b)) {
            return interfaceC5197b;
        }
        if (interfaceC5197b instanceof InterfaceC5054c) {
            return q(cls, ((InterfaceC5054c) interfaceC5197b).b());
        }
        return null;
    }

    public final void a() {
        if (!this.f5335e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
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
        C5214c R8 = h().R();
        this.f5334d.c(R8);
        if (R8.D()) {
            R8.j();
        } else {
            R8.b();
        }
    }

    public abstract C5057f d();

    public abstract InterfaceC5197b e(C5053b c5053b);

    public abstract c f();

    public List g(LinkedHashMap autoMigrationSpecs) {
        h.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C5125p.f41221n;
    }

    public final InterfaceC5197b h() {
        InterfaceC5197b interfaceC5197b = this.f5333c;
        if (interfaceC5197b != null) {
            return interfaceC5197b;
        }
        h.k("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return r.f41223n;
    }

    public Map j() {
        return q.f41222n;
    }

    public final void k() {
        h().R().z();
        if (h().R().C()) {
            return;
        }
        C5057f c5057f = this.f5334d;
        if (c5057f.f40968e.compareAndSet(false, true)) {
            Executor executor = c5057f.f40964a.f5332b;
            if (executor != null) {
                executor.execute(c5057f.f40974l);
            } else {
                h.k("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(InterfaceC5199d interfaceC5199d) {
        a();
        b();
        return h().R().F(interfaceC5199d);
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
