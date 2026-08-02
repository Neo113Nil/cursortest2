package com.squareup.cash.db2.profile.documents;

import com.squareup.protos.cash.registrar.api.StatementCoverage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AvailableAccountStatement {
    public final String display_name;
    public final StatementCoverage statementCoverage;
    public final String statement_token;
    public final String statement_url;

    public AvailableAccountStatement(String str, String str2, String str3, StatementCoverage statementCoverage) {
        str.getClass();
        this.statement_token = str;
        this.display_name = str2;
        this.statement_url = str3;
        this.statementCoverage = statementCoverage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableAccountStatement)) {
            return false;
        }
        AvailableAccountStatement availableAccountStatement = (AvailableAccountStatement) obj;
        return Intrinsics.areEqual(this.statement_token, availableAccountStatement.statement_token) && Intrinsics.areEqual(this.display_name, availableAccountStatement.display_name) && Intrinsics.areEqual(this.statement_url, availableAccountStatement.statement_url) && Intrinsics.areEqual(this.statementCoverage, availableAccountStatement.statementCoverage);
    }

    public final int hashCode() {
        int hashCode = this.statement_token.hashCode() * 31;
        String str = this.display_name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statement_url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StatementCoverage statementCoverage = this.statementCoverage;
        return hashCode3 + (statementCoverage != null ? statementCoverage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvailableAccountStatement(statement_token=", this.statement_token, ", display_name=", this.display_name, ", statement_url=");
        m.append(this.statement_url);
        m.append(", statementCoverage=");
        m.append(this.statementCoverage);
        m.append(")");
        return m.toString();
    }
}
