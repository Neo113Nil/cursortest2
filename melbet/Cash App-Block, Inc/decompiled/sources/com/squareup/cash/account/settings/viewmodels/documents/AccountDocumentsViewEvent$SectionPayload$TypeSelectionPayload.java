package com.squareup.cash.account.settings.viewmodels.documents;

import com.datadog.android.okhttp.TraceContext;
import com.squareup.protos.franklin.investing.resources.StatementType;

/* loaded from: classes7.dex */
public final class AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload extends TraceContext {

    /* renamed from: type, reason: collision with root package name */
    public final StatementType f1043type;

    public AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload(StatementType statementType) {
        this.f1043type = statementType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload) && this.f1043type == ((AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload) obj).f1043type;
    }

    public final int hashCode() {
        return this.f1043type.hashCode();
    }

    public final String toString() {
        return "TypeSelectionPayload(type=" + this.f1043type + ")";
    }
}
