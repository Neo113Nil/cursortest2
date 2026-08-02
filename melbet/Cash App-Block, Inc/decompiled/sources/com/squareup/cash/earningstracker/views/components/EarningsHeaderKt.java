package com.squareup.cash.earningstracker.views.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earningstracker.viewmodels.HeaderSubtitle;
import com.squareup.cash.earningstracker.viewmodels.HeaderTitle;
import com.squareup.cash.earningstracker.viewmodels.HeroHeaderViewModel;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class EarningsHeaderKt {
    public static final long heroShimmerHeight = Room.getSp(52);
    public static final float subtitleShimmerWidth = 192.0f;
    public static final long subtitleShimmerHeight = Room.getSp(20);

    public static final void EarningsCounter(HeaderTitle.EarningsCounterTitle earningsCounterTitle, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Object navHostKt$NavHost$33$1;
        Animatable animatable;
        Animatable animatable2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-49543244);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(earningsCounterTitle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer2.changed(earningsCounterTitle);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Animatable animatable3 = (Animatable) rememberedValue;
            boolean changed2 = gapComposer2.changed(earningsCounterTitle);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable4 = (Animatable) rememberedValue2;
            boolean changed3 = gapComposer2.changed(earningsCounterTitle);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = AnimatableKt.Animatable(earningsCounterTitle.animate ? 0.75f : 1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable5 = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer2.changedInstance(earningsCounterTitle) | gapComposer2.changedInstance(coroutineScope) | gapComposer2.changedInstance(animatable5) | gapComposer2.changedInstance(animatable3) | gapComposer2.changedInstance(animatable4);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                animatable = animatable5;
                animatable2 = animatable4;
                navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(earningsCounterTitle, coroutineScope, animatable, function0, animatable3, animatable2, (Continuation) null, 6);
                gapComposer2.updateRememberedValue(navHostKt$NavHost$33$1);
            } else {
                navHostKt$NavHost$33$1 = rememberedValue5;
                animatable = animatable5;
                animatable2 = animatable4;
            }
            Updater.LaunchedEffect(gapComposer2, earningsCounterTitle, (Function2) navHostKt$NavHost$33$1);
            boolean changed4 = gapComposer2.changed(((Number) animatable.getValue()).floatValue());
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue6 == neverEqualPolicy) {
                earningsCounterTitle.earnings.amount.getClass();
                rememberedValue6 = (String) function1.invoke(new Money(Long.valueOf((long) (((Number) animatable.getValue()).floatValue() * r0.longValue())), earningsCounterTitle.earnings.currency_code, 4));
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            String str = (String) rememberedValue6;
            boolean changedInstance2 = gapComposer2.changedInstance(animatable3);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new RadioKt$$ExternalSyntheticLambda1(animatable3, 9);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, graphicsLayer);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str2 = earningsCounterTitle.currencySymbol;
            long j = Strings.getColors(gapComposer2).semantic.text.standard;
            TextStyle textStyle = Strings.getTypography(gapComposer2).numeralLarge;
            boolean changedInstance3 = gapComposer2.changedInstance(animatable2);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new RadioKt$$ExternalSyntheticLambda1(animatable2, 10);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer2, ColorKt.graphicsLayer(companion, (Function1) rememberedValue8), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).numeralLarge, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) earningsCounterTitle, function1, (Object) function0, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public static final void EarningsHeader(HeroHeaderViewModel heroHeaderViewModel, Function1 function1, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Modifier modifier3;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Modifier.Companion companion;
        ?? r4;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18;
        Modifier.Companion companion2;
        int i2;
        Modifier.Companion companion3;
        Pair pair;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2087403508);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(heroHeaderViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion4, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StoryQueries$$ExternalSyntheticLambda0(12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$19);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$110);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$111);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$112);
            HeaderTitle headerTitle = heroHeaderViewModel.title;
            if (headerTitle instanceof HeaderTitle.EarningsCounterTitle) {
                gapComposer.startReplaceGroup(-1398663313);
                EarningsCounter((HeaderTitle.EarningsCounterTitle) headerTitle, function1, function0, gapComposer, (i3 & 112) | ((i3 >> 3) & 896));
                gapComposer.end(false);
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$112;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                r4 = 0;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$110;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                companion = companion4;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                modifier3 = null;
            } else {
                if (!(headerTitle instanceof HeaderTitle.TextTitle)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1398665410, false);
                }
                gapComposer.startReplaceGroup(-408706996);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$110;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$112;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                modifier3 = null;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                companion = companion4;
                r4 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).numeralLarge, (TextLineBalancing) null, ((HeaderTitle.TextTitle) headerTitle).text, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            if (heroHeaderViewModel.shouldManualRefresh) {
                gapComposer.startReplaceGroup(-408492600);
                DBUtil.SpacerWithinSectionSmall(r4, 1, gapComposer, modifier3);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier.Companion companion5 = companion;
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion5);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$113 = composeUiNode$Companion$SetModifier$12;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$113);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$114 = composeUiNode$Companion$SetModifier$14;
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$114, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$13);
                Trace.m1191Iconww6aTOc(Icons.AlertOutline16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 54, 4);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion5, 4.0f, RecyclerView.DECELERATION_RATE, 2));
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$113;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$114;
                companion2 = companion5;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$13;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_tracker_pull_to_refresh_label), (Map) null, (Function1) null, false);
                i2 = 1;
                gapComposer.end(true);
                gapComposer.end(r4);
            } else {
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$12;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$14;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$13;
                companion2 = companion;
                i2 = 1;
                gapComposer.startReplaceGroup(-407935220);
                gapComposer.end(r4);
            }
            DBUtil.SpacerWithinSectionSmall(r4, i2, gapComposer, modifier3);
            HeaderSubtitle headerSubtitle = heroHeaderViewModel.subtitle;
            if (headerSubtitle instanceof HeaderSubtitle.TextSubtitle) {
                gapComposer.startReplaceGroup(-1398628362);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, ((HeaderSubtitle.TextSubtitle) headerSubtitle).text, (Map) null, (Function1) null, false);
                gapComposer.end(r4);
                companion3 = companion2;
            } else if (headerSubtitle instanceof HeaderSubtitle.TrendSubtitle) {
                gapComposer.startReplaceGroup(-1398621201);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier.Companion companion6 = companion2;
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion6);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                HeaderSubtitle.TrendSubtitle trendSubtitle = (HeaderSubtitle.TrendSubtitle) headerSubtitle;
                int ordinal = trendSubtitle.trend.ordinal();
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(-1015931946);
                    pair = new Pair(Icons.TickerUp24, new Color(Strings.getColors(gapComposer).semantic.icon.success));
                    gapComposer.end(r4);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1015933212, (boolean) r4);
                    }
                    gapComposer.startReplaceGroup(-1015929289);
                    pair = new Pair(Icons.TickerDown24, new Color(Strings.getColors(gapComposer).semantic.icon.subtle));
                    gapComposer.end(r4);
                }
                Trace.m1191Iconww6aTOc((Icons) pair.first, (String) null, (Modifier) null, ((Color) pair.second).value, gapComposer, 48, 4);
                companion3 = companion6;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, trendSubtitle.comparisonText, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(r4);
            } else {
                companion3 = companion2;
                if (headerSubtitle != null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1398630115, (boolean) r4);
                }
                gapComposer.startReplaceGroup(-1398598005);
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, "", (Map) null, (Function1) null, false);
                gapComposer.end(r4);
            }
            gapComposer.end(true);
            modifier2 = companion3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(heroHeaderViewModel, i, function1, modifier2, function0, 28);
        }
    }

    public static final void EarningsHeaderShimmer(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1224630637);
        int i2 = i | 6;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-597477692, new EarningsHeaderKt$$ExternalSyntheticLambda0(i3), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$EarningsCounter$startHeaderBounceEffect(CoroutineScope coroutineScope, Function0 function0, Animatable animatable, Animatable animatable2, ContinuationImpl continuationImpl) {
        EarningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1 earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1;
        int i;
        if (continuationImpl instanceof EarningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1) {
            earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1 = (EarningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1) continuationImpl;
            int i2 = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job[] jobArr = {JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, continuation, 25), 3), JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable2, continuation, 24), 3)};
                    earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.L$1 = function0;
                    earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.label = 1;
                    if (AwaitKt.joinAll(jobArr, earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
        }
        earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1 = new EarningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1(continuationImpl);
        Object obj2 = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
