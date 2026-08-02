package com.squareup.cash.fidesmo.views;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.Api33Impl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_vision_face.zzcb;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda80;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.payments.presenters.QuickPayPresenter$models$3$1;
import com.squareup.util.cash.Countries;
import com.stripe.android.core.strings.ResolvableString;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ScanningShapePulseKt {
    /* renamed from: HeartFillLayer-3J-VO9M, reason: not valid java name */
    public static final void m3540HeartFillLayer3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        long j2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(135952802);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            j2 = j;
            modifier2 = modifier;
            m3546ShapeImage3IgeMak(R.drawable.fidesmo_heart_fill, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, j2, gapComposer, modifier2);
        } else {
            j2 = j;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(j2, modifier2, i, 3);
        }
    }

    /* renamed from: HeartFrameWithFillPulse-EOp_iR4, reason: not valid java name */
    public static final void m3541HeartFrameWithFillPulseEOp_iR4(Shape shape, float f, long j, List list, float f2, Modifier modifier, Composer composer, int i) {
        int i2;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2061628180);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(shape) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            float aspectRatio = f / getAspectRatio(FidesmoScanningPulseShape.HEART);
            float f3 = 0.67f * f;
            float f4 = 0.075f * aspectRatio;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(modifier, f, aspectRatio);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(boxScopeInstance.matchParentSize(), shape), Color.White, ColorKt.RectangleShape), gapComposer, 0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f5 = f3 / 1.3544973f;
            m3540HeartFillLayer3JVO9M((i2 >> 6) & 14, j, gapComposer, SizeKt.m287sizeVpY3zN4(OffsetKt.m273offsetVpY3zN4$default(boxScopeInstance.align(companion, biasAlignment), RecyclerView.DECELERATION_RATE, f4, 1), f3, f5));
            gapComposer.startReplaceGroup(-367950688);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pulse pulse = (Pulse) it.next();
                float pulseProgress = pulseProgress(f2, pulse.startProgress);
                m3540HeartFillLayer3JVO9M(0, pulse.color, gapComposer, ScaleKt.scale(SizeKt.m287sizeVpY3zN4(OffsetKt.m273offsetVpY3zN4$default(boxScopeInstance.align(companion, biasAlignment), RecyclerView.DECELERATION_RATE, f4, 1), f3, f5), pulseProgress, pulseProgress));
                biasAlignment = biasAlignment;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda9(shape, f, j, list, f2, modifier, i, 0);
        }
    }

    /* renamed from: MiniCardFillLayer-3J-VO9M, reason: not valid java name */
    public static final void m3542MiniCardFillLayer3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        long j2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1205733761);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            j2 = j;
            modifier2 = modifier;
            m3546ShapeImage3IgeMak(R.drawable.fidesmo_minicard_fill, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, j2, gapComposer, modifier2);
        } else {
            j2 = j;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(j2, modifier2, i, 5);
        }
    }

    /* renamed from: MiniCardFrameWithFillPulse-EOp_iR4, reason: not valid java name */
    public static final void m3543MiniCardFrameWithFillPulseEOp_iR4(Shape shape, float f, long j, List list, float f2, Modifier modifier, Composer composer, int i) {
        int i2;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1267982505);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(shape) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            float aspectRatio = f / getAspectRatio(FidesmoScanningPulseShape.MINI_CARD);
            float f3 = 0.76f * f;
            float f4 = f3 / 1.78125f;
            float f5 = f * RecyclerView.DECELERATION_RATE;
            float f6 = aspectRatio * RecyclerView.DECELERATION_RATE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(modifier, f, aspectRatio);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            m3542MiniCardFillLayer3JVO9M((i2 >> 6) & 14, j, gapComposer, SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(companion, biasAlignment), f5, f6), f3, f4));
            gapComposer.startReplaceGroup(222979971);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pulse pulse = (Pulse) it.next();
                float pulseProgress = pulseProgress(f2, pulse.startProgress);
                m3542MiniCardFillLayer3JVO9M(0, pulse.color, gapComposer, ScaleKt.scale(SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(companion, biasAlignment), f5, f6), f3, f4), pulseProgress, pulseProgress));
            }
            gapComposer.end(false);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(boxScopeInstance.matchParentSize(), shape), Color.White, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda9(shape, f, j, list, f2, modifier, i, 2);
        }
    }

    public static final void ScanningShapePulse(final Modifier modifier, final ScanningShapePulseParams scanningShapePulseParams, final ScanningStepAnimationTrigger scanningStepAnimationTrigger, final Integer num, final float f, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i) {
        int i2;
        Function0 function04;
        ScanningShapePulseParams scanningShapePulseParams2;
        ScanningStepAnimationTrigger scanningStepAnimationTrigger2;
        ScanningStabilityAnimation scanningStabilityAnimation;
        ScanningStabilityAnimation scanningStabilityAnimation2;
        Object anonymousClass1;
        Unit unit;
        Integer num2;
        NeverEqualPolicy neverEqualPolicy;
        Animatable animatable;
        boolean z;
        float f2;
        float f3;
        MutableFloatState mutableFloatState;
        Animatable animatable2;
        Animatable animatable3;
        float f4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1617050639);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(scanningShapePulseParams) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(scanningStepAnimationTrigger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changedInstance(function03) ? 8388608 : 4194304;
        }
        int i3 = i2;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 4793491) != 4793490)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue;
            Unit unit2 = Unit.INSTANCE;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new ToastKt$Toast$8$1(mutableFloatState2, null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue2);
            float floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
            ShapeStabilityAnimationParams shapeStabilityAnimationParams = scanningShapePulseParams.stabilityAnimationParams;
            shapeStabilityAnimationParams.getClass();
            float coerceIn = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
            if (!shapeStabilityAnimationParams.enabled || coerceIn <= RecyclerView.DECELERATION_RATE || coerceIn >= 1.0f) {
                scanningStabilityAnimation = ScanningStabilityAnimation.Idle;
            } else {
                float f5 = coerceIn * coerceIn;
                float f6 = shapeStabilityAnimationParams.minFrequencyHz;
                float sin = (float) Math.sin((((shapeStabilityAnimationParams.maxFrequencyHz - f6) * f5) + f6) * floatValue * 6.2831855f);
                float f7 = shapeStabilityAnimationParams.minRotationDegrees;
                float m = CameraState$Type$EnumUnboxingLocalUtility.m(shapeStabilityAnimationParams.maxRotationDegrees, f7, f5, f7);
                float f8 = shapeStabilityAnimationParams.minPulseScale;
                float f9 = shapeStabilityAnimationParams.maxPulseScale;
                if (f8 != f9) {
                    f8 += ((((f9 - f8) * f5) + f8) - f8) * ((sin + 1.0f) / 2.0f);
                }
                scanningStabilityAnimation = new ScanningStabilityAnimation(sin * m, f8);
            }
            ScanningStabilityAnimation scanningStabilityAnimation3 = scanningStabilityAnimation;
            int i4 = i3 >> 9;
            int i5 = i3 & 112;
            int i6 = (i4 & 14) | i5;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                scanningStabilityAnimation2 = scanningStabilityAnimation3;
                rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                scanningStabilityAnimation2 = scanningStabilityAnimation3;
            }
            Animatable animatable4 = (Animatable) rememberedValue3;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(scanningShapePulseParams, gapComposer);
            boolean changedInstance = ((((i6 & 14) ^ 6) > 4 && gapComposer.changed(num)) || (i6 & 6) == 4) | gapComposer.changedInstance(animatable4) | gapComposer.changed(rememberUpdatedState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                unit = unit2;
                num2 = num;
                neverEqualPolicy = neverEqualPolicy2;
                animatable = animatable4;
                z = false;
                anonymousClass1 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(num2, animatable, rememberUpdatedState, null, 11);
                gapComposer.updateRememberedValue(anonymousClass1);
            } else {
                num2 = num;
                anonymousClass1 = rememberedValue4;
                neverEqualPolicy = neverEqualPolicy2;
                animatable = animatable4;
                unit = unit2;
                z = false;
            }
            Updater.LaunchedEffect(gapComposer, num2, (Function2) anonymousClass1);
            float floatValue2 = ((Number) animatable.getValue()).floatValue();
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer.startReplaceGroup(-1201553326);
                ScanningShapePulseContent(modifier, interpolateTargetValues(scanningShapePulseParams, floatValue2), floatValue, ScanningStepAnimation.Idle, scanningStabilityAnimation2, gapComposer, (i3 & 14) | 3072);
                gapComposer.end(z);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i7 = 0;
                    final Integer num3 = num2;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            int i9 = i;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ScanningShapePulseKt.ScanningShapePulse(modifier, scanningShapePulseParams, scanningStepAnimationTrigger, num3, f, function0, function02, function03, (Composer) obj, Updater.updateChangedFlags(i9 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ScanningShapePulseKt.ScanningShapePulse(modifier, scanningShapePulseParams, scanningStepAnimationTrigger, num3, f, function0, function02, function03, (Composer) obj, Updater.updateChangedFlags(i9 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            function04 = function0;
            scanningShapePulseParams2 = scanningShapePulseParams;
            gapComposer.startReplaceGroup(-1201277519);
            gapComposer.end(z);
            int i8 = (i4 & 57344) | ((i3 >> 6) & 14) | i5 | (i4 & 896) | (i4 & 7168);
            Object rememberedValue5 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            if (rememberedValue5 == neverEqualPolicy3) {
                f2 = 0.01f;
                f3 = RecyclerView.DECELERATION_RATE;
                rememberedValue5 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                f2 = 0.01f;
                f3 = RecyclerView.DECELERATION_RATE;
            }
            Animatable animatable5 = (Animatable) rememberedValue5;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy3) {
                rememberedValue6 = AnimatableKt.Animatable(1.0f, f2);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Animatable animatable6 = (Animatable) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy3) {
                rememberedValue7 = Recorder$$ExternalSyntheticOutline2.m(f3, gapComposer);
            }
            MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue7;
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(scanningShapePulseParams2, gapComposer);
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(function04, gapComposer);
            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(function02, gapComposer);
            MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(function03, gapComposer);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy3) {
                rememberedValue8 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue8;
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy3) {
                rememberedValue9 = new StepTurnAnimationQueue();
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            StepTurnAnimationQueue stepTurnAnimationQueue = (StepTurnAnimationQueue) rememberedValue9;
            boolean changedInstance2 = gapComposer.changedInstance(stepTurnAnimationQueue);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue10 == neverEqualPolicy3) {
                mutableFloatState = mutableFloatState3;
                rememberedValue10 = new RecipientQueries$$ExternalSyntheticLambda0(stepTurnAnimationQueue, 29);
                gapComposer.updateRememberedValue(rememberedValue10);
            } else {
                mutableFloatState = mutableFloatState3;
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue10, gapComposer);
            if ((((i8 & 14) ^ 6) <= 4 || !gapComposer.changed(scanningStepAnimationTrigger)) && (i8 & 6) != 4) {
                z2 = false;
            }
            boolean changedInstance3 = z2 | gapComposer.changedInstance(stepTurnAnimationQueue) | gapComposer.changedInstance(coroutineScope) | gapComposer.changed(rememberUpdatedState4) | gapComposer.changed(rememberUpdatedState2) | gapComposer.changedInstance(animatable6) | gapComposer.changed(rememberUpdatedState3) | gapComposer.changedInstance(animatable5) | gapComposer.changed(rememberUpdatedState5);
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue11 == neverEqualPolicy3) {
                animatable2 = animatable6;
                animatable3 = animatable5;
                f4 = floatValue2;
                QuickPayPresenter$models$3$1 quickPayPresenter$models$3$1 = new QuickPayPresenter$models$3$1(scanningStepAnimationTrigger, stepTurnAnimationQueue, coroutineScope, animatable3, animatable2, rememberUpdatedState4, rememberUpdatedState2, mutableFloatState, rememberUpdatedState3, rememberUpdatedState5, (Continuation) null);
                scanningStepAnimationTrigger2 = scanningStepAnimationTrigger;
                gapComposer.updateRememberedValue(quickPayPresenter$models$3$1);
                rememberedValue11 = quickPayPresenter$models$3$1;
            } else {
                animatable3 = animatable5;
                animatable2 = animatable6;
                f4 = floatValue2;
                scanningStepAnimationTrigger2 = scanningStepAnimationTrigger;
            }
            Updater.LaunchedEffect(gapComposer, scanningStepAnimationTrigger2, (Function2) rememberedValue11);
            ScanningShapePulseContent(modifier, interpolateTargetValues(scanningShapePulseParams2, f4), floatValue, new ScanningStepAnimation(((Number) animatable3.getValue()).floatValue(), ((Number) animatable2.getValue()).floatValue()), scanningStabilityAnimation2, gapComposer, i3 & 14);
        } else {
            function04 = function0;
            scanningShapePulseParams2 = scanningShapePulseParams;
            scanningStepAnimationTrigger2 = scanningStepAnimationTrigger;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i9 = 1;
            final ScanningStepAnimationTrigger scanningStepAnimationTrigger3 = scanningStepAnimationTrigger2;
            final ScanningShapePulseParams scanningShapePulseParams3 = scanningShapePulseParams2;
            final Function0 function05 = function04;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i9;
                    int i92 = i;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ScanningShapePulseKt.ScanningShapePulse(modifier, scanningShapePulseParams3, scanningStepAnimationTrigger3, num, f, function05, function02, function03, (Composer) obj, Updater.updateChangedFlags(i92 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ScanningShapePulseKt.ScanningShapePulse(modifier, scanningShapePulseParams3, scanningStepAnimationTrigger3, num, f, function05, function02, function03, (Composer) obj, Updater.updateChangedFlags(i92 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ScanningShapePulseContent(Modifier modifier, ScanningShapePulseParams scanningShapePulseParams, float f, ScanningStepAnimation scanningStepAnimation, ScanningStabilityAnimation scanningStabilityAnimation, Composer composer, int i) {
        int i2;
        float f2;
        Applier applier;
        boolean z;
        Modifier modifier2;
        float f3 = scanningStabilityAnimation.pulseScale;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1303438399);
        Applier applier2 = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(scanningShapePulseParams) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(scanningStepAnimation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(scanningStabilityAnimation) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            if (Build.VERSION.SDK_INT >= 33) {
                gapComposer.startReplaceGroup(-65626551);
                applier = applier2;
                f2 = f3;
                z = false;
                Modifier m1075scanningPulseShaderosbwsH8 = Api33Impl.m1075scanningPulseShaderosbwsH8(modifier, f, scanningShapePulseParams.cellSize, scanningShapePulseParams.gap, scanningShapePulseParams.cornerRadius, scanningShapePulseParams.spread, scanningShapePulseParams.twinkleSpeed, gapComposer, (i2 & 14) | ((i2 >> 3) & 112));
                gapComposer.end(false);
                modifier2 = m1075scanningPulseShaderosbwsH8;
            } else {
                f2 = f3;
                applier = applier2;
                z = false;
                gapComposer.startReplaceGroup(-65348915);
                gapComposer.end(false);
                modifier2 = modifier;
            }
            Alignment alignment = scanningShapePulseParams.alignment;
            float f4 = scanningShapePulseParams.shapeScale;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, z);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(OffsetKt.m272offsetVpY3zN4(Modifier.Companion.$$INSTANCE, scanningShapePulseParams.offsetX, scanningShapePulseParams.offsetY), scanningShapePulseParams.shapeSize * 1.5f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
            gapComposer.startReusableNode();
            int i3 = i2;
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            FidesmoScanningPulseShape fidesmoScanningPulseShape = scanningShapePulseParams.shape;
            float f5 = scanningShapePulseParams.shapeSize;
            float f6 = scanningShapePulseParams.glowScale * f4;
            float f7 = scanningStepAnimation.orbScale;
            float f8 = scanningStabilityAnimation.rotationDegrees + scanningStepAnimation.rotationDegrees;
            m3544ShapeGlowLayerj0Z4WGo(fidesmoScanningPulseShape, f5, f6 * f7 * f2, f8, scanningShapePulseParams.glowAlpha, scanningShapePulseParams.glowBlur, scanningShapePulseParams.glowPulseAmount, scanningShapePulseParams.glowPulseDurationSeconds, f, gapComposer, (i3 << 18) & 234881024);
            m3547ShapeLayerUwwEzs(scanningShapePulseParams.shape, scanningShapePulseParams.shapeSize, f4 * f2, scanningShapePulseParams.primaryOpacity, scanningShapePulseParams.fillDurationSeconds, scanningShapePulseParams.beatDurationSeconds, f8, null, gapComposer, 0);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda2(modifier, scanningShapePulseParams, f, scanningStepAnimation, scanningStabilityAnimation, i, 0);
        }
    }

    /* renamed from: ShapeGlowLayer-j0Z4WGo, reason: not valid java name */
    public static final void m3544ShapeGlowLayerj0Z4WGo(final FidesmoScanningPulseShape fidesmoScanningPulseShape, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2080071197);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(fidesmoScanningPulseShape.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(f5) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(f6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(f7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changed(f8) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            float sin = ((((float) Math.sin((f8 / Math.max(0.05f, f7)) * 2.0f * 3.1415927f)) * f6) + 1.0f) * f2;
            Modifier scale = ScaleKt.scale(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, f, f / getAspectRatio(fidesmoScanningPulseShape)), sin, sin);
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScanningShapePulseKt$$ExternalSyntheticLambda3(f3, fidesmoScanningPulseShape, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier alpha = AlphaKt.alpha(BlurKt.m586blurF8QBwvs(ColorKt.graphicsLayer(scale, (Function1) rememberedValue), f5, null), f4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            m3545ShapeGlowViewuFdPcIQ(fidesmoScanningPulseShape, f, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ScanningShapePulseKt.m3544ShapeGlowLayerj0Z4WGo(FidesmoScanningPulseShape.this, f, f2, f3, f4, f5, f6, f7, f8, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ShapeGlowView-uFdPcIQ, reason: not valid java name */
    public static final void m3545ShapeGlowViewuFdPcIQ(FidesmoScanningPulseShape fidesmoScanningPulseShape, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(558410562);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(fidesmoScanningPulseShape.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            float aspectRatio = f / getAspectRatio(fidesmoScanningPulseShape);
            int ordinal = fidesmoScanningPulseShape.ordinal();
            if (ordinal == 0) {
                i3 = R.drawable.fidesmo_star_glow;
            } else if (ordinal == 1) {
                i3 = R.drawable.fidesmo_heart_glow;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.drawable.fidesmo_minicard_glow;
            }
            Painter painterResource = Countries.painterResource(i3, 0, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, f, aspectRatio);
            long j = Color.White;
            ImageKt.Image(painterResource, null, m287sizeVpY3zN4, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 1597488, 40);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda80(fidesmoScanningPulseShape, f, modifier, i);
        }
    }

    /* renamed from: ShapeImage-3IgeMak, reason: not valid java name */
    public static final void m3546ShapeImage3IgeMak(final int i, final int i2, final long j, Composer composer, Modifier modifier) {
        int i3;
        final Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1499835405);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ImageKt.Image(Countries.painterResource(i, i3 & 14, gapComposer), null, modifier, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24624 | (i3 & 896), 40);
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                    ScanningShapePulseKt.m3546ShapeImage3IgeMak(i, updateChangedFlags, j, (Composer) obj, modifier2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ShapeLayer-Uww-Ezs, reason: not valid java name */
    public static final void m3547ShapeLayerUwwEzs(final FidesmoScanningPulseShape fidesmoScanningPulseShape, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, Modifier modifier, Composer composer, final int i) {
        Modifier modifier2;
        FidesmoScanningPulseShape fidesmoScanningPulseShape2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-130625813);
        int i2 = i | (gapComposer.changed(fidesmoScanningPulseShape.ordinal()) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(f2) ? 256 : 128) | (gapComposer.changed(f3) ? 2048 : 1024) | (gapComposer.changed(f4) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(f5) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(f6) ? 1048576 : PKIFailureInfo.signerNotTrusted) | 12582912;
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            float aspectRatio = f / getAspectRatio(fidesmoScanningPulseShape);
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier scale = ScaleKt.scale(SizeKt.m287sizeVpY3zN4(modifier2, f, aspectRatio), f2, f2);
            boolean z = ((i2 & 14) == 4) | ((3670016 & i2) == 1048576);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                fidesmoScanningPulseShape2 = fidesmoScanningPulseShape;
                rememberedValue = new ScanningShapePulseKt$$ExternalSyntheticLambda3(f6, fidesmoScanningPulseShape2, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                fidesmoScanningPulseShape2 = fidesmoScanningPulseShape;
            }
            Modifier alpha = AlphaKt.alpha(ColorKt.graphicsLayer(scale, (Function1) rememberedValue), f3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            int i4 = i2 >> 6;
            m3548ShapePulseViewEUb7tLY(fidesmoScanningPulseShape2, f, f4, f5, null, gapComposer, (i4 & 7168) | i3 | (i4 & 896));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2(f, f2, f3, f4, f5, f6, modifier3, i) { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda4
                public final /* synthetic */ float f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ Modifier f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ScanningShapePulseKt.m3547ShapeLayerUwwEzs(FidesmoScanningPulseShape.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ShapePulseView-EUb7tLY, reason: not valid java name */
    public static final void m3548ShapePulseViewEUb7tLY(FidesmoScanningPulseShape fidesmoScanningPulseShape, final float f, final float f2, final float f3, Modifier modifier, Composer composer, final int i) {
        int i2;
        FidesmoScanningPulseShape fidesmoScanningPulseShape2;
        Modifier modifier2;
        Shape shape;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1895890408);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(fidesmoScanningPulseShape.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new SnapshotStateList();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(new Color(Color.Transparent));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue3;
            int ordinal = fidesmoScanningPulseShape.ordinal();
            if (ordinal == 0) {
                shape = ScanningStarShape.INSTANCE;
            } else if (ordinal == 1) {
                shape = ScanningHeartShape.INSTANCE;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                shape = ScanningCardShape.INSTANCE;
            }
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(f2), gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(f3), gapComposer);
            boolean changed = gapComposer.changed(rememberUpdatedState) | gapComposer.changed(rememberUpdatedState2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == obj) {
                rememberedValue4 = new ScanningShapePulseKt$ShapePulseView$1$1(snapshotStateList, mutableState, rememberUpdatedState, mutableFloatState, rememberUpdatedState2, null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            fidesmoScanningPulseShape2 = fidesmoScanningPulseShape;
            Updater.LaunchedEffect(gapComposer, fidesmoScanningPulseShape2, (Function2) rememberedValue4);
            int ordinal2 = fidesmoScanningPulseShape2.ordinal();
            modifier2 = Modifier.Companion.$$INSTANCE;
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(884611509);
                m3550StarFrameWithFillPulseEOp_iR4(shape, f, ((Color) mutableState.getValue()).value, snapshotStateList, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), modifier2, gapComposer, (i3 & 112) | 3072 | ((i3 << 3) & 458752));
                gapComposer.end(false);
            } else if (ordinal2 == 1) {
                gapComposer.startReplaceGroup(884619542);
                m3541HeartFrameWithFillPulseEOp_iR4(shape, f, ((Color) mutableState.getValue()).value, snapshotStateList, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), modifier2, gapComposer, (i3 & 112) | 3072 | ((i3 << 3) & 458752));
                gapComposer.end(false);
            } else {
                if (ordinal2 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 884610040, false);
                }
                gapComposer.startReplaceGroup(884627737);
                m3543MiniCardFrameWithFillPulseEOp_iR4(shape, f, ((Color) mutableState.getValue()).value, snapshotStateList, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), modifier2, gapComposer, (i3 & 112) | 3072 | ((i3 << 3) & 458752));
                gapComposer.end(false);
            }
        } else {
            fidesmoScanningPulseShape2 = fidesmoScanningPulseShape;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final FidesmoScanningPulseShape fidesmoScanningPulseShape3 = fidesmoScanningPulseShape2;
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ScanningShapePulseKt.m3548ShapePulseViewEUb7tLY(FidesmoScanningPulseShape.this, f, f2, f3, modifier3, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: StarFillLayer-3J-VO9M, reason: not valid java name */
    public static final void m3549StarFillLayer3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        long j2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1138815670);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            j2 = j;
            modifier2 = modifier;
            m3546ShapeImage3IgeMak(R.drawable.fidesmo_star_fill, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, j2, gapComposer, modifier2);
        } else {
            j2 = j;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(j2, modifier2, i, 4);
        }
    }

    /* renamed from: StarFrameWithFillPulse-EOp_iR4, reason: not valid java name */
    public static final void m3550StarFrameWithFillPulseEOp_iR4(Shape shape, float f, long j, List list, float f2, Modifier modifier, Composer composer, int i) {
        int i2;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1925521300);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(shape) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            float aspectRatio = f / getAspectRatio(FidesmoScanningPulseShape.STAR);
            float f3 = f * 0.5847953f;
            float f4 = 0.5847953f * aspectRatio;
            float f5 = f * (-0.008771926f);
            float f6 = aspectRatio * 0.030292392f;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(modifier, f, aspectRatio);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            m3549StarFillLayer3JVO9M((i2 >> 6) & 14, j, gapComposer, SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(companion, biasAlignment), f5, f6), f3, f4));
            gapComposer.startReplaceGroup(2038393300);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pulse pulse = (Pulse) it.next();
                float pulseProgress = pulseProgress(f2, pulse.startProgress);
                m3549StarFillLayer3JVO9M(0, pulse.color, gapComposer, ScaleKt.scale(SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(companion, biasAlignment), f5, f6), f3, f4), pulseProgress, pulseProgress));
            }
            gapComposer.end(false);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(boxScopeInstance.matchParentSize(), shape), Color.White, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda9(shape, f, j, list, f2, modifier, i, 1);
        }
    }

    public static final ScanningShapePulseParams defaultScanningShapePulseParams(FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        int ordinal = fidesmoScanningPulseShape.ordinal();
        if (ordinal == 0) {
            return new ScanningShapePulseParams(fidesmoScanningPulseShape, 0.75f, 72.0f);
        }
        if (ordinal == 1) {
            return new ScanningShapePulseParams(fidesmoScanningPulseShape, 0.75f, RecyclerView.DECELERATION_RATE);
        }
        if (ordinal == 2) {
            return new ScanningShapePulseParams(fidesmoScanningPulseShape, 0.65f, RecyclerView.DECELERATION_RATE);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final float getAspectRatio(FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        int ordinal = fidesmoScanningPulseShape.ordinal();
        if (ordinal == 0) {
            return 1.0f;
        }
        if (ordinal == 1) {
            return 1.0655738f;
        }
        if (ordinal == 2) {
            return 1.5f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }

    public static final ScanningShapePulseParams interpolateTargetValues(ScanningShapePulseParams scanningShapePulseParams, float f) {
        float f2 = scanningShapePulseParams.fillDurationSeconds;
        float m = CameraState$Type$EnumUnboxingLocalUtility.m(scanningShapePulseParams.targetFillDurationSeconds, f2, f, f2);
        float f3 = scanningShapePulseParams.shapeScale;
        float f4 = (((scanningShapePulseParams.targetShapeScaleBoost + f3) - f3) * f) + f3;
        float f5 = scanningShapePulseParams.primaryOpacity;
        return ScanningShapePulseParams.m3551copyXu8qxI8$default(scanningShapePulseParams, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4, CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, f5, f, f5), m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE, 0L, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, -225, 7);
    }

    public static final float pulseProgress(float f, float f2) {
        return EasingKt.FastOutSlowInEasing.transform(Math.min(1.0f, Math.max(RecyclerView.DECELERATION_RATE, f - f2)));
    }

    public static final String resolve(ResolvableString resolvableString, Composer composer) {
        resolvableString.getClass();
        return resolvableString.resolve((Context) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalContext));
    }

    public static final long rotationTransformOrigin(FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        int ordinal = fidesmoScanningPulseShape.ordinal();
        if (ordinal == 0) {
            return ColorKt.TransformOrigin(0.49122807f, 0.5637427f);
        }
        if (ordinal == 1 || ordinal == 2) {
            int i = TransformOrigin.$r8$clinit;
            return TransformOrigin.Center;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0L;
    }

    public static boolean zzb(Sets$ImprovedAbstractSet sets$ImprovedAbstractSet, Collection collection) {
        collection.getClass();
        if (collection instanceof zzcb) {
            collection = ((zzcb) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= sets$ImprovedAbstractSet.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= sets$ImprovedAbstractSet.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = sets$ImprovedAbstractSet.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
