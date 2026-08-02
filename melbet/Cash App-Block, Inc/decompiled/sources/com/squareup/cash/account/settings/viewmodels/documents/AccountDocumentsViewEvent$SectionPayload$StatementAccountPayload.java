package com.squareup.cash.account.settings.viewmodels.documents;

import com.datadog.android.okhttp.TraceContext;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.protos.cash.registrar.api.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload extends TraceContext implements AccountDocumentsViewEvent.AccountStatementPayload {
    public final String customerToken;
    public final String displayName;
    public final StatementType statementType;

    public AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload(String str, StatementType statementType, String str2) {
        str.getClass();
        statementType.getClass();
        str2.getClass();
        this.customerToken = str;
        this.statementType = statementType;
        this.displayName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload)) {
            return false;
        }
        AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload accountDocumentsViewEvent$SectionPayload$StatementAccountPayload = (AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload) obj;
        return Intrinsics.areEqual(this.customerToken, accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.customerToken) && this.statementType == accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.statementType && Intrinsics.areEqual(this.displayName, accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.displayName);
    }

    public final int hashCode() {
        return this.displayName.hashCode() + ((this.statementType.hashCode() + (this.customerToken.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementAccountPayload(customerToken=");
        sb.append(this.customerToken);
        sb.append(", statementType=");
        sb.append(this.statementType);
        sb.append(", displayName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.displayName, ")");
    }
}
