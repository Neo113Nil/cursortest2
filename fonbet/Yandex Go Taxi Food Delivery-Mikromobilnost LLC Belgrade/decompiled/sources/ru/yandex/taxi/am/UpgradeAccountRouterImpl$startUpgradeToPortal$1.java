package ru.yandex.taxi.am;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl", f = "UpgradeAccountRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "startUpgradeToPortal-gIAlu-s", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$startUpgradeToPortal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$startUpgradeToPortal$1(s0 s0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object l = this.this$0.l(null, this);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : new Result(l);
    }
}
