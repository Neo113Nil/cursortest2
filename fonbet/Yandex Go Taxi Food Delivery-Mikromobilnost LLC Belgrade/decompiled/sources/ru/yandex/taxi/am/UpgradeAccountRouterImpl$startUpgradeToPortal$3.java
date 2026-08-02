package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl", f = "UpgradeAccountRouterImpl.kt", l = {67, 69, 70, 74, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_256}, m = "startUpgradeToPortal-0E7RQCE", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$startUpgradeToPortal$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$startUpgradeToPortal$3(s0 s0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object k = this.this$0.k(null, null, this);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : new Result(k);
    }
}
