package androidx.media3.ui.compose;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PlayerSurfaceKt$PlayerSurface$onSurfaceSizeChanged$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $surfaceSyncGroup$delegate;
    public final /* synthetic */ SurfaceView $surfaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSurfaceKt$PlayerSurface$onSurfaceSizeChanged$1$1$1(SurfaceView surfaceView, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$surfaceView = surfaceView;
        this.$surfaceSyncGroup$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerSurfaceKt$PlayerSurface$onSurfaceSizeChanged$1$1$1(this.$surfaceView, this.$surfaceSyncGroup$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerSurfaceKt$PlayerSurface$onSurfaceSizeChanged$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        SurfaceView surfaceView = this.$surfaceView;
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl != null) {
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            if (!surfaceSyncGroup.add(rootSurfaceControl, new Recorder$$ExternalSyntheticLambda13(3))) {
                a$$ExternalSyntheticBUOutline0.m$1("Failed to add rootSurfaceControl to SurfaceSyncGroup");
                return null;
            }
            this.$surfaceSyncGroup$delegate.setValue(surfaceSyncGroup);
            surfaceView.invalidate();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }
        return Unit.INSTANCE;
    }
}
