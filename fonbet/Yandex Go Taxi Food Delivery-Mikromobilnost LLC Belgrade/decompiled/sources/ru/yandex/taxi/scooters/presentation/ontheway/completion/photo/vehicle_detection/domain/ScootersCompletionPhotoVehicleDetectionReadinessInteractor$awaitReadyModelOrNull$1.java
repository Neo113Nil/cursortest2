package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.ScootersCompletionPhotoVehicleDetectionReadinessInteractor", f = "ScootersCompletionPhotoVehicleDetectionReadinessInteractor.kt", l = {22, 30, 32}, m = "awaitReadyModelOrNull", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionReadinessInteractor$awaitReadyModelOrNull$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
