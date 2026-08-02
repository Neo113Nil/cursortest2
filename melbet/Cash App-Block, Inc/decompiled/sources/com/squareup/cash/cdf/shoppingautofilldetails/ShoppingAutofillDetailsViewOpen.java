package com.squareup.cash.cdf.shoppingautofilldetails;

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
public final class ShoppingAutofillDetailsViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean autofill_enabled;
    public final Boolean has_address;
    public final Boolean has_email;
    public final Boolean has_fullname;
    public final Boolean has_phone;
    public final AutofillDetailsOrigin origin;
    public final LinkedHashMap parameters;

    public ShoppingAutofillDetailsViewOpen(Boolean bool, AutofillDetailsOrigin autofillDetailsOrigin, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.autofill_enabled = bool;
        this.origin = autofillDetailsOrigin;
        this.has_fullname = bool2;
        this.has_email = bool3;
        this.has_phone = bool4;
        this.has_address = bool5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "ShoppingAutofillDetails", "cdf_action", "View");
        Countries.putSafe(m, "autofill_enabled", bool);
        Countries.putSafe(m, "origin", autofillDetailsOrigin);
        Countries.putSafe(m, "has_fullname", bool2);
        Countries.putSafe(m, "has_email", bool3);
        Countries.putSafe(m, "has_phone", bool4);
        Countries.putSafe(m, "has_address", bool5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingAutofillDetailsViewOpen)) {
            return false;
        }
        ShoppingAutofillDetailsViewOpen shoppingAutofillDetailsViewOpen = (ShoppingAutofillDetailsViewOpen) obj;
        return this.autofill_enabled.equals(shoppingAutofillDetailsViewOpen.autofill_enabled) && this.origin == shoppingAutofillDetailsViewOpen.origin && this.has_fullname.equals(shoppingAutofillDetailsViewOpen.has_fullname) && this.has_email.equals(shoppingAutofillDetailsViewOpen.has_email) && this.has_phone.equals(shoppingAutofillDetailsViewOpen.has_phone) && this.has_address.equals(shoppingAutofillDetailsViewOpen.has_address);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ShoppingAutofillDetails View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.has_address.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_phone, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_email, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_fullname, (this.origin.hashCode() + (this.autofill_enabled.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingAutofillDetailsViewOpen(autofill_enabled=");
        sb.append(this.autofill_enabled);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", has_fullname=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_fullname, ", has_email=", this.has_email, ", has_phone=");
        sb.append(this.has_phone);
        sb.append(", has_address=");
        sb.append(this.has_address);
        sb.append(")");
        return sb.toString();
    }
}
