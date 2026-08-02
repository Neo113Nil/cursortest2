package com.squareup.cash.cdf.pushnotification;

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
public final class PushNotificationDeclineReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String entity_id;
    public final LogicError logic_error;
    public final String network_error;
    public final LinkedHashMap parameters;
    public final String response_code;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LogicError {
        public static final /* synthetic */ LogicError[] $VALUES;
        public static final LogicError CONCURRENT_MODIFICATION;

        static {
            LogicError logicError = new LogicError("CONCURRENT_MODIFICATION", 0);
            CONCURRENT_MODIFICATION = logicError;
            $VALUES = new LogicError[]{logicError};
        }

        public static LogicError valueOf(String str) {
            return (LogicError) Enum.valueOf(LogicError.class, str);
        }

        public static LogicError[] values() {
            return (LogicError[]) $VALUES.clone();
        }
    }

    public PushNotificationDeclineReceiveError(String str, String str2, String str3, int i) {
        LogicError logicError = (i & 4) != 0 ? null : LogicError.CONCURRENT_MODIFICATION;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        this.entity_id = str;
        this.logic_error = logicError;
        this.network_error = str2;
        this.response_code = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "PushNotification", "cdf_action", "Decline");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "logic_error", logicError);
        Countries.putSafe(m, "network_error", str2);
        Countries.putSafe(m, "response_code", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationDeclineReceiveError)) {
            return false;
        }
        PushNotificationDeclineReceiveError pushNotificationDeclineReceiveError = (PushNotificationDeclineReceiveError) obj;
        return this.entity_id.equals(pushNotificationDeclineReceiveError.entity_id) && this.logic_error == pushNotificationDeclineReceiveError.logic_error && Intrinsics.areEqual(this.network_error, pushNotificationDeclineReceiveError.network_error) && Intrinsics.areEqual(this.response_code, pushNotificationDeclineReceiveError.response_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PushNotification Decline ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entity_id.hashCode() * 31;
        LogicError logicError = this.logic_error;
        int hashCode2 = (hashCode + (logicError == null ? 0 : logicError.hashCode())) * 31;
        String str = this.network_error;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.response_code;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushNotificationDeclineReceiveError(notification_type=null, entity_id=");
        sb.append(this.entity_id);
        sb.append(", logic_error=");
        sb.append(this.logic_error);
        sb.append(", network_error=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.network_error, ", response_code=", this.response_code, ")");
    }
}
