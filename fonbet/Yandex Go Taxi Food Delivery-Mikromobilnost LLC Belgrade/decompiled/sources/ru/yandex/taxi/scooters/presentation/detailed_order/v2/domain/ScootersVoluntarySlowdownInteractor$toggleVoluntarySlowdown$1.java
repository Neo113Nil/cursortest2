package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.ScootersVoluntarySlowdownInteractor", f = "ScootersVoluntarySlowdownInteractor.kt", l = {43, 46, 48}, m = "toggleVoluntarySlowdown", v = 2)
/* loaded from: classes6.dex */
final class ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersVoluntarySlowdownInteractor$toggleVoluntarySlowdown$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this, false);
    }
}
