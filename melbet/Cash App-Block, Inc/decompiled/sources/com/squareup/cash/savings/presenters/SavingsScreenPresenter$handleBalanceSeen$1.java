package com.squareup.cash.savings.presenters;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SavingsScreenPresenter$handleBalanceSeen$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SavingsScreenViewEvent.BalanceSeenEvent $this_handleBalanceSeen;
    public final /* synthetic */ SavingsScreenPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavingsScreenPresenter$handleBalanceSeen$1(SavingsScreenPresenter savingsScreenPresenter, SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = savingsScreenPresenter;
        this.$this_handleBalanceSeen = balanceSeenEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent = this.$this_handleBalanceSeen;
        SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        switch (i) {
            case 0:
                return new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, continuation, 0);
            case 1:
                return new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, continuation, 1);
            case 2:
                return new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, continuation, 2);
            default:
                return new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SavingsScreenPresenter$handleBalanceSeen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 0;
        SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent = this.$this_handleBalanceSeen;
        SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) savingsScreenPresenter.lastSeenBalance;
                final Money money = ((SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen) balanceSeenEvent).amount;
                gpsConfigQueries.driver.execute(-655622738, "UPDATE lastSeenSavingsBalance\nSET balance = ?", new Function1() { // from class: com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = i2;
                        GpsConfigQueries gpsConfigQueries2 = gpsConfigQueries;
                        Money money2 = money;
                        AndroidStatement androidStatement = (AndroidStatement) obj2;
                        androidStatement.getClass();
                        switch (i3) {
                            case 0:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.encode(money2));
                                break;
                            default:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.encode(money2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                gpsConfigQueries.notifyQueries(-655622738, new CelebrationKt$$ExternalSyntheticLambda1(15));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final GpsConfigQueries gpsConfigQueries2 = (GpsConfigQueries) savingsScreenPresenter.lastSeenBalance;
                final Money money2 = ((SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen) balanceSeenEvent).amount;
                final int i3 = 1;
                gpsConfigQueries2.driver.execute(-884267328, "UPDATE lastSeenSavingsBalance\nSET generalBalance = ?", new Function1() { // from class: com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i3;
                        GpsConfigQueries gpsConfigQueries22 = gpsConfigQueries2;
                        Money money22 = money2;
                        AndroidStatement androidStatement = (AndroidStatement) obj2;
                        androidStatement.getClass();
                        switch (i32) {
                            case 0:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries22.gpsConfigAdapter).pay_dataAdapter.encode(money22));
                                break;
                            default:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries22.gpsConfigAdapter).request_dataAdapter.encode(money22));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                gpsConfigQueries2.notifyQueries(-884267328, new CelebrationKt$$ExternalSyntheticLambda1(16));
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen goalBalanceSeen = (SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen) balanceSeenEvent;
                ((GpsConfigQueries) savingsScreenPresenter.goalLocalStatus).setLastSeenValues(goalBalanceSeen.token, goalBalanceSeen.amount, goalBalanceSeen.remainingBalance, new Long((long) Math.floor(goalBalanceSeen.progress * 10000.0f)));
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final GpsConfigQueries gpsConfigQueries3 = (GpsConfigQueries) savingsScreenPresenter.lastSeenBalance;
                SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen savingsAndGoalBalanceSeen = (SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen) balanceSeenEvent;
                final Money money3 = savingsAndGoalBalanceSeen.amount;
                gpsConfigQueries3.driver.execute(-655622738, "UPDATE lastSeenSavingsBalance\nSET balance = ?", new Function1() { // from class: com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i2;
                        GpsConfigQueries gpsConfigQueries22 = gpsConfigQueries3;
                        Money money22 = money3;
                        AndroidStatement androidStatement = (AndroidStatement) obj2;
                        androidStatement.getClass();
                        switch (i32) {
                            case 0:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries22.gpsConfigAdapter).pay_dataAdapter.encode(money22));
                                break;
                            default:
                                androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries22.gpsConfigAdapter).request_dataAdapter.encode(money22));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                gpsConfigQueries3.notifyQueries(-655622738, new CelebrationKt$$ExternalSyntheticLambda1(15));
                ((GpsConfigQueries) savingsScreenPresenter.goalLocalStatus).setLastSeenValues(savingsAndGoalBalanceSeen.token, savingsAndGoalBalanceSeen.amount, savingsAndGoalBalanceSeen.remainingBalance, new Long((long) Math.floor(savingsAndGoalBalanceSeen.progress * 10000.0f)));
                break;
        }
        return Unit.INSTANCE;
    }
}
