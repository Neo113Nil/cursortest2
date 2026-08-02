package ru.yandex.taxi.cashback.sdk;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.cashback.sdk.TaxiClientContextRepository$special$$inlined$map$1", f = "TaxiClientContextRepository.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes5.dex */
public final class TaxiClientContextRepository$special$$inlined$map$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiClientContextRepository$special$$inlined$map$1$1(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
