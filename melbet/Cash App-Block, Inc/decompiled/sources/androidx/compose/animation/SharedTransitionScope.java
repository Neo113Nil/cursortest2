package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    public interface OverlayClip {
        AndroidPath getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    /* loaded from: classes3.dex */
    public interface PlaceholderSize {
        public static final RemeasureImpl Companion = RemeasureImpl.$$INSTANCE;

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo151calculateSizeJyjRU_E(long j, long j2);
    }

    /* loaded from: classes3.dex */
    public interface ResizeMode {
        public static final RemeasureImpl Companion = RemeasureImpl.$$INSTANCE$1;
    }

    /* loaded from: classes3.dex */
    public final class SharedContentState {
        public final ParcelableSnapshotMutableState config$delegate = Updater.mutableStateOf$default(SharedTransitionDefaults$SharedContentConfig.INSTANCE);
        public final ParcelableSnapshotMutableState internalState$delegate = Updater.mutableStateOf$default(null);
        public final Object key;

        public SharedContentState(Object obj) {
            this.key = obj;
        }

        public final AndroidPath getClipPathInOverlay() {
            SharedElementEntry sharedElementEntry = (SharedElementEntry) this.internalState$delegate.getValue();
            if (sharedElementEntry != null) {
                return sharedElementEntry.clipPathInOverlay;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            return null;
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementEntry sharedElementEntry = (SharedElementEntry) this.internalState$delegate.getValue();
            if (sharedElementEntry == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return null;
            }
            SharedElementEntry sharedElementEntry2 = sharedElementEntry.parentState;
            if (sharedElementEntry2 != null) {
                return (SharedContentState) sharedElementEntry2.userState$delegate.getValue();
            }
            return null;
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementEntry sharedElementEntry = (SharedElementEntry) this.internalState$delegate.getValue();
            if (sharedElementEntry == null || (sharedElement = sharedElementEntry.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        public final void setConfig$animation() {
            this.config$delegate.setValue(SharedTransitionDefaults$SharedContentConfig.INSTANCE);
        }
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, BoundsTransform boundsTransform, ResizeMode resizeMode, OverlayClip overlayClip, int i) {
        ResizeMode resizeMode2;
        SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 sharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 = SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1.INSTANCE$1;
        EnterTransitionImpl fadeIn$default = (i & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 3) : enterTransitionImpl;
        ExitTransitionImpl fadeOut$default = (i & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 3) : exitTransitionImpl;
        BoundsTransform boundsTransform2 = (i & 16) != 0 ? CrossfadeKt.BoundsTransform : boundsTransform;
        if ((i & 32) != 0) {
            ResizeMode.Companion.getClass();
            resizeMode2 = RemeasureImpl.scaleToBounds(ContentScale.Companion.FillWidth);
        } else {
            resizeMode2 = resizeMode;
        }
        if ((i & 64) != 0) {
            PlaceholderSize.Companion.getClass();
            sharedTransitionScope$PlaceholderSize$Companion$ContentSize$1 = SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1.INSTANCE;
        }
        return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, fadeIn$default, fadeOut$default, boundsTransform2, resizeMode2, sharedTransitionScope$PlaceholderSize$Companion$ContentSize$1, (i & 512) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, OverlayClip overlayClip, int i) {
        if ((i & 4) != 0) {
            boundsTransform = CrossfadeKt.BoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        PlaceholderSize.Companion.getClass();
        if ((i & 64) != 0) {
            overlayClip = SharedTransitionScopeKt.ParentClip;
        }
        return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform2, overlayClip);
    }

    OverlayClip OverlayClip(Shape shape);

    boolean isTransitionActive();

    default SharedContentState rememberSharedContentState(Object obj, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(800730162);
        SharedContentState rememberSharedContentState$1 = rememberSharedContentState$1(obj, gapComposer, ((i << 3) & 896) | (i & 14) | 48);
        gapComposer.end(false);
        return rememberSharedContentState$1;
    }

    default SharedContentState rememberSharedContentState$1(Object obj, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-148945892);
        boolean changed = gapComposer.changed(obj);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SharedContentState(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SharedContentState sharedContentState = (SharedContentState) rememberedValue;
        sharedContentState.setConfig$animation();
        gapComposer.end(false);
        return sharedContentState;
    }

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, OverlayClip overlayClip);

    Modifier skipToLookaheadSize(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1);
}
