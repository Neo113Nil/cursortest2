package androidx.camera.core.impl;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ConstantObservable implements Observable {
    public static final ConstantObservable NULL_OBSERVABLE = new ConstantObservable(null);
    public final ImmediateFuture$ImmediateFailedFuture mValueFuture;

    public ConstantObservable(Object obj) {
        this.mValueFuture = Futures.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer observer) {
        this.mValueFuture.addListener(new CameraX$$ExternalSyntheticLambda2(23, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer observer) {
    }
}
