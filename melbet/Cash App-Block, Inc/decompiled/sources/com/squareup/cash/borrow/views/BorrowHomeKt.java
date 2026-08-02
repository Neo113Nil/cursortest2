package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.ReferralCodeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.ui.util.FillableBackgroundKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.viewmodels.LoanSelectorItem;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.CircleSegment;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.IllustrationsKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BorrowHomeKt {

    /* renamed from: lambda$-1169377213, reason: not valid java name */
    public static final ComposableLambdaImpl f319lambda$1169377213;

    /* renamed from: lambda$-1358520632, reason: not valid java name */
    public static final ComposableLambdaImpl f320lambda$1358520632;
    public static final ComposableLambdaImpl lambda$1111589418 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(8), false, 1111589418);

    /* renamed from: lambda$-621717663, reason: not valid java name */
    public static final ComposableLambdaImpl f325lambda$621717663 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(9), false, -621717663);
    public static final ComposableLambdaImpl lambda$1308513186 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(10), false, 1308513186);
    public static final ComposableLambdaImpl lambda$1632125313 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(0), false, 1632125313);
    public static final ComposableLambdaImpl lambda$28741279 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(18), false, 28741279);
    public static final ComposableLambdaImpl lambda$2032801643 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(19), false, 2032801643);
    public static final ComposableLambdaImpl lambda$34124885 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(20), false, 34124885);

    /* renamed from: lambda$-518348043, reason: not valid java name */
    public static final ComposableLambdaImpl f323lambda$518348043 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(21), false, -518348043);

    /* renamed from: lambda$-530316380, reason: not valid java name */
    public static final ComposableLambdaImpl f324lambda$530316380 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(22), false, -530316380);
    public static final ComposableLambdaImpl lambda$966918517 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(23), false, 966918517);

    /* renamed from: lambda$-1408505072, reason: not valid java name */
    public static final ComposableLambdaImpl f321lambda$1408505072 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(24), false, -1408505072);

    /* renamed from: lambda$-1821133503, reason: not valid java name */
    public static final ComposableLambdaImpl f322lambda$1821133503 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(5), false, -1821133503);

    static {
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(11), false, 939562043);
        f320lambda$1358520632 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(12), false, -1358520632);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(13), false, 39922954);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(14), false, -1260556855);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(15), false, 2103505584);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(16), false, 1181681719);
        f319lambda$1169377213 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(17), false, -1169377213);
    }

    public static final void BorrowAmountPicker(BorrowAmountPickerViewModel borrowAmountPickerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        BorrowAmountPickerViewModel borrowAmountPickerViewModel2;
        String str;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(270121401);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(borrowAmountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-879016555, new BorrowHomeKt$$ExternalSyntheticLambda0(27, new CompositionLocalContext(gapComposer.buildContext().getCompositionLocalScope$runtime()), function1), gapComposer);
            if (borrowAmountPickerViewModel == null) {
                str = null;
            } else if (borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Condensed) {
                str = "condensed";
            } else {
                if (!(borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Full)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str = "full";
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            borrowAmountPickerViewModel2 = borrowAmountPickerViewModel;
            ComposeBottomSheetKt.BottomSheet(str, borrowAmountPickerViewModel2, (Function0) rememberedValue, false, false, 0, null, Navigation.ArcadeBottomSheetStyle(gapComposer), rememberComposableLambda, gapComposer, ((i2 << 3) & 112) | 117440512, 120);
        } else {
            borrowAmountPickerViewModel2 = borrowAmountPickerViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(borrowAmountPickerViewModel2, function1, i, 8);
        }
    }

    public static final void BorrowAmountPickerContent(BorrowAmountPickerViewModel borrowAmountPickerViewModel, Function1 function1, Composer composer, int i) {
        borrowAmountPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1277578510);
        int i2 = (gapComposer.changedInstance(borrowAmountPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Condensed) {
            gapComposer.startReplaceGroup(1658958662);
            AmountPickerViewModel amountPickerViewModel = ShapeContainingUtilKt.toAmountPickerViewModel(borrowAmountPickerViewModel);
            if (amountPickerViewModel.equals(AmountPickerViewModel.InitialLoading.INSTANCE) || (amountPickerViewModel instanceof AmountPickerViewModel.Loading)) {
                gapComposer.startReplaceGroup(607707234);
                Loading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(amountPickerViewModel instanceof AmountPickerViewModel.Ready)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 607704124, false);
                }
                gapComposer.startReplaceGroup(607708456);
                BorrowAmountPickerContentCondensed((AmountPickerViewModel.Ready) amountPickerViewModel, function1, gapComposer, i2 & 112);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            if (!(borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Full)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 607703055, false);
            }
            gapComposer.startReplaceGroup(1659190449);
            AmountPickerViewModel amountPickerViewModel2 = ShapeContainingUtilKt.toAmountPickerViewModel(borrowAmountPickerViewModel);
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TickersAmountCaptionKt.FullscreenAmountPicker(amountPickerViewModel2, moneyConfig, (Function1) rememberedValue, null, null, gapComposer, 64, 24);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAmountPickerKt$$ExternalSyntheticLambda3(borrowAmountPickerViewModel, function1, i);
        }
    }

    public static final void BorrowAmountPickerContentCondensed(AmountPickerViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z;
        AmountSelectorWidgetModel amountSelectorWidgetModel = ready.amountSelections;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1744814543);
        int i3 = (gapComposer2.changedInstance(ready) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                Iterator it = amountSelectorWidgetModel.items.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (((AmountSelectorWidgetModel.Item) it.next()).isSelected()) {
                        break;
                    } else {
                        i4++;
                    }
                }
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(i4, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                if (parcelableSnapshotMutableIntState.getIntValue() != -1) {
                    if (((AmountSelectorWidgetModel.Item) CollectionsKt.getOrNull(parcelableSnapshotMutableIntState.getIntValue(), amountSelectorWidgetModel.items)) != null ? !(r0 instanceof LoanSelectorItem.CustomAmount) : false) {
                        z = true;
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer2);
                    }
                }
                z = false;
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
            Transformations.SheetHeader(ready.title, (Modifier) null, (Function2) null, ready.subtitle, gapComposer2, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            InputChipKt.InputChipGrid(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), 0, Expect_jvmKt.rememberComposableLambda(-1289685840, new ComposeDialogKt$$ExternalSyntheticLambda12(ready, function1, parcelableSnapshotMutableIntState, mutableState, 22), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth2, 16.0f, 16.0f);
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda1(function1, parcelableSnapshotMutableIntState, 1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            i2 = 0;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, booleanValue, null, Expect_jvmKt.rememberComposableLambda(-162612532, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready, 0), gapComposer2), gapComposer2, 1573248, 40);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            i2 = 0;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAmountPickerKt$$ExternalSyntheticLambda11(ready, function1, i, i2);
        }
    }

    public static final void BorrowHome(BorrowHomeViewModel borrowHomeViewModel, Function1 function1, Modifier modifier, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        LazyListState lazyListState2;
        int i3;
        LazyListState rememberLazyListState;
        Modifier modifier3;
        boolean z;
        borrowHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-801295208);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(borrowHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i3 = i4 & (-7169);
                rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
                modifier3 = Modifier.Companion.$$INSTANCE;
                z = true;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i4 & (-7169);
                z = true;
                modifier3 = modifier;
                rememberLazyListState = lazyListState;
            }
            gapComposer.endDefaults();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier3, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-949864542, new BorrowHomeKt$$ExternalSyntheticLambda0(0, borrowHomeViewModel, function1), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(borrowHomeViewModel);
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean z2 = changedInstance | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda1(0, (Object) borrowHomeViewModel, (Object) function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(fillMaxWidth, rememberLazyListState, m297PaddingValuesa9UjIt4$default, rememberComposableLambda, null, (Function1) rememberedValue, gapComposer, 3456, 16);
            modifier2 = modifier3;
            lazyListState2 = rememberLazyListState;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            lazyListState2 = lazyListState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) borrowHomeViewModel, function1, modifier2, (Object) lazyListState2, i, 19);
        }
    }

    public static final void BorrowLimitHub(final BorrowLimitHubViewModel borrowLimitHubViewModel, final Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        borrowLimitHubViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2059216848);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(borrowLimitHubViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ScreenScaffoldKt.ScreenScaffoldColumn(fillMaxWidth, null, SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), Expect_jvmKt.rememberComposableLambda(-304076552, new Function3() { // from class: com.squareup.cash.borrow.views.BorrowLimitHubKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Function1 function12 = function1;
                    BorrowLimitHubViewModel borrowLimitHubViewModel2 = borrowLimitHubViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = borrowLimitHubViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(8, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                Modifier markAsScaffoldTitle = ScreenScaffoldKt.markAsScaffoldTitle(companion2, scrollingScaffoldContentScope, gapComposer3, ((intValue2 << 3) & 112) | 6);
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                DefaultSizes.spacing.getClass();
                                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(markAsScaffoldTitle, 16.0f, 16.0f);
                                boolean changedInstance = gapComposer3.changedInstance(borrowLimitHubViewModel2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new RewardSlotQueries$$ExternalSyntheticLambda0(borrowLimitHubViewModel2, 17);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer3, SemanticsModifierKt.semantics(m299paddingVpY3zN4, false, (Function1) rememberedValue2), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).pageTitle, (TextLineBalancing) null, borrowLimitHubViewModel2.title, (Map) null, (Function1) null, false);
                                int i7 = 0;
                                for (Object obj4 : borrowLimitHubViewModel2.sections) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    BorrowLimitHubViewModel.Section section = (BorrowLimitHubViewModel.Section) obj4;
                                    if (i7 == 0) {
                                        gapComposer3.startReplaceGroup(-55690967);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-55640375);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    }
                                    if (section instanceof BorrowLimitHubViewModel.Section.ProgressBarSectionModel) {
                                        gapComposer3.startReplaceGroup(-55518979);
                                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        LimitHubProgressSectionKt.LimitHubProgressSection((BorrowLimitHubViewModel.Section.ProgressBarSectionModel) section, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else if (section instanceof BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) {
                                        gapComposer3.startReplaceGroup(-140331412);
                                        BorrowHomeKt.LimitHubIncreaseLimitSection((BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) section, function12, null, gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else if (section instanceof BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) {
                                        gapComposer3.startReplaceGroup(-140328111);
                                        BorrowHomeKt.LimitHubLimitInfoListSection((BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) section, null, gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else {
                                        if (!(section instanceof BorrowLimitHubViewModel.Section.DisclaimerSection)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -140339851, false);
                                        }
                                        gapComposer3.startReplaceGroup(-55127232);
                                        SpacerKt.Spacer(gapComposer3, scrollingScaffoldContentScope.weight(1.0f, companion2, true));
                                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        BorrowHomeKt.LimitHubDisclaimerSection((BorrowLimitHubViewModel.Section.DisclaimerSection) section, function12, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                                        gapComposer3.end(false);
                                    }
                                    i7 = i8;
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, Expect_jvmKt.rememberComposableLambda(894603470, new Function3() { // from class: com.squareup.cash.borrow.views.BorrowLimitHubKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Function1 function12 = function1;
                    BorrowLimitHubViewModel borrowLimitHubViewModel2 = borrowLimitHubViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = borrowLimitHubViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(8, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                Modifier markAsScaffoldTitle = ScreenScaffoldKt.markAsScaffoldTitle(companion2, scrollingScaffoldContentScope, gapComposer3, ((intValue2 << 3) & 112) | 6);
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                DefaultSizes.spacing.getClass();
                                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(markAsScaffoldTitle, 16.0f, 16.0f);
                                boolean changedInstance = gapComposer3.changedInstance(borrowLimitHubViewModel2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new RewardSlotQueries$$ExternalSyntheticLambda0(borrowLimitHubViewModel2, 17);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer3, SemanticsModifierKt.semantics(m299paddingVpY3zN4, false, (Function1) rememberedValue2), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).pageTitle, (TextLineBalancing) null, borrowLimitHubViewModel2.title, (Map) null, (Function1) null, false);
                                int i7 = 0;
                                for (Object obj4 : borrowLimitHubViewModel2.sections) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    BorrowLimitHubViewModel.Section section = (BorrowLimitHubViewModel.Section) obj4;
                                    if (i7 == 0) {
                                        gapComposer3.startReplaceGroup(-55690967);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-55640375);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                        gapComposer3.end(false);
                                    }
                                    if (section instanceof BorrowLimitHubViewModel.Section.ProgressBarSectionModel) {
                                        gapComposer3.startReplaceGroup(-55518979);
                                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        LimitHubProgressSectionKt.LimitHubProgressSection((BorrowLimitHubViewModel.Section.ProgressBarSectionModel) section, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else if (section instanceof BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) {
                                        gapComposer3.startReplaceGroup(-140331412);
                                        BorrowHomeKt.LimitHubIncreaseLimitSection((BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) section, function12, null, gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else if (section instanceof BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) {
                                        gapComposer3.startReplaceGroup(-140328111);
                                        BorrowHomeKt.LimitHubLimitInfoListSection((BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) section, null, gapComposer3, 0);
                                        gapComposer3.end(false);
                                    } else {
                                        if (!(section instanceof BorrowLimitHubViewModel.Section.DisclaimerSection)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -140339851, false);
                                        }
                                        gapComposer3.startReplaceGroup(-55127232);
                                        SpacerKt.Spacer(gapComposer3, scrollingScaffoldContentScope.weight(1.0f, companion2, true));
                                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        BorrowHomeKt.LimitHubDisclaimerSection((BorrowLimitHubViewModel.Section.DisclaimerSection) section, function12, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                                        gapComposer3.end(false);
                                    }
                                    i7 = i8;
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), gapComposer, 199680, 18);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(borrowLimitHubViewModel, function1, modifier2, i, 7);
        }
    }

    public static final void BorrowMultiStepLoading(final BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        borrowMultiStepLoadingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1827418445);
        int i2 = (i & 6) == 0 ? i | (gapComposer2.changedInstance(borrowMultiStepLoadingViewModel) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            NavigationType navigationType = borrowMultiStepLoadingViewModel.canUserClose ? NavigationType.CLOSE : NavigationType.NONE;
            boolean z2 = i6 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(10, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            DBUtil.TitleBarSub((String) null, navigationType, m302paddingqDBjuR0$default, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 390, 104);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            final int i7 = 2;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1228420884, new Function2() { // from class: com.squareup.cash.borrow.views.BorrowMultiStepLoadingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AbstractPersistentList persistentListOf;
                    int i8 = i4;
                    BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel2 = borrowMultiStepLoadingViewModel;
                    int i9 = 2;
                    int i10 = 1;
                    switch (i8) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                StackedAvatarViewModel stackedAvatarViewModel = borrowMultiStepLoadingViewModel2.stackedAvatar;
                                int i11 = 4;
                                if (stackedAvatarViewModel == null) {
                                    gapComposer4.startReplaceGroup(-753428921);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j2 = colors2.semantic.background.brand;
                                    Colors colors3 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", j2, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Borrow32, colors3.component.avatar.text, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3126, 0, 2000);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(-752981839);
                                    AvatarSize avatarSize = AvatarSize.Size64;
                                    if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Single) {
                                        gapComposer4.startReplaceGroup(1915378735);
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i10), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                                        gapComposer4.startReplaceGroup(1915385010);
                                        StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(duo.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i9), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(duo.frontAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(3), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else {
                                        if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1915376548, false);
                                        }
                                        gapComposer4.startReplaceGroup(1915394481);
                                        StackedAvatarViewModel.Trio trio = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(trio.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i11), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.middleAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(28), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.frontAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(29), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    }
                                    zzabw.HorizontalStackedAvatars(avatarSize, persistentListOf, null, gapComposer4, 6, 4);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Expect_jvmKt.rememberComposableLambda(-1879569070, new Function2() { // from class: com.squareup.cash.borrow.views.BorrowMultiStepLoadingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AbstractPersistentList persistentListOf;
                    int i8 = i5;
                    BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel2 = borrowMultiStepLoadingViewModel;
                    int i9 = 2;
                    int i10 = 1;
                    switch (i8) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                StackedAvatarViewModel stackedAvatarViewModel = borrowMultiStepLoadingViewModel2.stackedAvatar;
                                int i11 = 4;
                                if (stackedAvatarViewModel == null) {
                                    gapComposer4.startReplaceGroup(-753428921);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j2 = colors2.semantic.background.brand;
                                    Colors colors3 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", j2, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Borrow32, colors3.component.avatar.text, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3126, 0, 2000);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(-752981839);
                                    AvatarSize avatarSize = AvatarSize.Size64;
                                    if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Single) {
                                        gapComposer4.startReplaceGroup(1915378735);
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i10), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                                        gapComposer4.startReplaceGroup(1915385010);
                                        StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(duo.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i9), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(duo.frontAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(3), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else {
                                        if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1915376548, false);
                                        }
                                        gapComposer4.startReplaceGroup(1915394481);
                                        StackedAvatarViewModel.Trio trio = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(trio.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i11), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.middleAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(28), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.frontAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(29), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    }
                                    zzabw.HorizontalStackedAvatars(avatarSize, persistentListOf, null, gapComposer4, 6, 4);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1286080399, new Function2() { // from class: com.squareup.cash.borrow.views.BorrowMultiStepLoadingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AbstractPersistentList persistentListOf;
                    int i8 = i7;
                    BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel2 = borrowMultiStepLoadingViewModel;
                    int i9 = 2;
                    int i10 = 1;
                    switch (i8) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                StackedAvatarViewModel stackedAvatarViewModel = borrowMultiStepLoadingViewModel2.stackedAvatar;
                                int i11 = 4;
                                if (stackedAvatarViewModel == null) {
                                    gapComposer4.startReplaceGroup(-753428921);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j2 = colors2.semantic.background.brand;
                                    Colors colors3 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size64, "", j2, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Borrow32, colors3.component.avatar.text, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3126, 0, 2000);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(-752981839);
                                    AvatarSize avatarSize = AvatarSize.Size64;
                                    if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Single) {
                                        gapComposer4.startReplaceGroup(1915378735);
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i10), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                                        gapComposer4.startReplaceGroup(1915385010);
                                        StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(duo.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i9), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(duo.frontAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(3), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    } else {
                                        if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1915376548, false);
                                        }
                                        gapComposer4.startReplaceGroup(1915394481);
                                        StackedAvatarViewModel.Trio trio = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                                        persistentListOf = Tags.persistentListOf(AvatarsKt.toAvatarEntry(trio.backAvatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(i11), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.middleAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(28), gapComposer4, 8, 1), AvatarsKt.toAvatarEntry(trio.frontAvatar, null, new ReferralCodeViewKt$$ExternalSyntheticLambda12(29), gapComposer4, 8, 1));
                                        gapComposer4.end(false);
                                    }
                                    zzabw.HorizontalStackedAvatars(avatarSize, persistentListOf, null, gapComposer4, 6, 4);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, borrowMultiStepLoadingViewModel2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), gapComposer, 3462, 0);
            gapComposer.startReplaceGroup(-1408073399);
            int i8 = 0;
            for (Object obj : borrowMultiStepLoadingViewModel.steps) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                String str = (String) obj;
                int i10 = borrowMultiStepLoadingViewModel.currentStepIndex;
                Step(str, i8 < i10 ? StepStatus.COMPLETE : i8 == i10 ? StepStatus.IN_PROGRESS : StepStatus.PENDING, null, gapComposer, 0);
                i8 = i9;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(borrowMultiStepLoadingViewModel, function1, modifier2, i, 8);
        }
    }

    public static final void BulletinGraphic(BorrowAppletBulletinsTile.Data.Bulletin bulletin, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1795148730);
        int i2 = (gapComposer.changedInstance(bulletin) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SegmentedCircle segmentedCircle = bulletin.segmented_circle;
            if (segmentedCircle != null) {
                gapComposer.startReplaceGroup(-1656818518);
                gapComposer.startReplaceGroup(-1438917418);
                List<SegmentedCircle.Segment> list = segmentedCircle.segments;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (SegmentedCircle.Segment segment : list) {
                    Float f = segment.percent;
                    f.getClass();
                    float floatValue = f.floatValue();
                    Color color = segment.color;
                    color.getClass();
                    androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(new ColorModel.Accented(color), gapComposer);
                    forTheme.getClass();
                    arrayList.add(new CircleSegment(forTheme.value, floatValue));
                }
                gapComposer.end(false);
                SegmentedCircleConfig.SizingConfig.Fixed fixed = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer));
                SegmentedCircleConfig.SizingConfig.Fixed fixed2 = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(2.5f, gapComposer));
                LocalizedString localizedString = segmentedCircle.accessibility_description;
                VisibleKt.SegmentedCircle(arrayList, new SegmentedCircleConfig(fixed, null, fixed2, localizedString != null ? localizedString.translated_value : null, 0L, 0L, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), null, gapComposer, MLKEMEngine.KyberPolyBytes, 8);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1656370909);
                BorrowAppletBulletinsTile.Data.Bulletin.Icon icon = bulletin.icon;
                icon.getClass();
                BorrowAppletBulletinsTile.Data.Bulletin.IconShape iconShape = bulletin.icon_shape;
                if (iconShape == null) {
                    iconShape = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.CIRCLE;
                }
                Float f2 = bulletin.fill_percent;
                float floatValue2 = f2 != null ? f2.floatValue() : 1.0f;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m3426BulletinIconT042LqI(icon, iconShape, colors.semantic.background.brand, floatValue2, null, gapComposer, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda10(bulletin, i);
        }
    }

    /* renamed from: BulletinIcon-T042LqI, reason: not valid java name */
    public static final void m3426BulletinIconT042LqI(final BorrowAppletBulletinsTile.Data.Bulletin.Icon icon, final BorrowAppletBulletinsTile.Data.Bulletin.IconShape iconShape, long j, float f, Modifier modifier, Composer composer, final int i) {
        float f2;
        long j2;
        final Modifier modifier2;
        RoundedCornerShape m340RoundedCornerShape0680j_4;
        Modifier then;
        Modifier wrapContentHeight;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1721812873);
        int i2 = i | (gapComposer.changed(icon.ordinal()) ? 4 : 2) | (gapComposer.changed(iconShape.ordinal()) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(f) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j3 = colors.component.avatar.text;
            BorrowAppletBulletinsTile.Data.Bulletin.IconShape iconShape2 = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.CIRCLE;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (iconShape != iconShape2 || f < 1.0f) {
                j2 = j;
                gapComposer.startReplaceGroup(-266519244);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 4.0f, 1);
                int ordinal = iconShape.ordinal();
                if (ordinal == 0) {
                    m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.CircleShape;
                }
                m300paddingVpY3zN4$default.getClass();
                m340RoundedCornerShape0680j_4.getClass();
                f2 = f;
                if (f2 >= 1.0f) {
                    then = ImageKt.m177backgroundbw27NRU(companion2, j2, m340RoundedCornerShape0680j_4);
                } else {
                    then = ImageKt.m177backgroundbw27NRU(companion2, androidx.compose.ui.graphics.Color.m675copywmQWz5c$default(0.5f, j2, 14), m340RoundedCornerShape0680j_4).then(f2 <= RecyclerView.DECELERATION_RATE ? companion2 : PlatformKt.composed(companion2, new FillableBackgroundKt$$ExternalSyntheticLambda0(f2, m340RoundedCornerShape0680j_4, j2)));
                }
                wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.m285size3ABfNKs(m300paddingVpY3zN4$default.then(then), 48.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                companion = companion2;
                Trace.m1191Iconww6aTOc(toArcadeIcon(icon), (String) null, wrapContentHeight, j3, gapComposer, 48, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-266823137);
                TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", j, (String) null, SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 4.0f, 1), (AvatarImage) new AvatarImage.LocalIcon(toArcadeIcon(icon), j3, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, (i2 & 896) | 27702, 0, 1984);
                j2 = j;
                gapComposer.end(false);
                f2 = f;
                companion = companion2;
            }
            modifier2 = companion;
        } else {
            f2 = f;
            j2 = j;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final float f3 = f2;
            final long j4 = j2;
            endRestartGroup.block = new Function2(iconShape, j4, f3, modifier2, i) { // from class: com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda15
                public final /* synthetic */ BorrowAppletBulletinsTile.Data.Bulletin.IconShape f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ Modifier f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    BorrowHomeKt.m3426BulletinIconT042LqI(BorrowAppletBulletinsTile.Data.Bulletin.Icon.this, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void BulletinTile(BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-544779505);
        int i2 = (gapComposer.changedInstance(bulletinTileModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1787717276, new BulletinTileKt$$ExternalSyntheticLambda0(bulletinTileModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(bulletinTileModel, function1, modifier2, i, 9);
        }
    }

    public static final void Bulletins(BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1625924431);
        int i2 = (gapComposer.changedInstance(bulletinTileModel) ? 32 : 16) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            for (BorrowAppletBulletinsTile.Data.Bulletin bulletin : bulletinTileModel.tileData.bulletins) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                ArcadeThemeKt.ArcadeTheme(com.squareup.cash.borrow.ui.util.ArcadeThemeKt.withTint(colors, bulletin.override_tint_color, gapComposer), null, null, Expect_jvmKt.rememberComposableLambda(-1274229950, new BulletinTileKt$$ExternalSyntheticLambda2(1, bulletin, function1), gapComposer), gapComposer, 3072, 6);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda0(bulletinTileModel, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    public static final void Bullets(FirstTimeBorrowViewModel.Content.Bullets bullets, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-224540229);
        int i2 = (i & 6) == 0 ? i | (gapComposer.changedInstance(bullets) ? 4 : 2) : i;
        char c = 16;
        char c2 = ' ';
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        final boolean z = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            char c3 = 0;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, 32.0f, 1);
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
            gapComposer.startReplaceGroup(750642772);
            for (final FirstTimeBorrowViewModel.Content.BulletItem bulletItem : bullets.items) {
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-428928769, new Function2() { // from class: com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda14
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
                    
                        if (r0 == null) goto L25;
                     */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2) {
                        Icons icons;
                        int i5 = z;
                        FirstTimeBorrowViewModel.Content.BulletItem bulletItem2 = bulletItem;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = bulletItem2.iconArcadeId;
                                    if (str != null) {
                                        Icons.Companion.getClass();
                                        icons = zzd.get(str);
                                        break;
                                    }
                                    icons = Icons.Check24;
                                    Icons icons2 = icons;
                                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors2.semantic.icon.standard, gapComposer2, 48, 4);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bulletItem2.text, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-259677184, new Function2() { // from class: com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda14
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
                    
                        if (r0 == null) goto L25;
                     */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2) {
                        Icons icons;
                        int i5 = i4;
                        FirstTimeBorrowViewModel.Content.BulletItem bulletItem2 = bulletItem;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = bulletItem2.iconArcadeId;
                                    if (str != null) {
                                        Icons.Companion.getClass();
                                        icons = zzd.get(str);
                                        break;
                                    }
                                    icons = Icons.Check24;
                                    Icons icons2 = icons;
                                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors2.semantic.icon.standard, gapComposer2, 48, 4);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bulletItem2.text, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
                z = z;
                companion2 = companion2;
                c = 16;
                c2 = ' ';
                c3 = 0;
                i4 = 1;
                i3 = i3;
            }
            int i5 = i3;
            Modifier.Companion companion3 = companion2;
            boolean z2 = z;
            gapComposer.end(z2);
            String str = bullets.buttonLabel;
            if (str == null) {
                gapComposer.startReplaceGroup(1795445829);
                gapComposer.end(z2);
                companion = companion3;
            } else {
                gapComposer.startReplaceGroup(1795445830);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                companion = companion3;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 12.0f), 1.0f);
                boolean z3 = (i5 & 112) == 32 ? true : z2;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(12, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1095503952, new SetPinViewKt$$ExternalSyntheticLambda7(str, 16), gapComposer), gapComposer, 1573248, 56);
                gapComposer.end(z2);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(bullets, function1, modifier2, i, 11);
        }
    }

    public static final void CreditLimitAndBorrowButtonTile(BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(363359194);
        int i2 = (gapComposer.changedInstance(creditLimitAndBorrowButtonTileModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1067286417, new BulletinTileKt$$ExternalSyntheticLambda2(creditLimitAndBorrowButtonTileModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(creditLimitAndBorrowButtonTileModel, function1, modifier2, i, 15);
        }
    }

    public static final void ExpandedLoanHistoryList(ExpandedLoanHistoryListModel expandedLoanHistoryListModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        expandedLoanHistoryListModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1970696035);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(expandedLoanHistoryListModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1611069522, new BulletinTileKt$$ExternalSyntheticLambda2(expandedLoanHistoryListModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(expandedLoanHistoryListModel, function1, modifier2, i, 10);
        }
    }

    public static final void FirstTimeBorrow(FirstTimeBorrowViewModel.Content content, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        int i2;
        boolean z;
        ComposableLambdaImpl composableLambdaImpl;
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1689721974);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(scrollState) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, j, rectangleShapeKt$RectangleShape$1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Modifier zIndex = ZIndexModifierKt.zIndex(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(zIndex, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
            NavigationType navigationType = NavigationType.CLOSE;
            if (content.helpAction != null) {
                gapComposer.startReplaceGroup(-1692147989);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1910106161, new BookletGridKt$$ExternalSyntheticLambda1(12, function1), gapComposer);
                z = false;
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1691892332);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 ? true : z;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, m177backgroundbw27NRU2, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, composableLambdaImpl, gapComposer, 54, 40);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), scrollState, false, 14);
            int i4 = i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            FirstTimeBorrowContent(content, function1, verticalScroll$default, gapComposer, i4);
            FooterCta(content, function1, null, gapComposer, i4);
            BorrowAmountPickerViewModel borrowAmountPickerViewModel = content.amountPicker;
            boolean z3 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(9, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BorrowAmountPicker(borrowAmountPickerViewModel, (Function1) rememberedValue2, gapComposer, 0);
            AlertDialogViewModel alertDialogViewModel = content.errorDialog;
            boolean z4 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda1(10, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ArcadeModal2Kt.AlertDialog(alertDialogViewModel, (Function1) rememberedValue3, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) content, function1, modifier, (Object) scrollState, i, 21);
        }
    }

    public static final void FirstTimeBorrowContent(FirstTimeBorrowViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(711252897);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Header(content, null, gapComposer, i2 & 14);
            FirstTimeBorrowViewModel.Content.Notice notice = content.notice;
            FirstTimeBorrowViewModel.Content.Bullets bullets = content.bullets;
            if (notice == null) {
                gapComposer.startReplaceGroup(584188675);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(584188676);
                FirstTimeBorrowViewModel.Content.Notice notice2 = content.notice;
                notice2.getClass();
                Notice(notice2, function1, null, gapComposer, i2 & 112);
                if (bullets != null) {
                    gapComposer.startReplaceGroup(-1982784032);
                    SectionDivider(null, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1982751358);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            if (bullets == null) {
                gapComposer.startReplaceGroup(584340668);
            } else {
                gapComposer.startReplaceGroup(584340669);
                Bullets(bullets, function1, null, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FirstTimeBorrowKt$$ExternalSyntheticLambda9(content, function1, modifier, i, 0);
        }
    }

    public static final void FooterCta(FirstTimeBorrowViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1710485713);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(companion, 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            zzabx.ButtonDefaultGroupVertical(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), Expect_jvmKt.rememberComposableLambda(1017536751, new CheckDepositAmountKt$$ExternalSyntheticLambda6(4, (Object) content, (Object) function1), gapComposer), gapComposer, 54, 0);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FirstTimeBorrowKt$$ExternalSyntheticLambda9(content, function1, modifier2, i, 1);
        }
    }

    public static final void Header(FirstTimeBorrowViewModel.Content content, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-35540376);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer2, companion, 1.0f);
            Image image = content.image;
            if (image == null) {
                gapComposer2.startReplaceGroup(303474390);
                gapComposer2.end(false);
            } else {
                str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1514231157, image, gapComposer2, false);
            }
            ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, str), null, m, null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer2, 25008, 104);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 32.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), Strings.getTypography(gapComposer2).headlineLarge, (TextLineBalancing) null, content.title, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, content.subtitle, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            re$$ExternalSyntheticOutline0.m(companion2, 8.0f, gapComposer, true);
            modifier2 = companion2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(content, modifier2, i, 9);
        }
    }

    public static final void LimitHubDisclaimerSection(BorrowLimitHubViewModel.Section.DisclaimerSection disclaimerSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1405238181);
        int i2 = i | (gapComposer.changedInstance(disclaimerSection) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = disclaimerSection.markdownText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, modifier, textStyle, j, null, null, null, 0, 0, 5, gapComposer, i2 & 896, 992);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(disclaimerSection, function1, modifier, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void LimitHubIncreaseLimitSection(BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection increaseLimitActionsSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        int i2;
        CellDefaultAccessory cellDefaultAccessory;
        Function0 function0;
        CellDefaultAccessory.Label label;
        CellDefaultAccessory cellDefaultAccessory2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(684002588);
        int i3 = 2;
        Function1 function12 = function1;
        int i4 = 32;
        int i5 = i | (gapComposer.changedInstance(increaseLimitActionsSection) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        boolean z = true;
        boolean z2 = 0;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            ViewfinderDefaults.SectionHeader(increaseLimitActionsSection.title, (Modifier) null, (String) null, (Function0) null, increaseLimitActionsSection.subtitle, gapComposer, 0, 14);
            gapComposer.startReplaceGroup(1141564507);
            for (BorrowLimitHubViewModel.CtaBullet ctaBullet : increaseLimitActionsSection.ctaBullets) {
                Icon icon = ctaBullet.icon;
                if (icon == null) {
                    gapComposer.startReplaceGroup(1905752584);
                    gapComposer.end(z2);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(1905752585);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(865227099, new LimitHubIncreaseLimitSectionKt$$ExternalSyntheticLambda0(icon), gapComposer);
                    gapComposer.end(z2);
                    composableLambdaImpl = rememberComposableLambda;
                }
                String str = ctaBullet.body;
                if (str == null) {
                    gapComposer.startReplaceGroup(1905940010);
                    gapComposer.end(z2);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer.startReplaceGroup(1905940011);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1176218155, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 13), gapComposer);
                    gapComposer.end(z2);
                    composableLambdaImpl2 = rememberComposableLambda2;
                }
                BorrowLimitHubViewModel.CtaBullet.Accessory accessory = ctaBullet.accessory;
                if (accessory != null) {
                    if (accessory instanceof BorrowLimitHubViewModel.CtaBullet.Accessory.Push) {
                        cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
                    } else {
                        if (accessory instanceof BorrowLimitHubViewModel.CtaBullet.Accessory.Label) {
                            label = new CellDefaultAccessory.Label(((BorrowLimitHubViewModel.CtaBullet.Accessory.Label) accessory).text, (int) z2);
                        } else {
                            if (!(accessory instanceof BorrowLimitHubViewModel.CtaBullet.Accessory.LabeledPush)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            label = new CellDefaultAccessory.Label(((BorrowLimitHubViewModel.CtaBullet.Accessory.LabeledPush) accessory).text, i3);
                        }
                        cellDefaultAccessory2 = label;
                    }
                    i2 = i3;
                    cellDefaultAccessory = cellDefaultAccessory2;
                } else {
                    i2 = i3;
                    cellDefaultAccessory = null;
                }
                String str2 = ctaBullet.actionUrl;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1906387526);
                    gapComposer.end(z2);
                    function0 = null;
                } else {
                    gapComposer.startReplaceGroup(1906387527);
                    boolean changed = ((i5 & 112) == i4 ? z : z2) | gapComposer.changed(str2) | gapComposer.changedInstance(ctaBullet);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function12, str2, ctaBullet, false, 14);
                        gapComposer.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                        rememberedValue = copyCodeKt$$ExternalSyntheticLambda4;
                    }
                    function0 = (Function0) rememberedValue;
                    gapComposer.end(z2);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-177450340, new BulletinTileKt$$ExternalSyntheticLambda6(ctaBullet, 6), gapComposer), null, function0, false, false, composableLambdaImpl2, null, cellDefaultAccessory, 0L, gapComposer, 48, 3444);
                function12 = function1;
                z2 = z2;
                i3 = i2;
                i5 = i5;
                i4 = i4;
                z = true;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(increaseLimitActionsSection, function1, modifier2, i, 17);
        }
    }

    public static final void LimitHubLimitInfoListSection(BorrowLimitHubViewModel.Section.LimitInfoBulletsSection limitInfoBulletsSection, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(782141451);
        int i2 = (gapComposer.changedInstance(limitInfoBulletsSection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            ViewfinderDefaults.SectionHeader(limitInfoBulletsSection.title, (Modifier) null, (String) null, (Function0) null, limitInfoBulletsSection.subtitle, gapComposer, 0, 14);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 24.0f, gapComposer);
            ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(565874683, new CheckDepositAmountKt$$ExternalSyntheticLambda8(limitInfoBulletsSection, 3), gapComposer), gapComposer, 196992, 27);
            gapComposer = gapComposer;
            if (limitInfoBulletsSection.infoBullets.isEmpty()) {
                gapComposer.startReplaceGroup(1232955181);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1232915780);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(limitInfoBulletsSection, modifier, i, 6);
        }
    }

    public static final void LoadableFirstTimeBorrow(FirstTimeBorrowViewModel firstTimeBorrowViewModel, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ScrollState scrollState2;
        ScrollState rememberScrollState;
        Modifier modifier3;
        firstTimeBorrowViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-589068855);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(firstTimeBorrowViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                rememberScrollState = scrollState;
            }
            gapComposer.endDefaults();
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(124132884, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(firstTimeBorrowViewModel, function1, modifier3, rememberScrollState, 13), gapComposer), gapComposer, 3072, 7);
            modifier2 = modifier3;
            scrollState2 = rememberScrollState;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            scrollState2 = scrollState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) firstTimeBorrowViewModel, function1, modifier2, (Object) scrollState2, i, 20);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1062417418);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 200.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda14(i, 7);
        }
    }

    public static final void LoanHistoryTile(BorrowHomeViewModel.Tile.LoanHistoryTileModel loanHistoryTileModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(629467340);
        int i2 = (gapComposer.changedInstance(loanHistoryTileModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1473514985, new BulletinTileKt$$ExternalSyntheticLambda2(loanHistoryTileModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(loanHistoryTileModel, function1, modifier2, i, 14);
        }
    }

    public static final void LoanHistoryTileRow(final BorrowAppletLoanHistoryTile.Data.Loan loan, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Modifier modifier3;
        loan.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1100940123);
        int i4 = i | (gapComposer2.changedInstance(loan) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer2.changed(modifier2) ? 256 : 128);
        }
        final int i6 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            boolean changedInstance = gapComposer2.changedInstance(loan);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(loan, 20);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier4, (Function1) rememberedValue);
            LocalizedString localizedString = loan.right_text;
            localizedString.getClass();
            String str = localizedString.translated_value;
            str.getClass();
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(str, 0);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-89835166, new Function2() { // from class: com.squareup.cash.borrow.views.LoanHistoryTileKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.ui.graphics.Color m;
                    int i7 = r2;
                    BorrowAppletLoanHistoryTile.Data.Loan loan2 = loan;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                LocalizedString localizedString2 = loan2.primary_text;
                                localizedString2.getClass();
                                String str2 = localizedString2.translated_value;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                LocalizedString localizedString3 = loan2.secondary_text;
                                localizedString3.getClass();
                                String str3 = localizedString3.translated_value;
                                str3.getClass();
                                Color color = loan2.secondary_text_tint_color;
                                if (color == null) {
                                    gapComposer4.startReplaceGroup(-982626181);
                                    gapComposer4.end(false);
                                    m = null;
                                } else {
                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, 799586374, color, gapComposer4, false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, m != null ? m.value : androidx.compose.ui.graphics.Color.Unspecified, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i7 = (gapComposer2.changedInstance(loan) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (i7 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(6, (Object) loan, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(f319lambda$1169377213, rememberComposableLambda, clearAndSetSemantics, (Function0) rememberedValue2, null, false, false, Expect_jvmKt.rememberComposableLambda(2092449820, new Function2() { // from class: com.squareup.cash.borrow.views.LoanHistoryTileKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.ui.graphics.Color m;
                    int i72 = i6;
                    BorrowAppletLoanHistoryTile.Data.Loan loan2 = loan;
                    switch (i72) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                LocalizedString localizedString2 = loan2.primary_text;
                                localizedString2.getClass();
                                String str2 = localizedString2.translated_value;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                LocalizedString localizedString3 = loan2.secondary_text;
                                localizedString3.getClass();
                                String str3 = localizedString3.translated_value;
                                str3.getClass();
                                Color color = loan2.secondary_text_tint_color;
                                if (color == null) {
                                    gapComposer4.startReplaceGroup(-982626181);
                                    gapComposer4.end(false);
                                    m = null;
                                } else {
                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, 799586374, color, gapComposer4, false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, m != null ? m.value : androidx.compose.ui.graphics.Color.Unspecified, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, label, 0L, null, gapComposer, 12582966, 0, 3440);
            modifier3 = modifier4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(loan, function1, modifier3, i, i2, 13);
        }
    }

    public static final void Notice(FirstTimeBorrowViewModel.Content.Notice notice, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(893515853);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(notice) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 24.0f));
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).sectionTitle, 0L, Room.getSp(18.1d), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, notice.title, (Map) null, (Function1) null, false);
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(-669998956, new BulletinTileKt$$ExternalSyntheticLambda2(5, notice, function1), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(notice, function1, modifier2, i, 12);
        }
    }

    public static final void RepaymentChoiceCell(final BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice choice, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1376551598);
        int i2 = i | (gapComposer2.changedInstance(choice) ? 4 : 2) | (gapComposer2.changedInstance(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = choice.secondaryText;
            String str2 = choice.accessoryText;
            if (str == null) {
                gapComposer2.startReplaceGroup(-500506252);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(-500506251);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1316753066, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 15), gapComposer2);
                gapComposer2.end(false);
            }
            boolean z = str == null;
            CellDefaultAccessory label = str2 != null ? new CellDefaultAccessory.Label(str2, 2) : CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(614003444, new Function2() { // from class: com.squareup.cash.borrow.views.RepaymentSelectionSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice choice2 = choice;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                BorrowHomeKt.RepaymentChoiceIcon(choice2.icon, null, gapComposer3, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, choice2.primaryText, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(806934645, new Function2() { // from class: com.squareup.cash.borrow.views.RepaymentSelectionSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice choice2 = choice;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                BorrowHomeKt.RepaymentChoiceIcon(choice2.icon, null, gapComposer3, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, choice2.primaryText, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i4 = (gapComposer2.changedInstance(choice) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(8, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, choice);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            boolean z2 = z;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, companion, (Function0) rememberedValue, null, false, z2, rememberComposableLambda, null, label, 0L, null, gapComposer, 438, 0, 3376);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(choice, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, modifier2, i, 22);
        }
    }

    public static final void RepaymentChoiceIcon(BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon icon, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1796046594);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(icon) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 48.0f);
            long j = Strings.getColors(gapComposer).semantic.background.brand;
            long j2 = Strings.getColors(gapComposer).component.avatar.text;
            if (icon instanceof BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Simple) {
                gapComposer.startReplaceGroup(678845054);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                int ordinal = ((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Simple) icon).value.ordinal();
                if (ordinal == 0) {
                    icons = Icons.Borrow24;
                } else if (ordinal == 1) {
                    icons = Icons.Help24;
                } else if (ordinal == 2) {
                    icons = Icons.Date24;
                } else if (ordinal == 3) {
                    icons = Icons.Check24;
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.Skipped24;
                }
                companion = companion2;
                TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, j2, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3126, 0, 2000);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                if (!(icon instanceof BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Text)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 576086375, false);
                }
                gapComposer.startReplaceGroup(679235964);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, Strings.getColors(gapComposer).semantic.background.brand, RoundedCornerShapeKt.CircleShape), 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                String str = ((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Text) icon).value;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(16);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue);
                gapComposer.startReplaceGroup(1254545634);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, density.mo238toSp0xMU5do(10.0f), null, null, 0L, null, 0L, null, null, null, 0, density.mo238toSp0xMU5do(12.0f), null, null, 0, 16646141);
                gapComposer.end(false);
                companion = companion2;
                Room.m1165Text25TpFw(0, 2, 0, 3, 1572864, 0, 3760, j2, (Composer) gapComposer, clearAndSetSemantics, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(icon, modifier2, i, 12);
        }
    }

    public static final void RepaymentSelectionSheet(BorrowHomeOverlayViewModel.LoanRepaymentSelection loanRepaymentSelection, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier modifier, Composer composer, int i) {
        loanRepaymentSelection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1733583718);
        int i2 = (gapComposer.changedInstance(loanRepaymentSelection) ? 4 : 2) | i | (gapComposer.changedInstance(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1645410011, new BulletinTileKt$$ExternalSyntheticLambda2(loanRepaymentSelection, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(loanRepaymentSelection, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, modifier2, i, 21);
        }
    }

    public static final void RetryButton(ExpandedLoanHistoryListModel expandedLoanHistoryListModel, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2048842718);
        int i2 = (gapComposer.changedInstance(expandedLoanHistoryListModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), false, null, null, Expect_jvmKt.rememberComposableLambda(738398816, new CheckDepositAmountKt$$ExternalSyntheticLambda6(3, function0, expandedLoanHistoryListModel), gapComposer), gapComposer, 24576, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(expandedLoanHistoryListModel, function0, i, 4);
        }
    }

    public static final void SectionDivider(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(778557294);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 12.0f));
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 14);
        }
    }

    public static final void Step(String str, StepStatus stepStatus, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1477309945);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(stepStatus.ordinal()) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
            int ordinal = stepStatus.ordinal();
            if (ordinal == 0) {
                composableLambdaImpl = lambda$1111589418;
            } else if (ordinal == 1) {
                composableLambdaImpl = f325lambda$621717663;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                composableLambdaImpl = lambda$1308513186;
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-158559752, new SetPinViewKt$$ExternalSyntheticLambda2(29, stepStatus, str), gapComposer), semantics, null, false, false, null, null, null, 0L, gapComposer, 48, 4088);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(str, stepStatus, modifier2, i, 13);
        }
    }

    public static final void UpsellCard(BorrowAppletBulletinsTile.Data.UpsellCard upsellCard, Function1 function1, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(216456570);
        int i2 = i | (gapComposer.changedInstance(upsellCard) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LocalizedString localizedString = upsellCard.body_text;
            if (localizedString == null) {
                gapComposer.startReplaceGroup(1712044544);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1712044545);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1084396306, new BulletinTileKt$$ExternalSyntheticLambda5(localizedString, 0), gapComposer);
                gapComposer.end(false);
            }
            Illustration illustration = upsellCard.illustration;
            CardUpsellIllustration cardUpsellIllustration = illustration != null ? IllustrationsKt.toCardUpsellIllustration(illustration) : null;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(165038841, new BulletinTileKt$$ExternalSyntheticLambda6(upsellCard, 0), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1095694800, new SsnViewKt$$ExternalSyntheticLambda2(upsellCard, 28), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(upsellCard) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(i3, (Object) upsellCard, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CardUpsellKt.CardUpsellSmall(rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue, modifier, rememberComposableLambda, cardUpsellIllustration, gapComposer, ((i2 << 3) & 7168) | 54, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(upsellCard, function1, modifier, i, 0);
        }
    }

    public static final AsyncImagePainter loadPainter(PainterRequest painterRequest, Composer composer, int i) {
        String str = painterRequest.url;
        boolean z = (((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(painterRequest)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(painterRequest, 18);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(str, null, null, (Function1) rememberedValue, gapComposer, 0, 446);
    }

    public static final Icons toArcadeIcon(BorrowAppletBulletinsTile.Data.Bulletin.Icon icon) {
        int ordinal = icon.ordinal();
        if (ordinal == 0) {
            return Icons.TickerUp24;
        }
        if (ordinal == 1) {
            return Icons.Alert24;
        }
        if (ordinal == 2) {
            return Icons.TickerDown24;
        }
        if (ordinal == 3) {
            return Icons.Borrow24;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
