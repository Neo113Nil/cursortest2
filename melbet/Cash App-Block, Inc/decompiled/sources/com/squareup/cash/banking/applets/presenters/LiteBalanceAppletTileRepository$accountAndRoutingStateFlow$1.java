package com.squareup.cash.banking.applets.presenters;

import com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.ui.UiDda;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ UiDda L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ boolean Z$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        UiDda uiDda = (UiDda) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1 liteBalanceAppletTileRepository$accountAndRoutingStateFlow$1 = new LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1(i, (Continuation) obj4, 0);
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$1.L$0 = uiDda;
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$1.Z$0 = booleanValue;
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$1.L$1 = (List) obj3;
                return liteBalanceAppletTileRepository$accountAndRoutingStateFlow$1.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue2 = bool.booleanValue();
                LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1 liteBalanceAppletTileRepository$accountAndRoutingStateFlow$12 = new LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1(i, (Continuation) obj4, 1);
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$12.L$0 = uiDda;
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$12.Z$0 = booleanValue2;
                liteBalanceAppletTileRepository$accountAndRoutingStateFlow$12.L$1 = (List) obj3;
                return liteBalanceAppletTileRepository$accountAndRoutingStateFlow$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DirectDepositAccount directDepositAccount;
        DirectDepositAccount directDepositAccount2;
        DirectDepositAccount directDepositAccount3;
        DirectDepositAccount directDepositAccount4;
        int i = this.$r8$classId;
        BalanceRepositoryModel.AccountAndRoutingState.Masked masked = BalanceRepositoryModel.AccountAndRoutingState.Masked.INSTANCE;
        BalanceRepositoryModel.AccountAndRoutingState.Hidden hidden = BalanceRepositoryModel.AccountAndRoutingState.Hidden.INSTANCE;
        String str = null;
        switch (i) {
            case 0:
                UiDda uiDda = this.L$0;
                boolean z = this.Z$0;
                List list = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    String str2 = (uiDda == null || (directDepositAccount2 = uiDda.account) == null) ? null : directDepositAccount2.account_number;
                    if (uiDda != null && (directDepositAccount = uiDda.account) != null) {
                        str = directDepositAccount.routing_number;
                    }
                    if (str2 != null && str != null && Intrinsics.areEqual(uiDda.enabled, Boolean.TRUE)) {
                        break;
                    } else if (str2 != null && list != null) {
                    }
                }
                break;
            default:
                UiDda uiDda2 = this.L$0;
                boolean z2 = this.Z$0;
                List list2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z2) {
                    String str3 = (uiDda2 == null || (directDepositAccount4 = uiDda2.account) == null) ? null : directDepositAccount4.account_number;
                    if (uiDda2 != null && (directDepositAccount3 = uiDda2.account) != null) {
                        str = directDepositAccount3.routing_number;
                    }
                    if (str3 != null && str != null && Intrinsics.areEqual(uiDda2.enabled, Boolean.TRUE)) {
                        break;
                    } else if (str3 != null && list2 != null) {
                    }
                }
                break;
        }
        return hidden;
    }
}
