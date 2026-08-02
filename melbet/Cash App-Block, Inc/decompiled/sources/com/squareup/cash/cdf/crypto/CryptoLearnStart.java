package com.squareup.cash.cdf.crypto;

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
public final class CryptoLearnStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LearnContentType content_type;
    public final String identifier;
    public final Integer load_duration_ms;
    public final Result load_status;
    public final LinkedHashMap parameters;

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

    public CryptoLearnStart(LearnContentType learnContentType, String str, Integer num, Result result) {
        this.content_type = learnContentType;
        this.identifier = str;
        this.load_duration_ms = num;
        this.load_status = result;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Crypto", "cdf_action", "Learn");
        Countries.putSafe(m, "content_type", learnContentType);
        Countries.putSafe(m, "identifier", str);
        Countries.putSafe(m, "load_duration_ms", num);
        Countries.putSafe(m, "load_status", result);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoLearnStart)) {
            return false;
        }
        CryptoLearnStart cryptoLearnStart = (CryptoLearnStart) obj;
        return this.content_type == cryptoLearnStart.content_type && Intrinsics.areEqual(this.identifier, cryptoLearnStart.identifier) && Intrinsics.areEqual(this.load_duration_ms, cryptoLearnStart.load_duration_ms) && this.load_status == cryptoLearnStart.load_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Learn Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.content_type.hashCode() * 31;
        String str = this.identifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.load_duration_ms;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Result result = this.load_status;
        return hashCode3 + (result != null ? result.hashCode() : 0);
    }

    public final String toString() {
        return "CryptoLearnStart(content_type=" + this.content_type + ", identifier=" + this.identifier + ", load_duration_ms=" + this.load_duration_ms + ", load_status=" + this.load_status + ")";
    }
}
