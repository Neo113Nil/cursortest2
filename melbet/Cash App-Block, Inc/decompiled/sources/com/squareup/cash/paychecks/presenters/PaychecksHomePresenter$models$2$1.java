package com.squareup.cash.paychecks.presenters;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksHomeRequest;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PaychecksHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TapToPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaychecksHomePresenter$models$2$1(TapToPayPresenter tapToPayPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = tapToPayPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TapToPayPresenter tapToPayPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaychecksHomePresenter$models$2$1(tapToPayPresenter, continuation, 0);
            default:
                return new PaychecksHomePresenter$models$2$1(tapToPayPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaychecksHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        if (r0 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        if (r0 == r1) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object refreshPaychecksHome;
        Object awaitInternal;
        List list;
        int i = this.$r8$classId;
        TapToPayPresenter tapToPayPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientSyncConfig clientSyncConfig = (ClientSyncConfig) ((SyncValueReader) tapToPayPresenter.flowStarter).getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                    if (clientSyncConfig == null || (list = clientSyncConfig.topic_sync_allowlist) == null) {
                        z = false;
                    } else {
                        SyncTopic syncTopic = SyncTopic.UNKNOWN;
                        z = list.contains(new Integer(34));
                    }
                    if (!z) {
                        RefreshPaychecksHomeRequest refreshPaychecksHomeRequest = new RefreshPaychecksHomeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                        PaychecksAppService paychecksAppService = (PaychecksAppService) tapToPayPresenter.profileManager;
                        this.label = 2;
                        refreshPaychecksHome = paychecksAppService.refreshPaychecksHome(refreshPaychecksHomeRequest, this);
                        break;
                    } else {
                        CompletableDeferredImpl sync = ((RealClientSyncer) tapToPayPresenter.tapToPayAnalyticsHelper).sync(SyncTrigger.USER_ACTION, SetsKt__SetsJVMKt.setOf(SyncTopic.PAYCHECKS));
                        this.label = 1;
                        awaitInternal = sync.awaitInternal(this);
                        break;
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    awaitInternal = obj;
                    int ordinal = ((ClientSyncer$Result) awaitInternal).ordinal();
                    if (ordinal == 0) {
                        Timber.Forest.d("Successfully refreshed Paychecks Home via topic sync", new Object[0]);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.d("Failed to refresh Paychecks Home via topic sync", new Object[0]);
                    }
                } else {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    refreshPaychecksHome = obj;
                    ApiResult apiResult = (ApiResult) refreshPaychecksHome;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.w("Failed to refresh Paychecks Home: %s", TextUtilsCompat.errorMessaging((AndroidStringManager) tapToPayPresenter.keyProvider, (ApiResult.Failure) apiResult, null).message);
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.d("Successfully refreshed Paychecks Home", new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager activitiesManager = (ActivitiesManager) tapToPayPresenter.screenRecodingDetector;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
