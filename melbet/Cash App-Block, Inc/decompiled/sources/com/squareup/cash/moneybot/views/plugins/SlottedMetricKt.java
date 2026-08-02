package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.cash.kgoose.api.v3.Metric;
import com.squareup.workflow1.Snapshots;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SlottedMetricKt {

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Metric.TrendDirection.values().length];
            try {
                iArr[Metric.TrendDirection.TREND_DIRECTION_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Metric.TrendDirection.TREND_DIRECTION_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AnimatedMetricAmountText(SlotContent.Metric metric, TextStyle textStyle, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Boolean bool;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-248700600);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(metric) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(textStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer2.changed(metric);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new AnimatedAmountTextView.Amount(metric.displayAmountText, metric.displayAmount);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AnimatedAmountTextView.Amount amount = (AnimatedAmountTextView.Amount) rememberedValue;
            boolean changed2 = gapComposer2.changed(metric);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(new AnimatedAmountTextView.Amount(metric.animationStartAmountText, metric.animationStartAmount));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            boolean z2 = false;
            TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer2);
            long notScaledUp = Snapshots.getNotScaledUp(textStyle.spanStyle.fontSize, gapComposer2);
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            Boolean valueOf = Boolean.valueOf(z);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean changed3 = gapComposer2.changed(mutableState) | z2 | gapComposer2.changedInstance(amount);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == obj) {
                bool = valueOf;
                Object interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z, amount, mutableState, (Continuation) null, 11);
                gapComposer2.updateRememberedValue(interactiveCardState$animateLock$2);
                rememberedValue3 = interactiveCardState$animateLock$2;
            } else {
                bool = valueOf;
            }
            Updater.LaunchedEffect(amount, bool, (Function2) rememberedValue3, gapComposer2);
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(null, null, false, Expect_jvmKt.rememberComposableLambda(-1641218658, new SlottedMetricKt$$ExternalSyntheticLambda3(metric, amount, textStyle, notScaledUp, rememberTextMeasurer, density, mutableState), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(metric, textStyle, z, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r12v7, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SlottedMetric(SlotContent.Metric metric, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        String stringResource;
        boolean z;
        ?? r6;
        boolean z2;
        int i3;
        ?? r12;
        Float valueOf;
        Float f;
        GapComposer gapComposer2;
        metric.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1119315972);
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changedInstance(metric) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(modifier) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer3);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer3);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).headlineLarge, 0L, Room.getSp(88), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(88), null, null, 0, 16646141);
            Metric.TrendDirection trendDirection = metric.trendDirection;
            int i5 = trendDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trendDirection.ordinal()];
            if (i5 == 1) {
                gapComposer3.startReplaceGroup(1920838375);
                stringResource = Room.stringResource(R.string.moneybot_metric_row_trending_up_content_description, new Object[]{fullAmountText(metric)}, gapComposer3);
                gapComposer3.end(false);
            } else if (i5 != 2) {
                gapComposer3.startReplaceGroup(1920849108);
                gapComposer3.end(false);
                stringResource = fullAmountText(metric);
            } else {
                gapComposer3.startReplaceGroup(1920844297);
                stringResource = Room.stringResource(R.string.moneybot_metric_row_trending_down_content_description, new Object[]{fullAmountText(metric)}, gapComposer3);
                gapComposer3.end(false);
            }
            String str = stringResource;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            boolean changed = gapComposer3.changed(str);
            Object rememberedValue = gapComposer3.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(str, 18);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Bottom, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, clearAndSetSemantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (moneybotSlotContentShouldAnimate) {
                gapComposer3.startReplaceGroup(-444424024);
                AnimatedMetricAmountText(metric, m994copyp1EtxEg$default, moneybotSlotContentAnimationsReady, gapComposer3, i4 & 14);
                gapComposer3.end(false);
                z2 = true;
                r6 = 0;
                z = moneybotSlotContentAnimationsReady;
                i3 = 2;
                r12 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-444275193);
                z = moneybotSlotContentAnimationsReady;
                r6 = 0;
                z2 = true;
                i3 = 2;
                zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 0, 506, 0L, 0L, gapComposer3, null, m994copyp1EtxEg$default, fullAmountText(metric), null);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                r12 = gapComposer4;
            }
            int i6 = trendDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trendDirection.ordinal()];
            if (i6 == z2) {
                valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
            } else if (i6 != i3) {
                f = null;
                if (f == null) {
                    r12.startReplaceGroup(-443934100);
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, moneybotSlotContentShouldAnimate ? AnimatableKt.tween$default(r6, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 5) : AnimatableKt.snap$default(), "SlottedMetricIconAlpha", null, r12, 3072, 20);
                    boolean z3 = trendDirection != null ? WhenMappings.$EnumSwitchMapping$0[trendDirection.ordinal()] : -1;
                    float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(z3 != z2 ? z3 != i3 ? RecyclerView.DECELERATION_RATE : -12.0f : 12.0f, r12);
                    if (z) {
                        m3477toPx8Feqmps = RecyclerView.DECELERATION_RATE;
                    }
                    State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(m3477toPx8Feqmps, moneybotSlotContentShouldAnimate ? AnimatableKt.tween$default(r6, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 5) : AnimatableKt.snap$default(), "SlottedMetricIconOffsetY", null, r12, 3072, 20);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SpacerKt.Spacer(r12, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    Icons icons = Icons.SendArrow32;
                    Colors colors = (Colors) r12.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m((GapComposer) r12, -1762997026, (GapComposer) r12, (boolean) r6);
                    } else {
                        r12.startReplaceGroup(-1762997739);
                        r12.end(r6);
                    }
                    long j = colors.semantic.text.placeholder;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), 48.0f);
                    boolean changed2 = r12.changed(animateFloatAsState) | r12.changed(animateFloatAsState2);
                    Object rememberedValue2 = r12.rememberedValue();
                    if (changed2 || rememberedValue2 == obj) {
                        rememberedValue2 = new CheckboxKt$$ExternalSyntheticLambda6(animateFloatAsState, animateFloatAsState2, i3);
                        r12.updateRememberedValue(rememberedValue2);
                    }
                    Composer composer2 = r12;
                    Trace.m1191Iconww6aTOc(icons, (String) null, RotateKt.rotate(ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue2), f.floatValue()), j, composer2, 54, 0);
                    ?? r122 = composer2;
                    r122.end(r6);
                    gapComposer2 = r122;
                } else {
                    r12.startReplaceGroup(-442598310);
                    r12.end(r6);
                    gapComposer2 = r12;
                }
                gapComposer2.end(z2);
                gapComposer = gapComposer2;
            } else {
                valueOf = Float.valueOf(180.0f);
            }
            f = valueOf;
            if (f == null) {
            }
            gapComposer2.end(z2);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(metric, modifier, i, 26);
        }
    }

    public static final String fullAmountText(SlotContent.Metric metric) {
        StringBuilder sb = new StringBuilder();
        String str = metric.amountPrefix;
        if (str != null) {
            sb.append(str);
        }
        sb.append(metric.displayAmountText);
        String str2 = metric.amountSuffix;
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }
}
