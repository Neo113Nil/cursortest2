package app.cash.zipline.internal;

import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import com.fillr.n;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class CoroutineEventLoop$DelayedJob implements Runnable {
    public boolean canceled;
    public final int delayMillis;
    public StandaloneCoroutine job;
    public final /* synthetic */ n this$0;
    public final int timeoutId;

    public CoroutineEventLoop$DelayedJob(n nVar, int i, int i2) {
        this.this$0 = nVar;
        this.timeoutId = i;
        this.delayMillis = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.canceled) {
            return;
        }
        n nVar = this.this$0;
        this.job = JobKt.launch$default((ContextScope) nVar.b, null, CoroutineStart.UNDISPATCHED, new ZiplineLoader$ModuleJob$run$3(this, nVar, null, 27), 1);
    }
}
