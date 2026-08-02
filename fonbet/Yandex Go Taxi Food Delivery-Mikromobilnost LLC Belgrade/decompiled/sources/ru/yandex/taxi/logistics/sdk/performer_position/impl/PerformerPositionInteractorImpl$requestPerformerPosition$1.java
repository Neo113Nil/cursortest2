package ru.yandex.taxi.logistics.sdk.performer_position.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.performer_position.impl.PerformerPositionInteractorImpl", f = "PerformerPositionInteractorImpl.kt", l = {81, 82}, m = "requestPerformerPosition-5JF0Rdk", v = 2)
/* loaded from: classes5.dex */
final class PerformerPositionInteractorImpl$requestPerformerPosition$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformerPositionInteractorImpl$requestPerformerPosition$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, this);
    }
}
