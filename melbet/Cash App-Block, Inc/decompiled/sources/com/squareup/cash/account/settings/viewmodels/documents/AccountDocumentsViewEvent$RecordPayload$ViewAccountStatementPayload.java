package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.appcompat.widget.AppCompatHintHelper;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload extends AppCompatHintHelper {
    public final String fileTitle;
    public final String statementToken;
    public final String url;

    public AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.url = str;
        this.fileTitle = str2;
        this.statementToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload)) {
            return false;
        }
        AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload = (AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload) obj;
        return Intrinsics.areEqual(this.url, accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.url) && Intrinsics.areEqual(this.fileTitle, accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.fileTitle) && Intrinsics.areEqual(this.statementToken, accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.statementToken);
    }

    public final int hashCode() {
        return this.statementToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.fileTitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewAccountStatementPayload(url=", this.url, ", fileTitle=", this.fileTitle, ", statementToken="), this.statementToken, ")");
    }
}
