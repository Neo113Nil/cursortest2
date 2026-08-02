package com.squareup.cash.db2;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncDetailsQueries$selectAll$2 extends FunctionReferenceImpl implements Function3 {
    public static final SyncDetailsQueries$selectAll$2 INSTANCE = new SyncDetailsQueries$selectAll$2(3, Sync_details.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Sync_details((Long) obj, (String) obj2, (String) obj3);
    }
}
