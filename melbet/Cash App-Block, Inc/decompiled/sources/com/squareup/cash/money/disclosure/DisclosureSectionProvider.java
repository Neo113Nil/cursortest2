package com.squareup.cash.money.disclosure;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionViewModel;
import com.squareup.cash.banking.sections.RealMoreWaysToAddMoneySectionPresenter;
import com.squareup.cash.banking.sections.RealMoreWaysToAddMoneySectionPresenter$Factory$Impl;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.family.sectionprovider.ManagedAccountItem;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.sections.AppletTileSection;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.core.ids.SectionProviderId;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import io.noties.markwon.MarkwonConfiguration;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class DisclosureSectionProvider implements SectionProvider {
    public final /* synthetic */ int $r8$classId;
    public final StateFlow availabilityState;
    public final Object disclosureRepository;
    public final Object moneyAnalyticsService;
    public final Object router;

    public DisclosureSectionProvider(RealMoreWaysToAddMoneySectionPresenter$Factory$Impl realMoreWaysToAddMoneySectionPresenter$Factory$Impl, RealFamilyProfileManager realFamilyProfileManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        GrantPresenter.MetroFactory metroFactory = realMoreWaysToAddMoneySectionPresenter$Factory$Impl.delegateFactory;
        SyncValueReader syncValueReader = (SyncValueReader) metroFactory.blockersDataNavigator.invoke();
        Analytics analytics = (Analytics) metroFactory.multiBlockerFacilitator.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.analytics.invoke();
        RealClientRouteParser realClientRouteParser = (RealClientRouteParser) metroFactory.blockerFlowAnalytics.invoke();
        MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.blockersHelperFactory.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.blockerActionUriDecoder.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityEvents.value;
        syncValueReader.getClass();
        analytics.getClass();
        realRouter$Factory$Impl.getClass();
        realClientRouteParser.getClass();
        moneyAnalyticsService.getClass();
        featureFlagManager.getClass();
        coroutineScope.getClass();
        this.disclosureRepository = new RealMoreWaysToAddMoneySectionPresenter(syncValueReader, analytics, realRouter$Factory$Impl, realClientRouteParser, moneyAnalyticsService, featureFlagManager, coroutineScope, screenNavigator);
        this.moneyAnalyticsService = FlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, null, 5);
        this.router = SectionProviderId.DEPOSIT;
        this.availabilityState = StateFlowKt.mapState(realFamilyProfileManager.familyProfile, new AvatarsKt$$ExternalSyntheticLambda2(24));
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final StateFlow getAvailabilityState() {
        switch (this.$r8$classId) {
        }
        return (DerivedStateFlow) this.availabilityState;
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final SectionProviderId getId() {
        switch (this.$r8$classId) {
            case 0:
                return SectionProviderId.DISCLOSURE;
            case 1:
                return (SectionProviderId) this.router;
            default:
                return SectionProviderId.MANAGED_ACCOUNT_SETTINGS;
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = this.moneyAnalyticsService;
        Object obj2 = this.disclosureRepository;
        final int i3 = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1243462810);
                DisclosureItemModel models = ((DisclosureRepository) obj2).models(flow, gapComposer);
                boolean changed = gapComposer.changed(models);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.derivedStateOf(new IntentLauncher$$ExternalSyntheticLambda0(28, models, this));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SectionProvider.Content content = new SectionProvider.Content((List) ((State) rememberedValue).getValue(), false);
                gapComposer.end(false);
                return content;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(420062593);
                MoreWaysToAddMoneySectionViewModel moreWaysToAddMoneySectionViewModel = (MoreWaysToAddMoneySectionViewModel) ((RealMoreWaysToAddMoneySectionPresenter) obj2).models((SharedFlowImpl) obj, gapComposer2, 0);
                boolean changed2 = gapComposer2.changed(moreWaysToAddMoneySectionViewModel);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.derivedStateOf(new BankingDialogKt$$ExternalSyntheticLambda5(18, moreWaysToAddMoneySectionViewModel, this));
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                State state = (State) rememberedValue2;
                SectionProvider.Content content2 = new SectionProvider.Content((List) state.getValue(), ((List) state.getValue()).isEmpty());
                gapComposer2.end(false);
                return content2;
            default:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(583963085);
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) obj);
                SectionId sectionId = SectionId.MANAGED_ACCOUNT_SETTINGS;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                String str = androidStringManager.get(R.string.managed_account_settings_section_title);
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (activeAccountTokenOrNull != null) {
                    createListBuilder.add(new ManagedAccountItem(new ItemId.MANAGED_ACCOUNT_SETTING_ITEM("MANAGED_ACCOUNT_CONTROLS_AND_LIMITS"), Icons.Control24, androidStringManager.get(R.string.managed_account_controls_and_limits_title), androidStringManager.get(R.string.managed_account_controls_and_limits_subtitle), new GLSceneScope$$ExternalSyntheticLambda4(7, this, activeAccountTokenOrNull)));
                }
                final int i4 = 3;
                createListBuilder.add(new ManagedAccountItem(new ItemId.MANAGED_ACCOUNT_SETTING_ITEM("MANAGED_ACCOUNT_PROFILE"), Icons.Avatar24, androidStringManager.get(R.string.managed_account_profile_title), androidStringManager.get(R.string.managed_account_profile_subtitle), new Function0(this) { // from class: com.squareup.cash.family.sectionprovider.ManagedAccountSectionProvider$$ExternalSyntheticLambda0
                    public final /* synthetic */ DisclosureSectionProvider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = i4;
                        DisclosureSectionProvider disclosureSectionProvider = this.f$0;
                        switch (i5) {
                            case 0:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("SH_SUB_CASH_CARD_ISSUES");
                                break;
                            case 1:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CASH_CARD_DISPUTE_PURCHASE");
                                break;
                            case 2:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CLOSE_MANAGED_ACCOUNT");
                                break;
                            default:
                                ((Navigator) ((MarkwonConfiguration) disclosureSectionProvider.router).spansFactory).goTo(EditProfile.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i5 = 1;
                final int i6 = 2;
                SectionProvider.Content content3 = new SectionProvider.Content(CollectionsKt__CollectionsKt.listOf((Object[]) new AppletTileSection[]{new AppletTileSection(sectionId, str, CollectionsKt__CollectionsJVMKt.build(createListBuilder)), new AppletTileSection(SectionId.MANAGED_ACCOUNT_SUPPORT, androidStringManager.get(R.string.managed_account_contact_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new ManagedAccountItem[]{new ManagedAccountItem(new ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM("MANAGED_ACCOUNT_SUPPORT_ISSUE_WITH_CARD"), Icons.CardBasic24, androidStringManager.get(R.string.managed_account_issue_with_card_title), null, new Function0(this) { // from class: com.squareup.cash.family.sectionprovider.ManagedAccountSectionProvider$$ExternalSyntheticLambda0
                    public final /* synthetic */ DisclosureSectionProvider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i3;
                        DisclosureSectionProvider disclosureSectionProvider = this.f$0;
                        switch (i52) {
                            case 0:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("SH_SUB_CASH_CARD_ISSUES");
                                break;
                            case 1:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CASH_CARD_DISPUTE_PURCHASE");
                                break;
                            case 2:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CLOSE_MANAGED_ACCOUNT");
                                break;
                            default:
                                ((Navigator) ((MarkwonConfiguration) disclosureSectionProvider.router).spansFactory).goTo(EditProfile.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), new ManagedAccountItem(new ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM("MANAGED_ACCOUNT_SUPPORT_DISPUTE_TRANSACTION"), Icons.CardStrip24, androidStringManager.get(R.string.managed_account_dispute_transaction_title), null, new Function0(this) { // from class: com.squareup.cash.family.sectionprovider.ManagedAccountSectionProvider$$ExternalSyntheticLambda0
                    public final /* synthetic */ DisclosureSectionProvider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i5;
                        DisclosureSectionProvider disclosureSectionProvider = this.f$0;
                        switch (i52) {
                            case 0:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("SH_SUB_CASH_CARD_ISSUES");
                                break;
                            case 1:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CASH_CARD_DISPUTE_PURCHASE");
                                break;
                            case 2:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CLOSE_MANAGED_ACCOUNT");
                                break;
                            default:
                                ((Navigator) ((MarkwonConfiguration) disclosureSectionProvider.router).spansFactory).goTo(EditProfile.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), new ManagedAccountItem(new ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM("MANAGED_ACCOUNT_SUPPORT_CLOSE_ACCOUNT"), Icons.Block24, androidStringManager.get(R.string.managed_account_close_account_title), null, new Function0(this) { // from class: com.squareup.cash.family.sectionprovider.ManagedAccountSectionProvider$$ExternalSyntheticLambda0
                    public final /* synthetic */ DisclosureSectionProvider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i6;
                        DisclosureSectionProvider disclosureSectionProvider = this.f$0;
                        switch (i52) {
                            case 0:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("SH_SUB_CASH_CARD_ISSUES");
                                break;
                            case 1:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CASH_CARD_DISPUTE_PURCHASE");
                                break;
                            case 2:
                                ((MarkwonConfiguration) disclosureSectionProvider.router).showSupportArticle("CLOSE_MANAGED_ACCOUNT");
                                break;
                            default:
                                ((Navigator) ((MarkwonConfiguration) disclosureSectionProvider.router).spansFactory).goTo(EditProfile.INSTANCE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                })}))}), false);
                gapComposer3.end(false);
                return content3;
        }
    }

    public DisclosureSectionProvider(RealRouter$Factory$Impl realRouter$Factory$Impl, DisclosureRepository disclosureRepository, MoneyAnalyticsService moneyAnalyticsService, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        this.disclosureRepository = disclosureRepository;
        this.moneyAnalyticsService = moneyAnalyticsService;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.availabilityState = new StateFlowKt$stateFlowOf$1(SectionAvailabilityState.AVAILABLE);
    }

    public DisclosureSectionProvider(RealFamilyProfileManager realFamilyProfileManager, RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl, AndroidStringManager androidStringManager, SessionManager sessionManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        this.disclosureRepository = androidStringManager;
        this.moneyAnalyticsService = sessionManager;
        this.router = realFamilyNavigator$Factory$Impl.create$1(screenNavigator);
        this.availabilityState = StateFlowKt.mapState(realFamilyProfileManager.familyProfile, new FamilyActivityFixtures$$ExternalSyntheticLambda0(16));
    }
}
