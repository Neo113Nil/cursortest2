package K;

import S7.C0393g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: n, reason: collision with root package name */
    public final C0393g f1589n;

    public h(C0393g c0393g) {
        super(false);
        this.f1589n = c0393g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f1589n.resumeWith(Q3.b.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f1589n.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
