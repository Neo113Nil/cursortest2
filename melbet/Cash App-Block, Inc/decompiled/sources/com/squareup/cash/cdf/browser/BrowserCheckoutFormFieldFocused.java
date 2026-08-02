package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserCheckoutFormFieldFocused implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String detected_field_types;
    public final Boolean focused_field_filled;
    public final String focused_field_type;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutFormFieldFocused(InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3, String str4, Boolean bool, String str5) {
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.business_token = str2;
        this.business_name = str3;
        this.focused_field_type = str4;
        this.focused_field_filled = bool;
        this.detected_field_types = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "business_token", str2);
        Countries.putSafe(m, "business_name", str3);
        Countries.putSafe(m, "focused_field_type", str4);
        Countries.putSafe(m, "focused_field_filled", bool);
        Countries.putSafe(m, "detected_field_types", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutFormFieldFocused)) {
            return false;
        }
        BrowserCheckoutFormFieldFocused browserCheckoutFormFieldFocused = (BrowserCheckoutFormFieldFocused) obj;
        return this.info_context == browserCheckoutFormFieldFocused.info_context && this.origin == browserCheckoutFormFieldFocused.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutFormFieldFocused.referrer_flow_token) && Intrinsics.areEqual(this.business_token, browserCheckoutFormFieldFocused.business_token) && Intrinsics.areEqual(this.business_name, browserCheckoutFormFieldFocused.business_name) && this.focused_field_type.equals(browserCheckoutFormFieldFocused.focused_field_type) && this.focused_field_filled.equals(browserCheckoutFormFieldFocused.focused_field_filled) && this.detected_field_types.equals(browserCheckoutFormFieldFocused.detected_field_types);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout FormFieldFocused";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InfoContext infoContext = this.info_context;
        int hashCode = (infoContext == null ? 0 : infoContext.hashCode()) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str = this.referrer_flow_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.business_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.business_name;
        return this.detected_field_types.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.focused_field_filled, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.focused_field_type), 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.origin, this.info_context, "BrowserCheckoutFormFieldFocused(info_context=", ", origin=", ", referrer_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.referrer_flow_token, ", business_token=", this.business_token, ", business_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_name, ", focused_field_type=", this.focused_field_type, ", focused_field_filled=");
        m.append(this.focused_field_filled);
        m.append(", detected_field_types=");
        m.append(this.detected_field_types);
        m.append(")");
        return m.toString();
    }
}
