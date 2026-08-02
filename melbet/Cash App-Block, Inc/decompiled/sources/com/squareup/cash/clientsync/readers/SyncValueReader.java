package com.squareup.cash.clientsync.readers;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class SyncValueReader {
    public abstract Object awaitReady(SuspendLambda suspendLambda);

    public final StateFlow getAllValues(SyncValueSpec syncValueSpec) {
        syncValueSpec.getClass();
        return getAllValues(syncValueSpec, new Matcher$$ExternalSyntheticLambda9(12));
    }

    public abstract StateFlow getAllValues(SyncValueSpec syncValueSpec, Function1 function1);

    public abstract StateFlow getFirstValueOrDefault(SyncValueSpec syncValueSpec, Boolean bool, Function1 function1);

    public final StateFlow getSingleValue(SyncValueSpec syncValueSpec) {
        syncValueSpec.getClass();
        return getSingleValueOrDefault(syncValueSpec, null, new Matcher$$ExternalSyntheticLambda9(11));
    }

    public abstract StateFlow getSingleValueOrDefault(SyncValueSpec syncValueSpec, Object obj, Function1 function1);

    public final StateFlow getSingleValue(SyncValueSpec syncValueSpec, Function1 function1) {
        syncValueSpec.getClass();
        return getSingleValueOrDefault(syncValueSpec, null, function1);
    }
}
