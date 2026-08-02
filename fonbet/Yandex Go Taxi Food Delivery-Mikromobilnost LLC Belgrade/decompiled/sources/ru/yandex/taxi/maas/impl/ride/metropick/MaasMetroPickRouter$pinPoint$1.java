package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickRouter", f = "MaasMetroPickRouter.kt", l = {52}, m = "pinPoint-IoAF18A", v = 2)
/* loaded from: classes5.dex */
final class MaasMetroPickRouter$pinPoint$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasMetroPickRouter$pinPoint$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object T = this.this$0.T(this);
        return T == CoroutineSingletons.COROUTINE_SUSPENDED ? T : new Result(T);
    }
}
