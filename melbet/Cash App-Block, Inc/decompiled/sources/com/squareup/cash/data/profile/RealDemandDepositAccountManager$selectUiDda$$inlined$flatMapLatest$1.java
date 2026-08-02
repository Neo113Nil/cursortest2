package com.squareup.cash.data.profile;

import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.DirectDepositAccountQueries$select$2;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealDemandDepositAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1(Continuation continuation, RealDemandDepositAccountManager realDemandDepositAccountManager, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realDemandDepositAccountManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealDemandDepositAccountManager realDemandDepositAccountManager = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1 realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1 = new RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1(continuation, realDemandDepositAccountManager, 0);
                realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1.L$1 = obj2;
                return realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1 realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$12 = new RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1(continuation, realDemandDepositAccountManager, 1);
                realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$12.L$1 = obj2;
                return realDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealDemandDepositAccountManager realDemandDepositAccountManager = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow transformLatest = ((Boolean) obj2).booleanValue() ? FlowKt.transformLatest(realDemandDepositAccountManager.inMemoryAccountNumberMutableStateFlow, new RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1(continuation, realDemandDepositAccountManager, i2)) : new AppLockMonitor$special$$inlined$map$2(null, 19);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, transformLatest, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionQueries sessionQueries = realDemandDepositAccountManager.queries;
                    sessionQueries.getClass();
                    DirectDepositAccountQueries$select$2 directDepositAccountQueries$select$2 = DirectDepositAccountQueries$select$2.INSTANCE;
                    SqlDriver sqlDriver = sessionQueries.driver;
                    OfflineQueries$$ExternalSyntheticLambda1 offlineQueries$$ExternalSyntheticLambda1 = new OfflineQueries$$ExternalSyntheticLambda1(24);
                    sqlDriver.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-441661217, new String[]{"directDepositAccount"}, sqlDriver, "DirectDepositAccount.sq", "select", "SELECT directDepositAccount.routing_number, directDepositAccount.account_number_prefix, directDepositAccount.is_placeholder, directDepositAccount.explanation_text, directDepositAccount.display_complete_account_number, directDepositAccount.support_node_token\nFROM directDepositAccount", offlineQueries$$ExternalSyntheticLambda1)), realDemandDepositAccountManager.ioDispatcher);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect = mapToOneOrNull.collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector2, realDemandDepositAccountManager, (String) obj3), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
