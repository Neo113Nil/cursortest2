package com.squareup.cash.cdf.papermoney;

import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class PaperMoneyDepositViewHelp implements Event {
    public static final zze Companion = new zze(27);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AppLocation {
        public static final /* synthetic */ AppLocation[] $VALUES;
        public static final AppLocation BARCODE;

        /* JADX INFO: Fake field, exist only in values array */
        AppLocation EF0;

        static {
            AppLocation appLocation = new AppLocation("MERCHANT_DETAILS", 0);
            AppLocation appLocation2 = new AppLocation("BARCODE", 1);
            BARCODE = appLocation2;
            $VALUES = new AppLocation[]{appLocation, appLocation2};
        }

        public static AppLocation valueOf(String str) {
            return (AppLocation) Enum.valueOf(AppLocation.class, str);
        }

        public static AppLocation[] values() {
            return (AppLocation[]) $VALUES.clone();
        }
    }

    public PaperMoneyDepositViewHelp() {
        AppLocation appLocation = AppLocation.BARCODE;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PaperMoney", "cdf_action", "Deposit");
        Countries.putSafe(m, "launch_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositViewHelp)) {
            return false;
        }
        AppLocation appLocation = AppLocation.BARCODE;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney Deposit ViewHelp";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return AppLocation.BARCODE.hashCode();
    }

    public final String toString() {
        return "PaperMoneyDepositViewHelp(launch_location=" + AppLocation.BARCODE + ")";
    }
}
