package com.squareup.cash.data.blockers;

import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$performHelpAction$3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$performHelpAction$3(RealBlockersHelper realBlockersHelper, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realBlockersHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealBlockersHelper$performHelpAction$3 realBlockersHelper$performHelpAction$3 = new RealBlockersHelper$performHelpAction$3(this.this$0, continuation);
        realBlockersHelper$performHelpAction$3.L$0 = obj;
        return realBlockersHelper$performHelpAction$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealBlockersHelper$performHelpAction$3) create((BlockerAction.OpenURLAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.OpenURLAction openURLAction = (BlockerAction.OpenURLAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str = openURLAction.url;
        str.getClass();
        this.this$0.launcher.launchUrlInInternalBrowser(str);
        return Unit.INSTANCE;
    }
}
