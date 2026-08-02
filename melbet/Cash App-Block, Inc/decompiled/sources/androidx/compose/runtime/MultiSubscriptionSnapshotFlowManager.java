package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class MultiSubscriptionSnapshotFlowManager extends InteractionResult {
    public final ArrayList pendingChanges;
    public final MutableScatterMap readObserverCache;
    public final MutableScatterMap subscriptions;
    public final MutableScatterSet toNotify;
    public final Snapshot$Companion$$ExternalSyntheticLambda0 unregisterApplyObserver;

    public final class Add implements SubscriptionChange {
        public final SendChannel channel;
        public final Object obj;

        public Add(Object obj, SendChannel sendChannel) {
            this.obj = obj;
            this.channel = sendChannel;
        }
    }

    public final class RemoveScope implements SubscriptionChange {
        public final SendChannel channel;

        public RemoveScope(SendChannel sendChannel) {
            this.channel = sendChannel;
        }
    }

    public interface SubscriptionChange {
    }

    public MultiSubscriptionSnapshotFlowManager() {
        super((byte) 0, 2);
        this.subscriptions = PlatformKt.m1339constructorimpl$default();
        this.pendingChanges = new ArrayList();
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        this.toNotify = new MutableScatterSet();
        this.readObserverCache = new MutableScatterMap();
        HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(this, 17);
        SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        synchronized (SnapshotKt.lock) {
            SnapshotKt.applyObservers = CollectionsKt.plus((Collection) SnapshotKt.applyObservers, (Object) hintHandler$$ExternalSyntheticLambda0);
        }
        this.unregisterApplyObserver = new Snapshot$Companion$$ExternalSyntheticLambda0(hintHandler$$ExternalSyntheticLambda0, 1);
    }

    @Override // papa.InteractionResult
    public final void clearWatchSet$runtime(SendChannel sendChannel) {
        this.pendingChanges.add(new RemoveScope(sendChannel));
    }

    @Override // papa.InteractionResult
    public final void commitSubscriptionChanges$runtime() {
        synchronized (this.$$delegate_0) {
            try {
                ArrayList arrayList = this.pendingChanges;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SubscriptionChange subscriptionChange = (SubscriptionChange) arrayList.get(i);
                    if (subscriptionChange instanceof Add) {
                        PlatformKt.m1338addimpl(this.subscriptions, ((Add) subscriptionChange).obj, ((Add) subscriptionChange).channel);
                    } else {
                        if (!(subscriptionChange instanceof RemoveScope)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlatformKt.m1343removeScopeimpl(this.subscriptions, ((RemoveScope) subscriptionChange).channel);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.pendingChanges.clear();
    }

    @Override // papa.InteractionResult
    public final void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        this.pendingChanges.clear();
        this.readObserverCache.clear();
        synchronized (this.$$delegate_0) {
            this.subscriptions.clear();
        }
    }

    @Override // papa.InteractionResult
    public final Function1 readObserverFor$runtime(SendChannel sendChannel) {
        MutableScatterMap mutableScatterMap = this.readObserverCache;
        Function1 function1 = (Function1) mutableScatterMap.get(sendChannel);
        if (function1 == null) {
            function1 = new Navigator$$ExternalSyntheticLambda0(18, this, sendChannel);
            int findInsertIndex = mutableScatterMap.findInsertIndex(sendChannel);
            if (findInsertIndex < 0) {
                findInsertIndex = ~findInsertIndex;
            }
            Object[] objArr = mutableScatterMap.values;
            Object obj = objArr[findInsertIndex];
            mutableScatterMap.keys[findInsertIndex] = sendChannel;
            objArr[findInsertIndex] = function1;
        }
        return function1;
    }

    @Override // papa.InteractionResult
    public final void reportSnapshotFlowCancellation$runtime(Channel channel) {
        this.readObserverCache.remove(channel);
        clearWatchSet$runtime(channel);
        commitSubscriptionChanges$runtime();
    }

    public final void watch$runtime(Object obj, SendChannel sendChannel) {
        this.pendingChanges.add(new Add(obj, sendChannel));
    }
}
