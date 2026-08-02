package com.squareup.cash.clientsync.persistence;

import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.db.SessionQueries;

/* loaded from: classes.dex */
public final class SqlComponentMigrationStore {
    public final SessionQueries componentMigrationQueries;

    public SqlComponentMigrationStore(ClientSyncDatabaseImpl clientSyncDatabaseImpl) {
        this.componentMigrationQueries = clientSyncDatabaseImpl.componentMigrationQueries;
    }

    public final void deleteMigrationVersion(String str) {
        SessionQueries sessionQueries = this.componentMigrationQueries;
        sessionQueries.getClass();
        sessionQueries.driver.execute(759638892, "DELETE\nFROM component_migration\nWHERE component_key = ?", new ImageKt$$ExternalSyntheticLambda0(str, 15));
        sessionQueries.notifyQueries(759638892, new Matcher$$ExternalSyntheticLambda9(2));
    }
}
