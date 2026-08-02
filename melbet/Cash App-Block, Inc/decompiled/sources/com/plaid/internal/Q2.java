package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", f = "LinkStateReducer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Q2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC0193i4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>>, Object> {
    public int a;
    public final /* synthetic */ Y2 b;
    public final /* synthetic */ Workflow$LinkWorkflowStartRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(Y2 y2, Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super Q2> continuation) {
        super(2, continuation);
        this.b = y2;
        this.c = workflow$LinkWorkflowStartRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Q2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q2(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
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
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.c;
        this.a = 1;
        Object a = i8Var.a(workflow$LinkWorkflowStartRequest, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
