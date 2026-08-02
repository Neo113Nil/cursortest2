package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x9n0;
import defpackage.zgz;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenImageStream$$inlined$flatMapLatest$1;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/domain/model/ScootersCompletionPhotoVehicleDetectionState;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1", f = "ScootersCompletionPhotoVehicleDetectionInteractor.kt", l = {62, 66, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a $cameraControlRepository;
    final /* synthetic */ zuo0 $sessionState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/domain/model/ScootersCompletionPhotoVehicleDetectionState;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$2", f = "ScootersCompletionPhotoVehicleDetectionInteractor.kt", l = {104}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (vpr) obj;
            anonymousClass2.L$1 = (Throwable) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            Throwable th = (Throwable) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                zgz.a("Completion photo vehicle detection image stream failed", th);
                ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState = ScootersCompletionPhotoVehicleDetectionState.Idle;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(scootersCompletionPhotoVehicleDetectionState, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/domain/model/ScootersCompletionPhotoVehicleDetectionState;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$3", f = "ScootersCompletionPhotoVehicleDetectionInteractor.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = cVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new AnonymousClass3(this.this$0, (Continuation) obj3).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                this.label = 1;
                if (c.a(cVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1(c cVar, zuo0 zuo0Var, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$sessionState = zuo0Var;
        this.$cameraControlRepository = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1 scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1(this.this$0, this.$sessionState, this.$cameraControlRepository, continuation);
        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1.L$0 = obj;
        return scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
    
        if (r0 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar = this.this$0.d;
                zuo0 zuo0Var = this.$sessionState;
                this.L$0 = vprVar;
                this.label = 1;
                a = eVar.a(zuo0Var, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) this.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th) {
                        th = th;
                        zgz.a("Failed to enable completion photo vehicle detection image analysis", th);
                        z = false;
                        ScootersVehicleDetectionOnPhotoExperiment.b bVar2 = bVar;
                        if (z) {
                        }
                        return zy11Var;
                    }
                    ScootersVehicleDetectionOnPhotoExperiment.b bVar22 = bVar;
                    if (z) {
                        x9n0 x9n0Var = new x9n0(0);
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = this.$cameraControlRepository;
                        k kVar = new k(new o(new rol0(new ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1(kotlinx.coroutines.flow.e.X(aVar.b, new CameraControlRepository$listenImageStream$$inlined$flatMapLatest$1(null, aVar)), null, ref$LongRef, this.this$0, x9n0Var, bVar22)), new AnonymousClass2(3, null)), new AnonymousClass3(this.this$0, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z;
                        this.label = 3;
                        if (kotlinx.coroutines.flow.e.u(kVar, vprVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                kotlin.b.b(obj);
                a = obj;
            }
            ScootersVehicleDetectionOnPhotoExperiment.b bVar3 = (ScootersVehicleDetectionOnPhotoExperiment.b) a;
            if (bVar3 != null) {
                ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar2 = this.$cameraControlRepository;
                try {
                    this.L$0 = vprVar;
                    this.L$1 = bVar3;
                    this.label = 2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    zgz.a("Failed to enable completion photo vehicle detection image analysis", th);
                    z = false;
                    ScootersVehicleDetectionOnPhotoExperiment.b bVar222 = bVar;
                    if (z) {
                    }
                    return zy11Var;
                }
                if (aVar2.b(this) != coroutineSingletons) {
                    bVar = bVar3;
                    ScootersVehicleDetectionOnPhotoExperiment.b bVar2222 = bVar;
                    if (z) {
                    }
                }
                return coroutineSingletons;
            }
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
