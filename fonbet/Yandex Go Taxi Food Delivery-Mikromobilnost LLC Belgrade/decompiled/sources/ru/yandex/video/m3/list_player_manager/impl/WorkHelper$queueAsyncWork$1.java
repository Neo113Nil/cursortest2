package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yko;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.WorkHelper$queueAsyncWork$1", f = "WorkHelper.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class WorkHelper$queueAsyncWork$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    int label;
    final /* synthetic */ WorkHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkHelper$queueAsyncWork$1(WorkHelper workHelper, wls wlsVar, Continuation<? super WorkHelper$queueAsyncWork$1> continuation) {
        super(2, continuation);
        this.this$0 = workHelper;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new WorkHelper$queueAsyncWork$1(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super T> continuation) {
        return ((WorkHelper$queueAsyncWork$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yko ykoVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ykoVar = this.this$0.dispatcher;
        wls wlsVar = this.$block;
        this.label = 1;
        Object k0 = tje.k0(ykoVar, wlsVar, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
