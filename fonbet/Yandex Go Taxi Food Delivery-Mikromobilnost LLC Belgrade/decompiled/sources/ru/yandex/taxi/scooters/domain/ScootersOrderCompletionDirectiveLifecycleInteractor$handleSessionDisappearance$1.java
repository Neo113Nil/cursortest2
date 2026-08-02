package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersOrderCompletionDirectiveLifecycleInteractor", f = "ScootersOrderCompletionDirectiveLifecycleInteractor.kt", l = {59, 61}, m = "handleSessionDisappearance", v = 2)
/* loaded from: classes6.dex */
final class ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1(l lVar, Continuation continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, null, this);
    }
}
