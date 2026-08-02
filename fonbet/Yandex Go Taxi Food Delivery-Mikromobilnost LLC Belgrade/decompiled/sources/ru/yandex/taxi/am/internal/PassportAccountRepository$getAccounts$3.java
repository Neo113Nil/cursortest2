package ru.yandex.taxi.am.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.internal.PassportAccountRepository", f = "PassportAccountRepository.kt", l = {111}, m = "getAccounts-gIAlu-s", v = 2)
/* loaded from: classes5.dex */
final class PassportAccountRepository$getAccounts$3 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAccountRepository$getAccounts$3(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(false, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
