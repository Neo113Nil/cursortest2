package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportAccountRepositoryImpl", f = "PassportAccountRepositoryImpl.kt", l = {28}, m = "getAccountFromPassport$suspendImpl", v = 2)
/* loaded from: classes5.dex */
final class PassportAccountRepositoryImpl$getAccountFromPassport$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAccountRepositoryImpl$getAccountFromPassport$1(f0 f0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f0.a(this.this$0, this);
    }
}
