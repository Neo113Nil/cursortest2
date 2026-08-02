package ru.yandex.taxi.order;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.order.GeoSharingInteractorImpl", f = "GeoSharingInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "checkOrdersCount", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingInteractorImpl$checkOrdersCount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingInteractorImpl$checkOrdersCount$1(Continuation continuation, d dVar) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this, this.this$0);
    }
}
