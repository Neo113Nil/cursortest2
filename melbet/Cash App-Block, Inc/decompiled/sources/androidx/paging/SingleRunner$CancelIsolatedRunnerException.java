package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/paging/SingleRunner$CancelIsolatedRunnerException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "paging-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SingleRunner$CancelIsolatedRunnerException extends CancellationException {
    public final HintHandler runner;

    public SingleRunner$CancelIsolatedRunnerException(HintHandler hintHandler) {
        super("Cancelled isolated runner");
        this.runner = hintHandler;
    }
}
