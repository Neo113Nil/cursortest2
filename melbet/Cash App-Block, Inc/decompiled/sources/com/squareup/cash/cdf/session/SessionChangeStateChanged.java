package com.squareup.cash.cdf.session;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SessionChangeStateChanged implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final SessionAttributeChange app_token_change;
    public final String change_reason;
    public final String new_active_account_token;
    public final SessionState new_session_state;
    public final SessionTokenStatus new_session_token_status;
    public final String new_target_account_token;
    public final String old_active_account_token;
    public final SessionState old_session_state;
    public final SessionTokenStatus old_session_token_status;
    public final String old_target_account_token;
    public final LinkedHashMap parameters;
    public final SessionAttributeChange session_token_change;

    public SessionChangeStateChanged(SessionState sessionState, SessionState sessionState2, SessionAttributeChange sessionAttributeChange, SessionAttributeChange sessionAttributeChange2, SessionTokenStatus sessionTokenStatus, SessionTokenStatus sessionTokenStatus2, String str, String str2, String str3, String str4, String str5) {
        this.old_session_state = sessionState;
        this.new_session_state = sessionState2;
        this.app_token_change = sessionAttributeChange;
        this.session_token_change = sessionAttributeChange2;
        this.old_session_token_status = sessionTokenStatus;
        this.new_session_token_status = sessionTokenStatus2;
        this.old_active_account_token = str;
        this.new_active_account_token = str2;
        this.old_target_account_token = str3;
        this.new_target_account_token = str4;
        this.change_reason = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "Session", "cdf_action", "ChangeState");
        Countries.putSafe(m, "old_session_state", sessionState);
        Countries.putSafe(m, "new_session_state", sessionState2);
        Countries.putSafe(m, "app_token_change", sessionAttributeChange);
        Countries.putSafe(m, "session_token_change", sessionAttributeChange2);
        Countries.putSafe(m, "old_session_token_status", sessionTokenStatus);
        Countries.putSafe(m, "new_session_token_status", sessionTokenStatus2);
        Countries.putSafe(m, "old_active_account_token", str);
        Countries.putSafe(m, "new_active_account_token", str2);
        Countries.putSafe(m, "old_target_account_token", str3);
        Countries.putSafe(m, "new_target_account_token", str4);
        Countries.putSafe(m, "change_reason", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionChangeStateChanged)) {
            return false;
        }
        SessionChangeStateChanged sessionChangeStateChanged = (SessionChangeStateChanged) obj;
        return this.old_session_state == sessionChangeStateChanged.old_session_state && this.new_session_state == sessionChangeStateChanged.new_session_state && this.app_token_change == sessionChangeStateChanged.app_token_change && this.session_token_change == sessionChangeStateChanged.session_token_change && this.old_session_token_status == sessionChangeStateChanged.old_session_token_status && this.new_session_token_status == sessionChangeStateChanged.new_session_token_status && Intrinsics.areEqual(this.old_active_account_token, sessionChangeStateChanged.old_active_account_token) && Intrinsics.areEqual(this.new_active_account_token, sessionChangeStateChanged.new_active_account_token) && Intrinsics.areEqual(this.old_target_account_token, sessionChangeStateChanged.old_target_account_token) && Intrinsics.areEqual(this.new_target_account_token, sessionChangeStateChanged.new_target_account_token) && Intrinsics.areEqual(this.change_reason, sessionChangeStateChanged.change_reason);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Session ChangeState Changed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.session_token_change.hashCode() + ((this.app_token_change.hashCode() + ((this.new_session_state.hashCode() + (this.old_session_state.hashCode() * 31)) * 31)) * 31)) * 31;
        SessionTokenStatus sessionTokenStatus = this.old_session_token_status;
        int hashCode2 = (hashCode + (sessionTokenStatus == null ? 0 : sessionTokenStatus.hashCode())) * 31;
        SessionTokenStatus sessionTokenStatus2 = this.new_session_token_status;
        int hashCode3 = (hashCode2 + (sessionTokenStatus2 == null ? 0 : sessionTokenStatus2.hashCode())) * 31;
        String str = this.old_active_account_token;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.new_active_account_token;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.old_target_account_token;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.new_target_account_token;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.change_reason;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionChangeStateChanged(old_session_state=");
        sb.append(this.old_session_state);
        sb.append(", new_session_state=");
        sb.append(this.new_session_state);
        sb.append(", app_token_change=");
        sb.append(this.app_token_change);
        sb.append(", session_token_change=");
        sb.append(this.session_token_change);
        sb.append(", old_session_token_status=");
        sb.append(this.old_session_token_status);
        sb.append(", new_session_token_status=");
        sb.append(this.new_session_token_status);
        sb.append(", old_active_account_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.old_active_account_token, ", new_active_account_token=", this.new_active_account_token, ", old_target_account_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.old_target_account_token, ", new_target_account_token=", this.new_target_account_token, ", change_reason=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.change_reason, ")");
    }
}
