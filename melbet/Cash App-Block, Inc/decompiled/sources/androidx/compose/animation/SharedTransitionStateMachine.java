package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.emoji2.text.MetadataRepo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SharedTransitionStateMachine {
    public int lastHandledRequestId;
    public int lastHandledTargetProviderUpdateRequestId;
    public final SharedElement sharedElement;
    public SharedBoundsNode targetBoundsProvider;
    public final ParcelableSnapshotMutableState state$delegate = Updater.mutableStateOf$default(NoMatchFound.INSTANCE);
    public final ParcelableSnapshotMutableIntState requestId$delegate = new ParcelableSnapshotMutableIntState(0);
    public StateChangeRequest requestToBeHandled = StateChangeRequest.NoRequest;
    public final ParcelableSnapshotMutableIntState targetBoundsProviderUpdateRequestId$delegate = new ParcelableSnapshotMutableIntState(0);

    public abstract class State {
        /* renamed from: configureActiveMatch-38uP1EE */
        public State mo136configureActiveMatch38uP1EE(SharedElement sharedElement, SharedBoundsNode sharedBoundsNode, long j, long j2, long j3) {
            throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
        }

        public boolean getActiveMatchFound() {
            return this instanceof ActiveMatchConfigured;
        }

        public Rect getCurrentBounds() {
            return null;
        }

        public boolean getMatchIsOrHasBeenConfigured() {
            return false;
        }

        public MetadataRepo getTargetData() {
            return null;
        }

        public Rect initializeCurrentBounds(SharedElement sharedElement) {
            return getCurrentBounds();
        }

        public abstract State onMatchFound(SharedBoundsNode sharedBoundsNode);

        public abstract State onVisibleContentRemovedDuringTransition();

        public void updateBounds(Rect rect) {
        }
    }

    public SharedTransitionStateMachine(SharedElement sharedElement) {
        this.sharedElement = sharedElement;
    }

    public final State getState() {
        return (State) this.state$delegate.getValue();
    }

    public final void invalidateTargetBoundsProvider() {
        Object obj;
        List list = this.sharedElement.get_enabledEntries();
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((SharedElementEntry) obj).getBoundsAnimation().getTarget()) {
                break;
            } else {
                i++;
            }
        }
        SharedElementEntry sharedElementEntry = (SharedElementEntry) obj;
        if (sharedElementEntry == null && this.targetBoundsProvider == null) {
            return;
        }
        if (Intrinsics.areEqual(sharedElementEntry != null ? sharedElementEntry.boundsProvider : null, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProviderUpdateRequestId$delegate.setIntValue(this.lastHandledTargetProviderUpdateRequestId + 1);
    }

    public final void processPendingRequest() {
        Object obj;
        Object obj2;
        State state;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.requestId$delegate;
        int intValue = parcelableSnapshotMutableIntState.getIntValue();
        int i = this.lastHandledRequestId;
        int i2 = 0;
        SharedElement sharedElement = this.sharedElement;
        if (intValue != i) {
            this.lastHandledRequestId = parcelableSnapshotMutableIntState.getIntValue();
            int ordinal = this.requestToBeHandled.ordinal();
            if (ordinal == 0) {
                state = getState();
            } else if (ordinal != 1) {
                state = NoMatchFound.INSTANCE;
                if (ordinal == 2) {
                    List list = sharedElement.get_enabledEntries();
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            state = getState().onVisibleContentRemovedDuringTransition();
                            break;
                        } else if (Intrinsics.areEqual(((SharedElementEntry) list.get(i3)).boundsProvider, this.targetBoundsProvider)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            } else {
                state = getState().onMatchFound(this.targetBoundsProvider);
            }
            this.state$delegate.setValue(state);
            this.requestToBeHandled = StateChangeRequest.NoRequest;
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.targetBoundsProviderUpdateRequestId$delegate;
        if (parcelableSnapshotMutableIntState2.getIntValue() != this.lastHandledTargetProviderUpdateRequestId) {
            SharedBoundsNode sharedBoundsNode = null;
            if (sharedElement.scope.isTransitionActive()) {
                List list2 = sharedElement.get_enabledEntries();
                int size2 = list2.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i2);
                    if (((SharedElementEntry) obj2).getBoundsAnimation().getTarget()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                SharedElementEntry sharedElementEntry = (SharedElementEntry) obj2;
                if (sharedElementEntry != null) {
                    sharedBoundsNode = sharedElementEntry.boundsProvider;
                }
            } else {
                List list3 = sharedElement.get_allEntries();
                int size3 = list3.size();
                while (true) {
                    if (i2 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i2);
                    if (((SharedElementEntry) obj).getBoundsAnimation().getTarget()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                SharedElementEntry sharedElementEntry2 = (SharedElementEntry) obj;
                if (sharedElementEntry2 != null) {
                    sharedBoundsNode = sharedElementEntry2.boundsProvider;
                }
            }
            if (!Intrinsics.areEqual(sharedBoundsNode, this.targetBoundsProvider)) {
                this.targetBoundsProvider = sharedBoundsNode;
            }
            this.lastHandledTargetProviderUpdateRequestId = parcelableSnapshotMutableIntState2.getIntValue();
        }
    }
}
