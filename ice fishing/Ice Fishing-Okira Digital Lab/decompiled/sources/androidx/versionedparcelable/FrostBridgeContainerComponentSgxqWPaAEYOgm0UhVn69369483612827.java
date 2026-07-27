package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeContainerComponentSgxqWPaAEYOgm0UhVn69369483612827 extends CancellationException {
    public FrostBridgeContainerComponentSgxqWPaAEYOgm0UhVn69369483612827(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
        return this;
    }
}
