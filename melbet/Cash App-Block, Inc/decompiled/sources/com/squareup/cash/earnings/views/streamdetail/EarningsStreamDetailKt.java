package com.squareup.cash.earnings.views.streamdetail;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earnings.views.components.EarningsCardKt;
import com.squareup.cash.earnings.views.components.EarningsFilterBarKt;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda42;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsStreamDetailKt {
    public static final ComposableLambdaImpl lambda$256814110 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(22), false, 256814110);
    public static final ComposableLambdaImpl lambda$315697641 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(23), false, 315697641);

    public static final void AvatarOrShimmer(StackedAvatarViewModel.Single single, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2025783891);
        int i2 = (gapComposer2.changedInstance(single) ? 4 : 2) | i;
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else if (single != null) {
            gapComposer2.startReplaceGroup(1542492669);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            gapComposer = gapComposer2;
            AvatarsKt.Avatar(AvatarSize.Size48, single, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, gapComposer, 70 | ((i2 << 3) & 112), 24);
            gapComposer.end(false);
        } else {
            gapComposer2.startReplaceGroup(1542681862);
            VisibleKt.ShimmerBox(null, false, null, lambda$256814110, gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, i);
        }
    }

    public static final void Content(EarningsStreamDetailViewModel earningsStreamDetailViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(499318836);
        int i2 = (gapComposer.changedInstance(earningsStreamDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AvatarOrShimmer(earningsStreamDetailViewModel.getStreamAvatar(), gapComposer, 8);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.LoadError) {
                gapComposer.startReplaceGroup(-633120717);
                LoadErrorBlock(function1, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-633078092);
                PeriodAndAmount(earningsStreamDetailViewModel, gapComposer, i2 & 14);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DateFilter selectedFilter = earningsStreamDetailViewModel.getSelectedFilter();
            if (earningsStreamDetailViewModel.getFilterOptions().isEmpty() || selectedFilter == null) {
                gapComposer.startReplaceGroup(-632873740);
                DateFilterBarShimmerKt.DateFilterBarShimmer(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-632826403);
                List filterOptions = earningsStreamDetailViewModel.getFilterOptions();
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(12, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EarningsFilterBarKt.EarningsFilterBar(filterOptions, selectedFilter, (Function1) rememberedValue, null, null, false, gapComposer, 196608, 24);
                gapComposer.end(false);
            }
            EarningsHomeViewModel.EarningsActivity activity = earningsStreamDetailViewModel.getActivity();
            if (activity == null) {
                gapComposer.startReplaceGroup(-632591083);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-632591082);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                EarningsCardKt.EarningsActivitySection(activity, gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsStreamDetailKt$$ExternalSyntheticLambda0(earningsStreamDetailViewModel, function1, i);
        }
    }

    public static final void EarningsStreamDetail(EarningsStreamDetailViewModel earningsStreamDetailViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        earningsStreamDetailViewModel.getClass();
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1731814803);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsStreamDetailViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1273849645, new EarningsStreamDetailKt$$ExternalSyntheticLambda0(earningsStreamDetailViewModel, function1, 0, (byte) 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) earningsStreamDetailViewModel, function1, realImageLoader, i, 9);
        }
    }

    public static final void LoadErrorBlock(Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        boolean z;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1773383452);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_stream_detail_load_error_title), (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_stream_detail_load_error_body), (Map) null, (Function1) null, false);
            z = false;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                i3 = 12;
                function12 = function1;
                rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(12, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                i3 = 12;
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, null, null, false, false, null, lambda$315697641, gapComposer, 1572864, 62);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            function12 = function1;
            z = false;
            i3 = 12;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function12, i, i3, z);
        }
    }

    public static final void PeriodAndAmount(EarningsStreamDetailViewModel earningsStreamDetailViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-109757700);
        int i2 = (gapComposer.changedInstance(earningsStreamDetailViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(1237938134, new EarningsStreamDetailKt$$ExternalSyntheticLambda8(earningsStreamDetailViewModel, 0, (byte) 0), gapComposer), (Modifier) null, 0, Expect_jvmKt.rememberComposableLambda(91527321, new EarningsStreamDetailKt$$ExternalSyntheticLambda8(earningsStreamDetailViewModel, 2, (byte) 0), gapComposer), (Function3) null, (Function3) null, (Function2) null, gapComposer, 3078, 118);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsStreamDetailKt$$ExternalSyntheticLambda8(earningsStreamDetailViewModel, i);
        }
    }

    public static final void ShimmerLine(TextStyle textStyle, Composer composer, int i) {
        TextStyle textStyle2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-656875491);
        int i2 = (gapComposer.changed(textStyle) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            textStyle2 = textStyle;
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(327825742, new PoolDetailsViewKt$$ExternalSyntheticLambda28(((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (TextMeasurer.m979measurewNUYSr0$default(TextPainterKt.rememberTextMeasurer(gapComposer), " ", textStyle2, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size & BodyPartID.bodyIdMax)), 3), gapComposer), gapComposer, 3072, 7);
        } else {
            textStyle2 = textStyle;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerViewKt$$ExternalSyntheticLambda5(textStyle2, i);
        }
    }
}
