package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$BusinessAccountsFeeHoliday extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$BusinessAccountsFeeHoliday INSTANCE = new JsonFeatureFlags$BusinessAccountsFeeHoliday(FeeHolidayData.class, new FeatureFlag$JsonFeatureFlag.Options("control", new FeeHolidayData(null, 1, 0 == true ? 1 : 0)), "server-c4b-new-signup-fee-holiday");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$BusinessAccountsFeeHoliday$FeeHolidayData", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class FeeHolidayData {
        public final Integer promotionAmount;

        public /* synthetic */ FeeHolidayData(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeeHolidayData) && Intrinsics.areEqual(this.promotionAmount, ((FeeHolidayData) obj).promotionAmount);
        }

        public final int hashCode() {
            Integer num = this.promotionAmount;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "FeeHolidayData(promotionAmount=" + this.promotionAmount + ")";
        }

        public FeeHolidayData(Integer num) {
            this.promotionAmount = num;
        }
    }
}
