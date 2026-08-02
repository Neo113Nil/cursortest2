package androidx.compose.material;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl;
import androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProviderKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda10;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.material3.internal.DraggableAnchorsNodeV2;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.Extras;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.badging.db.BadgesToClear;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.overlays.OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.BatchClearBadgeClientResponse;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.wire.GrpcMethod;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, Job job, ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1) {
        this.$r8$classId = 5;
        this.f$0 = contentInViewNode;
        this.f$1 = job;
        this.f$2 = scrollingLogic$nestedScrollScope$1;
    }

    private final Object invoke$androidx$compose$material3$OutlinedTextFieldKt$$ExternalSyntheticLambda1(Object obj) {
        CameraWrapper.i iVar = (CameraWrapper.i) this.f$0;
        PaddingValues paddingValues = (PaddingValues) this.f$1;
        Alignment.Horizontal horizontal = (Alignment.Horizontal) this.f$2;
        LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
        long j = ((Size) iVar.get()).packedValue;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > RecyclerView.DECELERATION_RATE) {
            float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(4.0f);
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
            float align = horizontal.align(MathKt__MathJVMKt.roundToInt(intBitsToFloat), MathKt__MathJVMKt.roundToInt((Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) - r10) - layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo266calculateRightPaddingu2uoSUM(layoutNodeDrawScope.getLayoutDirection()))), layoutNodeDrawScope.getLayoutDirection()) + layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutNodeDrawScope.getLayoutDirection()));
            float f = intBitsToFloat / 2.0f;
            float f2 = align + f;
            float f3 = (f2 - f) - mo236toPx0680j_4;
            float f4 = f3 < RecyclerView.DECELERATION_RATE ? 0.0f : f3;
            float f5 = f2 + f + mo236toPx0680j_4;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
            float f6 = f5 > intBitsToFloat2 ? intBitsToFloat2 : f5;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j));
            float f7 = (-intBitsToFloat3) / 2.0f;
            float f8 = intBitsToFloat3 / 2.0f;
            GrpcMethod grpcMethod = canvasDrawScope.drawContext;
            long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
            grpcMethod.getCanvas().save();
            try {
                ((Extras.Key) grpcMethod.path).m1435clipRectN_I0leg(f4, f7, f6, f8, 0);
                layoutNodeDrawScope.drawContent();
            } finally {
                Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
            }
        } else {
            layoutNodeDrawScope.drawContent();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$androidx$compose$material3$internal$BasicTooltipKt$$ExternalSyntheticLambda6(Object obj) {
        String str = (String) this.f$0;
        DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(23, (CoroutineScope) this.f$1, (TooltipStateImpl) this.f$2);
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        ((SemanticsPropertyReceiver) obj).set(SemanticsActions.OnLongClick, new AccessibilityAction(str, dialogHostKt$$ExternalSyntheticLambda0));
        return Unit.INSTANCE;
    }

    private final Object invoke$androidx$compose$material3$internal$DraggableAnchorsNodeV2$$ExternalSyntheticLambda0(Object obj) {
        MeasureScope measureScope = (MeasureScope) this.f$0;
        DraggableAnchorsNodeV2 draggableAnchorsNodeV2 = (DraggableAnchorsNodeV2) this.f$1;
        Placeable placeable = (Placeable) this.f$2;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        boolean isLookingAhead = measureScope.isLookingAhead();
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = draggableAnchorsNodeV2.state;
        float positionOf = isLookingAhead ? anchoredDraggableState.getAnchors().positionOf(draggableAnchorsNodeV2.state.targetValue$delegate.getValue()) : anchoredDraggableState.requireOffset();
        float f = (DepthSortedSetKt.requireLayoutNode(draggableAnchorsNodeV2).layoutDirection == LayoutDirection.Rtl && draggableAnchorsNodeV2.orientation == Orientation.Horizontal) ? -1.0f : 1.0f;
        Orientation orientation = draggableAnchorsNodeV2.orientation;
        float f2 = orientation == Orientation.Horizontal ? f * positionOf : 0.0f;
        if (orientation != Orientation.Vertical) {
            positionOf = 0.0f;
        }
        placementScope.motionFrameOfReferencePlacement = true;
        placementScope.place(placeable, MathKt__MathJVMKt.roundToInt(f2), MathKt__MathJVMKt.roundToInt(positionOf), RecyclerView.DECELERATION_RATE);
        placementScope.motionFrameOfReferencePlacement = false;
        return Unit.INSTANCE;
    }

    private final Object invoke$androidx$lifecycle$compose$LifecycleEffectKt$$ExternalSyntheticLambda1(Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$0;
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = 1;
        MenuHostHelper$$ExternalSyntheticLambda0 menuHostHelper$$ExternalSyntheticLambda0 = new MenuHostHelper$$ExternalSyntheticLambda0(i, ref$ObjectRef, lifecycleResumePauseEffectScope, function1);
        lifecycleOwner.getLifecycle().addObserver(menuHostHelper$$ExternalSyntheticLambda0);
        return new OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1(i, lifecycleOwner, menuHostHelper$$ExternalSyntheticLambda0, ref$ObjectRef);
    }

    private final Object invoke$androidx$media3$ui$compose$PlayerSurfaceKt$$ExternalSyntheticLambda7(Object obj) {
        ExoPlayer exoPlayer = (ExoPlayer) this.f$0;
        final Function1 function1 = (Function1) this.f$1;
        final View view = (View) this.f$2;
        ((DisposableEffectScope) obj).getClass();
        Player.Listener listener = new Player.Listener() { // from class: androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$5$1$1$listener$1
            @Override // androidx.media3.common.Player.Listener
            public final void onSurfaceSizeChanged(int i, int i2) {
                function1.invoke(view);
            }
        };
        ((ExoPlayerImpl) exoPlayer).listeners.add(listener);
        return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(7, listener, exoPlayer);
    }

    private final Object invoke$androidx$navigation$fragment$FragmentNavigator$$ExternalSyntheticLambda4(Object obj) {
        FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f$0;
        Fragment fragment = (Fragment) this.f$1;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f$2;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        ArrayList arrayList = fragmentNavigator.pendingOps;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((Pair) it.next()).first, fragment.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (lifecycleOwner != null && !z) {
            Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                lifecycle.addObserver((LifecycleObserver) fragmentNavigator.fragmentViewObserver.invoke(navBackStackEntry));
            }
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$badging$backend$RealBadger2$performClear$2$$ExternalSyntheticLambda0(Object obj) {
        ApiResult.Success success = (ApiResult.Success) this.f$0;
        RealBadger2 realBadger2 = (RealBadger2) this.f$1;
        List<BadgesToClear> list = (List) this.f$2;
        BadgeCounts badgeCounts = ((BatchClearBadgeClientResponse) success.response).badge_count;
        if (badgeCounts != null) {
            RealBadger2.access$updateCounts(realBadger2, badgeCounts);
        }
        for (BadgesToClear badgesToClear : list) {
            LocalTabContentQueries localTabContentQueries = realBadger2.badgeQueries;
            String str = badgesToClear.external_token;
            ItemType itemType = badgesToClear.item_type;
            long j = badgesToClear.badge_version;
            Instant now = DimensionKt.now(realBadger2.clock);
            localTabContentQueries.getClass();
            str.getClass();
            itemType.getClass();
            localTabContentQueries.driver.execute(1388985227, "UPDATE badge\nSET clear_succeeded_at = ?\nWHERE external_token = ?\nAND item_type = ?\nAND badge_version = ?", new BadgeQueries$$ExternalSyntheticLambda3(now, str, localTabContentQueries, itemType, j, 0));
            localTabContentQueries.notifyQueries(1388985227, new AvatarsKt$$ExternalSyntheticLambda2(11));
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$backend$real$BuyerIntentSyncManager$$ExternalSyntheticLambda0(Object obj) {
        BuyerIntentSyncManager buyerIntentSyncManager = (BuyerIntentSyncManager) this.f$0;
        BuyerIntentScope buyerIntentScope = (BuyerIntentScope) this.f$1;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$2;
        synchronized (buyerIntentSyncManager.lock) {
            if (buyerIntentSyncManager.syncJobs.get(buyerIntentScope) == ref$ObjectRef.element) {
                buyerIntentSyncManager.syncJobs.remove(buyerIntentScope);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$backend$real$CalculateLineItemsManager$$ExternalSyntheticLambda0(Object obj) {
        CalculateLineItemsManager calculateLineItemsManager = (CalculateLineItemsManager) this.f$0;
        CartBuilder cartBuilder = (CartBuilder) this.f$1;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$2;
        synchronized (calculateLineItemsManager.lock) {
            if (calculateLineItemsManager.observationJobs.get(((RealCartBuilder) cartBuilder).brandSpot) == ref$ObjectRef.element) {
                calculateLineItemsManager.observationJobs.remove(((RealCartBuilder) cartBuilder).brandSpot);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        AnnotatedString.Range range;
        Integer previousWordOffset;
        Integer nextWordOffset;
        Integer nextWordOffset2;
        Integer previousWordOffset2;
        TextLayoutResult textLayoutResult;
        TextLayoutResult textLayoutResult2;
        TextLayoutResultProxy textLayoutResultProxy;
        TextLayoutResultProxy textLayoutResultProxy2;
        TextLayoutResult textLayoutResult3;
        TextLayoutResult textLayoutResult4;
        TextLayoutResultProxy textLayoutResultProxy3;
        TextLayoutResultProxy textLayoutResultProxy4;
        Integer nextWordOffset3;
        Integer previousWordOffset3;
        Integer previousWordOffset4;
        Integer nextWordOffset4;
        TextFieldValue textFieldValue;
        Recorder.AnonymousClass1 anonymousClass1;
        TextFieldValue textFieldValue2;
        int i;
        ComposableLambdaImpl composableLambdaImpl;
        boolean z;
        int i2 = this.$r8$classId;
        int i3 = 18;
        int i4 = 17;
        int i5 = 3;
        final int i6 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        boolean z2 = false;
        r7 = false;
        boolean z3 = false;
        z2 = false;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        final int i7 = 1;
        switch (i2) {
            case 0:
                State state = (State) obj3;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) ((State) obj2).getValue()).floatValue());
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(((TransformOrigin) ((MutableState) obj4).getValue()).packedValue);
                return Unit.INSTANCE;
            case 1:
                Deferred deferred = (Deferred) obj4;
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) obj3;
                BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = (BorderKt$$ExternalSyntheticLambda1) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(borderKt$$ExternalSyntheticLambda1.invoke(deferred.getCompleted()));
                } else if (th instanceof CancellationException) {
                    completableDeferredImpl.cancel((CancellationException) th);
                } else {
                    completableDeferredImpl.completeExceptionally(th);
                }
                return Unit.INSTANCE;
            case 2:
                Void r0 = (Void) obj;
                ((HCaptcha) obj4).initInternal((CameraX) obj3, ContextUtil.getPersistentApplicationContext((Context) obj2));
                return r0;
            case 3:
                ViewfinderInitScopeImpl viewfinderInitScopeImpl = new ViewfinderInitScopeImpl((ViewfinderSurfaceRequest) obj3);
                ((Function1) obj2).invoke(viewfinderInitScopeImpl);
                ((BaseViewfinderExternalSurfaceState) obj).onSurface = new AnchoredDraggableNode$drag$2(viewfinderInitScopeImpl, (MutableState) obj4, null, i7);
                return Unit.INSTANCE;
            case 4:
                Surface surface = (Surface) obj3;
                ((Recorder.AnonymousClass6) ((ViewfinderExternalSurfaceHolder) obj4).surfaceControl).detach();
                if (!surface.equals((Surface) obj2)) {
                    surface.release();
                }
                return Unit.INSTANCE;
            case 5:
                ContentInViewNode contentInViewNode = (ContentInViewNode) obj4;
                Job job = (Job) obj3;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                long m246reverseIfNeededMKHz9U = scrollingLogic.m246reverseIfNeededMKHz9U(scrollingLogic.m248toOffsettuRUvjQ(f * floatValue));
                ScrollingLogic scrollingLogic2 = scrollingLogic$nestedScrollScope$1.this$0;
                float m247toFloatk4lQ0M = scrollingLogic.m247toFloatk4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(scrollingLogic2.m245performScroll3eAAhYA(scrollingLogic2.outerStateScope, m246reverseIfNeededMKHz9U, 1))) * f;
                if (Math.abs(m247toFloatk4lQ0M) < Math.abs(floatValue)) {
                    job.cancel(JobKt.CancellationException("Scroll animation cancelled because scroll was not consumed (" + m247toFloatk4lQ0M + " < " + floatValue + ')', null));
                }
                return Unit.INSTANCE;
            case 6:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                AnimationScope animationScope = (AnimationScope) obj;
                float floatValue2 = ((Number) animationScope.value$delegate.getValue()).floatValue() - ref$FloatRef.element;
                float scrollBy = ((ScrollScope) obj3).scrollBy(floatValue2);
                ref$FloatRef.element = ((Number) animationScope.value$delegate.getValue()).floatValue();
                ((Ref$FloatRef) obj2).element = ((Number) animationScope.getVelocity()).floatValue();
                if (Math.abs(floatValue2 - scrollBy) > 0.5f) {
                    animationScope.cancelAnimation();
                }
                return Unit.INSTANCE;
            case 7:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj4;
                TextFieldValue textFieldValue3 = (TextFieldValue) obj3;
                OffsetMapping offsetMapping = (OffsetMapping) obj2;
                DrawScope drawScope = (DrawScope) obj;
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null) {
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long j = ((TextRange) legacyTextFieldState.selectionPreviewHighlightRange$delegate.getValue()).packedValue;
                    long j2 = ((TextRange) legacyTextFieldState.deletionPreviewHighlightRange$delegate.getValue()).packedValue;
                    TextLayoutResult textLayoutResult5 = layoutResult.value;
                    AndroidPaint androidPaint = legacyTextFieldState.highlightPaint;
                    long j3 = legacyTextFieldState.selectionBackgroundColor;
                    if (!TextRange.m987getCollapsedimpl(j)) {
                        androidPaint.m659setColor8_81llA(j3);
                        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m990getMinimpl(j));
                        int originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m989getMaximpl(j));
                        if (originalToTransformed != originalToTransformed2) {
                            canvas.drawPath(textLayoutResult5.getPathForRange(originalToTransformed, originalToTransformed2), androidPaint);
                        }
                    } else if (!TextRange.m987getCollapsedimpl(j2)) {
                        long m996getColor0d7_KjU = textLayoutResult5.layoutInput.style.m996getColor0d7_KjU();
                        Color color = new Color(m996getColor0d7_KjU);
                        if (m996getColor0d7_KjU == 16) {
                            color = null;
                        }
                        long j4 = color != null ? color.value : Color.Black;
                        androidPaint.m659setColor8_81llA(Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j4) * 0.2f, j4, 14));
                        int originalToTransformed3 = offsetMapping.originalToTransformed(TextRange.m990getMinimpl(j2));
                        int originalToTransformed4 = offsetMapping.originalToTransformed(TextRange.m989getMaximpl(j2));
                        if (originalToTransformed3 != originalToTransformed4) {
                            canvas.drawPath(textLayoutResult5.getPathForRange(originalToTransformed3, originalToTransformed4), androidPaint);
                        }
                    } else if (!TextRange.m987getCollapsedimpl(textFieldValue3.selection)) {
                        androidPaint.m659setColor8_81llA(j3);
                        long j5 = textFieldValue3.selection;
                        int originalToTransformed5 = offsetMapping.originalToTransformed(TextRange.m990getMinimpl(j5));
                        int originalToTransformed6 = offsetMapping.originalToTransformed(TextRange.m989getMaximpl(j5));
                        if (originalToTransformed5 != originalToTransformed6) {
                            canvas.drawPath(textLayoutResult5.getPathForRange(originalToTransformed5, originalToTransformed6), androidPaint);
                        }
                    }
                    DimensionKt.paint(canvas, textLayoutResult5);
                }
                return Unit.INSTANCE;
            case 8:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                AnnotatedString.Range range2 = (AnnotatedString.Range) obj3;
                SpanStyle spanStyle = (SpanStyle) obj2;
                AnnotatedString.Range range3 = (AnnotatedString.Range) obj;
                if (ref$BooleanRef.element) {
                    Object obj5 = range3.item;
                    int i8 = range3.end;
                    int i9 = range3.start;
                    if ((obj5 instanceof SpanStyle) && i9 == range2.start && i8 == range2.end) {
                        if (spanStyle == null) {
                            spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65535);
                        }
                        range = new AnnotatedString.Range(spanStyle, i9, i8);
                        ref$BooleanRef.element = range2.equals(range3);
                        return range;
                    }
                }
                range = range3;
                ref$BooleanRef.element = range2.equals(range3);
                return range;
            case 9:
                Function1 function1 = (Function1) obj3;
                TextInputSession textInputSession = (TextInputSession) ((Ref$ObjectRef) obj2).element;
                TextFieldValue apply = ((Recorder.AnonymousClass1) obj4).apply((List) obj);
                if (textInputSession != null) {
                    textInputSession.updateState(null, apply);
                }
                function1.invoke(apply);
                return Unit.INSTANCE;
            case 10:
                TextFieldKeyInput textFieldKeyInput = (TextFieldKeyInput) obj3;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj2;
                TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
                switch (((KeyCommand) obj4).ordinal()) {
                    case 0:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (!TextRange.m987getCollapsedimpl(textFieldPreparedSelection.selection)) {
                                boolean isLtr = textFieldPreparedSelection.isLtr();
                                long j6 = textFieldPreparedSelection.selection;
                                if (!isLtr) {
                                    int m989getMaximpl = TextRange.m989getMaximpl(j6);
                                    textFieldPreparedSelection.setSelection(m989getMaximpl, m989getMaximpl);
                                    break;
                                } else {
                                    int m990getMinimpl = TextRange.m990getMinimpl(j6);
                                    textFieldPreparedSelection.setSelection(m990getMinimpl, m990getMinimpl);
                                    break;
                                }
                            } else {
                                textFieldPreparedSelection.moveCursorLeft();
                                break;
                            }
                        }
                        break;
                    case 1:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (!TextRange.m987getCollapsedimpl(textFieldPreparedSelection.selection)) {
                                boolean isLtr2 = textFieldPreparedSelection.isLtr();
                                long j7 = textFieldPreparedSelection.selection;
                                if (!isLtr2) {
                                    int m990getMinimpl2 = TextRange.m990getMinimpl(j7);
                                    textFieldPreparedSelection.setSelection(m990getMinimpl2, m990getMinimpl2);
                                    break;
                                } else {
                                    int m989getMaximpl2 = TextRange.m989getMaximpl(j7);
                                    textFieldPreparedSelection.setSelection(m989getMaximpl2, m989getMaximpl2);
                                    break;
                                }
                            } else {
                                textFieldPreparedSelection.moveCursorRight();
                                break;
                            }
                        }
                        break;
                    case 2:
                        TextPreparedSelectionState textPreparedSelectionState = textFieldPreparedSelection.state;
                        textPreparedSelectionState.cachedX = null;
                        AnnotatedString annotatedString = textFieldPreparedSelection.annotatedString;
                        String str = annotatedString.text;
                        String str2 = annotatedString.text;
                        if (str.length() > 0) {
                            if (!textFieldPreparedSelection.isLtr()) {
                                textPreparedSelectionState.cachedX = null;
                                if (str2.length() > 0 && (previousWordOffset = textFieldPreparedSelection.getPreviousWordOffset()) != null) {
                                    int intValue = previousWordOffset.intValue();
                                    textFieldPreparedSelection.setSelection(intValue, intValue);
                                    break;
                                }
                            } else {
                                textPreparedSelectionState.cachedX = null;
                                if (str2.length() > 0 && (nextWordOffset = textFieldPreparedSelection.getNextWordOffset()) != null) {
                                    int intValue2 = nextWordOffset.intValue();
                                    textFieldPreparedSelection.setSelection(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        TextPreparedSelectionState textPreparedSelectionState2 = textFieldPreparedSelection.state;
                        textPreparedSelectionState2.cachedX = null;
                        AnnotatedString annotatedString2 = textFieldPreparedSelection.annotatedString;
                        String str3 = annotatedString2.text;
                        String str4 = annotatedString2.text;
                        if (str3.length() > 0) {
                            if (!textFieldPreparedSelection.isLtr()) {
                                textPreparedSelectionState2.cachedX = null;
                                if (str4.length() > 0 && (nextWordOffset2 = textFieldPreparedSelection.getNextWordOffset()) != null) {
                                    int intValue3 = nextWordOffset2.intValue();
                                    textFieldPreparedSelection.setSelection(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                textPreparedSelectionState2.cachedX = null;
                                if (str4.length() > 0 && (previousWordOffset2 = textFieldPreparedSelection.getPreviousWordOffset()) != null) {
                                    int intValue4 = previousWordOffset2.intValue();
                                    textFieldPreparedSelection.setSelection(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 5:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 8:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (!textFieldPreparedSelection.isLtr()) {
                                textFieldPreparedSelection.moveCursorToLineEnd();
                                break;
                            } else {
                                textFieldPreparedSelection.moveCursorToLineStart();
                                break;
                            }
                        }
                        break;
                    case 9:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (!textFieldPreparedSelection.isLtr()) {
                                textFieldPreparedSelection.moveCursorToLineStart();
                                break;
                            } else {
                                textFieldPreparedSelection.moveCursorToLineEnd();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResult = textFieldPreparedSelection.layoutResult) != null) {
                            int jumpByLinesOffset = textFieldPreparedSelection.jumpByLinesOffset(textLayoutResult, -1);
                            textFieldPreparedSelection.setSelection(jumpByLinesOffset, jumpByLinesOffset);
                            break;
                        }
                        break;
                    case 11:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResult2 = textFieldPreparedSelection.layoutResult) != null) {
                            int jumpByLinesOffset2 = textFieldPreparedSelection.jumpByLinesOffset(textLayoutResult2, 1);
                            textFieldPreparedSelection.setSelection(jumpByLinesOffset2, jumpByLinesOffset2);
                            break;
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResultProxy = textFieldPreparedSelection.layoutResultProxy) != null) {
                            int jumpByPagesOffset = textFieldPreparedSelection.jumpByPagesOffset(textLayoutResultProxy, -1);
                            textFieldPreparedSelection.setSelection(jumpByPagesOffset, jumpByPagesOffset);
                            break;
                        }
                        break;
                    case 14:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResultProxy2 = textFieldPreparedSelection.layoutResultProxy) != null) {
                            int jumpByPagesOffset2 = textFieldPreparedSelection.jumpByPagesOffset(textLayoutResultProxy2, 1);
                            textFieldPreparedSelection.setSelection(jumpByPagesOffset2, jumpByPagesOffset2);
                            break;
                        }
                        break;
                    case 15:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            textFieldPreparedSelection.setSelection(0, 0);
                            break;
                        }
                        break;
                    case 16:
                        textFieldPreparedSelection.state.cachedX = null;
                        AnnotatedString annotatedString3 = textFieldPreparedSelection.annotatedString;
                        if (annotatedString3.text.length() > 0) {
                            int length = annotatedString3.text.length();
                            textFieldPreparedSelection.setSelection(length, length);
                            break;
                        }
                        break;
                    case 17:
                        textFieldKeyInput.selectionManager.copy$foundation(false);
                        break;
                    case 18:
                        textFieldKeyInput.selectionManager.paste$foundation();
                        break;
                    case 19:
                        textFieldKeyInput.selectionManager.cut$foundation();
                        break;
                    case 20:
                        List deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(i4));
                        if (deleteIfSelectedOr != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr);
                            break;
                        }
                        break;
                    case 21:
                        List deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(i3));
                        if (deleteIfSelectedOr2 != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr2);
                            break;
                        }
                        break;
                    case 22:
                        List deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(19));
                        if (deleteIfSelectedOr3 != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr3);
                            break;
                        }
                        break;
                    case 23:
                        List deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(20));
                        if (deleteIfSelectedOr4 != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr4);
                            break;
                        }
                        break;
                    case 24:
                        List deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(21));
                        if (deleteIfSelectedOr5 != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr5);
                            break;
                        }
                        break;
                    case 25:
                        List deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new BasicTextKt$$ExternalSyntheticLambda14(22));
                        if (deleteIfSelectedOr6 != null) {
                            textFieldKeyInput.apply(deleteIfSelectedOr6);
                            break;
                        }
                        break;
                    case 26:
                        textFieldPreparedSelection.state.cachedX = null;
                        AnnotatedString annotatedString4 = textFieldPreparedSelection.annotatedString;
                        if (annotatedString4.text.length() > 0) {
                            textFieldPreparedSelection.setSelection(0, annotatedString4.text.length());
                            break;
                        }
                        break;
                    case 27:
                        textFieldPreparedSelection.moveCursorLeft();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 28:
                        textFieldPreparedSelection.moveCursorRight();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 29:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResult3 = textFieldPreparedSelection.layoutResult) != null) {
                            int jumpByLinesOffset3 = textFieldPreparedSelection.jumpByLinesOffset(textLayoutResult3, -1);
                            textFieldPreparedSelection.setSelection(jumpByLinesOffset3, jumpByLinesOffset3);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 30:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResult4 = textFieldPreparedSelection.layoutResult) != null) {
                            int jumpByLinesOffset4 = textFieldPreparedSelection.jumpByLinesOffset(textLayoutResult4, 1);
                            textFieldPreparedSelection.setSelection(jumpByLinesOffset4, jumpByLinesOffset4);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 31:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResultProxy3 = textFieldPreparedSelection.layoutResultProxy) != null) {
                            int jumpByPagesOffset3 = textFieldPreparedSelection.jumpByPagesOffset(textLayoutResultProxy3, -1);
                            textFieldPreparedSelection.setSelection(jumpByPagesOffset3, jumpByPagesOffset3);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 32:
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0 && (textLayoutResultProxy4 = textFieldPreparedSelection.layoutResultProxy) != null) {
                            int jumpByPagesOffset4 = textFieldPreparedSelection.jumpByPagesOffset(textLayoutResultProxy4, 1);
                            textFieldPreparedSelection.setSelection(jumpByPagesOffset4, jumpByPagesOffset4);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            textFieldPreparedSelection.setSelection(0, 0);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 34:
                        textFieldPreparedSelection.state.cachedX = null;
                        AnnotatedString annotatedString5 = textFieldPreparedSelection.annotatedString;
                        if (annotatedString5.text.length() > 0) {
                            int length2 = annotatedString5.text.length();
                            textFieldPreparedSelection.setSelection(length2, length2);
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 35:
                        TextPreparedSelectionState textPreparedSelectionState3 = textFieldPreparedSelection.state;
                        textPreparedSelectionState3.cachedX = null;
                        AnnotatedString annotatedString6 = textFieldPreparedSelection.annotatedString;
                        String str5 = annotatedString6.text;
                        String str6 = annotatedString6.text;
                        if (str5.length() > 0) {
                            if (textFieldPreparedSelection.isLtr()) {
                                textPreparedSelectionState3.cachedX = null;
                                if (str6.length() > 0 && (previousWordOffset3 = textFieldPreparedSelection.getPreviousWordOffset()) != null) {
                                    int intValue5 = previousWordOffset3.intValue();
                                    textFieldPreparedSelection.setSelection(intValue5, intValue5);
                                }
                            } else {
                                textPreparedSelectionState3.cachedX = null;
                                if (str6.length() > 0 && (nextWordOffset3 = textFieldPreparedSelection.getNextWordOffset()) != null) {
                                    int intValue6 = nextWordOffset3.intValue();
                                    textFieldPreparedSelection.setSelection(intValue6, intValue6);
                                }
                            }
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 36:
                        TextPreparedSelectionState textPreparedSelectionState4 = textFieldPreparedSelection.state;
                        textPreparedSelectionState4.cachedX = null;
                        AnnotatedString annotatedString7 = textFieldPreparedSelection.annotatedString;
                        String str7 = annotatedString7.text;
                        String str8 = annotatedString7.text;
                        if (str7.length() > 0) {
                            if (textFieldPreparedSelection.isLtr()) {
                                textPreparedSelectionState4.cachedX = null;
                                if (str8.length() > 0 && (nextWordOffset4 = textFieldPreparedSelection.getNextWordOffset()) != null) {
                                    int intValue7 = nextWordOffset4.intValue();
                                    textFieldPreparedSelection.setSelection(intValue7, intValue7);
                                }
                            } else {
                                textPreparedSelectionState4.cachedX = null;
                                if (str8.length() > 0 && (previousWordOffset4 = textFieldPreparedSelection.getPreviousWordOffset()) != null) {
                                    int intValue8 = previousWordOffset4.intValue();
                                    textFieldPreparedSelection.setSelection(intValue8, intValue8);
                                }
                            }
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 41:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (textFieldPreparedSelection.isLtr()) {
                                textFieldPreparedSelection.moveCursorToLineStart();
                            } else {
                                textFieldPreparedSelection.moveCursorToLineEnd();
                            }
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 42:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            if (textFieldPreparedSelection.isLtr()) {
                                textFieldPreparedSelection.moveCursorToLineEnd();
                            } else {
                                textFieldPreparedSelection.moveCursorToLineStart();
                            }
                        }
                        textFieldPreparedSelection.selectMovement();
                        break;
                    case 43:
                        textFieldPreparedSelection.state.cachedX = null;
                        if (textFieldPreparedSelection.annotatedString.text.length() > 0) {
                            long j8 = textFieldPreparedSelection.selection;
                            int i10 = TextRange.$r8$clinit;
                            int i11 = (int) (j8 & BodyPartID.bodyIdMax);
                            textFieldPreparedSelection.setSelection(i11, i11);
                            break;
                        }
                        break;
                    case 44:
                        if (!textFieldKeyInput.singleLine) {
                            textFieldKeyInput.apply(CollectionsKt__CollectionsJVMKt.listOf(new CommitTextCommand("\n", 1)));
                            break;
                        } else {
                            ref$BooleanRef2.element = textFieldKeyInput.state.onImeActionPerformedWithResult.f$0.keyboardActionRunner.m358runActionKlQnJC8(textFieldKeyInput.imeAction);
                            break;
                        }
                    case 45:
                        if (!textFieldKeyInput.singleLine) {
                            textFieldKeyInput.apply(CollectionsKt__CollectionsJVMKt.listOf(new CommitTextCommand("\t", 1)));
                            break;
                        } else {
                            ref$BooleanRef2.element = false;
                            break;
                        }
                    case 46:
                        UndoManager undoManager = textFieldKeyInput.undoManager;
                        if (undoManager != null) {
                            undoManager.makeSnapshot(TextFieldValue.m1001copy3r_uNRQ$default(textFieldPreparedSelection.currentValue, textFieldPreparedSelection.annotatedString, textFieldPreparedSelection.selection, 4));
                        }
                        UndoManager undoManager2 = textFieldKeyInput.undoManager;
                        if (undoManager2 != null) {
                            Recorder.AnonymousClass1 anonymousClass12 = undoManager2.undoStack;
                            if (anonymousClass12 == null || (anonymousClass1 = (Recorder.AnonymousClass1) anonymousClass12.val$videoEncoderSession) == null) {
                                textFieldValue = null;
                            } else {
                                undoManager2.undoStack = anonymousClass1;
                                undoManager2.storedCharacters -= ((TextFieldValue) anonymousClass12.this$0).annotatedString.text.length();
                                undoManager2.redoStack = new Recorder.AnonymousClass1(i4, undoManager2.redoStack, (TextFieldValue) anonymousClass12.this$0);
                                textFieldValue = (TextFieldValue) anonymousClass1.this$0;
                            }
                            if (textFieldValue != null) {
                                textFieldKeyInput.onValueChange.invoke(textFieldValue);
                                break;
                            }
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = textFieldKeyInput.undoManager;
                        if (undoManager3 != null) {
                            Recorder.AnonymousClass1 anonymousClass13 = undoManager3.redoStack;
                            if (anonymousClass13 != null) {
                                undoManager3.redoStack = (Recorder.AnonymousClass1) anonymousClass13.val$videoEncoderSession;
                                TextFieldValue textFieldValue4 = (TextFieldValue) anonymousClass13.this$0;
                                undoManager3.undoStack = new Recorder.AnonymousClass1(i4, undoManager3.undoStack, textFieldValue4);
                                undoManager3.storedCharacters = textFieldValue4.annotatedString.text.length() + undoManager3.storedCharacters;
                                textFieldValue2 = (TextFieldValue) anonymousClass13.this$0;
                            } else {
                                textFieldValue2 = null;
                            }
                            if (textFieldValue2 != null) {
                                textFieldKeyInput.onValueChange.invoke(textFieldValue2);
                                break;
                            }
                        }
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                return Unit.INSTANCE;
            case 11:
                Context context = (Context) obj3;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj2;
                ContextMenuScope contextMenuScope = (ContextMenuScope) obj;
                List list = ((TextContextMenuData) obj4).components;
                int size = list.size();
                int i12 = 0;
                while (i12 < size) {
                    TextContextMenuComponent textContextMenuComponent = (TextContextMenuComponent) list.get(i12);
                    if (textContextMenuComponent instanceof TextContextMenuItem) {
                        TextContextMenuItem textContextMenuItem = (TextContextMenuItem) textContextMenuComponent;
                        ContextMenuScope.item$default(contextMenuScope, new HintHandler$$ExternalSyntheticLambda0(textContextMenuItem, 7), textContextMenuItem.leadingIcon == 0 ? null : new ComposableLambdaImpl(new TooltipKt$animateTooltip$2(textContextMenuItem, i7), true, -1930700965), new DialogHostKt$$ExternalSyntheticLambda0(i4, textContextMenuItem, textContextMenuSession), 6);
                    } else {
                        if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                            TextContextMenuTextClassificationItem textContextMenuTextClassificationItem = (TextContextMenuTextClassificationItem) textContextMenuComponent;
                            if (context != null) {
                                int i13 = textContextMenuTextClassificationItem.index;
                                TextClassification textClassification = textContextMenuTextClassificationItem.textClassification;
                                if (i13 < 0) {
                                    HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(textClassification, 8);
                                    Drawable icon = textClassification.getIcon();
                                    ContextMenuScope.item$default(contextMenuScope, hintHandler$$ExternalSyntheticLambda0, icon != null ? new ComposableLambdaImpl(new TooltipKt$animateTooltip$2(icon, i6), true, -1123224187) : null, new DialogHostKt$$ExternalSyntheticLambda0(i3, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = textClassification.getActions().get(i13);
                                    boolean z4 = i13 == 0;
                                    HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda02 = new HintHandler$$ExternalSyntheticLambda0(remoteAction, 9);
                                    if (z4 || remoteAction.shouldShowIcon()) {
                                        i = 3;
                                        composableLambdaImpl = new ComposableLambdaImpl(new TooltipKt$animateTooltip$2(remoteAction, i), true, -1261173016);
                                    } else {
                                        composableLambdaImpl = null;
                                        i = 3;
                                    }
                                    ContextMenuScope.item$default(contextMenuScope, hintHandler$$ExternalSyntheticLambda02, composableLambdaImpl, new Threads$$ExternalSyntheticLambda1(remoteAction, 26), 6);
                                }
                            }
                        } else {
                            i = 3;
                            if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                                contextMenuScope.composables.add(ContextMenuPopupPositionProviderKt.f2lambda$1455401925);
                            }
                        }
                        i12++;
                        i6 = 2;
                    }
                    i = 3;
                    i12++;
                    i6 = 2;
                }
                return Unit.INSTANCE;
            case 12:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj4;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj3;
                ref$LongRef.element = SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m630getBottomCenterF1C5BW0());
                ((Ref$LongRef) obj2).element = 0L;
                textFieldSelectionState.setInTouchMode(true);
                LayoutCoordinates textLayoutCoordinates = textFieldSelectionState.getTextLayoutCoordinates();
                Recorder$$ExternalSyntheticOutline1.m(textLayoutCoordinates != null ? textLayoutCoordinates.mo843localToWindowMKHz9U(0L) : 9205357640488583168L, textFieldSelectionState.startTextLayoutPositionInWindow$delegate);
                textFieldSelectionState.m422updateHandleDraggingUv8p0NA(Handle.Cursor, ref$LongRef.element);
                return Unit.INSTANCE;
            case 13:
                TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) obj3;
                TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12 textFieldDecoratorModifierNode$$ExternalSyntheticLambda12 = (TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12) obj2;
                Offset offset = (Offset) obj;
                ((DialogHostKt$$ExternalSyntheticLambda0) obj4).invoke();
                boolean z5 = textFieldSelectionState2.enabled;
                TextLayoutState textLayoutState = textFieldSelectionState2.textLayoutState;
                if (z5 && textFieldSelectionState2.isFocused) {
                    if (!textFieldSelectionState2.readOnly) {
                        textFieldDecoratorModifierNode$$ExternalSyntheticLambda12.invoke();
                        if (textFieldSelectionState2.textFieldState.getVisualText().text.length() > 0) {
                            textFieldSelectionState2.setShowCursorHandle(true);
                        }
                    }
                    textFieldSelectionState2.setTextToolbarState(TextToolbarState.None);
                    textFieldSelectionState2.m421placeCursorAtNearestOffsetk4lQ0M(MathUtilsKt.m397fromDecorationToTextLayoutUv8p0NA(textLayoutState, textLayoutState.m409coercedInVisibleBoundsOfInputTextMKHz9U$foundation(offset.packedValue)));
                }
                return Unit.INSTANCE;
            case 14:
                TextFieldSelectionState textFieldSelectionState3 = (TextFieldSelectionState) obj4;
                final CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Context context2 = (Context) obj2;
                TextContextMenuBuilderScope textContextMenuBuilderScope = (TextContextMenuBuilderScope) obj;
                textContextMenuBuilderScope.separator();
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean z6 = !TextRange.m987getCollapsedimpl(textFieldSelectionState3.textFieldState.getVisualText().selection) && textFieldSelectionState3.getEditable$foundation();
                Continuation continuation = null;
                final TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 = new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState3, continuation, z2 ? 1 : 0);
                Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i14 = i7;
                        Function1 function12 = textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        switch (i14) {
                            case 0:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                TextToolbarState textToolbarState = TextToolbarState.None;
                int i14 = 6;
                BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems, z6, new n3$$ExternalSyntheticLambda0(function0, continuation, textFieldSelectionState3, textToolbarState, i14));
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z7 = !TextRange.m987getCollapsedimpl(textFieldSelectionState3.textFieldState.getVisualText().selection);
                final TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$12 = new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState3, continuation, i7);
                BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems2, z7, new n3$$ExternalSyntheticLambda0(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i7;
                        Function1 function12 = textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$12;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        switch (i142) {
                            case 0:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation, textFieldSelectionState3, textToolbarState, i14));
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                if (textFieldSelectionState3.getEditable$foundation()) {
                    if (textFieldSelectionState3.clipboardPasteState._hasText) {
                        z = true;
                        final TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$13 = new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState3, continuation, i6);
                        BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems3, z, new n3$$ExternalSyntheticLambda0(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i7;
                                Function1 function12 = textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$13;
                                CoroutineScope coroutineScope2 = coroutineScope;
                                switch (i142) {
                                    case 0:
                                        JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                        break;
                                    default:
                                        JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, continuation, textFieldSelectionState3, textToolbarState, 6));
                        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                        TransformedTextFieldState transformedTextFieldState = textFieldSelectionState3.textFieldState;
                        BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems4, TextRange.m988getLengthimpl(transformedTextFieldState.getVisualText().selection) == transformedTextFieldState.getVisualText().text.length(), new n3$$ExternalSyntheticLambda0(new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, i6), new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, z2 ? 1 : 0), textFieldSelectionState3, TextToolbarState.Selection, 6));
                        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                        if (textFieldSelectionState3.getEditable$foundation() && TextRange.m987getCollapsedimpl(textFieldSelectionState3.textFieldState.getVisualText().selection)) {
                            z2 = true;
                        }
                        BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems5, z2, new n3$$ExternalSyntheticLambda0(new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, i5), continuation, textFieldSelectionState3, textToolbarState, 6));
                        textContextMenuBuilderScope.separator();
                        return Unit.INSTANCE;
                    }
                    Function0 function02 = textFieldSelectionState3.receiveContentConfiguration;
                    if (function02 != null) {
                        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(function02.invoke());
                    }
                }
                z = false;
                final Function1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$132 = new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState3, continuation, i6);
                BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems3, z, new n3$$ExternalSyntheticLambda0(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i7;
                        Function1 function12 = textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$132;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        switch (i142) {
                            case 0:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation, textFieldSelectionState3, textToolbarState, 6));
                TextContextMenuItems textContextMenuItems42 = TextContextMenuItems.SelectAll;
                TransformedTextFieldState transformedTextFieldState2 = textFieldSelectionState3.textFieldState;
                if (TextRange.m988getLengthimpl(transformedTextFieldState2.getVisualText().selection) == transformedTextFieldState2.getVisualText().text.length()) {
                }
                BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems42, TextRange.m988getLengthimpl(transformedTextFieldState2.getVisualText().selection) == transformedTextFieldState2.getVisualText().text.length(), new n3$$ExternalSyntheticLambda0(new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, i6), new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, z2 ? 1 : 0), textFieldSelectionState3, TextToolbarState.Selection, 6));
                TextContextMenuItems textContextMenuItems52 = TextContextMenuItems.Autofill;
                if (textFieldSelectionState3.getEditable$foundation()) {
                    z2 = true;
                }
                BasicTextKt.textItem(textContextMenuBuilderScope, context2.getResources(), textContextMenuItems52, z2, new n3$$ExternalSyntheticLambda0(new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState3, i5), continuation, textFieldSelectionState3, textToolbarState, 6));
                textContextMenuBuilderScope.separator();
                return Unit.INSTANCE;
            case 15:
                Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) obj2;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (((MouseSelectionObserver) obj4).mo119onDrag3MmeM6k(pointerInputChange.position, (SelectionAdjustment$Companion$$ExternalSyntheticLambda0) obj3)) {
                    pointerInputChange.consume();
                    ref$BooleanRef3.element = true;
                }
                return Unit.INSTANCE;
            case 16:
                final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj4;
                final CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                Context context3 = (Context) obj2;
                TextContextMenuBuilderScope textContextMenuBuilderScope2 = (TextContextMenuBuilderScope) obj;
                textContextMenuBuilderScope2.separator();
                TextContextMenuItems textContextMenuItems6 = TextContextMenuItems.Cut;
                boolean z8 = (TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection) || !textFieldSelectionManager.getEditable() || textFieldSelectionManager.clipboard == null) ? false : true;
                final TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3 = new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, objArr7 == true ? 1 : 0, i7);
                final int i15 = z2 ? 1 : 0;
                BasicTextKt.textItem(textContextMenuBuilderScope2, context3.getResources(), textContextMenuItems6, z8, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i15;
                        Function1 function12 = textFieldSelectionManager$contextMenuAreaModifier$3;
                        CoroutineScope coroutineScope22 = coroutineScope2;
                        switch (i142) {
                            case 0:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, objArr6 == true ? 1 : 0, i7));
                TextContextMenuItems textContextMenuItems7 = TextContextMenuItems.Copy;
                boolean z9 = (TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection) || textFieldSelectionManager.clipboard == null) ? false : true;
                final TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$32 = new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, objArr5 == true ? 1 : 0, i6);
                final int i16 = z2 ? 1 : 0;
                BasicTextKt.textItem(textContextMenuBuilderScope2, context3.getResources(), textContextMenuItems7, z9, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i16;
                        Function1 function12 = textFieldSelectionManager$contextMenuAreaModifier$32;
                        CoroutineScope coroutineScope22 = coroutineScope2;
                        switch (i142) {
                            case 0:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, objArr4 == true ? 1 : 0, i7));
                TextContextMenuItems textContextMenuItems8 = TextContextMenuItems.Paste;
                boolean z10 = textFieldSelectionManager.getEditable() && ((Boolean) textFieldSelectionManager.hasAvailableTextToPaste$delegate.getValue()).booleanValue() && textFieldSelectionManager.clipboard != null;
                final TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$33 = new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, objArr3 == true ? 1 : 0, i5);
                final int i17 = z2 ? 1 : 0;
                BasicTextKt.textItem(textContextMenuBuilderScope2, context3.getResources(), textContextMenuItems8, z10, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i17;
                        Function1 function12 = textFieldSelectionManager$contextMenuAreaModifier$33;
                        CoroutineScope coroutineScope22 = coroutineScope2;
                        switch (i142) {
                            case 0:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 3), 1);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope22, null, CoroutineStart.UNDISPATCHED, new GLThread$launch$1(function12, null, 2), 1);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, objArr2 == true ? 1 : 0, i7));
                TextContextMenuItems textContextMenuItems9 = TextContextMenuItems.SelectAll;
                boolean z11 = TextRange.m988getLengthimpl(textFieldSelectionManager.getValue$foundation().selection) != textFieldSelectionManager.getValue$foundation().annotatedString.text.length();
                final int i18 = z2 ? 1 : 0;
                BasicTextKt.textItem(textContextMenuBuilderScope2, context3.getResources(), textContextMenuItems9, z11, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i19 = i7;
                        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                        switch (i19) {
                            case 0:
                                break;
                            case 1:
                                TextFieldValue m455createTextFieldValueFDrldGo = TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation().annotatedString, SizeKt.TextRange(0, textFieldSelectionManager2.getValue$foundation().annotatedString.text.length()));
                                textFieldSelectionManager2.onValueChange.invoke(m455createTextFieldValueFDrldGo);
                                long j9 = m455createTextFieldValueFDrldGo.selection;
                                textFieldSelectionManager2.latestSelection = new TextRange(j9);
                                textFieldSelectionManager2.oldValue = TextFieldValue.m1001copy3r_uNRQ$default(textFieldSelectionManager2.oldValue, (AnnotatedString) null, j9, 5);
                                textFieldSelectionManager2.enterSelectionMode$foundation(true);
                                break;
                            default:
                                Function0 function03 = textFieldSelectionManager2.requestAutofillAction;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i19 = i18;
                        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                        switch (i19) {
                            case 0:
                                break;
                            case 1:
                                TextFieldValue m455createTextFieldValueFDrldGo = TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation().annotatedString, SizeKt.TextRange(0, textFieldSelectionManager2.getValue$foundation().annotatedString.text.length()));
                                textFieldSelectionManager2.onValueChange.invoke(m455createTextFieldValueFDrldGo);
                                long j9 = m455createTextFieldValueFDrldGo.selection;
                                textFieldSelectionManager2.latestSelection = new TextRange(j9);
                                textFieldSelectionManager2.oldValue = TextFieldValue.m1001copy3r_uNRQ$default(textFieldSelectionManager2.oldValue, (AnnotatedString) null, j9, 5);
                                textFieldSelectionManager2.enterSelectionMode$foundation(true);
                                break;
                            default:
                                Function0 function03 = textFieldSelectionManager2.requestAutofillAction;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, i7));
                TextContextMenuItems textContextMenuItems10 = TextContextMenuItems.Autofill;
                if (textFieldSelectionManager.getEditable() && TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection)) {
                    z3 = true;
                }
                BasicTextKt.textItem(textContextMenuBuilderScope2, context3.getResources(), textContextMenuItems10, z3, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i19 = i6;
                        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                        switch (i19) {
                            case 0:
                                break;
                            case 1:
                                TextFieldValue m455createTextFieldValueFDrldGo = TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation().annotatedString, SizeKt.TextRange(0, textFieldSelectionManager2.getValue$foundation().annotatedString.text.length()));
                                textFieldSelectionManager2.onValueChange.invoke(m455createTextFieldValueFDrldGo);
                                long j9 = m455createTextFieldValueFDrldGo.selection;
                                textFieldSelectionManager2.latestSelection = new TextRange(j9);
                                textFieldSelectionManager2.oldValue = TextFieldValue.m1001copy3r_uNRQ$default(textFieldSelectionManager2.oldValue, (AnnotatedString) null, j9, 5);
                                textFieldSelectionManager2.enterSelectionMode$foundation(true);
                                break;
                            default:
                                Function0 function03 = textFieldSelectionManager2.requestAutofillAction;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, objArr == true ? 1 : 0, i7));
                textContextMenuBuilderScope2.separator();
                return Unit.INSTANCE;
            case 17:
                DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) obj3;
                Placeable placeable = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                boolean isLookingAhead = ((MeasureScope) obj4).isLookingAhead();
                AnchoredDraggableState anchoredDraggableState = draggableAnchorsNode.state;
                float positionOf = isLookingAhead ? anchoredDraggableState.getAnchors().positionOf(((DerivedSnapshotState) draggableAnchorsNode.state.targetValue$delegate).getValue()) : anchoredDraggableState.requireOffset();
                Orientation orientation = draggableAnchorsNode.orientation;
                float f2 = orientation == Orientation.Horizontal ? positionOf : 0.0f;
                if (orientation != Orientation.Vertical) {
                    positionOf = 0.0f;
                }
                placementScope.place(placeable, MathKt__MathJVMKt.roundToInt(f2), MathKt__MathJVMKt.roundToInt(positionOf), RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 18:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new PageFetcher$flow$1((DraggableState) obj2, (MutableState) obj4, objArr8 == true ? 1 : 0, i5), 3);
                return Unit.INSTANCE;
            case 19:
                return invoke$androidx$compose$material3$OutlinedTextFieldKt$$ExternalSyntheticLambda1(obj);
            case 20:
                return invoke$androidx$compose$material3$internal$BasicTooltipKt$$ExternalSyntheticLambda6(obj);
            case 21:
                return invoke$androidx$compose$material3$internal$DraggableAnchorsNodeV2$$ExternalSyntheticLambda0(obj);
            case 22:
                return invoke$androidx$lifecycle$compose$LifecycleEffectKt$$ExternalSyntheticLambda1(obj);
            case 23:
                return invoke$androidx$media3$ui$compose$PlayerSurfaceKt$$ExternalSyntheticLambda7(obj);
            case 24:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                snapshotStateList.add(navBackStackEntry);
                return new OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1(i6, (DialogNavigator) obj2, navBackStackEntry, snapshotStateList);
            case 25:
                return invoke$androidx$navigation$fragment$FragmentNavigator$$ExternalSyntheticLambda4(obj);
            case 26:
                return invoke$app$cash$badging$backend$RealBadger2$performClear$2$$ExternalSyntheticLambda0(obj);
            case 27:
                return invoke$app$cash$local$backend$real$BuyerIntentSyncManager$$ExternalSyntheticLambda0(obj);
            case 28:
                return invoke$app$cash$local$backend$real$CalculateLineItemsManager$$ExternalSyntheticLambda0(obj);
            default:
                MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj4;
                Long l = (Long) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBytes(0, marketTilesScreen != null ? (byte[]) ((BlockersConfig.Adapter) localTabContentQueries.local_tab_contentAdapter).target_balance_amountAdapter.encode(marketTilesScreen) : null);
                androidStatement.bindLong(1, l);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Object obj, Object obj2, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = mutableState;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Ref$FloatRef ref$FloatRef, ScrollScope scrollScope, Ref$FloatRef ref$FloatRef2, DefaultFlingBehavior defaultFlingBehavior) {
        this.$r8$classId = 6;
        this.f$0 = ref$FloatRef;
        this.f$1 = scrollScope;
        this.f$2 = ref$FloatRef2;
    }
}
