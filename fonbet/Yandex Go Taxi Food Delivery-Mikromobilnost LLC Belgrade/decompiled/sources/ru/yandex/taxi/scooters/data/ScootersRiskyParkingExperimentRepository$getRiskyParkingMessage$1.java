package ru.yandex.taxi.scooters.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersRiskyParkingExperimentRepository", f = "ScootersRiskyParkingExperimentRepository.kt", l = {18}, m = "getRiskyParkingMessage", v = 2)
/* loaded from: classes6.dex */
final class ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
