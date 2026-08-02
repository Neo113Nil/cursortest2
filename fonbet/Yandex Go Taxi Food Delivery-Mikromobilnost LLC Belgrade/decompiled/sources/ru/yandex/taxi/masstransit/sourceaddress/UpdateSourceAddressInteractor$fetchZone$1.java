package ru.yandex.taxi.masstransit.sourceaddress;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.sourceaddress.UpdateSourceAddressInteractor", f = "UpdateSourceAddressInteractor.kt", l = {58}, m = "fetchZone", v = 2)
/* loaded from: classes6.dex */
final class UpdateSourceAddressInteractor$fetchZone$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourceAddressInteractor$fetchZone$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
