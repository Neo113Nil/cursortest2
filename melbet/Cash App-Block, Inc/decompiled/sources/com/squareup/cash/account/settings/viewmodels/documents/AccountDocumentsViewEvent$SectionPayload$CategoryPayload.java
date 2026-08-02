package com.squareup.cash.account.settings.viewmodels.documents;

import com.datadog.android.okhttp.TraceContext;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$SectionPayload$CategoryPayload extends TraceContext {
    public final AccountDocumentsViewEvent.DocumentCategory category;

    public AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory documentCategory) {
        this.category = documentCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDocumentsViewEvent$SectionPayload$CategoryPayload) && this.category == ((AccountDocumentsViewEvent$SectionPayload$CategoryPayload) obj).category;
    }

    public final int hashCode() {
        return this.category.hashCode();
    }

    public final String toString() {
        return "CategoryPayload(category=" + this.category + ")";
    }
}
