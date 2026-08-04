package com.gamericefishpro.space.y3;

import android.os.OutcomeReceiver;
import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.oh.p;
import com.gamericefishpro.space.pi.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicBoolean implements OutcomeReceiver {
    private final com.gamericefishpro.space.th.a d;

    public b(h hVar) {
        super(false);
        this.d = hVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            com.gamericefishpro.space.th.a aVar = this.d;
            n nVar = p.d;
            aVar.resumeWith(com.gamericefishpro.space.wa.b.q(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            com.gamericefishpro.space.th.a aVar = this.d;
            n nVar = p.d;
            aVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
