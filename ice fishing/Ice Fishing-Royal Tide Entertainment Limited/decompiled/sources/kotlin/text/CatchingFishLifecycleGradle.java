package kotlin.text;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleGradle implements Executor {
    public static final Logger CatchingFishLayout = Logger.getLogger(CatchingFishLifecycleGradle.class.getName());
    public final Executor CatchingFishReduxKtor;
    public final ArrayDeque CatchingFishDaggerWebsocket = new ArrayDeque();
    public int CatchingFishWorkManager = 1;
    public long CatchingFishViewModelScope = 0;
    public final CatchingFishService CatchingFishViewModelFAB = new CatchingFishService(this);

    public CatchingFishLifecycleGradle(Executor executor) {
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(executor);
        this.CatchingFishReduxKtor = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(runnable);
        synchronized (this.CatchingFishDaggerWebsocket) {
            int i = this.CatchingFishWorkManager;
            if (i != 4 && i != 3) {
                long j = this.CatchingFishViewModelScope;
                CatchingFishFABXMLLayout catchingFishFABXMLLayout = new CatchingFishFABXMLLayout(runnable, 1);
                this.CatchingFishDaggerWebsocket.add(catchingFishFABXMLLayout);
                this.CatchingFishWorkManager = 2;
                try {
                    this.CatchingFishReduxKtor.execute(this.CatchingFishViewModelFAB);
                    if (this.CatchingFishWorkManager != 2) {
                        return;
                    }
                    synchronized (this.CatchingFishDaggerWebsocket) {
                        try {
                            if (this.CatchingFishViewModelScope == j && this.CatchingFishWorkManager == 2) {
                                this.CatchingFishWorkManager = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.CatchingFishDaggerWebsocket) {
                        try {
                            int i2 = this.CatchingFishWorkManager;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.CatchingFishDaggerWebsocket.removeLastOccurrence(catchingFishFABXMLLayout)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.CatchingFishDaggerWebsocket.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.CatchingFishReduxKtor + "}";
    }
}
