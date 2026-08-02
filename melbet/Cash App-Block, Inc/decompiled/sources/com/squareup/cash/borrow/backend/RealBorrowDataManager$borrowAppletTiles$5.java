package com.squareup.cash.borrow.backend;

import com.squareup.protos.lending.sync_values.BorrowData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealBorrowDataManager$borrowAppletTiles$5 extends SuspendLambda implements Function5 {
    public /* synthetic */ List L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ List L$2;
    public /* synthetic */ List L$3;

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RealBorrowDataManager$borrowAppletTiles$5 realBorrowDataManager$borrowAppletTiles$5 = new RealBorrowDataManager$borrowAppletTiles$5(5, (Continuation) obj5);
        realBorrowDataManager$borrowAppletTiles$5.L$0 = (List) obj;
        realBorrowDataManager$borrowAppletTiles$5.L$1 = (List) obj2;
        realBorrowDataManager$borrowAppletTiles$5.L$2 = (List) obj3;
        realBorrowDataManager$borrowAppletTiles$5.L$3 = (List) obj4;
        return realBorrowDataManager$borrowAppletTiles$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = this.L$0;
        List list2 = this.L$1;
        List list3 = this.L$2;
        List list4 = this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return MapsKt__MapsKt.mapOf(new Pair(BorrowData.TileType.CREDIT_LIMIT_AND_BORROW_BUTTON, list), new Pair(BorrowData.TileType.BULLETINS_TILE, list2), new Pair(BorrowData.TileType.PAYMENT_TIMELINE_TILE, list3), new Pair(BorrowData.TileType.LOAN_HISTORY_TILE, list4));
    }
}
