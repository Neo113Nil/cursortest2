package ru.yandex.taxi.am.token;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.token.DefaultOAuthTokenRepository", f = "DefaultOAuthTokenRepository.kt", l = {142, 52, 53}, m = "getOAuthToken-gIAlu-s", v = 2)
/* loaded from: classes9.dex */
final class DefaultOAuthTokenRepository$getOAuthToken$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultOAuthTokenRepository$getOAuthToken$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(false, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
