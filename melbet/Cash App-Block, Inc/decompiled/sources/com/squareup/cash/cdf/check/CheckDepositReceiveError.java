package com.squareup.cash.cdf.check;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CheckDepositReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String capture_warnings;
    public final Integer http_error_code;
    public final Boolean is_network_failure;
    public final LinkedHashMap parameters;
    public final Step step;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Step {
        public static final /* synthetic */ Step[] $VALUES;
        public static final Step CHECK_CAPTURE_BACK;
        public static final Step CHECK_CAPTURE_FRONT;

        static {
            Step step = new Step("CHECK_CAPTURE_FRONT", 0);
            CHECK_CAPTURE_FRONT = step;
            Step step2 = new Step("CHECK_CAPTURE_BACK", 1);
            CHECK_CAPTURE_BACK = step2;
            $VALUES = new Step[]{step, step2, new Step("CHECK_VERIFICATION", 2)};
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public CheckDepositReceiveError(String str, Integer num, Boolean bool, Step step, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        bool = (i & 4) != 0 ? null : bool;
        step = (i & 8) != 0 ? null : step;
        this.capture_warnings = str;
        this.http_error_code = num;
        this.is_network_failure = bool;
        this.step = step;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Check", "cdf_action", "Deposit");
        Countries.putSafe(m, "capture_warnings", str);
        Countries.putSafe(m, "http_error_code", num);
        Countries.putSafe(m, "is_network_failure", bool);
        Countries.putSafe(m, "step", step);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDepositReceiveError)) {
            return false;
        }
        CheckDepositReceiveError checkDepositReceiveError = (CheckDepositReceiveError) obj;
        return Intrinsics.areEqual(this.capture_warnings, checkDepositReceiveError.capture_warnings) && Intrinsics.areEqual(this.http_error_code, checkDepositReceiveError.http_error_code) && Intrinsics.areEqual(this.is_network_failure, checkDepositReceiveError.is_network_failure) && this.step == checkDepositReceiveError.step;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Check Deposit ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.capture_warnings;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.http_error_code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.is_network_failure;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Step step = this.step;
        return hashCode3 + (step != null ? step.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.http_error_code, "CheckDepositReceiveError(capture_warnings=", this.capture_warnings, ", http_error_code=", ", is_network_failure=");
        m.append(this.is_network_failure);
        m.append(", step=");
        m.append(this.step);
        m.append(")");
        return m.toString();
    }
}
