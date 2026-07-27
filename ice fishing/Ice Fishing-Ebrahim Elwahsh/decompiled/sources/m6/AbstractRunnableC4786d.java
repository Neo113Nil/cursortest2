package m6;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4786d extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f39576n;

    public AbstractRunnableC4786d(ConcurrentHashMap concurrentHashMap) {
        this.f39576n = concurrentHashMap;
    }

    public Object a(Object obj) {
        obj.getClass();
        e c4 = c(obj);
        try {
            Object obj2 = this.f39576n.get(c4);
            if (obj2 == null) {
                return null;
            }
            return obj2;
        } finally {
            e(c4);
        }
    }

    public abstract e c(Object obj);

    public Object d(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        return this.f39576n.put(new C4785c(obj, this), obj2);
    }

    public abstract void e(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C4783a(this, this.f39576n.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f39576n.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f39576n.toString();
    }
}
