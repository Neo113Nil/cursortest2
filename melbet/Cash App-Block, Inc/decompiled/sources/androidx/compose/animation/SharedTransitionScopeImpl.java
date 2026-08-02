package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import app.cash.molecule.PlatformKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public final /* synthetic */ LookaheadScope $$delegate_0;
    public LayoutCoordinates _nullableLookaheadRoot;
    public final CoroutineScope coroutineScope;
    public SharedTransitionScopeRootModifierNode$onAttach$1 invalidateOverlay;
    public LayoutCoordinates nullableRoot;
    public final ParcelableSnapshotMutableState isTransitionActive$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final SharedTransitionScopeRootModifierNode$onAttach$1 observeAnimatingBlock = new SharedTransitionScopeRootModifierNode$onAttach$1(this, 2);
    public final SnapshotStateList renderers = new SnapshotStateList();
    public final SnapshotStateMap sharedElements = new SnapshotStateMap();

    /* loaded from: classes3.dex */
    public final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        public final Shape clipShape;
        public final AndroidPath path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public final AndroidPath getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            AndroidPath androidPath = this.path;
            androidPath.reset();
            ColorKt.addOutline(androidPath, this.clipShape.mo175createOutlinePq9zytI(rect.m634getSizeNHjbRc(), layoutDirection, density));
            androidPath.m667translatek4lQ0M(rect.m636getTopLeftF1C5BW0());
            return androidPath;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.$$delegate_0 = lookaheadScope;
        this.coroutineScope = coroutineScope;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return new ShapeBasedClip(shape);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public final long mo152localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return this.$$delegate_0.mo152localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, sharedTransitionScope$skipToLookaheadSize$1));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier sharedBounds(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final AnimatedVisibilityScope animatedVisibilityScope, final EnterTransitionImpl enterTransitionImpl, final ExitTransitionImpl exitTransitionImpl, BoundsTransform boundsTransform, final SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceholderSize placeholderSize, SharedTransitionScope.OverlayClip overlayClip) {
        return PlatformKt.composed(PlatformKt.composed(modifier, new SharedTransitionScopeImpl$sharedBoundsImpl$1(sharedContentState, animatedVisibilityScope.getTransition(), CrossfadeKt$Crossfade$3$1.INSTANCE$17, this, placeholderSize, false, overlayClip, boundsTransform)), new Function3() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-233734437);
                Transition transition = AnimatedVisibilityScope.this.getTransition();
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                boolean changedInstance = gapComposer.changedInstance(sharedContentState2);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj4 = Composer.Companion.Empty;
                final int i = 0;
                if (changedInstance || rememberedValue == obj4) {
                    rememberedValue = new Function0() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i2 = i;
                            SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState2;
                            switch (i2) {
                            }
                            return Boolean.valueOf(sharedContentState3.isMatchFound());
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier createModifier = EnterExitTransitionKt.createModifier(transition, enterTransitionImpl, exitTransitionImpl, (Function0) rememberedValue, "enter/exit for " + sharedContentState2.key, gapComposer, 0, 4);
                SharedTransitionScope.ResizeMode resizeMode2 = resizeMode;
                boolean z = resizeMode2 instanceof ScaleToBoundsImpl;
                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                if (z) {
                    gapComposer.startReplaceGroup(-1039792755);
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode2;
                    boolean changedInstance2 = gapComposer.changedInstance(sharedContentState2);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == obj4) {
                        final int i2 = 1;
                        rememberedValue2 = new Function0() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i22 = i2;
                                SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState2;
                                switch (i22) {
                                }
                                return Boolean.valueOf(sharedContentState3.isMatchFound());
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    if (scaleToBoundsImpl.contentScale.equals(ContentScale.Companion.Crop)) {
                        modifier2 = ColorKt.graphicsLayer(modifier2, new BoundsAnimation$animate$1(function0, 4));
                    }
                    modifier2 = modifier2.then(new SkipToLookaheadSizeElement(scaleToBoundsImpl, function0));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1039175545);
                    gapComposer.end(false);
                }
                Modifier then = createModifier.then(modifier2);
                gapComposer.end(false);
                return then;
            }
        });
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.OverlayClip overlayClip) {
        return PlatformKt.composed(modifier, new SharedTransitionScopeImpl$sharedBoundsImpl$1(sharedContentState, animatedVisibilityScope.getTransition(), CrossfadeKt$Crossfade$3$1.INSTANCE$18, this, SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1.INSTANCE, true, overlayClip, boundsTransform));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final Modifier skipToLookaheadSize(Modifier modifier, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        return modifier.then(new SkipToLookaheadSizeElement(sharedTransitionScope$skipToLookaheadSize$1));
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }

    public final void updateTransitionActiveness$animation() {
        Collection<SharedElement> values = this.sharedElements.getReadable$runtime().map.values();
        boolean z = false;
        for (SharedElement sharedElement : values) {
            z = z || (sharedElement.getFoundMatch() && sharedElement.isAnimating());
            sharedElement.updateMatch$animation();
        }
        if (z != isTransitionActive()) {
            this.isTransitionActive$delegate.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ((SharedElement) it.next()).onSharedTransitionFinished();
            }
        }
    }
}
