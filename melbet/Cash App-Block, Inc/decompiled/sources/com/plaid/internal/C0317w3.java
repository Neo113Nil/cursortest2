package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
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

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", f = "LinkWorkflowAnalytics.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0317w3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0326x3 b;
    public final /* synthetic */ ClientEventOuterClass$ClientEvent.a c;
    public final /* synthetic */ String d;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", f = "LinkWorkflowAnalytics.kt", l = {EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.w3$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ C0326x3 b;
        public final /* synthetic */ ClientEventOuterClass$ClientEvent.a c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0326x3 c0326x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = c0326x3;
            this.c = aVar;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (com.plaid.internal.C0326x3.a(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r6.a(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                A3 a3 = this.b.b;
                ClientEventOuterClass$ClientEvent build = this.c.a(this.d).build();
                build.getClass();
                this.a = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    C0095a6.a.getClass();
                    C0095a6.a.a("events send", true);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
            }
            C0326x3 c0326x3 = this.b;
            this.a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317w3(C0326x3 c0326x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super C0317w3> continuation) {
        super(2, continuation);
        this.b = c0326x3;
        this.c = aVar;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0317w3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0317w3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
