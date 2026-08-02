package com.datadog.android.api.context;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LocaleInfo {
    public final String currentLocale;
    public final List locales;
    public final String timeZone;

    public LocaleInfo(List list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.locales = list;
        this.currentLocale = str;
        this.timeZone = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocaleInfo)) {
            return false;
        }
        LocaleInfo localeInfo = (LocaleInfo) obj;
        return Intrinsics.areEqual(this.locales, localeInfo.locales) && Intrinsics.areEqual(this.currentLocale, localeInfo.currentLocale) && Intrinsics.areEqual(this.timeZone, localeInfo.timeZone);
    }

    public final int hashCode() {
        return this.timeZone.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.locales.hashCode() * 31, 31, this.currentLocale);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m("LocaleInfo(locales=", ", currentLocale=", this.currentLocale, ", timeZone=", this.locales), this.timeZone, ")");
    }
}
