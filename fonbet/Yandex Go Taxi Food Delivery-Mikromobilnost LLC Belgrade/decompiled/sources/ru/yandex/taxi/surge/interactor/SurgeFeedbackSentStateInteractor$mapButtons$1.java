package ru.yandex.taxi.surge.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgeFeedbackSentStateInteractor", f = "SurgeFeedbackSentStateInteractor.kt", l = {53}, m = "mapButtons", v = 2)
/* loaded from: classes6.dex */
final class SurgeFeedbackSentStateInteractor$mapButtons$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeFeedbackSentStateInteractor$mapButtons$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.b(this.this$0, null, this);
    }
}
