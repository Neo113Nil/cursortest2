package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.link.OnLoadCallback;
import com.plaid.link.SubmissionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2", f = "PreloadLinkController.kt", l = {101}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0186h6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0213k6 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ OnLoadCallback e;

    /* renamed from: com.plaid.internal.h6$a */
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ OnLoadCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OnLoadCallback onLoadCallback) {
            super(0);
            this.a = onLoadCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OnLoadCallback onLoadCallback = this.a;
            if (onLoadCallback != null) {
                onLoadCallback.onLoad();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2$2", f = "PreloadLinkController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.h6$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ C0213k6 a;
        public final /* synthetic */ P5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0213k6 c0213k6, P5 p5, Continuation<? super b> continuation) {
            super(2, continuation);
            this.a = c0213k6;
            this.b = p5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.a, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            SubmissionData submissionData = this.a.g;
            if (submissionData == null) {
                return null;
            }
            this.b.a(submissionData.getPhoneNumber(), submissionData.getDateOfBirth(), submissionData.getParams());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186h6(C0213k6 c0213k6, String str, OnLoadCallback onLoadCallback, Continuation<? super C0186h6> continuation) {
        super(2, continuation);
        this.c = c0213k6;
        this.d = str;
        this.e = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C0186h6 c0186h6 = new C0186h6(this.c, this.d, this.e, continuation);
        c0186h6.b = obj;
        return c0186h6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0186h6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            P5 b2 = this.c.c.b();
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            C0213k6 c0213k6 = this.c;
            C0231m6 c0231m6 = c0213k6.e;
            L7 l7 = c0213k6.f;
            String str = this.d;
            l7.getClass();
            str.getClass();
            c0231m6.getClass();
            C0148d4 c0148d4 = b2.a;
            c0148d4.getClass();
            c0148d4.a = c0231m6;
            b2.loadUrl(str);
            b2.a(new a(this.e));
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            b bVar = new b(this.c, b2, null);
            this.a = 1;
            if (JobKt.withContext(defaultIoScheduler, bVar, this) == coroutineSingletons) {
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
