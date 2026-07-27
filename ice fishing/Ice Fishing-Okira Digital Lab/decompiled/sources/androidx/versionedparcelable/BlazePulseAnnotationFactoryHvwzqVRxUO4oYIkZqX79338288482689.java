package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseAnnotationFactoryHvwzqVRxUO4oYIkZqX79338288482689 extends ArcticByteDebuggerMonitorF8MUa2VAFNSXT0FkHu43155189412606 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = AtomicIntegerFieldUpdater.newUpdater(BlazePulseAnnotationFactoryHvwzqVRxUO4oYIkZqX79338288482689.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlazePulseAnnotationFactoryHvwzqVRxUO4oYIkZqX79338288482689(ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
