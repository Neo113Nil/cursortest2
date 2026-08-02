package com.squareup.cash.crypto.common.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FloatTweenSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.DrawingCheckpoint;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.SegmentedCircleDrawScope;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.common.composeui.SegmentedCircleKt$SegmentedCircle$3$1$1;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class BitcoinP2pConversionPercentageViewKt {
    public static final ComposableLambdaImpl lambda$147432236 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(22), false, 147432236);

    public static final void BitcoinP2pConversionPercentage(BitcoinP2pConversionPercentageViewModel bitcoinP2pConversionPercentageViewModel, Function1 function1, Composer composer, int i) {
        bitcoinP2pConversionPercentageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1986909636);
        int i2 = (gapComposer.changedInstance(bitcoinP2pConversionPercentageViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bitcoinP2pConversionPercentageViewModel instanceof BitcoinP2pConversionPercentageViewModel.Content;
            Strings.LoadableFullScreenContent(bitcoinP2pConversionPercentageViewModel, !z, null, null, null, Expect_jvmKt.rememberComposableLambda(528078428, new SetPinViewKt$$ExternalSyntheticLambda4(28, function1), gapComposer), gapComposer, (i2 & 14) | 196608, 28);
            if (z) {
                gapComposer.startReplaceGroup(-1840273461);
                BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel = ((BitcoinP2pConversionPercentageViewModel.Content) bitcoinP2pConversionPercentageViewModel).exceededMaxAlert;
                if (alertModel == null) {
                    gapComposer.startReplaceGroup(-1213902442);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1213902441);
                    boolean z2 = (i2 & 112) == 32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(24, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ExceededMaxAlertDialog(alertModel, (Function0) rememberedValue, gapComposer, 0);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1213799490);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinP2pConversionPercentageView$$ExternalSyntheticLambda1(bitcoinP2pConversionPercentageViewModel, function1, i);
        }
    }

    public static final void ContentScreen(final BitcoinP2pConversionPercentageViewModel.Content content, final Function1 function1, Composer composer, int i) {
        int i2;
        BitcoinP2pConversionPercentageViewModel.Content content2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1551760130);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            final SegmentedCircleInteractableState m3501rememberSegmentedCircleInteractableStatekHDZbjc = VisibleKt.m3501rememberSegmentedCircleInteractableStatekHDZbjc(gapComposer);
            float f = content.selectedPercentageBps / 10000.0f;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, ((Boolean) mutableState.getValue()).booleanValue() ? new SnapSpec(0) : new FloatTweenSpec(500, (Easing) null, 6), "percentageAnimation", null, gapComposer, 3072, 20);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            final long j = colors.semantic.background.brand;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            final long j2 = colors2.semantic.background.subtle;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1304108762, new BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5(content, function1, i3), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1950307253, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(3, content, function1), gapComposer);
            Function3 function3 = new Function3() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Arrangement$Top$1 arrangement$Top$1;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ScrollingScaffoldContentScope) obj).getClass();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, horizontal, gapComposer2, 54);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                        ComposeUiNode.Companion.getClass();
                        Function0 function0 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function0);
                        } else {
                            gapComposer2.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer2, 48);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function0);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        SegmentedCircleConfig.SizingConfig.Fixed fixed = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(6.0f, gapComposer2));
                        SegmentedCircleConfig.SizingConfig.Percentage percentage = new SegmentedCircleConfig.SizingConfig.Percentage(0.015f);
                        BitcoinP2pConversionPercentageViewModel.Content content3 = BitcoinP2pConversionPercentageViewModel.Content.this;
                        final SegmentedCircleConfig segmentedCircleConfig = new SegmentedCircleConfig(fixed, null, percentage, content3.accessibilityLabel, 0L, Color.Transparent, null, null, Expect_jvmKt.rememberComposableLambda(-880894982, new ArcadeModal$$ExternalSyntheticLambda3(content3, 1), gapComposer2), 466);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(companion, 12.0f), 327.0f);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        MutableState mutableState2 = mutableState;
                        Object obj4 = Composer.Companion.Empty;
                        if (rememberedValue2 == obj4) {
                            arrangement$Top$1 = arrangement$Top$12;
                            rememberedValue2 = new DrawerViewKt$$ExternalSyntheticLambda2(10, mutableState2);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        } else {
                            arrangement$Top$1 = arrangement$Top$12;
                        }
                        Function0 function02 = (Function0) rememberedValue2;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj4) {
                            rememberedValue3 = new DrawerViewKt$$ExternalSyntheticLambda2(11, mutableState2);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        Function0 function03 = (Function0) rememberedValue3;
                        Function1 function13 = function1;
                        boolean changed = gapComposer2.changed(function13);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue4 == obj4) {
                            rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda3(3, function13);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Function1 function14 = (Function1) rememberedValue4;
                        Unit unit = Unit.INSTANCE;
                        final SegmentedCircleInteractableState segmentedCircleInteractableState = m3501rememberSegmentedCircleInteractableStatekHDZbjc;
                        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(m285size3ABfNKs, unit, new CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1(segmentedCircleInteractableState, function02, function03, function14, 2));
                        final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(12.0f, gapComposer2);
                        final float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer2);
                        Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, pointerInput, false);
                        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, aspectRatio);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function0);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        boolean changedInstance = gapComposer2.changedInstance(segmentedCircleConfig);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue5 == obj4) {
                            rememberedValue5 = new SegmentedCircleKt$SegmentedCircle$3$1$1(segmentedCircleConfig, 1);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        Modifier then = SemanticsModifierKt.semantics(fillMaxSize2, false, (Function1) rememberedValue5).then(companion);
                        final long j3 = j2;
                        final long j4 = j;
                        final State state = animateFloatAsState;
                        CanvasKt.Canvas(0, gapComposer2, then, new Function1() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$ContentScreen$lambda$6$0$0$$inlined$SegmentedCircle$2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                DrawScope drawScope = (DrawScope) obj5;
                                drawScope.getClass();
                                SegmentedCircleConfig segmentedCircleConfig2 = SegmentedCircleConfig.this;
                                float strokeWidth = VisibleKt.strokeWidth(segmentedCircleConfig2.strokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                                float strokeWidth2 = VisibleKt.strokeWidth(segmentedCircleConfig2.backgroundStrokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                                long floatToRawIntBits = (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(r2) & BodyPartID.bodyIdMax);
                                float f2 = 1.33f * strokeWidth * 2.0f;
                                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2;
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                                long floatToRawIntBits3 = (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(r3) & BodyPartID.bodyIdMax);
                                float f3 = (strokeWidth / 2.0f) * 2.0f;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f3;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f3;
                                long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope, segmentedCircleConfig2.backgroundColor, floatToRawIntBits, floatToRawIntBits2, Fill.INSTANCE, 104);
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope, segmentedCircleConfig2.segmentsBackgroundColor, floatToRawIntBits3, floatToRawIntBits4, new Stroke(strokeWidth2, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                                SegmentedCircleDrawScope segmentedCircleDrawScope = new SegmentedCircleDrawScope(drawScope, strokeWidth, floatToRawIntBits3, floatToRawIntBits4, segmentedCircleConfig2, segmentedCircleInteractableState, m3477toPx8Feqmps, m3477toPx8Feqmps2);
                                float gapBetweenSegments = segmentedCircleDrawScope.getGapBetweenSegments();
                                float floatValue = ((Number) state.getValue()).floatValue() * 360.0f;
                                float f4 = 360.0f - floatValue;
                                if (f4 > gapBetweenSegments) {
                                    segmentedCircleDrawScope.m3479drawSegmentArcAgEwaKs(((gapBetweenSegments / 2.0f) + floatValue) - 90.0f, f4 - gapBetweenSegments, 1, j3);
                                }
                                if (floatValue > gapBetweenSegments) {
                                    segmentedCircleDrawScope.m3480drawSelectedSegmentArcGxzWYVk((gapBetweenSegments / 2.0f) - 90.0f, floatValue - gapBetweenSegments, j4, 1, new DrawingCheckpoint(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()).saveLayer(null, null)));
                                }
                                segmentedCircleConfig2.debugSettings.getClass();
                                return Unit.INSTANCE;
                            }
                        });
                        Modifier fillMaxSize3 = SizeKt.fillMaxSize(VisibleKt.layoutWithConfig(segmentedCircleConfig), 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize3);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function0);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                        segmentedCircleConfig.innerContent.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                        gapComposer2.end(true);
                        gapComposer2.end(true);
                        gapComposer2.end(true);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
                        int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, companion);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function0);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                        InputChipKt.InputChipGrid(null, 3, Expect_jvmKt.rememberComposableLambda(525850544, new BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5(content3, function13, 1), gapComposer2), gapComposer2, 432, 1);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        gapComposer2.end(true);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            content2 = content;
            function12 = function1;
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, null, rememberComposableLambda, rememberComposableLambda2, Expect_jvmKt.rememberComposableLambda(-191516220, function3, gapComposer), gapComposer, 224256, 7);
        } else {
            content2 = content;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(content2, function12, i, 29);
        }
    }

    public static final void ExceededMaxAlertDialog(BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-932595603);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(alertModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            function02 = function0;
            ModalKt.Dimmer(null, function02, null, Expect_jvmKt.rememberComposableLambda(2123468390, new BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda3(alertModel, function0), gapComposer), gapComposer, (i3 & 112) | 3072, 5);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(alertModel, function02, i, i2);
        }
    }

    /* renamed from: access$angleAndQuadrant-3MmeM6k, reason: not valid java name */
    public static final AngleAndQuadrant m3509access$angleAndQuadrant3MmeM6k(int i, long j) {
        float f = i / 2.0f;
        int i2 = (int) (j >> 32);
        float abs = Math.abs(Float.intBitsToFloat(i2) - f);
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        float degrees = (float) Math.toDegrees((float) Math.atan2(abs, Math.abs(Float.intBitsToFloat(i3) - f)));
        return (Float.intBitsToFloat(i3) >= f || Float.intBitsToFloat(i2) < f) ? (Float.intBitsToFloat(i3) < f || Float.intBitsToFloat(i2) < f) ? (Float.intBitsToFloat(i3) < f || Float.intBitsToFloat(i2) >= f) ? new AngleAndQuadrant((360.0f - degrees) / 360.0f, Quadrant.TOP_LEFT) : new AngleAndQuadrant((degrees + 180.0f) / 360.0f, Quadrant.BOTTOM_LEFT) : new AngleAndQuadrant((180.0f - degrees) / 360.0f, Quadrant.BOTTOM_RIGHT) : new AngleAndQuadrant(degrees / 360.0f, Quadrant.TOP_RIGHT);
    }
}
