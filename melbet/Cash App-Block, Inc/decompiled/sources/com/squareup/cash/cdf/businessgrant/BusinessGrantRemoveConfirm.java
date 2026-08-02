package com.squareup.cash.cdf.businessgrant;

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
public final class BusinessGrantRemoveConfirm implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String grant_id;
    public final LinkedHashMap parameters;
    public final Result result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Result {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result FAILURE;
        public static final Result SUCCESS;

        static {
            Result result = new Result("SUCCESS", 0);
            SUCCESS = result;
            Result result2 = new Result("FAILURE", 1);
            FAILURE = result2;
            $VALUES = new Result[]{result, result2};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    public BusinessGrantRemoveConfirm(String str, Result result) {
        this.grant_id = str;
        this.result = result;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BusinessGrant", "cdf_action", "Remove");
        Countries.putSafe(m, "grant_id", str);
        Countries.putSafe(m, "result", result);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGrantRemoveConfirm)) {
            return false;
        }
        BusinessGrantRemoveConfirm businessGrantRemoveConfirm = (BusinessGrantRemoveConfirm) obj;
        return Intrinsics.areEqual(this.grant_id, businessGrantRemoveConfirm.grant_id) && this.result == businessGrantRemoveConfirm.result;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BusinessGrant Remove Confirm";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.grant_id;
        return this.result.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BusinessGrantRemoveConfirm(grant_id=" + this.grant_id + ", result=" + this.result + ")";
    }
}
