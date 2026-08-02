package com.squareup.cash.cdf.localclient;

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
public final class LocalClientBrandCardTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String attribution_key;
    public final String brand_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BrandCardElement {
        public static final /* synthetic */ BrandCardElement[] $VALUES;
        public static final BrandCardElement Card;

        /* JADX INFO: Fake field, exist only in values array */
        BrandCardElement EF0;

        static {
            BrandCardElement brandCardElement = new BrandCardElement("QRCodeScannerButton", 0);
            BrandCardElement brandCardElement2 = new BrandCardElement("PrimaryButton", 1);
            BrandCardElement brandCardElement3 = new BrandCardElement("Card", 2);
            Card = brandCardElement3;
            $VALUES = new BrandCardElement[]{brandCardElement, brandCardElement2, brandCardElement3};
        }

        public static BrandCardElement valueOf(String str) {
            return (BrandCardElement) Enum.valueOf(BrandCardElement.class, str);
        }

        public static BrandCardElement[] values() {
            return (BrandCardElement[]) $VALUES.clone();
        }
    }

    public LocalClientBrandCardTap(String str, String str2) {
        BrandCardElement brandCardElement = BrandCardElement.Card;
        this.brand_token = str;
        this.attribution_key = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalClient", "cdf_action", "BrandCard");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "attribution_key", str2);
        Countries.putSafe(m, "element", brandCardElement);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientBrandCardTap)) {
            return false;
        }
        LocalClientBrandCardTap localClientBrandCardTap = (LocalClientBrandCardTap) obj;
        if (!Intrinsics.areEqual(this.brand_token, localClientBrandCardTap.brand_token) || !Intrinsics.areEqual(this.attribution_key, localClientBrandCardTap.attribution_key)) {
            return false;
        }
        BrandCardElement brandCardElement = BrandCardElement.Card;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient BrandCard Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.attribution_key;
        return BrandCardElement.Card.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        BrandCardElement brandCardElement = BrandCardElement.Card;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientBrandCardTap(brand_token=", this.brand_token, ", location_token=null, attribution_key=", this.attribution_key, ", element=");
        m.append(brandCardElement);
        m.append(")");
        return m.toString();
    }
}
