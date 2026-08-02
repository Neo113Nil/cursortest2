package com.squareup.cash.cdf.contact;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactInviteFilterRecommendations implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final Integer filtered_recommended_contacts_count;
    public final Integer init_recommendations_count;
    public final LinkedHashMap parameters;
    public final Integer recommended_email_aliases_count;
    public final Integer recommended_on_cash_aliases_count;
    public final Integer recommended_unmapped_aliases_count;

    public ContactInviteFilterRecommendations(ContactInviteEntryPoint contactInviteEntryPoint, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.entry_point = contactInviteEntryPoint;
        this.init_recommendations_count = num;
        this.recommended_on_cash_aliases_count = num2;
        this.recommended_email_aliases_count = num3;
        this.filtered_recommended_contacts_count = num4;
        this.recommended_unmapped_aliases_count = num5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "init_recommendations_count", num);
        Countries.putSafe(m, "recommended_on_cash_aliases_count", num2);
        Countries.putSafe(m, "recommended_email_aliases_count", num3);
        Countries.putSafe(m, "filtered_recommended_contacts_count", num4);
        Countries.putSafe(m, "recommended_unmapped_aliases_count", num5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteFilterRecommendations)) {
            return false;
        }
        ContactInviteFilterRecommendations contactInviteFilterRecommendations = (ContactInviteFilterRecommendations) obj;
        return this.entry_point == contactInviteFilterRecommendations.entry_point && this.init_recommendations_count.equals(contactInviteFilterRecommendations.init_recommendations_count) && this.recommended_on_cash_aliases_count.equals(contactInviteFilterRecommendations.recommended_on_cash_aliases_count) && this.recommended_email_aliases_count.equals(contactInviteFilterRecommendations.recommended_email_aliases_count) && this.filtered_recommended_contacts_count.equals(contactInviteFilterRecommendations.filtered_recommended_contacts_count) && this.recommended_unmapped_aliases_count.equals(contactInviteFilterRecommendations.recommended_unmapped_aliases_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite FilterRecommendations";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return this.recommended_unmapped_aliases_count.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode()) * 31, 31, this.init_recommendations_count), 31, this.recommended_on_cash_aliases_count), 31, this.recommended_email_aliases_count), 31, this.filtered_recommended_contacts_count);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInviteFilterRecommendations(entry_point=");
        sb.append(this.entry_point);
        sb.append(", init_recommendations_count=");
        sb.append(this.init_recommendations_count);
        sb.append(", recommended_on_cash_aliases_count=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.recommended_on_cash_aliases_count, ", recommended_email_aliases_count=", this.recommended_email_aliases_count, ", filtered_recommended_contacts_count=");
        sb.append(this.filtered_recommended_contacts_count);
        sb.append(", recommended_unmapped_aliases_count=");
        sb.append(this.recommended_unmapped_aliases_count);
        sb.append(")");
        return sb.toString();
    }
}
