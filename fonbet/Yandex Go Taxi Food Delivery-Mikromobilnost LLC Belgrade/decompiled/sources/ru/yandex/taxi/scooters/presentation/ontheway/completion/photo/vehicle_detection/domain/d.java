package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.c8n;
import defpackage.i7n;
import defpackage.ny61;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zuy;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class d {
    public final zuy a;
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a b;
    public final a c;

    static {
        int i = a.b;
    }

    public d(zuy zuyVar, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a aVar, a aVar2) {
        this.a = zuyVar;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x0035, CancellationException -> 0x0090, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0090, all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0087, B:23:0x005a, B:26:0x0076, B:29:0x0071), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1 scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1;
        int i;
        zy11 zy11Var;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar;
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1) {
                scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1 = (ScootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.L$0 = null;
                        scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label = 1;
                        obj = this.c.a(zuo0Var, scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        kotlin.b.b(obj);
                    }
                    bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj;
                    if (bVar != null) {
                        return zy11Var;
                    }
                    i7n i7nVar = ((com.yandex.go.litert.service.a) this.a).a;
                    DynamicFeature dynamicFeature = DynamicFeature.LITERT;
                    ((com.yandex.go.dynamic.impl.b) i7nVar).getClass();
                    if (!(com.yandex.go.dynamic.impl.b.n(dynamicFeature) instanceof c8n)) {
                        ((com.yandex.go.dynamic.impl.b) i7nVar).o(dynamicFeature);
                    }
                    ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a aVar = this.b;
                    String str = bVar.a;
                    scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.L$0 = null;
                    scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.L$1 = null;
                    scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label = 2;
                    obj = aVar.b(str, scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1);
                }
            }
            if (i != 0) {
            }
            bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj;
            if (bVar != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a("Completion photo vehicle detection prefetch failed", th);
            return zy11Var;
        }
        scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1 = new ScootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionPrefetchInteractor$prefetch$1.label;
        zy11Var = zy11.a;
    }
}
