package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtVerticalsInteractor", f = "MtVerticalsInteractor.kt", l = {36, 40}, m = "observeTransportVertical", v = 2)
/* loaded from: classes6.dex */
final class MtVerticalsInteractor$observeTransportVertical$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtVerticalsInteractor$observeTransportVertical$1(h0 h0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
