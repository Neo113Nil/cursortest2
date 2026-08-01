package com.google.android.datatransport;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerSyntax implements Closeable {
    public static final WinterFlowCloudCache WinterFlowRouterRouter;
    public static final String[] WinterFlowTransactionManagerStrategy = new String[0];
    public static final WinterFlowCloudCache WinterFlowUnitTestResponse;
    public final SQLiteDatabase WinterFlowVariableVersionControl;

    static {
        WinterFlowDeploymentEngine winterFlowDeploymentEngine = new WinterFlowDeploymentEngine(9);
        WinterFlowArrayInterface winterFlowArrayInterface = WinterFlowArrayInterface.WinterFlowVariableVersionControl;
        WinterFlowUnitTestResponse = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, winterFlowDeploymentEngine);
        WinterFlowRouterRouter = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, new WinterFlowDeploymentEngine(10));
    }

    public WinterFlowSchedulerSyntax(SQLiteDatabase sQLiteDatabase) {
        this.WinterFlowVariableVersionControl = sQLiteDatabase;
    }

    public final void WinterFlowArrayNetwork() {
        this.WinterFlowVariableVersionControl.endTransaction();
    }

    public final void WinterFlowHookDataSource() {
        this.WinterFlowVariableVersionControl.beginTransaction();
    }

    public final boolean WinterFlowServerProtocol() {
        return this.WinterFlowVariableVersionControl.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WinterFlowVariableVersionControl.close();
    }

    public final boolean isOpen() {
        return this.WinterFlowVariableVersionControl.isOpen();
    }
}
