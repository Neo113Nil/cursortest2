package com.squareup.cash.cdf.appsflyerdeeplink;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppsFlyerDeepLinkFetchComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String appsflyer_id;
    public final ErrorType error_type;
    public final Long millis_lapsed_after_initialization;
    public final NetworkStatus network_status;
    public final LinkedHashMap parameters;
    public final ResultStatus result_status;
    public final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType DEVELOPER_ERROR;
        public static final ErrorType HTTP_STATUS_CODE;
        public static final ErrorType NETWORK;
        public static final ErrorType TIME_OUT;
        public static final ErrorType UNEXPECTED;

        static {
            ErrorType errorType = new ErrorType("TIME_OUT", 0);
            TIME_OUT = errorType;
            ErrorType errorType2 = new ErrorType("NETWORK", 1);
            NETWORK = errorType2;
            ErrorType errorType3 = new ErrorType("HTTP_STATUS_CODE", 2);
            HTTP_STATUS_CODE = errorType3;
            ErrorType errorType4 = new ErrorType("DEVELOPER_ERROR", 3);
            DEVELOPER_ERROR = errorType4;
            ErrorType errorType5 = new ErrorType("UNEXPECTED", 4);
            UNEXPECTED = errorType5;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NetworkStatus {
        public static final /* synthetic */ NetworkStatus[] $VALUES;
        public static final NetworkStatus CELLULAR;
        public static final NetworkStatus OFFLINE;
        public static final NetworkStatus WIFI;

        static {
            NetworkStatus networkStatus = new NetworkStatus("OFFLINE", 0);
            OFFLINE = networkStatus;
            NetworkStatus networkStatus2 = new NetworkStatus("WIFI", 1);
            WIFI = networkStatus2;
            NetworkStatus networkStatus3 = new NetworkStatus("CELLULAR", 2);
            CELLULAR = networkStatus3;
            $VALUES = new NetworkStatus[]{networkStatus, networkStatus2, networkStatus3};
        }

        public static NetworkStatus valueOf(String str) {
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }

        public static NetworkStatus[] values() {
            return (NetworkStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ResultStatus {
        public static final /* synthetic */ ResultStatus[] $VALUES;
        public static final ResultStatus ERROR;
        public static final ResultStatus FOUND;
        public static final ResultStatus NOT_FOUND;

        static {
            ResultStatus resultStatus = new ResultStatus("FOUND", 0);
            FOUND = resultStatus;
            ResultStatus resultStatus2 = new ResultStatus("NOT_FOUND", 1);
            NOT_FOUND = resultStatus2;
            ResultStatus resultStatus3 = new ResultStatus("ERROR", 2);
            ERROR = resultStatus3;
            $VALUES = new ResultStatus[]{resultStatus, resultStatus2, resultStatus3};
        }

        public static ResultStatus valueOf(String str) {
            return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
        }

        public static ResultStatus[] values() {
            return (ResultStatus[]) $VALUES.clone();
        }
    }

    public AppsFlyerDeepLinkFetchComplete(ResultStatus resultStatus, ErrorType errorType, NetworkStatus networkStatus, Long l, String str, String str2) {
        this.result_status = resultStatus;
        this.error_type = errorType;
        this.network_status = networkStatus;
        this.millis_lapsed_after_initialization = l;
        this.url = str;
        this.appsflyer_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "AppsFlyerDeepLink", "cdf_action", "Fetch");
        Countries.putSafe(m, "result_status", resultStatus);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "network_status", networkStatus);
        Countries.putSafe(m, "millis_lapsed_after_initialization", l);
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "appsflyer_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerDeepLinkFetchComplete)) {
            return false;
        }
        AppsFlyerDeepLinkFetchComplete appsFlyerDeepLinkFetchComplete = (AppsFlyerDeepLinkFetchComplete) obj;
        return this.result_status == appsFlyerDeepLinkFetchComplete.result_status && this.error_type == appsFlyerDeepLinkFetchComplete.error_type && this.network_status == appsFlyerDeepLinkFetchComplete.network_status && Intrinsics.areEqual(this.millis_lapsed_after_initialization, appsFlyerDeepLinkFetchComplete.millis_lapsed_after_initialization) && Intrinsics.areEqual(this.url, appsFlyerDeepLinkFetchComplete.url) && Intrinsics.areEqual(this.appsflyer_id, appsFlyerDeepLinkFetchComplete.appsflyer_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppsFlyerDeepLink Fetch Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.result_status.hashCode() * 31;
        ErrorType errorType = this.error_type;
        int hashCode2 = (this.network_status.hashCode() + ((hashCode + (errorType == null ? 0 : errorType.hashCode())) * 31)) * 31;
        Long l = this.millis_lapsed_after_initialization;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.url;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appsflyer_id;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFlyerDeepLinkFetchComplete(result_status=");
        sb.append(this.result_status);
        sb.append(", error_type=");
        sb.append(this.error_type);
        sb.append(", network_status=");
        sb.append(this.network_status);
        sb.append(", millis_lapsed_after_initialization=");
        sb.append(this.millis_lapsed_after_initialization);
        sb.append(", url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.url, ", appsflyer_id=", this.appsflyer_id, ")");
    }
}
