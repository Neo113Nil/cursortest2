package app.cash.redwood.treehouse;

/* loaded from: classes3.dex */
public interface CodeState {

    public final class Idle implements CodeState {
        public final Throwable lastUncaughtException;
        public final int loadCount;

        public Idle(Throwable th, int i) {
            this.loadCount = i;
            this.lastUncaughtException = th;
        }

        @Override // app.cash.redwood.treehouse.CodeState
        public final Throwable getLastUncaughtException() {
            return this.lastUncaughtException;
        }

        @Override // app.cash.redwood.treehouse.CodeState
        public final int getLoadCount() {
            return this.loadCount;
        }
    }

    public final class Running implements CodeState {
        public final int deliveredChangeCount;
        public final Throwable lastUncaughtException;
        public final int loadCount;
        public final ViewContentCodeBinding viewContentCodeBinding;

        public Running(int i, Throwable th, ViewContentCodeBinding viewContentCodeBinding, int i2) {
            this.loadCount = i;
            this.lastUncaughtException = th;
            this.viewContentCodeBinding = viewContentCodeBinding;
            this.deliveredChangeCount = i2;
        }

        @Override // app.cash.redwood.treehouse.CodeState
        public final Throwable getLastUncaughtException() {
            return this.lastUncaughtException;
        }

        @Override // app.cash.redwood.treehouse.CodeState
        public final int getLoadCount() {
            return this.loadCount;
        }
    }

    default Content$State asState() {
        boolean z = this instanceof Running;
        int loadCount = getLoadCount();
        Running running = z ? (Running) this : null;
        return new Content$State(loadCount, running != null ? running.deliveredChangeCount : 0, getLastUncaughtException(), z);
    }

    Throwable getLastUncaughtException();

    int getLoadCount();
}
