package ru.yandex.taxi.cashback;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.cashback.UserCashbackExperimentInteractorImpl", f = "UserCashbackExperimentInteractorImpl.kt", l = {56}, m = "isPlusSdkCashbackEnabled", v = 2)
/* loaded from: classes9.dex */
final class UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
