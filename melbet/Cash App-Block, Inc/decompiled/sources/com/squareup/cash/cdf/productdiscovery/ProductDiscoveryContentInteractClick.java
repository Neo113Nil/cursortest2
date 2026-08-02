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
public final class ProductDiscoveryContentInteractClick implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ClickElement click_element;
    public final String content_template_token;
    public final String content_token;
    public final LinkedHashMap parameters;
    public final String product_category;
    public final String product_discovery_flow_token;
    public final String product_major;
    public final String product_minor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class ClickElement {
        public static final /* synthetic */ ClickElement[] $VALUES;
        public static final ClickElement CONTENT_CTA;

        /* JADX INFO: Fake field, exist only in values array */
        ClickElement EF0;

        static {
            ClickElement clickElement = new ClickElement("CONTENT_CONTAINER", 0);
            ClickElement clickElement2 = new ClickElement("CONTENT_HEADER", 1);
            ClickElement clickElement3 = new ClickElement("CONTENT_CTA", 2);
            CONTENT_CTA = clickElement3;
            $VALUES = new ClickElement[]{clickElement, clickElement2, clickElement3, new ClickElement("CONTENT_DISMISSAL", 3)};
        }

        public static ClickElement valueOf(String str) {
            return (ClickElement) Enum.valueOf(ClickElement.class, str);
        }

        public static ClickElement[] values() {
            return (ClickElement[]) $VALUES.clone();
        }
    }

    public ProductDiscoveryContentInteractClick(String str, String str2, String str3, String str4, String str5, String str6, ClickElement clickElement) {
        this.product_discovery_flow_token = str;
        this.product_major = str2;
        this.product_minor = str3;
        this.product_category = str4;
        this.content_token = str5;
        this.content_template_token = str6;
        this.click_element = clickElement;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "ProductDiscovery", "cdf_action", "ContentInteract");
        Countries.putSafe(m, "product_discovery_flow_token", str);
        Countries.putSafe(m, "product_major", str2);
        Countries.putSafe(m, "product_minor", str3);
        Countries.putSafe(m, "product_category", str4);
        Countries.putSafe(m, "content_token", str5);
        Countries.putSafe(m, "content_template_token", str6);
        Countries.putSafe(m, "click_element", clickElement);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDiscoveryContentInteractClick)) {
            return false;
        }
        ProductDiscoveryContentInteractClick productDiscoveryContentInteractClick = (ProductDiscoveryContentInteractClick) obj;
        return Intrinsics.areEqual(this.product_discovery_flow_token, productDiscoveryContentInteractClick.product_discovery_flow_token) && Intrinsics.areEqual(this.product_major, productDiscoveryContentInteractClick.product_major) && Intrinsics.areEqual(this.product_minor, productDiscoveryContentInteractClick.product_minor) && Intrinsics.areEqual(this.product_category, productDiscoveryContentInteractClick.product_category) && Intrinsics.areEqual(this.content_token, productDiscoveryContentInteractClick.content_token) && Intrinsics.areEqual(this.content_template_token, productDiscoveryContentInteractClick.content_template_token) && this.click_element == productDiscoveryContentInteractClick.click_element;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ProductDiscovery ContentInteract Click";
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
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.content_template_token;
        return this.click_element.hashCode() + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProductDiscoveryContentInteractClick(product_discovery_flow_token=", this.product_discovery_flow_token, ", product_major=", this.product_major, ", product_minor=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.product_minor, ", product_category=", this.product_category, ", content_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.content_token, ", content_template_token=", this.content_template_token, ", click_element=");
        m.append(this.click_element);
        m.append(")");
        return m.toString();
    }
}
