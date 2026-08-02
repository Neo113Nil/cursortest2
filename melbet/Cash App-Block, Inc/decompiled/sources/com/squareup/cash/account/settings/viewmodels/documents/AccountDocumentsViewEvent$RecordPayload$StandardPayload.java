package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.appcompat.widget.AppCompatHintHelper;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$RecordPayload$StandardPayload extends AppCompatHintHelper {
    public final boolean emailForwardable;
    public final String key;
    public final StatementType statementType;
    public final String url;

    public AccountDocumentsViewEvent$RecordPayload$StandardPayload(String str, String str2, boolean z, StatementType statementType) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.url = str2;
        this.emailForwardable = z;
        this.statementType = statementType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsViewEvent$RecordPayload$StandardPayload)) {
            return false;
        }
        AccountDocumentsViewEvent$RecordPayload$StandardPayload accountDocumentsViewEvent$RecordPayload$StandardPayload = (AccountDocumentsViewEvent$RecordPayload$StandardPayload) obj;
        return Intrinsics.areEqual(this.key, accountDocumentsViewEvent$RecordPayload$StandardPayload.key) && Intrinsics.areEqual(this.url, accountDocumentsViewEvent$RecordPayload$StandardPayload.url) && this.emailForwardable == accountDocumentsViewEvent$RecordPayload$StandardPayload.emailForwardable && this.statementType == accountDocumentsViewEvent$RecordPayload$StandardPayload.statementType;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.url), 31, this.emailForwardable);
        StatementType statementType = this.statementType;
        return m + (statementType == null ? 0 : statementType.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StandardPayload(key=", this.key, ", url=", this.url, ", emailForwardable=");
        m.append(this.emailForwardable);
        m.append(", statementType=");
        m.append(this.statementType);
        m.append(")");
        return m.toString();
    }
}
