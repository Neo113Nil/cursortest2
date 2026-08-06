package M1;

import C.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1092c;

    /* renamed from: d, reason: collision with root package name */
    public a f1093d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1094e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1095f;

    public c(d taskRunner, String name) {
        i.e(taskRunner, "taskRunner");
        i.e(name, "name");
        this.f1090a = taskRunner;
        this.f1091b = name;
        this.f1094e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = K1.b.f1051a;
        synchronized (this.f1090a) {
            if (b()) {
                this.f1090a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1093d;
        if (aVar != null && aVar.f1085b) {
            this.f1095f = true;
        }
        ArrayList arrayList = this.f1094e;
        int size = arrayList.size() - 1;
        boolean z2 = false;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                if (((a) arrayList.get(size)).f1085b) {
                    a aVar2 = (a) arrayList.get(size);
                    if (d.f1097i.isLoggable(Level.FINE)) {
                        R1.d.a(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z2 = true;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return z2;
    }

    public final void c(a task, long j2) {
        i.e(task, "task");
        synchronized (this.f1090a) {
            if (!this.f1092c) {
                if (d(task, j2, false)) {
                    this.f1090a.d(this);
                }
            } else if (task.f1085b) {
                if (d.f1097i.isLoggable(Level.FINE)) {
                    R1.d.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f1097i.isLoggable(Level.FINE)) {
                    R1.d.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j2, boolean z2) {
        i.e(task, "task");
        c cVar = task.f1086c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f1086c = this;
        }
        j jVar = this.f1090a.f1098a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f1094e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f1087d <= j3) {
                if (d.f1097i.isLoggable(Level.FINE)) {
                    R1.d.a(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f1087d = j3;
        if (d.f1097i.isLoggable(Level.FINE)) {
            R1.d.a(task, this, z2 ? i.h(R1.d.m(j3 - nanoTime), "run again after ") : i.h(R1.d.m(j3 - nanoTime), "scheduled after "));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((a) it.next()).f1087d - nanoTime > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = arrayList.size();
        }
        arrayList.add(i2, task);
        return i2 == 0;
    }

    public final void e() {
        byte[] bArr = K1.b.f1051a;
        synchronized (this.f1090a) {
            this.f1092c = true;
            if (b()) {
                this.f1090a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f1091b;
    }
}
