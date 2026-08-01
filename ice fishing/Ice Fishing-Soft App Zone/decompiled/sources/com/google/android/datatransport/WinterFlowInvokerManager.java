package com.google.android.datatransport;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowInvokerManager implements Runnable {
    public final /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowInvokerManager(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
        this.WinterFlowSyntax = obj4;
        this.WinterFlowResponseEngine = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WinterFlowSchedulerTesting WinterFlowCompilerVariable;
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowResponseEngine;
        Object obj2 = this.WinterFlowSyntax;
        Object obj3 = this.WinterFlowRouterRouter;
        Object obj4 = this.WinterFlowUnitTestResponse;
        Object obj5 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEncryptionServer winterFlowEncryptionServer = (WinterFlowEncryptionServer) obj5;
                WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = (WinterFlowCacheManagerConfiguration) obj4;
                String str = (String) obj3;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) obj2;
                WinterFlowDatabaseGateway winterFlowDatabaseGateway = (WinterFlowDatabaseGateway) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                    WinterFlowSchedulerTesting winterFlowSchedulerTesting = WinterFlowRouterRouter instanceof WinterFlowSchedulerTesting ? (WinterFlowSchedulerTesting) WinterFlowRouterRouter : null;
                    if (winterFlowSchedulerTesting == null || (WinterFlowCompilerVariable = winterFlowSchedulerTesting.WinterFlowCompilerVariable(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        WinterFlowJSONModule WinterFlowResponseEngine = WinterFlowCompilerVariable.WinterFlowResponseEngine();
                        try {
                            WinterFlowEncryptionServer WinterFlowTransactionAgent = WinterFlowFrameworkMechanism.WinterFlowTransactionAgent(winterFlowEncryptionServer, winterFlowCacheManagerConfiguration);
                            WinterFlowDataSourceEngine winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
                            WinterFlowRendererEngine winterFlowRendererEngine = new WinterFlowRendererEngine(str, WinterFlowTransactionAgent, winterFlowDataSourceEngine, winterFlowDataSourceEngine, winterFlowDatabaseGateway, winterFlowConcurrencyParser);
                            winterFlowRendererEngine.WinterFlowCacheManagerAgent();
                            winterFlowRendererEngine.WinterFlowRouterStructure();
                            WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                            WinterFlowCompilerVariable.WinterFlowMapperProtocol().WinterFlowRouterStructure();
                            WinterFlowCompilerVariable.WinterFlowCacheManagerAgent();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                WinterFlowTransactionManagerDeployment winterFlowTransactionManagerDeployment = (WinterFlowTransactionManagerDeployment) obj5;
                WinterFlowIDEParser winterFlowIDEParser = (WinterFlowIDEParser) obj4;
                WinterFlowIDEParser winterFlowIDEParser2 = (WinterFlowIDEParser) obj3;
                View view = (View) obj;
                Window window = ((ComponentActivity) obj2).getWindow();
                window.getClass();
                WinterFlowObjectSession winterFlowObjectSession = winterFlowIDEParser.WinterFlowCacheManagerAgent;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(resources)).booleanValue();
                WinterFlowObjectSession winterFlowObjectSession2 = winterFlowIDEParser2.WinterFlowCacheManagerAgent;
                Resources resources2 = view.getResources();
                resources2.getClass();
                winterFlowTransactionManagerDeployment.WinterFlowHookDataSource(winterFlowIDEParser, winterFlowIDEParser2, window, view, booleanValue, ((Boolean) winterFlowObjectSession2.WinterFlowUnitTestResponse(resources2)).booleanValue());
                return;
        }
    }
}
