package ru.yandex.taxi.am;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.AccountAuthorizationHandler", f = "AccountAuthorizationHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "startLogin-0E7RQCE", v = 2)
/* loaded from: classes5.dex */
final class AccountAuthorizationHandler$startLogin$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountAuthorizationHandler$startLogin$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(null, false, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
