package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", f = "LinkStateReducer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class U2 extends SuspendLambda implements Function1<Continuation<? super AbstractC0193i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {
    public int a;
    public final /* synthetic */ Y2 b;
    public final /* synthetic */ Workflow$LinkWorkflowNextRequest c;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", f = "LinkStateReducer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC0193i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {
        public int a;
        public final /* synthetic */ Y2 b;
        public final /* synthetic */ Workflow$LinkWorkflowNextRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y2 y2, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = y2;
            this.c = workflow$LinkWorkflowNextRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            i8 i8Var = this.b.a;
            Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest = this.c;
            workflow$LinkWorkflowNextRequest.getClass();
            this.a = 1;
            Object a = i8Var.a(workflow$LinkWorkflowNextRequest, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(Y2 y2, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super U2> continuation) {
        super(1, continuation);
        this.b = y2;
        this.c = workflow$LinkWorkflowNextRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new U2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new U2(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        a aVar = new a(this.b, this.c, null);
        this.a = 1;
        Object withContext = JobKt.withContext(defaultIoScheduler, aVar, this);
        return withContext == coroutineSingletons ? coroutineSingletons : withContext;
    }
}
