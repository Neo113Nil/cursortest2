package com.squareup.cash.payments.views.coreflowsheet;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.unit.Density;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4;
import com.squareup.cash.sheet.RealSheetStateKt$lazyAnimationSpec$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new PaycheckCircles$$ExternalSyntheticLambda4(20), new PoolDetailsViewKt$$ExternalSyntheticLambda3(4));
    public final ParcelableSnapshotMutableState contentHeightPx$delegate;
    public final ParcelableSnapshotMutableState contentPositionInWindow$delegate;
    public Density density;
    public final ParcelableSnapshotMutableState dismissedWhenDraggingDisabled$delegate;
    public final AnchoredDraggableState draggableState;
    public SpringSpec enterAnimationSpec;
    public SpringSpec exitAnimationSpec;
    public final DerivedSnapshotState expandProgress$delegate;
    public final ParcelableSnapshotMutableState imeHeightPx$delegate;
    public final ParcelableSnapshotMutableState imeStableHeightPx$delegate;
    public final DerivedSnapshotState isImeAppearing$delegate;
    public final DerivedSnapshotState isReadyToBeDisplayed$delegate;
    public final RealSheetState.SheetNestedScrollConnection nestedScrollConnection;
    public final DerivedSnapshotState peekHeightPx$delegate;
    public final ParcelableSnapshotMutableState peekPosition$delegate;
    public Function1 settleWithVelocity;
    public final ParcelableSnapshotMutableState suppressAutoImeExpansion$delegate;
    public final ParcelableSnapshotMutableState userDismissMode$delegate;
    public final ParcelableSnapshotMutableState viewportHeightPx$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoreFlowSheetPosition.values().length];
            try {
                CoreFlowSheetPosition coreFlowSheetPosition = CoreFlowSheetPosition.Expanded;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoreFlowRealSheetState(CoreFlowSheetPosition coreFlowSheetPosition, CoreFlowUserDismissMode coreFlowUserDismissMode, boolean z, int i) {
        coreFlowUserDismissMode = (i & 2) != 0 ? CoreFlowUserDismissMode.All : coreFlowUserDismissMode;
        int i2 = 8;
        int i3 = 0;
        z = (i & 8) != 0 ? false : z;
        this.userDismissMode$delegate = Updater.mutableStateOf$default(coreFlowUserDismissMode);
        coreFlowSheetPosition = coreFlowSheetPosition == null ? CoreFlowSheetPosition.Peeking : coreFlowSheetPosition;
        PoolDetailsViewKt$$ExternalSyntheticLambda3 poolDetailsViewKt$$ExternalSyntheticLambda3 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(3);
        CoreFlowRealSheetState$$ExternalSyntheticLambda1 coreFlowRealSheetState$$ExternalSyntheticLambda1 = new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, i3);
        RealSheetStateKt$lazyAnimationSpec$1 realSheetStateKt$lazyAnimationSpec$1 = new RealSheetStateKt$lazyAnimationSpec$1(1, new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 5));
        DecayAnimationSpecImpl exponentialDecay$default = AnimatableKt.exponentialDecay$default();
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(new BorderKt$$ExternalSyntheticLambda1(18), coreFlowSheetPosition);
        anchoredDraggableState.positionalThreshold = poolDetailsViewKt$$ExternalSyntheticLambda3;
        anchoredDraggableState.velocityThreshold = coreFlowRealSheetState$$ExternalSyntheticLambda1;
        anchoredDraggableState.snapAnimationSpec = realSheetStateKt$lazyAnimationSpec$1;
        anchoredDraggableState.decayAnimationSpec = exponentialDecay$default;
        this.draggableState = anchoredDraggableState;
        this.contentHeightPx$delegate = Updater.mutableStateOf$default(null);
        this.viewportHeightPx$delegate = Updater.mutableStateOf$default(null);
        this.contentPositionInWindow$delegate = Updater.mutableStateOf$default(null);
        this.peekPosition$delegate = Updater.mutableStateOf$default(null);
        this.imeHeightPx$delegate = Updater.mutableStateOf$default(0);
        this.suppressAutoImeExpansion$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
        this.dismissedWhenDraggingDisabled$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.imeStableHeightPx$delegate = Updater.mutableStateOf$default(0);
        this.isImeAppearing$delegate = Updater.derivedStateOf(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 6));
        this.peekHeightPx$delegate = Updater.derivedStateOf(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 7));
        this.isReadyToBeDisplayed$delegate = Updater.derivedStateOf(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, i2));
        this.expandProgress$delegate = Updater.derivedStateOf(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 9));
        this.nestedScrollConnection = new RealSheetState.SheetNestedScrollConnection(anchoredDraggableState, new CoreFlowRealSheetState$$ExternalSyntheticLambda7(this, i3), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$awaitDismissalDragEnabled(CoreFlowRealSheetState coreFlowRealSheetState, ContinuationImpl continuationImpl) {
        CoreFlowRealSheetState$awaitDismissalDragEnabled$1 coreFlowRealSheetState$awaitDismissalDragEnabled$1;
        int i;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        if (continuationImpl instanceof CoreFlowRealSheetState$awaitDismissalDragEnabled$1) {
            coreFlowRealSheetState$awaitDismissalDragEnabled$1 = (CoreFlowRealSheetState$awaitDismissalDragEnabled$1) continuationImpl;
            int i2 = coreFlowRealSheetState$awaitDismissalDragEnabled$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coreFlowRealSheetState$awaitDismissalDragEnabled$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = coreFlowRealSheetState$awaitDismissalDragEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coreFlowRealSheetState$awaitDismissalDragEnabled$1.label;
                int i3 = 1;
                Continuation continuation = null;
                int i4 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(coreFlowRealSheetState, i4)), coreFlowRealSheetState, 26)), Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(coreFlowRealSheetState, 3)), new RealSheetState$awaitDismissalDragEnabled$isNearlyHidden$4(coreFlowRealSheetState, continuation, i3), 0);
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i4, continuation, 20);
                    coreFlowRealSheetState$awaitDismissalDragEnabled$1.L$0 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
                    coreFlowRealSheetState$awaitDismissalDragEnabled$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = coreFlowRealSheetState$awaitDismissalDragEnabled$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(i4, continuation, 21);
                coreFlowRealSheetState$awaitDismissalDragEnabled$1.L$0 = null;
                coreFlowRealSheetState$awaitDismissalDragEnabled$1.label = 2;
            }
        }
        coreFlowRealSheetState$awaitDismissalDragEnabled$1 = new CoreFlowRealSheetState$awaitDismissalDragEnabled$1(coreFlowRealSheetState, continuationImpl);
        Object obj2 = coreFlowRealSheetState$awaitDismissalDragEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coreFlowRealSheetState$awaitDismissalDragEnabled$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        int i42 = 2;
        if (i != 0) {
        }
        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$522 = new SessionWorkerKt$runSession$5(i42, continuation2, 21);
        coreFlowRealSheetState$awaitDismissalDragEnabled$1.L$0 = null;
        coreFlowRealSheetState$awaitDismissalDragEnabled$1.label = 2;
    }

    public final void CreateDragAnchorsEffect(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(635472784);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CoreFlowRealSheetState$$ExternalSyntheticLambda7(this, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CoreFlowRealSheetState$$ExternalSyntheticLambda12(this, i, i3);
        }
    }

    public final void HandleContentAndImeTransitionsEffect(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(828898303);
        int i2 = 2;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CoreFlowRealSheetState$awaitDismissal$2$1$1(this, continuation, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            boolean z2 = i5 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CoreFlowRealSheetState$awaitDismissal$2$1$1(this, continuation, i2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CoreFlowRealSheetState$$ExternalSyntheticLambda12(this, i, i2);
        }
    }

    public final void ProcessQueuedNestedFlingsEffect(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(187881966);
        int i2 = 2;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CoreFlowRealSheetState$awaitDismissal$2$1$1(this, null, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            boolean z2 = i5 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CoreFlowRealSheetState$$ExternalSyntheticLambda7(this, i2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CoreFlowRealSheetState$$ExternalSyntheticLambda12(this, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitDismissal(BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        CoreFlowRealSheetState$awaitDismissal$1 coreFlowRealSheetState$awaitDismissal$1;
        int i;
        if (continuationImpl instanceof CoreFlowRealSheetState$awaitDismissal$1) {
            coreFlowRealSheetState$awaitDismissal$1 = (CoreFlowRealSheetState$awaitDismissal$1) continuationImpl;
            int i2 = coreFlowRealSheetState$awaitDismissal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coreFlowRealSheetState$awaitDismissal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = coreFlowRealSheetState$awaitDismissal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coreFlowRealSheetState$awaitDismissal$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1(this, continuation, 23);
                    coreFlowRealSheetState$awaitDismissal$1.L$0 = basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0;
                    coreFlowRealSheetState$awaitDismissal$1.label = 1;
                    if (JobKt.coroutineScope(overlayKt$Overlay$1$1$1$1$1, coreFlowRealSheetState$awaitDismissal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 = coreFlowRealSheetState$awaitDismissal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0.invoke();
                return Unit.INSTANCE;
            }
        }
        coreFlowRealSheetState$awaitDismissal$1 = new CoreFlowRealSheetState$awaitDismissal$1(this, continuationImpl);
        Object obj2 = coreFlowRealSheetState$awaitDismissal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coreFlowRealSheetState$awaitDismissal$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0.invoke();
        return Unit.INSTANCE;
    }

    public final FiniteAnimationSpec enterAnimationSpec$views() {
        SpringSpec springSpec = this.enterAnimationSpec;
        if (springSpec != null) {
            return springSpec;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterAnimationSpec");
        throw null;
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
        CoreFlowRealSheetState$expand$1 coreFlowRealSheetState$expand$1;
        int i;
        Object obj;
        if (continuation instanceof CoreFlowRealSheetState$expand$1) {
            coreFlowRealSheetState$expand$1 = (CoreFlowRealSheetState$expand$1) continuation;
            int i2 = coreFlowRealSheetState$expand$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coreFlowRealSheetState$expand$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = coreFlowRealSheetState$expand$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coreFlowRealSheetState$expand$1.label;
                Continuation continuation2 = null;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    coreFlowRealSheetState$expand$1.label = 1;
                    if (isReadyToBeDisplayed()) {
                        obj = Unit.INSTANCE;
                    } else {
                        obj = FlowKt.first(Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 10)), new SessionWorkerKt$runSession$5(i3, continuation2, 22), coreFlowRealSheetState$expand$1);
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
                CoreFlowSheetPosition coreFlowSheetPosition = CoreFlowSheetPosition.Expanded;
                coreFlowRealSheetState$expand$1.label = 2;
            }
        }
        coreFlowRealSheetState$expand$1 = new CoreFlowRealSheetState$expand$1(this, continuation);
        Object obj22 = coreFlowRealSheetState$expand$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coreFlowRealSheetState$expand$1.label;
        Continuation continuation22 = null;
        int i32 = 2;
        if (i != 0) {
        }
        CoreFlowSheetPosition coreFlowSheetPosition2 = CoreFlowSheetPosition.Expanded;
        coreFlowRealSheetState$expand$1.label = 2;
    }

    public final boolean isReadyToBeDisplayed() {
        return ((Boolean) this.isReadyToBeDisplayed$delegate.getValue()).booleanValue();
    }

    public final MutableScatterSet updateDragAnchors() {
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        MutableScatterSet mutableScatterSet2 = new MutableScatterSet();
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) zzg.observe(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(this, 4), new ScrollCapture$onScrollCaptureSearch$1(1, mutableScatterSet2, MutableScatterSet.class, "add", "add(Ljava/lang/Object;)Z", 8, 2));
        if (defaultDraggableAnchors != null) {
            AnchoredDraggableState anchoredDraggableState = this.draggableState;
            CoreFlowSheetPosition coreFlowSheetPosition = anchoredDraggableState.getAnchors().size == 0 ? (CoreFlowSheetPosition) anchoredDraggableState.currentValue$delegate.getValue() : (CoreFlowSheetPosition) anchoredDraggableState.targetValue$delegate.getValue();
            if (!defaultDraggableAnchors.hasPositionFor(coreFlowSheetPosition)) {
                CoreFlowSheetPosition coreFlowSheetPosition2 = CoreFlowSheetPosition.Hidden;
                coreFlowSheetPosition = coreFlowSheetPosition == coreFlowSheetPosition2 ? coreFlowSheetPosition2 : CoreFlowSheetPosition.Expanded;
            }
            anchoredDraggableState.updateAnchors(defaultDraggableAnchors, coreFlowSheetPosition);
        }
        return mutableScatterSet2;
    }
}
