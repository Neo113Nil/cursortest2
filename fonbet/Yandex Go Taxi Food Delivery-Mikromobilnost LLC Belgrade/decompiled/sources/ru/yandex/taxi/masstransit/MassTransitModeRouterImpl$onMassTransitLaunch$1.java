package ru.yandex.taxi.masstransit;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl", f = "MassTransitModeRouterImpl.kt", l = {MSException.ERROR_NO_MORE_ITEMS, 287}, m = "onMassTransitLaunch", v = 2)
/* loaded from: classes6.dex */
final class MassTransitModeRouterImpl$onMassTransitLaunch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitModeRouterImpl$onMassTransitLaunch$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.R(this.this$0, null, null, this);
    }
}
