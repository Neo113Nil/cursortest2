package com.squareup.cash.cdf.moneybot;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotFeedbackDismiss implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final FeedbackType feedback_type;
    public final String goose_message_id;
    public final String goose_session_id;
    public final LinkedHashMap parameters;

    public MoneybotFeedbackDismiss(String str, String str2, FeedbackType feedbackType) {
        this.goose_session_id = str;
        this.goose_message_id = str2;
        this.feedback_type = feedbackType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "Feedback");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "goose_message_id", str2);
        Countries.putSafe(m, "feedback_type", feedbackType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotFeedbackDismiss)) {
            return false;
        }
        MoneybotFeedbackDismiss moneybotFeedbackDismiss = (MoneybotFeedbackDismiss) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotFeedbackDismiss.goose_session_id) && Intrinsics.areEqual(this.goose_message_id, moneybotFeedbackDismiss.goose_message_id) && this.feedback_type == moneybotFeedbackDismiss.feedback_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Feedback Dismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.goose_message_id;
        return this.feedback_type.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotFeedbackDismiss(goose_session_id=", this.goose_session_id, ", goose_message_id=", this.goose_message_id, ", feedback_type=");
        m.append(this.feedback_type);
        m.append(")");
        return m.toString();
    }
}
