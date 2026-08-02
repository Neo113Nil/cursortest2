package com.squareup.cash.security.backend.impl;

import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.security.PasswordInfo;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.util.cache.Cache;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealPasswordManager implements IoSetupTeardown {
    public final AndroidBiometricsStore biometricsStore;
    public final SessionQueries passwordInfoQueries;
    public final SyncValueReader syncValueReader;

    public RealPasswordManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidBiometricsStore androidBiometricsStore, SyncValueReader syncValueReader) {
        this.biometricsStore = androidBiometricsStore;
        this.syncValueReader = syncValueReader;
        this.passwordInfoQueries = cashAccountDatabaseImpl.passwordInfoQueries;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(this, null, 3), 3);
        return StateFlowKt.noOpTeardown;
    }

    public final void updatePasswordVersion(long j) {
        PasswordInfo passwordInfo = new PasswordInfo(j);
        SessionQueries sessionQueries = this.passwordInfoQueries;
        sessionQueries.getClass();
        int i = 8;
        sessionQueries.driver.execute(-872546317, "INSERT OR REPLACE INTO passwordInfo(version, info_id) VALUES (?, ?)", new RecipientQueries$$ExternalSyntheticLambda0(passwordInfo, i));
        sessionQueries.notifyQueries(-872546317, new PasswordInfoQueries$$ExternalSyntheticLambda0(i));
    }
}
