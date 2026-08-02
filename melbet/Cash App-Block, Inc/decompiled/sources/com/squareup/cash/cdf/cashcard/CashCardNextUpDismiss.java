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
public final class CashCardNextUpDismiss implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_type;
    public final String candidate_id;
    public final Integer candidate_rank;
    public final String card_flow_token;
    public final DismissMethod dismiss_method;
    public final LinkedHashMap parameters;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class DismissMethod {
        public static final /* synthetic */ DismissMethod[] $VALUES;
        public static final DismissMethod ACCESSIBILITY_ACTION;
        public static final DismissMethod SWIPE;

        static {
            DismissMethod dismissMethod = new DismissMethod("SWIPE", 0);
            SWIPE = dismissMethod;
            DismissMethod dismissMethod2 = new DismissMethod("ACCESSIBILITY_ACTION", 1);
            ACCESSIBILITY_ACTION = dismissMethod2;
            $VALUES = new DismissMethod[]{dismissMethod, dismissMethod2};
        }

        public static DismissMethod valueOf(String str) {
            return (DismissMethod) Enum.valueOf(DismissMethod.class, str);
        }

        public static DismissMethod[] values() {
            return (DismissMethod[]) $VALUES.clone();
        }
    }

    public CashCardNextUpDismiss(String str, String str2, Integer num, String str3, String str4, DismissMethod dismissMethod) {
        this.candidate_id = str;
        this.card_flow_token = str2;
        this.candidate_rank = num;
        this.title = str3;
        this.action_type = str4;
        this.dismiss_method = dismissMethod;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CashCard", "cdf_action", "NextUp");
        Countries.putSafe(m, "candidate_id", str);
        Countries.putSafe(m, "recommendation_name", "CARD_HOME_NEXT_UP");
        Countries.putSafe(m, "card_flow_token", str2);
        Countries.putSafe(m, "candidate_rank", num);
        Countries.putSafe(m, "title", str3);
        Countries.putSafe(m, "action_type", str4);
        Countries.putSafe(m, "dismiss_method", dismissMethod);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardNextUpDismiss)) {
            return false;
        }
        CashCardNextUpDismiss cashCardNextUpDismiss = (CashCardNextUpDismiss) obj;
        return this.candidate_id.equals(cashCardNextUpDismiss.candidate_id) && Intrinsics.areEqual(this.card_flow_token, cashCardNextUpDismiss.card_flow_token) && this.candidate_rank.equals(cashCardNextUpDismiss.candidate_rank) && this.title.equals(cashCardNextUpDismiss.title) && this.action_type.equals(cashCardNextUpDismiss.action_type) && this.dismiss_method == cashCardNextUpDismiss.dismiss_method;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard NextUp Dismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = ((this.candidate_id.hashCode() * 31) + 1591072982) * 31;
        String str = this.card_flow_token;
        return this.dismiss_method.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.candidate_rank), 31, this.title), 31, this.action_type);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardNextUpDismiss(candidate_id=", this.candidate_id, ", recommendation_name=CARD_HOME_NEXT_UP, card_flow_token=", this.card_flow_token, ", candidate_rank=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.candidate_rank, ", title=", this.title, ", action_type=");
        m.append(this.action_type);
        m.append(", dismiss_method=");
        m.append(this.dismiss_method);
        m.append(")");
        return m.toString();
    }
}
