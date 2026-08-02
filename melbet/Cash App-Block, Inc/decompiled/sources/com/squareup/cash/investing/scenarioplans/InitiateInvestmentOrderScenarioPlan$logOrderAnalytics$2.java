package com.squareup.cash.investing.scenarioplans;

import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.squareup.cash.cdf.stock.Frequency;
import com.squareup.cash.cdf.stock.OrderType;
import com.squareup.cash.cdf.stock.StockTradeSubmitAmount;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$RequestValue$Amount;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderScenarioPlan$logOrderAnalytics$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InitiateInvestmentOrderRequest $request;
    public final /* synthetic */ InitiateInvestmentOrderScenarioPlan this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClientDriven.Companion companion = OrderSide.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ClientDriven.Companion companion2 = OrderSide.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInvestmentOrderScenarioPlan$logOrderAnalytics$2(InitiateInvestmentOrderRequest initiateInvestmentOrderRequest, InitiateInvestmentOrderScenarioPlan initiateInvestmentOrderScenarioPlan, Continuation continuation) {
        super(2, continuation);
        this.$request = initiateInvestmentOrderRequest;
        this.this$0 = initiateInvestmentOrderScenarioPlan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitiateInvestmentOrderScenarioPlan$logOrderAnalytics$2(this.$request, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InitiateInvestmentOrderScenarioPlan$logOrderAnalytics$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.squareup.cash.cdf.stock.OrderSide orderSide;
        Frequency frequency;
        Money money;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = this.$request;
        OrderSide orderSide2 = initiateInvestmentOrderRequest.side;
        orderSide2.getClass();
        int ordinal = orderSide2.ordinal();
        if (ordinal == 0) {
            orderSide = com.squareup.cash.cdf.stock.OrderSide.BUY;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            orderSide = com.squareup.cash.cdf.stock.OrderSide.SELL;
        }
        InitiateInvestmentOrderScenarioPlan initiateInvestmentOrderScenarioPlan = this.this$0;
        InvestmentEntityQueries investmentEntityQueries = initiateInvestmentOrderScenarioPlan.cashDatabase.investmentEntityQueries;
        String str = initiateInvestmentOrderRequest.investment_entity_token;
        str.getClass();
        String str2 = ((Investment_entity) investmentEntityQueries.forToken(str).executeAsOne()).symbol;
        zzea zzeaVar = initiateInvestmentOrderRequest.request_value;
        InitiateInvestmentOrderRequest$RequestValue$Amount initiateInvestmentOrderRequest$RequestValue$Amount = zzeaVar instanceof InitiateInvestmentOrderRequest$RequestValue$Amount ? (InitiateInvestmentOrderRequest$RequestValue$Amount) zzeaVar : null;
        Long l = (initiateInvestmentOrderRequest$RequestValue$Amount == null || (money = initiateInvestmentOrderRequest$RequestValue$Amount.value) == null) ? null : money.amount;
        RecurringSchedule recurringSchedule = initiateInvestmentOrderRequest.recurring_schedule;
        OrderType orderType = recurringSchedule != null ? OrderType.AUTO_INVEST : initiateInvestmentOrderRequest.custom_order != null ? OrderType.CUSTOM : OrderType.ONE_OFF;
        RecurringSchedule.Frequency frequency2 = recurringSchedule != null ? recurringSchedule.frequency : null;
        int i = frequency2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency2.ordinal()];
        if (i == -1) {
            frequency = Frequency.ONE_TIME;
        } else if (i == 1) {
            frequency = Frequency.WEEKLY;
        } else if (i == 2) {
            frequency = Frequency.EVERY_TWO_WEEKS;
        } else if (i == 3) {
            frequency = Frequency.DAILY;
        } else {
            if (i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            frequency = Frequency.MONTHLY;
        }
        initiateInvestmentOrderScenarioPlan.analytics.track(new StockTradeSubmitAmount(orderSide, str2, l, orderType, frequency, initiateInvestmentOrderScenarioPlan.referrerFlowToken), null);
        return Unit.INSTANCE;
    }
}
