package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class SingleSubscriptionSnapshotFlowManager extends InteractionResult {
    public final CashApp$$ExternalSyntheticLambda2 readObserverCache;
    public Object soleWatchedObject;
    public SendChannel subscribedChannel;
    public final Snapshot$Companion$$ExternalSyntheticLambda0 unregisterApplyObserver;
    public MutableScatterSet watchSet;
    public Object workingSoleWatchedObject;
    public MutableScatterSet workingWatchSet;

    public SingleSubscriptionSnapshotFlowManager() {
        super((byte) 0, 2);
        this.readObserverCache = new CashApp$$ExternalSyntheticLambda2(this, 13);
        ComposerKt$$ExternalSyntheticLambda0 composerKt$$ExternalSyntheticLambda0 = new ComposerKt$$ExternalSyntheticLambda0(this, 7);
        SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        synchronized (SnapshotKt.lock) {
            SnapshotKt.applyObservers = CollectionsKt.plus((Collection) SnapshotKt.applyObservers, (Object) composerKt$$ExternalSyntheticLambda0);
        }
        this.unregisterApplyObserver = new Snapshot$Companion$$ExternalSyntheticLambda0(composerKt$$ExternalSyntheticLambda0, 1);
    }

    @Override // papa.InteractionResult
    public final void clearWatchSet$runtime(SendChannel sendChannel) {
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
    }

    @Override // papa.InteractionResult
    public final void commitSubscriptionChanges$runtime() {
        synchronized (this.$$delegate_0) {
            try {
                this.soleWatchedObject = this.workingSoleWatchedObject;
                if (this.workingWatchSet == null) {
                    this.watchSet = null;
                } else {
                    if (this.watchSet == null) {
                        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
                        this.watchSet = new MutableScatterSet();
                    }
                    MutableScatterSet mutableScatterSet2 = this.watchSet;
                    this.watchSet = this.workingWatchSet;
                    this.workingWatchSet = mutableScatterSet2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // papa.InteractionResult
    public final void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
        synchronized (this.$$delegate_0) {
            this.subscribedChannel = null;
            this.soleWatchedObject = null;
            this.watchSet = null;
        }
    }

    @Override // papa.InteractionResult
    public final Function1 readObserverFor$runtime(SendChannel sendChannel) {
        SendChannel sendChannel2 = this.subscribedChannel;
        if (sendChannel2 != null && !sendChannel2.equals(sendChannel)) {
            PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.subscribedChannel = sendChannel;
        return this.readObserverCache;
    }

    @Override // papa.InteractionResult
    public final void reportSnapshotFlowCancellation$runtime(Channel channel) {
        this.subscribedChannel = null;
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
        commitSubscriptionChanges$runtime();
    }
}
