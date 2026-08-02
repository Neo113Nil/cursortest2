package com.squareup.cash.db2.profile;

import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.views.InlineAppMessageView$Factory$Impl;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.treehouse.accessibility.RealAccessibilityCallbackService;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final class Profile {
    public final GlobalAddress address;
    public final boolean app_message_notifications_enabled;
    public final List available_p2p_target_regions;
    public final CurrencyCode bitcoin_amount_entry_currency_preference;
    public final BitcoinDisplayUnits bitcoin_display_units;
    public final boolean can_upgrade_to_business;
    public final String cashtag;
    public final String cashtag_qr_image_url;
    public final String cashtag_url;
    public final String cashtag_url_display_text;
    public final boolean cashtag_url_enabled;
    public final String cashtag_with_currency_symbol;
    public final Country country_code;
    public final Long customer_since;
    public final CurrencyCode default_currency;
    public final DepositPreference deposit_preference;
    public final DepositPreferenceData deposit_preference_data;
    public final boolean direct_deposit_account_enabled;
    public final String full_name;
    public final boolean has_passcode;
    public final Boolean has_passed_idv;
    public final IncomingRequestPolicy incoming_request_policy;
    public final boolean is_verified_account;
    public final NearbyVisibility nearby_visibility;
    public final String photo_url;
    public final String printable_cashtag_qr_image_url;
    public final String profile_id;
    public final String profile_token;
    public final RatePlan rate_plan;
    public final Region region;
    public final int request_minimum_note_length;
    public final boolean require_passcode_confirmation;
    public final String verification_instrument_token;

    public Profile(String str, String str2, String str3, boolean z, boolean z2, NearbyVisibility nearbyVisibility, String str4, String str5, String str6, boolean z3, RatePlan ratePlan, boolean z4, boolean z5, boolean z6, String str7, DepositPreference depositPreference, GlobalAddress globalAddress, DepositPreferenceData depositPreferenceData, int i, Country country, CurrencyCode currencyCode, Long l, String str8, IncomingRequestPolicy incomingRequestPolicy, Boolean bool, String str9, String str10, List list, String str11, Region region, boolean z7, BitcoinDisplayUnits bitcoinDisplayUnits, CurrencyCode currencyCode2) {
        this.profile_id = str;
        this.full_name = str2;
        this.photo_url = str3;
        this.require_passcode_confirmation = z;
        this.has_passcode = z2;
        this.nearby_visibility = nearbyVisibility;
        this.cashtag = str4;
        this.cashtag_url = str5;
        this.cashtag_url_display_text = str6;
        this.cashtag_url_enabled = z3;
        this.rate_plan = ratePlan;
        this.can_upgrade_to_business = z4;
        this.is_verified_account = z5;
        this.app_message_notifications_enabled = z6;
        this.verification_instrument_token = str7;
        this.deposit_preference = depositPreference;
        this.address = globalAddress;
        this.deposit_preference_data = depositPreferenceData;
        this.request_minimum_note_length = i;
        this.country_code = country;
        this.default_currency = currencyCode;
        this.customer_since = l;
        this.profile_token = str8;
        this.incoming_request_policy = incomingRequestPolicy;
        this.has_passed_idv = bool;
        this.cashtag_qr_image_url = str9;
        this.cashtag_with_currency_symbol = str10;
        this.available_p2p_target_regions = list;
        this.printable_cashtag_qr_image_url = str11;
        this.region = region;
        this.direct_deposit_account_enabled = z7;
        this.bitcoin_display_units = bitcoinDisplayUnits;
        this.bitcoin_amount_entry_currency_preference = currencyCode2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return this.profile_id.equals(profile.profile_id) && Intrinsics.areEqual(this.full_name, profile.full_name) && Intrinsics.areEqual(this.photo_url, profile.photo_url) && this.require_passcode_confirmation == profile.require_passcode_confirmation && this.has_passcode == profile.has_passcode && this.nearby_visibility == profile.nearby_visibility && Intrinsics.areEqual(this.cashtag, profile.cashtag) && Intrinsics.areEqual(this.cashtag_url, profile.cashtag_url) && Intrinsics.areEqual(this.cashtag_url_display_text, profile.cashtag_url_display_text) && this.cashtag_url_enabled == profile.cashtag_url_enabled && this.rate_plan == profile.rate_plan && this.can_upgrade_to_business == profile.can_upgrade_to_business && this.is_verified_account == profile.is_verified_account && this.app_message_notifications_enabled == profile.app_message_notifications_enabled && Intrinsics.areEqual(this.verification_instrument_token, profile.verification_instrument_token) && this.deposit_preference == profile.deposit_preference && Intrinsics.areEqual(this.address, profile.address) && Intrinsics.areEqual(this.deposit_preference_data, profile.deposit_preference_data) && this.request_minimum_note_length == profile.request_minimum_note_length && this.country_code == profile.country_code && this.default_currency == profile.default_currency && Intrinsics.areEqual(this.customer_since, profile.customer_since) && Intrinsics.areEqual(this.profile_token, profile.profile_token) && this.incoming_request_policy == profile.incoming_request_policy && Intrinsics.areEqual(this.has_passed_idv, profile.has_passed_idv) && Intrinsics.areEqual(this.cashtag_qr_image_url, profile.cashtag_qr_image_url) && Intrinsics.areEqual(this.cashtag_with_currency_symbol, profile.cashtag_with_currency_symbol) && Intrinsics.areEqual(this.available_p2p_target_regions, profile.available_p2p_target_regions) && Intrinsics.areEqual(this.printable_cashtag_qr_image_url, profile.printable_cashtag_qr_image_url) && this.region == profile.region && this.direct_deposit_account_enabled == profile.direct_deposit_account_enabled && this.bitcoin_display_units == profile.bitcoin_display_units && this.bitcoin_amount_entry_currency_preference == profile.bitcoin_amount_entry_currency_preference;
    }

    public final int hashCode() {
        int hashCode = this.profile_id.hashCode() * 31;
        String str = this.full_name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo_url;
        int hashCode3 = (this.nearby_visibility.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.require_passcode_confirmation), 31, this.has_passcode)) * 31;
        String str3 = this.cashtag;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cashtag_url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cashtag_url_display_text;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.rate_plan.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.cashtag_url_enabled)) * 31, 31, this.can_upgrade_to_business), 31, this.is_verified_account), 31, this.app_message_notifications_enabled);
        String str6 = this.verification_instrument_token;
        int hashCode6 = (m + (str6 == null ? 0 : str6.hashCode())) * 31;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode7 = (hashCode6 + (depositPreference == null ? 0 : depositPreference.hashCode())) * 31;
        GlobalAddress globalAddress = this.address;
        int hashCode8 = (hashCode7 + (globalAddress == null ? 0 : globalAddress.hashCode())) * 31;
        DepositPreferenceData depositPreferenceData = this.deposit_preference_data;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.request_minimum_note_length, (hashCode8 + (depositPreferenceData == null ? 0 : depositPreferenceData.hashCode())) * 31, 31);
        Country country = this.country_code;
        int hashCode9 = (this.default_currency.hashCode() + ((m2 + (country == null ? 0 : country.hashCode())) * 31)) * 31;
        Long l = this.customer_since;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.profile_token;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        int hashCode12 = (hashCode11 + (incomingRequestPolicy == null ? 0 : incomingRequestPolicy.hashCode())) * 31;
        Boolean bool = this.has_passed_idv;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.cashtag_qr_image_url;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cashtag_with_currency_symbol;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.available_p2p_target_regions;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.printable_cashtag_qr_image_url;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Region region = this.region;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode17 + (region == null ? 0 : region.hashCode())) * 31, 31, this.direct_deposit_account_enabled);
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        int hashCode18 = (m3 + (bitcoinDisplayUnits == null ? 0 : bitcoinDisplayUnits.hashCode())) * 31;
        CurrencyCode currencyCode = this.bitcoin_amount_entry_currency_preference;
        return hashCode18 + (currencyCode != null ? currencyCode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Profile(profile_id=", this.profile_id, ", full_name=", this.full_name, ", photo_url=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.photo_url, ", require_passcode_confirmation=", this.require_passcode_confirmation, ", has_passcode=");
        m.append(this.has_passcode);
        m.append(", nearby_visibility=");
        m.append(this.nearby_visibility);
        m.append(", cashtag=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cashtag, ", cashtag_url=", this.cashtag_url, ", cashtag_url_display_text=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.cashtag_url_display_text, ", cashtag_url_enabled=", this.cashtag_url_enabled, ", rate_plan=");
        m.append(this.rate_plan);
        m.append(", can_upgrade_to_business=");
        m.append(this.can_upgrade_to_business);
        m.append(", is_verified_account=");
        re$$ExternalSyntheticOutline0.m(m, this.is_verified_account, ", app_message_notifications_enabled=", this.app_message_notifications_enabled, ", verification_instrument_token=");
        m.append(this.verification_instrument_token);
        m.append(", deposit_preference=");
        m.append(this.deposit_preference);
        m.append(", address=");
        m.append(this.address);
        m.append(", deposit_preference_data=");
        m.append(this.deposit_preference_data);
        m.append(", request_minimum_note_length=");
        m.append(this.request_minimum_note_length);
        m.append(", country_code=");
        m.append(this.country_code);
        m.append(", default_currency=");
        m.append(this.default_currency);
        m.append(", customer_since=");
        m.append(this.customer_since);
        m.append(", profile_token=");
        m.append(this.profile_token);
        m.append(", incoming_request_policy=");
        m.append(this.incoming_request_policy);
        m.append(", has_passed_idv=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.has_passed_idv, ", cashtag_qr_image_url=", this.cashtag_qr_image_url, ", cashtag_with_currency_symbol=");
        NavAction$$ExternalSyntheticOutline0.m(this.cashtag_with_currency_symbol, ", available_p2p_target_regions=", ", printable_cashtag_qr_image_url=", m, this.available_p2p_target_regions);
        m.append(this.printable_cashtag_qr_image_url);
        m.append(", region=");
        m.append(this.region);
        m.append(", direct_deposit_account_enabled=");
        m.append(this.direct_deposit_account_enabled);
        m.append(", bitcoin_display_units=");
        m.append(this.bitcoin_display_units);
        m.append(", bitcoin_amount_entry_currency_preference=");
        m.append(this.bitcoin_amount_entry_currency_preference);
        m.append(")");
        return m.toString();
    }

    public final class Adapter {
        public final Object addressAdapter;
        public final Object available_p2p_target_regionsAdapter;
        public final Object bitcoin_amount_entry_currency_preferenceAdapter;
        public final Object bitcoin_display_unitsAdapter;
        public final Object country_codeAdapter;
        public final Object default_currencyAdapter;
        public final Object deposit_preferenceAdapter;
        public final Object deposit_preference_dataAdapter;
        public final Object incoming_request_policyAdapter;
        public final Object nearby_visibilityAdapter;
        public final Object rate_planAdapter;
        public final Object regionAdapter;

        public Adapter(RealCashVibrator realCashVibrator, RealSharedReactionState realSharedReactionState, RealImageLoader realImageLoader, Instrument$Adapter instrument$Adapter, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl, InlineAppMessageView$Factory$Impl inlineAppMessageView$Factory$Impl, Flow flow, Provider provider, RealAccessibilityCallbackService realAccessibilityCallbackService, LifecycleOwner lifecycleOwner) {
            provider.getClass();
            this.nearby_visibilityAdapter = realCashVibrator;
            this.rate_planAdapter = realSharedReactionState;
            this.deposit_preferenceAdapter = realImageLoader;
            this.country_codeAdapter = instrument$Adapter;
            this.default_currencyAdapter = tabToolbarPresenter$Factory$Impl;
            this.incoming_request_policyAdapter = inlineAppMessagePresenterHelper$Factory$Impl;
            this.regionAdapter = inlineAppMessageView$Factory$Impl;
            this.bitcoin_display_unitsAdapter = flow;
            this.bitcoin_amount_entry_currency_preferenceAdapter = provider;
            this.addressAdapter = realAccessibilityCallbackService;
            this.deposit_preference_dataAdapter = lifecycleOwner;
            this.available_p2p_target_regionsAdapter = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 4));
        }

        public /* synthetic */ Adapter(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
            this.nearby_visibilityAdapter = provider;
            this.rate_planAdapter = provider2;
            this.deposit_preferenceAdapter = provider3;
            this.country_codeAdapter = provider4;
            this.default_currencyAdapter = provider5;
            this.incoming_request_policyAdapter = provider6;
            this.regionAdapter = provider7;
            this.bitcoin_display_unitsAdapter = provider8;
            this.bitcoin_amount_entry_currency_preferenceAdapter = provider9;
            this.addressAdapter = provider10;
            this.deposit_preference_dataAdapter = provider11;
            this.available_p2p_target_regionsAdapter = provider12;
        }

        public Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, EnumColumnAdapter enumColumnAdapter3, WireAdapter wireAdapter, WireAdapter wireAdapter2, EnumColumnAdapter enumColumnAdapter4, EnumColumnAdapter enumColumnAdapter5, EnumColumnAdapter enumColumnAdapter6, WireRepeatedAdapter wireRepeatedAdapter, EnumColumnAdapter enumColumnAdapter7, EnumColumnAdapter enumColumnAdapter8, EnumColumnAdapter enumColumnAdapter9) {
            this.nearby_visibilityAdapter = enumColumnAdapter;
            this.rate_planAdapter = enumColumnAdapter2;
            this.deposit_preferenceAdapter = enumColumnAdapter3;
            this.addressAdapter = wireAdapter;
            this.deposit_preference_dataAdapter = wireAdapter2;
            this.country_codeAdapter = enumColumnAdapter4;
            this.default_currencyAdapter = enumColumnAdapter5;
            this.incoming_request_policyAdapter = enumColumnAdapter6;
            this.available_p2p_target_regionsAdapter = wireRepeatedAdapter;
            this.regionAdapter = enumColumnAdapter7;
            this.bitcoin_display_unitsAdapter = enumColumnAdapter8;
            this.bitcoin_amount_entry_currency_preferenceAdapter = enumColumnAdapter9;
        }
    }
}
