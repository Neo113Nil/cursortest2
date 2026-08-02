package com.squareup.cash.cdf.localization;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocalizationViewLanguageDisclosure implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String locale;
    public final LinkedHashMap parameters;

    public LocalizationViewLanguageDisclosure(String str) {
        this.locale = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Localization", "cdf_action", "View");
        Countries.putSafe(m, "locale", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalizationViewLanguageDisclosure) && Intrinsics.areEqual(this.locale, ((LocalizationViewLanguageDisclosure) obj).locale);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Localization View LanguageDisclosure";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.locale;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalizationViewLanguageDisclosure(locale=", this.locale, ", version=null)");
    }
}
