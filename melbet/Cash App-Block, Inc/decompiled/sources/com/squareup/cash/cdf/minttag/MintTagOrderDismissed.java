package com.squareup.cash.cdf.minttag;

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
public final class MintTagOrderDismissed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ConfirmationType confirmation_type;
    public final String device_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public MintTagOrderDismissed(String str, ConfirmationType confirmationType, String str2) {
        this.device_type = str;
        this.confirmation_type = confirmationType;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "MintTag", "cdf_action", "Order");
        Countries.putSafe(m, "device_type", str);
        Countries.putSafe(m, "confirmation_type", confirmationType);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintTagOrderDismissed)) {
            return false;
        }
        MintTagOrderDismissed mintTagOrderDismissed = (MintTagOrderDismissed) obj;
        return this.device_type.equals(mintTagOrderDismissed.device_type) && this.confirmation_type == mintTagOrderDismissed.confirmation_type && Intrinsics.areEqual(this.flow_token, mintTagOrderDismissed.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintTag Order Dismissed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.confirmation_type.hashCode() + (this.device_type.hashCode() * 31)) * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MintTagOrderDismissed(device_type=");
        sb.append(this.device_type);
        sb.append(", confirmation_type=");
        sb.append(this.confirmation_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
