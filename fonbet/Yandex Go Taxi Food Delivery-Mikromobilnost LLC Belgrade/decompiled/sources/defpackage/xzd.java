package defpackage;

import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class xzd {
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b;
    public final r0 c;
    public final gci0 d;

    public xzd() {
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        new AtomicReference();
        r0 c = bvf0.c(atomicReference.get());
        this.c = c;
        this.d = e.d(c);
    }

    public final PaymentKitConfig a() {
        return (PaymentKitConfig) this.b.get();
    }
}
