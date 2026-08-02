package com.squareup.cash.featureflags;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$MintHypeDrop extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$MintHypeDrop INSTANCE = new JsonFeatureFlags$MintHypeDrop(HypeDropData.class, new FeatureFlag$JsonFeatureFlag.Options("none", new HypeDropData(null, null, null, null, null, null, null, null, null, 511, null)), "project-mint-hype-drop");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$MintHypeDrop$HypeDropData", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class HypeDropData {
        public final Long launchAtMillis;
        public final String launchDate;
        public final Boolean notifiedEnabled;
        public final String notifyLink;
        public final String notifyText;
        public final Boolean oneTimeClick;
        public final String startDate;
        public final String symbol;
        public final String token;

        public /* synthetic */ HypeDropData(String str, Long l, String str2, String str3, String str4, Boolean bool, String str5, String str6, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bool2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HypeDropData)) {
                return false;
            }
            HypeDropData hypeDropData = (HypeDropData) obj;
            return Intrinsics.areEqual(this.launchDate, hypeDropData.launchDate) && Intrinsics.areEqual(this.launchAtMillis, hypeDropData.launchAtMillis) && Intrinsics.areEqual(this.startDate, hypeDropData.startDate) && Intrinsics.areEqual(this.symbol, hypeDropData.symbol) && Intrinsics.areEqual(this.token, hypeDropData.token) && Intrinsics.areEqual(this.notifiedEnabled, hypeDropData.notifiedEnabled) && Intrinsics.areEqual(this.notifyText, hypeDropData.notifyText) && Intrinsics.areEqual(this.notifyLink, hypeDropData.notifyLink) && Intrinsics.areEqual(this.oneTimeClick, hypeDropData.oneTimeClick);
        }

        public final int hashCode() {
            String str = this.launchDate;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.launchAtMillis;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.startDate;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.token;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.notifiedEnabled;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.notifyText;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.notifyLink;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool2 = this.oneTimeClick;
            return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.launchAtMillis, "HypeDropData(launchDate=", this.launchDate, ", launchAtMillis=", ", startDate=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.startDate, ", symbol=", this.symbol, ", token=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.token, ", notifiedEnabled=", this.notifiedEnabled, ", notifyText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.notifyText, ", notifyLink=", this.notifyLink, ", oneTimeClick=");
            return Thread$State$EnumUnboxingLocalUtility.m(m, this.oneTimeClick, ")");
        }

        public HypeDropData(String str, Long l, String str2, String str3, String str4, Boolean bool, String str5, String str6, Boolean bool2) {
            this.launchDate = str;
            this.launchAtMillis = l;
            this.startDate = str2;
            this.symbol = str3;
            this.token = str4;
            this.notifiedEnabled = bool;
            this.notifyText = str5;
            this.notifyLink = str6;
            this.oneTimeClick = bool2;
        }
    }
}
