package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends Lambda implements Function3 {
    public final /* synthetic */ BoundsTransform $boundsTransform;
    public final /* synthetic */ SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition;
    public final /* synthetic */ Transition $parentTransition;
    public final /* synthetic */ SharedTransitionScope.PlaceholderSize $placeholderSize;
    public final /* synthetic */ boolean $renderOnlyWhenVisible;
    public final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;
    public final /* synthetic */ Function1 $visible;
    public final /* synthetic */ SharedTransitionScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBoundsImpl$1(SharedTransitionScope.SharedContentState sharedContentState, Transition transition, Function1 function1, SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, BoundsTransform boundsTransform) {
        super(3);
        this.$sharedContentState = sharedContentState;
        this.$parentTransition = transition;
        this.$visible = function1;
        this.this$0 = sharedTransitionScopeImpl;
        this.$placeholderSize = placeholderSize;
        this.$renderOnlyWhenVisible = z;
        this.$clipInOverlayDuringTransition = overlayClip;
        this.$boundsTransform = boundsTransform;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Transition rememberTransition;
        Transition.DeferredAnimation deferredAnimation;
        boolean z;
        boolean z2;
        SharedTransitionScope.OverlayClip overlayClip;
        SharedTransitionScope.PlaceholderSize placeholderSize;
        SharedTransitionScope.SharedContentState sharedContentState;
        Modifier modifier = (Modifier) obj;
        ((Number) obj3).intValue();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        gapComposer.startReplaceGroup(-1539505585);
        Object obj4 = this.$sharedContentState.key;
        gapComposer.startMovableGroup(-1996110647, obj4);
        Object rememberedValue = gapComposer.rememberedValue();
        SharedTransitionScopeImpl sharedTransitionScopeImpl = this.this$0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            SnapshotStateMap snapshotStateMap = sharedTransitionScopeImpl.sharedElements;
            SharedElement sharedElement = (SharedElement) snapshotStateMap.get(obj4);
            if (sharedElement == null) {
                sharedElement = new SharedElement(obj4, sharedTransitionScopeImpl);
                snapshotStateMap.put(obj4, sharedElement);
            }
            rememberedValue = sharedElement;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SharedElement sharedElement2 = (SharedElement) rememberedValue;
        Transition transition = this.$parentTransition;
        gapComposer.startMovableGroup(-1996106866, transition);
        Function1 function1 = this.$visible;
        if (transition != null) {
            InteractionResult interactionResult = transition.transitionState;
            gapComposer.startReplaceGroup(-1749734647);
            String obj5 = obj4.toString();
            boolean changed = gapComposer.changed(transition);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = interactionResult.getCurrentState();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            if (transition.isSeeking()) {
                rememberedValue2 = interactionResult.getCurrentState();
            }
            gapComposer.startReplaceGroup(1498260051);
            Boolean bool = (Boolean) function1.invoke(rememberedValue2);
            bool.getClass();
            gapComposer.end(false);
            Object value = transition.targetState$delegate.getValue();
            gapComposer.startReplaceGroup(1498260051);
            Boolean bool2 = (Boolean) function1.invoke(value);
            bool2.getClass();
            gapComposer.end(false);
            rememberTransition = AnimatableKt.createChildTransitionInternal(transition, bool, bool2, obj5, gapComposer, 0);
            gapComposer = gapComposer;
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1749482679);
            boolean z3 = true;
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
            Boolean bool3 = (Boolean) function1.invoke(Unit.INSTANCE);
            boolean booleanValue = bool3.booleanValue();
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                if (sharedElement2.get_enabledEntries().isEmpty()) {
                    z3 = booleanValue;
                } else if (booleanValue) {
                    z3 = false;
                }
                rememberedValue3 = new MutableTransitionState(Boolean.valueOf(z3));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue3;
            mutableTransitionState.setTargetState(bool3);
            rememberTransition = AnimatableKt.rememberTransition(mutableTransitionState, null, gapComposer, 0, 2);
            gapComposer.end(false);
        }
        Transition transition2 = rememberTransition;
        gapComposer.startMovableGroup(-1996043323, Boolean.valueOf(sharedTransitionScopeImpl.isTransitionActive()));
        Transition.DeferredAnimation createDeferredAnimation = AnimatableKt.createDeferredAnimation(transition2, AnimatableKt.RectToVector, null, gapComposer, 0, 2);
        gapComposer.end(false);
        boolean changed2 = gapComposer.changed(transition2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            deferredAnimation = createDeferredAnimation;
            z = false;
            BoundsAnimation boundsAnimation = new BoundsAnimation(sharedTransitionScopeImpl, transition2, deferredAnimation, this.$boundsTransform, sharedElement2.momentumAnimationOffset);
            gapComposer.updateRememberedValue(boundsAnimation);
            rememberedValue4 = boundsAnimation;
        } else {
            deferredAnimation = createDeferredAnimation;
            z = false;
        }
        BoundsAnimation boundsAnimation2 = (BoundsAnimation) rememberedValue4;
        if (!Intrinsics.areEqual((Transition.DeferredAnimation) boundsAnimation2.animation$delegate.getValue(), deferredAnimation)) {
            boundsAnimation2.animation$delegate.setValue(deferredAnimation);
            boundsAnimation2.animationState$delegate.setValue(null);
            boundsAnimation2.animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        }
        boundsAnimation2.boundsTransform$delegate.setValue(this.$boundsTransform);
        gapComposer.end(z);
        Object rememberedValue5 = gapComposer.rememberedValue();
        SharedTransitionScope.PlaceholderSize placeholderSize2 = this.$placeholderSize;
        boolean z4 = this.$renderOnlyWhenVisible;
        SharedTransitionScope.SharedContentState sharedContentState2 = this.$sharedContentState;
        SharedTransitionScope.OverlayClip overlayClip2 = this.$clipInOverlayDuringTransition;
        if (rememberedValue5 == neverEqualPolicy) {
            z2 = z4;
            SharedElementEntry sharedElementEntry = new SharedElementEntry(sharedElement2, boundsAnimation2, placeholderSize2, z2, overlayClip2, sharedContentState2);
            placeholderSize = placeholderSize2;
            overlayClip = overlayClip2;
            sharedContentState = sharedContentState2;
            gapComposer.updateRememberedValue(sharedElementEntry);
            rememberedValue5 = sharedElementEntry;
        } else {
            z2 = z4;
            overlayClip = overlayClip2;
            placeholderSize = placeholderSize2;
            sharedContentState = sharedContentState2;
        }
        SharedElementEntry sharedElementEntry2 = (SharedElementEntry) rememberedValue5;
        sharedContentState.internalState$delegate.setValue(sharedElementEntry2);
        sharedElementEntry2.sharedElement$delegate.setValue(sharedElement2);
        sharedElementEntry2.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z2));
        sharedElementEntry2.boundsAnimation$delegate.setValue(boundsAnimation2);
        sharedElementEntry2.placeholderSize$delegate.setValue(placeholderSize);
        sharedElementEntry2.overlayClip$delegate.setValue(overlayClip);
        sharedElementEntry2.zIndex$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
        sharedElementEntry2.renderInOverlayDuringTransition$delegate.setValue(Boolean.TRUE);
        sharedElementEntry2.userState$delegate.setValue(sharedContentState);
        gapComposer.end(z);
        Modifier then = modifier.then(new SharedBoundsNodeElement(sharedElementEntry2));
        gapComposer.end(z);
        return then;
    }
}
