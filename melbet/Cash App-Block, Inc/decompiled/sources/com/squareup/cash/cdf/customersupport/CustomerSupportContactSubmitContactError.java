package com.squareup.cash.cdf.customersupport;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerSupportContactSubmitContactError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Channel channel;
    public final ErrorType error_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType NETWORK;
        public static final ErrorType VALIDATION;

        static {
            ErrorType errorType = new ErrorType("VALIDATION", 0);
            VALIDATION = errorType;
            ErrorType errorType2 = new ErrorType("NETWORK", 1);
            NETWORK = errorType2;
            $VALUES = new ErrorType[]{errorType, errorType2};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public CustomerSupportContactSubmitContactError(Channel channel, String str, ErrorType errorType) {
        this.channel = channel;
        this.flow_token = str;
        this.error_type = errorType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Contact");
        Countries.putSafe(m, AppsFlyerProperties.CHANNEL, channel);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "error_type", errorType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportContactSubmitContactError)) {
            return false;
        }
        CustomerSupportContactSubmitContactError customerSupportContactSubmitContactError = (CustomerSupportContactSubmitContactError) obj;
        return this.channel == customerSupportContactSubmitContactError.channel && Intrinsics.areEqual(this.flow_token, customerSupportContactSubmitContactError.flow_token) && this.error_type == customerSupportContactSubmitContactError.error_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Contact SubmitContactError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        String str = this.flow_token;
        return this.error_type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CustomerSupportContactSubmitContactError(channel=" + this.channel + ", flow_token=" + this.flow_token + ", error_type=" + this.error_type + ")";
    }
}
