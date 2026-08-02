package com.squareup.cash.clientrouting.routers.account;

import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.preferences.KeyValue;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class RoutableAccountsProvider implements IoSetupTeardown {
    public final KeyValue principalAccountToken;
    public final SyncValueReader syncValueReader;
    public final MutexImpl mutex = new MutexImpl();
    public final ArrayList allAvailableAccounts = new ArrayList();

    public RoutableAccountsProvider(SyncValueReader syncValueReader, KeyValue keyValue) {
        this.syncValueReader = syncValueReader;
        this.principalAccountToken = keyValue;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new RoutableAccountsProvider$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new RoutableAccountsProvider$setup$1$1(this, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new RoutableAccountsProvider$setup$1$1(this, continuation, 2), 3);
        return StateFlowKt.noOpTeardown;
    }

    public final RoutableAccount tryLoadAccountUsingIdentifier(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = this.allAvailableAccounts.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            RoutableAccount routableAccount = (RoutableAccount) next;
            if (Intrinsics.areEqual(routableAccount.getCustomerToken(), str) || Intrinsics.areEqual(routableAccount.getSwitchingIdentifier(), str)) {
                obj = next;
                break;
            }
        }
        return (RoutableAccount) obj;
    }
}
