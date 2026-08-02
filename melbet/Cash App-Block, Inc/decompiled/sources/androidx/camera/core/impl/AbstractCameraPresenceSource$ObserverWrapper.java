package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AbstractCameraPresenceSource$ObserverWrapper {
    public final Executor mExecutor;
    public final Observable.Observer mObserver;

    public AbstractCameraPresenceSource$ObserverWrapper(Executor executor, Observable.Observer observer) {
        this.mExecutor = executor;
        this.mObserver = observer;
    }
}
