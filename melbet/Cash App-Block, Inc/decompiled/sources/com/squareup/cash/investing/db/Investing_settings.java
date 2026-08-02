package com.squareup.cash.investing.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investing_settings {
    public final String bitcoin_discovery_url;
    public final String bitcoin_investment_entity_token;
    public final String crypto_disclosure_url;
    public final CustomOrderConfiguration custom_order_configuration;
    public final String disclosures_web_url;
    public final String documents_disclosure_text;
    public final String drip_disclosure_text;
    public final String entity_details_disclosure_text;
    public final List equities_discovery_stock_tiles;
    public final String equities_discovery_url;
    public final String first_time_congrats_bitcoin_text;
    public final String first_time_congrats_bitcoin_title;
    public final String first_time_congrats_equity_detail_text;
    public final String first_time_congrats_equity_detail_title;
    public final String first_time_congrats_equity_text;
    public final String first_time_congrats_equity_title;
    public final String investing_home_disclosure_text;
    public final Money min_scheduled_btc_buy_amt;
    public final Money min_scheduled_stock_buy_amt;
    public final LearnMoreConfiguration my_first_bitcoin_configuration;
    public final LearnMoreConfiguration my_first_stock_configuration;
    public final String my_watchlist_description;
    public final Money purchase_limit;
    public final Money sell_limit;
    public final boolean trusted_contact_enabled;

    public Investing_settings(Money money, Money money2, String str, String str2, String str3, String str4, String str5, LearnMoreConfiguration learnMoreConfiguration, List list, LearnMoreConfiguration learnMoreConfiguration2, Money money3, Money money4, CustomOrderConfiguration customOrderConfiguration, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, String str15, String str16) {
        this.purchase_limit = money;
        this.sell_limit = money2;
        this.equities_discovery_url = str;
        this.bitcoin_discovery_url = str2;
        this.disclosures_web_url = str3;
        this.my_watchlist_description = str4;
        this.crypto_disclosure_url = str5;
        this.my_first_stock_configuration = learnMoreConfiguration;
        this.equities_discovery_stock_tiles = list;
        this.my_first_bitcoin_configuration = learnMoreConfiguration2;
        this.min_scheduled_btc_buy_amt = money3;
        this.min_scheduled_stock_buy_amt = money4;
        this.custom_order_configuration = customOrderConfiguration;
        this.first_time_congrats_equity_title = str6;
        this.first_time_congrats_equity_text = str7;
        this.first_time_congrats_equity_detail_title = str8;
        this.first_time_congrats_equity_detail_text = str9;
        this.first_time_congrats_bitcoin_title = str10;
        this.first_time_congrats_bitcoin_text = str11;
        this.bitcoin_investment_entity_token = str12;
        this.trusted_contact_enabled = z;
        this.investing_home_disclosure_text = str13;
        this.entity_details_disclosure_text = str14;
        this.documents_disclosure_text = str15;
        this.drip_disclosure_text = str16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investing_settings)) {
            return false;
        }
        Investing_settings investing_settings = (Investing_settings) obj;
        return Intrinsics.areEqual(this.purchase_limit, investing_settings.purchase_limit) && Intrinsics.areEqual(this.sell_limit, investing_settings.sell_limit) && Intrinsics.areEqual(this.equities_discovery_url, investing_settings.equities_discovery_url) && Intrinsics.areEqual(this.bitcoin_discovery_url, investing_settings.bitcoin_discovery_url) && Intrinsics.areEqual(this.disclosures_web_url, investing_settings.disclosures_web_url) && Intrinsics.areEqual(this.my_watchlist_description, investing_settings.my_watchlist_description) && Intrinsics.areEqual(this.crypto_disclosure_url, investing_settings.crypto_disclosure_url) && Intrinsics.areEqual(this.my_first_stock_configuration, investing_settings.my_first_stock_configuration) && Intrinsics.areEqual(this.equities_discovery_stock_tiles, investing_settings.equities_discovery_stock_tiles) && Intrinsics.areEqual(this.my_first_bitcoin_configuration, investing_settings.my_first_bitcoin_configuration) && Intrinsics.areEqual(this.min_scheduled_btc_buy_amt, investing_settings.min_scheduled_btc_buy_amt) && Intrinsics.areEqual(this.min_scheduled_stock_buy_amt, investing_settings.min_scheduled_stock_buy_amt) && Intrinsics.areEqual(this.custom_order_configuration, investing_settings.custom_order_configuration) && Intrinsics.areEqual(this.first_time_congrats_equity_title, investing_settings.first_time_congrats_equity_title) && Intrinsics.areEqual(this.first_time_congrats_equity_text, investing_settings.first_time_congrats_equity_text) && Intrinsics.areEqual(this.first_time_congrats_equity_detail_title, investing_settings.first_time_congrats_equity_detail_title) && Intrinsics.areEqual(this.first_time_congrats_equity_detail_text, investing_settings.first_time_congrats_equity_detail_text) && Intrinsics.areEqual(this.first_time_congrats_bitcoin_title, investing_settings.first_time_congrats_bitcoin_title) && Intrinsics.areEqual(this.first_time_congrats_bitcoin_text, investing_settings.first_time_congrats_bitcoin_text) && Intrinsics.areEqual(this.bitcoin_investment_entity_token, investing_settings.bitcoin_investment_entity_token) && this.trusted_contact_enabled == investing_settings.trusted_contact_enabled && Intrinsics.areEqual(this.investing_home_disclosure_text, investing_settings.investing_home_disclosure_text) && Intrinsics.areEqual(this.entity_details_disclosure_text, investing_settings.entity_details_disclosure_text) && Intrinsics.areEqual(this.documents_disclosure_text, investing_settings.documents_disclosure_text) && Intrinsics.areEqual(this.drip_disclosure_text, investing_settings.drip_disclosure_text);
    }

    public final int hashCode() {
        Money money = this.purchase_limit;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Money money2 = this.sell_limit;
        int hashCode2 = (hashCode + (money2 == null ? 0 : money2.hashCode())) * 31;
        String str = this.equities_discovery_url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bitcoin_discovery_url;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclosures_web_url;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.my_watchlist_description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.crypto_disclosure_url;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LearnMoreConfiguration learnMoreConfiguration = this.my_first_stock_configuration;
        int hashCode8 = (hashCode7 + (learnMoreConfiguration == null ? 0 : learnMoreConfiguration.hashCode())) * 31;
        List list = this.equities_discovery_stock_tiles;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        LearnMoreConfiguration learnMoreConfiguration2 = this.my_first_bitcoin_configuration;
        int hashCode10 = (hashCode9 + (learnMoreConfiguration2 == null ? 0 : learnMoreConfiguration2.hashCode())) * 31;
        Money money3 = this.min_scheduled_btc_buy_amt;
        int hashCode11 = (hashCode10 + (money3 == null ? 0 : money3.hashCode())) * 31;
        Money money4 = this.min_scheduled_stock_buy_amt;
        int hashCode12 = (hashCode11 + (money4 == null ? 0 : money4.hashCode())) * 31;
        CustomOrderConfiguration customOrderConfiguration = this.custom_order_configuration;
        int hashCode13 = (hashCode12 + (customOrderConfiguration == null ? 0 : customOrderConfiguration.hashCode())) * 31;
        String str6 = this.first_time_congrats_equity_title;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.first_time_congrats_equity_text;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.first_time_congrats_equity_detail_title;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.first_time_congrats_equity_detail_text;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.first_time_congrats_bitcoin_title;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.first_time_congrats_bitcoin_text;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bitcoin_investment_entity_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.trusted_contact_enabled);
        String str13 = this.investing_home_disclosure_text;
        int hashCode20 = (m + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.entity_details_disclosure_text;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.documents_disclosure_text;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.drip_disclosure_text;
        return hashCode22 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Investing_settings(purchase_limit=");
        sb.append(this.purchase_limit);
        sb.append(", sell_limit=");
        sb.append(this.sell_limit);
        sb.append(", equities_discovery_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.equities_discovery_url, ", bitcoin_discovery_url=", this.bitcoin_discovery_url, ", disclosures_web_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.disclosures_web_url, ", my_watchlist_description=", this.my_watchlist_description, ", crypto_disclosure_url=");
        sb.append(this.crypto_disclosure_url);
        sb.append(", my_first_stock_configuration=");
        sb.append(this.my_first_stock_configuration);
        sb.append(", equities_discovery_stock_tiles=");
        sb.append(this.equities_discovery_stock_tiles);
        sb.append(", my_first_bitcoin_configuration=");
        sb.append(this.my_first_bitcoin_configuration);
        sb.append(", min_scheduled_btc_buy_amt=");
        sb.append(this.min_scheduled_btc_buy_amt);
        sb.append(", min_scheduled_stock_buy_amt=");
        sb.append(this.min_scheduled_stock_buy_amt);
        sb.append(", custom_order_configuration=");
        sb.append(this.custom_order_configuration);
        sb.append(", first_time_congrats_equity_title=");
        sb.append(this.first_time_congrats_equity_title);
        sb.append(", first_time_congrats_equity_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.first_time_congrats_equity_text, ", first_time_congrats_equity_detail_title=", this.first_time_congrats_equity_detail_title, ", first_time_congrats_equity_detail_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.first_time_congrats_equity_detail_text, ", first_time_congrats_bitcoin_title=", this.first_time_congrats_bitcoin_title, ", first_time_congrats_bitcoin_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.first_time_congrats_bitcoin_text, ", bitcoin_investment_entity_token=", this.bitcoin_investment_entity_token, ", trusted_contact_enabled=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.trusted_contact_enabled, ", investing_home_disclosure_text=", this.investing_home_disclosure_text, ", entity_details_disclosure_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.entity_details_disclosure_text, ", documents_disclosure_text=", this.documents_disclosure_text, ", drip_disclosure_text=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.drip_disclosure_text, ")");
    }
}
