package com.squareup.cash.graphics.swampgl.components;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Entity$ready$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public /* synthetic */ boolean Z$2;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        Entity$ready$1 entity$ready$1 = new Entity$ready$1(4, (Continuation) obj4);
        entity$ready$1.Z$0 = booleanValue;
        entity$ready$1.Z$1 = booleanValue2;
        entity$ready$1.Z$2 = booleanValue3;
        return entity$ready$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Boolean.valueOf(z && z2 && z3);
    }
}
