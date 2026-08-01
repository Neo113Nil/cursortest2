package X0;

import D.RunnableC0282a;
import android.os.Handler;
import android.os.Looper;
import j1.AbstractC4599c;
import j1.ThreadFactoryC4600d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import n.ExecutorC4742a;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f3578e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3579a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3580b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3581c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile A f3582d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f3578e = new ExecutorC4742a(1);
        } else {
            f3578e = Executors.newCachedThreadPool(new ThreadFactoryC4600d());
        }
    }

    public C(i iVar) {
        d(new A(iVar));
    }

    public final synchronized void a(y yVar) {
        Throwable th;
        try {
            A a9 = this.f3582d;
            if (a9 != null && (th = a9.f3576b) != null) {
                yVar.onResult(th);
            }
            this.f3580b.add(yVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(y yVar) {
        i iVar;
        try {
            A a9 = this.f3582d;
            if (a9 != null && (iVar = a9.f3575a) != null) {
                yVar.onResult(iVar);
            }
            this.f3579a.add(yVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        A a9 = this.f3582d;
        if (a9 == null) {
            return;
        }
        i iVar = a9.f3575a;
        if (iVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f3579a).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).onResult(iVar);
                }
            }
            return;
        }
        Throwable th = a9.f3576b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f3580b);
            if (arrayList.isEmpty()) {
                AbstractC4599c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).onResult(th);
            }
        }
    }

    public final void d(A a9) {
        if (this.f3582d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f3582d = a9;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f3581c.post(new RunnableC0282a(8, this));
        }
    }

    public C(Callable callable, boolean z3) {
        if (z3) {
            try {
                d((A) callable.call());
                return;
            } catch (Throwable th) {
                d(new A(th));
                return;
            }
        }
        Executor executor = f3578e;
        B b9 = new B(callable);
        b9.f3577n = this;
        executor.execute(b9);
    }
}
