package androidx.camera.viewfinder.compose;

import android.view.Surface;
import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 implements CoroutineScope {
    public final /* synthetic */ CoroutineScope $$delegate_0;
    public final Surface surface;

    public ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1(CoroutineScope coroutineScope, FilamentDisplayHelper filamentDisplayHelper) {
        this.$$delegate_0 = coroutineScope;
        this.surface = (Surface) filamentDisplayHelper.mDisplayManager;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
