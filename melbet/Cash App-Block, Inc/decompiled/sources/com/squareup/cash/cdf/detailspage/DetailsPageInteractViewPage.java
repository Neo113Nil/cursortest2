package com.squareup.cash.cdf.detailspage;

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
public final class DetailsPageInteractViewPage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.ML_PLATFORM});
    public final String details_page_token;
    public final String flow_token;
    public final DetailsPageOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String template_token;
    public final String version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DetailsPageOrigin {
        public static final /* synthetic */ DetailsPageOrigin[] $VALUES;
        public static final DetailsPageOrigin BALANCE_TAB;
        public static final DetailsPageOrigin CARD_TAB;
        public static final DetailsPageOrigin DEEP_LINK;
        public static final DetailsPageOrigin DISCOVER;
        public static final DetailsPageOrigin PAYMENT_TAB;

        static {
            DetailsPageOrigin detailsPageOrigin = new DetailsPageOrigin("DISCOVER", 0);
            DISCOVER = detailsPageOrigin;
            DetailsPageOrigin detailsPageOrigin2 = new DetailsPageOrigin("DEEP_LINK", 1);
            DEEP_LINK = detailsPageOrigin2;
            DetailsPageOrigin detailsPageOrigin3 = new DetailsPageOrigin("BALANCE_TAB", 2);
            BALANCE_TAB = detailsPageOrigin3;
            DetailsPageOrigin detailsPageOrigin4 = new DetailsPageOrigin("CARD_TAB", 3);
            CARD_TAB = detailsPageOrigin4;
            DetailsPageOrigin detailsPageOrigin5 = new DetailsPageOrigin("PAYMENT_TAB", 4);
            PAYMENT_TAB = detailsPageOrigin5;
            $VALUES = new DetailsPageOrigin[]{detailsPageOrigin, detailsPageOrigin2, detailsPageOrigin3, detailsPageOrigin4, detailsPageOrigin5};
        }

        public static DetailsPageOrigin valueOf(String str) {
            return (DetailsPageOrigin) Enum.valueOf(DetailsPageOrigin.class, str);
        }

        public static DetailsPageOrigin[] values() {
            return (DetailsPageOrigin[]) $VALUES.clone();
        }
    }

    public DetailsPageInteractViewPage(String str, String str2, String str3, String str4, String str5, DetailsPageOrigin detailsPageOrigin, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str5 = (i & 16) != 0 ? null : str5;
        this.template_token = str;
        this.version = str2;
        this.details_page_token = str3;
        this.flow_token = str4;
        this.referrer_flow_token = str5;
        this.origin = detailsPageOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "DetailsPage", "cdf_action", "Interact");
        Countries.putSafe(m, "template_token", str);
        Countries.putSafe(m, "version", str2);
        Countries.putSafe(m, "details_page_token", str3);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "referrer_flow_token", str5);
        Countries.putSafe(m, "origin", detailsPageOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsPageInteractViewPage)) {
            return false;
        }
        DetailsPageInteractViewPage detailsPageInteractViewPage = (DetailsPageInteractViewPage) obj;
        return Intrinsics.areEqual(this.template_token, detailsPageInteractViewPage.template_token) && Intrinsics.areEqual(this.version, detailsPageInteractViewPage.version) && Intrinsics.areEqual(this.details_page_token, detailsPageInteractViewPage.details_page_token) && Intrinsics.areEqual(this.flow_token, detailsPageInteractViewPage.flow_token) && Intrinsics.areEqual(this.referrer_flow_token, detailsPageInteractViewPage.referrer_flow_token) && this.origin == detailsPageInteractViewPage.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DetailsPage Interact ViewPage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.template_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.details_page_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.referrer_flow_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DetailsPageOrigin detailsPageOrigin = this.origin;
        return hashCode5 + (detailsPageOrigin != null ? detailsPageOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailsPageInteractViewPage(template_token=", this.template_token, ", version=", this.version, ", details_page_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.details_page_token, ", flow_token=", this.flow_token, ", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
