package com.squareup.cash.db2.entities;

import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncEntityQueries$selectAllWithValueType$2 extends FunctionReferenceImpl implements Function7 {
    public static final SyncEntityQueries$selectAllWithValueType$2 INSTANCE = new SyncEntityQueries$selectAllWithValueType$2(7, Sync_entity.class, "<init>", "<init>(Ljava/lang/String;I[BLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;I)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj;
        byte[] bArr = (byte[]) obj3;
        int intValue = ((Number) serializable).intValue();
        str.getClass();
        bArr.getClass();
        return new Sync_entity(str, ((Number) obj2).intValue(), bArr, (Long) obj4, (Integer) obj5, (Long) obj6, intValue);
    }
}
