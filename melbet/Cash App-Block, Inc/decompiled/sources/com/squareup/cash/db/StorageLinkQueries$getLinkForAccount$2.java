package com.squareup.cash.db;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueries$getLinkForAccount$2 extends FunctionReferenceImpl implements Function3 {
    public static final StorageLinkQueries$getLinkForAccount$2 INSTANCE = new StorageLinkQueries$getLinkForAccount$2(3, GetLinkForAccount.class, "<init>", "<init>(JJJ)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new GetLinkForAccount(((Number) obj).longValue(), ((Number) obj2).longValue(), ((Number) obj3).longValue());
    }
}
