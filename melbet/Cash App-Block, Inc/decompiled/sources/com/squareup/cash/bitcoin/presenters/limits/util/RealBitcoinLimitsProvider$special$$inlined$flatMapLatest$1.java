package com.squareup.cash.bitcoin.presenters.limits.util;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.util.DBUtil;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.CustomerLimitsQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.CustomerLimitsQueries$limitForAction$2;
import com.squareup.cash.db2.profile.CustomerLimitsQueries$limitsForActions$2;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import okio.internal.ResourceFileSystem;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealBitcoinLimitsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(Continuation continuation, RealBitcoinLimitsProvider realBitcoinLimitsProvider, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realBitcoinLimitsProvider;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealBitcoinLimitsProvider realBitcoinLimitsProvider = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1 realBitcoinLimitsProvider$special$$inlined$flatMapLatest$1 = new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, realBitcoinLimitsProvider, 0);
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$1.L$1 = obj2;
                return realBitcoinLimitsProvider$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1 realBitcoinLimitsProvider$special$$inlined$flatMapLatest$12 = new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, realBitcoinLimitsProvider, 1);
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$12.L$1 = obj2;
                return realBitcoinLimitsProvider$special$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            default:
                RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1 realBitcoinLimitsProvider$special$$inlined$flatMapLatest$13 = new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, realBitcoinLimitsProvider, 2);
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$13.L$0 = flowCollector;
                realBitcoinLimitsProvider$special$$inlined$flatMapLatest$13.L$1 = obj2;
                return realBitcoinLimitsProvider$special$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [com.squareup.cash.db2.profile.CustomerLimitsQueries$$ExternalSyntheticLambda1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealBitcoinLimitsProvider realBitcoinLimitsProvider = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CurrencyCode currencyCode = (CurrencyCode) obj2;
                    RealCustomerLimitsManager realCustomerLimitsManager = (RealCustomerLimitsManager) realBitcoinLimitsProvider.customerLimitsManager;
                    currencyCode.getClass();
                    InstrumentQueries instrumentQueries = realCustomerLimitsManager.limitsQueries;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(LimitedAction.BUY_CRYPTOCURRENCY);
                    instrumentQueries.getClass();
                    listOf.getClass();
                    CustomerLimitsQueries$limitsForActions$2 customerLimitsQueries$limitsForActions$2 = CustomerLimitsQueries$limitsForActions$2.INSTANCE;
                    FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(instrumentQueries, listOf, new Function1(instrumentQueries, 0) { // from class: com.squareup.cash.db2.profile.CustomerLimitsQueries$$ExternalSyntheticLambda1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ InstrumentQueries f$1;

                        {
                            this.$r8$classId = r2;
                            switch (r2) {
                                case 1:
                                    CustomerLimitsQueries$limitForAction$2 customerLimitsQueries$limitForAction$2 = CustomerLimitsQueries$limitForAction$2.INSTANCE;
                                    break;
                                default:
                                    CustomerLimitsQueries$limitsForActions$2 customerLimitsQueries$limitsForActions$22 = CustomerLimitsQueries$limitsForActions$2.INSTANCE;
                                    break;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i4 = this.$r8$classId;
                            InstrumentQueries instrumentQueries2 = this.f$1;
                            switch (i4) {
                                case 0:
                                    CustomerLimitsQueries$limitsForActions$2 customerLimitsQueries$limitsForActions$22 = CustomerLimitsQueries$limitsForActions$2.INSTANCE;
                                    AndroidCursor androidCursor = (AndroidCursor) obj3;
                                    androidCursor.getClass();
                                    return customerLimitsQueries$limitsForActions$22.invoke(NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 1, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).scenario_planAdapter), androidCursor.getString(2));
                                default:
                                    CustomerLimitsQueries$limitForAction$2 customerLimitsQueries$limitForAction$2 = CustomerLimitsQueries$limitForAction$2.INSTANCE;
                                    AndroidCursor androidCursor2 = (AndroidCursor) obj3;
                                    androidCursor2.getClass();
                                    return customerLimitsQueries$limitForAction$2.invoke(NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 1, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).scenario_planAdapter), androidCursor2.getString(2));
                            }
                        }
                    }, 29)), realCustomerLimitsManager.ioDispatcher);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = mapToList.collect(new RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2(flowCollector, realCustomerLimitsManager, currencyCode), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(Countries.asMoney(realBitcoinLimitsProvider.cryptoBalanceRepo.getBitcoinBalance()), ((RealCurrencyConverter.Factory) realBitcoinLimitsProvider.currencyConverterFactory).get((CurrencyCode) obj3));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, convert, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector3 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Money money = (Money) obj4;
                    RealCustomerLimitsManager realCustomerLimitsManager2 = (RealCustomerLimitsManager) realBitcoinLimitsProvider.customerLimitsManager;
                    money.getClass();
                    InstrumentQueries instrumentQueries2 = realCustomerLimitsManager2.limitsQueries;
                    ResourceFileSystem.Companion companion = LimitedAction.Companion;
                    instrumentQueries2.getClass();
                    CustomerLimitsQueries$limitForAction$2 customerLimitsQueries$limitForAction$2 = CustomerLimitsQueries$limitForAction$2.INSTANCE;
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdsQuery(instrumentQueries2, (CustomerLimitsQueries$$ExternalSyntheticLambda1) new Function1(instrumentQueries2, i2) { // from class: com.squareup.cash.db2.profile.CustomerLimitsQueries$$ExternalSyntheticLambda1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ InstrumentQueries f$1;

                        {
                            this.$r8$classId = i2;
                            switch (i2) {
                                case 1:
                                    CustomerLimitsQueries$limitForAction$2 customerLimitsQueries$limitForAction$22 = CustomerLimitsQueries$limitForAction$2.INSTANCE;
                                    break;
                                default:
                                    CustomerLimitsQueries$limitsForActions$2 customerLimitsQueries$limitsForActions$22 = CustomerLimitsQueries$limitsForActions$2.INSTANCE;
                                    break;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj32) {
                            int i42 = this.$r8$classId;
                            InstrumentQueries instrumentQueries22 = this.f$1;
                            switch (i42) {
                                case 0:
                                    CustomerLimitsQueries$limitsForActions$2 customerLimitsQueries$limitsForActions$22 = CustomerLimitsQueries$limitsForActions$2.INSTANCE;
                                    AndroidCursor androidCursor = (AndroidCursor) obj32;
                                    androidCursor.getClass();
                                    return customerLimitsQueries$limitsForActions$22.invoke(NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 1, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).scenario_planAdapter), androidCursor.getString(2));
                                default:
                                    CustomerLimitsQueries$limitForAction$2 customerLimitsQueries$limitForAction$22 = CustomerLimitsQueries$limitForAction$2.INSTANCE;
                                    AndroidCursor androidCursor2 = (AndroidCursor) obj32;
                                    androidCursor2.getClass();
                                    return customerLimitsQueries$limitForAction$22.invoke(NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 1, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).scenario_planAdapter), androidCursor2.getString(2));
                            }
                        }
                    })), realCustomerLimitsManager2.ioDispatcher);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector3);
                    Object collect2 = mapToOneOrNull.collect(new RealTransferManager$addCash$$inlined$map$1.AnonymousClass2(flowCollector3, realCustomerLimitsManager2, money), this);
                    if (collect2 != coroutineSingletons3) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons3) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
