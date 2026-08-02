package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.models.SyncTopic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncRangeQueries$selectAll$2 extends FunctionReferenceImpl implements Function2 {
    public static final SyncRangeQueries$selectAll$2 INSTANCE = new SyncRangeQueries$selectAll$2(2, Sync_range.class, "<init>", "<init>(Lcom/squareup/cash/clientsync/models/SyncTopic;[B)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SyncTopic syncTopic = (SyncTopic) obj;
        byte[] bArr = (byte[]) obj2;
        syncTopic.getClass();
        bArr.getClass();
        return new Sync_range(syncTopic, bArr);
    }
}
