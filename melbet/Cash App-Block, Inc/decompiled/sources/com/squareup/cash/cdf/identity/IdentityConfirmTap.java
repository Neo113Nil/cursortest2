package com.squareup.cash.cdf.identity;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class IdentityConfirmTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE, EventDestination.BRAZE});
    public final LinkedHashMap parameters;

    public IdentityConfirmTap() {
        VerificationType verificationType = VerificationType.KYC;
        Source source = Source.PERSONAL;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Identity", "cdf_action", "Confirm");
        Countries.putSafe(m, "verification_type", verificationType);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityConfirmTap)) {
            return false;
        }
        VerificationType verificationType = VerificationType.KYC;
        Source source = Source.SECURITY_AND_PRIVACY;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Identity Confirm Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return Source.PERSONAL.hashCode() + (VerificationType.KYC.hashCode() * 31);
    }

    public final String toString() {
        return "IdentityConfirmTap(verification_type=" + VerificationType.KYC + ", source=" + Source.PERSONAL + ")";
    }
}
