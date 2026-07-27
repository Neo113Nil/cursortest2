package androidx.lifecycle;

import e0.C0132h;
import h.C0174s;
import h0.CallableC0183b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1519g;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1518f = i2;
        this.f1519g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f1518f) {
            case 0:
                o oVar = (o) this.f1519g;
                E0.i.e(oVar, "this$0");
                int i2 = oVar.f1522g;
                j jVar = oVar.f1526k;
                if (i2 == 0) {
                    oVar.f1523h = true;
                    jVar.a(d.ON_PAUSE);
                }
                if (oVar.f1521f == 0 && oVar.f1523h) {
                    jVar.a(d.ON_STOP);
                    oVar.f1524i = true;
                    return;
                }
                return;
            case 1:
                C0132h c0132h = (C0132h) this.f1519g;
                ExecutorService executorService = c0132h.f1859a;
                ConcurrentLinkedQueue concurrentLinkedQueue = c0132h.f1860b;
                AtomicBoolean atomicBoolean = c0132h.f1861c;
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
                ((CallableC0183b) this.f1519g).f2321b.f2329f.prefetchDefaultFontManager();
                return;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((io.flutter.plugin.platform.k) this.f1519g).e(false);
                return;
            default:
                ((C0174s) this.f1519g).getClass();
                return;
        }
    }
}
