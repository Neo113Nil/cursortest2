package androidx.activity;

import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    public final Executor executor;
    public final Object lock;
    public final ArrayList onReportCallbacks;
    public final ComponentActivity$$ExternalSyntheticLambda1 reportFullyDrawn;
    public boolean reportPosted;
    public final AFLogger$$ExternalSyntheticLambda0 reportRunnable;
    public boolean reportedFullyDrawn;
    public int reporterCount;

    public FullyDrawnReporter(Executor executor, ComponentActivity$$ExternalSyntheticLambda1 componentActivity$$ExternalSyntheticLambda1) {
        executor.getClass();
        this.executor = executor;
        this.reportFullyDrawn = componentActivity$$ExternalSyntheticLambda1;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new AFLogger$$ExternalSyntheticLambda0(this, 2);
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
