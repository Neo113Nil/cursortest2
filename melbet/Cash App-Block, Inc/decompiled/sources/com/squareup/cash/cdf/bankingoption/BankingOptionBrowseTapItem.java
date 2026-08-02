package com.squareup.cash.cdf.bankingoption;

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
public final class BankingOptionBrowseTapItem implements Event {
    public static final zzd Companion = new zzd(16);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EntryScreen entry_screen;
    public final String option_id;
    public final LinkedHashMap parameters;

    public BankingOptionBrowseTapItem(String str, EntryScreen entryScreen) {
        this.option_id = str;
        this.entry_screen = entryScreen;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BankingOption", "cdf_action", "Browse");
        Countries.putSafe(m, "option_id", str);
        Countries.putSafe(m, "entry_screen", entryScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingOptionBrowseTapItem)) {
            return false;
        }
        BankingOptionBrowseTapItem bankingOptionBrowseTapItem = (BankingOptionBrowseTapItem) obj;
        return Intrinsics.areEqual(this.option_id, bankingOptionBrowseTapItem.option_id) && this.entry_screen == bankingOptionBrowseTapItem.entry_screen;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BankingOption Browse TapItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.option_id;
        return this.entry_screen.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BankingOptionBrowseTapItem(option_id=" + this.option_id + ", entry_screen=" + this.entry_screen + ")";
    }
}
