package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleUiStateMapper", f = "MtTrainScheduleUiStateMapper.kt", l = {103, 104}, m = "toActionButtonsUiState", v = 2)
/* loaded from: classes6.dex */
final class MtTrainScheduleUiStateMapper$toActionButtonsUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainScheduleUiStateMapper$toActionButtonsUiState$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(null, null, this);
    }
}
