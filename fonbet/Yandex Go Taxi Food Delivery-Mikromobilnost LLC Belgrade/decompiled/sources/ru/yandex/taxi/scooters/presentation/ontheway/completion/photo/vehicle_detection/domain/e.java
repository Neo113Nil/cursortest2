package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.aan0;
import defpackage.c8n;
import defpackage.i7n;
import defpackage.ny61;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zuy;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class e {
    public final zuy a;
    public final aan0 b;
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a c;
    public final a d;

    static {
        int i = a.b;
    }

    public e(zuy zuyVar, aan0 aan0Var, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a aVar, a aVar2) {
        this.a = zuyVar;
        this.b = aan0Var;
        this.c = aVar;
        this.d = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[Catch: all -> 0x003f, CancellationException -> 0x00cf, TryCatch #2 {CancellationException -> 0x00cf, all -> 0x003f, blocks: (B:13:0x0034, B:14:0x00c2, B:23:0x0050, B:24:0x00a9, B:26:0x00b1, B:32:0x0072, B:35:0x008f, B:38:0x0099, B:42:0x008a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: all -> 0x003f, CancellationException -> 0x00cf, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00cf, all -> 0x003f, blocks: (B:13:0x0034, B:14:0x00c2, B:23:0x0050, B:24:0x00a9, B:26:0x00b1, B:32:0x0072, B:35:0x008f, B:38:0x0099, B:42:0x008a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1 scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1;
        int i;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar2;
        Object b;
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1) {
                scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1 = (ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label;
                    zuy zuyVar = this.a;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$0 = null;
                        scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label = 1;
                        obj = this.d.a(zuo0Var, scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                bVar2 = (ScootersVehicleDetectionOnPhotoExperiment.b) scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$1;
                                kotlin.b.b(obj);
                                b = ((Result) obj).getValue();
                                if (b instanceof Result.Failure) {
                                    return null;
                                }
                                return bVar2;
                            }
                            bVar2 = (ScootersVehicleDetectionOnPhotoExperiment.b) scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$1;
                            kotlin.b.b(obj);
                            i3 = ((Boolean) obj).booleanValue();
                            if (i3 != 0) {
                                scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$0 = null;
                                scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$1 = bVar2;
                                scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.I$0 = i3;
                                scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label = 3;
                                b = ((com.yandex.go.litert.service.a) zuyVar).b(scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1);
                            }
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj;
                    if (bVar != null) {
                        String str = bVar.a;
                        i7n i7nVar = ((com.yandex.go.litert.service.a) zuyVar).a;
                        DynamicFeature dynamicFeature = DynamicFeature.LITERT;
                        ((com.yandex.go.dynamic.impl.b) i7nVar).getClass();
                        if (!(com.yandex.go.dynamic.impl.b.n(dynamicFeature) instanceof c8n)) {
                            ((com.yandex.go.dynamic.impl.b) i7nVar).o(dynamicFeature);
                        }
                        if (this.b.d(str)) {
                            bVar2 = bVar;
                            if (i3 != 0) {
                            }
                        } else {
                            ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a aVar = this.c;
                            scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$0 = null;
                            scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.L$1 = bVar;
                            scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label = 2;
                            obj = aVar.b(str, scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar2 = bVar;
                            i3 = ((Boolean) obj).booleanValue();
                            if (i3 != 0) {
                            }
                        }
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj;
            if (bVar != null) {
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a("Completion photo vehicle detection readiness failed", th);
            return null;
        }
        scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1 = new ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1.label;
        zuy zuyVar2 = this.a;
        int i32 = 1;
    }
}
