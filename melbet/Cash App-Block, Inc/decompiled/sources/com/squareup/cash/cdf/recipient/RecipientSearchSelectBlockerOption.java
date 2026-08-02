package com.squareup.cash.cdf.recipient;

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
public final class RecipientSearchSelectBlockerOption implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BlockerOption blocker_option;
    public final BlockerReason blocker_reason;
    public final String entity_token;
    public final String external_id;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String query_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BlockerOption {
        public static final /* synthetic */ BlockerOption[] $VALUES;
        public static final BlockerOption CANCEL;
        public static final BlockerOption CONFIRM;
        public static final BlockerOption VIEW_PROFILE;

        static {
            BlockerOption blockerOption = new BlockerOption("VIEW_PROFILE", 0);
            VIEW_PROFILE = blockerOption;
            BlockerOption blockerOption2 = new BlockerOption("CONFIRM", 1);
            CONFIRM = blockerOption2;
            BlockerOption blockerOption3 = new BlockerOption("CANCEL", 2);
            CANCEL = blockerOption3;
            $VALUES = new BlockerOption[]{blockerOption, blockerOption2, blockerOption3};
        }

        public static BlockerOption valueOf(String str) {
            return (BlockerOption) Enum.valueOf(BlockerOption.class, str);
        }

        public static BlockerOption[] values() {
            return (BlockerOption[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BlockerReason {
        public static final /* synthetic */ BlockerReason[] $VALUES = {new BlockerReason("RECIPIENT_NOT_IN_CONTACTS_DOMESTIC", 0), new BlockerReason("RECIPIENT_NOT_IN_CONTACTS_INTERNATIONAL", 1), new BlockerReason("RECIPIENT_IS_CROSS_BORDER", 2), new BlockerReason("RECIPIENT_NOT_IN_CONTACTS", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        BlockerReason EF5;

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
        public static final /* synthetic */ Origin[] $VALUES = {new Origin("AMOUNT_FIRST", 0), new Origin("DISCOVER", 1), new Origin("CUSTOMER_PROFILE_DISCOVER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Origin EF5;

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public RecipientSearchSelectBlockerOption(String str, Origin origin, String str2, BlockerReason blockerReason, String str3, BlockerOption blockerOption) {
        this.external_id = str;
        this.origin = origin;
        this.entity_token = str2;
        this.blocker_reason = blockerReason;
        this.query_token = str3;
        this.blocker_option = blockerOption;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Recipient", "cdf_action", "Search");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "entity_token", str2);
        Countries.putSafe(m, "blocker_reason", blockerReason);
        Countries.putSafe(m, "query_token", str3);
        Countries.putSafe(m, "blocker_option", blockerOption);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchSelectBlockerOption)) {
            return false;
        }
        RecipientSearchSelectBlockerOption recipientSearchSelectBlockerOption = (RecipientSearchSelectBlockerOption) obj;
        return Intrinsics.areEqual(this.external_id, recipientSearchSelectBlockerOption.external_id) && this.origin == recipientSearchSelectBlockerOption.origin && Intrinsics.areEqual(this.entity_token, recipientSearchSelectBlockerOption.entity_token) && this.blocker_reason == recipientSearchSelectBlockerOption.blocker_reason && Intrinsics.areEqual(this.query_token, recipientSearchSelectBlockerOption.query_token) && this.blocker_option == recipientSearchSelectBlockerOption.blocker_option;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search SelectBlockerOption";
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
        return this.blocker_option.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RecipientSearchSelectBlockerOption(external_id=" + this.external_id + ", origin=" + this.origin + ", entity_token=" + this.entity_token + ", blocker_reason=" + this.blocker_reason + ", query_token=" + this.query_token + ", blocker_option=" + this.blocker_option + ")";
    }
}
