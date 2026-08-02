package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class l8s {
    public final m8s a;
    public final String b;
    public boolean c;
    public f8s d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public l8s(m8s m8sVar, String str) {
        this.a = m8sVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = cvt.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        f8s f8sVar = this.d;
        if (f8sVar != null && f8sVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((f8s) arrayList.get(size)).b) {
                f8s f8sVar2 = (f8s) arrayList.get(size);
                if (m8s.i.isLoggable(Level.FINE)) {
                    swf.v(f8sVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(f8s f8sVar, long j) {
        f8sVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (e(f8sVar, j, false)) {
                    this.a.d(this);
                }
            } else if (f8sVar.b) {
                if (m8s.i.isLoggable(Level.FINE)) {
                    swf.v(f8sVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (m8s.i.isLoggable(Level.FINE)) {
                    swf.v(f8sVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(f8s f8sVar, long j, boolean z) {
        f8sVar.getClass();
        l8s l8sVar = f8sVar.c;
        if (l8sVar != this) {
            if (l8sVar != null) {
                xq0.q("task is in multiple queues");
                return false;
            }
            f8sVar.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(f8sVar);
        if (indexOf != -1) {
            if (f8sVar.d <= j2) {
                if (m8s.i.isLoggable(Level.FINE)) {
                    swf.v(f8sVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        f8sVar.d = j2;
        if (m8s.i.isLoggable(Level.FINE)) {
            swf.v(f8sVar, this, z ? "run again after ".concat(swf.D(j2 - nanoTime)) : "scheduled after ".concat(swf.D(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((f8s) it.next()).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, f8sVar);
        return i == 0;
    }

    public final void f() {
        byte[] bArr = cvt.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
