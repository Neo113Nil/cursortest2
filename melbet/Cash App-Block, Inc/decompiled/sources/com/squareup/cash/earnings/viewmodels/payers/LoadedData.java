package com.squareup.cash.earnings.viewmodels.payers;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class LoadedData {
    public final LinkedHashMap recentSenders;
    public final LinkedHashMap taggedPayers;

    public LoadedData(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.taggedPayers = linkedHashMap;
        this.recentSenders = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedData)) {
            return false;
        }
        LoadedData loadedData = (LoadedData) obj;
        return this.taggedPayers.equals(loadedData.taggedPayers) && this.recentSenders.equals(loadedData.recentSenders);
    }

    public final int hashCode() {
        return this.recentSenders.hashCode() + (this.taggedPayers.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedData(taggedPayers=" + this.taggedPayers + ", recentSenders=" + this.recentSenders + ")";
    }
}
