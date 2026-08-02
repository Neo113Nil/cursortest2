package androidx.compose.animation;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SharedElement {
    public final ParcelableSnapshotMutableState _allEntries$delegate;
    public final ParcelableSnapshotMutableState _enabledEntries$delegate;
    public boolean animationSpecFinalized;
    public final Object key;
    public final Animatable momentumAnimation;
    public final SharedElement$momentumAnimationOffset$1 momentumAnimationOffset;
    public final SharedElement$momentumAnimationOffset$1 observingVisibilityChange;
    public final SharedTransitionScopeImpl scope;
    public final SharedTransitionStateMachine stateMachine = new SharedTransitionStateMachine(this);

    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.animation.SharedElement$momentumAnimationOffset$1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.animation.SharedElement$momentumAnimationOffset$1] */
    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
        EmptyList emptyList = EmptyList.INSTANCE;
        this._allEntries$delegate = Updater.mutableStateOf$default(emptyList);
        this._enabledEntries$delegate = Updater.mutableStateOf$default(emptyList);
        this.momentumAnimation = new Animatable(new Offset(0L), AnimatableKt.OffsetToVector, (Object) null, 12);
        final int i = 0;
        this.momentumAnimationOffset = new Function0(this) { // from class: androidx.compose.animation.SharedElement$momentumAnimationOffset$1
            public final /* synthetic */ SharedElement this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Continuation continuation;
                Object obj2;
                int i2 = i;
                int i3 = 0;
                SharedElement sharedElement = this.this$0;
                switch (i2) {
                    case 0:
                        boolean z = sharedElement.animationSpecFinalized;
                        Animatable animatable = sharedElement.momentumAnimation;
                        SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedElement.scope;
                        if (!z && sharedTransitionScopeImpl2.isTransitionActive() && animatable.isRunning()) {
                            List list = sharedElement.get_enabledEntries();
                            int size = list.size();
                            while (true) {
                                continuation = null;
                                if (i3 < size) {
                                    obj2 = list.get(i3);
                                    if (!((SharedElementEntry) obj2).getBoundsAnimation().getTarget()) {
                                        i3++;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            SharedElementEntry sharedElementEntry = (SharedElementEntry) obj2;
                            if (sharedElementEntry != null) {
                                FiniteAnimationSpec finiteAnimationSpec = sharedElementEntry.getBoundsAnimation().animationSpec;
                                if (finiteAnimationSpec instanceof SpringSpec) {
                                    SpringSpec springSpec = (SpringSpec) finiteAnimationSpec;
                                    JobKt.launch$default(sharedTransitionScopeImpl2.coroutineScope, null, null, new VirtualCameraState$connect$2$1(sharedElement, new SpringSpec(springSpec.dampingRatio, springSpec.stiffness, new Offset((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax))), continuation, 14), 3);
                                }
                                sharedElement.animationSpecFinalized = true;
                            }
                        }
                        return new Offset(((Offset) animatable.getValue()).packedValue);
                    default:
                        List list2 = sharedElement.get_allEntries();
                        int size2 = list2.size();
                        while (i3 < size2) {
                            SharedElementEntry sharedElementEntry2 = (SharedElementEntry) list2.get(i3);
                            if (sharedElementEntry2.getBoundsAnimation().getTarget() && sharedElementEntry2.isEnabled()) {
                                return Unit.INSTANCE;
                            }
                            i3++;
                        }
                        return Unit.INSTANCE;
                }
            }
        };
        final int i2 = 1;
        this.observingVisibilityChange = new Function0(this) { // from class: androidx.compose.animation.SharedElement$momentumAnimationOffset$1
            public final /* synthetic */ SharedElement this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Continuation continuation;
                Object obj2;
                int i22 = i2;
                int i3 = 0;
                SharedElement sharedElement = this.this$0;
                switch (i22) {
                    case 0:
                        boolean z = sharedElement.animationSpecFinalized;
                        Animatable animatable = sharedElement.momentumAnimation;
                        SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedElement.scope;
                        if (!z && sharedTransitionScopeImpl2.isTransitionActive() && animatable.isRunning()) {
                            List list = sharedElement.get_enabledEntries();
                            int size = list.size();
                            while (true) {
                                continuation = null;
                                if (i3 < size) {
                                    obj2 = list.get(i3);
                                    if (!((SharedElementEntry) obj2).getBoundsAnimation().getTarget()) {
                                        i3++;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            SharedElementEntry sharedElementEntry = (SharedElementEntry) obj2;
                            if (sharedElementEntry != null) {
                                FiniteAnimationSpec finiteAnimationSpec = sharedElementEntry.getBoundsAnimation().animationSpec;
                                if (finiteAnimationSpec instanceof SpringSpec) {
                                    SpringSpec springSpec = (SpringSpec) finiteAnimationSpec;
                                    JobKt.launch$default(sharedTransitionScopeImpl2.coroutineScope, null, null, new VirtualCameraState$connect$2$1(sharedElement, new SpringSpec(springSpec.dampingRatio, springSpec.stiffness, new Offset((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax))), continuation, 14), 3);
                                }
                                sharedElement.animationSpecFinalized = true;
                            }
                        }
                        return new Offset(((Offset) animatable.getValue()).packedValue);
                    default:
                        List list2 = sharedElement.get_allEntries();
                        int size2 = list2.size();
                        while (i3 < size2) {
                            SharedElementEntry sharedElementEntry2 = (SharedElementEntry) list2.get(i3);
                            if (sharedElementEntry2.getBoundsAnimation().getTarget() && sharedElementEntry2.isEnabled()) {
                                return Unit.INSTANCE;
                            }
                            i3++;
                        }
                        return Unit.INSTANCE;
                }
            }
        };
    }

    public final boolean getFoundMatch() {
        SharedTransitionStateMachine sharedTransitionStateMachine = this.stateMachine;
        return sharedTransitionStateMachine.getState().getActiveMatchFound() || sharedTransitionStateMachine.getState().getMatchIsOrHasBeenConfigured() || sharedTransitionStateMachine.requestToBeHandled == StateChangeRequest.MatchFound;
    }

    public final List get_allEntries() {
        return (List) this._allEntries$delegate.getValue();
    }

    public final List get_enabledEntries() {
        return (List) this._enabledEntries$delegate.getValue();
    }

    public final boolean isAnimating() {
        List list = get_enabledEntries();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Transition transition = ((SharedElementEntry) list.get(i)).getBoundsAnimation().transition;
            while (true) {
                Transition transition2 = transition.parentTransition;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            if (!Intrinsics.areEqual(transition.transitionState.getCurrentState(), transition.targetState$delegate.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void onSharedTransitionFinished() {
        if (get_enabledEntries().size() > 1) {
            List list = get_enabledEntries();
            int i = SharedElementKt.$r8$clinit;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((SharedElementEntry) list.get(i2)).getBoundsAnimation().getTarget()) {
                    return;
                }
            }
        }
        SharedTransitionStateMachine sharedTransitionStateMachine = this.stateMachine;
        sharedTransitionStateMachine.getClass();
        sharedTransitionStateMachine.requestToBeHandled = StateChangeRequest.NoRequest;
        sharedTransitionStateMachine.lastHandledRequestId = sharedTransitionStateMachine.requestId$delegate.getIntValue();
        sharedTransitionStateMachine.state$delegate.setValue(NoMatchFound.INSTANCE);
    }

    public final void updateMatch$animation() {
        List list = get_allEntries();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            SharedElementEntry sharedElementEntry = (SharedElementEntry) list.get(i);
            if (sharedElementEntry.isEnabled()) {
                arrayList.add(sharedElementEntry);
                if (sharedElementEntry.getBoundsAnimation().getTarget()) {
                    z = true;
                }
            }
        }
        this._enabledEntries$delegate.setValue(arrayList);
        SharedTransitionStateMachine sharedTransitionStateMachine = this.stateMachine;
        SharedElement sharedElement = sharedTransitionStateMachine.sharedElement;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = sharedTransitionStateMachine.requestId$delegate;
        if (sharedElement.get_enabledEntries().size() > 1 && z) {
            sharedTransitionStateMachine.requestToBeHandled = StateChangeRequest.MatchFound;
            parcelableSnapshotMutableIntState.setIntValue(sharedTransitionStateMachine.lastHandledRequestId + 1);
        } else if (!sharedElement.scope.isTransitionActive()) {
            sharedTransitionStateMachine.requestToBeHandled = StateChangeRequest.NoRequest;
            sharedTransitionStateMachine.lastHandledRequestId = parcelableSnapshotMutableIntState.getIntValue();
            sharedTransitionStateMachine.state$delegate.setValue(NoMatchFound.INSTANCE);
        } else if (!z) {
            sharedTransitionStateMachine.requestToBeHandled = StateChangeRequest.VisibleContentAbsentDuringTransition;
            parcelableSnapshotMutableIntState.setIntValue(sharedTransitionStateMachine.lastHandledRequestId + 1);
        }
        sharedTransitionStateMachine.invalidateTargetBoundsProvider();
    }
}
