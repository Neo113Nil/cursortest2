package com.squareup.cash.account.settings.viewmodels.documents;

import com.datadog.android.okhttp.TraceContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$SectionPayload$YearPayload extends TraceContext {
    public final int year;

    public AccountDocumentsViewEvent$SectionPayload$YearPayload(int i) {
        this.year = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDocumentsViewEvent$SectionPayload$YearPayload) && this.year == ((AccountDocumentsViewEvent$SectionPayload$YearPayload) obj).year;
    }

    public final int hashCode() {
        return Integer.hashCode(this.year);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.year, "YearPayload(year=", ")");
    }
}
