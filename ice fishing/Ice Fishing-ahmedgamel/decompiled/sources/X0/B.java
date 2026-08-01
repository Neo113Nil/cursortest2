package X0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class B extends FutureTask {

    /* renamed from: n, reason: collision with root package name */
    public C f3577n;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f3577n.d((A) get());
            } catch (InterruptedException | ExecutionException e9) {
                this.f3577n.d(new A(e9));
            }
        } finally {
            this.f3577n = null;
        }
    }
}
