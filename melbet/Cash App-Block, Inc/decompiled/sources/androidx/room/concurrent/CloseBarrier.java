package androidx.room.concurrent;

import androidx.room.RoomDatabase$closeBarrier$1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CloseBarrier {
    public final RoomDatabase$closeBarrier$1 closeAction;
    public final AtomicInteger blockers = new AtomicInteger(0);
    public final AtomicBoolean closeInitiated = new AtomicBoolean(false);

    public CloseBarrier(RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        this.closeAction = roomDatabase$closeBarrier$1;
    }

    public final boolean block$room_runtime_release() {
        synchronized (this) {
            if (this.closeInitiated.get()) {
                return false;
            }
            this.blockers.incrementAndGet();
            return true;
        }
    }

    public final void unblock$room_runtime_release() {
        synchronized (this) {
            this.blockers.decrementAndGet();
            if (this.blockers.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
