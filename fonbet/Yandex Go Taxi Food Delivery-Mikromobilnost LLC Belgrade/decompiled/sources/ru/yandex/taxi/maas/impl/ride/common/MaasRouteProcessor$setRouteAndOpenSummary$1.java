package ru.yandex.taxi.maas.impl.ride.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.maas.impl.ride.common.MaasRouteProcessor", f = "MaasRouteProcessor.kt", l = {HProv.PP_CIPHEROID}, m = "setRouteAndOpenSummary", v = 2)
/* loaded from: classes5.dex */
final class MaasRouteProcessor$setRouteAndOpenSummary$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasRouteProcessor$setRouteAndOpenSummary$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, null, null, null, null, this);
    }
}
