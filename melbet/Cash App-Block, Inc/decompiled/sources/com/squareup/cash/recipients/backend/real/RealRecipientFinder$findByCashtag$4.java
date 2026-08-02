package com.squareup.cash.recipients.backend.real;

import com.squareup.cash.boost.db.RewardWithSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealRecipientFinder$findByCashtag$4 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ List L$0;
    public /* synthetic */ List L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealRecipientFinder$findByCashtag$4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealRecipientFinder$findByCashtag$4 realRecipientFinder$findByCashtag$4 = new RealRecipientFinder$findByCashtag$4(i, continuation, 0);
                realRecipientFinder$findByCashtag$4.L$0 = list;
                realRecipientFinder$findByCashtag$4.L$1 = list2;
                return realRecipientFinder$findByCashtag$4.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealRecipientFinder$findByCashtag$4 realRecipientFinder$findByCashtag$42 = new RealRecipientFinder$findByCashtag$4(i, continuation, 1);
                realRecipientFinder$findByCashtag$42.L$0 = list;
                realRecipientFinder$findByCashtag$42.L$1 = list2;
                return realRecipientFinder$findByCashtag$42.invokeSuspend(Unit.INSTANCE);
            default:
                RealRecipientFinder$findByCashtag$4 realRecipientFinder$findByCashtag$43 = new RealRecipientFinder$findByCashtag$4(i, continuation, 2);
                realRecipientFinder$findByCashtag$43.L$0 = list;
                realRecipientFinder$findByCashtag$43.L$1 = list2;
                return realRecipientFinder$findByCashtag$43.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                List list = this.L$0;
                List list2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return CollectionsKt.plus((Iterable) list2, (Collection) list);
            case 1:
                List list3 = this.L$0;
                List list4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list4) {
                    if (list3.contains(((RewardWithSelection) obj2).token)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                List list5 = this.L$0;
                List list6 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return CollectionsKt.plus((Iterable) list6, (Collection) list5);
        }
    }
}
