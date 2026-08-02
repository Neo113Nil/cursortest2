package ru.yandex.video.m3.ab.interactor.update;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateSchedulerImpl", f = "AbConfigUpdateSchedulerImpl.kt", l = {238}, m = "update")
/* loaded from: classes7.dex */
public final class AbConfigUpdateSchedulerImpl$update$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbConfigUpdateSchedulerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbConfigUpdateSchedulerImpl$update$1(AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl, Continuation<? super AbConfigUpdateSchedulerImpl$update$1> continuation) {
        super(continuation);
        this.this$0 = abConfigUpdateSchedulerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object update;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        update = this.this$0.update(this);
        return update;
    }
}
