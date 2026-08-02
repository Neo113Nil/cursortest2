package com.squareup.cash.cdf.recipient;

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
public final class RecipientSearchViewBlocker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BlockerReason blocker_reason;
    public final String entity_token;
    public final String external_id;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String query_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BlockerReason {
        public static final /* synthetic */ BlockerReason[] $VALUES;
        public static final BlockerReason RECIPIENT_NOT_IN_CONTACTS_DOMESTIC;

        static {
            BlockerReason blockerReason = new BlockerReason("RECIPIENT_NOT_IN_CONTACTS_DOMESTIC", 0);
            RECIPIENT_NOT_IN_CONTACTS_DOMESTIC = blockerReason;
            $VALUES = new BlockerReason[]{blockerReason, new BlockerReason("RECIPIENT_NOT_IN_CONTACTS_INTERNATIONAL", 1), new BlockerReason("RECIPIENT_IS_CROSS_BORDER", 2), new BlockerReason("RECIPIENT_NOT_IN_CONTACTS", 3)};
        }

        public static BlockerReason valueOf(String str) {
            return (BlockerReason) Enum.valueOf(BlockerReason.class, str);
        }

        public static BlockerReason[] values() {
            return (BlockerReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin CUSTOMER_PROFILE_DISCOVER;

        /* JADX INFO: Fake field, exist only in values array */
        Origin EF0;

        static {
            Origin origin = new Origin("AMOUNT_FIRST", 0);
            Origin origin2 = new Origin("DISCOVER", 1);
            Origin origin3 = new Origin("CUSTOMER_PROFILE_DISCOVER", 2);
            CUSTOMER_PROFILE_DISCOVER = origin3;
            $VALUES = new Origin[]{origin, origin2, origin3};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public RecipientSearchViewBlocker(String str, Origin origin, String str2, BlockerReason blockerReason, String str3) {
        this.external_id = str;
        this.origin = origin;
        this.entity_token = str2;
        this.blocker_reason = blockerReason;
        this.query_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Recipient", "cdf_action", "Search");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "entity_token", str2);
        Countries.putSafe(m, "blocker_reason", blockerReason);
        Countries.putSafe(m, "query_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchViewBlocker)) {
            return false;
        }
        RecipientSearchViewBlocker recipientSearchViewBlocker = (RecipientSearchViewBlocker) obj;
        return Intrinsics.areEqual(this.external_id, recipientSearchViewBlocker.external_id) && this.origin == recipientSearchViewBlocker.origin && Intrinsics.areEqual(this.entity_token, recipientSearchViewBlocker.entity_token) && this.blocker_reason == recipientSearchViewBlocker.blocker_reason && Intrinsics.areEqual(this.query_token, recipientSearchViewBlocker.query_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search ViewBlocker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Origin origin = this.origin;
        int hashCode2 = (hashCode + (origin == null ? 0 : origin.hashCode())) * 31;
        String str2 = this.entity_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BlockerReason blockerReason = this.blocker_reason;
        int hashCode4 = (hashCode3 + (blockerReason == null ? 0 : blockerReason.hashCode())) * 31;
        String str3 = this.query_token;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientSearchViewBlocker(external_id=");
        sb.append(this.external_id);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", entity_token=");
        sb.append(this.entity_token);
        sb.append(", blocker_reason=");
        sb.append(this.blocker_reason);
        sb.append(", query_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.query_token, ")");
    }
}
