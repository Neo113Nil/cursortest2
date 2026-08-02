package ru.yandex.taxi.summary.solid.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$filter$2$2", f = "TariffAccessibilityNotifyInteractor.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes6.dex */
public final class TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$filter$2$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$filter$2$2$1(x xVar, Continuation continuation) {
        super(continuation);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
