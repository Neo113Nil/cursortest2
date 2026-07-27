package q6;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: q6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4931d extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f40247n;

    public AbstractRunnableC4931d(ConcurrentHashMap concurrentHashMap) {
        this.f40247n = concurrentHashMap;
    }

    public Object a(Object obj) {
        obj.getClass();
        e c9 = c(obj);
        try {
            Object obj2 = this.f40247n.get(c9);
            if (obj2 == null) {
                return null;
            }
            return obj2;
        } finally {
            e(c9);
        }
    }

    public abstract e c(Object obj);

    public Object d(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        return this.f40247n.put(new C4930c(obj, this), obj2);
    }

    public abstract void e(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C4928a(this, this.f40247n.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f40247n.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f40247n.toString();
    }
}
