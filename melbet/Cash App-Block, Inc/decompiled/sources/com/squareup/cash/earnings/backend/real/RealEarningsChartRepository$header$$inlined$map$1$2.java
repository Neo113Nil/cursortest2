package com.squareup.cash.earnings.backend.real;

import androidx.core.graphics.drawable.DrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.deposits.physical.db.AddressSearch;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearch;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearch;
import com.squareup.cash.deposits.physical.db.RecentAddressSearchQueries$addresses$$inlined$map$2$2$1;
import com.squareup.cash.deposits.physical.db.RecentAddressSearchQueries$addresses$$inlined$map$3$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter$models$paychecksDisclosure$2$2$1;
import com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1;
import com.squareup.cash.earnings.backend.api.EarningsHomeHeader;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.family.requestsponsorship.presenters.SelectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.favorites.data.RealFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1;
import com.squareup.cash.integration.contacts.ContactBook$DetailedContactQuery;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.savings.backend.api.ActiveGoalProvider;
import com.squareup.cash.savings.db.SavingsGoalLocalStatus;
import com.squareup.cash.savings.presenters.LoadedSavingsModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.wire.GrpcStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.earnings.EarningHeaderSection;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes6.dex */
public final class RealEarningsChartRepository$header$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealEarningsChartRepository$header$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealEarningsChartRepository$header$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        AnonymousClass1 anonymousClass1;
        int i;
        Object earningsHomeHeader;
        EarningHeaderSection earningHeaderSection;
        LocalizedString localizedString;
        EarningsHomeUi earningsHomeUi;
        List list;
        RecentAddressSearchQueries$addresses$$inlined$map$2$2$1 recentAddressSearchQueries$addresses$$inlined$map$2$2$1;
        int i2;
        RecentAddressSearchQueries$addresses$$inlined$map$3$2$1 recentAddressSearchQueries$addresses$$inlined$map$3$2$1;
        int i3;
        DirectDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1 directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1;
        int i4;
        Object obj2;
        DirectDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i5;
        DirectDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1 directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i6;
        DirectDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1 directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1;
        int i7;
        PaychecksHomeUi paychecksHomeUi;
        PaychecksHomeUi.TermsOfService termsOfService;
        List list2;
        DirectDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1 directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1;
        int i8;
        RealFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1 realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1;
        int i9;
        RealFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1 realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1;
        int i10;
        RealDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1 realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1;
        int i11;
        RealDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1 realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1;
        int i12;
        RealDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1 realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1;
        int i13;
        RealDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1 realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1;
        int i14;
        RealDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1 realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1;
        int i15;
        BaseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1 baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1;
        int i16;
        Object firstName;
        DependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1 dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i17;
        Object firstName2;
        DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1 dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1;
        int i18;
        DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1 dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1;
        int i19;
        DependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1 dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1;
        int i20;
        DependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1 dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1;
        int i21;
        DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1 dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1;
        int i22;
        DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1 dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1;
        int i23;
        DependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1 dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1;
        int i24;
        ManagedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1 managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1;
        int i25;
        Object firstName3;
        RealFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1 realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1;
        int i26;
        SelectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1 selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i27;
        SelectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1 selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1;
        int i28;
        RealFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1 realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1;
        int i29;
        AddFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1 addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1;
        int i30;
        int i31 = this.$r8$classId;
        boolean z = false;
        str = "";
        FlowCollector flowCollector = this.$this_unsafeFlow;
        Object obj3 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        Object obj4 = null;
        r10 = null;
        String str2 = null;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj5 = anonymousClass1.result;
                        Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            EarningsHomeUiChartState earningsHomeUiChartState = (EarningsHomeUiChartState) obj;
                            EarningsHomeUIState earningsHomeUIState = earningsHomeUiChartState.homeUiState;
                            boolean z2 = earningsHomeUiChartState.shouldShowChart;
                            if (earningsHomeUIState == null) {
                                if (earningsHomeUiChartState.hasSeenHomeUiState) {
                                    earningsHomeHeader = new EarningsHomeHeader(null, z2);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == obj6) {
                                    break;
                                }
                            } else {
                                EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = earningsHomeUIState.earnings_home_configuration;
                                if (earningsHomeConfiguration != null && (earningsHomeUi = earningsHomeConfiguration.earnings_home_ui) != null && (list = earningsHomeUi.sections) != null) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = ((EarningsHomeUi.Section) it.next()).section;
                                        EarningsHomeUi.Section.AbstractC0087Section.Header header = abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Header ? (EarningsHomeUi.Section.AbstractC0087Section.Header) abstractC0087Section : null;
                                        earningHeaderSection = header != null ? header.value : null;
                                        if (earningHeaderSection != null) {
                                            if (earningHeaderSection != null && (localizedString = earningHeaderSection.title) != null) {
                                                str2 = localizedString.translated_value;
                                            }
                                            earningsHomeHeader = new EarningsHomeHeader(str2, z2);
                                        }
                                    }
                                }
                                earningHeaderSection = null;
                                if (earningHeaderSection != null) {
                                    str2 = localizedString.translated_value;
                                }
                                earningsHomeHeader = new EarningsHomeHeader(str2, z2);
                            }
                            obj3 = earningsHomeHeader;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == obj6) {
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj52 = anonymousClass1.result;
                Object obj62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof RecentAddressSearchQueries$addresses$$inlined$map$2$2$1) {
                    recentAddressSearchQueries$addresses$$inlined$map$2$2$1 = (RecentAddressSearchQueries$addresses$$inlined$map$2$2$1) continuation;
                    int i33 = recentAddressSearchQueries$addresses$$inlined$map$2$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        recentAddressSearchQueries$addresses$$inlined$map$2$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj7 = recentAddressSearchQueries$addresses$$inlined$map$2$2$1.result;
                        Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = recentAddressSearchQueries$addresses$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            List<AtmWithdrawalAddressSearch> list3 = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            for (AtmWithdrawalAddressSearch atmWithdrawalAddressSearch : list3) {
                                arrayList.add(new AddressSearch(atmWithdrawalAddressSearch.identifier, atmWithdrawalAddressSearch.created_at, atmWithdrawalAddressSearch.formatted_address, atmWithdrawalAddressSearch.primary_text, atmWithdrawalAddressSearch.secondary_text, atmWithdrawalAddressSearch.latitude, atmWithdrawalAddressSearch.longitude));
                            }
                            recentAddressSearchQueries$addresses$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(arrayList, recentAddressSearchQueries$addresses$$inlined$map$2$2$1) == obj8) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                recentAddressSearchQueries$addresses$$inlined$map$2$2$1 = new RecentAddressSearchQueries$addresses$$inlined$map$2$2$1(this, continuation);
                Object obj72 = recentAddressSearchQueries$addresses$$inlined$map$2$2$1.result;
                Object obj82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = recentAddressSearchQueries$addresses$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof RecentAddressSearchQueries$addresses$$inlined$map$3$2$1) {
                    recentAddressSearchQueries$addresses$$inlined$map$3$2$1 = (RecentAddressSearchQueries$addresses$$inlined$map$3$2$1) continuation;
                    int i34 = recentAddressSearchQueries$addresses$$inlined$map$3$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        recentAddressSearchQueries$addresses$$inlined$map$3$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj9 = recentAddressSearchQueries$addresses$$inlined$map$3$2$1.result;
                        Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = recentAddressSearchQueries$addresses$$inlined$map$3$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            List<BitcoinMapAddressSearch> list4 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            for (BitcoinMapAddressSearch bitcoinMapAddressSearch : list4) {
                                arrayList2.add(new AddressSearch(bitcoinMapAddressSearch.identifier, bitcoinMapAddressSearch.created_at, bitcoinMapAddressSearch.formatted_address, bitcoinMapAddressSearch.primary_text, bitcoinMapAddressSearch.secondary_text, bitcoinMapAddressSearch.latitude, bitcoinMapAddressSearch.longitude));
                            }
                            recentAddressSearchQueries$addresses$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, recentAddressSearchQueries$addresses$$inlined$map$3$2$1) == obj10) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                recentAddressSearchQueries$addresses$$inlined$map$3$2$1 = new RecentAddressSearchQueries$addresses$$inlined$map$3$2$1(this, continuation);
                Object obj92 = recentAddressSearchQueries$addresses$$inlined$map$3$2$1.result;
                Object obj102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = recentAddressSearchQueries$addresses$$inlined$map$3$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof DirectDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1) {
                    directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1 = (DirectDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                    int i35 = directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj11 = directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                        Object obj12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            if (jurisdictionConfigManager$JurisdictionConfig == null || (obj2 = jurisdictionConfigManager$JurisdictionConfig.defaultCurrency) == null) {
                                obj2 = CurrencyCode.USD;
                            }
                            directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1) == obj12) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1 = new DirectDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                Object obj112 = directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                Object obj122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = directDepositEditPaycheckCurrencyAllocationPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof DirectDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 = (DirectDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i36 = directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj13 = directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        Object obj14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            Object obj15 = ((PublicProfile) obj).fullName;
                            str = obj15 != null ? obj15 : "";
                            directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) == obj14) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 = new DirectDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj132 = directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                Object obj142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = directDepositManualFormDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof DirectDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1 = (DirectDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i37 = directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj16 = directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            UiDda uiDda = (UiDda) obj;
                            Object obj18 = uiDda != null ? uiDda.account : null;
                            directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj18, directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1) == obj17) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1 = new DirectDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj162 = directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                Object obj172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = directDepositSetupPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof DirectDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1) {
                    directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1 = (DirectDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                    int i38 = directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj19 = directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                        Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            UiConfiguration uiConfiguration = (UiConfiguration) obj;
                            if (uiConfiguration != null && (paychecksHomeUi = uiConfiguration.paychecks_home_ui) != null && (termsOfService = paychecksHomeUi.paychecks_terms) != null && (list2 = termsOfService.text) != null) {
                                obj4 = CollectionsKt.joinToString$default(list2, "\n\n", null, null, 0, null, DirectDepositSetupPresenter$models$paychecksDisclosure$2$2$1.INSTANCE, 30);
                            }
                            directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj4, directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1) == obj20) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1 = new DirectDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj192 = directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = directDepositSetupPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof DirectDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1) {
                    directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1 = (DirectDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1) continuation;
                    int i39 = directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj21 = directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj23 = jurisdictionConfigManager$JurisdictionConfig2 != null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                            directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj23, directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1) == obj22) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1 = new DirectDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1(this, continuation);
                Object obj212 = directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                Object obj222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = directDepositUpdateManualFormDetailsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof RealFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1) {
                    realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1 = (RealFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1) continuation;
                    int i40 = realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.result;
                        Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            List list5 = (List) obj;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel((Recipient) it2.next())));
                            }
                            realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList3, realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1) == obj25) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1 = new RealFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.result;
                Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realFamilyAppletTileRepository$dependentAvatarsFlow$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof RealFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1) {
                    realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1 = (RealFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1) continuation;
                    int i41 = realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.result;
                        Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            Object obj28 = ((Set) obj).contains(EligibleFeature.MONEY_FAMILIES_APPLET) ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
                            realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj28, realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1) == obj27) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1 = new RealFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.result;
                Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = realFamilyAppletTileRepository$moneyFamiliesAppletAvailable$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof RealDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1) {
                    realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1 = (RealDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1) continuation;
                    int i42 = realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj29 = realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.result;
                        Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            Object valueOf = Boolean.valueOf(((ActivityEvent) obj).started);
                            realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1) == obj30) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1 = new RealDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj292 = realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.result;
                Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realDependentBalancesStore$balances_fUqyM7Y$lambda$2$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof RealDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1) {
                    realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1 = (RealDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1) continuation;
                    int i43 = realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj31 = realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.result;
                        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig3 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj33 = jurisdictionConfigManager$JurisdictionConfig3 != null ? jurisdictionConfigManager$JurisdictionConfig3.defaultCurrency : null;
                            realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj33, realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1) == obj32) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1 = new RealDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj312 = realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.result;
                Object obj322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realDependentBalancesStore$balances_fUqyM7Y$lambda$6$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof RealDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1) {
                    realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1 = (RealDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1) continuation;
                    int i44 = realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj34 = realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.result;
                        Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig4 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj36 = jurisdictionConfigManager$JurisdictionConfig4 != null ? jurisdictionConfigManager$JurisdictionConfig4.defaultCurrency : null;
                            realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj36, realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1) == obj35) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1 = new RealDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj342 = realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.result;
                Object obj352 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realDependentBalancesStore$bitcoinBalance$lambda$0$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof RealDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1) {
                    realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1 = (RealDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1) continuation;
                    int i45 = realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj37 = realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.result;
                        Object obj38 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig5 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj39 = jurisdictionConfigManager$JurisdictionConfig5 != null ? jurisdictionConfigManager$JurisdictionConfig5.defaultCurrency : null;
                            realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj39, realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1) == obj38) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1 = new RealDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj372 = realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.result;
                Object obj382 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = realDependentBalancesStore$savingsBalance$lambda$0$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof RealDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1) {
                    realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1 = (RealDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1) continuation;
                    int i46 = realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj40 = realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.result;
                        Object obj41 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj40);
                            SavingsGoalLocalStatus savingsGoalLocalStatus = (SavingsGoalLocalStatus) obj;
                            Object obj42 = savingsGoalLocalStatus != null ? savingsGoalLocalStatus.last_seen_balance : null;
                            realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj42, realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1) == obj41) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj40);
                        }
                        break;
                    }
                }
                realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1 = new RealDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1(this, continuation);
                Object obj402 = realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.result;
                Object obj412 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = realDependentSavingsStore$lastBalanceSeen$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof BaseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1) {
                    baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1 = (BaseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1) continuation;
                    int i47 = baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj43 = baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.result;
                        Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj43);
                            Recipient recipient = (Recipient) obj;
                            if (recipient != null && (firstName = recipient.getFirstName()) != null) {
                                str = firstName;
                            }
                            baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1) == obj44) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj43);
                        }
                        break;
                    }
                }
                baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1 = new BaseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1(this, continuation);
                Object obj432 = baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.result;
                Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = baseDependentControlPresenter$dependentFirstName$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof DependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1 = (DependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i48 = dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj45 = dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj45);
                            Recipient recipient2 = (Recipient) obj;
                            if (recipient2 != null && (firstName2 = recipient2.getFirstName()) != null) {
                                str = firstName2;
                            }
                            dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1) == obj46) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj45);
                        }
                        break;
                    }
                }
                dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1 = new DependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj452 = dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                Object obj462 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = dependentActivityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1) {
                    dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1 = (DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                    int i49 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj47 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                        Object obj48 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj47);
                            Object obj49 = (Recipient) obj;
                            obj49.getClass();
                            dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj49, dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1) == obj48) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj47);
                        }
                        break;
                    }
                }
                dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1 = new DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj472 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                Object obj482 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1) {
                    dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1 = (DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1) continuation;
                    int i50 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj50 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.result;
                        Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj50);
                            Object firstName4 = ((Recipient) obj).getFirstName();
                            dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(firstName4, dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1) == obj51) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj50);
                        }
                        break;
                    }
                }
                dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1 = new DependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1(this, continuation);
                Object obj502 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.result;
                Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = dependentControlsAndLimitsPresenter$models$lambda$4$$inlined$map$2$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof DependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1) {
                    dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1 = (DependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                    int i51 = dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj53 = dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                        Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj53);
                            DependentControlStatus dependentControlStatus = (DependentControlStatus) obj;
                            if ((dependentControlStatus instanceof DependentControlStatus.Loaded) && !((DependentControlStatus.Loaded) dependentControlStatus).getControlEnabled()) {
                                z = true;
                            }
                            Object valueOf2 = Boolean.valueOf(z);
                            dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1) == obj54) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj53);
                        }
                        break;
                    }
                }
                dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1 = new DependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                Object obj532 = dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = dependentDetailPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof DependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1) {
                    dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1 = (DependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1) continuation;
                    int i52 = dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj55 = dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                        Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj55);
                            DependentControlStatus dependentControlStatus2 = (DependentControlStatus) obj;
                            if ((dependentControlStatus2 instanceof DependentControlStatus.Loaded) && !((DependentControlStatus.Loaded) dependentControlStatus2).getControlEnabled()) {
                                z = true;
                            }
                            Object valueOf3 = Boolean.valueOf(z);
                            dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1) == obj56) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj55);
                        }
                        break;
                    }
                }
                dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1 = new DependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1(this, continuation);
                Object obj552 = dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = dependentDetailPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1) {
                    dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1 = (DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1) continuation;
                    int i53 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj57 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                        Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj57);
                            ActiveGoalProvider activeGoalProvider = (ActiveGoalProvider) obj;
                            Object obj59 = activeGoalProvider != null ? activeGoalProvider.get() : null;
                            dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj59, dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1) == obj58) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj57);
                        }
                        break;
                    }
                }
                dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1 = new DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1(this, continuation);
                Object obj572 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1) {
                    dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1 = (DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1) continuation;
                    int i54 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj60 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.result;
                        Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj60);
                            ActiveGoalProvider activeGoalProvider2 = (ActiveGoalProvider) obj;
                            Object obj63 = activeGoalProvider2 != null ? activeGoalProvider2.get() : null;
                            dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj63, dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1) == obj61) {
                                break;
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj60);
                        }
                        break;
                    }
                }
                dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1 = new DependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1(this, continuation);
                Object obj602 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.result;
                Object obj612 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = dependentSavingsScreenPresenter$models$lambda$12$$inlined$map$2$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof DependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1) {
                    dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1 = (DependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                    int i55 = dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj64 = dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                        Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj64);
                            Object loadedSavingsModel = new LoadedSavingsModel((Money) obj);
                            dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loadedSavingsModel, dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1) == obj65) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj64);
                        }
                        break;
                    }
                }
                dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1 = new DependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                Object obj642 = dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = dependentSavingsScreenPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof ManagedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1) {
                    managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1 = (ManagedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1) continuation;
                    int i56 = managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj66 = managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.result;
                        Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj66);
                            Recipient recipient3 = (Recipient) obj;
                            if (recipient3 != null && (firstName3 = recipient3.getFirstName()) != null) {
                                str = firstName3;
                            }
                            managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1) == obj67) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj66);
                        }
                        break;
                    }
                }
                managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1 = new ManagedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj662 = managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.result;
                Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = managedAccountControlPresenter$dependentFirstName$lambda$0$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof RealFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1) {
                    realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1 = (RealFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1) continuation;
                    int i57 = realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj68 = realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.result;
                        Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj68);
                            Recipient recipient4 = (Recipient) obj;
                            Object firstName5 = recipient4 != null ? recipient4.getFirstName() : null;
                            realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(firstName5, realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1) == obj69) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj68);
                        }
                        break;
                    }
                }
                realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1 = new RealFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj682 = realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.result;
                Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realFamilyProfileManager$familyProfile$lambda$0$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof SelectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1 = (SelectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i58 = selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj70 = selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj70);
                            Object execute = ((ContactBook$DetailedContactQuery) obj).execute();
                            selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(execute, selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1) == obj71) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj70);
                        }
                        break;
                    }
                }
                selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1 = new SelectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj702 = selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = selectContactMethodPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof SelectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1) {
                    selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1 = (SelectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                    int i59 = selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj73 = selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                        Object obj74 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj73);
                            List list6 = ((RecipientRepository$Result) obj).sections;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj75 : list6) {
                                if (!((Section) obj75).recipients.isEmpty()) {
                                    arrayList4.add(obj75);
                                }
                            }
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                Section section = (Section) it3.next();
                                linkedHashMap.put(section.f1192type, section.recipients);
                            }
                            selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashMap, selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1) == obj74) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj73);
                        }
                        break;
                    }
                }
                selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1 = new SelectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj732 = selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                Object obj742 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = selectSponsorPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof RealFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1) {
                    realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1 = (RealFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1) continuation;
                    int i60 = realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj76 = realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.result;
                        Object obj77 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj76);
                            List list7 = (List) obj;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                            Iterator it4 = list7.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(com.squareup.cash.recipients.data.Recipient.copy$default(DrawableCompat.transform(RecipientUtil.createRecipient((ActivityRecipient) it4.next(), false), EmptyList.INSTANCE, EmptySet.INSTANCE), null, null, null, null, null, null, null, true, false, Integer.MAX_VALUE, 3));
                            }
                            realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList5, realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1) == obj77) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj76);
                        }
                        break;
                    }
                }
                realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1 = new RealFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1(this, continuation);
                Object obj762 = realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.result;
                Object obj772 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realFavoritesRepository$getFavorites$lambda$1$$inlined$mapItems$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof AddFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1) {
                    addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1 = (AddFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1) continuation;
                    int i61 = addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj78 = addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.result;
                        Object obj79 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj78);
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it5 = ((List) obj).iterator();
                            while (it5.hasNext()) {
                                String str3 = ((com.squareup.cash.recipients.data.Recipient) it5.next()).customerId;
                                if (str3 != null) {
                                    arrayList6.add(str3);
                                }
                            }
                            addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList6, addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1) == obj79) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj78);
                        }
                        break;
                    }
                }
                addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1 = new AddFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1(this, continuation);
                Object obj782 = addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.result;
                Object obj792 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = addFavoritesPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
