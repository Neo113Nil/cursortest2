package app.cash.local.views.brand.profile;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FulfillmentRowSecondaryLine {
    public final String locationStatusLabel;
    public final String separator;
    public final String subtitle;

    public FulfillmentRowSecondaryLine(String str, String str2, String str3) {
        this.subtitle = str;
        this.locationStatusLabel = str2;
        this.separator = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfillmentRowSecondaryLine)) {
            return false;
        }
        FulfillmentRowSecondaryLine fulfillmentRowSecondaryLine = (FulfillmentRowSecondaryLine) obj;
        return Intrinsics.areEqual(this.subtitle, fulfillmentRowSecondaryLine.subtitle) && Intrinsics.areEqual(this.locationStatusLabel, fulfillmentRowSecondaryLine.locationStatusLabel) && this.separator.equals(fulfillmentRowSecondaryLine.separator);
    }

    public final int hashCode() {
        String str = this.subtitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locationStatusLabel;
        return this.separator.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FulfillmentRowSecondaryLine(subtitle=", this.subtitle, ", locationStatusLabel=", this.locationStatusLabel, ", separator="), this.separator, ")");
    }
}
