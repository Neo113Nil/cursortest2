package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor", f = "MtOverlayStateInteractor.kt", l = {103}, m = "requestDrivingRoute", v = 2)
/* loaded from: classes6.dex */
final class MtOverlayStateInteractor$requestDrivingRoute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOverlayStateInteractor$requestDrivingRoute$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return v.a(this.this$0, null, this);
    }
}
