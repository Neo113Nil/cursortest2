package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteUiStateInteractor", f = "MtDetailedRouteUiStateInteractor.kt", l = {194}, m = "mapUiState", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteUiStateInteractor$mapUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteUiStateInteractor$mapUiState$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o.b(this.this$0, null, this);
    }
}
