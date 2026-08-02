package ru.yandex.taxi;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.PinAbsenceFeatureProviderImpl", f = "PinAbsenceFeatureProviderImpl.kt", l = {53}, m = "locationUpdateDistanceThreshold", v = 2)
/* loaded from: classes5.dex */
final class PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
