package com.squareup.cash.sheet;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.collapsingtoolbar.views.ExitUntilCollapsedNestedScrollConnection$onPostFling$1;
import com.squareup.cash.collapsingtoolbar.views.ExitUntilCollapsedNestedScrollConnection$onPreFling$1;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSheetState {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState collapsedContentEnabled$delegate;
    public final DerivedSnapshotState collapsedContentProgress$delegate;
    public final ParcelableSnapshotMutableState collapsedHeightPx$delegate;
    public final ParcelableSnapshotMutableState contentHeightPx$delegate;
    public final ParcelableSnapshotMutableState contentPositionInWindow$delegate;
    public Density density;
    public final boolean disallowPeekingAfterExpanding;
    public final ParcelableSnapshotMutableState dismissedWhenDraggingDisabled$delegate;
    public final AnchoredDraggableState draggableState;
    public SpringSpec enterAnimationSpec;
    public SpringSpec exitAnimationSpec;
    public final DerivedSnapshotState expandProgress$delegate;
    public final DerivedSnapshotState expandedContentProgress$delegate;
    public final ParcelableSnapshotMutableState imeHeightPx$delegate;
    public final DerivedSnapshotState isReadyToBeDisplayed$delegate;
    public final SheetNestedScrollConnection nestedScrollConnection;
    public final DerivedSnapshotState peekHeightPx$delegate;
    public final ParcelableSnapshotMutableState peekPosition$delegate;
    public Function1 settleWithVelocity;
    public final ParcelableSnapshotMutableState userDismissMode$delegate;
    public final ParcelableSnapshotMutableState viewportHeightPx$delegate;

    /* loaded from: classes7.dex */
    public final class Companion {
        public static WorkLauncherImpl saver$default(UserDismissMode userDismissMode, int i) {
            if ((i & 1) != 0) {
                userDismissMode = UserDismissMode.All;
            }
            userDismissMode.getClass();
            int i2 = 8;
            return new WorkLauncherImpl(i2, new ShareSheetPresenter$$ExternalSyntheticLambda0(14), new SliderKt$$ExternalSyntheticLambda5((Object) userDismissMode, false, i2));
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetPosition.values().length];
            try {
                SheetPosition sheetPosition = SheetPosition.Expanded;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SheetPosition sheetPosition2 = SheetPosition.Expanded;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SheetPosition sheetPosition3 = SheetPosition.Expanded;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SheetPosition sheetPosition4 = SheetPosition.Expanded;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Companion.saver$default(null, 3);
    }

    public RealSheetState(SheetPosition sheetPosition, UserDismissMode userDismissMode, boolean z) {
        userDismissMode.getClass();
        this.disallowPeekingAfterExpanding = z;
        this.userDismissMode$delegate = Updater.mutableStateOf$default(userDismissMode);
        sheetPosition = sheetPosition == null ? SheetPosition.Peeking : sheetPosition;
        int i = 0;
        RealSheetState$$ExternalSyntheticLambda0 realSheetState$$ExternalSyntheticLambda0 = new RealSheetState$$ExternalSyntheticLambda0(i);
        RealSheetState$$ExternalSyntheticLambda1 realSheetState$$ExternalSyntheticLambda1 = new RealSheetState$$ExternalSyntheticLambda1(this, i);
        RealSheetStateKt$lazyAnimationSpec$1 realSheetStateKt$lazyAnimationSpec$1 = new RealSheetStateKt$lazyAnimationSpec$1(i, new RealSheetState$$ExternalSyntheticLambda1(this, 10));
        DecayAnimationSpecImpl exponentialDecay$default = AnimatableKt.exponentialDecay$default();
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(new BorderKt$$ExternalSyntheticLambda1(18), sheetPosition);
        anchoredDraggableState.positionalThreshold = realSheetState$$ExternalSyntheticLambda0;
        anchoredDraggableState.velocityThreshold = realSheetState$$ExternalSyntheticLambda1;
        anchoredDraggableState.snapAnimationSpec = realSheetStateKt$lazyAnimationSpec$1;
        anchoredDraggableState.decayAnimationSpec = exponentialDecay$default;
        this.draggableState = anchoredDraggableState;
        this.contentHeightPx$delegate = Updater.mutableStateOf$default(null);
        this.viewportHeightPx$delegate = Updater.mutableStateOf$default(null);
        this.contentPositionInWindow$delegate = Updater.mutableStateOf$default(null);
        this.peekPosition$delegate = Updater.mutableStateOf$default(null);
        Boolean bool = Boolean.FALSE;
        this.collapsedContentEnabled$delegate = Updater.mutableStateOf$default(bool);
        this.collapsedHeightPx$delegate = Updater.mutableStateOf$default(null);
        this.imeHeightPx$delegate = Updater.mutableStateOf$default(0);
        this.dismissedWhenDraggingDisabled$delegate = Updater.mutableStateOf$default(bool);
        this.peekHeightPx$delegate = Updater.derivedStateOf(new RealSheetState$$ExternalSyntheticLambda1(this, 11));
        this.isReadyToBeDisplayed$delegate = Updater.derivedStateOf(new RealSheetState$$ExternalSyntheticLambda1(this, 12));
        this.expandProgress$delegate = Updater.derivedStateOf(new RealSheetState$$ExternalSyntheticLambda1(this, 13));
        this.expandedContentProgress$delegate = Updater.derivedStateOf(new RealSheetState$$ExternalSyntheticLambda1(this, 14));
        this.collapsedContentProgress$delegate = Updater.derivedStateOf(new RealSheetState$$ExternalSyntheticLambda1(this, 15));
        this.nestedScrollConnection = new SheetNestedScrollConnection(anchoredDraggableState, new PinnedKt$$ExternalSyntheticLambda0(this, 7), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$awaitDismissalDragEnabled(RealSheetState realSheetState, ContinuationImpl continuationImpl) {
        RealSheetState$awaitDismissalDragEnabled$1 realSheetState$awaitDismissalDragEnabled$1;
        int i;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        realSheetState.getClass();
        if (continuationImpl instanceof RealSheetState$awaitDismissalDragEnabled$1) {
            realSheetState$awaitDismissalDragEnabled$1 = (RealSheetState$awaitDismissalDragEnabled$1) continuationImpl;
            int i2 = realSheetState$awaitDismissalDragEnabled$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSheetState$awaitDismissalDragEnabled$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSheetState$awaitDismissalDragEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSheetState$awaitDismissalDragEnabled$1.label;
                Continuation continuation = null;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i4 = 8;
                    int i5 = 0;
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(i4, Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, 7)), realSheetState)), Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, i4)), new RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4(realSheetState, continuation, i5), i5);
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i3, continuation, 23);
                    realSheetState$awaitDismissalDragEnabled$1.L$0 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
                    realSheetState$awaitDismissalDragEnabled$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = realSheetState$awaitDismissalDragEnabled$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(i3, continuation, 24);
                realSheetState$awaitDismissalDragEnabled$1.L$0 = null;
                realSheetState$awaitDismissalDragEnabled$1.label = 2;
            }
        }
        realSheetState$awaitDismissalDragEnabled$1 = new RealSheetState$awaitDismissalDragEnabled$1(realSheetState, continuationImpl);
        Object obj2 = realSheetState$awaitDismissalDragEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSheetState$awaitDismissalDragEnabled$1.label;
        Continuation continuation2 = null;
        int i32 = 2;
        if (i != 0) {
        }
        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$522 = new SessionWorkerKt$runSession$5(i32, continuation2, 24);
        realSheetState$awaitDismissalDragEnabled$1.L$0 = null;
        realSheetState$awaitDismissalDragEnabled$1.label = 2;
    }

    public static Float positionOfOrNull(DefaultDraggableAnchors defaultDraggableAnchors, SheetPosition sheetPosition) {
        float positionOf = defaultDraggableAnchors.positionOf(sheetPosition);
        Float valueOf = Float.valueOf(positionOf);
        if (Math.abs(positionOf) <= Float.MAX_VALUE) {
            return valueOf;
        }
        return null;
    }

    public final void CreateDragAnchorsEffect(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1052798218);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PinnedKt$$ExternalSyntheticLambda0(this, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RealSheetState$$ExternalSyntheticLambda11(this, i, i3);
        }
    }

    public final void ProcessQueuedNestedFlingsEffect(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1329230956);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSheetState$peek$3(this, null, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            boolean z2 = i4 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PinnedKt$$ExternalSyntheticLambda0(this, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RealSheetState$$ExternalSyntheticLambda11(this, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitDismissal(BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        RealSheetState$awaitDismissal$1 realSheetState$awaitDismissal$1;
        int i;
        if (continuationImpl instanceof RealSheetState$awaitDismissal$1) {
            realSheetState$awaitDismissal$1 = (RealSheetState$awaitDismissal$1) continuationImpl;
            int i2 = realSheetState$awaitDismissal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSheetState$awaitDismissal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSheetState$awaitDismissal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSheetState$awaitDismissal$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSheetState$awaitDismissal$2 realSheetState$awaitDismissal$2 = new RealSheetState$awaitDismissal$2(this, continuation, 0);
                    realSheetState$awaitDismissal$1.L$0 = basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0;
                    realSheetState$awaitDismissal$1.label = 1;
                    if (JobKt.coroutineScope(realSheetState$awaitDismissal$2, realSheetState$awaitDismissal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 = realSheetState$awaitDismissal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                this.dismissedWhenDraggingDisabled$delegate.setValue(Boolean.FALSE);
                basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0.invoke();
                return Unit.INSTANCE;
            }
        }
        realSheetState$awaitDismissal$1 = new RealSheetState$awaitDismissal$1(this, continuationImpl);
        Object obj2 = realSheetState$awaitDismissal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSheetState$awaitDismissal$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        this.dismissedWhenDraggingDisabled$delegate.setValue(Boolean.FALSE);
        basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0.invoke();
        return Unit.INSTANCE;
    }

    public final Object dismiss(SuspendLambda suspendLambda) {
        AnchoredDraggableState anchoredDraggableState = this.draggableState;
        DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
        SheetPosition sheetPosition = SheetPosition.Hidden;
        if (anchors.hasPositionFor(sheetPosition)) {
            Object animateTo$default = Draggable2DKt.animateTo$default(anchoredDraggableState, sheetPosition, suspendLambda);
            return animateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$default : Unit.INSTANCE;
        }
        this.dismissedWhenDraggingDisabled$delegate.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (androidx.compose.foundation.gestures.Draggable2DKt.animateTo$default(r6.draggableState, r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object expand(Continuation continuation) {
        RealSheetState$expand$1 realSheetState$expand$1;
        int i;
        Object obj;
        if (continuation instanceof RealSheetState$expand$1) {
            realSheetState$expand$1 = (RealSheetState$expand$1) continuation;
            int i2 = realSheetState$expand$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSheetState$expand$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realSheetState$expand$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSheetState$expand$1.label;
                Continuation continuation2 = null;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realSheetState$expand$1.label = 1;
                    if (isReadyToBeDisplayed()) {
                        obj = Unit.INSTANCE;
                    } else {
                        obj = FlowKt.first(Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(this, 16)), new SessionWorkerKt$runSession$5(i3, continuation2, 25), realSheetState$expand$1);
                        if (obj != obj3) {
                            obj = Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                SheetPosition sheetPosition = SheetPosition.Expanded;
                realSheetState$expand$1.label = 2;
            }
        }
        realSheetState$expand$1 = new RealSheetState$expand$1(this, continuation);
        Object obj22 = realSheetState$expand$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSheetState$expand$1.label;
        Continuation continuation22 = null;
        int i32 = 2;
        if (i != 0) {
        }
        SheetPosition sheetPosition2 = SheetPosition.Expanded;
        realSheetState$expand$1.label = 2;
    }

    public final float getCollapsedContentProgress() {
        return ((Number) this.collapsedContentProgress$delegate.getValue()).floatValue();
    }

    public final float getExpandProgress() {
        return ((Number) this.expandProgress$delegate.getValue()).floatValue();
    }

    public final SheetPeekPosition$FixedHeight getPeekPosition() {
        return (SheetPeekPosition$FixedHeight) this.peekPosition$delegate.getValue();
    }

    public final SheetPosition getSettledPosition() {
        return (SheetPosition) this.draggableState.settledValue$delegate.getValue();
    }

    public final boolean isPeekPositionIgnored(DefaultDraggableAnchors defaultDraggableAnchors) {
        if (defaultDraggableAnchors.size > 0) {
            return (((Float) this.peekHeightPx$delegate.getValue()) == null || defaultDraggableAnchors.hasPositionFor(SheetPosition.Peeking)) ? false : true;
        }
        a$$ExternalSyntheticBUOutline0.m$1("called too early?");
        return false;
    }

    public final boolean isReadyToBeDisplayed() {
        return ((Boolean) this.isReadyToBeDisplayed$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (androidx.compose.foundation.gestures.Draggable2DKt.animateTo$default(r11, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (expand(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (com.squareup.util.coroutines.StateFlowKt.m3995withTimeoutOrThrowrnQQ1Ag(r7, r11, r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object peek(ContinuationImpl continuationImpl) {
        RealSheetState$peek$1 realSheetState$peek$1;
        int i;
        AnchoredDraggableState anchoredDraggableState;
        if (continuationImpl instanceof RealSheetState$peek$1) {
            realSheetState$peek$1 = (RealSheetState$peek$1) continuationImpl;
            int i2 = realSheetState$peek$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSheetState$peek$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSheetState$peek$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSheetState$peek$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    SheetKt$$ExternalSyntheticLambda9 sheetKt$$ExternalSyntheticLambda9 = new SheetKt$$ExternalSyntheticLambda9(4);
                    RealSheetState$peek$3 realSheetState$peek$3 = new RealSheetState$peek$3(this, continuation, 0);
                    realSheetState$peek$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                anchoredDraggableState = this.draggableState;
                if (isPeekPositionIgnored(anchoredDraggableState.getAnchors())) {
                    SheetPosition sheetPosition = SheetPosition.Peeking;
                    realSheetState$peek$1.label = 2;
                } else {
                    realSheetState$peek$1.label = 3;
                }
                return obj2;
            }
        }
        realSheetState$peek$1 = new RealSheetState$peek$1(this, continuationImpl);
        Object obj3 = realSheetState$peek$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSheetState$peek$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        anchoredDraggableState = this.draggableState;
        if (isPeekPositionIgnored(anchoredDraggableState.getAnchors())) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r9.enableExperimentalImePeekHeight != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MutableScatterSet updateDragAnchors() {
        SheetPosition sheetPosition;
        SheetPosition sheetPosition2;
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        MutableScatterSet mutableScatterSet2 = new MutableScatterSet();
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) zzg.observe(new RealSheetState$$ExternalSyntheticLambda1(this, 9), new ScrollCapture$onScrollCaptureSearch$1(1, mutableScatterSet2, MutableScatterSet.class, "add", "add(Ljava/lang/Object;)Z", 8, 6));
        if (defaultDraggableAnchors != null) {
            AnchoredDraggableState anchoredDraggableState = this.draggableState;
            int ordinal = (anchoredDraggableState.getAnchors().size == 0 ? (SheetPosition) anchoredDraggableState.currentValue$delegate.getValue() : (SheetPosition) anchoredDraggableState.targetValue$delegate.getValue()).ordinal();
            if (ordinal == 0) {
                Float positionOfOrNull = positionOfOrNull(anchoredDraggableState.getAnchors(), SheetPosition.Hidden);
                SheetPosition sheetPosition3 = SheetPosition.Peeking;
                Float positionOfOrNull2 = positionOfOrNull(defaultDraggableAnchors, sheetPosition3);
                if (((Number) this.imeHeightPx$delegate.getValue()).intValue() > 0 && getPeekPosition() != null) {
                    SheetPeekPosition$FixedHeight peekPosition = getPeekPosition();
                    peekPosition.getClass();
                }
                if (positionOfOrNull != null && positionOfOrNull2 != null && positionOfOrNull.floatValue() >= positionOfOrNull2.floatValue()) {
                    sheetPosition = sheetPosition3;
                }
                sheetPosition = SheetPosition.Expanded;
            } else if (ordinal == 1) {
                sheetPosition = getPeekPosition() == null ? SheetPosition.Expanded : isPeekPositionIgnored(defaultDraggableAnchors) ? SheetPosition.Expanded : SheetPosition.Peeking;
            } else if (ordinal == 2) {
                sheetPosition2 = SheetPosition.Collapsed;
                if (!defaultDraggableAnchors.hasPositionFor(sheetPosition2)) {
                    sheetPosition2 = SheetPosition.Peeking;
                    if (!defaultDraggableAnchors.hasPositionFor(sheetPosition2) || isPeekPositionIgnored(defaultDraggableAnchors)) {
                        sheetPosition = SheetPosition.Expanded;
                    }
                }
                sheetPosition = sheetPosition2;
            } else {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                sheetPosition = SheetPosition.Hidden;
                if (!defaultDraggableAnchors.hasPositionFor(sheetPosition)) {
                    sheetPosition2 = SheetPosition.Collapsed;
                    if (!defaultDraggableAnchors.hasPositionFor(sheetPosition2)) {
                        sheetPosition2 = SheetPosition.Peeking;
                        if (!defaultDraggableAnchors.hasPositionFor(sheetPosition2)) {
                            if (!defaultDraggableAnchors.hasPositionFor(sheetPosition)) {
                                sheetPosition = SheetPosition.Expanded;
                            }
                        }
                    }
                    sheetPosition = sheetPosition2;
                }
            }
            anchoredDraggableState.updateAnchors(defaultDraggableAnchors, sheetPosition);
        }
        return mutableScatterSet2;
    }

    public final class SheetNestedScrollConnection implements NestedScrollConnection {
        public final /* synthetic */ int $r8$classId;
        public final Object draggableState;
        public final Object onFling;

        public SheetNestedScrollConnection(CollapsingToolbarState collapsingToolbarState, FlingBehavior flingBehavior) {
            this.$r8$classId = 1;
            collapsingToolbarState.getClass();
            flingBehavior.getClass();
            this.draggableState = collapsingToolbarState;
            this.onFling = flingBehavior;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
            ExitUntilCollapsedNestedScrollConnection$onPostFling$1 exitUntilCollapsedNestedScrollConnection$onPostFling$1;
            int i;
            float m1068getYimpl;
            int i2 = this.$r8$classId;
            Object obj = this.onFling;
            switch (i2) {
                case 0:
                    ((PinnedKt$$ExternalSyntheticLambda0) obj).invoke(new Float(Velocity.m1068getYimpl(j2)));
                    return new Velocity(j2);
                case 1:
                    if (continuation instanceof ExitUntilCollapsedNestedScrollConnection$onPostFling$1) {
                        exitUntilCollapsedNestedScrollConnection$onPostFling$1 = (ExitUntilCollapsedNestedScrollConnection$onPostFling$1) continuation;
                        int i3 = exitUntilCollapsedNestedScrollConnection$onPostFling$1.label;
                        if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                            exitUntilCollapsedNestedScrollConnection$onPostFling$1.label = i3 - PKIFailureInfo.systemUnavail;
                            Object obj2 = exitUntilCollapsedNestedScrollConnection$onPostFling$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = exitUntilCollapsedNestedScrollConnection$onPostFling$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                m1068getYimpl = Velocity.m1068getYimpl(j2);
                                if (m1068getYimpl > RecyclerView.DECELERATION_RATE) {
                                    exitUntilCollapsedNestedScrollConnection$onPostFling$1.J$1 = j2;
                                    exitUntilCollapsedNestedScrollConnection$onPostFling$1.label = 1;
                                    obj2 = ((CollapsingToolbarState) this.draggableState).fling((FlingBehavior) obj, m1068getYimpl, exitUntilCollapsedNestedScrollConnection$onPostFling$1);
                                    if (obj2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j2) - m1068getYimpl));
                            }
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j2 = exitUntilCollapsedNestedScrollConnection$onPostFling$1.J$1;
                            SafeTrace.throwOnFailure(obj2);
                            m1068getYimpl = ((Number) obj2).floatValue();
                            return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j2) - m1068getYimpl));
                        }
                    }
                    exitUntilCollapsedNestedScrollConnection$onPostFling$1 = new ExitUntilCollapsedNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
                    Object obj22 = exitUntilCollapsedNestedScrollConnection$onPostFling$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = exitUntilCollapsedNestedScrollConnection$onPostFling$1.label;
                    if (i != 0) {
                    }
                    m1068getYimpl = ((Number) obj22).floatValue();
                    return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j2) - m1068getYimpl));
                default:
                    ((CoreFlowRealSheetState$$ExternalSyntheticLambda7) obj).invoke(new Float(Velocity.m1068getYimpl(j2)));
                    return new Velocity(j2);
            }
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
            int i2 = this.$r8$classId;
            Object obj = this.draggableState;
            switch (i2) {
                case 0:
                    if (i == 1) {
                        return Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, ((AnchoredDraggableState) obj).dispatchRawDelta(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))), 1, j2);
                    }
                    return 0L;
                case 1:
                    return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) > RecyclerView.DECELERATION_RATE ? ((CollapsingToolbarState) obj).scrollableState.dispatchRawDelta(r6) : 0.0f) & BodyPartID.bodyIdMax);
                default:
                    if (i == 1) {
                        return Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, ((AnchoredDraggableState) obj).dispatchRawDelta(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))), 1, j2);
                    }
                    return 0L;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
            boolean z;
            ExitUntilCollapsedNestedScrollConnection$onPreFling$1 exitUntilCollapsedNestedScrollConnection$onPreFling$1;
            int i;
            float m1068getYimpl;
            int i2 = this.$r8$classId;
            Object obj = this.onFling;
            Object obj2 = this.draggableState;
            switch (i2) {
                case 0:
                    AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj2;
                    z = Velocity.m1068getYimpl(j) < RecyclerView.DECELERATION_RATE;
                    float positionOf = anchoredDraggableState.getAnchors().positionOf(SheetPosition.Expanded);
                    if (!z || anchoredDraggableState.requireOffset() <= positionOf) {
                        return new Velocity(0L);
                    }
                    DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
                    float abs = Math.abs(anchors.maxPosition() - anchors.minPosition());
                    PinnedKt$$ExternalSyntheticLambda0 pinnedKt$$ExternalSyntheticLambda0 = (PinnedKt$$ExternalSyntheticLambda0) obj;
                    float m1068getYimpl2 = Velocity.m1068getYimpl(j);
                    float f = -abs;
                    if (m1068getYimpl2 < f) {
                        m1068getYimpl2 = f;
                    }
                    if (m1068getYimpl2 <= abs) {
                        abs = m1068getYimpl2;
                    }
                    pinnedKt$$ExternalSyntheticLambda0.invoke(new Float(abs));
                    return new Velocity(j);
                case 1:
                    if (continuation instanceof ExitUntilCollapsedNestedScrollConnection$onPreFling$1) {
                        exitUntilCollapsedNestedScrollConnection$onPreFling$1 = (ExitUntilCollapsedNestedScrollConnection$onPreFling$1) continuation;
                        int i3 = exitUntilCollapsedNestedScrollConnection$onPreFling$1.label;
                        if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                            exitUntilCollapsedNestedScrollConnection$onPreFling$1.label = i3 - PKIFailureInfo.systemUnavail;
                            Object obj3 = exitUntilCollapsedNestedScrollConnection$onPreFling$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = exitUntilCollapsedNestedScrollConnection$onPreFling$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                if (Velocity.m1068getYimpl(j) >= RecyclerView.DECELERATION_RATE) {
                                    m1068getYimpl = Velocity.m1068getYimpl(j);
                                    return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j) - m1068getYimpl));
                                }
                                float m1068getYimpl3 = Velocity.m1068getYimpl(j);
                                exitUntilCollapsedNestedScrollConnection$onPreFling$1.J$0 = j;
                                exitUntilCollapsedNestedScrollConnection$onPreFling$1.label = 1;
                                obj3 = ((CollapsingToolbarState) obj2).fling((FlingBehavior) obj, m1068getYimpl3, exitUntilCollapsedNestedScrollConnection$onPreFling$1);
                                if (obj3 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j = exitUntilCollapsedNestedScrollConnection$onPreFling$1.J$0;
                                SafeTrace.throwOnFailure(obj3);
                            }
                            m1068getYimpl = ((Number) obj3).floatValue();
                            return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j) - m1068getYimpl));
                        }
                    }
                    exitUntilCollapsedNestedScrollConnection$onPreFling$1 = new ExitUntilCollapsedNestedScrollConnection$onPreFling$1(this, (ContinuationImpl) continuation);
                    Object obj32 = exitUntilCollapsedNestedScrollConnection$onPreFling$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = exitUntilCollapsedNestedScrollConnection$onPreFling$1.label;
                    if (i != 0) {
                    }
                    m1068getYimpl = ((Number) obj32).floatValue();
                    return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, Velocity.m1068getYimpl(j) - m1068getYimpl));
                default:
                    AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) obj2;
                    z = Velocity.m1068getYimpl(j) < RecyclerView.DECELERATION_RATE;
                    float positionOf2 = anchoredDraggableState2.getAnchors().positionOf(CoreFlowSheetPosition.Expanded);
                    if (!z || anchoredDraggableState2.requireOffset() <= positionOf2) {
                        return new Velocity(0L);
                    }
                    DefaultDraggableAnchors anchors2 = anchoredDraggableState2.getAnchors();
                    float abs2 = Math.abs(anchors2.maxPosition() - anchors2.minPosition());
                    CoreFlowRealSheetState$$ExternalSyntheticLambda7 coreFlowRealSheetState$$ExternalSyntheticLambda7 = (CoreFlowRealSheetState$$ExternalSyntheticLambda7) obj;
                    float m1068getYimpl4 = Velocity.m1068getYimpl(j);
                    float f2 = -abs2;
                    if (m1068getYimpl4 < f2) {
                        m1068getYimpl4 = f2;
                    }
                    if (m1068getYimpl4 <= abs2) {
                        abs2 = m1068getYimpl4;
                    }
                    coreFlowRealSheetState$$ExternalSyntheticLambda7.invoke(new Float(abs2));
                    return new Velocity(j);
            }
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public final long mo326onPreScrollOzD1aCk(int i, long j) {
            int i2 = this.$r8$classId;
            Object obj = this.draggableState;
            switch (i2) {
                case 0:
                    int i3 = (int) (BodyPartID.bodyIdMax & j);
                    if (Float.intBitsToFloat(i3) >= RecyclerView.DECELERATION_RATE || i != 1) {
                        return 0L;
                    }
                    return Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, ((AnchoredDraggableState) obj).dispatchRawDelta(Float.intBitsToFloat(i3)), 1, j);
                case 1:
                    return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) < RecyclerView.DECELERATION_RATE ? ((CollapsingToolbarState) obj).scrollableState.dispatchRawDelta(r8) : 0.0f) & BodyPartID.bodyIdMax);
                default:
                    int i4 = (int) (BodyPartID.bodyIdMax & j);
                    if (Float.intBitsToFloat(i4) >= RecyclerView.DECELERATION_RATE || i != 1) {
                        return 0L;
                    }
                    return Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, ((AnchoredDraggableState) obj).dispatchRawDelta(Float.intBitsToFloat(i4)), 1, j);
            }
        }

        public /* synthetic */ SheetNestedScrollConnection(AnchoredDraggableState anchoredDraggableState, Function1 function1, int i) {
            this.$r8$classId = i;
            this.draggableState = anchoredDraggableState;
            this.onFling = function1;
        }
    }

    public /* synthetic */ RealSheetState(SheetPosition sheetPosition, UserDismissMode userDismissMode, int i) {
        this((i & 1) != 0 ? null : sheetPosition, (i & 2) != 0 ? UserDismissMode.All : userDismissMode, (i & 4) == 0);
    }
}
