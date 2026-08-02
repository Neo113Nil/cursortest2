package com.squareup.cash.db2.profile;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.paraphrase.FormattedResource;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.n;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.time.zzbq;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.entities.SyncEntityQueries$ForEntityIdAndTypeQuery;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositExpiredBarcodeView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewEvent;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.directory_ui.views.MooncakeHeaderView;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earningstracker.applets.viewmodels.AxisFreeBarViewModel;
import com.squareup.cash.earningstracker.applets.viewmodels.BarColor;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.ApprovedContactsControlPresenter;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlDependencies;
import com.squareup.cash.family.familyhub.presenters.CashCardControlPresenter;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountControlPresenter;
import com.squareup.cash.family.familyhub.presenters.P2PControlPresenter;
import com.squareup.cash.family.familyhub.presenters.PromotionsControlPresenter;
import com.squareup.cash.family.familyhub.presenters.StocksControlPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import okio.internal.ResourceFileSystem;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda13(RealFamilyAppletTileRepository realFamilyAppletTileRepository, FamilyAppletConfig.Sponsor sponsor, String str) {
        this.$r8$classId = 23;
        this.f$0 = sponsor;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        List list;
        FormattedResource formattedResource;
        BarColor barColor;
        Money money;
        Integer num;
        Integer num2;
        int i2 = this.$r8$classId;
        boolean z = true;
        Long l = null;
        int i3 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i2) {
            case 0:
                CurrencyCode currencyCode = (CurrencyCode) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, currencyCode != null ? (String) ((EnumColumnAdapter) ((Profile.Adapter) instrumentQueries.instrumentAdapter).bitcoin_amount_entry_currency_preferenceAdapter).encode(currencyCode) : null);
                return Unit.INSTANCE;
            case 1:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, ((SyncEntityQueries$ForEntityIdAndTypeQuery) obj3).entity_id);
                ((ResourceFileSystem.Companion) ((InstrumentQueries) obj2).instrumentAdapter).getClass();
                androidStatement2.bindLong(1, Long.valueOf(r0.f1122type));
                return Unit.INSTANCE;
            case 2:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                Integer num3 = (Integer) ((RewardQueries.ForIdsQuery) obj3).token;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    ((ResourceFileSystem.Companion) instrumentQueries2.instrumentAdapter).getClass();
                    l = Long.valueOf(intValue);
                }
                androidStatement3.bindLong(0, l);
                return Unit.INSTANCE;
            case 3:
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                TransferType transferType = (TransferType) ((RewardQueries.ForIdsQuery) obj3).token;
                androidStatement4.bindString(0, transferType != null ? (String) ((ScenarioPlan.Adapter) rewardSlotQueries.rewardSlotAdapter).client_scenarioAdapter.encode(transferType) : null);
                return Unit.INSTANCE;
            case 4:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) obj3;
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindBytes(0, (byte[]) ((WireAdapter) ((zzlj) instrumentQueries3.instrumentAdapter).zzb).encode((Money) badgeQueries$VersionQuery.external_token));
                androidStatement5.bindString(1, (String) ((EnumColumnAdapter) ((zzlj) instrumentQueries3.instrumentAdapter).zzc).encode((Orientation) badgeQueries$VersionQuery.item_type));
                return Unit.INSTANCE;
            case 5:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, (String) ((ScenarioPlan.Adapter) ((InstrumentQueries) obj3).instrumentAdapter).client_scenarioAdapter.encode((LimitedAction) ((RewardQueries.ForIdsQuery) obj2).token));
                return Unit.INSTANCE;
            case 6:
                InstrumentQueries instrumentQueries4 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                Iterator it = ((Collection) ((RewardQueries.ForIdsQuery) obj3).token).iterator();
                while (it.hasNext()) {
                    androidStatement7.bindString(i3, (String) ((ScenarioPlan.Adapter) instrumentQueries4.instrumentAdapter).client_scenarioAdapter.encode((LimitedAction) it.next()));
                    i3++;
                }
                return Unit.INSTANCE;
            case 7:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((EnumListAdapter) ((InstrumentQueries) obj3).instrumentAdapter).enumColumnAdapter.encode((UiAlias.Type) obj2));
                return Unit.INSTANCE;
            case 8:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, (String) ((EnumListAdapter) ((InstrumentQueries) obj3).instrumentAdapter).enumColumnAdapter.encode((UiAlias.Type) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                return Unit.INSTANCE;
            case 9:
                BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) obj3;
                InstrumentQueries instrumentQueries5 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindString(0, bitcoinDisplayUnits != null ? (String) ((EnumColumnAdapter) ((Profile.Adapter) instrumentQueries5.instrumentAdapter).bitcoin_display_unitsAdapter).encode(bitcoinDisplayUnits) : null);
                return Unit.INSTANCE;
            case 10:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, (String) ((ScenarioPlan.Adapter) ((InstrumentQueries) obj3).instrumentAdapter).client_scenarioAdapter.encode((ClientScenario) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                return Unit.INSTANCE;
            case 11:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, (String) ((EnumListAdapter) ((InstrumentQueries) obj3).instrumentAdapter).enumColumnAdapter.encode((StatementType) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                return Unit.INSTANCE;
            case 12:
                ContactQueries contactQueries = (ContactQueries) obj2;
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                BlockState blockState = (BlockState) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key;
                androidStatement13.bindString(0, blockState != null ? (String) ((EnumColumnAdapter) contactQueries.customerAdapter.interceptors).encode(blockState) : null);
                return Unit.INSTANCE;
            case 13:
                RetailerMapBlocker.SearchScreen searchScreen = (RetailerMapBlocker.SearchScreen) obj3;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                String str = searchScreen.placeholder_text;
                str.getClass();
                String str2 = searchScreen.explanation_title_text;
                str2.getClass();
                return new PhysicalCashDepositAddressEntryScreen(new PhysicalCashDepositAddressEntryScreen.SearchScreen(str, str2, searchScreen.explanation_detail_text, searchScreen.recent_section_header_text, searchScreen.results_section_header), PhysicalCashDepositAddressEntryScreen.AddressSearchType.ATM_WITHDRAWAL, ((AtmWithdrawalMapPresenter) obj2).args.blockersData, askedQuestion);
            case 14:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                return new PhysicalCashDepositAddressEntryScreen((PhysicalCashDepositAddressEntryScreen.SearchScreen) obj3, PhysicalCashDepositAddressEntryScreen.AddressSearchType.PHYSICAL_DEPOSIT, ((PaperMoneyDepositMapPresenter) obj2).args.blockersData, askedQuestion2);
            case 15:
                ((FormView) obj).getClass();
                ((PaperMoneyDepositExpiredBarcodeView) obj3).formView.renderViewModel(((PaperMoneyDepositBarcodeExpiredViewModel.Expired) ((PaperMoneyDepositBarcodeExpiredViewModel) obj2)).formViewModel);
                return Unit.INSTANCE;
            case 16:
                ((Boolean) obj).getClass();
                ((Function1) obj3).invoke(new DirectDepositEditPaycheckAmountViewEvent.SelectPaycheckAmount((PaycheckDepositAllocationType) obj2));
                return Unit.INSTANCE;
            case 17:
                Button button = (Button) obj3;
                Ui.EventReceiver eventReceiver = (Ui.EventReceiver) obj2;
                ((String) obj).getClass();
                Button.ButtonAction buttonAction = button.action_type;
                int i4 = buttonAction == null ? -1 : MooncakeHeaderView.WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        throw new NotImplementedError(null, 1, null);
                    }
                    if (i4 != 2) {
                        if (i4 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return Unit.INSTANCE;
                    }
                }
                eventReceiver.sendEvent(new DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick(button.action_url, null));
                return Unit.INSTANCE;
            case 18:
                ((Context) ((n) obj3).a).unregisterReceiver((zzbq) obj2);
                return Unit.INSTANCE;
            case 19:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                EarningsAllocationDistribution.DestinationAndShare destinationAndShare = (EarningsAllocationDistribution.DestinationAndShare) obj;
                destinationAndShare.getClass();
                String format2 = ((NumberFormat) obj3).format(Float.valueOf(destinationAndShare.shareInBasisPoints / 10000.0f));
                format2.getClass();
                AllocationDestination allocationDestination = destinationAndShare.destination;
                allocationDestination.getClass();
                if (allocationDestination instanceof AllocationDestination.CashBalanceDestination) {
                    i = R.string.earnings_distribution_destination_cash_balance;
                } else if (allocationDestination instanceof AllocationDestination.SavingsDestination) {
                    i = R.string.earnings_distribution_destination_savings;
                } else if (allocationDestination instanceof AllocationDestination.InvestingDestination) {
                    i = R.string.earnings_distribution_destination_stocks;
                } else {
                    if (!(allocationDestination instanceof AllocationDestination.BitcoinDestination)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = R.string.earnings_distribution_destination_bitcoin;
                }
                return Recorder$$ExternalSyntheticOutline2.m(format2, " ", androidStringManager.get(i));
            case 20:
                Function1 function1 = (Function1) obj2;
                DateFilter dateFilter = (DateFilter) obj;
                dateFilter.getClass();
                if (((EarningsHeaderViewModel) obj3).showsChart) {
                    function1.invoke(new EarningsHeaderViewEvent.DateFilterChanged(dateFilter));
                }
                return Unit.INSTANCE;
            case 21:
                Long l2 = (Long) obj;
                l2.getClass();
                return ((MoneyFormatter) obj3).format(new Money(l2, ((EarningsHeaderViewModel.HeaderViewModel.Loaded) obj2).chartCurrencyCode, 4));
            case 22:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) localEditorialPresenter.stringManager;
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) obj2;
                EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
                if (earningsTrackerSummary == null) {
                    return new EarningsAppletTileModel.Uninstalled(androidStringManager2.get(R.string.earnings_applet_title), androidStringManager2.get(R.string.earnings_applet_subtitle), promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null);
                }
                LocalDate localDate = (LocalDate) localEditorialPresenter.navigator;
                EarningsTrackerSummary.Earnings earnings = earningsTrackerSummary.total_earnings;
                LocalDate of = (earnings == null || (num = earnings.month) == null || (num2 = earnings.year) == null) ? null : LocalDate.of(num2.intValue(), num.intValue(), 1);
                String str3 = earnings != null ? earnings.duration : null;
                String format3 = (earnings == null || (money = earnings.amount) == null) ? null : ((MoneyFormatter) localEditorialPresenter.responseContextHandler).format(money);
                String str4 = androidStringManager2.get(R.string.earnings_applet_title);
                if (str3 == null || format3 == null) {
                    return new EarningsAppletTileModel.Failure(str4, new NullPointerException("Expected duration and amount but was null."));
                }
                if (of != null && (localDate.getMonth() != of.getMonth() || localDate.getYear() != of.getYear())) {
                    z = false;
                }
                if (z) {
                    list = earnings != null ? earnings.daily_data : null;
                } else {
                    int lengthOfMonth = localDate.lengthOfMonth();
                    ArrayList arrayList = new ArrayList(lengthOfMonth);
                    while (i3 < lengthOfMonth) {
                        i3++;
                        arrayList.add(new EarningsTrackerSummary.SummaryDailyData(null, Integer.valueOf(i3), ByteString.EMPTY));
                    }
                    list = arrayList;
                }
                if (z) {
                    formattedResource = new FormattedResource(R.string.earnings_applet_title_caption, new Object[]{format3, str3});
                } else {
                    String displayName = localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.US);
                    displayName.getClass();
                    formattedResource = new FormattedResource(R.string.earnings_applet_title_fallback_caption, new Object[]{displayName});
                }
                String string2 = Countries.getString(androidStringManager2.resources, formattedResource);
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return new EarningsAppletTileModel.Installed.Default(str4, string2);
                }
                List<EarningsTrackerSummary.SummaryDailyData> list3 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (EarningsTrackerSummary.SummaryDailyData summaryDailyData : list3) {
                    Integer num4 = summaryDailyData.day;
                    Money money2 = summaryDailyData.amount;
                    Long valueOf = (num4 == null || num4.intValue() > DimensionKt.getSafeDayOfMonth(localDate) || money2 != null) ? money2 != null ? Long.valueOf(Moneys.amount(money2)) : null : 0L;
                    long longValue = valueOf != null ? valueOf.longValue() : 0L;
                    if (valueOf == null) {
                        barColor = BarColor.FUTURE;
                    } else if (valueOf.longValue() == 0) {
                        barColor = BarColor.DISABLED;
                    } else {
                        if (valueOf.longValue() <= 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("The amount should not be negative for earnings tracker");
                            return null;
                        }
                        barColor = BarColor.ACTIVE;
                    }
                    arrayList2.add(new AxisFreeBarViewModel(longValue, barColor));
                }
                return new EarningsAppletTileModel.Installed.Chart(str4, string2, arrayList2);
            case 23:
                String str5 = (String) obj2;
                List list4 = (List) obj;
                list4.getClass();
                return new FamilyAppletTileViewModel.InstalledWithActivity(((FamilyAppletConfig.Sponsor) obj3).title, list4, str5, new FamilyAppletTileViewModel.ActivityType.DependentNames(str5));
            case 24:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies = ((ApprovedContactsControlPresenter) obj3).deps;
                String str6 = baseDependentControlDependencies.stringManager.get(R.string.allow_list_toggle_dialog_title);
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1((String) obj2, " will only be able to send and receive money with people you've approved.");
                AndroidStringManager androidStringManager3 = baseDependentControlDependencies.stringManager;
                return new ControlDisablingConfirmationScreen(str6, m$1, androidStringManager3.get(R.string.allow_list_toggle_dialog_yes), androidStringManager3.get(R.string.allow_list_toggle_dialog_no), ControlType.P2P, askedQuestion3, 64);
            case 25:
                String str7 = (String) obj2;
                AskedQuestion askedQuestion4 = (AskedQuestion) obj;
                askedQuestion4.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies2 = ((StocksControlPresenter) obj3).deps;
                String str8 = baseDependentControlDependencies2.stringManager.get(R.string.family_account_dependent_bitcoin_investing_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager4 = baseDependentControlDependencies2.stringManager;
                ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str7, "first_name", str7);
                Resources resources = androidStringManager4.resources;
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.family_account_dependent_bitcoin_investing_disabling_confirmation_dialog_message)).format(m);
                format4.getClass();
                return new ControlDisablingConfirmationScreen(str8, format4, androidStringManager4.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager4.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.BITCOIN, askedQuestion4, 96);
            case 26:
                String str9 = (String) obj2;
                AskedQuestion askedQuestion5 = (AskedQuestion) obj;
                askedQuestion5.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies3 = ((CashCardControlPresenter) obj3).deps;
                String str10 = baseDependentControlDependencies3.stringManager.get(R.string.family_account_dependent_cash_app_card_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager5 = baseDependentControlDependencies3.stringManager;
                ArrayMap m2 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str9, "first_name", str9);
                Resources resources2 = androidStringManager5.resources;
                resources2.getClass();
                String format5 = new MessageFormat(resources2.getString(R.string.family_account_dependent_card_disabling_confirmation_dialog_message)).format(m2);
                format5.getClass();
                return new ControlDisablingConfirmationScreen(str10, format5, androidStringManager5.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager5.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.CASH_CARD, askedQuestion5, 96);
            case 27:
                String str11 = (String) obj2;
                AskedQuestion askedQuestion6 = (AskedQuestion) obj;
                askedQuestion6.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies4 = ((ManagedAccountControlPresenter) obj3).deps;
                String str12 = baseDependentControlDependencies4.stringManager.get(R.string.family_account_dependent_cash_app_card_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager6 = baseDependentControlDependencies4.stringManager;
                ArrayMap m3 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str11, "first_name", str11);
                Resources resources3 = androidStringManager6.resources;
                resources3.getClass();
                String format6 = new MessageFormat(resources3.getString(R.string.family_account_dependent_card_disabling_confirmation_dialog_message)).format(m3);
                format6.getClass();
                return new ControlDisablingConfirmationScreen(str12, format6, androidStringManager6.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager6.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.CASH_CARD, askedQuestion6, 64);
            case 28:
                String str13 = (String) obj2;
                AskedQuestion askedQuestion7 = (AskedQuestion) obj;
                askedQuestion7.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies5 = ((P2PControlPresenter) obj3).deps;
                String str14 = baseDependentControlDependencies5.stringManager.get(R.string.family_account_dependent_p2p_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager7 = baseDependentControlDependencies5.stringManager;
                str13.getClass();
                Resources resources4 = androidStringManager7.resources;
                resources4.getClass();
                String format7 = new MessageFormat(resources4.getString(R.string.family_account_dependent_p2p_disabling_confirmation_dialog_body)).format(new Object[]{str13});
                format7.getClass();
                return new ControlDisablingConfirmationScreen(str14, format7, androidStringManager7.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager7.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.P2P, askedQuestion7, 96);
            default:
                String str15 = (String) obj2;
                AskedQuestion askedQuestion8 = (AskedQuestion) obj;
                askedQuestion8.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies6 = ((PromotionsControlPresenter) obj3).deps;
                String str16 = baseDependentControlDependencies6.stringManager.get(R.string.family_account_dependent_promotions_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager8 = baseDependentControlDependencies6.stringManager;
                ArrayMap m4 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str15, "first_name", str15);
                Resources resources5 = androidStringManager8.resources;
                resources5.getClass();
                String format8 = new MessageFormat(resources5.getString(R.string.family_account_dependent_promotions_disabling_confirmation_dialog_message)).format(m4);
                format8.getClass();
                return new ControlDisablingConfirmationScreen(str16, format8, androidStringManager8.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager8.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.PROMOTIONS, askedQuestion8, 96);
        }
    }

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda13(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda13(Button button, Ui.EventReceiver eventReceiver, DirectoryListItem.Header header) {
        this.$r8$classId = 17;
        this.f$0 = button;
        this.f$1 = eventReceiver;
    }
}
