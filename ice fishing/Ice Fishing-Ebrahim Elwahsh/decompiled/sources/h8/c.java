package h8;

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
    public final e f38254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38255b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38256c;

    /* renamed from: d, reason: collision with root package name */
    public a f38257d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f38258e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38259f;

    public c(e taskRunner, String name) {
        h.e(taskRunner, "taskRunner");
        h.e(name, "name");
        this.f38254a = taskRunner;
        this.f38255b = name;
        this.f38258e = new ArrayList();
    }

    public static void c(c cVar, String name, E7.a block) {
        cVar.getClass();
        h.e(name, "name");
        h.e(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        e eVar = this.f38254a;
        TimeZone timeZone = f8.d.f37815a;
        synchronized (eVar) {
            if (b()) {
                this.f38254a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f38257d;
        if (aVar != null && aVar.f38249b) {
            this.f38259f = true;
        }
        ArrayList arrayList = this.f38258e;
        boolean z8 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f38249b) {
                Logger logger = this.f38254a.f38265b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    com.bumptech.glide.e.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z8 = true;
            }
        }
        return z8;
    }

    public final void d(a task, long j9) {
        h.e(task, "task");
        synchronized (this.f38254a) {
            if (!this.f38256c) {
                if (e(task, j9, false)) {
                    this.f38254a.c(this);
                }
            } else if (task.f38249b) {
                Logger logger = this.f38254a.f38265b;
                if (logger.isLoggable(Level.FINE)) {
                    com.bumptech.glide.e.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f38254a.f38265b;
                if (logger2.isLoggable(Level.FINE)) {
                    com.bumptech.glide.e.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j9, boolean z8) {
        h.e(task, "task");
        c cVar = task.f38250c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f38250c = this;
        }
        e eVar = this.f38254a;
        d dVar = eVar.f38264a;
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j9;
        ArrayList arrayList = this.f38258e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = eVar.f38265b;
        if (indexOf != -1) {
            if (task.f38251d <= j10) {
                if (logger.isLoggable(Level.FINE)) {
                    com.bumptech.glide.e.a(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f38251d = j10;
        if (logger.isLoggable(Level.FINE)) {
            com.bumptech.glide.e.a(logger, task, this, z8 ? "run again after ".concat(com.bumptech.glide.e.m(j10 - nanoTime)) : "scheduled after ".concat(com.bumptech.glide.e.m(j10 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f38251d - nanoTime > j9) {
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
        e eVar = this.f38254a;
        TimeZone timeZone = f8.d.f37815a;
        synchronized (eVar) {
            this.f38256c = true;
            if (b()) {
                this.f38254a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f38255b;
    }
}
