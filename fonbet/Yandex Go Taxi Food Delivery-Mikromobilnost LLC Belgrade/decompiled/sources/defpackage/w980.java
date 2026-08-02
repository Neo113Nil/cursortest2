package defpackage;

import com.yandex.go.taxi.order.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class w980 {
    public final s59 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public w980(s59 s59Var) {
        this.a = s59Var;
    }

    public final void a(boolean z) {
        if (this.b.compareAndSet(!z, z)) {
            y yVar = (y) this.a.a;
            if (!z) {
                yVar.d(yVar.f(), 0L);
                return;
            }
            yVar.p.getClass();
            a3y0.h(new String[]{"subscribeToUiState"});
            hst hstVar = jst.e;
            yVar.d.e();
        }
    }
}
