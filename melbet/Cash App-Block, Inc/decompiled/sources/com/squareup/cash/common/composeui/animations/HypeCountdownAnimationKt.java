package com.squareup.cash.common.composeui.animations;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ScaledSizeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class HypeCountdownAnimationKt {
    public static final DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMM", Locale.US);

    public static final void DateText(LocalDate localDate, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-183219968);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String format2 = localDate.format(monthFormatter);
            format2.getClass();
            String upperCase = format2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String m = Boxes$$ExternalSyntheticOutline1.m(DimensionKt.getSafeDayOfMonth(localDate), upperCase, "\n");
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(12), null, null, 0, 16646141);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            zzacn.m2012AutoScaleTextZLomxE(2, 3, 0, 24576, 450, colors.semantic.text.inverse, 0L, gapComposer, null, m994copyp1EtxEg$default, m, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(localDate, modifier, i, 28);
        }
    }

    /* renamed from: HypeCountdownAnimation-FHprtrg, reason: not valid java name */
    public static final void m3502HypeCountdownAnimationFHprtrg(CashTagSymbol cashTagSymbol, LocalDate localDate, Modifier modifier, long j, Function0 function0, Composer composer, int i) {
        int i2;
        MutableState mutableState;
        Modifier modifier2;
        int i3;
        float f;
        boolean z;
        LocalDate localDate2 = localDate;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(663679062);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(false) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(cashTagSymbol.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(localDate2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 131072 : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(true, gapComposer);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            if (function0 != null) {
                gapComposer.startReplaceGroup(1928870131);
                mutableState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1928931418);
                gapComposer.end(false);
                mutableState = null;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (function0 != null) {
                gapComposer.startReplaceGroup(1929025596);
                boolean z2 = (458752 & i2) == 131072;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda10(15, function0);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                modifier2 = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1929140110);
                gapComposer.end(false);
                modifier2 = companion;
            }
            Modifier then = modifier.then(modifier2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1760065840);
                int ordinal = cashTagSymbol.ordinal();
                if (ordinal == 0) {
                    i3 = R.drawable.hype_wand_countdown;
                } else if (ordinal == 1) {
                    i3 = R.drawable.hype_card_countdown;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i3 = R.drawable.hype_heart_countdown;
                }
                int i4 = i2;
                MutableState mutableState3 = mutableState;
                int i5 = i3;
                InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("idle-float", gapComposer, 0), -3.0f, 3.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(2500, 0, EasingFunctionsKt.EaseInOut, 2), RepeatMode.Reverse, 4), "float-y", gapComposer, 29064, 0);
                boolean changed = gapComposer.changed(mutableState3) | gapComposer.changed(animateFloat);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new CheckboxKt$$ExternalSyntheticLambda6(mutableState3, animateFloat, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Modifier rotate = RotateKt.rotate(ColorKt.graphicsLayer(companion, (Function1) rememberedValue4), 15.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, rotate);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Painter painterResource = Countries.painterResource(i5, 0, gapComposer);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 88.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors.semantic.background.inverse;
                ImageKt.Image(painterResource, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
                gapComposer = gapComposer;
                int ordinal2 = cashTagSymbol.ordinal();
                if (ordinal2 == 0) {
                    f = 4.0f;
                } else {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    f = 0.0f;
                }
                z = true;
                localDate2 = localDate;
                DateText(localDate2, OffsetKt.m273offsetVpY3zN4$default(SpacerKt.m298padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(), 24.0f), RecyclerView.DECELERATION_RATE, f, 1), gapComposer, (i4 >> 6) & 14);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1759856900);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new DrawerViewKt$$ExternalSyntheticLambda2(9, mutableState2);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ScaledSizeKt.m3993HypeIntroAnimationcf5BqRc(true, null, j, (Function0) rememberedValue5, gapComposer, ((i2 >> 6) & 896) | 3078);
                gapComposer.end(false);
                z = true;
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerDefaults$$ExternalSyntheticLambda1(cashTagSymbol, localDate2, modifier, j, function0, i);
        }
    }

    /* renamed from: HypeCountdownAnimation-uDo3WH8, reason: not valid java name */
    public static final void m3503HypeCountdownAnimationuDo3WH8(NextAvailableCashTag nextAvailableCashTag, Modifier modifier, long j, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        long j2;
        nextAvailableCashTag.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2137562329);
        int i2 = i | (gapComposer.changed(false) ? 4 : 2) | (gapComposer.changedInstance(nextAvailableCashTag) ? 32 : 16) | 3456 | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            long j3 = Color.Unspecified;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            m3502HypeCountdownAnimationFHprtrg(nextAvailableCashTag.symbol, nextAvailableCashTag.date, companion, j3, function0, gapComposer, (i2 & 14) | 27648 | ((i2 << 3) & 458752));
            modifier2 = companion;
            j2 = j3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j2 = j;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(nextAvailableCashTag, modifier2, j2, function0, i, 4);
        }
    }
}
