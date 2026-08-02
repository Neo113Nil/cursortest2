package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
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
public final class ContactAccessRequestPermission implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final PermissionRequestSource request_source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PermissionRequestSource {
        public static final /* synthetic */ PermissionRequestSource[] $VALUES;
        public static final PermissionRequestSource CARD_UPSELL;
        public static final PermissionRequestSource INVITE_SCREEN_ALLOW_BANNER;
        public static final PermissionRequestSource ROW_UPSELL;

        static {
            PermissionRequestSource permissionRequestSource = new PermissionRequestSource("INVITE_SCREEN_ALLOW_BANNER", 0);
            INVITE_SCREEN_ALLOW_BANNER = permissionRequestSource;
            PermissionRequestSource permissionRequestSource2 = new PermissionRequestSource("ROW_UPSELL", 1);
            ROW_UPSELL = permissionRequestSource2;
            PermissionRequestSource permissionRequestSource3 = new PermissionRequestSource("CARD_UPSELL", 2);
            CARD_UPSELL = permissionRequestSource3;
            $VALUES = new PermissionRequestSource[]{permissionRequestSource, permissionRequestSource2, permissionRequestSource3};
        }

        public static PermissionRequestSource valueOf(String str) {
            return (PermissionRequestSource) Enum.valueOf(PermissionRequestSource.class, str);
        }

        public static PermissionRequestSource[] values() {
            return (PermissionRequestSource[]) $VALUES.clone();
        }
    }

    public ContactAccessRequestPermission(PermissionRequestSource permissionRequestSource, ContactInviteEntryPoint contactInviteEntryPoint, String str) {
        this.request_source = permissionRequestSource;
        this.entry_point = contactInviteEntryPoint;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Contact", "cdf_action", "Access");
        Countries.putSafe(m, "request_source", permissionRequestSource);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactAccessRequestPermission)) {
            return false;
        }
        ContactAccessRequestPermission contactAccessRequestPermission = (ContactAccessRequestPermission) obj;
        return this.request_source == contactAccessRequestPermission.request_source && this.entry_point == contactAccessRequestPermission.entry_point && Intrinsics.areEqual(this.flow_token, contactAccessRequestPermission.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Access RequestPermission";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.request_source.hashCode() * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode())) * 31;
        String str = this.flow_token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactAccessRequestPermission(request_source=");
        sb.append(this.request_source);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
