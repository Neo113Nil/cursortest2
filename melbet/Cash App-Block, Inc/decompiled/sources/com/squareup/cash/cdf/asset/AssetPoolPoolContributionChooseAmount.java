package com.squareup.cash.cdf.asset;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class AssetPoolPoolContributionChooseAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount_cents;
    public final String currency_code;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String pool_token;
    public final SelectionType selection_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SelectionType {
        public static final /* synthetic */ SelectionType[] $VALUES;
        public static final SelectionType ATM_AMOUNT;
        public static final SelectionType CUSTOM_AMOUNT;

        static {
            SelectionType selectionType = new SelectionType("ATM_AMOUNT", 0);
            ATM_AMOUNT = selectionType;
            SelectionType selectionType2 = new SelectionType("CUSTOM_AMOUNT", 1);
            CUSTOM_AMOUNT = selectionType2;
            $VALUES = new SelectionType[]{selectionType, selectionType2};
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) $VALUES.clone();
        }
    }

    public AssetPoolPoolContributionChooseAmount(String str, String str2, SelectionType selectionType, Integer num, String str3) {
        this.pool_token = str;
        this.flow_token = str2;
        this.selection_type = selectionType;
        this.amount_cents = num;
        this.currency_code = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "selection_type", selectionType);
        Countries.putSafe(m, "amount_cents", num);
        Countries.putSafe(m, "currency_code", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolContributionChooseAmount)) {
            return false;
        }
        AssetPoolPoolContributionChooseAmount assetPoolPoolContributionChooseAmount = (AssetPoolPoolContributionChooseAmount) obj;
        return Intrinsics.areEqual(this.pool_token, assetPoolPoolContributionChooseAmount.pool_token) && Intrinsics.areEqual(this.flow_token, assetPoolPoolContributionChooseAmount.flow_token) && this.selection_type == assetPoolPoolContributionChooseAmount.selection_type && this.amount_cents.equals(assetPoolPoolContributionChooseAmount.amount_cents) && this.currency_code.equals(assetPoolPoolContributionChooseAmount.currency_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolContributionChooseAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.pool_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.currency_code.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.selection_type.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.amount_cents);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetPoolPoolContributionChooseAmount(pool_token=", this.pool_token, ", flow_token=", this.flow_token, ", selection_type=");
        m.append(this.selection_type);
        m.append(", amount_cents=");
        m.append(this.amount_cents);
        m.append(", currency_code=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.currency_code, ")");
    }
}
