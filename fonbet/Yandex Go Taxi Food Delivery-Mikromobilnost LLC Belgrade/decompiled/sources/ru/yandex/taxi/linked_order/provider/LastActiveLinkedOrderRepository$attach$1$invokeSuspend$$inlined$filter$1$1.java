package ru.yandex.taxi.linked_order.provider;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.linked_order.provider.LastActiveLinkedOrderRepository$attach$1$invokeSuspend$$inlined$filter$1", f = "LastActiveLinkedOrderRepository.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes5.dex */
public final class LastActiveLinkedOrderRepository$attach$1$invokeSuspend$$inlined$filter$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastActiveLinkedOrderRepository$attach$1$invokeSuspend$$inlined$filter$1$1(g gVar, Continuation continuation) {
        super(continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
