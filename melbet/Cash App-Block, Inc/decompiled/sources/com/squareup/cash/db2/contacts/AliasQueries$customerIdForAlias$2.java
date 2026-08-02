package com.squareup.cash.db2.contacts;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AliasQueries$customerIdForAlias$2 extends FunctionReferenceImpl implements Function1 {
    public static final AliasQueries$customerIdForAlias$2 INSTANCE = new AliasQueries$customerIdForAlias$2(1, CustomerIdForAlias.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new CustomerIdForAlias((String) obj);
    }
}
