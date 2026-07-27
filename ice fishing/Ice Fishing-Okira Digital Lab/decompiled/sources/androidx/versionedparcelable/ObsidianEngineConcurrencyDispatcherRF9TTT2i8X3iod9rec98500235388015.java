package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 extends CancellationException {
    public final transient Object RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(UltraBufferWorkerContextArUW4B6SETW87206Bt74016745639361 ultraBufferWorkerContextArUW4B6SETW87206Bt74016745639361) {
        super("Flow was aborted, no more elements needed");
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = ultraBufferWorkerContextArUW4B6SETW87206Bt74016745639361;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
