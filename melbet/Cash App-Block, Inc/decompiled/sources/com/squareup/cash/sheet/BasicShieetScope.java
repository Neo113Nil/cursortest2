package com.squareup.cash.sheet;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScope$skipToLookaheadSize$1;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.UnionInsets;
import androidx.compose.foundation.layout.ValueInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.util.compose.SquircleShape;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class BasicShieetScope {
    public final SharedTransitionScope sharedTransitionScope;
    public final RealSheetState state;
    public final AnimatedVisibilityScope visibilityScope;

    public static Unit $r8$lambda$K2BZHpBj_ElAgx1dLnSHGb4jBpI(View view, CoroutineScope coroutineScope, BasicShieetScope basicShieetScope) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.hide(WindowInsets.Type.ime());
            }
        } else {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
        JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge.AnonymousClass1(basicShieetScope, (Continuation) null, 20), 3);
        return Unit.INSTANCE;
    }

    public BasicShieetScope(RealSheetState realSheetState, AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope) {
        this.state = realSheetState;
        this.visibilityScope = animatedVisibilityScope;
        this.sharedTransitionScope = sharedTransitionScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* renamed from: Dimmer-3J-VO9M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3745Dimmer3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        Modifier modifier2;
        float progress;
        Modifier then;
        RealSheetState realSheetState = this.state;
        AnchoredDraggableState anchoredDraggableState = realSheetState.draggableState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1672338867);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            if (realSheetState.isReadyToBeDisplayed()) {
                DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
                SheetPosition sheetPosition = SheetPosition.Hidden;
                if (anchors.hasPositionFor(sheetPosition)) {
                    DefaultDraggableAnchors anchors2 = anchoredDraggableState.getAnchors();
                    SheetPosition sheetPosition2 = SheetPosition.Peeking;
                    if (!anchors2.hasPositionFor(sheetPosition2)) {
                        sheetPosition2 = SheetPosition.Expanded;
                    }
                    progress = realSheetState.isReadyToBeDisplayed() ? anchoredDraggableState.progress(sheetPosition, sheetPosition2) : 0.0f;
                    Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                    if (progress > RecyclerView.DECELERATION_RATE) {
                        AnimatedVisibilityScope animatedVisibilityScope = this.visibilityScope;
                        if (animatedVisibilityScope.getTransition().transitionState.getCurrentState() != EnterExitState.PostExit) {
                            gapComposer.startReplaceGroup(1922820496);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
                            SpringSpec springSpec = realSheetState.enterAnimationSpec;
                            if (springSpec == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("enterAnimationSpec");
                                throw null;
                            }
                            EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(springSpec, 2);
                            SpringSpec springSpec2 = realSheetState.exitAnimationSpec;
                            if (springSpec2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                                throw null;
                            }
                            Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, fillMaxSize, fadeIn$default, EnterExitTransitionKt.fadeOut$default(springSpec2, 2), 4);
                            SharedTransitionScope sharedTransitionScope = this.sharedTransitionScope;
                            int i4 = 6;
                            if (sharedTransitionScope == null) {
                                gapComposer.startReplaceGroup(1923049958);
                                gapComposer.end(false);
                                modifier2 = modifier3;
                            } else {
                                gapComposer.startReplaceGroup(1923105572);
                                modifier2 = modifier3;
                                modifier3 = SharedTransitionScope.sharedElement$default(sharedTransitionScope, modifier2, sharedTransitionScope.rememberSharedContentState(SharedElementKey.Dimmer, gapComposer, 6), animatedVisibilityScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                gapComposer.end(false);
                            }
                            Modifier then2 = animateEnterExit$default.then(modifier3);
                            boolean changed = ((i3 & 14) == 4) | gapComposer.changed(progress);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changed || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new DividerKt$$ExternalSyntheticLambda0(j, progress, i4);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            Modifier drawBehind = ClipKt.drawBehind(then2, (Function1) rememberedValue2);
                            boolean z = ((UserDismissMode) realSheetState.userDismissMode$delegate.getValue()).tapOutsideDismiss && anchoredDraggableState.getAnchors().size != 0;
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                            }
                            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                            boolean changedInstance = gapComposer.changedInstance(view) | gapComposer.changedInstance(coroutineScope) | ((i3 & 896) == 256);
                            Object rememberedValue4 = gapComposer.rememberedValue();
                            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new BasicShieetScope$$ExternalSyntheticLambda10(0, view, coroutineScope, this);
                                gapComposer.updateRememberedValue(rememberedValue4);
                            }
                            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(drawBehind, mutableInteractionSourceImpl, null, z, null, null, (Function0) rememberedValue4, 24);
                            Object rememberedValue5 = gapComposer.rememberedValue();
                            if (rememberedValue5 == neverEqualPolicy) {
                                rememberedValue5 = new RealSheetState$$ExternalSyntheticLambda0(2);
                                gapComposer.updateRememberedValue(rememberedValue5);
                            }
                            then = m182clickableO2vRcR0$default.then(new Draggable2DElement(new Recorder.AnonymousClass3((Function1) rememberedValue5)));
                            Object rememberedValue6 = gapComposer.rememberedValue();
                            if (rememberedValue6 == neverEqualPolicy) {
                                rememberedValue6 = new RealSheetState$$ExternalSyntheticLambda0(3);
                                gapComposer.updateRememberedValue(rememberedValue6);
                            }
                            BoxKt.Box(SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue6), gapComposer, 0);
                            gapComposer.end(false);
                        }
                    }
                    modifier2 = modifier3;
                    gapComposer.startReplaceGroup(1924634864);
                    gapComposer.end(false);
                }
            }
            progress = 1.0f;
            Modifier modifier32 = Modifier.Companion.$$INSTANCE;
            if (progress > RecyclerView.DECELERATION_RATE) {
            }
            modifier2 = modifier32;
            gapComposer.startReplaceGroup(1924634864);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 0, j, modifier2, (Object) this);
        }
    }

    /* renamed from: DragHandle-9Us8nR8, reason: not valid java name */
    public final void m3746DragHandle9Us8nR8(long j, Modifier modifier, long j2, RoundedCornerShape roundedCornerShape, Composer composer, int i) {
        long j3;
        long m1091DpSizeYgX7TsA;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-46046795);
        int i2 = i | (gapComposer.changed(j) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(roundedCornerShape) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                m1091DpSizeYgX7TsA = BundleKt.m1091DpSizeYgX7TsA(36.0f, 5.0f);
            } else {
                gapComposer.skipToGroupEnd();
                m1091DpSizeYgX7TsA = j2;
            }
            gapComposer.endDefaults();
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m286size6HolHcs(m1091DpSizeYgX7TsA, SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth(modifier, 1.0f), null, 3)), j, roundedCornerShape), gapComposer, 0);
            j3 = m1091DpSizeYgX7TsA;
        } else {
            gapComposer.skipToGroupEnd();
            j3 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda8(this, j, modifier, j3, roundedCornerShape, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
    /* renamed from: SheetContainer-Pd0R-II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3747SheetContainerPd0RII(long j, SquircleShape squircleShape, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, SheetTopCornerBehavior sheetTopCornerBehavior, Function3 function3, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl3;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl4;
        SharedTransitionScope.SharedContentState sharedContentState;
        int i3;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        boolean changed;
        Object rememberedValue;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1712384238);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(squircleShape) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= gapComposer.changed(sheetTopCornerBehavior == null ? -1 : sheetTopCornerBehavior.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i5 |= gapComposer.changedInstance(function3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            composableLambdaImpl3 = composableLambdaImpl2;
            i5 |= gapComposer.changedInstance(composableLambdaImpl3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            composableLambdaImpl3 = composableLambdaImpl2;
        }
        if ((12582912 & i) == 0) {
            i5 |= gapComposer.changed(this) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 4793491) != 4793490)) {
            boolean z2 = function3 != null;
            RealSheetState realSheetState = this.state;
            realSheetState.collapsedContentEnabled$delegate.setValue(Boolean.valueOf(z2));
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            ValueInsets valueInsets = Arrangement$End$1.current(gapComposer).statusBarsIgnoringVisibility;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).ime;
            InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(new UnionInsets(Arrangement$End$1.current(gapComposer).navigationBarsIgnoringVisibility, androidWindowInsets), gapComposer);
            realSheetState.imeHeightPx$delegate.setValue(Integer.valueOf(androidWindowInsets.getInsets$foundation_layout().bottom));
            AnimatedCornerShape animatedCornerShape = new AnimatedCornerShape((Integer) realSheetState.contentHeightPx$delegate.getValue(), (Integer) realSheetState.viewportHeightPx$delegate.getValue(), (Offset) realSheetState.contentPositionInWindow$delegate.getValue(), realSheetState, squircleShape, valueInsets, sheetTopCornerBehavior);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1876594256, new BasicShieetScope$$ExternalSyntheticLambda0(asPaddingValues, animatedCornerShape, this, composableLambdaImpl3, 0), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1991713960, new BasicShieetScope$$ExternalSyntheticLambda1(0, function3, this, asPaddingValues), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-441190846, new CalloutKt$$ExternalSyntheticLambda0(22, this, composableLambdaImpl), gapComposer);
            SharedTransitionScope sharedTransitionScope = this.sharedTransitionScope;
            if (sharedTransitionScope == null) {
                gapComposer.startReplaceGroup(-1979841058);
                gapComposer.end(false);
                composableLambdaImpl4 = rememberComposableLambda;
                sharedContentState = null;
            } else {
                gapComposer.startReplaceGroup(-1979810740);
                composableLambdaImpl4 = rememberComposableLambda;
                SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(SharedElementKey.Container, gapComposer, 6);
                gapComposer.end(false);
                sharedContentState = rememberSharedContentState;
            }
            Modifier modifier5 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(modifier5, RecyclerView.DECELERATION_RATE, 640.0f, 1), 1.0f);
            int i7 = i6 & 29360128;
            boolean z3 = i7 == 8388608;
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                i3 = 0;
                rememberedValue2 = new BasicShieetScope$$ExternalSyntheticLambda3(this, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                i3 = 0;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue2);
            int i8 = i7 == 8388608 ? 1 : i3;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (i8 != 0 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BasicShieetScope$$ExternalSyntheticLambda3(this, 4);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier offset = OffsetKt.offset(graphicsLayer, (Function1) rememberedValue3);
            boolean z4 = i7 == 8388608;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new BasicShieetScope$$ExternalSyntheticLambda3(this, 5);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier then = RulerKt.onPlaced(offset, (Function1) rememberedValue4).then((!((UserDismissMode) realSheetState.userDismissMode$delegate.getValue()).dragEnabled || realSheetState.draggableState.getAnchors().size == 0) ? modifier5 : Draggable2DKt.anchoredDraggable$default(NestedScrollModifierKt.nestedScroll(modifier5, realSheetState.nestedScrollConnection, null), realSheetState.draggableState, Orientation.Vertical, false, null, 60));
            SpringSpec springSpec = realSheetState.enterAnimationSpec;
            if (springSpec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("enterAnimationSpec");
                throw null;
            }
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            EnterTransitionImpl slideInVertically = EnterExitTransitionKt.slideInVertically(springSpec, (Function1) rememberedValue5);
            SpringSpec springSpec2 = realSheetState.exitAnimationSpec;
            if (springSpec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                throw null;
            }
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            ExitTransitionImpl slideOutVertically = EnterExitTransitionKt.slideOutVertically(springSpec2, (Function1) rememberedValue6);
            AnimatedVisibilityScope animatedVisibilityScope = this.visibilityScope;
            Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, then, slideInVertically, slideOutVertically, 4);
            if (sharedTransitionScope == null) {
                modifier3 = modifier5;
            } else {
                sharedContentState.getClass();
                SharedTransitionScope.ResizeMode.Companion.getClass();
                modifier5 = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, modifier5, sharedContentState, animatedVisibilityScope, null, ExitTransitionImpl.None, null, RemeasureImpl.INSTANCE, null, 980);
                modifier3 = modifier5;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(animateEnterExit$default.then(modifier5), Color.m675copywmQWz5c$default(((Number) realSheetState.expandedContentProgress$delegate.getValue()).floatValue() * Color.m677getAlphaimpl(j), j, 14), animatedCornerShape);
            if (sharedContentState != null) {
                z = true;
                if (sharedContentState.isMatchFound()) {
                    sharedTransitionScope.getClass();
                    modifier4 = sharedTransitionScope.skipToLookaheadSize(modifier3, new SharedTransitionScope$skipToLookaheadSize$1(sharedTransitionScope, 0));
                    Modifier then2 = m177backgroundbw27NRU.then(modifier4);
                    boolean changed2 = ((i6 & 458752) != 131072 ? z : false) | gapComposer.changed(valueInsets);
                    if (i7 != 8388608) {
                        z = false;
                    }
                    changed = changed2 | z | gapComposer.changed(animatedCornerShape);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == neverEqualPolicy) {
                        i4 = 0;
                        BasicShieetKt$$ExternalSyntheticLambda0 basicShieetKt$$ExternalSyntheticLambda0 = new BasicShieetKt$$ExternalSyntheticLambda0(function3, valueInsets, this, rememberComposableLambda3, rememberComposableLambda2, composableLambdaImpl4, animatedCornerShape);
                        gapComposer.updateRememberedValue(basicShieetKt$$ExternalSyntheticLambda0);
                        rememberedValue = basicShieetKt$$ExternalSyntheticLambda0;
                    } else {
                        i4 = 0;
                    }
                    RulerKt.SubcomposeLayout(then2, (Function2) rememberedValue, gapComposer, i4, i4);
                    modifier2 = modifier3;
                }
            } else {
                z = true;
            }
            modifier4 = modifier3;
            Modifier then22 = m177backgroundbw27NRU.then(modifier4);
            boolean changed22 = ((i6 & 458752) != 131072 ? z : false) | gapComposer.changed(valueInsets);
            if (i7 != 8388608) {
            }
            changed = changed22 | z | gapComposer.changed(animatedCornerShape);
            rememberedValue = gapComposer.rememberedValue();
            if (changed) {
            }
            i4 = 0;
            BasicShieetKt$$ExternalSyntheticLambda0 basicShieetKt$$ExternalSyntheticLambda02 = new BasicShieetKt$$ExternalSyntheticLambda0(function3, valueInsets, this, rememberComposableLambda3, rememberComposableLambda2, composableLambdaImpl4, animatedCornerShape);
            gapComposer.updateRememberedValue(basicShieetKt$$ExternalSyntheticLambda02);
            rememberedValue = basicShieetKt$$ExternalSyntheticLambda02;
            RulerKt.SubcomposeLayout(then22, (Function2) rememberedValue, gapComposer, i4, i4);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda7(this, j, squircleShape, composableLambdaImpl, modifier2, sheetTopCornerBehavior, function3, composableLambdaImpl2, i);
        }
    }
}
