package androidx.media3.common.util;

/* loaded from: classes3.dex */
public final class ConditionVariable {
    public final SystemClock clock;
    public boolean isOpen;

    public ConditionVariable() {
        this(SystemClock.DEFAULT);
    }

    public final synchronized boolean blockUninterruptible(long j) {
        if (j <= 0) {
            return this.isOpen;
        }
        this.clock.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            blockUninterruptible();
        } else {
            boolean z = false;
            while (!this.isOpen && elapsedRealtime < j2) {
                try {
                    this.clock.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.clock.getClass();
                elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.isOpen;
    }

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(SystemClock systemClock) {
        this.clock = systemClock;
    }

    public final synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.isOpen) {
            try {
                this.clock.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
