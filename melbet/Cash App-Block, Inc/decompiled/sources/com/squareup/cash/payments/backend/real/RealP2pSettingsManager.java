package com.squareup.cash.payments.backend.real;

import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetIncomingRequestPolicyRequest;
import com.squareup.protos.franklin.app.SetIncomingRequestPolicyResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.franklin.ui.UiP2pSettings;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealP2pSettingsManager {
    public final AppService appService;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final InstrumentQueries profileQueries;
    public final Signal signOutSignal;
    public final SyncValueReader syncValueReader;

    public RealP2pSettingsManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppService appService, CoroutineContext coroutineContext, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, Signal signal) {
        this.appService = appService;
        this.ioDispatcher = coroutineContext;
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = syncValueReader;
        this.signOutSignal = signal;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public final Flow select() {
        return StateFlowKt.runUntil(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.P2P_SETTINGS, new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(this.profileQueries.select$2()), this.ioDispatcher), this, 24), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.P2pSettings, null, new MainPaymentViewKt$$ExternalSyntheticLambda25(this)), 24)), 24), this.signOutSignal);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateIncomingRequestPolicy(IncomingRequestPolicy incomingRequestPolicy, ContinuationImpl continuationImpl) {
        RealP2pSettingsManager$updateIncomingRequestPolicy$1 realP2pSettingsManager$updateIncomingRequestPolicy$1;
        int i;
        ApiResult apiResult;
        SyncEntitiesResponse syncEntitiesResponse;
        List list;
        Object obj;
        SyncValue syncValue;
        UiP2pSettings uiP2pSettings;
        IncomingRequestPolicy incomingRequestPolicy2;
        if (continuationImpl instanceof RealP2pSettingsManager$updateIncomingRequestPolicy$1) {
            realP2pSettingsManager$updateIncomingRequestPolicy$1 = (RealP2pSettingsManager$updateIncomingRequestPolicy$1) continuationImpl;
            int i2 = realP2pSettingsManager$updateIncomingRequestPolicy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realP2pSettingsManager$updateIncomingRequestPolicy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realP2pSettingsManager$updateIncomingRequestPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realP2pSettingsManager$updateIncomingRequestPolicy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = new SetIncomingRequestPolicyRequest(null, incomingRequestPolicy, ByteString.EMPTY);
                    realP2pSettingsManager$updateIncomingRequestPolicy$1.label = 1;
                    obj2 = this.appService.setIncomingRequestPolicy(setIncomingRequestPolicyRequest, realP2pSettingsManager$updateIncomingRequestPolicy$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                apiResult = (ApiResult) obj2;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ResponseContext responseContext = ((SetIncomingRequestPolicyResponse) ((ApiResult.Success) apiResult).response).response_context;
                if (responseContext != null && (syncEntitiesResponse = responseContext.sync_entities_data) != null && (list = syncEntitiesResponse.entities) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        SyncValue syncValue2 = ((SyncEntity) obj).sync_value;
                        if ((syncValue2 != null ? syncValue2.f1393type : null) == SyncValueType.P2P_SETTINGS) {
                            break;
                        }
                    }
                    SyncEntity syncEntity = (SyncEntity) obj;
                    if (syncEntity != null && (syncValue = syncEntity.sync_value) != null) {
                        SyncValue.Value value = syncValue.value;
                        SyncValue.Value.P2pSettings p2pSettings = value instanceof SyncValue.Value.P2pSettings ? (SyncValue.Value.P2pSettings) value : null;
                        if (p2pSettings != null && (uiP2pSettings = p2pSettings.value) != null && (incomingRequestPolicy2 = uiP2pSettings.incoming_request_policy) != null) {
                            return new ApiResult.Success(incomingRequestPolicy2);
                        }
                    }
                }
                return new ApiResult.Failure.NetworkFailure(new Exception("Response doesn't include P2PSettings.incoming_request_policy"));
            }
        }
        realP2pSettingsManager$updateIncomingRequestPolicy$1 = new RealP2pSettingsManager$updateIncomingRequestPolicy$1(this, continuationImpl);
        Object obj22 = realP2pSettingsManager$updateIncomingRequestPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realP2pSettingsManager$updateIncomingRequestPolicy$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
