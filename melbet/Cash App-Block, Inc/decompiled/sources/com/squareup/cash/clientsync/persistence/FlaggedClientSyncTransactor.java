package com.squareup.cash.clientsync.persistence;

import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FlaggedClientSyncTransactor implements ClientSyncTransactor {
    public final Lazy delegate$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 11));
    public final RealClientSyncFlags flags;
    public final SqlClientSyncTransactor multiplatformTransactor;
    public final SqlClientSyncTransactor nativeTransactor;

    public FlaggedClientSyncTransactor(SqlClientSyncTransactor sqlClientSyncTransactor, SqlClientSyncTransactor sqlClientSyncTransactor2, RealClientSyncFlags realClientSyncFlags) {
        this.nativeTransactor = sqlClientSyncTransactor;
        this.multiplatformTransactor = sqlClientSyncTransactor2;
        this.flags = realClientSyncFlags;
    }

    @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
    public final void transaction(Function1 function1) {
        ((ClientSyncTransactor) this.delegate$delegate.getValue()).transaction(function1);
    }

    @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
    public final Object transactionWithResult(Function1 function1) {
        return ((ClientSyncTransactor) this.delegate$delegate.getValue()).transactionWithResult(function1);
    }
}
