package com.squareup.cash.lifecycle.util;

import androidx.datastore.core.DataStoreImpl$data$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;

/* loaded from: classes6.dex */
public final class WhileActivityStartedAndSubscribed implements SharingStarted {
    public final Flow activityLifecycleStateFlow;

    public WhileActivityStartedAndSubscribed(Flow flow) {
        this.activityLifecycleStateFlow = flow;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(SubscriptionCountStateFlow subscriptionCountStateFlow) {
        return FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(subscriptionCountStateFlow, this.activityLifecycleStateFlow, new WhileActivityStartedAndSubscribed$command$1(3, null), 0), new DataStoreImpl$data$1.AnonymousClass2(2, null, 27), 2));
    }
}
