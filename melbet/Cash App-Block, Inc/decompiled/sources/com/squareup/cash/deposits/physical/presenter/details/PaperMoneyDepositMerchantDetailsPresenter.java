package com.squareup.cash.deposits.physical.presenter.details;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMerchantDetailsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PaperMoneyDepositMerchantDetailsScreen args;
    public final RealClipboardManager clipboardManager;
    public final IntentLauncher launcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public PaperMoneyDepositMerchantDetailsPresenter(PaperMoneyDepositMerchantDetailsScreen paperMoneyDepositMerchantDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator, IntentLauncher intentLauncher, RealClipboardManager realClipboardManager, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics) {
        paperMoneyDepositMerchantDetailsScreen.getClass();
        this.args = paperMoneyDepositMerchantDetailsScreen;
        this.navigator = screenNavigator;
        this.launcher = intentLauncher;
        this.clipboardManager = realClipboardManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        realRouter$Factory$Impl.create$1(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        String str;
        String str2;
        String str3;
        Money money;
        LocationDetailsViewModel.FeeViewModel feeViewModel;
        LocationDetailsViewModel.DepositMethod depositMethod;
        LocationDetailsViewModel.FeeViewModel feeViewModel2;
        boolean z;
        Object paperMoneyDepositMerchantViewModel;
        Continuation continuation;
        Money money2;
        LocationDetailsViewModel.FeeViewModel feeViewModel3;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(885395918);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation2 = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation2, 6);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        boolean changed = gapComposer.changed((String) mutableState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            PaperMoneyDepositMerchantDetailsScreen paperMoneyDepositMerchantDetailsScreen = this.args;
            PaperCashDepositBlocker paperCashDepositBlocker = paperMoneyDepositMerchantDetailsScreen.paperCashDepositBlocker;
            GetRetailerLocationsResponse.RetailerLocation retailerLocation = paperMoneyDepositMerchantDetailsScreen.retailerLocation;
            PaperCashDepositBlocker.MerchantOptions merchantOptions = paperCashDepositBlocker.merchant_options;
            if (merchantOptions == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            String str4 = retailerLocation.retailer_name;
            GetRetailerLocationsResponse.DepositMethods depositMethods = retailerLocation.deposit_methods;
            str4.getClass();
            String str5 = retailerLocation.retailer_icon_url;
            GlobalAddress globalAddress = retailerLocation.address;
            globalAddress.getClass();
            String buildAsString = AddressKt.buildAsString(globalAddress, false);
            String str6 = retailerLocation.deposit_location;
            String str7 = merchantOptions.directions_button_text;
            str7.getClass();
            String str8 = merchantOptions.show_barcode_button_text;
            str8.getClass();
            String str9 = merchantOptions.copy_address_button_text;
            str9.getClass();
            Money money3 = retailerLocation.fee_amount;
            AndroidStringManager androidStringManager = this.stringManager;
            if (money3 != null) {
                Long l = money3.amount;
                if (l != null && l.longValue() == 0) {
                    mutableState = mutableState2;
                    str = str9;
                    feeViewModel3 = new LocationDetailsViewModel.FeeViewModel(LocationDetailsViewModel.LocationDetailsIcon.Zero, androidStringManager.get(R.string.pmd_retailer_zero_fees_label), androidStringManager.get(R.string.pmd_retailer_zero_fees_body), null);
                    str2 = str8;
                    str3 = str5;
                    money = null;
                } else {
                    mutableState = mutableState2;
                    str = str9;
                    LocationDetailsViewModel.LocationDetailsIcon locationDetailsIcon = LocationDetailsViewModel.LocationDetailsIcon.Currency;
                    String str10 = androidStringManager.get(R.string.pmd_retailer_fees_label);
                    String format2 = this.moneyFormatter.format(money3);
                    format2.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    str2 = str8;
                    str3 = str5;
                    String format3 = new MessageFormat(resources.getString(R.string.pmd_retailer_fees_body)).format(new Object[]{format2});
                    format3.getClass();
                    money = null;
                    feeViewModel3 = new LocationDetailsViewModel.FeeViewModel(locationDetailsIcon, str10, format3, null);
                }
                feeViewModel = feeViewModel3;
            } else {
                mutableState = mutableState2;
                str = str9;
                str2 = str8;
                str3 = str5;
                money = null;
                feeViewModel = null;
            }
            if ((depositMethods != null ? depositMethods.min_scan_amount : money) != null) {
                boolean areEqual = Intrinsics.areEqual(depositMethods.scan, Boolean.TRUE);
                LocationDetailsViewModel.LocationDetailsIcon locationDetailsIcon2 = LocationDetailsViewModel.LocationDetailsIcon.Barcode;
                String str11 = androidStringManager.get(R.string.location_barcode_label);
                Money money4 = depositMethods.min_scan_amount;
                money4.getClass();
                depositMethod = new LocationDetailsViewModel.DepositMethod(areEqual, locationDetailsIcon2, str11, toMinimumResourceString(money4));
            } else {
                depositMethod = money;
            }
            boolean areEqual2 = depositMethods != null ? Intrinsics.areEqual(depositMethods.swipe, Boolean.TRUE) : false;
            LocationDetailsViewModel.LocationDetailsIcon locationDetailsIcon3 = LocationDetailsViewModel.LocationDetailsIcon.Card;
            String str12 = androidStringManager.get(R.string.location_card_swipe_label);
            if (depositMethods != null) {
                feeViewModel2 = feeViewModel;
                z = Intrinsics.areEqual(depositMethods.swipe, Boolean.TRUE);
            } else {
                feeViewModel2 = feeViewModel;
                z = false;
            }
            continuation = null;
            paperMoneyDepositMerchantViewModel = new LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel((String) mutableState.getValue(), ArraysKt___ArraysKt.filterNotNull(new LocationDetailsViewModel.DepositMethod[]{depositMethod, new LocationDetailsViewModel.DepositMethod(areEqual2, locationDetailsIcon3, str12, (!z || (money2 = depositMethods.min_swipe_amount) == null) ? androidStringManager.get(R.string.location_card_swipe_unavailable) : toMinimumResourceString(money2))}), str3, buildAsString, str4, str6, str7, str2, feeViewModel2, str, retailerLocation.support_button_text, retailerLocation.retailer_accent_color, retailerLocation.retailer_title_color);
            gapComposer.updateRememberedValue(paperMoneyDepositMerchantViewModel);
        } else {
            mutableState = mutableState2;
            paperMoneyDepositMerchantViewModel = rememberedValue3;
            continuation = null;
        }
        LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel paperMoneyDepositMerchantViewModel2 = (LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel) paperMoneyDepositMerchantViewModel;
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 21));
        gapComposer.end(false);
        return paperMoneyDepositMerchantViewModel2;
    }

    public final String toMinimumResourceString(Money money) {
        String format2 = this.moneyFormatter.format(money);
        format2.getClass();
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.location_minimum)).format(new Object[]{format2});
        format3.getClass();
        return format3;
    }
}
