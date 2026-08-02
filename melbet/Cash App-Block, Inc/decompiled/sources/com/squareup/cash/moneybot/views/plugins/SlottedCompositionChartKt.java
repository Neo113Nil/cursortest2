package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.protos.cash.ui.Color;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class SlottedCompositionChartKt {
    public static final SlotContent.CompositionChart SPENDING_COMPOSITION_CHART = new SlotContent.CompositionChart(CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.CompositionChart.Segment[]{new SlotContent.CompositionChart.Segment(0.32f, new Color(new Color.ModeVariant("#00C730", null, null, null, null, 30, null), new Color.ModeVariant("#00D632", null, null, null, null, 30, null), 4)), new SlotContent.CompositionChart.Segment(0.28f, null), new SlotContent.CompositionChart.Segment(0.25f, null), new SlotContent.CompositionChart.Segment(0.15f, null)}));

    static {
        CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.CompositionChart.Segment[]{new SlotContent.CompositionChart.Segment(0.34f, new Color(new Color.ModeVariant("#00C730", null, null, null, null, 30, null), new Color.ModeVariant("#00D632", null, null, null, null, 30, null), 4)), new SlotContent.CompositionChart.Segment(0.33f, new Color(new Color.ModeVariant("#007AFF", null, null, null, null, 30, null), new Color.ModeVariant("#0A84FF", null, null, null, null, 30, null), 4)), new SlotContent.CompositionChart.Segment(0.33f, new Color(new Color.ModeVariant("#E8E8E8", null, null, null, null, 30, null), new Color.ModeVariant("#333333", null, null, null, null, 30, null), 4))}).getClass();
    }

    public static final void SlottedCompositionChart(SlotContent.CompositionChart compositionChart, Modifier modifier, Composer composer, int i) {
        AnimationSpec snap$default;
        androidx.compose.ui.graphics.Color m;
        long j;
        compositionChart.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1569154400);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(compositionChart) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer);
            float f = moneybotSlotContentAnimationsReady ? 1.0f : 0.0f;
            if (moneybotSlotContentShouldAnimate) {
                gapComposer.startReplaceGroup(-254326590);
                Object obj = ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text;
                snap$default = new SpringSpec(1.0f, 50.0f, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-254258266);
                gapComposer.end(false);
                snap$default = AnimatableKt.snap$default();
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, snap$default, "slottedCompositionChartRevealProgress", null, gapComposer, 3072, 20);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj2 = DefaultSizes.border.entries;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            boolean changed = gapComposer.changed(animateFloatAsState) | gapComposer.changed(16.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier drawWithContent = ClipKt.drawWithContent(m302paddingqDBjuR0$default, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Bottom, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, drawWithContent);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1465471920);
            List list = compositionChart.segments;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((SlotContent.CompositionChart.Segment) obj3).fraction > RecyclerView.DECELERATION_RATE) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SlotContent.CompositionChart.Segment segment = (SlotContent.CompositionChart.Segment) it.next();
                float f2 = segment.fraction;
                if (f2 <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                if (f2 > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(new LayoutWeightElement(f2, true), 88.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj4 = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(m277height3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                Color color = segment.color;
                if (color == null) {
                    gapComposer.startReplaceGroup(573142999);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1921174166, color, gapComposer, false);
                }
                if (m == null) {
                    gapComposer.startReplaceGroup(-1921172471);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.prominent;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1921174579);
                    gapComposer.end(false);
                    j = m.value;
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(compositionChart, modifier, i, 25);
        }
    }
}
