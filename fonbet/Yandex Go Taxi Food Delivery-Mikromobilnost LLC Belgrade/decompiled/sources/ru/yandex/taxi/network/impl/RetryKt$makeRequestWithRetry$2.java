package ru.yandex.taxi.network.impl;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lfmt;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.network.impl.RetryKt$makeRequestWithRetry$2", f = "Retry.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class RetryKt$makeRequestWithRetry$2 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<Object> $this_makeRequestWithRetry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryKt$makeRequestWithRetry$2(cmt cmtVar, Continuation continuation) {
        super(2, continuation);
        this.$this_makeRequestWithRetry = cmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RetryKt$makeRequestWithRetry$2(this.$this_makeRequestWithRetry, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RetryKt$makeRequestWithRetry$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cmt<Object> cmtVar = this.$this_makeRequestWithRetry;
        this.label = 1;
        Object a = cmtVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
