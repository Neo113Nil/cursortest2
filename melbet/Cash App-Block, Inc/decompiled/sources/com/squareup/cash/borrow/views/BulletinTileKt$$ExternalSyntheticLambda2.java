package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.SizeKt;
import com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagy;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.timeline.TimelineProtoBindingKt;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.buynowpaylater.components.SingleUsePaymentOrderDetailsView;
import com.squareup.cash.buynowpaylater.viewmodels.SUPCardInfo;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransaction;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransactions;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardPreviewSheet;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.CardStudioExitDialogResult;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$models$6$1;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.CollapsibleDetailsSection;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureView;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureView$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureViewModel;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.IconGridSection;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewModel;
import com.squareup.cash.card.onboarding.StampGridCells;
import com.squareup.cash.card.onboarding.StampInsetsPaddingValues;
import com.squareup.cash.card.onboarding.StampSheetV2Kt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.onboarding.StampSheetV2Kt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.onboarding.screens.CardStudioExitQuestion;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(BorrowHomeOverlayViewModel.LoanRepaymentSelection loanRepaymentSelection, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) {
        this.$r8$classId = 11;
        this.f$0 = loanRepaymentSelection;
        this.f$1 = borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$PatternStampSheetKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        boolean z;
        StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            StampInsetsPaddingValues stampInsetsPaddingValues = new StampInsetsPaddingValues(Arrangement$End$1.current(gapComposer).systemBars, (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier padding = SpacerKt.padding(companion, stampInsetsPaddingValues);
            long j = Strings.getColors(gapComposer).component.sheet.background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(padding, j, rectangleShapeKt$RectangleShape$1);
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
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU2, 12.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, CanvasKt.f337lambda$399677165, gapComposer, 1572864, 62);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z2 = !stampSheetViewModel.selectedStamps.isEmpty();
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(stampSheetViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StampSheetV2Kt$$ExternalSyntheticLambda12(1, stampSheetViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCompact((Function0) rememberedValue2, null, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(-2053532036, new CheckDepositAmountKt$$ExternalSyntheticLambda8(stampSheetViewModel, 10), gapComposer), gapComposer, 1573248, 42);
            gapComposer.end(true);
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(12.0f, gapComposer);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.derivedStateOf(new BrazeImageUtils$$ExternalSyntheticLambda1(rememberLazyGridState, m3477toPx8Feqmps));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ModalKt.HorizontalDivider(0, 0, gapComposer, AlphaKt.alpha(companion, ((Number) ((State) rememberedValue3).getValue()).floatValue()));
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2);
            StampGridCells stampGridCells = StampGridCells.INSTANCE;
            AdaptiveStackKt$spacedBetween$1 adaptiveStackKt$spacedBetween$1 = new AdaptiveStackKt$spacedBetween$1(12.0f);
            AdaptiveStackKt$spacedBetween$1 adaptiveStackKt$spacedBetween$12 = new AdaptiveStackKt$spacedBetween$1(12.0f);
            boolean changedInstance = gapComposer.changedInstance(stampSheetViewModel) | gapComposer.changed(function1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                z = true;
                rememberedValue4 = new StampSheetV2Kt$$ExternalSyntheticLambda6(1 == true ? 1 : 0, stampSheetViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                z = true;
            }
            LazyGridDslKt.LazyVerticalGrid(stampGridCells, m300paddingVpY3zN4$default, rememberLazyGridState, null, adaptiveStackKt$spacedBetween$12, adaptiveStackKt$spacedBetween$1, null, false, null, (Function1) rememberedValue4, gapComposer, 1769526, 920);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$TagConfirmationEffectScaffoldKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        MutableState mutableState = (MutableState) this.f$0;
        Function5 function5 = (Function5) this.f$1;
        Offset offset = (Offset) obj;
        Size size = (Size) obj2;
        Object value = mutableState.getValue();
        return Boolean.valueOf(value != null ? ((Boolean) function5.invoke(value, Float.valueOf(Float.intBitsToFloat((int) (offset.packedValue >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax))), Float.valueOf(Float.intBitsToFloat((int) (size.packedValue >> 32))), Float.valueOf(Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax))))).booleanValue() : false);
    }

    private final Object invoke$com$squareup$cash$card$onboarding$pdp$CollapsibleDetailsSectionKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        HeroSectionKt.CollapsibleDetailsSection((CollapsibleDetailsSection) this.f$0, (Set) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.squareup.cash.borrow.views.LoanHistoryTileKt$$ExternalSyntheticLambda5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl composableLambdaImpl;
        Object copyCodeKt$$ExternalSyntheticLambda4;
        Function1 function1;
        Function0 function0;
        Modifier wrapContentHeight;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    BorrowHomeKt.UpsellCard(upsellCard, function12, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 12.0f), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                BorrowAppletBulletinsTile.Data.Bulletin bulletin = (BorrowAppletBulletinsTile.Data.Bulletin) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Badge.Small small = Intrinsics.areEqual(bulletin.badged, Boolean.TRUE) ? Badge.Small.INSTANCE : null;
                    CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(86488292, new BulletinTileKt$$ExternalSyntheticLambda10(bulletin, r10 ? 1 : 0, r10 ? (byte) 1 : (byte) 0), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1371550821, new BulletinTileKt$$ExternalSyntheticLambda10(bulletin, 1, r10 ? (byte) 1 : (byte) 0), gapComposer2);
                    boolean changed = gapComposer2.changed(function13) | gapComposer2.changedInstance(bulletin);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(r10 ? 1 : 0, function13, bulletin);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, null, (Function0) rememberedValue, null, false, true, Expect_jvmKt.rememberComposableLambda(491991403, new BulletinTileKt$$ExternalSyntheticLambda10(bulletin, 2, r10 ? (byte) 1 : (byte) 0), gapComposer2), small, push, 0L, null, gapComposer2, 819462198, 0, 3124);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                final BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel = (BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(11);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    final int i3 = 1;
                    Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth2, true, (Function1) rememberedValue2);
                    final int i4 = r10 ? 1 : 0;
                    Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(2047716398, new Function2() { // from class: com.squareup.cash.borrow.views.CreditLimitAndBorrowButtonTileKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i5 = i4;
                            BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel2 = creditLimitAndBorrowButtonTileModel;
                            switch (i5) {
                                case 0:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).numeralLarge, (TextLineBalancing) null, creditLimitAndBorrowButtonTileModel2.creditLimitMoneyLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer5 = (Composer) obj5;
                                    int intValue5 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        LocalizedString localizedString = creditLimitAndBorrowButtonTileModel2.tileData.credit_limit_subtitle;
                                        localizedString.getClass();
                                        String str = localizedString.translated_value;
                                        str.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3), semantics, (Function2) null, Expect_jvmKt.rememberComposableLambda(884113009, new Function2() { // from class: com.squareup.cash.borrow.views.CreditLimitAndBorrowButtonTileKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i5 = i3;
                            BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel2 = creditLimitAndBorrowButtonTileModel;
                            switch (i5) {
                                case 0:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).numeralLarge, (TextLineBalancing) null, creditLimitAndBorrowButtonTileModel2.creditLimitMoneyLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer5 = (Composer) obj5;
                                    int intValue5 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        LocalizedString localizedString = creditLimitAndBorrowButtonTileModel2.tileData.credit_limit_subtitle;
                                        localizedString.getClass();
                                        String str = localizedString.translated_value;
                                        str.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3), gapComposer3, 3078, 4);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, 48.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), 1.0f);
                    Boolean bool = creditLimitAndBorrowButtonTileModel.tileData.button_enabled;
                    bool.getClass();
                    boolean booleanValue = bool.booleanValue();
                    boolean changed2 = gapComposer3.changed(function14) | gapComposer3.changedInstance(creditLimitAndBorrowButtonTileModel);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(2, (Object) creditLimitAndBorrowButtonTileModel, function14);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    SizeKt.Button((Function0) rememberedValue3, fillMaxWidth3, buttonProminence, false, booleanValue, null, Expect_jvmKt.rememberComposableLambda(1477136658, new SsnViewKt$$ExternalSyntheticLambda2(creditLimitAndBorrowButtonTileModel, 29), gapComposer3), gapComposer3, 1573248, 40);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer4.consume(staticProvidableCompositionLocal2);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = expandedLoanHistoryListModel.data;
                    PagingData pagingData = expandedLoanHistoryListModel.pagedLoans;
                    LocalizedString localizedString = expandedLoanListViewData.title;
                    localizedString.getClass();
                    String str = localizedString.translated_value;
                    str.getClass();
                    NavigationType navigationType = NavigationType.CLOSE;
                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal2);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion, colors2.component.titleBar.background, rectangleShapeKt$RectangleShape$1);
                    boolean changed3 = gapComposer4.changed(function15);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda3(11, function15);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(str, navigationType, m177backgroundbw27NRU2, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer4, 48, 104);
                    boolean changed4 = gapComposer4.changed(pagingData);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new AppLockMonitor$special$$inlined$map$2(pagingData, 19);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    LazyPagingItems collectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems((Flow) rememberedValue5, gapComposer4);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer4).navigationBars, gapComposer4);
                    boolean changedInstance = gapComposer4.changedInstance(expandedLoanHistoryListModel) | gapComposer4.changedInstance(collectAsLazyPagingItems) | gapComposer4.changed(function15);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(9, collectAsLazyPagingItems, expandedLoanHistoryListModel, function15);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    LazyDslKt.LazyColumn(layoutWeightElement, null, asPaddingValues, null, null, null, false, null, (Function1) rememberedValue6, gapComposer4, 0, 506);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                BorrowHomeKt.RetryButton((ExpandedLoanHistoryListModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                FirstTimeBorrowViewModel.Content.Notice notice = (FirstTimeBorrowViewModel.Content.Notice) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Strings.getSizes(gapComposer5).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer5).getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 8.0f, 16.0f, 24.0f);
                    String str2 = notice.body;
                    long j = Strings.getColors(gapComposer5).semantic.text.subtle;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer5).bodyXSmall, 0L, Room.getSp(18.1d), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer5).semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438), MarkdownSpanValues.Default.boldSpan);
                    boolean changed5 = gapComposer5.changed(function16);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new SsnViewKt$$ExternalSyntheticLambda12(7, function16);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue7, m301paddingqDBjuR0, m994copyp1EtxEg$default, j, markdownSpanValues, null, new TextLineBalancing(1), 0, 0, 0, gapComposer5, 0, 1856);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LimitHubLimitInfoListSection((BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                LimitHubProgressSectionKt.LimitHubProgressSection((BorrowLimitHubViewModel.Section.ProgressBarSectionModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                LimitHubProgressSectionKt.ProgressBarLabels((BorrowLimitHubViewModel.TextStack) obj4, (BorrowLimitHubViewModel.TextStack) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                BorrowHomeViewModel.Tile.LoanHistoryTileModel loanHistoryTileModel = (BorrowHomeViewModel.Tile.LoanHistoryTileModel) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                ?? r0 = (GapComposer) composer6;
                if (r0.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(companion, null, 3);
                    Colors colors3 = (Colors) r0.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m((GapComposer) r0, -1762997026, (GapComposer) r0, false);
                    } else {
                        r0.startReplaceGroup(-1762997739);
                        r0.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(wrapContentSize$default, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r0, 0);
                    int hashCode3 = Long.hashCode(r0.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r0.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(r0, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (r0.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r0.startReusableNode();
                    if (r0.inserting) {
                        r0.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        r0.useNode();
                    }
                    Updater.m576setimpl(r0, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(r0, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(r0, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(r0, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(r0, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-2000794726, new BulletinTileKt$$ExternalSyntheticLambda6(loanHistoryTileModel, 7), r0);
                    BorrowAppletLoanHistoryTile.Data data = loanHistoryTileModel.tileData;
                    BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData2 = data.expanded_loan_list_view_data;
                    if (expandedLoanListViewData2 == null) {
                        r0.startReplaceGroup(709958810);
                        r0.end(false);
                        composableLambdaImpl = null;
                    } else {
                        r0.startReplaceGroup(709958811);
                        LocalizedString localizedString2 = expandedLoanListViewData2.history_tile_expand_button_title;
                        if (localizedString2 == null) {
                            localizedString2 = expandedLoanListViewData2.expand_button_title;
                            localizedString2.getClass();
                        }
                        String str3 = localizedString2.translated_value;
                        if (str3 == null) {
                            r0.startReplaceGroup(472562254);
                            r0.end(false);
                            rememberComposableLambda = null;
                        } else {
                            r0.startReplaceGroup(472562255);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1424444577, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str3, 14), r0);
                            r0.end(false);
                        }
                        r0.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData3 = data.expanded_loan_list_view_data;
                    if (expandedLoanListViewData3 == null) {
                        r0.startReplaceGroup(710235113);
                        r0.end(false);
                        function1 = function17;
                        function0 = null;
                    } else {
                        r0.startReplaceGroup(710235114);
                        boolean changed6 = r0.changed(function17) | r0.changedInstance(expandedLoanListViewData3) | r0.changedInstance(loanHistoryTileModel);
                        Object rememberedValue8 = r0.rememberedValue();
                        if (changed6 || rememberedValue8 == neverEqualPolicy) {
                            function1 = function17;
                            copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, expandedLoanListViewData3, loanHistoryTileModel, false, 15);
                            r0.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                        } else {
                            copyCodeKt$$ExternalSyntheticLambda4 = rememberedValue8;
                            function1 = function17;
                        }
                        r0.end(false);
                        function0 = (Function0) copyCodeKt$$ExternalSyntheticLambda4;
                    }
                    ViewfinderDefaults.SectionHeader(rememberComposableLambda4, (Modifier) null, composableLambdaImpl, function0, (Function2) null, (Composer) r0, 6, 18);
                    r0.startReplaceGroup(2101127220);
                    for (BorrowAppletLoanHistoryTile.Data.Loan loan : data.loans) {
                        boolean changed7 = r0.changed(function1) | r0.changedInstance(loan);
                        Function1 rememberedValue9 = r0.rememberedValue();
                        if (changed7 || rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new LoanHistoryTileKt$$ExternalSyntheticLambda5(function1, loan, 0);
                            r0.updateRememberedValue(rememberedValue9);
                        }
                        BorrowHomeKt.LoanHistoryTileRow(loan, rememberedValue9, null, r0, 0, 4);
                    }
                    r0.end(false);
                    r0.end(true);
                } else {
                    r0.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                BorrowHomeViewModel.Tile.PaymentTimelineTileModel paymentTimelineTileModel = (BorrowHomeViewModel.Tile.PaymentTimelineTileModel) obj4;
                Function1 function18 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), Strings.getColors(gapComposer6).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 24.0f, 5);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode4 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer6, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    BorrowAppletPaymentTimelineTile.Data data2 = paymentTimelineTileModel.tileData;
                    LocalizedString localizedString3 = data2.title;
                    localizedString3.getClass();
                    String str4 = localizedString3.translated_value;
                    str4.getClass();
                    TextStyle textStyle = Strings.getTypography(gapComposer6).sectionTitle;
                    long j2 = Strings.getColors(gapComposer6).semantic.text.prominent;
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue10 = gapComposer6.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(15);
                        gapComposer6.updateRememberedValue(rememberedValue10);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer6, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default2, false, (Function1) rememberedValue10), textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    Timeline timeline = data2.timeline;
                    timeline.getClass();
                    boolean changed8 = gapComposer6.changed(function18);
                    Object rememberedValue11 = gapComposer6.rememberedValue();
                    if (changed8 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new SsnViewKt$$ExternalSyntheticLambda1(12, function18);
                        gapComposer6.updateRememberedValue(rememberedValue11);
                    }
                    TimelineProtoBindingKt.Timeline(timeline, (Function1) rememberedValue11, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, 1), 1.0f), null, gapComposer6, MLKEMEngine.KyberPolyBytes, 8);
                    BorrowAppletPaymentTimelineTile.Data.Button button = data2.button;
                    button.getClass();
                    Boolean bool2 = button.enabled;
                    bool2.getClass();
                    boolean booleanValue2 = bool2.booleanValue();
                    Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                    boolean changed9 = gapComposer6.changed(function18) | gapComposer6.changedInstance(paymentTimelineTileModel);
                    Object rememberedValue12 = gapComposer6.rememberedValue();
                    if (changed9 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(7, (Object) paymentTimelineTileModel, function18);
                        gapComposer6.updateRememberedValue(rememberedValue12);
                    }
                    SizeKt.Button((Function0) rememberedValue12, fillMaxWidth4, null, false, booleanValue2, null, Expect_jvmKt.rememberComposableLambda(1339131927, new CheckDepositAmountKt$$ExternalSyntheticLambda8(button, 5), gapComposer6), gapComposer6, 1572912, 44);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                BorrowHomeOverlayViewModel.LoanRepaymentSelection loanRepaymentSelection = (BorrowHomeOverlayViewModel.LoanRepaymentSelection) obj4;
                BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 = (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer7, 0);
                    int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    String str5 = loanRepaymentSelection.title;
                    Modifier fillMaxWidth5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion3, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal3)).getClass();
                    DefaultSizes.spacing.getClass();
                    Transformations.SheetHeader(str5, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), (Function2) null, (String) null, gapComposer7, 0, 12);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, false), ImageKt.rememberScrollState(gapComposer7), false, 14);
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal3)).getClass();
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(verticalScroll$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer7, 0);
                    int hashCode6 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default3);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer7, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                    gapComposer7.startReplaceGroup(-909153339);
                    Iterator it = loanRepaymentSelection.choices.iterator();
                    while (it.hasNext()) {
                        BorrowHomeKt.RepaymentChoiceCell((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice) it.next(), borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, null, gapComposer7, 0);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer7, false, true, true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                BorrowHomeKt.RepaymentChoiceIcon((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BugReportingViewKt.BugReportingSuccess((BugReportingViewModel.Success) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                BugReportingViewKt.DiagnosticAttachmentsContent((BugReportingViewModel.Ready) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                SUPOrderDetailsViewModel sUPOrderDetailsViewModel = (SUPOrderDetailsViewModel) obj4;
                SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView = (SingleUsePaymentOrderDetailsView) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer9;
                if (gapComposer8.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 24.0f, 16.0f, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode7 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer8, m301paddingqDBjuR02);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    SUPCardInfo sUPCardInfo = sUPOrderDetailsViewModel.cardInfo;
                    if (sUPCardInfo == null) {
                        gapComposer8.startReplaceGroup(-60709732);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-60709731);
                        PrimitiveResources_androidKt.SingleUsePaymentOverviewCard(null, sUPCardInfo, singleUsePaymentOrderDetailsView.imageLoader, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    String str6 = sUPOrderDetailsViewModel.message;
                    if (str6 == null) {
                        gapComposer8.startReplaceGroup(-60586352);
                        gapComposer8.end(false);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer8, -60586351, companion, 8.0f, gapComposer8);
                        ImageResources_androidKt.SingleUsePaymentInfoBox(str6, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    SUPOrderTransactions sUPOrderTransactions = sUPOrderDetailsViewModel.transactions;
                    if (sUPOrderTransactions == null) {
                        gapComposer8.startReplaceGroup(-60445953);
                        gapComposer8.end(false);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer8, -60445952, companion, 16.0f, gapComposer8);
                        zzagy.SingleUsePaymentTransactionList(null, sUPOrderTransactions, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                SUPCardInfo sUPCardInfo2 = (SUPCardInfo) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer10;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    KeypadKt.m3641CardIkByU14(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), 0L, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-401155562, new CheckDepositAmountKt$$ExternalSyntheticLambda6(sUPCardInfo2, realImageLoader), gapComposer9), gapComposer9, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                zzagy.SingleUsePaymentTransactionList((Modifier) obj4, (SUPOrderTransactions) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                zzagy.SingleUsePaymentTransaction((Modifier) obj4, (SUPOrderTransaction) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj4;
                Function1 function19 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer11;
                if (gapComposer10.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    PaymentDeviceCustomizationViewKt.PaymentDeviceCustomizationView(paymentDeviceCustomizationViewModel, function19, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                CardPreviewViewKt.ThemeInfoBottomSheet((CardPreviewSheet) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 21:
                final CardStudioExitDialogViewModel cardStudioExitDialogViewModel = (CardStudioExitDialogViewModel) obj4;
                final Function1 function110 = (Function1) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer12;
                if (gapComposer11.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Modifier m292widthInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 400.0f, 1);
                    String str7 = cardStudioExitDialogViewModel.title;
                    String str8 = cardStudioExitDialogViewModel.message;
                    final int i5 = r10 ? 1 : 0;
                    ModalKt.Modal(m292widthInVpY3zN4$default, str7, str8, Expect_jvmKt.rememberComposableLambda(1532293888, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i6 = i5;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final CardStudioExitDialogViewModel cardStudioExitDialogViewModel2 = cardStudioExitDialogViewModel;
                            Function1 function111 = function110;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i6) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer13 = (Composer) obj6;
                                    int intValue13 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue13 & 6) == 0) {
                                        intValue13 |= ((GapComposer) composer13).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer12 = (GapComposer) composer13;
                                    if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                                        boolean changed10 = gapComposer12.changed(function111);
                                        Object rememberedValue13 = gapComposer12.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(5, function111);
                                            gapComposer12.updateRememberedValue(rememberedValue13);
                                        }
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue13 << 12)) | 3072, 6, gapComposer12, Expect_jvmKt.rememberComposableLambda(-1510426767, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i7 = objArr2;
                                                CardStudioExitDialogViewModel cardStudioExitDialogViewModel3 = cardStudioExitDialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer14 = (Composer) obj9;
                                                        int intValue14 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer13 = (GapComposer) composer14;
                                                        if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.exitButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer13.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer15 = (Composer) obj9;
                                                        int intValue15 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer14 = (GapComposer) composer15;
                                                        if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.stayButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer14.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer12), null, (Function0) rememberedValue13, false);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer14 = (Composer) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue14 & 6) == 0) {
                                        intValue14 |= ((GapComposer) composer14).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer13 = (GapComposer) composer14;
                                    if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                                        boolean changed11 = gapComposer13.changed(function111);
                                        Object rememberedValue14 = gapComposer13.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(6, function111);
                                            gapComposer13.updateRememberedValue(rememberedValue14);
                                        }
                                        final char c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(-287768898, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i7 = c2;
                                                CardStudioExitDialogViewModel cardStudioExitDialogViewModel3 = cardStudioExitDialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer142 = (Composer) obj9;
                                                        int intValue142 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer132 = (GapComposer) composer142;
                                                        if (gapComposer132.shouldExecute(intValue142 & 1, (intValue142 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer132, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.exitButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer132.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer15 = (Composer) obj9;
                                                        int intValue15 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer14 = (GapComposer) composer15;
                                                        if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.stayButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer14.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer13), gapComposer13, ((intValue14 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer11), Expect_jvmKt.rememberComposableLambda(-1252651583, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i6 = i2;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final CardStudioExitDialogViewModel cardStudioExitDialogViewModel2 = cardStudioExitDialogViewModel;
                            Function1 function111 = function110;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i6) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer13 = (Composer) obj6;
                                    int intValue13 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue13 & 6) == 0) {
                                        intValue13 |= ((GapComposer) composer13).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer12 = (GapComposer) composer13;
                                    if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                                        boolean changed10 = gapComposer12.changed(function111);
                                        Object rememberedValue13 = gapComposer12.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(5, function111);
                                            gapComposer12.updateRememberedValue(rememberedValue13);
                                        }
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue13 << 12)) | 3072, 6, gapComposer12, Expect_jvmKt.rememberComposableLambda(-1510426767, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i7 = objArr2;
                                                CardStudioExitDialogViewModel cardStudioExitDialogViewModel3 = cardStudioExitDialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer142 = (Composer) obj9;
                                                        int intValue142 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer132 = (GapComposer) composer142;
                                                        if (gapComposer132.shouldExecute(intValue142 & 1, (intValue142 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer132, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.exitButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer132.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer15 = (Composer) obj9;
                                                        int intValue15 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer14 = (GapComposer) composer15;
                                                        if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.stayButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer14.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer12), null, (Function0) rememberedValue13, false);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer14 = (Composer) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue14 & 6) == 0) {
                                        intValue14 |= ((GapComposer) composer14).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer13 = (GapComposer) composer14;
                                    if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                                        boolean changed11 = gapComposer13.changed(function111);
                                        Object rememberedValue14 = gapComposer13.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(6, function111);
                                            gapComposer13.updateRememberedValue(rememberedValue14);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(-287768898, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioExitDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i7 = c2;
                                                CardStudioExitDialogViewModel cardStudioExitDialogViewModel3 = cardStudioExitDialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer142 = (Composer) obj9;
                                                        int intValue142 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer132 = (GapComposer) composer142;
                                                        if (gapComposer132.shouldExecute(intValue142 & 1, (intValue142 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer132, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.exitButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer132.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer15 = (Composer) obj9;
                                                        int intValue15 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer14 = (GapComposer) composer15;
                                                        if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioExitDialogViewModel3.stayButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer14.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer13), gapComposer13, ((intValue14 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer11), (Function3) null, gapComposer11, 27648, 32);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj3;
                CardStudioExitDialogResult cardStudioExitDialogResult = (CardStudioExitDialogResult) obj2;
                ((CardStudioExitQuestion) obj).getClass();
                if (Intrinsics.areEqual(cardStudioExitDialogResult, CardStudioExitDialogResult.Exit.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenterV2$models$6$1(cardStudioPresenter, continuation, i2), 3);
                } else if (!Intrinsics.areEqual(cardStudioExitDialogResult, CardStudioExitDialogResult.Stay.INSTANCE) && cardStudioExitDialogResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 23:
                final CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel = (CardStudioUndoDialogViewModel) obj4;
                final Function1 function111 = (Function1) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer13;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Modifier m292widthInVpY3zN4$default2 = androidx.compose.foundation.layout.SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 400.0f, 1);
                    String str9 = cardStudioUndoDialogViewModel.title;
                    String str10 = cardStudioUndoDialogViewModel.message;
                    final int i6 = r10 ? 1 : 0;
                    ModalKt.Modal(m292widthInVpY3zN4$default2, str9, str10, Expect_jvmKt.rememberComposableLambda(-2106181190, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = i6;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel2 = cardStudioUndoDialogViewModel;
                            Function1 function112 = function111;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i7) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer14 = (Composer) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue14 & 6) == 0) {
                                        intValue14 |= ((GapComposer) composer14).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer13 = (GapComposer) composer14;
                                    if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                                        boolean changed10 = gapComposer13.changed(function112);
                                        Object rememberedValue13 = gapComposer13.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(10, function112);
                                            gapComposer13.updateRememberedValue(rememberedValue13);
                                        }
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue14 << 12)) | 3072, 6, gapComposer13, Expect_jvmKt.rememberComposableLambda(-853934549, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i8 = objArr2;
                                                CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel3 = cardStudioUndoDialogViewModel2;
                                                switch (i8) {
                                                    case 0:
                                                        Composer composer15 = (Composer) obj9;
                                                        int intValue15 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer14 = (GapComposer) composer15;
                                                        if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.undoButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer14.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer16 = (Composer) obj9;
                                                        int intValue16 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer15 = (GapComposer) composer16;
                                                        if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.cancelButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer15.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer13), null, (Function0) rememberedValue13, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer15 = (Composer) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue15 & 6) == 0) {
                                        intValue15 |= ((GapComposer) composer15).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer14 = (GapComposer) composer15;
                                    if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                                        boolean changed11 = gapComposer14.changed(function112);
                                        Object rememberedValue14 = gapComposer14.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(11, function112);
                                            gapComposer14.updateRememberedValue(rememberedValue14);
                                        }
                                        final char c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(368723320, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i8 = c2;
                                                CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel3 = cardStudioUndoDialogViewModel2;
                                                switch (i8) {
                                                    case 0:
                                                        Composer composer152 = (Composer) obj9;
                                                        int intValue152 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer142 = (GapComposer) composer152;
                                                        if (gapComposer142.shouldExecute(intValue152 & 1, (intValue152 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer142, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.undoButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer142.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer16 = (Composer) obj9;
                                                        int intValue16 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer15 = (GapComposer) composer16;
                                                        if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.cancelButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer15.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer14), gapComposer14, ((intValue15 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12), Expect_jvmKt.rememberComposableLambda(-596159365, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = i2;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel2 = cardStudioUndoDialogViewModel;
                            Function1 function112 = function111;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i7) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer14 = (Composer) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue14 & 6) == 0) {
                                        intValue14 |= ((GapComposer) composer14).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer13 = (GapComposer) composer14;
                                    if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                                        boolean changed10 = gapComposer13.changed(function112);
                                        Object rememberedValue13 = gapComposer13.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(10, function112);
                                            gapComposer13.updateRememberedValue(rememberedValue13);
                                        }
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue14 << 12)) | 3072, 6, gapComposer13, Expect_jvmKt.rememberComposableLambda(-853934549, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i8 = objArr2;
                                                CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel3 = cardStudioUndoDialogViewModel2;
                                                switch (i8) {
                                                    case 0:
                                                        Composer composer152 = (Composer) obj9;
                                                        int intValue152 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer142 = (GapComposer) composer152;
                                                        if (gapComposer142.shouldExecute(intValue152 & 1, (intValue152 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer142, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.undoButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer142.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer16 = (Composer) obj9;
                                                        int intValue16 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer15 = (GapComposer) composer16;
                                                        if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.cancelButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer15.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer13), null, (Function0) rememberedValue13, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer15 = (Composer) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue15 & 6) == 0) {
                                        intValue15 |= ((GapComposer) composer15).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer14 = (GapComposer) composer15;
                                    if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                                        boolean changed11 = gapComposer14.changed(function112);
                                        Object rememberedValue14 = gapComposer14.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(11, function112);
                                            gapComposer14.updateRememberedValue(rememberedValue14);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(368723320, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioUndoDialogKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i8 = c2;
                                                CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel3 = cardStudioUndoDialogViewModel2;
                                                switch (i8) {
                                                    case 0:
                                                        Composer composer152 = (Composer) obj9;
                                                        int intValue152 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer142 = (GapComposer) composer152;
                                                        if (gapComposer142.shouldExecute(intValue152 & 1, (intValue152 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer142, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.undoButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer142.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer16 = (Composer) obj9;
                                                        int intValue16 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer15 = (GapComposer) composer16;
                                                        if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardStudioUndoDialogViewModel3.cancelButton, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer15.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer14), gapComposer14, ((intValue15 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12), (Function3) null, gapComposer12, 27648, 32);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                State state = (State) obj4;
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer14;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer13, AlphaKt.alpha(companion, ((Number) state.getValue()).floatValue()), (TextStyle) null, (TextLineBalancing) null, cardStylePickerViewModel.short_title_text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                final ConfirmExitDisclosureViewModel confirmExitDisclosureViewModel = (ConfirmExitDisclosureViewModel) obj4;
                final Function1 function112 = (Function1) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                int i7 = ConfirmExitDisclosureView.$r8$clinit;
                GapComposer gapComposer14 = (GapComposer) composer15;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    ComposableLambdaImpl composableLambdaImpl2 = CanvasKt.lambda$1150035888;
                    ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(-1926651791, new ConfirmExitDisclosureView$$ExternalSyntheticLambda2(confirmExitDisclosureViewModel, r10 ? 1 : 0), gapComposer14);
                    final int i8 = r10 ? 1 : 0;
                    ModalKt.Modal((Modifier) null, composableLambdaImpl2, rememberComposableLambda5, Expect_jvmKt.rememberComposableLambda(-789625531, new Function3() { // from class: com.squareup.cash.card.onboarding.ConfirmExitDisclosureView$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            ConfirmExitDisclosureViewModel confirmExitDisclosureViewModel2 = confirmExitDisclosureViewModel;
                            Function1 function113 = function112;
                            switch (i9) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer16 = (Composer) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    int i10 = ConfirmExitDisclosureView.$r8$clinit;
                                    modalButtonScope.getClass();
                                    if ((intValue16 & 6) == 0) {
                                        intValue16 |= ((GapComposer) composer16).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer15 = (GapComposer) composer16;
                                    if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                                        boolean changed10 = gapComposer15.changed(function113);
                                        Object rememberedValue13 = gapComposer15.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(25, function113);
                                            gapComposer15.updateRememberedValue(rememberedValue13);
                                        }
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue13, null, false, Expect_jvmKt.rememberComposableLambda(756319120, new ConfirmExitDisclosureView$$ExternalSyntheticLambda2(confirmExitDisclosureViewModel2, 1), gapComposer15), gapComposer15, (57344 & (intValue16 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer17 = (Composer) obj6;
                                    int intValue17 = ((Integer) obj7).intValue();
                                    int i11 = ConfirmExitDisclosureView.$r8$clinit;
                                    modalButtonScope2.getClass();
                                    if ((intValue17 & 6) == 0) {
                                        intValue17 |= ((GapComposer) composer17).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer16 = (GapComposer) composer17;
                                    if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                                        boolean changed11 = gapComposer16.changed(function113);
                                        Object rememberedValue14 = gapComposer16.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(26, function113);
                                            gapComposer16.updateRememberedValue(rememberedValue14);
                                        }
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(118494467, new ConfirmExitDisclosureView$$ExternalSyntheticLambda2(confirmExitDisclosureViewModel2, 2), gapComposer16), gapComposer16, ((intValue17 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer14), Expect_jvmKt.rememberComposableLambda(428654086, new Function3() { // from class: com.squareup.cash.card.onboarding.ConfirmExitDisclosureView$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i9 = i2;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            ConfirmExitDisclosureViewModel confirmExitDisclosureViewModel2 = confirmExitDisclosureViewModel;
                            Function1 function113 = function112;
                            switch (i9) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer16 = (Composer) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    int i10 = ConfirmExitDisclosureView.$r8$clinit;
                                    modalButtonScope.getClass();
                                    if ((intValue16 & 6) == 0) {
                                        intValue16 |= ((GapComposer) composer16).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer15 = (GapComposer) composer16;
                                    if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                                        boolean changed10 = gapComposer15.changed(function113);
                                        Object rememberedValue13 = gapComposer15.rememberedValue();
                                        if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                            rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(25, function113);
                                            gapComposer15.updateRememberedValue(rememberedValue13);
                                        }
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue13, null, false, Expect_jvmKt.rememberComposableLambda(756319120, new ConfirmExitDisclosureView$$ExternalSyntheticLambda2(confirmExitDisclosureViewModel2, 1), gapComposer15), gapComposer15, (57344 & (intValue16 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer17 = (Composer) obj6;
                                    int intValue17 = ((Integer) obj7).intValue();
                                    int i11 = ConfirmExitDisclosureView.$r8$clinit;
                                    modalButtonScope2.getClass();
                                    if ((intValue17 & 6) == 0) {
                                        intValue17 |= ((GapComposer) composer17).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer16 = (GapComposer) composer17;
                                    if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                                        boolean changed11 = gapComposer16.changed(function113);
                                        Object rememberedValue14 = gapComposer16.rememberedValue();
                                        if (changed11 || rememberedValue14 == neverEqualPolicy2) {
                                            rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(26, function113);
                                            gapComposer16.updateRememberedValue(rememberedValue14);
                                        }
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(118494467, new ConfirmExitDisclosureView$$ExternalSyntheticLambda2(confirmExitDisclosureViewModel2, 2), gapComposer16), gapComposer16, ((intValue17 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer14), (Function3) null, gapComposer14, 28080, 33);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$card$onboarding$PatternStampSheetKt$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$card$onboarding$TagConfirmationEffectScaffoldKt$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$card$onboarding$pdp$CollapsibleDetailsSectionKt$$ExternalSyntheticLambda1(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                HeroSectionKt.IconCell((IconGridSection.IconCell) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel, Function1 function1) {
        this.$r8$classId = 2;
        this.f$0 = creditLimitAndBorrowButtonTileModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(BorrowHomeViewModel.Tile.LoanHistoryTileModel loanHistoryTileModel, Function1 function1) {
        this.$r8$classId = 9;
        this.f$0 = loanHistoryTileModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(BorrowHomeViewModel.Tile.PaymentTimelineTileModel paymentTimelineTileModel, Function1 function1) {
        this.$r8$classId = 10;
        this.f$0 = paymentTimelineTileModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(ExpandedLoanHistoryListModel expandedLoanHistoryListModel, Function1 function1) {
        this.$r8$classId = 3;
        this.f$0 = expandedLoanHistoryListModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(SUPCardInfo sUPCardInfo, RealImageLoader realImageLoader) {
        this.$r8$classId = 16;
        this.f$0 = sUPCardInfo;
        this.f$1 = realImageLoader;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(CardStudioExitDialogViewModel cardStudioExitDialogViewModel, Function1 function1) {
        this.$r8$classId = 21;
        this.f$0 = cardStudioExitDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel, Function1 function1) {
        this.$r8$classId = 23;
        this.f$0 = cardStudioUndoDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
