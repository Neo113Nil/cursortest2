package com.plaid.internal;

import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.I2;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0336y4 extends G {
    public String a;
    public final /* synthetic */ C0345z4 b;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onNoResultFromChannel$1", f = "OutOfProcessWebviewViewModel.kt", l = {93, 95}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.y4$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public C0345z4 a;
        public LinkResult b;
        public int c;
        public final /* synthetic */ C0345z4 d;
        public final /* synthetic */ C0336y4 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0345z4 c0345z4, C0336y4 c0336y4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = c0345z4;
            this.e = c0336y4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.d, this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        
            if (r12 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LinkResult linkResult;
            C0345z4 c0345z4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0345z4 c0345z42 = this.d;
                this.c = 1;
                obj = C0345z4.b(c0345z42, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkResult = this.b;
                    c0345z4 = this.a;
                    SafeTrace.throwOnFailure(obj);
                    C0345z4.a(c0345z4, linkResult);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
            }
            LinkResult linkResult2 = (LinkResult) obj;
            if (linkResult2 == null) {
                C0095a6.a.a(C0095a6.a, "Link Exit -- no LinkResult from polling and no preCompletionResult.");
                C0345z4.a(this.d, new LinkExit(null, new LinkExitMetadata(null, null, this.e.b(), null, null, 27, null)));
                return Unit.INSTANCE;
            }
            C0345z4 c0345z43 = this.d;
            C0095a6.a.a(C0095a6.a, "The preCompletionResult is: " + linkResult2);
            I7 b = c0345z43.b();
            this.a = c0345z43;
            this.b = linkResult2;
            this.c = 2;
            if (b.b(this) != coroutineSingletons) {
                linkResult = linkResult2;
                c0345z4 = c0345z43;
                C0345z4.a(c0345z4, linkResult);
                return Unit.INSTANCE;
            }
            return coroutineSingletons;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onPreCompletionResult$1", f = "OutOfProcessWebviewViewModel.kt", l = {74}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.y4$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ C0345z4 b;
        public final /* synthetic */ Channel$Message.SDKResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0345z4 c0345z4, Channel$Message.SDKResult sDKResult, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = c0345z4;
            this.c = sDKResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0345z4 c0345z4 = this.b;
                Channel$Message.SDKResult sDKResult = this.c;
                this.a = 1;
                z8 z8Var = c0345z4.f;
                if (z8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("writePreCompletionResult");
                    throw null;
                }
                Object a = z8Var.a(sDKResult, this);
                if (a != coroutineSingletons) {
                    a = Unit.INSTANCE;
                }
                if (a == coroutineSingletons) {
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

    public C0336y4(C0345z4 c0345z4) {
        this.b = c0345z4;
    }

    @Override // com.plaid.internal.G
    public final void a(LinkEvent linkEvent, I2.d dVar) {
        linkEvent.getClass();
        dVar.getClass();
        C0095a6.a.a(C0095a6.a, "Link Event from polling: " + linkEvent);
        if (this.a == null) {
            this.a = linkEvent.getMetadata().getLinkSessionId();
        }
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, dVar);
        }
    }

    public final String b() {
        return this.a;
    }

    @Override // com.plaid.internal.G
    public final void a(LinkResult linkResult) {
        linkResult.getClass();
        C0095a6.a.a(C0095a6.a, "Link Result from polling: " + linkResult);
        C0345z4.a(this.b, linkResult);
    }

    @Override // com.plaid.internal.G
    public final void a(Channel$Message.SDKResult sDKResult) {
        sDKResult.getClass();
        C0095a6.a.a(C0095a6.a, "Pre Completion Result: " + sDKResult);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this.b), null, null, new b(this.b, sDKResult, null), 3);
    }

    @Override // com.plaid.internal.G
    public final void a() {
        JobKt.launch$default(ViewModelKt.getViewModelScope(this.b), null, null, new a(this.b, this, null), 3);
    }
}
