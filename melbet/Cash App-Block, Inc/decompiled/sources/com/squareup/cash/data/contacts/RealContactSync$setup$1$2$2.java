package com.squareup.cash.data.contacts;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactSync$setup$1$2$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealContactSync$setup$1$2$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                RealContactSync$setup$1$2$2 realContactSync$setup$1$2$2 = new RealContactSync$setup$1$2$2(i, (Continuation) obj3, 0);
                realContactSync$setup$1$2$2.Z$0 = booleanValue;
                realContactSync$setup$1$2$2.Z$1 = booleanValue2;
                return realContactSync$setup$1$2$2.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                RealContactSync$setup$1$2$2 realContactSync$setup$1$2$22 = new RealContactSync$setup$1$2$2(i, (Continuation) obj3, 1);
                realContactSync$setup$1$2$22.Z$0 = booleanValue3;
                realContactSync$setup$1$2$22.Z$1 = booleanValue4;
                return realContactSync$setup$1$2$22.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                boolean z2 = this.Z$0;
                boolean z3 = this.Z$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z2 && z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z4 = this.Z$0;
                boolean z5 = this.Z$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z4 && z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
