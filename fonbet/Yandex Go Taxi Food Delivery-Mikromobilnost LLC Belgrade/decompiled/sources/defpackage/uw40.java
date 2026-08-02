package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.utils.f;

/* loaded from: classes8.dex */
public final class uw40 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final f e;

    public uw40() {
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.e = new f(sw40.class);
    }

    public final boolean a() {
        return this.a.get() && !this.b.get();
    }

    public final synchronized void b() {
        boolean a = a();
        if (a != this.c.getAndSet(a)) {
            this.d.g(Boolean.valueOf(a));
            ((sw40) this.e.c).te();
        }
    }

    public final synchronized void c() {
        e(CanMakeMoreOrders.UNMODIFIED);
    }

    public final synchronized void d(CanMakeMoreOrders canMakeMoreOrders) {
        try {
            int i = tw40.a[canMakeMoreOrders.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.a.set(true);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.a.set(false);
                }
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(CanMakeMoreOrders canMakeMoreOrders) {
        this.b.set(false);
        d(canMakeMoreOrders);
    }
}
