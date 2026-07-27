package androidx.lifecycle;

import e0.C0132h;
import h.C0174s;
import h0.CallableC0183b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1527f;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1526e = i2;
        this.f1527f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f1526e) {
            case 0:
                o oVar = (o) this.f1527f;
                E0.i.e(oVar, "this$0");
                int i2 = oVar.f1530f;
                j jVar = oVar.f1534j;
                if (i2 == 0) {
                    oVar.f1531g = true;
                    jVar.a(d.ON_PAUSE);
                }
                if (oVar.f1529e == 0 && oVar.f1531g) {
                    jVar.a(d.ON_STOP);
                    oVar.f1532h = true;
                    return;
                }
                return;
            case 1:
                C0132h c0132h = (C0132h) this.f1527f;
                ExecutorService executorService = c0132h.f1867a;
                ConcurrentLinkedQueue concurrentLinkedQueue = c0132h.f1868b;
                AtomicBoolean atomicBoolean = c0132h.f1869c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new k(1, c0132h));
                        }
                    }
                }
                return;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((CallableC0183b) this.f1527f).f2329b.f2337f.prefetchDefaultFontManager();
                return;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((io.flutter.plugin.platform.k) this.f1527f).e(false);
                return;
            default:
                ((C0174s) this.f1527f).getClass();
                return;
        }
    }
}
