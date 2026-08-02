package ru.yandex.taxi.masstransit.datasource.routing;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository", f = "MtRoutesRepository.kt", l = {166, 176}, m = "requestRoutes-gIAlu-s", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesRepository$requestRoutes$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesRepository$requestRoutes$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = f.a(this.this$0, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
