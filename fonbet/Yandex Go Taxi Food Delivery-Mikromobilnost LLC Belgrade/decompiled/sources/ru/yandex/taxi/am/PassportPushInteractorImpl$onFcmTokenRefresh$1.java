package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportPushInteractorImpl", f = "PassportPushInteractorImpl.kt", l = {14}, m = "onFcmTokenRefresh", v = 2)
/* loaded from: classes5.dex */
final class PassportPushInteractorImpl$onFcmTokenRefresh$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportPushInteractorImpl$onFcmTokenRefresh$1(p0 p0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
