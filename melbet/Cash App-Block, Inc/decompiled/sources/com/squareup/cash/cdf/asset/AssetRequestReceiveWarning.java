package com.squareup.cash.cdf.asset;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AssetRequestReceiveWarning implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final PaymentFlow payment_flow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PaymentFlow {
        public static final /* synthetic */ PaymentFlow[] $VALUES;
        public static final PaymentFlow AMOUNT_FIRST;
        public static final PaymentFlow PERSON_FIRST;

        static {
            PaymentFlow paymentFlow = new PaymentFlow("AMOUNT_FIRST", 0);
            AMOUNT_FIRST = paymentFlow;
            PaymentFlow paymentFlow2 = new PaymentFlow("PERSON_FIRST", 1);
            PERSON_FIRST = paymentFlow2;
            $VALUES = new PaymentFlow[]{paymentFlow, paymentFlow2};
        }

        public static PaymentFlow valueOf(String str) {
            return (PaymentFlow) Enum.valueOf(PaymentFlow.class, str);
        }

        public static PaymentFlow[] values() {
            return (PaymentFlow[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class WarningType {
        public static final /* synthetic */ WarningType[] $VALUES;
        public static final WarningType NO_INITIATOR_NOTE;

        /* JADX INFO: Fake field, exist only in values array */
        WarningType EF0;

        static {
            WarningType warningType = new WarningType("ONLY_DOMESTIC", 0);
            WarningType warningType2 = new WarningType("TOO_MANY_RECIPIENTS", 1);
            WarningType warningType3 = new WarningType("ONLY_CASH_TAG", 2);
            WarningType warningType4 = new WarningType("NO_CREDIT_CARD", 3);
            WarningType warningType5 = new WarningType("NO_BUSINESS", 4);
            WarningType warningType6 = new WarningType("NO_INITIATOR_NOTE", 5);
            NO_INITIATOR_NOTE = warningType6;
            $VALUES = new WarningType[]{warningType, warningType2, warningType3, warningType4, warningType5, warningType6};
        }

        public static WarningType valueOf(String str) {
            return (WarningType) Enum.valueOf(WarningType.class, str);
        }

        public static WarningType[] values() {
            return (WarningType[]) $VALUES.clone();
        }
    }

    public AssetRequestReceiveWarning(PaymentFlow paymentFlow) {
        PaymentAssetType paymentAssetType = PaymentAssetType.CASH;
        WarningType warningType = WarningType.NO_INITIATOR_NOTE;
        this.payment_flow = paymentFlow;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "payment_asset_type", paymentAssetType);
        Countries.putSafe(m, "payment_flow", paymentFlow);
        Countries.putSafe(m, "warning_type", warningType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestReceiveWarning)) {
            return false;
        }
        PaymentAssetType paymentAssetType = PaymentAssetType.CASH;
        if (this.payment_flow != ((AssetRequestReceiveWarning) obj).payment_flow) {
            return false;
        }
        WarningType warningType = WarningType.NO_INITIATOR_NOTE;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request ReceiveWarning";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return WarningType.NO_INITIATOR_NOTE.hashCode() + ((this.payment_flow.hashCode() + (PaymentAssetType.CASH.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AssetRequestReceiveWarning(payment_asset_type=" + PaymentAssetType.CASH + ", payment_flow=" + this.payment_flow + ", warning_type=" + WarningType.NO_INITIATOR_NOTE + ")";
    }
}
