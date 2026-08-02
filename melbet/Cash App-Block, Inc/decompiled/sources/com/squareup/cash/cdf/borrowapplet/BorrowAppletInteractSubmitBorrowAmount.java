package com.squareup.cash.cdf.borrowapplet;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class BorrowAppletInteractSubmitBorrowAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount_cents;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final SelectionType selection_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class SelectionType {
        public static final /* synthetic */ SelectionType[] $VALUES;
        public static final SelectionType CUSTOM;
        public static final SelectionType RECOMMENDED;

        static {
            SelectionType selectionType = new SelectionType("RECOMMENDED", 0);
            RECOMMENDED = selectionType;
            SelectionType selectionType2 = new SelectionType("CUSTOM", 1);
            CUSTOM = selectionType2;
            $VALUES = new SelectionType[]{selectionType, selectionType2};
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) $VALUES.clone();
        }
    }

    public BorrowAppletInteractSubmitBorrowAmount(String str, SelectionType selectionType, Long l) {
        this.flow_token = str;
        this.selection_type = selectionType;
        this.amount_cents = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "BorrowApplet", "cdf_action", "Interact");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "selection_type", selectionType);
        Countries.putSafe(m, "amount_cents", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowAppletInteractSubmitBorrowAmount)) {
            return false;
        }
        BorrowAppletInteractSubmitBorrowAmount borrowAppletInteractSubmitBorrowAmount = (BorrowAppletInteractSubmitBorrowAmount) obj;
        return Intrinsics.areEqual(this.flow_token, borrowAppletInteractSubmitBorrowAmount.flow_token) && this.selection_type == borrowAppletInteractSubmitBorrowAmount.selection_type && Intrinsics.areEqual(this.amount_cents, borrowAppletInteractSubmitBorrowAmount.amount_cents);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet Interact SubmitBorrowAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (this.selection_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Long l = this.amount_cents;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorrowAppletInteractSubmitBorrowAmount(flow_token=");
        sb.append(this.flow_token);
        sb.append(", selection_type=");
        sb.append(this.selection_type);
        sb.append(", amount_cents=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.amount_cents, ")");
    }
}
