package androidx.paging;

import androidx.compose.material3.SliderState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.account.AccountAuthenticateComplete;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MulticastedPagingData$asPagingData$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MulticastedPagingData$asPagingData$2(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.$r8$classId) {
            case 0:
                return new MulticastedPagingData$asPagingData$2((MulticastedPagingData) this.this$0, (Continuation) obj3, 0).invokeSuspend(Unit.INSTANCE);
            case 1:
                return new MulticastedPagingData$asPagingData$2((Ref$BooleanRef) this.this$0, (Continuation) obj3, 1).invokeSuspend(Unit.INSTANCE);
            case 2:
                ((Number) obj2).floatValue();
                return new MulticastedPagingData$asPagingData$2((SliderState) this.this$0, (Continuation) obj3, 2).invokeSuspend(Unit.INSTANCE);
            case 3:
                ((Number) obj2).intValue();
                MulticastedPagingData$asPagingData$2 multicastedPagingData$asPagingData$2 = new MulticastedPagingData$asPagingData$2(i, (Continuation) obj3, i);
                multicastedPagingData$asPagingData$2.this$0 = (SessionState) obj;
                return multicastedPagingData$asPagingData$2.invokeSuspend(Unit.INSTANCE);
            case 4:
                return new MulticastedPagingData$asPagingData$2((PasscodeGenericGatedEndpointTypeTransformer) this.this$0, (Continuation) obj3, 4).invokeSuspend(Unit.INSTANCE);
            case 5:
                ((Number) obj2).floatValue();
                return new MulticastedPagingData$asPagingData$2((MutableFloatState) this.this$0, (Continuation) obj3, 5).invokeSuspend(Unit.INSTANCE);
            case 6:
                return new MulticastedPagingData$asPagingData$2((RealStocksAppletTilePriceMovementRepository) this.this$0, (Continuation) obj3, 6).invokeSuspend(Unit.INSTANCE);
            case 7:
                MulticastedPagingData$asPagingData$2 multicastedPagingData$asPagingData$22 = new MulticastedPagingData$asPagingData$2(i, (Continuation) obj3, 7);
                multicastedPagingData$asPagingData$22.this$0 = obj;
                return multicastedPagingData$asPagingData$22.invokeSuspend(Unit.INSTANCE);
            case 8:
                return new MulticastedPagingData$asPagingData$2((Function0) this.this$0, (Continuation) obj3, 8).invokeSuspend(Unit.INSTANCE);
            case 9:
                ((Boolean) obj).getClass();
                MulticastedPagingData$asPagingData$2 multicastedPagingData$asPagingData$23 = new MulticastedPagingData$asPagingData$2(i, (Continuation) obj3, 9);
                multicastedPagingData$asPagingData$23.this$0 = (Offset) obj2;
                return multicastedPagingData$asPagingData$23.invokeSuspend(Unit.INSTANCE);
            default:
                return new MulticastedPagingData$asPagingData$2((AtomicBoolean) this.this$0, (Continuation) obj3, 10).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MulticastedPagingData) this.this$0).getClass();
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Ref$BooleanRef) this.this$0).element = true;
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SliderState) this.this$0).gestureEndAction.invoke();
                return Unit.INSTANCE;
            case 3:
                SessionState sessionState = (SessionState) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return sessionState;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer = (PasscodeGenericGatedEndpointTypeTransformer) this.this$0;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeGenericGatedEndpointTypeTransformer.args;
                if (!passcodeGenericGatedEndpointTypeTransformer.navigatedAway) {
                    Analytics analytics = passcodeGenericGatedEndpointTypeTransformer.analytics;
                    ClientScenario clientScenario = passcodeScreen.blockersData.clientScenario;
                    analytics.track(new AccountAuthenticateComplete(clientScenario != null ? clientScenario.name() : null, passcodeScreen.blockersData.flowToken, AccountAuthenticateComplete.AuthenticationResult.CANCELED, new Integer(passcodeGenericGatedEndpointTypeTransformer.attemptCount)), null);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) this.this$0)).setFloatValue(-1.0f);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((RealStocksAppletTilePriceMovementRepository) this.this$0).historicalPriceTickRefresher.stocksActiveOverride;
                Boolean bool = Boolean.FALSE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                return Unit.INSTANCE;
            case 7:
                Object obj2 = this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return obj2;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function0) this.this$0).invoke();
                return Unit.INSTANCE;
            case 9:
                Offset offset = (Offset) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return offset;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AtomicBoolean) this.this$0).set(false);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MulticastedPagingData$asPagingData$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
