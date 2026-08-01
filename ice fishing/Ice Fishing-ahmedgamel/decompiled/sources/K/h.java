package K;

import S7.C0389g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: n, reason: collision with root package name */
    public final C0389g f1480n;

    public h(C0389g c0389g) {
        super(false);
        this.f1480n = c0389g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f1480n.resumeWith(com.bumptech.glide.d.f(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f1480n.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
