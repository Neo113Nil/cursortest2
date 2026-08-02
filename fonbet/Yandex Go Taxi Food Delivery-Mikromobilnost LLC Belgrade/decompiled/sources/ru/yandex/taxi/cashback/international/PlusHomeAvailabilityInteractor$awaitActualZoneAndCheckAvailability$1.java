package ru.yandex.taxi.cashback.international;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.cashback.international.PlusHomeAvailabilityInteractor", f = "PlusHomeAvailabilityInteractor.kt", l = {21}, m = "awaitActualZoneAndCheckAvailability", v = 2)
/* loaded from: classes5.dex */
final class PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeAvailabilityInteractor$awaitActualZoneAndCheckAvailability$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
