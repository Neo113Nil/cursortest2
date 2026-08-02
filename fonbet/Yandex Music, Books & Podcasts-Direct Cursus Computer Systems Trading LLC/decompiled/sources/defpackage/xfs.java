package defpackage;

import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class xfs extends LinkedList {
    public static final WeakHashMap c = new WeakHashMap();
    public efo a;
    public Semaphore b;

    public static xfs g(Thread thread) {
        xfs xfsVar;
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            try {
                xfsVar = (xfs) weakHashMap.get(thread);
                if (xfsVar == null) {
                    xfsVar = new xfs();
                    xfsVar.b = new Semaphore(0);
                    weakHashMap.put(thread, xfsVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xfsVar;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        boolean add;
        Runnable runnable = (Runnable) obj;
        synchronized (this) {
            add = super.add(runnable);
        }
        return add;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Runnable remove() {
        synchronized (this) {
            try {
                if (isEmpty()) {
                    return null;
                }
                return (Runnable) super.remove();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this) {
            remove = super.remove(obj);
        }
        return remove;
    }
}
