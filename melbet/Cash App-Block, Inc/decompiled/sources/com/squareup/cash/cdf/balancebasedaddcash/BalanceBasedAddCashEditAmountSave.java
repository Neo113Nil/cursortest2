package com.squareup.cash.cdf.balancebasedaddcash;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class BalanceBasedAddCashEditAmountSave implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final String flow_token;
    public final EditAmountMethod method;
    public final EditAmountOption option;
    public final LinkedHashMap parameters;

    public BalanceBasedAddCashEditAmountSave(EditAmountOption editAmountOption, EditAmountMethod editAmountMethod, Integer num, String str) {
        this.option = editAmountOption;
        this.method = editAmountMethod;
        this.amount = num;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "BalanceBasedAddCash", "cdf_action", "EditAmount");
        Countries.putSafe(m, "option", editAmountOption);
        Countries.putSafe(m, "method", editAmountMethod);
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashEditAmountSave)) {
            return false;
        }
        BalanceBasedAddCashEditAmountSave balanceBasedAddCashEditAmountSave = (BalanceBasedAddCashEditAmountSave) obj;
        return this.option == balanceBasedAddCashEditAmountSave.option && this.method == balanceBasedAddCashEditAmountSave.method && this.amount.equals(balanceBasedAddCashEditAmountSave.amount) && Intrinsics.areEqual(this.flow_token, balanceBasedAddCashEditAmountSave.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BalanceBasedAddCash EditAmount Save";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((this.method.hashCode() + (this.option.hashCode() * 31)) * 31, 31, this.amount);
        String str = this.flow_token;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BalanceBasedAddCashEditAmountSave(option=" + this.option + ", method=" + this.method + ", amount=" + this.amount + ", flow_token=" + this.flow_token + ")";
    }
}
