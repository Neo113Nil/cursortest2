package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.domain.SDKGeoInteractorImpl", f = "SDKGeoInteractorImpl.kt", l = {15, 16, 18}, m = "getCurrentLocation", v = 2)
/* loaded from: classes6.dex */
final class SDKGeoInteractorImpl$getCurrentLocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKGeoInteractorImpl$getCurrentLocation$1(i0 i0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
