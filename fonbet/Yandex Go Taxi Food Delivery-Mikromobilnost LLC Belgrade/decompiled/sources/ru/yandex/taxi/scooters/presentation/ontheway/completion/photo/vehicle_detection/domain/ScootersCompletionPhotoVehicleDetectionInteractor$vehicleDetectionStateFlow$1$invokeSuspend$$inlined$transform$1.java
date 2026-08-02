package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x9n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1", f = "ScootersCompletionPhotoVehicleDetectionInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersVehicleDetectionOnPhotoExperiment.b $configuredModel$inlined;
    final /* synthetic */ x9n0 $detectionStateReducer$inlined;
    final /* synthetic */ Ref$LongRef $nextFrameProcessingTimeNs$inlined;
    final /* synthetic */ tpr $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1(tpr tprVar, Continuation continuation, Ref$LongRef ref$LongRef, c cVar, x9n0 x9n0Var, ScootersVehicleDetectionOnPhotoExperiment.b bVar) {
        super(2, continuation);
        this.$this_transform = tprVar;
        this.$nextFrameProcessingTimeNs$inlined = ref$LongRef;
        this.this$0 = cVar;
        this.$detectionStateReducer$inlined = x9n0Var;
        this.$configuredModel$inlined = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1 scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation, this.$nextFrameProcessingTimeNs$inlined, this.this$0, this.$detectionStateReducer$inlined, this.$configuredModel$inlined);
        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_transform;
            b bVar = new b(vprVar, this.$nextFrameProcessingTimeNs$inlined, this.this$0, this.$detectionStateReducer$inlined, this.$configuredModel$inlined);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
