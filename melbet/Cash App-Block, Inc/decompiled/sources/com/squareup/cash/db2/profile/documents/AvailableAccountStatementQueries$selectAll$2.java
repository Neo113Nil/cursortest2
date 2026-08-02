package com.squareup.cash.db2.profile.documents;

import com.squareup.protos.cash.registrar.api.StatementCoverage;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AvailableAccountStatementQueries$selectAll$2 extends FunctionReferenceImpl implements Function4 {
    public static final AvailableAccountStatementQueries$selectAll$2 INSTANCE = new AvailableAccountStatementQueries$selectAll$2(4, AvailableAccountStatement.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/registrar/api/StatementCoverage;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        str.getClass();
        return new AvailableAccountStatement(str, (String) obj2, (String) obj3, (StatementCoverage) obj4);
    }
}
