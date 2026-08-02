package com.squareup.cash.clientsync.network;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor$performFreshSync$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.util.android.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public abstract class GatewayServiceKt {
    public static final ArrayList RETRY_DELAYS;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{3, 9, 27, 81, Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Duration.Companion companion = Duration.Companion;
            arrayList.add(new Duration(DurationKt.toDuration(intValue, DurationUnit.SECONDS)));
        }
        RETRY_DELAYS = arrayList;
    }

    public static final Object getSyncEntitiesWithRetries(WireAdapter wireAdapter, GatewayRequest gatewayRequest, RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$1) {
        return StringsKt.retryWhenRetryable(50, new SyncRangeQueries$$ExternalSyntheticLambda1(16), new RealMRIFactory$sign$2.AnonymousClass1(wireAdapter, gatewayRequest, null, 4), realClientSyncRequestExecutor$performFreshSync$1);
    }
}
