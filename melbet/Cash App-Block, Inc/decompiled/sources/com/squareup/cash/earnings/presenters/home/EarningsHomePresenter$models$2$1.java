package com.squareup.cash.earnings.presenters.home;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.earnings.backend.api.EarningsTopicSyncKt;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class EarningsHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ EarningsHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsHomePresenter$models$2$1(EarningsHomePresenter earningsHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = earningsHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        EarningsHomePresenter earningsHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new EarningsHomePresenter$models$2$1(earningsHomePresenter, continuation, 0);
            default:
                return new EarningsHomePresenter$models$2$1(earningsHomePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((EarningsHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.$r8$classId;
        EarningsHomePresenter earningsHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientSyncConfig clientSyncConfig = (ClientSyncConfig) earningsHomePresenter.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                    if (clientSyncConfig != null) {
                        SyncTopic syncTopic = EarningsTopicSyncKt.EARNINGS_SYNC_TOPIC;
                        syncTopic.getClass();
                        z = clientSyncConfig.topic_sync_allowlist.contains(Integer.valueOf(syncTopic.value));
                    } else {
                        z = false;
                    }
                    if (z) {
                        RealClientSyncer realClientSyncer = earningsHomePresenter.clientSyncer;
                        SyncTrigger syncTrigger = SyncTrigger.USER_ACTION;
                        SyncTopic syncTopic2 = EarningsTopicSyncKt.EARNINGS_SYNC_TOPIC;
                        syncTopic2.getClass();
                        CompletableDeferredImpl sync = realClientSyncer.sync(syncTrigger, SetsKt__SetsJVMKt.setOf(syncTopic2));
                        this.label = 1;
                        obj = sync.awaitInternal(this);
                        if (obj == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int ordinal = ((ClientSyncer$Result) obj).ordinal();
                if (ordinal == 0) {
                    Timber.Forest.d("Successfully refreshed Earnings Home via topic sync", new Object[0]);
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    Timber.Forest.d("Failed to refresh Earnings Home via topic sync", new Object[0]);
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager activitiesManager = earningsHomePresenter.activitiesManager;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
