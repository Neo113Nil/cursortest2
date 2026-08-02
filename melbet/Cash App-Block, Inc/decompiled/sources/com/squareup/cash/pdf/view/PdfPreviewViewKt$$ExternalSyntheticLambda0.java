package com.squareup.cash.pdf.view;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ExpressivePaymentDetailsModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.SelectRecipientKt$SearchTextField$1$1;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.SharedElementKey;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pdf.view.PdfPreviewViewModel;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingViewModel;
import com.squareup.cash.phoneplans.applets.presenters.PhonePlansAppletTilePresenter$Factory$Impl;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.viewmodels.PoolOwnerInformation;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda47;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView;
import com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda9;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.recipients.components.RegionFlagOverlayKt$WhenMappings;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.support.chat.views.input.InputTextFieldKt$InputTextField$1;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdfPreviewViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda0(PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel, Function1 function1) {
        this.$r8$classId = 29;
        this.f$2 = function1;
        this.f$1 = prepurchaseCashCardPlanningViewModel;
    }

    private final Object invoke$com$squareup$cash$phoneplans$PhonePlansHomeViewKt$$ExternalSyntheticLambda17(Object obj, Object obj2) {
        PhonePlansHomeViewModel.Content.Header.Inactive inactive = (PhonePlansHomeViewModel.Content.Header.Inactive) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inactive.body, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 110.0f));
            String str = inactive.ctaText;
            if (str == null) {
                gapComposer.startReplaceGroup(646809814);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(646809815);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(9, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, m302paddingqDBjuR0$default, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-102324949, new SheetKt$$ExternalSyntheticLambda8(str, 16), gapComposer), gapComposer, 1573248, 56);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$phoneplans$PhonePlansHomeViewKt$$ExternalSyntheticLambda20(Object obj, Object obj2) {
        PhonePlansHomeViewModel.Content.Header.Active active = (PhonePlansHomeViewModel.Content.Header.Active) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 134.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = active.ctaText;
            PhonePlansHomeViewModel.Content.Header.CtaStyle ctaStyle = active.ctaStyle;
            if (str == null || ctaStyle == null) {
                gapComposer.startReplaceGroup(366243210);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(365787386);
                int ordinal = ctaStyle.ordinal();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(365832677);
                    String str2 = "[" + str + "]()";
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 8);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue, null, textStyle, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2036);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1096579064, false);
                    }
                    gapComposer.startReplaceGroup(366079685);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(10, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(404720164, new SheetKt$$ExternalSyntheticLambda8(str, 17), gapComposer), gapComposer, 1573248, 58);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$phoneplans$PhonePlansNewLineLoadingViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        PhonePlansNewLineLoadingViewModel phonePlansNewLineLoadingViewModel = (PhonePlansNewLineLoadingViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
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
            GapComposer gapComposer2 = gapComposer;
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer2, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Countries.PageHeader(phonePlansNewLineLoadingViewModel.title, (Modifier) null, PhonePlansHomeViewKt.lambda$936120873, phonePlansNewLineLoadingViewModel.body, gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            if (phonePlansNewLineLoadingViewModel.isCloseable) {
                gapComposer2.startReplaceGroup(-669875981);
                SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(386102103, new PdfPreviewViewKt$$ExternalSyntheticLambda4(8, function1), gapComposer2), gapComposer2, 24576, 15);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-669634770);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$applets$views$PoolsAppletViewsModule$Companion$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        PoolsAppletTilePresenter$Factory$Impl poolsAppletTilePresenter$Factory$Impl = (PoolsAppletTilePresenter$Factory$Impl) this.f$1;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$2;
        Navigator navigator = (Navigator) obj;
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        navigator.getClass();
        coroutineScope.getClass();
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = poolsAppletTilePresenter$Factory$Impl.delegateFactory;
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) realFamilyNavigator$MetroFactory.analytics.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        RealPoolsRepository realPoolsRepository = (RealPoolsRepository) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) realFamilyNavigator$MetroFactory.stringManager.invoke();
        factory.getClass();
        androidStringManager.getClass();
        realPoolsRepository.getClass();
        moneyAnalyticsService.getClass();
        Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(factory, androidStringManager, realPoolsRepository, moneyAnalyticsService, navigator)), coroutineScope, lifecycleOwner);
        return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 16), (byte) 0, false);
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolDescriptiveInputKt$PoolDescriptiveInput$1$2$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((InputTextFieldKt$InputTextField$1) this.f$1).Decoration((ComposableLambdaImpl) this.f$2, (Composer) obj, Updater.updateChangedFlags(7));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolDetailsViewKt$$ExternalSyntheticLambda30(Object obj, Object obj2) {
        MutableState mutableState = (MutableState) this.f$1;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$2;
        Integer num = (Integer) obj;
        num.getClass();
        int intValue = ((Integer) obj2).intValue();
        if (((Integer) mutableState.getValue()) == null) {
            mutableState.setValue(num);
        }
        parcelableSnapshotMutableIntState.setIntValue(intValue);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolListSectionKt$$ExternalSyntheticLambda5(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        PoolToastKt.NuxInfo((Modifier) this.f$1, (PoolListNuxAssets) this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolMemberListViewKt$$ExternalSyntheticLambda14(Object obj, Object obj2) {
        long j;
        AvatarImage.Remote.Image image;
        PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) this.f$1;
        String str = (String) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            AvatarSize avatarSize = AvatarSize.Size48;
            PoolOwnerInformation poolOwnerInformation = poolMemberListViewModel.poolOwner;
            String str2 = poolOwnerInformation.monogram;
            Color m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -114897621, poolOwnerInformation.accentColor, gapComposer, false);
            if (m == null) {
                gapComposer.startReplaceGroup(-114895289);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-114898451);
                gapComposer.end(false);
                j = m.value;
            }
            long j2 = j;
            if (poolMemberListViewModel.poolOwner.photoImage != null) {
                str.getClass();
                image = new AvatarImage.Remote.Image(str, false, null, 0L, new PoolDetailsViewKt$$ExternalSyntheticLambda47(11), 62);
            } else {
                image = null;
            }
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j2, "", (Modifier) null, (AvatarImage) image, (Function2) null, (AvatarOverlay) new AvatarOverlay.LocalIcon(6, 0L, 0L, Icons.AvatarFill24), false, 0L, (Composer) gapComposer, 3078, 0, 1872);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolMoreOptionsBottomSheetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$2;
        PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel = (PoolMoreOptionsBottomSheetViewModel) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1120713569, new ProfileKt$$ExternalSyntheticLambda1(22, (Object) poolMoreOptionsBottomSheetViewModel, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$portfolio$graphs$views$InvestingPortfolioAmountView$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        InvestingPortfolioAmountView investingPortfolioAmountView = (InvestingPortfolioAmountView) this.f$1;
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = (InvestingHomePortfolioHeaderContentModel) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = InvestingPortfolioAmountView.$r8$clinit;
        byte b = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(ThemeHelpersKt.themeInfo(investingPortfolioAmountView).arcadeColors, null, null, Expect_jvmKt.rememberComposableLambda(-1251916693, new InvestingPortfolioAmountView$$ExternalSyntheticLambda9(investingHomePortfolioHeaderContentModel, b, b), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$portfolio$graphs$views$NewInvestingStockDetailsHeaderViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        InvestingGraphTabsViewKt.NewInvestingStockDetailsHeaderView((InvestingStockDetailsHeaderViewModel) this.f$1, (Modifier) this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.animation.SharedTransitionScope] */
    /* JADX WARN: Type inference failed for: r20v6, types: [com.squareup.cash.arcade.components.avatar.AvatarImage$Remote$Image] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String m;
        Color m2;
        long j;
        AvatarOverlay avatarOverlay;
        AvatarOverlay localResource;
        long j2;
        String m3;
        Color m4;
        long j3;
        long j4;
        String m5;
        NavigationType navigationType;
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 8;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                PdfPreviewViewModel pdfPreviewViewModel = (PdfPreviewViewModel) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m6);
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
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1155046045, new PdfPreviewViewKt$$ExternalSyntheticLambda2(pdfPreviewViewModel, 0), gapComposer);
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(4, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(197699752, new PdfPreviewViewKt$$ExternalSyntheticLambda4(0, function1), gapComposer), gapComposer, 1572918, 44);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.LoadableFullScreenContent(pdfPreviewViewModel, pdfPreviewViewModel instanceof PdfPreviewViewModel.Loading, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, PdfPreviewViewKt.f563lambda$314136325, gapComposer, 196608, 24);
                    gapComposer.end(true);
                    PdfPreviewViewModel.Ready ready = pdfPreviewViewModel instanceof PdfPreviewViewModel.Ready ? (PdfPreviewViewModel.Ready) pdfPreviewViewModel : null;
                    String str = ready != null ? ready.toast : null;
                    if (str == null) {
                        gapComposer.startReplaceGroup(232908054);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(232908055);
                        Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(5, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        ModalKt.m3381ToastBAHpl2s(m302paddingqDBjuR0$default, str, str, null, null, (Function0) rememberedValue2, null, gapComposer, 0, 440);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RecipientViewModel recipientViewModel = (RecipientViewModel) obj3;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Character ch = recipientViewModel.monogram;
                    Recipient recipient = recipientViewModel.recipient;
                    String valueOf2 = ch != null ? String.valueOf(ch.charValue()) : null;
                    String str2 = valueOf2 != null ? valueOf2 : "";
                    Image image = recipient.photo;
                    if (image == null) {
                        gapComposer2.startReplaceGroup(717383240);
                        gapComposer2.end(false);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1916521255, image, gapComposer2, false);
                    }
                    AvatarImage.LocalIcon image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, i3), 62) : null;
                    boolean z = recipient.invoice instanceof Recipient.CryptoRecipientPayment.Stablecoin;
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(717622964);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(717690792);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
                        boolean changed3 = gapComposer2.changed(function12) | gapComposer2.changedInstance(recipientViewModel);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new RecipientListViewKt$$ExternalSyntheticLambda10(function12, recipientViewModel, 3);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        modifier = ImageKt.m182clickableO2vRcR0$default(modifier, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue4, 28);
                        gapComposer2.end(false);
                    }
                    Modifier modifier2 = modifier;
                    AvatarSize avatarSize = AvatarSize.Size48;
                    com.squareup.protos.cash.ui.Color color = recipientViewModel.accentColor;
                    if (color == null) {
                        gapComposer2.startReplaceGroup(717990251);
                        gapComposer2.end(false);
                        m2 = null;
                    } else {
                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1916501674, color, gapComposer2, false);
                    }
                    if (m2 == null) {
                        gapComposer2.startReplaceGroup(-1916499982);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.semantic.background.subtle;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1916502338);
                        gapComposer2.end(false);
                        j = m2.value;
                    }
                    long j5 = j;
                    if (str2.length() == 0 && image2 == null) {
                        image2 = new AvatarImage.LocalIcon(Icons.Avatar24, 0L, 6);
                    }
                    AvatarImage.LocalIcon localIcon = image2;
                    Icons badgeIcon = TypefaceCompatUtil.badgeIcon(recipient, recipient.blockState == BlockState.BLOCKED);
                    if (badgeIcon != null) {
                        localResource = new AvatarOverlay.LocalIcon(6, 0L, 0L, badgeIcon);
                    } else {
                        Region region = recipient.region;
                        if (region == null || RegionFlagOverlayKt$WhenMappings.$EnumSwitchMapping$0[region.ordinal()] != 1) {
                            avatarOverlay = null;
                            TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j5, (String) null, modifier2, (AvatarImage) localIcon, (Function2) null, avatarOverlay, false, 0L, (Composer) gapComposer2, 3078, 0, 1856);
                        } else {
                            long j6 = Color.Unspecified;
                            localResource = new AvatarOverlay.LocalResource(R.drawable.flag_mexico, j6, j6, false);
                        }
                    }
                    avatarOverlay = localResource;
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j5, (String) null, modifier2, (AvatarImage) localIcon, (Function2) null, avatarOverlay, false, 0L, (Composer) gapComposer2, 3078, 0, 1856);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((SelectRecipientKt$SearchTextField$1$1) obj3).Decoration((ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ErrorKt.WithdrawalOptionRow((StablecoinWithdrawalOptionRow) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                CoreFlowBasicShieetScope coreFlowBasicShieetScope = (CoreFlowBasicShieetScope) obj3;
                ?? r0 = coreFlowBasicShieetScope.sharedTransitionScope;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier3, 1.0f);
                    if (r0 == null) {
                        gapComposer3.startReplaceGroup(-1033407973);
                    } else {
                        gapComposer3.startReplaceGroup(-1033347988);
                        modifier3 = SharedTransitionScope.sharedBounds$default(r0, modifier3, r0.rememberSharedContentState(SharedElementKey.DragHandle, gapComposer3, 6), coreFlowBasicShieetScope.visibilityScope, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    }
                    gapComposer3.end(false);
                    Modifier then = fillMaxWidth2.then(modifier3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl2, gapComposer3, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj4;
                Set set = (Set) obj;
                set.getClass();
                ((Snapshot) obj2).getClass();
                MutableScatterSet mutableScatterSet = (MutableScatterSet) ref$ObjectRef.element;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j7 = jArr[i4];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            int i6 = 0;
                            while (true) {
                                if (i6 < i5) {
                                    if ((255 & j7) >= 128 || !set.contains(objArr[(i4 << 3) + i6])) {
                                        j7 >>= 8;
                                        i6++;
                                    } else {
                                        ref$ObjectRef.element = coreFlowRealSheetState.updateDragAnchors();
                                    }
                                } else if (i5 != 8) {
                                }
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj3;
                State state = (State) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                } else if (nearbyPayRequestViewModel instanceof NearbyPayRequestViewModel.Ready) {
                    gapComposer4.startReplaceGroup(755563957);
                    NearbyPayRequestViewModel.Ready ready2 = (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel;
                    NearbyAvatarInfo nearbyAvatarInfo = ready2.currentUserAvatar;
                    if (ready2.selectedTab != NearbyPayRequestTab.GET_PAID || nearbyAvatarInfo == null || ((Number) state.getValue()).floatValue() <= 0.01f) {
                        gapComposer4.startReplaceGroup(756825316);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(755791280);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, fillMaxSize2);
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
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
                        float floatValue = ((Number) state.getValue()).floatValue();
                        Modifier scale = ScaleKt.scale(m285size3ABfNKs, floatValue, floatValue);
                        AvatarSize avatarSize2 = AvatarSize.Size64;
                        Character ch2 = nearbyAvatarInfo.monogram;
                        String valueOf3 = ch2 != null ? String.valueOf(ch2.charValue()) : null;
                        String str3 = valueOf3 == null ? "" : valueOf3;
                        Color forTheme = ThemablesKt.forTheme(nearbyAvatarInfo.accentColor, gapComposer4);
                        if (forTheme == null) {
                            gapComposer4.startReplaceGroup(-416260440);
                            Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                            } else {
                                gapComposer4.startReplaceGroup(-1762997739);
                                gapComposer4.end(false);
                            }
                            j2 = colors3.semantic.background.subtle;
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-416263416);
                            gapComposer4.end(false);
                            j2 = forTheme.value;
                        }
                        long j8 = j2;
                        Image image3 = nearbyAvatarInfo.image;
                        if (image3 == null) {
                            gapComposer4.startReplaceGroup(-19094158);
                            gapComposer4.end(false);
                            m3 = null;
                        } else {
                            m3 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer4, -416257937, image3, gapComposer4, false);
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize2, str3, j8, (String) null, scale, (AvatarImage) (m3 != null ? new AvatarImage.Remote.Image(m3, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m3, i2), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 3078, 0, 1984);
                        gapComposer4.end(true);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(756839204);
                    gapComposer4.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayersSheetContent((NearbyPayersSheetViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj3;
                AvatarImage.Remote.Image image4 = (AvatarImage.Remote.Image) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer5, 48);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    AvatarSize avatarSize3 = AvatarSize.Size48;
                    RecipientViewModel recipientViewModel2 = nearbyPaymentKeypadViewModel.recipient;
                    Character ch3 = recipientViewModel2.monogram;
                    String valueOf4 = ch3 != null ? String.valueOf(ch3.charValue()) : null;
                    String str4 = valueOf4 == null ? "" : valueOf4;
                    com.squareup.protos.cash.ui.Color color2 = recipientViewModel2.accentColor;
                    if (color2 == null) {
                        gapComposer5.startReplaceGroup(-560120368);
                        gapComposer5.end(false);
                        m4 = null;
                    } else {
                        m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, -18068399, color2, gapComposer5, false);
                    }
                    if (m4 == null) {
                        gapComposer5.startReplaceGroup(-18066067);
                        Colors colors4 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j3 = colors4.semantic.background.subtle;
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-18069229);
                        gapComposer5.end(false);
                        j3 = m4.value;
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize3, str4, j3, (String) null, (Modifier) null, (AvatarImage) image4, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer5, 3078, 0, 2000);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer5, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, recipientViewModel2.title, (Map) null, (Function1) null, false);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function0 function0 = (Function0) obj3;
                NearbyPerson nearbyPerson = (NearbyPerson) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, function0, 15);
                    AvatarSize avatarSize4 = AvatarSize.Size48;
                    NearbyAvatarInfo nearbyAvatarInfo2 = nearbyPerson.avatar;
                    Character ch4 = nearbyAvatarInfo2.monogram;
                    String valueOf5 = ch4 != null ? String.valueOf(ch4.charValue()) : null;
                    String str5 = valueOf5 == null ? "" : valueOf5;
                    Color forTheme2 = ThemablesKt.forTheme(nearbyAvatarInfo2.accentColor, gapComposer6);
                    if (forTheme2 == null) {
                        gapComposer6.startReplaceGroup(602672109);
                        Colors colors5 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        j4 = colors5.semantic.background.subtle;
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(602669660);
                        gapComposer6.end(false);
                        j4 = forTheme2.value;
                    }
                    long j9 = j4;
                    Image image5 = nearbyAvatarInfo2.image;
                    if (image5 == null) {
                        gapComposer6.startReplaceGroup(1503026925);
                        gapComposer6.end(false);
                        m5 = null;
                    } else {
                        m5 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer6, 602674068, image5, gapComposer6, false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize4, str5, j9, (String) null, m183clickableoSLSa3U$default, (AvatarImage) (m5 != null ? new AvatarImage.Remote.Image(m5, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m5, 11), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer6, 3078, 0, 1984);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AlphaKt.ExpressiveDetailsRow((ExpressivePaymentDetailsModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj3;
                Function1 function13 = (Function1) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (!gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gapComposer7.skipToGroupEnd();
                } else if (personalizePaymentRecipientViewModel instanceof PersonalizePaymentRecipientViewModel.Loaded) {
                    gapComposer7.startReplaceGroup(-390099322);
                    AlphaKt.PersonalizePaymentRecipient((PersonalizePaymentRecipientViewModel.Loaded) personalizePaymentRecipientViewModel, function13, gapComposer7, 0);
                    gapComposer7.end(false);
                } else {
                    if (!(personalizePaymentRecipientViewModel instanceof PersonalizePaymentRecipientViewModel.Loading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -390099715, false);
                    }
                    gapComposer7.startReplaceGroup(791949636);
                    PersonalizePaymentRecipientViewModel.Loading loading = (PersonalizePaymentRecipientViewModel.Loading) personalizePaymentRecipientViewModel;
                    PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel = loading.toolbar;
                    PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel2 = new PersonalizePaymentToolbarViewModel(personalizePaymentToolbarViewModel.recipients, personalizePaymentToolbarViewModel.sendButtonConfiguration, personalizePaymentToolbarViewModel.isSender, false);
                    ConfirmRetryResourceDialog confirmRetryResourceDialog = loading.dialogModel;
                    boolean z2 = loading.showExpressivePaymentsUi;
                    boolean changed4 = gapComposer7.changed(function13);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ActionMenuKt$$ExternalSyntheticLambda0(21, function13);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    boolean changed5 = gapComposer7.changed(function13);
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ActionMenuKt$$ExternalSyntheticLambda0(22, function13);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function03 = (Function0) rememberedValue6;
                    boolean changed6 = gapComposer7.changed(function13);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ActionMenuKt$$ExternalSyntheticLambda0(23, function13);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    AlphaKt.LoadingPersonalizePaymentView(function02, function03, (Function0) rememberedValue7, null, z2, personalizePaymentToolbarViewModel2, confirmRetryResourceDialog, gapComposer7, 0);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj3;
                Function1 function14 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    gapComposer8.skipToGroupEnd();
                } else if (personalizePaymentViewModel instanceof PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) {
                    gapComposer8.startReplaceGroup(454103484);
                    AlphaKt.PersonalizePayment((PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) personalizePaymentViewModel, function14, gapComposer8, 0);
                    gapComposer8.end(false);
                } else {
                    if (!(personalizePaymentViewModel instanceof PersonalizePaymentViewModel.LoadingPersonalizePaymentMenu)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, 454102385, false);
                    }
                    gapComposer8.startReplaceGroup(1192424662);
                    PersonalizePaymentViewModel.LoadingPersonalizePaymentMenu loadingPersonalizePaymentMenu = (PersonalizePaymentViewModel.LoadingPersonalizePaymentMenu) personalizePaymentViewModel;
                    PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel3 = loadingPersonalizePaymentMenu.toolbar;
                    PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel4 = new PersonalizePaymentToolbarViewModel(personalizePaymentToolbarViewModel3.recipients, personalizePaymentToolbarViewModel3.sendButtonConfiguration, personalizePaymentToolbarViewModel3.isSender, false);
                    ConfirmRetryResourceDialog confirmRetryResourceDialog2 = loadingPersonalizePaymentMenu.dialogModel;
                    boolean z3 = loadingPersonalizePaymentMenu.showExpressivePaymentsUi;
                    boolean changed7 = gapComposer8.changed(function14);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new PdfPreviewView$$ExternalSyntheticLambda0(1, function14);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function04 = (Function0) rememberedValue8;
                    boolean changed8 = gapComposer8.changed(function14);
                    Object rememberedValue9 = gapComposer8.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new PdfPreviewView$$ExternalSyntheticLambda0(2, function14);
                        gapComposer8.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function05 = (Function0) rememberedValue9;
                    boolean changed9 = gapComposer8.changed(function14);
                    Object rememberedValue10 = gapComposer8.rememberedValue();
                    if (changed9 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new PdfPreviewView$$ExternalSyntheticLambda0(3, function14);
                        gapComposer8.updateRememberedValue(rememberedValue10);
                    }
                    AlphaKt.LoadingPersonalizePaymentView(function04, function05, (Function0) rememberedValue10, null, z3, personalizePaymentToolbarViewModel4, confirmRetryResourceDialog2, gapComposer8, 0);
                    gapComposer8.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePayment((PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                Element element = (Element) obj3;
                Function1 function15 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AlphaKt.UiElement((Modifier) null, element, function15, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel = (PhonePlansEsimCheckViewModel) obj3;
                Function1 function16 = (Function1) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors6 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    int ordinal = phonePlansEsimCheckViewModel.toolbarButton.ordinal();
                    if (ordinal == 0) {
                        navigationType = NavigationType.NONE;
                    } else if (ordinal == 1) {
                        navigationType = NavigationType.BACK;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.CLOSE;
                    }
                    NavigationType navigationType3 = navigationType;
                    boolean changed10 = gapComposer10.changed(function16);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed10 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new PdfPreviewView$$ExternalSyntheticLambda0(8, function16);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function06 = (Function0) rememberedValue11;
                    PhonePlansEsimCheckViewModel.Cta cta = phonePlansEsimCheckViewModel.helpCta;
                    if (cta == null) {
                        gapComposer10.startReplaceGroup(909604873);
                        gapComposer10.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer10.startReplaceGroup(909604874);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1005214984, new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda3(function16, cta, r14 ? 1 : 0), gapComposer10);
                        gapComposer10.end(false);
                        composableLambdaImpl = rememberComposableLambda2;
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, function06, (Modifier) null, composableLambdaImpl, gapComposer10, 6, 44);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    Countries.PageHeader(phonePlansEsimCheckViewModel.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-403752305, new PdfPreviewViewKt$$ExternalSyntheticLambda2(phonePlansEsimCheckViewModel, i2), gapComposer10), phonePlansEsimCheckViewModel.body, gapComposer10, MLKEMEngine.KyberPolyBytes, 2);
                    if (phonePlansEsimCheckViewModel.primaryCta == null && phonePlansEsimCheckViewModel.secondaryCta == null) {
                        gapComposer10.startReplaceGroup(911357118);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(910847788);
                        SpacerKt.Spacer(gapComposer10, new LayoutWeightElement(1.0f, true));
                        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(739468065, new ProfileKt$$ExternalSyntheticLambda1(16, (Object) phonePlansEsimCheckViewModel, (Object) function16), gapComposer10), gapComposer10, 24576, 15);
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return invoke$com$squareup$cash$phoneplans$PhonePlansHomeViewKt$$ExternalSyntheticLambda17(obj, obj2);
            case 17:
                return invoke$com$squareup$cash$phoneplans$PhonePlansHomeViewKt$$ExternalSyntheticLambda20(obj, obj2);
            case 18:
                return invoke$com$squareup$cash$phoneplans$PhonePlansNewLineLoadingViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 19:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                RealBrandFollowPresenter.MetroFactory metroFactory = ((PhonePlansAppletTilePresenter$Factory$Impl) obj3).delegateFactory;
                RealPhonePlansAppletTileAvailabilityManager realPhonePlansAppletTileAvailabilityManager = (RealPhonePlansAppletTileAvailabilityManager) metroFactory.syncer.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.store.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.service.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory.repository.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.analytics.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) metroFactory.responseContextHandlerFactory.invoke();
                realPhonePlansAppletTileAvailabilityManager.getClass();
                moneyAnalyticsService.getClass();
                realMoneyNavigatorHelper.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                realRouter$Factory$Impl.getClass();
                syncValueReader.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realPhonePlansAppletTileAvailabilityManager, moneyAnalyticsService, realMoneyNavigatorHelper, promotedAppletTilePresenter$Factory$Impl, realRouter$Factory$Impl, syncValueReader, navigator)), coroutineScope, (LifecycleOwner) obj4);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new ScoreAppletViewsModule$$ExternalSyntheticLambda1(start$default, 2));
            case 20:
                return invoke$com$squareup$cash$pools$applets$views$PoolsAppletViewsModule$Companion$$ExternalSyntheticLambda0(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                PoolToastKt.StartPoolSubmit((StartPoolViewModel.Submit) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$pools$views$PoolDescriptiveInputKt$PoolDescriptiveInput$1$2$$ExternalSyntheticLambda0(obj, obj2);
            case 23:
                return invoke$com$squareup$cash$pools$views$PoolDetailsViewKt$$ExternalSyntheticLambda30(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$pools$views$PoolListSectionKt$$ExternalSyntheticLambda5(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$pools$views$PoolMemberListViewKt$$ExternalSyntheticLambda14(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$pools$views$PoolMoreOptionsBottomSheetViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$portfolio$graphs$views$InvestingPortfolioAmountView$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$portfolio$graphs$views$NewInvestingStockDetailsHeaderViewKt$$ExternalSyntheticLambda1(obj, obj2);
            default:
                Function1 function17 = (Function1) obj4;
                PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel = (PrepurchaseCashCardPlanningViewModel) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean changed11 = gapComposer11.changed(function17);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed11 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new ErrorViewKt$$ExternalSyntheticLambda4(1, function17);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    SheetKt.Sheet((Function0) rememberedValue12, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1214402717, new ProfileKt$$ExternalSyntheticLambda1(prepurchaseCashCardPlanningViewModel, function17), gapComposer11), gapComposer11, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda0(PdfPreviewViewModel pdfPreviewViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$1 = pdfPreviewViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda0(Function1 function1, PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel) {
        this.$r8$classId = 26;
        this.f$2 = function1;
        this.f$1 = poolMoreOptionsBottomSheetViewModel;
    }
}
