package com.squareup.cash.cdf.money;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyBrowseSelectItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Integer absolute_item_index;
    public final MoneySelectAction action;
    public final BalanceObfuscationState balance_obfuscation_state;
    public final MoneyItemId item_id;
    public final Integer item_index;
    public final MoneyItemPromotionState item_promotion_state;
    public final String money_flow_token;
    public final Integer money_version;
    public final LinkedHashMap parameters;
    public final MoneySectionId section_id;
    public final Integer section_index;
    public final Integer section_total;
    public final MoneyTapElement tap_element;

    public MoneyBrowseSelectItem(String str, MoneySectionId moneySectionId, Integer num, Integer num2, MoneyItemId moneyItemId, Integer num3, Integer num4, MoneyTapElement moneyTapElement, Integer num5, MoneySelectAction moneySelectAction, BalanceObfuscationState balanceObfuscationState, MoneyItemPromotionState moneyItemPromotionState) {
        this.money_flow_token = str;
        this.section_id = moneySectionId;
        this.section_index = num;
        this.section_total = num2;
        this.item_id = moneyItemId;
        this.item_index = num3;
        this.absolute_item_index = num4;
        this.tap_element = moneyTapElement;
        this.money_version = num5;
        this.action = moneySelectAction;
        this.balance_obfuscation_state = balanceObfuscationState;
        this.item_promotion_state = moneyItemPromotionState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "Money", "cdf_action", "Browse");
        Countries.putSafe(m, "money_flow_token", str);
        Countries.putSafe(m, "section_id", moneySectionId);
        Countries.putSafe(m, "section_index", num);
        Countries.putSafe(m, "section_total", num2);
        Countries.putSafe(m, "item_id", moneyItemId);
        Countries.putSafe(m, "item_index", num3);
        Countries.putSafe(m, "absolute_item_index", num4);
        Countries.putSafe(m, "tap_element", moneyTapElement);
        Countries.putSafe(m, "money_version", num5);
        Countries.putSafe(m, "action", moneySelectAction);
        Countries.putSafe(m, "balance_obfuscation_state", balanceObfuscationState);
        Countries.putSafe(m, "item_promotion_state", moneyItemPromotionState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBrowseSelectItem)) {
            return false;
        }
        MoneyBrowseSelectItem moneyBrowseSelectItem = (MoneyBrowseSelectItem) obj;
        return Intrinsics.areEqual(this.money_flow_token, moneyBrowseSelectItem.money_flow_token) && this.section_id == moneyBrowseSelectItem.section_id && this.section_index.equals(moneyBrowseSelectItem.section_index) && this.section_total.equals(moneyBrowseSelectItem.section_total) && this.item_id == moneyBrowseSelectItem.item_id && this.item_index.equals(moneyBrowseSelectItem.item_index) && this.absolute_item_index.equals(moneyBrowseSelectItem.absolute_item_index) && this.tap_element == moneyBrowseSelectItem.tap_element && this.money_version.equals(moneyBrowseSelectItem.money_version) && this.action == moneyBrowseSelectItem.action && this.balance_obfuscation_state == moneyBrowseSelectItem.balance_obfuscation_state && this.item_promotion_state == moneyBrowseSelectItem.item_promotion_state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Money Browse SelectItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.money_flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((this.section_id.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.section_index), 31, this.section_total);
        MoneyItemId moneyItemId = this.item_id;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((m + (moneyItemId == null ? 0 : moneyItemId.hashCode())) * 31, 31, this.item_index), 31, this.absolute_item_index);
        MoneyTapElement moneyTapElement = this.tap_element;
        int hashCode = (this.action.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((m2 + (moneyTapElement == null ? 0 : moneyTapElement.hashCode())) * 31, 31, this.money_version)) * 31;
        BalanceObfuscationState balanceObfuscationState = this.balance_obfuscation_state;
        return (this.item_promotion_state.hashCode() + ((hashCode + (balanceObfuscationState != null ? balanceObfuscationState.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyBrowseSelectItem(money_flow_token=");
        sb.append(this.money_flow_token);
        sb.append(", section_id=");
        sb.append(this.section_id);
        sb.append(", section_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", item_id=");
        sb.append(this.item_id);
        sb.append(", item_index=");
        sb.append(this.item_index);
        sb.append(", absolute_item_index=");
        sb.append(this.absolute_item_index);
        sb.append(", tap_element=");
        sb.append(this.tap_element);
        sb.append(", money_version=");
        sb.append(this.money_version);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", balance_obfuscation_state=");
        sb.append(this.balance_obfuscation_state);
        sb.append(", item_promotion_state=");
        sb.append(this.item_promotion_state);
        sb.append(", item_degradation_state=null)");
        return sb.toString();
    }
}
