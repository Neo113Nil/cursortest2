package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserViewOpenCart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String affiliate_url;
    public final String currency;
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final String page_url;
    public final LinkedHashMap parameters;
    public final String product_item_prices_cents;
    public final String product_line_totals_cents;
    public final String product_names;
    public final String product_quantities;
    public final String referrer_flow_token;
    public final Integer total_price_cents;

    public BrowserViewOpenCart(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, BrowserOrigin browserOrigin, InfoContext infoContext, String str10) {
        this.total_price_cents = num;
        this.currency = str;
        this.page_url = str2;
        this.product_names = str3;
        this.product_item_prices_cents = str4;
        this.product_line_totals_cents = str5;
        this.product_quantities = str6;
        this.referrer_flow_token = str7;
        this.affiliate_url = str8;
        this.entry_url = str9;
        this.origin = browserOrigin;
        this.info_context = infoContext;
        this.entity_token = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 17, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "total_price_cents", num);
        Countries.putSafe(m, "currency", str);
        Countries.putSafe(m, "page_url", str2);
        Countries.putSafe(m, "product_names", str3);
        Countries.putSafe(m, "product_item_prices_cents", str4);
        Countries.putSafe(m, "product_line_totals_cents", str5);
        Countries.putSafe(m, "product_quantities", str6);
        Countries.putSafe(m, "referrer_flow_token", str7);
        Countries.putSafe(m, "affiliate_url", str8);
        Countries.putSafe(m, "entry_url", str9);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "entity_token", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewOpenCart)) {
            return false;
        }
        BrowserViewOpenCart browserViewOpenCart = (BrowserViewOpenCart) obj;
        return Intrinsics.areEqual(this.total_price_cents, browserViewOpenCart.total_price_cents) && Intrinsics.areEqual(this.currency, browserViewOpenCart.currency) && Intrinsics.areEqual(this.page_url, browserViewOpenCart.page_url) && Intrinsics.areEqual(this.product_names, browserViewOpenCart.product_names) && Intrinsics.areEqual(this.product_item_prices_cents, browserViewOpenCart.product_item_prices_cents) && Intrinsics.areEqual(this.product_line_totals_cents, browserViewOpenCart.product_line_totals_cents) && Intrinsics.areEqual(this.product_quantities, browserViewOpenCart.product_quantities) && Intrinsics.areEqual(this.referrer_flow_token, browserViewOpenCart.referrer_flow_token) && Intrinsics.areEqual(this.affiliate_url, browserViewOpenCart.affiliate_url) && Intrinsics.areEqual(this.entry_url, browserViewOpenCart.entry_url) && this.origin == browserViewOpenCart.origin && this.info_context == browserViewOpenCart.info_context && Intrinsics.areEqual(this.entity_token, browserViewOpenCart.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View OpenCart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.total_price_cents;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.page_url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.product_names;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product_item_prices_cents;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.product_line_totals_cents;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.product_quantities;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referrer_flow_token;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 29791;
        String str8 = this.affiliate_url;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.entry_url;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode11 = (hashCode10 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode12 = (hashCode11 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        String str10 = this.entity_token;
        return hashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserViewOpenCart(total_price_cents=");
        sb.append(this.total_price_cents);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", page_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.page_url, ", product_names=", this.product_names, ", product_item_prices_cents=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.product_item_prices_cents, ", product_line_totals_cents=", this.product_line_totals_cents, ", product_quantities=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.product_quantities, ", referrer_flow_token=", this.referrer_flow_token, ", suggestion_id=null, boost_flow_token=null, affiliate_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.affiliate_url, ", entry_url=", this.entry_url, ", origin=");
        sb.append(this.origin);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entity_token, ")");
    }
}
