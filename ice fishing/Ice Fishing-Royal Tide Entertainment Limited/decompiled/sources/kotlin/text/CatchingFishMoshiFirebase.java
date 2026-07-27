package kotlin.text;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class CatchingFishMoshiFirebase {
    public static final CatchingFishDaggerFAB CatchingFishReduxKtor = new CatchingFishDaggerFAB();
    public long CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB;
    public long CatchingFishSnackbar;

    public long CatchingFishCoroutine() {
        if (this.CatchingFishParcelableFAB) {
            return this.CatchingFishSnackbar;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishParcelableFAB;
    }

    public CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        this.CatchingFishParcelableFAB = false;
        return this;
    }

    public CatchingFishMoshiFirebase CatchingFishReduxKtor(long j) {
        this.CatchingFishParcelableFAB = true;
        this.CatchingFishSnackbar = j;
        return this;
    }

    public CatchingFishMoshiFirebase CatchingFishSnackbar() {
        this.CatchingFishCoroutine = 0L;
        return this;
    }

    public long CatchingFishViewModelFAB() {
        return this.CatchingFishCoroutine;
    }

    public CatchingFishMoshiFirebase CatchingFishViewModelScope(long j, TimeUnit timeUnit) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(timeUnit, "unit");
        if (j >= 0) {
            this.CatchingFishCoroutine = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public void CatchingFishWorkManager() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.CatchingFishParcelableFAB && this.CatchingFishSnackbar - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
