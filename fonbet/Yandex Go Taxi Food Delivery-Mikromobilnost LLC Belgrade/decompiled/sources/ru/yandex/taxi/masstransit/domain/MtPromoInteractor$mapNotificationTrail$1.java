package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtPromoInteractor", f = "MtPromoInteractor.kt", l = {91, HProv.PP_HASHOID}, m = "mapNotificationTrail", v = 2)
/* loaded from: classes6.dex */
final class MtPromoInteractor$mapNotificationTrail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPromoInteractor$mapNotificationTrail$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
