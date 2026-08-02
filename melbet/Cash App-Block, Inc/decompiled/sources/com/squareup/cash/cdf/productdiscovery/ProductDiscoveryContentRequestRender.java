package com.squareup.cash.cdf.productdiscovery;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class ProductDiscoveryContentRequestRender implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String content_template_token;
    public final String content_token;
    public final LinkedHashMap parameters;
    public final String product_category;
    public final String product_discovery_flow_token;
    public final String product_major;
    public final String product_minor;

    public ProductDiscoveryContentRequestRender(String str, String str2, String str3, String str4, String str5, String str6) {
        this.product_discovery_flow_token = str;
        this.product_major = str2;
        this.product_minor = str3;
        this.product_category = str4;
        this.content_template_token = str5;
        this.content_token = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "ProductDiscovery", "cdf_action", "ContentRequest");
        Countries.putSafe(m, "product_discovery_flow_token", str);
        Countries.putSafe(m, "product_major", str2);
        Countries.putSafe(m, "product_minor", str3);
        Countries.putSafe(m, "product_category", str4);
        Countries.putSafe(m, "content_template_token", str5);
        Countries.putSafe(m, "content_token", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDiscoveryContentRequestRender)) {
            return false;
        }
        ProductDiscoveryContentRequestRender productDiscoveryContentRequestRender = (ProductDiscoveryContentRequestRender) obj;
        return Intrinsics.areEqual(this.product_discovery_flow_token, productDiscoveryContentRequestRender.product_discovery_flow_token) && Intrinsics.areEqual(this.product_major, productDiscoveryContentRequestRender.product_major) && Intrinsics.areEqual(this.product_minor, productDiscoveryContentRequestRender.product_minor) && Intrinsics.areEqual(this.product_category, productDiscoveryContentRequestRender.product_category) && Intrinsics.areEqual(this.content_template_token, productDiscoveryContentRequestRender.content_template_token) && Intrinsics.areEqual(this.content_token, productDiscoveryContentRequestRender.content_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ProductDiscovery ContentRequest Render";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.product_discovery_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product_major;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.product_minor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product_category;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 887503681;
        String str5 = this.content_template_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.content_token;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProductDiscoveryContentRequestRender(product_discovery_flow_token=", this.product_discovery_flow_token, ", product_major=", this.product_major, ", product_minor=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.product_minor, ", product_category=", this.product_category, ", placement_name=null, placement_row_index=null, placement_col_index=null, origin_surface=null, content_format=null, content_template_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.content_template_token, ", content_token=", this.content_token, ")");
    }
}
