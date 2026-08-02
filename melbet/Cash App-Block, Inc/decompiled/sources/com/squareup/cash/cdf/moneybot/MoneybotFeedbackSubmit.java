package com.squareup.cash.cdf.moneybot;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class MoneybotFeedbackSubmit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final FeedbackType feedback_type;
    public final String goose_message_id;
    public final String goose_session_id;
    public final Boolean has_comment;
    public final String issue_type;
    public final LinkedHashMap parameters;

    public MoneybotFeedbackSubmit(String str, String str2, FeedbackType feedbackType, String str3, Boolean bool) {
        this.goose_session_id = str;
        this.goose_message_id = str2;
        this.feedback_type = feedbackType;
        this.issue_type = str3;
        this.has_comment = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Moneybot", "cdf_action", "Feedback");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "goose_message_id", str2);
        Countries.putSafe(m, "feedback_type", feedbackType);
        Countries.putSafe(m, "issue_type", str3);
        Countries.putSafe(m, "has_comment", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotFeedbackSubmit)) {
            return false;
        }
        MoneybotFeedbackSubmit moneybotFeedbackSubmit = (MoneybotFeedbackSubmit) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotFeedbackSubmit.goose_session_id) && Intrinsics.areEqual(this.goose_message_id, moneybotFeedbackSubmit.goose_message_id) && this.feedback_type == moneybotFeedbackSubmit.feedback_type && Intrinsics.areEqual(this.issue_type, moneybotFeedbackSubmit.issue_type) && this.has_comment.equals(moneybotFeedbackSubmit.has_comment);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Feedback Submit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.goose_message_id;
        int hashCode2 = (this.feedback_type.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.issue_type;
        return this.has_comment.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotFeedbackSubmit(goose_session_id=", this.goose_session_id, ", goose_message_id=", this.goose_message_id, ", feedback_type=");
        m.append(this.feedback_type);
        m.append(", issue_type=");
        m.append(this.issue_type);
        m.append(", has_comment=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.has_comment, ")");
    }
}
