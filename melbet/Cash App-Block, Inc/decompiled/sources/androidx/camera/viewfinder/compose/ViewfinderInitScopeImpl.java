package androidx.camera.viewfinder.compose;

import android.view.Surface;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.core.impl.RefCounted;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.paging.FlowExtKt$simpleScan$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ViewfinderInitScopeImpl {
    public FlowExtKt$simpleScan$1 onSurfaceSession;
    public final ViewfinderSurfaceRequest viewfinderSurfaceRequest;

    public ViewfinderInitScopeImpl(ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.viewfinderSurfaceRequest = viewfinderSurfaceRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dispatchOnSurfaceSession(RefCounted refCounted, ContinuationImpl continuationImpl) {
        ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$1;
        int i;
        Surface surface;
        FilamentDisplayHelper filamentDisplayHelper;
        if (continuationImpl instanceof ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1) {
            viewfinderInitScopeImpl$dispatchOnSurfaceSession$1 = (ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1) continuationImpl;
            int i2 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = this.onSurfaceSession;
                    if (flowExtKt$simpleScan$1 != null && (surface = (Surface) refCounted.acquire()) != null) {
                        FilamentDisplayHelper filamentDisplayHelper2 = new FilamentDisplayHelper(surface, this.viewfinderSurfaceRequest, new Threads$$ExternalSyntheticLambda1(refCounted, 12));
                        try {
                            SliderDraggableState$drag$2 sliderDraggableState$drag$2 = new SliderDraggableState$drag$2(flowExtKt$simpleScan$1, filamentDisplayHelper2, (Continuation) null);
                            viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.L$0 = filamentDisplayHelper2;
                            viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.label = 1;
                            if (JobKt.coroutineScope(sliderDraggableState$drag$2, viewfinderInitScopeImpl$dispatchOnSurfaceSession$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            filamentDisplayHelper = filamentDisplayHelper2;
                        } catch (Throwable th) {
                            th = th;
                            filamentDisplayHelper = filamentDisplayHelper2;
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                filamentDisplayHelper = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        Cache.Companion.closeFinally(filamentDisplayHelper, th);
                        throw th3;
                    }
                }
                Cache.Companion.closeFinally(filamentDisplayHelper, null);
                return Unit.INSTANCE;
            }
        }
        viewfinderInitScopeImpl$dispatchOnSurfaceSession$1 = new ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1(this, continuationImpl);
        Object obj2 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.label;
        if (i != 0) {
        }
        Cache.Companion.closeFinally(filamentDisplayHelper, null);
        return Unit.INSTANCE;
    }
}
