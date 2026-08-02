package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0186h6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1", f = "PlaidWebview.kt", l = {EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class V5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ P5 b;
    public final /* synthetic */ C0186h6.a c;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1$1", f = "PlaidWebview.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        public /* synthetic */ boolean a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            a aVar = new a((Continuation) obj2);
            aVar.a = bool.booleanValue();
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            return Boolean.valueOf(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(P5 p5, C0186h6.a aVar, Continuation continuation) {
        super(2, continuation);
        this.b = p5;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new V5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new V5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StateFlow stateFlow = this.b.b.d;
            a aVar = new a(null);
            this.a = 1;
            if (FlowKt.first(stateFlow, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (!this.b.f.get()) {
            this.c.invoke();
        }
        return Unit.INSTANCE;
    }
}
