package com.squareup.cash.cdf.paychecks;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaychecksShowBenefitsHub implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BenefitsStatus benefits_status;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BenefitsStatus {
        public static final /* synthetic */ BenefitsStatus[] $VALUES;
        public static final BenefitsStatus ACTIVE;
        public static final BenefitsStatus INACTIVE;
        public static final BenefitsStatus NULL;
        public static final BenefitsStatus PENDING;

        static {
            BenefitsStatus benefitsStatus = new BenefitsStatus("NULL", 0);
            NULL = benefitsStatus;
            BenefitsStatus benefitsStatus2 = new BenefitsStatus("PENDING", 1);
            PENDING = benefitsStatus2;
            BenefitsStatus benefitsStatus3 = new BenefitsStatus("ACTIVE", 2);
            ACTIVE = benefitsStatus3;
            BenefitsStatus benefitsStatus4 = new BenefitsStatus("INACTIVE", 3);
            INACTIVE = benefitsStatus4;
            $VALUES = new BenefitsStatus[]{benefitsStatus, benefitsStatus2, benefitsStatus3, benefitsStatus4};
        }

        public static BenefitsStatus valueOf(String str) {
            return (BenefitsStatus) Enum.valueOf(BenefitsStatus.class, str);
        }

        public static BenefitsStatus[] values() {
            return (BenefitsStatus[]) $VALUES.clone();
        }
    }

    public PaychecksShowBenefitsHub(BenefitsStatus benefitsStatus) {
        this.benefits_status = benefitsStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Paychecks", "cdf_action", "Show");
        Countries.putSafe(m, "benefits_status", benefitsStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksShowBenefitsHub) && this.benefits_status == ((PaychecksShowBenefitsHub) obj).benefits_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks Show BenefitsHub";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.benefits_status.hashCode();
    }

    public final String toString() {
        return "PaychecksShowBenefitsHub(benefits_status=" + this.benefits_status + ")";
    }
}
