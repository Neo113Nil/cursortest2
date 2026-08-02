package com.squareup.cash.localization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.preferences.KeyValue;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ClientSyncLocaleChangeIoSetupTeardown implements IoSetupTeardown, ClientSyncRequestObserver {
    public final KeyValue clientSyncLocale;
    public final Lazy clientSyncer;
    public final CoroutineContext ioContext;
    public final RealLocaleManager localeManager;
    public final CoroutineScope scope;

    public ClientSyncLocaleChangeIoSetupTeardown(Lazy lazy, RealLocaleManager realLocaleManager, KeyValue keyValue, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.clientSyncer = lazy;
        this.localeManager = realLocaleManager;
        this.clientSyncLocale = keyValue;
        this.scope = coroutineScope;
        this.ioContext = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleLocaleChange(ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown, ContinuationImpl continuationImpl) {
        ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1 clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1;
        int i;
        RealClientSyncer realClientSyncer;
        if (continuationImpl instanceof ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1) {
            clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1 = (ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1) continuationImpl;
            int i2 = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realClientSyncer = (RealClientSyncer) clientSyncLocaleChangeIoSetupTeardown.clientSyncer.getValue();
                    CompletableDeferredImpl reset = realClientSyncer.reset(ResetTrigger.ImmediateForceResync);
                    clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.L$0 = realClientSyncer;
                    clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.label = 1;
                    if (reset.awaitInternal(clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realClientSyncer = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SyncTrigger syncTrigger = SyncTrigger.APP_LAUNCH;
                realClientSyncer.getClass();
                realClientSyncer.sync(syncTrigger, SyncScope.Global.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1 = new ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1(clientSyncLocaleChangeIoSetupTeardown, continuationImpl);
        Object obj2 = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1.label;
        if (i != 0) {
        }
        SyncTrigger syncTrigger2 = SyncTrigger.APP_LAUNCH;
        realClientSyncer.getClass();
        realClientSyncer.sync(syncTrigger2, SyncScope.Global.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestOperation(SyncRequestOperation.Result result) {
        result.getClass();
        if (result instanceof SyncRequestOperation.Result.Success) {
            JobKt.launch$default(this.scope, this.ioContext, null, new MusicPresenter$models$2$1(this, (Locale) this.localeManager.resolvedLocale.$$delegate_0.getValue(), null, 7), 2);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onSyncRequestPageFailure(SyncRequestOperation syncRequestOperation) {
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 21), 1);
        return StateFlowKt.noOpTeardown;
    }
}
