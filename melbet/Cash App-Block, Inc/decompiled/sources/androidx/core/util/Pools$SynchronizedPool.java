package androidx.core.util;

/* loaded from: classes3.dex */
public final class Pools$SynchronizedPool extends Pools$SimplePool {
    public final Object lock;

    public Pools$SynchronizedPool(int i) {
        super(i);
        this.lock = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.Pools$Pool
    public final Object acquire() {
        Object acquire;
        synchronized (this.lock) {
            acquire = super.acquire();
        }
        return acquire;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.Pools$Pool
    public final boolean release(Object obj) {
        boolean release;
        obj.getClass();
        synchronized (this.lock) {
            release = super.release(obj);
        }
        return release;
    }
}
