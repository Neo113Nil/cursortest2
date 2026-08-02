package com.braze;

import com.braze.events.IValueCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements Function2 {
    public final /* synthetic */ IValueCallback a;
    public final /* synthetic */ Braze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.a = iValueCallback;
        this.b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BrazeUser brazeUser;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean isSdkDisabledOrDelayed = Braze.INSTANCE.isSdkDisabledOrDelayed();
        IValueCallback iValueCallback = this.a;
        if (isSdkDisabledOrDelayed) {
            iValueCallback.onError();
            return Unit.INSTANCE;
        }
        brazeUser = this.b.brazeUser;
        if (brazeUser != null) {
            iValueCallback.onSuccess(brazeUser);
            return Unit.INSTANCE;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        throw null;
    }
}
