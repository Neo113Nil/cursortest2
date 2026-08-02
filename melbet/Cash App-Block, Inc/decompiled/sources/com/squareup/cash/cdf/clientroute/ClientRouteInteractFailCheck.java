package com.squareup.cash.cdf.clientroute;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ClientRouteInteractFailCheck implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_deep_link;
    public final ClientRouteNotAllowedReason not_allowed_reason;
    public final String origin;
    public final LinkedHashMap parameters;
    public final String spec_name;
    public final String spec_parameters;
    public final String spec_path_format;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ClientRouteNotAllowedReason {
        public static final /* synthetic */ ClientRouteNotAllowedReason[] $VALUES;
        public static final ClientRouteNotAllowedReason ACCOUNT_IDENTIFIER_NOT_SUPPLIED;
        public static final ClientRouteNotAllowedReason BTCX_ROUTE_NOT_ALLOWED;
        public static final ClientRouteNotAllowedReason CASH_APP_PAY_ONBOARDING;
        public static final ClientRouteNotAllowedReason LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED;
        public static final ClientRouteNotAllowedReason LOGGED_OUT_ROUTE_ACCOUNT_AUTHENTICATED;

        static {
            ClientRouteNotAllowedReason clientRouteNotAllowedReason = new ClientRouteNotAllowedReason("ACCOUNT_IDENTIFIER_NOT_SUPPLIED", 0);
            ACCOUNT_IDENTIFIER_NOT_SUPPLIED = clientRouteNotAllowedReason;
            ClientRouteNotAllowedReason clientRouteNotAllowedReason2 = new ClientRouteNotAllowedReason("BTCX_ROUTE_NOT_ALLOWED", 1);
            BTCX_ROUTE_NOT_ALLOWED = clientRouteNotAllowedReason2;
            ClientRouteNotAllowedReason clientRouteNotAllowedReason3 = new ClientRouteNotAllowedReason("CASH_APP_PAY_ONBOARDING", 2);
            CASH_APP_PAY_ONBOARDING = clientRouteNotAllowedReason3;
            ClientRouteNotAllowedReason clientRouteNotAllowedReason4 = new ClientRouteNotAllowedReason("LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED", 3);
            LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED = clientRouteNotAllowedReason4;
            ClientRouteNotAllowedReason clientRouteNotAllowedReason5 = new ClientRouteNotAllowedReason("LOGGED_OUT_ROUTE_ACCOUNT_AUTHENTICATED", 4);
            LOGGED_OUT_ROUTE_ACCOUNT_AUTHENTICATED = clientRouteNotAllowedReason5;
            $VALUES = new ClientRouteNotAllowedReason[]{clientRouteNotAllowedReason, clientRouteNotAllowedReason2, clientRouteNotAllowedReason3, clientRouteNotAllowedReason4, clientRouteNotAllowedReason5};
        }

        public static ClientRouteNotAllowedReason valueOf(String str) {
            return (ClientRouteNotAllowedReason) Enum.valueOf(ClientRouteNotAllowedReason.class, str);
        }

        public static ClientRouteNotAllowedReason[] values() {
            return (ClientRouteNotAllowedReason[]) $VALUES.clone();
        }
    }

    public ClientRouteInteractFailCheck(String str, Boolean bool, String str2, String str3, String str4, ClientRouteNotAllowedReason clientRouteNotAllowedReason) {
        this.origin = str;
        this.is_deep_link = bool;
        this.spec_name = str2;
        this.spec_path_format = str3;
        this.spec_parameters = str4;
        this.not_allowed_reason = clientRouteNotAllowedReason;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "ClientRoute", "cdf_action", "Interact");
        Countries.putSafe(m, "origin", str);
        Countries.putSafe(m, "is_deep_link", bool);
        Countries.putSafe(m, "spec_name", str2);
        Countries.putSafe(m, "spec_path_format", str3);
        Countries.putSafe(m, "spec_parameters", str4);
        Countries.putSafe(m, "not_allowed_reason", clientRouteNotAllowedReason);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteInteractFailCheck)) {
            return false;
        }
        ClientRouteInteractFailCheck clientRouteInteractFailCheck = (ClientRouteInteractFailCheck) obj;
        return Intrinsics.areEqual(this.origin, clientRouteInteractFailCheck.origin) && this.is_deep_link.equals(clientRouteInteractFailCheck.is_deep_link) && Intrinsics.areEqual(this.spec_name, clientRouteInteractFailCheck.spec_name) && Intrinsics.areEqual(this.spec_path_format, clientRouteInteractFailCheck.spec_path_format) && this.spec_parameters.equals(clientRouteInteractFailCheck.spec_parameters) && this.not_allowed_reason == clientRouteInteractFailCheck.not_allowed_reason;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute Interact FailCheck";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.origin;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_deep_link, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.spec_name;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spec_path_format;
        return this.not_allowed_reason.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.spec_parameters);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_deep_link, "ClientRouteInteractFailCheck(origin=", this.origin, ", is_deep_link=", ", spec_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.spec_name, ", spec_path_format=", this.spec_path_format, ", spec_parameters=");
        m.append(this.spec_parameters);
        m.append(", not_allowed_reason=");
        m.append(this.not_allowed_reason);
        m.append(")");
        return m.toString();
    }
}
