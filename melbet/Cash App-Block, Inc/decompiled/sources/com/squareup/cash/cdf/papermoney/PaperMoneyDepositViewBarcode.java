package com.squareup.cash.cdf.papermoney;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaperMoneyDepositViewBarcode implements Event {
    public static final zzd Companion = new zzd(27);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String deposit_token;
    public final AppLocation launch_location;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AppLocation {
        public static final /* synthetic */ AppLocation[] $VALUES;
        public static final AppLocation MAP;
        public static final AppLocation MERCHANT_DETAILS;

        static {
            AppLocation appLocation = new AppLocation("MAP", 0);
            MAP = appLocation;
            AppLocation appLocation2 = new AppLocation("MERCHANT_DETAILS", 1);
            MERCHANT_DETAILS = appLocation2;
            $VALUES = new AppLocation[]{appLocation, appLocation2};
        }

        public static AppLocation valueOf(String str) {
            return (AppLocation) Enum.valueOf(AppLocation.class, str);
        }

        public static AppLocation[] values() {
            return (AppLocation[]) $VALUES.clone();
        }
    }

    public PaperMoneyDepositViewBarcode(String str, AppLocation appLocation) {
        this.deposit_token = str;
        this.launch_location = appLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PaperMoney", "cdf_action", "Deposit");
        Countries.putSafe(m, "deposit_token", str);
        Countries.putSafe(m, "launch_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositViewBarcode)) {
            return false;
        }
        PaperMoneyDepositViewBarcode paperMoneyDepositViewBarcode = (PaperMoneyDepositViewBarcode) obj;
        return Intrinsics.areEqual(this.deposit_token, paperMoneyDepositViewBarcode.deposit_token) && this.launch_location == paperMoneyDepositViewBarcode.launch_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney Deposit ViewBarcode";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.deposit_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AppLocation appLocation = this.launch_location;
        return hashCode + (appLocation != null ? appLocation.hashCode() : 0);
    }

    public final String toString() {
        return "PaperMoneyDepositViewBarcode(deposit_token=" + this.deposit_token + ", launch_location=" + this.launch_location + ")";
    }
}
