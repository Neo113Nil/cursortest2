package com.squareup.cash.clientsync.persistence;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface ClientSyncTransactor {
    void transaction(Function1 function1);

    Object transactionWithResult(Function1 function1);
}
