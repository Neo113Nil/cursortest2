package com.squareup.cash.db;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class StorageLinkQueries$getActiveLink$2 extends FunctionReferenceImpl implements Function4 {
    public static final StorageLinkQueries$getActiveLink$2 INSTANCE = new StorageLinkQueries$getActiveLink$2(4, GetActiveLink.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new GetActiveLink((String) obj, (Long) obj2, (Long) obj3, (Long) obj4);
    }
}
