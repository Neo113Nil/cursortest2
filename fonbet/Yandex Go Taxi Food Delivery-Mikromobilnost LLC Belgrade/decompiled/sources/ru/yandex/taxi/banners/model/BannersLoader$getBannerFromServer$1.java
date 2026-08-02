package ru.yandex.taxi.banners.model;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader", f = "BannersLoader.kt", l = {260}, m = "getBannerFromServer-0E7RQCE", v = 2)
/* loaded from: classes5.dex */
final class BannersLoader$getBannerFromServer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$getBannerFromServer$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.h(null, null, this);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : new Result(h);
    }
}
