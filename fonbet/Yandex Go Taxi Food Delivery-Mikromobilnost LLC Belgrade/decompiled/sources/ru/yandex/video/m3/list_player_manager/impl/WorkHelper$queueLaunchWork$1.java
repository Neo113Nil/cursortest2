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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.WorkHelper$queueLaunchWork$1", f = "WorkHelper.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class WorkHelper$queueLaunchWork$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    int label;
    final /* synthetic */ WorkHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkHelper$queueLaunchWork$1(WorkHelper workHelper, wls wlsVar, Continuation<? super WorkHelper$queueLaunchWork$1> continuation) {
        super(2, continuation);
        this.this$0 = workHelper;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new WorkHelper$queueLaunchWork$1(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((WorkHelper$queueLaunchWork$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yko ykoVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ykoVar = this.this$0.dispatcher;
            wls wlsVar = this.$block;
            this.label = 1;
            if (tje.k0(ykoVar, wlsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
