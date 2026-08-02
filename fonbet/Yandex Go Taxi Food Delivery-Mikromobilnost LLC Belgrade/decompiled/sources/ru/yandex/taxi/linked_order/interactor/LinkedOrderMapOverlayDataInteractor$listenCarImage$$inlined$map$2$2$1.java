package ru.yandex.taxi.linked_order.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$2$2", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {HProv.PP_AUTH_INFO, 217}, m = "emit", v = 2)
/* loaded from: classes5.dex */
public final class LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$2$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$2$2$1(n nVar, Continuation continuation) {
        super(continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
