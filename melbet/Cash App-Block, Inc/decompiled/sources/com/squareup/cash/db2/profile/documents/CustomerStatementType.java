package com.squareup.cash.db2.profile.documents;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.registrar.api.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerStatementType {
    public final String customer_token;
    public final String display_name;
    public final Boolean is_active_sponsored_account;
    public final Boolean is_sponsored_account;
    public final StatementType statement_type;

    public CustomerStatementType(String str, Boolean bool, String str2, StatementType statementType, Boolean bool2) {
        str.getClass();
        statementType.getClass();
        this.customer_token = str;
        this.is_sponsored_account = bool;
        this.display_name = str2;
        this.statement_type = statementType;
        this.is_active_sponsored_account = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerStatementType)) {
            return false;
        }
        CustomerStatementType customerStatementType = (CustomerStatementType) obj;
        return Intrinsics.areEqual(this.customer_token, customerStatementType.customer_token) && Intrinsics.areEqual(this.is_sponsored_account, customerStatementType.is_sponsored_account) && Intrinsics.areEqual(this.display_name, customerStatementType.display_name) && this.statement_type == customerStatementType.statement_type && Intrinsics.areEqual(this.is_active_sponsored_account, customerStatementType.is_active_sponsored_account);
    }

    public final int hashCode() {
        int hashCode = this.customer_token.hashCode() * 31;
        Boolean bool = this.is_sponsored_account;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.display_name;
        int hashCode3 = (this.statement_type.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Boolean bool2 = this.is_active_sponsored_account;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_sponsored_account, "CustomerStatementType(customer_token=", this.customer_token, ", is_sponsored_account=", ", display_name=");
        m.append(this.display_name);
        m.append(", statement_type=");
        m.append(this.statement_type);
        m.append(", is_active_sponsored_account=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.is_active_sponsored_account, ")");
    }
}
