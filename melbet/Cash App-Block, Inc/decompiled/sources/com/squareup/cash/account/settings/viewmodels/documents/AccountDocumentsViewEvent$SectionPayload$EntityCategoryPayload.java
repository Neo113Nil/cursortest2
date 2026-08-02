package com.squareup.cash.account.settings.viewmodels.documents;

import com.datadog.android.okhttp.TraceContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload extends TraceContext {
    public final String categoryId;

    public AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload(String str) {
        str.getClass();
        this.categoryId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload) && Intrinsics.areEqual(this.categoryId, ((AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload) obj).categoryId);
    }

    public final int hashCode() {
        return this.categoryId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EntityCategoryPayload(categoryId=", this.categoryId, ")");
    }
}
