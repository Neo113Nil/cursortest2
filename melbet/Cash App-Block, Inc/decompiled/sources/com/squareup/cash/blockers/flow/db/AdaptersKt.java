package com.squareup.cash.blockers.flow.db;

import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final BlockersConfig.Adapter multiBlockerRequestsAdapter = new BlockersConfig.Adapter(new WireAdapter(SubmitBlockerRequest.Request.ADAPTER));
}
