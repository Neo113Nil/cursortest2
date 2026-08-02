package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {
    public final int reason;

    public WorkerStoppedException(int i) {
        this.reason = i;
    }
}
