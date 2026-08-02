package com.squareup.cash.cdf.browser;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BrowserTapSubmitEditedAutofillDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean changed_address_1;
    public final Boolean changed_address_2;
    public final Boolean changed_administrative_area;
    public final Boolean changed_email;
    public final Boolean changed_first_name;
    public final Boolean changed_last_name;
    public final Boolean changed_phone;
    public final Boolean changed_postal_code;
    public final Boolean changed_suburb;
    public final AutofillOrigin origin;
    public final LinkedHashMap parameters;

    public BrowserTapSubmitEditedAutofillDetails(AutofillOrigin autofillOrigin, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this.origin = autofillOrigin;
        this.changed_first_name = bool;
        this.changed_last_name = bool2;
        this.changed_email = bool3;
        this.changed_phone = bool4;
        this.changed_address_1 = bool5;
        this.changed_address_2 = bool6;
        this.changed_suburb = bool7;
        this.changed_administrative_area = bool8;
        this.changed_postal_code = bool9;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "Browser", "cdf_action", "Tap");
        Countries.putSafe(m, "origin", autofillOrigin);
        Countries.putSafe(m, "changed_first_name", bool);
        Countries.putSafe(m, "changed_last_name", bool2);
        Countries.putSafe(m, "changed_email", bool3);
        Countries.putSafe(m, "changed_phone", bool4);
        Countries.putSafe(m, "changed_address_1", bool5);
        Countries.putSafe(m, "changed_address_2", bool6);
        Countries.putSafe(m, "changed_suburb", bool7);
        Countries.putSafe(m, "changed_administrative_area", bool8);
        Countries.putSafe(m, "changed_postal_code", bool9);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserTapSubmitEditedAutofillDetails)) {
            return false;
        }
        BrowserTapSubmitEditedAutofillDetails browserTapSubmitEditedAutofillDetails = (BrowserTapSubmitEditedAutofillDetails) obj;
        return this.origin == browserTapSubmitEditedAutofillDetails.origin && this.changed_first_name.equals(browserTapSubmitEditedAutofillDetails.changed_first_name) && this.changed_last_name.equals(browserTapSubmitEditedAutofillDetails.changed_last_name) && this.changed_email.equals(browserTapSubmitEditedAutofillDetails.changed_email) && this.changed_phone.equals(browserTapSubmitEditedAutofillDetails.changed_phone) && this.changed_address_1.equals(browserTapSubmitEditedAutofillDetails.changed_address_1) && this.changed_address_2.equals(browserTapSubmitEditedAutofillDetails.changed_address_2) && this.changed_suburb.equals(browserTapSubmitEditedAutofillDetails.changed_suburb) && this.changed_administrative_area.equals(browserTapSubmitEditedAutofillDetails.changed_administrative_area) && this.changed_postal_code.equals(browserTapSubmitEditedAutofillDetails.changed_postal_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Tap SubmitEditedAutofillDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.changed_postal_code.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_administrative_area, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_suburb, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_address_2, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_address_1, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_phone, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_email, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_last_name, ViewEvent$State$EnumUnboxingLocalUtility.m(this.changed_first_name, this.origin.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserTapSubmitEditedAutofillDetails(origin=");
        sb.append(this.origin);
        sb.append(", changed_first_name=");
        sb.append(this.changed_first_name);
        sb.append(", changed_last_name=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.changed_last_name, ", changed_email=", this.changed_email, ", changed_phone=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.changed_phone, ", changed_address_1=", this.changed_address_1, ", changed_address_2=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.changed_address_2, ", changed_suburb=", this.changed_suburb, ", changed_administrative_area=");
        sb.append(this.changed_administrative_area);
        sb.append(", changed_postal_code=");
        sb.append(this.changed_postal_code);
        sb.append(")");
        return sb.toString();
    }
}
