package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final /* synthetic */ class PreviewStreamStateObserver$$ExternalSyntheticLambda0 implements AsyncFunction, Function {
    public final /* synthetic */ PreviewStreamStateObserver f$0;

    public /* synthetic */ PreviewStreamStateObserver$$ExternalSyntheticLambda0(PreviewStreamStateObserver previewStreamStateObserver) {
        this.f$0 = previewStreamStateObserver;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return this.f$0.mPreviewViewImplementation.waitForNextFrame();
    }

    @Override // androidx.arch.core.util.Function
    /* renamed from: apply */
    public Object mo103apply(Object obj) {
        this.f$0.updatePreviewStreamState(PreviewView.StreamState.STREAMING);
        return null;
    }
}
