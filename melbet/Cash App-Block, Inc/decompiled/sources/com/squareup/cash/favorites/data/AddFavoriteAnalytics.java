package com.squareup.cash.favorites.data;

import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectAddFavorite;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AddFavoriteAnalytics {
    public final Boolean contactsEnabled;
    public final CustomerProfileConnectAddFavorite.Origin origin;
    public final CustomerProfileConnectAddFavorite.SuggestionStrategy suggestionStrategy;

    public AddFavoriteAnalytics(Boolean bool, CustomerProfileConnectAddFavorite.SuggestionStrategy suggestionStrategy, CustomerProfileConnectAddFavorite.Origin origin) {
        this.contactsEnabled = bool;
        this.suggestionStrategy = suggestionStrategy;
        this.origin = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoriteAnalytics)) {
            return false;
        }
        AddFavoriteAnalytics addFavoriteAnalytics = (AddFavoriteAnalytics) obj;
        return Intrinsics.areEqual(this.contactsEnabled, addFavoriteAnalytics.contactsEnabled) && this.suggestionStrategy == addFavoriteAnalytics.suggestionStrategy && this.origin == addFavoriteAnalytics.origin;
    }

    public final int hashCode() {
        Boolean bool = this.contactsEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        CustomerProfileConnectAddFavorite.SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
        return this.origin.hashCode() + ((hashCode + (suggestionStrategy != null ? suggestionStrategy.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AddFavoriteAnalytics(contactsEnabled=" + this.contactsEnabled + ", suggestionStrategy=" + this.suggestionStrategy + ", origin=" + this.origin + ")";
    }
}
