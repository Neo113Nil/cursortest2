package l8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f38940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38941b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38942c;

    /* renamed from: d, reason: collision with root package name */
    public a f38943d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f38944e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38945f;

    public c(d taskRunner, String name) {
        h.e(taskRunner, "taskRunner");
        h.e(name, "name");
        this.f38940a = taskRunner;
        this.f38941b = name;
        this.f38944e = new ArrayList();
    }

    public static void c(c cVar, String name, I7.a block) {
        cVar.getClass();
        h.e(name, "name");
        h.e(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        d dVar = this.f38940a;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (dVar) {
            if (b()) {
                this.f38940a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f38943d;
        if (aVar != null && aVar.f38935b) {
            this.f38945f = true;
        }
        ArrayList arrayList = this.f38944e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f38935b) {
                Logger logger = this.f38940a.f38949b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void d(a task, long j6) {
        h.e(task, "task");
        synchronized (this.f38940a) {
            if (!this.f38942c) {
                if (e(task, j6, false)) {
                    this.f38940a.c(this);
                }
            } else if (task.f38935b) {
                Logger logger = this.f38940a.f38949b;
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f38940a.f38949b;
                if (logger2.isLoggable(Level.FINE)) {
                    d6.c.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j6, boolean z3) {
        h.e(task, "task");
        c cVar = task.f38936c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f38936c = this;
        }
        d dVar = this.f38940a;
        F1.a aVar = dVar.f38948a;
        long nanoTime = System.nanoTime();
        long j9 = nanoTime + j6;
        ArrayList arrayList = this.f38944e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = dVar.f38949b;
        if (indexOf != -1) {
            if (task.f38937d <= j9) {
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f38937d = j9;
        if (logger.isLoggable(Level.FINE)) {
            d6.c.a(logger, task, this, z3 ? "run again after ".concat(d6.c.e(j9 - nanoTime)) : "scheduled after ".concat(d6.c.e(j9 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f38937d - nanoTime > j6) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, task);
        return i == 0;
    }

    public final void f() {
        d dVar = this.f38940a;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (dVar) {
            this.f38942c = true;
            if (b()) {
                this.f38940a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f38941b;
    }
}
