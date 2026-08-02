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
public final class CryptoSendComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blocker_flow_token;
    public final ContentType content_type;
    public final Boolean is_signed;
    public final LinkedHashMap parameters;
    public final CryptoSendCompleteResult result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CryptoSendCompleteResult {
        public static final /* synthetic */ CryptoSendCompleteResult[] $VALUES;
        public static final CryptoSendCompleteResult SHOW_PAYMENT_BLOCKER_FLOW_FAILURE;
        public static final CryptoSendCompleteResult START_PAYMENT_BLOCKER_FLOW;

        static {
            CryptoSendCompleteResult cryptoSendCompleteResult = new CryptoSendCompleteResult("START_PAYMENT_BLOCKER_FLOW", 0);
            START_PAYMENT_BLOCKER_FLOW = cryptoSendCompleteResult;
            CryptoSendCompleteResult cryptoSendCompleteResult2 = new CryptoSendCompleteResult("SHOW_PAYMENT_BLOCKER_FLOW_FAILURE", 1);
            SHOW_PAYMENT_BLOCKER_FLOW_FAILURE = cryptoSendCompleteResult2;
            $VALUES = new CryptoSendCompleteResult[]{cryptoSendCompleteResult, cryptoSendCompleteResult2, new CryptoSendCompleteResult("START_IDV_BLOCKER_FLOW", 2)};
        }

        public static CryptoSendCompleteResult valueOf(String str) {
            return (CryptoSendCompleteResult) Enum.valueOf(CryptoSendCompleteResult.class, str);
        }

        public static CryptoSendCompleteResult[] values() {
            return (CryptoSendCompleteResult[]) $VALUES.clone();
        }
    }

    public CryptoSendComplete(String str, ContentType contentType, CryptoSendCompleteResult cryptoSendCompleteResult, Boolean bool) {
        this.blocker_flow_token = str;
        this.content_type = contentType;
        this.result = cryptoSendCompleteResult;
        this.is_signed = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Crypto", "cdf_action", "Send");
        Countries.putSafe(m, "blocker_flow_token", str);
        Countries.putSafe(m, "content_type", contentType);
        Countries.putSafe(m, "result", cryptoSendCompleteResult);
        Countries.putSafe(m, "is_signed", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoSendComplete)) {
            return false;
        }
        CryptoSendComplete cryptoSendComplete = (CryptoSendComplete) obj;
        return Intrinsics.areEqual(this.blocker_flow_token, cryptoSendComplete.blocker_flow_token) && this.content_type == cryptoSendComplete.content_type && this.result == cryptoSendComplete.result && this.is_signed.equals(cryptoSendComplete.is_signed);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blocker_flow_token;
        return this.is_signed.hashCode() + ((this.result.hashCode() + ((this.content_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "CryptoSendComplete(blocker_flow_token=" + this.blocker_flow_token + ", network_type=null, content_type=" + this.content_type + ", result=" + this.result + ", is_signed=" + this.is_signed + ")";
    }
}
