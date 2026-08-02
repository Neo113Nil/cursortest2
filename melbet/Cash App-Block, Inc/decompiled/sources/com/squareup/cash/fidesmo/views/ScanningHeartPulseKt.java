package com.squareup.cash.fidesmo.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.stripe.android.uicore.elements.compat.CompatConstantsKt;
import com.stripe.android.uicore.elements.compat.TextFieldMeasurePolicy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ScanningHeartPulseKt {
    public static final void ScanningHeartPulse(Modifier modifier, ScanningHeartPulseParams scanningHeartPulseParams, ScanningStepAnimationTrigger scanningStepAnimationTrigger, Integer num, float f, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-444330400);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(scanningHeartPulseParams) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(scanningStepAnimationTrigger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function03) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer = gapComposer2;
            ScanningShapePulseKt.ScanningShapePulse(modifier, ScanningShapePulseParams.m3551copyXu8qxI8$default(ScanningShapePulseKt.defaultScanningShapePulseParams(FidesmoScanningPulseShape.HEART), scanningHeartPulseParams.alignment, scanningHeartPulseParams.offsetX, scanningHeartPulseParams.offsetY, scanningHeartPulseParams.heartSize, scanningHeartPulseParams.heartScale, scanningHeartPulseParams.primaryOpacity, scanningHeartPulseParams.fillDurationSeconds, scanningHeartPulseParams.beatDurationSeconds, scanningHeartPulseParams.glowScale, scanningHeartPulseParams.glowAlpha, scanningHeartPulseParams.glowBlur, scanningHeartPulseParams.glowPulseAmount, scanningHeartPulseParams.glowPulseDurationSeconds, scanningHeartPulseParams.cellSize, scanningHeartPulseParams.gap, scanningHeartPulseParams.cornerRadius, scanningHeartPulseParams.spread, scanningHeartPulseParams.twinkleSpeed, scanningHeartPulseParams.targetFillDurationSeconds, scanningHeartPulseParams.targetShapeScaleBoost, scanningHeartPulseParams.targetHoldMillis, scanningHeartPulseParams.targetSpringDamping, scanningHeartPulseParams.targetSpringStiffness, scanningHeartPulseParams.stepTurnRotationDegrees, scanningHeartPulseParams.stepTurnMaxTurnsPerSpring, scanningHeartPulseParams.stepTurnOrbPeakScale, scanningHeartPulseParams.stepTurnHoldMillis, scanningHeartPulseParams.orbTurnDamping, scanningHeartPulseParams.orbTurnStiffness, scanningHeartPulseParams.heartTurnDamping, scanningHeartPulseParams.heartTurnStiffness, scanningHeartPulseParams.orbReturnDamping, scanningHeartPulseParams.orbReturnStiffness, scanningHeartPulseParams.stabilityAnimationParams, 1, 0), scanningStepAnimationTrigger, num, f, function0, function02, function03, gapComposer, i2 & 33554318);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda3(modifier, scanningHeartPulseParams, scanningStepAnimationTrigger, num, f, function0, function02, function03, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    public static final void TextFieldLayout(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function3 function3, Function2 function22, Function2 function23, boolean z, float f, PaddingValuesImpl paddingValuesImpl, Composer composer, int i) {
        int i2;
        Function3 function32;
        Function2 function24;
        ComposableLambdaImpl composableLambdaImpl2;
        BiasAlignment biasAlignment;
        LayoutDirection layoutDirection;
        boolean z2;
        Function3 function33;
        boolean z3;
        Modifier.Companion companion;
        BiasAlignment biasAlignment2;
        boolean z4;
        ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl;
        PaddingValuesImpl paddingValuesImpl2 = paddingValuesImpl;
        BiasAlignment biasAlignment3 = Alignment.Companion.TopStart;
        BiasAlignment biasAlignment4 = Alignment.Companion.Center;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-666417589);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function23) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer.changed(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer.changed(paddingValuesImpl2) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z5 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValuesImpl2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection2 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, textFieldMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            int i3 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (function22 != null) {
                gapComposer.startReplaceGroup(691004869);
                biasAlignment = biasAlignment3;
                Modifier then = RulerKt.layoutId(companion2, "Leading").then(CompatConstantsKt.IconDefaultSizeModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                layoutDirection = layoutDirection2;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z2 = false;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 12) & 14, function22, gapComposer, true, false);
            } else {
                biasAlignment = biasAlignment3;
                layoutDirection = layoutDirection2;
                z2 = false;
                gapComposer.startReplaceGroup(688119296);
                gapComposer.end(false);
            }
            if (function23 != null) {
                gapComposer.startReplaceGroup(691288643);
                Modifier then2 = RulerKt.layoutId(companion2, "Trailing").then(CompatConstantsKt.IconDefaultSizeModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, z2);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                SVG$Unit$EnumUnboxingLocalUtility.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 15) & 14, function23, gapComposer, true, false);
            } else {
                gapComposer.startReplaceGroup(688119296);
                gapComposer.end(z2);
            }
            paddingValuesImpl2 = paddingValuesImpl;
            LayoutDirection layoutDirection3 = layoutDirection;
            float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValuesImpl2, layoutDirection3);
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValuesImpl2, layoutDirection3);
            if (function22 != null) {
                calculateStartPadding -= CompatConstantsKt.HorizontalIconPadding;
                if (calculateStartPadding < RecyclerView.DECELERATION_RATE) {
                    calculateStartPadding = 0.0f;
                }
            }
            float f2 = calculateStartPadding;
            if (function23 != null) {
                calculateEndPadding -= CompatConstantsKt.HorizontalIconPadding;
                if (calculateEndPadding < RecyclerView.DECELERATION_RATE) {
                    calculateEndPadding = 0.0f;
                }
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, f2, RecyclerView.DECELERATION_RATE, calculateEndPadding, RecyclerView.DECELERATION_RATE, 10);
            if (function3 != null) {
                gapComposer.startReplaceGroup(692289509);
                Function3 function34 = function3;
                function34.invoke(RulerKt.layoutId(companion2, "Hint").then(m302paddingqDBjuR0$default), gapComposer, Integer.valueOf((i3 >> 6) & 112));
                z3 = false;
                function33 = function34;
            } else {
                function33 = function3;
                z3 = false;
                gapComposer.startReplaceGroup(688119296);
            }
            gapComposer.end(z3);
            if (function2 != null) {
                gapComposer.startReplaceGroup(692411463);
                Modifier then3 = RulerKt.layoutId(companion2, "Label").then(m302paddingqDBjuR0$default);
                biasAlignment2 = biasAlignment;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, z3);
                companion = companion2;
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, then3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                SVG$Unit$EnumUnboxingLocalUtility.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                function24 = function2;
                z4 = true;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 6) & 14, function24, gapComposer, true, false);
            } else {
                companion = companion2;
                boolean z6 = z3;
                biasAlignment2 = biasAlignment;
                z4 = true;
                function24 = function2;
                gapComposer.startReplaceGroup(688119296);
                gapComposer.end(z6);
            }
            Modifier then4 = RulerKt.layoutId(companion, "TextField").then(m302paddingqDBjuR0$default);
            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, z4);
            int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, then4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
            ?? r2 = composableLambdaImpl;
            r2.invoke(gapComposer, Integer.valueOf((i3 >> 3) & 14));
            gapComposer.end(true);
            gapComposer.end(true);
            composableLambdaImpl2 = r2;
            function32 = function33;
        } else {
            function32 = function3;
            function24 = function2;
            gapComposer.skipToGroupEnd();
            composableLambdaImpl2 = composableLambdaImpl3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldKt$$ExternalSyntheticLambda1(modifier, composableLambdaImpl2, function24, function32, function22, function23, z, f, paddingValuesImpl2, i);
        }
    }

    /* renamed from: access$calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m3539access$calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValuesImpl paddingValuesImpl) {
        float f2 = 4.0f * f;
        float f3 = paddingValuesImpl.top * f;
        float f4 = paddingValuesImpl.bottom * f;
        int max = Math.max(i, i5);
        return Math.max(MathKt__MathJVMKt.roundToInt(z ? i2 + f2 + max + f4 : f3 + max + f4), Math.max(Math.max(i3, i4), Constraints.m1026getMinHeightimpl(j)));
    }

    public static final Object access$getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static int zza(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
