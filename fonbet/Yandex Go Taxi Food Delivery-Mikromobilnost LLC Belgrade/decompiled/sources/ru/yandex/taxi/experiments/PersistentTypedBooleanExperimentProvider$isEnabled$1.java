package ru.yandex.taxi.experiments;

import defpackage.mvg;
import defpackage.w96;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.experiments.PersistentTypedBooleanExperimentProvider", f = "PersistentTypedBooleanExperimentProvider.kt", l = {16}, m = "isEnabled$suspendImpl", v = 2)
/* loaded from: classes9.dex */
final class PersistentTypedBooleanExperimentProvider$isEnabled$1<T extends w96> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentTypedBooleanExperimentProvider$isEnabled$1(q qVar, Continuation continuation) {
        super(continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return q.e(this.this$0, this);
    }
}
