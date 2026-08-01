package com.google.android.datatransport;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowXMLFrontend implements WinterFlowUserManagerSubsystem {
    public final /* synthetic */ WinterFlowFrameworkManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowXMLFrontend(WinterFlowFrameworkManager winterFlowFrameworkManager, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowFrameworkManager;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
    public final Object WinterFlowHookDataSource() {
        SQLiteDatabase WinterFlowHookDataSource;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowFrameworkManager winterFlowFrameworkManager = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowFrameworkManager.getClass();
                int i2 = WinterFlowObjectAgent.WinterFlowVariableVersionControl;
                WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider();
                winterFlowStackProvider.WinterFlowTransactionManagerStrategy = null;
                winterFlowStackProvider.WinterFlowUnitTestResponse = new ArrayList();
                winterFlowStackProvider.WinterFlowRouterRouter = null;
                winterFlowStackProvider.WinterFlowVariableVersionControl = "";
                HashMap hashMap = new HashMap();
                WinterFlowHookDataSource = winterFlowFrameworkManager.WinterFlowHookDataSource();
                WinterFlowHookDataSource.beginTransaction();
                try {
                    WinterFlowObjectAgent winterFlowObjectAgent = (WinterFlowObjectAgent) WinterFlowFrameworkManager.WinterFlowBandwidthObject(WinterFlowHookDataSource.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new WinterFlowTransactionManagerPlatform(winterFlowFrameworkManager, hashMap, winterFlowStackProvider, 3));
                    WinterFlowHookDataSource.setTransactionSuccessful();
                    return winterFlowObjectAgent;
                } finally {
                }
            default:
                long WinterFlowTransactionManagerStrategy = winterFlowFrameworkManager.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy() - winterFlowFrameworkManager.WinterFlowRouterRouter.WinterFlowArrayNetwork;
                WinterFlowHookDataSource = winterFlowFrameworkManager.WinterFlowHookDataSource();
                WinterFlowHookDataSource.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(WinterFlowTransactionManagerStrategy)};
                    Cursor rawQuery = WinterFlowHookDataSource.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            winterFlowFrameworkManager.WinterFlowTransactionAgent(rawQuery.getInt(0), WinterFlowProtocol.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = WinterFlowHookDataSource.delete("events", "timestamp_ms < ?", strArr);
                    WinterFlowHookDataSource.setTransactionSuccessful();
                    WinterFlowHookDataSource.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
