package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
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

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", f = "CrashStorage.kt", l = {32}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0171g0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0180h0 b;
    public final /* synthetic */ Crash[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171g0(C0180h0 c0180h0, Crash[] crashArr, Continuation<? super C0171g0> continuation) {
        super(2, continuation);
        this.b = c0180h0;
        this.c = crashArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0171g0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0171g0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0194i5 c0194i5 = this.b.a;
            String a = C0180h0.a();
            String json = this.b.c.toJson(ArraysKt___ArraysJvmKt.asList(this.c));
            json.getClass();
            this.a = 1;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0185h5(c0194i5, a, json, null), this);
            if (withContext != obj2) {
                withContext = Unit.INSTANCE;
            }
            if (withContext == obj2) {
                return obj2;
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
