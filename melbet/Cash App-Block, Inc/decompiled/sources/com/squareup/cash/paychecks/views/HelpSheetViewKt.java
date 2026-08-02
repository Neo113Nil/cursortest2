package com.squareup.cash.paychecks.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FloatTweenSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda0;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.core.graphics.ColorUtils;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.tracing.Trace;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.BorrowAmountPickerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.borrow.views.BorrowAmountPickerKt$$ExternalSyntheticLambda11;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.SegmentedCircle$ContentLayoutPolicy;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.common.composeui.SegmentedCircleKt$SegmentedCircle$$inlined$SegmentedCircle$1;
import com.squareup.cash.common.composeui.SegmentedCircleKt$SegmentedCircle$3$1$1;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.AlertDialogButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.viewmodels.ActiveDistributionSectionBodyViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel$Icon$Color;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel$TitleBadge$Lock;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckIconModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.PaycheckCircles;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.savings.views.FullTransferInViewKt$ReadyContent$2$1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.workflow1.Snapshots;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatRange;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import string.TrimMode;

/* loaded from: classes6.dex */
public abstract class HelpSheetViewKt {
    public static final ComposableLambdaImpl lambda$1237500543 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(2), false, 1237500543);
    public static final ComposableLambdaImpl lambda$964579416 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(3), false, 964579416);
    public static final ComposableLambdaImpl lambda$192379583 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(9), false, 192379583);
    public static final ComposableLambdaImpl lambda$1380301335 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(4), false, 1380301335);

    public static final void Active(MultipleAllocationViewModel.Active active, Function1 function1, Function1 function12, Composer composer, int i) {
        Function1 function13;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(118787446);
        int i2 = i | (gapComposer.changedInstance(active) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            function13 = function1;
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, null, Expect_jvmKt.rememberComposableLambda(-396440754, new MultipleAllocationViewKt$$ExternalSyntheticLambda3(function1, active), gapComposer), Expect_jvmKt.rememberComposableLambda(-662617473, new PaycheckCirclesKt$$ExternalSyntheticLambda3(14, active, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1372430408, new BasicShieetScope$$ExternalSyntheticLambda0(active, function1, function12, active.updateViewModel, 9), gapComposer), gapComposer, 224256, 7);
            BottomSheet bottomSheet = active.explanation;
            if (bottomSheet == null) {
                gapComposer.startReplaceGroup(-252733151);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-252733150);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                PaycheckDistributionMonthlyEstimateExplanation(bottomSheet, null, (Function0) rememberedValue, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            function13 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0((Object) active, function13, (Object) function12, i, 20);
        }
    }

    public static final void ActiveDistributionSection(PaychecksHomeViewModel.Content.Section.ActiveDistribution activeDistribution, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1364441794);
        int i2 = (gapComposer.changedInstance(activeDistribution) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = activeDistribution.title;
            String str2 = activeDistribution.button.text;
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(activeDistribution);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(17, function1, activeDistribution);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, str2, (Function0) rememberedValue, (String) null, gapComposer, 0, 18);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ArcadeActiveDistributionsSectionBody(activeDistribution.body, null, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(activeDistribution, function1, i, 8);
        }
    }

    public static final void ActivitySection(PaychecksHomeViewModel.Content.Section.ArcadeActivity arcadeActivity, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1745627697);
        int i2 = (gapComposer.changedInstance(arcadeActivity) ? 4 : 2) | i;
        int i3 = 25;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            AvatarsKt.ActivityEmbeddedView(arcadeActivity.embedded, null, Expect_jvmKt.rememberComposableLambda(-193125555, new P2PListViewKt$$ExternalSyntheticLambda12(arcadeActivity, i3), gapComposer), lambda$1237500543, null, gapComposer, 3456, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(arcadeActivity, i, i3);
        }
    }

    public static final void Amount(String str, PaychecksReceiptViewModel.Section.Row.Treatment treatment, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1856296495);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(treatment.ordinal()) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = treatment.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1489499242);
                j = MooncakeTheme.getColors(gapComposer).label;
                gapComposer.end(false);
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1489500596, false);
                }
                gapComposer.startReplaceGroup(-1489497409);
                j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                gapComposer.end(false);
            }
            long j2 = j;
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle = mooncakeTypography.mainBody;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            KeypadKt.m3651TextPdH14aY(0, 0, 6, 0, (i2 & 14) | 48, 0, 3824, j2, (Composer) gapComposer, (Modifier) companion, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(str, treatment, modifier2, i, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void ArcadeActiveDistributionsSectionBody(ActiveDistributionSectionBodyViewModel activeDistributionSectionBodyViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1132139031);
        char c = 4;
        int i2 = (gapComposer.changedInstance(activeDistributionSectionBodyViewModel) ? 4 : 2) | i | 48;
        final boolean z = 0;
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1299182638, new SuggestionUiKt$$ExternalSyntheticLambda8(activeDistributionSectionBodyViewModel, 24), gapComposer), gapComposer, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            gapComposer.startReplaceGroup(-534078792);
            for (final ActiveDistributionSectionBodyViewModel.Allocation allocation : activeDistributionSectionBodyViewModel.allocations) {
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1295660766, new Function2() { // from class: com.squareup.cash.paychecks.views.ActiveDistributionsSectionBodyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = z;
                        ActiveDistributionSectionBodyViewModel.Allocation allocation2 = allocation;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f);
                                    Color forTheme = ThemablesKt.forTheme(allocation2.color, gapComposer2);
                                    forTheme.getClass();
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, forTheme.value, RoundedCornerShapeKt.CircleShape), gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocation2.label, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-661361757, new Function2() { // from class: com.squareup.cash.paychecks.views.ActiveDistributionsSectionBodyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        ActiveDistributionSectionBodyViewModel.Allocation allocation2 = allocation;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f);
                                    Color forTheme = ThemablesKt.forTheme(allocation2.color, gapComposer2);
                                    forTheme.getClass();
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, forTheme.value, RoundedCornerShapeKt.CircleShape), gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocation2.label, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, null, false, false, null, null, new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(925142317, new PoolListSectionKt$$ExternalSyntheticLambda8(allocation, j, 5), gapComposer), (int) z), 0L, gapComposer, 54, 3580);
                c = 4;
                i3 = 1;
                z = z;
                j = j;
                companion = companion;
            }
            gapComposer.end(z);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(activeDistributionSectionBodyViewModel, modifier2, i, 4);
        }
    }

    public static final void ArcadePaychecksHome(PaychecksHomeViewModel paychecksHomeViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        paychecksHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-704680416);
        int i2 = (gapComposer.changedInstance(paychecksHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-840383435, new ArcadePaychecksHomeView$$ExternalSyntheticLambda0(function1, paychecksHomeViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0((Object) paychecksHomeViewModel, function1, (Object) modifier2, i, 17);
        }
    }

    public static final void BenefitsModuleHeader(final PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel benefitsModuleHeaderViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier modifier4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1940916124);
        int i4 = i | (gapComposer.changedInstance(benefitsModuleHeaderViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        final int i6 = 0;
        final int i7 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i5 != 0) {
                modifier2 = companion;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1114923205, new Function2() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i6;
                    PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel benefitsModuleHeaderViewModel2 = benefitsModuleHeaderViewModel;
                    switch (i8) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleHeaderViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleHeaderViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), modifier2, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1399578078, new Function2() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i7;
                    PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel benefitsModuleHeaderViewModel2 = benefitsModuleHeaderViewModel;
                    switch (i8) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleHeaderViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleHeaderViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i3 >> 3) & 112) | 3078, 4);
            Modifier modifier5 = modifier2;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(benefitsModuleHeaderViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(19, function1, benefitsModuleHeaderViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1875163419, new P2PListViewKt$$ExternalSyntheticLambda12(benefitsModuleHeaderViewModel, 24), gapComposer);
            int ordinal = benefitsModuleHeaderViewModel.button.prominence.ordinal();
            if (ordinal == 0) {
                modifier4 = null;
                gapComposer.startReplaceGroup(1189751798);
                coil3.size.SizeKt.ButtonCompact(function0, m300paddingVpY3zN4$default, null, false, false, null, rememberComposableLambda, gapComposer, 1572864, 60);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1189750415, false);
                }
                gapComposer.startReplaceGroup(-1772297872);
                modifier4 = null;
                coil3.size.SizeKt.ButtonCompact(function0, m300paddingVpY3zN4$default, ButtonProminence.PROMINENT, false, false, null, rememberComposableLambda, gapComposer, 1573248, 56);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier4);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, modifier4);
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) benefitsModuleHeaderViewModel, function1, modifier3, i, i2, 8);
        }
    }

    public static final void BenefitsModuleNullStateHeader(final PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel benefitsModuleNullStateViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier.Companion companion;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(767067395);
        int i2 = i | (gapComposer2.changedInstance(benefitsModuleNullStateViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        final int i3 = 1;
        final int i4 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion2);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            GapComposer gapComposer3 = gapComposer2;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1747346404, new Function2() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel benefitsModuleNullStateViewModel2 = benefitsModuleNullStateViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleNullStateViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer3;
                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleNullStateViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), modifier, (Function2) null, Expect_jvmKt.rememberComposableLambda(155582913, new Function2() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel benefitsModuleNullStateViewModel2 = benefitsModuleNullStateViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleNullStateViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer3;
                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleNullStateViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer3, ((i2 >> 3) & 112) | 3078, 4);
            PaychecksHomeViewModel.Content.Button button = benefitsModuleNullStateViewModel.seeAllBenefitsButton;
            if (button == null) {
                gapComposer3.startReplaceGroup(-174669237);
                gapComposer3.end(false);
                companion = companion2;
            } else {
                gapComposer3.startReplaceGroup(-174669236);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer3.changedInstance(button);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda15(function1, button, 0);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                companion = companion2;
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-321343806, new ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda16(button, i4), gapComposer3), gapComposer3, 1573248, 58);
                gapComposer3 = gapComposer3;
                gapComposer3.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            long j = colors.semantic.border.subtle;
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(m178borderxT4_qwU, RecyclerView.DECELERATION_RATE, 8.0f, 1);
            TimelineState rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer3, 1);
            gapComposer3.startReplaceGroup(1656955309);
            ArrayList<PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel.BenefitRequirement> arrayList = benefitsModuleNullStateViewModel.benefitRequirements;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel.BenefitRequirement benefitRequirement : arrayList) {
                TimelineItem.State state = benefitRequirement.requirementComplete ? TimelineItem.State.Done : TimelineItem.State.Incomplete;
                String str = benefitRequirement.title;
                String str2 = benefitRequirement.body;
                PaychecksHomeViewModel.Content.Button button2 = benefitRequirement.button;
                if (button2 == null) {
                    gapComposer3.startReplaceGroup(-1191801218);
                    gapComposer3.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer3.startReplaceGroup(-1191801217);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1509135449, new ProfileKt$$ExternalSyntheticLambda1(i3, (Object) button2, function1), gapComposer3);
                    gapComposer3.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                arrayList2.add(LazyListLayoutInfoKt.TimelineItem$default(state, str, null, str2, null, composableLambdaImpl, 52));
            }
            gapComposer3.end(false);
            GapComposer gapComposer4 = gapComposer3;
            LazyListLayoutInfoKt.Timeline(rememberTimelineState, Tags.toImmutableList(arrayList2), m300paddingVpY3zN4$default2, gapComposer4, 0, 0);
            gapComposer = gapComposer4;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0((Object) benefitsModuleNullStateViewModel, function1, (Object) modifier, i, 16);
        }
    }

    public static final void ConfigurationRow(EditDistributionViewModel.Content.Configuration configuration, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        EditDistributionViewModel.Content.Configuration configuration2;
        Modifier wrapContentHeight;
        String m;
        configuration.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2020932733);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(configuration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(ImageKt.m178borderxT4_qwU(ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape(56)), 2.0f, MooncakeTheme.getColors(gapComposer).secondaryButtonBackground, RoundedCornerShapeKt.RoundedCornerShape(56)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            int i3 = i2 & 896;
            boolean changedInstance = (i3 == 256) | gapComposer.changedInstance(configuration);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ConfigurationRowKt$$ExternalSyntheticLambda0(function1, configuration, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(wrapContentHeight, false, null, null, (Function0) rememberedValue, 15), RecyclerView.DECELERATION_RATE, 12.0f, 1);
            boolean changedInstance2 = (i3 == 256) | gapComposer.changedInstance(configuration);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda6(28, configuration, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m300paddingVpY3zN4$default, (Function1) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Image image = configuration.image;
            if (image == null) {
                gapComposer.startReplaceGroup(-1626780915);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -329571468, image, gapComposer, false);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1438AsyncImage10Xjiaw(m, null, ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 24.0f), RoundedCornerShapeKt.CircleShape), MooncakeTheme.getColors(gapComposer).secondaryButtonBackground, ColorKt.RectangleShape), null, null, null, gapComposer, 48, 2040);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(rowScopeInstance.weight(1.0f, companion, true), 8.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier weight = rowScopeInstance.weight(1.0f, companion, false);
            String str = configuration.title;
            long j = MooncakeTheme.getColors(gapComposer).label;
            TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).smallTitle;
            gapComposer = gapComposer;
            KeypadKt.m3651TextPdH14aY(1, 0, 0, 2, 196608, 6, 3024, j, (Composer) gapComposer, weight, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            KeypadKt.m3651TextPdH14aY(1, 0, 0, 0, 196656, 0, 4048, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.wrapContentWidth$default(companion, null, 3), 6.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, configuration.subtitle, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            configuration2 = configuration;
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.wrapContentSize$default(companion, null, 3), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 11), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, configuration2.action.text, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            configuration2 = configuration;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(configuration2, modifier, function1, i);
        }
    }

    public static final void ContentSlot(DistributePaycheckViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(707698786);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            gapComposer.startReplaceGroup(692894235);
            Iterator it = loaded.allocations.iterator();
            while (it.hasNext()) {
                DestinationAllocationRow((DestinationAllocationRowViewModel) it.next(), function1, null, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DistributePaycheckViewKt$$ExternalSyntheticLambda0(loaded, function1, i);
        }
    }

    public static final void Controls(int i, Composer composer, Modifier modifier, EditDistributionViewModel.Content content, Function1 function1) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-665555233);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = false;
            ArrayList arrayList = content.atmPickerOptions;
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            TrimMode.AtmPickerGrid((i2 >> 3) & 14, 0, gapComposer, modifier2, arrayList, (Function1) rememberedValue);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditDistributionViewKt$$ExternalSyntheticLambda10(content, modifier2, function1, i);
        }
    }

    public static final void CustomAllocationView(AmountPickerViewModel amountPickerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1185546051);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (amountPickerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FullTransferInViewKt$$ExternalSyntheticLambda0(amountPickerViewModel, function1, i, i4);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(364997320, new FullTransferInViewKt$$ExternalSyntheticLambda1(function1, amountPickerViewModel, 5), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new FullTransferInViewKt$$ExternalSyntheticLambda2(amountPickerViewModel, function1, modifier2, i, 1);
        }
    }

    public static final void Destination(String str, PaychecksReceiptViewModel.Section.Row.Treatment treatment, Modifier modifier, String str2, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-349372724);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(treatment.ordinal()) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(str2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int ordinal = treatment.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-739732431);
                j = MooncakeTheme.getColors(gapComposer).label;
                gapComposer.end(false);
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -739733785, false);
                }
                gapComposer.startReplaceGroup(-739730598);
                j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                gapComposer.end(false);
            }
            long j2 = j;
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(str2, 22);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, i2 & 14, 0, 4080, j2, (Composer) gapComposer, semantics, mooncakeTypography.mainBody, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(str, treatment, modifier, str2, i, 6);
        }
    }

    public static final void DestinationAllocationRow(DestinationAllocationRowViewModel destinationAllocationRowViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Map mapOf;
        destinationAllocationRowViewModel.getClass();
        DestinationAllocationRowViewModel.Accessory accessory = destinationAllocationRowViewModel.accessory;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1688996151);
        int i2 = i | (gapComposer.changedInstance(destinationAllocationRowViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            long arcade = toArcade(accessory.color, gapComposer);
            DestinationAllocationRowViewModel$TitleBadge$Lock destinationAllocationRowViewModel$TitleBadge$Lock = destinationAllocationRowViewModel.titleBadge;
            if (destinationAllocationRowViewModel$TitleBadge$Lock == null) {
                gapComposer.startReplaceGroup(-1076732293);
                gapComposer.end(false);
                mapOf = null;
            } else {
                gapComposer.startReplaceGroup(-1076732292);
                if (!destinationAllocationRowViewModel$TitleBadge$Lock.equals(DestinationAllocationRowViewModel$TitleBadge$Lock.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 809672843, false);
                }
                gapComposer.startReplaceGroup(809674139);
                mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("lock", new InlineTextContent(new Placeholder(7, Snapshots.getNotScaledUp(Room.getSp(24), gapComposer), Snapshots.getNotScaledUp(Room.getSp(16), gapComposer)), lambda$192379583)));
                gapComposer.end(false);
                gapComposer.end(false);
            }
            if (mapOf == null) {
                mapOf = EmptyMap.INSTANCE;
                mapOf.getClass();
            }
            MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda6 = new MusicViewKt$$ExternalSyntheticLambda6(29, destinationAllocationRowViewModel, function1);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, musicViewKt$$ExternalSyntheticLambda6);
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda8(accessory, arcade, 6), true, -1066349511), 2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(375422117, new SuggestionUiKt$$ExternalSyntheticLambda8(destinationAllocationRowViewModel, 27), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1776061018, new PaycheckCirclesKt$$ExternalSyntheticLambda3(10, destinationAllocationRowViewModel, mapOf), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(destinationAllocationRowViewModel) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DestinationAllocationRowKt$$ExternalSyntheticLambda2(function1, destinationAllocationRowViewModel, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, clearAndSetSemantics, (Function0) rememberedValue, false, false, null, null, label, 0L, gapComposer, 54, 3568);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(destinationAllocationRowViewModel, function1, modifier2, i, 11);
        }
    }

    public static final void DirectDepositSection(PaychecksHomeViewModel.Content.Section.DirectDeposit directDeposit, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1577933352);
        int i2 = (gapComposer2.changedInstance(directDeposit) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        int i3 = 6;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            gapComposer = gapComposer2;
            DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(1399558234, new PoolToastKt$$ExternalSyntheticLambda0(19, directDeposit, function1, mutableState), gapComposer2), gapComposer, 24624, 13);
            if ((directDeposit instanceof PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit) && ((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(205385302);
                PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent = ((PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit) directDeposit).pendingSheetContent;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OverlayKt$$ExternalSyntheticLambda1(i3, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                PendingDirectDepositSheet(pendingDirectDepositSheetContent, (Function0) rememberedValue2, null, null, gapComposer, 48);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(205527530);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(directDeposit, function1, i, i3);
        }
    }

    public static final void Disclosure(PaychecksHomeViewModel.Content.DisclosureFooter disclosureFooter, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(567044270);
        int i2 = (gapComposer.changedInstance(disclosureFooter) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            if (disclosureFooter.showIcon.equals(Boolean.TRUE)) {
                gapComposer.startReplaceGroup(-1964081688);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(Icons.Fdic32, (String) null, (Modifier) null, colors.semantic.icon.standard, gapComposer, 54, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1963950806);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str = disclosureFooter.text;
            if (str == null) {
                gapComposer.startReplaceGroup(-1963897797);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1963897796);
                DisclosureMarkdownText(str, function1, gapComposer, i2 & 112);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(disclosureFooter, function1, i, 5);
        }
    }

    public static final void DisclosureMarkdownText(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1122455105);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, i2 & 14, 864);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 10);
        }
    }

    public static final void DistributePaycheck(final DistributePaycheckViewModel.Loaded loaded, final Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2049274071);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i5 = 28;
            DistributionFlowScreen(Expect_jvmKt.rememberComposableLambda(-1063967522, new DistributePaycheckViewKt$$ExternalSyntheticLambda0(loaded, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-116800579, new SuggestionUiKt$$ExternalSyntheticLambda8(loaded, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(2062636901, new P2PListViewKt$$ExternalSyntheticLambda12(loaded, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(1998397419, new Function3() { // from class: com.squareup.cash.paychecks.views.DistributePaycheckViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i3;
                    Function1 function12 = function1;
                    DistributePaycheckViewModel.Loaded loaded2 = loaded;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                HelpSheetViewKt.ContentSlot(loaded2, function12, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Modifier modifier2 = (Modifier) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modifier2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modifier2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                HelpSheetViewKt.FooterSlot((intValue2 << 3) & 112, gapComposer3, modifier2, loaded2.buttonText, function12);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(101781137, new Function3() { // from class: com.squareup.cash.paychecks.views.DistributePaycheckViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    Function1 function12 = function1;
                    DistributePaycheckViewModel.Loaded loaded2 = loaded;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                HelpSheetViewKt.ContentSlot(loaded2, function12, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Modifier modifier2 = (Modifier) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modifier2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modifier2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                HelpSheetViewKt.FooterSlot((intValue2 << 3) & 112, gapComposer3, modifier2, loaded2.buttonText, function12);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), modifier, gapComposer, ((i2 << 9) & 458752) | 28086);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(loaded, function1, modifier, i, 12);
        }
    }

    public static final void DistributionFlowScreen(ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, ComposableLambdaImpl composableLambdaImpl4, Modifier modifier, Composer composer, int i) {
        int i2;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(981004030);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(modifier, 1.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(1359284438, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 25), gapComposer), Expect_jvmKt.rememberComposableLambda(-927976825, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl4, 28), gapComposer), Expect_jvmKt.rememberComposableLambda(255514176, new AppBarKt$$ExternalSyntheticLambda0(function2, composableLambdaImpl2, composableLambdaImpl3, i3), gapComposer), gapComposer, 224256, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(i, 7, modifier, composableLambdaImpl, function2, composableLambdaImpl2, composableLambdaImpl4, composableLambdaImpl3);
        }
    }

    public static final void DistributionsNullStateSection(final PaychecksHomeViewModel.Content.Section.DistributionsNullState distributionsNullState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        final Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(379620572);
        int i2 = i | (gapComposer2.changedInstance(distributionsNullState) ? 4 : 2) | (gapComposer2.changedInstance(function12) ? 32 : 16);
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = distributionsNullState.title;
            String str2 = distributionsNullState.subtitle;
            int i4 = i2 & 112;
            boolean changedInstance = (i4 == 32) | gapComposer2.changedInstance(distributionsNullState);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = r3;
                        PaychecksHomeViewModel.Content.Section.DistributionsNullState distributionsNullState2 = distributionsNullState;
                        Function1 function13 = function12;
                        switch (i5) {
                            case 0:
                                function13.invoke(distributionsNullState2.callToActionButtonAction);
                                break;
                            default:
                                function13.invoke(distributionsNullState2.callToActionButtonAction);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) rememberedValue, str2, gapComposer2, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ImageKt.Image(Countries.painterResource(R.drawable.arcade_paychecks_distribution_nux, 0, gapComposer2), null, SizeKt.m285size3ABfNKs(companion, 120.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable | 432, 120);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            int i5 = (gapComposer2.changedInstance(distributionsNullState) ? 1 : 0) | (i4 == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i3;
                        PaychecksHomeViewModel.Content.Section.DistributionsNullState distributionsNullState2 = distributionsNullState;
                        Function1 function13 = function12;
                        switch (i52) {
                            case 0:
                                function13.invoke(distributionsNullState2.callToActionButtonAction);
                                break;
                            default:
                                function13.invoke(distributionsNullState2.callToActionButtonAction);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m300paddingVpY3zN4$default, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-109728265, new P2PListViewKt$$ExternalSyntheticLambda12(distributionsNullState, 26), gapComposer2), gapComposer2, 1572864, 60);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(distributionsNullState, function12, i, 7);
        }
    }

    public static final void EditDistribution(EditDistributionViewModel editDistributionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        EditDistributionViewModel editDistributionViewModel2;
        editDistributionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1867872240);
        int i2 = (gapComposer.changedInstance(editDistributionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            editDistributionViewModel2 = editDistributionViewModel;
            TransactorKt.LoadableContent(editDistributionViewModel2, editDistributionViewModel instanceof EditDistributionViewModel.Loading, null, LoadingIndicatorPosition.CENTER, null, null, Expect_jvmKt.rememberComposableLambda(-1991863191, new EditDistributionViewKt$$ExternalSyntheticLambda0(i3, modifier, function1), gapComposer), gapComposer, (i2 & 14) | 1575936, 52);
        } else {
            editDistributionViewModel2 = editDistributionViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditDistributionViewKt$$ExternalSyntheticLambda1(editDistributionViewModel2, function1, modifier, i);
        }
    }

    public static final void EditDistributionContent(int i, Composer composer, Modifier modifier, EditDistributionViewModel.Content content, Function1 function1) {
        Modifier modifier2;
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(435486316);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier2 = modifier;
            DistributionFlowScreen(Expect_jvmKt.rememberComposableLambda(-1521241695, new EditDistributionViewKt$$ExternalSyntheticLambda5(content, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1116719360, new EditDistributionViewKt$$ExternalSyntheticLambda6(content, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-1716172632, new PoolToastKt$$ExternalSyntheticLambda0(22, function1, rememberUpdatableViewModel(content.wheelViewModel, gapComposer, 0), content), gapComposer), Expect_jvmKt.rememberComposableLambda(-1843569106, new EditDistributionViewKt$$ExternalSyntheticLambda8(content, function1, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-1836217900, new EditDistributionViewKt$$ExternalSyntheticLambda8(content, function1, i2), gapComposer), modifier2, gapComposer, ((i3 << 9) & 458752) | 28086);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditDistributionViewKt$$ExternalSyntheticLambda10(content, function1, modifier2, i);
        }
    }

    public static final void Footer(int i, Composer composer, Modifier modifier, EditDistributionViewModel.Content content, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-534517344);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            EditDistributionViewModel.Content.Configuration configuration = content.configuration;
            if (configuration == null) {
                gapComposer.startReplaceGroup(-1345262118);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1345262117);
                ConfigurationRow(configuration, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), function1, gapComposer, ((i2 << 3) & 896) | 48);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m278heightInVpY3zN4(companion, RecyclerView.DECELERATION_RATE, 16.0f));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-462744296, new EditDistributionViewKt$$ExternalSyntheticLambda8(content, function1, i3), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(content, function1, modifier, i, 13);
        }
    }

    public static final void FooterSlot(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2052880721);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-495296019, new PoolToastKt$$ExternalSyntheticLambda0(21, (Object) modifier, str, function1), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DistributePaycheckViewKt$$ExternalSyntheticLambda7(modifier, function1, str, i);
        }
    }

    public static final void HelpSheetRow(int i, HelpSheetViewModel.Row row, Composer composer, int i2) {
        HelpSheetViewModel.Row row2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-662111595);
        Applier applier = gapComposer.applier;
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changedInstance(row) ? 32 : 16);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer).background, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).icon, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), 8.0f, 2.0f), MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, String.valueOf(i), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            row2 = row;
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, row2.text, (Map) null, (Function1) null, false);
            String str = row2.subtext;
            if (str == null) {
                gapComposer.startReplaceGroup(1194523720);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1194523721);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).caption, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            row2 = row;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(i, row2, i2);
        }
    }

    public static final void HelpSheetView(HelpSheetViewModel helpSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        helpSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(914592055);
        int i2 = (gapComposer.changedInstance(helpSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(282538610, new HelpSheetViewKt$$ExternalSyntheticLambda0(modifier, helpSheetViewModel, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetViewKt$$ExternalSyntheticLambda0(helpSheetViewModel, function1, modifier, i);
        }
    }

    public static final void Icon(com.squareup.protos.cash.ui.Color color, PaychecksReceiptViewModel.Section.Row.Treatment treatment, Modifier modifier, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-336856958);
        int i2 = (gapComposer.changedInstance(color) ? 4 : 2) | i | (gapComposer.changed(treatment.ordinal()) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = treatment.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1596985094);
                Color composeColor = ComposeUtilsKt.toComposeColor(color, gapComposer);
                composeColor.getClass();
                j = composeColor.value;
                gapComposer.end(false);
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1596986233, false);
                }
                gapComposer.startReplaceGroup(-1596982674);
                j = MooncakeTheme.getColors(gapComposer).disabledIcon;
                gapComposer.end(false);
            }
            boolean changed = gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(6, gapComposer, modifier, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(color, treatment, modifier, i, 26);
        }
    }

    public static final void MultipleAllocation(MultipleAllocationViewModel multipleAllocationViewModel, Function1 function1, Composer composer, int i) {
        MultipleAllocationViewModel multipleAllocationViewModel2;
        multipleAllocationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1296554855);
        int i2 = (gapComposer.changedInstance(multipleAllocationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = multipleAllocationViewModel instanceof MultipleAllocationViewModel.Loading;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            multipleAllocationViewModel2 = multipleAllocationViewModel;
            Strings.LoadableFullScreenContent(multipleAllocationViewModel2, z2, ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(947607905, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 11), gapComposer), gapComposer, (i2 & 14) | 196608, 24);
        } else {
            multipleAllocationViewModel2 = multipleAllocationViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MultipleAllocationView$$ExternalSyntheticLambda1(multipleAllocationViewModel2, function1, i);
        }
    }

    public static final void PaycheckAlertDialog(PaycheckAlertDialogViewModel paycheckAlertDialogViewModel, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        paycheckAlertDialogViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-14225228);
        int i4 = (gapComposer.changedInstance(paycheckAlertDialogViewModel) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changedInstance(function1) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i5 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function1 = (Function1) rememberedValue;
            }
            String str = paycheckAlertDialogViewModel.title;
            String str2 = paycheckAlertDialogViewModel.message;
            String str3 = paycheckAlertDialogViewModel.primaryButton.text;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda2(27, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.AlertDialogContent(null, lambda$1380301335, str, str2, new AlertDialogButton(str3, (Function0) rememberedValue2), null, false, gapComposer, 48, 97);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Function1 function12 = function1;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(paycheckAlertDialogViewModel, function12, i, i2, 19);
        }
    }

    public static final void PaycheckCircles(int i, Composer composer, Modifier modifier, List list) {
        Modifier modifier2;
        ComposableLambdaImpl rememberComposableLambda;
        PaycheckCircles.Placement[] placementArr = PaycheckCircles.Placement.$VALUES;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1061523547);
        Applier applier = gapComposer.applier;
        int i2 = 4;
        int i3 = 16;
        int i4 = (gapComposer.changed(1) ? 4 : 2) | i | (gapComposer.changedInstance(list) ? 32 : 16) | 3072;
        int i5 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(modifier2, 24.0f);
            int i6 = 3;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(-4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1176179765);
            float f = 1.0f;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
            gapComposer.startReplaceGroup(424758421);
            List<PaycheckIconModel> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (PaycheckIconModel paycheckIconModel : list2) {
                if (paycheckIconModel instanceof PaycheckIconModel.Unknown) {
                    gapComposer.startReplaceGroup(-319719224);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(237197439, new ScoreHomeKt$$ExternalSyntheticLambda4(fillMaxSize, i2), gapComposer);
                    gapComposer.end(false);
                } else if (paycheckIconModel instanceof PaycheckIconModel.Avatar) {
                    gapComposer.startReplaceGroup(-319499217);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-758450056, new PaycheckCirclesKt$$ExternalSyntheticLambda3(i5, (PaycheckIconModel.Avatar) paycheckIconModel, fillMaxSize), gapComposer);
                    gapComposer.end(false);
                } else {
                    if (!(paycheckIconModel instanceof PaycheckIconModel.Overflow)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1513706572, false);
                    }
                    gapComposer.startReplaceGroup(-319408418);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1450674425, new PaycheckCirclesKt$$ExternalSyntheticLambda3(i3, (PaycheckIconModel.Overflow) paycheckIconModel, fillMaxSize), gapComposer);
                    gapComposer.end(false);
                }
                arrayList.add(rememberComposableLambda);
            }
            gapComposer.end(false);
            Iterator it = arrayList.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                Function2 function2 = (Function2) next;
                Modifier aspectRatio = OffsetKt.aspectRatio(f, SizeKt.fillMaxHeight(modifier2, f), false);
                if (i7 > 0) {
                    gapComposer.startReplaceGroup(1824189210);
                    aspectRatio = aspectRatio.then(ClipKt.drawWithContent(modifier2, new UtilsKt$$ExternalSyntheticLambda0(new OffsetKt$$ExternalSyntheticLambda0(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer), DensityUtilsKt.m3477toPx8Feqmps(2.0f, gapComposer), i6), 8)));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1824376605);
                    gapComposer.end(false);
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, aspectRatio);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Recorder$$ExternalSyntheticOutline1.m(0, function2, gapComposer, true);
                i7 = i8;
                f = 1.0f;
                i6 = 3;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier2, i, 7);
        }
    }

    public static final void PaycheckDistributionMonthlyEstimateExplanation(BottomSheet bottomSheet, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        bottomSheet.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-595096516);
        int i2 = i | (gapComposer.changedInstance(bottomSheet) ? 4 : 2) | 48 | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(8, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposeBottomSheetKt.BottomSheet(null, bottomSheet, (Function0) rememberedValue, false, false, 0, null, Navigation.ArcadeBottomSheetStyle(gapComposer), Expect_jvmKt.rememberComposableLambda(-773344965, new PaycheckCircles$$ExternalSyntheticLambda3(10), gapComposer), gapComposer, ((i2 << 3) & 112) | 117440512, 121);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(bottomSheet, modifier2, function0, i, 25);
        }
    }

    public static final void PaycheckDistributionMonthlyEstimateExplanationContent(BottomSheet bottomSheet, Composer composer, int i) {
        int i2;
        bottomSheet.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1311191709);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(bottomSheet) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 0, 498, Strings.getColors(gapComposer).semantic.text.standard, 0L, gapComposer, null, Strings.getTypography(gapComposer).header, bottomSheet.title, null);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 0, 498, Strings.getColors(gapComposer).semantic.text.subtle, 0L, gapComposer, null, Strings.getTypography(gapComposer).bodyMedium, bottomSheet.description, null);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(bottomSheet, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaycheckDistributionWheel(DistributionWheelViewModel distributionWheelViewModel, PaycheckDistributionWheel$PlacementConfig paycheckDistributionWheel$PlacementConfig, Modifier modifier, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function2 function24;
        int i4;
        Function2 function25;
        int i5;
        int i6;
        Function2 function26;
        int i7;
        int i8;
        Modifier modifier3;
        Function2 function27;
        Function2 function28;
        Function2 function29;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        Modifier modifier4;
        Function2 function210;
        Function2 function211;
        boolean z;
        boolean z2;
        Modifier modifier5;
        int i9;
        DistributionWheelViewModel distributionWheelViewModel2;
        ArrayList arrayList;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function14;
        Applier applier;
        boolean z3;
        Modifier.Companion companion;
        Modifier modifier6;
        Modifier semantics;
        Function2 function212;
        Function1 function15;
        char c;
        ComposeDecoratedAllocation decorateSingleAndAnimateAsState;
        distributionWheelViewModel.getClass();
        ArrayList arrayList2 = distributionWheelViewModel.allocations;
        paycheckDistributionWheel$PlacementConfig.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-937989715);
        Applier applier2 = gapComposer.applier;
        int i10 = (gapComposer.changedInstance(distributionWheelViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(paycheckDistributionWheel$PlacementConfig) ? 32 : 16);
        int i11 = i2 & 4;
        if (i11 != 0) {
            i10 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i10 |= gapComposer.changed(modifier2) ? 256 : 128;
            int i12 = i2 & 8;
            int i13 = i12 == 0 ? i10 | 3072 : i10 | (gapComposer.changedInstance(function1) ? 2048 : 1024);
            i3 = i2 & 16;
            if (i3 == 0) {
                i13 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function2;
                i13 |= gapComposer.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                i4 = i2 & 32;
                if (i4 != 0) {
                    i5 = i13 | 196608;
                    function25 = function22;
                } else {
                    function25 = function22;
                    i5 = i13 | (gapComposer.changedInstance(function25) ? PKIFailureInfo.unsupportedVersion : 65536);
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i7 = i5 | 1572864;
                    function26 = function23;
                } else {
                    function26 = function23;
                    i7 = i5 | (gapComposer.changedInstance(function26) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                }
                i8 = i7;
                if (gapComposer.shouldExecute(i8 & 1, (i8 & 599187) != 599186)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (i11 != 0) {
                        modifier2 = companion2;
                    }
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (i12 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy2) {
                            rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(18);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function13 = (Function1) rememberedValue;
                    } else {
                        function13 = function1;
                    }
                    int i14 = 6;
                    if (i3 != 0) {
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = new PaycheckCircles$$ExternalSyntheticLambda4(i14);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Function2 function213 = (Function2) rememberedValue2;
                        modifier4 = modifier2;
                        function210 = function213;
                    } else {
                        modifier4 = modifier2;
                        function210 = function24;
                    }
                    if (i4 != 0) {
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy2) {
                            rememberedValue3 = new PaycheckCircles$$ExternalSyntheticLambda4(7);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        function25 = (Function2) rememberedValue3;
                    }
                    Function2 function214 = function25;
                    if (i6 != 0) {
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy2) {
                            rememberedValue4 = new PaycheckCircles$$ExternalSyntheticLambda4(8);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        function211 = (Function2) rememberedValue4;
                    } else {
                        function211 = function26;
                    }
                    SegmentedCircleInteractableState m3501rememberSegmentedCircleInteractableStatekHDZbjc = VisibleKt.m3501rememberSegmentedCircleInteractableStatekHDZbjc(gapComposer);
                    boolean z4 = distributionWheelViewModel.interactable;
                    boolean changed = gapComposer.changed(arrayList2);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    Object obj = rememberedValue5;
                    if (changed || rememberedValue5 == neverEqualPolicy2) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            DistributionWheelViewModel.Allocation allocation = (DistributionWheelViewModel.Allocation) obj2;
                            if (allocation.getPercentage() > RecyclerView.DECELERATION_RATE || (allocation.getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected)) {
                                arrayList3.add(obj2);
                            }
                        }
                        DistributionWheelViewModel.Allocation[] allocationArr = (DistributionWheelViewModel.Allocation[]) arrayList3.toArray(new DistributionWheelViewModel.Allocation[0]);
                        Object[] copyOf = Arrays.copyOf(allocationArr, allocationArr.length);
                        SnapshotStateList snapshotStateList = new SnapshotStateList();
                        snapshotStateList.addAll(ArraysKt___ArraysKt.toList(copyOf));
                        gapComposer.updateRememberedValue(snapshotStateList);
                        obj = snapshotStateList;
                    }
                    SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                    boolean z5 = distributionWheelViewModel.animateChange;
                    boolean z6 = distributionWheelViewModel.tintAllocations;
                    boolean z7 = distributionWheelViewModel.desaturateNotSelectedAllocations;
                    gapComposer.startReplaceGroup(240030957);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList2, 10));
                    ListIterator listIterator = snapshotStateList2.listIterator();
                    while (true) {
                        StateListIterator stateListIterator = (StateListIterator) listIterator;
                        if (stateListIterator.hasNext()) {
                            DistributionWheelViewModel.Allocation allocation2 = (DistributionWheelViewModel.Allocation) stateListIterator.next();
                            ListIterator listIterator2 = listIterator;
                            if (allocation2 instanceof DistributionWheelViewModel.AllocationGroup) {
                                gapComposer.startReplaceGroup(-663836139);
                                DistributionWheelViewModel.AllocationGroup allocationGroup = (DistributionWheelViewModel.AllocationGroup) allocation2;
                                gapComposer.startReplaceGroup(895037900);
                                ArrayList arrayList5 = allocationGroup.subAllocations;
                                function212 = function210;
                                function15 = function13;
                                c = '\n';
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    arrayList6.add(decorateSingleAndAnimateAsState((DistributionWheelViewModel.SingleAllocation) it.next(), z5, z6, z7, gapComposer));
                                }
                                gapComposer.end(false);
                                decorateSingleAndAnimateAsState = new ComposeDecoratedAllocationGroup(allocationGroup.treatment, arrayList6);
                                gapComposer.end(false);
                            } else {
                                function212 = function210;
                                function15 = function13;
                                c = '\n';
                                if (!(allocation2 instanceof DistributionWheelViewModel.SingleAllocation)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2099624909, false);
                                }
                                gapComposer.startReplaceGroup(-663523628);
                                decorateSingleAndAnimateAsState = decorateSingleAndAnimateAsState((DistributionWheelViewModel.SingleAllocation) allocation2, z5, z6, z7, gapComposer);
                                gapComposer.end(false);
                            }
                            arrayList4.add(decorateSingleAndAnimateAsState);
                            listIterator = listIterator2;
                            function210 = function212;
                            function13 = function15;
                        } else {
                            Function2 function215 = function210;
                            Function1 function16 = function13;
                            gapComposer.end(false);
                            if (z4) {
                                ListIterator listIterator3 = snapshotStateList2.listIterator();
                                int i15 = 0;
                                while (true) {
                                    StateListIterator stateListIterator2 = (StateListIterator) listIterator3;
                                    if (!stateListIterator2.hasNext()) {
                                        i15 = -1;
                                        break;
                                    } else if (((DistributionWheelViewModel.Allocation) stateListIterator2.next()).getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (i15 < 0) {
                                    semantics = companion2;
                                    z = true;
                                    z2 = false;
                                } else {
                                    DistributionWheelViewModel.Allocation.Treatment treatment = ((DistributionWheelViewModel.Allocation) snapshotStateList2.get(i15)).getTreatment();
                                    treatment.getClass();
                                    DistributionWheelViewModel.Allocation.Treatment.InteractableSelected interactableSelected = (DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) treatment;
                                    float percentage = ((DistributionWheelViewModel.Allocation) snapshotStateList2.get(i15)).getPercentage();
                                    DatePickerKt$$ExternalSyntheticLambda6 datePickerKt$$ExternalSyntheticLambda6 = new DatePickerKt$$ExternalSyntheticLambda6(snapshotStateList2, i15, interactableSelected, function214, function211, 3);
                                    z2 = false;
                                    Modifier semantics2 = SemanticsModifierKt.semantics(companion2, false, datePickerKt$$ExternalSyntheticLambda6);
                                    ProgressSemanticsKt$$ExternalSyntheticLambda0 progressSemanticsKt$$ExternalSyntheticLambda0 = new ProgressSemanticsKt$$ExternalSyntheticLambda0(percentage, new ClosedFloatRange(0.01f, 1.0f), 100);
                                    z = true;
                                    semantics = SemanticsModifierKt.semantics(semantics2, true, progressSemanticsKt$$ExternalSyntheticLambda0);
                                }
                                modifier5 = semantics;
                            } else {
                                z = true;
                                z2 = false;
                                modifier5 = companion2;
                            }
                            if (z4) {
                                modifier4.getClass();
                                m3501rememberSegmentedCircleInteractableStatekHDZbjc.getClass();
                                function215.getClass();
                                function214.getClass();
                                function211.getClass();
                                arrayList = arrayList4;
                                distributionWheelViewModel2 = distributionWheelViewModel;
                                neverEqualPolicy = neverEqualPolicy2;
                                function14 = function16;
                                i9 = 6;
                                applier = applier2;
                                z3 = z2;
                                companion = companion2;
                                modifier6 = PlatformKt.composed(modifier4, new SwipeToDismissKt$$ExternalSyntheticLambda2(distributionWheelViewModel2, m3501rememberSegmentedCircleInteractableStatekHDZbjc, function211, function215, function214, 12));
                            } else {
                                i9 = 6;
                                distributionWheelViewModel2 = distributionWheelViewModel;
                                arrayList = arrayList4;
                                neverEqualPolicy = neverEqualPolicy2;
                                function14 = function16;
                                applier = applier2;
                                z3 = z2;
                                companion = companion2;
                                modifier6 = modifier4;
                            }
                            SegmentedCircleConfig.SizingConfig.Fixed fixed = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(8.0f, gapComposer));
                            SegmentedCircleConfig.SizingConfig.Fixed fixed2 = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(8.0f, gapComposer));
                            SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy = paycheckDistributionWheel$PlacementConfig.contentLayoutPolicy;
                            SegmentedCircleConfig segmentedCircleConfig = new SegmentedCircleConfig(fixed, null, fixed2, distributionWheelViewModel2.accessibilityText, 0L, 0L, segmentedCircle$ContentLayoutPolicy, segmentedCircle$ContentLayoutPolicy, Expect_jvmKt.rememberComposableLambda(-647650007, new ProfileKt$$ExternalSyntheticLambda1(4, (Object) distributionWheelViewModel2, (Object) function14), gapComposer), EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
                            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(12.0f, gapComposer);
                            float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer);
                            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, modifier6, z3);
                            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, aspectRatio);
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
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            boolean changedInstance = gapComposer.changedInstance(segmentedCircleConfig);
                            Object rememberedValue6 = gapComposer.rememberedValue();
                            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                                rememberedValue6 = new SegmentedCircleKt$SegmentedCircle$3$1$1(segmentedCircleConfig, 2);
                                gapComposer.updateRememberedValue(rememberedValue6);
                            }
                            CanvasKt.Canvas(0, gapComposer, SemanticsModifierKt.semantics(fillMaxSize, false, (Function1) rememberedValue6).then(modifier5), new SegmentedCircleKt$SegmentedCircle$$inlined$SegmentedCircle$1(segmentedCircleConfig, m3501rememberSegmentedCircleInteractableStatekHDZbjc, m3477toPx8Feqmps, m3477toPx8Feqmps2, arrayList, 1));
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(VisibleKt.layoutWithConfig(segmentedCircleConfig), 1.0f);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                            segmentedCircleConfig.innerContent.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(i9));
                            gapComposer.end(true);
                            gapComposer.end(true);
                            function12 = function14;
                            modifier3 = modifier4;
                            function29 = function215;
                            function27 = function214;
                            function28 = function211;
                        }
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function27 = function25;
                    function28 = function26;
                    function29 = function24;
                    function12 = function1;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(distributionWheelViewModel, paycheckDistributionWheel$PlacementConfig, modifier3, function12, function29, function27, function28, i, i2);
                    return;
                }
                return;
            }
            function24 = function2;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i8 = i7;
            if (gapComposer.shouldExecute(i8 & 1, (i8 & 599187) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        int i122 = i2 & 8;
        if (i122 == 0) {
        }
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        function24 = function2;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i8 = i7;
        if (gapComposer.shouldExecute(i8 & 1, (i8 & 599187) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PaychecksActivityList(PaychecksActivityListViewModel paychecksActivityListViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        paychecksActivityListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1290755191);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paychecksActivityListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1033136201, new PaychecksActivityListViewKt$$ExternalSyntheticLambda0(paychecksActivityListViewModel, function1, b, b), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(paychecksActivityListViewModel, function1, realImageLoader, i, 14);
        }
    }

    public static final void PaychecksActivityListContent(PaychecksActivityListViewModel paychecksActivityListViewModel, Function1 function1, Composer composer, int i) {
        paychecksActivityListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1293244288);
        int i2 = (gapComposer.changedInstance(paychecksActivityListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            String stringResource = Room.stringResource(gapComposer, R.string.activity_list_screen_title);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            AvatarsKt.ActivityScrollableEmbeddedView(paychecksActivityListViewModel.activityEmbeddedModel, SizeKt.fillMaxSize(companion, 1.0f), (LazyListState) null, (PaddingValues) null, (Function3) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1701763520, new MusicViewKt$$ExternalSyntheticLambda7(26, function1), gapComposer), gapComposer, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaychecksActivityListViewKt$$ExternalSyntheticLambda0(paychecksActivityListViewModel, function1, i);
        }
    }

    public static final void PaychecksReceiptContent(PaychecksReceiptViewModel paychecksReceiptViewModel, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        int i2;
        paychecksReceiptViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-367448476);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paychecksReceiptViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1341259356, new PaychecksReceiptViewKt$$ExternalSyntheticLambda1(modifier, paychecksReceiptViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2((Object) paychecksReceiptViewModel, function1, realImageLoader, (Object) modifier, i, 29);
        }
    }

    public static final void PaychecksReceiptRow(PaychecksReceiptViewModel.Section.Row row, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(578889574);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(row) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            com.squareup.protos.cash.ui.Color color = row.color;
            PaychecksReceiptViewModel.Section.Row.Treatment treatment = row.treatment;
            Icon(color, treatment, SizeKt.m285size3ABfNKs(companion, 12.0f), gapComposer, MLKEMEngine.KyberPolyBytes);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 12.0f));
            Destination(row.destination, treatment, new LayoutWeightElement(1.0f, true), row.accessibilityDestination, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 12.0f));
            Amount(row.amount, treatment, null, gapComposer, 0);
            gapComposer.end(true);
            String str = row.note;
            if (str == null) {
                gapComposer.startReplaceGroup(1126445529);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(1126445530);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
                z = true;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), MooncakeTheme.getTypography(gapComposer).caption, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda2(row, i, 2);
        }
    }

    public static final void PaychecksReceiptSection(PaychecksReceiptViewModel.Section section, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1329773180);
        int i2 = (gapComposer.changedInstance(section) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 40.0f, 8.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            gapComposer.startReplaceGroup(-1043447755);
            Iterator it = section.rows.iterator();
            while (it.hasNext()) {
                PaychecksReceiptRow((PaychecksReceiptViewModel.Section.Row) it.next(), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda2(section, i, i3);
        }
    }

    public static final void PaychecksReceiptView(PaychecksReceiptViewModel paychecksReceiptViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        paychecksReceiptViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1046459445);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paychecksReceiptViewModel) ? 4 : 2) | i;
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
            PaychecksReceiptContent(paychecksReceiptViewModel, function1, realImageLoader, ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14), gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(paychecksReceiptViewModel, function1, realImageLoader, i, 15);
        }
    }

    public static final void PendingDirectDepositSheet(PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent, Function0 function0, Modifier modifier, RealSheetState realSheetState, Composer composer, int i) {
        Modifier modifier2;
        RealSheetState realSheetState2;
        Modifier modifier3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(538159772);
        int i2 = i | (gapComposer.changedInstance(pendingDirectDepositSheetContent) ? 4 : 2) | 1408;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                realSheetState2 = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                realSheetState2 = realSheetState;
            }
            gapComposer.endDefaults();
            SheetKt.Sheet(function0, null, realSheetState2, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-707174619, new PoolToastKt$$ExternalSyntheticLambda0(20, modifier3, pendingDirectDepositSheetContent, function0), gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            realSheetState2 = realSheetState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(pendingDirectDepositSheetContent, function0, modifier2, realSheetState2, i, 5);
        }
    }

    public static final void ReadyContent(AmountPickerViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        Function1 function12;
        int i2;
        Object fullTransferInViewKt$ReadyContent$2$1;
        BigDecimal bigDecimal;
        Applier applier;
        AmountDisplayState amountDisplayState;
        NeverEqualPolicy neverEqualPolicy;
        Shaker shaker;
        Modifier modifier;
        Modifier.Companion companion;
        AmountPickerViewModel.Ready ready2 = ready;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-504871955);
        Applier applier2 = gapComposer.applier;
        int i3 = (gapComposer.changedInstance(ready2) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            AmountPickerViewModel.Ready.Amount amount = ready2.maxAmount;
            AmountPickerViewModel.Ready.Amount.PercentAmount percentAmount = amount instanceof AmountPickerViewModel.Ready.Amount.PercentAmount ? (AmountPickerViewModel.Ready.Amount.PercentAmount) amount : null;
            BigDecimal bigDecimal2 = percentAmount != null ? percentAmount.percent : null;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            AmountConfig.PercentConfig percentConfig = new AmountConfig.PercentConfig(127);
            boolean changedInstance = gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda39(22, realCashVibrator, rememberShaker, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(percentConfig, null, (Function1) rememberedValue2, gapComposer, 2);
            String str = ready2.presetAmount;
            Boolean bool = (Boolean) mutableState.getValue();
            bool.getClass();
            boolean changedInstance2 = gapComposer.changedInstance(ready2) | gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                bigDecimal = bigDecimal2;
                applier = applier2;
                amountDisplayState = rememberAmountDisplayState;
                neverEqualPolicy = neverEqualPolicy2;
                shaker = rememberShaker;
                modifier = null;
                fullTransferInViewKt$ReadyContent$2$1 = new FullTransferInViewKt$ReadyContent$2$1(ready2, amountDisplayState, mutableState, null, 2);
                gapComposer.updateRememberedValue(fullTransferInViewKt$ReadyContent$2$1);
            } else {
                bigDecimal = bigDecimal2;
                applier = applier2;
                amountDisplayState = rememberAmountDisplayState;
                shaker = rememberShaker;
                fullTransferInViewKt$ReadyContent$2$1 = rememberedValue3;
                neverEqualPolicy = neverEqualPolicy2;
                modifier = null;
            }
            Updater.LaunchedEffect(str, bool, (Function2) fullTransferInViewKt$ReadyContent$2$1, gapComposer);
            boolean changed = gapComposer.changed(amountDisplayState) | gapComposer.changed(bigDecimal);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MaxPercentCappedKeypadListener(new AmountDisplayKeypadListener(amountDisplayState), amountDisplayState, bigDecimal, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker, 4));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MaxPercentCappedKeypadListener maxPercentCappedKeypadListener = (MaxPercentCappedKeypadListener) rememberedValue4;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            AmountDisplayState amountDisplayState2 = amountDisplayState;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
            Shaker shaker2 = shaker;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, ready2.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer2 = gapComposer;
            String str2 = ready2.subtitle;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(1417898521);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1417898522);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion2, 1.0f), shaker2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = new HelpSheetViewKt$$ExternalSyntheticLambda4(14);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            GapComposer gapComposer3 = gapComposer2;
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState2, SemanticsModifierKt.semantics(shakeWith, false, (Function1) rememberedValue5), Strings.getColors(gapComposer2).semantic.text.prominent, Room.getSp(96), 0, 0, gapComposer3, 3072, 48);
            gapComposer3.end(true);
            boolean changedInstance3 = gapComposer3.changedInstance(maxPercentCappedKeypadListener);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changedInstance3 || rememberedValue6 == neverEqualPolicy3) {
                rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda5(maxPercentCappedKeypadListener, 24);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            Function0 function0 = (Function0) rememberedValue6;
            boolean changedInstance4 = gapComposer3.changedInstance(maxPercentCappedKeypadListener);
            Object rememberedValue7 = gapComposer3.rememberedValue();
            if (changedInstance4 || rememberedValue7 == neverEqualPolicy3) {
                rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(maxPercentCappedKeypadListener, 7);
                gapComposer3.updateRememberedValue(rememberedValue7);
            }
            RelationUtil.m1189KeypadViewww6aTOc(null, new KeypadViewModel(null, false, function0, (Function1) rememberedValue7, 3), null, Strings.getColors(gapComposer3).semantic.text.standard, gapComposer3, 0, 5);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer3), companion2, 32.0f, gapComposer3);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = ready2.buttonEnabled;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            boolean changed2 = gapComposer3.changed(amountDisplayState2) | gapComposer3.changedInstance(ready2) | gapComposer3.changedInstance(realCashVibrator) | gapComposer3.changedInstance(shaker2) | ((i3 & 112) == 32);
            Object rememberedValue8 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue8 == neverEqualPolicy3) {
                companion = companion2;
                function12 = function1;
                ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(amountDisplayState2, ready2, realCashVibrator, shaker2, function12, 17);
                ready2 = ready2;
                gapComposer3.updateRememberedValue(ta__externalsyntheticlambda1);
                rememberedValue8 = ta__externalsyntheticlambda1;
            } else {
                companion = companion2;
                function12 = function1;
            }
            i2 = 1;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1906635250, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready2, 2), gapComposer3), gapComposer3, 1573296, 40);
            gapComposer = gapComposer3;
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            gapComposer.end(true);
        } else {
            function12 = function1;
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAmountPickerKt$$ExternalSyntheticLambda11(ready2, function12, i, i2);
        }
    }

    public static final void Section(PaychecksHomeViewModel.Content.Section section, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-901905553);
        int i2 = (gapComposer.changedInstance(section) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
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
            boolean z = section instanceof PaychecksHomeViewModel.Content.Section.ActiveDistribution;
            if (z) {
                gapComposer.startReplaceGroup(-1329677340);
                ActiveDistributionSection((PaychecksHomeViewModel.Content.Section.ActiveDistribution) section, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (section instanceof PaychecksHomeViewModel.Content.Section.ArcadeActivity) {
                gapComposer.startReplaceGroup(-1329675087);
                ActivitySection((PaychecksHomeViewModel.Content.Section.ArcadeActivity) section, gapComposer, i2 & 14);
                gapComposer.end(false);
            } else if (section instanceof PaychecksHomeViewModel.Content.Section.DirectDeposit) {
                gapComposer.startReplaceGroup(-1329673441);
                DirectDepositSection((PaychecksHomeViewModel.Content.Section.DirectDeposit) section, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                if (!(section instanceof PaychecksHomeViewModel.Content.Section.DistributionsNullState)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1329678622, false);
                }
                gapComposer.startReplaceGroup(-1329671064);
                DistributionsNullStateSection((PaychecksHomeViewModel.Content.Section.DistributionsNullState) section, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
            if (section instanceof PaychecksHomeViewModel.Content.Section.ArcadeActivity) {
                gapComposer.startReplaceGroup(-1329667810);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if ((section instanceof PaychecksHomeViewModel.Content.Section.DirectDeposit) || (section instanceof PaychecksHomeViewModel.Content.Section.DistributionsNullState) || z) {
                gapComposer.startReplaceGroup(-1329663788);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1329662443);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(section, function1, i, 9);
        }
    }

    public static final void TermsOfServiceDisclosures(List list, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(603690814);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            gapComposer.startReplaceGroup(-613616689);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DisclosureMarkdownText((String) it.next(), function1, gapComposer, i2 & 112);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 6);
        }
    }

    public static final void Toolbar(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2088320394);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            NavigationType navigationType = NavigationType.CLOSE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(542520272, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 22), gapComposer);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(2029290731, new MusicViewKt$$ExternalSyntheticLambda7(25, function1), gapComposer), gapComposer, 1573302, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 11);
        }
    }

    /* renamed from: access$getAngleAndQuadrantOfClosestPointOnCircumference-3MmeM6k, reason: not valid java name */
    public static final AngleAndQuadrant m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k(int i, long j) {
        AngleAndQuadrant angleAndQuadrant;
        float f = i / 2.0f;
        int i2 = (int) (j >> 32);
        float abs = Math.abs(Float.intBitsToFloat(i2) - f);
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        double degrees = Math.toDegrees((float) Math.atan2(abs, Math.abs(Float.intBitsToFloat(i3) - f)));
        if (Float.intBitsToFloat(i3) < f && Float.intBitsToFloat(i2) > f) {
            angleAndQuadrant = new AngleAndQuadrant((float) degrees, Quadrant.TOP_RIGHT);
        } else if (Float.intBitsToFloat(i3) > f && Float.intBitsToFloat(i2) > f) {
            angleAndQuadrant = new AngleAndQuadrant((float) (180.0d - degrees), Quadrant.BOTTOM_RIGHT);
        } else if (Float.intBitsToFloat(i3) <= f || Float.intBitsToFloat(i2) >= f) {
            angleAndQuadrant = new AngleAndQuadrant((float) (360.0d - degrees), Quadrant.TOP_LEFT);
        } else {
            angleAndQuadrant = new AngleAndQuadrant((float) (180.0d + degrees), Quadrant.BOTTOM_LEFT);
        }
        return new AngleAndQuadrant(angleAndQuadrant.angle / 360.0f, angleAndQuadrant.quadrant);
    }

    public static SingleComposeDecoratedAllocation decorateSingleAndAnimateAsState(DistributionWheelViewModel.SingleAllocation singleAllocation, boolean z, boolean z2, boolean z3, Composer composer) {
        singleAllocation.getClass();
        DistributionWheelViewModel.Allocation.Treatment treatment = singleAllocation.treatment;
        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(singleAllocation.percentage, z ? new FloatTweenSpec(500, (Easing) null, 6) : new SnapSpec(0), "Allocation percentage animation", null, composer, 3072, 20);
        Color forTheme = ThemablesKt.forTheme(singleAllocation.color, composer);
        forTheme.getClass();
        long j = forTheme.value;
        if (Intrinsics.areEqual(treatment, DistributionWheelViewModel.Allocation.Treatment.Default.INSTANCE)) {
            if (z3) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(213894190);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.data.portion.empty;
                gapComposer.end(false);
            } else {
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(213953710);
                gapComposer2.end(false);
            }
        } else if (!(treatment instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected)) {
            if (!Intrinsics.areEqual(treatment, DistributionWheelViewModel.Allocation.Treatment.InteractableNotSelected.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (z3) {
                float m677getAlphaimpl = Color.m677getAlphaimpl(j);
                float[] fArr = {0.0f, RecyclerView.DECELERATION_RATE, 0.0f};
                ColorUtils.colorToHSL(ColorKt.m694toArgb8_81llA(j), fArr);
                j = Color.m675copywmQWz5c$default(m677getAlphaimpl, ColorKt.Color(ColorUtils.HSLToColor(fArr)), 14);
            }
            if (z2) {
                j = Color.m675copywmQWz5c$default(0.3f, j, 14);
            }
        }
        return new SingleComposeDecoratedAllocation(((Number) animateFloatAsState.getValue()).floatValue(), j, treatment);
    }

    public static final MutableState rememberUpdatableViewModel(Object obj, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean z = (((i & 14) ^ 6) > 4 && gapComposer.changedInstance(obj)) || (i & 6) == 4;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TabContentPresenter$models$4$1$1$1(obj, mutableState, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, obj, (Function2) rememberedValue2);
        return mutableState;
    }

    public static final long toArcade(DestinationAllocationRowViewModel.TextColor textColor, Composer composer) {
        int ordinal = textColor.ordinal();
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1735180272);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.prominent;
            gapComposer.end(false);
            return j;
        }
        if (ordinal == 1) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1735184529);
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j2 = colors2.semantic.text.standard;
            gapComposer2.end(false);
            return j2;
        }
        if (ordinal != 2) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1735186654, false);
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1735182419);
        Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
        if (colors3 == null) {
            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
        } else {
            gapComposer3.startReplaceGroup(-1762997739);
            gapComposer3.end(false);
        }
        long j3 = colors3.semantic.text.subtle;
        gapComposer3.end(false);
        return j3;
    }

    public static final void Toolbar(EditDistributionViewModel.Content content, Function1 function1, Composer composer, int i) {
        NavigationType navigationType;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(197089775);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = content.navigationButton.ordinal();
            if (ordinal == 0) {
                navigationType = NavigationType.CLOSE;
            } else if (ordinal == 1) {
                navigationType = NavigationType.BACK;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1930984727, new EditDistributionViewKt$$ExternalSyntheticLambda6(content, i3), gapComposer);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 390, 104);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EditDistributionViewKt$$ExternalSyntheticLambda5(content, function1, i);
        }
    }

    public static final void Icon(DestinationAllocationRowViewModel$Icon$Color destinationAllocationRowViewModel$Icon$Color, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1879026676);
        int i2 = (gapComposer.changedInstance(destinationAllocationRowViewModel$Icon$Color) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (destinationAllocationRowViewModel$Icon$Color != null) {
            gapComposer.startReplaceGroup(1775061655);
            Color forTheme = ThemablesKt.forTheme(destinationAllocationRowViewModel$Icon$Color.color, gapComposer);
            forTheme.getClass();
            long j = forTheme.value;
            boolean changed = gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(6, gapComposer, modifier, (Function1) rememberedValue);
            gapComposer.end(false);
        } else if (destinationAllocationRowViewModel$Icon$Color == null) {
            gapComposer.startReplaceGroup(1858377508);
            SpacerKt.Spacer(gapComposer, modifier);
            gapComposer.end(false);
        } else {
            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1858373327, false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(destinationAllocationRowViewModel$Icon$Color, modifier, i, 11);
        }
    }
}
