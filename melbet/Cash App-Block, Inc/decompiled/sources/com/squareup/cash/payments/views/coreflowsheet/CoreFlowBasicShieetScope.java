package com.squareup.cash.payments.views.coreflowsheet;

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
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.compose.elements.MarkdownCodeKt$$ExternalSyntheticLambda4;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda8;
import com.squareup.util.compose.SquircleShape;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class CoreFlowBasicShieetScope {
    public final SharedTransitionScope sharedTransitionScope;
    public final CoreFlowRealSheetState state;
    public final AnimatedVisibilityScope visibilityScope;

    public CoreFlowBasicShieetScope(CoreFlowRealSheetState coreFlowRealSheetState, AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope) {
        coreFlowRealSheetState.getClass();
        this.state = coreFlowRealSheetState;
        this.visibilityScope = animatedVisibilityScope;
        this.sharedTransitionScope = sharedTransitionScope;
    }

    /* renamed from: Dimmer-3J-VO9M, reason: not valid java name */
    public final void m3707Dimmer3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        Modifier modifier2;
        float progress;
        Modifier modifier3;
        Modifier then;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1070687079);
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
            CoreFlowRealSheetState coreFlowRealSheetState = this.state;
            boolean isReadyToBeDisplayed = coreFlowRealSheetState.isReadyToBeDisplayed();
            AnchoredDraggableState anchoredDraggableState = coreFlowRealSheetState.draggableState;
            if (isReadyToBeDisplayed) {
                progress = coreFlowRealSheetState.isReadyToBeDisplayed() ? anchoredDraggableState.progress(CoreFlowSheetPosition.Hidden, ((CoreFlowSheetPeekPosition$FixedHeight) coreFlowRealSheetState.peekPosition$delegate.getValue()) != null ? CoreFlowSheetPosition.Peeking : CoreFlowSheetPosition.Expanded) : 0.0f;
            } else {
                progress = 1.0f;
            }
            Modifier modifier4 = Modifier.Companion.$$INSTANCE;
            if (progress > RecyclerView.DECELERATION_RATE) {
                AnimatedVisibilityScope animatedVisibilityScope = this.visibilityScope;
                if (animatedVisibilityScope.getTransition().transitionState.getCurrentState() != EnterExitState.PostExit) {
                    gapComposer.startReplaceGroup(-2111115167);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier4, 1.0f);
                    EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(coreFlowRealSheetState.enterAnimationSpec$views(), 2);
                    SpringSpec springSpec = coreFlowRealSheetState.exitAnimationSpec;
                    if (springSpec == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                        throw null;
                    }
                    Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, fillMaxSize, fadeIn$default, EnterExitTransitionKt.fadeOut$default(springSpec, 2), 4);
                    SharedTransitionScope sharedTransitionScope = this.sharedTransitionScope;
                    if (sharedTransitionScope == null) {
                        gapComposer.startReplaceGroup(-2110869244);
                        gapComposer.end(false);
                        modifier3 = modifier4;
                    } else {
                        gapComposer.startReplaceGroup(-2110813630);
                        modifier3 = modifier4;
                        modifier4 = SharedTransitionScope.sharedElement$default(sharedTransitionScope, modifier3, sharedTransitionScope.rememberSharedContentState(SharedElementKey.Dimmer, gapComposer, 6), animatedVisibilityScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        gapComposer.end(false);
                    }
                    Modifier then2 = animateEnterExit$default.then(modifier4);
                    boolean changed = gapComposer.changed(progress) | ((i3 & 14) == 4);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DividerKt$$ExternalSyntheticLambda0(j, progress, 4);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier drawBehind = ClipKt.drawBehind(then2, (Function1) rememberedValue2);
                    boolean z = ((CoreFlowUserDismissMode) coreFlowRealSheetState.userDismissMode$delegate.getValue()).tapOutside && anchoredDraggableState.getAnchors().size != 0;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                    boolean changedInstance = gapComposer.changedInstance(coroutineScope) | ((i3 & 896) == 256);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ProfileKt$$ExternalSyntheticLambda11(2, coroutineScope, this);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(drawBehind, mutableInteractionSourceImpl, null, z, null, null, (Function0) rememberedValue4, 24);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(1);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    then = m182clickableO2vRcR0$default.then(new Draggable2DElement(new Recorder.AnonymousClass3((Function1) rememberedValue5)));
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(2);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    BoxKt.Box(SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue6), gapComposer, 0);
                    gapComposer.end(false);
                    modifier2 = modifier3;
                }
            }
            modifier3 = modifier4;
            gapComposer.startReplaceGroup(-2109811090);
            gapComposer.end(false);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 8, j, modifier2, (Object) this);
        }
    }

    /* renamed from: DragHandle-9Us8nR8, reason: not valid java name */
    public final void m3708DragHandle9Us8nR8(long j, Modifier modifier, long j2, RoundedCornerShape roundedCornerShape, Composer composer, int i) {
        long j3;
        long m1091DpSizeYgX7TsA;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(47208497);
        int i2 = i | (gapComposer.changed(j) ? 4 : 2) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(roundedCornerShape) ? 2048 : 1024);
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
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda8(this, j, modifier, j3, roundedCornerShape, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* renamed from: SheetContainer-ZPw9REg$views, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3709SheetContainerZPw9REg$views(long j, SquircleShape squircleShape, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        SquircleShape squircleShape2;
        Modifier modifier2;
        int i3;
        SharedTransitionScope.SharedContentState sharedContentState;
        final int i4;
        Modifier.Companion companion;
        int i5;
        Modifier sharedBounds$default;
        SharedTransitionScope sharedTransitionScope;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        boolean changed;
        Object rememberedValue;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(715088773);
        int i7 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            squircleShape2 = squircleShape;
            i2 |= gapComposer.changed(squircleShape2) ? 32 : 16;
        } else {
            squircleShape2 = squircleShape;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        int i8 = i2 | 3072;
        if ((i & 24576) == 0) {
            i8 |= gapComposer.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i8 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= gapComposer.changed(this) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i8 & 1, (599187 & i8) != 599186)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            ValueInsets valueInsets = Arrangement$End$1.current(gapComposer).statusBarsIgnoringVisibility;
            CoreFlowRealSheetState coreFlowRealSheetState = this.state;
            AnimatedCornerShape animatedCornerShape = new AnimatedCornerShape((Integer) coreFlowRealSheetState.contentHeightPx$delegate.getValue(), (Integer) coreFlowRealSheetState.viewportHeightPx$delegate.getValue(), (Offset) coreFlowRealSheetState.contentPositionInWindow$delegate.getValue(), coreFlowRealSheetState, squircleShape2, valueInsets);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1114867687, new PoolToastKt$$ExternalSyntheticLambda0(27, this, animatedCornerShape, composableLambdaImpl2), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-594303271, new PdfPreviewViewKt$$ExternalSyntheticLambda0(i7, this, composableLambdaImpl), gapComposer);
            SharedTransitionScope sharedTransitionScope2 = this.sharedTransitionScope;
            if (sharedTransitionScope2 == null) {
                gapComposer.startReplaceGroup(174160327);
                gapComposer.end(false);
                i3 = i8;
                sharedContentState = null;
            } else {
                gapComposer.startReplaceGroup(174190645);
                i3 = i8;
                SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope2.rememberSharedContentState(SharedElementKey.Container, gapComposer, 6);
                gapComposer.end(false);
                sharedContentState = rememberSharedContentState;
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 640.0f, 1), 1.0f);
            int i9 = i3 & 3670016;
            boolean z2 = i9 == 1048576;
            Object rememberedValue2 = gapComposer.rememberedValue();
            boolean z3 = z2;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                i4 = 0;
                rememberedValue2 = new Function1(this) { // from class: com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope$$ExternalSyntheticLambda2
                    public final /* synthetic */ CoreFlowBasicShieetScope f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i10 = i4;
                        CoreFlowBasicShieetScope coreFlowBasicShieetScope = this.f$0;
                        switch (i10) {
                            case 0:
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                reusableGraphicsLayerScope.getClass();
                                reusableGraphicsLayerScope.setAlpha(coreFlowBasicShieetScope.state.isReadyToBeDisplayed() ? 1.0f : RecyclerView.DECELERATION_RATE);
                                return Unit.INSTANCE;
                            case 1:
                                ((Density) obj).getClass();
                                AnchoredDraggableState anchoredDraggableState = coreFlowBasicShieetScope.state.draggableState;
                                anchoredDraggableState.getClass();
                                float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
                                Float valueOf = Float.valueOf(floatValue);
                                if (Math.abs(floatValue) > Float.MAX_VALUE) {
                                    valueOf = null;
                                }
                                return new IntOffset(valueOf != null ? MathKt__MathJVMKt.roundToInt(valueOf.floatValue()) & BodyPartID.bodyIdMax : 0L);
                            default:
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                                layoutCoordinates.getClass();
                                coreFlowBasicShieetScope.state.contentPositionInWindow$delegate.setValue(new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                i4 = 0;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue2);
            int i10 = i9 == 1048576 ? 1 : i4;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (i10 != 0 || rememberedValue3 == neverEqualPolicy) {
                final int i11 = 1;
                rememberedValue3 = new Function1(this) { // from class: com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope$$ExternalSyntheticLambda2
                    public final /* synthetic */ CoreFlowBasicShieetScope f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i102 = i11;
                        CoreFlowBasicShieetScope coreFlowBasicShieetScope = this.f$0;
                        switch (i102) {
                            case 0:
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                reusableGraphicsLayerScope.getClass();
                                reusableGraphicsLayerScope.setAlpha(coreFlowBasicShieetScope.state.isReadyToBeDisplayed() ? 1.0f : RecyclerView.DECELERATION_RATE);
                                return Unit.INSTANCE;
                            case 1:
                                ((Density) obj).getClass();
                                AnchoredDraggableState anchoredDraggableState = coreFlowBasicShieetScope.state.draggableState;
                                anchoredDraggableState.getClass();
                                float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
                                Float valueOf = Float.valueOf(floatValue);
                                if (Math.abs(floatValue) > Float.MAX_VALUE) {
                                    valueOf = null;
                                }
                                return new IntOffset(valueOf != null ? MathKt__MathJVMKt.roundToInt(valueOf.floatValue()) & BodyPartID.bodyIdMax : 0L);
                            default:
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                                layoutCoordinates.getClass();
                                coreFlowBasicShieetScope.state.contentPositionInWindow$delegate.setValue(new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier offset = OffsetKt.offset(graphicsLayer, (Function1) rememberedValue3);
            boolean z4 = i9 == 1048576;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                final int i12 = 2;
                rememberedValue4 = new Function1(this) { // from class: com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope$$ExternalSyntheticLambda2
                    public final /* synthetic */ CoreFlowBasicShieetScope f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i102 = i12;
                        CoreFlowBasicShieetScope coreFlowBasicShieetScope = this.f$0;
                        switch (i102) {
                            case 0:
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                reusableGraphicsLayerScope.getClass();
                                reusableGraphicsLayerScope.setAlpha(coreFlowBasicShieetScope.state.isReadyToBeDisplayed() ? 1.0f : RecyclerView.DECELERATION_RATE);
                                return Unit.INSTANCE;
                            case 1:
                                ((Density) obj).getClass();
                                AnchoredDraggableState anchoredDraggableState = coreFlowBasicShieetScope.state.draggableState;
                                anchoredDraggableState.getClass();
                                float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
                                Float valueOf = Float.valueOf(floatValue);
                                if (Math.abs(floatValue) > Float.MAX_VALUE) {
                                    valueOf = null;
                                }
                                return new IntOffset(valueOf != null ? MathKt__MathJVMKt.roundToInt(valueOf.floatValue()) & BodyPartID.bodyIdMax : 0L);
                            default:
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                                layoutCoordinates.getClass();
                                coreFlowBasicShieetScope.state.contentPositionInWindow$delegate.setValue(new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier then = RulerKt.onPlaced(offset, (Function1) rememberedValue4).then(coreFlowRealSheetState.draggableState.getAnchors().size == 0 ? companion2 : Draggable2DKt.anchoredDraggable$default(NestedScrollModifierKt.nestedScroll(companion2, coreFlowRealSheetState.nestedScrollConnection, null), coreFlowRealSheetState.draggableState, Orientation.Vertical, false, null, 60));
            FiniteAnimationSpec enterAnimationSpec$views = coreFlowRealSheetState.enterAnimationSpec$views();
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                companion = companion2;
                i5 = 1;
                rememberedValue5 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                companion = companion2;
                i5 = 1;
            }
            EnterTransitionImpl slideInVertically = EnterExitTransitionKt.slideInVertically(enterAnimationSpec$views, (Function1) rememberedValue5);
            SpringSpec springSpec = coreFlowRealSheetState.exitAnimationSpec;
            if (springSpec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                throw null;
            }
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new SvgDecoder$$ExternalSyntheticLambda0(i5);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            ExitTransitionImpl slideOutVertically = EnterExitTransitionKt.slideOutVertically(springSpec, (Function1) rememberedValue6);
            AnimatedVisibilityScope animatedVisibilityScope = this.visibilityScope;
            Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, then, slideInVertically, slideOutVertically, 4);
            if (sharedTransitionScope2 == null) {
                sharedTransitionScope = sharedTransitionScope2;
                sharedBounds$default = companion;
                modifier3 = sharedBounds$default;
            } else {
                sharedContentState.getClass();
                SharedTransitionScope.ResizeMode.Companion.getClass();
                sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope2, companion, sharedContentState, animatedVisibilityScope, null, ExitTransitionImpl.None, null, RemeasureImpl.INSTANCE, null, 980);
                sharedTransitionScope = sharedTransitionScope2;
                modifier3 = companion;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(animateEnterExit$default.then(sharedBounds$default), j, animatedCornerShape);
            if (sharedContentState != null) {
                z = true;
                if (sharedContentState.isMatchFound()) {
                    sharedTransitionScope.getClass();
                    modifier4 = sharedTransitionScope.skipToLookaheadSize(modifier3, new SharedTransitionScope$skipToLookaheadSize$1(sharedTransitionScope, 0));
                    Modifier then2 = m177backgroundbw27NRU.then(modifier4);
                    boolean changed2 = gapComposer.changed(valueInsets);
                    if (i9 != 1048576) {
                        z = false;
                    }
                    changed = changed2 | z | gapComposer.changed(animatedCornerShape);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == neverEqualPolicy) {
                        i6 = 0;
                        CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda15 = new CashMapViewKt$$ExternalSyntheticLambda15(valueInsets, this, rememberComposableLambda2, rememberComposableLambda, animatedCornerShape, 16);
                        gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda15);
                        rememberedValue = cashMapViewKt$$ExternalSyntheticLambda15;
                    } else {
                        i6 = 0;
                    }
                    RulerKt.SubcomposeLayout(then2, (Function2) rememberedValue, gapComposer, i6, i6);
                    modifier2 = modifier3;
                }
            } else {
                z = true;
            }
            modifier4 = modifier3;
            Modifier then22 = m177backgroundbw27NRU.then(modifier4);
            boolean changed22 = gapComposer.changed(valueInsets);
            if (i9 != 1048576) {
            }
            changed = changed22 | z | gapComposer.changed(animatedCornerShape);
            rememberedValue = gapComposer.rememberedValue();
            if (changed) {
            }
            i6 = 0;
            CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda152 = new CashMapViewKt$$ExternalSyntheticLambda15(valueInsets, this, rememberComposableLambda2, rememberComposableLambda, animatedCornerShape, 16);
            gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda152);
            rememberedValue = cashMapViewKt$$ExternalSyntheticLambda152;
            RulerKt.SubcomposeLayout(then22, (Function2) rememberedValue, gapComposer, i6, i6);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownCodeKt$$ExternalSyntheticLambda4(this, j, squircleShape, composableLambdaImpl, modifier2, composableLambdaImpl2, i);
        }
    }
}
