package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.InstrumentQueries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AliasQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ AliasQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                break;
            default:
                AliasQueries$selectForSyncState$2 aliasQueries$selectForSyncState$2 = AliasQueries$selectForSyncState$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                AliasQueries$selectForSyncState$2 aliasQueries$selectForSyncState$2 = AliasQueries$selectForSyncState$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                return aliasQueries$selectForSyncState$2.invoke(m1431m, string2 != null ? (AliasSyncState) ((Alias$Adapter) instrumentQueries.instrumentAdapter).sync_stateAdapter.decode(string2) : null);
            default:
                AliasSyncState aliasSyncState = AliasSyncState.REMOVED;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((Alias$Adapter) instrumentQueries.instrumentAdapter).sync_stateAdapter.encode(aliasSyncState));
                return Unit.INSTANCE;
        }
    }
}
