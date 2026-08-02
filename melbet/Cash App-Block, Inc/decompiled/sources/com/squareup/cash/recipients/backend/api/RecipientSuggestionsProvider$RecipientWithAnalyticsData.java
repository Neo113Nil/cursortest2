package com.squareup.cash.recipients.backend.api;

import com.squareup.cash.db.contacts.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientSuggestionsProvider$RecipientWithAnalyticsData {
    public final RecipientSuggestionsProvider$RecipientAnalyticsData analyticsData;
    public final Recipient recipient;

    public RecipientSuggestionsProvider$RecipientWithAnalyticsData(RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData, Recipient recipient) {
        recipient.getClass();
        this.analyticsData = recipientSuggestionsProvider$RecipientAnalyticsData;
        this.recipient = recipient;
    }

    public static RecipientSuggestionsProvider$RecipientWithAnalyticsData copy$default(RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData) {
        Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
        recipient.getClass();
        return new RecipientSuggestionsProvider$RecipientWithAnalyticsData(recipientSuggestionsProvider$RecipientAnalyticsData, recipient);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSuggestionsProvider$RecipientWithAnalyticsData)) {
            return false;
        }
        RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj;
        return this.analyticsData.equals(recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData) && Intrinsics.areEqual(this.recipient, recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient);
    }

    public final int hashCode() {
        return this.recipient.hashCode() + (this.analyticsData.hashCode() * 31);
    }

    public final String toString() {
        return "RecipientWithAnalyticsData(analyticsData=" + this.analyticsData + ", recipient=" + this.recipient + ")";
    }
}
