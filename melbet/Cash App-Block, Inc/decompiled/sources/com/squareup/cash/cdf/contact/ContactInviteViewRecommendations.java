package com.squareup.cash.cdf.contact;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class ContactInviteViewRecommendations implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer all_contacts_count;
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final String recommended_hashed_alias_id_1;
    public final String recommended_hashed_alias_id_2;
    public final String recommended_hashed_alias_id_3;

    public ContactInviteViewRecommendations(ContactInviteEntryPoint contactInviteEntryPoint, Integer num, String str, String str2, String str3) {
        this.entry_point = contactInviteEntryPoint;
        this.all_contacts_count = num;
        this.recommended_hashed_alias_id_1 = str;
        this.recommended_hashed_alias_id_2 = str2;
        this.recommended_hashed_alias_id_3 = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "all_contacts_count", num);
        Countries.putSafe(m, "recommended_hashed_alias_id_1", str);
        Countries.putSafe(m, "recommended_hashed_alias_id_2", str2);
        Countries.putSafe(m, "recommended_hashed_alias_id_3", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteViewRecommendations)) {
            return false;
        }
        ContactInviteViewRecommendations contactInviteViewRecommendations = (ContactInviteViewRecommendations) obj;
        return this.entry_point == contactInviteViewRecommendations.entry_point && this.all_contacts_count.equals(contactInviteViewRecommendations.all_contacts_count) && Intrinsics.areEqual(this.recommended_hashed_alias_id_1, contactInviteViewRecommendations.recommended_hashed_alias_id_1) && Intrinsics.areEqual(this.recommended_hashed_alias_id_2, contactInviteViewRecommendations.recommended_hashed_alias_id_2) && Intrinsics.areEqual(this.recommended_hashed_alias_id_3, contactInviteViewRecommendations.recommended_hashed_alias_id_3);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite ViewRecommendations";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode()) * 31, 31, this.all_contacts_count);
        String str = this.recommended_hashed_alias_id_1;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recommended_hashed_alias_id_2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recommended_hashed_alias_id_3;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInviteViewRecommendations(entry_point=");
        sb.append(this.entry_point);
        sb.append(", all_contacts_count=");
        sb.append(this.all_contacts_count);
        sb.append(", recommended_hashed_alias_id_1=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.recommended_hashed_alias_id_1, ", recommended_hashed_alias_id_2=", this.recommended_hashed_alias_id_2, ", recommended_hashed_alias_id_3=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.recommended_hashed_alias_id_3, ")");
    }
}
