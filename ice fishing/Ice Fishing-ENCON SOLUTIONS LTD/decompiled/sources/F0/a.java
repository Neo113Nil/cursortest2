package F0;

import Q1.A;
import R0.h;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import com.yandex.varioqub.config.impl.B;
import com.yandex.varioqub.config.impl.g;
import io.appmetrica.analytics.impl.C0344d2;
import io.appmetrica.analytics.impl.C0366e;
import io.appmetrica.analytics.impl.C0756t1;
import io.appmetrica.analytics.impl.C0885y0;
import io.flutter.plugin.platform.k;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f577b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f576a = i2;
        this.f577b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f576a) {
            case 0:
                B.a((g) this.f577b);
                return;
            case 1:
                B.a((B) this.f577b);
                return;
            case 2:
                h hVar = (h) this.f577b;
                ExecutorService executorService = hVar.f1727a;
                ConcurrentLinkedQueue concurrentLinkedQueue = hVar.f1728b;
                AtomicBoolean atomicBoolean = hVar.f1729c;
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
                            executorService.execute(new a(2, hVar));
                        }
                    }
                }
                return;
            case 3:
                ((U0.a) this.f577b).f1815b.f1823f.prefetchDefaultFontManager();
                return;
            case 4:
                r this$0 = (r) this.f577b;
                i.e(this$0, "this$0");
                int i2 = this$0.f2490b;
                l lVar = this$0.f2494f;
                if (i2 == 0) {
                    this$0.f2491c = true;
                    lVar.d(androidx.lifecycle.d.ON_PAUSE);
                }
                if (this$0.f2489a == 0 && this$0.f2491c) {
                    lVar.d(androidx.lifecycle.d.ON_STOP);
                    this$0.f2492d = true;
                    return;
                }
                return;
            case 5:
                C0344d2.a((C0344d2) this.f577b);
                return;
            case 6:
                ((C0366e) this.f577b).a();
                return;
            case 7:
                ((C0756t1) this.f577b).e();
                return;
            case 8:
                C0756t1.a((Object[]) this.f577b);
                return;
            case 9:
                ((C0885y0) this.f577b).o();
                return;
            case 10:
                ((k) this.f577b).f(false);
                return;
            default:
                ((A) this.f577b).getClass();
                return;
        }
    }
}
