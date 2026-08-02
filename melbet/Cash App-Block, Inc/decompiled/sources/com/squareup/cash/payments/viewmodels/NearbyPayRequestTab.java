package com.squareup.cash.payments.viewmodels;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NearbyPayRequestTab {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ NearbyPayRequestTab[] $VALUES;
    public static final NearbyPayRequestTab GET_PAID;
    public static final NearbyPayRequestTab PAY;

    static {
        NearbyPayRequestTab nearbyPayRequestTab = new NearbyPayRequestTab("PAY", 0);
        PAY = nearbyPayRequestTab;
        NearbyPayRequestTab nearbyPayRequestTab2 = new NearbyPayRequestTab("GET_PAID", 1);
        GET_PAID = nearbyPayRequestTab2;
        NearbyPayRequestTab[] nearbyPayRequestTabArr = {nearbyPayRequestTab, nearbyPayRequestTab2};
        $VALUES = nearbyPayRequestTabArr;
        $ENTRIES = new EnumEntriesList(nearbyPayRequestTabArr);
    }

    public static NearbyPayRequestTab valueOf(String str) {
        return (NearbyPayRequestTab) Enum.valueOf(NearbyPayRequestTab.class, str);
    }

    public static NearbyPayRequestTab[] values() {
        return (NearbyPayRequestTab[]) $VALUES.clone();
    }
}
