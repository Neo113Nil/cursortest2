package com.squareup.cash.score.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionCallbacks;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.Session;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.savings.views.SavingsUpsellCardKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.applets.presenters.ScoreAppletTilePresenter$Factory$Impl;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowViewModel;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.session.backend.DbSessionManager;
import com.squareup.cash.session.backend.DbSessionManager$delete$2$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SharedElementKey;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewModel;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class CalloutKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(ErrorViewModel errorViewModel, Function1 function1) {
        this.$r8$classId = 27;
        this.f$0 = errorViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x02be, code lost:
    
        if (r6 == r11) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3;
        ?? r11;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i5 = 7;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i4) {
            case 0:
                CashCreditScoreHomeData.Graphic graphic = (CashCreditScoreHomeData.Graphic) obj5;
                StyledCardViewModel styledCardViewModel = (StyledCardViewModel) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 64.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
                    CashCreditScoreHomeData.Graphic.Card card = graphic.card;
                    Image image = graphic.image;
                    if (card != null && styledCardViewModel != null) {
                        gapComposer.startReplaceGroup(1992430127);
                        StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, RotateKt.rotate(SizeKt.m285size3ABfNKs(companion, 48.0f), -15.0f), null, 48.0f, 2.0f, false, gapComposer, 27696, 36);
                        gapComposer.end(false);
                    } else if (image != null) {
                        gapComposer.startReplaceGroup(1992769732);
                        AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer), null, null, null, ContentScale.Companion.Inside, null, gapComposer, 1572912, 1980);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1992994079);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel = (PromotionsReferralsHomeViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    PromotionsTitleBarKt.PromotionsReferralsContent((PromotionsReferralsHomeViewModel.Loaded) promotionsReferralsHomeViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                PromotionsTitleBarKt.PromotionsReferralsContent((PromotionsReferralsHomeViewModel.Loaded) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                CameraXPreviewState cameraXPreviewState = (CameraXPreviewState) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    ChromeConfigKt.ChromeConfig(null, null, null, Boolean.TRUE, null, null, null, gapComposer3, 3072, 119);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed = gapComposer3.changed(function12);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(14, function12);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    CameraXPreviewKt.CameraXPreview(cameraXPreviewState, (Function1) rememberedValue, fillMaxSize2, gapComposer3, MLKEMEngine.KyberPolyBytes);
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagQrScanView$$ExternalSyntheticLambda0(22, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1664273020, new CashtagQrScanViewKt$$ExternalSyntheticLambda4(cameraXPreviewState, 0), gapComposer3), gapComposer3, 1572918, 44);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    CameraXPreviewKt.CameraXPreviewOverlay(0, 2, gapComposer3, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), null);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function13 = (Function1) obj5;
                QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    boolean changed3 = gapComposer4.changed(function13);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashtagQrScanView$$ExternalSyntheticLambda0(24, function13);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1215403838, new ButtonGroupKt$$ExternalSyntheticLambda11(qrAddressScannerViewModel, i5), gapComposer4), gapComposer4, 1572912, 60);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ArrayList arrayList = (ArrayList) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(companion, zzagn.rememberNestedScrollInteropConnection(gapComposer5), null);
                    GridCells.Fixed fixed = new GridCells.Fixed(6);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(24.0f, false, null);
                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(32.0f, 28.0f, 32.0f, 12.0f);
                    boolean changedInstance = gapComposer5.changedInstance(arrayList) | gapComposer5.changed(function14);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new OpenSourceKt$$ExternalSyntheticLambda11(20, arrayList, function14);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, nestedScroll, null, paddingValuesImpl, null, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue4, gapComposer5, 1572864, 948);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                StackedAvatarViewModel.Single single = (StackedAvatarViewModel.Single) obj5;
                PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow = (PaymentPlanSummaryViewModel.PurchasesSection.DetailRow) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AvatarsKt.Avatar(AvatarSize.Size48, single, null, detailRow.avatarBadge, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(16), gapComposer6, 70, 4);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryKt.ProgressSection((PaymentPlanSummaryViewModel.ProgressSection) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = (PaymentPlanSummaryViewModel) obj5;
                StackedAvatarViewModel.Single single2 = (StackedAvatarViewModel.Single) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AvatarsKt.Avatar(AvatarSize.Size64, single2, null, paymentPlanSummaryViewModel.avatarBadge, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(0), gapComposer7, 70, 4);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.HeaderSection((SelectPaymentPlanViewModel.HeaderSection) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                TypedValueCompat.UninstalledUI((SavingsAppletTileViewModel.Uninstalled) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ButtonGroupKt.LabeledPushWithColors((String) obj5, (ColorModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj5;
                Function1 function15 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    com.squareup.cash.activity.views.AvatarsKt.ActivityEmbeddedView(((SavingsScreenViewModel.Content.SavingsScreenElement.ActivitySection) savingsScreenElement).activitySectionViewModel, null, Expect_jvmKt.rememberComposableLambda(1807194259, new ShareSheetViewKt$$ExternalSyntheticLambda1(18, (Object) savingsScreenElement, (Object) function15), gapComposer8), null, null, gapComposer8, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.WithinSection((SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.SectionHeader((SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                TransferringViewModel transferringViewModel = (TransferringViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Strings.LoadableFullScreenContent(transferringViewModel, transferringViewModel instanceof TransferringViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(1179768139, new PoolDetailsViewKt$$ExternalSyntheticLambda41(6, transferringViewModel, function16), gapComposer9), gapComposer9, 196608, 28);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ButtonGroupKt.Error((TransferringViewModel.Error) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                Function1 function17 = (Function1) obj5;
                UpsellCardModel$Loaded upsellCardModel$Loaded = (UpsellCardModel$Loaded) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean changed4 = gapComposer10.changed(function17);
                    Object rememberedValue5 = gapComposer10.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        i = 1;
                        rememberedValue5 = new ScoreHomeKt$$ExternalSyntheticLambda0(1, function17);
                        gapComposer10.updateRememberedValue(rememberedValue5);
                    } else {
                        i = 1;
                    }
                    SheetKt.Sheet((Function0) rememberedValue5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-811106053, new SavingsUpsellCardKt$$ExternalSyntheticLambda3(upsellCardModel$Loaded, function17, i), gapComposer10), gapComposer10, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ViewPropertyAnimatorListenerAdapter.UninstalledScoreAppletTile((ScoreAppletTileViewModel.Uninstalled) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LanguageDisclosureSetupTeardown.MetroFactory metroFactory = ((ScoreAppletTilePresenter$Factory$Impl) obj5).delegateFactory;
                RealScoreRepository realScoreRepository = (RealScoreRepository) metroFactory.appService.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.cashAppLiteGate.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.database.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.initialScreenPreludeNavigator.invoke();
                Analytics analytics = (Analytics) metroFactory.isLanguageDisclosureAcceptancePending.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.localeManager.invoke();
                ErrorReporter errorReporter = (ErrorReporter) metroFactory.sessionManager.invoke();
                realScoreRepository.getClass();
                realMoneyNavigatorHelper.getClass();
                realRouter$Factory$Impl.getClass();
                moneyAnalyticsService.getClass();
                analytics.getClass();
                androidStringManager.getClass();
                errorReporter.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realScoreRepository, realMoneyNavigatorHelper, navigator, realRouter$Factory$Impl, moneyAnalyticsService, analytics, androidStringManager, errorReporter)), coroutineScope, (LifecycleOwner) obj4);
                return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new ScoreAppletViewsModule$$ExternalSyntheticLambda1(start$default, 0));
            case 20:
                ((Integer) obj2).getClass();
                RecoveryGuideViewKt.RecoveryGuideRow((RecoveryGuideRowViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                SessionManager.DeletionMode deletionMode = (SessionManager.DeletionMode) obj5;
                DbSessionManager dbSessionManager = (DbSessionManager) obj4;
                Session session = (Session) obj2;
                ((TransactionCallbacks) obj).getClass();
                session.getClass();
                Session copy$default = Session.copy$default(session, null, null, null, null, null, false, 95);
                SessionManager.DeletionMode deletionMode2 = SessionManager.DeletionMode.WIPEOUT;
                if (deletionMode == deletionMode2) {
                    copy$default = Session.copy$default(copy$default, null, null, null, null, null, false, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                }
                Session session2 = copy$default;
                if (deletionMode == SessionManager.DeletionMode.ALL || deletionMode == deletionMode2) {
                    session2 = Session.copy$default(session2, null, null, null, null, null, false, 103);
                }
                Session copy$default2 = Session.copy$default(session2, null, null, null, null, null, false, 121);
                JobKt.launch(dbSessionManager.scope, dbSessionManager.ioContext, CoroutineStart.UNDISPATCHED, new DbSessionManager$delete$2$1(dbSessionManager, null, 0));
                return copy$default2;
            case 22:
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj5;
                SharedTransitionScope sharedTransitionScope = basicShieetScope.sharedTransitionScope;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    if (sharedTransitionScope == null) {
                        gapComposer11.startReplaceGroup(-916423150);
                    } else {
                        gapComposer11.startReplaceGroup(-916363165);
                        modifier = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, modifier, sharedTransitionScope.rememberSharedContentState(SharedElementKey.DragHandle, gapComposer11, 6), basicShieetScope.visibilityScope, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    }
                    gapComposer11.end(false);
                    Modifier then = fillMaxWidth.then(modifier);
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer11, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer11, true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                RealSheetState realSheetState = (RealSheetState) obj4;
                Set set = (Set) obj;
                set.getClass();
                ((Snapshot) obj2).getClass();
                MutableScatterSet mutableScatterSet = (MutableScatterSet) ref$ObjectRef.element;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (true) {
                                if (i8 < i7) {
                                    if ((255 & j) >= 128 || !set.contains(objArr[(i6 << 3) + i8])) {
                                        j >>= 8;
                                        i8++;
                                    } else {
                                        ref$ObjectRef.element = realSheetState.updateDragAnchors();
                                    }
                                } else if (i7 != 8) {
                                }
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                EditAutofillViewKt.BodyContent((Function1) obj5, (EditAutofillViewModel.Content) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ErrorContentKt.Address((Modifier) obj5, (AutofillData) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ErrorContentKt.MooncakeErrorContent((AutofillViewModel.Error) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                final ErrorViewModel errorViewModel = (ErrorViewModel) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                final int i9 = 1;
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    final int i10 = 0;
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Expect_jvmKt.rememberComposableLambda(2089696303, new Function3() { // from class: com.squareup.cash.shopping.settings.views.ErrorDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i11 = i10;
                            ErrorViewModel errorViewModel2 = errorViewModel;
                            switch (i11) {
                                case 0:
                                    Composer composer13 = (Composer) obj7;
                                    int intValue13 = ((Integer) obj8).intValue();
                                    ((ColumnScope) obj6).getClass();
                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                    if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer14 = (Composer) obj7;
                                    int intValue14 = ((Integer) obj8).intValue();
                                    ((ColumnScope) obj6).getClass();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.message, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12), Expect_jvmKt.rememberComposableLambda(1106702926, new Function3() { // from class: com.squareup.cash.shopping.settings.views.ErrorDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i11 = i9;
                            ErrorViewModel errorViewModel2 = errorViewModel;
                            switch (i11) {
                                case 0:
                                    Composer composer13 = (Composer) obj7;
                                    int intValue13 = ((Integer) obj8).intValue();
                                    ((ColumnScope) obj6).getClass();
                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                    if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer14 = (Composer) obj7;
                                    int intValue14 = ((Integer) obj8).intValue();
                                    ((ColumnScope) obj6).getClass();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, errorViewModel2.message, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12), Expect_jvmKt.rememberComposableLambda(119439098, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(14, function18), gapComposer12), (Function3) null, (Function3) null, gapComposer12, 3504, 48);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Function1 function19 = (Function1) obj5;
                ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel = (ShoppingSettingsAutofillViewModel) obj4;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                boolean shouldExecute2 = gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2);
                Applier applier2 = gapComposer13.applier;
                if (shouldExecute2) {
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer13).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer13, 0);
                    int hashCode6 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer13, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer13.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer13, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer13, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    String stringResource = Room.stringResource(gapComposer13, R.string.shopping_settings_autofill_title);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed5 = gapComposer13.changed(function19);
                    Object rememberedValue6 = gapComposer13.rememberedValue();
                    Object obj6 = rememberedValue6;
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        ScoreHomeKt$$ExternalSyntheticLambda0 scoreHomeKt$$ExternalSyntheticLambda0 = new ScoreHomeKt$$ExternalSyntheticLambda0(25, function19);
                        gapComposer13.updateRememberedValue(scoreHomeKt$$ExternalSyntheticLambda0);
                        obj6 = scoreHomeKt$$ExternalSyntheticLambda0;
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj6, (Modifier) null, (Function3) null, gapComposer13, 48, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer13), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer13, 0);
                    int hashCode7 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer13, verticalScroll$default);
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer13, composeUiNode$Companion$SetModifier$17, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer13, materializeModifier7, composeUiNode$Companion$SetModifier$18);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer13, null);
                    String stringResource2 = Room.stringResource(gapComposer13, R.string.shopping_settings_autofill_description);
                    TextStyle textStyle = Strings.getTypography(gapComposer13).bodyMedium;
                    long j2 = Strings.getColors(gapComposer13).semantic.text.subtle;
                    Strings.getSizes(gapComposer13).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer13, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer13, null);
                    boolean z = shoppingSettingsAutofillViewModel.autofillEnabled;
                    ShoppingSettingsAutofillViewModel.AddressViewModel addressViewModel = shoppingSettingsAutofillViewModel.addressViewModel;
                    CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(z);
                    ComposableLambdaImpl composableLambdaImpl2 = ErrorDialogKt.lambda$1464963287;
                    boolean changed6 = gapComposer13.changed(function19);
                    Object rememberedValue7 = gapComposer13.rememberedValue();
                    if (!changed6) {
                        obj3 = rememberedValue7;
                        break;
                    }
                    ScoreHomeKt$$ExternalSyntheticLambda0 scoreHomeKt$$ExternalSyntheticLambda02 = new ScoreHomeKt$$ExternalSyntheticLambda0(26, function19);
                    gapComposer13.updateRememberedValue(scoreHomeKt$$ExternalSyntheticLambda02);
                    obj3 = scoreHomeKt$$ExternalSyntheticLambda02;
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl2, null, (Function0) obj3, false, true, null, null, 0L, toggle, null, gapComposer13, 196614, 1498);
                    if (addressViewModel instanceof ShoppingSettingsAutofillViewModel.AddressViewModel.Loading) {
                        gapComposer13.startReplaceGroup(-1343015883);
                        r11 = 0;
                        ErrorDialogKt.AddressLoading(null, gapComposer13, 0);
                        gapComposer13.end(false);
                    } else {
                        r11 = 0;
                        r11 = 0;
                        r11 = 0;
                        if (addressViewModel instanceof ShoppingSettingsAutofillViewModel.AddressViewModel.Error) {
                            gapComposer13.startReplaceGroup(-1343014630);
                            ErrorDialogKt.AddressLoadingError(null, gapComposer13, 0);
                            gapComposer13.end(false);
                        } else if (addressViewModel instanceof ShoppingSettingsAutofillViewModel.AddressViewModel.Incomplete) {
                            gapComposer13.startReplaceGroup(1316267451);
                            gapComposer13.end(false);
                        } else {
                            if (!(addressViewModel instanceof ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer13, -1343017308, false);
                            }
                            gapComposer13.startReplaceGroup(-1343010653);
                            ErrorDialogKt.Address((ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded) addressViewModel, shoppingSettingsAutofillViewModel.autofillEnabled, function19, gapComposer13, 0);
                            gapComposer13.end(false);
                        }
                    }
                    gapComposer13.end(true);
                    if (addressViewModel instanceof ShoppingSettingsAutofillViewModel.AddressViewModel.Incomplete) {
                        gapComposer13.startReplaceGroup(1198520565);
                        ErrorDialogKt.AddNewAddress(r11, gapComposer13, null, function19);
                        gapComposer13.end(r11);
                    } else {
                        gapComposer13.startReplaceGroup(1198568615);
                        gapComposer13.end(r11);
                    }
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Function1 function110 = (Function1) obj5;
                ShoppingSettingsViewModel shoppingSettingsViewModel = (ShoppingSettingsViewModel) obj4;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer14, 0);
                    int hashCode8 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer14, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    String stringResource3 = Room.stringResource(gapComposer14, R.string.shopping_settings_title);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed7 = gapComposer14.changed(function110);
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new ScoreHomeKt$$ExternalSyntheticLambda0(28, function110);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub(stringResource3, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer14, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer14, null);
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer14, R.string.shopping_settings_saved_addresses_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer14, R.string.shopping_settings_saved_addresses_body), gapComposer14, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer14, null);
                    if (shoppingSettingsViewModel.autofillEnabled) {
                        i2 = -1839192343;
                        i3 = R.string.shopping_settings_autofill_on;
                    } else {
                        i2 = -1839110968;
                        i3 = R.string.shopping_settings_autofill_off;
                    }
                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(re$$ExternalSyntheticOutline0.m(gapComposer14, i2, i3, gapComposer14, false), 2);
                    ComposableLambdaImpl composableLambdaImpl3 = ErrorDialogKt.lambda$1211239551;
                    ComposableLambdaImpl composableLambdaImpl4 = ErrorDialogKt.lambda$868355742;
                    boolean changed8 = gapComposer14.changed(function110);
                    Object rememberedValue9 = gapComposer14.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new ScoreHomeKt$$ExternalSyntheticLambda0(29, function110);
                        gapComposer14.updateRememberedValue(rememberedValue9);
                    }
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl3, composableLambdaImpl4, null, (Function0) rememberedValue9, false, true, null, null, label, 0L, gapComposer14, 1572918, 3508);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(CameraXPreviewState cameraXPreviewState, Function1 function1) {
        this.$r8$classId = 3;
        this.f$0 = cameraXPreviewState;
        this.f$1 = function1;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(ArrayList arrayList, Function1 function1) {
        this.$r8$classId = 5;
        this.f$0 = arrayList;
        this.f$1 = function1;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(Function1 function1, ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel) {
        this.$r8$classId = 28;
        this.f$0 = function1;
        this.f$1 = shoppingSettingsAutofillViewModel;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda0(Function1 function1, ShoppingSettingsViewModel shoppingSettingsViewModel) {
        this.$r8$classId = 29;
        this.f$0 = function1;
        this.f$1 = shoppingSettingsViewModel;
    }
}
