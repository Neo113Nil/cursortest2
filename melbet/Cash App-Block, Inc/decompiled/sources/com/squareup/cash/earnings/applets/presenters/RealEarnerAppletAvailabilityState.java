package com.squareup.cash.earnings.applets.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.earnings.backend.api.EarningsTopicSyncKt;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealEarnerAppletAvailabilityState {
    public final DerivedStateFlow availabilityState;
    public final RealClientSyncer clientSyncer;
    public final SyncValueReader syncValueReader;

    public RealEarnerAppletAvailabilityState(RealEarningsSyncStateRepository realEarningsSyncStateRepository, SyncValueReader syncValueReader, RealClientSyncer realClientSyncer, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.syncValueReader = syncValueReader;
        this.clientSyncer = realClientSyncer;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new GooglePayPresenter$models$1$1(this, null, 14), 2);
        this.availabilityState = realEarningsSyncStateRepository.appletAvailabilityState;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshAppletSyncState(ContinuationImpl continuationImpl) {
        RealEarnerAppletAvailabilityState$refreshAppletSyncState$1 realEarnerAppletAvailabilityState$refreshAppletSyncState$1;
        int i;
        boolean z;
        int ordinal;
        if (continuationImpl instanceof RealEarnerAppletAvailabilityState$refreshAppletSyncState$1) {
            realEarnerAppletAvailabilityState$refreshAppletSyncState$1 = (RealEarnerAppletAvailabilityState$refreshAppletSyncState$1) continuationImpl;
            int i2 = realEarnerAppletAvailabilityState$refreshAppletSyncState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realEarnerAppletAvailabilityState$refreshAppletSyncState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realEarnerAppletAvailabilityState$refreshAppletSyncState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realEarnerAppletAvailabilityState$refreshAppletSyncState$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientSyncConfig clientSyncConfig = (ClientSyncConfig) this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                    if (clientSyncConfig != null) {
                        SyncTopic syncTopic = EarningsTopicSyncKt.EARNINGS_SYNC_TOPIC;
                        syncTopic.getClass();
                        z = clientSyncConfig.topic_sync_allowlist.contains(Integer.valueOf(syncTopic.value));
                    } else {
                        z = false;
                    }
                    if (z) {
                        SyncTrigger syncTrigger = SyncTrigger.USER_ACTION;
                        SyncTopic syncTopic2 = EarningsTopicSyncKt.EARNINGS_SYNC_TOPIC;
                        syncTopic2.getClass();
                        CompletableDeferredImpl sync = this.clientSyncer.sync(syncTrigger, SetsKt__SetsJVMKt.setOf(syncTopic2));
                        realEarnerAppletAvailabilityState$refreshAppletSyncState$1.label = 1;
                        obj = sync.awaitInternal(realEarnerAppletAvailabilityState$refreshAppletSyncState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ordinal = ((ClientSyncer$Result) obj).ordinal();
                if (ordinal != 0) {
                    Timber.Forest.d("Successfully refreshed Earnings Applet via topic sync", new Object[0]);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Failed to refresh Earnings Applet via topic sync", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        realEarnerAppletAvailabilityState$refreshAppletSyncState$1 = new RealEarnerAppletAvailabilityState$refreshAppletSyncState$1(this, continuationImpl);
        Object obj2 = realEarnerAppletAvailabilityState$refreshAppletSyncState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realEarnerAppletAvailabilityState$refreshAppletSyncState$1.label;
        if (i != 0) {
        }
        ordinal = ((ClientSyncer$Result) obj2).ordinal();
        if (ordinal != 0) {
        }
        return Unit.INSTANCE;
    }
}
