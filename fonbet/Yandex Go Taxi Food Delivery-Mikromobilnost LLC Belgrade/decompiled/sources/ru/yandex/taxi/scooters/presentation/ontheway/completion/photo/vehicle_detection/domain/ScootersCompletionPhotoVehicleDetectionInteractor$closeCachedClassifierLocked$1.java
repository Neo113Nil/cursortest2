package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionInteractor", f = "ScootersCompletionPhotoVehicleDetectionInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "closeCachedClassifierLocked", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.d(this);
        return zy11.a;
    }
}
