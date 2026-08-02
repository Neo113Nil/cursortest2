package com.squareup.cash.db2.profile.documents;

import com.squareup.protos.cash.registrar.api.StatementType;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomerStatementTypeQueries$selectForType$2 extends FunctionReferenceImpl implements Function5 {
    public static final CustomerStatementTypeQueries$selectForType$2 INSTANCE = new CustomerStatementTypeQueries$selectForType$2(5, CustomerStatementType.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/cash/registrar/api/StatementType;Ljava/lang/Boolean;)V", 0);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj;
        StatementType statementType = (StatementType) obj4;
        str.getClass();
        statementType.getClass();
        return new CustomerStatementType(str, (Boolean) obj2, (String) obj3, statementType, (Boolean) obj5);
    }
}
