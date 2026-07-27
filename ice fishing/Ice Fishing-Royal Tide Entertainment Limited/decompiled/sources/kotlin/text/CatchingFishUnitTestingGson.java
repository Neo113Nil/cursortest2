package kotlin.text;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingGson extends CancellationException {
    public final transient Object CatchingFishReduxKtor;

    public CatchingFishUnitTestingGson(CatchingFishIntentManifest catchingFishIntentManifest) {
        super("Flow was aborted, no more elements needed");
        this.CatchingFishReduxKtor = catchingFishIntentManifest;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
