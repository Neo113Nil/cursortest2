package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2", f = "TrapOnlyVerticalFallbackInteractor.kt", l = {227}, m = "emit", v = 2)
/* loaded from: classes6.dex */
public final class TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1(n0 n0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
