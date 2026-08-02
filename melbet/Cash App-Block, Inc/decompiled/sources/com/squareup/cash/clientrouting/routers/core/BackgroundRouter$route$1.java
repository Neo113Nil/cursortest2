package com.squareup.cash.clientrouting.routers.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BackgroundRouter$route$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ BackgroundRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackgroundRouter$route$1(BackgroundRouter backgroundRouter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = backgroundRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BackgroundRouter backgroundRouter = this.this$0;
        switch (i) {
            case 0:
                return new BackgroundRouter$route$1(backgroundRouter, continuation, 0);
            default:
                return new BackgroundRouter$route$1(backgroundRouter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BackgroundRouter$route$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BackgroundRouter backgroundRouter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppMessageManager realAppMessageManager = backgroundRouter.appMessageManager;
                    this.label = 1;
                    if (realAppMessageManager.refreshAll(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppMessageManager realAppMessageManager2 = backgroundRouter.appMessageManager;
                    this.label = 1;
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = realAppMessageManager2.repository;
                    Object withContext = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new MLKitTitleGenerator$1(realAppMessageRepositoryWriter, continuation, 11), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
