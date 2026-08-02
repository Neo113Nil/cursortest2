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
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyBrowseViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final Integer absolute_item_index;
    public final MoneyItemId item_id;
    public final Integer item_index;
    public final MoneyItemPromotionState item_promotion_state;
    public final String money_flow_token;
    public final Integer money_version;
    public final LinkedHashMap parameters;
    public final MoneySectionId section_id;
    public final Integer section_index;
    public final Integer section_total;

    public MoneyBrowseViewItem(String str, MoneySectionId moneySectionId, Integer num, Integer num2, MoneyItemId moneyItemId, Integer num3, Integer num4, Integer num5, MoneyItemPromotionState moneyItemPromotionState) {
        this.money_flow_token = str;
        this.section_id = moneySectionId;
        this.section_index = num;
        this.section_total = num2;
        this.item_id = moneyItemId;
        this.item_index = num3;
        this.absolute_item_index = num4;
        this.money_version = num5;
        this.item_promotion_state = moneyItemPromotionState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "Money", "cdf_action", "Browse");
        Countries.putSafe(m, "money_flow_token", str);
        Countries.putSafe(m, "section_id", moneySectionId);
        Countries.putSafe(m, "section_index", num);
        Countries.putSafe(m, "section_total", num2);
        Countries.putSafe(m, "item_id", moneyItemId);
        Countries.putSafe(m, "item_index", num3);
        Countries.putSafe(m, "absolute_item_index", num4);
        Countries.putSafe(m, "money_version", num5);
        Countries.putSafe(m, "item_promotion_state", moneyItemPromotionState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBrowseViewItem)) {
            return false;
        }
        MoneyBrowseViewItem moneyBrowseViewItem = (MoneyBrowseViewItem) obj;
        return Intrinsics.areEqual(this.money_flow_token, moneyBrowseViewItem.money_flow_token) && this.section_id == moneyBrowseViewItem.section_id && this.section_index.equals(moneyBrowseViewItem.section_index) && this.section_total.equals(moneyBrowseViewItem.section_total) && this.item_id == moneyBrowseViewItem.item_id && this.item_index.equals(moneyBrowseViewItem.item_index) && this.absolute_item_index.equals(moneyBrowseViewItem.absolute_item_index) && this.money_version.equals(moneyBrowseViewItem.money_version) && this.item_promotion_state == moneyBrowseViewItem.item_promotion_state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Money Browse ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.money_flow_token;
        return (this.item_promotion_state.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((this.item_id.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((this.section_id.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.section_index), 31, this.section_total)) * 31, 31, this.item_index), 31, this.absolute_item_index), 31, this.money_version)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyBrowseViewItem(money_flow_token=");
        sb.append(this.money_flow_token);
        sb.append(", section_id=");
        sb.append(this.section_id);
        sb.append(", section_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", item_id=");
        sb.append(this.item_id);
        sb.append(", item_index=");
        sb.append(this.item_index);
        sb.append(", absolute_item_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.absolute_item_index, ", money_version=", this.money_version, ", item_promotion_state=");
        sb.append(this.item_promotion_state);
        sb.append(", item_degradation_state=null)");
        return sb.toString();
    }
}
