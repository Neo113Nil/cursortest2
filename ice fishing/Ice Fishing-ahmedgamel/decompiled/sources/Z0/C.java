package Z0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l1.AbstractC4668c;
import l1.ThreadFactoryC4669d;
import n.ExecutorC4756a;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f3930e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3931a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3932b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3933c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile A f3934d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f3930e = new ExecutorC4756a(1);
        } else {
            f3930e = Executors.newCachedThreadPool(new ThreadFactoryC4669d());
        }
    }

    public C(i iVar) {
        d(new A(iVar));
    }

    public final synchronized void a(y yVar) {
        Throwable th;
        try {
            A a9 = this.f3934d;
            if (a9 != null && (th = a9.f3928b) != null) {
                yVar.onResult(th);
            }
            this.f3932b.add(yVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(y yVar) {
        i iVar;
        try {
            A a9 = this.f3934d;
            if (a9 != null && (iVar = a9.f3927a) != null) {
                yVar.onResult(iVar);
            }
            this.f3931a.add(yVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        A a9 = this.f3934d;
        if (a9 == null) {
            return;
        }
        i iVar = a9.f3927a;
        if (iVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f3931a).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).onResult(iVar);
                }
            }
            return;
        }
        Throwable th = a9.f3928b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f3932b);
            if (arrayList.isEmpty()) {
                AbstractC4668c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).onResult(th);
            }
        }
    }

    public final void d(A a9) {
        if (this.f3934d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f3934d = a9;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f3933c.post(new A3.p(10, this));
        }
    }

    public C(Callable callable, boolean z6) {
        if (z6) {
            try {
                d((A) callable.call());
                return;
            } catch (Throwable th) {
                d(new A(th));
                return;
            }
        }
        Executor executor = f3930e;
        B b9 = new B(callable);
        b9.f3929n = this;
        executor.execute(b9);
    }
}
