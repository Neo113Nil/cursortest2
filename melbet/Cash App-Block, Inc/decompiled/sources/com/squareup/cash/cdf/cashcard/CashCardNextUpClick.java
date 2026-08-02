package com.squareup.cash.cdf.cashcard;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashCardNextUpClick implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_type;
    public final String candidate_id;
    public final Integer candidate_rank;
    public final String card_flow_token;
    public final String click_action;
    public final LinkedHashMap parameters;
    public final String title;

    public CashCardNextUpClick(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.candidate_id = str;
        this.card_flow_token = str2;
        this.candidate_rank = num;
        this.title = str3;
        this.action_type = str4;
        this.click_action = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CashCard", "cdf_action", "NextUp");
        Countries.putSafe(m, "candidate_id", str);
        Countries.putSafe(m, "recommendation_name", "CARD_HOME_NEXT_UP");
        Countries.putSafe(m, "card_flow_token", str2);
        Countries.putSafe(m, "candidate_rank", num);
        Countries.putSafe(m, "title", str3);
        Countries.putSafe(m, "action_type", str4);
        Countries.putSafe(m, "click_action", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardNextUpClick)) {
            return false;
        }
        CashCardNextUpClick cashCardNextUpClick = (CashCardNextUpClick) obj;
        return this.candidate_id.equals(cashCardNextUpClick.candidate_id) && Intrinsics.areEqual(this.card_flow_token, cashCardNextUpClick.card_flow_token) && this.candidate_rank.equals(cashCardNextUpClick.candidate_rank) && this.title.equals(cashCardNextUpClick.title) && this.action_type.equals(cashCardNextUpClick.action_type) && Intrinsics.areEqual(this.click_action, cashCardNextUpClick.click_action);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard NextUp Click";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = ((this.candidate_id.hashCode() * 31) + 1591072982) * 31;
        String str = this.card_flow_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.candidate_rank), 31, this.title), 31, this.action_type);
        String str2 = this.click_action;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardNextUpClick(candidate_id=", this.candidate_id, ", recommendation_name=CARD_HOME_NEXT_UP, card_flow_token=", this.card_flow_token, ", candidate_rank=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.candidate_rank, ", title=", this.title, ", action_type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.action_type, ", click_action=", this.click_action, ")");
    }
}
