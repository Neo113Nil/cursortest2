package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class gjj extends AtomicInteger implements x8n, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;
    public final wjj a;
    public final Object b;

    public gjj(wjj wjjVar, Object obj) {
        this.a = wjjVar;
        this.b = obj;
    }

    @Override // defpackage.ka8
    public final void a() {
        set(3);
    }

    @Override // defpackage.x8n
    public final int c() {
        lazySet(1);
        return 1;
    }

    @Override // defpackage.qjq
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.qjq
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.qjq
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qjq
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            wjj wjjVar = this.a;
            wjjVar.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                wjjVar.onComplete();
            }
        }
    }
}
