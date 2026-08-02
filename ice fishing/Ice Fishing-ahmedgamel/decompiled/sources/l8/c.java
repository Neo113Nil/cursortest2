package l8;

import h.C4543G;
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
    public final d f39008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39009b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39010c;

    /* renamed from: d, reason: collision with root package name */
    public a f39011d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f39012e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39013f;

    public c(d taskRunner, String name) {
        h.e(taskRunner, "taskRunner");
        h.e(name, "name");
        this.f39008a = taskRunner;
        this.f39009b = name;
        this.f39012e = new ArrayList();
    }

    public static void c(c cVar, String name, I7.a block) {
        cVar.getClass();
        h.e(name, "name");
        h.e(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        d dVar = this.f39008a;
        TimeZone timeZone = j8.d.f38495a;
        synchronized (dVar) {
            if (b()) {
                this.f39008a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f39011d;
        if (aVar != null && aVar.f39003b) {
            this.f39013f = true;
        }
        ArrayList arrayList = this.f39012e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f39003b) {
                Logger logger = this.f39008a.f39017b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final void d(a task, long j6) {
        h.e(task, "task");
        synchronized (this.f39008a) {
            if (!this.f39010c) {
                if (e(task, j6, false)) {
                    this.f39008a.c(this);
                }
            } else if (task.f39003b) {
                Logger logger = this.f39008a.f39017b;
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f39008a.f39017b;
                if (logger2.isLoggable(Level.FINE)) {
                    d6.c.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j6, boolean z6) {
        h.e(task, "task");
        c cVar = task.f39004c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f39004c = this;
        }
        d dVar = this.f39008a;
        C4543G c4543g = dVar.f39016a;
        long nanoTime = System.nanoTime();
        long j9 = nanoTime + j6;
        ArrayList arrayList = this.f39012e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = dVar.f39017b;
        if (indexOf != -1) {
            if (task.f39005d <= j9) {
                if (logger.isLoggable(Level.FINE)) {
                    d6.c.a(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f39005d = j9;
        if (logger.isLoggable(Level.FINE)) {
            d6.c.a(logger, task, this, z6 ? "run again after ".concat(d6.c.d(j9 - nanoTime)) : "scheduled after ".concat(d6.c.d(j9 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f39005d - nanoTime > j6) {
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
        d dVar = this.f39008a;
        TimeZone timeZone = j8.d.f38495a;
        synchronized (dVar) {
            this.f39010c = true;
            if (b()) {
                this.f39008a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f39009b;
    }
}
