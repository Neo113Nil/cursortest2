package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import java.util.List;

/* loaded from: classes3.dex */
public final class ActiveMatchFoundConfigPending extends SharedTransitionStateMachine.State {
    public final ParcelableSnapshotMutableState currentBounds$delegate;
    public SharedBoundsNode targetBoundsProviderBeforeConfig;

    public ActiveMatchFoundConfigPending(SharedBoundsNode sharedBoundsNode, Rect rect) {
        this.targetBoundsProviderBeforeConfig = sharedBoundsNode;
        this.currentBounds$delegate = Updater.mutableStateOf$default(rect);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE */
    public final SharedTransitionStateMachine.State mo136configureActiveMatch38uP1EE(SharedElement sharedElement, SharedBoundsNode sharedBoundsNode, long j, long j2, long j3) {
        long j4;
        Object obj;
        long m625minusMKHz9U = Offset.m625minusMKHz9U(j2, j3);
        MetadataRepo metadataRepo = new MetadataRepo();
        metadataRepo.mMetadataList = Updater.mutableStateOf$default(new Size(j));
        metadataRepo.mEmojiCharArray = Updater.mutableStateOf$default(new Offset(m625minusMKHz9U));
        metadataRepo.mRootNode = Updater.mutableStateOf$default(new Offset(j3));
        metadataRepo.mTypeface = Updater.mutableStateOf$default(new Offset(m625minusMKHz9U));
        Rect currentBounds = getCurrentBounds();
        if (currentBounds == null) {
            SharedBoundsNode sharedBoundsNode2 = this.targetBoundsProviderBeforeConfig;
            if (sharedBoundsNode2 == null) {
                List list = sharedElement.get_allEntries();
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i);
                    if (sharedElement.get_enabledEntries().contains((SharedElementEntry) obj)) {
                        break;
                    }
                    i++;
                }
                SharedElementEntry sharedElementEntry = (SharedElementEntry) obj;
                sharedBoundsNode2 = sharedElementEntry != null ? sharedElementEntry.boundsProvider : null;
            }
            currentBounds = CrossfadeKt.access$obtainBoundsFromLastTarget(sharedElement, sharedBoundsNode2);
            if (currentBounds == null) {
                j4 = j2;
                currentBounds = DBUtil.m1180Recttz77jQw(j4, j);
                Rect rect = currentBounds;
                CrossfadeKt.m145access$updateTargetDataBGTQxF0(metadataRepo, j, j4, j3, true);
                return new ActiveMatchConfigured(metadataRepo, sharedBoundsNode, rect);
            }
        }
        j4 = j2;
        Rect rect2 = currentBounds;
        CrossfadeKt.m145access$updateTargetDataBGTQxF0(metadataRepo, j, j4, j3, true);
        return new ActiveMatchConfigured(metadataRepo, sharedBoundsNode, rect2);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final boolean getActiveMatchFound() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final MetadataRepo getTargetData() {
        return null;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final Rect initializeCurrentBounds(SharedElement sharedElement) {
        Object obj;
        Rect currentBounds = getCurrentBounds();
        if (currentBounds != null) {
            return currentBounds;
        }
        if (getCurrentBounds() == null) {
            SharedBoundsNode sharedBoundsNode = this.targetBoundsProviderBeforeConfig;
            if (sharedBoundsNode == null) {
                List list = sharedElement.get_allEntries();
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i);
                    if (sharedElement.get_enabledEntries().contains((SharedElementEntry) obj)) {
                        break;
                    }
                    i++;
                }
                SharedElementEntry sharedElementEntry = (SharedElementEntry) obj;
                sharedBoundsNode = sharedElementEntry != null ? sharedElementEntry.boundsProvider : null;
            }
            Rect access$obtainBoundsFromLastTarget = CrossfadeKt.access$obtainBoundsFromLastTarget(sharedElement, sharedBoundsNode);
            if (access$obtainBoundsFromLastTarget != null) {
                this.currentBounds$delegate.setValue(access$obtainBoundsFromLastTarget);
            }
        }
        return getCurrentBounds();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onMatchFound(SharedBoundsNode sharedBoundsNode) {
        if (this.targetBoundsProviderBeforeConfig == null) {
            this.targetBoundsProviderBeforeConfig = sharedBoundsNode;
        }
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return NoMatchFound.INSTANCE;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final void updateBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }
}
