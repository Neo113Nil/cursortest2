package com.squareup.cash.cdf.bankingoption;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BankingOptionBrowseViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final EntryScreen entry_screen;
    public final String option_id;
    public final LinkedHashMap parameters;

    public BankingOptionBrowseViewItem(String str, EntryScreen entryScreen) {
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
        if (!(obj instanceof BankingOptionBrowseViewItem)) {
            return false;
        }
        BankingOptionBrowseViewItem bankingOptionBrowseViewItem = (BankingOptionBrowseViewItem) obj;
        return Intrinsics.areEqual(this.option_id, bankingOptionBrowseViewItem.option_id) && this.entry_screen == bankingOptionBrowseViewItem.entry_screen;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BankingOption Browse ViewItem";
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
        return "BankingOptionBrowseViewItem(option_id=" + this.option_id + ", entry_screen=" + this.entry_screen + ")";
    }
}
