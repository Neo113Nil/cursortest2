package defpackage;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class f77 extends Timer {
    public volatile boolean a;

    public f77(String str) {
        super(str, true);
        this.a = false;
    }

    @Override // java.util.Timer
    public final synchronized void cancel() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.cancel();
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j, long j2) {
        try {
            if (this.a) {
                return;
            }
            super.schedule(timerTask, j, j2);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
        try {
            if (this.a) {
                return;
            }
            super.scheduleAtFixedRate(timerTask, j, j2);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date) {
        if (this.a) {
            return;
        }
        super.schedule(timerTask, date);
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
        if (this.a) {
            return;
        }
        super.scheduleAtFixedRate(timerTask, date, j);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j) {
        if (this.a) {
            return;
        }
        super.schedule(timerTask, j);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date, long j) {
        if (this.a) {
            return;
        }
        super.schedule(timerTask, date, j);
    }
}
