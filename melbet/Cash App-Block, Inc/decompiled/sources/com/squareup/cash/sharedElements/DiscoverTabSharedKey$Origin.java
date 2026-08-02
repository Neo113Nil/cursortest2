package com.squareup.cash.sharedElements;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DiscoverTabSharedKey$Origin {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ DiscoverTabSharedKey$Origin[] $VALUES;
    public static final DiscoverTabSharedKey$Origin Activity;
    public static final DiscoverTabSharedKey$Origin Money;
    public static final DiscoverTabSharedKey$Origin Payment;

    static {
        DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin = new DiscoverTabSharedKey$Origin("Activity", 0);
        Activity = discoverTabSharedKey$Origin;
        DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin2 = new DiscoverTabSharedKey$Origin("Money", 1);
        Money = discoverTabSharedKey$Origin2;
        DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin3 = new DiscoverTabSharedKey$Origin("Payment", 2);
        Payment = discoverTabSharedKey$Origin3;
        DiscoverTabSharedKey$Origin[] discoverTabSharedKey$OriginArr = {discoverTabSharedKey$Origin, discoverTabSharedKey$Origin2, discoverTabSharedKey$Origin3};
        $VALUES = discoverTabSharedKey$OriginArr;
        $ENTRIES = new EnumEntriesList(discoverTabSharedKey$OriginArr);
    }

    public static DiscoverTabSharedKey$Origin valueOf(String str) {
        return (DiscoverTabSharedKey$Origin) Enum.valueOf(DiscoverTabSharedKey$Origin.class, str);
    }

    public static DiscoverTabSharedKey$Origin[] values() {
        return (DiscoverTabSharedKey$Origin[]) $VALUES.clone();
    }
}
