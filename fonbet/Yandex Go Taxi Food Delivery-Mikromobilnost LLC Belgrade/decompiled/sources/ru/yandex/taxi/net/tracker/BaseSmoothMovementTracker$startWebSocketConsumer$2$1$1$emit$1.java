package ru.yandex.taxi.net.tracker;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1", f = "BaseSmoothMovementTracker.kt", l = {336}, m = "emit", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, this);
    }
}
