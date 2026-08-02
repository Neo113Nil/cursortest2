package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncEntityQueries$selectAllWithEntityType$2 extends FunctionReferenceImpl implements Function6 {
    public static final SyncEntityQueries$selectAllWithEntityType$2 INSTANCE = new SyncEntityQueries$selectAllWithEntityType$2(6, Sync_entity.class, "<init>", "<init>(Lcom/squareup/cash/clientsync/models/SyncTopic;Ljava/lang/String;Lcom/squareup/cash/clientsync/models/SyncEntityType;[BLjava/lang/Long;Lcom/squareup/cash/clientsync/models/SyncValueType;)V", 0);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        SyncTopic syncTopic = (SyncTopic) obj;
        String str = (String) obj2;
        SyncEntityType syncEntityType = (SyncEntityType) obj3;
        byte[] bArr = (byte[]) obj4;
        syncTopic.getClass();
        str.getClass();
        syncEntityType.getClass();
        bArr.getClass();
        return new Sync_entity(syncTopic, str, syncEntityType, bArr, (Long) obj5, (SyncValueType) obj6);
    }
}
