package com.squareup.cash.instruments.backend.real;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBalanceSnapshotManager$syncValueBased$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ CurrencyCode L$0;
    public /* synthetic */ List L$1;
    public final /* synthetic */ RealBalanceSnapshotManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBalanceSnapshotManager$syncValueBased$1(RealBalanceSnapshotManager realBalanceSnapshotManager, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realBalanceSnapshotManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealBalanceSnapshotManager realBalanceSnapshotManager = this.this$0;
        CurrencyCode currencyCode = (CurrencyCode) obj;
        List list = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealBalanceSnapshotManager$syncValueBased$1 realBalanceSnapshotManager$syncValueBased$1 = new RealBalanceSnapshotManager$syncValueBased$1(realBalanceSnapshotManager, continuation, 0);
                realBalanceSnapshotManager$syncValueBased$1.L$0 = currencyCode;
                realBalanceSnapshotManager$syncValueBased$1.L$1 = list;
                return realBalanceSnapshotManager$syncValueBased$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealBalanceSnapshotManager$syncValueBased$1 realBalanceSnapshotManager$syncValueBased$12 = new RealBalanceSnapshotManager$syncValueBased$1(realBalanceSnapshotManager, continuation, 1);
                realBalanceSnapshotManager$syncValueBased$12.L$0 = currencyCode;
                realBalanceSnapshotManager$syncValueBased$12.L$1 = list;
                return realBalanceSnapshotManager$syncValueBased$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealBalanceSnapshotManager realBalanceSnapshotManager = this.this$0;
        switch (i) {
            case 0:
                CurrencyCode currencyCode = this.L$0;
                List list = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj2;
                    if (balanceSnapshot.f1396type != BalanceSnapshot.Type.SECONDARY) {
                        Money money = balanceSnapshot.balance;
                        if ((money != null ? money.currency_code : null) == currencyCode) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(RealBalanceSnapshotManager.access$asBalanceSnapshot(realBalanceSnapshotManager, (BalanceSnapshot) it.next()));
                }
                return arrayList2;
            default:
                CurrencyCode currencyCode2 = this.L$0;
                List list2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) obj3;
                    if (balanceSnapshot2.f1396type == BalanceSnapshot.Type.SECONDARY) {
                        Money money2 = balanceSnapshot2.balance;
                        if ((money2 != null ? money2.currency_code : null) == currencyCode2) {
                            arrayList3.add(obj3);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(RealBalanceSnapshotManager.access$asBalanceSnapshot(realBalanceSnapshotManager, (BalanceSnapshot) it2.next()));
                }
                return arrayList4;
        }
    }
}
