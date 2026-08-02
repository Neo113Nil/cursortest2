package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.advertising.views.AdUiFactory;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.StatusResultViewKt;
import com.squareup.cash.blockers.views.VerifyCardView;
import com.squareup.cash.blockers.views.VerifyContactsView;
import com.squareup.cash.blockers.views.VerifyHelpSheetView;
import com.squareup.cash.blockers.views.components.ContactsPermissionExplanationSheetView;
import com.squareup.cash.blockers.views.components.InviteFriendsView;
import com.squareup.cash.blockers.views.components.VerifyAliasView;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.blockers.web.views.WebViewBlockerView;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.buynowpaylater.viewmodels.SUPCardInfo;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewModel;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda9(Modifier modifier, SUPCardInfo sUPCardInfo, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = 27;
        this.f$2 = modifier;
        this.f$0 = sUPCardInfo;
        this.f$1 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BorrowHomeKt.UpsellCard((BorrowAppletBulletinsTile.Data.UpsellCard) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                StatusResultViewKt.Render((LayoutUpdate.Promotions) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                StatusResultViewKt.StatusResult((StatusResultViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                SsnViewKt.UnselectableOptionDialogView((UnselectableOptionViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int i2 = VerifyCardView.$r8$clinit;
                ((VerifyCardView) obj5).Content((VerifyInstrumentModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i3 = VerifyContactsView.$r8$clinit;
                ((VerifyContactsView) obj5).Content((VerifyContactsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                SsnViewKt.VerifyContacts((VerifyContactsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i4 = VerifyHelpSheetView.$r8$clinit;
                ((VerifyHelpSheetView) obj5).Content((VerifyHelpViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int i5 = ContactsPermissionExplanationSheetView.$r8$clinit;
                ((ContactsPermissionExplanationSheetView) obj5).Content((Unit) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = InviteFriendsView.$r8$clinit;
                ((InviteFriendsView) obj5).Content((InviteFriendsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                int i7 = VerifyAliasView.$r8$clinit;
                ((VerifyAliasView) obj5).Content((VerifyAliasModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((WebViewBlockerView) obj5).Content((WebViewBlockerViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).InstalledUI((BorrowAppletTileModel.Installed) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BorrowHomeKt.Step((String) obj5, (StepStatus) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                BulletinInfoOverlayKt.BulletinInfoModal((BorrowHomeOverlayViewModel.InfoModal) obj5, (Latch$await$2$2) obj4, (QuickPayViewKt$QuickPay$1$1$1$2$2$1$1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                BorrowHomeKt.CreditLimitAndBorrowButtonTile((BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LimitHubDisclaimerSection((BorrowLimitHubViewModel.Section.DisclaimerSection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LimitHubIncreaseLimitSection((BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                LoanDetailsSheetKt.LoanDetailsSheet((BorrowHomeOverlayViewModel.LoanDetails) obj5, (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                LoanDetailsSheetKt.DetailRow((BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                PaymentTimelineTileKt.PaymentTimelineTile((BorrowHomeViewModel.Tile.PaymentTimelineTileModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                BorrowHomeKt.RepaymentSelectionSheet((BorrowHomeOverlayViewModel.LoanRepaymentSelection) obj5, (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                BorrowHomeKt.RepaymentChoiceCell((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice) obj5, (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                AdUiFactory adUiFactory = (AdUiFactory) obj5;
                BugReportingViewModel bugReportingViewModel = (BugReportingViewModel) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BugReportingViewKt.BugReportingView((RealFilePicker$Factory$Impl) adUiFactory.activityEvents, bugReportingViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                BugReportingViewModel bugReportingViewModel2 = (BugReportingViewModel) obj5;
                RealFilePicker realFilePicker = (RealFilePicker) obj3;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (bugReportingViewModel2 instanceof BugReportingViewModel.Ready) {
                        gapComposer2.startReplaceGroup(-1682948308);
                        BugReportingViewKt.BugReportingContent(realFilePicker, (BugReportingViewModel.Ready) bugReportingViewModel2, function12, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (bugReportingViewModel2 instanceof BugReportingViewModel.Loading) {
                        gapComposer2.startReplaceGroup(-1682806328);
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer2, null);
                        gapComposer2.end(false);
                    } else {
                        if (!(bugReportingViewModel2 instanceof BugReportingViewModel.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1192635780, false);
                        }
                        gapComposer2.startReplaceGroup(-1682720923);
                        BugReportingViewKt.BugReportingSuccess((BugReportingViewModel.Success) bugReportingViewModel2, function12, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                BugReportingViewKt.BugReportingView((RealFilePicker$Factory$Impl) obj5, (BugReportingViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                BugReportingViewKt.BugReportingContent((RealFilePicker) obj5, (BugReportingViewModel.Ready) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                PrimitiveResources_androidKt.SingleUsePaymentOverviewCard((Modifier) obj3, (SUPCardInfo) obj5, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                CardPreviewViewModel cardPreviewViewModel = (CardPreviewViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                TextureViewFpsTracker textureViewFpsTracker = (TextureViewFpsTracker) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    TransactorKt.LoadableContent(cardPreviewViewModel, cardPreviewViewModel instanceof CardPreviewViewModel.SubmittingDesign, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, null, Expect_jvmKt.rememberComposableLambda(-109984379, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(cardPreviewViewModel, function13, textureViewFpsTracker, 6), gapComposer3), gapComposer3, 1572864, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                CanvasKt.CardStudioExitDialog((CardStudioExitDialogViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda9(CardPreviewViewModel cardPreviewViewModel, Function1 function1, TextureViewFpsTracker textureViewFpsTracker) {
        this.$r8$classId = 28;
        this.f$0 = cardPreviewViewModel;
        this.f$1 = function1;
        this.f$2 = textureViewFpsTracker;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
    }
}
