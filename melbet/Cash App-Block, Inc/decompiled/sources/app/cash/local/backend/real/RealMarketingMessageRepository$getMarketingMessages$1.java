package app.cash.local.backend.real;

import app.cash.local.primitives.MarketingMessageDataKt;
import com.squareup.cash.boost.db.RewardWithSelection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealMarketingMessageRepository$getMarketingMessages$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ List L$0;
    public /* synthetic */ Set L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMarketingMessageRepository$getMarketingMessages$1() {
        super(3, null);
        this.$r8$classId = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.$r8$classId) {
            case 0:
                RealMarketingMessageRepository$getMarketingMessages$1 realMarketingMessageRepository$getMarketingMessages$1 = new RealMarketingMessageRepository$getMarketingMessages$1(i, (Continuation) obj3, 0);
                realMarketingMessageRepository$getMarketingMessages$1.L$0 = (List) obj;
                realMarketingMessageRepository$getMarketingMessages$1.L$1 = (Set) obj2;
                return realMarketingMessageRepository$getMarketingMessages$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealMarketingMessageRepository$getMarketingMessages$1 realMarketingMessageRepository$getMarketingMessages$12 = new RealMarketingMessageRepository$getMarketingMessages$1(i, (Continuation) obj3, 1);
                realMarketingMessageRepository$getMarketingMessages$12.L$0 = (List) obj;
                realMarketingMessageRepository$getMarketingMessages$12.L$1 = (Set) obj2;
                return realMarketingMessageRepository$getMarketingMessages$12.invokeSuspend(Unit.INSTANCE);
            default:
                RealMarketingMessageRepository$getMarketingMessages$1 realMarketingMessageRepository$getMarketingMessages$13 = new RealMarketingMessageRepository$getMarketingMessages$1(i, (Continuation) obj3, 2);
                realMarketingMessageRepository$getMarketingMessages$13.L$1 = (Set) obj;
                realMarketingMessageRepository$getMarketingMessages$13.L$0 = (List) obj2;
                return realMarketingMessageRepository$getMarketingMessages$13.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                List list = this.L$0;
                Set set = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (list != null) {
                    return MarketingMessageDataKt.withRedeemedStatus(list, set);
                }
                return null;
            case 1:
                List list2 = this.L$0;
                Set set2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (list2 != null) {
                    return MarketingMessageDataKt.withRedeemedStatus(list2, set2);
                }
                return null;
            default:
                Set set3 = this.L$1;
                List list3 = this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list4 = list3;
                int i = 0;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (set3.contains(((RewardWithSelection) it.next()).token) && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                            throw null;
                        }
                    }
                }
                return new Integer(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMarketingMessageRepository$getMarketingMessages$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
