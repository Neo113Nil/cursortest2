package com.squareup.cash.moneybot.widgets;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScope$skipToLookaheadSize$1;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes6.dex */
public final class ComposerSharedTransitionScope implements SharedTransitionScope, AnimatedVisibilityScope {
    public final /* synthetic */ SharedTransitionScope $$delegate_0;
    public final /* synthetic */ AnimatedVisibilityScope $$delegate_1;

    public ComposerSharedTransitionScope(AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope) {
        this.$$delegate_0 = sharedTransitionScope;
        this.$$delegate_1 = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return this.$$delegate_0.OverlayClip(shape);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Modifier animateEnterExit(Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl) {
        modifier.getClass();
        enterTransitionImpl.getClass();
        exitTransitionImpl.getClass();
        return this.$$delegate_1.animateEnterExit(modifier, enterTransitionImpl, exitTransitionImpl);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Transition getTransition() {
        return this.$$delegate_1.getTransition();
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final boolean isTransitionActive() {
        return this.$$delegate_0.isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc */
    public final long mo152localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return this.$$delegate_0.mo152localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, Composer composer, int i) {
        obj.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-257568405);
        SharedTransitionScope.SharedContentState rememberSharedContentState = this.$$delegate_0.rememberSharedContentState(obj, gapComposer, i & 14);
        gapComposer.end(false);
        return rememberSharedContentState;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final SharedTransitionScope.SharedContentState rememberSharedContentState$1(Object obj, Composer composer, int i) {
        obj.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1107314367);
        SharedTransitionScope.SharedContentState rememberSharedContentState$1 = this.$$delegate_0.rememberSharedContentState$1(obj, gapComposer, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        gapComposer.end(false);
        return rememberSharedContentState$1;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        modifier.getClass();
        return this.$$delegate_0.renderInSharedTransitionScopeOverlay(modifier, sharedTransitionScope$skipToLookaheadSize$1);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier sharedBounds(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, BoundsTransform boundsTransform, SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceholderSize placeholderSize, SharedTransitionScope.OverlayClip overlayClip) {
        modifier.getClass();
        sharedContentState.getClass();
        animatedVisibilityScope.getClass();
        enterTransitionImpl.getClass();
        exitTransitionImpl.getClass();
        boundsTransform.getClass();
        resizeMode.getClass();
        placeholderSize.getClass();
        overlayClip.getClass();
        return this.$$delegate_0.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, enterTransitionImpl, exitTransitionImpl, boundsTransform, resizeMode, placeholderSize, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.OverlayClip overlayClip) {
        modifier.getClass();
        sharedContentState.getClass();
        animatedVisibilityScope.getClass();
        boundsTransform.getClass();
        overlayClip.getClass();
        return this.$$delegate_0.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier skipToLookaheadSize(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        modifier.getClass();
        return this.$$delegate_0.skipToLookaheadSize(modifier, sharedTransitionScope$skipToLookaheadSize$1);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }
}
