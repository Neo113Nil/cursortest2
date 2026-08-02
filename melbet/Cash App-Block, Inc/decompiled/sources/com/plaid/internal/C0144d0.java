package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", f = "CrashStorage.kt", l = {47, 47}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0144d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public C0180h0 a;
    public Iterator b;
    public int c;
    public final /* synthetic */ C0180h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144d0(C0180h0 c0180h0, Continuation<? super C0144d0> continuation) {
        super(2, continuation);
        this.d = c0180h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0144d0(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0144d0(this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0180h0 c0180h0;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0180h0 c0180h02 = this.d;
            this.c = 1;
            obj = c0180h02.a.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = this.b;
                c0180h0 = this.a;
                SafeTrace.throwOnFailure(obj);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C0194i5 c0194i5 = c0180h0.a;
                    this.a = c0180h0;
                    this.b = it;
                    this.c = 2;
                    if (c0194i5.a(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        c0180h0 = this.d;
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
