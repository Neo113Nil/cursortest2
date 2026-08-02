package com.plaid.link;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0204j6;
import com.plaid.internal.C0213k6;
import com.plaid.internal.C0243o0;
import com.plaid.internal.InterfaceC0092a3;
import com.plaid.internal.N5;
import com.plaid.internal.P5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid$submitInternal$1", f = "Plaid.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Plaid$submitInternal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubmissionData $submissionData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$submitInternal$1(SubmissionData submissionData, Continuation<? super Plaid$submitInternal$1> continuation) {
        super(2, continuation);
        this.$submissionData = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Plaid$submitInternal$1 plaid$submitInternal$1 = new Plaid$submitInternal$1(this.$submissionData, continuation);
        plaid$submitInternal$1.L$0 = obj;
        return plaid$submitInternal$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$submitInternal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0092a3 interfaceC0092a3;
        C0213k6 c0213k6;
        Object withContext;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            interfaceC0092a3 = Plaid.tokenComponent;
            if (interfaceC0092a3 != null && (c0213k6 = (C0213k6) ((C0243o0) interfaceC0092a3).q.get()) != null) {
                SubmissionData submissionData = this.$submissionData;
                this.L$0 = coroutineScope;
                this.label = 1;
                N5 n5 = c0213k6.c;
                P5 p5 = n5.b;
                if (p5 != null) {
                    if (p5.f.get()) {
                        n5.b = null;
                    }
                    if (p5 != null) {
                        c0213k6.g = submissionData;
                        withContext = Unit.INSTANCE;
                    } else {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0204j6(p5, submissionData, null), this);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                }
                p5 = null;
                if (p5 != null) {
                }
                if (withContext == obj2) {
                }
            }
            if (unit == null) {
                C0095a6.a.b(C0095a6.a, "Token component is null, submit is has no effect");
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }
}
