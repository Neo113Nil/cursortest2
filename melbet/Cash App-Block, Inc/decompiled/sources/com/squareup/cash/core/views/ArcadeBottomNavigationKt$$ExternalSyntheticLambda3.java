package com.squareup.cash.core.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.biometric.KeyguardUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
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
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.datatransport.cct.StringMerger;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanv;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.view.error.PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda2;
import com.squareup.cash.deposits.physical.view.error.PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Benefit;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt;
import com.squareup.cash.earnings.applets.presenters.EarnerAppletTilePresenter$Factory$Impl;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.earningstracker.applets.presenters.EarningsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.earningstracker.applets.views.EarningsAppletTile;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.data.FormattedTimestamp;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.presenters.AllowanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.presenters.ApprovedContactsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Icon;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.StringsKt;
import com.squareup.workflow1.Snapshots;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeBottomNavigationKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$earningstracker$views$EarningsTimeframeSelectorSheetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$0;
        EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel = (EarningsTimeframeSelectorSheetViewModel) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(282717255, new ArcadeModal2Kt$$ExternalSyntheticLambda0(6, earningsTimeframeSelectorSheetViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$family$applets$data$RealFamilyAppletTileRepository$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        RealFamilyAppletTileRepository realFamilyAppletTileRepository = (RealFamilyAppletTileRepository) this.f$0;
        FamilyAppletConfig.Sponsor sponsor = (FamilyAppletConfig.Sponsor) this.f$1;
        FormattedTimestamp formattedTimestamp = (FormattedTimestamp) obj;
        List list = (List) obj2;
        formattedTimestamp.getClass();
        list.getClass();
        if (!(formattedTimestamp instanceof FormattedTimestamp.Loaded)) {
            if (formattedTimestamp.equals(FormattedTimestamp.Error.INSTANCE)) {
                String str = sponsor.dependentNames;
                return new FamilyAppletTileViewModel.InstalledWithActivity(sponsor.title, list, str, new FamilyAppletTileViewModel.ActivityType.DependentNames(str));
            }
            if (formattedTimestamp.equals(FormattedTimestamp.Loading.INSTANCE)) {
                return new FamilyAppletTileViewModel.InstalledWithoutActivity(sponsor.title, list);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str2 = ((FormattedTimestamp.Loaded) formattedTimestamp).formattedTimestamp;
        AndroidStringManager androidStringManager = realFamilyAppletTileRepository.stringManager;
        if (str2 == null) {
            return new FamilyAppletTileViewModel.InstalledWithActivity(sponsor.title, list, androidStringManager.get(R.string.family_applet_no_activity), FamilyAppletTileViewModel.ActivityType.NoActivity.INSTANCE);
        }
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.family_applet_last_active)).format(new Object[]{str2});
        format2.getClass();
        return new FamilyAppletTileViewModel.InstalledWithActivity(sponsor.title, list, format2, new FamilyAppletTileViewModel.ActivityType.LastActive(str2));
    }

    private final Object invoke$com$squareup$cash$family$applets$inject$FamilyAppletsViewsModule$Companion$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        AllowanceAppletTilePresenter$Factory$Impl allowanceAppletTilePresenter$Factory$Impl = (AllowanceAppletTilePresenter$Factory$Impl) this.f$0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$1;
        Navigator navigator = (Navigator) obj;
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        navigator.getClass();
        coroutineScope.getClass();
        RealActivitiesManager.MetroFactory metroFactory = allowanceAppletTilePresenter$Factory$Impl.delegateFactory;
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.ioDispatcher.invoke();
        RealAllowanceAppletTileRepository realAllowanceAppletTileRepository = (RealAllowanceAppletTileRepository) metroFactory.badger2.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.errorReporter.invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.appService.invoke();
        RealRecurringPaymentsManager realRecurringPaymentsManager = (RealRecurringPaymentsManager) metroFactory.defaultGetRequestHandlerFactory.invoke();
        CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory.formattingPageRequestHandlerFactory.value;
        realRouter$Factory$Impl.getClass();
        realAllowanceAppletTileRepository.getClass();
        androidStringManager.getClass();
        factory.getClass();
        realRecurringPaymentsManager.getClass();
        coroutineScope2.getClass();
        Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(realRouter$Factory$Impl, realAllowanceAppletTileRepository, androidStringManager, factory, realRecurringPaymentsManager, coroutineScope2, navigator)), coroutineScope, lifecycleOwner);
        return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new ScoreAppletViewsModule$$ExternalSyntheticLambda1(start$default, 1), (byte) 0);
    }

    private final Object invoke$com$squareup$cash$family$applets$inject$FamilyAppletsViewsModule$Companion$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ApprovedContactsAppletTilePresenter$Factory$Impl approvedContactsAppletTilePresenter$Factory$Impl = (ApprovedContactsAppletTilePresenter$Factory$Impl) this.f$0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$1;
        Navigator navigator = (Navigator) obj;
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        navigator.getClass();
        coroutineScope.getClass();
        LoadTimeClock.MetroFactory metroFactory = approvedContactsAppletTilePresenter$Factory$Impl.delegateFactory;
        SessionManager sessionManager = (SessionManager) metroFactory.clock.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.observabilityManager.invoke();
        sessionManager.getClass();
        androidStringManager.getClass();
        Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(sessionManager, androidStringManager, navigator)), coroutineScope, lifecycleOwner);
        return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 11), 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Painter painterResource;
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 21;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                MainScreensViewModel$Tab.Icon icon = (MainScreensViewModel$Tab.Icon) obj4;
                MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (icon instanceof MainScreensViewModel$Tab.Icon.Text) {
                    gapComposer.startReplaceGroup(23022074);
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 430, 0L, Snapshots.getNotScaledUp(Room.getSp(14), gapComposer), gapComposer, null, null, ((MainScreensViewModel$Tab.Icon.Text) icon).text, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(23176361);
                    boolean z2 = icon instanceof MainScreensViewModel$Tab.Icon.FullBadge;
                    MainScreensViewModel$Tab.Icon.Activity activity = MainScreensViewModel$Tab.Icon.Activity.INSTANCE;
                    if (z2) {
                        icon = activity;
                    }
                    if (Intrinsics.areEqual(icon, activity)) {
                        gapComposer.startReplaceGroup(554943270);
                        painterResource = Icons.NavigationActivity.painter(gapComposer);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        z = false;
                        if (Intrinsics.areEqual(icon, MainScreensViewModel$Tab.Icon.Card.INSTANCE)) {
                            gapComposer.startReplaceGroup(554945094);
                            painterResource = Icons.NavigationCard.painter(gapComposer);
                            gapComposer.end(false);
                        } else if (Intrinsics.areEqual(icon, MainScreensViewModel$Tab.Icon.Money.INSTANCE)) {
                            gapComposer.startReplaceGroup(554946982);
                            painterResource = Icons.NavigationMoney.painter(gapComposer);
                            gapComposer.end(false);
                        } else if (Intrinsics.areEqual(icon, MainScreensViewModel$Tab.Icon.PaymentDollar.INSTANCE)) {
                            gapComposer.startReplaceGroup(554949190);
                            painterResource = Icons.NavigationLogoUsd.painter(gapComposer);
                            gapComposer.end(false);
                        } else if (Intrinsics.areEqual(icon, MainScreensViewModel$Tab.Icon.PaymentGeneric.INSTANCE)) {
                            gapComposer.startReplaceGroup(554951334);
                            painterResource = Icons.NavigationSend.painter(gapComposer);
                            gapComposer.end(false);
                        } else if (Intrinsics.areEqual(icon, MainScreensViewModel$Tab.Icon.PaymentPound.INSTANCE)) {
                            gapComposer.startReplaceGroup(554953510);
                            painterResource = Icons.NavigationLogoGbp.painter(gapComposer);
                            gapComposer.end(false);
                        } else {
                            if (!(icon instanceof MainScreensViewModel$Tab.Icon.Local)) {
                                if ((icon instanceof MainScreensViewModel$Tab.Icon.FullBadge) || (icon instanceof MainScreensViewModel$Tab.Icon.Text)) {
                                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, 554964433, false, "Unreachable");
                                }
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 554941573, false);
                            }
                            gapComposer.startReplaceGroup(554960600);
                            painterResource = Countries.painterResource(R.drawable.core_tab_neighborhoods_tab_icon, 0, gapComposer);
                            gapComposer.end(false);
                        }
                    }
                    Trace.m1190Iconww6aTOc(painterResource, mainScreensViewModel$Tab.contentAccessibilityText, (Modifier) null, 0L, gapComposer, Painter.$stable, 12);
                    gapComposer.end(z);
                }
                return Unit.INSTANCE;
            case 1:
                PaddingValues paddingValues = (PaddingValues) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier padding = SpacerKt.padding(modifier, paddingValues);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, padding);
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
                    Recorder$$ExternalSyntheticOutline1.m(0, function2, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BitcoinP2pConversionPercentageViewKt.ExceededMaxAlertDialog((BitcoinP2pConversionPercentageViewModel.Content.AlertModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                BitcoinP2pConversionPercentageViewModel.Content content = (BitcoinP2pConversionPercentageViewModel.Content) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-627038003, new BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5(content, function1, i3), gapComposer3), gapComposer3, 24576, 15);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                StringMerger.FeeInfoSection((LocationDetailsViewModel.FeeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                PhysicalDepositErrorViewModel physicalDepositErrorViewModel = (PhysicalDepositErrorViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i4 = 1;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(-1989712097, new PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda2(physicalDepositErrorViewModel, 0), gapComposer4), Expect_jvmKt.rememberComposableLambda(545895328, new PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda2(physicalDepositErrorViewModel, i4), gapComposer4), Expect_jvmKt.rememberComposableLambda(-1988529292, new PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4(function12, physicalDepositErrorViewModel), gapComposer4), Expect_jvmKt.rememberComposableLambda(547078133, new PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4(physicalDepositErrorViewModel, function12), gapComposer4), (Function3) null, gapComposer4, 28080, 33);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str = locationDeniedScreen.titleText;
                    String str2 = locationDeniedScreen.detailsText;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-792101612, new CheckDepositAmountKt$$ExternalSyntheticLambda6(28, (Object) locationDeniedScreen, function13), gapComposer5);
                    String str3 = locationDeniedScreen.ignoreText;
                    if (str3 == null) {
                        gapComposer5.startReplaceGroup(-704290850);
                        gapComposer5.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer5.startReplaceGroup(-704290849);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1360236649, new TabContentViewKt$$ExternalSyntheticLambda11(function13, str3, 18), gapComposer5);
                        gapComposer5.end(false);
                        composableLambdaImpl = rememberComposableLambda2;
                    }
                    ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda, composableLambdaImpl, (Function3) null, gapComposer5, 3072, 33);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function14 = (Function1) obj4;
                AtmPmdExplainerViewModel atmPmdExplainerViewModel = (AtmPmdExplainerViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2);
                Applier applier = gapComposer6.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer6, 0);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer6, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer6.changed(function14);
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(13, function14);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer6, 54, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer6), false, 14);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then = verticalScroll$default.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer6, 0);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, then);
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer6, composeUiNode$Companion$SetModifier$13, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer6, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    gapComposer6.startReplaceGroup(-973425567);
                    Iterator it = atmPmdExplainerViewModel.elements.iterator();
                    while (it.hasNext()) {
                        AtmPmdExplainerViewKt.ExplainerElement((BenefitExplainerScreen.Element) it.next(), function14, gapComposer6, 0);
                    }
                    gapComposer6.end(false);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    SpacerKt.Spacer(gapComposer6, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    gapComposer6.startReplaceGroup(-973418847);
                    Iterator it2 = atmPmdExplainerViewModel.footerElements.iterator();
                    while (it2.hasNext()) {
                        AtmPmdExplainerViewKt.ExplainerElement((BenefitExplainerScreen.Element) it2.next(), function14, gapComposer6, 0);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer6, false, true, true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AtmPmdExplainerViewKt.ActionableButton((ActionableButtonDefault) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AtmPmdExplainerViewKt.CtaGroup((ActionableButtonCtaGroup) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                LocalizedString localizedString = (LocalizedString) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    String translated = StringsKt.translated(localizedString);
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(colors2.semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), i3);
                    boolean changed2 = gapComposer7.changed(function15);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda12(19, function15);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(translated, (Function2) rememberedValue2, null, null, 0L, markdownSpanValues, null, null, 0, 0, 0, gapComposer7, 0, 2012);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                AtmPmdExplainerViewKt.ExplainerElement((BenefitExplainerScreen.Element) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AtmPmdExplainerViewKt.ListUnordered((ListUnordered) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Benefit benefit = (Benefit) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefit.description, (Map) null, (Function1) null, false);
                    gapComposer8.startReplaceGroup(1639818024);
                    Iterator it3 = benefit.descriptionItems.iterator();
                    while (it3.hasNext()) {
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) it3.next(), (Map) null, (Function1) null, false);
                    }
                    gapComposer8.end(false);
                    String str4 = benefit.buttonName;
                    if (str4 == null) {
                        gapComposer8.startReplaceGroup(-705182312);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-705182311);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer8, null);
                        Role role = new Role(0);
                        boolean changed3 = gapComposer8.changed(function16) | gapComposer8.changedInstance(benefit);
                        Object rememberedValue3 = gapComposer8.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(12, function16, benefit);
                            gapComposer8.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, role, (Function0) rememberedValue3, 11);
                        TextStyle textStyle = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                        Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors3.component.button.subtle.text.f168default, (Composer) gapComposer8, m183clickableoSLSa3U$default, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                final LimitReachedDialogViewModel limitReachedDialogViewModel = (LimitReachedDialogViewModel) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                final int i5 = 1;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    final int i6 = 0;
                    ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(-1627731691, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.LimitReachedModalArcadeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = i6;
                            LimitReachedDialogViewModel limitReachedDialogViewModel2 = limitReachedDialogViewModel;
                            switch (i7) {
                                case 0:
                                    Composer composer10 = (Composer) obj6;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                        String str5 = limitReachedDialogViewModel2.dialog.title_text;
                                        if (str5 == null) {
                                            gapComposer10.startReplaceGroup(-1574007460);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1574007459);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer11 = (Composer) obj6;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer11 = (GapComposer) composer11;
                                    if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                        String str6 = limitReachedDialogViewModel2.dialog.detail_text;
                                        if (str6 == null) {
                                            gapComposer11.startReplaceGroup(-1708589157);
                                        } else {
                                            gapComposer11.startReplaceGroup(-1708589156);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer11.end(false);
                                    } else {
                                        gapComposer11.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer9), Expect_jvmKt.rememberComposableLambda(-137162986, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.LimitReachedModalArcadeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = i5;
                            LimitReachedDialogViewModel limitReachedDialogViewModel2 = limitReachedDialogViewModel;
                            switch (i7) {
                                case 0:
                                    Composer composer10 = (Composer) obj6;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                        String str5 = limitReachedDialogViewModel2.dialog.title_text;
                                        if (str5 == null) {
                                            gapComposer10.startReplaceGroup(-1574007460);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1574007459);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer11 = (Composer) obj6;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer11 = (GapComposer) composer11;
                                    if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                        String str6 = limitReachedDialogViewModel2.dialog.detail_text;
                                        if (str6 == null) {
                                            gapComposer11.startReplaceGroup(-1708589157);
                                        } else {
                                            gapComposer11.startReplaceGroup(-1708589156);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer11.end(false);
                                    } else {
                                        gapComposer11.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer9), Expect_jvmKt.rememberComposableLambda(824503530, new ArcadeModal2Kt$$ExternalSyntheticLambda0(i5, limitReachedDialogViewModel, function17), gapComposer9), Expect_jvmKt.rememberComposableLambda(-1979895061, new BookletGridKt$$ExternalSyntheticLambda1(24, function17), gapComposer9), (Function3) null, gapComposer9, 28080, 33);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                PaperMoneyDepositOnboardingViewKt.OnboardingPage((PaperCashDepositBlocker.TutorialCarousel.Page) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                Function1 function18 = (Function1) obj4;
                DirectDepositSetupViewModel directDepositSetupViewModel = (DirectDepositSetupViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                boolean shouldExecute2 = gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                Applier applier2 = gapComposer10.applier;
                if (shouldExecute2) {
                    long j = Strings.getColors(gapComposer10).semantic.background.f1047app;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer10, 0);
                    int hashCode5 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer10, navigationBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer10.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer10, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer10, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed4 = gapComposer10.changed(function18);
                    Object rememberedValue4 = gapComposer10.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new EarningsHeaderKt$$ExternalSyntheticLambda2(2, function18);
                        gapComposer10.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, Expect_jvmKt.rememberComposableLambda(591942691, new ArcadeModal2Kt$$ExternalSyntheticLambda0(i3, directDepositSetupViewModel, function18), gapComposer10), gapComposer10, 1572918, 44);
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(companion2, ImageKt.rememberScrollState(gapComposer10), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer10, 0);
                    int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, verticalScroll$default2);
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer10, composeUiNode$Companion$SetModifier$17, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer10, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    Strings.getSizes(gapComposer10).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion2, 16.0f, gapComposer10);
                    DirectDepositSetupViewModel.HeaderSection headerSection = directDepositSetupViewModel.headerSection;
                    DirectDepositSetupViewModel.CreateFormSection createFormSection = directDepositSetupViewModel.createFormSection;
                    DirectDepositSetupViewModel.SetupYourselfSection setupYourselfSection = directDepositSetupViewModel.setupYourselfSection;
                    Countries.PageHeader(headerSection.title, (Modifier) null, DirectDepositDialogKt.f381lambda$941181467, headerSection.subtitle, gapComposer10, MLKEMEngine.KyberPolyBytes, 2);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer10, null);
                    ViewfinderDefaults.SectionHeader(setupYourselfSection.title, (Modifier) null, (String) null, (Function0) null, setupYourselfSection.description, gapComposer10, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    DirectDepositSetupViewModel.AccountDetailsContentHome accountDetailsContentHome = setupYourselfSection.accountDetails;
                    String str5 = accountDetailsContentHome.routingLabel;
                    Redacted redacted = accountDetailsContentHome.routingNumber;
                    String str6 = accountDetailsContentHome.routingContentDescription;
                    boolean changed5 = gapComposer10.changed(function18);
                    Object rememberedValue5 = gapComposer10.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new EarningsHeaderKt$$ExternalSyntheticLambda2(3, function18);
                        gapComposer10.updateRememberedValue(rememberedValue5);
                    }
                    DirectDepositDialogKt.CopyNumber(str5, redacted, str6, (Function0) rememberedValue5, gapComposer10, 0);
                    String str7 = accountDetailsContentHome.accountLabel;
                    Redacted redacted2 = accountDetailsContentHome.accountNumber;
                    String str8 = accountDetailsContentHome.accountContentDescription;
                    boolean changed6 = gapComposer10.changed(function18);
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new EarningsHeaderKt$$ExternalSyntheticLambda2(4, function18);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    DirectDepositDialogKt.CopyNumber(str7, redacted2, str8, (Function0) rememberedValue6, gapComposer10, 0);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer10, null);
                    String str9 = createFormSection.label;
                    Role role2 = new Role(0);
                    boolean changed7 = gapComposer10.changed(function18);
                    Object rememberedValue7 = gapComposer10.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new EarningsHeaderKt$$ExternalSyntheticLambda2(5, function18);
                        gapComposer10.updateRememberedValue(rememberedValue7);
                    }
                    Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(companion2, false, str9, role2, (Function0) rememberedValue7, 9);
                    String str10 = createFormSection.label;
                    String str11 = createFormSection.description;
                    boolean changed8 = gapComposer10.changed(function18);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new EarningsHeaderKt$$ExternalSyntheticLambda2(6, function18);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    ViewfinderDefaults.SectionHeader(str10, m183clickableoSLSa3U$default2, "", (Function0) rememberedValue8, str11, gapComposer10, MLKEMEngine.KyberPolyBytes, 0);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer10, null);
                    Trace.m1191Iconww6aTOc(Icons.Fdic24, (String) null, new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), Strings.getColors(gapComposer10).semantic.icon.subtle, gapComposer10, 54, 0);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Strings.getSizes(gapComposer10).getClass();
                    Strings.getSizes(gapComposer10).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
                    String str12 = directDepositSetupViewModel.disclosure;
                    TextStyle textStyle2 = Strings.getTypography(gapComposer10).bodyXSmall;
                    SpanStyle spanStyle = new SpanStyle(Strings.getColors(gapComposer10).semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438);
                    long j2 = Strings.getColors(gapComposer10).semantic.text.subtle;
                    boolean changed9 = gapComposer10.changed(function18);
                    Object rememberedValue9 = gapComposer10.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new SsnViewKt$$ExternalSyntheticLambda12(21, function18);
                        gapComposer10.updateRememberedValue(rememberedValue9);
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(str12, (Function2) rememberedValue9, m299paddingVpY3zN4, textStyle2, j2, spanStyle, null, 0, 0, null, 0, gapComposer10, 0, 1984);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                    gapComposer10.end(true);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Button button = (Button) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    FetcherKt fetcherKt = button.content;
                    fetcherKt.getClass();
                    Button$Content$Icon button$Content$Icon = fetcherKt instanceof Button$Content$Icon ? (Button$Content$Icon) fetcherKt : null;
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(ComposeUtilsKt.getThemedUrl(button$Content$Icon != null ? button$Content$Icon.value : null, gapComposer11), Room.stringResource(gapComposer11, R.string.bnpl_carousel_section_browse_button), realImageLoader, SizeKt.fillMaxSize(modifier, 1.0f), null, null, null, gapComposer11, 3072, 0, 4080);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LocalActivitySetupTeardown.MetroFactory metroFactory = ((EarnerAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState = (RealEarnerAppletAvailabilityState) metroFactory.appForegroundStateProvider.invoke();
                FlowStarter flowStarter = (FlowStarter) metroFactory.sessionManager.invoke();
                RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) metroFactory.syncValueReader.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.shortlinkHandler.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.ioDispatcher.invoke();
                realEarnerAppletAvailabilityState.getClass();
                flowStarter.getClass();
                realEarningsSyncStateRepository.getClass();
                realRouter$Factory$Impl.getClass();
                moneyAnalyticsService.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(navigator, realEarnerAppletAvailabilityState, flowStarter, realEarningsSyncStateRepository, realRouter$Factory$Impl, moneyAnalyticsService)), coroutineScope, (LifecycleOwner) obj3);
                return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 9), (char) 0);
            case 19:
                EarningsHeaderViewModel earningsHeaderViewModel = (EarningsHeaderViewModel) obj4;
                ScreenScaffoldContentScope screenScaffoldContentScope = (ScreenScaffoldContentScope) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer12, null);
                    String str13 = earningsHeaderViewModel.title;
                    if (str13 == null) {
                        str13 = re$$ExternalSyntheticOutline0.m(gapComposer12, -245016067, R.string.earnings_home_title, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-245016532);
                        gapComposer12.end(false);
                    }
                    String str14 = str13;
                    TextStyle textStyle3 = ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                    Colors colors4 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    long j3 = colors4.semantic.text.standard;
                    gapComposer12.startReplaceGroup(-245009763);
                    if (screenScaffoldContentScope != null) {
                        modifier = ScreenScaffoldKt.markAsScaffoldTitle(modifier, screenScaffoldContentScope, gapComposer12, 6);
                    }
                    gapComposer12.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j3, (Composer) gapComposer12, modifier, textStyle3, (TextLineBalancing) null, str14, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                EarningsToolsSectionKt.EarningToolRow((EarningsHomeViewModel.EarningToolsItem) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                zzanv.UninstalledUI((EarningsAppletTileModel.Uninstalled) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                Navigator navigator2 = (Navigator) obj;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                navigator2.getClass();
                coroutineScope2.getClass();
                LanguageDisclosureSetupTeardown.MetroFactory metroFactory2 = ((EarningsAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                AndroidClock androidClock = (AndroidClock) metroFactory2.appService.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory2.cashAppLiteGate.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) metroFactory2.database.invoke();
                MoneyAnalyticsService moneyAnalyticsService2 = (MoneyAnalyticsService) metroFactory2.initialScreenPreludeNavigator.invoke();
                RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) metroFactory2.isLanguageDisclosureAcceptancePending.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory2.localeManager.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory2.sessionManager.invoke();
                androidClock.getClass();
                androidStringManager.getClass();
                syncValueReader.getClass();
                moneyAnalyticsService2.getClass();
                realEarningsTrackerAnalytics.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                factory.getClass();
                Presenter.Binding start$default2 = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(androidClock, androidStringManager, syncValueReader, moneyAnalyticsService2, realEarningsTrackerAnalytics, promotedAppletTilePresenter$Factory$Impl, factory, navigator2)), coroutineScope2, (LifecycleOwner) obj3);
                return new EarningsAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default2).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default2, 10));
            case 23:
                return invoke$com$squareup$cash$earningstracker$views$EarningsTimeframeSelectorSheetViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 24:
                ((Integer) obj2).getClass();
                LoadingErrorKt.EarningsBarChartShimmer((DateFilter) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                zzie.StoryWebView((EducationStoryViewModel.Ready) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$family$applets$data$RealFamilyAppletTileRepository$$ExternalSyntheticLambda1(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$family$applets$inject$FamilyAppletsViewsModule$Companion$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$family$applets$inject$FamilyAppletsViewsModule$Companion$$ExternalSyntheticLambda3(obj, obj2);
            default:
                PromotedAppletTileViewModel.Loaded loaded = (PromotedAppletTileViewModel.Loaded) obj4;
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean changedInstance = gapComposer13.changedInstance(familyAppletTile);
                    Object rememberedValue10 = gapComposer13.rememberedValue();
                    if (changedInstance || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new RecipientQueries$$ExternalSyntheticLambda0(familyAppletTile, i2);
                        gapComposer13.updateRememberedValue(rememberedValue10);
                    }
                    SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue10, null, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
