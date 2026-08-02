package app.cash.local.views.internal;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.DismissState;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalMapKt$LocalMap$2$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $cameraState;
    public final /* synthetic */ Object $cameraTarget;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ float $zoom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMapKt$LocalMap$2$1(CameraPositionState cameraPositionState, LatLng latLng, float f, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$cameraState = cameraPositionState;
        this.$cameraTarget = latLng;
        this.$zoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$cameraTarget;
        switch (i) {
            case 0:
                return new LocalMapKt$LocalMap$2$1((CameraPositionState) this.$cameraState, (LatLng) obj2, this.$zoom, continuation);
            case 1:
                LocalMapKt$LocalMap$2$1 localMapKt$LocalMap$2$1 = new LocalMapKt$LocalMap$2$1(this.$zoom, (DismissState) obj2, continuation);
                localMapKt$LocalMap$2$1.$cameraState = obj;
                return localMapKt$LocalMap$2$1;
            case 2:
                LocalMapKt$LocalMap$2$1 localMapKt$LocalMap$2$12 = new LocalMapKt$LocalMap$2$1((Ref$IntRef) this.$cameraState, (PagerState) obj2, continuation, 2);
                localMapKt$LocalMap$2$12.$zoom = ((Number) obj).floatValue();
                return localMapKt$LocalMap$2$12;
            default:
                LocalMapKt$LocalMap$2$1 localMapKt$LocalMap$2$13 = new LocalMapKt$LocalMap$2$1((Function1) this.$cameraState, (MutableState) obj2, continuation, 3);
                localMapKt$LocalMap$2$13.$zoom = ((Number) obj).floatValue();
                return localMapKt$LocalMap$2$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((LocalMapKt$LocalMap$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((LocalMapKt$LocalMap$2$1) create((SliderState$dragScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((LocalMapKt$LocalMap$2$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((LocalMapKt$LocalMap$2$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$cameraTarget;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CameraPositionState) this.$cameraState).setPosition(new CameraPosition((LatLng) obj2, this.$zoom, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SliderState$dragScope$1) this.$cameraState).dragBy(this.$zoom - ((DismissState) obj2).absoluteOffset.getFloatValue());
                break;
            case 2:
                float f = this.$zoom;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (f == RecyclerView.DECELERATION_RATE) {
                    ((Ref$IntRef) this.$cameraState).element = ((Number) ((PagerState) obj2).targetPage$delegate.getValue()).intValue();
                }
                break;
            default:
                float f2 = this.$zoom;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) obj2).setValue(Float.valueOf(f2));
                ((Function1) this.$cameraState).invoke(new Float(f2));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMapKt$LocalMap$2$1(float f, DismissState dismissState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$zoom = f;
        this.$cameraTarget = dismissState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalMapKt$LocalMap$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cameraState = obj;
        this.$cameraTarget = obj2;
    }
}
