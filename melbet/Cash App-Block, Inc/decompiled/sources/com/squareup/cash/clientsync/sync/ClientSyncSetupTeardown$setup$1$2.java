package com.squareup.cash.clientsync.sync;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ClientSyncSetupTeardown$setup$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ClientSyncSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClientSyncSetupTeardown$setup$1$2(ClientSyncSetupTeardown clientSyncSetupTeardown, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = clientSyncSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ClientSyncSetupTeardown clientSyncSetupTeardown = this.this$0;
        switch (i) {
            case 0:
                return new ClientSyncSetupTeardown$setup$1$2(clientSyncSetupTeardown, continuation, 0);
            default:
                return new ClientSyncSetupTeardown$setup$1$2(clientSyncSetupTeardown, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ClientSyncSetupTeardown$setup$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r8 == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
    
        if (r9.awaitInternal(r8) == r5) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.squareup.cash.clientsync.syncer.RealClientSyncer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i = this.$r8$classId;
        ClientSyncSetupTeardown clientSyncSetupTeardown = this.this$0;
        int i2 = 1;
        Collection collection = 0;
        collection = 0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("CLIENTSYNC");
                    forest.i("Syncing on activity resume", new Object[0]);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    ClientSyncSetupTeardown$setup$1$2 clientSyncSetupTeardown$setup$1$2 = new ClientSyncSetupTeardown$setup$1$2(clientSyncSetupTeardown, collection, i2);
                    this.label = 1;
                    if (JobKt.withContext(defaultIoScheduler, clientSyncSetupTeardown$setup$1$2, this) == coroutineSingletons) {
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
                ?? r0 = clientSyncSetupTeardown.clientSyncer;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl sync = r0.sync(SyncTrigger.APP_LAUNCH, SyncScope.Global.INSTANCE);
                    this.label = 1;
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ClientSyncConfig clientSyncConfig = (ClientSyncConfig) clientSyncSetupTeardown.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                if (clientSyncConfig != null && (list = clientSyncConfig.app_launch_topic_sync_allowlist) != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SyncTopic(((Number) it.next()).intValue()));
                    }
                    collection = CollectionsKt.toSet(arrayList);
                }
                if (collection == 0) {
                    collection = EmptySet.INSTANCE;
                }
                if (!collection.isEmpty()) {
                    CompletableDeferredImpl sync2 = r0.sync(SyncTrigger.APP_LAUNCH, collection);
                    this.label = 2;
                    Object awaitInternal = sync2.awaitInternal(this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
