package com.squareup.cash.common.cashsearch;

import com.google.mlkit.common.internal.zze;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public abstract class DatabaseFactoryKt {
    public static final ConnectionPool ENTITY_LOOKUP_ADAPTER = new ConnectionPool(new zze(29));
    public static final Map entityIndexed = MapsKt__MapsKt.mapOf(new Pair(EntityType.PAYMENT, 1L), new Pair(EntityType.CUSTOMER, 2L), new Pair(EntityType.TRANSFER, 3L), new Pair(EntityType.TRANSACTION, 4L), new Pair(EntityType.MERCHANT, 5L), new Pair(EntityType.LOAN_ACTIVITY, 6L), new Pair(EntityType.SPONSORED_ACCOUNT, 7L));
}
