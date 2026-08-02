package com.squareup.cash.paychecks.applets.presenters;

import androidx.core.text.TextUtilsCompat;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.featureflags.AmplitudeExperiments$EarningsApplet;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksAppletRequest;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealPaychecksAppletTileRepository implements HasObservability {
    public final PaychecksAppService appService;
    public final DerivedStateFlow availabilityState;
    public final RealClientSyncer clientSyncer;
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaychecksUiState.PaychecksAppletState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaychecksUiState.PaychecksAppletState paychecksAppletState = PaychecksUiState.PaychecksAppletState.NULL_STATE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PaychecksUiState.PaychecksAppletState paychecksAppletState2 = PaychecksUiState.PaychecksAppletState.NULL_STATE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClientSyncer$Result.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ClientSyncer$Result clientSyncer$Result = ClientSyncer$Result.Success;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public RealPaychecksAppletTileRepository(PaychecksAppService paychecksAppService, RealClientSyncer realClientSyncer, FeatureFlagManager featureFlagManager, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, ErrorReporter errorReporter, SampleStrategy sampleStrategy, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.appService = paychecksAppService;
        this.clientSyncer = realClientSyncer;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new MusicPresenter$models$3$1(this, null, 13), 2);
        this.availabilityState = StateFlowKt.combineState(syncValueReader.getSingleValue(AndroidSyncValueSpecs.PaychecksUiState), StateFlowKt.mapState(Trace.valuesState(featureFlagManager, AmplitudeExperiments$EarningsApplet.INSTANCE), new OffersStyledTextKt$$ExternalSyntheticLambda0(26)), new SuggestionUiKt$$ExternalSyntheticLambda8(this, 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refresh(RealPaychecksAppletTileRepository realPaychecksAppletTileRepository, ContinuationImpl continuationImpl) {
        RealPaychecksAppletTileRepository$refresh$1 realPaychecksAppletTileRepository$refresh$1;
        int i;
        boolean z;
        List list;
        if (continuationImpl instanceof RealPaychecksAppletTileRepository$refresh$1) {
            realPaychecksAppletTileRepository$refresh$1 = (RealPaychecksAppletTileRepository$refresh$1) continuationImpl;
            int i2 = realPaychecksAppletTileRepository$refresh$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaychecksAppletTileRepository$refresh$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPaychecksAppletTileRepository$refresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaychecksAppletTileRepository$refresh$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientSyncConfig clientSyncConfig = (ClientSyncConfig) realPaychecksAppletTileRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                    if (clientSyncConfig == null || (list = clientSyncConfig.topic_sync_allowlist) == null) {
                        z = false;
                    } else {
                        SyncTopic syncTopic = SyncTopic.UNKNOWN;
                        z = list.contains(new Integer(34));
                    }
                    if (z) {
                        CompletableDeferredImpl sync = realPaychecksAppletTileRepository.clientSyncer.sync(SyncTrigger.USER_ACTION, SetsKt__SetsJVMKt.setOf(SyncTopic.PAYCHECKS));
                        realPaychecksAppletTileRepository$refresh$1.label = 1;
                        obj = sync.awaitInternal(realPaychecksAppletTileRepository$refresh$1);
                    } else {
                        PaychecksAppService paychecksAppService = realPaychecksAppletTileRepository.appService;
                        RefreshPaychecksAppletRequest refreshPaychecksAppletRequest = new RefreshPaychecksAppletRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                        realPaychecksAppletTileRepository$refresh$1.label = 2;
                        obj = paychecksAppService.refreshPaychecksApplet(refreshPaychecksAppletRequest, realPaychecksAppletTileRepository$refresh$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((ClientSyncer$Result) obj).ordinal();
                    if (ordinal == 0) {
                        Timber.Forest.d("Successfully refreshed Paychecks Applet via topic sync", new Object[0]);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.d("Failed to refresh Paychecks Applet via topic sync", new Object[0]);
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.w("Failed to refresh Paychecks Applet: " + TextUtilsCompat.errorMessaging(realPaychecksAppletTileRepository.stringManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                    }
                    if (apiResult instanceof ApiResult.Success) {
                        Timber.Forest.d("Successfully refreshed Paychecks Applet", new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realPaychecksAppletTileRepository$refresh$1 = new RealPaychecksAppletTileRepository$refresh$1(realPaychecksAppletTileRepository, continuationImpl);
        Object obj2 = realPaychecksAppletTileRepository$refresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaychecksAppletTileRepository$refresh$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
