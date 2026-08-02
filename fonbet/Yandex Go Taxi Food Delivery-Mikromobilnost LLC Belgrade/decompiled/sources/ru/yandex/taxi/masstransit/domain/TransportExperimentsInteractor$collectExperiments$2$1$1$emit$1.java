package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.domain.TransportExperimentsInteractor$collectExperiments$2$1$1", f = "TransportExperimentsInteractor.kt", l = {20}, m = "emit", v = 2)
/* loaded from: classes6.dex */
final class TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1(j0 j0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(this, null);
    }
}
