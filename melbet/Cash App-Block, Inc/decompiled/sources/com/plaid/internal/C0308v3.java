package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1", f = "LinkWorkflowAnalytics.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0308v3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0326x3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ClientEventOuterClass$ClientEvent d;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1$1", f = "LinkWorkflowAnalytics.kt", l = {150}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.v3$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Workflow$LinkWorkflowEventRequest a;
        public int b;
        public final /* synthetic */ C0326x3 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ClientEventOuterClass$ClientEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0326x3 c0326x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = c0326x3;
            this.d = str;
            this.e = clientEventOuterClass$ClientEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i8 i8Var;
            Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                Workflow$LinkWorkflowEventRequest.a newBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                String str = this.d;
                ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = this.e;
                newBuilder.a(str);
                newBuilder.a(clientEventOuterClass$ClientEvent).build();
                Workflow$LinkWorkflowEventRequest build = newBuilder.build();
                i8Var = this.c.a;
                build.getClass();
                this.a = build;
                this.b = 1;
                Object a = i8Var.a(build, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                workflow$LinkWorkflowEventRequest = build;
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                workflow$LinkWorkflowEventRequest = this.a;
                SafeTrace.throwOnFailure(obj);
            }
            if (((AbstractC0193i4) obj) instanceof AbstractC0193i4.c) {
                C0095a6.a.a(C0095a6.a, "Event sent: " + workflow$LinkWorkflowEventRequest);
            } else {
                C0095a6.a.b(C0095a6.a, "Error sending event " + workflow$LinkWorkflowEventRequest);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0308v3(C0326x3 c0326x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super C0308v3> continuation) {
        super(2, continuation);
        this.b = c0326x3;
        this.c = str;
        this.d = clientEventOuterClass$ClientEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0308v3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0308v3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0326x3 c0326x3 = this.b;
            CoroutineDispatcher coroutineDispatcher = c0326x3.c;
            a aVar = new a(c0326x3, this.c, this.d, null);
            this.a = 1;
            if (JobKt.withContext(coroutineDispatcher, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
