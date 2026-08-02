package com.squareup.cash.core.navigationcontainer.navigator;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class BetterNavigator$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BetterNavigator$6$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                BetterNavigator$6$1 betterNavigator$6$1 = new BetterNavigator$6$1((BetterNavigator) obj2, continuation, 0);
                betterNavigator$6$1.Z$0 = ((Boolean) obj).booleanValue();
                return betterNavigator$6$1;
            default:
                BetterNavigator$6$1 betterNavigator$6$12 = new BetterNavigator$6$1((Context) obj2, continuation, 1);
                betterNavigator$6$12.Z$0 = ((Boolean) obj).booleanValue();
                return betterNavigator$6$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((BetterNavigator$6$1) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((BetterNavigator) obj2).swipeEnabled = z;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PackageManagerHelper.setComponentEnabled((Context) obj2, RescheduleReceiver.class, this.Z$0);
                break;
        }
        return Unit.INSTANCE;
    }
}
