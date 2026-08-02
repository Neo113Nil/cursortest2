package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ActiveMatchConfigured extends SharedTransitionStateMachine.State {
    public final ParcelableSnapshotMutableState currentBounds$delegate;
    public final ParcelableSnapshotMutableState targetBoundsProvider$delegate;
    public final MetadataRepo targetData;

    public ActiveMatchConfigured(MetadataRepo metadataRepo, SharedBoundsNode sharedBoundsNode, Rect rect) {
        this.targetData = metadataRepo;
        this.targetBoundsProvider$delegate = Updater.mutableStateOf$default(sharedBoundsNode);
        this.currentBounds$delegate = Updater.mutableStateOf$default(rect);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE, reason: not valid java name */
    public final SharedTransitionStateMachine.State mo136configureActiveMatch38uP1EE(SharedElement sharedElement, SharedBoundsNode sharedBoundsNode, long j, long j2, long j3) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.targetBoundsProvider$delegate;
        CrossfadeKt.m145access$updateTargetDataBGTQxF0(this.targetData, j, j2, j3, !Intrinsics.areEqual((SharedBoundsNode) parcelableSnapshotMutableState.getValue(), sharedBoundsNode));
        parcelableSnapshotMutableState.setValue(sharedBoundsNode);
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final boolean getMatchIsOrHasBeenConfigured() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final MetadataRepo getTargetData() {
        return this.targetData;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onMatchFound(SharedBoundsNode sharedBoundsNode) {
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        MetadataRepo metadataRepo = this.targetData;
        DBUtil.m1180Recttz77jQw(Offset.m626plusMKHz9U(((Offset) ((ParcelableSnapshotMutableState) metadataRepo.mTypeface).getValue()).packedValue, ((Offset) ((ParcelableSnapshotMutableState) metadataRepo.mRootNode).getValue()).packedValue), ((Size) ((ParcelableSnapshotMutableState) metadataRepo.mMetadataList).getValue()).packedValue);
        SharedElementEntry sharedElementEntry = ((SharedBoundsNode) this.targetBoundsProvider$delegate.getValue()).sharedElementEntry;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = sharedElementEntry.userState$delegate;
        SharedTransitionDefaults$SharedContentConfig sharedTransitionDefaults$SharedContentConfig = (SharedTransitionDefaults$SharedContentConfig) ((SharedTransitionScope.SharedContentState) parcelableSnapshotMutableState.getValue()).config$delegate.getValue();
        LayoutCoordinates layoutCoordinates = sharedElementEntry.getSharedElement().scope._nullableLookaheadRoot;
        if (layoutCoordinates == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        Countries.m3991toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g());
        sharedTransitionDefaults$SharedContentConfig.getClass();
        return NoMatchFound.INSTANCE;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final void updateBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }
}
