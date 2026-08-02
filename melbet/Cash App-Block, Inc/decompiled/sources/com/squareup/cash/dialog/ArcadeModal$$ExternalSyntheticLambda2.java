package com.squareup.cash.dialog;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.earnings.EarningsTapViewAllActivity;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.earnings.backend.api.EarningsStream;
import com.squareup.cash.earnings.backend.api.EarningsStreamsResult$Success;
import com.squareup.cash.earnings.backend.api.MonthlyEarnings;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter$Factory$Impl;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.familyhub.views.DisabledClickableNode;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesTrustedSponsorSelectionPhase_2;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.formview.components.ArcadeFormButtonView;
import com.squareup.cash.formview.components.ArcadeFormViewTitleBar;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$2;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ArcadeModal$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.$r8$classId;
        ActivityEmbeddedViewEvent.ShowMoreClicked showMoreClicked = ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE;
        str = "";
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ArcadeModal) obj).callOnClick();
                return Unit.INSTANCE;
            case 1:
                Long l = ((BitcoinP2pConversionPercentagePresenter) obj).blocker.conversion_bps;
                return new ParcelableSnapshotMutableLongState(l != null ? l.longValue() : 5000L);
            case 2:
                RealAppConfigManager realAppConfigManager = (RealAppConfigManager) obj;
                realAppConfigManager.lastUpdated = realAppConfigManager.clock.millis();
                return Unit.INSTANCE;
            case 3:
                return Integer.valueOf(((PaperMoneyDepositOnboardingViewModel) obj).pages.size());
            case 4:
                return Updater.mutableStateOf$default(new InputFieldText.Simple((CharSequence) ((DirectDepositEditCompanyNameScreen) ((CardStudioPresenter) obj).appConfig).inputText.getValue()));
            case 5:
                return Updater.mutableStateOf$default(new InputFieldText.Simple((CharSequence) ((DirectDepositEditFullNameScreen) ((LocalPosCheckInPresenter) obj).store).inputText.getValue()));
            case 6:
                PaycheckDepositAllocation paycheckDepositAllocation = ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) ((DirectDepositEditPaycheckCurrencyAllocationScreen) ((CardStudioPresenter) obj).appConfig).question.question).paycheckDepositAllocation;
                if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount) {
                    str = ((PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation).inputText;
                } else if (!(paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage) && !(paycheckDepositAllocation instanceof PaycheckDepositAllocation.All)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Updater.mutableStateOf$default(new InputFieldText.Simple(str));
            case 7:
                PaycheckDepositAllocation paycheckDepositAllocation2 = ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) ((DirectDepositEditPaycheckPercentageScreen) ((LocalPosCheckInPresenter) obj).store).question.question).paycheckDepositAllocation;
                if (!(paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.CurrencyAmount)) {
                    if (paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.Percentage) {
                        str = String.valueOf(((PaycheckDepositAllocation.Percentage) paycheckDepositAllocation2).percentage);
                    } else if (!(paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.All)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Updater.mutableStateOf$default(new InputFieldText.Simple(str));
            case 8:
                return ((LocalizedMoneyFormatter.Factory) ((LocalEditorialPresenter) obj).launcher).create(MoneyFormatterConfig.COMPACT);
            case 9:
                ArrayList arrayList = ((EarningsStream) obj).monthlyEarnings;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((MonthlyEarnings) it.next()).total);
                }
                return zzu.sumInDominantCurrency(arrayList2, CurrencyCode.USD);
            case 10:
                EarningsStreamsResult$Success earningsStreamsResult$Success = (EarningsStreamsResult$Success) obj;
                List list = earningsStreamsResult$Success.streams;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((Money) ((EarningsStream) it2.next()).totalAmount$delegate.getValue());
                }
                return zzu.sumInDominantCurrency(arrayList3, earningsStreamsResult$Success.fallbackCurrency);
            case 11:
                EarningsHomePresenter earningsHomePresenter = (EarningsHomePresenter) obj;
                earningsHomePresenter.earningsHomeAnalytics.analytics.track(new EarningsTapViewAllActivity(), null);
                earningsHomePresenter.navigator.goTo(new EarningsActivityListScreen(null));
                return Unit.INSTANCE;
            case 12:
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj;
                ((BetterNavigator.ScreenNavigator) transfersPresenter.navigator).goTo(new EarningsActivityListScreen(((EarningsStreamDetailScreen) transfersPresenter.featureFlagManager).streamId));
                return Unit.INSTANCE;
            case 13:
                ((EarningsHomeViewModel.EarningsActivity) obj).embedded.onEvent.invoke(showMoreClicked);
                return Unit.INSTANCE;
            case 14:
                TransfersPresenter transfersPresenter2 = (TransfersPresenter) obj;
                Object obj2 = ((EarningsTrackerScreen) transfersPresenter2.router).earningsFilter;
                if (obj2 == null) {
                    obj2 = transfersPresenter2.getCurrentMonthAsMonthlyFilter();
                }
                return Updater.mutableStateOf$default(obj2);
            case 15:
                MusicPresenter musicPresenter = (MusicPresenter) obj;
                ArrayList arrayList4 = ((EducationStoryViewPagerScreen) musicPresenter.musicPlayer).stories;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((EducationStoryPresenter$Factory$Impl) musicPresenter.musicRepository).create((EducationStoryScreen) it3.next(), (BetterNavigator.ScreenNavigator) musicPresenter.navigator));
                }
                return arrayList5;
            case 16:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj;
                Navigator navigator = (Navigator) endAppLockPresenter.navigatorSwitcher;
                String str2 = (String) endAppLockPresenter.appLockState;
                navigator.goTo(new DependentActivityScreen(DependentActivityScreen.ActivityType.ALL_ACTIVITIES, str2 != null ? str2 : "", true));
                return Unit.INSTANCE;
            case 17:
                UiCallbackModel activityModel = ((DependentActivityAppletTileViewModel) obj).getActivityModel();
                if (activityModel != null) {
                    activityModel.onEvent.invoke(showMoreClicked);
                }
                return Unit.INSTANCE;
            case 18:
                BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) obj;
                RealDependentControlStatusManager.Factory factory = baseDependentControlPresenter.deps.dependentControlStatusManagerFactory;
                DependentControlScreen dependentControlScreen = baseDependentControlPresenter.args;
                return factory.create(dependentControlScreen.getControlType(), dependentControlScreen.getDependentCustomerToken());
            case 19:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj;
                savingsScreenPresenter.navigator.goTo(new DependentActivityScreen(DependentActivityScreen.ActivityType.ALL_ACTIVITIES, ((DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy).dependentCustomerToken, false));
                return Unit.INSTANCE;
            case 20:
                return Updater.mutableStateOf$default(Boolean.valueOf(((ManagedAccountTransferPresenter) obj).args.initialAmount != null));
            case 21:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj;
                Sponsor sponsor = ((SponsorLedInviteScreen) localEditorialPresenter.launcher).sponsor;
                FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                try {
                    String str3 = sponsor.customer_token;
                    if (str3 != null) {
                        return str3;
                    }
                    try {
                        throw new IllegalArgumentException("sponsor.customer_token");
                    } catch (Exception e) {
                        ((ErrorReporter) localEditorialPresenter.installedStore).report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), familyParsingErrorFactory, null), (SampleStrategy) localEditorialPresenter.clock);
                        return null;
                    }
                } catch (Exception e2) {
                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(sponsor.getClass()), familyParsingErrorFactory, null);
                }
            case 22:
                return ((RippleConfiguration) DepthSortedSetKt.currentValueOf((DisabledClickableNode) obj, RippleKt.LocalRippleConfiguration)).rippleAlpha;
            case 23:
                List split$default = StringsKt.split$default(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) ((SelectSponsorPresenter) obj).featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesTrustedSponsorSelectionPhase_2.INSTANCE)).value, new char[]{','}, 6);
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
                Iterator it4 = split$default.iterator();
                while (it4.hasNext()) {
                    String lowerCase = StringsKt.trim((String) it4.next()).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList6.add(lowerCase);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (((String) next).length() > 0) {
                        arrayList7.add(next);
                    }
                }
                return arrayList7;
            case 24:
                Function1<Map<String, String>, Unit> handler = ((DeliveryUpdate.NeedsUserInteractionUsingHandler) ((DeliveryUpdate) obj)).getHandler();
                zzc zzcVar = RealFidesmoClient.FidesmoRequirementId.Companion;
                RealFidesmoClient.FidesmoOptionAnswer[] fidesmoOptionAnswerArr = RealFidesmoClient.FidesmoOptionAnswer.$VALUES;
                handler.invoke(MapsKt__MapsJVMKt.mapOf(new Pair("retry", "0")));
                return Unit.INSTANCE;
            case 25:
                ProvisioningHaptics provisioningHaptics = (ProvisioningHaptics) obj;
                if (provisioningHaptics != null) {
                    provisioningHaptics.player.play(provisioningHaptics.stepTurnGearPop);
                }
                return Unit.INSTANCE;
            case 26:
                ArcadeFormButtonView arcadeFormButtonView = (ArcadeFormButtonView) obj;
                FormElementViewBuilder$toView$2 formElementViewBuilder$toView$2 = arcadeFormButtonView.onEvent;
                BlockerAction blockerAction = arcadeFormButtonView.element.action;
                blockerAction.getClass();
                formElementViewBuilder$toView$2.invoke(new FormViewEvent.BlockerActionViewEvent.FormButtonClicked(blockerAction));
                return Unit.INSTANCE;
            case 27:
                ArcadeFormViewTitleBar arcadeFormViewTitleBar = (ArcadeFormViewTitleBar) obj;
                if (((Boolean) arcadeFormViewTitleBar.showRetreatButton$delegate.getValue()).booleanValue()) {
                    arcadeFormViewTitleBar.onRetreatClick.invoke();
                } else {
                    arcadeFormViewTitleBar.onCloseClick.invoke();
                }
                return Unit.INSTANCE;
            case 28:
                int i2 = FormViewCtaButtons.$r8$clinit;
                SharedFlowImpl sharedFlowImpl = ((FormViewCtaButtons.ButtonProps) obj).clicks;
                Unit unit = Unit.INSTANCE;
                StateFlowKt.emitOrThrow(sharedFlowImpl, unit);
                return unit;
            default:
                String str4 = ((FormDateInputViewModel) obj).defaultText;
                return Updater.mutableStateOf$default(new TextFieldValue(str4 != null ? str4 : "", 0L, 6));
        }
    }
}
