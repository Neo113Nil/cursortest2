package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogSender$sendEvents$2", f = "RemoteLogSender.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class M6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ N6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(N6 n6, ArrayList arrayList, String str, Continuation continuation) {
        super(2, continuation);
        this.b = n6;
        this.c = arrayList;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new M6(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i8 i8Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                Workflow$LinkWorkflowEventRequest a = N6.a(this.b, this.c, this.d);
                i8Var = this.b.a;
                this.a = 1;
                obj = i8Var.a(a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            AbstractC0193i4 abstractC0193i4 = (AbstractC0193i4) obj;
            if (abstractC0193i4 instanceof AbstractC0193i4.c) {
                C0095a6.a.a(C0095a6.a, "Successfully sent " + this.c.size() + " remote log events for session: " + this.d);
            } else {
                C0095a6.a.b(C0095a6.a, "Failed to send remote log events: " + abstractC0193i4);
            }
        } catch (IOException e) {
            C0095a6.a.b(C0095a6.a, "IOException while sending remote log events", new Object[]{e});
        } catch (RuntimeException e2) {
            if (e2 instanceof CancellationException) {
                throw e2;
            }
            C0095a6.a.b(C0095a6.a, "RuntimeException while sending remote log events", new Object[]{e2});
        }
        return Unit.INSTANCE;
    }
}
